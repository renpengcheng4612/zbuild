package com.huawei.ohos.build.exception;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class JsonTransException extends RuntimeException implements GroovyObject {
  public JsonTransException() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public JsonTransException(@Nullable String message) {}
  
  public JsonTransException(String message, @Nullable Throwable cause) {
    super(message, cause);
    MetaClass metaClass = $getStaticMetaClass();
  }
}
