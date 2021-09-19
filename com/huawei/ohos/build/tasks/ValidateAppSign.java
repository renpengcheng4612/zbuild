package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.signing.IValidateHandler;
import com.huawei.ohos.build.tasks.signing.SigningFactory;
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
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class ValidateAppSign extends DefaultTask implements GroovyObject {
  @NonNull
  private BuildType buildType;
  
  private IValidateHandler validateHandler;
  
  @Inject
  public ValidateAppSign(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(SigningFactory.class), arrayOfCallSite[3].callGroovyObjectGetProperty(this), this.buildType);
    this.validateHandler = (IValidateHandler)ScriptBytecodeAdapter.castToType(object2, IValidateHandler.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(this.validateHandler);
  }
}
