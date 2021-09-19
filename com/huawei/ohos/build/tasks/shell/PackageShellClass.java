package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.bundling.Jar;

public class PackageShellClass extends Jar implements GroovyObject {
  private BuildType buildType;
  
  private PathInfo pathInfo;
  
  @InputDirectory
  private File classesDir;
  
  @OutputFile
  private File classesJar;
  
  @Inject
  public PackageShellClass(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo)));
    this.classesDir = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    File classesJarDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(this.pathInfo))), File.class);
    Object object4 = arrayOfCallSite[8].call(arrayOfCallSite[9].call(Paths.class, arrayOfCallSite[10].call(this.pathInfo), arrayOfCallSite[11].callGetProperty(BuildConst.class)));
    this.classesJar = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    File file1 = classesJarDir;
    ScriptBytecodeAdapter.setGroovyObjectProperty(file1, PackageShellClass.class, this, "destinationDirectory");
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), "classes");
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), "jar");
    arrayOfCallSite[16].callCurrent(this, "**\\*.class");
    arrayOfCallSite[17].callCurrent(this, arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), this.classesDir));
  }
  
  @Generated
  public File getClassesDir() {
    return this.classesDir;
  }
  
  @Generated
  public void setClassesDir(File paramFile) {
    this.classesDir = paramFile;
  }
  
  @Generated
  public File getClassesJar() {
    return this.classesJar;
  }
  
  @Generated
  public void setClassesJar(File paramFile) {
    this.classesJar = paramFile;
  }
}
