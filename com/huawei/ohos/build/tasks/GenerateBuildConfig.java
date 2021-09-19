package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.BuildConfigGenerator;
import com.huawei.ohos.build.utils.configJson.ClassField;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class GenerateBuildConfig extends DefaultTask implements GroovyObject {
  @NonNull
  private BuildType buildType;
  
  private VariantData variantData;
  
  private PathInfo pathInfo;
  
  private ConfigInfo configInfo;
  
  @Input
  private String packageName;
  
  @Input
  public String getSourceOutputDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[4].call(this.pathInfo));
  }
  
  @OutputFile
  public File getBuildConfigJavaFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(this.pathInfo), arrayOfCallSite[8].call(this.packageName, ".", arrayOfCallSite[9].callGetProperty(File.class)), arrayOfCallSite[10].callGetProperty(BuildConst.class))), File.class);
  }
  
  @Inject
  public GenerateBuildConfig(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    Object object4 = arrayOfCallSite[3].call(this.configInfo);
    this.packageName = ShortTypeHandling.castToString(object4);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference generator = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(BuildConfigGenerator.class, arrayOfCallSite[12].callConstructor(File.class, arrayOfCallSite[13].callGroovyObjectGetProperty(this)), this.packageName), BuildConfigGenerator.class));
    arrayOfCallSite[14].call(generator.get(), "boolean", "DEBUG", ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[15].callGetProperty(this.buildType), arrayOfCallSite[16].callGetProperty(BuildConst.class)) ? "Boolean.parseBoolean(\"true\")" : "false");
    arrayOfCallSite[17].call(generator.get(), "String", "PACKAGE_NAME", new GStringImpl(new Object[] { this.packageName }, new String[] { "", "" }));
    arrayOfCallSite[18].call(generator.get(), "String", "BUILD_TYPE", new GStringImpl(new Object[] { arrayOfCallSite[19].callGetProperty(this.buildType) }, new String[] { "", "" }));
    arrayOfCallSite[20].call(generator.get(), "int", "COMPILE_SDK_VERSION", arrayOfCallSite[21].call(String.class, arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGetProperty(arrayOfCallSite[24].callGroovyObjectGetProperty(this)))));
    List<ClassField> lastBuildConfigs = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<ClassField> list = processBuildConfig();
    } else {
      Object object = arrayOfCallSite[25].callCurrent(this);
      lastBuildConfigs = (List<ClassField>)ScriptBytecodeAdapter.castToType(object, List.class);
    } 
    arrayOfCallSite[26].call(lastBuildConfigs, new _run_closure1(this, this, generator));
    arrayOfCallSite[27].call(generator.get());
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject, Reference generator) {
      super(_outerInstance, _thisObject);
      Reference reference = generator;
      this.generator = reference;
    }
    
    public Object doCall(Object lastBuildConfig) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.generator.get(), arrayOfCallSite[1].callGetProperty(lastBuildConfig), arrayOfCallSite[2].callGetProperty(lastBuildConfig), arrayOfCallSite[3].callGetProperty(lastBuildConfig));
    }
    
    @Generated
    public BuildConfigGenerator getGenerator() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (BuildConfigGenerator)ScriptBytecodeAdapter.castToType(this.generator.get(), BuildConfigGenerator.class);
    }
  }
  
  public List<ClassField> processBuildConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<ClassField> mergeBuildConfig = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].callConstructor(ArrayList.class), List.class);
    Reference mergerBuildConfigs = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].callConstructor(HashMap.class), Map.class));
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].callGroovyObjectGetProperty(this.variantData)), null))
      arrayOfCallSite[32].call(arrayOfCallSite[33].callGetProperty(arrayOfCallSite[34].callGetProperty(arrayOfCallSite[35].callGroovyObjectGetProperty(this.variantData))), new _processBuildConfig_closure2(this, this, mergerBuildConfigs)); 
    List buildTypeBuildConfigs = (List)ScriptBytecodeAdapter.castToType(ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[36].callGetProperty(this.buildType), null) ? arrayOfCallSite[37].callConstructor(ArrayList.class) : arrayOfCallSite[38].callGetProperty(this.buildType), List.class);
    arrayOfCallSite[39].call(buildTypeBuildConfigs, new _processBuildConfig_closure3(this, this, mergerBuildConfigs));
    arrayOfCallSite[40].call(mergeBuildConfig, arrayOfCallSite[41].call(mergerBuildConfigs.get()));
    return mergeBuildConfig;
  }
  
  @Generated
  public String getPackageName() {
    return this.packageName;
  }
  
  @Generated
  public void setPackageName(String paramString) {
    this.packageName = paramString;
  }
  
  public final class _processBuildConfig_closure2 extends Closure implements GeneratedClosure {
    public _processBuildConfig_closure2(Object _outerInstance, Object _thisObject, Reference mergerBuildConfigs) {
      super(_outerInstance, _thisObject);
      Reference reference = mergerBuildConfigs;
      this.mergerBuildConfigs = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.mergerBuildConfigs.get(), arrayOfCallSite[1].callGetProperty(it), it);
    }
    
    @Generated
    public Map getMergerBuildConfigs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mergerBuildConfigs.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _processBuildConfig_closure3 extends Closure implements GeneratedClosure {
    public _processBuildConfig_closure3(Object _outerInstance, Object _thisObject, Reference mergerBuildConfigs) {
      super(_outerInstance, _thisObject);
      Reference reference = mergerBuildConfigs;
      this.mergerBuildConfigs = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.mergerBuildConfigs.get(), arrayOfCallSite[1].callGetProperty(it), it);
    }
    
    @Generated
    public Map getMergerBuildConfigs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mergerBuildConfigs.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
