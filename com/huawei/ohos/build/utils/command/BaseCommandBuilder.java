package com.huawei.ohos.build.utils.command;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public abstract class BaseCommandBuilder implements GroovyObject {
  private List<String> command;
  
  public BaseCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.command = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
  }
  
  public BaseCommandBuilder(List command) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[1].callConstructor(ArrayList.class, command);
    this.command = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
  }
  
  public List<String> build() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.command;
  }
  
  public Object addAllParams(List params) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(this.command, params);
    return this;
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
  public List<String> getCommand() {
    return this.command;
  }
  
  @Generated
  public void setCommand(List<String> paramList) {
    this.command = paramList;
  }
}
