package com.huawei.ohos.build.model.dependencies;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.StringJoiner;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class JarDependency implements GroovyObject {
  @Nonnull
  private final File mJarFile;
  
  private final boolean mCompiled;
  
  private final boolean mPackaged;
  
  @Nullable
  private final String mProjectPath;
  
  @Nullable
  private final MavenCoordinates mResolvedCoordinates;
  
  public JarDependency(@Nonnull File jarFile, boolean compiled, boolean packaged, @Nullable MavenCoordinates resolvedCoordinates, @Nullable String projectPath) {
    MetaClass metaClass = $getStaticMetaClass();
    File file = jarFile;
    boolean bool1 = compiled;
    boolean bool2 = packaged;
    MavenCoordinates mavenCoordinates = resolvedCoordinates;
    String str = projectPath;
  }
  
  @Nonnull
  public File getJarFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mJarFile;
  }
  
  public boolean isCompiled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mCompiled;
  }
  
  public boolean isPackaged() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mPackaged;
  }
  
  @Nullable
  public MavenCoordinates getResolvedCoordinates() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mResolvedCoordinates;
  }
  
  @Nullable
  public String getProjectPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mProjectPath;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callConstructor(StringJoiner.class, ",", arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(JarDependency.class), "["), "]"), arrayOfCallSite[8].call("jarFile:", arrayOfCallSite[9].callGroovyObjectGetProperty(this))), arrayOfCallSite[10].call("compiled:", Boolean.valueOf(this.mCompiled))), arrayOfCallSite[11].call("packaged:", Boolean.valueOf(this.mPackaged))), arrayOfCallSite[12].call("resolvedCoordinates:", arrayOfCallSite[13].callGroovyObjectGetProperty(this)))));
  }
}
