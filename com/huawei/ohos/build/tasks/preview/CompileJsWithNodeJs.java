package com.huawei.ohos.build.tasks.preview;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.CompileJsTask;
import com.huawei.ohos.build.utils.AsyncTaskUtil;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.NodeCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.internal.os.OperatingSystem;
import org.gradle.work.InputChanges;

public class CompileJsWithNodeJs extends CompileJsTask {
  @NonNull
  private static final HMLogger hmLogger;
  
  private static final String BUILD_ERROR_LOG = "compile_error.log";
  
  private static final String BUILD_SUCCESS_FILE = "compile_success.txt";
  
  @InputDirectory
  private File inputBuildDir;
  
  @OutputDirectory
  private File outputBuildDir;
  
  static {
    Object object = $getCallSiteArray()[214].call(HMLogger.class, CompileJsWithNodeJs.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public CompileJsWithNodeJs(VariantData variantData) {
    super(variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGroovyObjectGetProperty(this));
    this.inputBuildDir = (File)ScriptBytecodeAdapter.castToType(object1, File.class);
    Object object2 = arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].callGroovyObjectGetProperty(this));
    this.outputBuildDir = (File)ScriptBytecodeAdapter.castToType(object2, File.class);
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this))))
      arrayOfCallSite[6].call(hmLogger, arrayOfCallSite[7].callConstructor(GradleException.class, "Router not support preview.")); 
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      initCompileJsTime();
      null;
    } else {
      arrayOfCallSite[8].callCurrent((GroovyObject)this);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)))) {
      boolean needMergeSource = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].callCurrent((GroovyObject)this));
      arrayOfCallSite[12].callCurrent((GroovyObject)this, Boolean.valueOf(needMergeSource), hmLogger);
      arrayOfCallSite[13].callCurrent((GroovyObject)this, arrayOfCallSite[14].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(needMergeSource), null);
      arrayOfCallSite[15].callCurrent((GroovyObject)this, arrayOfCallSite[16].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(needMergeSource), null);
    } else {
      arrayOfCallSite[17].callCurrent((GroovyObject)this, DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this))) ? arrayOfCallSite[20].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class) : arrayOfCallSite[21].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(false), null);
    } 
  }
  
  public void compileJs(CompileJsTask.DeviceTypeForJsCompile deviceType, boolean needMergeSource, InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (((!needMergeSource) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this))))) {
      arrayOfCallSite[24].call(FileUtils.class, arrayOfCallSite[25].callGroovyObjectGetProperty(this));
      arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this));
    } 
    String assetsDir = ShortTypeHandling.castToString(arrayOfCallSite[28].callCurrent((GroovyObject)this, deviceType));
    boolean IS_WINDOWS = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(arrayOfCallSite[30].call(OperatingSystem.class)));
    boolean stopDebug = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this), arrayOfCallSite[33].callGetProperty(BuildConst.class))) ? ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), arrayOfCallSite[36].callGetProperty(BuildConst.class)), "true") : false;
    if (stopDebug) {
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        stopWebpackTask(IS_WINDOWS, deviceType);
        null;
        return;
      } 
      arrayOfCallSite[37].callCurrent((GroovyObject)this, Boolean.valueOf(IS_WINDOWS), deviceType);
      return;
    } 
    NodeCommandBuilder builder = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      NodeCommandBuilder nodeCommandBuilder = initJsCommandBuilder(deviceType);
    } else {
      Object object = arrayOfCallSite[38].callCurrent((GroovyObject)this, deviceType);
      builder = (NodeCommandBuilder)ScriptBytecodeAdapter.castToType(object, NodeCommandBuilder.class);
    } 
    File compileSuccessFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(arrayOfCallSite[40].call(Paths.class, assetsDir, BUILD_SUCCESS_FILE)), File.class);
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[41].call(compileSuccessFile)) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[42].call(compileSuccessFile)))))
      arrayOfCallSite[43].call(hmLogger, arrayOfCallSite[44].call("Unable to delete the %s file.", " The JS compilation result cannot be determined."), arrayOfCallSite[45].callGetProperty(compileSuccessFile)); 
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      stopWebpackTask(IS_WINDOWS, deviceType);
      null;
    } else {
      arrayOfCallSite[46].callCurrent((GroovyObject)this, Boolean.valueOf(IS_WINDOWS), deviceType);
    } 
    ProcessUtils process = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].callConstructor(ProcessUtils.class, arrayOfCallSite[48].callGroovyObjectGetProperty(this), "webpack"), ProcessUtils.class);
    String module;
    Iterator iterator;
    for (module = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[49].call(arrayOfCallSite[50].callGroovyObjectGetProperty(this)), Iterator.class); iterator.hasNext(); ) {
      module = ShortTypeHandling.castToString(iterator.next());
      String myAceManifestPath = ShortTypeHandling.castToString(arrayOfCallSite[51].call(arrayOfCallSite[52].call(Paths.class, arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this)), module, arrayOfCallSite[55].callGetProperty(CommonConst.class))));
      File myAceModuleOutputDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(arrayOfCallSite[57].call(Paths.class, assetsDir, module)), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(FileUtils.class, myAceModuleOutputDir)))
        arrayOfCallSite[59].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[60].callGetProperty(myAceModuleOutputDir)); 
      arrayOfCallSite[61].callCurrent((GroovyObject)this, myAceManifestPath, arrayOfCallSite[62].callGetProperty(myAceModuleOutputDir), hmLogger);
      boolean img2bin = (ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[63].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this))));
      String aceModuleRoot = ShortTypeHandling.castToString(arrayOfCallSite[66].call(Paths.class, arrayOfCallSite[67].call(arrayOfCallSite[68].callGroovyObjectGetProperty(this)), module));
      if (needMergeSource) {
        Object object = arrayOfCallSite[69].call(arrayOfCallSite[70].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[71].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class)) ? arrayOfCallSite[72].callGetProperty(arrayOfCallSite[73].callGetProperty(DeviceType.class)) : arrayOfCallSite[74].callGetProperty(arrayOfCallSite[75].callGetProperty(DeviceType.class)), module);
        aceModuleRoot = ShortTypeHandling.castToString(object);
      } 
      String superVisualPath = ShortTypeHandling.castToString(arrayOfCallSite[76].call(arrayOfCallSite[77].call(Paths.class, arrayOfCallSite[78].callGetProperty(arrayOfCallSite[79].callGroovyObjectGetProperty(this)), module)));
      Map aceEnv = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].callConstructor(HashMap.class), Map.class);
      arrayOfCallSite[81].call(aceEnv, "PATH", arrayOfCallSite[82].callStatic(CompileJsWithNodeJs.class, arrayOfCallSite[83].call(arrayOfCallSite[84].callGroovyObjectGetProperty(this))));
      arrayOfCallSite[85].call(aceEnv, "aceModuleRoot", arrayOfCallSite[86].callStatic(CompileJsWithNodeJs.class, aceModuleRoot));
      arrayOfCallSite[87].call(aceEnv, "aceModuleBuild", arrayOfCallSite[88].callStatic(CompileJsWithNodeJs.class, arrayOfCallSite[89].call(myAceModuleOutputDir)));
      arrayOfCallSite[90].call(aceEnv, "aceManifestPath", arrayOfCallSite[91].callStatic(CompileJsWithNodeJs.class, myAceManifestPath));
      arrayOfCallSite[92].call(aceEnv, "watchMode", "true");
      arrayOfCallSite[93].call(aceEnv, "hapMode", "false");
      arrayOfCallSite[94].call(aceEnv, "iconPath", arrayOfCallSite[95].callStatic(CompileJsWithNodeJs.class, arrayOfCallSite[96].call(arrayOfCallSite[97].callGroovyObjectGetProperty(this))));
      arrayOfCallSite[98].call(aceEnv, "img2bin", arrayOfCallSite[99].call(String.class, Boolean.valueOf(img2bin)));
      arrayOfCallSite[100].call(aceEnv, "aceSuperVisualPath", arrayOfCallSite[101].callStatic(CompileJsWithNodeJs.class, superVisualPath));
      String errorLog = ShortTypeHandling.castToString(arrayOfCallSite[102].call(arrayOfCallSite[103].call(arrayOfCallSite[104].call(arrayOfCallSite[105].call(arrayOfCallSite[106].callGroovyObjectGetProperty(this)), "-"), module), " build js failed."));
      arrayOfCallSite[107].call(process, errorLog);
      Path moduleCompileSuccessPath = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[108].call(Paths.class, assetsDir, module, BUILD_SUCCESS_FILE), Path.class);
      arrayOfCallSite[109].call(Files.class, moduleCompileSuccessPath);
      Path errorLogPath = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[110].call(Paths.class, assetsDir, module, BUILD_ERROR_LOG), Path.class);
      arrayOfCallSite[111].call(Files.class, errorLogPath);
      arrayOfCallSite[112].call(hmLogger, "nodeJs", arrayOfCallSite[113].call(arrayOfCallSite[114].call(builder), " "));
      arrayOfCallSite[115]
        
        .call(process, ArrayUtil.createArray(arrayOfCallSite[116].call(builder), arrayOfCallSite[117].call(arrayOfCallSite[118].call(Paths.class, arrayOfCallSite[119].call(arrayOfCallSite[120].callGroovyObjectGetProperty(this)))), aceEnv, Boolean.valueOf(false), hmLogger, arrayOfCallSite[121].callGetProperty(CommonConst.class), arrayOfCallSite[122].call(moduleCompileSuccessPath)));
      String[] compileResultFiles = { ShortTypeHandling.castToString(arrayOfCallSite[123].call(moduleCompileSuccessPath)), ShortTypeHandling.castToString(arrayOfCallSite[124].call(errorLogPath)) };
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[125].call(AsyncTaskUtil.class, compileResultFiles, hmLogger))) {
        Throwable timeOutException = (Throwable)ScriptBytecodeAdapter.castToType(arrayOfCallSite[126].callConstructor(GradleException.class, arrayOfCallSite[127].call(arrayOfCallSite[128].call(arrayOfCallSite[129].call(arrayOfCallSite[130].call(arrayOfCallSite[131].call(arrayOfCallSite[132].call(arrayOfCallSite[133].call(arrayOfCallSite[134].call(arrayOfCallSite[135].call(arrayOfCallSite[136].call(errorLog, arrayOfCallSite[137].call(System.class)), new GStringImpl(new Object[] { arrayOfCallSite[138].callGetProperty(arrayOfCallSite[139].callGroovyObjectGetProperty(this)) }, new String[] { "Compiling js costs too much time. Please set a larger check time in ", "/build.gradle. " })), arrayOfCallSite[140].call(System.class)), "e.g."), arrayOfCallSite[141].call(System.class)), "ohos {"), arrayOfCallSite[142].call(System.class)), "\tcompileJsTime = 100"), arrayOfCallSite[143].call(System.class)), "}")), Throwable.class);
        arrayOfCallSite[144].call(hmLogger, timeOutException);
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[145].call(Files.class, errorLogPath))) {
        arrayOfCallSite[146].callCurrent((GroovyObject)this, Boolean.valueOf(IS_WINDOWS), deviceType);
        arrayOfCallSite[147].call(hmLogger, arrayOfCallSite[148].callConstructor(GradleException.class, errorLog));
      } 
    } 
    arrayOfCallSite[149].callStatic(CompileJsWithNodeJs.class, compileSuccessFile);
  }
  
  private static void generateSuccessFile(File compileSuccessFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[150].call(FileUtils.class, compileSuccessFile)))
      arrayOfCallSite[151].call(hmLogger, "Unable to create the %s file. The JS compilation result cannot be determined.", arrayOfCallSite[152].callGetProperty(compileSuccessFile)); 
    Reference compileSuccessInfoBuilder = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[153].callConstructor(StringBuilder.class), StringBuilder.class));
    arrayOfCallSite[154]
      .call(arrayOfCallSite[155].call(arrayOfCallSite[156].call(compileSuccessInfoBuilder.get(), "The aceLoader is invoked successfully at "), arrayOfCallSite[157].call(arrayOfCallSite[158].callConstructor(Date.class, arrayOfCallSite[159].call(System.class)))), ".");
    arrayOfCallSite[160].call(compileSuccessFile, arrayOfCallSite[161].callGetProperty(CommonConst.class), new _generateSuccessFile_closure1(CompileJsWithNodeJs.class, CompileJsWithNodeJs.class, compileSuccessInfoBuilder));
  }
  
  public final class _generateSuccessFile_closure1 extends Closure implements GeneratedClosure {
    public _generateSuccessFile_closure1(Object _outerInstance, Object _thisObject, Reference compileSuccessInfoBuilder) {
      super(_outerInstance, _thisObject);
      Reference reference = compileSuccessInfoBuilder;
      this.compileSuccessInfoBuilder = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(this.compileSuccessInfoBuilder.get()));
    }
    
    @Generated
    public StringBuilder getCompileSuccessInfoBuilder() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (StringBuilder)ScriptBytecodeAdapter.castToType(this.compileSuccessInfoBuilder.get(), StringBuilder.class);
    }
  }
  
  public NodeCommandBuilder initJsCommandBuilder(CompileJsTask.DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    NodeCommandBuilder builder = (NodeCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[162].callConstructor(NodeCommandBuilder.class, arrayOfCallSite[163].call(arrayOfCallSite[164].callGroovyObjectGetProperty(this))), NodeCommandBuilder.class);
    String myWebpackConfig = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[165].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class)) ? arrayOfCallSite[166].callGetProperty(SdkConst.class) : arrayOfCallSite[167].callGetProperty(SdkConst.class));
    arrayOfCallSite[168].call(arrayOfCallSite[169].call(builder, "./node_modules/webpack/bin/webpack.js"), myWebpackConfig);
    List deviceTypeList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[170].call(arrayOfCallSite[171].callGroovyObjectGetProperty(this)), List.class);
    List currentDeviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[172].callStatic(CompileJsWithNodeJs.class, Boolean.valueOf(ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[173].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))), deviceTypeList), List.class);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[181]
        
        .call(arrayOfCallSite[182].call(arrayOfCallSite[183].call(builder, currentDeviceType), arrayOfCallSite[184].callGetProperty(arrayOfCallSite[185].callGroovyObjectGetProperty(arrayOfCallSite[186].callGroovyObjectGetProperty(this)))), getWatchTaskTitle(deviceType));
      return builder;
    } 
    arrayOfCallSite[174].call(arrayOfCallSite[175].call(arrayOfCallSite[176].call(builder, currentDeviceType), arrayOfCallSite[177].callGetProperty(arrayOfCallSite[178].callGroovyObjectGetProperty(arrayOfCallSite[179].callGroovyObjectGetProperty(this)))), arrayOfCallSite[180].callCurrent((GroovyObject)this, deviceType));
    return builder;
  }
  
  private void initCompileJsTime() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    long time = DefaultTypeTransformation.longUnbox(arrayOfCallSite[187].callGetProperty(arrayOfCallSite[188].callGetProperty(arrayOfCallSite[189].callGroovyObjectGetProperty(this))));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigL() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((time == 0L))
        return; 
    } else if ((time == 0L)) {
      return;
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigL() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[192].call(AsyncTaskUtil.class, Long.valueOf(time * 1000L));
      return;
    } 
    arrayOfCallSite[190].call(AsyncTaskUtil.class, arrayOfCallSite[191].call(Long.valueOf(time), Integer.valueOf(1000)));
  }
  
  private String getWatchTaskTitle(CompileJsTask.DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String deviceTypeName = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[193].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class)) ? arrayOfCallSite[194].callGetProperty(BuildConst.class) : arrayOfCallSite[195].callGetProperty(BuildConst.class));
    String parentName = ShortTypeHandling.castToString(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[196].callGetProperty(arrayOfCallSite[197].callGroovyObjectGetProperty(this))) ? arrayOfCallSite[198].callGetProperty(arrayOfCallSite[199].callGetProperty(arrayOfCallSite[200].callGetProperty(arrayOfCallSite[201].callGroovyObjectGetProperty(this)))) : "");
    return ShortTypeHandling.castToString(arrayOfCallSite[202].call(arrayOfCallSite[203].call(arrayOfCallSite[204].call(arrayOfCallSite[205].call(arrayOfCallSite[206].call(arrayOfCallSite[207].call(parentName, "-"), arrayOfCallSite[208].callGetProperty(arrayOfCallSite[209].callGroovyObjectGetProperty(this))), "-"), deviceTypeName), "-"), arrayOfCallSite[210].callGetProperty(BuildConst.class)));
  }
  
  private void stopWebpackTask(boolean IS_WINDOWS, CompileJsTask.DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String taskTitle = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getWatchTaskTitle(deviceType);
    } else {
      Object object = arrayOfCallSite[211].callCurrent((GroovyObject)this, deviceType);
      taskTitle = ShortTypeHandling.castToString(object);
    } 
    arrayOfCallSite[212].call(ProcessUtils.class, "node", arrayOfCallSite[213].call("title=", taskTitle), Boolean.valueOf(IS_WINDOWS), hmLogger);
  }
  
  @Generated
  public File getInputBuildDir() {
    return this.inputBuildDir;
  }
  
  @Generated
  public void setInputBuildDir(File paramFile) {
    this.inputBuildDir = paramFile;
  }
  
  @Generated
  public File getOutputBuildDir() {
    return this.outputBuildDir;
  }
  
  @Generated
  public void setOutputBuildDir(File paramFile) {
    this.outputBuildDir = paramFile;
  }
}
