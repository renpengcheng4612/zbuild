package com.huawei.ohos.build.dsl.variant;

import com.huawei.ohos.build.model.BaseConfigImpl;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.tasks.Input;

public class VariantFlavorOptions extends BaseConfigImpl implements VariantFlavor {
  @Input
  private String name;
  
  @Input
  private Integer compileSdkVersion;
  
  @Input
  private Integer compatibleSdkVersion;
  
  @Input
  private String bundleName;
  
  @Input
  private String dimension;
  
  @Inject
  public VariantFlavorOptions(String name) {
    String str1 = "";
    boolean bool1 = false;
    this.compileSdkVersion = Integer.valueOf(bool1);
    boolean bool2 = false;
    this.compatibleSdkVersion = Integer.valueOf(bool2);
    String str2 = "", str3 = "";
    MetaClass metaClass = $getStaticMetaClass();
    String str4 = name;
    this.name = ShortTypeHandling.castToString(str4);
  }
  
  public String getDimension() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dimension;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call("VariantFlavorOptions{", "name='"), this.name), "'"), ", compileSdkVersion="), this.compileSdkVersion), ", compatibleSdkVersion="), this.compatibleSdkVersion), ", bundleName='"), this.bundleName), "'"), ", dimension='"), this.dimension), "'"), "}"));
  }
  
  @Generated
  public String getName() {
    return this.name;
  }
  
  @Generated
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  @Generated
  public Integer getCompileSdkVersion() {
    return this.compileSdkVersion;
  }
  
  @Generated
  public void setCompileSdkVersion(Integer paramInteger) {
    this.compileSdkVersion = paramInteger;
  }
  
  @Generated
  public Integer getCompatibleSdkVersion() {
    return this.compatibleSdkVersion;
  }
  
  @Generated
  public void setCompatibleSdkVersion(Integer paramInteger) {
    this.compatibleSdkVersion = paramInteger;
  }
  
  @Generated
  public String getBundleName() {
    return this.bundleName;
  }
  
  @Generated
  public void setBundleName(String paramString) {
    this.bundleName = paramString;
  }
  
  @Generated
  public void setDimension(String paramString) {
    this.dimension = paramString;
  }
}
