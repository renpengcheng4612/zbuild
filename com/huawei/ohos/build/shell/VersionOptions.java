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

public class VersionOptions extends Transform2Node {
  @Validate(notNull = true, maxLength = 32)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer code;
  
  @Validate(notNull = true, maxLength = 127)
  public String name;
  
  @Validate(maxLength = 32)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer minCompatibleVersionCode;
  
  @Generated
  public VersionOptions() {
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
  
  public Integer getCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.code;
  }
  
  public void setCode(Integer code) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = code;
    this.code = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
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
  
  public Integer getMinCompatibleVersionCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.minCompatibleVersionCode;
  }
  
  public void setMinCompatibleVersionCode(Integer minCompatibleVersionCode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = minCompatibleVersionCode;
    this.minCompatibleVersionCode = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call("VersionOptions{", "code="), this.code), ", name='"), this.name), "'"), ", minCompatibleVersionCode="), this.minCompatibleVersionCode), "}"));
  }
}
