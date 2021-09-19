package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.dsl.legacy.LegacyApkOptions;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ConfigOptions extends Transform2Node {
  @Validate(notNull = true)
  public AppOptions app;
  
  @Validate(notNull = true)
  public Map<String, DeviceConfigOptions> deviceConfig;
  
  @Validate(notNull = true)
  public ModuleOptions module;
  
  public ConfigOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public AppOptions getApp() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.app;
  }
  
  public void setApp(AppOptions app) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    AppOptions appOptions = app;
    this.app = (AppOptions)ScriptBytecodeAdapter.castToType(appOptions, AppOptions.class);
  }
  
  public Map<String, DeviceConfigOptions> getDeviceConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.deviceConfig;
  }
  
  public void setDeviceConfig(Map deviceConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = deviceConfig;
    this.deviceConfig = (Map<String, DeviceConfigOptions>)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public ModuleOptions getModule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.module;
  }
  
  public void setModule(ModuleOptions module) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ModuleOptions moduleOptions = module;
    this.module = (ModuleOptions)ScriptBytecodeAdapter.castToType(moduleOptions, ModuleOptions.class);
  }
  
  public void transform2Node(ConfigInfo configInfo, Node parent, Project project, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String moduleType = ShortTypeHandling.castToString(arrayOfCallSite[0].call(configInfo));
    XmlNodeHandler xmlNodeHandler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    DefPermissionsOptions defPermissionInfo;
    Iterator iterator1;
    for (defPermissionInfo = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(this.module)), Iterator.class); iterator1.hasNext(); ) {
      defPermissionInfo = (DefPermissionsOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), DefPermissionsOptions.class);
      arrayOfCallSite[4].call(defPermissionInfo, parent, moduleType, project);
    } 
    ReqPermissionsOptions reqPermissionsInfo;
    Iterator iterator2;
    for (reqPermissionsInfo = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(this.module)), Iterator.class); iterator2.hasNext(); ) {
      reqPermissionsInfo = (ReqPermissionsOptions)ScriptBytecodeAdapter.castToType(iterator2.next(), ReqPermissionsOptions.class);
      arrayOfCallSite[7].call(reqPermissionsInfo, parent, moduleType, project);
    } 
    DefPermissionGroupsOptions defPermissionGroupsInfo;
    Iterator iterator3;
    for (defPermissionGroupsInfo = null, iterator3 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(arrayOfCallSite[9].call(this.module)), Iterator.class); iterator3.hasNext(); ) {
      defPermissionGroupsInfo = (DefPermissionGroupsOptions)ScriptBytecodeAdapter.castToType(iterator3.next(), DefPermissionGroupsOptions.class);
      arrayOfCallSite[10].call(defPermissionGroupsInfo, parent, moduleType, project);
    } 
    Node applicationNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(Node.class, parent, "application"), Node.class);
    Node metaDataNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].callConstructor(Node.class, applicationNode, "meta-data"), Node.class);
    arrayOfCallSite[13].call(xmlNodeHandler, metaDataNode, "android:name", "permZA");
    arrayOfCallSite[14].call(xmlNodeHandler, metaDataNode, "android:value", "true");
    arrayOfCallSite[15].callCurrent(this, project, applicationNode, xmlNodeHandler);
    Object resizeable = ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].call(this.module), null) ? Boolean.valueOf(true) : arrayOfCallSite[17].call(this.module);
    arrayOfCallSite[18].call(xmlNodeHandler, applicationNode, "android:resizeableActivity", arrayOfCallSite[19].call(resizeable));
    Object mainApplicationName = arrayOfCallSite[20].call(configInfo);
    arrayOfCallSite[21].call(xmlNodeHandler, applicationNode, "android:name", mainApplicationName);
    arrayOfCallSite[22].call(this.app, parent, moduleType, project);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[23].call(this.deviceConfig, "default"), null)) {
      arrayOfCallSite[24].call(arrayOfCallSite[25].call(this.deviceConfig, "default"), ArrayUtil.createArray(applicationNode, moduleType, project, this.app, this.module));
    } else {
      arrayOfCallSite[26].call(arrayOfCallSite[27].callConstructor(DeviceConfigOptions.class), ArrayUtil.createArray(applicationNode, moduleType, project, this.app, this.module));
    } 
    arrayOfCallSite[28].call(this.module, ArrayUtil.createArray(applicationNode, moduleType, project, pathInfo, configInfo));
  }
  
  private void generateLegacyMetaData(Project project, Node applicationNode, XmlNodeHandler xmlNodeHandler) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    LegacyApkOptions legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].callGetProperty(arrayOfCallSite[30].callGetProperty(project)), LegacyApkOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[31].call(arrayOfCallSite[32].callGetProperty(project), arrayOfCallSite[33].callGetProperty(BuildConst.class)), arrayOfCallSite[34].callGetProperty(BuildConst.class))) {
      String entryName = ShortTypeHandling.castToString(arrayOfCallSite[35].call(arrayOfCallSite[36].call(ModuleExtensionData.class, project)));
      Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].call(arrayOfCallSite[38].callGetProperty(project), entryName), Project.class);
      Object object = arrayOfCallSite[39].callGetProperty(arrayOfCallSite[40].callGetProperty(entryProject));
      legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(object, LegacyApkOptions.class);
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(legacyApkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[45].call(legacyApkOptions), ""))) {
        Node metaDataNodeForLegacy = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[46].callConstructor(Node.class, applicationNode, "meta-data"), Node.class);
        arrayOfCallSite[47].call(xmlNodeHandler, metaDataNodeForLegacy, "android:name", "multiFrameworkBundle");
        arrayOfCallSite[48].call(xmlNodeHandler, metaDataNodeForLegacy, "android:value", "true");
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(legacyApkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[41].call(legacyApkOptions), ""))) {
      Node metaDataNodeForLegacy = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].callConstructor(Node.class, applicationNode, "meta-data"), Node.class);
      arrayOfCallSite[43].call(xmlNodeHandler, metaDataNodeForLegacy, "android:name", "multiFrameworkBundle");
      arrayOfCallSite[44].call(xmlNodeHandler, metaDataNodeForLegacy, "android:value", "true");
    } 
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].call(arrayOfCallSite[54].call(arrayOfCallSite[55].call("ConfigOptions{", "app="), this.app), ", deviceConfig="), this.deviceConfig), ", module="), this.module), "}"));
  }
}
