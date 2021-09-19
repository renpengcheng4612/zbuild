package com.huawei.ohos.build.utils.configJson;

import com.huawei.ohos.build.enumlation.MergeRuleType;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.DeviceConfigOptions;
import com.huawei.ohos.build.shell.ModuleOptions;
import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.utils.ListUtils;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;

public class TransformUtil implements GroovyObject {
  private static String appBundleName;
  
  private static String hapModulePackage;
  
  private static String harModulePackage;
  
  @Generated
  public TransformUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static <T> T transform2Object(Map jsonMap, Class clazz) {
    Reference reference1 = new Reference(jsonMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference object = new Reference(arrayOfCallSite[0].call(clazz));
    Field[] fieldList = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(clazz), Field[].class);
    arrayOfCallSite[2].call(fieldList, new _transform2Object_closure1(TransformUtil.class, TransformUtil.class, reference1, object));
    return (T)object.get();
  }
  
  public final class _transform2Object_closure1 extends Closure implements GeneratedClosure {
    public _transform2Object_closure1(Object _outerInstance, Object _thisObject, Reference jsonMap, Reference object) {
      super(_outerInstance, _thisObject);
      Reference reference1 = jsonMap;
      this.jsonMap = reference1;
      Reference reference2 = object;
      this.object = reference2;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Class type = ShortTypeHandling.castToClass(arrayOfCallSite[0].callGetProperty(field));
      String setMethodName = ShortTypeHandling.castToString(arrayOfCallSite[1].callStatic(TransformUtil.class, field));
      Class clazz1 = type;
      if (ScriptBytecodeAdapter.isCase(clazz1, Boolean.class)) {
        Boolean params = (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callStatic(TransformUtil.class, this.jsonMap.get(), field, Boolean.class), Boolean.class);
        return arrayOfCallSite[3].call(this.object.get(), setMethodName, params);
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Integer.class)) {
        Integer params = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callStatic(TransformUtil.class, this.jsonMap.get(), field, Integer.class), Integer.class);
        return arrayOfCallSite[5].call(this.object.get(), setMethodName, params);
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, String.class)) {
        String params = ShortTypeHandling.castToString(arrayOfCallSite[6].callStatic(TransformUtil.class, this.jsonMap.get(), field, String.class));
        return arrayOfCallSite[7].call(this.object.get(), setMethodName, params);
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
        Reference curFieldList = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(ArrayList.class), List.class));
        Reference subObjectClass = new Reference(ShortTypeHandling.castToClass(arrayOfCallSite[9].callStatic(TransformUtil.class, field)));
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(subObjectClass.get(), String.class))) {
          Object object = arrayOfCallSite[11].call(CastTransformUtil.class, arrayOfCallSite[12].call(this.jsonMap.get(), arrayOfCallSite[13].callStatic(TransformUtil.class, arrayOfCallSite[14].callGetProperty(field))), String.class);
          curFieldList.set(ScriptBytecodeAdapter.castToType(object, List.class));
        } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(subObjectClass.get(), Map.class))) {
          Object object = arrayOfCallSite[16].call(CastTransformUtil.class, arrayOfCallSite[17].call(this.jsonMap.get(), arrayOfCallSite[18].callStatic(TransformUtil.class, arrayOfCallSite[19].callGetProperty(field))), Map.class);
          curFieldList.set(ScriptBytecodeAdapter.castToType(object, List.class));
        } else {
          String jsonLabelName = ShortTypeHandling.castToString(arrayOfCallSite[20].callStatic(TransformUtil.class, arrayOfCallSite[21].callGetProperty(field)));
          List jsonField = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].call(CastTransformUtil.class, arrayOfCallSite[23].call(this.jsonMap.get(), jsonLabelName), Map.class), List.class);
          arrayOfCallSite[24].call(jsonField, new _closure14(this, getThisObject(), subObjectClass, curFieldList));
        } 
        return arrayOfCallSite[25].call(this.object.get(), setMethodName, curFieldList.get());
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Map.class)) {
        Map curMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[26].call(CastTransformUtil.class, arrayOfCallSite[27].call(this.jsonMap.get(), arrayOfCallSite[28].callStatic(TransformUtil.class, arrayOfCallSite[29].callGetProperty(field))), Object.class), Map.class);
        return arrayOfCallSite[30].call(this.object.get(), setMethodName, curMap);
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Options.class)) {
        String jsonLabelName = ShortTypeHandling.castToString(arrayOfCallSite[31].callStatic(TransformUtil.class, arrayOfCallSite[32].callGetProperty(field)));
        Object fieldObj = arrayOfCallSite[33].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].call(this.jsonMap.get(), jsonLabelName), Map.class), Map.class), arrayOfCallSite[35].callGetProperty(field));
        return arrayOfCallSite[36].call(this.object.get(), setMethodName, fieldObj);
      } 
      return arrayOfCallSite[37].callCurrent((GroovyObject)this, new GStringImpl(new Object[] { arrayOfCallSite[38].callGetProperty(field) }, new String[] { "Other Fileds:", "" }));
    }
    
    @Generated
    public Map getJsonMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.jsonMap.get(), Map.class);
    }
    
    @Generated
    public Object getObject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.object.get();
    }
    
    public final class _closure14 extends Closure implements GeneratedClosure {
      public _closure14(Object _outerInstance, Object _thisObject, Reference subObjectClass, Reference curFieldList) {
        super(_outerInstance, _thisObject);
        Reference reference1 = subObjectClass;
        this.subObjectClass = reference1;
        Reference reference2 = curFieldList;
        this.curFieldList = reference2;
      }
      
      public Object doCall(Object map) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        Object obj = arrayOfCallSite[0].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(map, Map.class), Map.class), this.subObjectClass.get());
        return arrayOfCallSite[1].call(this.curFieldList.get(), obj);
      }
      
      @Generated
      public Class getSubObjectClass() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return ShortTypeHandling.castToClass(this.subObjectClass.get());
      }
      
      @Generated
      public List getCurFieldList() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (List)ScriptBytecodeAdapter.castToType(this.curFieldList.get(), List.class);
      }
    }
  }
  
  public static <T> T mergeConfigJson(Object hapConfig, Queue harConfigLists, Class clazz) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (hapConfig instanceof ConfigOptions) {
      ConfigOptions hapConfigOptions = (ConfigOptions)ScriptBytecodeAdapter.castToType(hapConfig, ConfigOptions.class);
      Object object = arrayOfCallSite[3].call(arrayOfCallSite[4].call(hapConfigOptions));
      appBundleName = ShortTypeHandling.castToString(object);
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].call(harConfigLists), Integer.valueOf(0)))
      return (T)hapConfig; 
    Object curHarConfig = arrayOfCallSite[6].call(harConfigLists);
    Object newHapConfig = arrayOfCallSite[7].callStatic(TransformUtil.class, hapConfig, curHarConfig, clazz);
    return (T)arrayOfCallSite[8].callStatic(TransformUtil.class, newHapConfig, harConfigLists, clazz);
  }
  
  public static <T> T mergeModel(Object hapConfig, Object harConfig, Class clazz) {
    Reference reference1 = new Reference(hapConfig), reference2 = new Reference(harConfig), reference3 = new Reference(clazz);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(MergeRuleType.KeepHapOptions.class, arrayOfCallSite[10].callGetProperty(reference3.get()))))
      return (T)reference1.get(); 
    if (ScriptBytecodeAdapter.compareEqual(reference2.get(), null))
      return (T)reference1.get(); 
    if (ScriptBytecodeAdapter.compareEqual(reference1.get(), null))
      return (T)reference2.get(); 
    Reference newHapConfig = new Reference(arrayOfCallSite[11].call(reference3.get()));
    Field[] fields = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].call(reference3.get()), Field[].class);
    arrayOfCallSite[13].call(fields, new _mergeModel_closure2(TransformUtil.class, TransformUtil.class, reference1, reference2, reference3, newHapConfig));
    return (T)newHapConfig.get();
  }
  
  public final class _mergeModel_closure2 extends Closure implements GeneratedClosure {
    public _mergeModel_closure2(Object _outerInstance, Object _thisObject, Reference hapConfig, Reference harConfig, Reference clazz, Reference newHapConfig) {
      super(_outerInstance, _thisObject);
      Reference reference1 = hapConfig;
      this.hapConfig = reference1;
      Reference reference2 = harConfig;
      this.harConfig = reference2;
      Reference reference3 = clazz;
      this.clazz = reference3;
      Reference reference4 = newHapConfig;
      this.newHapConfig = reference4;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Class type = ShortTypeHandling.castToClass(arrayOfCallSite[0].call(field));
      String setMethod = ShortTypeHandling.castToString(arrayOfCallSite[1].callStatic(TransformUtil.class, field));
      String getMethod = ShortTypeHandling.castToString(arrayOfCallSite[2].callStatic(TransformUtil.class, field));
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(field), "$stMC")))
        arrayOfCallSite[5].callStatic(TransformUtil.class, ArrayUtil.createArray(this.hapConfig.get(), this.harConfig.get(), this.clazz.get(), arrayOfCallSite[6].call(this.clazz.get(), getMethod, null), field)); 
      Class clazz1 = type;
      if (ScriptBytecodeAdapter.isCase(clazz1, Boolean.class)) {
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(MergeRuleType.KeepOneOfThem.class, arrayOfCallSite[8].callGetProperty(field)))) {
          Object object1 = arrayOfCallSite[9].call(this.hapConfig.get(), getMethod, null);
          Object harValue = arrayOfCallSite[10].call(this.harConfig.get(), getMethod, null);
          Object object2 = null;
          if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            Object object = ((ScriptBytecodeAdapter.compareEqual(object1, null) && ScriptBytecodeAdapter.compareNotEqual(harValue, null))) ? harValue : object1;
          } else {
            Object object = ((ScriptBytecodeAdapter.compareEqual(object1, null) && ScriptBytecodeAdapter.compareNotEqual(harValue, null))) ? harValue : object1;
          } 
          arrayOfCallSite[11].call(this.newHapConfig.get(), setMethod, object2);
          return null;
        } 
      } else if (!ScriptBytecodeAdapter.isCase(clazz1, String.class) && !ScriptBytecodeAdapter.isCase(clazz1, Integer.class)) {
        if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
          Set curFieldList = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callConstructor(HashSet.class), Set.class);
          if (ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ModuleOptions.class)) {
            if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(MergeRuleType.KeepModuleAttr.class, arrayOfCallSite[18].callGetProperty(field)))) {
              List list = (List)ScriptBytecodeAdapter.asType(arrayOfCallSite[19].call(this.hapConfig.get(), getMethod, null), List.class);
              arrayOfCallSite[20].call(curFieldList, ScriptBytecodeAdapter.compareEqual(list, null) ? ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].callConstructor(ArrayList.class), List.class) : list);
            } else {
              Object object1 = arrayOfCallSite[22].call(this.hapConfig.get(), "getPackageName", null);
              ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _mergeModel_closure2.class, (GroovyObject)this, "hapModulePackage");
              Object object2 = arrayOfCallSite[23].call(this.harConfig.get(), "getPackageName", null);
              ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object2), _mergeModel_closure2.class, (GroovyObject)this, "harModulePackage");
              Class subObjectClass = ShortTypeHandling.castToClass(arrayOfCallSite[24].callStatic(TransformUtil.class, field));
              arrayOfCallSite[25].call(curFieldList, arrayOfCallSite[26].callStatic(TransformUtil.class, this.hapConfig.get(), this.harConfig.get(), field, subObjectClass));
            } 
          } else {
            Class subObjectClass = ShortTypeHandling.castToClass(arrayOfCallSite[27].callStatic(TransformUtil.class, field));
            arrayOfCallSite[28].call(curFieldList, arrayOfCallSite[29].callStatic(TransformUtil.class, this.hapConfig.get(), this.harConfig.get(), field, subObjectClass));
          } 
          return arrayOfCallSite[30].call(this.newHapConfig.get(), setMethod, ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[31].call(curFieldList), Integer.valueOf(0)) ? null : arrayOfCallSite[32].callConstructor(ArrayList.class, curFieldList));
        } 
        if (ScriptBytecodeAdapter.isCase(clazz1, Map.class)) {
          Map hapMap = (Map)ScriptBytecodeAdapter.asType(arrayOfCallSite[33].call(this.hapConfig.get(), getMethod, null), Map.class);
          Map harMap = (Map)ScriptBytecodeAdapter.asType(arrayOfCallSite[34].call(this.harConfig.get(), getMethod, null), Map.class);
          boolean flag = true;
          Object curFieldMap = null;
          if (ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ConfigOptions.class)) {
            boolean bool = false;
            if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
              if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[42].call(harMap, "default"), null) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[43].call(hapMap, "default"), null)))
                if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[44].call(arrayOfCallSite[45].call(harMap, "default"), "allowComponentsProxy"), null)) {
                  ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[46].call(harMap, "default"), null);
                } else {
                  arrayOfCallSite[47].call(hapMap, "default", arrayOfCallSite[48].callConstructor(DeviceConfigOptions.class));
                }  
              Object object = arrayOfCallSite[49].callStatic(TransformUtil.class, hapMap, harMap, Boolean.valueOf(flag));
              return arrayOfCallSite[50].call(this.newHapConfig.get(), setMethod, curFieldMap);
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[35].call(harMap, "default"), null) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[36].call(hapMap, "default"), null)))
              if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[37].call(arrayOfCallSite[38].call(harMap, "default"), "allowComponentsProxy"), null)) {
                ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[39].call(harMap, "default"), null);
              } else {
                arrayOfCallSite[40].call(hapMap, "default", arrayOfCallSite[41].callConstructor(DeviceConfigOptions.class));
              }  
          } 
          Object object1 = arrayOfCallSite[49].callStatic(TransformUtil.class, hapMap, harMap, Boolean.valueOf(flag));
          return arrayOfCallSite[50].call(this.newHapConfig.get(), setMethod, curFieldMap);
        } 
        if (ScriptBytecodeAdapter.isCase(clazz1, Options.class)) {
          Options newOption = (Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].callStatic(TransformUtil.class, arrayOfCallSite[52].call(this.hapConfig.get(), getMethod, null), arrayOfCallSite[53].call(this.harConfig.get(), getMethod, null), type), Options.class);
          return arrayOfCallSite[54].call(this.newHapConfig.get(), setMethod, arrayOfCallSite[55].callStatic(TransformUtil.class, newOption, arrayOfCallSite[56].call(this.hapConfig.get(), getMethod, null)));
        } 
        return null;
      } 
      Object hapValue = arrayOfCallSite[12].call(this.hapConfig.get(), getMethod, null);
      Object realValue = null;
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ModuleOptions.class) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DeviceConfigOptions.class))) || ScriptBytecodeAdapter.compareNotEqual(hapValue, null))) {
          Object object = hapValue;
        } else {
          Object object = arrayOfCallSite[14].call(this.harConfig.get(), getMethod, null);
        } 
        return arrayOfCallSite[15].call(this.newHapConfig.get(), setMethod, realValue);
      } 
      if ((((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ModuleOptions.class) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DeviceConfigOptions.class))) || ScriptBytecodeAdapter.compareNotEqual(hapValue, null))) {
        Object object = hapValue;
      } else {
        Object object = arrayOfCallSite[13].call(this.harConfig.get(), getMethod, null);
      } 
      return arrayOfCallSite[15].call(this.newHapConfig.get(), setMethod, realValue);
    }
    
    @Generated
    public Object getHapConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.hapConfig.get();
    }
    
    @Generated
    public Object getHarConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.harConfig.get();
    }
    
    @Generated
    public Class getClazz() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToClass(this.clazz.get());
    }
    
    @Generated
    public Object getNewHapConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.newHapConfig.get();
    }
  }
  
  public static <T> boolean checkFieldRule(Object hapConfig, Object harConfig, Class modelClass, Method getMethod, Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Method getIsNeedMergeRuleOptionsMethod = (Method)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(modelClass, "isNeedMergeRuleOptions", null), Method.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(getIsNeedMergeRuleOptionsMethod, hapConfig))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[20].call(MergeRuleType.KeepAbilityMergeList.class, arrayOfCallSite[21].callGetProperty(field))))) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[22].callGetProperty(field), "skills")))
        return true; 
    } else if (((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(getIsNeedMergeRuleOptionsMethod, hapConfig))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(MergeRuleType.KeepAbilityMergeList.class, arrayOfCallSite[17].callGetProperty(field))))) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[18].callGetProperty(field), "skills"))) {
      return true;
    } 
    Method getMergeRuleMethod = (Method)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(modelClass, "getMergeRule"), Method.class);
    Map mergeRuleOptions = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(getMergeRuleMethod, hapConfig), Map.class);
    List replaceList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].callConstructor(ArrayList.class), List.class);
    List removeList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[26].callConstructor(ArrayList.class), List.class);
    if ((ScriptBytecodeAdapter.compareNotEqual(mergeRuleOptions, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(mergeRuleOptions, "replace"))))
      arrayOfCallSite[28].call(replaceList, arrayOfCallSite[29].call(mergeRuleOptions, "replace")); 
    if ((ScriptBytecodeAdapter.compareNotEqual(mergeRuleOptions, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[30].call(mergeRuleOptions, "remove"))))
      arrayOfCallSite[31].call(removeList, arrayOfCallSite[32].call(mergeRuleOptions, "remove")); 
    Object hapFieldValue = arrayOfCallSite[33].call(getMethod, hapConfig, null);
    Object harFieldValue = arrayOfCallSite[34].call(getMethod, harConfig, null);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(hapFieldValue, null) || ScriptBytecodeAdapter.compareEqual(harFieldValue, null)))
        return true; 
    } else if ((ScriptBytecodeAdapter.compareEqual(hapFieldValue, null) || ScriptBytecodeAdapter.compareEqual(harFieldValue, null))) {
      return true;
    } 
    Class fieldClass = ShortTypeHandling.castToClass(arrayOfCallSite[35].call(field));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].callStatic(TransformUtil.class, hapFieldValue, harFieldValue, fieldClass, field))) {
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[37].call(replaceList, arrayOfCallSite[38].callGetProperty(field))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[39].call(removeList, arrayOfCallSite[40].callGetProperty(field)))))
        return true; 
      String jsonLabelName = ShortTypeHandling.castToString(arrayOfCallSite[41].callStatic(TransformUtil.class, arrayOfCallSite[42].callGetProperty(modelClass)));
      Method method = (Method)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(modelClass, "getUniqueKey", null), Method.class);
      String uniqueKey = ShortTypeHandling.castToString(arrayOfCallSite[44].call(method, hapConfig, null));
      String err = ShortTypeHandling.castToString(
          arrayOfCallSite[45].call(arrayOfCallSite[46].call("Unable to merge Config.json files.", new GStringImpl(new Object[] { jsonLabelName, uniqueKey, arrayOfCallSite[47].callGetProperty(field) }, new String[] { " The value '", "'", "' conflicts with the value ':", "' of a subtag in the HAR file." })), " Please verify and then add 'mergeRule' in the HAP."));
      throw (Throwable)arrayOfCallSite[48].callConstructor(GradleException.class, err);
    } 
    return DefaultTypeTransformation.booleanUnbox(null);
  }
  
  public static String getJsonLabelByModelClass(String modelClassName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String laseName = ShortTypeHandling.castToString(arrayOfCallSite[49].call(modelClassName, arrayOfCallSite[50].call(arrayOfCallSite[51].call(modelClassName, "."), Integer.valueOf(1))));
    return ShortTypeHandling.castToString(arrayOfCallSite[52].call(laseName, Integer.valueOf(0), arrayOfCallSite[53].call(arrayOfCallSite[54].call(laseName), Integer.valueOf(7))));
  }
  
  public static boolean isSameFieldValue(Object hapFieldValue, Object harFieldValue, Class fieldClass, Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean isSame = false;
    Class clazz = fieldClass;
    if (ScriptBytecodeAdapter.isCase(clazz, Boolean.class) || ScriptBytecodeAdapter.isCase(clazz, String.class) || ScriptBytecodeAdapter.isCase(clazz, Integer.class)) {
      boolean bool = ScriptBytecodeAdapter.compareEqual(hapFieldValue, harFieldValue);
    } else if (ScriptBytecodeAdapter.isCase(clazz, Options.class)) {
      Object object = arrayOfCallSite[55].call(hapFieldValue, harFieldValue);
      isSame = DefaultTypeTransformation.booleanUnbox(object);
    } else if (ScriptBytecodeAdapter.isCase(clazz, List.class)) {
      Object object = arrayOfCallSite[56].call(ListUtils.class, ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(hapFieldValue, List.class), List.class), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(harFieldValue, List.class), List.class));
      isSame = DefaultTypeTransformation.booleanUnbox(object);
    } else {
      boolean bool = false;
    } 
    return isSame;
  }
  
  public static Map mergeMap(Map hapMap, Map harMap, Boolean isAdd) {
    Reference reference1 = new Reference(hapMap), reference2 = new Reference(harMap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareEqual(reference2.get(), null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].call(reference2.get()))))
      return (Map)reference1.get(); 
    if ((ScriptBytecodeAdapter.compareEqual(reference1.get(), null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(reference2.get()))))
      return (Map)reference2.get(); 
    Reference mergeMap = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].callConstructor(HashMap.class), Map.class));
    Set harKeySets = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].callConstructor(HashSet.class, arrayOfCallSite[61].call(reference2.get())), Set.class);
    Set hapKeySets = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].callConstructor(HashSet.class, arrayOfCallSite[63].call(reference1.get())), Set.class);
    Set addKeySets = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[64].callConstructor(HashSet.class, harKeySets), Set.class);
    arrayOfCallSite[65].call(addKeySets, hapKeySets);
    arrayOfCallSite[66].call(mergeMap.get(), reference1.get());
    if (DefaultTypeTransformation.booleanUnbox(isAdd))
      arrayOfCallSite[67].call(addKeySets, new _mergeMap_closure3(TransformUtil.class, TransformUtil.class, mergeMap, reference2)); 
    Set sameKeySets = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].callConstructor(HashSet.class, harKeySets), Set.class);
    arrayOfCallSite[69].call(sameKeySets, addKeySets);
    arrayOfCallSite[70].call(sameKeySets, new _mergeMap_closure4(TransformUtil.class, TransformUtil.class, reference1, reference2, mergeMap));
    return (Map)mergeMap.get();
  }
  
  public final class _mergeMap_closure3 extends Closure implements GeneratedClosure {
    public _mergeMap_closure3(Object _outerInstance, Object _thisObject, Reference mergeMap, Reference harMap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mergeMap;
      this.mergeMap = reference1;
      Reference reference2 = harMap;
      this.harMap = reference2;
    }
    
    public Object doCall(Object addKey) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.mergeMap.get(), addKey, arrayOfCallSite[1].call(this.harMap.get(), addKey));
    }
    
    @Generated
    public Map getMergeMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mergeMap.get(), Map.class);
    }
    
    @Generated
    public Map getHarMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.harMap.get(), Map.class);
    }
  }
  
  public final class _mergeMap_closure4 extends Closure implements GeneratedClosure {
    public _mergeMap_closure4(Object _outerInstance, Object _thisObject, Reference hapMap, Reference harMap, Reference mergeMap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = hapMap;
      this.hapMap = reference1;
      Reference reference2 = harMap;
      this.harMap = reference2;
      Reference reference3 = mergeMap;
      this.mergeMap = reference3;
    }
    
    public Object doCall(Object sameKey) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Class valueType = ShortTypeHandling.castToClass(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].call(this.hapMap.get(), sameKey)));
      Class clazz1 = valueType;
      if (!ScriptBytecodeAdapter.isCase(clazz1, Boolean.class) && !ScriptBytecodeAdapter.isCase(clazz1, Integer.class) && !ScriptBytecodeAdapter.isCase(clazz1, String.class))
        if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
          Set mergeSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(HashSet.class, ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.asType(arrayOfCallSite[3].call(this.hapMap.get(), sameKey), List.class), List.class)), Set.class);
          arrayOfCallSite[4].call(mergeSet, arrayOfCallSite[5].call(this.harMap.get(), sameKey));
          arrayOfCallSite[6].call(this.mergeMap.get(), sameKey, mergeSet);
        } else if (ScriptBytecodeAdapter.isCase(clazz1, Options.class)) {
          Object newOption = arrayOfCallSite[7].callStatic(TransformUtil.class, arrayOfCallSite[8].call(this.hapMap.get(), sameKey), arrayOfCallSite[9].call(this.harMap.get(), sameKey), valueType);
          arrayOfCallSite[10].call(this.mergeMap.get(), sameKey, newOption);
        }  
      int _i = 0;
      return Integer.valueOf(_i);
    }
    
    @Generated
    public Map getHapMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.hapMap.get(), Map.class);
    }
    
    @Generated
    public Map getHarMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.harMap.get(), Map.class);
    }
    
    @Generated
    public Map getMergeMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mergeMap.get(), Map.class);
    }
  }
  
  public static <T, E> Set<T> mergeList(Object hapConfig, Object harConfig, Field curListField, Class clazz) {
    Reference reference1 = new Reference(clazz);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference mergeList = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[71].callConstructor(HashSet.class), Set.class));
    String fieldGetMethodName = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getGetMethodName(curListField);
    } else {
      Object object = arrayOfCallSite[72].callStatic(TransformUtil.class, curListField);
      fieldGetMethodName = ShortTypeHandling.castToString(object);
    } 
    Reference hapField = new Reference(ScriptBytecodeAdapter.asType(arrayOfCallSite[73].call(hapConfig, fieldGetMethodName, null), List.class));
    List harField = (List)ScriptBytecodeAdapter.asType(arrayOfCallSite[74].call(harConfig, fieldGetMethodName, null), List.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[75].call(arrayOfCallSite[76].callGetProperty(reference1.get()), "SkillsOptions")))
      return (Set<T>)ScriptBytecodeAdapter.castToType(hapField.get(), Set.class); 
    Class clazz1 = (Class)reference1.get();
    if (ScriptBytecodeAdapter.isCase(clazz1, String.class)) {
      arrayOfCallSite[77].call(mergeList.get(), ScriptBytecodeAdapter.compareEqual(hapField.get(), null) ? ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].callConstructor(ArrayList.class), List.class) : hapField.get());
      arrayOfCallSite[79].call(mergeList.get(), ScriptBytecodeAdapter.compareEqual(harField, null) ? ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].callConstructor(ArrayList.class), List.class) : harField);
    } else if (ScriptBytecodeAdapter.isCase(clazz1, Map.class)) {
      Reference mapUniqueKey = new Reference(null);
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        String str = getMapUniqueKey(curListField);
        mapUniqueKey.set(str);
      } else {
        Object object = arrayOfCallSite[81].callStatic(TransformUtil.class, curListField);
        mapUniqueKey.set(ShortTypeHandling.castToString(object));
      } 
      arrayOfCallSite[82].call(mergeList.get(), ScriptBytecodeAdapter.compareEqual(hapField.get(), null) ? ScriptBytecodeAdapter.castToType(arrayOfCallSite[83].callConstructor(ArrayList.class), List.class) : hapField.get());
      arrayOfCallSite[84].call(harField, new _mergeList_closure5(TransformUtil.class, TransformUtil.class, hapField, mapUniqueKey, mergeList));
    } else if (ScriptBytecodeAdapter.isCase(clazz1, Options.class)) {
      Reference method = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[85].call(reference1.get(), "getUniqueKey", null), Method.class));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[86].call(MergeRuleType.HasPlaceholderOptions.class, arrayOfCallSite[87].callGetProperty(curListField)))) {
        arrayOfCallSite[88].call(hapField.get(), new _mergeList_closure6(TransformUtil.class, TransformUtil.class));
        arrayOfCallSite[89].call(harField, new _mergeList_closure7(TransformUtil.class, TransformUtil.class));
      } 
      Object hapOption;
      Iterator iterator;
      for (hapOption = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[90].call(hapField.get()), Iterator.class); iterator.hasNext(); ) {
        hapOption = iterator.next();
        Options harOption = (Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(harField, List.class), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(hapOption, Options.class), Options.class), method.get(), reference1.get()), Options.class);
        if (ScriptBytecodeAdapter.compareEqual(harOption, null))
          arrayOfCallSite[92].call(mergeList.get(), hapOption); 
      } 
      arrayOfCallSite[93].call(harField, new _mergeList_closure8(TransformUtil.class, TransformUtil.class, hapField, method, reference1, mergeList));
    } else {
      arrayOfCallSite[94].callStatic(TransformUtil.class, new GStringImpl(new Object[] { reference1.get() }, new String[] { "Other Type!", "" }));
    } 
    return (Set<T>)mergeList.get();
  }
  
  public final class _mergeList_closure5 extends Closure implements GeneratedClosure {
    public _mergeList_closure5(Object _outerInstance, Object _thisObject, Reference hapField, Reference mapUniqueKey, Reference mergeList) {
      super(_outerInstance, _thisObject);
      Reference reference1 = hapField;
      this.hapField = reference1;
      Reference reference2 = mapUniqueKey;
      this.mapUniqueKey = reference2;
      Reference reference3 = mergeList;
      this.mergeList = reference3;
    }
    
    public Object doCall(Object harMap) {
      Reference reference1 = new Reference(harMap);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Reference hapMap = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(this.hapField.get(), List.class), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(reference1.get(), Map.class), Map.class), this.mapUniqueKey.get()), Map.class));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(hapMap.get())))
        return arrayOfCallSite[2].call(this.mergeList.get(), reference1.get()); 
      Collection addKeySet = (Collection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callConstructor(HashSet.class, arrayOfCallSite[4].call(reference1.get())), Collection.class);
      arrayOfCallSite[5].call(addKeySet, arrayOfCallSite[6].call(hapMap.get()));
      return arrayOfCallSite[7].call(addKeySet, new _closure15(this, getThisObject(), hapMap, reference1));
    }
    
    @Generated
    public List getHapField() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.hapField.get(), List.class);
    }
    
    @Generated
    public String getMapUniqueKey() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.mapUniqueKey.get());
    }
    
    @Generated
    public Set getMergeList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.mergeList.get(), Set.class);
    }
    
    public final class _closure15 extends Closure implements GeneratedClosure {
      public _closure15(Object _outerInstance, Object _thisObject, Reference hapMap, Reference harMap) {
        super(_outerInstance, _thisObject);
        Reference reference1 = hapMap;
        this.hapMap = reference1;
        Reference reference2 = harMap;
        this.harMap = reference2;
      }
      
      public Object doCall(Object addKey) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.hapMap.get(), addKey, arrayOfCallSite[1].call(this.harMap.get(), addKey));
      }
      
      @Generated
      public Map getHapMap() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Map)ScriptBytecodeAdapter.castToType(this.hapMap.get(), Map.class);
      }
      
      @Generated
      public Object getHarMap() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.harMap.get();
      }
    }
  }
  
  public final class _mergeList_closure6 extends Closure implements GeneratedClosure {
    public _mergeList_closure6(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(TransformUtil.class, it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _mergeList_closure7 extends Closure implements GeneratedClosure {
    public _mergeList_closure7(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(TransformUtil.class, it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _mergeList_closure8 extends Closure implements GeneratedClosure {
    public _mergeList_closure8(Object _outerInstance, Object _thisObject, Reference hapField, Reference method, Reference clazz, Reference mergeList) {
      super(_outerInstance, _thisObject);
      Reference reference1 = hapField;
      this.hapField = reference1;
      Reference reference2 = method;
      this.method = reference2;
      Reference reference3 = clazz;
      this.clazz = reference3;
      Reference reference4 = mergeList;
      this.mergeList = reference4;
    }
    
    public Object doCall(Object harOption) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Options hapOption = (Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(this.hapField.get(), List.class), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.castToType(harOption, Options.class), Options.class), this.method.get(), this.clazz.get()), Options.class);
      if (ScriptBytecodeAdapter.compareEqual(hapOption, null))
        return arrayOfCallSite[1].call(this.mergeList.get(), harOption); 
      Options mergeOptions = (Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callStatic(TransformUtil.class, ScriptBytecodeAdapter.createPojoWrapper(hapOption, Object.class), ScriptBytecodeAdapter.createPojoWrapper(harOption, Object.class), ScriptBytecodeAdapter.createPojoWrapper(this.clazz.get(), Class.class)), Options.class);
      return arrayOfCallSite[3].call(this.mergeList.get(), arrayOfCallSite[4].callStatic(TransformUtil.class, mergeOptions, hapOption));
    }
    
    @Generated
    public List getHapField() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.hapField.get(), List.class);
    }
    
    @Generated
    public Method getMethod() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Method)ScriptBytecodeAdapter.castToType(this.method.get(), Method.class);
    }
    
    @Generated
    public Class getClazz() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToClass(this.clazz.get());
    }
    
    @Generated
    public Set getMergeList() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.mergeList.get(), Set.class);
    }
  }
  
  public static Options isSameOptionWithHap(List hapOptions, Options harOption, Method method, Class clazz) {
    Reference reference1 = new Reference(harOption), reference2 = new Reference(method), reference3 = new Reference(clazz);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference sameOption = new Reference(null);
    Reference harValue = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[95].call(reference1.get(), arrayOfCallSite[96].callGetProperty(reference2.get()), null)));
    arrayOfCallSite[97].call(hapOptions, new _isSameOptionWithHap_closure9(TransformUtil.class, TransformUtil.class, reference2, reference3, reference1, harValue, sameOption));
    return (Options)sameOption.get();
  }
  
  public final class _isSameOptionWithHap_closure9 extends Closure implements GeneratedClosure {
    public _isSameOptionWithHap_closure9(Object _outerInstance, Object _thisObject, Reference method, Reference clazz, Reference harOption, Reference harValue, Reference sameOption) {
      super(_outerInstance, _thisObject);
      Reference reference1 = method;
      this.method = reference1;
      Reference reference2 = clazz;
      this.clazz = reference2;
      Reference reference3 = harOption;
      this.harOption = reference3;
      Reference reference4 = harValue;
      this.harValue = reference4;
      Reference reference5 = sameOption;
      this.sameOption = reference5;
    }
    
    public Object doCall(Object hapOption) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String hapValue = ShortTypeHandling.castToString(arrayOfCallSite[0].call(hapOption, arrayOfCallSite[1].callGetProperty(this.method.get()), null));
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(this.clazz.get()), arrayOfCallSite[3].callGetProperty(AbilitiesOptions.class))) {
        Method targetMethod = (Method)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(this.clazz.get(), "getTargetAbility", null), Method.class);
        String hapTargetAbilityName = ShortTypeHandling.castToString(arrayOfCallSite[5].call(targetMethod, hapOption, null));
        String harTargetAbilityName = ShortTypeHandling.castToString(arrayOfCallSite[6].call(targetMethod, this.harOption.get(), null));
        String err = ShortTypeHandling.castToString(arrayOfCallSite[7].call("The target function was incorrectly configured.", new GStringImpl(new Object[] { hapTargetAbilityName }, new String[] { " '", "' conflict occurred when merging the config.json files in HAP and HAR packages." })));
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((((ScriptBytecodeAdapter.compareNotEqual(hapTargetAbilityName, null) && ScriptBytecodeAdapter.compareEqual(harTargetAbilityName, null))) && ScriptBytecodeAdapter.compareEqual(hapTargetAbilityName, this.harValue.get())))
            throw (Throwable)arrayOfCallSite[9].callConstructor(GradleException.class, err); 
        } else if ((((ScriptBytecodeAdapter.compareNotEqual(hapTargetAbilityName, null) && ScriptBytecodeAdapter.compareEqual(harTargetAbilityName, null))) && ScriptBytecodeAdapter.compareEqual(hapTargetAbilityName, this.harValue.get()))) {
          throw (Throwable)arrayOfCallSite[8].callConstructor(GradleException.class, err);
        } 
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(hapValue, this.harValue.get()))) {
        Object object = hapOption;
        this.sameOption.set(ScriptBytecodeAdapter.castToType(object, Options.class));
        return object;
      } 
      return null;
    }
    
    @Generated
    public Method getMethod() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Method)ScriptBytecodeAdapter.castToType(this.method.get(), Method.class);
    }
    
    @Generated
    public Class getClazz() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToClass(this.clazz.get());
    }
    
    @Generated
    public Options getHarOption() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.harOption.get(), Options.class);
    }
    
    @Generated
    public String getHarValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.harValue.get());
    }
    
    @Generated
    public Options getSameOption() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.sameOption.get(), Options.class);
    }
  }
  
  public static Map isSameMapWithHap(List hap, Map har, String mapUniqueKey) {
    Reference reference1 = new Reference(mapUniqueKey);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference returnMap = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[98].callConstructor(HashMap.class), Map.class));
    Reference harValue = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[99].call(har, reference1.get())));
    arrayOfCallSite[100].call(hap, new _isSameMapWithHap_closure10(TransformUtil.class, TransformUtil.class, reference1, harValue, returnMap));
    return (Map)returnMap.get();
  }
  
  public final class _isSameMapWithHap_closure10 extends Closure implements GeneratedClosure {
    public _isSameMapWithHap_closure10(Object _outerInstance, Object _thisObject, Reference mapUniqueKey, Reference harValue, Reference returnMap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mapUniqueKey;
      this.mapUniqueKey = reference1;
      Reference reference2 = harValue;
      this.harValue = reference2;
      Reference reference3 = returnMap;
      this.returnMap = reference3;
    }
    
    public Object doCall(Object hapMap) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(hapMap, this.mapUniqueKey.get()), this.harValue.get()))
        return arrayOfCallSite[1].call(this.returnMap.get(), hapMap); 
      return null;
    }
    
    @Generated
    public String getMapUniqueKey() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.mapUniqueKey.get());
    }
    
    @Generated
    public String getHarValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.harValue.get());
    }
    
    @Generated
    public Map getReturnMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.returnMap.get(), Map.class);
    }
  }
  
  public static String getMapUniqueKey(Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String keyName = "name";
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[101].call(arrayOfCallSite[102].callGetProperty(field), "shortcuts"))) {
      String str = "shortcutId";
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[103].call(arrayOfCallSite[104].callGetProperty(field), "skills"))) {
      String str = "actions";
    } 
    return keyName;
  }
  
  public static <T> T getMathodParams(Map jsonMap, Field field, Class clazz) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String fieldName = ShortTypeHandling.castToString(arrayOfCallSite[105].callGetProperty(field)), jsonLabelName = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getJsonLabelByFieldName(fieldName);
    } else {
      Object object = arrayOfCallSite[106].callStatic(TransformUtil.class, fieldName);
      jsonLabelName = ShortTypeHandling.castToString(object);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[107].call(arrayOfCallSite[108].call(jsonMap), jsonLabelName)))
      return (T)arrayOfCallSite[109].call(jsonMap, jsonLabelName); 
    return null;
  }
  
  public static String getGetMethodName(Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String fieldName = ShortTypeHandling.castToString(arrayOfCallSite[110].callGetProperty(field));
    return ShortTypeHandling.castToString(arrayOfCallSite[111].call("get", arrayOfCallSite[112].call(fieldName)));
  }
  
  public static String getSetMethodName(Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String fieldName = ShortTypeHandling.castToString(arrayOfCallSite[113].callGetProperty(field));
    return ShortTypeHandling.castToString(arrayOfCallSite[114].call("set", arrayOfCallSite[115].call(fieldName)));
  }
  
  public static Class<?> getListSubObjectClassType(Field field) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Class<?> subType = null;
    Class typeClass = ShortTypeHandling.castToClass(arrayOfCallSite[116].call(field));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[117].call(List.class, typeClass))) {
      Type fieldType = (Type)ScriptBytecodeAdapter.castToType(arrayOfCallSite[118].call(field), Type.class);
      if (fieldType instanceof ParameterizedType) {
        ParameterizedType paramType = (ParameterizedType)ScriptBytecodeAdapter.castToType(fieldType, ParameterizedType.class);
        Type[] genericTypes = (Type[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[119].call(paramType), Type[].class);
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if (((ScriptBytecodeAdapter.compareNotEqual(genericTypes, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[123].callGetProperty(genericTypes), Integer.valueOf(0)))) && 
            BytecodeInterface8.objectArrayGet((Object[])genericTypes, 0) instanceof Class)
            Class<?> clazz = ShortTypeHandling.castToClass(BytecodeInterface8.objectArrayGet((Object[])genericTypes, 0)); 
          return subType;
        } 
        if (((ScriptBytecodeAdapter.compareNotEqual(genericTypes, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[120].callGetProperty(genericTypes), Integer.valueOf(0)))) && arrayOfCallSite[121].call(genericTypes, Integer.valueOf(0)) instanceof Class)
          Class<?> clazz = ShortTypeHandling.castToClass(arrayOfCallSite[122].call(genericTypes, Integer.valueOf(0))); 
      } 
    } 
    return subType;
  }
  
  public static String getFieldNameByJsonLabel(String jsonLabel) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[124].call(jsonLabel, "package")))
      return "packageName"; 
    return jsonLabel;
  }
  
  public static String getJsonLabelByFieldName(String fieldName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[125].call(fieldName, "packageName")))
      return "package"; 
    return fieldName;
  }
  
  public static Options mergeRule(Options mergeOptions, Options optionsHap) {
    Reference reference1 = new Reference(mergeOptions), reference2 = new Reference(optionsHap);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[134].call(arrayOfCallSite[135].callGetProperty(reference2.get()), "mergeRule")))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[136].call(reference2.get(), "mergeRule"), null))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[137].call(arrayOfCallSite[138].call(reference2.get(), "mergeRule"), "replace"), null))) {
        Collection replaceLabel = (Collection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[139].call(arrayOfCallSite[140].call(reference2.get(), "mergeRule"), "replace"), Collection.class);
        arrayOfCallSite[141].call(replaceLabel, new _mergeRule_closure11(TransformUtil.class, TransformUtil.class, reference1, reference2));
      } 
    } else if ((((((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[126].call(arrayOfCallSite[127].callGetProperty(reference2.get()), "mergeRule")))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[128].call(reference2.get(), "mergeRule"), null))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[129].call(arrayOfCallSite[130].call(reference2.get(), "mergeRule"), "replace"), null))) {
      Collection replaceLabel = (Collection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[131].call(arrayOfCallSite[132].call(reference2.get(), "mergeRule"), "replace"), Collection.class);
      arrayOfCallSite[133].call(replaceLabel, new _mergeRule_closure11(TransformUtil.class, TransformUtil.class, reference1, reference2));
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[150].call(arrayOfCallSite[151].callGetProperty(reference2.get()), "mergeRule")))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[152].call(reference2.get(), "mergeRule"), null))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[153].call(arrayOfCallSite[154].call(reference2.get(), "mergeRule"), "remove"), null))) {
        Collection removeLabel = (Collection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[155].call(arrayOfCallSite[156].call(reference2.get(), "mergeRule"), "remove"), Collection.class);
        arrayOfCallSite[157].call(removeLabel, new _mergeRule_closure12(TransformUtil.class, TransformUtil.class, reference1));
      } 
      return (Options)reference1.get();
    } 
    if ((((((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[142].call(arrayOfCallSite[143].callGetProperty(reference2.get()), "mergeRule")))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[144].call(reference2.get(), "mergeRule"), null))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[145].call(arrayOfCallSite[146].call(reference2.get(), "mergeRule"), "remove"), null))) {
      Collection removeLabel = (Collection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[147].call(arrayOfCallSite[148].call(reference2.get(), "mergeRule"), "remove"), Collection.class);
      arrayOfCallSite[149].call(removeLabel, new _mergeRule_closure12(TransformUtil.class, TransformUtil.class, reference1));
    } 
    return (Options)reference1.get();
  }
  
  public final class _mergeRule_closure11 extends Closure implements GeneratedClosure {
    public _mergeRule_closure11(Object _outerInstance, Object _thisObject, Reference mergeOptions, Reference optionsHap) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mergeOptions;
      this.mergeOptions = reference1;
      Reference reference2 = optionsHap;
      this.optionsHap = reference2;
    }
    
    public Object doCall(Object fieldItem) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(this.mergeOptions.get()), fieldItem))) {
        String setReplaceField = ShortTypeHandling.castToString(arrayOfCallSite[2].call("set", arrayOfCallSite[3].call(fieldItem)));
        String getReplaceField = ShortTypeHandling.castToString(arrayOfCallSite[4].call("get", arrayOfCallSite[5].call(fieldItem)));
        return arrayOfCallSite[6].call(this.mergeOptions.get(), setReplaceField, arrayOfCallSite[7].call(this.optionsHap.get(), getReplaceField, null));
      } 
      return null;
    }
    
    @Generated
    public Options getMergeOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.mergeOptions.get(), Options.class);
    }
    
    @Generated
    public Options getOptionsHap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.optionsHap.get(), Options.class);
    }
  }
  
  public final class _mergeRule_closure12 extends Closure implements GeneratedClosure {
    public _mergeRule_closure12(Object _outerInstance, Object _thisObject, Reference mergeOptions) {
      super(_outerInstance, _thisObject);
      Reference reference = mergeOptions;
      this.mergeOptions = reference;
    }
    
    public Object doCall(Object fieldItem) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(this.mergeOptions.get()), fieldItem))) {
        String setRemoveField = ShortTypeHandling.castToString(arrayOfCallSite[2].call("set", arrayOfCallSite[3].call(fieldItem)));
        return arrayOfCallSite[4].call(this.mergeOptions.get(), setRemoveField, null);
      } 
      return null;
    }
    
    @Generated
    public Options getMergeOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.mergeOptions.get(), Options.class);
    }
  }
  
  public static void disposePlaceHolder(Options config) {
    Reference reference = new Reference(config);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Field[] fileds = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[158].call(arrayOfCallSite[159].callGetProperty(reference.get())), Field[].class);
    arrayOfCallSite[160].call(fileds, new _disposePlaceHolder_closure13(TransformUtil.class, TransformUtil.class, reference));
  }
  
  static {
    String str1 = "";
    harModulePackage = str1;
    String str2 = "";
    hapModulePackage = str2;
  }
  
  public final class _disposePlaceHolder_closure13 extends Closure implements GeneratedClosure {
    public _disposePlaceHolder_closure13(Object _outerInstance, Object _thisObject, Reference config) {
      super(_outerInstance, _thisObject);
      Reference reference = config;
      this.config = reference;
    }
    
    public Object doCall(Object field) {
      // Byte code:
      //   0: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
      //   3: astore_2
      //   4: aload_2
      //   5: ldc 0
      //   7: aaload
      //   8: ldc com/huawei/ohos/build/enumlation/MergeRuleType$NeedDisposePlaceholder
      //   10: aload_2
      //   11: ldc 1
      //   13: aaload
      //   14: aload_1
      //   15: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
      //   20: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   25: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
      //   28: ifeq -> 91
      //   31: aload_0
      //   32: getfield config : Lgroovy/lang/Reference;
      //   35: invokevirtual get : ()Ljava/lang/Object;
      //   38: instanceof com/huawei/ohos/build/shell/AbilitiesOptions
      //   41: ifeq -> 75
      //   44: aload_2
      //   45: ldc 2
      //   47: aaload
      //   48: aload_2
      //   49: ldc 3
      //   51: aaload
      //   52: aload_1
      //   53: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
      //   58: ldc 'name'
      //   60: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   65: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
      //   68: ifeq -> 75
      //   71: iconst_1
      //   72: goto -> 76
      //   75: iconst_0
      //   76: ifne -> 83
      //   79: iconst_1
      //   80: goto -> 84
      //   83: iconst_0
      //   84: ifeq -> 91
      //   87: iconst_1
      //   88: goto -> 92
      //   91: iconst_0
      //   92: ifeq -> 458
      //   95: aload_2
      //   96: ldc 4
      //   98: aaload
      //   99: ldc com/huawei/ohos/build/utils/configJson/TransformUtil
      //   101: aload_1
      //   102: invokeinterface callStatic : (Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
      //   107: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
      //   110: checkcast java/lang/String
      //   113: astore_3
      //   114: aload_3
      //   115: pop
      //   116: aload_2
      //   117: ldc 5
      //   119: aaload
      //   120: ldc com/huawei/ohos/build/utils/configJson/TransformUtil
      //   122: aload_1
      //   123: invokeinterface callStatic : (Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
      //   128: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
      //   131: checkcast java/lang/String
      //   134: astore #4
      //   136: aload #4
      //   138: pop
      //   139: aload_2
      //   140: ldc 6
      //   142: aaload
      //   143: aload_0
      //   144: getfield config : Lgroovy/lang/Reference;
      //   147: invokevirtual get : ()Ljava/lang/Object;
      //   150: aload_3
      //   151: aconst_null
      //   152: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   157: astore #5
      //   159: aload #5
      //   161: pop
      //   162: aload #5
      //   164: aconst_null
      //   165: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   168: ifeq -> 173
      //   171: aconst_null
      //   172: areturn
      //   173: aload_2
      //   174: ldc 7
      //   176: aaload
      //   177: aload_1
      //   178: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
      //   183: invokestatic castToClass : (Ljava/lang/Object;)Ljava/lang/Class;
      //   186: checkcast java/lang/Class
      //   189: astore #6
      //   191: aload #6
      //   193: pop
      //   194: aconst_null
      //   195: new groovy/lang/Reference
      //   198: dup_x1
      //   199: swap
      //   200: invokespecial <init> : (Ljava/lang/Object;)V
      //   203: astore #7
      //   205: aload #7
      //   207: pop
      //   208: aload #6
      //   210: ldc java/lang/String
      //   212: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   215: ifeq -> 273
      //   218: aload #5
      //   220: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
      //   223: checkcast java/lang/String
      //   226: astore #8
      //   228: aload #8
      //   230: pop
      //   231: aload_2
      //   232: ldc 8
      //   234: aaload
      //   235: aload #8
      //   237: ldc '{bundleName}'
      //   239: aload_2
      //   240: ldc 9
      //   242: aaload
      //   243: aload_0
      //   244: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
      //   249: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   254: astore #9
      //   256: aload #9
      //   258: aload #7
      //   260: checkcast groovy/lang/Reference
      //   263: swap
      //   264: invokevirtual set : (Ljava/lang/Object;)V
      //   267: aload #9
      //   269: pop
      //   270: goto -> 428
      //   273: aload #6
      //   275: ldc java/util/List
      //   277: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   280: ifeq -> 428
      //   283: aload_2
      //   284: ldc 10
      //   286: aaload
      //   287: ldc java/util/ArrayList
      //   289: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
      //   294: astore #10
      //   296: aload #10
      //   298: aload #7
      //   300: checkcast groovy/lang/Reference
      //   303: swap
      //   304: invokevirtual set : (Ljava/lang/Object;)V
      //   307: aload #10
      //   309: pop
      //   310: aload_2
      //   311: ldc 11
      //   313: aaload
      //   314: ldc com/huawei/ohos/build/utils/configJson/TransformUtil
      //   316: aload_1
      //   317: invokeinterface callStatic : (Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
      //   322: invokestatic castToClass : (Ljava/lang/Object;)Ljava/lang/Class;
      //   325: checkcast java/lang/Class
      //   328: astore #11
      //   330: aload #11
      //   332: pop
      //   333: aload #11
      //   335: ldc java/lang/String
      //   337: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   340: ifeq -> 387
      //   343: aload #5
      //   345: ldc java/util/List
      //   347: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
      //   350: checkcast java/util/List
      //   353: astore #12
      //   355: aload #12
      //   357: pop
      //   358: aload_2
      //   359: ldc 12
      //   361: aaload
      //   362: aload #12
      //   364: new com/huawei/ohos/build/utils/configJson/TransformUtil$_disposePlaceHolder_closure13$_closure16
      //   367: dup
      //   368: aload_0
      //   369: aload_0
      //   370: invokevirtual getThisObject : ()Ljava/lang/Object;
      //   373: aload #7
      //   375: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;)V
      //   378: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   383: pop
      //   384: goto -> 428
      //   387: aload #5
      //   389: ldc java/util/List
      //   391: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
      //   394: checkcast java/util/List
      //   397: astore #13
      //   399: aload #13
      //   401: pop
      //   402: aload_2
      //   403: ldc 13
      //   405: aaload
      //   406: aload #13
      //   408: new com/huawei/ohos/build/utils/configJson/TransformUtil$_disposePlaceHolder_closure13$_closure17
      //   411: dup
      //   412: aload_0
      //   413: aload_0
      //   414: invokevirtual getThisObject : ()Ljava/lang/Object;
      //   417: aload #7
      //   419: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;)V
      //   422: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   427: pop
      //   428: aload_2
      //   429: ldc 14
      //   431: aaload
      //   432: aload_0
      //   433: getfield config : Lgroovy/lang/Reference;
      //   436: invokevirtual get : ()Ljava/lang/Object;
      //   439: aload #4
      //   441: aload #7
      //   443: invokevirtual get : ()Ljava/lang/Object;
      //   446: checkcast java/lang/Object
      //   449: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   454: areturn
      //   455: nop
      //   456: nop
      //   457: athrow
      //   458: aconst_null
      //   459: areturn
      //   460: nop
      //   461: athrow
      // Line number table:
      //   Java source line number -> byte code offset
      //   #496	-> 4
      //   #497	-> 95
      //   #498	-> 116
      //   #499	-> 139
      //   #500	-> 162
      //   #501	-> 171
      //   #502	-> 173
      //   #503	-> 173
      //   #504	-> 194
      //   #505	-> 208
      //   #506	-> 218
      //   #507	-> 231
      //   #508	-> 270
      //   #508	-> 273
      //   #509	-> 283
      //   #510	-> 310
      //   #511	-> 333
      //   #512	-> 343
      //   #513	-> 358
      //   #516	-> 384
      //   #517	-> 387
      //   #518	-> 402
      //   #523	-> 428
      //   #524	-> 428
      //   #525	-> 428
      //   #526	-> 455
      // Local variable table:
      //   start	length	slot	name	descriptor
      //   0	460	0	this	Lcom/huawei/ohos/build/utils/configJson/TransformUtil$_disposePlaceHolder_closure13;
      //   0	460	1	field	Ljava/lang/Object;
      //   114	341	3	fieldGetMethodName	Ljava/lang/String;
      //   136	319	4	fieldSetMethodName	Ljava/lang/String;
      //   159	296	5	fieldObj	Ljava/lang/Object;
      //   191	264	6	clazz	Ljava/lang/Class;
      //   205	250	7	newValue	Lgroovy/lang/Reference;
      //   228	42	8	fieldValue	Ljava/lang/String;
      //   330	98	11	subListType	Ljava/lang/Class;
      //   355	29	12	fieldValue	Ljava/util/List;
      //   399	29	13	fieldValue	Ljava/util/List;
    }
    
    @Generated
    public Options getConfig() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Options)ScriptBytecodeAdapter.castToType(this.config.get(), Options.class);
    }
    
    public final class _closure16 extends Closure implements GeneratedClosure {
      public _closure16(Object _outerInstance, Object _thisObject, Reference newValue) {
        super(_outerInstance, _thisObject);
        Reference reference = newValue;
        this.newValue = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.newValue.get(), arrayOfCallSite[1].call(it, "{bundleName}", arrayOfCallSite[2].callGroovyObjectGetProperty(this)));
      }
      
      @Generated
      public Object getNewValue() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.newValue.get();
      }
    }
    
    public final class _closure17 extends Closure implements GeneratedClosure {
      public _closure17(Object _outerInstance, Object _thisObject, Reference newValue) {
        super(_outerInstance, _thisObject);
        Reference reference = newValue;
        this.newValue = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        String name = ShortTypeHandling.castToString(arrayOfCallSite[0].call(it));
        arrayOfCallSite[1].call(it, arrayOfCallSite[2].call(name, "{bundleName}", arrayOfCallSite[3].callGroovyObjectGetProperty(this)));
        return arrayOfCallSite[4].call(this.newValue.get(), it);
      }
      
      @Generated
      public Object getNewValue() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.newValue.get();
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
