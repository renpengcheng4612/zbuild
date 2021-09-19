package com.huawei.ohos.build.utils.validate;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.utils.validate.validates.DeviceTypeFieldValidator;
import com.huawei.ohos.build.utils.validate.validates.SdkExistValidator;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.GradleException;

public class ValidateUtil implements GroovyObject {
  @Generated
  public ValidateUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static Object sdkCheck(@Nonnull SdkInfo sdkInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ValidatorManager componentVersion = (ValidatorManager)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].callConstructor(ValidatorManager.class), arrayOfCallSite[4].callConstructor(SdkExistValidator.class, arrayOfCallSite[5].callGroovyObjectGetProperty(sdkInfo), "Sdk-Java")), arrayOfCallSite[6].callConstructor(SdkExistValidator.class, arrayOfCallSite[7].callGroovyObjectGetProperty(sdkInfo), "Toolchains")), arrayOfCallSite[8].callConstructor(SdkExistValidator.class, arrayOfCallSite[9].callGroovyObjectGetProperty(sdkInfo), arrayOfCallSite[10].callGetProperty(SdkConst.class), arrayOfCallSite[11].callGetProperty(SdkConst.class))), ValidatorManager.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].callGroovyObjectGetProperty(sdkInfo)))
      arrayOfCallSite[13]
        .call(arrayOfCallSite[14].call(componentVersion, arrayOfCallSite[15].callConstructor(SdkExistValidator.class, arrayOfCallSite[16].callGroovyObjectGetProperty(sdkInfo), "Sdk-Js")), arrayOfCallSite[17].callConstructor(SdkExistValidator.class, arrayOfCallSite[18].callGroovyObjectGetProperty(sdkInfo), arrayOfCallSite[19].callGetProperty(SdkConst.class), arrayOfCallSite[20].callGetProperty(SdkConst.class))); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].callGroovyObjectGetProperty(sdkInfo)))
      arrayOfCallSite[22]
        
        .call(arrayOfCallSite[23].call(arrayOfCallSite[24].call(componentVersion, arrayOfCallSite[25].callConstructor(SdkExistValidator.class, arrayOfCallSite[26].callGroovyObjectGetProperty(sdkInfo), "Sdk-Native")), arrayOfCallSite[27].callConstructor(SdkExistValidator.class, arrayOfCallSite[28].callGroovyObjectGetProperty(sdkInfo), "cmakeLists.txt")), arrayOfCallSite[29].callConstructor(SdkExistValidator.class, arrayOfCallSite[30].callGroovyObjectGetProperty(sdkInfo), arrayOfCallSite[31].callGetProperty(SdkConst.class), arrayOfCallSite[32].callGetProperty(SdkConst.class))); 
    ValidateResult validateResult = (ValidateResult)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(componentVersion), ValidateResult.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].callGroovyObjectGetProperty(validateResult)))
      throw (Throwable)arrayOfCallSite[35].callConstructor(GradleException.class, arrayOfCallSite[36].call(validateResult)); 
    return null;
  }
  
  public static Object configCheck(@Nonnull ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigOptions configOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].call(configInfo), ConfigOptions.class);
    ValidateResult configCheckResult = (ValidateResult)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].callConstructor(ValidatorManager.class), arrayOfCallSite[41].callConstructor(DeviceTypeFieldValidator.class, configOptions))), ValidateResult.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[42].callGroovyObjectGetProperty(configCheckResult)))
      throw (Throwable)arrayOfCallSite[43].callConstructor(GradleException.class, arrayOfCallSite[44].call(configCheckResult)); 
    return null;
  }
}
