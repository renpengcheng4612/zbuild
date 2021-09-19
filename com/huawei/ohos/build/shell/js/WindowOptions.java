package com.huawei.ohos.build.shell.js;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class WindowOptions implements GroovyObject {
  public Integer designWidth;
  
  public Boolean autoDesignWidth;
  
  private static final int DefaultWidth = 454;
  
  public WindowOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static WindowOptions initOneWithAutoDesignWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    WindowOptions newOne = (WindowOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(WindowOptions.class), WindowOptions.class);
    boolean bool = true;
    ScriptBytecodeAdapter.setGroovyObjectProperty(Boolean.valueOf(bool), WindowOptions.class, newOne, "autoDesignWidth");
    return newOne;
  }
  
  public static WindowOptions initOneWithDefaultWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    WindowOptions newOne = (WindowOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(WindowOptions.class), WindowOptions.class);
    boolean bool = false;
    ScriptBytecodeAdapter.setGroovyObjectProperty(Boolean.valueOf(bool), WindowOptions.class, newOne, "autoDesignWidth");
    int i = DefaultWidth;
    ScriptBytecodeAdapter.setGroovyObjectProperty(Integer.valueOf(i), WindowOptions.class, newOne, "designWidth");
    return newOne;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[5].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.designWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[6].call(this.designWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.designWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.designWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[10].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.autoDesignWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[11].call(this.autoDesignWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.autoDesignWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.autoDesignWidth));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!(obj instanceof WindowOptions))
      return false; 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.designWidth, arrayOfCallSite[14].callGetProperty(obj)) && 
        ScriptBytecodeAdapter.compareEqual(this.autoDesignWidth, arrayOfCallSite[15].callGetProperty(obj))))
        return true; 
      return false;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(this.designWidth, arrayOfCallSite[12].callGetProperty(obj)) && ScriptBytecodeAdapter.compareEqual(this.autoDesignWidth, arrayOfCallSite[13].callGetProperty(obj))))
      return true; 
    return false;
  }
  
  public Integer getDesignWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.designWidth;
  }
  
  public void setDesignWidth(Integer designWidth) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = designWidth;
    this.designWidth = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Boolean getAutoDesignWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.autoDesignWidth;
  }
  
  public void setAutoDesignWidth(Boolean autoDesignWidth) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = autoDesignWidth;
    this.autoDesignWidth = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
}
