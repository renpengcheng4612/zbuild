package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.annotation.Validates;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.shell.metadata.CustomizeDataOptions;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import com.huawei.ohos.build.utils.configJson.CastTransformUtil;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ModuleOptions extends Transform2Node {
  private static final HMLogger hmLogger;
  
  @JsonProperty("package")
  @Validate(deviceType = "rich", notNull = true, maxLength = 127)
  public String packageName;
  
  @Validate(deviceType = "rich", maxLength = 255)
  public String name;
  
  @Validate(deviceType = "rich", maxLength = 255)
  public String description;
  
  @Validates({@Validate(deviceType = "rich", range = {"drive"}), @Validate(deviceType = "lite", notSupport = true)})
  public List<String> supportedModes;
  
  @Validates({@Validate(deviceType = "rich", resource = true), @Validate(deviceType = "lite", notSupport = true)})
  public String theme;
  
  @Validates({@Validate(deviceType = "rich", resource = true), @Validate(deviceType = "lite", notSupport = true)})
  public String entryTheme;
  
  public List<String> reqCapabilities;
  
  @Validate(notNull = true)
  public List<String> deviceType;
  
  @Validate(deviceType = "rich", notNull = true)
  public DistroOptions distro;
  
  public MetaDataOptions metaData;
  
  public List<AbilitiesOptions> abilities;
  
  @Validate(deviceType = "lite", notSupport = true)
  public List<CommonEventsOptions> commonEvents;
  
  public List<ShortCutsOptions> shortcuts;
  
  public List<JsOptions> js;
  
  public List<ReqPermissionsOptions> reqPermissions;
  
  public List<DefPermissionsOptions> defPermissions;
  
  @Validate(deviceType = "lite", notSupport = true)
  public List<DefPermissionGroupsOptions> defPermissionGroups;
  
  @Validate(deviceType = "lite", notSupport = true)
  public Boolean allowClassMap;
  
  @Validate(deviceType = "lite", notSupport = true)
  public String mainAbility;
  
  public Boolean resizeable;
  
  @Validates({@Validate(deviceType = "lite", notSupport = true), @Validate(deviceType = "rich", range = {"auto", "dark", "light"})})
  public String colorMode;
  
  private Integer descriptionId;
  
  static {
    Object object = $getCallSiteArray()[91].call(HMLogger.class, ModuleOptions.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void transform2Node(Node parent, String moduleType, Project project, PathInfo pathInfo, ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    Node androidManifest = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(parent), Node.class);
    if (ScriptBytecodeAdapter.compareEqual("feature", moduleType)) {
      arrayOfCallSite[2].call(handler, androidManifest, "android:isFeatureSplit", Boolean.valueOf(true));
      arrayOfCallSite[3].call(handler, androidManifest, "split", arrayOfCallSite[4].call(this.distro));
      arrayOfCallSite[5].call(this.distro, androidManifest, moduleType, project);
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(this.description, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(this.description, "$"))))
      arrayOfCallSite[7].call(handler, parent, "android:description", this.description); 
    if ((ScriptBytecodeAdapter.compareNotEqual(this.entryTheme, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(this.entryTheme, "$"))))
      arrayOfCallSite[9].call(handler, parent, "android:theme", this.entryTheme); 
    AbilitiesOptions abilityInfo;
    Iterator iterator;
    for (abilityInfo = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(this.abilities), Iterator.class); iterator.hasNext(); ) {
      abilityInfo = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      arrayOfCallSite[11].call(abilityInfo, ArrayUtil.createArray(parent, moduleType, project, configInfo, pathInfo));
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[21].call(parent, "android:icon"), null) && ScriptBytecodeAdapter.compareEqual("entry", moduleType))) {
        arrayOfCallSite[22].call(handler, parent, "android:icon", "@drawable/default_icon");
        Object tmpOutShellIcoFile = arrayOfCallSite[23].call(arrayOfCallSite[24].call(Paths.class, arrayOfCallSite[25].call(pathInfo), "drawable", arrayOfCallSite[26].callGetProperty(CommonConst.class)));
        arrayOfCallSite[27].call(FileUtils.class, arrayOfCallSite[28].callGetProperty(CommonConst.class), arrayOfCallSite[29].callGetProperty(tmpOutShellIcoFile));
      } 
    } else if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[12].call(parent, "android:icon"), null) && ScriptBytecodeAdapter.compareEqual("entry", moduleType))) {
      arrayOfCallSite[13].call(handler, parent, "android:icon", "@drawable/default_icon");
      Object tmpOutShellIcoFile = arrayOfCallSite[14].call(arrayOfCallSite[15].call(Paths.class, arrayOfCallSite[16].call(pathInfo), "drawable", arrayOfCallSite[17].callGetProperty(CommonConst.class)));
      arrayOfCallSite[18].call(FileUtils.class, arrayOfCallSite[19].callGetProperty(CommonConst.class), arrayOfCallSite[20].callGetProperty(tmpOutShellIcoFile));
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.metaData, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[35].callGetProperty(this.metaData), null))) {
        List mapList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[36].call(CastTransformUtil.class, arrayOfCallSite[37].callGetProperty(this.metaData), CustomizeDataOptions.class), List.class);
        CustomizeDataOptions customizeDataOptions;
        Iterator iterator1;
        for (customizeDataOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].call(mapList), Iterator.class); iterator1.hasNext(); ) {
          customizeDataOptions = (CustomizeDataOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), CustomizeDataOptions.class);
          arrayOfCallSite[39].call(customizeDataOptions, parent, moduleType, project, pathInfo);
        } 
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(this.metaData, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[30].callGetProperty(this.metaData), null))) {
      List mapList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(CastTransformUtil.class, arrayOfCallSite[32].callGetProperty(this.metaData), CustomizeDataOptions.class), List.class);
      CustomizeDataOptions customizeDataOptions;
      Iterator iterator1;
      for (customizeDataOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(mapList), Iterator.class); iterator1.hasNext(); ) {
        customizeDataOptions = (CustomizeDataOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), CustomizeDataOptions.class);
        arrayOfCallSite[34].call(customizeDataOptions, parent, moduleType, project, pathInfo);
      } 
    } 
  }
  
  public void setPackageName(String packageName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = packageName;
    this.packageName = ShortTypeHandling.castToString(str);
  }
  
  public void setName(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
  }
  
  public void setDescription(String description) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = description;
    this.description = ShortTypeHandling.castToString(str);
  }
  
  public void setSupportedModes(List supportedModes) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = supportedModes;
    this.supportedModes = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public void setTheme(String theme) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = theme;
    this.theme = ShortTypeHandling.castToString(str);
  }
  
  public void setResizeable(Boolean resizeable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = resizeable;
    this.resizeable = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public void setEntryTheme(String entryTheme) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = entryTheme;
    this.entryTheme = ShortTypeHandling.castToString(str);
  }
  
  public void setReqCapabilities(List reqCapabilities) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = reqCapabilities;
    this.reqCapabilities = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public void setDeviceType(List deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = deviceType;
    this.deviceType = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public DistroOptions getDistro() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.distro;
  }
  
  public void setDistro(DistroOptions distro) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DistroOptions distroOptions = distro;
    this.distro = (DistroOptions)ScriptBytecodeAdapter.castToType(distroOptions, DistroOptions.class);
  }
  
  public String getPackageName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageName;
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public Boolean getResizeable() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.resizeable;
  }
  
  public String getDescription() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.description;
  }
  
  public List<String> getSupportedModes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.supportedModes;
  }
  
  public String getTheme() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.theme;
  }
  
  public String getEntryTheme() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.entryTheme;
  }
  
  public List<String> getReqCapabilities() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.reqCapabilities;
  }
  
  public List<String> getDeviceType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.deviceType;
  }
  
  public List<AbilitiesOptions> getAbilities() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.abilities;
  }
  
  public void setAbilities(List abilities) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = abilities;
    this.abilities = (List<AbilitiesOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<CommonEventsOptions> getCommonEvents() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.commonEvents;
  }
  
  public void setCommonEvents(List commonEvents) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = commonEvents;
    this.commonEvents = (List<CommonEventsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<ShortCutsOptions> getShortcuts() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shortcuts;
  }
  
  public void setShortcuts(List shortcuts) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = shortcuts;
    this.shortcuts = (List<ShortCutsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<JsOptions> getJs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.js;
  }
  
  public void setJs(List js) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = js;
    this.js = (List<JsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<ReqPermissionsOptions> getReqPermissions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.reqPermissions;
  }
  
  public void setReqPermissions(List reqPermissions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = reqPermissions;
    this.reqPermissions = (List<ReqPermissionsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<DefPermissionsOptions> getDefPermissions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defPermissions;
  }
  
  public void setDefPermissions(List defPermissions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = defPermissions;
    this.defPermissions = (List<DefPermissionsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<DefPermissionGroupsOptions> getDefPermissionGroups() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defPermissionGroups;
  }
  
  public void setDefPermissionGroups(List defPermissionGroups) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = defPermissionGroups;
    this.defPermissionGroups = (List<DefPermissionGroupsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public MetaDataOptions getMetaData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.metaData;
  }
  
  public void setMetaData(MetaDataOptions metaData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    MetaDataOptions metaDataOptions = metaData;
    this.metaData = (MetaDataOptions)ScriptBytecodeAdapter.castToType(metaDataOptions, MetaDataOptions.class);
  }
  
  public Boolean getAllowClassMap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.allowClassMap;
  }
  
  public void setAllowClassMap(Boolean allowClassMap) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = allowClassMap;
    this.allowClassMap = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getMainAbility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mainAbility;
  }
  
  public void setMainAbility(String mainAbility) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = mainAbility;
    this.mainAbility = ShortTypeHandling.castToString(str);
  }
  
  public String getColorMode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.colorMode;
  }
  
  public void setColorMode(String colorMode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = colorMode;
    this.colorMode = ShortTypeHandling.castToString(str);
  }
  
  public Integer getDescriptionId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.descriptionId;
  }
  
  public void setDescriptionId(Integer descriptionId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = descriptionId;
    this.descriptionId = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ModuleOptions moduleOptions = (ModuleOptions)ScriptBytecodeAdapter.castToType(options, ModuleOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(moduleOptions, null))
      return; 
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].call(arrayOfCallSite[54].call(arrayOfCallSite[55].call(arrayOfCallSite[56].call(arrayOfCallSite[57].call(arrayOfCallSite[58].call(arrayOfCallSite[59].call(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call(arrayOfCallSite[66].call(arrayOfCallSite[67].call(arrayOfCallSite[68].call(arrayOfCallSite[69].call(arrayOfCallSite[70].call(arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].call(arrayOfCallSite[74].call(arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].call(arrayOfCallSite[78].call(arrayOfCallSite[79].call(arrayOfCallSite[80].call(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(arrayOfCallSite[84].call(arrayOfCallSite[85].call(arrayOfCallSite[86].call(arrayOfCallSite[87].call(arrayOfCallSite[88].call(arrayOfCallSite[89].call(arrayOfCallSite[90].call("ModuleOptions{", "packageName='"), this.packageName), "'"), ", name='"), this.name), "'"), ", description='"), this.description), "'"), ", supportedModes="), this.supportedModes), ", theme='"), this.theme), "'"), ", entryTheme='"), this.entryTheme), "'"), ", reqCapabilities="), this.reqCapabilities), ", deviceType="), this.deviceType), ", distro="), this.distro), ", metaData="), this.metaData), ", abilities="), this.abilities), ", commonEvents="), this.commonEvents), ", shortcuts="), this.shortcuts), ", js="), this.js), ", reqPermissions="), this.reqPermissions), ", defPermissions="), this.defPermissions), ", defPermissionGroups="), this.defPermissionGroups), ", allowClassMap="), this.allowClassMap), ", mainAbility='"), this.mainAbility), "'"), ", resizeable="), this.resizeable), ", colorMode="), this.colorMode), ", descriptionId="), this.descriptionId), "}"));
  }
  
  public ModuleOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
