package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.BaseExtension;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.ide.facet.FacetConfigurationKeys;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.DependenciesModel;
import com.huawei.ohos.zbuild.model.HarmonyProject;
import com.huawei.ohos.zbuild.model.LibraryModel;
import com.huawei.ohos.zbuild.model.SourceSetsProvider;
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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ArtifactCollection;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.artifacts.component.ModuleComponentIdentifier;
import org.gradle.api.artifacts.component.ProjectComponentIdentifier;
import org.gradle.api.artifacts.result.ResolvedArtifactResult;
import org.gradle.tooling.provider.model.ToolingModelBuilder;

public class HarmonyToolingModelBuilder implements ToolingModelBuilder, GroovyObject {
  private static final HMLogger HM_LOG;
  
  @Nonnull
  protected final VariantManager variantManager;
  
  @Nonnull
  protected final BaseExtension extension;
  
  static {
    Object object = $getCallSiteArray()[182].call(HMLogger.class, HarmonyToolingModelBuilder.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public HarmonyToolingModelBuilder(@Nonnull VariantManager variantManager, @Nonnull BaseExtension extension) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantManager variantManager1 = variantManager;
    this.variantManager = (VariantManager)ScriptBytecodeAdapter.castToType(variantManager1, VariantManager.class);
    BaseExtension baseExtension = extension;
    this.extension = (BaseExtension)ScriptBytecodeAdapter.castToType(baseExtension, BaseExtension.class);
  }
  
  public boolean canBuild(String modelName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ScriptBytecodeAdapter.compareEqual(modelName, arrayOfCallSite[0].call(HarmonyProject.class));
  }
  
  public Object buildAll(@Nonnull String modelName, @Nonnull Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (canBuild(modelName))
        return arrayOfCallSite[3].callCurrent(this, project); 
      return null;
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].callCurrent(this, modelName)))
      return arrayOfCallSite[2].callCurrent(this, project); 
    return null;
  }
  
  public Object buildHarmonyProject(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String projectName = ShortTypeHandling.castToString(arrayOfCallSite[4].callGetProperty(project));
    List bootClasspath = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(ArrayList.class), List.class);
    List variantDataList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(this.variantManager), List.class);
    Map mainVariantModels = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(HashMap.class), Map.class);
    Map extraOhosTestVariantModels = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(HashMap.class), Map.class);
    Map extraUnitTestVariantModels = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(HashMap.class), Map.class);
    List variantNames = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].callConstructor(ArrayList.class), List.class);
    VariantData variantData;
    Iterator iterator;
    for (variantData = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(variantDataList), Iterator.class); iterator.hasNext(); ) {
      variantData = (VariantData)ScriptBytecodeAdapter.castToType(iterator.next(), VariantData.class);
      Object object = arrayOfCallSite[12].callGroovyObjectGetProperty(variantData);
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[13].callGetProperty(VariantModel.class))) {
        arrayOfCallSite[14].call(mainVariantModels, arrayOfCallSite[15].callGroovyObjectGetProperty(variantData), arrayOfCallSite[16].callCurrent(this, variantData, project));
        arrayOfCallSite[17].call(variantNames, arrayOfCallSite[18].callGroovyObjectGetProperty(variantData));
        continue;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[19].callGetProperty(VariantModel.class))) {
        arrayOfCallSite[20].call(extraOhosTestVariantModels, arrayOfCallSite[21].callGroovyObjectGetProperty(variantData), arrayOfCallSite[22].callCurrent(this, variantData, project));
        continue;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[23].callGetProperty(VariantModel.class))) {
        arrayOfCallSite[24].call(extraUnitTestVariantModels, arrayOfCallSite[25].callGroovyObjectGetProperty(variantData), arrayOfCallSite[26].callCurrent(this, variantData, project));
        continue;
      } 
      arrayOfCallSite[27].call(HM_LOG, arrayOfCallSite[28].call(String.class, arrayOfCallSite[29].callGetProperty(Locale.class), "Error variantType!"));
    } 
    DefaultConfigModelImpl defaultConfig = (DefaultConfigModelImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].call(DefaultConfigModelImpl.class, arrayOfCallSite[31].call(this.extension), arrayOfCallSite[32].callConstructor(SourceSetsProviderImpl.class, arrayOfCallSite[33].call(arrayOfCallSite[34].call(this.variantManager), arrayOfCallSite[35].callGetProperty(OhosSourceSet.class))), arrayOfCallSite[36].callConstructor(SourceSetsProviderImpl.class, arrayOfCallSite[37].call(arrayOfCallSite[38].call(this.variantManager), arrayOfCallSite[39].callGetProperty(OhosSourceSet.class))), arrayOfCallSite[40].callConstructor(SourceSetsProviderImpl.class, arrayOfCallSite[41].call(arrayOfCallSite[42].call(this.variantManager), arrayOfCallSite[43].callGetProperty(OhosSourceSet.class)))), DefaultConfigModelImpl.class);
    Reference buildTypes = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[44].callConstructor(HashMap.class), Map.class));
    Reference variantFlavors = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].callConstructor(HashMap.class), Map.class));
    arrayOfCallSite[46].call(arrayOfCallSite[47].call(this.variantManager), new _buildHarmonyProject_closure1(this, this, buildTypes));
    arrayOfCallSite[48].call(arrayOfCallSite[49].call(this.variantManager), new _buildHarmonyProject_closure2(this, this, variantFlavors));
    arrayOfCallSite[50].call(Collections.class, variantNames, arrayOfCallSite[51].call(Comparator.class));
    String defaultVariantName = ShortTypeHandling.castToString(arrayOfCallSite[52].call(variantNames, Integer.valueOf(0)));
    List extraExcludeFolders = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callStatic(HarmonyToolingModelBuilder.class, project), List.class);
    return arrayOfCallSite[54].callConstructor(DefaultHarmonyProject.class, ArrayUtil.createArray(projectName, bootClasspath, defaultConfig, mainVariantModels, extraOhosTestVariantModels, extraUnitTestVariantModels, variantNames, buildTypes.get(), variantFlavors.get(), defaultVariantName, arrayOfCallSite[55].call(project), arrayOfCallSite[56].call(this.extension), extraExcludeFolders));
  }
  
  public final class _buildHarmonyProject_closure1 extends Closure implements GeneratedClosure {
    public _buildHarmonyProject_closure1(Object _outerInstance, Object _thisObject, Reference buildTypes) {
      super(_outerInstance, _thisObject);
      Reference reference = buildTypes;
      this.buildTypes = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      BuildTypeImpl buildType = (BuildTypeImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(BuildTypeImpl.class, arrayOfCallSite[1].call(it)), BuildTypeImpl.class);
      SourceSetsProvider sourceSetsProvider = (SourceSetsProvider)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].call(it)), SourceSetsProvider.class);
      return arrayOfCallSite[6].call(this.buildTypes.get(), arrayOfCallSite[7].callGetProperty(it), arrayOfCallSite[8].callConstructor(BuildTypeContainerImpl.class, buildType, arrayOfCallSite[9].callConstructor(SourceSetsProviderImpl.class, sourceSetsProvider)));
    }
    
    @Generated
    public Map getBuildTypes() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.buildTypes.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _buildHarmonyProject_closure2 extends Closure implements GeneratedClosure {
    public _buildHarmonyProject_closure2(Object _outerInstance, Object _thisObject, Reference variantFlavors) {
      super(_outerInstance, _thisObject);
      Reference reference = variantFlavors;
      this.variantFlavors = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      VariantFlavorImpl variantFlavorImpl = (VariantFlavorImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(VariantFlavorImpl.class, arrayOfCallSite[1].call(it)), VariantFlavorImpl.class);
      SourceSetsProvider sourceSetsProvider = (SourceSetsProvider)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].call(it)), SourceSetsProvider.class);
      return arrayOfCallSite[6].call(this.variantFlavors.get(), arrayOfCallSite[7].callGetProperty(it), arrayOfCallSite[8].callConstructor(VariantFlavorContainerImpl.class, variantFlavorImpl, arrayOfCallSite[9].callConstructor(SourceSetsProviderImpl.class, sourceSetsProvider)));
    }
    
    @Generated
    public Map getVariantFlavors() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.variantFlavors.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private VariantModelImpl createVariant(VariantData variant, Object project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String name = ShortTypeHandling.castToString(arrayOfCallSite[57].call(variant));
    String buildTypeName = ShortTypeHandling.castToString(arrayOfCallSite[58].call(arrayOfCallSite[59].call(variant)));
    List variantFlavorNames = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].callCurrent(this, arrayOfCallSite[61].call(variant)), List.class);
    HarmonyArtifactModelImpl harmonyArtifactModel = (HarmonyArtifactModelImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].callCurrent(this, variant, project), HarmonyArtifactModelImpl.class);
    VariantModelImpl modelImpl = (VariantModelImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].callConstructor(VariantModelImpl.class, ArrayUtil.createArray(name, harmonyArtifactModel, buildTypeName, variantFlavorNames, arrayOfCallSite[64].call(variant), arrayOfCallSite[65].callCurrent(this, variant, project))), VariantModelImpl.class);
    return modelImpl;
  }
  
  private Map<String, String> createVariantFacetConfigurationMap(VariantData variantData, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map<String, String> variantFacetConfigurationMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[66].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[67].call(variantFacetConfigurationMap, arrayOfCallSite[68].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[69].call(arrayOfCallSite[70].call(variantData)));
    arrayOfCallSite[71].call(variantFacetConfigurationMap, arrayOfCallSite[72].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[73].call(arrayOfCallSite[74].call(variantData)));
    arrayOfCallSite[75].call(variantFacetConfigurationMap, arrayOfCallSite[76].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[77].call(arrayOfCallSite[78].call(arrayOfCallSite[79].call(variantData))));
    arrayOfCallSite[80].call(variantFacetConfigurationMap, arrayOfCallSite[81].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[82].call(variantData, "generate", "jsManifest"));
    arrayOfCallSite[83].call(variantFacetConfigurationMap, arrayOfCallSite[84].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[85].call(arrayOfCallSite[86].call(variantData)));
    arrayOfCallSite[87].call(variantFacetConfigurationMap, arrayOfCallSite[88].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[89].call(arrayOfCallSite[90].call(variantData)));
    arrayOfCallSite[91].call(variantFacetConfigurationMap, arrayOfCallSite[92].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[93].call(arrayOfCallSite[94].call(variantData)));
    arrayOfCallSite[95].call(variantFacetConfigurationMap, arrayOfCallSite[96].callGetProperty(FacetConfigurationKeys.class), arrayOfCallSite[97].call(arrayOfCallSite[98].call(variantData)));
    arrayOfCallSite[99]
      .call(variantFacetConfigurationMap, arrayOfCallSite[100].callGetProperty(FacetConfigurationKeys.class), ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[101].callGetProperty(arrayOfCallSite[102].callGetProperty(project)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[103].callGetProperty(arrayOfCallSite[104].callGetProperty(project))))) ? "true" : "false");
    return variantFacetConfigurationMap;
  }
  
  private HarmonyArtifactModelImpl createHarmonyArtifact(VariantData variant, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String name = ShortTypeHandling.castToString(arrayOfCallSite[105].call(arrayOfCallSite[106].call(arrayOfCallSite[107].callGetProperty(project), "-"), arrayOfCallSite[108].callGroovyObjectGetProperty(variant)));
    List moduleLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[109].callConstructor(ArrayList.class), List.class);
    List javaLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[110].callConstructor(ArrayList.class), List.class);
    List harmonyLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[111].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[112].callCurrent(this, ArrayUtil.createArray(variant, project, harmonyLibraries, javaLibraries, moduleLibraries, arrayOfCallSite[113].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    arrayOfCallSite[114].callCurrent(this, ArrayUtil.createArray(variant, project, harmonyLibraries, javaLibraries, moduleLibraries, arrayOfCallSite[115].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    DependenciesModel dependencies = (DependenciesModel)ScriptBytecodeAdapter.castToType(arrayOfCallSite[116].callConstructor(DependenciesModelImpl.class, harmonyLibraries, javaLibraries, moduleLibraries), DependenciesModel.class);
    SourceSetsProvider variantMainSourceSetsProvider = (SourceSetsProvider)ScriptBytecodeAdapter.castToType(arrayOfCallSite[117].call(arrayOfCallSite[118].call(this.variantManager), arrayOfCallSite[119].callGroovyObjectGetProperty(variant)), SourceSetsProvider.class);
    Set generatedSourceFolders = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[120].callCurrent(this, project, variant), Set.class);
    Set generatedResourceFolders = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[121].callCurrent(this, project, variant), Set.class);
    File outputFolders = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[122].callCurrent(this, project, variant), File.class);
    HarmonyArtifactModelImpl harmonyArtifactModel = (HarmonyArtifactModelImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[123].callConstructor(HarmonyArtifactModelImpl.class, ArrayUtil.createArray(name, dependencies, arrayOfCallSite[124].callConstructor(SourceSetsProviderImpl.class, variantMainSourceSetsProvider), generatedSourceFolders, generatedResourceFolders, arrayOfCallSite[125].call(variant, "assemble", ""), arrayOfCallSite[126].call(variant, "generate", "resources"), outputFolders)), HarmonyArtifactModelImpl.class);
    return harmonyArtifactModel;
  }
  
  private File computeOutputFolders(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[127].call(variantData), PathInfo.class);
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[128].call(project, arrayOfCallSite[129].call(pathInfo, arrayOfCallSite[130].callGroovyObjectGetProperty(variantData))), File.class);
  }
  
  private List<String> getFlavorNames(String variantName) {
    Reference reference1 = new Reference(variantName);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference variantFlavorNames = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[131].callConstructor(ArrayList.class), List.class));
    Map variantFlavorMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].call(this.variantManager), Map.class);
    arrayOfCallSite[133].call(arrayOfCallSite[134].call(variantFlavorMap), new _getFlavorNames_closure3(this, this, reference1, variantFlavorNames));
    return (List<String>)variantFlavorNames.get();
  }
  
  public final class _getFlavorNames_closure3 extends Closure implements GeneratedClosure {
    public _getFlavorNames_closure3(Object _outerInstance, Object _thisObject, Reference variantName, Reference variantFlavorNames) {
      super(_outerInstance, _thisObject);
      Reference reference1 = variantName;
      this.variantName = reference1;
      Reference reference2 = variantFlavorNames;
      this.variantFlavorNames = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.variantName.get(), it)) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(this.variantName.get(), arrayOfCallSite[2].call(it)))))
        return arrayOfCallSite[3].call(this.variantFlavorNames.get(), it); 
      return null;
    }
    
    @Generated
    public String getVariantName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.variantName.get());
    }
    
    @Generated
    public List getVariantFlavorNames() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.variantFlavorNames.get(), List.class);
    }
  }
  
  private Set<File> computeGenSourceFolders(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set<File> sourceFolders = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[135].callConstructor(HashSet.class), Set.class);
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[136].call(variantData), PathInfo.class);
    arrayOfCallSite[137].call(sourceFolders, arrayOfCallSite[138].call(project, arrayOfCallSite[139].call(pathInfo)));
    arrayOfCallSite[140].call(sourceFolders, arrayOfCallSite[141].call(project, arrayOfCallSite[142].call(pathInfo)));
    arrayOfCallSite[143].call(sourceFolders, arrayOfCallSite[144].call(project, arrayOfCallSite[145].call(pathInfo)));
    return sourceFolders;
  }
  
  private Set<File> computeGenResourceFolders(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set<File> resourceFile = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[146].callConstructor(HashSet.class), Set.class);
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[147].call(variantData), PathInfo.class);
    arrayOfCallSite[148].call(resourceFile, arrayOfCallSite[149].call(project, arrayOfCallSite[150].call(pathInfo)));
    return resourceFile;
  }
  
  private void fillLibraries(VariantData variantData, Project project, ArrayList harmonyLibraryModels, ArrayList javaLibraryModels, ArrayList moduleLibraryModels, HarmonyArtifacts.ArtifactType artifactType) {
    Reference reference1 = new Reference(project), reference2 = new Reference(harmonyLibraryModels), reference3 = new Reference(javaLibraryModels), reference4 = new Reference(moduleLibraryModels), reference5 = new Reference(artifactType);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ArtifactCollection artifactCollection = (ArtifactCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[151].call(variantData, reference5.get()), ArtifactCollection.class);
    arrayOfCallSite[152].call(artifactCollection, new _fillLibraries_closure4(this, this, reference5, reference2, reference3, reference1, reference4));
  }
  
  public final class _fillLibraries_closure4 extends Closure implements GeneratedClosure {
    public _fillLibraries_closure4(Object _outerInstance, Object _thisObject, Reference artifactType, Reference harmonyLibraryModels, Reference javaLibraryModels, Reference project, Reference moduleLibraryModels) {
      super(_outerInstance, _thisObject);
      Reference reference1 = artifactType;
      this.artifactType = reference1;
      Reference reference2 = harmonyLibraryModels;
      this.harmonyLibraryModels = reference2;
      Reference reference3 = javaLibraryModels;
      this.javaLibraryModels = reference3;
      Reference reference4 = project;
      this.project = reference4;
      Reference reference5 = moduleLibraryModels;
      this.moduleLibraryModels = reference5;
    }
    
    public Object doCall(ResolvedArtifactResult resolvedArtifact) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ComponentIdentifier componentIdentifier = (ComponentIdentifier)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(resolvedArtifact)), ComponentIdentifier.class);
      String displayName = null;
      String libraryType = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(this.artifactType.get(), arrayOfCallSite[2].callGetProperty(HarmonyArtifacts.ArtifactType.class)) ? arrayOfCallSite[3].callGetProperty(LibraryModel.class) : arrayOfCallSite[4].callGetProperty(LibraryModel.class));
      List libraryModels = ScriptBytecodeAdapter.compareEqual(this.artifactType.get(), arrayOfCallSite[5].callGetProperty(HarmonyArtifacts.ArtifactType.class)) ? (ArrayList)ScriptBytecodeAdapter.castToType(this.harmonyLibraryModels.get(), ArrayList.class) : (ArrayList)ScriptBytecodeAdapter.castToType(this.javaLibraryModels.get(), ArrayList.class);
      if (componentIdentifier instanceof ProjectComponentIdentifier) {
        ProjectComponentIdentifier projectIdentifier = (ProjectComponentIdentifier)ScriptBytecodeAdapter.castToType(componentIdentifier, ProjectComponentIdentifier.class);
        Object object1 = arrayOfCallSite[6].callGetProperty(projectIdentifier);
        displayName = ShortTypeHandling.castToString(object1);
        Object object2 = arrayOfCallSite[7].callGetProperty(LibraryModel.class);
        libraryType = ShortTypeHandling.castToString(object2);
        return arrayOfCallSite[8].callCurrent((GroovyObject)this, ArrayUtil.createArray(this.project.get(), resolvedArtifact, displayName, libraryType, this.moduleLibraryModels.get()));
      } 
      if (componentIdentifier instanceof ModuleComponentIdentifier) {
        ModuleComponentIdentifier module = (ModuleComponentIdentifier)ScriptBytecodeAdapter.castToType(componentIdentifier, ModuleComponentIdentifier.class);
        Object object = arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].callGetProperty(module), "-"), arrayOfCallSite[12].callGetProperty(module));
        displayName = ShortTypeHandling.castToString(object);
        return arrayOfCallSite[13].callCurrent((GroovyObject)this, ArrayUtil.createArray(this.project.get(), resolvedArtifact, displayName, libraryType, libraryModels));
      } 
      if (componentIdentifier instanceof org.gradle.internal.component.local.model.OpaqueComponentArtifactIdentifier) {
        Object object = arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].callGetProperty(resolvedArtifact));
        displayName = ShortTypeHandling.castToString(object);
        return arrayOfCallSite[16].callCurrent((GroovyObject)this, ArrayUtil.createArray(this.project.get(), resolvedArtifact, displayName, libraryType, libraryModels));
      } 
      return null;
    }
    
    public Object call(ResolvedArtifactResult resolvedArtifact) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[17].callCurrent((GroovyObject)this, resolvedArtifact);
    }
    
    @Generated
    public HarmonyArtifacts.ArtifactType getArtifactType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (HarmonyArtifacts.ArtifactType)ShortTypeHandling.castToEnum(this.artifactType.get(), HarmonyArtifacts.ArtifactType.class);
    }
    
    @Generated
    public ArrayList getHarmonyLibraryModels() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ArrayList)ScriptBytecodeAdapter.castToType(this.harmonyLibraryModels.get(), ArrayList.class);
    }
    
    @Generated
    public ArrayList getJavaLibraryModels() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ArrayList)ScriptBytecodeAdapter.castToType(this.javaLibraryModels.get(), ArrayList.class);
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public ArrayList getModuleLibraryModels() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ArrayList)ScriptBytecodeAdapter.castToType(this.moduleLibraryModels.get(), ArrayList.class);
    }
  }
  
  private void addLibraryModels(Project project, ResolvedArtifactResult resolvedArtifactResult, String displayName, String libraryType, ArrayList libraryModels) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[153].call(resolvedArtifactResult), File.class);
    List localJars = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[154].callConstructor(ArrayList.class), List.class);
    LibraryModel libraryModel = null;
    String str = libraryType;
    if (ScriptBytecodeAdapter.isCase(str, arrayOfCallSite[155].callGetProperty(LibraryModel.class))) {
      Object object = arrayOfCallSite[156].callConstructor(HarmonyLibraryModelImpl.class, ArrayUtil.createArray(libraryType, displayName, arrayOfCallSite[157].callGetProperty(project), file, localJars));
      libraryModel = (LibraryModel)ScriptBytecodeAdapter.castToType(object, LibraryModel.class);
    } else if (ScriptBytecodeAdapter.isCase(str, arrayOfCallSite[158].callGetProperty(LibraryModel.class))) {
      Object object = arrayOfCallSite[159].callConstructor($get$$class$com$huawei$ohos$build$ide$JavaLibraryModelImpl(), ArrayUtil.createArray(libraryType, displayName, arrayOfCallSite[160].callGetProperty(project), file, arrayOfCallSite[161].callConstructor(ArrayList.class)));
      libraryModel = (LibraryModel)ScriptBytecodeAdapter.castToType(object, LibraryModel.class);
    } else if (ScriptBytecodeAdapter.isCase(str, arrayOfCallSite[162].callGetProperty(LibraryModel.class))) {
      Object object = arrayOfCallSite[163].callConstructor(ModuleLibraryModelImpl.class, libraryType, displayName, arrayOfCallSite[164].callGetProperty(project), arrayOfCallSite[165].callGetProperty(arrayOfCallSite[166].callGetProperty(resolvedArtifactResult)));
      libraryModel = (LibraryModel)ScriptBytecodeAdapter.castToType(object, LibraryModel.class);
    } else {
      arrayOfCallSite[167].call(HM_LOG, "Other libraryType");
    } 
    arrayOfCallSite[168].call(libraryModels, libraryModel);
  }
  
  private static List<File> populateExtraExcludeFolders(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<File> extraExcludeFiles = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[169].callConstructor(ArrayList.class), List.class);
    File cxxDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[170].call(arrayOfCallSite[171].call(Paths.class, arrayOfCallSite[172].callGetProperty(arrayOfCallSite[173].callGetProperty(project)), arrayOfCallSite[174].callGetProperty(PathConst.class))), File.class);
    File previewDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[175].call(arrayOfCallSite[176].call(Paths.class, arrayOfCallSite[177].callGetProperty(arrayOfCallSite[178].callGetProperty(project)), arrayOfCallSite[179].callGetProperty(PathConst.class))), File.class);
    arrayOfCallSite[180].call(extraExcludeFiles, cxxDir);
    arrayOfCallSite[181].call(extraExcludeFiles, previewDir);
    return extraExcludeFiles;
  }
}
