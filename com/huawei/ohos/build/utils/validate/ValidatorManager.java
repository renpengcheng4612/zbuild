package com.huawei.ohos.build.utils.validate;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class ValidatorManager implements GroovyObject {
  private Set<Validator> validators;
  
  private ValidateResult validateResult;
  
  public ValidatorManager() {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callConstructor(HashSet.class);
    this.validators = (Set<Validator>)ScriptBytecodeAdapter.castToType(object1, Set.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ValidateResult.class);
    this.validateResult = (ValidateResult)ScriptBytecodeAdapter.castToType(object2, ValidateResult.class);
  }
  
  public ValidatorManager addValidator(Validator validator) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(this.validators, validator);
    return this;
  }
  
  public ValidateResult doValidate() {
    CallSite[] arrayOfCallSite;
    Validator validator;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), validator = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(this.validators), Iterator.class); iterator.hasNext(); ) {
      validator = (Validator)ScriptBytecodeAdapter.castToType(iterator.next(), Validator.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(validator))) {
        boolean bool = false;
        ScriptBytecodeAdapter.setGroovyObjectProperty(Boolean.valueOf(bool), ValidatorManager.class, this.validateResult, "success");
        arrayOfCallSite[5].call(this.validateResult, arrayOfCallSite[6].call(validator));
      } 
    } 
    return this.validateResult;
  }
}
