package com.huawei.ohos.build.consts;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class SdkConst implements GroovyObject {
  public static final String LOCAL_PROPERTIES = "local.properties";
  
  public static final String GRADLE_PROPERTIES = "gradle.properties";
  
  public static final String GRADLE_ARGS_IN_PROPERTIES = "org.gradle.jvmargs";
  
  public static final String HUAWEI_SDK_IN_PROPERTIES = "hwsdk.dir";
  
  public static final String HUAWEI_SDK_IN_ENV = "OHOS_SDK_HOME";
  
  public static final String CMAKE_DIR_IN_PROPERTIES = "cmake.dir";
  
  public static final String NATIVE_DIR_IN_PROPERTIES = "native.dir";
  
  public static final String NATIVE_DIR_IN_ENV = "OHOS_NATIVE_HOME";
  
  public static final String NODE_JS_DIR_IN_PROPERTIES = "nodejs.dir";
  
  public static final String NODE_JS_DIR_IN_ENV = "NODE_HOME";
  
  public static final String NPM_DIR_IN_PROPERTIES = "npm.dir";
  
  public static final String NPM_CONFIG_DIR_IN_PROPERTIES = "npm.config.dir";
  
  public static final String SDK_JAVA = "java";
  
  public static final String SDK_JS = "js";
  
  public static final String SDK_NATIVE = "native";
  
  public static final String SDK_TOOLCHAINS = "toolchains";
  
  public static final String ASSISTANT = "install-assistant";
  
  public static final String PROJECT_PROPERTIES = "project.properties";
  
  public static final String BUILD_TOOLS = "build-tools";
  
  public static final String DEBUG_TOOLS = "debug-tools";
  
  public static final String TOOLS = "tools";
  
  public static final String LIB = "lib";
  
  public static final String BIN = "bin";
  
  public static final String APK_SIGNER = "apksigner.jar";
  
  public static final String HAP_SIGN_TOOL = "hapsigntoolv2.jar";
  
  public static final String SIGN_APK = "SignApk.jar";
  
  public static final String HARMONY_PACKING_TOOL = "hmos_app_packing_tool.jar";
  
  public static final String HARMONY_UNPACKING_TOOL = "hmos_app_unpacking_tool.jar";
  
  public static final String HARMONY_PACKING_JS_BIN_TOOL = "hmos_haptobin_tool.jar";
  
  public static final String API = "api";
  
  public static final String TEMPLATES = "templates";
  
  public static final String JAVAC = "javac";
  
  public static final String D8_JAR = "d8.jar";
  
  public static final String AAPT_WINDOWS = "aapt2.exe";
  
  public static final String AAPT = "aapt2";
  
  public static final String IDL = "zidl";
  
  public static final String IDL_EXE = "zidl.exe";
  
  public static final String RESTOOL = "restool";
  
  public static final String RESTOOL_EXE = "restool.exe";
  
  public static final String PROGUARD_JAR = "proguard.jar";
  
  public static final String PROGUARD_DEFAULT_RULES = "proguard-default-rules.pro";
  
  public static final String DATA_BINDING_TOOL = "databinding_generator_java.jar";
  
  public static final String CMAKE = "cmake";
  
  public static final String CMAKE_EXE = "cmake.exe";
  
  public static final String NINJA = "ninja";
  
  public static final String NINJA_EXE = "ninja.exe";
  
  public static final String JS_LOADER_NAME = "ace-loader";
  
  public static final String JS_BINARY_NAME = "binary-tools";
  
  public static final String LITE_DEVICE_CONFIG = "webpack.lite.config.js";
  
  public static final String RICH_DEVICE_CONFIG = "webpack.rich.config.js";
  
  public static final String ROUTER_DEVICE_CONFIG = "webpack.router.config.js";
  
  public static final int SHELL_MIN_SDK_VERSION = 26;
  
  public static final int SHELL_TARGET_SDK_VERSION = 29;
  
  public static final String OHOS_JAR = "ohos.jar";
  
  public static final String OHOS_IVI_JAR = "ohos_ivi.jar";
  
  public static final String RT_JAVA_JAR = "rt_java.jar";
  
  public static final String ORM_ANNOTATIONS_PROCESSOR_JAVA_JAR = "orm_annotations_processor_java.jar";
  
  public static final String ORM_ANNOTATIONS_JAVA_JAR = "orm_annotations_java.jar";
  
  public static final String JAVAPOET_JAVA_JAR = "javapoet_java.jar";
  
  public static final String ANDROID_JAR = "android.jar";
  
  public static final String GRADLE_MINIMUM_VERSION = "6.3";
  
  public static final String CONFIG_DIR = "config";
  
  public static final String PROGUARD_DIR = "proguard";
  
  @Generated
  public SdkConst() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
