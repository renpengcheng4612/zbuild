package com.huawei.ohos.build.model.sourcesets;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Project;

public class OhosSourceSetFactory implements NamedDomainObjectFactory<OhosSourceSet>, GroovyObject {
  private Project project;
  
  public OhosSourceSetFactory(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public OhosSourceSet create(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (OhosSourceSet)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(this.project), OhosSourceSet.class, name, this.project), OhosSourceSet.class);
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
