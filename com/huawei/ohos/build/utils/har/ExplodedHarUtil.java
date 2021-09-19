package com.huawei.ohos.build.utils.har;

import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.utils.FileUtils;
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
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ExplodedHarUtil implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private final Project project;
  
  private PathInfo pathInfo;
  
  static {
    Object object = $getCallSiteArray()[34].call(HMLogger.class, ExplodedHarUtil.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public ExplodedHarUtil(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object = arrayOfCallSite[0].call(arrayOfCallSite[1].call(GlobalDataManager.class, project), project);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object, PathInfo.class);
  }
  
  public void explodedHar(File harFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object inputHarPath = harFile;
    String outputHarPath = ShortTypeHandling.castToString(arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo), arrayOfCallSite[5].call(FileUtils.class, arrayOfCallSite[6].callGetProperty(harFile)))));
    arrayOfCallSite[7].callCurrent(this, inputHarPath, outputHarPath);
  }
  
  public void explodedHar(File inputHarPath, String outputHarPath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SdkInfo sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(arrayOfCallSite[9].call(GlobalDataManager.class, this.project), this.project), SdkInfo.class);
    Object unpackingToolPath = arrayOfCallSite[10].call(sdkInfo);
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[12].call(builder, unpackingToolPath);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    arrayOfCallSite[14]
      
      .call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(arrayOfCallSite[17].call(options, "har"), Boolean.valueOf(true)), arrayOfCallSite[18].call(inputHarPath)), outputHarPath);
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].callConstructor(ProcessUtils.class, this.project, "Exploded har failed"), ProcessUtils.class);
    arrayOfCallSite[20].call(processUtils, arrayOfCallSite[21].call(builder), hmLogger);
  }
  
  public static void explodedHarForTransform(String unpackingToolPath, File inputHarPath, String outputHarPath, HMLogger hmLogger, String charsets) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(inputHarPath)))
      return; 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[24].call(builder, unpackingToolPath);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    arrayOfCallSite[26]
      
      .call(arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].call(options, "har"), Boolean.valueOf(true)), arrayOfCallSite[30].call(inputHarPath)), outputHarPath);
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].callConstructor(ProcessUtils.class, "Exploded har failed", charsets), ProcessUtils.class);
    arrayOfCallSite[32].call(processUtils, ArrayUtil.createArray(arrayOfCallSite[33].call(builder), null, null, Boolean.valueOf(true), hmLogger, charsets));
  }
}
