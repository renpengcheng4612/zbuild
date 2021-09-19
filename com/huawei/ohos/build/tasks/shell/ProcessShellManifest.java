package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.shelltool.utils.XmlUtils;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import groovy.util.XmlParser;
import groovy.xml.QName;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

public class ProcessShellManifest extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private SdkInfo sdkInfo;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  private PathInfo pathInfo;
  
  @Internal
  private BuildType buildType;
  
  @InputFile
  private File inputManifest;
  
  @OutputFile
  private File outputManifest;
  
  @OutputFile
  @Optional
  private File cutAndroidManifest;
  
  static {
    Object object = $getCallSiteArray()[76].call(HMLogger.class, $getCallSiteArray()[77].call(ProcessShellManifest.class));
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public ProcessShellManifest(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].callConstructor(File.class, arrayOfCallSite[5].call(this.pathInfo));
    this.inputManifest = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.pathInfo), arrayOfCallSite[9].callGetProperty(CommonConst.class)));
    this.outputManifest = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    if (ScriptBytecodeAdapter.compareEqual("entry", arrayOfCallSite[10].call(this.configInfo))) {
      Object object = arrayOfCallSite[11].call(arrayOfCallSite[12].call(Paths.class, arrayOfCallSite[13].call(this.pathInfo), arrayOfCallSite[14].callGetProperty(CommonConst.class)));
      this.cutAndroidManifest = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = null;
      this.cutAndroidManifest = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(this.configInfo)))
      return; 
    Object dstManifestDir = arrayOfCallSite[16].call(arrayOfCallSite[17].call(Paths.class, arrayOfCallSite[18].call(this.pathInfo)));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(FileUtils.class, dstManifestDir)))
      arrayOfCallSite[20].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[21].callGetProperty(dstManifestDir)); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(FileUtils.class, this.outputManifest)))
      arrayOfCallSite[23].call(hmLogger, "Unable to create or delete the %s file. An incremental problem may occur.", arrayOfCallSite[24].callGetProperty(this.outputManifest)); 
    Object manifest = arrayOfCallSite[25].call(arrayOfCallSite[26].callConstructor(XmlParser.class), this.inputManifest);
    Object nameSpaceUri = "http://schemas.android.com/apk/res/android";
    Node application = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(arrayOfCallSite[28].callGetProperty(manifest), Integer.valueOf(0)), Node.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].callGetProperty(arrayOfCallSite[30].callGroovyObjectGetProperty(this.variantData))))
      arrayOfCallSite[31].call(arrayOfCallSite[32].call(application), arrayOfCallSite[33].callConstructor(QName.class, nameSpaceUri, "debuggable", "android"), "true"); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(this.configInfo)))
      arrayOfCallSite[35].call(arrayOfCallSite[36].call(manifest), "package", arrayOfCallSite[37].call(arrayOfCallSite[38].call(arrayOfCallSite[39].call(this.configInfo)))); 
    arrayOfCallSite[40].call(FileUtils.class, this.outputManifest, manifest);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[41].call(this.configInfo), "entry")) {
      File simplifyShellManifestDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].callConstructor(File.class, arrayOfCallSite[43].call(this.pathInfo)), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[44].call(FileUtils.class, simplifyShellManifestDir)))
        arrayOfCallSite[45].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[46].callGetProperty(simplifyShellManifestDir)); 
      Object androidManifestCutFile = arrayOfCallSite[47].callConstructor(File.class, arrayOfCallSite[48].callGetProperty(this.cutAndroidManifest));
      arrayOfCallSite[49].call(FileUtils.class, androidManifestCutFile);
      arrayOfCallSite[50].call(FileUtils.class, androidManifestCutFile, manifest);
      Document xmlByFilePath = (Document)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(XmlUtils.class, arrayOfCallSite[52].callGetProperty(this.cutAndroidManifest)), Document.class);
      Element rootElement = (Element)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].call(xmlByFilePath), Element.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(this.configInfo))) {
        Attribute packageElement = (Attribute)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].call(rootElement, "package"), Attribute.class);
        arrayOfCallSite[56].call(packageElement, arrayOfCallSite[57].call(arrayOfCallSite[58].call(arrayOfCallSite[59].call(this.configInfo))));
      } 
      arrayOfCallSite[60].callCurrent(this, rootElement);
      arrayOfCallSite[61].call(XmlUtils.class, xmlByFilePath, arrayOfCallSite[62].callGetProperty(this.cutAndroidManifest));
    } 
  }
  
  public Object cutAbilitiesNodes(Element element) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Iterator iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].call(element), Iterator.class);
    while (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[64].call(iterator))) {
      Element childNode = (Element)ScriptBytecodeAdapter.castToType(arrayOfCallSite[65].call(iterator), Element.class);
      if ((((((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[66].call("activity", arrayOfCallSite[67].call(childNode))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[68].call("service", arrayOfCallSite[69].call(childNode))))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call("provider", arrayOfCallSite[71].call(childNode))))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].call("activity-alias", arrayOfCallSite[73].call(childNode)))))
        arrayOfCallSite[74].call(element, childNode); 
      arrayOfCallSite[75].callCurrent(this, childNode);
    } 
    return null;
  }
  
  @Generated
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
  }
  
  @Generated
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
  }
  
  @Generated
  public VariantData getVariantData() {
    return this.variantData;
  }
  
  @Generated
  public void setVariantData(VariantData paramVariantData) {
    this.variantData = paramVariantData;
  }
  
  @Generated
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
  }
  
  @Generated
  public File getInputManifest() {
    return this.inputManifest;
  }
  
  @Generated
  public void setInputManifest(File paramFile) {
    this.inputManifest = paramFile;
  }
  
  @Generated
  public File getOutputManifest() {
    return this.outputManifest;
  }
  
  @Generated
  public void setOutputManifest(File paramFile) {
    this.outputManifest = paramFile;
  }
  
  @Generated
  public File getCutAndroidManifest() {
    return this.cutAndroidManifest;
  }
  
  @Generated
  public void setCutAndroidManifest(File paramFile) {
    this.cutAndroidManifest = paramFile;
  }
}
