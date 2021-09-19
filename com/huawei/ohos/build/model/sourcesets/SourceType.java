package com.huawei.ohos.build.model.sourcesets;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;

public enum SourceType implements GroovyObject {
  JAVA_SOURCE, CONFIG, JAVA_RESOURCE, ZIDL, Js, RESOURCE;
  
  public static final SourceType MIN_VALUE;
  
  public static final SourceType MAX_VALUE;
  
  @Generated
  SourceType(LinkedHashMap __namedArgs) {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
    if (ScriptBytecodeAdapter.compareEqual(__namedArgs, null))
      throw (Throwable)arrayOfCallSite[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.huawei.ohos.build.model.sourcesets.SourceType was initialized with null. Please use a non-null value or define your own constructor."); 
    arrayOfCallSite[1].callStatic(ImmutableASTTransformation.class, this, __namedArgs);
  }
  
  static {
    Object object1 = $getCallSiteArray()[13].callStatic(SourceType.class, "JAVA_SOURCE", Integer.valueOf(0));
    JAVA_SOURCE = (SourceType)ShortTypeHandling.castToEnum(object1, SourceType.class);
    Object object2 = $getCallSiteArray()[14].callStatic(SourceType.class, "CONFIG", Integer.valueOf(1));
    CONFIG = (SourceType)ShortTypeHandling.castToEnum(object2, SourceType.class);
    Object object3 = $getCallSiteArray()[15].callStatic(SourceType.class, "JAVA_RESOURCE", Integer.valueOf(2));
    JAVA_RESOURCE = (SourceType)ShortTypeHandling.castToEnum(object3, SourceType.class);
    Object object4 = $getCallSiteArray()[16].callStatic(SourceType.class, "ZIDL", Integer.valueOf(3));
    ZIDL = (SourceType)ShortTypeHandling.castToEnum(object4, SourceType.class);
    Object object5 = $getCallSiteArray()[17].callStatic(SourceType.class, "Js", Integer.valueOf(4));
    Js = (SourceType)ShortTypeHandling.castToEnum(object5, SourceType.class);
    Object object6 = $getCallSiteArray()[18].callStatic(SourceType.class, "RESOURCE", Integer.valueOf(5));
    RESOURCE = (SourceType)ShortTypeHandling.castToEnum(object6, SourceType.class);
    SourceType sourceType1 = JAVA_SOURCE;
    MIN_VALUE = sourceType1;
    SourceType sourceType2 = RESOURCE;
    MAX_VALUE = sourceType2;
    SourceType[] arrayOfSourceType = { JAVA_SOURCE, CONFIG, JAVA_RESOURCE, ZIDL, Js, RESOURCE };
    $VALUES = arrayOfSourceType;
  }
}
