package com.huawei.ohos.build.data;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.NpmCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;
import org.gradle.internal.os.OperatingSystem;

public class DataChecker implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private static final ConcurrentHashMap<String, Boolean> versionCheckFlag;
  
  private static final String errorMessageInMac = "SDK-Js is not installed correctly! Please select DevEco Studio -> Preferences -> Appearance & Behavior -> System Settings -> HarmonyOS SDK, check the npm proxy and re-install Js component!";
  
  private static final String errorMessageInWindows = "SDK-Js is not installed correctly! Please select File -> Settings -> Appearance & Behavior -> System Settings -> HarmonyOS SDK, check the npm proxy and re-install Js component!";
  
  static {
    Object object1 = $getCallSiteArray()[21].call(HMLogger.class, DataChecker.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object1, HMLogger.class);
    Object object2 = $getCallSiteArray()[22].callConstructor(ConcurrentHashMap.class);
    versionCheckFlag = (ConcurrentHashMap<String, Boolean>)ScriptBytecodeAdapter.castToType(object2, ConcurrentHashMap.class);
  }
  
  public static void checkNpmInstall(Path loaderPath, Project project, String npmDir, String version) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].call(versionCheckFlag, version), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(versionCheckFlag, version))))
      return; 
    boolean isWindows = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(arrayOfCallSite[3].call(OperatingSystem.class)));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(ProcessUtils.class, project, isWindows ? errorMessageInWindows : errorMessageInMac), ProcessUtils.class);
    File loaderDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(loaderPath), File.class);
    Map env = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[7].call(env, "NO_UPDATE_NOTIFIER", "true");
    arrayOfCallSite[8].call(env, "PATH", npmDir);
    List<String> npmCmd = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<String> list = buildNpmCmdByType(npmDir, "rich");
    } else {
      Object object = arrayOfCallSite[9].callStatic(DataChecker.class, npmDir, "rich");
      npmCmd = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
    } 
    arrayOfCallSite[10].call(hmLogger, "npm", arrayOfCallSite[11].call(npmCmd, " "));
    arrayOfCallSite[12].call(processUtils, ArrayUtil.createArray(npmCmd, loaderDir, env, Boolean.valueOf(true), hmLogger, arrayOfCallSite[13].callGetProperty(CommonConst.class)));
    arrayOfCallSite[14].call(versionCheckFlag, version, Boolean.valueOf(true));
  }
  
  private static List<String> buildNpmCmdByType(String nodeJsDir, String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    NpmCommandBuilder builder = (NpmCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callConstructor(NpmCommandBuilder.class, nodeJsDir), NpmCommandBuilder.class);
    arrayOfCallSite[16].call(builder, type);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(arrayOfCallSite[18].call(OperatingSystem.class))))
      arrayOfCallSite[19].call(builder); 
    return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].call(builder), List.class);
  }
  
  @Generated
  public DataChecker() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
