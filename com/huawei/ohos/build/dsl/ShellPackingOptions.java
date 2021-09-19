package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.consts.SdkConst;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;

public class ShellPackingOptions implements GroovyObject {
  private int shellMiniSdkVersion;
  
  private int shellTargetSdkVersion;
  
  @Inject
  public ShellPackingOptions(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGetProperty(SdkConst.class);
    this.shellMiniSdkVersion = DefaultTypeTransformation.intUnbox(object1);
    Object object2 = arrayOfCallSite[1].callGetProperty(SdkConst.class);
    this.shellTargetSdkVersion = DefaultTypeTransformation.intUnbox(object2);
  }
  
  public int getShellMiniSdkVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shellMiniSdkVersion;
  }
  
  public int getShellTargetSdkVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shellTargetSdkVersion;
  }
  
  public void setShellMiniSdkVersion(int shellMiniSdkVersion) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int i = shellMiniSdkVersion;
    this.shellMiniSdkVersion = DefaultTypeTransformation.intUnbox(Integer.valueOf(i));
  }
  
  public void setShellTargetSdkVersion(int shellTargetSdkVersion) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int i = shellTargetSdkVersion;
    this.shellTargetSdkVersion = DefaultTypeTransformation.intUnbox(Integer.valueOf(i));
  }
}
