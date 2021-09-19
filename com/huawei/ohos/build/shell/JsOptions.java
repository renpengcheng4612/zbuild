package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.annotation.Validates;
import com.huawei.ohos.build.shell.js.WindowOptions;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class JsOptions implements Options, GroovyObject {
  @Validate(notNull = true)
  public String name;
  
  @Validates({@Validate(deviceType = "rich", notNull = true), @Validate(deviceType = "lite", notNull = true)})
  public List<String> pages;
  
  public WindowOptions window;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public String type;
  
  public JsOptions() {
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
  
  public List<String> getPages() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pages;
  }
  
  public void setPages(List pages) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = pages;
    this.pages = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public WindowOptions getWindow() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.window;
  }
  
  public void setWindow(WindowOptions window) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    WindowOptions windowOptions = window;
    this.window = (WindowOptions)ScriptBytecodeAdapter.castToType(windowOptions, WindowOptions.class);
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
  
  public void setType(String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = type;
    this.type = ShortTypeHandling.castToString(str);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
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
