package com.huawei.ohos.build.utils.configJson;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class ClassFieldImpl implements ClassField, GroovyObject {
  private final String type;
  
  private final String name;
  
  private final String value;
  
  public ClassFieldImpl(String type, String name, String value) {
    MetaClass metaClass = $getStaticMetaClass();
    String str1 = type;
    this.type = ShortTypeHandling.castToString(str1);
    String str2 = name;
    this.name = ShortTypeHandling.castToString(str2);
    String str3 = value;
    this.value = ShortTypeHandling.castToString(str3);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public String getValue() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.value;
  }
}
