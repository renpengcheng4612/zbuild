package com.huawei.ohos.build.utils;

import com.huawei.ohos.build.enumlation.AbilityType;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class StringHandler implements GroovyObject {
  @Generated
  public StringHandler() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static boolean isExistInEnum(String type) {
    CallSite[] arrayOfCallSite;
    AbilityType typeEnum;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), typeEnum = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(AbilityType.class)), Iterator.class); iterator.hasNext(); ) {
      typeEnum = (AbilityType)ShortTypeHandling.castToEnum(iterator.next(), AbilityType.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(typeEnum), type))
        return true; 
    } 
    return false;
  }
  
  public static String getHarmonyTaskNameTopLevel(String prefix, String suffix) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[3].call(prefix, arrayOfCallSite[4].call(suffix)));
  }
  
  public static boolean isEmpty(String str) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (ScriptBytecodeAdapter.compareEqual(str, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(str)));
  }
  
  public static int parseInt(String string, int defaultValue) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareNotEqual(String.class, null))
        try {
          return DefaultTypeTransformation.intUnbox(arrayOfCallSite[7].call(Integer.class, string));
        } catch (NumberFormatException ignored) {
        
        } finally {} 
      return defaultValue;
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(String.class, null))
      try {
        return DefaultTypeTransformation.intUnbox(arrayOfCallSite[6].call(Integer.class, string));
      } catch (NumberFormatException ignored) {
      
      } finally {} 
    return defaultValue;
  }
}
