package com.huawei.ohos.build.dsl;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;

public class ProguardOptions implements GroovyObject {
  private Project project;
  
  private boolean proguardEnabled;
  
  private List<File> rulesFiles;
  
  private List<File> consumerRulesFiles;
  
  @Inject
  public ProguardOptions(Project project) {
    boolean bool = false;
    Object object1 = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.rulesFiles = (List<File>)ScriptBytecodeAdapter.castToType(object1, List.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ArrayList.class);
    this.consumerRulesFiles = (List<File>)ScriptBytecodeAdapter.castToType(object2, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public boolean isProguardEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.proguardEnabled;
  }
  
  public void setProguardEnabled(boolean proguardEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = proguardEnabled;
    this.proguardEnabled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public List<File> getRulesFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.rulesFiles;
  }
  
  public void rulesFiles(Object... files) {
    CallSite[] arrayOfCallSite;
    Object file;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), file = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(files), Iterator.class); iterator.hasNext(); ) {
      file = iterator.next();
      arrayOfCallSite[3].call(this.rulesFiles, arrayOfCallSite[4].call(this.project, file));
    } 
  }
  
  public List<File> getConsumerRulesFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.consumerRulesFiles;
  }
  
  public void consumerRulesFiles(Object... files) {
    CallSite[] arrayOfCallSite;
    Object file;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), file = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(files), Iterator.class); iterator.hasNext(); ) {
      file = iterator.next();
      arrayOfCallSite[6].call(this.consumerRulesFiles, arrayOfCallSite[7].call(this.project, file));
    } 
  }
  
  @Generated
  public Project getProject() {
    return this.project;
  }
  
  @Generated
  public void setProject(Project paramProject) {
    this.project = paramProject;
  }
}
