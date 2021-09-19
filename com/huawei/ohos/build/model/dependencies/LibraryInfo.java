package com.huawei.ohos.build.model.dependencies;

import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class LibraryInfo extends LibraryDependencyImpl {
  private final Collection<JarInfo> jarDependencies;
  
  private boolean isOptional;
  
  public LibraryInfo(@Nonnull File bundle, @Nonnull File explodedBundle, @Nonnull List<LibraryDependency> dependencies, @Nonnull Collection jarDependencies, @Nullable String name, @Nullable String variantName, @Nullable String projectPath, @Nullable MavenCoordinates requestedCoordinates, @Nullable MavenCoordinates resolvedCoordinates, boolean isOptional) {
    super(bundle, explodedBundle, dependencies, name, variantName, projectPath, requestedCoordinates, resolvedCoordinates, isOptional);
    MetaClass metaClass = $getStaticMetaClass();
    Collection collection = jarDependencies;
    this.jarDependencies = (Collection<JarInfo>)ScriptBytecodeAdapter.castToType(collection, Collection.class);
  }
  
  public void setIsOptional(boolean isOptional) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = isOptional;
    this.isOptional = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public boolean isOptional() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.isOptional;
  }
  
  @Nonnull
  public Collection<JarInfo> getJarDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jarDependencies;
  }
  
  @Nonnull
  public List<LibraryInfo> getLibInfoDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference libInfoList = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[1].call(arrayOfCallSite[2].callCurrent(this), new _getLibInfoDependencies_closure1(this, this, libInfoList));
    return (List<LibraryInfo>)libInfoList.get();
  }
  
  public final class _getLibInfoDependencies_closure1 extends Closure implements GeneratedClosure {
    public _getLibInfoDependencies_closure1(Object _outerInstance, Object _thisObject, Reference libInfoList) {
      super(_outerInstance, _thisObject);
      Reference reference = libInfoList;
      this.libInfoList = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (it instanceof LibraryInfo)
        return arrayOfCallSite[0].call(this.libInfoList.get(), ScriptBytecodeAdapter.createGroovyObjectWrapper((LibraryInfo)ScriptBytecodeAdapter.castToType(it, LibraryInfo.class), LibraryInfo.class)); 
      throw (Throwable)arrayOfCallSite[1].callConstructor(RuntimeException.class, "LibInfo and LibraryDependencies are not of the same class.");
    }
    
    @Generated
    public List getLibInfoList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.libInfoList.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
