package com.huawei.ohos.build.utils.validate;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class ValidateResult implements GroovyObject {
  protected boolean success;
  
  private List<String> errorMessages;
  
  public ValidateResult() {
    boolean bool = true;
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.errorMessages = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
  }
  
  public boolean isSuccess() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.success;
  }
  
  public String getErrorMessage() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[1].call(this.errorMessages), Integer.valueOf(0)) ? "Validate success." : arrayOfCallSite[2].call(this.errorMessages, arrayOfCallSite[3].call(System.class)));
  }
  
  protected boolean addErrorMessage(@Nonnull String msg) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(this.errorMessages, msg));
  }
}
