package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.compile.JavaCompile;

public class CompileShellJavaWithJavac extends JavaCompile implements GroovyObject {
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private SdkInfo sdkInfo;
  
  @Internal
  private PathInfo pathInfo;
  
  @Internal
  private BuildType buildType;
  
  @OutputDirectory
  private File destDir;
  
  @InputDirectory
  private File RJavaSrc;
  
  @InputDirectory
  private File projectSrc;
  
  @InputFile
  private File androidJar;
  
  @InputDirectory
  private File harmonyJar;
  
  @Inject
  public CompileShellJavaWithJavac(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(this.configInfo)))
      return; 
    Object object3 = arrayOfCallSite[3].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[4].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[5].callConstructor(File.class, arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(this.sdkInfo), arrayOfCallSite[9].callGetProperty(File.class)), arrayOfCallSite[10].callGetProperty(SdkConst.class)));
    this.androidJar = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[11].callConstructor(File.class, arrayOfCallSite[12].call(arrayOfCallSite[13].call(this.sdkInfo), arrayOfCallSite[14].callGetProperty(File.class)));
    this.harmonyJar = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[15].callConstructor(File.class, arrayOfCallSite[16].call(this.pathInfo));
    this.projectSrc = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[17].callConstructor(File.class, arrayOfCallSite[18].call(arrayOfCallSite[19].call(arrayOfCallSite[20].call(this.pathInfo), arrayOfCallSite[21].callGetProperty(File.class)), "r"));
    this.RJavaSrc = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), this.harmonyJar), this.androidJar);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object9, CompileShellJavaWithJavac.class, this, "classpath");
    Object object10 = arrayOfCallSite[26].call(arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), this.projectSrc), arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), this.RJavaSrc));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object10, CompileShellJavaWithJavac.class, this, "source");
    Object object11 = arrayOfCallSite[31].callConstructor(File.class, arrayOfCallSite[32].call(this.pathInfo));
    this.destDir = (File)ScriptBytecodeAdapter.castToType(object11, File.class);
    File file = this.destDir;
    ScriptBytecodeAdapter.setGroovyObjectProperty(file, CompileShellJavaWithJavac.class, this, "destinationDir");
    String str1 = "1.8";
    ScriptBytecodeAdapter.setGroovyObjectProperty(str1, CompileShellJavaWithJavac.class, this, "sourceCompatibility");
    String str2 = "1.8";
    ScriptBytecodeAdapter.setGroovyObjectProperty(str2, CompileShellJavaWithJavac.class, this, "targetCompatibility");
    Object object12 = arrayOfCallSite[33].callGetProperty(StandardCharsets.class);
    ScriptBytecodeAdapter.setProperty(object12, null, arrayOfCallSite[34].callGroovyObjectGetProperty(this), "encoding");
    arrayOfCallSite[35].callCurrent(this, "**\\*.java");
    Object object13 = arrayOfCallSite[36].callGetProperty(arrayOfCallSite[37].callGroovyObjectGetProperty(variantData));
    ScriptBytecodeAdapter.setProperty(object13, null, arrayOfCallSite[38].callGroovyObjectGetProperty(this), "debug");
  }
  
  @Generated
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
  }
  
  @Generated
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
  }
  
  @Generated
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
  }
  
  @Generated
  public File getDestDir() {
    return this.destDir;
  }
  
  @Generated
  public void setDestDir(File paramFile) {
    this.destDir = paramFile;
  }
  
  @Generated
  public File getRJavaSrc() {
    return this.RJavaSrc;
  }
  
  @Generated
  public void setRJavaSrc(File paramFile) {
    this.RJavaSrc = paramFile;
  }
  
  @Generated
  public File getProjectSrc() {
    return this.projectSrc;
  }
  
  @Generated
  public void setProjectSrc(File paramFile) {
    this.projectSrc = paramFile;
  }
  
  @Generated
  public File getAndroidJar() {
    return this.androidJar;
  }
  
  @Generated
  public void setAndroidJar(File paramFile) {
    this.androidJar = paramFile;
  }
  
  @Generated
  public File getHarmonyJar() {
    return this.harmonyJar;
  }
  
  @Generated
  public void setHarmonyJar(File paramFile) {
    this.harmonyJar = paramFile;
  }
}
