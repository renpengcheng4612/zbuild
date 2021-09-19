package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.annotation.Validate;
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
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class UriPermissionOptions implements Options, GroovyObject {
  @Validate(range = {"default", "prefix", "pattern"})
  public String mode;
  
  @Validate(notNull = true, maxLength = 255)
  public String path;
  
  public UriPermissionOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[3].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.mode, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.mode));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.mode, null) ? Integer.valueOf(0) : arrayOfCallSite[2].call(this.mode));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[8].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.path, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.path));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.path, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.path));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (obj instanceof UriPermissionOptions) {
      UriPermissionOptions otherObj = (UriPermissionOptions)ScriptBytecodeAdapter.castToType(obj, UriPermissionOptions.class);
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(this.mode, arrayOfCallSite[12].callGroovyObjectGetProperty(otherObj)) && 
          ScriptBytecodeAdapter.compareEqual(this.path, arrayOfCallSite[13].callGroovyObjectGetProperty(otherObj))))
          return true; 
        return false;
      } 
      if ((ScriptBytecodeAdapter.compareEqual(this.mode, arrayOfCallSite[10].callGroovyObjectGetProperty(otherObj)) && ScriptBytecodeAdapter.compareEqual(this.path, arrayOfCallSite[11].callGroovyObjectGetProperty(otherObj))))
        return true; 
    } 
    return false;
  }
  
  public String getMode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mode;
  }
  
  public void setMode(String mode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = mode;
    this.mode = ShortTypeHandling.castToString(str);
  }
  
  public String getPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.path;
  }
  
  public void setPath(String path) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = path;
    this.path = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
