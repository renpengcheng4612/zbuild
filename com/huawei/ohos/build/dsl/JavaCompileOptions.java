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

public class JavaCompileOptions implements GroovyObject {
  private AnnotationProcessorOptions annotationProcessorOptions;
  
  @Inject
  public JavaCompileOptions(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    ObjectFactory objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(project), ObjectFactory.class);
    Object object = arrayOfCallSite[1].call(objectFactory, AnnotationProcessorOptions.class, project);
    this.annotationProcessorOptions = (AnnotationProcessorOptions)ScriptBytecodeAdapter.castToType(object, AnnotationProcessorOptions.class);
  }
  
  public AnnotationProcessorOptions getAnnotationProcessorOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.annotationProcessorOptions;
  }
  
  public void annotationProcessorOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(action, this.annotationProcessorOptions);
  }
  
  @Generated
  public void setAnnotationProcessorOptions(AnnotationProcessorOptions paramAnnotationProcessorOptions) {
    this.annotationProcessorOptions = paramAnnotationProcessorOptions;
  }
}
