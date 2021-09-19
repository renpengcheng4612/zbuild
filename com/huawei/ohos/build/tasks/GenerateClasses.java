package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.bundling.Jar;

public class GenerateClasses extends Jar implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private PathInfo pathInfo;
  
  private VariantData variantData;
  
  @OutputFile
  private File classesJar;
  
  @Generated
  public void setClassesJar(File paramFile) {
    this.classesJar = paramFile;
  }
  
  @Generated
  public File getClassesJar() {
    return this.classesJar;
  }
  
  static {
    Object object = $getCallSiteArray()[31].call(HMLogger.class, $getCallSiteArray()[32].call(GenerateClasses.class));
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputDirectory
  public File getClassDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File classDir = null;
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[18].callGetProperty(this.buildType), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(arrayOfCallSite[20].callGetProperty(this.buildType))))) {
      Object object = arrayOfCallSite[21].callConstructor(File.class, arrayOfCallSite[22].call(arrayOfCallSite[23].call(this.variantData)));
      classDir = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[24].callConstructor(File.class, arrayOfCallSite[25].call(arrayOfCallSite[26].call(this.variantData), arrayOfCallSite[27].callGroovyObjectGetProperty(this.variantData)));
      classDir = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[28].call(FileUtils.class, classDir)))
      arrayOfCallSite[29].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[30].callGetProperty(classDir)); 
    return classDir;
  }
  
  @Inject
  public GenerateClasses(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGroovyObjectGetProperty(this))), arrayOfCallSite[7].callGetProperty(BuildConst.class)));
    this.classesJar = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGroovyObjectGetProperty(this));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, GenerateClasses.class, this, "destinationDirectory");
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), "classes");
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), "jar");
    arrayOfCallSite[14].callCurrent(this, arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this), arrayOfCallSite[17].callGroovyObjectGetProperty(this)));
  }
}
