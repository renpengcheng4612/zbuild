package com.huawei.ohos.build.exception;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.GradleException;

public class ErrorPluginException extends GradleException implements GroovyObject {
  public ErrorPluginException(@Nonnull String msg) {
    super(msg);
    MetaClass metaClass = $getStaticMetaClass();
  }
}
