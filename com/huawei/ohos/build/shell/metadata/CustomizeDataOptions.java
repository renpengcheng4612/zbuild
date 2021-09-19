package com.huawei.ohos.build.shell.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.shell.InputMethodOptions;
import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.shell.Transform2Node;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.json.JsonSlurper;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.util.Node;
import groovy.util.XmlParser;
import groovy.xml.Namespace;
import groovy.xml.QName;
import groovy.xml.StreamingMarkupBuilder;
import groovy.xml.XmlUtil;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class CustomizeDataOptions extends Transform2Node {
  private static final String INPUT_META_DATA_NAME = "ohos.miscservices.inputmethodability";
  
  private static final String ACCESS_META_DATA_NAME = "ohos.accessibleability";
  
  @Validate(maxLength = 255)
  public String name;
  
  @Validate(maxLength = 255)
  public String value;
  
  public String extra;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public CustomizeDataOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[3].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[2].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[8].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.value, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.value));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.value, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.value));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[13].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.extra, null) ? Integer.valueOf(0) : arrayOfCallSite[14].call(this.extra));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.extra, null) ? Integer.valueOf(0) : arrayOfCallSite[12].call(this.extra));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!(obj instanceof CustomizeDataOptions))
      return false; 
    CustomizeDataOptions otherObj = (CustomizeDataOptions)ScriptBytecodeAdapter.castToType(obj, CustomizeDataOptions.class);
    return (((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(Objects.class, this.name, arrayOfCallSite[16].callGroovyObjectGetProperty(otherObj))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(Objects.class, this.value, arrayOfCallSite[18].callGroovyObjectGetProperty(otherObj))))) && 
      DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(Objects.class, this.extra, arrayOfCallSite[20].callGroovyObjectGetProperty(otherObj))));
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void transform2Node(Node parent, String moduleType, Project project, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler xmlNodeHandler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    HashMap metaMap = (HashMap)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].callConstructor(HashMap.class), HashMap.class);
    Node myMeta = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].callConstructor(Node.class, parent, "meta-data", metaMap), Node.class);
    if (ScriptBytecodeAdapter.compareEqual(this.name, INPUT_META_DATA_NAME)) {
      Object resourceFileName = arrayOfCallSite[24].call(this.extra, arrayOfCallSite[25].call(arrayOfCallSite[26].call(this.extra, ":"), Integer.valueOf(1)));
      Object resourceFile = arrayOfCallSite[27].call(resourceFileName, ".json");
      arrayOfCallSite[28].callCurrent((GroovyObject)this, resourceFile, resourceFileName, project, pathInfo);
      String str = "android.view.im";
      this.name = ShortTypeHandling.castToString(str);
      Object object1 = arrayOfCallSite[29].call("@xml/", resourceFileName);
      this.extra = ShortTypeHandling.castToString(object1);
    } 
    if (ScriptBytecodeAdapter.compareEqual(this.name, ACCESS_META_DATA_NAME)) {
      Object resourceFileName = arrayOfCallSite[30].call(this.extra, arrayOfCallSite[31].call(arrayOfCallSite[32].call(this.extra, ":"), Integer.valueOf(1)));
      Object resourceFile = arrayOfCallSite[33].call(resourceFileName, ".xml");
      arrayOfCallSite[34].callCurrent((GroovyObject)this, resourceFile, resourceFileName, project, pathInfo);
      String str = "android.accessibilityservice";
      this.name = ShortTypeHandling.castToString(str);
      Object object1 = arrayOfCallSite[35].call("@xml/", resourceFileName);
      this.extra = ShortTypeHandling.castToString(object1);
    } 
    arrayOfCallSite[36].call(xmlNodeHandler, myMeta, "android:name", this.name);
    arrayOfCallSite[37].call(xmlNodeHandler, myMeta, "android:value", this.value);
    arrayOfCallSite[38].call(xmlNodeHandler, myMeta, "android:resource", this.extra);
  }
  
  public void handleInputMethod(String resourceFile, String resourceFileName, Project project, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File inputJsonFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(arrayOfCallSite[40].call(Paths.class, arrayOfCallSite[41].call(pathInfo), resourceFile)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[42].call(inputJsonFile)))
      throw (Throwable)arrayOfCallSite[43].callConstructor(GradleException.class, arrayOfCallSite[44].call(arrayOfCallSite[45].call(inputJsonFile), " not found.")); 
    File outputXmlPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[46].call(arrayOfCallSite[47].call(Paths.class, arrayOfCallSite[48].call(pathInfo), "xml")), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[49].call(outputXmlPath)))
      arrayOfCallSite[50].call(outputXmlPath); 
    File outputXmlFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(arrayOfCallSite[52].call(Paths.class, arrayOfCallSite[53].call(outputXmlPath), arrayOfCallSite[54].call(resourceFileName, ".xml"))), File.class);
    Object inputMethodTemplate = arrayOfCallSite[55].call(arrayOfCallSite[56].callConstructor(StreamingMarkupBuilder.class), new _handleInputMethod_closure1(this, this));
    Object inputMethodXml = arrayOfCallSite[57].call(arrayOfCallSite[58].callConstructor(XmlParser.class, Boolean.valueOf(false), Boolean.valueOf(false)), arrayOfCallSite[59].call(inputMethodTemplate));
    Object method = arrayOfCallSite[60].call(arrayOfCallSite[61].callConstructor(JsonSlurper.class), arrayOfCallSite[62].callConstructor(FileReader.class, inputJsonFile));
    InputMethodOptions inputMethodOptions = (InputMethodOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].callConstructor(InputMethodOptions.class, arrayOfCallSite[64].callGetProperty(method)), InputMethodOptions.class);
    arrayOfCallSite[65].call(inputMethodOptions, inputMethodXml);
    arrayOfCallSite[66].call(FileUtils.class, outputXmlFile, arrayOfCallSite[67].call(XmlUtil.class, inputMethodXml));
    File copyOriginalInputJson = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].call(arrayOfCallSite[69].call(Paths.class, arrayOfCallSite[70].call(pathInfo), "raw", arrayOfCallSite[71].call(resourceFileName, ".json"))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].call(copyOriginalInputJson)))
      arrayOfCallSite[73].call(copyOriginalInputJson); 
  }
  
  public final class _handleInputMethod_closure1 extends Closure implements GeneratedClosure {
    public _handleInputMethod_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "encoding", "utf-8" }));
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "android", "http://schemas.android.com/apk/res/android" }));
      return arrayOfCallSite[4].callCurrent((GroovyObject)this);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void handleAccessibility(String resourceFile, String resourceFileName, Project project, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File inputAccessXmlFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[74].call(arrayOfCallSite[75].call(Paths.class, arrayOfCallSite[76].call(pathInfo), resourceFile)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[77].call(inputAccessXmlFile)))
      throw (Throwable)arrayOfCallSite[78].callConstructor(GradleException.class, arrayOfCallSite[79].call(arrayOfCallSite[80].call(inputAccessXmlFile), " not found.")); 
    File outputXmlPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[81].call(arrayOfCallSite[82].call(Paths.class, arrayOfCallSite[83].call(pathInfo), "xml")), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[84].call(outputXmlPath)))
      arrayOfCallSite[85].call(outputXmlPath); 
    File outputXmlFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[86].call(arrayOfCallSite[87].call(Paths.class, arrayOfCallSite[88].call(outputXmlPath), arrayOfCallSite[89].call(resourceFileName, ".xml"))), File.class);
    Object harmonyAccessDoc = arrayOfCallSite[90].call(arrayOfCallSite[91].callConstructor(XmlParser.class), inputAccessXmlFile);
    Object shellAccessDocTemp = arrayOfCallSite[92].call(arrayOfCallSite[93].callConstructor(StreamingMarkupBuilder.class), new _handleAccessibility_closure2(this, this));
    Reference shellAccessDoc = new Reference(arrayOfCallSite[94].call(arrayOfCallSite[95].callConstructor(XmlParser.class, Boolean.valueOf(false), Boolean.valueOf(false)), arrayOfCallSite[96].call(shellAccessDocTemp)));
    arrayOfCallSite[97].call(arrayOfCallSite[98].call(harmonyAccessDoc), new _handleAccessibility_closure3(this, this, shellAccessDoc));
    arrayOfCallSite[99].call(FileUtils.class, outputXmlFile, arrayOfCallSite[100].call(XmlUtil.class, shellAccessDoc.get()));
  }
  
  public final class _handleAccessibility_closure2 extends Closure implements GeneratedClosure {
    public _handleAccessibility_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "encoding", "utf-8" }));
      return arrayOfCallSite[2].callCurrent((GroovyObject)this);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _handleAccessibility_closure3 extends Closure implements GeneratedClosure {
    public _handleAccessibility_closure3(Object _outerInstance, Object _thisObject, Reference shellAccessDoc) {
      super(_outerInstance, _thisObject);
      Reference reference = shellAccessDoc;
      this.shellAccessDoc = reference;
    }
    
    public Object doCall(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      QName oldQName = (QName)ScriptBytecodeAdapter.castToType(k, QName.class);
      Namespace ns = (Namespace)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(Namespace.class, "http://schemas.android.com/apk/res/android", "android"), Namespace.class);
      String nameSpaceUri = "http://schemas.android.com/apk/res/android";
      String prefix = "android";
      String localPart = ShortTypeHandling.castToString(arrayOfCallSite[1].call(oldQName));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(localPart, "settingsAbility"))) {
        String str = "settingsActivity";
        Object object1 = arrayOfCallSite[3].call(ShortTypeHandling.castToString(v), "ShellActivity");
      } 
      String str1 = ShortTypeHandling.castToString(v);
      Object object = arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(v, "$media:", "@drawable/"), "$string:", "@string/"), "$pattern:", "@style/"), "$float:", "@dimen/"), "$animation:", "@animator/");
      QName newQName = (QName)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(QName.class, nameSpaceUri, localPart, prefix), QName.class);
      return arrayOfCallSite[10].call(arrayOfCallSite[11].call(this.shellAccessDoc.get()), newQName, v);
    }
    
    public Object call(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[12].callCurrent((GroovyObject)this, k, v);
    }
    
    @Generated
    public Object getShellAccessDoc() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.shellAccessDoc.get();
    }
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public void setName(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
  }
  
  public String getValue() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.value;
  }
  
  public void setValue(String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = value;
    this.value = ShortTypeHandling.castToString(str);
  }
  
  public String getExtra() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.extra;
  }
  
  public void setExtra(String extra) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = extra;
    this.extra = ShortTypeHandling.castToString(str);
  }
  
  public Map getMergeRule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeRule;
  }
  
  public void setMergeRule(Map mergeRule) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = mergeRule;
    this.mergeRule = (Map)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return true;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
