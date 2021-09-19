package com.huawei.ohos.build.tasks.test;

import com.huawei.ohos.build.HarmonyHapPluginMain;
import com.huawei.ohos.build.HarmonyLibraryPluginMain;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.DeviceConfigOptions;
import com.huawei.ohos.build.shell.js.WindowOptions;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.JsonUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.ShellUtils;
import com.huawei.ohos.build.utils.command.RestoolCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.json.JsonOutput;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class CompileTestResources extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  @NonNull
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
  
  @OutputDirectory
  private Path mergePath;
  
  @InputFiles
  private FileCollection resDirs;
  
  static {
    Object object = $getCallSiteArray()[150].call(HMLogger.class, CompileTestResources.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputFile
  @Optional
  public Path getRichConfigPathForWatchOnly() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[23].callGetProperty(this.variantData), arrayOfCallSite[24].callGetProperty(BuildConst.class)))
      return (Path)ScriptBytecodeAdapter.castToType(null, Path.class); 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[25].callGetProperty(BuildConst.class), arrayOfCallSite[26].callGroovyObjectGetProperty(this.configInfo)))
      return (Path)ScriptBytecodeAdapter.castToType(null, Path.class); 
    return (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(Paths.class, arrayOfCallSite[28].call(this.pathInfo), arrayOfCallSite[29].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[30].callGetProperty(CommonConst.class)), Path.class);
  }
  
  @InputFiles
  public FileCollection getMergeResFileCollection() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File mergeResFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(arrayOfCallSite[32].call(Paths.class, arrayOfCallSite[33].call(this.pathInfo), arrayOfCallSite[34].callGetProperty(this.buildType), arrayOfCallSite[35].callGetProperty(BuildConst.class))), File.class);
    Reference mergeResFileCollection = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this)), FileCollection.class));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[38].call(mergeResFile)))
      arrayOfCallSite[39].call(mergeResFile, new _getMergeResFileCollection_closure2(this, this, mergeResFileCollection)); 
    return (FileCollection)mergeResFileCollection.get();
  }
  
  public final class _getMergeResFileCollection_closure2 extends Closure implements GeneratedClosure {
    public _getMergeResFileCollection_closure2(Object _outerInstance, Object _thisObject, Reference mergeResFileCollection) {
      super(_outerInstance, _thisObject);
      Reference reference = mergeResFileCollection;
      this.mergeResFileCollection = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(File.class, arrayOfCallSite[1].call(it, Integer.valueOf(1), arrayOfCallSite[2].call(arrayOfCallSite[3].call(it), Integer.valueOf(1)))), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file))) {
        File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].callGetProperty(file), arrayOfCallSite[8].callGetProperty(CommonConst.class))), File.class);
        Object object = arrayOfCallSite[9].call(this.mergeResFileCollection.get(), arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), configFile));
        this.mergeResFileCollection.set(ScriptBytecodeAdapter.castToType(object, FileCollection.class));
        return object;
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
  public CompileTestResources(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData, new _closure1(this, this));
    this.resDirs = (FileCollection)ScriptBytecodeAdapter.castToType(object1, FileCollection.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object5, BuildType.class);
    Object object6 = arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo), arrayOfCallSite[7].callGroovyObjectGetProperty(variantData), arrayOfCallSite[8].callGetProperty(BuildConst.class));
    this.liteOutputDirForWatchOnly = (Path)ScriptBytecodeAdapter.castToType(object6, Path.class);
    Object object7 = arrayOfCallSite[9].call(Paths.class, arrayOfCallSite[10].call(this.pathInfo), arrayOfCallSite[11].callGroovyObjectGetProperty(variantData), arrayOfCallSite[12].callGetProperty(BuildConst.class));
    this.richOutputDirForWatchOnly = (Path)ScriptBytecodeAdapter.castToType(object7, Path.class);
    Object object8 = arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this), arrayOfCallSite[15].call(this.pathInfo));
    this.genRPath = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), arrayOfCallSite[18].call(this.pathInfo));
    this.liteConfigPath = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[19].call(Paths.class, arrayOfCallSite[20].call(this.pathInfo), arrayOfCallSite[21].callGroovyObjectGetProperty(variantData), arrayOfCallSite[22].callGetProperty(PathConst.class));
    this.mergePath = (Path)ScriptBytecodeAdapter.castToType(object10, Path.class);
  }
  
  public final class _closure1 extends Closure implements GeneratedClosure {
    public _closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callGetProperty(it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(this.configInfo)))
      arrayOfCallSite[41].callCurrent(this, arrayOfCallSite[42].callGetProperty(BuildConst.class)); 
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[43].call(this.configInfo)) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[44].call(this.configInfo)))))
      arrayOfCallSite[45].callCurrent(this, arrayOfCallSite[46].callGetProperty(BuildConst.class)); 
  }
  
  public void compileResources(String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String restool = ShortTypeHandling.castToString(arrayOfCallSite[47].call(this.sdkInfo));
    String configPath = ShortTypeHandling.castToString(arrayOfCallSite[48].call(this.pathInfo));
    if (ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[49].callGetProperty(BuildConst.class))) {
      Object object = arrayOfCallSite[50].call(arrayOfCallSite[51].call(Paths.class, arrayOfCallSite[52].call(this.pathInfo), arrayOfCallSite[53].callGetProperty(this.buildType), arrayOfCallSite[54].callGetProperty(CommonConst.class)));
      configPath = ShortTypeHandling.castToString(object);
    } 
    File outputDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].call(arrayOfCallSite[56].call(Paths.class, arrayOfCallSite[57].call(this.pathInfo), arrayOfCallSite[58].callGroovyObjectGetProperty(this.variantData), deviceType)), File.class);
    RestoolCommandBuilder incremental = (RestoolCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].callCurrent(this, restool, configPath, outputDir, Boolean.valueOf(true)), RestoolCommandBuilder.class);
    arrayOfCallSite[60].call(hmLogger, "restool", arrayOfCallSite[61].call(incremental));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].callConstructor(ProcessUtils.class, arrayOfCallSite[63].callGroovyObjectGetProperty(this), Boolean.valueOf(true)), ProcessUtils.class);
    arrayOfCallSite[64].call(processUtils, arrayOfCallSite[65].call(incremental), hmLogger);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[66].call(processUtils), arrayOfCallSite[67].callGetProperty(ProcessUtils.class))) {
      RestoolCommandBuilder full = (RestoolCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].callCurrent(this, restool, configPath, outputDir, Boolean.valueOf(false)), RestoolCommandBuilder.class);
      arrayOfCallSite[69].call(arrayOfCallSite[70].callConstructor(ProcessUtils.class, arrayOfCallSite[71].callGroovyObjectGetProperty(this)), arrayOfCallSite[72].call(full), hmLogger);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[73].call(this.configInfo))) {
      File inputFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[74].callConstructor(File.class, arrayOfCallSite[75].call(this.pathInfo)), File.class);
      File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[76].call(arrayOfCallSite[77].call(Paths.class, arrayOfCallSite[78].call(outputDir), arrayOfCallSite[79].callGetProperty(CommonConst.class))), File.class);
      Reference configOptions = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].call(JsonUtils.class, inputFile, ConfigOptions.class), ConfigOptions.class));
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[81].call(this.configInfo)) && ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[82].callGetProperty(BuildConst.class))))
        arrayOfCallSite[83].call(ShellUtils.class, arrayOfCallSite[84].callGroovyObjectGetProperty(configOptions.get())); 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[85].callGetProperty(arrayOfCallSite[86].callGroovyObjectGetProperty(this.variantData)))) {
        Map deviceConfig = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[87].callGroovyObjectGetProperty(configOptions.get()), Map.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[88].call(deviceConfig, "default"), null))
          arrayOfCallSite[89].call(deviceConfig, "default", arrayOfCallSite[90].callConstructor(DeviceConfigOptions.class)); 
        DeviceConfigOptions defaultConfig = (DeviceConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].call(deviceConfig, "default"), DeviceConfigOptions.class);
        arrayOfCallSite[92].call(defaultConfig, Boolean.valueOf(true));
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[93].call(this.configInfo)))
        arrayOfCallSite[94].call(arrayOfCallSite[95].call(arrayOfCallSite[96].call(configOptions.get())), new _compileResources_closure3(this, this)); 
      arrayOfCallSite[97].call(configFile, arrayOfCallSite[98].callGetProperty(CommonConst.class), new _compileResources_closure4(this, this, configOptions));
    } 
  }
  
  public final class _compileResources_closure3 extends Closure implements GeneratedClosure {
    public _compileResources_closure3(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGetProperty(it), null))
        return arrayOfCallSite[1].call(it, arrayOfCallSite[2].call(WindowOptions.class)); 
      return null;
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _compileResources_closure4 extends Closure implements GeneratedClosure {
    public _compileResources_closure4(Object _outerInstance, Object _thisObject, Reference configOptions) {
      super(_outerInstance, _thisObject);
      Reference reference = configOptions;
      this.configOptions = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(JsonOutput.class, arrayOfCallSite[2].call(JsonUtils.class, this.configOptions.get())));
    }
    
    @Generated
    public ConfigOptions getConfigOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ConfigOptions)ScriptBytecodeAdapter.castToType(this.configOptions.get(), ConfigOptions.class);
    }
  }
  
  private RestoolCommandBuilder constructBuilder(String command, String configPath, File outputDir, Boolean isIncremental) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference builder = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[99].callConstructor(RestoolCommandBuilder.class, command), RestoolCommandBuilder.class));
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[100].callGetProperty(BuildConst.class), arrayOfCallSite[101].callGroovyObjectGetProperty(this.configInfo))) {
      Object f;
      Iterator iterator;
      for (f = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[102].call(arrayOfCallSite[103].call(this.resDirs)), Iterator.class); iterator.hasNext(); ) {
        f = iterator.next();
        arrayOfCallSite[104].call(builder.get(), arrayOfCallSite[105].call(f));
      } 
    } else {
      arrayOfCallSite[106].call(arrayOfCallSite[107].callGroovyObjectGetProperty(this), new _constructBuilder_closure5(this, this, builder));
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[108].callGetProperty(BuildConst.class), arrayOfCallSite[109].callGroovyObjectGetProperty(this.configInfo))) {
      arrayOfCallSite[110].call(builder.get(), arrayOfCallSite[111].call(this.liteConfigPath));
    } else {
      arrayOfCallSite[112].call(builder.get(), configPath);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[113].call(this.configInfo))) {
      arrayOfCallSite[114].call(builder.get(), arrayOfCallSite[115].call(this.configInfo));
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[116].call(this.configInfo))) {
      arrayOfCallSite[117].call(builder.get(), arrayOfCallSite[118].callGetProperty(ShellUtils.class));
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[119].call(FileUtils.class, arrayOfCallSite[120].call(this.mergePath))))
      arrayOfCallSite[121].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[122].callGetProperty(arrayOfCallSite[123].call(this.mergePath))); 
    arrayOfCallSite[124]
      
      .call(arrayOfCallSite[125].call(arrayOfCallSite[126].call(builder.get(), arrayOfCallSite[127].call(arrayOfCallSite[128].call(outputDir), arrayOfCallSite[129].callGetProperty(File.class))), arrayOfCallSite[130].call(arrayOfCallSite[131].call(arrayOfCallSite[132].call(this.genRPath), arrayOfCallSite[133].callGetProperty(File.class)), arrayOfCallSite[134].callGetProperty(BuildConst.class))), arrayOfCallSite[135].call(arrayOfCallSite[136].call(arrayOfCallSite[137].call(this.mergePath)), arrayOfCallSite[138].callGetProperty(File.class)));
    arrayOfCallSite[139].call(builder.get());
    arrayOfCallSite[140].call(builder.get());
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[143].call(builder.get(), getResourceModules());
      return (RestoolCommandBuilder)builder.get();
    } 
    arrayOfCallSite[141].call(builder.get(), arrayOfCallSite[142].callCurrent(this));
    return (RestoolCommandBuilder)builder.get();
  }
  
  public final class _constructBuilder_closure5 extends Closure implements GeneratedClosure {
    public _constructBuilder_closure5(Object _outerInstance, Object _thisObject, Reference builder) {
      super(_outerInstance, _thisObject);
      Reference reference = builder;
      this.builder = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      String configDir = ShortTypeHandling.castToString(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), Integer.valueOf(0), arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(it)), arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(CommonConst.class)))));
      return arrayOfCallSite[7].call(this.builder.get(), configDir);
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
    Reference modules = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[144].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[145].call(arrayOfCallSite[146].call(arrayOfCallSite[147].call(arrayOfCallSite[148].callGroovyObjectGetProperty(this))), new _getResourceModules_closure6(this, this, modules));
    return ShortTypeHandling.castToString(arrayOfCallSite[149].call(modules.get(), ","));
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
  public Path getMergePath() {
    return this.mergePath;
  }
  
  @Generated
  public void setMergePath(Path paramPath) {
    this.mergePath = paramPath;
  }
  
  @Generated
  public FileCollection getResDirs() {
    return this.resDirs;
  }
  
  @Generated
  public void setResDirs(FileCollection paramFileCollection) {
    this.resDirs = paramFileCollection;
  }
  
  public final class _getResourceModules_closure6 extends Closure implements GeneratedClosure {
    public _getResourceModules_closure6(Object _outerInstance, Object _thisObject, Reference modules) {
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
