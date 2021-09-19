package com.huawei.ohos.build.model;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.CmakeInfo;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.sourcesets.OhosFilterableSourceDirectory;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.model.variant.VariantCombination;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.tasks.manager.VariantDependency;
import com.huawei.ohos.build.utils.ConfigCache;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.validate.CheckValidateTypeUtils;
import com.huawei.ohos.build.utils.validate.DeviceValidate;
import com.huawei.ohos.build.utils.validate.HarValidate;
import com.huawei.ohos.build.utils.validate.ValidateFactory;
import com.huawei.ohos.zbuild.model.VariantModel;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ArtifactCollection;
import org.gradle.api.artifacts.ArtifactView;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.util.PatternSet;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class VariantData implements GroovyObject {
  @NonNull
  private static final HMLogger HM_LOG;
  
  private static final Object GROUP_PREFIX;
  
  private Project project;
  
  private File configFile;
  
  private ConfigInfo configInfo;
  
  private CmakeInfo cmakeInfo;
  
  private PathInfo pathInfo;
  
  private SdkInfo sdkInfo;
  
  private PackageInfo packageInfo;
  
  private VariantDependency variantDependency;
  
  private VariantCombination combination;
  
  public String variantTaskGroup;
  
  private List<OhosSourceSet> sourceSets;
  
  static {
    String str = "ohos:";
    Object object = $getCallSiteArray()[202].call(HMLogger.class, VariantData.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public VariantData(VariantCombination combination, VariantDependency variantDependency, Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantCombination variantCombination = combination;
    this.combination = (VariantCombination)ScriptBytecodeAdapter.castToType(variantCombination, VariantCombination.class);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    VariantDependency variantDependency1 = variantDependency;
    this.variantDependency = (VariantDependency)ScriptBytecodeAdapter.castToType(variantDependency1, VariantDependency.class);
    Object object1 = arrayOfCallSite[0].call(combination);
    this.sourceSets = (List<OhosSourceSet>)ScriptBytecodeAdapter.castToType(object1, List.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      File file = findConfigFile();
      this.configFile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
    } else {
      Object object = arrayOfCallSite[1].callCurrent(this);
      this.configFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    Object object2 = arrayOfCallSite[2].call(GROUP_PREFIX, arrayOfCallSite[3].callGroovyObjectGetProperty(combination));
    this.variantTaskGroup = ShortTypeHandling.castToString(object2);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call(this.configFile))) {
        checkConfig();
        null;
      } else if (ScriptBytecodeAdapter.compareNotEqual(project, arrayOfCallSite[15].callGetProperty(project))) {
        arrayOfCallSite[16].call(HM_LOG, arrayOfCallSite[17].callConstructor(IllegalStateException.class, arrayOfCallSite[18].call(arrayOfCallSite[19].call("Config.json does not found:", arrayOfCallSite[20].call(System.class)), new GStringImpl(new Object[] { arrayOfCallSite[21].callGetProperty(this.configFile) }, new String[] { "", "" }))), "Project '%s' can not find a valid config.json,Please check!", arrayOfCallSite[22].callGetProperty(project));
      } 
      return;
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(this.configFile))) {
      arrayOfCallSite[5].callCurrent(this);
    } else if (ScriptBytecodeAdapter.compareNotEqual(project, arrayOfCallSite[6].callGetProperty(project))) {
      arrayOfCallSite[7].call(HM_LOG, arrayOfCallSite[8].callConstructor(IllegalStateException.class, arrayOfCallSite[9].call(arrayOfCallSite[10].call("Config.json does not found:", arrayOfCallSite[11].call(System.class)), new GStringImpl(new Object[] { arrayOfCallSite[12].callGetProperty(this.configFile) }, new String[] { "", "" }))), "Project '%s' can not find a valid config.json,Please check!", arrayOfCallSite[13].callGetProperty(project));
    } 
  }
  
  public File getJsSource() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object folders = arrayOfCallSite[23].call(arrayOfCallSite[24].callCurrent(this, new _getJsSource_closure1(this, this)));
    return (File)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(folders)) ? null : arrayOfCallSite[26].call(folders), File.class);
  }
  
  public final class _getJsSource_closure1 extends Closure implements GeneratedClosure {
    public _getJsSource_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object s) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callGetProperty(s);
    }
  }
  
  public FileCollection getSourceRoots(Function sourceSelector) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List dirs = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].callConstructor(ArrayList.class), List.class);
    Object s;
    Iterator iterator;
    for (s = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].call(this.sourceSets), Iterator.class); iterator.hasNext(); ) {
      s = iterator.next();
      OhosFilterableSourceDirectory sourceDir = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(sourceSelector, s), OhosFilterableSourceDirectory.class);
      if (ScriptBytecodeAdapter.compareNotEqual(sourceDir, null)) {
        File root;
        Iterator iterator1;
        for (root = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(sourceDir)), Iterator.class); iterator1.hasNext(); ) {
          root = (File)ScriptBytecodeAdapter.castToType(iterator1.next(), File.class);
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(root)))
            arrayOfCallSite[33].call(dirs, root); 
        } 
      } 
    } 
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].call(this.project, dirs), FileCollection.class);
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[35].call(this.combination));
  }
  
  public String getTestRealVariantName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[36].callGroovyObjectGetProperty(this), arrayOfCallSite[37].callGetProperty(VariantModel.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), Integer.valueOf(0), arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this)), arrayOfCallSite[43].call(arrayOfCallSite[44].callGetProperty(BuildConst.class))))); 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[45].callGroovyObjectGetProperty(this), arrayOfCallSite[46].callGetProperty(VariantModel.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(this), Integer.valueOf(0), arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this)), arrayOfCallSite[52].call(arrayOfCallSite[53].callGetProperty(BuildConst.class))))); 
    return ShortTypeHandling.castToString(null);
  }
  
  public Object getJavaSources() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object allTree = arrayOfCallSite[54].callConstructor(ArrayList.class);
    Object sourceSet;
    Iterator iterator;
    for (sourceSet = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].call(this.sourceSets), Iterator.class); iterator.hasNext(); ) {
      sourceSet = iterator.next();
      arrayOfCallSite[56].call(allTree, arrayOfCallSite[57].call(arrayOfCallSite[58].callGetProperty(sourceSet)));
    } 
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[61].call(allTree, getDefaultGeneratedJavaSource());
      return arrayOfCallSite[62].callGetProperty(arrayOfCallSite[63].call(this.project, allTree));
    } 
    arrayOfCallSite[59].call(allTree, arrayOfCallSite[60].callCurrent(this));
    return arrayOfCallSite[62].callGetProperty(arrayOfCallSite[63].call(this.project, allTree));
  }
  
  public Object getIdlFileTree() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object idlDirs = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object3 = arrayOfCallSite[66].call(allRootDir());
      Object idlPattern = arrayOfCallSite[67].call(arrayOfCallSite[68].callConstructor(PatternSet.class), arrayOfCallSite[69].callGetProperty(OhosSourceSet.class));
      return arrayOfCallSite[70].call(arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].call(arrayOfCallSite[73].call(this.project), idlDirs)), idlPattern);
    } 
    Object object1 = arrayOfCallSite[64].call(arrayOfCallSite[65].callCurrent(this));
    Object object2 = arrayOfCallSite[67].call(arrayOfCallSite[68].callConstructor(PatternSet.class), arrayOfCallSite[69].callGetProperty(OhosSourceSet.class));
    return arrayOfCallSite[70].call(arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].call(arrayOfCallSite[73].call(this.project), idlDirs)), object2);
  }
  
  private ArrayList<File> allRootDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object idlDirs = arrayOfCallSite[74].callConstructor(ArrayList.class);
    Object s;
    Iterator iterator;
    for (s = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(this.sourceSets), Iterator.class); iterator.hasNext(); ) {
      s = iterator.next();
      arrayOfCallSite[76].call(idlDirs, arrayOfCallSite[77].call(s));
    } 
    return (ArrayList<File>)ScriptBytecodeAdapter.castToType(idlDirs, ArrayList.class);
  }
  
  public Object getConfigFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configFile;
  }
  
  public Object getConfigInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareEqual(this.configInfo, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[78].call(this.configFile)))) {
      Object object = arrayOfCallSite[79].callConstructor(ConfigInfo.class, this.project, arrayOfCallSite[80].call(this.configFile));
      this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
    } 
    return this.configInfo;
  }
  
  public Object getCmakeInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.cmakeInfo, null)) {
      Object object = arrayOfCallSite[81].callConstructor(CmakeInfo.class, this.project, arrayOfCallSite[82].call(this.sdkInfo));
      this.cmakeInfo = (CmakeInfo)ScriptBytecodeAdapter.castToType(object, CmakeInfo.class);
    } 
    return this.cmakeInfo;
  }
  
  public Object getPathInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareEqual(this.pathInfo, null)) {
        Object object = arrayOfCallSite[85].callConstructor(PathInfo.class, this.project, getName());
        this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object, PathInfo.class);
      } 
      return this.pathInfo;
    } 
    if (ScriptBytecodeAdapter.compareEqual(this.pathInfo, null)) {
      Object object = arrayOfCallSite[83].callConstructor(PathInfo.class, this.project, arrayOfCallSite[84].callCurrent(this));
      this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object, PathInfo.class);
    } 
    return this.pathInfo;
  }
  
  public Object getSdkInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareEqual(this.sdkInfo, null)) {
        Object object = arrayOfCallSite[88].callConstructor(SdkInfo.class, this.project, getConfigInfo());
        this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object, SdkInfo.class);
      } 
      return this.sdkInfo;
    } 
    if (ScriptBytecodeAdapter.compareEqual(this.sdkInfo, null)) {
      Object object = arrayOfCallSite[86].callConstructor(SdkInfo.class, this.project, arrayOfCallSite[87].callCurrent(this));
      this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object, SdkInfo.class);
    } 
    return this.sdkInfo;
  }
  
  public Object getPackageInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.packageInfo, null)) {
      Object object = arrayOfCallSite[89].callConstructor(PackageInfo.class, this.project);
      this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object, PackageInfo.class);
    } 
    return this.packageInfo;
  }
  
  public BuildType getBuildType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (BuildType)ScriptBytecodeAdapter.castToType(arrayOfCallSite[90].callGroovyObjectGetProperty(this.combination), BuildType.class);
  }
  
  public void setConfigFile(File configFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = configFile;
    this.configFile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
    Object object = arrayOfCallSite[91].callConstructor(ConfigInfo.class, this.project, arrayOfCallSite[92].call(configFile));
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
  }
  
  public VariantDependency getVariantDependency() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantDependency;
  }
  
  public String buildHarmonyTaskName(String prefix, String suffix) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String taskName = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[98].call(arrayOfCallSite[99].call(prefix, arrayOfCallSite[100].call(getName())), arrayOfCallSite[101].call(suffix));
      taskName = ShortTypeHandling.castToString(object1);
      return taskName;
    } 
    Object object = arrayOfCallSite[93].call(arrayOfCallSite[94].call(prefix, arrayOfCallSite[95].call(arrayOfCallSite[96].callCurrent(this))), arrayOfCallSite[97].call(suffix));
    taskName = ShortTypeHandling.castToString(object);
    return taskName;
  }
  
  private Object getDefaultGeneratedJavaSource() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object defaultResTable = arrayOfCallSite[102].call(arrayOfCallSite[103].call(Paths.class, arrayOfCallSite[104].call(arrayOfCallSite[105].call(this.project)), arrayOfCallSite[106].callGetProperty(PathConst.class), arrayOfCallSite[107].callGetProperty(PathConst.class)));
    return arrayOfCallSite[108].call(arrayOfCallSite[109].call(arrayOfCallSite[110].call(this.project, defaultResTable)), arrayOfCallSite[111].call(arrayOfCallSite[112].call(arrayOfCallSite[113].call(arrayOfCallSite[114].call(arrayOfCallSite[115].callConstructor(PatternSet.class), arrayOfCallSite[116].callGetProperty(OhosSourceSet.class)), arrayOfCallSite[117].callGetProperty(OhosSourceSet.class)), arrayOfCallSite[118].callGetProperty(OhosSourceSet.class)), arrayOfCallSite[119].callGetProperty(OhosSourceSet.class)));
  }
  
  public FileCollection getCompileClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[120].callGetProperty(arrayOfCallSite[121].callStatic(VariantData.class, arrayOfCallSite[122].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[123].call(this.variantDependency))), FileCollection.class);
  }
  
  public FileCollection getPackageClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[124].callGetProperty(arrayOfCallSite[125].callStatic(VariantData.class, arrayOfCallSite[126].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[127].call(this.variantDependency))), FileCollection.class);
  }
  
  public FileCollection getPackageHarLibsJar() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[128].callGetProperty(arrayOfCallSite[129].callStatic(VariantData.class, arrayOfCallSite[130].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[131].call(this.variantDependency))), FileCollection.class);
  }
  
  public FileCollection getPackageRes(HarmonyArtifacts.ArtifactType artifactType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].callGetProperty(arrayOfCallSite[133].callStatic(VariantData.class, artifactType, arrayOfCallSite[134].call(this.variantDependency))), FileCollection.class);
  }
  
  public FileCollection getAnnotationProcessor() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[135].callGetProperty(arrayOfCallSite[136].callStatic(VariantData.class, arrayOfCallSite[137].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[138].call(this.variantDependency))), FileCollection.class);
  }
  
  private File findConfigFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference result = new Reference(arrayOfCallSite[139].callConstructor(ArrayList.class));
    arrayOfCallSite[140].call(this.sourceSets, new _findConfigFile_closure2(this, this, result));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[147].call(result.get())))
        return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[148].callConstructor(File.class, arrayOfCallSite[149].call(getPathInfo())), File.class); 
      return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[150].call(arrayOfCallSite[151].call(result.get())), File.class);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[141].call(result.get())))
      return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[142].callConstructor(File.class, arrayOfCallSite[143].call(arrayOfCallSite[144].callCurrent(this))), File.class); 
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[145].call(arrayOfCallSite[146].call(result.get())), File.class);
  }
  
  public final class _findConfigFile_closure2 extends Closure implements GeneratedClosure {
    public _findConfigFile_closure2(Object _outerInstance, Object _thisObject, Reference result) {
      super(_outerInstance, _thisObject);
      Reference reference = result;
      this.result = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Object profile = arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(it)), Integer.valueOf(0));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(profile)))
        return arrayOfCallSite[4].call(this.result.get(), profile); 
      return null;
    }
    
    @Generated
    public Object getResult() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.result.get();
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private void checkConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[155].call(HM_LOG, getName(), arrayOfCallSite[156].call(this.configFile));
    } else {
      arrayOfCallSite[152].call(HM_LOG, arrayOfCallSite[153].callCurrent(this), arrayOfCallSite[154].call(this.configFile));
    } 
    ValidateFactory validateFactory = (ValidateFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[157].callConstructor(DeviceValidate.class), ValidateFactory.class);
    ValidateFactory harValidate = (ValidateFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[158].callConstructor(HarValidate.class), ValidateFactory.class);
    Map flavorConfigPlaceholders = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[159].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[160].call(flavorConfigPlaceholders);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[161].callGroovyObjectGetProperty(this.combination), null)) {
      Map configPlaceholders = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[162].callGetProperty(arrayOfCallSite[163].callGroovyObjectGetProperty(this.combination)), Map.class);
      arrayOfCallSite[164].call(flavorConfigPlaceholders, ScriptBytecodeAdapter.compareEqual(configPlaceholders, null) ? ScriptBytecodeAdapter.castToType(arrayOfCallSite[165].callConstructor(HashMap.class), Map.class) : configPlaceholders);
    } 
    arrayOfCallSite[166].call(flavorConfigPlaceholders, ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[167].callGetProperty(arrayOfCallSite[168].callGroovyObjectGetProperty(this)), null) ? arrayOfCallSite[169].callConstructor(HashMap.class) : arrayOfCallSite[170].callGetProperty(arrayOfCallSite[171].callGroovyObjectGetProperty(this)));
    ConfigCache configCache = (ConfigCache)ScriptBytecodeAdapter.castToType(arrayOfCallSite[172].call(ConfigCache.class), ConfigCache.class);
    arrayOfCallSite[173].call(configCache, flavorConfigPlaceholders);
    arrayOfCallSite[174].call(ConfigCache.class, configCache);
    arrayOfCallSite[175].call(arrayOfCallSite[176].call(arrayOfCallSite[177].call(GlobalDataManager.class, this.project)), arrayOfCallSite[178].call(arrayOfCallSite[179].callGroovyObjectGetProperty(this.combination), arrayOfCallSite[180].callGetProperty(this.project)), flavorConfigPlaceholders);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = getConfigInfo();
      this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
    } else {
      Object object = arrayOfCallSite[181].callCurrent(this);
      this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
    } 
    ConfigOptions configOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[182].callGroovyObjectGetProperty(this.configInfo), ConfigOptions.class);
    arrayOfCallSite[183].call(this.configInfo);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[184].call(this.configInfo), "har")) {
      String deviceType = ShortTypeHandling.castToString(arrayOfCallSite[185].callGetProperty(BuildConst.class));
      arrayOfCallSite[186].call(validateFactory, configOptions, deviceType, this.project);
      arrayOfCallSite[187].call(harValidate, configOptions, null, this.project);
    } else {
      String type = ShortTypeHandling.castToString(arrayOfCallSite[188].call(CheckValidateTypeUtils.class, configOptions, this.project));
      arrayOfCallSite[189].call(validateFactory, configOptions, type, this.project);
    } 
    arrayOfCallSite[190].call(this.configInfo);
  }
  
  public ArtifactCollection getArtifactForTooling(HarmonyArtifacts.ArtifactType artifactType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (ArtifactCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[191].callStatic(VariantData.class, artifactType, arrayOfCallSite[192].call(this.variantDependency)), ArtifactCollection.class);
  }
  
  public String getVariantType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[193].callGroovyObjectGetProperty(this.combination));
  }
  
  public static ArtifactCollection getArtifacts(HarmonyArtifacts.ArtifactType artifactType, Configuration configuration) {
    Reference reference = new Reference(artifactType);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[194].call(configuration);
    return (ArtifactCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[195].callGetProperty(arrayOfCallSite[196].call(arrayOfCallSite[197].callGetProperty(configuration), new _getArtifacts_closure3(VariantData.class, VariantData.class, reference))), ArtifactCollection.class);
  }
  
  public final class _getArtifacts_closure3 extends Closure implements GeneratedClosure {
    public _getArtifacts_closure3(Object _outerInstance, Object _thisObject, Reference artifactType) {
      super(_outerInstance, _thisObject);
      Reference reference = artifactType;
      this.artifactType = reference;
    }
    
    public Object doCall(ArtifactView.ViewConfiguration viewConfiguration) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(viewConfiguration), arrayOfCallSite[2].callGetProperty(HarmonyArtifacts.class), arrayOfCallSite[3].call(this.artifactType.get()));
    }
    
    public Object call(ArtifactView.ViewConfiguration viewConfiguration) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, viewConfiguration);
    }
    
    @Generated
    public HarmonyArtifacts.ArtifactType getArtifactType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (HarmonyArtifacts.ArtifactType)ShortTypeHandling.castToEnum(this.artifactType.get(), HarmonyArtifacts.ArtifactType.class);
    }
  }
  
  public VariantCombination getCombination() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.combination;
  }
  
  public boolean isFeatureModule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[198].call(arrayOfCallSite[199].callGetProperty(this.project), arrayOfCallSite[200].callGetProperty(BuildConst.class)), arrayOfCallSite[201].callGetProperty(BuildConst.class));
  }
}
