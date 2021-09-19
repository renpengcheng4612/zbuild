package com.huawei.ohos.build.tasks.test.shell;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.tasks.bundling.ZipEntryCompression;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class PackageTestShell extends Zip implements GroovyObject {
  @NonNull
  private BuildType buildType;
  
  private VariantData variantData;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @Inject
  public PackageTestShell(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object shellApkOutputsDir = arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo), arrayOfCallSite[7].callGroovyObjectGetProperty(variantData)));
    Object shellApkOutputName = arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callGroovyObjectGetProperty(this)), "_"), arrayOfCallSite[13].callGroovyObjectGetProperty(variantData)), "_unsigned_test_feature.apk");
    arrayOfCallSite[14].call(arrayOfCallSite[15].callCurrent(this), shellApkOutputName);
    arrayOfCallSite[16].call(arrayOfCallSite[17].callCurrent(this), shellApkOutputsDir);
    arrayOfCallSite[18].callCurrent(this, arrayOfCallSite[19].callGetProperty(ZipEntryCompression.class));
    arrayOfCallSite[20].callCurrent(this, arrayOfCallSite[21].call(arrayOfCallSite[22].call(Paths.class, arrayOfCallSite[23].call(this.pathInfo), arrayOfCallSite[24].callGetProperty(arrayOfCallSite[25].callGroovyObjectGetProperty(this)))));
  }
}
