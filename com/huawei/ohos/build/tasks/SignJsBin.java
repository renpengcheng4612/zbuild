package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import com.huawei.ohos.build.utils.sign.SignUtil;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFile;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.InputChanges;

public class SignJsBin extends IncrementalTask {
  private final String MODULE_TYPE;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  @NonNull
  private BuildType buildType;
  
  @Internal
  private PathInfo pathInfo;
  
  @InputFile
  private File unsignedFile;
  
  @OutputFile
  private File signedFile;
  
  @Input
  public String getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(this.buildType)));
  }
  
  @Inject
  public SignJsBin(VariantData variantData) {
    String str = "bin";
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo, arrayOfCallSite[5].callGroovyObjectGetProperty(variantData), Boolean.valueOf(false))));
    this.unsignedFile = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(SignUtil.class, this.unsignedFile)));
    this.signedFile = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(KeyStoreHelper.class, arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].call(this.buildType)))) {
      SignUtil signUtil = (SignUtil)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(SignUtil.class, arrayOfCallSite[15].callGroovyObjectGetProperty(this), this.MODULE_TYPE, this.variantData), SignUtil.class);
      arrayOfCallSite[16].call(signUtil, this.unsignedFile, this.signedFile);
    } 
  }
  
  @Generated
  public VariantData getVariantData() {
    return this.variantData;
  }
  
  @Generated
  public void setVariantData(VariantData paramVariantData) {
    this.variantData = paramVariantData;
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
  }
  
  @Generated
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
  }
  
  @Generated
  public File getUnsignedFile() {
    return this.unsignedFile;
  }
  
  @Generated
  public void setUnsignedFile(File paramFile) {
    this.unsignedFile = paramFile;
  }
  
  @Generated
  public File getSignedFile() {
    return this.signedFile;
  }
  
  @Generated
  public void setSignedFile(File paramFile) {
    this.signedFile = paramFile;
  }
}
