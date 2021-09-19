package com.huawei.ohos.build.tasks.manager;

import com.huawei.ohos.build.model.dependencies.JarInfo;
import com.huawei.ohos.build.model.dependencies.LibraryDependency;
import com.huawei.ohos.build.model.dependencies.LibraryDependencyImpl;
import com.huawei.ohos.build.model.dependencies.LibraryInfo;
import com.huawei.ohos.build.model.dependencies.MavenCoordinatesImpl;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSetCreator;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.StringHandler;
import com.huawei.ohos.build.utils.har.ExplodedHarUtil;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
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
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import org.gradle.api.artifacts.ResolvedArtifact;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.artifacts.component.ComponentSelector;
import org.gradle.api.artifacts.result.ResolvedComponentResult;
import org.gradle.api.artifacts.result.UnresolvedDependencyResult;

public class DependencyManager implements GroovyObject {
  private static final HMLogger hmLogger;
  
  @Nonnull
  private final Project project;
  
  private ExplodedHarUtil explodedHarUtil;
  
  private boolean isLibrary;
  
  private OhosSourceSetCreator sourceSetCreator;
  
  static {
    Object object = $getCallSiteArray()[132].call(HMLogger.class, DependencyManager.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public DependencyManager(Project project, OhosSourceSetCreator creator, Object isLibrary) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    OhosSourceSetCreator ohosSourceSetCreator = creator;
    this.sourceSetCreator = (OhosSourceSetCreator)ScriptBytecodeAdapter.castToType(ohosSourceSetCreator, OhosSourceSetCreator.class);
    Object object1 = isLibrary;
    this.isLibrary = DefaultTypeTransformation.booleanUnbox(object1);
    Object object2 = arrayOfCallSite[0].callConstructor(ExplodedHarUtil.class, project);
    this.explodedHarUtil = (ExplodedHarUtil)ScriptBytecodeAdapter.castToType(object2, ExplodedHarUtil.class);
  }
  
  public boolean isLibrary() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.isLibrary;
  }
  
  @Nonnull
  public Configuration getCompileClasspath(String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object sourceSet = arrayOfCallSite[1].call(this.sourceSetCreator, variantName);
    return (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(this.project), arrayOfCallSite[4].call(sourceSet)), Configuration.class);
  }
  
  @Nonnull
  public Configuration getPackageClasspath(String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object sourceSet = arrayOfCallSite[5].call(this.sourceSetCreator, variantName);
    return (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(this.project), arrayOfCallSite[8].call(sourceSet)), Configuration.class);
  }
  
  public void computeDependency(VariantDependency variantDependency) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference allHarDependency = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(HashSet.class), Set.class));
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(variantDependency), new _computeDependency_closure1(this, this, allHarDependency));
    arrayOfCallSite[12].callCurrent(this, allHarDependency.get());
  }
  
  public final class _computeDependency_closure1 extends Closure implements GeneratedClosure {
    public _computeDependency_closure1(Object _outerInstance, Object _thisObject, Reference allHarDependency) {
      super(_outerInstance, _thisObject);
      Reference reference = allHarDependency;
      this.allHarDependency = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callCurrent((GroovyObject)this, it, this.allHarDependency.get());
    }
    
    @Generated
    public Set getAllHarDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.allHarDependency.get(), Set.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public VariantDependency resolveExternalModuleDependency(VariantDependency variantDependency, String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map hasAddLibraries = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(HashMap.class), Map.class);
    Map hasAddJars = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(HashMap.class), Map.class);
    Set notResolvedDependencies = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callConstructor(HashSet.class), Set.class);
    Map transformMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callConstructor(HashMap.class), Map.class);
    Configuration compileClasspath = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].call(variantDependency), Configuration.class);
    Configuration packageClasspath = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(variantDependency), Configuration.class);
    Configuration annotationProcessorClasspath = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].call(variantDependency), Configuration.class);
    Map allDependencyArtifacts = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[21].call(compileClasspath, Boolean.valueOf(true));
    arrayOfCallSite[22].call(compileClasspath, Boolean.valueOf(true));
    arrayOfCallSite[23].callStatic(DependencyManager.class, compileClasspath, allDependencyArtifacts);
    arrayOfCallSite[24].call(packageClasspath, Boolean.valueOf(true));
    arrayOfCallSite[25].call(packageClasspath, Boolean.valueOf(true));
    arrayOfCallSite[26].callStatic(DependencyManager.class, packageClasspath, allDependencyArtifacts);
    arrayOfCallSite[27].call(annotationProcessorClasspath, Boolean.valueOf(true));
    arrayOfCallSite[28].call(annotationProcessorClasspath, Boolean.valueOf(true));
    arrayOfCallSite[29].callStatic(DependencyManager.class, annotationProcessorClasspath, allDependencyArtifacts);
    List compiledOhosLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callConstructor(ArrayList.class), List.class);
    List compiledOhosJars = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[32].callCurrent(this, ArrayUtil.createArray(compileClasspath, variantDependency, compiledOhosLibraries, compiledOhosJars, hasAddLibraries, hasAddJars, allDependencyArtifacts, transformMap, notResolvedDependencies, Boolean.valueOf(false)));
    List packagedOhosLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(ArrayList.class), List.class);
    List packagedOhosJars = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[35].callCurrent(this, ArrayUtil.createArray(packageClasspath, variantDependency, packagedOhosLibraries, packagedOhosJars, hasAddLibraries, hasAddJars, allDependencyArtifacts, transformMap, notResolvedDependencies, Boolean.valueOf(true)));
    List annotationProcessorOhosLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[36].callConstructor(ArrayList.class), List.class);
    List annotationProcessorOhosJars = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[38].callCurrent(this, ArrayUtil.createArray(annotationProcessorClasspath, variantDependency, annotationProcessorOhosLibraries, annotationProcessorOhosJars, hasAddLibraries, hasAddJars, allDependencyArtifacts, transformMap, notResolvedDependencies, Boolean.valueOf(true)));
    Reference copyOfPackagedLibs = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].callConstructor(ArrayList.class, packagedOhosLibraries), List.class)), isLibrary = new Reference(Boolean.valueOf(false));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      boolean bool = isLibrary();
      isLibrary.set(Boolean.valueOf(DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool))));
      arrayOfCallSite[41].call(compiledOhosLibraries, new _resolveExternalModuleDependency_closure2(this, this, copyOfPackagedLibs, isLibrary));
      arrayOfCallSite[42].call(copyOfPackagedLibs.get(), new _resolveExternalModuleDependency_closure3(this, this));
      Set jarInfoSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(Collections.class, arrayOfCallSite[44].callConstructor(IdentityHashMap.class)), Set.class);
      arrayOfCallSite[45].callCurrent(this, jarInfoSet, compiledOhosJars, Boolean.valueOf(true), Boolean.valueOf(false));
      arrayOfCallSite[46].callCurrent(this, jarInfoSet, packagedOhosJars, Boolean.valueOf(false), Boolean.valueOf(true));
      arrayOfCallSite[47].callCurrent(this, jarInfoSet, compiledOhosLibraries);
      Reference jars = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].callConstructor(ArrayList.class, arrayOfCallSite[49].call(jarInfoSet)), List.class));
      arrayOfCallSite[50].call(jarInfoSet, new _resolveExternalModuleDependency_closure4(this, this, jars));
      List libList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].callCurrent(this, compiledOhosLibraries, transformMap), List.class);
      arrayOfCallSite[52].call(variantDependency, libList);
      arrayOfCallSite[53].call(variantDependency, jars.get());
      return variantDependency;
    } 
    Object object = arrayOfCallSite[40].callCurrent(this);
    isLibrary.set(Boolean.valueOf(DefaultTypeTransformation.booleanUnbox(ScriptBytecodeAdapter.castToType(object, Boolean.class))));
    arrayOfCallSite[41].call(compiledOhosLibraries, new _resolveExternalModuleDependency_closure2(this, this, copyOfPackagedLibs, isLibrary));
    arrayOfCallSite[42].call(copyOfPackagedLibs.get(), new _resolveExternalModuleDependency_closure3(this, this));
    Set set1 = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(Collections.class, arrayOfCallSite[44].callConstructor(IdentityHashMap.class)), Set.class);
    arrayOfCallSite[45].callCurrent(this, set1, compiledOhosJars, Boolean.valueOf(true), Boolean.valueOf(false));
    arrayOfCallSite[46].callCurrent(this, set1, packagedOhosJars, Boolean.valueOf(false), Boolean.valueOf(true));
    arrayOfCallSite[47].callCurrent(this, set1, compiledOhosLibraries);
    Reference reference1 = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].callConstructor(ArrayList.class, arrayOfCallSite[49].call(set1)), List.class));
    arrayOfCallSite[50].call(set1, new _resolveExternalModuleDependency_closure4(this, this, reference1));
    List list1 = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].callCurrent(this, compiledOhosLibraries, transformMap), List.class);
    arrayOfCallSite[52].call(variantDependency, list1);
    arrayOfCallSite[53].call(variantDependency, reference1.get());
    return variantDependency;
  }
  
  public final class _resolveExternalModuleDependency_closure2 extends Closure implements GeneratedClosure {
    public _resolveExternalModuleDependency_closure2(Object _outerInstance, Object _thisObject, Reference copyOfPackagedLibs, Reference isLibrary) {
      super(_outerInstance, _thisObject);
      Reference reference1 = copyOfPackagedLibs;
      this.copyOfPackagedLibs = reference1;
      Reference reference2 = isLibrary;
      this.isLibrary = reference2;
    }
    
    public Object doCall(Object lib) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.copyOfPackagedLibs.get(), lib))) {
        if ((DefaultTypeTransformation.booleanUnbox(this.isLibrary.get()) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(lib))))
          return arrayOfCallSite[2].call(lib, Boolean.valueOf(true)); 
        throw (Throwable)arrayOfCallSite[3].callConstructor(GradleException.class, arrayOfCallSite[4].call(String.class, arrayOfCallSite[5].callGetProperty(Locale.class), "Project %s: The dependency can only be in JAR format during building. %s is a Har.", arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this)), arrayOfCallSite[8].call(lib)));
      } 
      return arrayOfCallSite[9].call(this.copyOfPackagedLibs.get(), lib);
    }
    
    @Generated
    public List getCopyOfPackagedLibs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.copyOfPackagedLibs.get(), List.class);
    }
    
    @Generated
    public Boolean getIsLibrary() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Boolean)ScriptBytecodeAdapter.castToType(this.isLibrary.get(), Boolean.class);
    }
  }
  
  public final class _resolveExternalModuleDependency_closure3 extends Closure implements GeneratedClosure {
    public _resolveExternalModuleDependency_closure3(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      throw (Throwable)arrayOfCallSite[0].callConstructor(GradleException.class, arrayOfCallSite[1].call(String.class, arrayOfCallSite[2].callGetProperty(Locale.class), "Project %s: The dependency can only be in JAR format during building and running. %s is a Har.", arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].call(it)));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _resolveExternalModuleDependency_closure4 extends Closure implements GeneratedClosure {
    public _resolveExternalModuleDependency_closure4(Object _outerInstance, Object _thisObject, Reference jars) {
      super(_outerInstance, _thisObject);
      Reference reference = jars;
      this.jars = reference;
    }
    
    public Object doCall(Object jarInfo) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.jars.get(), arrayOfCallSite[1].call(jarInfo));
    }
    
    @Generated
    public List getJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.jars.get(), List.class);
    }
  }
  
  public void getDependencyFromClassPath(Configuration configuration, VariantDependency variantDependency, List compiledOhosLibraries, List compiledOhosJars, Map hasAddLibraries, Map hasAddJars, Map allDependencyArtifacts, Map transformMap, Set notResolvedDependencies, boolean isOptional) {
    Reference reference1 = new Reference(variantDependency), reference2 = new Reference(compiledOhosLibraries), reference3 = new Reference(compiledOhosJars), reference4 = new Reference(hasAddLibraries), reference5 = new Reference(hasAddJars), reference6 = new Reference(allDependencyArtifacts), reference7 = new Reference(transformMap), reference8 = new Reference(notResolvedDependencies), reference9 = new Reference(Boolean.valueOf(isOptional));
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set dependencyResultSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].call(arrayOfCallSite[55].call(arrayOfCallSite[56].call(arrayOfCallSite[57].call(configuration)))), Set.class);
    arrayOfCallSite[58].call(dependencyResultSet, new _getDependencyFromClassPath_closure5(this, this, reference1, reference2, reference3, reference4, reference5, reference6, reference7, reference8, reference9));
  }
  
  public final class _getDependencyFromClassPath_closure5 extends Closure implements GeneratedClosure {
    public _getDependencyFromClassPath_closure5(Object _outerInstance, Object _thisObject, Reference variantDependency, Reference compiledOhosLibraries, Reference compiledOhosJars, Reference hasAddLibraries, Reference hasAddJars, Reference allDependencyArtifacts, Reference transformMap, Reference notResolvedDependencies, Reference isOptional) {
      super(_outerInstance, _thisObject);
      Reference reference1 = variantDependency;
      this.variantDependency = reference1;
      Reference reference2 = compiledOhosLibraries;
      this.compiledOhosLibraries = reference2;
      Reference reference3 = compiledOhosJars;
      this.compiledOhosJars = reference3;
      Reference reference4 = hasAddLibraries;
      this.hasAddLibraries = reference4;
      Reference reference5 = hasAddJars;
      this.hasAddJars = reference5;
      Reference reference6 = allDependencyArtifacts;
      this.allDependencyArtifacts = reference6;
      Reference reference7 = transformMap;
      this.transformMap = reference7;
      Reference reference8 = notResolvedDependencies;
      this.notResolvedDependencies = reference8;
      Reference reference9 = isOptional;
      this.isOptional = reference9;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (it instanceof org.gradle.api.internal.artifacts.result.DefaultResolvedDependencyResult) {
        ResolvedComponentResult resolvedComponentResult = (ResolvedComponentResult)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(it), ResolvedComponentResult.class);
        return arrayOfCallSite[1].callCurrent((GroovyObject)this, ArrayUtil.createArray(resolvedComponentResult, this.variantDependency.get(), this.compiledOhosLibraries.get(), this.compiledOhosJars.get(), this.hasAddLibraries.get(), this.hasAddJars.get(), this.allDependencyArtifacts.get(), this.transformMap.get(), this.notResolvedDependencies.get(), arrayOfCallSite[2].callConstructor(ArrayList.class), this.isOptional.get()));
      } 
      if (it instanceof UnresolvedDependencyResult) {
        ComponentSelector attempted = (ComponentSelector)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(ScriptBytecodeAdapter.castToType(it, UnresolvedDependencyResult.class)), ComponentSelector.class);
        if (ScriptBytecodeAdapter.compareNotEqual(attempted, null))
          return arrayOfCallSite[4].call(this.notResolvedDependencies.get(), arrayOfCallSite[5].call(attempted)); 
        return null;
      } 
      return null;
    }
    
    @Generated
    public VariantDependency getVariantDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantDependency)ScriptBytecodeAdapter.castToType(this.variantDependency.get(), VariantDependency.class);
    }
    
    @Generated
    public List getCompiledOhosLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.compiledOhosLibraries.get(), List.class);
    }
    
    @Generated
    public List getCompiledOhosJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.compiledOhosJars.get(), List.class);
    }
    
    @Generated
    public Map getHasAddLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.hasAddLibraries.get(), Map.class);
    }
    
    @Generated
    public Map getHasAddJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.hasAddJars.get(), Map.class);
    }
    
    @Generated
    public Map getAllDependencyArtifacts() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.allDependencyArtifacts.get(), Map.class);
    }
    
    @Generated
    public Map getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.transformMap.get(), Map.class);
    }
    
    @Generated
    public Set getNotResolvedDependencies() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.notResolvedDependencies.get(), Set.class);
    }
    
    @Generated
    public boolean getIsOptional() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.isOptional.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public static Object getAllClasspathArtifacts(Configuration configuration, HashMap allDependencyArtifacts) {
    Reference reference = new Reference(allDependencyArtifacts);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set configResolvedArtifacts = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].call(arrayOfCallSite[60].call(configuration)), Set.class);
    return arrayOfCallSite[61].call(configResolvedArtifacts, new _getAllClasspathArtifacts_closure6(DependencyManager.class, DependencyManager.class, reference));
  }
  
  public final class _getAllClasspathArtifacts_closure6 extends Closure implements GeneratedClosure {
    public _getAllClasspathArtifacts_closure6(Object _outerInstance, Object _thisObject, Reference allDependencyArtifacts) {
      super(_outerInstance, _thisObject);
      Reference reference = allDependencyArtifacts;
      this.allDependencyArtifacts = reference;
    }
    
    public Object doCall(Object resolvedArtifact) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ModuleVersionIdentifier id = (ModuleVersionIdentifier)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(resolvedArtifact)), ModuleVersionIdentifier.class);
      List moduleArtifacts = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(this.allDependencyArtifacts.get(), id), List.class);
      if (ScriptBytecodeAdapter.compareEqual(moduleArtifacts, null)) {
        Object object = arrayOfCallSite[3].callConstructor(ArrayList.class);
        moduleArtifacts = (List)ScriptBytecodeAdapter.castToType(object, List.class);
        arrayOfCallSite[4].call(this.allDependencyArtifacts.get(), id, moduleArtifacts);
      } 
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(moduleArtifacts, resolvedArtifact)))
        return arrayOfCallSite[6].call(moduleArtifacts, resolvedArtifact); 
      return null;
    }
    
    @Generated
    public HashMap getAllDependencyArtifacts() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (HashMap)ScriptBytecodeAdapter.castToType(this.allDependencyArtifacts.get(), HashMap.class);
    }
  }
  
  public Object collectDependency(ResolvedComponentResult resolvedComponentResult, VariantDependency variantDependency, List findOhosLibraries, List findOhosJars, Map hasAddLibraries, Map hasAddJars, Map allDependencyArtifacts, Map transformMap, Set notResolvedDependencies, List projectChain, boolean isOptional) {
    Reference reference1 = new Reference(variantDependency), reference2 = new Reference(transformMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ModuleVersionIdentifier id = (ModuleVersionIdentifier)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].call(resolvedComponentResult), ModuleVersionIdentifier.class);
    List libsForThisModule = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].call(hasAddLibraries, id), List.class);
    List jarsForThisModule = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[64].call(hasAddJars, id), List.class);
    if (ScriptBytecodeAdapter.compareNotEqual(libsForThisModule, null)) {
      arrayOfCallSite[65].call(findOhosLibraries, libsForThisModule);
      arrayOfCallSite[66].call(libsForThisModule, new _collectDependency_closure7(this, this, reference2, reference1));
      if (ScriptBytecodeAdapter.compareNotEqual(jarsForThisModule, null))
        return arrayOfCallSite[67].call(findOhosJars, jarsForThisModule); 
      return null;
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(jarsForThisModule, null))
      return arrayOfCallSite[68].call(findOhosJars, jarsForThisModule); 
    List transitiveLibraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].callConstructor(ArrayList.class), List.class);
    List transitiveJars = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[70].callConstructor(ArrayList.class), List.class);
    if (ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[71].call(arrayOfCallSite[72].callGetProperty(resolvedComponentResult)), Integer.valueOf(0)))
      arrayOfCallSite[73].callCurrent(this, ArrayUtil.createArray(transitiveLibraries, transitiveJars, resolvedComponentResult, projectChain, reference1.get(), hasAddLibraries, hasAddJars, allDependencyArtifacts, reference2.get(), notResolvedDependencies, Boolean.valueOf(isOptional))); 
    List moduleArtifacts = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[74].call(allDependencyArtifacts, id), List.class);
    ComponentIdentifier identifier = (ComponentIdentifier)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(resolvedComponentResult), ComponentIdentifier.class);
    String gradlePath = ShortTypeHandling.castToString((identifier instanceof org.gradle.api.artifacts.component.ProjectComponentIdentifier) ? arrayOfCallSite[76].call(identifier) : null);
    if (ScriptBytecodeAdapter.compareNotEqual(moduleArtifacts, null))
      return arrayOfCallSite[77].callCurrent(this, ArrayUtil.createArray(moduleArtifacts, libsForThisModule, hasAddLibraries, id, transitiveLibraries, transitiveJars, gradlePath, Boolean.valueOf(isOptional), findOhosLibraries, reference2.get(), reference1.get(), jarsForThisModule, hasAddJars, findOhosJars)); 
    return null;
  }
  
  public final class _collectDependency_closure7 extends Closure implements GeneratedClosure {
    public _collectDependency_closure7(Object _outerInstance, Object _thisObject, Reference transformMap, Reference variantDependency) {
      super(_outerInstance, _thisObject);
      Reference reference1 = transformMap;
      this.transformMap = reference1;
      Reference reference2 = variantDependency;
      this.variantDependency = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.transformMap.get(), it, this.variantDependency.get());
    }
    
    @Generated
    public Map getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.transformMap.get(), Map.class);
    }
    
    @Generated
    public VariantDependency getVariantDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantDependency)ScriptBytecodeAdapter.castToType(this.variantDependency.get(), VariantDependency.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private List<ResolvedArtifact> addDependencies(List moduleArtifacts, List libsForThisModule, Object hasAddLibraries, ModuleVersionIdentifier id, List transitiveLibraries, List transitiveJars, String gradlePath, boolean isOptional, Object findOhosLibraries, Object transformMap, VariantDependency variantDependency, List jarsForThisModule, Object hasAddJars, Object findOhosJars) {
    Reference reference1 = new Reference(libsForThisModule), reference2 = new Reference(hasAddLibraries), reference3 = new Reference(id), reference4 = new Reference(transitiveLibraries), reference5 = new Reference(transitiveJars), reference6 = new Reference(gradlePath), reference7 = new Reference(Boolean.valueOf(isOptional)), reference8 = new Reference(findOhosLibraries), reference9 = new Reference(transformMap), reference10 = new Reference(variantDependency), reference11 = new Reference(jarsForThisModule), reference12 = new Reference(hasAddJars), reference13 = new Reference(findOhosJars);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List<ResolvedArtifact>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].call(moduleArtifacts, new _addDependencies_closure8(this, this, reference3, reference1, reference2, reference4, reference5, reference6, reference7, reference8, reference9, reference10, reference11, reference12, reference13)), List.class);
  }
  
  public final class _addDependencies_closure8 extends Closure implements GeneratedClosure {
    public _addDependencies_closure8(Object _outerInstance, Object _thisObject, Reference id, Reference libsForThisModule, Reference hasAddLibraries, Reference transitiveLibraries, Reference transitiveJars, Reference gradlePath, Reference isOptional, Reference findOhosLibraries, Reference transformMap, Reference variantDependency, Reference jarsForThisModule, Reference hasAddJars, Reference findOhosJars) {
      super(_outerInstance, _thisObject);
      Reference reference1 = id;
      this.id = reference1;
      Reference reference2 = libsForThisModule;
      this.libsForThisModule = reference2;
      Reference reference3 = hasAddLibraries;
      this.hasAddLibraries = reference3;
      Reference reference4 = transitiveLibraries;
      this.transitiveLibraries = reference4;
      Reference reference5 = transitiveJars;
      this.transitiveJars = reference5;
      Reference reference6 = gradlePath;
      this.gradlePath = reference6;
      Reference reference7 = isOptional;
      this.isOptional = reference7;
      Reference reference8 = findOhosLibraries;
      this.findOhosLibraries = reference8;
      Reference reference9 = transformMap;
      this.transformMap = reference9;
      Reference reference10 = variantDependency;
      this.variantDependency = reference10;
      Reference reference11 = jarsForThisModule;
      this.jarsForThisModule = reference11;
      Reference reference12 = hasAddJars;
      this.hasAddJars = reference12;
      Reference reference13 = findOhosJars;
      this.findOhosJars = reference13;
    }
    
    public Object doCall(Object artifact) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String name = ShortTypeHandling.castToString(arrayOfCallSite[0].callStatic(DependencyManager.class, this.id.get(), artifact));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call("har", arrayOfCallSite[2].call(artifact)))) {
        if (ScriptBytecodeAdapter.compareEqual(this.libsForThisModule.get(), null)) {
          Object object = arrayOfCallSite[3].callConstructor(ArrayList.class);
          this.libsForThisModule.set(ScriptBytecodeAdapter.castToType(object, List.class));
          arrayOfCallSite[4].call(this.hasAddLibraries.get(), this.id.get(), this.libsForThisModule.get());
        } 
        File explodedDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callStatic(DependencyManager.class, arrayOfCallSite[6].callGroovyObjectGetProperty(this), this.id.get(), artifact), File.class);
        LibraryInfo libInfo = (LibraryInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(LibraryInfo.class, ArrayUtil.createArray(arrayOfCallSite[8].call(artifact), explodedDir, this.transitiveLibraries.get(), this.transitiveJars.get(), name, arrayOfCallSite[9].call(artifact), this.gradlePath.get(), null, arrayOfCallSite[10].callConstructor(MavenCoordinatesImpl.class, artifact), this.isOptional.get())), LibraryInfo.class);
        arrayOfCallSite[11].call(this.libsForThisModule.get(), libInfo);
        arrayOfCallSite[12].call(this.findOhosLibraries.get(), libInfo);
        return arrayOfCallSite[13].call(this.transformMap.get(), libInfo, this.variantDependency.get());
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call("jar", arrayOfCallSite[15].call(artifact)))) {
        if (ScriptBytecodeAdapter.compareEqual(this.jarsForThisModule.get(), null)) {
          Object object = arrayOfCallSite[16].callConstructor(ArrayList.class);
          this.jarsForThisModule.set(ScriptBytecodeAdapter.castToType(object, List.class));
          arrayOfCallSite[17].call(this.hasAddJars.get(), this.id.get(), this.jarsForThisModule.get());
        } 
        JarInfo jarInfo = (JarInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].callConstructor(JarInfo.class, arrayOfCallSite[19].call(artifact), this.gradlePath.get(), arrayOfCallSite[20].callConstructor(MavenCoordinatesImpl.class, artifact), this.transitiveJars.get()), JarInfo.class);
        arrayOfCallSite[21].call(this.jarsForThisModule.get(), jarInfo);
        return arrayOfCallSite[22].call(this.findOhosJars.get(), jarInfo);
      } 
      return arrayOfCallSite[23].call(arrayOfCallSite[24].callGetProperty(DependencyManager.class), arrayOfCallSite[25].call(String.class, ArrayUtil.createArray(arrayOfCallSite[26].callGetProperty(Locale.class), "Unrecognized dependency: '%s' (type: '%s', extension: '%s')", arrayOfCallSite[27].callGetProperty(artifact), arrayOfCallSite[28].call(artifact), arrayOfCallSite[29].call(artifact))));
    }
    
    @Generated
    public ModuleVersionIdentifier getId() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ModuleVersionIdentifier)ScriptBytecodeAdapter.castToType(this.id.get(), ModuleVersionIdentifier.class);
    }
    
    @Generated
    public List getLibsForThisModule() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.libsForThisModule.get(), List.class);
    }
    
    @Generated
    public Object getHasAddLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.hasAddLibraries.get();
    }
    
    @Generated
    public List getTransitiveLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.transitiveLibraries.get(), List.class);
    }
    
    @Generated
    public List getTransitiveJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.transitiveJars.get(), List.class);
    }
    
    @Generated
    public String getGradlePath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.gradlePath.get());
    }
    
    @Generated
    public boolean getIsOptional() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.isOptional.get());
    }
    
    @Generated
    public Object getFindOhosLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.findOhosLibraries.get();
    }
    
    @Generated
    public Object getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.transformMap.get();
    }
    
    @Generated
    public VariantDependency getVariantDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantDependency)ScriptBytecodeAdapter.castToType(this.variantDependency.get(), VariantDependency.class);
    }
    
    @Generated
    public List getJarsForThisModule() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.jarsForThisModule.get(), List.class);
    }
    
    @Generated
    public Object getHasAddJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.hasAddJars.get();
    }
    
    @Generated
    public Object getFindOhosJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.findOhosJars.get();
    }
  }
  
  private void addTransitiveDependency(List transitiveLibraries, List transitiveJars, ResolvedComponentResult resolvedComponentResult, List projectChain, VariantDependency variantDependency, Map hasAddLibraries, Map hasAddJars, Map allDependencyArtifacts, Map transformMap, Set notResolvedDependencies, boolean isOptional) {
    Reference reference1 = new Reference(transitiveLibraries), reference2 = new Reference(transitiveJars), reference3 = new Reference(projectChain), reference4 = new Reference(variantDependency), reference5 = new Reference(hasAddLibraries), reference6 = new Reference(hasAddJars), reference7 = new Reference(allDependencyArtifacts), reference8 = new Reference(transformMap), reference9 = new Reference(notResolvedDependencies), reference10 = new Reference(Boolean.valueOf(isOptional));
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set dependencies = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[79].call(resolvedComponentResult), Set.class);
    arrayOfCallSite[80].call(dependencies, new _addTransitiveDependency_closure9(this, this, reference3, reference4, reference1, reference2, reference5, reference6, reference7, reference8, reference9, reference10));
  }
  
  public final class _addTransitiveDependency_closure9 extends Closure implements GeneratedClosure {
    public _addTransitiveDependency_closure9(Object _outerInstance, Object _thisObject, Reference projectChain, Reference variantDependency, Reference transitiveLibraries, Reference transitiveJars, Reference hasAddLibraries, Reference hasAddJars, Reference allDependencyArtifacts, Reference transformMap, Reference notResolvedDependencies, Reference isOptional) {
      super(_outerInstance, _thisObject);
      Reference reference1 = projectChain;
      this.projectChain = reference1;
      Reference reference2 = variantDependency;
      this.variantDependency = reference2;
      Reference reference3 = transitiveLibraries;
      this.transitiveLibraries = reference3;
      Reference reference4 = transitiveJars;
      this.transitiveJars = reference4;
      Reference reference5 = hasAddLibraries;
      this.hasAddLibraries = reference5;
      Reference reference6 = hasAddJars;
      this.hasAddJars = reference6;
      Reference reference7 = allDependencyArtifacts;
      this.allDependencyArtifacts = reference7;
      Reference reference8 = transformMap;
      this.transformMap = reference8;
      Reference reference9 = notResolvedDependencies;
      this.notResolvedDependencies = reference9;
      Reference reference10 = isOptional;
      this.isOptional = reference10;
    }
    
    public Object doCall(Object dependencyResult) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (dependencyResult instanceof org.gradle.api.artifacts.result.ResolvedDependencyResult) {
        ResolvedComponentResult selected = (ResolvedComponentResult)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(dependencyResult), ResolvedComponentResult.class);
        List nextProject = (List)ScriptBytecodeAdapter.castToType(this.projectChain.get(), List.class);
        ComponentIdentifier identifier = (ComponentIdentifier)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(selected), ComponentIdentifier.class);
        if (identifier instanceof org.gradle.api.artifacts.component.ProjectComponentIdentifier) {
          String projectPath = ShortTypeHandling.castToString(arrayOfCallSite[2].call(identifier));
          int index = DefaultTypeTransformation.intUnbox(arrayOfCallSite[3].call(this.projectChain.get(), projectPath));
          if (ScriptBytecodeAdapter.compareNotEqual(Integer.valueOf(index), Integer.valueOf(-1))) {
            arrayOfCallSite[4].call(this.projectChain.get(), projectPath);
            throw (Throwable)arrayOfCallSite[5].callConstructor(GradleException.class, "Error loop");
          } 
          Object object = arrayOfCallSite[6].callConstructor(ArrayList.class);
          nextProject = (List)ScriptBytecodeAdapter.castToType(object, List.class);
          arrayOfCallSite[7].call(nextProject, this.projectChain.get());
          arrayOfCallSite[8].call(nextProject, projectPath);
        } 
        return arrayOfCallSite[9].callCurrent((GroovyObject)this, ArrayUtil.createArray(selected, this.variantDependency.get(), this.transitiveLibraries.get(), this.transitiveJars.get(), this.hasAddLibraries.get(), this.hasAddJars.get(), this.allDependencyArtifacts.get(), this.transformMap.get(), this.notResolvedDependencies.get(), nextProject, this.isOptional.get()));
      } 
      if (dependencyResult instanceof UnresolvedDependencyResult) {
        ComponentSelector attempted = (ComponentSelector)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(ScriptBytecodeAdapter.castToType(dependencyResult, UnresolvedDependencyResult.class)), ComponentSelector.class);
        if (ScriptBytecodeAdapter.compareNotEqual(attempted, null))
          return arrayOfCallSite[11].call(this.notResolvedDependencies.get(), arrayOfCallSite[12].call(attempted)); 
        return null;
      } 
      return null;
    }
    
    @Generated
    public List getProjectChain() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.projectChain.get(), List.class);
    }
    
    @Generated
    public VariantDependency getVariantDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (VariantDependency)ScriptBytecodeAdapter.castToType(this.variantDependency.get(), VariantDependency.class);
    }
    
    @Generated
    public List getTransitiveLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.transitiveLibraries.get(), List.class);
    }
    
    @Generated
    public List getTransitiveJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.transitiveJars.get(), List.class);
    }
    
    @Generated
    public Map getHasAddLibraries() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.hasAddLibraries.get(), Map.class);
    }
    
    @Generated
    public Map getHasAddJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.hasAddJars.get(), Map.class);
    }
    
    @Generated
    public Map getAllDependencyArtifacts() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.allDependencyArtifacts.get(), Map.class);
    }
    
    @Generated
    public Map getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.transformMap.get(), Map.class);
    }
    
    @Generated
    public Set getNotResolvedDependencies() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.notResolvedDependencies.get(), Set.class);
    }
    
    @Generated
    public boolean getIsOptional() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.isOptional.get());
    }
  }
  
  public static File computeArtifactExplodedDir(Project project, ModuleVersionIdentifier moduleVersion, ResolvedArtifact artifact) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File filePath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[81].call(arrayOfCallSite[82].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[83].callGetProperty(arrayOfCallSite[84].callGetProperty(arrayOfCallSite[85].callGetProperty(project))), "caches", "transforms-h", arrayOfCallSite[86].callGetProperty(moduleVersion), arrayOfCallSite[87].callGetProperty(arrayOfCallSite[88].call(artifact))))), File.class);
    return filePath;
  }
  
  public static String getArtifactName(ModuleVersionIdentifier moduleVersion, ResolvedArtifact artifact) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    StringBuilder artifactNameBuilder = (StringBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[89].callConstructor(StringBuilder.class), StringBuilder.class);
    arrayOfCallSite[90]
      
      .call(arrayOfCallSite[91].call(arrayOfCallSite[92].call(arrayOfCallSite[93].call(arrayOfCallSite[94].call(artifactNameBuilder, arrayOfCallSite[95].call(moduleVersion)), ":"), arrayOfCallSite[96].call(moduleVersion)), ":"), arrayOfCallSite[97].call(moduleVersion));
    String classifier = ShortTypeHandling.castToString(arrayOfCallSite[98].call(artifact));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[99].call(StringHandler.class, classifier)))
      arrayOfCallSite[100].call(arrayOfCallSite[101].call(artifactNameBuilder, ":"), classifier); 
    return ShortTypeHandling.castToString(arrayOfCallSite[102].call(artifactNameBuilder));
  }
  
  public Object gatherJarDependenciesFromLibraries(Set outJarInfos, Collection inLibraryDependencies) {
    Reference reference = new Reference(outJarInfos);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[103].call(inLibraryDependencies, new _gatherJarDependenciesFromLibraries_closure10(this, this, reference));
  }
  
  public final class _gatherJarDependenciesFromLibraries_closure10 extends Closure implements GeneratedClosure {
    public _gatherJarDependenciesFromLibraries_closure10(Object _outerInstance, Object _thisObject, Reference outJarInfos) {
      super(_outerInstance, _thisObject);
      Reference reference = outJarInfos;
      this.outJarInfos = reference;
    }
    
    public Object doCall(Object libInfo) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.outJarInfos.get(), arrayOfCallSite[1].call(libInfo), Boolean.valueOf(true), Boolean.valueOf(!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(libInfo))));
      return arrayOfCallSite[3].callCurrent((GroovyObject)this, this.outJarInfos.get(), arrayOfCallSite[4].call(libInfo));
    }
    
    @Generated
    public Set getOutJarInfos() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.outJarInfos.get(), Set.class);
    }
  }
  
  public Object gatherJarDependencies(Set outJarInfos, Collection inJarInfos, boolean compiled, boolean packaged) {
    Reference reference1 = new Reference(outJarInfos), reference2 = new Reference(Boolean.valueOf(compiled)), reference3 = new Reference(Boolean.valueOf(packaged));
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[104].call(inJarInfos, new _gatherJarDependencies_closure11(this, this, reference1, reference2, reference3));
  }
  
  public final class _gatherJarDependencies_closure11 extends Closure implements GeneratedClosure {
    public _gatherJarDependencies_closure11(Object _outerInstance, Object _thisObject, Reference outJarInfos, Reference compiled, Reference packaged) {
      super(_outerInstance, _thisObject);
      Reference reference1 = outJarInfos;
      this.outJarInfos = reference1;
      Reference reference2 = compiled;
      this.compiled = reference2;
      Reference reference3 = packaged;
      this.packaged = reference3;
    }
    
    public Object doCall(Object jarInfo) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.outJarInfos.get(), jarInfo)))
        arrayOfCallSite[1].call(this.outJarInfos.get(), jarInfo); 
      if (DefaultTypeTransformation.booleanUnbox(this.compiled.get()))
        arrayOfCallSite[2].call(jarInfo, Boolean.valueOf(true)); 
      if (DefaultTypeTransformation.booleanUnbox(this.packaged.get()))
        arrayOfCallSite[3].call(jarInfo, Boolean.valueOf(true)); 
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, this.outJarInfos.get(), arrayOfCallSite[5].call(jarInfo), this.compiled.get(), this.packaged.get());
    }
    
    @Generated
    public Set getOutJarInfos() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.outJarInfos.get(), Set.class);
    }
    
    @Generated
    public boolean getCompiled() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.compiled.get());
    }
    
    @Generated
    public boolean getPackaged() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.packaged.get());
    }
  }
  
  public List<LibraryDependencyImpl> convertLibraryInfoIntoDependency(List libInfos, Map transformMap) {
    Reference reference1 = new Reference(transformMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference list = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[105].callConstructor(ArrayList.class, arrayOfCallSite[106].call(libInfos)), List.class));
    Reference convertedMap = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[107].callConstructor(IdentityHashMap.class), Map.class));
    arrayOfCallSite[108].call(libInfos, new _convertLibraryInfoIntoDependency_closure12(this, this, list, reference1, convertedMap));
    return (List<LibraryDependencyImpl>)list.get();
  }
  
  public final class _convertLibraryInfoIntoDependency_closure12 extends Closure implements GeneratedClosure {
    public _convertLibraryInfoIntoDependency_closure12(Object _outerInstance, Object _thisObject, Reference list, Reference transformMap, Reference convertedMap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = list;
      this.list = reference1;
      Reference reference2 = transformMap;
      this.transformMap = reference2;
      Reference reference3 = convertedMap;
      this.convertedMap = reference3;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.list.get(), arrayOfCallSite[1].callCurrent((GroovyObject)this, it, this.transformMap.get(), this.convertedMap.get()));
    }
    
    @Generated
    public List getList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.list.get(), List.class);
    }
    
    @Generated
    public Map getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.transformMap.get(), Map.class);
    }
    
    @Generated
    public Map getConvertedMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.convertedMap.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public LibraryDependencyImpl transformLibInfo(LibraryInfo libInfo, Map transformMap, Map convertedMap) {
    Reference reference1 = new Reference(transformMap), reference2 = new Reference(convertedMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    LibraryDependencyImpl convertedLib = (LibraryDependencyImpl)ScriptBytecodeAdapter.castToType(arrayOfCallSite[109].call(reference2.get(), libInfo), LibraryDependencyImpl.class);
    if (ScriptBytecodeAdapter.compareEqual(convertedLib, null)) {
      List children = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[110].call(libInfo), List.class);
      Reference convertedChildren = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[111].callConstructor(ArrayList.class, arrayOfCallSite[112].call(children)), List.class));
      arrayOfCallSite[113].call(children, new _transformLibInfo_closure13(this, this, convertedChildren, reference1, reference2));
      Object object = arrayOfCallSite[114].callConstructor(LibraryDependencyImpl.class, ArrayUtil.createArray(arrayOfCallSite[115].call(libInfo), arrayOfCallSite[116].call(libInfo), convertedChildren.get(), arrayOfCallSite[117].call(libInfo), arrayOfCallSite[118].call(libInfo), arrayOfCallSite[119].call(libInfo), arrayOfCallSite[120].call(libInfo), arrayOfCallSite[121].call(libInfo), arrayOfCallSite[122].call(libInfo)));
      convertedLib = (LibraryDependencyImpl)ScriptBytecodeAdapter.castToType(object, LibraryDependencyImpl.class);
      arrayOfCallSite[123].call(reference2.get(), libInfo, convertedLib);
      VariantDependency values = (VariantDependency)ScriptBytecodeAdapter.castToType(arrayOfCallSite[124].call(reference1.get(), libInfo), VariantDependency.class);
      arrayOfCallSite[125].call(reference1.get(), libInfo);
      arrayOfCallSite[126].call(reference1.get(), libInfo, values);
    } 
    return convertedLib;
  }
  
  public final class _transformLibInfo_closure13 extends Closure implements GeneratedClosure {
    public _transformLibInfo_closure13(Object _outerInstance, Object _thisObject, Reference convertedChildren, Reference transformMap, Reference convertedMap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = convertedChildren;
      this.convertedChildren = reference1;
      Reference reference2 = transformMap;
      this.transformMap = reference2;
      Reference reference3 = convertedMap;
      this.convertedMap = reference3;
    }
    
    public Object doCall(Object child) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.convertedChildren.get(), arrayOfCallSite[1].callCurrent((GroovyObject)this, child, this.transformMap.get(), this.convertedMap.get()));
    }
    
    @Generated
    public List getConvertedChildren() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.convertedChildren.get(), List.class);
    }
    
    @Generated
    public Map getTransformMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.transformMap.get(), Map.class);
    }
    
    @Generated
    public Map getConvertedMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.convertedMap.get(), Map.class);
    }
  }
  
  public Object collectAllNeedExplodedHarLibrary(LibraryDependency libraryDependency, Set allHarDependency) {
    Reference reference = new Reference(allHarDependency);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[127].callGetProperty(libraryDependency), null))
      arrayOfCallSite[128].call(reference.get(), libraryDependency); 
    return arrayOfCallSite[129].call(arrayOfCallSite[130].callGetProperty(libraryDependency), new _collectAllNeedExplodedHarLibrary_closure14(this, this, reference));
  }
  
  public final class _collectAllNeedExplodedHarLibrary_closure14 extends Closure implements GeneratedClosure {
    public _collectAllNeedExplodedHarLibrary_closure14(Object _outerInstance, Object _thisObject, Reference allHarDependency) {
      super(_outerInstance, _thisObject);
      Reference reference = allHarDependency;
      this.allHarDependency = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callCurrent((GroovyObject)this, it, this.allHarDependency.get());
    }
    
    @Generated
    public Set getAllHarDependency() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.allHarDependency.get(), Set.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public Object addHarClassesDependency(Set allHarDependency) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[131].call(allHarDependency, new _addHarClassesDependency_closure15(this, this));
  }
  
  public final class _addHarClassesDependency_closure15 extends Closure implements GeneratedClosure {
    public _addHarClassesDependency_closure15(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String harFileName = ShortTypeHandling.castToString(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(it)));
      String outPutPath = ShortTypeHandling.castToString(arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].callGetProperty(it)));
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].callGetProperty(it), outPutPath);
      File harClassesJarFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, outPutPath, "classes.jar")), File.class);
      String changeName = ShortTypeHandling.castToString(arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(harClassesJarFile), "classes", arrayOfCallSite[11].call(arrayOfCallSite[12].call(FileUtils.class, harFileName), "@jar")));
      String newFilePath = ShortTypeHandling.castToString(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].callGetProperty(harClassesJarFile)), changeName));
      File newFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(arrayOfCallSite[17].call(Paths.class, newFilePath)), File.class);
      if ((ScriptBytecodeAdapter.compareNotEqual(newFile, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(newFile))))
        arrayOfCallSite[19].call(newFile); 
      arrayOfCallSite[20].call(harClassesJarFile, newFile);
      return arrayOfCallSite[21].call(harClassesJarFile);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
