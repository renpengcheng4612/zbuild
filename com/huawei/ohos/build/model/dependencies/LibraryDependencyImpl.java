package com.huawei.ohos.build.model.dependencies;

import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.StringJoiner;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class LibraryDependencyImpl extends LibraryBundle {
  @NonNull
  private final List<LibraryDependency> dependencies;
  
  @Nullable
  private final String variantName;
  
  @Nullable
  private final MavenCoordinates requestedCoordinates;
  
  @Nullable
  private final MavenCoordinates resolvedCoordinates;
  
  private final boolean isOptional;
  
  public LibraryDependencyImpl(@NonNull File bundle, @NonNull File explodedBundle, @NonNull List dependencies, @Nullable String name, @Nullable String variantName, @Nullable String projectPath, @Nullable MavenCoordinates requestedCoordinates, @Nullable MavenCoordinates resolvedCoordinates, boolean isOptional) {
    super(bundle, explodedBundle, name, projectPath);
    MetaClass metaClass = $getStaticMetaClass();
    List list = dependencies;
    this.dependencies = (List<LibraryDependency>)ScriptBytecodeAdapter.castToType(list, List.class);
    String str = variantName;
    this.variantName = ShortTypeHandling.castToString(str);
    MavenCoordinates mavenCoordinates1 = requestedCoordinates;
    this.requestedCoordinates = (MavenCoordinates)ScriptBytecodeAdapter.castToType(mavenCoordinates1, MavenCoordinates.class);
    MavenCoordinates mavenCoordinates2 = resolvedCoordinates;
    this.resolvedCoordinates = (MavenCoordinates)ScriptBytecodeAdapter.castToType(mavenCoordinates2, MavenCoordinates.class);
    boolean bool = isOptional;
    this.isOptional = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public List<LibraryDependency> getDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dependencies;
  }
  
  public List<? extends HarmonyLibrary> getLibraryDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (List)this.dependencies;
  }
  
  public boolean isOptional() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].callGroovyObjectGetProperty(this));
  }
  
  @Nullable
  public String getVariantName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantName;
  }
  
  public MavenCoordinates getRequestedCoordinates() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.requestedCoordinates;
  }
  
  public MavenCoordinates getResolvedCoordinates() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.resolvedCoordinates;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].callConstructor(StringJoiner.class, ",", arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(LibraryDependencyImpl.class), "["), "]"), arrayOfCallSite[11].call("dependencies:", this.dependencies)), arrayOfCallSite[12].call("variantName:", this.variantName)), arrayOfCallSite[13].call("requestedCoordinates:", this.requestedCoordinates)), arrayOfCallSite[14].call("resolvedCoordinates:", this.resolvedCoordinates)), arrayOfCallSite[15].call("isOptional:", Boolean.valueOf(this.isOptional))), arrayOfCallSite[16].call("super:", arrayOfCallSite[17].call(Object.class)))));
  }
}
