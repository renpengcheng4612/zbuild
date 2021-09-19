package com.huawei.ohos.build.utils;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class ListUtils implements GroovyObject {
  @Generated
  public ListUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static boolean isSameList(List l1, List l2) {
    Reference reference1 = new Reference(l2);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference isSame = new Reference(Boolean.valueOf(true));
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].call(l1), arrayOfCallSite[1].call(reference1.get()))) {
      boolean bool = false;
      isSame.set(Boolean.valueOf(bool));
    } 
    arrayOfCallSite[2].call(l1, new _isSameList_closure1(ListUtils.class, ListUtils.class, reference1, isSame));
    return DefaultTypeTransformation.booleanUnbox(isSame.get());
  }
  
  public final class _isSameList_closure1 extends Closure implements GeneratedClosure {
    public _isSameList_closure1(Object _outerInstance, Object _thisObject, Reference l2, Reference isSame) {
      super(_outerInstance, _thisObject);
      Reference reference1 = l2;
      this.l2 = reference1;
      Reference reference2 = isSame;
      this.isSame = reference2;
    }
    
    public Object doCall(Object obj) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.l2.get(), obj))) {
        boolean bool = false;
        this.isSame.set(Boolean.valueOf(bool));
        return Boolean.valueOf(bool);
      } 
      return null;
    }
    
    @Generated
    public List getL2() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.l2.get(), List.class);
    }
    
    @Generated
    public Boolean getIsSame() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Boolean)ScriptBytecodeAdapter.castToType(this.isSame.get(), Boolean.class);
    }
  }
}
