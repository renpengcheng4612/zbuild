package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.deserializer.NumberDeserializer;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ApiVersionOptions extends Transform2Node {
  @Validate(notNull = true)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer compatible;
  
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer target;
  
  public String releaseType;
  
  @Generated
  public ApiVersionOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public Integer getCompatible() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compatible;
  }
  
  public void setCompatible(Integer compatible) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = compatible;
    this.compatible = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getTarget() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.target;
  }
  
  public void setTarget(Integer target) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = target;
    this.target = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public String getReleaseType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.releaseType;
  }
  
  public void setReleaseType(String releaseType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = releaseType;
    this.releaseType = ShortTypeHandling.castToString(str);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call("ApiVersionOptions{", "compatible="), this.compatible), ", target="), this.target), ", releaseType='"), this.releaseType), "'"), "}"));
  }
}
