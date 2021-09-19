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

public class BuildConst implements GroovyObject {
  public static final String DEBUG = "debug";
  
  public static final String RELEASE = "release";
  
  public static final String[] BUILD_TYPES;
  
  public static final String OHOS_TEST = "ohosTest";
  
  public static final String DEBUG_OHOS_TEST = "OhosTest";
  
  public static final String TEST = "test";
  
  public static final String CLASS = "class";
  
  public static final String CLASSES = "classes";
  
  public static final String CLASSES_JAR = "classes.jar";
  
  public static final String ABILITY_SHELL_IDE_JAVA_JAR = "abilityshell_ide_java.jar";
  
  public static final String ACE_IDE_JAVA_JAR = "ace_ide_java.jar";
  
  public static final String PROFILE_FILE = "config.json";
  
  public static final String JAVA_FILE = "java_file.index";
  
  public static final String RESOURCE_FILE_INDEX = "resource_file.index";
  
  public static final String MERGE_RES_FILE_INDEX = "merge_res_file.index";
  
  public static final String CLASSES_DEX = "classes.dex";
  
  public static final String RESOURCES_INDEX = "resources.index";
  
  public static final String RESOURCE_JAVA = "Resource.java";
  
  public static final String RESOURCE_TABLE_JAVA = "ResourceTable.java";
  
  public static final String BUILD_CONFIG = "BuildConfig.java";
  
  public static final String PROGUARD_RULES = "proguard-rules.pro";
  
  public static final String OBFUSCATED_CLASS_DIR = "obfuscated_class";
  
  public static final String PROGUARD_TXT = "proguard.txt";
  
  public static final String R_JAR = "R.jar";
  
  public static final String DOT_JAR = ".jar";
  
  public static final String DOT_HAP = ".hap";
  
  public static final String DOT_DEX = ".dex";
  
  public static final String DOT_HAR = ".har";
  
  public static final String DOT_JAVA = ".java";
  
  public static final String DOT_CLASS = ".class";
  
  public static final String JS_WATCH_MODE = "js_watch_mode";
  
  public static final String STOP_JS_WATCH_MODE = "stop_js_watch_mode";
  
  public static final String DEVICE_RICH = "rich";
  
  public static final String DEVICE_LITE = "lite";
  
  public static final String DEVICE_ROUTER = "router";
  
  public static final String R_TXT = "R.txt";
  
  public static final String RESOURCETABLE_TXT = "ResourceTable.txt";
  
  public static final String ONLINE_SIGN_APP_PLUGIN_ID = "com.huawei.ohos.onlineSignApp";
  
  public static final String ONLINE_SIGN_HAP_PLUGIN_ID = "com.huawei.ohos.onlineSignHap";
  
  public static final String HAP_PLUGIN_ID = "com.huawei.ohos.hap";
  
  public static final String ENTRY_MODULE = "entry";
  
  public static final String FEATURE_MODULE = "feature";
  
  public static final String HAR_MODULE = "har";
  
  public static final String APP_MODULE = "app";
  
  public static final String PROJECT_MODULE_TYPE = "projectModuleType";
  
  @Generated
  public BuildConst() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    String[] arrayOfString = { "debug", "release" };
    BUILD_TYPES = arrayOfString;
  }
}
