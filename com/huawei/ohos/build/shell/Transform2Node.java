package com.huawei.ohos.build.shell;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public abstract class Transform2Node implements Options, GroovyObject {
  @Generated
  public Transform2Node() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public abstract void transform2Node(Node paramNode, String paramString, Project paramProject);
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
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
}
