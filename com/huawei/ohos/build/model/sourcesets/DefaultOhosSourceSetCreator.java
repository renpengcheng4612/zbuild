package com.huawei.ohos.build.model.sourcesets;

import com.huawei.ohos.build.dsl.dependencies.HarmonyConfigurationNames;
import com.huawei.ohos.build.utils.reporter.DeprecationReporterUtil;
import com.huawei.ohos.common.Version;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.model.ObjectFactory;

public class DefaultOhosSourceSetCreator implements OhosSourceSetCreator, GroovyObject {
  private ObjectFactory objects;
  
  private ConfigurationContainer configs;
  
  private NamedDomainObjectContainer<OhosSourceSet> sourceContainer;
  
  private Project project;
  
  private Map<String, OhosSourceSet> configuredSourceSets;
  
  private Boolean isLibrary;
  
  private Set<Configuration> apiClassPaths;
  
  private Set<Configuration> compileClassPaths;
  
  private Set<Configuration> implementationConfigurations;
  
  private Set<Configuration> runtimeClassPaths;
  
  private Set<Configuration> annotationConfigs;
  
  public DefaultOhosSourceSetCreator(Project project, Boolean isLibrary) {
    Object object1 = arrayOfCallSite[0].callConstructor(LinkedHashMap.class);
    this.configuredSourceSets = (Map<String, OhosSourceSet>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    Object object2 = arrayOfCallSite[1].call(project, OhosSourceSet.class, arrayOfCallSite[2].callConstructor(OhosSourceSetFactory.class, project));
    this.sourceContainer = (NamedDomainObjectContainer<OhosSourceSet>)ScriptBytecodeAdapter.castToType(object2, NamedDomainObjectContainer.class);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Boolean bool = isLibrary;
    this.isLibrary = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
    Object object3 = arrayOfCallSite[3].callGetProperty(project);
    this.objects = (ObjectFactory)ScriptBytecodeAdapter.castToType(object3, ObjectFactory.class);
    Object object4 = arrayOfCallSite[4].call(project);
    this.configs = (ConfigurationContainer)ScriptBytecodeAdapter.castToType(object4, ConfigurationContainer.class);
    Object object5 = arrayOfCallSite[5].callConstructor(HashSet.class);
    this.apiClassPaths = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object5, Set.class);
    Object object6 = arrayOfCallSite[6].callConstructor(HashSet.class);
    this.compileClassPaths = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object6, Set.class);
    Object object7 = arrayOfCallSite[7].callConstructor(HashSet.class);
    this.implementationConfigurations = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object7, Set.class);
    Object object8 = arrayOfCallSite[8].callConstructor(HashSet.class);
    this.runtimeClassPaths = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object8, Set.class);
    Object object9 = arrayOfCallSite[9].callConstructor(HashSet.class);
    this.annotationConfigs = (Set<Configuration>)ScriptBytecodeAdapter.castToType(object9, Set.class);
  }
  
  public Boolean getIsLibrary() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.isLibrary;
  }
  
  public Map<String, OhosSourceSet> getConfiguredSourceSets() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configuredSourceSets;
  }
  
  public OhosSourceSet maybeSetup(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    OhosSourceSet sourceSet = (OhosSourceSet)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(this.sourceContainer, name), OhosSourceSet.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(this.configuredSourceSets, name))) {
      arrayOfCallSite[12].callCurrent(this, sourceSet);
      arrayOfCallSite[13].call(this.configuredSourceSets, name, sourceSet);
    } 
    return sourceSet;
  }
  
  private void createDeclareConfiguration(OhosSourceSet sourceSet) {
    Reference reference = new Reference(sourceSet);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].callCurrent(this, arrayOfCallSite[15].callGetProperty(HarmonyConfigurationNames.class));
    Configuration compile = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callCurrent(this, arrayOfCallSite[17].call(reference.get())), Configuration.class);
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGetProperty(compile), new _createDeclareConfiguration_closure1(this, this, reference));
    Configuration implementation = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].callCurrent(this, arrayOfCallSite[21].call(reference.get())), Configuration.class);
    Configuration api = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].callCurrent(this, arrayOfCallSite[23].call(reference.get())), Configuration.class);
    arrayOfCallSite[24].call(api, compile);
    arrayOfCallSite[25].call(implementation, api);
    arrayOfCallSite[26].callCurrent(this, arrayOfCallSite[27].call(reference.get()));
    arrayOfCallSite[28].callCurrent(this, arrayOfCallSite[29].call(reference.get()));
    arrayOfCallSite[30].callCurrent(this, arrayOfCallSite[31].call(reference.get()));
  }
  
  public final class _createDeclareConfiguration_closure1 extends Closure implements GeneratedClosure {
    public _createDeclareConfiguration_closure1(Object _outerInstance, Object _thisObject, Reference sourceSet) {
      super(_outerInstance, _thisObject);
      Reference reference = sourceSet;
      this.sourceSet = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(DeprecationReporterUtil.class, arrayOfCallSite[1].call(this.sourceSet.get()), arrayOfCallSite[2].call(this.sourceSet.get()), arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].callGetProperty(Version.class)));
    }
    
    @Generated
    public OhosSourceSet getSourceSet() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (OhosSourceSet)ScriptBytecodeAdapter.castToType(this.sourceSet.get(), OhosSourceSet.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public Configuration configDefaultDeclareConfiguration(String configurationName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Configuration configuration = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(this.configs, configurationName), Configuration.class);
    arrayOfCallSite[33].call(configuration, Boolean.valueOf(false));
    arrayOfCallSite[34].call(configuration, Boolean.valueOf(false));
    arrayOfCallSite[35].call(configuration, Boolean.valueOf(false));
    return configuration;
  }
}
