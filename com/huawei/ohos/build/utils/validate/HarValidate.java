package com.huawei.ohos.build.utils.validate;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;

public class HarValidate implements ValidateFactory, GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[3].call(HMLogger.class, HarValidate.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public void validate(Options options, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void validate(Options options, String deviceType, Project project) {
    Reference reference = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigOptions configOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(options, ConfigOptions.class);
    List abilitiesList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGroovyObjectGetProperty(configOptions)), List.class);
    if (ScriptBytecodeAdapter.compareEqual(abilitiesList, null))
      return; 
    arrayOfCallSite[2].call(abilitiesList, new _validate_closure1(this, this, reference));
  }
  
  @Generated
  public HarValidate() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public final class _validate_closure1 extends Closure implements GeneratedClosure {
    public _validate_closure1(Object _outerInstance, Object _thisObject, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference = project;
      this.project = reference;
    }
    
    public Object doCall(Object abilitiesOption) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      List skillsList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(abilitiesOption), List.class);
      if (ScriptBytecodeAdapter.compareNotEqual(skillsList, null))
        arrayOfCallSite[1].call(skillsList, new _closure2(this, getThisObject(), this.project)); 
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[2].call(abilitiesOption), null))
        return arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(HarValidate.class), arrayOfCallSite[5].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[6].callGetProperty(this.project.get()) }, new String[] { "Har module':", "',The ability label below the HAR module cannot contain the targetAbility label,Please check!" }))); 
      return null;
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    public final class _closure2 extends Closure implements GeneratedClosure {
      public _closure2(Object _outerInstance, Object _thisObject, Reference project) {
        super(_outerInstance, _thisObject);
        Reference reference = project;
        this.project = reference;
      }
      
      public Object doCall(Object skillMap) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        List myActions = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(skillMap), List.class);
        List myEntities = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(skillMap), List.class);
        if ((ScriptBytecodeAdapter.compareNotEqual(myActions, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(myActions, "action.system.home"))))
          arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this), arrayOfCallSite[5].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[6].callGetProperty(this.project.get()), arrayOfCallSite[7].callGetProperty(CommonConst.class) }, new String[] { "Har module':", "' cannot include 'action.system.home' in ", ",Please check!" }))); 
        if ((ScriptBytecodeAdapter.compareNotEqual(myEntities, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(myEntities, "entity.system.home"))))
          return arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].callConstructor(ValidateException.class, new GStringImpl(new Object[] { arrayOfCallSite[12].callGetProperty(this.project.get()), arrayOfCallSite[13].callGetProperty(CommonConst.class) }, new String[] { "Har module':", "' cannot include 'entity.system.home' in ", ",Please check!" }))); 
        return null;
      }
      
      @Generated
      public Project getProject() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
      }
    }
  }
}
