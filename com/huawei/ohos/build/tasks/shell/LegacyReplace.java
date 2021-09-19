package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.dsl.legacy.LegacyApkOptions;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class LegacyReplace extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private static final String ENTRY_DOT_APK = "entry.apk";
  
  private ConfigInfo configInfo;
  
  private PackageInfo packageInfo;
  
  static {
    Object object = $getCallSiteArray()[26].call(HMLogger.class, LegacyReplace.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public LegacyReplace(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].callGroovyObjectGetProperty(variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object2, PackageInfo.class);
  }
  
  @TaskAction
  public void replace() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[2].callGroovyObjectGetProperty(this.configInfo), "entry")) {
      arrayOfCallSite[3].call(hmLogger, "legacyApk", "Not entry module skipped.");
      return;
    } 
    LegacyApkOptions legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGroovyObjectGetProperty(this))), LegacyApkOptions.class);
    String legacyApkPath = ShortTypeHandling.castToString(arrayOfCallSite[7].call(legacyApkOptions));
    if (ScriptBytecodeAdapter.compareNotEqual("", legacyApkPath)) {
      File legacyApk = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), legacyApkPath), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(legacyApk)))
        arrayOfCallSite[11].call(hmLogger, arrayOfCallSite[12].callConstructor(GradleException.class, arrayOfCallSite[13].call(legacyApkPath, " does not exist."))); 
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(legacyApk), ENTRY_DOT_APK)))
        arrayOfCallSite[16].call(hmLogger, arrayOfCallSite[17].callConstructor(GradleException.class, arrayOfCallSite[18].call(arrayOfCallSite[19].call("LegacyApk's file name must end with ", ENTRY_DOT_APK), "."))); 
      arrayOfCallSite[20].call(arrayOfCallSite[21].call(this.packageInfo), arrayOfCallSite[22].callGroovyObjectGetProperty(this.configInfo), arrayOfCallSite[23].callGetProperty(legacyApk));
      arrayOfCallSite[24].call(hmLogger, "legacyApk", arrayOfCallSite[25].callGetProperty(legacyApk));
    } 
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
  public PackageInfo getPackageInfo() {
    return this.packageInfo;
  }
  
  @Generated
  public void setPackageInfo(PackageInfo paramPackageInfo) {
    this.packageInfo = paramPackageInfo;
  }
}
