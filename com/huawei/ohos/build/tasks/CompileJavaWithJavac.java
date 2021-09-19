package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.AnnotationProcessorOptions;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ShellUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.api.tasks.incremental.IncrementalTaskInputs;
import org.gradle.work.ChangeType;
import org.gradle.work.InputChanges;

public class CompileJavaWithJavac extends JavaCompile implements GroovyObject {
  @Nonnull
  private static final HMLogger HM_LOG;
  
  private VariantData variantData;
  
  private PathInfo pathInfo;
  
  @Input
  private Configuration compileClasspath;
  
  static {
    Object object = $getCallSiteArray()[103].call(HMLogger.class, CompileJavaWithJavac.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public CompileJavaWithJavac(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object1, PathInfo.class);
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].callGroovyObjectGetProperty(this)), new GStringImpl(new Object[] { arrayOfCallSite[4].callGroovyObjectGetProperty(variantData) }, new String[] { "", "CompileClassPath" }));
    this.compileClasspath = (Configuration)ScriptBytecodeAdapter.castToType(object2, Configuration.class);
    ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(variantData), ConfigInfo.class);
    String variantName = ShortTypeHandling.castToString(arrayOfCallSite[6].callGroovyObjectGetProperty(variantData));
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      configJavaClasspath();
      null;
    } else {
      arrayOfCallSite[7].callCurrent(this);
    } 
    arrayOfCallSite[8].callCurrent(this, configInfo);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      configAnnotation();
      null;
    } else {
      arrayOfCallSite[9].callCurrent(this);
    } 
    Object object3 = arrayOfCallSite[10].callConstructor(File.class, arrayOfCallSite[11].call(this.pathInfo, variantName));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, CompileJavaWithJavac.class, this, "destinationDir");
    Object object4 = arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, CompileJavaWithJavac.class, this, "sourceCompatibility");
    Object object5 = arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].callGetProperty(arrayOfCallSite[19].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object5, CompileJavaWithJavac.class, this, "targetCompatibility");
    Object object6 = arrayOfCallSite[20].callGetProperty(StandardCharsets.class);
    ScriptBytecodeAdapter.setProperty(object6, null, arrayOfCallSite[21].callGroovyObjectGetProperty(this), "encoding");
    Object object7 = arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGroovyObjectGetProperty(variantData));
    ScriptBytecodeAdapter.setProperty(object7, null, arrayOfCallSite[24].callGroovyObjectGetProperty(this), "debug");
    arrayOfCallSite[25].callCurrent(this, "**\\*.java");
  }
  
  private void configAnnotation() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object1 = arrayOfCallSite[26].call(this.variantData);
    ScriptBytecodeAdapter.setProperty(object1, null, arrayOfCallSite[27].callGroovyObjectGetProperty(this), "annotationProcessorPath");
    AnnotationProcessorOptions annotationProcessorOptions = (AnnotationProcessorOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].callGetProperty(arrayOfCallSite[29].callGetProperty(arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].callGetProperty(arrayOfCallSite[32].callGroovyObjectGetProperty(this))))), AnnotationProcessorOptions.class);
    Object object2 = arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].call(this.pathInfo));
    ScriptBytecodeAdapter.setProperty(object2, null, arrayOfCallSite[36].callGroovyObjectGetProperty(this), "annotationProcessorGeneratedSourcesDirectory");
    Reference compilerArgs = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[38].call(arrayOfCallSite[39].call(annotationProcessorOptions), new _configAnnotation_closure1(this, this, compilerArgs));
    List list = (List)compilerArgs.get();
    ScriptBytecodeAdapter.setProperty(list, null, arrayOfCallSite[40].callGroovyObjectGetProperty(this), "compilerArgs");
  }
  
  public final class _configAnnotation_closure1 extends Closure implements GeneratedClosure {
    public _configAnnotation_closure1(Object _outerInstance, Object _thisObject, Reference compilerArgs) {
      super(_outerInstance, _thisObject);
      Reference reference = compilerArgs;
      this.compilerArgs = reference;
    }
    
    public Object doCall(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.compilerArgs.get(), arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call("-A", k), "="), v));
    }
    
    public Object call(Object k, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, k, v);
    }
    
    @Generated
    public List getCompilerArgs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.compilerArgs.get(), List.class);
    }
  }
  
  public void configJavaClasspath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object1 = arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this), arrayOfCallSite[43].call(arrayOfCallSite[44].callGroovyObjectGetProperty(this), arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(this.variantData)), arrayOfCallSite[48].callGetProperty(File.class))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CompileJavaWithJavac.class, this, "classpath");
    Object rFile = arrayOfCallSite[49].call(arrayOfCallSite[50].call(Paths.class, arrayOfCallSite[51].call(this.pathInfo), arrayOfCallSite[52].callGetProperty(BuildConst.class)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this), arrayOfCallSite[55].call(arrayOfCallSite[56].callGroovyObjectGetProperty(this), arrayOfCallSite[57].callGetProperty(rFile))), CompileJavaWithJavac.class, this, "classpath");
    arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this), arrayOfCallSite[55].call(arrayOfCallSite[56].callGroovyObjectGetProperty(this), arrayOfCallSite[57].callGetProperty(rFile)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), arrayOfCallSite[60].call(this.variantData)), CompileJavaWithJavac.class, this, "classpath");
    arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), arrayOfCallSite[60].call(this.variantData));
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[61].callGetProperty(arrayOfCallSite[62].callGroovyObjectGetProperty(this.variantData)), arrayOfCallSite[63].callGetProperty(VariantModel.class))) {
      ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this), arrayOfCallSite[66].call(arrayOfCallSite[67].callGroovyObjectGetProperty(this), arrayOfCallSite[68].call(Paths.class, arrayOfCallSite[69].call(arrayOfCallSite[70].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].callGroovyObjectGetProperty(this.variantData)))))), CompileJavaWithJavac.class, this, "classpath");
      arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this), arrayOfCallSite[66].call(arrayOfCallSite[67].callGroovyObjectGetProperty(this), arrayOfCallSite[68].call(Paths.class, arrayOfCallSite[69].call(arrayOfCallSite[70].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].callGroovyObjectGetProperty(this.variantData))))));
    } 
  }
  
  public void configJavaSources(ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String buildConfigPath = ShortTypeHandling.castToString(arrayOfCallSite[73].call(this.pathInfo));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[74].call(configInfo))) {
      Object object1 = arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].callGroovyObjectGetProperty(this), arrayOfCallSite[78].call(ShellUtils.class, this.pathInfo, arrayOfCallSite[79].callGroovyObjectGetProperty(this))), arrayOfCallSite[80].call(arrayOfCallSite[81].callGroovyObjectGetProperty(this), buildConfigPath));
      ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CompileJavaWithJavac.class, this, "source");
      return;
    } 
    Object object = arrayOfCallSite[82].call(arrayOfCallSite[83].call(arrayOfCallSite[84].callGroovyObjectGetProperty(this), arrayOfCallSite[85].callGroovyObjectGetProperty(this.variantData)), arrayOfCallSite[86].call(arrayOfCallSite[87].callGroovyObjectGetProperty(this), buildConfigPath));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object, CompileJavaWithJavac.class, this, "source");
  }
  
  protected void compile(InputChanges inputs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[88].call(HM_LOG, arrayOfCallSite[89].call("<source>:", arrayOfCallSite[90].call(arrayOfCallSite[91].callGetProperty(arrayOfCallSite[92].callGroovyObjectGetProperty(this)), arrayOfCallSite[93].call(System.class))));
    arrayOfCallSite[94].call(HM_LOG, arrayOfCallSite[95].call("<classPath>:", arrayOfCallSite[96].call(arrayOfCallSite[97].callGetProperty(arrayOfCallSite[98].callGroovyObjectGetProperty(this)), arrayOfCallSite[99].call(System.class))));
    arrayOfCallSite[100].call(arrayOfCallSite[101].call(inputs, arrayOfCallSite[102].callGroovyObjectGetProperty(this)), new _compile_closure2(this, this));
    ScriptBytecodeAdapter.invokeMethodOnSuperN(JavaCompile.class, this, "compile", new Object[] { inputs });
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
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
  }
  
  @Generated
  public Configuration getCompileClasspath() {
    return this.compileClasspath;
  }
  
  @Generated
  public void setCompileClasspath(Configuration paramConfiguration) {
    this.compileClasspath = paramConfiguration;
  }
  
  public final class _compile_closure2 extends Closure implements GeneratedClosure {
    public _compile_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object javaFileChange) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File javaFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callGetProperty(javaFileChange), File.class);
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if (((((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[31].call(javaFile))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[32].callGetProperty(javaFileChange), arrayOfCallSite[33].callGetProperty(ChangeType.class)))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(arrayOfCallSite[35].callGetProperty(javaFile), arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this)))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[38].call(arrayOfCallSite[39].callGetProperty(javaFile), arrayOfCallSite[40].callGetProperty(BuildConst.class))))) {
          String idlPrefix = ShortTypeHandling.castToString(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this)), arrayOfCallSite[44].callGetProperty(File.class)));
          String fullPackageJavaPath = ShortTypeHandling.castToString(arrayOfCallSite[45].call(arrayOfCallSite[46].callGetProperty(javaFile), arrayOfCallSite[47].call(idlPrefix)));
          int dotJavaIndex = DefaultTypeTransformation.intUnbox(arrayOfCallSite[48].call(fullPackageJavaPath, arrayOfCallSite[49].callGetProperty(BuildConst.class)));
          String fullPackageClassPath = ShortTypeHandling.castToString(arrayOfCallSite[50].call(arrayOfCallSite[51].call(fullPackageJavaPath, Integer.valueOf(0), Integer.valueOf(dotJavaIndex)), arrayOfCallSite[52].callGetProperty(BuildConst.class)));
          File classFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].call(arrayOfCallSite[54].call(Paths.class, arrayOfCallSite[55].call(arrayOfCallSite[56].callGroovyObjectGetProperty(this), arrayOfCallSite[57].callGroovyObjectGetProperty(arrayOfCallSite[58].callGroovyObjectGetProperty(this))), fullPackageClassPath)), File.class);
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[59].call(classFile)))
            return arrayOfCallSite[60].call(classFile); 
          return null;
        } 
        return null;
      } 
      if (((((((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(javaFile))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(javaFileChange), arrayOfCallSite[3].callGetProperty(ChangeType.class)))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(javaFile), arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this)))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(javaFile), arrayOfCallSite[10].callGetProperty(BuildConst.class))))) {
        String idlPrefix = ShortTypeHandling.castToString(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this)), arrayOfCallSite[14].callGetProperty(File.class)));
        String fullPackageJavaPath = ShortTypeHandling.castToString(arrayOfCallSite[15].call(arrayOfCallSite[16].callGetProperty(javaFile), arrayOfCallSite[17].call(idlPrefix)));
        int dotJavaIndex = DefaultTypeTransformation.intUnbox(arrayOfCallSite[18].call(fullPackageJavaPath, arrayOfCallSite[19].callGetProperty(BuildConst.class)));
        String fullPackageClassPath = ShortTypeHandling.castToString(arrayOfCallSite[20].call(arrayOfCallSite[21].call(fullPackageJavaPath, Integer.valueOf(0), Integer.valueOf(dotJavaIndex)), arrayOfCallSite[22].callGetProperty(BuildConst.class)));
        File classFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(arrayOfCallSite[24].call(Paths.class, arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this), arrayOfCallSite[27].callGroovyObjectGetProperty(arrayOfCallSite[28].callGroovyObjectGetProperty(this))), fullPackageClassPath)), File.class);
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(classFile)))
          return arrayOfCallSite[30].call(classFile); 
        return null;
      } 
      return null;
    }
  }
}
