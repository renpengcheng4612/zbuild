package com.huawei.ohos.build.consts;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class CommonConst implements GroovyObject {
  public static final Object HARMONY_CMAKE_LIST;
  
  public static final Object HARMONY_CONFIG_JSON;
  
  public static final Object MANIFEST_JSON;
  
  public static final Object DEFAULT_ICON_PNG;
  
  public static final Object SHELL_MANIFEST_XML;
  
  public static final Object HARMONY_SETTINGS_GRADLE;
  
  public static final Object SHELL_APPLICATION_TEMPLATE;
  
  public static final Object SHELL_ACE_APPLICATION_TEMPLATE;
  
  public static final Object SHELL_FILE_TEMPLATE;
  
  public static final Object SHELL_TOUCH_TEMPLATE;
  
  public static final Object SHELL_PHOTOS_TEMPLATE;
  
  public static final Object SHELL_SERVICE_FORM_TEMPLATE;
  
  public static final Object SHELL_APP_PROGUARD_RULES;
  
  public static final String CONSOLE_LOG_UTF8 = "UTF-8";
  
  public static final String CONSOLE_LOG_GBK = "GBK";
  
  public static final Object APP_PACKAGE_INFO;
  
  public static final Object SOURCE_IDL_DIR;
  
  public static final Object SOURCE_BUILDCONFIG_DIR;
  
  private CommonConst() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    String str1 = "pack.info", str2 = "proguard-rules.pro", str3 = "/templates/%s/TemplateShellServiceForm", str4 = "/templates/photos/default_icon.png", str5 = "/templates/touch/ShellComponentProxy", str6 = "/templates/%s/TemplateShellFile", str7 = "/templates/page/AceTemplateApplication", str8 = "/templates/page/TemplateApplication", str9 = "settings.gradle", str10 = "AndroidManifest.xml", str11 = "default_icon.png", str12 = "manifest.json", str13 = "config.json", str14 = "/src/main/cpp/CMakeLists.txt";
    Object object1 = $getCallSiteArray()[0].call("build/generated/source/idl", "/", $getCallSiteArray()[1].callGetProperty(File.class));
    Object object2 = $getCallSiteArray()[2].call("build/generated/source/buildConfig/debug", "/", $getCallSiteArray()[3].callGetProperty(File.class));
  }
}
