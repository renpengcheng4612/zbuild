package com.huawei.ohos.build.model.transform;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Named;
import org.gradle.api.attributes.Attribute;

public interface HarmonyTypeAttr extends Named {
  public static final Attribute<HarmonyTypeAttr> ATTRIBUTE;
  
  public static final String HAP = "Hap";
  
  public static final String HAR = "Har";
  
  public static final String FEATURE = "Feature";
  
  static {
    Object object = null.$getCallSiteArray()[0].call(null.$class$org$gradle$api$attributes$Attribute, null.$class$com$huawei$ohos$build$model$transform$HarmonyTypeAttr);
    ATTRIBUTE = (Attribute<HarmonyTypeAttr>)ScriptBytecodeAdapter.castToType(object, null.$class$org$gradle$api$attributes$Attribute);
  }
}
