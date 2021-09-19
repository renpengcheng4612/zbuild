package com.huawei.ohos.build.utils.pair;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public final class PairUtil<L, R> implements GroovyObject {
  @Nullable
  public L left;
  
  @Nullable
  public R right;
  
  private PairUtil(@Nullable Object left, @Nullable Object right) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = left;
    Object object2 = right;
  }
  
  @Nullable
  public L left() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.left;
  }
  
  @Nullable
  public R right() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.right;
  }
  
  public static <L, R> PairUtil<L, R> of(@Nullable Object left, @Nullable Object right) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (PairUtil<L, R>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(PairUtil.class, left, right), PairUtil.class);
  }
  
  public <T> PairUtil<T, R> replaceLeft(Object t) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(t, null) || ScriptBytecodeAdapter.compareEqual(t, "")))
        return this; 
      return (PairUtil<T, R>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callStatic(PairUtil.class, t, ScriptBytecodeAdapter.createPojoWrapper(right(), Object.class)), PairUtil.class);
    } 
    if ((ScriptBytecodeAdapter.compareEqual(t, null) || ScriptBytecodeAdapter.compareEqual(t, "")))
      return this; 
    return (PairUtil<T, R>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callStatic(PairUtil.class, t, ScriptBytecodeAdapter.createPojoWrapper(arrayOfCallSite[2].callCurrent(this), Object.class)), PairUtil.class);
  }
  
  public <T> PairUtil<L, T> replaceRight(Object t) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(t, null) || ScriptBytecodeAdapter.compareEqual(t, "")))
        return this; 
      return (PairUtil<L, T>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].callStatic(PairUtil.class, ScriptBytecodeAdapter.createPojoWrapper(left(), Object.class), t), PairUtil.class);
    } 
    if ((ScriptBytecodeAdapter.compareEqual(t, null) || ScriptBytecodeAdapter.compareEqual(t, "")))
      return this; 
    return (PairUtil<L, T>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callStatic(PairUtil.class, ScriptBytecodeAdapter.createPojoWrapper(arrayOfCallSite[5].callCurrent(this), Object.class), t), PairUtil.class);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call("Pair[", this.left), ","), this.right), "]"));
  }
}
