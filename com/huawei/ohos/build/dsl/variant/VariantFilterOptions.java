package com.huawei.ohos.build.dsl.variant;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class VariantFilterOptions implements VariantFilter, GroovyObject {
  private boolean ignore;
  
  private BuildType buildType;
  
  private List<VariantFlavor> flavors;
  
  @Generated
  public VariantFilterOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void init(BuildType buildType, List flavors) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = false;
    this.ignore = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
    BuildType buildType1 = buildType;
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(buildType1, BuildType.class);
    List list = flavors;
    this.flavors = (List<VariantFlavor>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public void setIgnore(boolean ignore) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = ignore;
    this.ignore = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public BuildType getBuildType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.buildType;
  }
  
  public List<VariantFlavor> getFlavors() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.flavors;
  }
  
  public boolean isIgnore() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.ignore;
  }
}
