package com.huawei.ohos.build.dsl;

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
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;
import org.gradle.process.CommandLineArgumentProvider;

public class AnnotationProcessorOptions implements GroovyObject {
  private List<String> classNames;
  
  private Map<String, String> arguments;
  
  private List<CommandLineArgumentProvider> compilerArgumentProviders;
  
  @Inject
  public AnnotationProcessorOptions(Project project) {
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.arguments = (Map<String, String>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ArrayList.class);
    this.compilerArgumentProviders = (List<CommandLineArgumentProvider>)ScriptBytecodeAdapter.castToType(object2, List.class);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public List<String> getClassNames() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.classNames;
  }
  
  public Map<String, String> getArguments() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.arguments;
  }
  
  public List<CommandLineArgumentProvider> getCompilerArgumentProviders() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compilerArgumentProviders;
  }
  
  @Nullable
  public Boolean getIncludeCompileClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callGroovyObjectGetProperty(this), Boolean.class);
  }
  
  public void argument(@Nonnull String key, @Nonnull String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[3].call(this.arguments, key, value);
  }
  
  @Generated
  public void setClassNames(List<String> paramList) {
    this.classNames = paramList;
  }
  
  @Generated
  public void setArguments(Map<String, String> paramMap) {
    this.arguments = paramMap;
  }
  
  @Generated
  public void setCompilerArgumentProviders(List<CommandLineArgumentProvider> paramList) {
    this.compilerArgumentProviders = paramList;
  }
}
