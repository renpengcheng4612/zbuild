package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
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
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class GenerateJsBin extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputDirectory
  private File projectDir;
  
  @OutputFile
  private File outputBinFile;
  
  static {
    Object object = $getCallSiteArray()[42].call(HMLogger.class, GenerateJsBin.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputFile
  @Optional
  public File getJsBinaryTool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File jsBinaryTool = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(this.sdkInfo))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(jsBinaryTool)))
      return jsBinaryTool; 
    return (File)ScriptBytecodeAdapter.castToType(null, File.class);
  }
  
  @Inject
  public GenerateJsBin(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].call(arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].call(this.pathInfo, arrayOfCallSite[6].callGroovyObjectGetProperty(variantData), arrayOfCallSite[7].callGetProperty(BuildConst.class))));
    this.projectDir = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    Object object5 = arrayOfCallSite[8].call(arrayOfCallSite[9].call(Paths.class, arrayOfCallSite[10].call(this.pathInfo, arrayOfCallSite[11].callGroovyObjectGetProperty(variantData), Boolean.valueOf(false))));
    this.outputBinFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].callGroovyObjectGetProperty(this), null))
      throw (Throwable)arrayOfCallSite[17].callConstructor(GradleException.class, arrayOfCallSite[18].call(arrayOfCallSite[19].call("JSBin is missing. Check the [", arrayOfCallSite[20].call(this.sdkInfo)), "] file or update the HarmonyOS SDK.")); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].call(this.outputBinFile))) {
      arrayOfCallSite[22].call(this.outputBinFile);
    } else {
      arrayOfCallSite[23].call(arrayOfCallSite[24].call(this.outputBinFile));
    } 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[26].call(builder, arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this))));
    JavaCommandBuilder.BinaryToolOptions options = (JavaCommandBuilder.BinaryToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callConstructor(JavaCommandBuilder.BinaryToolOptions.class, builder), JavaCommandBuilder.BinaryToolOptions.class);
    arrayOfCallSite[31]
      .call(arrayOfCallSite[32].call(options, arrayOfCallSite[33].call(arrayOfCallSite[34].call(this.projectDir))), arrayOfCallSite[35].call(this.outputBinFile));
    arrayOfCallSite[36].call(hmLogger, "bin", arrayOfCallSite[37].call(builder));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].callConstructor(ProcessUtils.class, arrayOfCallSite[39].callGroovyObjectGetProperty(this), "Package bin failed"), ProcessUtils.class);
    arrayOfCallSite[40].call(processUtils, arrayOfCallSite[41].call(builder), hmLogger);
  }
  
  @Generated
  public File getProjectDir() {
    return this.projectDir;
  }
  
  @Generated
  public void setProjectDir(File paramFile) {
    this.projectDir = paramFile;
  }
  
  @Generated
  public File getOutputBinFile() {
    return this.outputBinFile;
  }
  
  @Generated
  public void setOutputBinFile(File paramFile) {
    this.outputBinFile = paramFile;
  }
}
