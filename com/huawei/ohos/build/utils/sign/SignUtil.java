package com.huawei.ohos.build.utils.sign;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.optionsBuilder.AppOptionsBuilder;
import com.huawei.ohos.build.utils.sign.optionsBuilder.HapOptionsBuilder;
import com.huawei.ohos.build.utils.sign.optionsBuilder.OptionsBuilder;
import com.huawei.ohos.build.utils.sign.optionsBuilder.ShellOptionsBuilder;
import com.huawei.ohos.build.utils.sign.optionsBuilder.SignModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class SignUtil implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private final Project project;
  
  private final SdkInfo sdkInfo;
  
  private final String moduleType;
  
  private final SigningConfig signingConfig;
  
  private final ConfigInfo configInfo;
  
  static {
    Object object = $getCallSiteArray()[41].call(HMLogger.class, SignUtil.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public SignUtil(Project project, String moduleType, VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    String str = moduleType;
    this.moduleType = ShortTypeHandling.castToString(str);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object1, SdkInfo.class);
    Object object2 = arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].call(variantData));
    this.signingConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(object2, SigningConfig.class);
    Object object3 = arrayOfCallSite[3].callGroovyObjectGetProperty(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
  }
  
  public static String defaultSignFile(File inputFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object outputFilePath = arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGetProperty(inputFile));
    String outputFileName = ShortTypeHandling.castToString(arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(inputFile), "unsigned", "signed"));
    return ShortTypeHandling.castToString(arrayOfCallSite[8].call(arrayOfCallSite[9].call(outputFilePath, arrayOfCallSite[10].callGetProperty(File.class)), outputFileName));
  }
  
  public void sign(File inputFile, File outputFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SignModel signModel = (SignModel)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(SignModel.class, this.moduleType, inputFile, outputFile), SignModel.class);
    arrayOfCallSite[12].callCurrent(this, signModel);
  }
  
  public void sign(SignModel signModel) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[13].call(hmLogger, "sign", arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call("Start to sign ", arrayOfCallSite[17].call(this.moduleType)), ":"), arrayOfCallSite[18].callGetProperty(arrayOfCallSite[19].callGroovyObjectGetProperty(signModel))));
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    OptionsBuilder optionsBuilder = null;
    if (ScriptBytecodeAdapter.compareEqual(this.moduleType, "shell")) {
      Object object = arrayOfCallSite[21].callConstructor(ShellOptionsBuilder.class, ArrayUtil.createArray(this.project, builder, this.signingConfig, this.sdkInfo, signModel));
      optionsBuilder = (OptionsBuilder)ScriptBytecodeAdapter.castToType(object, OptionsBuilder.class);
    } else if (ScriptBytecodeAdapter.compareEqual(this.moduleType, "app")) {
      Object object = arrayOfCallSite[22].callConstructor(AppOptionsBuilder.class, ArrayUtil.createArray(this.project, builder, this.signingConfig, this.sdkInfo, signModel));
      optionsBuilder = (OptionsBuilder)ScriptBytecodeAdapter.castToType(object, OptionsBuilder.class);
    } else {
      Object object = arrayOfCallSite[23].callConstructor(HapOptionsBuilder.class, ArrayUtil.createArray(this.project, builder, this.signingConfig, this.sdkInfo, signModel));
      optionsBuilder = (OptionsBuilder)ScriptBytecodeAdapter.castToType(object, OptionsBuilder.class);
    } 
    File workDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(optionsBuilder), File.class);
    List command = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].call(optionsBuilder), List.class);
    String exceptionMsg = ShortTypeHandling.castToString(arrayOfCallSite[26].call(arrayOfCallSite[27].call("Sign ", this.moduleType), " failed. For details, see the log."));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].callConstructor(ProcessUtils.class, this.project, exceptionMsg), ProcessUtils.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.moduleType, "shell") || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[35].call(KeyStoreHelper.class, this.project, this.signingConfig))))) {
        arrayOfCallSite[36].call(hmLogger, "sign", arrayOfCallSite[37].call(arrayOfCallSite[38].call("Succeed to sign ", this.moduleType), "."));
        arrayOfCallSite[39].call(processUtils, command, workDir, hmLogger);
      } else {
        arrayOfCallSite[40].call(hmLogger, "sign", new GStringImpl(new Object[] { this.moduleType }, new String[] { "Skip to sign ", ".Because not config signingConfigs" }));
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(this.moduleType, "shell") || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(KeyStoreHelper.class, this.project, this.signingConfig))))) {
      arrayOfCallSite[30].call(hmLogger, "sign", arrayOfCallSite[31].call(arrayOfCallSite[32].call("Succeed to sign ", this.moduleType), "."));
      arrayOfCallSite[33].call(processUtils, command, workDir, hmLogger);
    } else {
      arrayOfCallSite[34].call(hmLogger, "sign", new GStringImpl(new Object[] { this.moduleType }, new String[] { "Skip to sign ", ".Because not config signingConfigs" }));
    } 
  }
}
