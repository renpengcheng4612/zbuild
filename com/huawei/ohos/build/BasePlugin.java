package com.huawei.ohos.build;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dependency.DependencyTransformer;
import com.huawei.ohos.build.dsl.BuildTypeFactory;
import com.huawei.ohos.build.dsl.BuildTypeOptions;
import com.huawei.ohos.build.dsl.SigningConfigFactory;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import com.huawei.ohos.build.dsl.dependencies.HarmonyConfigurationNames;
import com.huawei.ohos.build.dsl.variant.VariantFlavorFactory;
import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import com.huawei.ohos.build.exception.ErrorPluginException;
import com.huawei.ohos.build.ide.HarmonyToolingModelBuilder;
import com.huawei.ohos.build.model.DefaultSigningConfig;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.model.sourcesets.DefaultOhosSourceSetCreator;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSetCreator;
import com.huawei.ohos.build.plugins.VersionCheckPlugin;
import com.huawei.ohos.build.tasks.factory.TaskManager;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.build.utils.FeatureUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Locale;
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
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.DependencyResolutionListener;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;

public abstract class BasePlugin implements Plugin<Project>, DependencyResolutionListener, GroovyObject {
  private static final String PREPARATION_TASK_NAME = "prepareKotlinBuildScriptModel";
  
  @Nonnull
  private static final HMLogger HM_LOGGER;
  
  @Nonnull
  private final SoftwareComponentFactory softwareComponentFactory;
  
  protected Project project;
  
  protected VariantManager variantManager;
  
  protected TaskManager taskManager;
  
  protected BaseExtension extension;
  
  protected DependencyManager dependencyManager;
  
  protected OhosSourceSetCreator ohosSourceSetCreator;
  
  protected ToolingModelBuilderRegistry registry;
  
  private boolean hasConfigFeature;
  
  static {
    Object object = $getCallSiteArray()[98].call(HMLogger.class, BasePlugin.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public BasePlugin(@Nonnull ToolingModelBuilderRegistry registry, @Nonnull SoftwareComponentFactory softwareComponentFactory) {
    boolean bool = false;
    MetaClass metaClass = $getStaticMetaClass();
    ToolingModelBuilderRegistry toolingModelBuilderRegistry = registry;
    this.registry = (ToolingModelBuilderRegistry)ScriptBytecodeAdapter.castToType(toolingModelBuilderRegistry, ToolingModelBuilderRegistry.class);
    SoftwareComponentFactory softwareComponentFactory1 = softwareComponentFactory;
    this.softwareComponentFactory = (SoftwareComponentFactory)ScriptBytecodeAdapter.castToType(softwareComponentFactory1, SoftwareComponentFactory.class);
  }
  
  public void apply(Project project) {
    Reference reference = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    char c = '';
    ScriptBytecodeAdapter.setProperty(Integer.valueOf(c), null, GlobalDataManager.class, "START_FEATURE_PACKAGE_ID");
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(reference.get()), VersionCheckPlugin.class);
    arrayOfCallSite[2].callCurrent(this, reference.get());
    arrayOfCallSite[3].callCurrent(this, reference.get(), this.variantManager);
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(reference.get()), this);
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(reference.get()), new _apply_closure1(this, this, reference));
  }
  
  public final class _apply_closure1 extends Closure implements GeneratedClosure {
    public _apply_closure1(Object _outerInstance, Object _thisObject, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference = project;
      this.project = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.project.get());
      arrayOfCallSite[1].callStatic(BasePlugin.class, this.project.get());
      return arrayOfCallSite[2].callCurrent((GroovyObject)this, this.project.get());
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public Object configureFeaturePackageId(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (this.hasConfigFeature)
      return null; 
    ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(arrayOfCallSite[9].call(GlobalDataManager.class, project), project), ConfigInfo.class);
    if (ScriptBytecodeAdapter.compareNotEqual(configInfo, null))
      arrayOfCallSite[10].call(FeatureUtils.class, configInfo, project); 
    boolean bool = true;
    return Boolean.valueOf(bool);
  }
  
  public Object basePluginApply(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    arrayOfCallSite[11].callCurrent(this, project);
    arrayOfCallSite[12].callCurrent(this, project);
    return arrayOfCallSite[13].call(arrayOfCallSite[14].call(project), JavaBasePlugin.class);
  }
  
  protected void configureExtension(Project project) {
    Reference reference1 = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[17].callConstructor(DefaultOhosSourceSetCreator.class, reference1.get(), Boolean.valueOf(isLibrary()));
      this.ohosSourceSetCreator = (OhosSourceSetCreator)ScriptBytecodeAdapter.castToType(object, OhosSourceSetCreator.class);
    } else {
      Object object = arrayOfCallSite[15].callConstructor(DefaultOhosSourceSetCreator.class, reference1.get(), arrayOfCallSite[16].callCurrent(this));
      this.ohosSourceSetCreator = (OhosSourceSetCreator)ScriptBytecodeAdapter.castToType(object, OhosSourceSetCreator.class);
    } 
    ObjectFactory objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(reference1.get()), ObjectFactory.class);
    NamedDomainObjectContainer buildTypeContainer = (NamedDomainObjectContainer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].call(reference1.get(), BuildTypeOptions.class, arrayOfCallSite[20].callConstructor(BuildTypeFactory.class, objectFactory, reference1.get())), NamedDomainObjectContainer.class);
    NamedDomainObjectContainer variantFlavorContainer = (NamedDomainObjectContainer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].call(reference1.get(), VariantFlavorOptions.class, arrayOfCallSite[22].callConstructor(VariantFlavorFactory.class, reference1.get())), NamedDomainObjectContainer.class);
    Reference signingConfigContainer = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(reference1.get(), SigningConfigOptions.class, arrayOfCallSite[24].callConstructor(SigningConfigFactory.class, objectFactory, arrayOfCallSite[25].call(KeyStoreHelper.class, reference1.get()))), NamedDomainObjectContainer.class));
    Object object1 = arrayOfCallSite[26].callCurrent(this, reference1.get(), buildTypeContainer, variantFlavorContainer, signingConfigContainer.get());
    this.extension = (BaseExtension)ScriptBytecodeAdapter.castToType(object1, BaseExtension.class);
    boolean isLibrary = false;
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      boolean bool = isLibrary();
    } else {
      Object object = arrayOfCallSite[27].callCurrent(this);
      isLibrary = DefaultTypeTransformation.booleanUnbox(object);
    } 
    Object object2 = arrayOfCallSite[28].callConstructor(DependencyManager.class, reference1.get(), this.ohosSourceSetCreator, Boolean.valueOf(isLibrary));
    this.dependencyManager = (DependencyManager)ScriptBytecodeAdapter.castToType(object2, DependencyManager.class);
    Object object3 = arrayOfCallSite[29].callCurrent(this, reference1.get(), this.dependencyManager, this.softwareComponentFactory);
    this.taskManager = (TaskManager)ScriptBytecodeAdapter.castToType(object3, TaskManager.class);
    Object object4 = arrayOfCallSite[30].callConstructor(VariantManager.class, this.taskManager, this.dependencyManager, this.ohosSourceSetCreator);
    this.variantManager = (VariantManager)ScriptBytecodeAdapter.castToType(object4, VariantManager.class);
    arrayOfCallSite[31].call(variantFlavorContainer, new _configureExtension_closure2(this, this));
    arrayOfCallSite[32].call(signingConfigContainer.get(), new _configureExtension_closure3(this, this));
    arrayOfCallSite[33].call(buildTypeContainer, new _configureExtension_closure4(this, this, reference1, signingConfigContainer));
    arrayOfCallSite[34].callCurrent(this, signingConfigContainer.get());
    arrayOfCallSite[35].call(buildTypeContainer, arrayOfCallSite[36].callGetProperty(BuildConst.class));
    arrayOfCallSite[37].call(buildTypeContainer, arrayOfCallSite[38].callGetProperty(BuildConst.class));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      initDefaultSourceSets();
      null;
      return;
    } 
    arrayOfCallSite[39].callCurrent(this);
  }
  
  public final class _configureExtension_closure2 extends Closure implements GeneratedClosure {
    public _configureExtension_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object object) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      VariantFlavorOptions flavor = (VariantFlavorOptions)ScriptBytecodeAdapter.asType(object, VariantFlavorOptions.class);
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(flavor));
      return arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this), flavor);
    }
  }
  
  public final class _configureExtension_closure3 extends Closure implements GeneratedClosure {
    public _configureExtension_closure3(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object object) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.asType(object, SigningConfig.class), SigningConfig.class));
    }
  }
  
  public final class _configureExtension_closure4 extends Closure implements GeneratedClosure {
    public _configureExtension_closure4(Object _outerInstance, Object _thisObject, Reference project, Reference signingConfigContainer) {
      super(_outerInstance, _thisObject);
      Reference reference1 = project;
      this.project = reference1;
      Reference reference2 = signingConfigContainer;
      this.signingConfigContainer = reference2;
    }
    
    public Object doCall(Object object) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      BuildTypeOptions bt = (BuildTypeOptions)ScriptBytecodeAdapter.asType(object, BuildTypeOptions.class);
      SigningConfig signingConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(DefaultSigningConfig.class, arrayOfCallSite[1].callGetProperty(BuildConst.class), arrayOfCallSite[2].call(KeyStoreHelper.class, this.project.get())), SigningConfig.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(BuildConst.class), arrayOfCallSite[5].callGroovyObjectGetProperty(bt)))) {
        Object object1 = arrayOfCallSite[6].call(this.signingConfigContainer.get(), arrayOfCallSite[7].callGroovyObjectGetProperty(bt));
        signingConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(object1, SigningConfig.class);
      } 
      arrayOfCallSite[8].call(bt, signingConfig);
      arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), bt);
      return arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].call(bt));
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public NamedDomainObjectContainer getSigningConfigContainer() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (NamedDomainObjectContainer)ScriptBytecodeAdapter.castToType(this.signingConfigContainer.get(), NamedDomainObjectContainer.class);
    }
  }
  
  protected boolean isLibrary() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  private void createTasks(Project project) {
    Reference reference = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[40].call(reference.get(), new _createTasks_closure5(this, this, reference));
    arrayOfCallSite[41].call(this.taskManager, this.variantManager);
  }
  
  public final class _createTasks_closure5 extends Closure implements GeneratedClosure {
    public _createTasks_closure5(Object _outerInstance, Object _thisObject, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference = project;
      this.project = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this);
      arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), this.project.get());
      arrayOfCallSite[3].callCurrent((GroovyObject)this, this.project.get());
      return arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), this.project.get());
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void configDependencies(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object transformer = arrayOfCallSite[42].callConstructor(DependencyTransformer.class, project);
    arrayOfCallSite[43].call(transformer);
  }
  
  public void beforeResolve(ResolvableDependencies resolvableDependencies) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[44].call(HM_LOGGER, "DependencyResolutionListener", "Start resolve dependencies!");
    SdkInfo sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].call(arrayOfCallSite[46].call(GlobalDataManager.class, this.project), this.project), SdkInfo.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[47].callGetProperty(arrayOfCallSite[48].callGetProperty(arrayOfCallSite[49].callGetProperty(this.project))))) {
      File annotationsJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[50].call(arrayOfCallSite[51].call(Paths.class, arrayOfCallSite[52].call(sdkInfo), arrayOfCallSite[53].callGetProperty(SdkConst.class))), File.class);
      File processorJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].call(arrayOfCallSite[55].call(Paths.class, arrayOfCallSite[56].call(sdkInfo), arrayOfCallSite[57].callGetProperty(SdkConst.class))), File.class);
      File javaPoetJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].call(arrayOfCallSite[59].call(Paths.class, arrayOfCallSite[60].call(sdkInfo), arrayOfCallSite[61].callGetProperty(SdkConst.class))), File.class);
      arrayOfCallSite[62].call(arrayOfCallSite[63].callGetProperty(this.project), "implementation", arrayOfCallSite[64].call(this.project, arrayOfCallSite[65].callGetProperty(annotationsJar)));
      arrayOfCallSite[66].call(arrayOfCallSite[67].callGetProperty(this.project), "annotationProcessor", arrayOfCallSite[68].call(this.project, arrayOfCallSite[69].callGetProperty(processorJar)));
      arrayOfCallSite[70].call(arrayOfCallSite[71].callGetProperty(this.project), "annotationProcessor", arrayOfCallSite[72].call(this.project, arrayOfCallSite[73].callGetProperty(annotationsJar)));
      arrayOfCallSite[74].call(arrayOfCallSite[75].callGetProperty(this.project), "annotationProcessor", arrayOfCallSite[76].call(this.project, arrayOfCallSite[77].callGetProperty(javaPoetJar)));
    } 
    arrayOfCallSite[78].callCurrent(this, this.project);
    arrayOfCallSite[79].call(arrayOfCallSite[80].callGetProperty(this.project), this);
  }
  
  public void afterResolve(ResolvableDependencies resolvableDependencies) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public VariantManager getVariantManager() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantManager;
  }
  
  public TaskManager getTaskManager() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.taskManager;
  }
  
  public DependencyManager getDependencyManager() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dependencyManager;
  }
  
  public void registerModels(ToolingModelBuilderRegistry registry, VariantManager variantManager, BaseExtension extension) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    HarmonyToolingModelBuilder builder = (HarmonyToolingModelBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[81].callConstructor(HarmonyToolingModelBuilder.class, variantManager, extension), HarmonyToolingModelBuilder.class);
    arrayOfCallSite[82].call(registry, builder);
  }
  
  private static void checkDependency(Project project) {
    Reference reference = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[83].call(arrayOfCallSite[84].callGetProperty(reference.get()), new _checkDependency_closure6(BasePlugin.class, BasePlugin.class, reference));
  }
  
  public final class _checkDependency_closure6 extends Closure implements GeneratedClosure {
    public _checkDependency_closure6(Object _outerInstance, Object _thisObject, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference = project;
      this.project = reference;
    }
    
    public Object doCall(Object it) {
      Reference reference = new Reference(it);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].call(reference.get())), new _closure7(this, getThisObject(), reference, this.project));
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure7 extends Closure implements GeneratedClosure {
      public _closure7(Object _outerInstance, Object _thisObject, Reference it, Reference project) {
        super(_outerInstance, _thisObject);
        Reference reference1 = it;
        this.it = reference1;
        Reference reference2 = project;
        this.project = reference2;
      }
      
      public Object doCall(Object dependency) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(this.it.get()), arrayOfCallSite[3].callGetProperty(HarmonyConfigurationNames.class)) || (!(dependency instanceof org.gradle.api.internal.artifacts.dependencies.DefaultProjectDependency))))
            return null; 
        } else if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGetProperty(this.it.get()), arrayOfCallSite[1].callGetProperty(HarmonyConfigurationNames.class)) || (!(dependency instanceof org.gradle.api.internal.artifacts.dependencies.DefaultProjectDependency)))) {
          return null;
        } 
        Project dependencyProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(dependency), Project.class);
        ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(GlobalDataManager.class, dependencyProject), dependencyProject), ConfigInfo.class);
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(configInfo, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].callGroovyObjectGetProperty(configInfo), arrayOfCallSite[10].callGetProperty(BuildConst.class))))
            return null; 
          String err = ShortTypeHandling.castToString(arrayOfCallSite[11].call(String.class, ArrayUtil.createArray(arrayOfCallSite[12].callGetProperty(Locale.class), arrayOfCallSite[13].call(arrayOfCallSite[14].call("A problem occurred configuring project '%s'.", arrayOfCallSite[15].call(System.class)), "> The Build File '%s' config error dependency '%s project(':%s')',see logs for details"), arrayOfCallSite[16].callGetProperty(this.project.get()), arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].call(this.project.get())), arrayOfCallSite[19].callGetProperty(this.it.get()), arrayOfCallSite[20].callGetProperty(dependencyProject))));
          return arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this), arrayOfCallSite[23].callConstructor(IllegalStateException.class, err), "Project '%s' is a hap application module ,not a har library module!", arrayOfCallSite[24].callGetProperty(dependencyProject));
        } 
        if ((ScriptBytecodeAdapter.compareEqual(configInfo, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].callGroovyObjectGetProperty(configInfo), arrayOfCallSite[8].callGetProperty(BuildConst.class))))
          return null; 
        String str = ShortTypeHandling.castToString(arrayOfCallSite[11].call(String.class, ArrayUtil.createArray(arrayOfCallSite[12].callGetProperty(Locale.class), arrayOfCallSite[13].call(arrayOfCallSite[14].call("A problem occurred configuring project '%s'.", arrayOfCallSite[15].call(System.class)), "> The Build File '%s' config error dependency '%s project(':%s')',see logs for details"), arrayOfCallSite[16].callGetProperty(this.project.get()), arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].call(this.project.get())), arrayOfCallSite[19].callGetProperty(this.it.get()), arrayOfCallSite[20].callGetProperty(dependencyProject))));
        return arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this), arrayOfCallSite[23].callConstructor(IllegalStateException.class, str), "Project '%s' is a hap application module ,not a har library module!", arrayOfCallSite[24].callGetProperty(dependencyProject));
      }
      
      @Generated
      public Object getIt() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.it.get();
      }
      
      @Generated
      public Project getProject() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
      }
    }
  }
  
  public void initDefaultSourceSets() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[85].call(this.ohosSourceSetCreator, arrayOfCallSite[86].callGetProperty(OhosSourceSet.class));
    arrayOfCallSite[87].call(this.ohosSourceSetCreator, arrayOfCallSite[88].callGetProperty(OhosSourceSet.class));
    arrayOfCallSite[89].call(this.ohosSourceSetCreator, arrayOfCallSite[90].callGetProperty(OhosSourceSet.class));
  }
  
  public void checkState() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[91].call(arrayOfCallSite[92].call(this.project), JavaPlugin.class)))
      throw (Throwable)arrayOfCallSite[93].callConstructor(ErrorPluginException.class, "The 'java' plugin has been applied, but it is not compatible with the Hap plugins."); 
  }
  
  public void configGradleStartParameter(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[94].call(arrayOfCallSite[95].callGetProperty(arrayOfCallSite[96].callGetProperty(arrayOfCallSite[97].callGetProperty(project))), PREPARATION_TASK_NAME);
  }
  
  protected abstract BaseExtension createExtension(Project paramProject, NamedDomainObjectContainer<BuildTypeOptions> paramNamedDomainObjectContainer, NamedDomainObjectContainer<VariantFlavorOptions> paramNamedDomainObjectContainer1, NamedDomainObjectContainer<SigningConfigOptions> paramNamedDomainObjectContainer2);
  
  protected abstract TaskManager createTaskManager(Project paramProject, DependencyManager paramDependencyManager, SoftwareComponentFactory paramSoftwareComponentFactory);
  
  protected abstract void baseDataHandleBeforeApply(Project paramProject);
  
  protected abstract void pluginSpecificApply(Project paramProject, VariantManager paramVariantManager);
  
  protected abstract void initDefaultSigningConfigs(NamedDomainObjectContainer<SigningConfig> paramNamedDomainObjectContainer);
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
}
