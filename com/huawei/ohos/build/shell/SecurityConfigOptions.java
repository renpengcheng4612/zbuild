package com.huawei.ohos.build.shell;

import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class SecurityConfigOptions extends Transform2Node {
  public DomainSettingsOptions domainSettings;
  
  public SecurityConfigOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public DomainSettingsOptions getDomainSettings() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.domainSettings;
  }
  
  public void setDomainSettings(DomainSettingsOptions domainSettings) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DomainSettingsOptions domainSettingsOptions = domainSettings;
    this.domainSettings = (DomainSettingsOptions)ScriptBytecodeAdapter.castToType(domainSettingsOptions, DomainSettingsOptions.class);
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call("SecurityConfig{", "domainSettings="), this.domainSettings), "}"));
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
