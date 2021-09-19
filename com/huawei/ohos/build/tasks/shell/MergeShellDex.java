package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public class MergeShellDex extends DefaultTask implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputFile
  private File classesJar;
  
  @InputFile
  private File abilityShellJar;
  
  @InputFile
  private File aceIdeJar;
  
  @InputFile
  private File androidJar;
  
  @InputFile
  private File ohosJar;
  
  @OutputDirectory
  private File outputDir;
  
  @OutputDirectory
  private File moduleUnzip;
  
  @OutputDirectory
  private File cutModuleUnzip;
  
  static {
    Object object = $getCallSiteArray()[75].call(HMLogger.class, MergeShellDex.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public MergeShellDex(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo), arrayOfCallSite[7].callGetProperty(BuildConst.class)));
    this.classesJar = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[8].call(arrayOfCallSite[9].call(Paths.class, arrayOfCallSite[10].call(this.sdkInfo), arrayOfCallSite[11].callGetProperty(BuildConst.class)));
    this.abilityShellJar = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[12].callConstructor(File.class, arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(this.sdkInfo), arrayOfCallSite[16].callGetProperty(File.class)), arrayOfCallSite[17].callGetProperty(SdkConst.class)));
    this.androidJar = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[18].call(arrayOfCallSite[19].call(Paths.class, arrayOfCallSite[20].call(this.sdkInfo), arrayOfCallSite[21].callGetProperty(BuildConst.class)));
    this.aceIdeJar = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[22].call(arrayOfCallSite[23].call(Paths.class, arrayOfCallSite[24].call(this.pathInfo)));
    this.outputDir = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[25].call(arrayOfCallSite[26].call(Paths.class, arrayOfCallSite[27].call(this.pathInfo), arrayOfCallSite[28].callGetProperty(arrayOfCallSite[29].callGroovyObjectGetProperty(this))));
    this.moduleUnzip = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
    Object object11 = arrayOfCallSite[30].call(arrayOfCallSite[31].call(Paths.class, arrayOfCallSite[32].call(this.pathInfo), arrayOfCallSite[33].call("cut_", arrayOfCallSite[34].callGetProperty(arrayOfCallSite[35].callGroovyObjectGetProperty(this)))));
    this.cutModuleUnzip = (File)ScriptBytecodeAdapter.castToType(object11, File.class);
    Object object12 = arrayOfCallSite[36].call(arrayOfCallSite[37].call(Paths.class, arrayOfCallSite[38].call(this.sdkInfo), arrayOfCallSite[39].callGetProperty(SdkConst.class)));
    this.ohosJar = (File)ScriptBytecodeAdapter.castToType(object12, File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(FileUtils.class, this.outputDir)))
      arrayOfCallSite[41].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[42].callGetProperty(this.outputDir)); 
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[43].call(this.configInfo)))
      return; 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[44].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[45]
      
      .call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].call(builder, "-Xmx1024M"), "-Xss1m"), arrayOfCallSite[49].call(this.sdkInfo)), "com.android.tools.r8.D8");
    JavaCommandBuilder.D8Options options = (JavaCommandBuilder.D8Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[50].callConstructor(JavaCommandBuilder.D8Options.class, builder), JavaCommandBuilder.D8Options.class);
    arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].call(arrayOfCallSite[54].call(arrayOfCallSite[55].call(arrayOfCallSite[56].call(options, arrayOfCallSite[57].callGetProperty(this.classesJar)), arrayOfCallSite[58].callGetProperty(this.abilityShellJar)), arrayOfCallSite[59].callGetProperty(this.aceIdeJar)), arrayOfCallSite[60].callGetProperty(this.androidJar)), arrayOfCallSite[61].callGetProperty(this.ohosJar)), arrayOfCallSite[62].callGetProperty(this.outputDir));
    arrayOfCallSite[63].call(hmLogger, "d8", arrayOfCallSite[64].call(arrayOfCallSite[65].call(builder), " "));
    Object process = arrayOfCallSite[66].callConstructor(ProcessUtils.class, arrayOfCallSite[67].callGroovyObjectGetProperty(this), "mergeShellDex");
    arrayOfCallSite[68].call(process, arrayOfCallSite[69].call(builder), hmLogger);
    arrayOfCallSite[70].callCurrent(this, this.outputDir, this.moduleUnzip);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[71].call(this.configInfo), "entry"))
      arrayOfCallSite[72].callCurrent(this, this.outputDir, this.cutModuleUnzip); 
  }
  
  public Object copyDex(File dexOutputDir, File toPath) {
    Reference reference1 = new Reference(dexOutputDir), reference2 = new Reference(toPath);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[73].call(arrayOfCallSite[74].callGroovyObjectGetProperty(this), new _copyDex_closure1(this, this, reference1, reference2));
  }
  
  @Generated
  public File getClassesJar() {
    return this.classesJar;
  }
  
  @Generated
  public void setClassesJar(File paramFile) {
    this.classesJar = paramFile;
  }
  
  @Generated
  public File getAbilityShellJar() {
    return this.abilityShellJar;
  }
  
  @Generated
  public void setAbilityShellJar(File paramFile) {
    this.abilityShellJar = paramFile;
  }
  
  @Generated
  public File getAceIdeJar() {
    return this.aceIdeJar;
  }
  
  @Generated
  public void setAceIdeJar(File paramFile) {
    this.aceIdeJar = paramFile;
  }
  
  @Generated
  public File getAndroidJar() {
    return this.androidJar;
  }
  
  @Generated
  public void setAndroidJar(File paramFile) {
    this.androidJar = paramFile;
  }
  
  @Generated
  public File getOhosJar() {
    return this.ohosJar;
  }
  
  @Generated
  public void setOhosJar(File paramFile) {
    this.ohosJar = paramFile;
  }
  
  @Generated
  public File getOutputDir() {
    return this.outputDir;
  }
  
  @Generated
  public void setOutputDir(File paramFile) {
    this.outputDir = paramFile;
  }
  
  @Generated
  public File getModuleUnzip() {
    return this.moduleUnzip;
  }
  
  @Generated
  public void setModuleUnzip(File paramFile) {
    this.moduleUnzip = paramFile;
  }
  
  @Generated
  public File getCutModuleUnzip() {
    return this.cutModuleUnzip;
  }
  
  @Generated
  public void setCutModuleUnzip(File paramFile) {
    this.cutModuleUnzip = paramFile;
  }
  
  public final class _copyDex_closure1 extends Closure implements GeneratedClosure {
    public _copyDex_closure1(Object _outerInstance, Object _thisObject, Reference dexOutputDir, Reference toPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = dexOutputDir;
      this.dexOutputDir = reference1;
      Reference reference2 = toPath;
      this.toPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.dexOutputDir.get(), new _closure2(this, getThisObject()));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, arrayOfCallSite[2].call(this.toPath.get()));
    }
    
    @Generated
    public File getDexOutputDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.dexOutputDir.get(), File.class);
    }
    
    @Generated
    public File getToPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.toPath.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure2 extends Closure implements GeneratedClosure {
      public _closure2(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, "*.dex");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
