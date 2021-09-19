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

public enum SignAlgType implements GroovyObject {
  SHA256WITHECDSA;
  
  private String value;
  
  public static final SignAlgType MIN_VALUE;
  
  public static final SignAlgType MAX_VALUE;
  
  SignAlgType(String value) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = value;
    this.value = ShortTypeHandling.castToString(str);
  }
  
  public String getValue() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.value;
  }
  
  public static boolean contains(String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      SignAlgType signAlgType;
      Iterator iterator1;
      for (signAlgType = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
        signAlgType = (SignAlgType)ShortTypeHandling.castToEnum(iterator1.next(), SignAlgType.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(signAlgType), value))
          return true; 
      } 
      return false;
    } 
    SignAlgType v;
    Iterator iterator;
    for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(SignAlgType.class)), Iterator.class); iterator.hasNext(); ) {
      v = (SignAlgType)ShortTypeHandling.castToEnum(iterator.next(), SignAlgType.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
        return true; 
    } 
    return false;
  }
  
  static {
    Object object = $getCallSiteArray()[15].callStatic(SignAlgType.class, "SHA256WITHECDSA", Integer.valueOf(0), "SHA256withECDSA");
    SHA256WITHECDSA = (SignAlgType)ShortTypeHandling.castToEnum(object, SignAlgType.class);
    SignAlgType signAlgType1 = SHA256WITHECDSA;
    MIN_VALUE = signAlgType1;
    SignAlgType signAlgType2 = SHA256WITHECDSA;
    MAX_VALUE = signAlgType2;
    SignAlgType[] arrayOfSignAlgType = { SHA256WITHECDSA };
    $VALUES = arrayOfSignAlgType;
  }
}
