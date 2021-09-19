package com.huawei.ohos.build.model.sourcesets;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.util.PatternFilterable;
import org.gradle.api.tasks.util.PatternSet;

public class OhosFilterableSourceDirectory implements PatternFilterable, GroovyObject {
  private PatternSet filter;
  
  private ArrayList<String> sourceDirs;
  
  private Project project;
  
  private String name;
  
  private SourceType sourceType;
  
  public OhosFilterableSourceDirectory(String name, Project project, SourceType sourceType) {
    Object object1 = arrayOfCallSite[0].callConstructor(PatternSet.class);
    this.filter = (PatternSet)ScriptBytecodeAdapter.castToType(object1, PatternSet.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ArrayList.class);
    this.sourceDirs = (ArrayList<String>)ScriptBytecodeAdapter.castToType(object2, ArrayList.class);
    MetaClass metaClass = $getStaticMetaClass();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    SourceType sourceType1 = sourceType;
    this.sourceType = (SourceType)ShortTypeHandling.castToEnum(sourceType1, SourceType.class);
  }
  
  public Object addSourceDirectories(String... dirs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(this.sourceDirs, dirs);
    return this;
  }
  
  public Object getDirFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object files = arrayOfCallSite[3].callConstructor(ArrayList.class);
    arrayOfCallSite[4].call(files, arrayOfCallSite[5].call(arrayOfCallSite[6].call(this.project, arrayOfCallSite[7].call(this.sourceDirs))));
    return files;
  }
  
  public Object getSourceFileTrees() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object sourceFileTrees = null;
    Object dirs = arrayOfCallSite[8].callConstructor(HashSet.class, arrayOfCallSite[9].call(arrayOfCallSite[10].call(this.project, arrayOfCallSite[11].call(this.sourceDirs))));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(dirs)))
      Object object = arrayOfCallSite[13].call(arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].call(this.project, dirs)), this.filter); 
    return sourceFileTrees;
  }
  
  public Set<String> getIncludes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Set<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callGetProperty(this.filter), Set.class);
  }
  
  public Set<String> getExcludes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Set<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].callGetProperty(this.filter), Set.class);
  }
  
  public PatternFilterable setIncludes(Iterable iterable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(this.filter, iterable);
    return this;
  }
  
  public PatternFilterable setExcludes(Iterable iterable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[19].call(this.filter, iterable);
    return this;
  }
  
  public PatternFilterable include(String... strings) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[20].call(this.filter, strings);
    return this;
  }
  
  public PatternFilterable include(Iterable iterable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[21].call(this.filter, iterable);
    return this;
  }
  
  public PatternFilterable include(Spec spec) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[22].call(this.filter, spec);
    return this;
  }
  
  public PatternFilterable include(Closure closure) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[23].call(this.filter, closure);
    return this;
  }
  
  public PatternFilterable exclude(String... strings) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[24].call(this.filter, strings);
    return this;
  }
  
  public PatternFilterable exclude(Iterable iterable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[25].call(this.filter, iterable);
    return this;
  }
  
  public PatternFilterable exclude(Spec spec) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[26].call(this.filter, spec);
    return this;
  }
  
  public PatternFilterable exclude(Closure closure) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[27].call(this.filter, closure);
    return this;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(new GStringImpl(new Object[] { ScriptBytecodeAdapter.invokeMethodOnSuper0(Object.class, this, "toString"), this.name, arrayOfCallSite[28].call(this.sourceType), this.sourceDirs }new String[] { "", ", name=", ", type=", ", source=", "" }));
  }
}
