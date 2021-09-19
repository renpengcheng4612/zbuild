package com.huawei.ohos.build.tasks.manager;

import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.transform.HarmonyTypeAttr;
import com.huawei.ohos.build.model.transform.VariantAttr;
import com.huawei.ohos.build.model.transform.VariantFlavorAttr;
import com.huawei.ohos.build.model.variant.VariantCombination;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import com.huawei.ohos.build.plugins.DelegateArchiveTask;
import com.huawei.ohos.build.utils.har.PublishUtil;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.attributes.Bundling;
import org.gradle.api.attributes.Category;
import org.gradle.api.attributes.Usage;
import org.gradle.api.internal.artifacts.dsl.LazyPublishArtifact;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.TaskProvider;

public class VariantDependency implements GroovyObject {
  @Nonnull
  private final Project project;
  
  private OhosSourceSet sourceSet;
  
  private ConfigurationContainer configs;
  
  private Boolean isLibrary;
  
  private VariantCombination variantCombination;
  
  private ObjectFactory objects;
  
  private Configuration compileClasspath;
  
  private Configuration packageClasspath;
  
  private Configuration apiElements;
  
  private Configuration runtimeElements;
  
  private Configuration annotationProcessorClasspath;
  
  private final HarmonyTypeAttr harmonyTypeAttr;
  
  private final Usage apiUsageAttr;
  
  private final Usage runtimeUsageAttr;
  
  private final Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr> variantFlavorAttrMap;
  
  @Nonnull
  private final Set<Configuration> apiConfigs;
  
  @Nonnull
  private final Set<Configuration> runtimeConfigs;
  
  @Nonnull
  private final Set<Configuration> compileConfigs;
  
  @Nonnull
  private final Set<Configuration> implementationConfigs;
  
  @Nonnull
  private final Set<Configuration> annotationProcessorConfigs;
  
  public VariantDependency(Project project, OhosSourceSet sourceSet, ConfigurationContainer configs, Boolean isLibrary, VariantCombination variantCombination) {
    Object object1 = arrayOfCallSite[0].callConstructor(HashSet.class);
    this.apiConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object1, Set.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HashSet.class);
    this.runtimeConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object2, Set.class);
    Object object3 = arrayOfCallSite[2].callConstructor(HashSet.class);
    this.compileConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object3, Set.class);
    Object object4 = arrayOfCallSite[3].callConstructor(HashSet.class);
    this.implementationConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object4, Set.class);
    Object object5 = arrayOfCallSite[4].callConstructor(HashSet.class);
    this.annotationProcessorConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object5, Set.class);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object6 = arrayOfCallSite[5].callGetProperty(project);
    this.objects = (ObjectFactory)ScriptBytecodeAdapter.castToType(object6, ObjectFactory.class);
    OhosSourceSet ohosSourceSet = sourceSet;
    this.sourceSet = (OhosSourceSet)ScriptBytecodeAdapter.castToType(ohosSourceSet, OhosSourceSet.class);
    ConfigurationContainer configurationContainer = configs;
    this.configs = (ConfigurationContainer)ScriptBytecodeAdapter.castToType(configurationContainer, ConfigurationContainer.class);
    Boolean bool = isLibrary;
    this.isLibrary = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
    VariantCombination variantCombination1 = variantCombination;
    this.variantCombination = (VariantCombination)ScriptBytecodeAdapter.castToType(variantCombination1, VariantCombination.class);
    Object object7 = arrayOfCallSite[6].call(this.objects, HarmonyTypeAttr.class, arrayOfCallSite[7].callGetProperty(HarmonyTypeAttr.class));
    this.harmonyTypeAttr = (HarmonyTypeAttr)ScriptBytecodeAdapter.castToType(object7, HarmonyTypeAttr.class);
    Object object8 = arrayOfCallSite[8].call(this.objects, Usage.class, arrayOfCallSite[9].callGetProperty(Usage.class));
    this.apiUsageAttr = (Usage)ScriptBytecodeAdapter.castToType(object8, Usage.class);
    Object object9 = arrayOfCallSite[10].call(this.objects, Usage.class, arrayOfCallSite[11].callGetProperty(Usage.class));
    this.runtimeUsageAttr = (Usage)ScriptBytecodeAdapter.castToType(object9, Usage.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr> map = computeVariantFlavorAttrMap();
      this.variantFlavorAttrMap = (Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr>)ScriptBytecodeAdapter.castToType(map, Map.class);
    } else {
      Object object = arrayOfCallSite[12].callCurrent(this);
      this.variantFlavorAttrMap = (Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr>)ScriptBytecodeAdapter.castToType(object, Map.class);
    } 
    arrayOfCallSite[13].callCurrent(this, sourceSet);
    if ((DefaultTypeTransformation.booleanUnbox(isLibrary) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[14].callGroovyObjectGetProperty(variantCombination), arrayOfCallSite[15].callGetProperty(VariantModel.class)))) {
      arrayOfCallSite[16].callCurrent(this, sourceSet);
      arrayOfCallSite[17]
        
        .callCurrent(this, arrayOfCallSite[18].call(sourceSet), arrayOfCallSite[19].call("Api configuration for Har publish with", arrayOfCallSite[20].call(sourceSet)));
      arrayOfCallSite[21]
        
        .callCurrent(this, arrayOfCallSite[22].call(sourceSet), arrayOfCallSite[23].call("Runtime configuration for Har publish with", arrayOfCallSite[24].call(sourceSet)));
    } 
  }
  
  private void configureArchivesAndComponent(String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    TaskProvider publishArtifactTask = (TaskProvider)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].call(DelegateArchiveTask.class, arrayOfCallSite[26].call(variantName, "HarmonyHar"), arrayOfCallSite[27].call(arrayOfCallSite[28].call("package", arrayOfCallSite[29].call(variantName)), "Har"), "har", this.project), TaskProvider.class);
    PublishArtifact publishArtifact = (PublishArtifact)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callConstructor(LazyPublishArtifact.class, publishArtifactTask), PublishArtifact.class);
    arrayOfCallSite[31].call(PublishUtil.class, publishArtifact, arrayOfCallSite[32].callGetProperty(this.apiElements), this.project);
    arrayOfCallSite[33].call(PublishUtil.class, publishArtifact, arrayOfCallSite[34].callGetProperty(this.runtimeElements), this.project);
  }
  
  public void addSourceSetConfiguration(OhosSourceSet source) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[35].call(this.apiConfigs, arrayOfCallSite[36].call(this.configs, arrayOfCallSite[37].call(source)));
    arrayOfCallSite[38].call(this.compileConfigs, arrayOfCallSite[39].call(this.configs, arrayOfCallSite[40].call(source)));
    arrayOfCallSite[41].call(this.compileConfigs, arrayOfCallSite[42].call(this.configs, arrayOfCallSite[43].call(source)));
    arrayOfCallSite[44].call(this.implementationConfigs, arrayOfCallSite[45].call(this.configs, arrayOfCallSite[46].call(source)));
    arrayOfCallSite[47].call(this.runtimeConfigs, arrayOfCallSite[48].call(this.configs, arrayOfCallSite[49].call(source)));
    arrayOfCallSite[50].call(this.runtimeConfigs, arrayOfCallSite[51].call(this.configs, arrayOfCallSite[52].call(source)));
    arrayOfCallSite[53].call(this.annotationProcessorConfigs, arrayOfCallSite[54].call(this.configs, arrayOfCallSite[55].call(source)));
  }
  
  public void createExtends() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[56].call(this.compileClasspath, this.compileConfigs);
    arrayOfCallSite[57].call(this.packageClasspath, this.runtimeConfigs);
    arrayOfCallSite[58].call(this.annotationProcessorClasspath, this.annotationProcessorConfigs);
    if ((DefaultTypeTransformation.booleanUnbox(this.isLibrary) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[59].callGroovyObjectGetProperty(this.variantCombination), arrayOfCallSite[60].callGetProperty(VariantModel.class)))) {
      arrayOfCallSite[61].call(this.apiElements, this.apiConfigs);
      arrayOfCallSite[62].call(this.runtimeElements, this.packageClasspath);
      Configuration apiPublish = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].call(this.configs, arrayOfCallSite[64].call(this.sourceSet)), Configuration.class);
      Configuration runTimePublish = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[65].call(this.configs, arrayOfCallSite[66].call(this.sourceSet)), Configuration.class);
      arrayOfCallSite[67].call(apiPublish, this.apiConfigs);
      arrayOfCallSite[68].call(runTimePublish, this.packageClasspath);
    } 
  }
  
  @Nonnull
  public Configuration getCompileClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileClasspath;
  }
  
  @Nonnull
  public Configuration getPackageClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageClasspath;
  }
  
  @Nonnull
  public Configuration getAnnotationProcessorClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.annotationProcessorClasspath;
  }
  
  private Configuration initHarPublishConfiguration(String configName, String configDescription) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    HarmonyTypeAttr harmonyTypeAttr = (HarmonyTypeAttr)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].call(this.objects, HarmonyTypeAttr.class, arrayOfCallSite[70].callGetProperty(HarmonyTypeAttr.class)), HarmonyTypeAttr.class);
    Usage apiUsageAttr = (Usage)ScriptBytecodeAdapter.castToType(arrayOfCallSite[71].call(this.objects, Usage.class, arrayOfCallSite[72].callGetProperty(Usage.class)), Usage.class);
    Usage runtimeUsageAttr = (Usage)ScriptBytecodeAdapter.castToType(arrayOfCallSite[73].call(this.objects, Usage.class, arrayOfCallSite[74].callGetProperty(Usage.class)), Usage.class);
    Usage usage = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[75].call(configName, "Runtime")) ? runtimeUsageAttr : apiUsageAttr;
    Bundling bundlingAttr = (Bundling)ScriptBytecodeAdapter.castToType(arrayOfCallSite[76].call(this.objects, Bundling.class, arrayOfCallSite[77].callGetProperty(Bundling.class)), Bundling.class);
    Category categoryAttr = (Category)ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].call(this.objects, Category.class, arrayOfCallSite[79].callGetProperty(Category.class)), Category.class);
    Configuration publishConfig = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].call(this.configs, configName), Configuration.class);
    arrayOfCallSite[81].call(publishConfig, configDescription);
    arrayOfCallSite[82].call(publishConfig, Boolean.valueOf(false));
    arrayOfCallSite[83].call(publishConfig, Boolean.valueOf(false));
    arrayOfCallSite[84].call(publishConfig, Boolean.valueOf(false));
    AttributeContainer attributeContainer = (AttributeContainer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[85].call(publishConfig), AttributeContainer.class);
    arrayOfCallSite[86].call(attributeContainer, arrayOfCallSite[87].callGetProperty(Bundling.class), bundlingAttr);
    arrayOfCallSite[88].call(attributeContainer, arrayOfCallSite[89].callGetProperty(Category.class), categoryAttr);
    arrayOfCallSite[90].call(attributeContainer, arrayOfCallSite[91].callGetProperty(HarmonyTypeAttr.class), harmonyTypeAttr);
    arrayOfCallSite[92].call(attributeContainer, arrayOfCallSite[93].callGetProperty(Usage.class), usage);
    return publishConfig;
  }
  
  public void createResolvedConfiguration(OhosSourceSet source) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object1 = arrayOfCallSite[94].callCurrent(this, arrayOfCallSite[95].call(this.configs, arrayOfCallSite[96].call(source)));
    this.compileClasspath = (Configuration)ScriptBytecodeAdapter.castToType(object1, Configuration.class);
    Object object2 = arrayOfCallSite[97].callCurrent(this, arrayOfCallSite[98].call(this.configs, arrayOfCallSite[99].call(source)));
    this.packageClasspath = (Configuration)ScriptBytecodeAdapter.castToType(object2, Configuration.class);
    Object object3 = arrayOfCallSite[100].callCurrent(this, arrayOfCallSite[101].call(this.configs, arrayOfCallSite[102].call(source)));
    this.annotationProcessorClasspath = (Configuration)ScriptBytecodeAdapter.castToType(object3, Configuration.class);
  }
  
  public Configuration configVariantResolvedConfiguration(Configuration resolvedConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[103].call(resolvedConfig, Boolean.valueOf(true));
    arrayOfCallSite[104].call(resolvedConfig, Boolean.valueOf(false));
    arrayOfCallSite[105].callCurrent(this, resolvedConfig);
    return resolvedConfig;
  }
  
  private void configCommonAttr(Configuration config) {
    Reference reference = new Reference(config);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    VariantAttr variantNameAttr = (VariantAttr)ScriptBytecodeAdapter.castToType(arrayOfCallSite[106].call(this.objects, VariantAttr.class, arrayOfCallSite[107].callGetProperty(arrayOfCallSite[108].callGroovyObjectGetProperty(this.variantCombination))), VariantAttr.class);
    Usage usage = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[109].call(arrayOfCallSite[110].callGetProperty(reference.get()), "Runtime")) ? this.runtimeUsageAttr : this.apiUsageAttr;
    arrayOfCallSite[111].call(reference.get(), Boolean.valueOf(false));
    arrayOfCallSite[112].call(arrayOfCallSite[113].call(reference.get()), arrayOfCallSite[114].callGetProperty(HarmonyTypeAttr.class), this.harmonyTypeAttr);
    arrayOfCallSite[115].call(arrayOfCallSite[116].call(reference.get()), arrayOfCallSite[117].callGetProperty(VariantAttr.class), variantNameAttr);
    arrayOfCallSite[118].call(arrayOfCallSite[119].call(reference.get()), arrayOfCallSite[120].callGetProperty(Usage.class), usage);
    arrayOfCallSite[121].call(this.variantFlavorAttrMap, new _configCommonAttr_closure1(this, this, reference));
  }
  
  public final class _configCommonAttr_closure1 extends Closure implements GeneratedClosure {
    public _configCommonAttr_closure1(Object _outerInstance, Object _thisObject, Reference config) {
      super(_outerInstance, _thisObject);
      Reference reference = config;
      this.config = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].call(this.config.get()), arrayOfCallSite[2].callGetProperty(it), arrayOfCallSite[3].callGetProperty(it));
    }
    
    @Generated
    public Configuration getConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Configuration)ScriptBytecodeAdapter.castToType(this.config.get(), Configuration.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void createConsumedConfiguration(OhosSourceSet source) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object1 = arrayOfCallSite[122].callCurrent(this, arrayOfCallSite[123].call(this.configs, arrayOfCallSite[124].call(source)));
    this.apiElements = (Configuration)ScriptBytecodeAdapter.castToType(object1, Configuration.class);
    Object object2 = arrayOfCallSite[125].callCurrent(this, arrayOfCallSite[126].call(this.configs, arrayOfCallSite[127].call(source)));
    this.runtimeElements = (Configuration)ScriptBytecodeAdapter.castToType(object2, Configuration.class);
    arrayOfCallSite[128].callCurrent(this, arrayOfCallSite[129].callGroovyObjectGetProperty(source));
  }
  
  public Configuration configVariantConsumedConfiguration(Configuration consumedConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[130].call(consumedConfig, Boolean.valueOf(false));
    arrayOfCallSite[131].call(consumedConfig, Boolean.valueOf(true));
    arrayOfCallSite[132].callCurrent(this, consumedConfig);
    return consumedConfig;
  }
  
  private Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr> computeVariantFlavorAttrMap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[133].callGroovyObjectGetProperty(this.variantCombination), null))
      return (Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[134].callConstructor(HashMap.class), Map.class); 
    Map<Attribute<VariantFlavorAttr>, VariantFlavorAttr> flavorAttrMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[135].callConstructor(HashMap.class, arrayOfCallSite[136].call(arrayOfCallSite[137].callGroovyObjectGetProperty(this.variantCombination))), Map.class);
    VariantFlavor flavor;
    Iterator iterator;
    for (flavor = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[138].call(arrayOfCallSite[139].callGroovyObjectGetProperty(this.variantCombination)), Iterator.class); iterator.hasNext(); ) {
      flavor = (VariantFlavor)ScriptBytecodeAdapter.castToType(iterator.next(), VariantFlavor.class);
      arrayOfCallSite[140]
        .call(flavorAttrMap, arrayOfCallSite[141].call(Attribute.class, arrayOfCallSite[142].call(flavor), VariantFlavorAttr.class), arrayOfCallSite[143].call(this.objects, VariantFlavorAttr.class, arrayOfCallSite[144].callGetProperty(flavor)));
    } 
    return flavorAttrMap;
  }
}
