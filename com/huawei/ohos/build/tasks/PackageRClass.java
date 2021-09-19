package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
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
import org.gradle.api.tasks.bundling.Jar;

public class PackageRClass extends Jar implements GroovyObject {
  @Inject
  public PackageRClass(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(variantData), PathInfo.class);
    Object generatedDir = arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(pathInfo)));
    Object resourceTableClasses = arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].callGetProperty(generatedDir), arrayOfCallSite[9].callGetProperty(BuildConst.class))));
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), "R");
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), "jar");
    arrayOfCallSite[14].callCurrent(this, "**\\*.class");
    arrayOfCallSite[15].callCurrent(this, resourceTableClasses);
    Object object1 = arrayOfCallSite[16].callGetProperty(generatedDir);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, PackageRClass.class, this, "destinationDirectory");
  }
}
