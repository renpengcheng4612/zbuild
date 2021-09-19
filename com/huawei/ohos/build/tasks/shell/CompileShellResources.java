package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.Aapt2CommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

public class CompileShellResources extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private ConfigInfo configInfo;
  
  @OutputFile
  private File outputFile;
  
  static {
    Object object = $getCallSiteArray()[39].call(HMLogger.class, CompileShellResources.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputDirectory
  @Optional
  public File getInputDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this), arrayOfCallSite[15].call(this.pathInfo)), File.class);
  }
  
  @Inject
  public CompileShellResources(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object4, ConfigInfo.class);
    File shellBuildResDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo))), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(FileUtils.class, shellBuildResDir)))
      arrayOfCallSite[8].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[9].callGetProperty(shellBuildResDir)); 
    Object object5 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Paths.class, arrayOfCallSite[12].call(this.pathInfo), "res.zip"));
    this.outputFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(this.configInfo)))
      return; 
    Object aapt2 = arrayOfCallSite[17].call(this.sdkInfo);
    Aapt2CommandBuilder builder = (Aapt2CommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].callConstructor(Aapt2CommandBuilder.class, aapt2), Aapt2CommandBuilder.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this)))) {
      arrayOfCallSite[21]
        
        .call(arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].call(builder)), arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this))), arrayOfCallSite[27].call(this.outputFile));
    } else {
      throw (Throwable)arrayOfCallSite[28].callConstructor(GradleException.class, arrayOfCallSite[29].call(String.class, arrayOfCallSite[30].callGetProperty(Locale.class), "An error happened in Task: %s. No available resource for building in shell.", arrayOfCallSite[31].callCurrent(this)));
    } 
    arrayOfCallSite[32].call(hmLogger, "aapt2", arrayOfCallSite[33].call(arrayOfCallSite[34].call(builder), " "));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].callConstructor(ProcessUtils.class, arrayOfCallSite[36].callGroovyObjectGetProperty(this), "Unable to build the resource. For details, see the log."), ProcessUtils.class);
    arrayOfCallSite[37].call(processUtils, arrayOfCallSite[38].call(builder), hmLogger);
  }
  
  @Generated
  public File getOutputFile() {
    return this.outputFile;
  }
  
  @Generated
  public void setOutputFile(File paramFile) {
    this.outputFile = paramFile;
  }
}
