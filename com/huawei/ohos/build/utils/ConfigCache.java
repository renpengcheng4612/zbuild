package com.huawei.ohos.build.utils;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class ConfigCache implements GroovyObject {
  public Map<String, Object> configPlaceHolder;
  
  private static ConfigCache configCache;
  
  public ConfigCache() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public Map<String, Object> getConfigPlaceHolder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configPlaceHolder;
  }
  
  public void setConfigPlaceHolder(Map configPlaceHolder) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = configPlaceHolder;
    this.configPlaceHolder = (Map<String, Object>)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public static ConfigCache getConfigCache() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return configCache;
  }
  
  public static void setConfigCache(ConfigCache configCache) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigCache configCache1 = configCache;
    ScriptBytecodeAdapter.setProperty(configCache1, null, ConfigCache.class, "configCache");
  }
  
  public static ConfigCache getInstance() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(configCache, null))
      synchronized (ConfigCache.class) {
        Object object = arrayOfCallSite[0].callConstructor(ConfigCache.class);
        configCache = (ConfigCache)ScriptBytecodeAdapter.castToType(object, ConfigCache.class);
      }  
    return configCache;
  }
  
  public static void setInstance(ConfigCache configCache) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigCache configCache1 = configCache;
    ConfigCache.configCache = (ConfigCache)ScriptBytecodeAdapter.castToType(configCache1, ConfigCache.class);
  }
  
  static {
    Object object = null;
    configCache = (ConfigCache)ScriptBytecodeAdapter.castToType(object, ConfigCache.class);
  }
}
