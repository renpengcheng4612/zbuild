package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.tasks.compile.JavaCompile;

public class CompileRFileWithJavac extends JavaCompile implements GroovyObject {
  private BuildType buildType;
  
  private PathInfo pathInfo;
  
  @Inject
  public CompileRFileWithJavac(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    File generatedDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo))), File.class);
    Object object3 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].callGetProperty(generatedDir), arrayOfCallSite[8].callGetProperty(BuildConst.class)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, CompileRFileWithJavac.class, this, "destinationDir");
    Object object4 = arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), generatedDir);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, CompileRFileWithJavac.class, this, "source");
    Object object5 = arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object5, CompileRFileWithJavac.class, this, "classpath");
    arrayOfCallSite[13].callCurrent(this, arrayOfCallSite[14].callGetProperty(OhosSourceSet.class));
    String str1 = "1.8";
    ScriptBytecodeAdapter.setGroovyObjectProperty(str1, CompileRFileWithJavac.class, this, "targetCompatibility");
    String str2 = "1.8";
    ScriptBytecodeAdapter.setGroovyObjectProperty(str2, CompileRFileWithJavac.class, this, "sourceCompatibility");
    Object object6 = arrayOfCallSite[15].callGetProperty(StandardCharsets.class);
    ScriptBytecodeAdapter.setProperty(object6, null, arrayOfCallSite[16].callGroovyObjectGetProperty(this), "encoding");
    Object object7 = arrayOfCallSite[17].callGetProperty(this.buildType);
    ScriptBytecodeAdapter.setProperty(object7, null, arrayOfCallSite[18].callGroovyObjectGetProperty(this), "debug");
  }
}
