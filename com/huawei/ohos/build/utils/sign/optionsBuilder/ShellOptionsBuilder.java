package com.huawei.ohos.build.utils.sign.optionsBuilder;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.dsl.legacy.LegacyApkOptions;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ShellOptionsBuilder extends CommonOptionsBuilder {
  @Nonnull
  private static final HMLogger HM_LOG;
  
  @Nonnull
  private JavaCommandBuilder.SigningOptions options;
  
  static {
    Object object = $getCallSiteArray()[45].call(HMLogger.class, ShellOptionsBuilder.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public ShellOptionsBuilder(Project project, JavaCommandBuilder builder, SigningConfig signingConfig, SdkInfo sdkInfo, SignModel signModel) {
    super(project, builder, sdkInfo, signingConfig, signModel);
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].callConstructor(JavaCommandBuilder.SigningOptions.class, builder);
    this.options = (JavaCommandBuilder.SigningOptions)ScriptBytecodeAdapter.castToType(object, JavaCommandBuilder.SigningOptions.class);
  }
  
  public File getWorkDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File workDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this))), File.class);
    return workDir;
  }
  
  public void initOfflineParams() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object storeFilePath = arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].callGroovyObjectGetProperty(this)));
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[8].callGetProperty(BuildConst.class), arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].callGroovyObjectGetProperty(this)), "projectModuleType"))) {
      File newStoreFile = null;
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        File file = changeStoreFileForLegacyApk();
      } else {
        Object object = arrayOfCallSite[12].callCurrent(this);
        newStoreFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
      } 
      if (ScriptBytecodeAdapter.compareNotEqual(newStoreFile, null))
        Object object = arrayOfCallSite[13].callGetProperty(newStoreFile); 
    } 
    arrayOfCallSite[14]
      
      .call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(arrayOfCallSite[17].call(arrayOfCallSite[18].call(arrayOfCallSite[19].call(arrayOfCallSite[20].call(this.options), storeFilePath), arrayOfCallSite[21].call("pass:", arrayOfCallSite[22].callGroovyObjectGetProperty(this))), arrayOfCallSite[23].callGetProperty(arrayOfCallSite[24].callGroovyObjectGetProperty(this))), arrayOfCallSite[25].call("pass:", arrayOfCallSite[26].callGroovyObjectGetProperty(this))), arrayOfCallSite[27].callGetProperty(arrayOfCallSite[28].callGroovyObjectGetProperty(arrayOfCallSite[29].callGroovyObjectGetProperty(this)))), arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].callGroovyObjectGetProperty(arrayOfCallSite[32].callGroovyObjectGetProperty(this))));
  }
  
  public String getSignToolName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[33].callGetProperty(SdkConst.class));
  }
  
  public File changeStoreFileForLegacyApk() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].call(ModuleExtensionData.class, arrayOfCallSite[35].callGroovyObjectGetProperty(this)), List.class);
    String entryModule = ShortTypeHandling.castToString(arrayOfCallSite[36].call(entryModules, Integer.valueOf(0)));
    Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this), arrayOfCallSite[39].call(":", entryModule)), Project.class);
    if (ScriptBytecodeAdapter.compareEqual(entryProject, null))
      return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
    LegacyApkOptions legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].callGetProperty(arrayOfCallSite[41].callGetProperty(entryProject)), LegacyApkOptions.class);
    String legacyApk = ShortTypeHandling.castToString(arrayOfCallSite[42].call(legacyApkOptions));
    File storeFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(arrayOfCallSite[44].call(legacyApkOptions)), File.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual("", legacyApk) || ScriptBytecodeAdapter.compareEqual(storeFile, null)))
        return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
      return storeFile;
    } 
    if ((ScriptBytecodeAdapter.compareEqual("", legacyApk) || ScriptBytecodeAdapter.compareEqual(storeFile, null)))
      return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
    return storeFile;
  }
}
