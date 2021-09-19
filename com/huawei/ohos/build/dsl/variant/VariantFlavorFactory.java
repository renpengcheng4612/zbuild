package com.huawei.ohos.build.dsl.variant;

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

public class VariantFlavorFactory implements NamedDomainObjectFactory<VariantFlavorOptions>, GroovyObject {
  @NonNull
  private final ObjectFactory objectFactory;
  
  public VariantFlavorFactory(@NonNull Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].call(project);
    this.objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(object, ObjectFactory.class);
  }
  
  public VariantFlavorOptions create(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (VariantFlavorOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(this.objectFactory, VariantFlavorOptions.class, name), VariantFlavorOptions.class);
  }
}
