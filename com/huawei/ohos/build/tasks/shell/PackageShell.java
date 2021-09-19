package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.shell.ShellPackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.tasks.bundling.ZipEntryCompression;

public class PackageShell extends Zip implements GroovyObject {
  @Nonnull
  private PackModel packModel;
  
  private PathInfo pathInfo;
  
  @Inject
  public PackageShell(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callConstructor(ShellPackModel.class, arrayOfCallSite[1].callGroovyObjectGetProperty(this), variantData);
    this.packModel = (PackModel)ScriptBytecodeAdapter.castToType(object1, PackModel.class);
    Object object2 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    arrayOfCallSite[3].call(arrayOfCallSite[4].callCurrent(this), arrayOfCallSite[5].call(this.packModel));
    arrayOfCallSite[6].call(arrayOfCallSite[7].callCurrent(this), arrayOfCallSite[8].call(this.packModel));
    arrayOfCallSite[9].callCurrent(this, arrayOfCallSite[10].callGetProperty(ZipEntryCompression.class));
    arrayOfCallSite[11].callCurrent(this, arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(this.pathInfo), arrayOfCallSite[15].callGetProperty(arrayOfCallSite[16].callGroovyObjectGetProperty(this)))));
  }
}
