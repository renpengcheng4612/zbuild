package com.huawei.ohos.build.enumlation;

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

public enum CpuAbiEnum implements GroovyObject {
  ARM64_V8A, ARMEABI_V7A, X86_64;
  
  private String name;
  
  public static final CpuAbiEnum MIN_VALUE;
  
  public static final CpuAbiEnum MAX_VALUE;
  
  CpuAbiEnum(String name) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public static boolean contains(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      CpuAbiEnum cpuAbiEnum;
      Iterator iterator1;
      for (cpuAbiEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
        cpuAbiEnum = (CpuAbiEnum)ShortTypeHandling.castToEnum(iterator1.next(), CpuAbiEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(cpuAbiEnum), name))
          return true; 
      } 
      return false;
    } 
    CpuAbiEnum v;
    Iterator iterator;
    for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(CpuAbiEnum.class)), Iterator.class); iterator.hasNext(); ) {
      v = (CpuAbiEnum)ShortTypeHandling.castToEnum(iterator.next(), CpuAbiEnum.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), name))
        return true; 
    } 
    return false;
  }
  
  static {
    Object object1 = $getCallSiteArray()[15].callStatic(CpuAbiEnum.class, "ARM64_V8A", Integer.valueOf(0), "arm64-v8a");
    ARM64_V8A = (CpuAbiEnum)ShortTypeHandling.castToEnum(object1, CpuAbiEnum.class);
    Object object2 = $getCallSiteArray()[16].callStatic(CpuAbiEnum.class, "ARMEABI_V7A", Integer.valueOf(1), "armeabi-v7a");
    ARMEABI_V7A = (CpuAbiEnum)ShortTypeHandling.castToEnum(object2, CpuAbiEnum.class);
    Object object3 = $getCallSiteArray()[17].callStatic(CpuAbiEnum.class, "X86_64", Integer.valueOf(2), "x86_64");
    X86_64 = (CpuAbiEnum)ShortTypeHandling.castToEnum(object3, CpuAbiEnum.class);
    CpuAbiEnum cpuAbiEnum1 = ARM64_V8A;
    MIN_VALUE = cpuAbiEnum1;
    CpuAbiEnum cpuAbiEnum2 = X86_64;
    MAX_VALUE = cpuAbiEnum2;
    CpuAbiEnum[] arrayOfCpuAbiEnum = { ARM64_V8A, ARMEABI_V7A, X86_64 };
    $VALUES = arrayOfCpuAbiEnum;
  }
}
