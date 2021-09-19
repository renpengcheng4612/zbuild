package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class NetworkOptions extends Transform2Node {
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean cleartextTraffic;
  
  public SecurityConfigOptions securityConfig;
  
  public NetworkOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(this.securityConfig, null)) {
      DomainSettingsOptions domainSettings = (DomainSettingsOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callGetProperty(this.securityConfig), DomainSettingsOptions.class);
      arrayOfCallSite[1].callCurrent(this, parent, domainSettings);
    } 
  }
  
  public void transformDomainSettings(Node parent, DomainSettingsOptions domainSettings) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(domainSettings, null)) {
      XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
      Node domainConfigNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callConstructor(Node.class, parent, "domain-config"), Node.class);
      arrayOfCallSite[4].call(handler, domainConfigNode, "cleartextTrafficPermitted", arrayOfCallSite[5].callGroovyObjectGetProperty(domainSettings));
      DomainOptions domain;
      Iterator iterator;
      for (domain = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(domainSettings)), Iterator.class); iterator.hasNext(); ) {
        domain = (DomainOptions)ScriptBytecodeAdapter.castToType(iterator.next(), DomainOptions.class);
        Node domainNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(Node.class, domainConfigNode, "domain", arrayOfCallSite[9].callGroovyObjectGetProperty(domain)), Node.class);
        arrayOfCallSite[10].call(handler, domainNode, "includeSubdomains", arrayOfCallSite[11].callGroovyObjectGetProperty(domain));
      } 
    } 
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call("NetworkOptions{", "cleartextTraffic="), this.cleartextTraffic), ", securityConfig="), this.securityConfig), "}"));
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public SecurityConfigOptions getSecurityConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.securityConfig;
  }
  
  public void setSecurityConfig(SecurityConfigOptions securityConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SecurityConfigOptions securityConfigOptions = securityConfig;
    this.securityConfig = (SecurityConfigOptions)ScriptBytecodeAdapter.castToType(securityConfigOptions, SecurityConfigOptions.class);
  }
  
  public Boolean getCleartextTraffic() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.cleartextTraffic;
  }
  
  public void setCleartextTraffic(Boolean cleartextTraffic) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = cleartextTraffic;
    this.cleartextTraffic = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
}
