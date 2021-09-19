package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class DefPermissionGroupsOptions extends Transform2Node implements Permission {
  @Validate(notNull = true)
  public String name;
  
  @Validate(resource = true)
  public String icon;
  
  public String label;
  
  public String description;
  
  public Integer order;
  
  public String request;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public DefPermissionGroupsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    Node permissionGroup = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(Node.class, parent, "permission-group"), Node.class);
    arrayOfCallSite[2].call(handler, permissionGroup, "android:name", this.name);
    arrayOfCallSite[3].call(handler, permissionGroup, "android:icon", this.icon);
    arrayOfCallSite[4].call(handler, permissionGroup, "android:label", this.label);
    if ((ScriptBytecodeAdapter.compareNotEqual(this.description, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(this.description, "$"))))
      arrayOfCallSite[6].call(handler, permissionGroup, "android:description", this.description); 
    arrayOfCallSite[7].call(handler, permissionGroup, "android:priority", this.order);
    arrayOfCallSite[8].call(handler, permissionGroup, "request", this.request);
  }
  
  public Permission getModel(Map map) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Permission)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(DefPermissionsOptions.class, map), Permission.class);
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
  
  public String getIcon() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.icon;
  }
  
  public void setIcon(String icon) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = icon;
    this.icon = ShortTypeHandling.castToString(str);
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
  
  public String getDescription() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.description;
  }
  
  public void setDescription(String description) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = description;
    this.description = ShortTypeHandling.castToString(str);
  }
  
  public Integer getOrder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.order;
  }
  
  public void setOrder(Integer order) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = order;
    this.order = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public String getRequest() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.request;
  }
  
  public void setRequest(String request) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = request;
    this.request = ShortTypeHandling.castToString(str);
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
}
