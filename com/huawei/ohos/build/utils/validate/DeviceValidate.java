package com.huawei.ohos.build.utils.validate;

import com.huawei.ohos.build.annotation.processor.ValidateProcessor;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.utils.configJson.TransformUtil;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class DeviceValidate implements ValidateFactory, GroovyObject {
  @Generated
  public DeviceValidate() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void validate(Options options, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void validate(Options options, String deviceType, Project project) {
    Reference reference1 = new Reference(options), reference2 = new Reference(deviceType), reference3 = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(reference1.get(), null))
      return; 
    arrayOfCallSite[0].call(ValidateProcessor.class, reference1.get(), reference2.get(), reference3.get());
    arrayOfCallSite[1].call(reference1.get(), reference1.get(), reference3.get());
    Field[] fields = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(reference1.get())), Field[].class);
    arrayOfCallSite[4].call(fields, new _validate_closure1(this, this, reference1, reference2, reference3));
  }
  
  public final class _validate_closure1 extends Closure implements GeneratedClosure {
    public _validate_closure1(Object _outerInstance, Object _thisObject, Reference options, Reference deviceType, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference1 = options;
      this.options = reference1;
      Reference reference2 = deviceType;
      this.deviceType = reference2;
      Reference reference3 = project;
      this.project = reference3;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String getMethod = ShortTypeHandling.castToString(arrayOfCallSite[0].call(TransformUtil.class, field));
      Class type = ShortTypeHandling.castToClass(arrayOfCallSite[1].callGetProperty(field));
      Class clazz1 = type;
      if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
        List list = (List)ScriptBytecodeAdapter.asType(arrayOfCallSite[2].call(this.options.get(), getMethod, null), List.class);
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(list, null) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(list)))))
            arrayOfCallSite[6].callCurrent((GroovyObject)this, this.deviceType.get(), this.project.get(), list); 
          int _i = 0;
          return Integer.valueOf(_i);
        } 
        if ((ScriptBytecodeAdapter.compareNotEqual(list, null) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(list)))))
          arrayOfCallSite[4].callCurrent((GroovyObject)this, this.deviceType.get(), this.project.get(), list); 
      } else if (ScriptBytecodeAdapter.isCase(clazz1, Map.class)) {
        Map map = (Map)ScriptBytecodeAdapter.asType(arrayOfCallSite[7].call(this.options.get(), getMethod, null), Map.class);
        if (ScriptBytecodeAdapter.compareNotEqual(map, null))
          arrayOfCallSite[8].callCurrent((GroovyObject)this, this.deviceType.get(), this.project.get(), map); 
      } else if (ScriptBytecodeAdapter.isCase(clazz1, Options.class)) {
        arrayOfCallSite[9].callCurrent((GroovyObject)this, ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.asType(arrayOfCallSite[10].call(this.options.get(), getMethod, null), Options.class), Options.class), this.deviceType.get(), this.project.get());
      } 
      boolean bool = false;
      return Integer.valueOf(bool);
    }
    
    @Generated
    public Options getOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.options.get(), Options.class);
    }
    
    @Generated
    public String getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.deviceType.get());
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
  }
  
  public void validateList(String deviceType, Project project, List validateList) {
    Reference reference1 = new Reference(deviceType), reference2 = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (arrayOfCallSite[5].call(validateList, Integer.valueOf(0)) instanceof Options)
      arrayOfCallSite[6].call(validateList, new _validateList_closure2(this, this, reference1, reference2)); 
  }
  
  public final class _validateList_closure2 extends Closure implements GeneratedClosure {
    public _validateList_closure2(Object _outerInstance, Object _thisObject, Reference deviceType, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference1 = deviceType;
      this.deviceType = reference1;
      Reference reference2 = project;
      this.project = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callCurrent((GroovyObject)this, it, this.deviceType.get(), this.project.get());
    }
    
    @Generated
    public String getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.deviceType.get());
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
  
  public void validateMap(String deviceType, Project project, Map validateMap) {
    Reference reference1 = new Reference(deviceType), reference2 = new Reference(project), reference3 = new Reference(validateMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set validateSets = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(reference3.get()), Set.class);
    arrayOfCallSite[8].call(validateSets, new _validateMap_closure3(this, this, reference3, reference2, reference1));
  }
  
  public final class _validateMap_closure3 extends Closure implements GeneratedClosure {
    public _validateMap_closure3(Object _outerInstance, Object _thisObject, Reference validateMap, Reference project, Reference deviceType) {
      super(_outerInstance, _thisObject);
      Reference reference1 = validateMap;
      this.validateMap = reference1;
      Reference reference2 = project;
      this.project = reference2;
      Reference reference3 = deviceType;
      this.deviceType = reference3;
    }
    
    public Object doCall(Object validateSet) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Object valueType = arrayOfCallSite[0].call(this.validateMap.get(), validateSet);
      if (valueType instanceof Options) {
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(DeviceType.class, validateSet))) {
          Reference type = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(StringBuffer.class), StringBuffer.class));
          arrayOfCallSite[3].call(arrayOfCallSite[4].call(DeviceType.class), new _closure4(this, getThisObject(), type));
          throw (Throwable)arrayOfCallSite[5].callConstructor(ValidateException.class, arrayOfCallSite[6].call(String.class, arrayOfCallSite[7].callGetProperty(Locale.class), arrayOfCallSite[8].callGetProperty(ValidateException.class), arrayOfCallSite[9].callGetProperty(this.project.get()), arrayOfCallSite[10].call(arrayOfCallSite[11].call((StringBuffer)type.get(), Integer.valueOf(0), arrayOfCallSite[12].call(arrayOfCallSite[13].call((StringBuffer)type.get()), Integer.valueOf(1))))));
        } 
        return arrayOfCallSite[14].callCurrent((GroovyObject)this, valueType, this.deviceType.get(), this.project.get());
      } 
      return null;
    }
    
    @Generated
    public Map getValidateMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.validateMap.get(), Map.class);
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public String getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.deviceType.get());
    }
    
    public final class _closure4 extends Closure implements GeneratedClosure {
      public _closure4(Object _outerInstance, Object _thisObject, Reference type) {
        super(_outerInstance, _thisObject);
        Reference reference = type;
        this.type = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.type.get(), arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(it), ","));
      }
      
      @Generated
      public StringBuffer getType() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (StringBuffer)ScriptBytecodeAdapter.castToType(this.type.get(), StringBuffer.class);
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
