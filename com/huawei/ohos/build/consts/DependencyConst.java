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

public class DependencyConst implements GroovyObject {
  public static final Object JAR;
  
  public static final Object HAR;
  
  public static final Object HARMONY_PROJECT;
  
  public static final Object JAVA_PROJECT;
  
  public static final Object IMPLEMENTATION;
  
  public static final Object COMPILE;
  
  public static final Object RUNTIME;
  
  public static final Object RUNTIME_ONLY;
  
  public static final Object COMPILE_ONLY;
  
  public static final String API = "api";
  
  public static final String ANNOTATION_PROCESSOR = "annotationProcessor";
  
  public static final Object PACKAGE_TIME;
  
  public static final Object COMPILE_TIME;
  
  public static final Object TEST_TIME;
  
  @Generated
  public DependencyConst() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    String str1 = "test";
    TEST_TIME = str1;
    String str2 = "compile";
    COMPILE_TIME = str2;
    String str3 = "package";
    PACKAGE_TIME = str3;
    String str4 = "compileOnly";
    COMPILE_ONLY = str4;
    String str5 = "runtimeOnly";
    RUNTIME_ONLY = str5;
    String str6 = "runtime";
    RUNTIME = str6;
    String str7 = "compile";
    COMPILE = str7;
    String str8 = "implementation";
    IMPLEMENTATION = str8;
    String str9 = "java_project";
    JAVA_PROJECT = str9;
    String str10 = "harmony_project";
    HARMONY_PROJECT = str10;
    String str11 = "har";
    HAR = str11;
    String str12 = "jar";
    JAR = str12;
  }
}
