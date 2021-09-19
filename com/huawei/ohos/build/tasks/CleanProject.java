package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class CleanProject extends DefaultTask implements GroovyObject {
  @NonNull
  private BuildType buildType;
  
  private PathInfo pathInfo;
  
  @Inject
  public CleanProject(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File buildPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo))), File.class);
    arrayOfCallSite[5].call(buildPath);
  }
}
