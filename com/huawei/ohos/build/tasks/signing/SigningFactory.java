package com.huawei.ohos.build.tasks.signing;

import com.huawei.ohos.build.model.BuildType;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public class SigningFactory implements GroovyObject {
  private static SigningFactory signingFactory;
  
  static {
    Object object = $getCallSiteArray()[1].callConstructor(SigningFactory.class);
    signingFactory = (SigningFactory)ScriptBytecodeAdapter.castToType(object, SigningFactory.class);
  }
  
  public static SigningFactory getInstance() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return signingFactory;
  }
  
  public IValidateHandler getValidateHandler(Project project, BuildType buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (IValidateHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(ValidateHandler.class, project, buildType), IValidateHandler.class);
  }
  
  private SigningFactory() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
