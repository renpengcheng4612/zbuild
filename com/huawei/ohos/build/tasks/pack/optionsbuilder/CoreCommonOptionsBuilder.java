package com.huawei.ohos.build.tasks.pack.optionsbuilder;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public abstract class CoreCommonOptionsBuilder implements PackOptionsBuilder, GroovyObject {
  @Nonnull
  protected Project project;
  
  @Nonnull
  protected VariantData variantData;
  
  @Nonnull
  protected PathInfo pathInfo;
  
  @Nonnull
  protected ConfigInfo configInfo;
  
  @Nonnull
  protected PackageInfo packageInfo;
  
  @Nonnull
  protected List<File> outputFiles;
  
  public CoreCommonOptionsBuilder(PackModel packModel) {
    Object object1 = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.outputFiles = (List<File>)ScriptBytecodeAdapter.castToType(object1, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    Object object2 = arrayOfCallSite[1].call(packModel);
    this.project = (Project)ScriptBytecodeAdapter.castToType(object2, Project.class);
    Object object3 = arrayOfCallSite[2].call(packModel);
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(object3, VariantData.class);
    Object object4 = arrayOfCallSite[3].callGroovyObjectGetProperty(this.variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].callGroovyObjectGetProperty(this.variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object5, ConfigInfo.class);
    Object object6 = arrayOfCallSite[5].callGroovyObjectGetProperty(this.variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object6, PackageInfo.class);
  }
  
  public List<File> getOutputFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.outputFiles;
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
}
