package com.huawei.ohos.build.data;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public class PackageInfo implements GroovyObject {
  private Project project;
  
  private Map<String, String> apkPathMap;
  
  private Map<String, String> hapPathMap;
  
  public PackageInfo(Project project) {
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.apkPathMap = (Map<String, String>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HashMap.class);
    this.hapPathMap = (Map<String, String>)ScriptBytecodeAdapter.castToType(object2, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    arrayOfCallSite[2].call(this.apkPathMap);
    arrayOfCallSite[3].call(this.hapPathMap);
  }
  
  public Map<String, String> getApkPathMap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.apkPathMap;
  }
  
  public Map<String, String> getHapPathMap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.hapPathMap;
  }
}
