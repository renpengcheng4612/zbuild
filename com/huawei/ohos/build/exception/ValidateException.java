package com.huawei.ohos.build.exception;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class ValidateException extends RuntimeException implements GroovyObject {
  public static final String prefix = "Please check '%s' module config.json,";
  
  public static final String defaultMessage = "Please check '%s' module config.json, check whether the '%s' sub-tag '%s' label";
  
  public static final String invalidJson = "Please check '%s' module config.json, check it effectiveness";
  
  public static final String checkDeviceConfig = "Please check '%s' module config.json, make sure deviceCofig is located within [%s].";
  
  public static final String checkModule = "Please check '%s' module config.json, check 'module' lable whether is empty";
  
  public static final String checkModuleDeviceTypeEmpty = "Please check '%s' module config.json, check whether the 'deviceType' lable below the module tag is empty";
  
  public static final String checkModuleDeviceType = "Please check '%s' module config.json, check the 'module' sub-tag 'deviceType' label effectiveness, deviceType '%s' not support";
  
  public static final String checkModuleDeviceTypeConflict = "Please check '%s' module config.json, check the 'module' sub-tag 'deviceType' label conflict, It can't have these types at the same time: [%s] ";
  
  public ValidateException() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public ValidateException(@Nullable String message) {}
  
  public ValidateException(String message, @Nullable Throwable cause) {
    super(message, cause);
    MetaClass metaClass = $getStaticMetaClass();
  }
}
