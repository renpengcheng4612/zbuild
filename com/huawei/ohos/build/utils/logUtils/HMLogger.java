package com.huawei.ohos.build.utils.logUtils;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.logging.LogLevel;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class HMLogger implements ILogger, GroovyObject {
  private final Logger logger;
  
  public HMLogger(Logger logger) {
    MetaClass metaClass = $getStaticMetaClass();
    Logger logger1 = logger;
    this.logger = (Logger)ScriptBytecodeAdapter.castToType(logger1, Logger.class);
  }
  
  public static HMLogger getLogger(Class aClass) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (HMLogger)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(HMLogger.class, arrayOfCallSite[1].call(Logging.class, aClass)), HMLogger.class);
  }
  
  public void error(@Nullable Throwable t, @Nullable String msgFormat, Object... args) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(this.logger, arrayOfCallSite[3].callGetProperty(LogLevel.class))))
      return; 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareEqual(msgFormat, null)) {
        String str = "no any message";
      } else if ((ScriptBytecodeAdapter.compareNotEqual(args, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[7].callGetProperty(args), Integer.valueOf(0)))) {
        Object object = arrayOfCallSite[8].call(String.class, arrayOfCallSite[9].callGetProperty(Locale.class), msgFormat, args);
        msgFormat = ShortTypeHandling.castToString(object);
      } 
    } else if (ScriptBytecodeAdapter.compareEqual(msgFormat, null)) {
      String str = "no any message";
    } else if ((ScriptBytecodeAdapter.compareNotEqual(args, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[4].callGetProperty(args), Integer.valueOf(0)))) {
      Object object = arrayOfCallSite[5].call(String.class, arrayOfCallSite[6].callGetProperty(Locale.class), msgFormat, args);
      msgFormat = ShortTypeHandling.castToString(object);
    } 
    if (ScriptBytecodeAdapter.compareEqual(t, null)) {
      arrayOfCallSite[10].call(this.logger, arrayOfCallSite[11].callGetProperty(LogLevel.class), msgFormat);
    } else {
      arrayOfCallSite[12].call(this.logger, arrayOfCallSite[13].callGetProperty(LogLevel.class), msgFormat, t);
      throw t;
    } 
  }
  
  public void error(@Nullable Throwable t) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(t, null)) {
      arrayOfCallSite[14].call(this.logger, arrayOfCallSite[15].callGetProperty(LogLevel.class), "", t);
      throw t;
    } 
  }
  
  public void warning(@NonNull String msgFormat, Object... args) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].callCurrent(this, arrayOfCallSite[17].callGetProperty(LogLevel.class), msgFormat, args);
  }
  
  public void quiet(@NonNull String msgFormat, Object... args) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].callCurrent(this, arrayOfCallSite[19].callGetProperty(LogLevel.class), msgFormat, args);
  }
  
  public void info(@NonNull String msgFormat, Object... args) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[20].callCurrent(this, arrayOfCallSite[21].callGetProperty(LogLevel.class), msgFormat, args);
  }
  
  public void info(@NonNull String key, String msg) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[22].callCurrent(this, arrayOfCallSite[23].callGetProperty(LogLevel.class), "[%s] %s", key, msg);
  }
  
  public void info(@NonNull String key, List commands) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[24].callCurrent(this, arrayOfCallSite[25].callGetProperty(LogLevel.class), "[%s] %s", key, arrayOfCallSite[26].call(commands, " "));
  }
  
  private void log(@NonNull LogLevel logLevel, @NonNull String s, Object... args) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(this.logger, logLevel)))
      return; 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(args, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[33].callGetProperty(args), Integer.valueOf(0)))) {
        arrayOfCallSite[34].call(this.logger, logLevel, s);
      } else {
        arrayOfCallSite[35].call(this.logger, logLevel, arrayOfCallSite[36].call(String.class, arrayOfCallSite[37].callGetProperty(Locale.class), s, args));
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(args, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[28].callGetProperty(args), Integer.valueOf(0)))) {
      arrayOfCallSite[29].call(this.logger, logLevel, s);
    } else {
      arrayOfCallSite[30].call(this.logger, logLevel, arrayOfCallSite[31].call(String.class, arrayOfCallSite[32].callGetProperty(Locale.class), s, args));
    } 
  }
}
