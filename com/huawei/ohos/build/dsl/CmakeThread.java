package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.data.CmakeInfo;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.enumlation.CpuAbiType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.CmakeCommandBuilder;
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
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class CmakeThread extends Thread implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private boolean isCompiling;
  
  private Project project;
  
  private VariantData variantData;
  
  private BuildType buildType;
  
  private String abiFilter;
  
  private ExternalNativeBuild nativeBuild;
  
  public GradleException exception;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private CmakeInfo cmakeInfo;
  
  private String LIB_CPP;
  
  static {
    Object object = $getCallSiteArray()[121].call(HMLogger.class, CmakeThread.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public CmakeThread(String abiFilter, Project project, VariantData variantData) {
    this(abiFilter, project, variantData, true);
  }
  
  public CmakeThread(String abiFilter, Project project, VariantData variantData, boolean isCompiling) {
    String str1 = "libc++.so";
    MetaClass metaClass = $getStaticMetaClass();
    String str2 = abiFilter;
    this.abiFilter = ShortTypeHandling.castToString(str2);
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(project));
    this.nativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(object2, ExternalNativeBuild.class);
    Object object3 = arrayOfCallSite[3].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    Object object4 = arrayOfCallSite[4].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object4, SdkInfo.class);
    Object object5 = arrayOfCallSite[5].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object5, PathInfo.class);
    Object object6 = arrayOfCallSite[6].call(variantData);
    this.cmakeInfo = (CmakeInfo)ScriptBytecodeAdapter.castToType(object6, CmakeInfo.class);
    boolean bool = isCompiling;
    this.isCompiling = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      try {
        executeCmakeBuild();
        null;
      } catch (GradleException e) {
        GradleException gradleException1 = e;
        this.exception = (GradleException)ScriptBytecodeAdapter.castToType(gradleException1, GradleException.class);
        arrayOfCallSite[9].call(hmLogger, e, "Cmake thread");
      } finally {}
      return;
    } 
    try {
      arrayOfCallSite[7].callCurrent(this);
    } catch (GradleException e) {
      GradleException gradleException1 = e;
      this.exception = (GradleException)ScriptBytecodeAdapter.castToType(gradleException1, GradleException.class);
      arrayOfCallSite[8].call(hmLogger, e, "Cmake thread");
    } finally {}
  }
  
  public void executeCmakeBuild() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String outputDir = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getOutputPath(this.abiFilter);
    } else {
      Object object = arrayOfCallSite[10].callCurrent(this, this.abiFilter);
      outputDir = ShortTypeHandling.castToString(object);
    } 
    arrayOfCallSite[11].call(FileUtils.class, arrayOfCallSite[12].call(this.project, outputDir));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      cleanCMakeCache(this.abiFilter);
      null;
    } else {
      arrayOfCallSite[13].callCurrent(this, this.abiFilter);
    } 
    CmakeCommandBuilder builder = (CmakeCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(CmakeCommandBuilder.class, arrayOfCallSite[15].callGroovyObjectGetProperty(this.cmakeInfo)), CmakeCommandBuilder.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(arrayOfCallSite[17].call(this.nativeBuild))))
      arrayOfCallSite[18].call(builder, arrayOfCallSite[19].call(this.nativeBuild)); 
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[39]
        
        .call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call(arrayOfCallSite[50].call(builder, getCmakeListsFolder()), getTempFilePath(this.abiFilter)), this.abiFilter), outputDir), arrayOfCallSite[51].call(arrayOfCallSite[52].callGetProperty(this.buildType))), arrayOfCallSite[53].call(this.sdkInfo)), "OHOS"), this.abiFilter), "ON"), getToolchainFile()), "Ninja"), arrayOfCallSite[54].callGroovyObjectGetProperty(this.cmakeInfo));
    } else {
      arrayOfCallSite[20].call(arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].call(arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].call(arrayOfCallSite[31].call(builder, arrayOfCallSite[32].callCurrent(this)), arrayOfCallSite[33].callCurrent(this, this.abiFilter)), this.abiFilter), outputDir), arrayOfCallSite[34].call(arrayOfCallSite[35].callGetProperty(this.buildType))), arrayOfCallSite[36].call(this.sdkInfo)), "OHOS"), this.abiFilter), "ON"), arrayOfCallSite[37].callCurrent(this)), "Ninja"), arrayOfCallSite[38].callGroovyObjectGetProperty(this.cmakeInfo));
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(this.nativeBuild)))
      arrayOfCallSite[56].call(builder, arrayOfCallSite[57].call(this.nativeBuild)); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(this.nativeBuild)))
      arrayOfCallSite[59].call(builder, arrayOfCallSite[60].call(this.nativeBuild)); 
    arrayOfCallSite[61].call(hmLogger, "cmake", arrayOfCallSite[62].call(arrayOfCallSite[63].call(builder), " "));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[64].callConstructor(ProcessUtils.class, this.project, "native build cmake execute failed"), ProcessUtils.class);
    arrayOfCallSite[65].call(processUtils, arrayOfCallSite[66].call(builder), hmLogger);
    if (!this.isCompiling)
      return; 
    CmakeCommandBuilder ninjaBuilder = (CmakeCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[67].callConstructor(CmakeCommandBuilder.class, arrayOfCallSite[68].callGroovyObjectGetProperty(this.cmakeInfo)), CmakeCommandBuilder.class);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[71].call(ninjaBuilder, getTempFilePath(this.abiFilter));
    } else {
      arrayOfCallSite[69].call(ninjaBuilder, arrayOfCallSite[70].callCurrent(this, this.abiFilter));
    } 
    arrayOfCallSite[72].call(hmLogger, "ninja", arrayOfCallSite[73].call(arrayOfCallSite[74].call(ninjaBuilder), " "));
    arrayOfCallSite[75].call(processUtils, arrayOfCallSite[76].call(ninjaBuilder), hmLogger);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      copyLibCppSo(outputDir, this.abiFilter);
      null;
      return;
    } 
    arrayOfCallSite[77].callCurrent(this, outputDir, this.abiFilter);
  }
  
  private String getLibraryPath(String abi) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[78].call(arrayOfCallSite[79].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[80].callGroovyObjectGetProperty(this.cmakeInfo), "llvm", "lib", arrayOfCallSite[81].call(CpuAbiType.class, abi), "c++"))));
  }
  
  private String getTempFilePath(String abi) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[82].call(arrayOfCallSite[83].call(Paths.class, arrayOfCallSite[84].callGroovyObjectGetProperty(this.cmakeInfo), arrayOfCallSite[85].callGroovyObjectGetProperty(this.variantData), abi)));
  }
  
  private String getOutputPath(String abi) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[86].call(arrayOfCallSite[87].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[88].call(this.pathInfo), "cmake", arrayOfCallSite[89].callGroovyObjectGetProperty(this.variantData), "obj", abi))));
  }
  
  private String getCmakeListsFolder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String path = ShortTypeHandling.castToString(arrayOfCallSite[90].call(arrayOfCallSite[91].call(Paths.class, arrayOfCallSite[92].call(arrayOfCallSite[93].call(this.project)), arrayOfCallSite[94].callGroovyObjectGetProperty(this.nativeBuild))));
    return ShortTypeHandling.castToString(arrayOfCallSite[95].call(path, "CMakeLists.txt", ""));
  }
  
  private String getToolchainFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[96].call(arrayOfCallSite[97].call(Paths.class, arrayOfCallSite[98].callGroovyObjectGetProperty(this.cmakeInfo), "build", "cmake", "ohos.toolchain.cmake")));
  }
  
  private void cleanCMakeCache(String abi) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File cmakeCacheFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[99].call(arrayOfCallSite[100].call(Paths.class, arrayOfCallSite[101].callGroovyObjectGetProperty(this.cmakeInfo), arrayOfCallSite[102].callGroovyObjectGetProperty(this.variantData), abi, "CMakeCache.txt")), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[103].call(cmakeCacheFile)))
      arrayOfCallSite[104].call(cmakeCacheFile); 
  }
  
  private void copyLibCppSo(String outputDir, String abi) {
    Reference reference = new Reference(outputDir);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean isCppStatic = false;
    String args;
    Iterator iterator;
    for (args = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[105].call(arrayOfCallSite[106].call(this.nativeBuild)), Iterator.class); iterator.hasNext(); ) {
      args = ShortTypeHandling.castToString(iterator.next());
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[107].call(args, "OHOS_STL"))) {
        Object object = arrayOfCallSite[108].call(args, "c++_static");
        isCppStatic = DefaultTypeTransformation.booleanUnbox(object);
      } 
    } 
    File libCppSo = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[109].call(arrayOfCallSite[110].call(Paths.class, reference.get(), this.LIB_CPP)), File.class);
    File libsCppSo = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[111].call(arrayOfCallSite[112].call(Paths.class, arrayOfCallSite[113].call(this.pathInfo), abi, this.LIB_CPP)), File.class);
    if (isCppStatic) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[114].call(libCppSo)))
        arrayOfCallSite[115].call(libCppSo); 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[116].call(libsCppSo)))
        arrayOfCallSite[117].call(libsCppSo); 
      return;
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[118].call(libCppSo))) {
      Reference libraryPath = new Reference(null);
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        String str = getLibraryPath(this.abiFilter);
        libraryPath.set(str);
      } else {
        Object object = arrayOfCallSite[119].callCurrent(this, this.abiFilter);
        libraryPath.set(ShortTypeHandling.castToString(object));
      } 
      arrayOfCallSite[120].call(this.project, new _copyLibCppSo_closure1(this, this, libraryPath, reference));
    } 
  }
  
  @Generated
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
  }
  
  @Generated
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
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
  public CmakeInfo getCmakeInfo() {
    return this.cmakeInfo;
  }
  
  @Generated
  public void setCmakeInfo(CmakeInfo paramCmakeInfo) {
    this.cmakeInfo = paramCmakeInfo;
  }
  
  public final class _copyLibCppSo_closure1 extends Closure implements GeneratedClosure {
    public _copyLibCppSo_closure1(Object _outerInstance, Object _thisObject, Reference libraryPath, Reference outputDir) {
      super(_outerInstance, _thisObject);
      Reference reference1 = libraryPath;
      this.libraryPath = reference1;
      Reference reference2 = outputDir;
      this.outputDir = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.libraryPath.get(), new _closure2(this, getThisObject()));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.outputDir.get());
    }
    
    @Generated
    public String getLibraryPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.libraryPath.get());
    }
    
    @Generated
    public String getOutputDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.outputDir.get());
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
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].callGroovyObjectGetProperty(this));
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
