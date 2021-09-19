package com.huawei.ohos.build.utils.configJson;

import com.huawei.ohos.build.shell.Permission;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class CastTransformUtil implements GroovyObject {
  @Generated
  public CastTransformUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static <T> Map<String, T> castMap(Object obj, Class clazz) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map<String, T> map = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(HashMap.class), Map.class);
    if (obj instanceof Map) {
      Iterator mapIterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].call(ScriptBytecodeAdapter.castToType(obj, Map.class))), Iterator.class);
      while (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(mapIterator))) {
        Map.Entry me = (Map.Entry)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(mapIterator), Map.Entry.class);
        arrayOfCallSite[5].call(map, ScriptBytecodeAdapter.createPojoWrapper(ShortTypeHandling.castToString(arrayOfCallSite[6].call(me)), String.class), arrayOfCallSite[7].call(clazz, arrayOfCallSite[8].call(me)));
      } 
      return map;
    } 
    return (Map<String, T>)ScriptBytecodeAdapter.castToType(null, Map.class);
  }
  
  public static <T> List<T> castList(Object obj, Class clazz) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<T> result = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(ArrayList.class), List.class);
    if (obj instanceof List) {
      Object o;
      Iterator iterator;
      for (o = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(ScriptBytecodeAdapter.castToType(obj, List.class)), Iterator.class); iterator.hasNext(); ) {
        o = iterator.next();
        arrayOfCallSite[11].call(result, arrayOfCallSite[12].call(clazz, o));
      } 
      return result;
    } 
    return (List<T>)ScriptBytecodeAdapter.castToType(null, List.class);
  }
  
  public static <T extends Permission> List<T> getList(List options, Class clazz) throws IllegalAccessException, InstantiationException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<T> modelList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(ArrayList.class), List.class);
    Permission permission = (Permission)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(clazz), Permission.class);
    int size = DefaultTypeTransformation.intUnbox(arrayOfCallSite[15].call(options));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; (j < size); ) {
        arrayOfCallSite[21].call(modelList, arrayOfCallSite[22].call(clazz, arrayOfCallSite[23].call(permission, arrayOfCallSite[24].call(options, Integer.valueOf(j)))));
        int k;
        j = (k = j) + 1;
      } 
      return modelList;
    } 
    for (int i = 0; (i < size); ) {
      arrayOfCallSite[16].call(modelList, arrayOfCallSite[17].call(clazz, arrayOfCallSite[18].call(permission, arrayOfCallSite[19].call(options, Integer.valueOf(i)))));
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[20].call(Integer.valueOf(j = i)));
      arrayOfCallSite[20].call(Integer.valueOf(j = i));
    } 
    return modelList;
  }
}
