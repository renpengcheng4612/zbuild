package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.annotation.Validate;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class AppOptions extends Transform2Node {
  @Validate(regex = "^[a-zA-Z][\\w\\.]{1,127}", notNull = true)
  public String bundleName;
  
  @Validate(maxLength = 255)
  public String vendor;
  
  public String process;
  
  @Validate(notNull = true)
  public ApiVersionOptions apiVersion;
  
  @Validate(notNull = true)
  public VersionOptions version;
  
  public String originalName;
  
  @Validate(deviceType = "lite", notSupport = true)
  public String relatedBundleName;
  
  public AppOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String getOriginalName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.originalName;
  }
  
  public void setOriginalName(String originalName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = originalName;
    this.originalName = ShortTypeHandling.castToString(str);
  }
  
  public ApiVersionOptions getApiVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.apiVersion;
  }
  
  public void setApiVersion(ApiVersionOptions apiVersion) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ApiVersionOptions apiVersionOptions = apiVersion;
    this.apiVersion = (ApiVersionOptions)ScriptBytecodeAdapter.castToType(apiVersionOptions, ApiVersionOptions.class);
  }
  
  public String getBundleName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.bundleName;
  }
  
  public void setBundleName(String bundleName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = bundleName;
    this.bundleName = ShortTypeHandling.castToString(str);
  }
  
  public String getVendor() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.vendor;
  }
  
  public void setVendor(String vendor) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = vendor;
    this.vendor = ShortTypeHandling.castToString(str);
  }
  
  public String getProcess() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.process;
  }
  
  public void setProcess(String process) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = process;
    this.process = ShortTypeHandling.castToString(str);
  }
  
  public VersionOptions getVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.version;
  }
  
  public void setVersion(VersionOptions version) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    VersionOptions versionOptions = version;
    this.version = (VersionOptions)ScriptBytecodeAdapter.castToType(versionOptions, VersionOptions.class);
  }
  
  public String getRelatedBundleName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.relatedBundleName;
  }
  
  public void setRelatedBundleName(String relatedBundleName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = relatedBundleName;
    this.relatedBundleName = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.bundleName;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(arrayOfCallSite[17].call(arrayOfCallSite[18].call(arrayOfCallSite[19].call("AppOptions{", "bundleName='"), this.bundleName), "'"), ", vendor='"), this.vendor), "'"), ", process='"), this.process), "'"), ", apiVersion="), this.apiVersion), ", version="), this.version), ", originalName='"), this.originalName), "'"), ", relatedBundleName='"), this.relatedBundleName), "'"), "}"));
  }
}
