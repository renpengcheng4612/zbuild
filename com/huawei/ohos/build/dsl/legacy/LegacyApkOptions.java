package com.huawei.ohos.build.dsl.legacy;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;

public class LegacyApkOptions implements GroovyObject {
  private String legacyApk;
  
  private LegacySignConfig signConfig;
  
  private String legacyVersionCode;
  
  private String legacyVersionName;
  
  @Inject
  public LegacyApkOptions(Project project) {
    String str = "";
    MetaClass metaClass = $getStaticMetaClass();
    ObjectFactory objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(project), ObjectFactory.class);
    Object object = arrayOfCallSite[1].call(objectFactory, LegacySignConfig.class, project);
    this.signConfig = (LegacySignConfig)ScriptBytecodeAdapter.castToType(object, LegacySignConfig.class);
  }
  
  public String getLegacyApk() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.legacyApk;
  }
  
  public void setLegacyApk(String legacyApk) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = legacyApk;
    this.legacyApk = ShortTypeHandling.castToString(str);
  }
  
  public LegacySignConfig getSignConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signConfig;
  }
  
  public void signConfig(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(action, this.signConfig);
  }
  
  public String getLegacyVersionCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.legacyVersionCode;
  }
  
  public void setLegacyVersionCode(String legacyVersionCode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = legacyVersionCode;
    this.legacyVersionCode = ShortTypeHandling.castToString(str);
  }
  
  public String getLegacyVersionName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.legacyVersionName;
  }
  
  public void setLegacyVersionName(String legacyVersionName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = legacyVersionName;
    this.legacyVersionName = ShortTypeHandling.castToString(str);
  }
  
  @Generated
  public void setSignConfig(LegacySignConfig paramLegacySignConfig) {
    this.signConfig = paramLegacySignConfig;
  }
}
