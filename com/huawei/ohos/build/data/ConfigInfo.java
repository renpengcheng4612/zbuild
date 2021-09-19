package com.huawei.ohos.build.data;

import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.exception.DeviceTypeNotSupportException;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.FormsOptions;
import com.huawei.ohos.build.shell.JsOptions;
import com.huawei.ohos.build.shell.ModuleOptions;
import com.huawei.ohos.build.shell.SkillsOptions;
import com.huawei.ohos.build.utils.JsonUtils;
import com.huawei.ohos.build.utils.ShellUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class ConfigInfo implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private Project project;
  
  private ConfigOptions configOptions;
  
  private File moduleConfigFile;
  
  static {
    Object object = $getCallSiteArray()[250].call(HMLogger.class, ConfigInfo.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public ConfigInfo(Project project, String jsonFile) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object1 = arrayOfCallSite[0].callConstructor(File.class, jsonFile);
    this.moduleConfigFile = (File)ScriptBytecodeAdapter.castToType(object1, File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(this.moduleConfigFile)))
      throw (Throwable)arrayOfCallSite[2].callConstructor(GradleException.class, arrayOfCallSite[3].call(arrayOfCallSite[4].call(this.moduleConfigFile), " not found.")); 
    Object object2 = arrayOfCallSite[5].call(JsonUtils.class, this.moduleConfigFile, ConfigOptions.class);
    this.configOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(object2, ConfigOptions.class);
  }
  
  public boolean hasOriginalName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[11].call(arrayOfCallSite[12].call(this.configOptions)), null) && 
        ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(this.configOptions))), Integer.valueOf(0))); 
    return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[6].call(arrayOfCallSite[7].call(this.configOptions)), null) && ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(this.configOptions))), Integer.valueOf(0)));
  }
  
  public void checkNotHybrid() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((supportRouterDevice() && ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[22].call(getDeviceType()), Integer.valueOf(2))))
        arrayOfCallSite[23].call(hmLogger, arrayOfCallSite[24].callConstructor(DeviceTypeNotSupportException.class, arrayOfCallSite[25].call("Router do not support hybrid devices.", " Please check config.json in main directory."))); 
      return;
    } 
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].callCurrent(this)) && ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[17].call(arrayOfCallSite[18].callCurrent(this)), Integer.valueOf(2))))
      arrayOfCallSite[19].call(hmLogger, arrayOfCallSite[20].callConstructor(DeviceTypeNotSupportException.class, arrayOfCallSite[21].call("Router do not support hybrid devices.", " Please check config.json in main directory."))); 
  }
  
  public boolean containPageType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List abilities = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[26].callGetProperty(arrayOfCallSite[27].callGetProperty(this.configOptions)), List.class);
    AbilitiesOptions abilitiesOption;
    Iterator iterator;
    for (abilitiesOption = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].call(abilities), Iterator.class); iterator.hasNext(); ) {
      abilitiesOption = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[29].callGroovyObjectGetProperty(abilitiesOption), "page"))
        return true; 
    } 
    return false;
  }
  
  public boolean allowComponentsProxy() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[30].call(arrayOfCallSite[31].call(this.configOptions), "default"), null))
      return DefaultTypeTransformation.booleanUnbox(ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].callGetProperty(arrayOfCallSite[33].call(arrayOfCallSite[34].call(this.configOptions), "default")), Boolean.class)); 
    return false;
  }
  
  public boolean supportLiteDeviceModule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[44].callGroovyObjectGetProperty(this), null) && (
        (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this), arrayOfCallSite[47].callGetProperty(arrayOfCallSite[48].callGetProperty(DeviceType.class)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[49].call(arrayOfCallSite[50].callGroovyObjectGetProperty(this), arrayOfCallSite[51].callGetProperty(arrayOfCallSite[52].callGetProperty(DeviceType.class))))))); 
    return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[35].callGroovyObjectGetProperty(this), null) && ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this), arrayOfCallSite[38].callGetProperty(arrayOfCallSite[39].callGetProperty(DeviceType.class)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(arrayOfCallSite[41].callGroovyObjectGetProperty(this), arrayOfCallSite[42].callGetProperty(arrayOfCallSite[43].callGetProperty(DeviceType.class)))))));
  }
  
  public boolean supportRouterDevice() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[53].callGroovyObjectGetProperty(this), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this), arrayOfCallSite[56].callGetProperty(arrayOfCallSite[57].callGetProperty(DeviceType.class)))));
  }
  
  public boolean needPackageBin() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (supportLiteDeviceModule() && 
        DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[63].call(arrayOfCallSite[64].callGroovyObjectGetProperty(this), arrayOfCallSite[65].callGetProperty(arrayOfCallSite[66].callGetProperty(DeviceType.class))))); 
    return (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].callCurrent(this)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[59].call(arrayOfCallSite[60].callGroovyObjectGetProperty(this), arrayOfCallSite[61].callGetProperty(arrayOfCallSite[62].callGetProperty(DeviceType.class)))));
  }
  
  public String getLiteDeviceType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (!supportLiteDeviceModule())
        return ""; 
    } else if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[67].callCurrent(this))) {
      return "";
    } 
    String device;
    Iterator iterator;
    for (device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].call(arrayOfCallSite[69].callGroovyObjectGetProperty(this)), Iterator.class); iterator.hasNext(); ) {
      device = ShortTypeHandling.castToString(iterator.next());
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call(arrayOfCallSite[71].call(DeviceType.class, device))))
        return device; 
    } 
    return "";
  }
  
  public boolean hybridLiteDeviceModule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (supportLiteDeviceModule() && 
        DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[76].call(arrayOfCallSite[77].call(arrayOfCallSite[78].callGroovyObjectGetProperty(this)), new _hybridLiteDeviceModule_closure1(this, this)))); 
    return (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].callCurrent(this)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[73].call(arrayOfCallSite[74].call(arrayOfCallSite[75].callGroovyObjectGetProperty(this)), new _hybridLiteDeviceModule_closure1(this, this))));
  }
  
  public final class _hybridLiteDeviceModule_closure1 extends Closure implements GeneratedClosure {
    public _hybridLiteDeviceModule_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].call(DeviceType.class, it));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public boolean haveAceJsModule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[84].call(arrayOfCallSite[85].call(this.configOptions)), null) && ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[86].call(arrayOfCallSite[87].call(arrayOfCallSite[88].call(this.configOptions))), Integer.valueOf(0))); 
    return (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[79].call(arrayOfCallSite[80].call(this.configOptions)), null) && ScriptBytecodeAdapter.compareGreaterThanEqual(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(this.configOptions))), Integer.valueOf(0)));
  }
  
  public String getBundleName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[89].call(arrayOfCallSite[90].call(this.configOptions)));
  }
  
  public String getModuleType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[91].call(arrayOfCallSite[92].call(arrayOfCallSite[93].call(this.configOptions))));
  }
  
  public String getModuleInstallType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[94].call(arrayOfCallSite[95].call(arrayOfCallSite[96].call(arrayOfCallSite[97].call(this.configOptions)))));
  }
  
  public boolean getDeliveryWithInstall() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[98].call(arrayOfCallSite[99].call(arrayOfCallSite[100].call(this.configOptions))));
  }
  
  public List<String> getDeviceType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[101].call(arrayOfCallSite[102].call(this.configOptions)), List.class);
  }
  
  public String getShellApkName(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareEqual(getModuleType(), "entry"))
        return ShortTypeHandling.castToString(arrayOfCallSite[109].call(arrayOfCallSite[110].call(arrayOfCallSite[111].call(arrayOfCallSite[112].call(this.project), "_"), arrayOfCallSite[113].callGroovyObjectGetProperty(variantData)), "_unsigned_entry.apk")); 
      return ShortTypeHandling.castToString(arrayOfCallSite[114].call(arrayOfCallSite[115].call(arrayOfCallSite[116].call(arrayOfCallSite[117].call(this.project), "_"), arrayOfCallSite[118].callGroovyObjectGetProperty(variantData)), "_unsigned_feature.apk"));
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[103].callCurrent(this), "entry"))
      return ShortTypeHandling.castToString(arrayOfCallSite[104].call(arrayOfCallSite[105].call(arrayOfCallSite[106].call(arrayOfCallSite[107].call(this.project), "_"), arrayOfCallSite[108].callGroovyObjectGetProperty(variantData)), "_unsigned_entry.apk")); 
    return ShortTypeHandling.castToString(arrayOfCallSite[114].call(arrayOfCallSite[115].call(arrayOfCallSite[116].call(arrayOfCallSite[117].call(this.project), "_"), arrayOfCallSite[118].callGroovyObjectGetProperty(variantData)), "_unsigned_feature.apk"));
  }
  
  public String getTestApkName(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[119].call(arrayOfCallSite[120].call(arrayOfCallSite[121].call(arrayOfCallSite[122].call(this.project), "_"), arrayOfCallSite[123].callGroovyObjectGetProperty(variantData)), "_unsigned_test_feature.apk"));
  }
  
  public List<JsOptions> getJsModules() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List<JsOptions>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[124].call(arrayOfCallSite[125].call(this.configOptions)), List.class);
  }
  
  public String getVersionName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[126].call(arrayOfCallSite[127].call(arrayOfCallSite[128].call(this.configOptions))));
  }
  
  public int getVersionCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.intUnbox(arrayOfCallSite[129].call(arrayOfCallSite[130].call(arrayOfCallSite[131].call(this.configOptions))));
  }
  
  public Integer getMinSdkVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].call(arrayOfCallSite[133].call(arrayOfCallSite[134].call(this.configOptions))), Integer.class);
  }
  
  public List<String> getJsModuleNames() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> jsModuleNames = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[135].callConstructor(ArrayList.class), List.class);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[136].call(arrayOfCallSite[137].call(this.configOptions)), null)) {
      JsOptions jsOptions;
      Iterator iterator;
      for (jsOptions = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[138].call(arrayOfCallSite[139].call(arrayOfCallSite[140].call(this.configOptions))), Iterator.class); iterator.hasNext(); ) {
        jsOptions = (JsOptions)ScriptBytecodeAdapter.castToType(iterator.next(), JsOptions.class);
        arrayOfCallSite[141].call(jsModuleNames, arrayOfCallSite[142].call(jsOptions));
      } 
    } 
    return jsModuleNames;
  }
  
  public String getAppName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    AbilitiesOptions ability = null;
    List allAbilities = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[143].call(arrayOfCallSite[144].call(this.configOptions)), List.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(allAbilities, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[148].call(allAbilities), Integer.valueOf(0))))
        arrayOfCallSite[149].call(hmLogger, arrayOfCallSite[150].callConstructor(GradleException.class, "The abilities field is missing. The JS manifest file cannot be generated.")); 
    } else if ((ScriptBytecodeAdapter.compareEqual(allAbilities, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[145].call(allAbilities), Integer.valueOf(0)))) {
      arrayOfCallSite[146].call(hmLogger, arrayOfCallSite[147].callConstructor(GradleException.class, "The abilities field is missing. The JS manifest file cannot be generated."));
    } 
    AbilitiesOptions abilitiesOptions;
    Iterator iterator;
    for (abilitiesOptions = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[151].call(allAbilities), Iterator.class); iterator.hasNext(); ) {
      abilitiesOptions = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      List mySkills = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[152].call(abilitiesOptions), List.class);
      if (ScriptBytecodeAdapter.compareNotEqual(mySkills, null)) {
        SkillsOptions skill;
        Iterator iterator1;
        for (skill = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[153].call(mySkills), Iterator.class); iterator1.hasNext(); ) {
          skill = (SkillsOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), SkillsOptions.class);
          List myActions = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[154].call(skill), List.class);
          if ((ScriptBytecodeAdapter.compareNotEqual(myActions, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[155].call(myActions, "action.system.home"))))
            AbilitiesOptions abilitiesOptions1 = abilitiesOptions; 
        } 
      } 
      if (ScriptBytecodeAdapter.compareNotEqual(ability, null))
        break; 
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(ability, null) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[158].call(allAbilities))))) {
        Object object = arrayOfCallSite[159].call(allAbilities, Integer.valueOf(0));
        ability = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(object, AbilitiesOptions.class);
      } 
    } else if ((ScriptBytecodeAdapter.compareEqual(ability, null) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[156].call(allAbilities))))) {
      Object object = arrayOfCallSite[157].call(allAbilities, Integer.valueOf(0));
      ability = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(object, AbilitiesOptions.class);
    } 
    return ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[160].call(ability), null) ? arrayOfCallSite[161].call(ability) : arrayOfCallSite[162].call(ability));
  }
  
  public List<AbilitiesOptions> getAbilityList() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List<AbilitiesOptions>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[163].call(arrayOfCallSite[164].call(this.configOptions)), List.class);
  }
  
  public String getShellApplicationName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (supportLiteDeviceModule())
        return ShortTypeHandling.castToString(arrayOfCallSite[167].callGetProperty(ShellUtils.class)); 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[165].callCurrent(this))) {
      return ShortTypeHandling.castToString(arrayOfCallSite[166].callGetProperty(ShellUtils.class));
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[168].call(arrayOfCallSite[169].call(this.configOptions)), null))
      arrayOfCallSite[170].call(hmLogger, arrayOfCallSite[171].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[172].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'module' sub-tag 'name' label is Empty." }))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[173].call("Shell", arrayOfCallSite[174].call(arrayOfCallSite[175].call(arrayOfCallSite[176].call(this.configOptions)), arrayOfCallSite[177].call(arrayOfCallSite[178].call(arrayOfCallSite[179].call(arrayOfCallSite[180].call(this.configOptions)), "."), Integer.valueOf(1)))));
  }
  
  public String getShellApplicationPackage() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (supportLiteDeviceModule())
        return ShortTypeHandling.castToString(arrayOfCallSite[183].callGetProperty(ShellUtils.class)); 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[181].callCurrent(this))) {
      return ShortTypeHandling.castToString(arrayOfCallSite[182].callGetProperty(ShellUtils.class));
    } 
    ModuleOptions module = (ModuleOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[184].call(this.configOptions), ModuleOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[185].call(arrayOfCallSite[186].call(this.configOptions)), null))
      arrayOfCallSite[187].call(hmLogger, arrayOfCallSite[188].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[189].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'module' sub-tag 'name' label is Empty." }))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[190].call(arrayOfCallSite[191].call(arrayOfCallSite[192].call(module), ".Shell"), arrayOfCallSite[193].call(arrayOfCallSite[194].call(module), arrayOfCallSite[195].call(arrayOfCallSite[196].call(arrayOfCallSite[197].call(module), "."), Integer.valueOf(1)))));
  }
  
  public String getModulePackName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (supportLiteDeviceModule())
        return ShortTypeHandling.castToString(arrayOfCallSite[200].callGetProperty(ShellUtils.class)); 
      return ShortTypeHandling.castToString(arrayOfCallSite[201].call(arrayOfCallSite[202].call(this.configOptions)));
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[198].callCurrent(this)))
      return ShortTypeHandling.castToString(arrayOfCallSite[199].callGetProperty(ShellUtils.class)); 
    return ShortTypeHandling.castToString(arrayOfCallSite[201].call(arrayOfCallSite[202].call(this.configOptions)));
  }
  
  public String getModuleName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[203].call(arrayOfCallSite[204].call(arrayOfCallSite[205].call(this.configOptions))));
  }
  
  public File getHapProfileFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.moduleConfigFile;
  }
  
  public ConfigOptions getConfigOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configOptions;
  }
  
  public boolean isEmptyProject() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  public boolean isEntryHap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String moduleType = ShortTypeHandling.castToString(arrayOfCallSite[206].callGetProperty(arrayOfCallSite[207].callGetProperty(arrayOfCallSite[208].callGetProperty(this.configOptions))));
    return DefaultTypeTransformation.booleanUnbox(ScriptBytecodeAdapter.compareEqual(moduleType, "entry") ? arrayOfCallSite[209].callGetProperty(Boolean.class) : arrayOfCallSite[210].callGetProperty(Boolean.class));
  }
  
  public boolean isHap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String moduleType = ShortTypeHandling.castToString(arrayOfCallSite[211].callGetProperty(arrayOfCallSite[212].callGetProperty(arrayOfCallSite[213].callGetProperty(this.configOptions))));
    return DefaultTypeTransformation.booleanUnbox(((ScriptBytecodeAdapter.compareEqual(moduleType, "entry") || DefaultTypeTransformation.booleanUnbox("future"))) ? arrayOfCallSite[214].callGetProperty(Boolean.class) : arrayOfCallSite[215].callGetProperty(Boolean.class));
  }
  
  public boolean isFormsEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      AbilitiesOptions abilitiesOptions1;
      Iterator iterator1;
      for (abilitiesOptions1 = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[219].call(getAbilityList()), Iterator.class); iterator1.hasNext(); ) {
        abilitiesOptions1 = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), AbilitiesOptions.class);
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[220].callGroovyObjectGetProperty(abilitiesOptions1)))
          return true; 
      } 
      return false;
    } 
    AbilitiesOptions abilitiesOptions;
    Iterator iterator;
    for (abilitiesOptions = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[216].call(arrayOfCallSite[217].callCurrent(this)), Iterator.class); iterator.hasNext(); ) {
      abilitiesOptions = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[218].callGroovyObjectGetProperty(abilitiesOptions)))
        return true; 
    } 
    return false;
  }
  
  public void checkFormsEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      AbilitiesOptions abilitiesOptions1;
      Iterator iterator1;
      for (abilitiesOptions1 = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[236].call(getAbilityList()), Iterator.class); iterator1.hasNext(); ) {
        abilitiesOptions1 = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), AbilitiesOptions.class);
        if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[237].callGroovyObjectGetProperty(abilitiesOptions1))) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[238].callGroovyObjectGetProperty(abilitiesOptions1), null)))
          continue; 
        FormsOptions formsOptions;
        Iterator iterator2;
        for (formsOptions = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[239].call(arrayOfCallSite[240].callGroovyObjectGetProperty(abilitiesOptions1)), Iterator.class); iterator2.hasNext(); ) {
          formsOptions = (FormsOptions)ScriptBytecodeAdapter.castToType(iterator2.next(), FormsOptions.class);
          if (ScriptBytecodeAdapter.compareNotEqual("Java", arrayOfCallSite[241].callGroovyObjectGetProperty(formsOptions)))
            continue; 
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[242].callGroovyObjectGetProperty(formsOptions), null))
            arrayOfCallSite[243].call(hmLogger, arrayOfCallSite[244].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[245].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'forms' sub-tag 'landscapeLayouts' label is notEmpty." }))); 
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[246].callGroovyObjectGetProperty(formsOptions), null))
            arrayOfCallSite[247].call(hmLogger, arrayOfCallSite[248].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[249].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'forms' sub-tag 'portraitLayouts' label is notEmpty." }))); 
        } 
      } 
      return;
    } 
    AbilitiesOptions abilitiesOptions;
    Iterator iterator;
    for (abilitiesOptions = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[221].call(arrayOfCallSite[222].callCurrent(this)), Iterator.class); iterator.hasNext(); ) {
      abilitiesOptions = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[223].callGroovyObjectGetProperty(abilitiesOptions))) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[224].callGroovyObjectGetProperty(abilitiesOptions), null)))
        continue; 
      FormsOptions formsOptions;
      Iterator iterator1;
      for (formsOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[225].call(arrayOfCallSite[226].callGroovyObjectGetProperty(abilitiesOptions)), Iterator.class); iterator1.hasNext(); ) {
        formsOptions = (FormsOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), FormsOptions.class);
        if (ScriptBytecodeAdapter.compareNotEqual("Java", arrayOfCallSite[227].callGroovyObjectGetProperty(formsOptions)))
          continue; 
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[228].callGroovyObjectGetProperty(formsOptions), null))
          arrayOfCallSite[229].call(hmLogger, arrayOfCallSite[230].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[231].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'forms' sub-tag 'landscapeLayouts' label is notEmpty." }))); 
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[232].callGroovyObjectGetProperty(formsOptions), null))
          arrayOfCallSite[233].call(hmLogger, arrayOfCallSite[234].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[235].callGetProperty(this.project) }, new String[] { "Please check ", " module config.json, check whether the 'forms' sub-tag 'portraitLayouts' label is notEmpty." }))); 
      } 
    } 
  }
}
