package com.huawei.ohos.build.tasks;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huawei.ohos.build.HarmonyHapPluginMain;
import com.huawei.ohos.build.HarmonyLibraryPluginMain;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.dsl.PseudoLocalization;
import com.huawei.ohos.build.dsl.legacy.LegacyApkOptions;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.shell.js.WindowOptions;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.ShellUtils;
import com.huawei.ohos.build.utils.command.RestoolCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.json.JsonOutput;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public class CompileResources extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  @Nonnull
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @OutputDirectory
  private File genRPath;
  
  @OutputDirectory
  private Path liteOutputDirForWatchOnly;
  
  @OutputDirectory
  private Path richOutputDirForWatchOnly;
  
  @InputFile
  private File liteConfigPath;
  
  @Nested
  private PseudoLocalization buildTypePseudoLocalization;
  
  @Nested
  private PseudoLocalization defaultPseudoLocalization;
  
  @OutputDirectory
  private File mergeDir;
  
  static {
    Object object = $getCallSiteArray()[241].call(HMLogger.class, CompileResources.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputFile
  @Optional
  public File getRichConfigPathForWatchOnly() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[29].callGetProperty(BuildConst.class), arrayOfCallSite[30].callGroovyObjectGetProperty(this.configInfo)))
      return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
    File mergedFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(arrayOfCallSite[32].call(Paths.class, arrayOfCallSite[33].call(this.pathInfo))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(mergedFile)))
      arrayOfCallSite[35].call(this.variantData, mergedFile); 
    return mergedFile;
  }
  
  @InputFiles
  public FileCollection getMergeResFileCollection() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File mergeResFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[36].call(arrayOfCallSite[37].call(Paths.class, arrayOfCallSite[38].call(this.pathInfo), arrayOfCallSite[39].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[40].callGetProperty(BuildConst.class))), File.class);
    Reference mergeResFileCollection = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this)), FileCollection.class));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[43].call(mergeResFile)))
      arrayOfCallSite[44].call(mergeResFile, new _getMergeResFileCollection_closure1(this, this, mergeResFileCollection)); 
    return (FileCollection)mergeResFileCollection.get();
  }
  
  public final class _getMergeResFileCollection_closure1 extends Closure implements GeneratedClosure {
    public _getMergeResFileCollection_closure1(Object _outerInstance, Object _thisObject, Reference mergeResFileCollection) {
      super(_outerInstance, _thisObject);
      Reference reference = mergeResFileCollection;
      this.mergeResFileCollection = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(File.class, arrayOfCallSite[1].call(it, Integer.valueOf(1), arrayOfCallSite[2].call(arrayOfCallSite[3].call(it), Integer.valueOf(1))), "resources"), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file))) {
        this.mergeResFileCollection.set(ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(this.mergeResFileCollection.get(), arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), file)), FileCollection.class));
        return arrayOfCallSite[5].call(this.mergeResFileCollection.get(), arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), file));
      } 
      return null;
    }
    
    @Generated
    public FileCollection getMergeResFileCollection() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (FileCollection)ScriptBytecodeAdapter.castToType(this.mergeResFileCollection.get(), FileCollection.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @Inject
  public CompileResources(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object4, BuildType.class);
    Object object5 = arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGetProperty(this.buildType));
    this.buildTypePseudoLocalization = (PseudoLocalization)ScriptBytecodeAdapter.castToType(object5, PseudoLocalization.class);
    Object object6 = arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGroovyObjectGetProperty(this))));
    this.defaultPseudoLocalization = (PseudoLocalization)ScriptBytecodeAdapter.castToType(object6, PseudoLocalization.class);
    Object object7 = arrayOfCallSite[10].call(Paths.class, arrayOfCallSite[11].call(this.pathInfo), arrayOfCallSite[12].callGroovyObjectGetProperty(variantData), arrayOfCallSite[13].callGetProperty(BuildConst.class));
    this.liteOutputDirForWatchOnly = (Path)ScriptBytecodeAdapter.castToType(object7, Path.class);
    Object object8 = arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].call(this.pathInfo), arrayOfCallSite[16].callGroovyObjectGetProperty(variantData), arrayOfCallSite[17].callGetProperty(BuildConst.class));
    this.richOutputDirForWatchOnly = (Path)ScriptBytecodeAdapter.castToType(object8, Path.class);
    Object object9 = arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), arrayOfCallSite[20].call(this.pathInfo));
    this.genRPath = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this), arrayOfCallSite[23].call(this.pathInfo));
    this.liteConfigPath = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
    Object object11 = arrayOfCallSite[24].call(arrayOfCallSite[25].call(Paths.class, arrayOfCallSite[26].call(this.pathInfo), arrayOfCallSite[27].callGroovyObjectGetProperty(variantData), arrayOfCallSite[28].callGetProperty(PathConst.class)));
    this.mergeDir = (File)ScriptBytecodeAdapter.castToType(object11, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[45].call(this.configInfo))) {
      arrayOfCallSite[46].callCurrent(this, arrayOfCallSite[47].callGetProperty(BuildConst.class));
      return;
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(this.configInfo)))
      arrayOfCallSite[49].callCurrent(this, arrayOfCallSite[50].callGetProperty(BuildConst.class)); 
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[51].call(this.configInfo)) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(this.configInfo)))))
      arrayOfCallSite[53].callCurrent(this, arrayOfCallSite[54].callGetProperty(BuildConst.class)); 
  }
  
  public void compileResources(String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String restool = ShortTypeHandling.castToString(arrayOfCallSite[55].call(this.sdkInfo));
    String configPath = ShortTypeHandling.castToString(arrayOfCallSite[56].call(this.pathInfo));
    if (ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[57].callGetProperty(BuildConst.class))) {
      Object object = arrayOfCallSite[58].call(arrayOfCallSite[59].call(this.variantData));
      configPath = ShortTypeHandling.castToString(object);
    } 
    File outputDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].call(arrayOfCallSite[61].call(Paths.class, arrayOfCallSite[62].call(this.pathInfo), arrayOfCallSite[63].callGroovyObjectGetProperty(this.variantData), deviceType)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[64].call(FileUtils.class, outputDir)))
      arrayOfCallSite[65].call(hmLogger, "Unable to create the %s folder. An incremental problem may occur.", outputDir); 
    RestoolCommandBuilder incremental = (RestoolCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[66].callCurrent(this, ArrayUtil.createArray(restool, configPath, outputDir, Boolean.valueOf(true), deviceType)), RestoolCommandBuilder.class);
    arrayOfCallSite[67].call(hmLogger, "restool", arrayOfCallSite[68].call(incremental));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].callConstructor(ProcessUtils.class, arrayOfCallSite[70].callGroovyObjectGetProperty(this), Boolean.valueOf(true)), ProcessUtils.class);
    arrayOfCallSite[71].call(processUtils, arrayOfCallSite[72].call(incremental), hmLogger);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[73].call(processUtils), arrayOfCallSite[74].callGetProperty(ProcessUtils.class))) {
      RestoolCommandBuilder full = (RestoolCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].callCurrent(this, ArrayUtil.createArray(restool, configPath, outputDir, Boolean.valueOf(false), deviceType)), RestoolCommandBuilder.class);
      arrayOfCallSite[76].call(arrayOfCallSite[77].callConstructor(ProcessUtils.class, arrayOfCallSite[78].callGroovyObjectGetProperty(this)), arrayOfCallSite[79].call(full), hmLogger);
    } 
    arrayOfCallSite[80].callCurrent(this, outputDir, deviceType);
  }
  
  private void appendInfoIntoJson(File outputDir, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[81].callGroovyObjectGetProperty(this.configInfo), arrayOfCallSite[82].callGetProperty(BuildConst.class)))
      return; 
    File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[83].call(arrayOfCallSite[84].call(Paths.class, arrayOfCallSite[85].call(outputDir), arrayOfCallSite[86].callGetProperty(CommonConst.class))), File.class);
    Reference configJsonObj = new Reference(null);
    try {
      Object object = arrayOfCallSite[87].call(JSON.class, arrayOfCallSite[88].call(configFile, "UTF-8"));
      configJsonObj.set(ScriptBytecodeAdapter.castToType(object, JSONObject.class));
    } catch (IOException e) {
      arrayOfCallSite[89].call(hmLogger, e);
    } finally {}
    arrayOfCallSite[90].callCurrent(this, configJsonObj.get());
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[91].call(this.configInfo))) {
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[92].call(this.configInfo)) && ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[93].callGetProperty(BuildConst.class))))
        arrayOfCallSite[94].call(ShellUtils.class, configJsonObj.get()); 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[95].callGetProperty(arrayOfCallSite[96].callGroovyObjectGetProperty(this.variantData)))) {
        JSONObject deviceConfigObj = (JSONObject)ScriptBytecodeAdapter.asType(arrayOfCallSite[97].call(configJsonObj.get(), "deviceConfig"), JSONObject.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[98].call(deviceConfigObj, "default"), null)) {
          JSONObject jSONObject = (JSONObject)ScriptBytecodeAdapter.castToType(arrayOfCallSite[99].callConstructor(JSONObject.class), JSONObject.class);
          arrayOfCallSite[100].call(deviceConfigObj, "default", jSONObject);
        } 
        JSONObject defaultObj = (JSONObject)ScriptBytecodeAdapter.asType(arrayOfCallSite[101].call(deviceConfigObj, "default"), JSONObject.class);
        arrayOfCallSite[102].call(defaultObj, "debug", Boolean.valueOf(true));
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[103].call(this.configInfo))) {
        JSONObject moduleObj = (JSONObject)ScriptBytecodeAdapter.asType(arrayOfCallSite[104].call(configJsonObj.get(), "module"), JSONObject.class);
        JSONArray jsObjs = (JSONArray)ScriptBytecodeAdapter.asType(arrayOfCallSite[105].call(moduleObj, "js"), JSONArray.class);
        Object js;
        Iterator iterator;
        for (js = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[106].call(jsObjs), Iterator.class); iterator.hasNext(); ) {
          js = iterator.next();
          JSONObject jsObj = (JSONObject)ScriptBytecodeAdapter.asType(js, JSONObject.class);
          if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[107].call(jsObj, "window"), null))
            continue; 
          arrayOfCallSite[108].call(jsObj, "window", arrayOfCallSite[109].call(WindowOptions.class));
        } 
      } 
    } 
    arrayOfCallSite[110].call(configFile, arrayOfCallSite[111].callGetProperty(CommonConst.class), new _appendInfoIntoJson_closure2(this, this, configJsonObj));
  }
  
  public final class _appendInfoIntoJson_closure2 extends Closure implements GeneratedClosure {
    public _appendInfoIntoJson_closure2(Object _outerInstance, Object _thisObject, Reference configJsonObj) {
      super(_outerInstance, _thisObject);
      Reference reference = configJsonObj;
      this.configJsonObj = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(JsonOutput.class, arrayOfCallSite[2].call(this.configJsonObj.get())));
    }
    
    @Generated
    public JSONObject getConfigJsonObj() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (JSONObject)ScriptBytecodeAdapter.castToType(this.configJsonObj.get(), JSONObject.class);
    }
  }
  
  private void appendMultiFrameworkFromEntry(JSONObject configJsonObj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[112].callGetProperty(arrayOfCallSite[113].callGroovyObjectGetProperty(this.variantData)), arrayOfCallSite[114].callGetProperty(VariantModel.class)))
      return; 
    LegacyApkOptions legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[115].callGetProperty(arrayOfCallSite[116].callGetProperty(arrayOfCallSite[117].callGroovyObjectGetProperty(this))), LegacyApkOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[118].callGroovyObjectGetProperty(this.configInfo), arrayOfCallSite[119].callGetProperty(BuildConst.class))) {
      String entryName = ShortTypeHandling.castToString(arrayOfCallSite[120].call(arrayOfCallSite[121].call(ModuleExtensionData.class, arrayOfCallSite[122].callGroovyObjectGetProperty(this))));
      Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[123].call(arrayOfCallSite[124].callGetProperty(arrayOfCallSite[125].callGroovyObjectGetProperty(this)), entryName), Project.class);
      Object object = arrayOfCallSite[126].callGetProperty(arrayOfCallSite[127].callGetProperty(entryProject));
      legacyApkOptions = (LegacyApkOptions)ScriptBytecodeAdapter.castToType(object, LegacyApkOptions.class);
    } 
    JSONObject appObj = (JSONObject)ScriptBytecodeAdapter.asType(arrayOfCallSite[128].call(configJsonObj, "app"), JSONObject.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(legacyApkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[131].call(legacyApkOptions), "")))
        arrayOfCallSite[132].call(appObj, "multiFrameworkBundle", Boolean.valueOf(true)); 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(legacyApkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[129].call(legacyApkOptions), "")))
      arrayOfCallSite[130].call(appObj, "multiFrameworkBundle", Boolean.valueOf(true)); 
  }
  
  private RestoolCommandBuilder constructBuilder(String command, String configPath, File outputDir, Boolean isIncremental, String deviceType) {
    // Byte code:
    //   0: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    //   3: astore #6
    //   5: aload #6
    //   7: ldc_w 133
    //   10: aaload
    //   11: ldc_w com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   14: aload_1
    //   15: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   20: ldc_w com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   23: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   26: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   29: new groovy/lang/Reference
    //   32: dup_x1
    //   33: swap
    //   34: invokespecial <init> : (Ljava/lang/Object;)V
    //   37: astore #7
    //   39: aload #7
    //   41: pop
    //   42: aload #6
    //   44: ldc_w 134
    //   47: aaload
    //   48: aload #6
    //   50: ldc_w 135
    //   53: aaload
    //   54: ldc java/nio/file/Paths
    //   56: aload #6
    //   58: ldc_w 136
    //   61: aaload
    //   62: aload_0
    //   63: getfield pathInfo : Lcom/huawei/ohos/build/data/PathInfo;
    //   66: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: aload #6
    //   73: ldc_w 137
    //   76: aaload
    //   77: aload_0
    //   78: getfield variantData : Lcom/huawei/ohos/build/model/VariantData;
    //   81: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: aload #6
    //   88: ldc_w 138
    //   91: aaload
    //   92: ldc com/huawei/ohos/build/consts/BuildConst
    //   94: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   99: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   104: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   109: ldc java/io/File
    //   111: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   114: checkcast java/io/File
    //   117: astore #8
    //   119: aload #8
    //   121: pop
    //   122: aload #6
    //   124: ldc_w 139
    //   127: aaload
    //   128: aload #8
    //   130: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   135: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   138: ifeq -> 166
    //   141: aload #6
    //   143: ldc_w 140
    //   146: aaload
    //   147: aload #8
    //   149: new com/huawei/ohos/build/tasks/CompileResources$_constructBuilder_closure3
    //   152: dup
    //   153: aload_0
    //   154: aload_0
    //   155: aload #7
    //   157: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;)V
    //   160: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   165: pop
    //   166: aload #6
    //   168: ldc_w 141
    //   171: aaload
    //   172: ldc com/huawei/ohos/build/consts/BuildConst
    //   174: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   179: aload #6
    //   181: ldc_w 142
    //   184: aaload
    //   185: aload_0
    //   186: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   189: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   194: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   197: ifeq -> 238
    //   200: aload #6
    //   202: ldc_w 143
    //   205: aaload
    //   206: aload #7
    //   208: invokevirtual get : ()Ljava/lang/Object;
    //   211: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   214: aload #6
    //   216: ldc_w 144
    //   219: aaload
    //   220: aload_0
    //   221: getfield liteConfigPath : Ljava/io/File;
    //   224: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   229: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   234: pop
    //   235: goto -> 259
    //   238: aload #6
    //   240: ldc_w 145
    //   243: aaload
    //   244: aload #7
    //   246: invokevirtual get : ()Ljava/lang/Object;
    //   249: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   252: aload_2
    //   253: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   258: pop
    //   259: aload #6
    //   261: ldc_w 146
    //   264: aaload
    //   265: aload_0
    //   266: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   269: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   274: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   277: ifeq -> 318
    //   280: aload #6
    //   282: ldc_w 147
    //   285: aaload
    //   286: aload #7
    //   288: invokevirtual get : ()Ljava/lang/Object;
    //   291: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   294: aload #6
    //   296: ldc_w 148
    //   299: aaload
    //   300: aload_0
    //   301: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   304: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   309: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   314: pop
    //   315: goto -> 402
    //   318: aload #6
    //   320: ldc_w 149
    //   323: aaload
    //   324: aload_0
    //   325: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   328: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   333: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   336: ifne -> 360
    //   339: aload #6
    //   341: ldc_w 150
    //   344: aaload
    //   345: aload_0
    //   346: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   349: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   354: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   357: ifeq -> 364
    //   360: iconst_1
    //   361: goto -> 365
    //   364: iconst_0
    //   365: ifeq -> 402
    //   368: aload #6
    //   370: ldc_w 151
    //   373: aaload
    //   374: aload #7
    //   376: invokevirtual get : ()Ljava/lang/Object;
    //   379: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   382: aload #6
    //   384: ldc_w 152
    //   387: aaload
    //   388: ldc_w com/huawei/ohos/build/utils/ShellUtils
    //   391: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   396: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   401: pop
    //   402: aload #6
    //   404: ldc_w 153
    //   407: aaload
    //   408: ldc com/huawei/ohos/build/utils/FileUtils
    //   410: aload_0
    //   411: getfield mergeDir : Ljava/io/File;
    //   414: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   419: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   422: ifne -> 429
    //   425: iconst_1
    //   426: goto -> 430
    //   429: iconst_0
    //   430: ifeq -> 466
    //   433: aload #6
    //   435: ldc_w 154
    //   438: aaload
    //   439: getstatic com/huawei/ohos/build/tasks/CompileResources.hmLogger : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   442: ldc_w 'Unable to create or delete the %s folder. An incremental problem may occur.'
    //   445: aload #6
    //   447: ldc_w 155
    //   450: aaload
    //   451: aload_0
    //   452: getfield mergeDir : Ljava/io/File;
    //   455: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   460: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   465: pop
    //   466: aload #6
    //   468: ldc_w 156
    //   471: aaload
    //   472: aload #6
    //   474: ldc_w 157
    //   477: aaload
    //   478: aload #6
    //   480: ldc_w 158
    //   483: aaload
    //   484: aload #7
    //   486: invokevirtual get : ()Ljava/lang/Object;
    //   489: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   492: aload #6
    //   494: ldc_w 159
    //   497: aaload
    //   498: aload #6
    //   500: ldc_w 160
    //   503: aaload
    //   504: aload_3
    //   505: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   510: aload #6
    //   512: ldc_w 161
    //   515: aaload
    //   516: ldc java/io/File
    //   518: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   523: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   528: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   533: aload #6
    //   535: ldc_w 162
    //   538: aaload
    //   539: aload #6
    //   541: ldc_w 163
    //   544: aaload
    //   545: aload #6
    //   547: ldc_w 164
    //   550: aaload
    //   551: aload_0
    //   552: getfield genRPath : Ljava/io/File;
    //   555: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   560: aload #6
    //   562: ldc_w 165
    //   565: aaload
    //   566: ldc java/io/File
    //   568: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   573: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   578: aload #6
    //   580: ldc_w 166
    //   583: aaload
    //   584: ldc com/huawei/ohos/build/consts/BuildConst
    //   586: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   591: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   596: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   601: aload #6
    //   603: ldc_w 167
    //   606: aaload
    //   607: aload #6
    //   609: ldc_w 168
    //   612: aaload
    //   613: aload_0
    //   614: getfield mergeDir : Ljava/io/File;
    //   617: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   622: aload #6
    //   624: ldc_w 169
    //   627: aaload
    //   628: ldc java/io/File
    //   630: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   635: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   640: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   645: pop
    //   646: aload #6
    //   648: ldc_w 170
    //   651: aaload
    //   652: aload #6
    //   654: ldc_w 171
    //   657: aaload
    //   658: aload #6
    //   660: ldc_w 172
    //   663: aaload
    //   664: aload_0
    //   665: getfield buildType : Lcom/huawei/ohos/build/model/BuildType;
    //   668: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   673: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   678: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   683: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   686: istore #9
    //   688: iload #9
    //   690: pop
    //   691: iload #9
    //   693: ifne -> 758
    //   696: aload #6
    //   698: ldc_w 173
    //   701: aaload
    //   702: aload #6
    //   704: ldc_w 174
    //   707: aaload
    //   708: aload #6
    //   710: ldc_w 175
    //   713: aaload
    //   714: aload #6
    //   716: ldc_w 176
    //   719: aaload
    //   720: aload #6
    //   722: ldc_w 177
    //   725: aaload
    //   726: aload_0
    //   727: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   732: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   737: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   742: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   747: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   752: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   755: ifeq -> 762
    //   758: iconst_1
    //   759: goto -> 763
    //   762: iconst_0
    //   763: ifeq -> 1907
    //   766: invokestatic isOrigZ : ()Z
    //   769: ifeq -> 787
    //   772: getstatic com/huawei/ohos/build/tasks/CompileResources.__$stMC : Z
    //   775: ifne -> 787
    //   778: invokestatic disabledStandardMetaClass : ()Z
    //   781: ifne -> 787
    //   784: goto -> 871
    //   787: aload #5
    //   789: aload #6
    //   791: ldc_w 178
    //   794: aaload
    //   795: ldc com/huawei/ohos/build/consts/BuildConst
    //   797: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   802: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   805: ifeq -> 841
    //   808: aload #6
    //   810: ldc_w 179
    //   813: aaload
    //   814: aload_0
    //   815: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   818: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   823: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   826: ifne -> 833
    //   829: iconst_1
    //   830: goto -> 834
    //   833: iconst_0
    //   834: ifeq -> 841
    //   837: iconst_1
    //   838: goto -> 842
    //   841: iconst_0
    //   842: ifeq -> 868
    //   845: aload #6
    //   847: ldc_w 180
    //   850: aaload
    //   851: aload #7
    //   853: invokevirtual get : ()Ljava/lang/Object;
    //   856: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   859: ldc_w '1'
    //   862: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   867: pop
    //   868: goto -> 952
    //   871: aload #5
    //   873: aload #6
    //   875: ldc_w 181
    //   878: aaload
    //   879: ldc com/huawei/ohos/build/consts/BuildConst
    //   881: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   886: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   889: ifeq -> 925
    //   892: aload #6
    //   894: ldc_w 182
    //   897: aaload
    //   898: aload_0
    //   899: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   902: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   907: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   910: ifne -> 917
    //   913: iconst_1
    //   914: goto -> 918
    //   917: iconst_0
    //   918: ifeq -> 925
    //   921: iconst_1
    //   922: goto -> 926
    //   925: iconst_0
    //   926: ifeq -> 952
    //   929: aload #6
    //   931: ldc_w 183
    //   934: aaload
    //   935: aload #7
    //   937: invokevirtual get : ()Ljava/lang/Object;
    //   940: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   943: ldc_w '1'
    //   946: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   951: pop
    //   952: aload #5
    //   954: aload #6
    //   956: ldc_w 184
    //   959: aaload
    //   960: ldc com/huawei/ohos/build/consts/BuildConst
    //   962: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   967: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   970: ifeq -> 996
    //   973: aload #6
    //   975: ldc_w 185
    //   978: aaload
    //   979: aload #7
    //   981: invokevirtual get : ()Ljava/lang/Object;
    //   984: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   987: ldc_w '3'
    //   990: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   995: pop
    //   996: aload #5
    //   998: aload #6
    //   1000: ldc_w 186
    //   1003: aaload
    //   1004: ldc com/huawei/ohos/build/consts/BuildConst
    //   1006: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1011: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1014: ifeq -> 1042
    //   1017: aload #6
    //   1019: ldc_w 187
    //   1022: aaload
    //   1023: aload_0
    //   1024: getfield configInfo : Lcom/huawei/ohos/build/data/ConfigInfo;
    //   1027: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1035: ifeq -> 1042
    //   1038: iconst_1
    //   1039: goto -> 1043
    //   1042: iconst_0
    //   1043: ifeq -> 1069
    //   1046: aload #6
    //   1048: ldc_w 188
    //   1051: aaload
    //   1052: aload #7
    //   1054: invokevirtual get : ()Ljava/lang/Object;
    //   1057: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1060: ldc_w '3'
    //   1063: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1068: pop
    //   1069: aload #6
    //   1071: ldc_w 189
    //   1074: aaload
    //   1075: aload #6
    //   1077: ldc_w 190
    //   1080: aaload
    //   1081: aload #6
    //   1083: ldc_w 191
    //   1086: aaload
    //   1087: aload_0
    //   1088: getfield buildType : Lcom/huawei/ohos/build/model/BuildType;
    //   1091: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1096: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1101: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1106: astore #10
    //   1108: aload #10
    //   1110: pop
    //   1111: aload #6
    //   1113: ldc_w 192
    //   1116: aaload
    //   1117: aload #6
    //   1119: ldc_w 193
    //   1122: aaload
    //   1123: aload #6
    //   1125: ldc_w 194
    //   1128: aaload
    //   1129: aload #6
    //   1131: ldc_w 195
    //   1134: aaload
    //   1135: aload #6
    //   1137: ldc_w 196
    //   1140: aaload
    //   1141: aload_0
    //   1142: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1147: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1152: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1157: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1162: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1167: astore #11
    //   1169: aload #11
    //   1171: pop
    //   1172: aload #6
    //   1174: ldc_w 197
    //   1177: aaload
    //   1178: aload #7
    //   1180: invokevirtual get : ()Ljava/lang/Object;
    //   1183: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1186: iload #9
    //   1188: ifne -> 1195
    //   1191: iconst_1
    //   1192: goto -> 1196
    //   1195: iconst_0
    //   1196: ifeq -> 1204
    //   1199: aload #11
    //   1201: goto -> 1206
    //   1204: aload #10
    //   1206: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1211: pop
    //   1212: aload #6
    //   1214: ldc_w 198
    //   1217: aaload
    //   1218: aload #6
    //   1220: ldc_w 199
    //   1223: aaload
    //   1224: aload #6
    //   1226: ldc_w 200
    //   1229: aaload
    //   1230: aload_0
    //   1231: getfield buildType : Lcom/huawei/ohos/build/model/BuildType;
    //   1234: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1239: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1244: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1249: astore #12
    //   1251: aload #12
    //   1253: pop
    //   1254: aload #6
    //   1256: ldc_w 201
    //   1259: aaload
    //   1260: aload #6
    //   1262: ldc_w 202
    //   1265: aaload
    //   1266: aload #6
    //   1268: ldc_w 203
    //   1271: aaload
    //   1272: aload #6
    //   1274: ldc_w 204
    //   1277: aaload
    //   1278: aload #6
    //   1280: ldc_w 205
    //   1283: aaload
    //   1284: aload_0
    //   1285: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1290: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1295: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1300: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1305: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1310: astore #13
    //   1312: aload #13
    //   1314: pop
    //   1315: aload #6
    //   1317: ldc_w 206
    //   1320: aaload
    //   1321: aload #7
    //   1323: invokevirtual get : ()Ljava/lang/Object;
    //   1326: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1329: iload #9
    //   1331: ifne -> 1338
    //   1334: iconst_1
    //   1335: goto -> 1339
    //   1338: iconst_0
    //   1339: ifeq -> 1347
    //   1342: aload #13
    //   1344: goto -> 1349
    //   1347: aload #12
    //   1349: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1354: pop
    //   1355: aload #6
    //   1357: ldc_w 207
    //   1360: aaload
    //   1361: aload #6
    //   1363: ldc_w 208
    //   1366: aaload
    //   1367: aload #6
    //   1369: ldc_w 209
    //   1372: aaload
    //   1373: aload_0
    //   1374: getfield buildType : Lcom/huawei/ohos/build/model/BuildType;
    //   1377: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1382: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1387: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1392: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1395: checkcast java/lang/String
    //   1398: astore #14
    //   1400: aload #14
    //   1402: pop
    //   1403: aload #6
    //   1405: ldc_w 210
    //   1408: aaload
    //   1409: aload #6
    //   1411: ldc_w 211
    //   1414: aaload
    //   1415: aload #6
    //   1417: ldc_w 212
    //   1420: aaload
    //   1421: aload #6
    //   1423: ldc_w 213
    //   1426: aaload
    //   1427: aload #6
    //   1429: ldc_w 214
    //   1432: aaload
    //   1433: aload_0
    //   1434: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1439: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1444: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1449: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1454: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1459: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1462: checkcast java/lang/String
    //   1465: astore #15
    //   1467: aload #15
    //   1469: pop
    //   1470: invokestatic isOrigZ : ()Z
    //   1473: ifeq -> 1491
    //   1476: getstatic com/huawei/ohos/build/tasks/CompileResources.__$stMC : Z
    //   1479: ifne -> 1491
    //   1482: invokestatic disabledStandardMetaClass : ()Z
    //   1485: ifne -> 1491
    //   1488: goto -> 1598
    //   1491: iload #9
    //   1493: ifeq -> 1511
    //   1496: aload #14
    //   1498: ldc_w ''
    //   1501: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1504: ifeq -> 1511
    //   1507: iconst_1
    //   1508: goto -> 1512
    //   1511: iconst_0
    //   1512: ifne -> 1547
    //   1515: iload #9
    //   1517: ifne -> 1524
    //   1520: iconst_1
    //   1521: goto -> 1525
    //   1524: iconst_0
    //   1525: ifeq -> 1543
    //   1528: aload #15
    //   1530: ldc_w ''
    //   1533: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1536: ifeq -> 1543
    //   1539: iconst_1
    //   1540: goto -> 1544
    //   1543: iconst_0
    //   1544: ifeq -> 1551
    //   1547: iconst_1
    //   1548: goto -> 1552
    //   1551: iconst_0
    //   1552: ifeq -> 1595
    //   1555: aload #6
    //   1557: ldc_w 215
    //   1560: aaload
    //   1561: aload #7
    //   1563: invokevirtual get : ()Ljava/lang/Object;
    //   1566: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1569: iload #9
    //   1571: ifne -> 1578
    //   1574: iconst_1
    //   1575: goto -> 1579
    //   1578: iconst_0
    //   1579: ifeq -> 1587
    //   1582: aload #15
    //   1584: goto -> 1589
    //   1587: aload #14
    //   1589: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1594: pop
    //   1595: goto -> 1702
    //   1598: iload #9
    //   1600: ifeq -> 1618
    //   1603: aload #14
    //   1605: ldc_w ''
    //   1608: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1611: ifeq -> 1618
    //   1614: iconst_1
    //   1615: goto -> 1619
    //   1618: iconst_0
    //   1619: ifne -> 1654
    //   1622: iload #9
    //   1624: ifne -> 1631
    //   1627: iconst_1
    //   1628: goto -> 1632
    //   1631: iconst_0
    //   1632: ifeq -> 1650
    //   1635: aload #15
    //   1637: ldc_w ''
    //   1640: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1643: ifeq -> 1650
    //   1646: iconst_1
    //   1647: goto -> 1651
    //   1650: iconst_0
    //   1651: ifeq -> 1658
    //   1654: iconst_1
    //   1655: goto -> 1659
    //   1658: iconst_0
    //   1659: ifeq -> 1702
    //   1662: aload #6
    //   1664: ldc_w 216
    //   1667: aaload
    //   1668: aload #7
    //   1670: invokevirtual get : ()Ljava/lang/Object;
    //   1673: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1676: iload #9
    //   1678: ifne -> 1685
    //   1681: iconst_1
    //   1682: goto -> 1686
    //   1685: iconst_0
    //   1686: ifeq -> 1694
    //   1689: aload #15
    //   1691: goto -> 1696
    //   1694: aload #14
    //   1696: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1701: pop
    //   1702: aload #6
    //   1704: ldc_w 217
    //   1707: aaload
    //   1708: aload #6
    //   1710: ldc_w 218
    //   1713: aaload
    //   1714: aload #6
    //   1716: ldc_w 219
    //   1719: aaload
    //   1720: aload_0
    //   1721: getfield buildType : Lcom/huawei/ohos/build/model/BuildType;
    //   1724: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1729: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1734: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1739: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1742: checkcast java/lang/String
    //   1745: astore #16
    //   1747: aload #16
    //   1749: pop
    //   1750: aload #6
    //   1752: ldc_w 220
    //   1755: aaload
    //   1756: aload #6
    //   1758: ldc_w 221
    //   1761: aaload
    //   1762: aload #6
    //   1764: ldc_w 222
    //   1767: aaload
    //   1768: aload #6
    //   1770: ldc_w 223
    //   1773: aaload
    //   1774: aload #6
    //   1776: ldc_w 224
    //   1779: aaload
    //   1780: aload_0
    //   1781: invokeinterface callGroovyObjectGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1786: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1791: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1796: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1801: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1806: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1809: checkcast java/lang/String
    //   1812: astore #17
    //   1814: aload #17
    //   1816: pop
    //   1817: aload #6
    //   1819: ldc_w 225
    //   1822: aaload
    //   1823: aload #7
    //   1825: invokevirtual get : ()Ljava/lang/Object;
    //   1828: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1831: iload #9
    //   1833: ifne -> 1840
    //   1836: iconst_1
    //   1837: goto -> 1841
    //   1840: iconst_0
    //   1841: ifeq -> 1874
    //   1844: aload #6
    //   1846: ldc_w 226
    //   1849: aaload
    //   1850: ldc_w com/huawei/deveco/common/security/util/ByteUtil
    //   1853: aload #6
    //   1855: ldc_w 227
    //   1858: aaload
    //   1859: aload #17
    //   1861: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1866: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1871: goto -> 1901
    //   1874: aload #6
    //   1876: ldc_w 228
    //   1879: aaload
    //   1880: ldc_w com/huawei/deveco/common/security/util/ByteUtil
    //   1883: aload #6
    //   1885: ldc_w 229
    //   1888: aaload
    //   1889: aload #16
    //   1891: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1896: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1901: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1906: pop
    //   1907: aload #6
    //   1909: ldc_w 230
    //   1912: aaload
    //   1913: aload #7
    //   1915: invokevirtual get : ()Ljava/lang/Object;
    //   1918: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1921: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1926: pop
    //   1927: aload #6
    //   1929: ldc_w 231
    //   1932: aaload
    //   1933: aload #7
    //   1935: invokevirtual get : ()Ljava/lang/Object;
    //   1938: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1941: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1946: pop
    //   1947: getstatic com/huawei/ohos/build/tasks/CompileResources.__$stMC : Z
    //   1950: ifne -> 1962
    //   1953: invokestatic disabledStandardMetaClass : ()Z
    //   1956: ifne -> 1962
    //   1959: goto -> 1997
    //   1962: aload #6
    //   1964: ldc_w 232
    //   1967: aaload
    //   1968: aload #7
    //   1970: invokevirtual get : ()Ljava/lang/Object;
    //   1973: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   1976: aload #6
    //   1978: ldc_w 233
    //   1981: aaload
    //   1982: aload_0
    //   1983: invokeinterface callCurrent : (Lgroovy/lang/GroovyObject;)Ljava/lang/Object;
    //   1988: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1993: pop
    //   1994: goto -> 2022
    //   1997: aload #6
    //   1999: ldc_w 234
    //   2002: aaload
    //   2003: aload #7
    //   2005: invokevirtual get : ()Ljava/lang/Object;
    //   2008: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   2011: aload #0
    //   2013: invokespecial getResourceModules : ()Ljava/lang/String;
    //   2016: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2021: pop
    //   2022: aload #7
    //   2024: invokevirtual get : ()Ljava/lang/Object;
    //   2027: checkcast com/huawei/ohos/build/utils/command/RestoolCommandBuilder
    //   2030: areturn
    //   2031: nop
    //   2032: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #274	-> 5
    //   #276	-> 42
    //   #279	-> 122
    //   #280	-> 141
    //   #285	-> 166
    //   #287	-> 166
    //   #288	-> 200
    //   #289	-> 235
    //   #290	-> 238
    //   #291	-> 259
    //   #293	-> 259
    //   #294	-> 280
    //   #295	-> 315
    //   #295	-> 318
    //   #297	-> 368
    //   #298	-> 402
    //   #300	-> 402
    //   #301	-> 433
    //   #302	-> 466
    //   #303	-> 466
    //   #304	-> 533
    //   #305	-> 601
    //   #307	-> 646
    //   #308	-> 691
    //   #309	-> 766
    //   #310	-> 845
    //   #311	-> 868
    //   #309	-> 871
    //   #310	-> 929
    //   #311	-> 952
    //   #312	-> 952
    //   #313	-> 973
    //   #314	-> 996
    //   #315	-> 996
    //   #316	-> 1046
    //   #317	-> 1069
    //   #318	-> 1069
    //   #319	-> 1111
    //   #320	-> 1172
    //   #322	-> 1212
    //   #323	-> 1254
    //   #324	-> 1315
    //   #326	-> 1355
    //   #327	-> 1403
    //   #328	-> 1470
    //   #329	-> 1555
    //   #330	-> 1595
    //   #328	-> 1598
    //   #329	-> 1662
    //   #330	-> 1702
    //   #331	-> 1702
    //   #332	-> 1750
    //   #333	-> 1817
    //   #334	-> 1844
    //   #335	-> 1874
    //   #336	-> 1907
    //   #338	-> 1907
    //   #340	-> 1927
    //   #341	-> 1947
    //   #341	-> 1997
    //   #342	-> 2022
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2031	0	this	Lcom/huawei/ohos/build/tasks/CompileResources;
    //   0	2031	1	command	Ljava/lang/String;
    //   0	2031	2	configPath	Ljava/lang/String;
    //   0	2031	3	outputDir	Ljava/io/File;
    //   0	2031	4	isIncremental	Ljava/lang/Boolean;
    //   0	2031	5	deviceType	Ljava/lang/String;
    //   39	1992	7	builder	Lgroovy/lang/Reference;
    //   119	1912	8	mergeResFile	Ljava/io/File;
    //   688	1343	9	buildTypeEnabled	Z
    //   1108	799	10	pseudoAccentBuild	Ljava/lang/Object;
    //   1169	738	11	pseudoAccent	Ljava/lang/Object;
    //   1251	656	12	pseudoBorderBuild	Ljava/lang/Object;
    //   1312	595	13	pseudoBorder	Ljava/lang/Object;
    //   1400	507	14	pseudoRatioBuild	Ljava/lang/String;
    //   1467	440	15	pseudoRatio	Ljava/lang/String;
    //   1747	160	16	pseudoCharsBuild	Ljava/lang/String;
    //   1814	93	17	pseudoChars	Ljava/lang/String;
  }
  
  public final class _constructBuilder_closure3 extends Closure implements GeneratedClosure {
    public _constructBuilder_closure3(Object _outerInstance, Object _thisObject, Reference builder) {
      super(_outerInstance, _thisObject);
      Reference reference = builder;
      this.builder = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(it, "\"")) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(it, "\""))))
        return arrayOfCallSite[2].call(this.builder.get(), arrayOfCallSite[3].call(it, Integer.valueOf(1), arrayOfCallSite[4].call(arrayOfCallSite[5].call(it), Integer.valueOf(1)))); 
      return null;
    }
    
    @Generated
    public RestoolCommandBuilder getBuilder() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (RestoolCommandBuilder)ScriptBytecodeAdapter.castToType(this.builder.get(), RestoolCommandBuilder.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private String getResourceModules() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference modules = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[235].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[236].call(arrayOfCallSite[237].call(arrayOfCallSite[238].call(arrayOfCallSite[239].callGroovyObjectGetProperty(this))), new _getResourceModules_closure4(this, this, modules));
    return ShortTypeHandling.castToString(arrayOfCallSite[240].call(modules.get(), ","));
  }
  
  @Generated
  public File getGenRPath() {
    return this.genRPath;
  }
  
  @Generated
  public void setGenRPath(File paramFile) {
    this.genRPath = paramFile;
  }
  
  @Generated
  public Path getLiteOutputDirForWatchOnly() {
    return this.liteOutputDirForWatchOnly;
  }
  
  @Generated
  public void setLiteOutputDirForWatchOnly(Path paramPath) {
    this.liteOutputDirForWatchOnly = paramPath;
  }
  
  @Generated
  public Path getRichOutputDirForWatchOnly() {
    return this.richOutputDirForWatchOnly;
  }
  
  @Generated
  public void setRichOutputDirForWatchOnly(Path paramPath) {
    this.richOutputDirForWatchOnly = paramPath;
  }
  
  @Generated
  public File getLiteConfigPath() {
    return this.liteConfigPath;
  }
  
  @Generated
  public void setLiteConfigPath(File paramFile) {
    this.liteConfigPath = paramFile;
  }
  
  @Generated
  public PseudoLocalization getBuildTypePseudoLocalization() {
    return this.buildTypePseudoLocalization;
  }
  
  @Generated
  public void setBuildTypePseudoLocalization(PseudoLocalization paramPseudoLocalization) {
    this.buildTypePseudoLocalization = paramPseudoLocalization;
  }
  
  @Generated
  public PseudoLocalization getDefaultPseudoLocalization() {
    return this.defaultPseudoLocalization;
  }
  
  @Generated
  public void setDefaultPseudoLocalization(PseudoLocalization paramPseudoLocalization) {
    this.defaultPseudoLocalization = paramPseudoLocalization;
  }
  
  @Generated
  public File getMergeDir() {
    return this.mergeDir;
  }
  
  @Generated
  public void setMergeDir(File paramFile) {
    this.mergeDir = paramFile;
  }
  
  public final class _getResourceModules_closure4 extends Closure implements GeneratedClosure {
    public _getResourceModules_closure4(Object _outerInstance, Object _thisObject, Reference modules) {
      super(_outerInstance, _thisObject);
      Reference reference = modules;
      this.modules = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), HarmonyHapPluginMain.class)) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(it), HarmonyLibraryPluginMain.class))))
        return arrayOfCallSite[4].call(this.modules.get(), arrayOfCallSite[5].callGetProperty(it)); 
      return null;
    }
    
    @Generated
    public List getModules() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.modules.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
