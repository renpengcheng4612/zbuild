package com.huawei.ohos.build.utils;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class ViewLogger implements GroovyObject {
  @Generated
  public ViewLogger() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static void info(String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].callStatic(ViewLogger.class, message);
  }
  
  public static void error(String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[1].callStatic(ViewLogger.class, arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call("\033[31m", "----"), message), "\033[0m"));
  }
  
  public static void error(String key, String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[5].callStatic(ViewLogger.class, arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call("\033[31m", "["), key), "] "), message), "\033[0m"));
  }
  
  public static void info(Object o, String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[11].callStatic(ViewLogger.class, arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(o), ":"), message));
  }
  
  public static void info(String key, String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[15].callStatic(ViewLogger.class, arrayOfCallSite[16].call(arrayOfCallSite[17].call(arrayOfCallSite[18].call("[", key), "] "), message));
  }
  
  public static void warn(String key, String message) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[19].call(arrayOfCallSite[20].callGetProperty(System.class), arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].call("[", key), "] "), message));
  }
}
