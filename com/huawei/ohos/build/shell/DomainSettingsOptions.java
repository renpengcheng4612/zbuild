package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class DomainSettingsOptions extends Transform2Node {
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean cleartextPermitted;
  
  public List<DomainOptions> domains;
  
  public DomainSettingsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public Boolean getCleartextPermitted() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.cleartextPermitted;
  }
  
  public void setCleartextPermitted(Boolean cleartextPermitted) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = cleartextPermitted;
    this.cleartextPermitted = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public List<DomainOptions> getDomains() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.domains;
  }
  
  public void setDomains(List domains) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = domains;
    this.domains = (List<DomainOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call("DomainSettings{", "cleartextPermitted="), this.cleartextPermitted), ", domains="), this.domains), "}"));
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
}
