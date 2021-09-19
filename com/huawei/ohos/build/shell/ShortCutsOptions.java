package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.annotation.Validate;
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

public class ShortCutsOptions implements Options, GroovyObject {
  @Validate(notNull = true, maxLength = 63)
  public String shortcutId;
  
  @Validate(maxLength = 63)
  public String label;
  
  @Validate(notNull = true, resource = true)
  public String icon;
  
  public List<Map> intents;
  
  public ShortCutsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public List<Map> getIntents() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.intents;
  }
  
  public void setIntents(List intents) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = intents;
    this.intents = (List<Map>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getShortcutId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shortcutId;
  }
  
  public void setShortcutId(String shortcutId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = shortcutId;
    this.shortcutId = ShortTypeHandling.castToString(str);
  }
  
  public String getLabel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.label;
  }
  
  public void setLabel(String label) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = label;
    this.label = ShortTypeHandling.castToString(str);
  }
  
  public String getIcon() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.icon;
  }
  
  public void setIcon(String icon) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = icon;
    this.icon = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shortcutId;
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
