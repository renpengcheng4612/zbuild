package com.huawei.ohos.build.dsl;

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
import org.gradle.api.model.ObjectFactory;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class BuildTypeFactory implements NamedDomainObjectFactory<BuildTypeOptions>, GroovyObject {
  @NonNull
  private final ObjectFactory objectFactory;
  
  @NonNull
  private final Project project;
  
  @NonNull
  private final RestoolOptions restoolOptions;
  
  public BuildTypeFactory(@NonNull ObjectFactory objectFactory, @NonNull Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    ObjectFactory objectFactory1 = objectFactory;
    this.objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(objectFactory1, ObjectFactory.class);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public BuildTypeOptions create(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (BuildTypeOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(this.objectFactory, BuildTypeOptions.class, name, this.project, this.objectFactory), BuildTypeOptions.class);
  }
}
