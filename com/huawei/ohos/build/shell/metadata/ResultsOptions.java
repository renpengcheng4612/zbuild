package com.huawei.ohos.build.shell.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.shell.Options;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Objects;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ResultsOptions implements Options, GroovyObject {
  @Validate(maxLength = 255)
  public String name;
  
  @Validate(notNull = true)
  public String type;
  
  @Validate(maxLength = 255)
  public String description;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public ResultsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[3].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[2].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[8].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.type, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.type));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.type, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.type));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[13].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.description, null) ? Integer.valueOf(0) : arrayOfCallSite[14].call(this.description));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.description, null) ? Integer.valueOf(0) : arrayOfCallSite[12].call(this.description));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!(obj instanceof ResultsOptions))
      return false; 
    ResultsOptions otherObj = (ResultsOptions)ScriptBytecodeAdapter.castToType(obj, ResultsOptions.class);
    return (((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(Objects.class, this.name, arrayOfCallSite[16].callGroovyObjectGetProperty(otherObj))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(Objects.class, this.type, arrayOfCallSite[18].callGroovyObjectGetProperty(otherObj))))) && 
      DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(Objects.class, this.description, arrayOfCallSite[20].callGroovyObjectGetProperty(otherObj))));
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public void setName(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public void setType(String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = type;
    this.type = ShortTypeHandling.castToString(str);
  }
  
  public Map getMergeRule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeRule;
  }
  
  public void setMergeRule(Map mergeRule) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = mergeRule;
    this.mergeRule = (Map)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public String getDescription() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.description;
  }
  
  public void setDescription(String description) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = description;
    this.description = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return true;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
