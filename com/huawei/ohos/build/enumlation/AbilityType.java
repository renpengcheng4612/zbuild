package com.huawei.ohos.build.enumlation;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;

public enum AbilityType implements GroovyObject {
  page, service, data, CA;
  
  public static final AbilityType MIN_VALUE;
  
  public static final AbilityType MAX_VALUE;
  
  @Generated
  AbilityType(LinkedHashMap __namedArgs) {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
    if (ScriptBytecodeAdapter.compareEqual(__namedArgs, null))
      throw (Throwable)arrayOfCallSite[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.huawei.ohos.build.enumlation.AbilityType was initialized with null. Please use a non-null value or define your own constructor."); 
    arrayOfCallSite[1].callStatic(ImmutableASTTransformation.class, this, __namedArgs);
  }
  
  public static boolean contains(Object value) {
    CallSite[] arrayOfCallSite;
    AbilityType v;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(arrayOfCallSite[4].call(AbilityType.class)), Iterator.class); iterator.hasNext(); ) {
      v = (AbilityType)ShortTypeHandling.castToEnum(iterator.next(), AbilityType.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(arrayOfCallSite[6].call(v), value)))
        return true; 
    } 
    return false;
  }
  
  static {
    Object object1 = $getCallSiteArray()[17].callStatic(AbilityType.class, "page", Integer.valueOf(0));
    page = (AbilityType)ShortTypeHandling.castToEnum(object1, AbilityType.class);
    Object object2 = $getCallSiteArray()[18].callStatic(AbilityType.class, "service", Integer.valueOf(1));
    service = (AbilityType)ShortTypeHandling.castToEnum(object2, AbilityType.class);
    Object object3 = $getCallSiteArray()[19].callStatic(AbilityType.class, "data", Integer.valueOf(2));
    data = (AbilityType)ShortTypeHandling.castToEnum(object3, AbilityType.class);
    Object object4 = $getCallSiteArray()[20].callStatic(AbilityType.class, "CA", Integer.valueOf(3));
    CA = (AbilityType)ShortTypeHandling.castToEnum(object4, AbilityType.class);
    AbilityType abilityType1 = page;
    MIN_VALUE = abilityType1;
    AbilityType abilityType2 = CA;
    MAX_VALUE = abilityType2;
    AbilityType[] arrayOfAbilityType = { page, service, data, CA };
    $VALUES = arrayOfAbilityType;
  }
}
