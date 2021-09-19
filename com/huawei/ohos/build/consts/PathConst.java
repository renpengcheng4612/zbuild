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

public class PathConst implements GroovyObject {
  public static final Object SRC;
  
  public static final Object SRC_MAIN;
  
  public static final Object SRC_MAIN_JAVA;
  
  public static final Object SRC_MAIN_JS;
  
  public static final Object SRC_MAIN_SUPERVISUAL;
  
  public static final Object SRC_MAIN_RESOURCES;
  
  public static final Object SRC_MAIN_RES;
  
  public static final Object SRC_RES_BASE_PROFILE;
  
  public static final Object SRC_OHOS_TEST;
  
  public static final Object LIBS;
  
  public static final Object BUILD_GENERATED;
  
  public static final Object BUILD_INTERMEDIATES;
  
  public static final Object BUILD_OUTPUTS;
  
  public static final Object BUILD_LIBS;
  
  public static final Object GENERATED_SOURCE;
  
  public static final Object INTERMEDIATES_DEX;
  
  public static final Object INTERMEDIATES_EXTERNAL_LIBS;
  
  public static final Object INTERMEDIATES_JAVAC;
  
  public static final Object INTERMEDIATES_MERGE_PROFILE;
  
  public static final Object INTERMEDIATES_MERGE_RES;
  
  public static final Object INTERMEDIATES_MERGE_JS_SRC;
  
  public static final Object INTERMEDIATES_MERGE_PROGUARD_FILE;
  
  public static final Object INTERMEDIATES_OBFUSCATED_JAR;
  
  public static final Object INTERMEDIATES_RES;
  
  public static final Object INTERMEDIATES_SHELL;
  
  public static final Object INTERMEDIATES_SHELL_OUTPUT;
  
  public static final Object INTERMEDIATES_SHELL_JAVA;
  
  public static final Object INTERMEDIATES_ENTRY_SHELL;
  
  public static final Object INTERMEDIATES_SIGNING_CONFIG;
  
  public static final Object INTERMEDIATES_PACKAGED_LOCAL_HAR;
  
  public static final Object INTERMEDIATES_LIBS;
  
  public static final Object INTERMEDIATES_CMAKE;
  
  public static final Object OUTPUTS_APP;
  
  public static final Object OUTPUTS_HAP;
  
  public static final Object OUTPUTS_HAR;
  
  public static final Object OUTPUTS_LOG;
  
  public static final Object OUTPUTS_BIN;
  
  public static final Object SOURCE_R;
  
  public static final Object SOURCE_IDL;
  
  public static final Object SHELL_SRC;
  
  public static final Object SHELL_BUILD;
  
  public static final Object ANNOTATION;
  
  public static final Object BUILD_CONFIG;
  
  public static final Object SOURCE_DATA_BINDING;
  
  public static final Object JAVAC_CLASSES;
  
  public static final String ASSETS = "assets";
  
  public static final Object JS;
  
  public static final Object JS_MANIFEST;
  
  public static final Object RESOURCES;
  
  public static final Object JS_RESOURCES;
  
  public static final Object ORIGINAL_RES;
  
  public static final Object OBJ;
  
  public static final Object JS_BIN_SOURCE;
  
  public static final Object DOT_CXX;
  
  public static final Object DOT_PREVIEW;
  
  public PathConst() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    String str1 = ".preview";
    DOT_PREVIEW = str1;
    String str2 = ".cxx";
    DOT_CXX = str2;
    String str3 = "source";
    JS_BIN_SOURCE = str3;
    String str4 = "obj";
    OBJ = str4;
    String str5 = "original_res";
    ORIGINAL_RES = str5;
    String str6 = "jsResources";
    JS_RESOURCES = str6;
    String str7 = "resources";
    RESOURCES = str7;
    String str8 = "jsManifest";
    JS_MANIFEST = str8;
    String str9 = "js";
    JS = str9;
    String str10 = "classes";
    JAVAC_CLASSES = str10;
    String str11 = "dataBinding";
    SOURCE_DATA_BINDING = str11;
    String str12 = "buildConfig";
    BUILD_CONFIG = str12;
    String str13 = "annotation";
    ANNOTATION = str13;
    String str14 = "build";
    SHELL_BUILD = str14;
    String str15 = "src";
    SHELL_SRC = str15;
    String str16 = "idl";
    SOURCE_IDL = str16;
    String str17 = "r";
    SOURCE_R = str17;
    String str18 = "bin";
    OUTPUTS_BIN = str18;
    String str19 = "log";
    OUTPUTS_LOG = str19;
    String str20 = "har";
    OUTPUTS_HAR = str20;
    String str21 = "hap";
    OUTPUTS_HAP = str21;
    String str22 = "app";
    OUTPUTS_APP = str22;
    String str23 = "cmake";
    INTERMEDIATES_CMAKE = str23;
    String str24 = "libs";
    INTERMEDIATES_LIBS = str24;
    String str25 = "packaged_local_har";
    INTERMEDIATES_PACKAGED_LOCAL_HAR = str25;
    String str26 = "signing_config";
    INTERMEDIATES_SIGNING_CONFIG = str26;
    String str27 = "entry_shell";
    INTERMEDIATES_ENTRY_SHELL = str27;
    String str28 = "shell_java";
    INTERMEDIATES_SHELL_JAVA = str28;
    String str29 = "shell_output";
    INTERMEDIATES_SHELL_OUTPUT = str29;
    String str30 = "shell";
    INTERMEDIATES_SHELL = str30;
    String str31 = "res";
    INTERMEDIATES_RES = str31;
    String str32 = "obfuscate_jar";
    INTERMEDIATES_OBFUSCATED_JAR = str32;
    String str33 = "proguard_profile";
    INTERMEDIATES_MERGE_PROGUARD_FILE = str33;
    String str34 = "merge_js_src";
    INTERMEDIATES_MERGE_JS_SRC = str34;
    String str35 = "merge_res";
    INTERMEDIATES_MERGE_RES = str35;
    String str36 = "merge_profile";
    INTERMEDIATES_MERGE_PROFILE = str36;
    String str37 = "javac";
    INTERMEDIATES_JAVAC = str37;
    String str38 = "external_libs";
    INTERMEDIATES_EXTERNAL_LIBS = str38;
    String str39 = "dex";
    INTERMEDIATES_DEX = str39;
    String str40 = "source";
    GENERATED_SOURCE = str40;
    String str41 = "libs";
    BUILD_LIBS = str41;
    String str42 = "outputs";
    BUILD_OUTPUTS = str42;
    String str43 = "intermediates";
    BUILD_INTERMEDIATES = str43;
    String str44 = "generated";
    BUILD_GENERATED = str44;
    String str45 = "libs";
    LIBS = str45;
    String str46 = "src/ohosTest";
    SRC_OHOS_TEST = str46;
    String str47 = "src/main/resources/base/profile";
    SRC_RES_BASE_PROFILE = str47;
    String str48 = "src/main/res";
    SRC_MAIN_RES = str48;
    String str49 = "src/main/resources";
    SRC_MAIN_RESOURCES = str49;
    String str50 = "src/main/supervisual";
    SRC_MAIN_SUPERVISUAL = str50;
    String str51 = "src/main/js";
    SRC_MAIN_JS = str51;
    String str52 = "src/main/java";
    SRC_MAIN_JAVA = str52;
    String str53 = "src/main";
    SRC_MAIN = str53;
    String str54 = "src";
    SRC = str54;
  }
}
