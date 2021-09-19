package com.huawei.ohos.build.tasks.test;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ShellUtils;
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
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.compile.JavaCompile;

public class CompileTestJavac extends JavaCompile implements GroovyObject {
  private static final String ORM_PROCESSOR = "ohos.data.orm.processor.OrmProcessor";
  
  @Internal
  private VariantData variantData;
  
  @Inject
  public CompileTestJavac(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(variantData), ConfigInfo.class);
    String variantName = ShortTypeHandling.castToString(arrayOfCallSite[1].callGroovyObjectGetProperty(variantData));
    arrayOfCallSite[2].callCurrent(this, variantData);
    arrayOfCallSite[3].callCurrent(this, variantData, configInfo);
    Object object1 = arrayOfCallSite[4].callConstructor(File.class, arrayOfCallSite[5].call(arrayOfCallSite[6].call(variantData), variantName));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CompileTestJavac.class, this, "destinationDir");
    Object object2 = arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(arrayOfCallSite[10].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, CompileTestJavac.class, this, "sourceCompatibility");
    Object object3 = arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(arrayOfCallSite[14].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, CompileTestJavac.class, this, "targetCompatibility");
    Object object4 = arrayOfCallSite[15].callGetProperty(StandardCharsets.class);
    ScriptBytecodeAdapter.setProperty(object4, null, arrayOfCallSite[16].callGroovyObjectGetProperty(this), "encoding");
    Object object5 = arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].callGroovyObjectGetProperty(variantData));
    ScriptBytecodeAdapter.setProperty(object5, null, arrayOfCallSite[19].callGroovyObjectGetProperty(this), "debug");
    Object annotationEnabled = arrayOfCallSite[20].callGetProperty(arrayOfCallSite[21].callGetProperty(arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGroovyObjectGetProperty(this))));
    if (DefaultTypeTransformation.booleanUnbox(annotationEnabled)) {
      arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(arrayOfCallSite[26].callGroovyObjectGetProperty(this)), "-processor");
      arrayOfCallSite[27].call(arrayOfCallSite[28].callGetProperty(arrayOfCallSite[29].callGroovyObjectGetProperty(this)), ORM_PROCESSOR);
      if (!BytecodeInterface8.disabledStandardMetaClass()) {
        FileCollection fileCollection = getProcessorFiles();
        ScriptBytecodeAdapter.setProperty(fileCollection, null, arrayOfCallSite[32].callGroovyObjectGetProperty(this), "annotationProcessorPath");
      } else {
        Object object = arrayOfCallSite[30].callCurrent(this);
        ScriptBytecodeAdapter.setProperty(object, null, arrayOfCallSite[31].callGroovyObjectGetProperty(this), "annotationProcessorPath");
      } 
    } 
    arrayOfCallSite[33].callCurrent(this, "**\\*.java");
  }
  
  public void configJavaClasspath(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object = arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this), arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(variantData)), arrayOfCallSite[41].callGetProperty(File.class))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object, CompileTestJavac.class, this, "classpath");
    ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), arrayOfCallSite[44].call(arrayOfCallSite[45].callGroovyObjectGetProperty(this), arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(variantData), arrayOfCallSite[49].call(variantData))))), CompileTestJavac.class, this, "classpath");
    arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), arrayOfCallSite[44].call(arrayOfCallSite[45].callGroovyObjectGetProperty(this), arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(variantData), arrayOfCallSite[49].call(variantData)))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), arrayOfCallSite[52].call(variantData)), CompileTestJavac.class, this, "classpath");
    arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), arrayOfCallSite[52].call(variantData));
  }
  
  public void configJavaSources(VariantData variantData, ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String buildConfigPath = ShortTypeHandling.castToString(arrayOfCallSite[53].call(arrayOfCallSite[54].call(variantData)));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(configInfo))) {
      Object object1 = arrayOfCallSite[56].call(arrayOfCallSite[57].call(arrayOfCallSite[58].callGroovyObjectGetProperty(this), arrayOfCallSite[59].call(ShellUtils.class, arrayOfCallSite[60].call(variantData), arrayOfCallSite[61].callGroovyObjectGetProperty(this))), arrayOfCallSite[62].call(arrayOfCallSite[63].callGroovyObjectGetProperty(this), buildConfigPath));
      ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CompileTestJavac.class, this, "source");
      return;
    } 
    Object object = arrayOfCallSite[64].call(arrayOfCallSite[65].call(arrayOfCallSite[66].callGroovyObjectGetProperty(this), arrayOfCallSite[67].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[68].call(arrayOfCallSite[69].callGroovyObjectGetProperty(this), buildConfigPath));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object, CompileTestJavac.class, this, "source");
  }
  
  public FileCollection getProcessorFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object compileSdkDir = arrayOfCallSite[70].call(arrayOfCallSite[71].callGroovyObjectGetProperty(this.variantData));
    File processorJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].call(arrayOfCallSite[73].call(Paths.class, compileSdkDir, arrayOfCallSite[74].callGetProperty(SdkConst.class))), File.class);
    File annotationsJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(arrayOfCallSite[76].call(Paths.class, compileSdkDir, arrayOfCallSite[77].callGetProperty(SdkConst.class))), File.class);
    File poetJar = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].call(arrayOfCallSite[79].call(Paths.class, compileSdkDir, arrayOfCallSite[80].callGetProperty(SdkConst.class))), File.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[86].call(processorJar))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[87].call(annotationsJar))))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[88].call(poetJar)))))
        throw (Throwable)arrayOfCallSite[89].callConstructor(GradleException.class, arrayOfCallSite[90].call("Cannot find the annotation jar in SDK.", " Please select File -> Settings -> Appearance & Behavior -> System Settings -> HarmonyOS SDK and update Java.")); 
      return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].call(arrayOfCallSite[92].callGroovyObjectGetProperty(this), processorJar, annotationsJar, poetJar), FileCollection.class);
    } 
    if (((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[81].call(processorJar))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[82].call(annotationsJar))))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[83].call(poetJar)))))
      throw (Throwable)arrayOfCallSite[84].callConstructor(GradleException.class, arrayOfCallSite[85].call("Cannot find the annotation jar in SDK.", " Please select File -> Settings -> Appearance & Behavior -> System Settings -> HarmonyOS SDK and update Java.")); 
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].call(arrayOfCallSite[92].callGroovyObjectGetProperty(this), processorJar, annotationsJar, poetJar), FileCollection.class);
  }
}
