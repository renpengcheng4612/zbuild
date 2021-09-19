package com.huawei.ohos.build.tasks.manager;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.dsl.CmakeThread;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSetCreator;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.model.variant.VariantCombination;
import com.huawei.ohos.build.model.variant.VariantCombinator;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import com.huawei.ohos.build.tasks.factory.TaskManager;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.xml.bind.ValidationException;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class VariantManager implements VariantModel, GroovyObject {
  @NonNull
  private final Map<String, SigningConfig> signingConfigs;
  
  @NonNull
  private final Map<String, BuildType> buildTypes;
  
  @Nonnull
  private List<VariantData> variantDatas;
  
  @Nonnull
  private final Map<String, OhosSourceSet> sourceSets;
  
  @Nonnull
  private final Map<String, VariantFlavor> variantFlavors;
  
  @NonNull
  private final TaskManager taskManager;
  
  @Nonnull
  private final DependencyManager dependencyManager;
  
  @Nonnull
  private OhosSourceSetCreator ohosSourceSetCreator;
  
  @Nonnull
  private static final HMLogger HM_LOGGER;
  
  static {
    Object object = $getCallSiteArray()[118].call(HMLogger.class, VariantManager.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public VariantManager(TaskManager taskManager, DependencyManager dependencyManager, OhosSourceSetCreator sourceSetCreator) {
    MetaClass metaClass = $getStaticMetaClass();
    TaskManager taskManager1 = taskManager;
    this.taskManager = (TaskManager)ScriptBytecodeAdapter.castToType(taskManager1, TaskManager.class);
    DependencyManager dependencyManager1 = dependencyManager;
    this.dependencyManager = (DependencyManager)ScriptBytecodeAdapter.castToType(dependencyManager1, DependencyManager.class);
    OhosSourceSetCreator ohosSourceSetCreator = sourceSetCreator;
    this.ohosSourceSetCreator = (OhosSourceSetCreator)ScriptBytecodeAdapter.castToType(ohosSourceSetCreator, OhosSourceSetCreator.class);
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.signingConfigs = (Map<String, SigningConfig>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HashMap.class);
    this.buildTypes = (Map<String, BuildType>)ScriptBytecodeAdapter.castToType(object2, Map.class);
    Object object3 = arrayOfCallSite[2].callConstructor(HashMap.class);
    this.sourceSets = (Map<String, OhosSourceSet>)ScriptBytecodeAdapter.castToType(object3, Map.class);
    Object object4 = arrayOfCallSite[3].callConstructor(HashMap.class);
    this.variantFlavors = (Map<String, VariantFlavor>)ScriptBytecodeAdapter.castToType(object4, Map.class);
    Object object5 = arrayOfCallSite[4].callConstructor(ArrayList.class);
    this.variantDatas = (List<VariantData>)ScriptBytecodeAdapter.castToType(object5, List.class);
  }
  
  public Map<String, SigningConfig> getSigningConfigs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signingConfigs;
  }
  
  public Map<String, BuildType> getBuildTypes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.buildTypes;
  }
  
  public List<VariantData> getVariantDatas() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantDatas;
  }
  
  @Nonnull
  public Map<String, OhosSourceSet> getSourceSets() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Map<String, OhosSourceSet>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(this.ohosSourceSetCreator), Map.class);
  }
  
  @Nonnull
  public Map<String, VariantFlavor> getVariantFlavors() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantFlavors;
  }
  
  public VariantData getVariantData(BuildType buildType) {
    Reference reference = new Reference(buildType);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(this.variantDatas), new _getVariantData_closure1(this, this, reference)))), VariantData.class);
  }
  
  public final class _getVariantData_closure1 extends Closure implements GeneratedClosure {
    public _getVariantData_closure1(Object _outerInstance, Object _thisObject, Reference buildType) {
      super(_outerInstance, _thisObject);
      Reference reference = buildType;
      this.buildType = reference;
    }
    
    public Object doCall(Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return Boolean.valueOf(ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(v)), arrayOfCallSite[2].callGetProperty(this.buildType.get())));
    }
    
    @Generated
    public BuildType getBuildType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (BuildType)ScriptBytecodeAdapter.castToType(this.buildType.get(), BuildType.class);
    }
  }
  
  public List<VariantData> getMainVariants(BuildType buildType) {
    Reference reference = new Reference(buildType);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List<VariantData>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(this.variantDatas), new _getMainVariants_closure2(this, this, reference)), arrayOfCallSite[13].call(Collectors.class)), List.class);
  }
  
  public final class _getMainVariants_closure2 extends Closure implements GeneratedClosure {
    public _getMainVariants_closure2(Object _outerInstance, Object _thisObject, Reference buildType) {
      super(_outerInstance, _thisObject);
      Reference reference = buildType;
      this.buildType = reference;
    }
    
    public Object doCall(Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? Boolean.valueOf((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(v)), arrayOfCallSite[7].callGetProperty(this.buildType.get())) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[8].callGetProperty(v), arrayOfCallSite[9].callGetProperty(VariantModel.class)))) : Boolean.valueOf((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(v)), arrayOfCallSite[2].callGetProperty(this.buildType.get())) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGetProperty(v), arrayOfCallSite[4].callGetProperty(VariantModel.class))));
    }
    
    @Generated
    public BuildType getBuildType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (BuildType)ScriptBytecodeAdapter.castToType(this.buildType.get(), BuildType.class);
    }
  }
  
  public void addSigningConfig(@NonNull SigningConfig signingConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].call(this.signingConfigs, arrayOfCallSite[15].call(signingConfig), signingConfig);
  }
  
  public void addBuildType(@NonNull BuildType buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].call(this.buildTypes, arrayOfCallSite[17].call(buildType), buildType);
  }
  
  public void addVariantData(@Nonnull VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(this.variantDatas, variantData);
  }
  
  public void addSourceSet(@Nonnull OhosSourceSet sourceSet) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[19].call(this.sourceSets, arrayOfCallSite[20].call(sourceSet), sourceSet);
  }
  
  public void addProductFlavor(@Nonnull VariantFlavor variantFlavor) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[21].call(this.variantFlavors, arrayOfCallSite[22].call(variantFlavor), variantFlavor);
  }
  
  public void createHarmonyTasks(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean isLiteDevice = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[23].callStatic(VariantManager.class, project, Boolean.valueOf(true)));
    boolean isRouteDevice = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].callStatic(VariantManager.class, project, Boolean.valueOf(false)));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      VariantData variantData1;
      Iterator iterator1;
      for (variantData1 = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].call(this.variantDatas), Iterator.class); iterator1.hasNext(); ) {
        variantData1 = (VariantData)ScriptBytecodeAdapter.castToType(iterator1.next(), VariantData.class);
        if ((((isLiteDevice || isRouteDevice)) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[36].call(arrayOfCallSite[37].call(variantData1, arrayOfCallSite[38].callGetProperty(HarmonyArtifacts.ArtifactType.class))), Integer.valueOf(0)))) {
          arrayOfCallSite[39].call(HM_LOGGER, arrayOfCallSite[40].callConstructor(ValidationException.class, "The har module is not supported in the LiteDevice or the RouterDevice."));
          continue;
        } 
        if (((!isLiteDevice) && (!isRouteDevice))) {
          arrayOfCallSite[41].call(this.taskManager, variantData1);
          arrayOfCallSite[42].call(this.taskManager, variantData1);
          continue;
        } 
        arrayOfCallSite[43].call(this.taskManager, variantData1);
        arrayOfCallSite[44].call(this.taskManager, variantData1);
      } 
      return;
    } 
    VariantData variantData;
    Iterator iterator;
    for (variantData = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].call(this.variantDatas), Iterator.class); iterator.hasNext(); ) {
      variantData = (VariantData)ScriptBytecodeAdapter.castToType(iterator.next(), VariantData.class);
      if ((((isLiteDevice || isRouteDevice)) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[26].call(arrayOfCallSite[27].call(variantData, arrayOfCallSite[28].callGetProperty(HarmonyArtifacts.ArtifactType.class))), Integer.valueOf(0)))) {
        arrayOfCallSite[29].call(HM_LOGGER, arrayOfCallSite[30].callConstructor(ValidationException.class, "The har module is not supported in the LiteDevice or the RouterDevice."));
        continue;
      } 
      if (((!isLiteDevice) && (!isRouteDevice))) {
        arrayOfCallSite[31].call(this.taskManager, variantData);
        arrayOfCallSite[32].call(this.taskManager, variantData);
        continue;
      } 
      arrayOfCallSite[33].call(this.taskManager, variantData);
      arrayOfCallSite[34].call(this.taskManager, variantData);
    } 
  }
  
  public static boolean isLiteDeviceOrRouterDevice(Project project, boolean isLiteCheck) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigInfo configInfo = null;
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[45].call(arrayOfCallSite[46].call(project)), Integer.valueOf(1))) {
      Project subProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call(project)), Integer.valueOf(0)), Project.class);
      Object object = arrayOfCallSite[50].call(arrayOfCallSite[51].call(GlobalDataManager.class, subProject), subProject);
      configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
    } else {
      Object object = arrayOfCallSite[52].call(arrayOfCallSite[53].call(GlobalDataManager.class, project), project);
      configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
    } 
    return isLiteCheck ? (
      (ScriptBytecodeAdapter.compareNotEqual(configInfo, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(configInfo)))) : (
      (ScriptBytecodeAdapter.compareNotEqual(configInfo, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(configInfo))));
  }
  
  public Object populateVariantData(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List flavors = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(arrayOfCallSite[57].callGetProperty(arrayOfCallSite[58].callGetProperty(project))), List.class);
    List bts = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].call(arrayOfCallSite[60].call(this.buildTypes)), List.class);
    Set flavorDimensions = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[61].callGetProperty(arrayOfCallSite[62].callGetProperty(project)), Set.class);
    Action filterAction = (Action)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].callGetProperty(arrayOfCallSite[64].callGetProperty(project)), Action.class);
    List combinations = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[65].call(arrayOfCallSite[66].callConstructor(VariantCombinator.class, ArrayUtil.createArray(bts, flavors, flavorDimensions, this.ohosSourceSetCreator, arrayOfCallSite[67].callStatic(VariantManager.class, project, Boolean.valueOf(true)))), filterAction), List.class);
    VariantCombination comb;
    Iterator iterator;
    for (comb = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].call(combinations), Iterator.class); iterator.hasNext(); ) {
      comb = (VariantCombination)ScriptBytecodeAdapter.castToType(iterator.next(), VariantCombination.class);
      VariantDependency variantDependency = (VariantDependency)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].callCurrent(this, comb, project), VariantDependency.class);
      VariantData variantData = (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[70].callConstructor(VariantData.class, comb, variantDependency, project), VariantData.class);
      arrayOfCallSite[71].callCurrent(this, variantData);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].callGetProperty(arrayOfCallSite[73].callGroovyObjectGetProperty(variantData)))) {
        ExternalNativeBuild nativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(arrayOfCallSite[74].callGetProperty(arrayOfCallSite[75].callGetProperty(project)), ExternalNativeBuild.class);
        if ((ScriptBytecodeAdapter.compareNotEqual(nativeBuild, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[76].call(nativeBuild))))
          arrayOfCallSite[77].callCurrent(this, project, variantData, nativeBuild); 
      } 
    } 
    return arrayOfCallSite[78].callCurrent(this, project, arrayOfCallSite[79].callCurrent(this, arrayOfCallSite[80].call(this.buildTypes, arrayOfCallSite[81].callGetProperty(BuildConst.class))));
  }
  
  private void configProjectModuleType(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(project, arrayOfCallSite[90].callGetProperty(project)) && 
        ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[91].callGroovyObjectGetProperty(variantData), arrayOfCallSite[92].callGetProperty(VariantModel.class))))
        arrayOfCallSite[93].call(arrayOfCallSite[94].callGetProperty(project), arrayOfCallSite[95].callGetProperty(BuildConst.class), arrayOfCallSite[96].callGetProperty(arrayOfCallSite[97].callGroovyObjectGetProperty(variantData))); 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(project, arrayOfCallSite[82].callGetProperty(project)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[83].callGroovyObjectGetProperty(variantData), arrayOfCallSite[84].callGetProperty(VariantModel.class))))
      arrayOfCallSite[85].call(arrayOfCallSite[86].callGetProperty(project), arrayOfCallSite[87].callGetProperty(BuildConst.class), arrayOfCallSite[88].callGetProperty(arrayOfCallSite[89].callGroovyObjectGetProperty(variantData))); 
  }
  
  private void buildCompileCommands(Project project, VariantData variantData, ExternalNativeBuild nativeBuild) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List abiFilters = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[98].call(nativeBuild), List.class);
    String abiFilter = ShortTypeHandling.castToString(arrayOfCallSite[99].call(abiFilters, Integer.valueOf(0)));
    CmakeThread thread = (CmakeThread)ScriptBytecodeAdapter.castToType(arrayOfCallSite[100].callConstructor(CmakeThread.class, abiFilter, project, variantData, Boolean.valueOf(false)), CmakeThread.class);
    arrayOfCallSite[101].call(thread);
  }
  
  private VariantDependency createVariantDependency(VariantCombination comb, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    VariantDependency variantDependency = (VariantDependency)ScriptBytecodeAdapter.castToType(arrayOfCallSite[102].callConstructor(VariantDependency.class, ArrayUtil.createArray(project, arrayOfCallSite[103].call(this.ohosSourceSetCreator, arrayOfCallSite[104].callGroovyObjectGetProperty(comb)), arrayOfCallSite[105].call(project), arrayOfCallSite[106].call(this.ohosSourceSetCreator), comb)), VariantDependency.class);
    List sources = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[107].call(comb), List.class);
    List newSourceSets = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[108].callConstructor(ArrayList.class, sources), List.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[109].callGroovyObjectGetProperty(comb), arrayOfCallSite[110].callGetProperty(VariantModel.class)))
      arrayOfCallSite[111].call(newSourceSets, arrayOfCallSite[112].call(arrayOfCallSite[113].call(this.ohosSourceSetCreator), arrayOfCallSite[114].callGetProperty(OhosSourceSet.class))); 
    OhosSourceSet source;
    Iterator iterator;
    for (source = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[115].call(newSourceSets), Iterator.class); iterator.hasNext(); ) {
      source = (OhosSourceSet)ScriptBytecodeAdapter.castToType(iterator.next(), OhosSourceSet.class);
      arrayOfCallSite[116].call(variantDependency, source);
    } 
    arrayOfCallSite[117].call(variantDependency);
    return variantDependency;
  }
}
