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
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.JavaVersion;
import org.gradle.api.Project;

public class CompileOptions implements GroovyObject {
  private boolean annotationEnabled;
  
  private JavaVersion sourceCompatibility;
  
  private JavaVersion targetCompatibility;
  
  @Inject
  public CompileOptions(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    boolean bool = false;
    this.annotationEnabled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
    Object object1 = arrayOfCallSite[0].callGetProperty(JavaVersion.class);
    this.sourceCompatibility = (JavaVersion)ShortTypeHandling.castToEnum(object1, JavaVersion.class);
    Object object2 = arrayOfCallSite[1].callGetProperty(JavaVersion.class);
    this.targetCompatibility = (JavaVersion)ShortTypeHandling.castToEnum(object2, JavaVersion.class);
  }
  
  public boolean getAnnotationEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.annotationEnabled;
  }
  
  public void setAnnotationEnabled(boolean annotationEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = annotationEnabled;
    this.annotationEnabled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public JavaVersion getSourceCompatibility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sourceCompatibility;
  }
  
  public void setSourceCompatibility(JavaVersion sourceCompatibility) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    JavaVersion javaVersion = sourceCompatibility;
    this.sourceCompatibility = (JavaVersion)ShortTypeHandling.castToEnum(javaVersion, JavaVersion.class);
  }
  
  public JavaVersion getTargetCompatibility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.targetCompatibility;
  }
  
  public void setTargetCompatibility(JavaVersion targetCompatibility) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    JavaVersion javaVersion = targetCompatibility;
    this.targetCompatibility = (JavaVersion)ShortTypeHandling.castToEnum(javaVersion, JavaVersion.class);
  }
}
