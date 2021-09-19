package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.signing.IValidateHandler;
import com.huawei.ohos.build.tasks.signing.SigningFactory;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class ValidateSigning extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private IValidateHandler validateHandler;
  
  static {
    Object object = $getCallSiteArray()[9].call(HMLogger.class, ValidateSigning.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public ValidateSigning(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(SigningFactory.class), arrayOfCallSite[3].callGroovyObjectGetProperty(this), this.buildType);
    this.validateHandler = (IValidateHandler)ScriptBytecodeAdapter.castToType(object2, IValidateHandler.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(KeyStoreHelper.class, arrayOfCallSite[5].callGroovyObjectGetProperty(this)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(configFile)))
      arrayOfCallSite[7].call(KeyStoreHelper.class, arrayOfCallSite[8].callGroovyObjectGetProperty(this)); 
  }
}
