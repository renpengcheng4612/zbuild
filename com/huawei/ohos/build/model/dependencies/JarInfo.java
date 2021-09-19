package com.huawei.ohos.build.model.dependencies;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class JarInfo implements GroovyObject {
  @Nonnull
  private final File jarFile;
  
  @Nonnull
  private final String gradlePath;
  
  @Nonnull
  private final List<JarInfo> dependencies;
  
  @Nonnull
  private final MavenCoordinates resolvedCoordinates;
  
  private boolean compiled;
  
  private boolean packaged;
  
  public JarInfo(File jarFile, String gradlePath, MavenCoordinates resolvedCoordinates) {
    Object object = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.dependencies = (List<JarInfo>)ScriptBytecodeAdapter.castToType(object, List.class);
    boolean bool1 = false, bool2 = false;
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[1].callConstructor(JarInfo.class, jarFile, gradlePath, resolvedCoordinates, arrayOfCallSite[2].call(Collections.class));
  }
  
  public JarInfo(File jarFile, String gradlePath, MavenCoordinates resolvedCoordinates, List dependencies) {
    Object object = arrayOfCallSite[3].callConstructor(ArrayList.class);
    this.dependencies = (List<JarInfo>)ScriptBytecodeAdapter.castToType(object, List.class);
    boolean bool1 = false, bool2 = false;
    MetaClass metaClass = $getStaticMetaClass();
    File file = jarFile;
    this.jarFile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
    String str = gradlePath;
    this.gradlePath = ShortTypeHandling.castToString(str);
    MavenCoordinates mavenCoordinates = resolvedCoordinates;
    this.resolvedCoordinates = (MavenCoordinates)ScriptBytecodeAdapter.castToType(mavenCoordinates, MavenCoordinates.class);
    arrayOfCallSite[4].call(this.dependencies, dependencies);
  }
  
  @Nonnull
  public File getJarFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jarFile;
  }
  
  @Nonnull
  public String getGradlePath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.gradlePath;
  }
  
  @Nonnull
  public List<JarInfo> getDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dependencies;
  }
  
  @Nonnull
  public MavenCoordinates getResolvedCoordinates() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.resolvedCoordinates;
  }
  
  public boolean getCompiled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compiled;
  }
  
  public void setCompiled(boolean compiled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = compiled;
    this.compiled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public boolean getPackaged() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packaged;
  }
  
  public void setPackaged(boolean packaged) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = packaged;
    this.packaged = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  @Nonnull
  public JarDependency createJarDependency() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (JarDependency)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(JarDependency.class, ArrayUtil.createArray(this.jarFile, Boolean.valueOf(this.compiled), Boolean.valueOf(this.packaged), this.resolvedCoordinates, this.gradlePath)), JarDependency.class);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].callConstructor(StringJoiner.class, ",", arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(JarInfo.class), "["), "]"), arrayOfCallSite[14].call("jarFile:", arrayOfCallSite[15].callGetProperty(this.jarFile))), arrayOfCallSite[16].call("gradlePath:", this.gradlePath)), arrayOfCallSite[17].call("MavenCoordinates", this.resolvedCoordinates)), arrayOfCallSite[18].call("dependencies:", this.dependencies))));
  }
}
