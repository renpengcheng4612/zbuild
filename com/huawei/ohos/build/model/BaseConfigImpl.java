package com.huawei.ohos.build.model;

import com.huawei.ohos.build.utils.configJson.ClassField;
import com.huawei.ohos.build.utils.configJson.ClassFieldImpl;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public abstract class BaseConfigImpl implements BaseConfig, GroovyObject {
  @Nullable
  private String bundleName;
  
  @Nullable
  private String bundleNameSuffix;
  
  @Nullable
  private Map<String, Object> configPlaceholders;
  
  @Nullable
  private List<ClassField> buildConfigField;
  
  @Generated
  public BaseConfigImpl() {
    String str1 = "", str2 = "";
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.configPlaceholders = (Map<String, Object>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ArrayList.class);
    this.buildConfigField = (List<ClassField>)ScriptBytecodeAdapter.castToType(object2, List.class);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  @Nullable
  public Map<String, Object> getConfigPlaceholders() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configPlaceholders;
  }
  
  public void setConfigPlaceholders(Map configPlaceholders) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = configPlaceholders;
    this.configPlaceholders = (Map<String, Object>)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public List<ClassField> getBuildConfigField() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.buildConfigField;
  }
  
  @Nullable
  public void buildConfigField(@Nonnull String type, @Nonnull String name, @Nonnull String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(this.buildConfigField, arrayOfCallSite[3].callConstructor(ClassFieldImpl.class, type, name, value));
  }
  
  public void setBuildConfigField(List buildConfigField) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = buildConfigField;
    this.buildConfigField = (List<ClassField>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
  
  @Generated
  public String getBundleName() {
    return this.bundleName;
  }
  
  @Generated
  public void setBundleName(String paramString) {
    this.bundleName = paramString;
  }
  
  @Generated
  public String getBundleNameSuffix() {
    return this.bundleNameSuffix;
  }
  
  @Generated
  public void setBundleNameSuffix(String paramString) {
    this.bundleNameSuffix = paramString;
  }
}
