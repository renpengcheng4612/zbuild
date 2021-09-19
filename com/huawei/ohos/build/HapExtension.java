package com.huawei.ohos.build;

import com.huawei.ohos.build.dsl.BuildTypeOptions;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import com.huawei.ohos.build.dsl.legacy.LegacyApkOptions;
import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;

public class HapExtension extends BaseExtension {
  private boolean mergeJsSrc;
  
  private long compileJsTime;
  
  private LegacyApkOptions legacyApkOptions;
  
  @Inject
  public HapExtension(Project project, NamedDomainObjectContainer<BuildTypeOptions> buildTypeContainer, NamedDomainObjectContainer<VariantFlavorOptions> variantFlavorContainer, NamedDomainObjectContainer<SigningConfigOptions> signingConfigContainer) {
    super(project, buildTypeContainer, variantFlavorContainer, signingConfigContainer);
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(project), LegacyApkOptions.class, project);
    this.legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(object, LegacyApkOptions.class);
  }
  
  public void legacyApkOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(action, this.legacyApkOptions);
  }
  
  @Generated
  public boolean getMergeJsSrc() {
    return this.mergeJsSrc;
  }
  
  @Generated
  public boolean isMergeJsSrc() {
    return this.mergeJsSrc;
  }
  
  @Generated
  public void setMergeJsSrc(boolean paramBoolean) {
    this.mergeJsSrc = paramBoolean;
  }
  
  @Generated
  public long getCompileJsTime() {
    return this.compileJsTime;
  }
  
  @Generated
  public void setCompileJsTime(long paramLong) {
    this.compileJsTime = paramLong;
  }
  
  @Generated
  public LegacyApkOptions getLegacyApkOptions() {
    return this.legacyApkOptions;
  }
  
  @Generated
  public void setLegacyApkOptions(LegacyApkOptions paramLegacyApkOptions) {
    this.legacyApkOptions = paramLegacyApkOptions;
  }
}
