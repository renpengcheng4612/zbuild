package com.huawei.ohos.build.dsl;

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
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;

public class RestoolOptions implements GroovyObject {
  protected Project project;
  
  private PseudoLocalization pseudoLocalization;
  
  @Inject
  public RestoolOptions(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    ObjectFactory objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(project), ObjectFactory.class);
    Object object = arrayOfCallSite[1].call(objectFactory, PseudoLocalization.class, project);
    this.pseudoLocalization = (PseudoLocalization)ScriptBytecodeAdapter.castToType(object, PseudoLocalization.class);
  }
  
  public PseudoLocalization getPseudoLocalization() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pseudoLocalization;
  }
  
  public void setPseudoLocalization(PseudoLocalization pseudoLocalization) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PseudoLocalization pseudoLocalization1 = pseudoLocalization;
    this.pseudoLocalization = (PseudoLocalization)ScriptBytecodeAdapter.castToType(pseudoLocalization1, PseudoLocalization.class);
  }
  
  public void pseudoLocalization(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(action, this.pseudoLocalization);
  }
}
