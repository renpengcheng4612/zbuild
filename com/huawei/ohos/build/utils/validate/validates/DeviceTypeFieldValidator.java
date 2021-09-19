package com.huawei.ohos.build.utils.validate.validates;

import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.JsOptions;
import com.huawei.ohos.build.shell.ModuleOptions;
import com.huawei.ohos.build.utils.validate.Validator;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;

public class DeviceTypeFieldValidator implements Validator, GroovyObject {
  private String packageName;
  
  private List<JsOptions> jsOptions;
  
  private ModuleOptions moduleOptions;
  
  private List<String> deviceTypes;
  
  private List<String> liteDevices;
  
  private List<String> richDevices;
  
  private String errorMessage;
  
  public DeviceTypeFieldValidator(@Nonnull ConfigOptions configOptions) {
    String str = "";
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(configOptions);
    this.moduleOptions = (ModuleOptions)ScriptBytecodeAdapter.castToType(object1, ModuleOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(this.moduleOptions, null))
      throw (Throwable)arrayOfCallSite[1].callConstructor(GradleException.class, "ModuleOptions must not be null."); 
    Object object2 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(configOptions));
    this.packageName = ShortTypeHandling.castToString(object2);
    Object object3 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(configOptions));
    this.jsOptions = (List<JsOptions>)ScriptBytecodeAdapter.castToType(object3, List.class);
    Object object4 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(configOptions));
    this.deviceTypes = (List<String>)ScriptBytecodeAdapter.castToType(object4, List.class);
    Object object5 = arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(this.deviceTypes), new _closure1(this, this)));
    this.liteDevices = (List<String>)ScriptBytecodeAdapter.castToType(object5, List.class);
    Object object6 = arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(this.deviceTypes), new _closure2(this, this)));
    this.richDevices = (List<String>)ScriptBytecodeAdapter.castToType(object6, List.class);
  }
  
  public final class _closure1 extends Closure implements GeneratedClosure {
    public _closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return Boolean.valueOf((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(DeviceType.class, it)) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].call(DeviceType.class, it))))));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _closure2 extends Closure implements GeneratedClosure {
    public _closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return Boolean.valueOf((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(DeviceType.class, it)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].call(DeviceType.class, it)))));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public boolean doValidate() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.packageName, null) && ScriptBytecodeAdapter.compareEqual(this.jsOptions, null))) {
        String str = "Neither js field nor packageName field is configured in the config.json.";
        return false;
      } 
    } else if ((ScriptBytecodeAdapter.compareEqual(this.packageName, null) && ScriptBytecodeAdapter.compareEqual(this.jsOptions, null))) {
      String str = "Neither js field nor packageName field is configured in the config.json.";
      return false;
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((ScriptBytecodeAdapter.compareNotEqual(this.packageName, null) && ScriptBytecodeAdapter.compareEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[15].call(this.liteDevices), Integer.valueOf(0)))) {
        String str = "Java project cannot contain lite devices.";
        return false;
      } 
    } else if ((((ScriptBytecodeAdapter.compareNotEqual(this.packageName, null) && ScriptBytecodeAdapter.compareEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[14].call(this.liteDevices), Integer.valueOf(0)))) {
      String str = "Java project cannot contain lite devices.";
      return false;
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((((ScriptBytecodeAdapter.compareEqual(this.packageName, null) && ScriptBytecodeAdapter.compareNotEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[18].call(this.liteDevices), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[19].call(this.richDevices), Integer.valueOf(0)))) {
        String str = "Js project cannot contain only rich devices.";
        return false;
      } 
    } else if ((((((ScriptBytecodeAdapter.compareEqual(this.packageName, null) && ScriptBytecodeAdapter.compareNotEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].call(this.liteDevices), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[17].call(this.richDevices), Integer.valueOf(0)))) {
      String str = "Js project cannot contain only rich devices.";
      return false;
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((((ScriptBytecodeAdapter.compareNotEqual(this.packageName, null) && ScriptBytecodeAdapter.compareNotEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[22].call(this.liteDevices), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[23].call(this.richDevices), Integer.valueOf(0)))) {
        String str = "Java&Js project cannot contain only lite devices.";
        return false;
      } 
      return true;
    } 
    if ((((((ScriptBytecodeAdapter.compareNotEqual(this.packageName, null) && ScriptBytecodeAdapter.compareNotEqual(this.jsOptions, null))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[20].call(this.liteDevices), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[21].call(this.richDevices), Integer.valueOf(0)))) {
      String str = "Java&Js project cannot contain only lite devices.";
      return false;
    } 
    return true;
  }
  
  @Nonnull
  public String getErrorMessage() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.errorMessage;
  }
}
