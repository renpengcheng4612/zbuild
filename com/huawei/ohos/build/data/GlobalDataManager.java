package com.huawei.ohos.build.data;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class GlobalDataManager implements GroovyObject {
  private static GlobalDataManager globalDataManager;
  
  public static int START_FEATURE_PACKAGE_ID;
  
  public static Map<String, String> featurePackageId;
  
  private Project project;
  
  private Map<String, ConfigInfo> profileInfoMap;
  
  private Map<String, ConfigInfo> mergeProfileInfoMap;
  
  private Map<String, PathInfo> pathInfoMap;
  
  private Map<String, SdkInfo> sdkInfoMap;
  
  private Map<String, PackageInfo> packageInfoMap;
  
  private Map<String, Map<String, Object>> variantDataCache;
  
  static {
    Object object = $getCallSiteArray()[46].callConstructor(HashMap.class);
    featurePackageId = (Map<String, String>)ScriptBytecodeAdapter.castToType(object, Map.class);
  }
  
  public static GlobalDataManager getInstance(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(globalDataManager, null)) {
      Object object = arrayOfCallSite[6].callConstructor(GlobalDataManager.class, project);
      globalDataManager = (GlobalDataManager)ScriptBytecodeAdapter.castToType(object, GlobalDataManager.class);
    } 
    return globalDataManager;
  }
  
  private GlobalDataManager(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.profileInfoMap = (Map<String, ConfigInfo>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HashMap.class);
    this.pathInfoMap = (Map<String, PathInfo>)ScriptBytecodeAdapter.castToType(object2, Map.class);
    Object object3 = arrayOfCallSite[2].callConstructor(HashMap.class);
    this.mergeProfileInfoMap = (Map<String, ConfigInfo>)ScriptBytecodeAdapter.castToType(object3, Map.class);
    Object object4 = arrayOfCallSite[3].callConstructor(HashMap.class);
    this.sdkInfoMap = (Map<String, SdkInfo>)ScriptBytecodeAdapter.castToType(object4, Map.class);
    Object object5 = arrayOfCallSite[4].callConstructor(HashMap.class);
    this.packageInfoMap = (Map<String, PackageInfo>)ScriptBytecodeAdapter.castToType(object5, Map.class);
    Object object6 = arrayOfCallSite[5].callConstructor(HashMap.class);
    this.variantDataCache = (Map<String, Map<String, Object>>)ScriptBytecodeAdapter.castToType(object6, Map.class);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public Map<String, Map<String, Object>> getVariantDataCache() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantDataCache;
  }
  
  public void setVariantDataCache(Map variantDataCache) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = variantDataCache;
    this.variantDataCache = (Map<String, Map<String, Object>>)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public ConfigInfo getProfileInfoByProject(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(this.profileInfoMap, arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].call(project))), ConfigInfo.class);
  }
  
  public ConfigInfo getMergeProfileInfoByProject(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(this.mergeProfileInfoMap, arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].call(project))), ConfigInfo.class);
  }
  
  public PathInfo getPathInfoByProject(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(this.pathInfoMap, arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].call(project))), PathInfo.class);
  }
  
  public SdkInfo getSdkInfoByProject(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (SdkInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(this.sdkInfoMap, arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].call(project))), SdkInfo.class);
  }
  
  public ConfigInfo addOrUpdateProfileInfo(Project project, String jsonFilePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(arrayOfCallSite[20].call(arrayOfCallSite[21].call(Paths.class, jsonFilePath))))) {
      Object object = arrayOfCallSite[22].call(arrayOfCallSite[23].callConstructor(PathInfo.class, project));
      jsonFilePath = ShortTypeHandling.castToString(object);
    } 
    ConfigInfo newOne = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].callConstructor(ConfigInfo.class, project, jsonFilePath), ConfigInfo.class);
    arrayOfCallSite[25].call(this.profileInfoMap, arrayOfCallSite[26].callGetProperty(arrayOfCallSite[27].call(project)), newOne);
    return newOne;
  }
  
  public void addOrUpdateMergeProfileInfo(Project project, String jsonFilePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].call(Paths.class, jsonFilePath))))) {
      Object object = arrayOfCallSite[31].call(arrayOfCallSite[32].callConstructor(PathInfo.class, project));
      jsonFilePath = ShortTypeHandling.castToString(object);
    } 
    ConfigInfo newOne = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(ConfigInfo.class, project, jsonFilePath), ConfigInfo.class);
    arrayOfCallSite[34].call(this.mergeProfileInfoMap, arrayOfCallSite[35].callGetProperty(arrayOfCallSite[36].call(project)), newOne);
  }
  
  public SdkInfo addOrUpdateSdkInfo(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SdkInfo sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].callConstructor(SdkInfo.class, project, arrayOfCallSite[38].callCurrent(this, project)), SdkInfo.class);
    arrayOfCallSite[39].call(this.sdkInfoMap, arrayOfCallSite[40].callGetProperty(arrayOfCallSite[41].call(project)), sdkInfo);
    return sdkInfo;
  }
  
  public PathInfo addOrUpdatePathInfo(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].callConstructor(PathInfo.class, project), PathInfo.class);
    arrayOfCallSite[43].call(this.pathInfoMap, arrayOfCallSite[44].callGetProperty(arrayOfCallSite[45].call(project)), pathInfo);
    return pathInfo;
  }
}
