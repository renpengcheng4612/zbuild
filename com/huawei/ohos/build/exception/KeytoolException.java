package com.huawei.ohos.build.exception;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class KeytoolException extends Exception implements GroovyObject {
  public KeytoolException(String message) {}
  
  public KeytoolException(String message, Throwable t) {
    super(message, t);
    MetaClass metaClass = $getStaticMetaClass();
  }
}
