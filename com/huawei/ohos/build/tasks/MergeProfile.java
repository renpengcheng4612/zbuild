package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.utils.ConfigCache;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.JsonUtils;
import com.huawei.ohos.build.utils.ShellUtils;
import com.huawei.ohos.build.utils.configJson.CompareTestProfileUtil;
import com.huawei.ohos.build.utils.configJson.ProcessPlaceHoldersUtils;
import com.huawei.ohos.build.utils.configJson.TransformUtil;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.pair.PairUtil;
import groovy.json.JsonOutput;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

public class MergeProfile extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger HM_LOG;
  
  private ConfigInfo configInfo;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @Nested
  private BuildType buildTypeConfig;
  
  @Nested
  private VariantFlavor mergedFlavorConfig;
  
  static {
    Object object = $getCallSiteArray()[135].call(HMLogger.class, $getCallSiteArray()[136].call(MergeProfile.class));
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputFiles
  public FileCollection getConfigFileCollection() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File mergeResFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.pathInfo), arrayOfCallSite[9].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[10].callGetProperty(BuildConst.class))), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(mergeResFile)))
      return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this)), FileCollection.class); 
    Reference configFileCollection = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this)), FileCollection.class));
    arrayOfCallSite[16].call(mergeResFile, new _getConfigFileCollection_closure1(this, this, configFileCollection));
    return (FileCollection)configFileCollection.get();
  }
  
  public final class _getConfigFileCollection_closure1 extends Closure implements GeneratedClosure {
    public _getConfigFileCollection_closure1(Object _outerInstance, Object _thisObject, Reference configFileCollection) {
      super(_outerInstance, _thisObject);
      Reference reference = configFileCollection;
      this.configFileCollection = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(File.class, arrayOfCallSite[1].call(it, Integer.valueOf(1), arrayOfCallSite[2].call(arrayOfCallSite[3].call(it), Integer.valueOf(1)))), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file))) {
        File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].callGetProperty(file), arrayOfCallSite[8].callGetProperty(CommonConst.class))), File.class);
        this.configFileCollection.set(ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].call(this.configFileCollection.get(), arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), configFile)), FileCollection.class));
        return arrayOfCallSite[9].call(this.configFileCollection.get(), arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), configFile));
      } 
      return null;
    }
    
    @Generated
    public FileCollection getConfigFileCollection() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (FileCollection)ScriptBytecodeAdapter.castToType(this.configFileCollection.get(), FileCollection.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @InputFile
  public File getConfigFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].call(arrayOfCallSite[18].call(Paths.class, arrayOfCallSite[19].call(arrayOfCallSite[20].call(this.variantData)))), File.class);
  }
  
  @OutputFile
  public File getMergedConfigFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].call(arrayOfCallSite[22].call(Paths.class, arrayOfCallSite[23].call(this.pathInfo))), File.class);
  }
  
  @InputFile
  public File getMainConfigFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(arrayOfCallSite[25].call(Paths.class, arrayOfCallSite[26].call(this.pathInfo))), File.class);
  }
  
  @Inject
  public MergeProfile(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.buildTypeConfig = (BuildType)ScriptBytecodeAdapter.castToType(object4, BuildType.class);
    Object object5 = arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGroovyObjectGetProperty(variantData));
    this.mergedFlavorConfig = (VariantFlavor)ScriptBytecodeAdapter.castToType(object5, VariantFlavor.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map allVariantDataCache = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(arrayOfCallSite[28].call(GlobalDataManager.class, arrayOfCallSite[29].callGroovyObjectGetProperty(this))), Map.class);
    ConfigCache configCache = (ConfigCache)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callConstructor(ConfigCache.class), ConfigCache.class);
    Object object1 = arrayOfCallSite[31].call(allVariantDataCache, arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[34].callGetProperty(arrayOfCallSite[35].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, MergeProfile.class, (GroovyObject)configCache, "configPlaceHolder");
    arrayOfCallSite[36].call(ConfigCache.class, configCache);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[39].callGetProperty(BuildConst.class)))) {
      ConfigOptions testConfig = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].call(JsonUtils.class, arrayOfCallSite[41].call(arrayOfCallSite[42].call(Paths.class, arrayOfCallSite[43].call(this.pathInfo))), ConfigOptions.class), ConfigOptions.class);
      ConfigOptions mainConfig = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[44].call(JsonUtils.class, arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(this.pathInfo))), ConfigOptions.class), ConfigOptions.class);
      arrayOfCallSite[48].call(CompareTestProfileUtil.class, mainConfig, testConfig, ConfigOptions.class);
    } 
    File harmonyProfileMergeDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[49].call(arrayOfCallSite[50].call(Paths.class, arrayOfCallSite[51].call(this.pathInfo), arrayOfCallSite[52].callGroovyObjectGetProperty(this.variantData))), File.class);
    Reference harProjectHarmonyJsonList = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this), new _run_closure2(this, this, harProjectHarmonyJsonList));
    ConfigOptions hapConfigOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(JsonUtils.class, arrayOfCallSite[57].call(harProjectHarmonyJsonList.get(), Integer.valueOf(0)), ConfigOptions.class), ConfigOptions.class);
    arrayOfCallSite[58].callCurrent(this, hapConfigOptions);
    Reference harConfigOptionsList = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].callConstructor(LinkedList.class), List.class));
    arrayOfCallSite[60].call(harProjectHarmonyJsonList.get(), new _run_closure3(this, this, harConfigOptionsList));
    Reference mergeConfig = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[61].call(TransformUtil.class, hapConfigOptions, harConfigOptionsList.get(), ConfigOptions.class), ConfigOptions.class));
    Object object2 = arrayOfCallSite[62].call(ProcessPlaceHoldersUtils.class, mergeConfig.get(), arrayOfCallSite[63].callGetProperty(arrayOfCallSite[64].call(ConfigCache.class)));
    mergeConfig.set(ScriptBytecodeAdapter.castToType(object2, ConfigOptions.class));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[65].call(FileUtils.class, harmonyProfileMergeDir)))
      arrayOfCallSite[66].call(HM_LOG, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[67].callGetProperty(harmonyProfileMergeDir)); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[68].call(FileUtils.class, arrayOfCallSite[69].callGroovyObjectGetProperty(this))))
      arrayOfCallSite[70].call(HM_LOG, "Unable to create or delete the %s file. An incremental problem may occur.", arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].callGroovyObjectGetProperty(this))); 
    arrayOfCallSite[73].call(arrayOfCallSite[74].callGroovyObjectGetProperty(this), arrayOfCallSite[75].callGetProperty(CommonConst.class), new _run_closure4(this, this, mergeConfig));
    arrayOfCallSite[76].call(arrayOfCallSite[77].call(GlobalDataManager.class, arrayOfCallSite[78].callGroovyObjectGetProperty(this)), arrayOfCallSite[79].callGroovyObjectGetProperty(this), arrayOfCallSite[80].call(arrayOfCallSite[81].callGroovyObjectGetProperty(this)));
  }
  
  public final class _run_closure2 extends Closure implements GeneratedClosure {
    public _run_closure2(Object _outerInstance, Object _thisObject, Reference harProjectHarmonyJsonList) {
      super(_outerInstance, _thisObject);
      Reference reference = harProjectHarmonyJsonList;
      this.harProjectHarmonyJsonList = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), "main")) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(it)))))
        throw (Throwable)arrayOfCallSite[3].callConstructor(GradleException.class, arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(it)), " not found.")); 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(it)))
        return arrayOfCallSite[8].call(this.harProjectHarmonyJsonList.get(), it); 
      return null;
    }
    
    @Generated
    public List getHarProjectHarmonyJsonList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.harProjectHarmonyJsonList.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _run_closure3 extends Closure implements GeneratedClosure {
    public _run_closure3(Object _outerInstance, Object _thisObject, Reference harConfigOptionsList) {
      super(_outerInstance, _thisObject);
      Reference reference = harConfigOptionsList;
      this.harConfigOptionsList = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ConfigOptions harConfigOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(JsonUtils.class, it, ConfigOptions.class), ConfigOptions.class);
      arrayOfCallSite[1].callCurrent((GroovyObject)this, harConfigOptions);
      return arrayOfCallSite[2].call(this.harConfigOptionsList.get(), harConfigOptions);
    }
    
    @Generated
    public List getHarConfigOptionsList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.harConfigOptionsList.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _run_closure4 extends Closure implements GeneratedClosure {
    public _run_closure4(Object _outerInstance, Object _thisObject, Reference mergeConfig) {
      super(_outerInstance, _thisObject);
      Reference reference = mergeConfig;
      this.mergeConfig = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(JsonOutput.class, arrayOfCallSite[2].call(JsonUtils.class, arrayOfCallSite[3].callCurrent((GroovyObject)this, this.mergeConfig.get()))));
    }
    
    @Generated
    public ConfigOptions getMergeConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ConfigOptions)ScriptBytecodeAdapter.castToType(this.mergeConfig.get(), ConfigOptions.class);
    }
  }
  
  public Object disposeConfigOptions(ConfigOptions configOptions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference packageName = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[82].call(arrayOfCallSite[83].call(configOptions))));
    List abilitiesOptionsList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[84].call(arrayOfCallSite[85].call(configOptions)), List.class);
    Reference configInfoTemp = new Reference(this.configInfo);
    arrayOfCallSite[86].call(abilitiesOptionsList, new _disposeConfigOptions_closure5(this, this, configInfoTemp, packageName));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[87].call(this.configInfo)))
      return arrayOfCallSite[88].call(ShellUtils.class, configOptions); 
    return null;
  }
  
  public final class _disposeConfigOptions_closure5 extends Closure implements GeneratedClosure {
    public _disposeConfigOptions_closure5(Object _outerInstance, Object _thisObject, Reference configInfoTemp, Reference packageName) {
      super(_outerInstance, _thisObject);
      Reference reference1 = configInfoTemp;
      this.configInfoTemp = reference1;
      Reference reference2 = packageName;
      this.packageName = reference2;
    }
    
    public Object doCall(Object abilities) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.configInfoTemp.get())) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[1].callGetProperty(abilities), null)))
        return null; 
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[2].callGetProperty(abilities), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(abilities), "."))))
        arrayOfCallSite[5].call(abilities, arrayOfCallSite[6].call(this.packageName.get(), arrayOfCallSite[7].callGetProperty(abilities))); 
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[8].callGetProperty(abilities), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(abilities), "."))))
        return arrayOfCallSite[11].call(abilities, arrayOfCallSite[12].call(this.packageName.get(), arrayOfCallSite[13].callGetProperty(abilities))); 
      return null;
    }
    
    @Generated
    public ConfigInfo getConfigInfoTemp() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ConfigInfo)ScriptBytecodeAdapter.castToType(this.configInfoTemp.get(), ConfigInfo.class);
    }
    
    @Generated
    public String getPackageName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.packageName.get());
    }
  }
  
  public ConfigOptions mergeDslConfig(ConfigOptions mergeConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PairUtil bundleNamePair = (PairUtil)ScriptBytecodeAdapter.castToType(arrayOfCallSite[89].call(PairUtil.class, arrayOfCallSite[90].callGetProperty(arrayOfCallSite[91].callGroovyObjectGetProperty(mergeConfig)), ""), PairUtil.class);
    Integer target = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[92].callGetProperty(arrayOfCallSite[93].callGetProperty(arrayOfCallSite[94].callGroovyObjectGetProperty(mergeConfig))), Integer.class);
    Integer compatible = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[95].callGetProperty(arrayOfCallSite[96].callGetProperty(arrayOfCallSite[97].callGroovyObjectGetProperty(mergeConfig))), Integer.class);
    if (ScriptBytecodeAdapter.compareNotEqual(this.mergedFlavorConfig, null)) {
      Object object1 = arrayOfCallSite[98].call(bundleNamePair, arrayOfCallSite[99].callGetProperty(this.mergedFlavorConfig));
      bundleNamePair = (PairUtil)ScriptBytecodeAdapter.castToType(object1, PairUtil.class);
      Object object2 = arrayOfCallSite[100].call(bundleNamePair, arrayOfCallSite[101].callGetProperty(this.mergedFlavorConfig));
      bundleNamePair = (PairUtil)ScriptBytecodeAdapter.castToType(object2, PairUtil.class);
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[102].callGetProperty(this.mergedFlavorConfig), Integer.valueOf(0))) {
        Object object3 = arrayOfCallSite[103].callGetProperty(this.mergedFlavorConfig);
        target = (Integer)ScriptBytecodeAdapter.castToType(object3, Integer.class);
      } 
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[104].callGetProperty(this.mergedFlavorConfig), Integer.valueOf(0))) {
        Object object3 = arrayOfCallSite[105].callGetProperty(this.mergedFlavorConfig);
        compatible = (Integer)ScriptBytecodeAdapter.castToType(object3, Integer.class);
      } 
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(this.buildTypeConfig, null)) {
      Object object1 = arrayOfCallSite[106].call(bundleNamePair, arrayOfCallSite[107].callGetProperty(this.buildTypeConfig));
      bundleNamePair = (PairUtil)ScriptBytecodeAdapter.castToType(object1, PairUtil.class);
      Object object2 = arrayOfCallSite[108].call(bundleNamePair, arrayOfCallSite[109].callGetProperty(this.buildTypeConfig));
      bundleNamePair = (PairUtil)ScriptBytecodeAdapter.castToType(object2, PairUtil.class);
    } 
    Object object = arrayOfCallSite[110].call(arrayOfCallSite[111].call(bundleNamePair), arrayOfCallSite[112].call(bundleNamePair));
    ScriptBytecodeAdapter.setProperty(object, null, arrayOfCallSite[113].callGroovyObjectGetProperty(mergeConfig), "bundleName");
    arrayOfCallSite[114].call(HM_LOG, arrayOfCallSite[115].call(String.class, arrayOfCallSite[116].callGetProperty(Locale.class), "Change app bundleName with '%s'.", arrayOfCallSite[117].callGetProperty(arrayOfCallSite[118].callGroovyObjectGetProperty(mergeConfig))));
    Integer integer1 = target;
    ScriptBytecodeAdapter.setProperty(integer1, null, arrayOfCallSite[119].callGetProperty(arrayOfCallSite[120].callGroovyObjectGetProperty(mergeConfig)), "target");
    arrayOfCallSite[121].call(HM_LOG, arrayOfCallSite[122].call(String.class, arrayOfCallSite[123].callGetProperty(Locale.class), "Change app target with '%s'.", arrayOfCallSite[124].callGetProperty(arrayOfCallSite[125].callGetProperty(arrayOfCallSite[126].callGroovyObjectGetProperty(mergeConfig)))));
    Integer integer2 = compatible;
    ScriptBytecodeAdapter.setProperty(integer2, null, arrayOfCallSite[127].callGetProperty(arrayOfCallSite[128].callGroovyObjectGetProperty(mergeConfig)), "compatible");
    arrayOfCallSite[129].call(HM_LOG, arrayOfCallSite[130].call(String.class, arrayOfCallSite[131].callGetProperty(Locale.class), "Change app compatible with '%s'.", arrayOfCallSite[132].callGetProperty(arrayOfCallSite[133].callGetProperty(arrayOfCallSite[134].callGroovyObjectGetProperty(mergeConfig)))));
    return mergeConfig;
  }
  
  @Generated
  public BuildType getBuildTypeConfig() {
    return this.buildTypeConfig;
  }
  
  @Generated
  public void setBuildTypeConfig(BuildType paramBuildType) {
    this.buildTypeConfig = paramBuildType;
  }
  
  @Generated
  public VariantFlavor getMergedFlavorConfig() {
    return this.mergedFlavorConfig;
  }
  
  @Generated
  public void setMergedFlavorConfig(VariantFlavor paramVariantFlavor) {
    this.mergedFlavorConfig = paramVariantFlavor;
  }
}
