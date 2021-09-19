package com.huawei.ohos.build.utils.validate;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.ModuleOptions;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class CheckValidateTypeUtils implements GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[27].call(HMLogger.class, CheckValidateTypeUtils.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static String getValidateType(ConfigOptions configOptions, Project project) {
    Reference reference = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ModuleOptions moduleOptions = (ModuleOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callGroovyObjectGetProperty(configOptions), ModuleOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(moduleOptions, null))
      arrayOfCallSite[1].call(hmLogger, arrayOfCallSite[2].callConstructor(ValidateException.class, arrayOfCallSite[3].call(String.class, arrayOfCallSite[4].callGetProperty(Locale.class), arrayOfCallSite[5].callGetProperty(ValidateException.class), arrayOfCallSite[6].callGetProperty(reference.get())))); 
    List deviceTypes = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(moduleOptions), List.class);
    if (ScriptBytecodeAdapter.compareEqual(deviceTypes, null))
      arrayOfCallSite[8].call(hmLogger, arrayOfCallSite[9].callConstructor(ValidateException.class, arrayOfCallSite[10].call(String.class, arrayOfCallSite[11].callGetProperty(Locale.class), arrayOfCallSite[12].callGetProperty(ValidateException.class), arrayOfCallSite[13].callGetProperty(reference.get())))); 
    arrayOfCallSite[14].call(deviceTypes, new _getValidateType_closure1(CheckValidateTypeUtils.class, CheckValidateTypeUtils.class, reference));
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(deviceTypes, arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].callGetProperty(DeviceType.class)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(deviceTypes, arrayOfCallSite[19].callGetProperty(arrayOfCallSite[20].callGetProperty(DeviceType.class))))))
      return ShortTypeHandling.castToString(arrayOfCallSite[21].callGetProperty(BuildConst.class)); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(deviceTypes, arrayOfCallSite[23].callGetProperty(arrayOfCallSite[24].callGetProperty(DeviceType.class)))))
      return ShortTypeHandling.castToString(arrayOfCallSite[25].callGetProperty(BuildConst.class)); 
    return ShortTypeHandling.castToString(arrayOfCallSite[26].callGetProperty(BuildConst.class));
  }
  
  @Generated
  public CheckValidateTypeUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public final class _getValidateType_closure1 extends Closure implements GeneratedClosure {
    public _getValidateType_closure1(Object _outerInstance, Object _thisObject, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference = project;
      this.project = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(DeviceType.class, it)))
        return arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(CheckValidateTypeUtils.class), arrayOfCallSite[3].callConstructor(ValidateException.class, arrayOfCallSite[4].call(String.class, arrayOfCallSite[5].callGetProperty(Locale.class), arrayOfCallSite[6].callGetProperty(ValidateException.class), arrayOfCallSite[7].callGetProperty(this.project.get()), it))); 
      return null;
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
