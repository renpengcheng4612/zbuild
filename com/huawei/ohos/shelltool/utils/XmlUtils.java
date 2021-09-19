package com.huawei.ohos.shelltool.utils;

import com.alibaba.fastjson.JSONObject;
import com.huawei.ohos.shelltool.enumlation.TranfromTypeEnum;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.gradle.api.GradleException;
import org.gradle.api.logging.Logging;

public class XmlUtils {
  public static Document getXMLByFilePath(String path) {
    Document document = null;
    FileInputStream fis = null;
    try {
      fis = new FileInputStream(path);
      SAXReader reader = new SAXReader();
      reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
      reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
      reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
      document = reader.read(fis);
    } catch (DocumentException|IOException|org.xml.sax.SAXException e) {
      Logging.getLogger(CommonUtils.class).error(String.format(Locale.ENGLISH, "path %s get xml document failed:error:%s", new Object[] { path, e.getMessage() }));
    } finally {
      IOUtil.closeAll(new AutoCloseable[] { fis });
    } 
    return document;
  }
  
  public static Document getXMLByString(String xmlstr) throws DocumentException {
    Document document = DocumentHelper.parseText(xmlstr);
    return document;
  }
  
  public static final void writeXMLToFile(Document document, String path) throws IOException {
    XMLWriter writer = null;
    FileOutputStream out = null;
    try {
      if (document == null || path == null)
        return; 
      handleIncludeAttr(document);
      handleAttrNode(document);
      out = new FileOutputStream(path);
      OutputFormat format = OutputFormat.createPrettyPrint();
      format.setEncoding("UTF-8");
      format.setIndent(true);
      format.setNewlines(true);
      writer = new XMLWriter(out, format);
      writer.write(document);
    } catch (Exception e) {
      Logging.getLogger(XmlUtils.class)
        .error(String.format(Locale.ENGLISH, "path %s write xml failed:error:%s", new Object[] { path, e.getMessage() }));
    } finally {
      if (writer != null)
        writer.close(); 
      IOUtil.closeAll(new AutoCloseable[] { out });
    } 
  }
  
  private static void handleIncludeAttr(Document document) {
    Element element = document.getRootElement();
    if (element.element("include") != null) {
      Element include = element.element("include");
      if (include.attribute("layout") != null) {
        Attribute layout = include.attribute("layout");
        String layoutValue = layout.getValue();
        include.remove(layout);
        include.addAttribute("layout", layoutValue);
      } 
    } 
  }
  
  private static void handleAttrNode(Document document) {
    Element element = document.getRootElement();
    Iterator<Element> iterator = element.elementIterator();
    while (iterator.hasNext()) {
      Element childNode = iterator.next();
      if (childNode.getName().equals("path")) {
        Iterator<Element> childIterator = childNode.elementIterator();
        while (childIterator.hasNext()) {
          Element grandChildNode = childIterator.next();
          if (grandChildNode.getName().equals("attr")) {
            grandChildNode.setName("aapt:attr");
            Attribute attribute = grandChildNode.attribute("name");
            grandChildNode.remove(attribute);
            grandChildNode.addAttribute("name", "android:fillColor");
            grandChildNode.addAttribute("xmlns:aapt", "http://schemas.android.com/aapt");
          } 
        } 
      } 
    } 
  }
  
  public static final boolean checkNameSpaceExist(Namespace namespace) {
    if (namespace == null || namespace.getPrefix().equals("") || namespace.getURI().equals(""))
      return Boolean.FALSE.booleanValue(); 
    return Boolean.TRUE.booleanValue();
  }
  
  private static String handleValue(String oldValue, JSONObject value) {
    return (value.getString(oldValue) == null) ? oldValue : value.getString(oldValue);
  }
  
  public static void copyAllAttributes(Element element1, Element element2, TranfromTypeEnum transformType, Map<String, JSONObject> currentRuleMap, JSONObject allRuleMap) {
    List<Attribute> attributeList = element1.attributes();
    JSONObject attrRules = null;
    if (allRuleMap != null)
      attrRules = findElementRules(element1.getName(), currentRuleMap, allRuleMap); 
    for (Attribute attribute : attributeList) {
      String attrName = attribute.getName();
      String attrValue = attribute.getValue();
      String newAttrName = attrName;
      String newAttrValue = isLengthUnit(attrValue);
      Namespace namespace = attribute.getNamespace();
      if (attrName.equals("remote"))
        continue; 
      if (allRuleMap != null && attrRules != null) {
        JSONObject attrRule = attrRules.getJSONObject(attrName);
        if (attrRule != null) {
          if (attrRule.getString("delete") != null)
            continue; 
          newAttrName = (attrRule.getString("name") == null) ? newAttrName : attrRule.getString("name");
          List<String> strings = Arrays.asList(attrValue.split("\\|"));
          StringBuffer finalNewAttrValue = new StringBuffer();
          String newAttrValueCopy = newAttrValue;
          strings.forEach(string -> {
                String newAttr = (attrRule.getJSONObject("value") == null) ? newAttrValueCopy : handleValue(string, attrRule.getJSONObject("value"));
                finalNewAttrValue.append(newAttr);
                finalNewAttrValue.append("|");
              });
          newAttrValue = finalNewAttrValue.toString().substring(0, finalNewAttrValue.length() - 1);
          newAttrValue = isLengthUnit(newAttrValue);
        } 
      } 
      if (transformType != null)
        newAttrValue = getNewAttrValue(transformType, attrValue); 
      QName qName = checkNameSpaceExist(namespace) ? new QName(newAttrName, Namespace.get("android", "http://schemas.android.com/apk/res/android")) : new QName(newAttrName);
      element2.addAttribute(qName, newAttrValue);
    } 
  }
  
  private static String getNewAttrValue(TranfromTypeEnum transformType, String attrValue) {
    String newAttrValue = null;
    switch (transformType) {
      case STYLE_FILE:
        newAttrValue = disposeStyleFile(attrValue);
        break;
      case SMART_LEAN_FILE:
        newAttrValue = parseAttrValue(attrValue);
        break;
    } 
    return newAttrValue;
  }
  
  private static String disposeStyleFile(String attrValue) {
    Map<String, String> rulesMap = new HashMap<>();
    rulesMap.put("ohos:dialogExitAnimation", "android:windowExitAnimation");
    rulesMap.put("ohos:dialogEnterAnimation", "android:windowEnterAnimation");
    rulesMap.put("ohos:abilityOpenEnterAnimation", "android:activityOpenEnterAnimation");
    rulesMap.put("ohos:abilityOpenExitAnimation", "android:activityOpenExitAnimation");
    rulesMap.put("ohos:abilityCloseEnterAnimation", "android:activityCloseEnterAnimation");
    rulesMap.put("ohos:abilityCloseExitAnimation", "android:activityCloseExitAnimation");
    rulesMap.put("ohos:theme:theme_hide_title_bar", "android:Theme.Black.NoTitleBar");
    rulesMap.put("startingBackground", "android:windowBackground");
    return rulesMap.getOrDefault(attrValue, attrValue);
  }
  
  private static String parseAttrValue(String attrValue) {
    String parseAttrName = attrValue;
    if (attrValue.contains("$string:"))
      parseAttrName = attrValue.replace("$string:", "@string/"); 
    return parseAttrName;
  }
  
  private static String isLengthUnit(String attrValue) {
    if (Pattern.matches("^[0-9\\.]*vp", attrValue))
      attrValue = attrValue.replace("vp", "dp"); 
    if (Pattern.matches("^[0-9\\.]*fp", attrValue))
      attrValue = attrValue.replace("fp", "sp"); 
    return attrValue;
  }
  
  public static void copyNodeContent(Element element1, Element element2) {
    String elementContentText = element1.getText();
    element2.addText(elementContentText);
  }
  
  public static void copyAllChildren(Element element1, Element element2, TranfromTypeEnum transformType, Map<String, JSONObject> currentRuleMap, JSONObject allRuleMap) {
    copyAllAttributes(element1, element2, transformType, currentRuleMap, allRuleMap);
    copyNodeContent(element1, element2);
    Iterator<Element> children = element1.elementIterator();
    while (children.hasNext()) {
      Element childElement1 = children.next();
      String childElement2Name = childElement1.getName();
      if (allRuleMap != null)
        childElement2Name = findNodeNewName(childElement1.getName(), allRuleMap); 
      if (childElement2Name != null) {
        Element childElement2 = element2.addElement(childElement2Name);
        copyAllChildren(childElement1, childElement2, transformType, currentRuleMap, allRuleMap);
      } 
    } 
  }
  
  public static void createCopyXml(Element root, File outputFile, TranfromTypeEnum transformType, JSONObject layoutRules) throws IOException {
    Document document = DocumentHelper.createDocument();
    Namespace namespace = root.getNamespace();
    if (root.getName().equals("accessibility-ability"))
      return; 
    Map<String, JSONObject> currentRuleMap = new HashMap<>();
    String copyRootName = (layoutRules == null) ? root.getName() : findNodeNewName(root.getName(), layoutRules);
    if (copyRootName != null) {
      Element copyRoot = document.addElement(copyRootName);
      if (checkNameSpaceExist(namespace))
        copyRoot.addNamespace("android", "http://schemas.android.com/apk/res/android"); 
      copyAllChildren(root, copyRoot, transformType, currentRuleMap, layoutRules);
    } 
    if (outputFile != null && document.getRootElement() != null)
      writeXMLToFile(document, outputFile.toString()); 
    if (document.getRootElement() == null) {
      boolean delStatus = outputFile.delete();
      if (!delStatus)
        throw new GradleException(String.format(Locale.ENGLISH, "Please check the %s Whether or not used", new Object[] { outputFile.getCanonicalPath() })); 
    } 
  }
  
  public static boolean transformXml(File file, File outputFile, JSONObject layoutRules) {
    if (file == null || !file.exists())
      return Boolean.FALSE.booleanValue(); 
    try {
      Document xmlDocument = getXMLByFilePath(file.getCanonicalPath());
      Element root = xmlDocument.getRootElement();
      if (!outputFile.exists())
        CommonUtils.createSubFile(outputFile); 
      TranfromTypeEnum transformType = null;
      String fileName = file.getName();
      if ("styles.xml".equals(fileName) && layoutRules == null)
        transformType = TranfromTypeEnum.STYLE_FILE; 
      if ("fa_manager_enhance_smart_learning.xml".equals(fileName))
        transformType = TranfromTypeEnum.SMART_LEAN_FILE; 
      createCopyXml(root, outputFile, transformType, layoutRules);
    } catch (IOException e) {
      Logging.getLogger(CommonUtils.class).error(String.format(Locale.ENGLISH, "transform file %s failed:error:%s", new Object[] { file.toString(), e.getMessage() }));
      return Boolean.FALSE.booleanValue();
    } 
    return Boolean.TRUE.booleanValue();
  }
  
  private static JSONObject findElementRules(String elementName, Map<String, JSONObject> ruleMap, JSONObject allRules) {
    if (ruleMap.containsKey(elementName))
      return ruleMap.get(elementName); 
    JSONObject myRules = allRules.getJSONObject(elementName);
    String myParent = myRules.getString("parent");
    JSONObject myAttributesRules = myRules.getJSONObject("attributes");
    if (myParent == null || myParent.equals("")) {
      ruleMap.put(elementName, myAttributesRules);
      return myAttributesRules;
    } 
    JSONObject myParentAttributesRules = findElementRules(myParent, ruleMap, allRules);
    myAttributesRules.putAll((Map)myParentAttributesRules);
    ruleMap.put(elementName, myAttributesRules);
    return myAttributesRules;
  }
  
  private static String findNodeNewName(String elementName, JSONObject allRules) {
    return (allRules.containsKey(elementName) && allRules.getJSONObject(elementName).get("newName") != null && allRules
      .getJSONObject(elementName).get("support") == null) ? allRules
      .getJSONObject(elementName).get("newName").toString() : null;
  }
}
