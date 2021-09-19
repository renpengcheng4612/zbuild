package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class DefPermissionsOptions extends Transform2Node implements Permission {
  @Validate(notNull = true)
  public String name;
  
  @Validate(range = {"system_grant", "user_grant"})
  public String grantMode;
  
  public String label;
  
  public String description;
  
  public String group;
  
  @Validate(range = {"restricted", "signature", "privileged"})
  public List<String> availableScope;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  public DefPermissionsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public Permission getModel(Map map) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Permission)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(DefPermissionsOptions.class, map), Permission.class);
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
  
  public String getGrantMode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.grantMode, null))
      return "system_grant"; 
    return this.grantMode;
  }
  
  public void setGrantMode(String grantMode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = grantMode;
    this.grantMode = ShortTypeHandling.castToString(str);
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
  
  public String getGroup() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.group;
  }
  
  public void setGroup(String group) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = group;
    this.group = ShortTypeHandling.castToString(str);
  }
  
  public List<String> getAvailableScope() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.availableScope;
  }
  
  public void setAvailableScope(List availableScope) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = availableScope;
    this.availableScope = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
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
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    Node defPermissionNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(Node.class, parent, "permission"), Node.class);
    Set protectionLevel = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callConstructor(LinkedHashSet.class), Set.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call("user_grant", this.grantMode))) {
      arrayOfCallSite[5].call(protectionLevel, "dangerous");
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(this.availableScope, "signature"))))
        arrayOfCallSite[7].call(protectionLevel, "signature"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(this.availableScope, "privileged"))))
        arrayOfCallSite[9].call(protectionLevel, "privileged"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(this.availableScope, "system"))))
        arrayOfCallSite[11].call(protectionLevel, "system"); 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call("system_grant", this.grantMode))) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(this.availableScope, "restricted"))))
        arrayOfCallSite[14].call(protectionLevel, "normal"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(this.availableScope, "signature"))))
        arrayOfCallSite[16].call(protectionLevel, "signature"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(this.availableScope, "privileged"))))
        arrayOfCallSite[18].call(protectionLevel, "privileged"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(this.availableScope, "system"))))
        arrayOfCallSite[20].call(protectionLevel, "system"); 
      if ((ScriptBytecodeAdapter.compareNotEqual(this.availableScope, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].call(this.availableScope, ""))))
        arrayOfCallSite[22].call(protectionLevel, "normal"); 
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[23].call(protectionLevel), Integer.valueOf(0)))
        arrayOfCallSite[24].call(protectionLevel, "normal"); 
    } else {
      throw (Throwable)arrayOfCallSite[25].callConstructor(GradleException.class, "Invalid config.json file. The defPermissions grantMode value in the file is invalid.");
    } 
    arrayOfCallSite[26].call(handler, defPermissionNode, "android:name", this.name);
    arrayOfCallSite[27].call(handler, defPermissionNode, "android:permissionGroup", this.group);
    if ((ScriptBytecodeAdapter.compareNotEqual(this.description, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[28].call(this.description, "$"))))
      arrayOfCallSite[29].call(handler, defPermissionNode, "android:description", this.description); 
    arrayOfCallSite[30].call(handler, defPermissionNode, "android:protectionLevel", arrayOfCallSite[31].call(String.class, "|", protectionLevel));
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
