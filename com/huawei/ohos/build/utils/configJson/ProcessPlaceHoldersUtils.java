package com.huawei.ohos.build.utils.configJson;

import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class ProcessPlaceHoldersUtils implements GroovyObject {
  @Nonnull
  private static final HMLogger HM_LOG;
  
  static {
    Object object = $getCallSiteArray()[26].call(HMLogger.class, ProcessPlaceHoldersUtils.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static <T> T process(Object mergerOptions, Map flavorConfigPlaceholders) {
    Reference reference1 = new Reference(mergerOptions), reference2 = new Reference(flavorConfigPlaceholders);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(reference1.get(), null))
      return null; 
    Field[] fields = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(reference1.get())), Field[].class);
    arrayOfCallSite[2].call(fields, new _process_closure1(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference1, reference2));
    return (T)reference1.get();
  }
  
  public final class _process_closure1 extends Closure implements GeneratedClosure {
    public _process_closure1(Object _outerInstance, Object _thisObject, Reference mergerOptions, Reference flavorConfigPlaceholders) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mergerOptions;
      this.mergerOptions = reference1;
      Reference reference2 = flavorConfigPlaceholders;
      this.flavorConfigPlaceholders = reference2;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Class type = ShortTypeHandling.castToClass(arrayOfCallSite[0].call(field));
      String setMethod = ShortTypeHandling.castToString(arrayOfCallSite[1].call(TransformUtil.class, field));
      String getMethod = ShortTypeHandling.castToString(arrayOfCallSite[2].call(TransformUtil.class, field));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(field), "$stMC")))
        return null; 
      Object realValue = arrayOfCallSite[5].call(this.mergerOptions.get(), getMethod, null);
      if (ScriptBytecodeAdapter.compareEqual(realValue, null))
        return null; 
      Class clazz1 = type;
      if (ScriptBytecodeAdapter.isCase(clazz1, String.class))
        return arrayOfCallSite[6].call(this.mergerOptions.get(), setMethod, arrayOfCallSite[7].callStatic(ProcessPlaceHoldersUtils.class, realValue, this.flavorConfigPlaceholders.get())); 
      if (ScriptBytecodeAdapter.isCase(clazz1, Boolean.class))
        return arrayOfCallSite[8].call(this.mergerOptions.get(), setMethod, arrayOfCallSite[9].call(Boolean.class, arrayOfCallSite[10].callStatic(ProcessPlaceHoldersUtils.class, arrayOfCallSite[11].call(realValue), this.flavorConfigPlaceholders.get()))); 
      if (ScriptBytecodeAdapter.isCase(clazz1, Integer.class))
        return arrayOfCallSite[12].call(this.mergerOptions.get(), setMethod, arrayOfCallSite[13].call(Integer.class, arrayOfCallSite[14].callStatic(ProcessPlaceHoldersUtils.class, arrayOfCallSite[15].call(realValue), this.flavorConfigPlaceholders.get()))); 
      if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
        Class subObjectClass = ShortTypeHandling.castToClass(arrayOfCallSite[16].call(TransformUtil.class, field));
        return arrayOfCallSite[17].call(this.mergerOptions.get(), setMethod, arrayOfCallSite[18].callStatic(ProcessPlaceHoldersUtils.class, subObjectClass, this.flavorConfigPlaceholders.get(), realValue));
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Map.class))
        return arrayOfCallSite[19].call(this.mergerOptions.get(), setMethod, arrayOfCallSite[20].callStatic(ProcessPlaceHoldersUtils.class, realValue, this.flavorConfigPlaceholders.get())); 
      if (ScriptBytecodeAdapter.isCase(clazz1, Options.class))
        return arrayOfCallSite[21].callStatic(ProcessPlaceHoldersUtils.class, realValue, this.flavorConfigPlaceholders.get()); 
      return arrayOfCallSite[22].call(arrayOfCallSite[23].callGetProperty(ProcessPlaceHoldersUtils.class), "Error type when process placeHolders!");
    }
    
    @Generated
    public Object getMergerOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.mergerOptions.get();
    }
    
    @Generated
    public Map getFlavorConfigPlaceholders() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.flavorConfigPlaceholders.get(), Map.class);
    }
  }
  
  public static Map processMap(Map realValue, Map flavorConfigPlaceholders) {
    Reference reference = new Reference(flavorConfigPlaceholders);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[4].call(realValue), Integer.valueOf(0))))
        return realValue; 
      return (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(realValue, new _processMap_closure2(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference)), Map.class);
    } 
    if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[3].call(realValue), Integer.valueOf(0))))
      return realValue; 
    return (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(realValue, new _processMap_closure2(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference)), Map.class);
  }
  
  public final class _processMap_closure2 extends Closure implements GeneratedClosure {
    public _processMap_closure2(Object _outerInstance, Object _thisObject, Reference flavorConfigPlaceholders) {
      super(_outerInstance, _thisObject);
      Reference reference = flavorConfigPlaceholders;
      this.flavorConfigPlaceholders = reference;
    }
    
    public Object doCall(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Class valueType = ShortTypeHandling.castToClass(arrayOfCallSite[0].callGetProperty(v));
      Class clazz1 = valueType;
      if (ScriptBytecodeAdapter.isCase(clazz1, List.class))
        return arrayOfCallSite[1].call(v, new _closure6(this, getThisObject(), this.flavorConfigPlaceholders)); 
      if (ScriptBytecodeAdapter.isCase(clazz1, Options.class))
        return arrayOfCallSite[2].callStatic(ProcessPlaceHoldersUtils.class, v, this.flavorConfigPlaceholders.get()); 
      return arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(ProcessPlaceHoldersUtils.class), "Error type when process placeHolders!");
    }
    
    public Object call(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[5].callCurrent((GroovyObject)this, k, v);
    }
    
    @Generated
    public Map getFlavorConfigPlaceholders() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.flavorConfigPlaceholders.get(), Map.class);
    }
    
    public final class _closure6 extends Closure implements GeneratedClosure {
      public _closure6(Object _outerInstance, Object _thisObject, Reference flavorConfigPlaceholders) {
        super(_outerInstance, _thisObject);
        Reference reference = flavorConfigPlaceholders;
        this.flavorConfigPlaceholders = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callStatic(ProcessPlaceHoldersUtils.class, it, this.flavorConfigPlaceholders.get());
      }
      
      @Generated
      public Map getFlavorConfigPlaceholders() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Map)ScriptBytecodeAdapter.castToType(this.flavorConfigPlaceholders.get(), Map.class);
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public static <T, E> List<T> processList(Class clazz, Map configPlaceholders, List realValue) {
    Reference reference = new Reference(configPlaceholders);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[7].call(realValue), Integer.valueOf(0))))
        return (List<T>)ScriptBytecodeAdapter.castToType(null, List.class); 
    } else if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[6].call(realValue), Integer.valueOf(0)))) {
      return (List<T>)ScriptBytecodeAdapter.castToType(null, List.class);
    } 
    Class clazz1 = clazz;
    if (ScriptBytecodeAdapter.isCase(clazz1, String.class)) {
      Reference afterRealValue = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(ArrayList.class), List.class));
      arrayOfCallSite[9].call(realValue, new _processList_closure3(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference, afterRealValue));
      return (List<T>)afterRealValue.get();
    } 
    if (ScriptBytecodeAdapter.isCase(clazz1, Map.class))
      return (List<T>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(realValue, new _processList_closure4(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference)), List.class); 
    if (ScriptBytecodeAdapter.isCase(clazz1, Options.class))
      return (List<T>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(realValue, new _processList_closure5(ProcessPlaceHoldersUtils.class, ProcessPlaceHoldersUtils.class, reference)), List.class); 
    return (List<T>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].callStatic(ProcessPlaceHoldersUtils.class, new GStringImpl(new Object[] { clazz }, new String[] { "Other Type!", "" })), List.class);
  }
  
  public final class _processList_closure3 extends Closure implements GeneratedClosure {
    public _processList_closure3(Object _outerInstance, Object _thisObject, Reference configPlaceholders, Reference afterRealValue) {
      super(_outerInstance, _thisObject);
      Reference reference1 = configPlaceholders;
      this.configPlaceholders = reference1;
      Reference reference2 = afterRealValue;
      this.afterRealValue = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String oriRealValue = ShortTypeHandling.castToString(arrayOfCallSite[0].callStatic(ProcessPlaceHoldersUtils.class, it, this.configPlaceholders.get()));
      return arrayOfCallSite[1].call(this.afterRealValue.get(), oriRealValue);
    }
    
    @Generated
    public Map getConfigPlaceholders() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.configPlaceholders.get(), Map.class);
    }
    
    @Generated
    public List getAfterRealValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.afterRealValue.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _processList_closure4 extends Closure implements GeneratedClosure {
    public _processList_closure4(Object _outerInstance, Object _thisObject, Reference configPlaceholders) {
      super(_outerInstance, _thisObject);
      Reference reference = configPlaceholders;
      this.configPlaceholders = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(ProcessPlaceHoldersUtils.class, it, this.configPlaceholders.get());
    }
    
    @Generated
    public Map getConfigPlaceholders() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.configPlaceholders.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _processList_closure5 extends Closure implements GeneratedClosure {
    public _processList_closure5(Object _outerInstance, Object _thisObject, Reference configPlaceholders) {
      super(_outerInstance, _thisObject);
      Reference reference = configPlaceholders;
      this.configPlaceholders = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(ProcessPlaceHoldersUtils.class, it, this.configPlaceholders.get());
    }
    
    @Generated
    public Map getConfigPlaceholders() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.configPlaceholders.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public static <T> T processPlaceholders(Object realValue, Map configPlaceholders) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[14].call(configPlaceholders), Integer.valueOf(0))))
        return (T)realValue; 
    } else if ((ScriptBytecodeAdapter.compareEqual(realValue, null) || ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[13].call(configPlaceholders), Integer.valueOf(0)))) {
      return (T)realValue;
    } 
    Object newRealValue = realValue;
    String midValue = ShortTypeHandling.castToString(arrayOfCallSite[15].call(realValue));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(Pattern.class, ".*\\{.*}.*", midValue))) {
      String flagData = ShortTypeHandling.castToString(arrayOfCallSite[17].call(midValue, arrayOfCallSite[18].call(arrayOfCallSite[19].call(midValue, "{"), Integer.valueOf(1)), arrayOfCallSite[20].call(midValue, "}")));
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[21].call(configPlaceholders, flagData), null))
        Object object = arrayOfCallSite[22].call(midValue, arrayOfCallSite[23].call(arrayOfCallSite[24].call("{", flagData), "}"), arrayOfCallSite[25].call(configPlaceholders, flagData)); 
    } 
    return (T)newRealValue;
  }
  
  @Generated
  public ProcessPlaceHoldersUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
