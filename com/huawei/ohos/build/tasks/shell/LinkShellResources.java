package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FeatureUtils;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.Aapt2CommandBuilder;
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
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

public class LinkShellResources extends DefaultTask implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputFile
  private File inputResZip;
  
  @InputFile
  private File inputManifest;
  
  @OutputFile
  private File outputZip;
  
  @Optional
  @InputFile
  private File inputCutManifest;
  
  @Optional
  @OutputFile
  private File outputCutZip;
  
  @InputDirectory
  private File mergeRes;
  
  @OutputDirectory
  private File moduleUnzip;
  
  @OutputDirectory
  @Optional
  private File cutModuleUnzip;
  
  static {
    Object object = $getCallSiteArray()[127].call(HMLogger.class, LinkShellResources.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @OutputDirectory
  @Optional
  public File getOutputJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(this.pathInfo), "r")), File.class);
  }
  
  @Inject
  public LinkShellResources(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo), "res.zip"));
    this.inputResZip = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, arrayOfCallSite[9].call(this.pathInfo), arrayOfCallSite[10].callGetProperty(CommonConst.class)));
    this.inputManifest = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[11].call(arrayOfCallSite[12].call(Paths.class, arrayOfCallSite[13].call(this.pathInfo), arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(arrayOfCallSite[16].callGroovyObjectGetProperty(this)), ".zip")));
    this.outputZip = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[17].call(arrayOfCallSite[18].call(Paths.class, arrayOfCallSite[19].call(this.pathInfo), arrayOfCallSite[20].callGetProperty(arrayOfCallSite[21].callGroovyObjectGetProperty(this))));
    this.moduleUnzip = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[22].call(arrayOfCallSite[23].call(Paths.class, arrayOfCallSite[24].call(this.pathInfo), arrayOfCallSite[25].callGroovyObjectGetProperty(variantData), arrayOfCallSite[26].callGetProperty(PathConst.class)));
    this.mergeRes = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[27].call(this.configInfo), "entry")) {
      Object object10 = arrayOfCallSite[28].call(arrayOfCallSite[29].call(Paths.class, arrayOfCallSite[30].call(this.pathInfo), arrayOfCallSite[31].callGetProperty(CommonConst.class)));
      this.inputCutManifest = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
      Object object11 = arrayOfCallSite[32].call(arrayOfCallSite[33].call(Paths.class, arrayOfCallSite[34].call(this.pathInfo), arrayOfCallSite[35].call(arrayOfCallSite[36].call("cut_", arrayOfCallSite[37].callGetProperty(arrayOfCallSite[38].callGroovyObjectGetProperty(this))), ".zip")));
      this.outputCutZip = (File)ScriptBytecodeAdapter.castToType(object11, File.class);
      Object object12 = arrayOfCallSite[39].call(arrayOfCallSite[40].call(Paths.class, arrayOfCallSite[41].call(this.pathInfo), arrayOfCallSite[42].call("cut_", arrayOfCallSite[43].callGetProperty(arrayOfCallSite[44].callGroovyObjectGetProperty(this)))));
      this.cutModuleUnzip = (File)ScriptBytecodeAdapter.castToType(object12, File.class);
    } 
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(this.configInfo)))
      return; 
    Object aapt2 = arrayOfCallSite[49].call(this.sdkInfo);
    Object androidJar = arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(this.sdkInfo), arrayOfCallSite[53].callGetProperty(File.class)), "android.jar");
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].callConstructor(ProcessUtils.class, arrayOfCallSite[55].callGroovyObjectGetProperty(this)), ProcessUtils.class);
    Aapt2CommandBuilder builder = (Aapt2CommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].callConstructor(Aapt2CommandBuilder.class, aapt2), Aapt2CommandBuilder.class);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[68]
        
        .call(arrayOfCallSite[69].call(arrayOfCallSite[70].call(arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].call(builder), androidJar), arrayOfCallSite[74].callGetProperty(getOutputJavaDir())), arrayOfCallSite[75].callGetProperty(this.outputZip)), arrayOfCallSite[76].callGetProperty(this.inputManifest)), arrayOfCallSite[77].callGetProperty(this.inputResZip));
    } else {
      arrayOfCallSite[57].call(arrayOfCallSite[58].call(arrayOfCallSite[59].call(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(builder), androidJar), arrayOfCallSite[63].callGetProperty(arrayOfCallSite[64].callCurrent(this))), arrayOfCallSite[65].callGetProperty(this.outputZip)), arrayOfCallSite[66].callGetProperty(this.inputManifest)), arrayOfCallSite[67].callGetProperty(this.inputResZip));
    } 
    arrayOfCallSite[78].call(hmLogger, "aapt2", arrayOfCallSite[79].call(arrayOfCallSite[80].call(builder), " "));
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[81].callGroovyObjectGetProperty(this.configInfo), "feature"))
      arrayOfCallSite[82].call(FeatureUtils.class, arrayOfCallSite[83].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[84].callGroovyObjectGetProperty(this), builder); 
    arrayOfCallSite[85].call(processUtils, arrayOfCallSite[86].call(builder), hmLogger);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[87].call(FileUtils.class, this.moduleUnzip)))
      arrayOfCallSite[88].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[89].callGetProperty(this.moduleUnzip)); 
    arrayOfCallSite[90].callCurrent(this, this.outputZip, this.moduleUnzip, this.mergeRes);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[91].call(this.configInfo), "entry")) {
      Aapt2CommandBuilder builder2 = (Aapt2CommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[92].callConstructor(Aapt2CommandBuilder.class, aapt2), Aapt2CommandBuilder.class);
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        arrayOfCallSite[104]
          
          .call(arrayOfCallSite[105].call(arrayOfCallSite[106].call(arrayOfCallSite[107].call(arrayOfCallSite[108].call(arrayOfCallSite[109].call(builder2), androidJar), arrayOfCallSite[110].callGetProperty(getOutputJavaDir())), arrayOfCallSite[111].callGetProperty(this.outputCutZip)), arrayOfCallSite[112].callGetProperty(this.inputCutManifest)), arrayOfCallSite[113].callGetProperty(this.inputResZip));
      } else {
        arrayOfCallSite[93].call(arrayOfCallSite[94].call(arrayOfCallSite[95].call(arrayOfCallSite[96].call(arrayOfCallSite[97].call(arrayOfCallSite[98].call(builder2), androidJar), arrayOfCallSite[99].callGetProperty(arrayOfCallSite[100].callCurrent(this))), arrayOfCallSite[101].callGetProperty(this.outputCutZip)), arrayOfCallSite[102].callGetProperty(this.inputCutManifest)), arrayOfCallSite[103].callGetProperty(this.inputResZip));
      } 
      arrayOfCallSite[114].call(hmLogger, "aapt2", arrayOfCallSite[115].call(arrayOfCallSite[116].call(builder2), " "));
      arrayOfCallSite[117].call(processUtils, arrayOfCallSite[118].call(builder2), hmLogger);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[119].call(FileUtils.class, this.cutModuleUnzip)))
        arrayOfCallSite[120].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[121].callGetProperty(this.cutModuleUnzip)); 
      arrayOfCallSite[122].callCurrent(this, this.outputCutZip, this.cutModuleUnzip, this.mergeRes);
    } 
  }
  
  public void copyShellFiles(File moduleZip, File moduleUnzip, File mergeRes) {
    Reference reference1 = new Reference(moduleZip), reference2 = new Reference(moduleUnzip), reference3 = new Reference(mergeRes);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[123].call(arrayOfCallSite[124].callGroovyObjectGetProperty(this), new _copyShellFiles_closure1(this, this, reference1, reference2));
    arrayOfCallSite[125].call(arrayOfCallSite[126].callGroovyObjectGetProperty(this), new _copyShellFiles_closure2(this, this, reference3, reference2));
  }
  
  @Generated
  public File getInputResZip() {
    return this.inputResZip;
  }
  
  @Generated
  public void setInputResZip(File paramFile) {
    this.inputResZip = paramFile;
  }
  
  @Generated
  public File getInputManifest() {
    return this.inputManifest;
  }
  
  @Generated
  public void setInputManifest(File paramFile) {
    this.inputManifest = paramFile;
  }
  
  @Generated
  public File getOutputZip() {
    return this.outputZip;
  }
  
  @Generated
  public void setOutputZip(File paramFile) {
    this.outputZip = paramFile;
  }
  
  @Generated
  public File getInputCutManifest() {
    return this.inputCutManifest;
  }
  
  @Generated
  public void setInputCutManifest(File paramFile) {
    this.inputCutManifest = paramFile;
  }
  
  @Generated
  public File getOutputCutZip() {
    return this.outputCutZip;
  }
  
  @Generated
  public void setOutputCutZip(File paramFile) {
    this.outputCutZip = paramFile;
  }
  
  @Generated
  public File getMergeRes() {
    return this.mergeRes;
  }
  
  @Generated
  public void setMergeRes(File paramFile) {
    this.mergeRes = paramFile;
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
  
  public final class _copyShellFiles_closure1 extends Closure implements GeneratedClosure {
    public _copyShellFiles_closure1(Object _outerInstance, Object _thisObject, Reference moduleZip, Reference moduleUnzip) {
      super(_outerInstance, _thisObject);
      Reference reference1 = moduleZip;
      this.moduleZip = reference1;
      Reference reference2 = moduleUnzip;
      this.moduleUnzip = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), this.moduleZip.get()));
      return arrayOfCallSite[3].callCurrent((GroovyObject)this, arrayOfCallSite[4].call(this.moduleUnzip.get()));
    }
    
    @Generated
    public File getModuleZip() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.moduleZip.get(), File.class);
    }
    
    @Generated
    public File getModuleUnzip() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.moduleUnzip.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _copyShellFiles_closure2 extends Closure implements GeneratedClosure {
    public _copyShellFiles_closure2(Object _outerInstance, Object _thisObject, Reference mergeRes, Reference moduleUnzip) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mergeRes;
      this.mergeRes = reference1;
      Reference reference2 = moduleUnzip;
      this.moduleUnzip = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.mergeRes.get(), new _closure3(this, getThisObject()));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, arrayOfCallSite[2].call(this.moduleUnzip.get()));
    }
    
    @Generated
    public File getMergeRes() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.mergeRes.get(), File.class);
    }
    
    @Generated
    public File getModuleUnzip() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.moduleUnzip.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure3 extends Closure implements GeneratedClosure {
      public _closure3(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, "/assets/**/*");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
