package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import com.huawei.ohos.build.utils.deserializer.StringDeserializer;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class DistroOptions extends Transform2Node {
  @Validate(notNull = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean deliveryWithInstall;
  
  @Validate(notNull = true, maxLength = 128)
  @JsonDeserialize(using = StringDeserializer.class)
  public String moduleName;
  
  @Validate(notNull = true, range = {"entry", "feature", "har"})
  @JsonDeserialize(using = StringDeserializer.class)
  public String moduleType;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean installationFree;
  
  @Generated
  public DistroOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Node distDeliveryNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(Node.class, parent, "dist:delivery"), Node.class);
    if (DefaultTypeTransformation.booleanUnbox(this.deliveryWithInstall)) {
      arrayOfCallSite[1].call(distDeliveryNode, "dist:install-time");
    } else {
      arrayOfCallSite[2].call(distDeliveryNode, "dist:on-demand");
    } 
  }
  
  public Boolean getDeliveryWithInstall() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.deliveryWithInstall;
  }
  
  public void setDeliveryWithInstall(Boolean deliveryWithInstall) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = deliveryWithInstall;
    this.deliveryWithInstall = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getModuleName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.moduleName;
  }
  
  public void setModuleName(String moduleName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = moduleName;
    this.moduleName = ShortTypeHandling.castToString(str);
  }
  
  public String getModuleType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.moduleType;
  }
  
  public Boolean getInstallationFree() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.installationFree;
  }
  
  public void setInstallationFree(Boolean installationFree) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = installationFree;
    this.installationFree = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public void setModuleType(String moduleType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = moduleType;
    this.moduleType = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
