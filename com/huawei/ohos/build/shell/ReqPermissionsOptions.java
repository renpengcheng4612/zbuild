package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.shell.permission.UsedSceneOptions;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ReqPermissionsOptions extends Transform2Node implements Permission {
  @Validate(notNull = true)
  public String name;
  
  public String reason;
  
  public UsedSceneOptions usedScene;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public ReqPermissionsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public Permission getModel(Map map) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Permission)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(ReqPermissionsOptions.class, map), Permission.class);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Node reqPermissionsModuleNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(Node.class, parent, "uses-permission"), Node.class);
    arrayOfCallSite[2].call(arrayOfCallSite[3].callConstructor(XmlNodeHandler.class), reqPermissionsModuleNode, "android:name", this.name);
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
  
  public String getReason() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.reason;
  }
  
  public void setReason(String reason) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = reason;
    this.reason = ShortTypeHandling.castToString(str);
  }
  
  public UsedSceneOptions getUsedScene() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.usedScene;
  }
  
  public void setUsedScene(UsedSceneOptions usedScene) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    UsedSceneOptions usedSceneOptions = usedScene;
    this.usedScene = (UsedSceneOptions)ScriptBytecodeAdapter.castToType(usedSceneOptions, UsedSceneOptions.class);
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
