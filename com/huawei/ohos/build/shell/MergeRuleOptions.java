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

public class MergeRuleOptions extends Transform2Node {
  private String remove;
  
  private String replace;
  
  public MergeRuleOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public String getRemove() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.remove;
  }
  
  public String getReplace() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.replace;
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
