package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class CommonEventsOptions extends Transform2Node {
  @Validate(notNull = true, maxLength = 127)
  public String name;
  
  @Validate(maxLength = 255)
  public String permission;
  
  public List<String> data;
  
  public List<String> type;
  
  @Validate(notNull = true)
  public List<String> events;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public CommonEventsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
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
  
  public String getPermission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.permission;
  }
  
  public void setPermission(String permission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = permission;
    this.permission = ShortTypeHandling.castToString(str);
  }
  
  public List<String> getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public void setType(List type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = type;
    this.type = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getEvents() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.events;
  }
  
  public void setEvents(List events) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = events;
    this.events = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.data;
  }
  
  public void setData(List data) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = data;
    this.data = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
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
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
