package com.huawei.ohos.build.model;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.dsl.ProguardOptions;
import com.huawei.ohos.build.dsl.RestoolOptions;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class DefaultBuildType extends BaseConfigImpl implements BuildType {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private SigningConfig mSigningConfig;
  
  private boolean dataBindingEnabled;
  
  private boolean debuggable;
  
  protected RestoolOptions restoolOptions;
  
  protected ProguardOptions proguardOpt;
  
  public DefaultBuildType(String name) {
    Object object1 = null;
    this.mSigningConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(object1, SigningConfig.class);
    boolean bool1 = false, bool2 = false;
    Object object2 = null;
    this.restoolOptions = (RestoolOptions)ScriptBytecodeAdapter.castToType(object2, RestoolOptions.class);
    Object object3 = null;
    this.proguardOpt = (ProguardOptions)ScriptBytecodeAdapter.castToType(object3, ProguardOptions.class);
    MetaClass metaClass = $getStaticMetaClass();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
    if (ScriptBytecodeAdapter.compareEqual(this.name, arrayOfCallSite[0].callGetProperty(BuildConst.class))) {
      boolean bool = true;
      this.debuggable = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
    } 
  }
  
  public DefaultBuildType initWith(BuildType that) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[1].callCurrent(this, arrayOfCallSite[2].call(that));
    return this;
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public SigningConfig getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mSigningConfig;
  }
  
  @NonNull
  public BuildType setSigningConfig(@Nullable SigningConfig signingConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SigningConfig signingConfig1 = signingConfig;
    return this;
  }
  
  public boolean isDataBindingEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dataBindingEnabled;
  }
  
  public RestoolOptions getRestoolOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.restoolOptions;
  }
  
  public void setRestoolOptions(RestoolOptions restoolOptions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    RestoolOptions restoolOptions1 = restoolOptions;
    this.restoolOptions = (RestoolOptions)ScriptBytecodeAdapter.castToType(restoolOptions1, RestoolOptions.class);
  }
  
  public void setDataBindingEnabled(boolean dataBindingEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = dataBindingEnabled;
    this.dataBindingEnabled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public ProguardOptions getProguardOpt() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.proguardOpt;
  }
  
  public void setProguardOpt(ProguardOptions proguardOpt) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ProguardOptions proguardOptions = proguardOpt;
    this.proguardOpt = (ProguardOptions)ScriptBytecodeAdapter.castToType(proguardOptions, ProguardOptions.class);
  }
  
  public boolean getDebuggable() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.debuggable;
  }
  
  public void setDebuggable(boolean debuggable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = debuggable;
    this.debuggable = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
}
