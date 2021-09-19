package com.huawei.ohos.build;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.factory.AppTaskManager;
import com.huawei.ohos.build.tasks.factory.TaskManager;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.inject.Inject;
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
import org.gradle.api.Project;
import org.gradle.api.artifacts.DependencyResolutionListener;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;

public class HarmonyAppPluginMain extends BasePlugin implements DependencyResolutionListener {
  @Inject
  public HarmonyAppPluginMain(@Nonnull ToolingModelBuilderRegistry registry, @Nonnull SoftwareComponentFactory softwareComponentFactory) {
    super(registry, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  protected BaseExtension createExtension(Project project, NamedDomainObjectContainer buildTypeContainer, NamedDomainObjectContainer variantFlavorContainer, NamedDomainObjectContainer signingConfigContainer) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (BaseExtension)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(project), ArrayUtil.createArray("ohos", AppExtension.class, project, buildTypeContainer, variantFlavorContainer, signingConfigContainer)), BaseExtension.class);
  }
  
  protected TaskManager createTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (TaskManager)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(AppTaskManager.class, project, dependencyManager, softwareComponentFactory), TaskManager.class);
  }
  
  protected void baseDataHandleBeforeApply(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[3].call(arrayOfCallSite[4].call(GlobalDataManager.class, project), project);
  }
  
  protected void pluginSpecificApply(Project project, VariantManager variantManager) {
    Reference reference = new Reference(variantManager);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(project), new _pluginSpecificApply_closure1(this, this, reference));
  }
  
  public final class _pluginSpecificApply_closure1 extends Closure implements GeneratedClosure {
    public _pluginSpecificApply_closure1(Object _outerInstance, Object _thisObject, Reference variantManager) {
      super(_outerInstance, _thisObject);
      Reference reference = variantManager;
      this.variantManager = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].call(this.variantManager.get()), new _closure5(this, getThisObject()));
    }
    
    @Generated
    public VariantManager getVariantManager() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantManager)ScriptBytecodeAdapter.castToType(this.variantManager.get(), VariantManager.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure5 extends Closure implements GeneratedClosure {
      public _closure5(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object variantData) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[6].call(arrayOfCallSite[7].call(variantData)), arrayOfCallSite[8].callGetProperty(BuildConst.class)) && 
            ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].callGetProperty(variantData), arrayOfCallSite[10].callGetProperty(VariantModel.class))))
            return arrayOfCallSite[11].callCurrent((GroovyObject)this, variantData); 
          return null;
        } 
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].call(variantData)), arrayOfCallSite[2].callGetProperty(BuildConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGetProperty(variantData), arrayOfCallSite[4].callGetProperty(VariantModel.class))))
          return arrayOfCallSite[5].callCurrent((GroovyObject)this, variantData); 
        return null;
      }
    }
  }
  
  public void beforeResolve(ResolvableDependencies resolvableDependencies) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void afterResolve(ResolvableDependencies resolvableDependencies) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  protected void initDefaultSigningConfigs(NamedDomainObjectContainer signingConfigContainer) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[7].call(signingConfigContainer, arrayOfCallSite[8].callGetProperty(BuildConst.class));
    arrayOfCallSite[9].call(signingConfigContainer, arrayOfCallSite[10].callGetProperty(BuildConst.class));
  }
  
  public void createDependsOn(VariantData variantData) {
    Reference reference1 = new Reference(variantData);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<Map<String, Object>> modules = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<Map<String, Object>> list = resolveModules();
    } else {
      Object object = arrayOfCallSite[11].callCurrent(this);
      modules = (List<Map<String, Object>>)ScriptBytecodeAdapter.castToType(object, List.class);
    } 
    Reference featureEntries = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].call(ArrayListMultimap.class), ListMultimap.class));
    Reference entrys = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(ArrayList.class), List.class));
    Reference packageApp = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[14].call(reference1.get(), "package", "app")));
    arrayOfCallSite[15].call(modules, new _createDependsOn_closure2(this, this, featureEntries, entrys, reference1, packageApp));
    arrayOfCallSite[16].call(entrys.get(), new _createDependsOn_closure3(this, this, featureEntries));
  }
  
  public final class _createDependsOn_closure2 extends Closure implements GeneratedClosure {
    public _createDependsOn_closure2(Object _outerInstance, Object _thisObject, Reference featureEntries, Reference entrys, Reference variantData, Reference packageApp) {
      super(_outerInstance, _thisObject);
      Reference reference1 = featureEntries;
      this.featureEntries = reference1;
      Reference reference2 = entrys;
      this.entrys = reference2;
      Reference reference3 = variantData;
      this.variantData = reference3;
      Reference reference4 = packageApp;
      this.packageApp = reference4;
    }
    
    public Object doCall(Object modulePackInfo) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Reference hapProject = new Reference(ScriptBytecodeAdapter.asType(arrayOfCallSite[0].call(modulePackInfo, "module"), Project.class));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call("feature", arrayOfCallSite[2].call(modulePackInfo, "module-type")))) {
        arrayOfCallSite[3].call(arrayOfCallSite[4].call(ModuleExtensionData.class, hapProject.get()), new _closure6(this, getThisObject(), this.featureEntries, hapProject));
      } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call("entry", arrayOfCallSite[6].call(modulePackInfo, "module-type")))) {
        arrayOfCallSite[7].call(this.entrys.get(), hapProject.get());
      } 
      return arrayOfCallSite[8].call(arrayOfCallSite[9].call(hapProject.get()), new _closure7(this, getThisObject(), this.variantData, this.packageApp));
    }
    
    @Generated
    public ListMultimap getFeatureEntries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ListMultimap)ScriptBytecodeAdapter.castToType(this.featureEntries.get(), ListMultimap.class);
    }
    
    @Generated
    public List getEntrys() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.entrys.get(), List.class);
    }
    
    @Generated
    public VariantData getVariantData() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantData)ScriptBytecodeAdapter.castToType(this.variantData.get(), VariantData.class);
    }
    
    @Generated
    public String getPackageApp() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.packageApp.get());
    }
    
    public final class _closure6 extends Closure implements GeneratedClosure {
      public _closure6(Object _outerInstance, Object _thisObject, Reference featureEntries, Reference hapProject) {
        super(_outerInstance, _thisObject);
        Reference reference1 = featureEntries;
        this.featureEntries = reference1;
        Reference reference2 = hapProject;
        this.hapProject = reference2;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.featureEntries.get(), it, this.hapProject.get());
      }
      
      @Generated
      public ListMultimap getFeatureEntries() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (ListMultimap)ScriptBytecodeAdapter.castToType(this.featureEntries.get(), ListMultimap.class);
      }
      
      @Generated
      public Project getHapProject() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Project)ScriptBytecodeAdapter.castToType(this.hapProject.get(), Project.class);
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
    
    public final class _closure7 extends Closure implements GeneratedClosure {
      public _closure7(Object _outerInstance, Object _thisObject, Reference variantData, Reference packageApp) {
        super(_outerInstance, _thisObject);
        Reference reference1 = variantData;
        this.variantData = reference1;
        Reference reference2 = packageApp;
        this.packageApp = reference2;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((((it instanceof com.huawei.ohos.build.tasks.PackageHap && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(arrayOfCallSite[14].callGetProperty(it))), arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this.variantData.get()))))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].callGetProperty(it)), arrayOfCallSite[19].callGetProperty(VariantModel.class))))
            return arrayOfCallSite[20].call(arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this)), this.packageApp.get()), it); 
          return null;
        } 
        if ((((it instanceof com.huawei.ohos.build.tasks.PackageHap && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(it))), arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this.variantData.get()))))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(it)), arrayOfCallSite[7].callGetProperty(VariantModel.class))))
          return arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this)), this.packageApp.get()), it); 
        return null;
      }
      
      @Generated
      public VariantData getVariantData() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (VariantData)ScriptBytecodeAdapter.castToType(this.variantData.get(), VariantData.class);
      }
      
      @Generated
      public String getPackageApp() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return ShortTypeHandling.castToString(this.packageApp.get());
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public final class _createDependsOn_closure3 extends Closure implements GeneratedClosure {
    public _createDependsOn_closure3(Object _outerInstance, Object _thisObject, Reference featureEntries) {
      super(_outerInstance, _thisObject);
      Reference reference = featureEntries;
      this.featureEntries = reference;
    }
    
    public Object doCall(Object entryProject) {
      Reference reference = new Reference(entryProject);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      List features = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(this.featureEntries.get(), arrayOfCallSite[1].callGetProperty(reference.get())), List.class);
      return arrayOfCallSite[2].call(features, new _closure8(this, getThisObject(), reference));
    }
    
    @Generated
    public ListMultimap getFeatureEntries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ListMultimap)ScriptBytecodeAdapter.castToType(this.featureEntries.get(), ListMultimap.class);
    }
    
    public final class _closure8 extends Closure implements GeneratedClosure {
      public _closure8(Object _outerInstance, Object _thisObject, Reference entryProject) {
        super(_outerInstance, _thisObject);
        Reference reference = entryProject;
        this.entryProject = reference;
      }
      
      public Object doCall(Object featureProject) {
        Reference reference = new Reference(featureProject);
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(arrayOfCallSite[1].call(this.entryProject.get()), new _closure9(this, getThisObject(), reference));
      }
      
      @Generated
      public Object getEntryProject() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.entryProject.get();
      }
      
      public final class _closure9 extends Closure implements GeneratedClosure {
        public _closure9(Object _outerInstance, Object _thisObject, Reference featureProject) {
          super(_outerInstance, _thisObject);
          Reference reference = featureProject;
          this.featureProject = reference;
        }
        
        public Object doCall(Object it) {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          if (it instanceof com.huawei.ohos.build.tasks.PackageHap)
            return arrayOfCallSite[0].call(it, arrayOfCallSite[1].call(arrayOfCallSite[2].call(this.featureProject.get()), arrayOfCallSite[3].callGetProperty(it))); 
          return null;
        }
        
        @Generated
        public Object getFeatureProject() {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return this.featureProject.get();
        }
        
        @Generated
        public Object doCall() {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
        }
      }
    }
  }
  
  public List<Map<String, Object>> resolveModules() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference modules = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), new _resolveModules_closure4(this, this, modules));
    return (List<Map<String, Object>>)modules.get();
  }
  
  public final class _resolveModules_closure4 extends Closure implements GeneratedClosure {
    public _resolveModules_closure4(Object _outerInstance, Object _thisObject, Reference modules) {
      super(_outerInstance, _thisObject);
      Reference reference = modules;
      this.modules = reference;
    }
    
    public Object doCall(Object module) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Project subProject = (Project)ScriptBytecodeAdapter.asType(module, Project.class);
      Map modulePackInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(HashMap.class), Map.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(subProject), arrayOfCallSite[3].callGetProperty(BuildConst.class)))) {
        arrayOfCallSite[4].call(modulePackInfo, "module", subProject);
        arrayOfCallSite[5].call(modulePackInfo, "module-type", arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(subProject), arrayOfCallSite[8].callGetProperty(BuildConst.class)));
        return arrayOfCallSite[9].call(this.modules.get(), modulePackInfo);
      } 
      return null;
    }
    
    @Generated
    public List getModules() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.modules.get(), List.class);
    }
  }
}
