package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.HarmonyHapPluginMain;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.FormsOptions;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.gradle.api.Task;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class PackageApp extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private VariantData variantData;
  
  private BuildType buildType;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private ConfigInfo configInfo;
  
  private File packInfoFile;
  
  static {
    Object object = $getCallSiteArray()[278].call(HMLogger.class, PackageApp.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @OutputDirectory
  public File getOutputDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(arrayOfCallSite[12].call(Paths.class, arrayOfCallSite[13].call(this.pathInfo), arrayOfCallSite[14].callGroovyObjectGetProperty(this.variantData))), File.class);
  }
  
  @InputFiles
  public FileCollection getHapPathFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference inputFiles = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this)), FileCollection.class));
    Task task = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].call(arrayOfCallSite[18].callGetProperty(arrayOfCallSite[19].callGroovyObjectGetProperty(this)), arrayOfCallSite[20].callGroovyObjectGetProperty(this)), Task.class);
    arrayOfCallSite[21].call(arrayOfCallSite[22].call(task), new _getHapPathFiles_closure1(this, this, inputFiles));
    return (FileCollection)inputFiles.get();
  }
  
  public final class _getHapPathFiles_closure1 extends Closure implements GeneratedClosure {
    public _getHapPathFiles_closure1(Object _outerInstance, Object _thisObject, Reference inputFiles) {
      super(_outerInstance, _thisObject);
      Reference reference = inputFiles;
      this.inputFiles = reference;
    }
    
    public Object doCall(Object it) {
      Reference reference = new Reference(it);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (reference.get() instanceof PackageHap) {
        this.inputFiles.set(ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(this.inputFiles.get(), arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(reference.get())), new _closure4(this, getThisObject(), reference))))), FileCollection.class));
        return arrayOfCallSite[0].call(this.inputFiles.get(), arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(reference.get())), new _closure4(this, getThisObject(), reference)))));
      } 
      return null;
    }
    
    @Generated
    public FileCollection getInputFiles() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (FileCollection)ScriptBytecodeAdapter.castToType(this.inputFiles.get(), FileCollection.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure4 extends Closure implements GeneratedClosure {
      public _closure4(Object _outerInstance, Object _thisObject, Reference it) {
        super(_outerInstance, _thisObject);
        Reference reference = it;
        this.it = reference;
      }
      
      public Object doCall(Object file) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callStatic(PackageApp.class, arrayOfCallSite[1].callGetProperty(this.it.get()), file);
      }
      
      @Generated
      public Object getIt() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.it.get();
      }
    }
  }
  
  @Optional
  public File getEntryCardFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Path entryCardFile = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(Paths.class, arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this))), "EntryCard"), Path.class);
    return (File)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(Files.class, entryCardFile)) ? arrayOfCallSite[28].call(entryCardFile) : null, File.class);
  }
  
  @Internal
  public File getPackResFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Path packResFile = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(Paths.class, arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this)), "pack.res"), Path.class);
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(packResFile), File.class);
  }
  
  @Inject
  public PackageApp(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(GlobalDataManager.class, arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].callGroovyObjectGetProperty(this));
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    Object object4 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.pathInfo), arrayOfCallSite[9].callGroovyObjectGetProperty(variantData), arrayOfCallSite[10].callGetProperty(CommonConst.class)));
    this.packInfoFile = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      generatePackFile();
      null;
    } else {
      arrayOfCallSite[33].callCurrent(this);
    } 
    Object toolPath = arrayOfCallSite[34].call(this.sdkInfo);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(getEntryCardFile(), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].call(getEntryCardFile())))) {
        JavaCommandBuilder resBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
        arrayOfCallSite[59].call(resBuilder, toolPath);
        JavaCommandBuilder.PackingToolOptions resOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].callConstructor(JavaCommandBuilder.PackingToolOptions.class, resBuilder), JavaCommandBuilder.PackingToolOptions.class);
        arrayOfCallSite[61]
          
          .call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call(resOptions, "res"), arrayOfCallSite[66].call(this.packInfoFile)), getEntryCardFile()), arrayOfCallSite[67].call(arrayOfCallSite[68].callGroovyObjectGetProperty(this))), Boolean.valueOf(true));
        arrayOfCallSite[69].call(hmLogger, "res", arrayOfCallSite[70].call(arrayOfCallSite[71].call(resBuilder), " "));
        ProcessUtils resProcessUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].callConstructor(ProcessUtils.class, arrayOfCallSite[73].callGroovyObjectGetProperty(this), "package pack.res failed"), ProcessUtils.class);
        arrayOfCallSite[74].call(resProcessUtils, arrayOfCallSite[75].call(resBuilder), hmLogger);
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[35].callCurrent(this), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].call(arrayOfCallSite[37].callCurrent(this))))) {
      JavaCommandBuilder resBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
      arrayOfCallSite[39].call(resBuilder, toolPath);
      JavaCommandBuilder.PackingToolOptions resOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].callConstructor(JavaCommandBuilder.PackingToolOptions.class, resBuilder), JavaCommandBuilder.PackingToolOptions.class);
      arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(resOptions, "res"), arrayOfCallSite[46].call(this.packInfoFile)), arrayOfCallSite[47].callCurrent(this)), arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this))), Boolean.valueOf(true));
      arrayOfCallSite[50].call(hmLogger, "res", arrayOfCallSite[51].call(arrayOfCallSite[52].call(resBuilder), " "));
      ProcessUtils resProcessUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(ProcessUtils.class, arrayOfCallSite[54].callGroovyObjectGetProperty(this), "package pack.res failed"), ProcessUtils.class);
      arrayOfCallSite[55].call(resProcessUtils, arrayOfCallSite[56].call(resBuilder), hmLogger);
    } 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[76].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[77].call(builder, toolPath);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    Object appName = arrayOfCallSite[79].call(arrayOfCallSite[80].call(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(arrayOfCallSite[84].callGroovyObjectGetProperty(this))), "-"), arrayOfCallSite[85].callGroovyObjectGetProperty(this.variantData)), "-unsigned.app");
    arrayOfCallSite[86]
      
      .call(arrayOfCallSite[87].call(arrayOfCallSite[88].call(arrayOfCallSite[89].call(arrayOfCallSite[90].call(arrayOfCallSite[91].call(options, "app"), arrayOfCallSite[92].call(arrayOfCallSite[93].callGroovyObjectGetProperty(this), ",")), arrayOfCallSite[94].call(this.packInfoFile)), arrayOfCallSite[95].callGroovyObjectGetProperty(this)), arrayOfCallSite[96].call(arrayOfCallSite[97].call(Paths.class, arrayOfCallSite[98].call(arrayOfCallSite[99].callGroovyObjectGetProperty(this)), appName))), Boolean.valueOf(true));
    arrayOfCallSite[100].call(hmLogger, "app", arrayOfCallSite[101].call(arrayOfCallSite[102].call(builder), " "));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[103].callConstructor(ProcessUtils.class, arrayOfCallSite[104].callGroovyObjectGetProperty(this), "Package app failed"), ProcessUtils.class);
    arrayOfCallSite[105].call(processUtils, arrayOfCallSite[106].call(builder), hmLogger);
  }
  
  public void generatePackFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map packageInfoMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[107].callConstructor(HashMap.class), Map.class);
    List modules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[108].callConstructor(ArrayList.class), List.class);
    Map summaryInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[109].callConstructor(HashMap.class), Map.class);
    List modulesInfo = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[110].callConstructor(ArrayList.class), List.class);
    Project module;
    Iterator iterator;
    for (module = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[111].call(arrayOfCallSite[112].call(arrayOfCallSite[113].callGroovyObjectGetProperty(this))), Iterator.class); iterator.hasNext(); ) {
      module = (Project)ScriptBytecodeAdapter.castToType(iterator.next(), Project.class);
      ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[114].call(arrayOfCallSite[115].call(GlobalDataManager.class, module), module), ConfigInfo.class);
      if ((ScriptBytecodeAdapter.compareEqual(configInfo, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[116].callGroovyObjectGetProperty(configInfo), "har")))
        continue; 
      List mainVariants = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[117].call(arrayOfCallSite[118].call(arrayOfCallSite[119].call(arrayOfCallSite[120].callGetProperty(module), HarmonyHapPluginMain.class)), this.buildType), List.class);
      VariantData moduleVariant;
      Iterator iterator1;
      for (moduleVariant = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[121].call(mainVariants), Iterator.class); iterator1.hasNext(); ) {
        moduleVariant = (VariantData)ScriptBytecodeAdapter.castToType(iterator1.next(), VariantData.class);
        PathInfo modulePathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[122].call(moduleVariant), PathInfo.class);
        File profileFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[123].call(arrayOfCallSite[124].call(Paths.class, arrayOfCallSite[125].call(modulePathInfo), arrayOfCallSite[126].callGetProperty(CommonConst.class))), File.class);
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[127].call(profileFile)))
          continue; 
        Object object = arrayOfCallSite[128].call(moduleVariant);
        this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object, SdkInfo.class);
        PackageInfo packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[129].call(moduleVariant), PackageInfo.class);
        arrayOfCallSite[130].callCurrent(this, ArrayUtil.createArray(packageInfo, modules, modulesInfo, summaryInfo, configInfo));
      } 
    } 
    arrayOfCallSite[131].call(summaryInfo, "modules", modulesInfo);
    arrayOfCallSite[132].call(packageInfoMap, "packages", modules);
    arrayOfCallSite[133].call(packageInfoMap, "summary", summaryInfo);
    String result = ShortTypeHandling.castToString(arrayOfCallSite[134].call(JsonOutput.class, packageInfoMap));
    arrayOfCallSite[135].call(FileUtils.class, this.packInfoFile);
    arrayOfCallSite[136].call(this.packInfoFile, arrayOfCallSite[137].call(JsonOutput.class, result));
  }
  
  private void generateModuleInfo(PackageInfo packageInfo, List modules, List modulesInfo, Map summaryInfo, ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[138].call(configInfo))) {
      Map appInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[139].callConstructor(HashMap.class), Map.class);
      arrayOfCallSite[140].call(appInfo, "bundleName", arrayOfCallSite[141].callGetProperty(arrayOfCallSite[142].callGetProperty(arrayOfCallSite[143].call(configInfo))));
      arrayOfCallSite[144].callCurrent(this, appInfo, configInfo, summaryInfo);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[145].call(configInfo))) {
      Map moduleInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[146].callConstructor(HashMap.class), Map.class);
      Map distroInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[147].callConstructor(HashMap.class), Map.class);
      List abilitiesInfo = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[148].callConstructor(ArrayList.class), List.class);
      String mainAbility = ShortTypeHandling.castToString(arrayOfCallSite[149].callGetProperty(arrayOfCallSite[150].callGetProperty(arrayOfCallSite[151].callGroovyObjectGetProperty(configInfo))));
      List deviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[152].callGetProperty(arrayOfCallSite[153].callGetProperty(arrayOfCallSite[154].callGroovyObjectGetProperty(configInfo))), List.class);
      String moduleName = ShortTypeHandling.castToString(arrayOfCallSite[155].callGetProperty(arrayOfCallSite[156].callGetProperty(arrayOfCallSite[157].callGetProperty(arrayOfCallSite[158].callGroovyObjectGetProperty(configInfo)))));
      String moduleType = ShortTypeHandling.castToString(arrayOfCallSite[159].callGetProperty(arrayOfCallSite[160].callGetProperty(arrayOfCallSite[161].callGetProperty(arrayOfCallSite[162].callGroovyObjectGetProperty(configInfo)))));
      Boolean deliveryWithInstall = (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[163].callGetProperty(arrayOfCallSite[164].callGetProperty(arrayOfCallSite[165].callGetProperty(arrayOfCallSite[166].callGroovyObjectGetProperty(configInfo)))), Boolean.class);
      Boolean installationFree = (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[167].callGetProperty(arrayOfCallSite[168].callGetProperty(arrayOfCallSite[169].callGetProperty(arrayOfCallSite[170].callGroovyObjectGetProperty(configInfo)))), Boolean.class);
      Map apiVersionInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[171].callConstructor(HashMap.class), Map.class);
      Integer compatible = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[172].callGetProperty(arrayOfCallSite[173].callGetProperty(arrayOfCallSite[174].callGetProperty(arrayOfCallSite[175].callGroovyObjectGetProperty(configInfo)))), Integer.class);
      Integer target = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[176].callGetProperty(arrayOfCallSite[177].callGetProperty(arrayOfCallSite[178].callGetProperty(arrayOfCallSite[179].callGroovyObjectGetProperty(configInfo)))), Integer.class);
      String releaseType = ShortTypeHandling.castToString(arrayOfCallSite[180].callGetProperty(arrayOfCallSite[181].callGetProperty(arrayOfCallSite[182].callGetProperty(arrayOfCallSite[183].callGroovyObjectGetProperty(configInfo)))));
      arrayOfCallSite[184].call(apiVersionInfo, "compatible", compatible);
      arrayOfCallSite[185].call(apiVersionInfo, "target", target);
      arrayOfCallSite[186].call(distroInfo, "moduleName", moduleName);
      arrayOfCallSite[187].call(distroInfo, "moduleType", moduleType);
      arrayOfCallSite[188].call(distroInfo, "deliveryWithInstall", deliveryWithInstall);
      if (ScriptBytecodeAdapter.compareNotEqual(installationFree, null))
        arrayOfCallSite[189].call(distroInfo, "installationFree", installationFree); 
      if (ScriptBytecodeAdapter.compareNotEqual(releaseType, null))
        arrayOfCallSite[190].call(apiVersionInfo, "releaseType", releaseType); 
      arrayOfCallSite[191].callCurrent(this, abilitiesInfo, configInfo);
      if (ScriptBytecodeAdapter.compareNotEqual(mainAbility, null))
        arrayOfCallSite[192].call(moduleInfo, "mainAbility", mainAbility); 
      arrayOfCallSite[193].call(moduleInfo, "deviceType", deviceType);
      arrayOfCallSite[194].call(moduleInfo, "distro", distroInfo);
      arrayOfCallSite[195].call(moduleInfo, "abilities", abilitiesInfo);
      arrayOfCallSite[196].call(moduleInfo, "apiVersion", apiVersionInfo);
      arrayOfCallSite[197].call(modulesInfo, moduleInfo);
    } 
    Reference richDeviceTypes = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[198].callConstructor(ArrayList.class), List.class));
    Reference liteDeviceTypes = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[199].callConstructor(ArrayList.class), List.class));
    arrayOfCallSite[200].call(arrayOfCallSite[201].callGroovyObjectGetProperty(configInfo), new _generateModuleInfo_closure2(this, this, richDeviceTypes, liteDeviceTypes));
    String hapPath;
    Iterator iterator;
    for (hapPath = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[202].call(arrayOfCallSite[203].call(arrayOfCallSite[204].call(packageInfo))), Iterator.class); iterator.hasNext(); ) {
      hapPath = ShortTypeHandling.castToString(iterator.next());
      Map modulePackInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[205].callConstructor(HashMap.class), Map.class);
      String hapFileName = ShortTypeHandling.castToString(arrayOfCallSite[206].call(FileUtils.class, arrayOfCallSite[207].call(hapPath, arrayOfCallSite[208].call(arrayOfCallSite[209].call(hapPath, arrayOfCallSite[210].callGetProperty(File.class)), Integer.valueOf(1)))));
      arrayOfCallSite[211].call(modulePackInfo, "deliveryWithInstall", arrayOfCallSite[212].call(configInfo));
      arrayOfCallSite[213].call(modulePackInfo, "name", hapFileName);
      arrayOfCallSite[214].call(modulePackInfo, "moduleType", arrayOfCallSite[215].callGroovyObjectGetProperty(configInfo));
      arrayOfCallSite[216].call(modulePackInfo, "deviceType", DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[217].call(hapFileName, "-rich-")) ? richDeviceTypes.get() : liteDeviceTypes.get());
      arrayOfCallSite[218].call(modules, modulePackInfo);
    } 
  }
  
  public final class _generateModuleInfo_closure2 extends Closure implements GeneratedClosure {
    public _generateModuleInfo_closure2(Object _outerInstance, Object _thisObject, Reference richDeviceTypes, Reference liteDeviceTypes) {
      super(_outerInstance, _thisObject);
      Reference reference1 = richDeviceTypes;
      this.richDeviceTypes = reference1;
      Reference reference2 = liteDeviceTypes;
      this.liteDeviceTypes = reference2;
    }
    
    public Object doCall(Object deviceType) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ScriptBytecodeAdapter.compareEqual(deviceType, "default") ? "phone" : deviceType;
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].call(DeviceType.class, deviceType))))
        return arrayOfCallSite[2].call(this.richDeviceTypes.get(), deviceType); 
      return arrayOfCallSite[3].call(this.liteDeviceTypes.get(), deviceType);
    }
    
    @Generated
    public List getRichDeviceTypes() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.richDeviceTypes.get(), List.class);
    }
    
    @Generated
    public List getLiteDeviceTypes() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.liteDeviceTypes.get(), List.class);
    }
  }
  
  private void handleEntryInfo(Map appInfo, ConfigInfo configInfo, Map summaryInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer code = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[219].callGetProperty(arrayOfCallSite[220].callGetProperty(arrayOfCallSite[221].callGetProperty(arrayOfCallSite[222].callGroovyObjectGetProperty(configInfo)))), Integer.class);
    String name = ShortTypeHandling.castToString(arrayOfCallSite[223].callGetProperty(arrayOfCallSite[224].callGetProperty(arrayOfCallSite[225].callGetProperty(arrayOfCallSite[226].callGroovyObjectGetProperty(configInfo)))));
    Integer minCompatibleVersionCode = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[227].callGetProperty(arrayOfCallSite[228].callGetProperty(arrayOfCallSite[229].callGetProperty(arrayOfCallSite[230].callGroovyObjectGetProperty(configInfo)))), Integer.class);
    Map versionInfo = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[231].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[232].call(versionInfo, "code", code);
    arrayOfCallSite[233].call(versionInfo, "name", name);
    arrayOfCallSite[234].callCurrent(this, versionInfo);
    if (ScriptBytecodeAdapter.compareNotEqual(minCompatibleVersionCode, null))
      arrayOfCallSite[235].call(versionInfo, "minCompatibleVersionCode", minCompatibleVersionCode); 
    arrayOfCallSite[236].call(appInfo, "version", versionInfo);
    arrayOfCallSite[237].call(summaryInfo, "app", appInfo);
  }
  
  private void putLegacyInfo(Map versionInfo) {
    Reference reference = new Reference(versionInfo);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[238].call(arrayOfCallSite[239].callGetProperty(arrayOfCallSite[240].callGroovyObjectGetProperty(this)), new _putLegacyInfo_closure3(this, this, reference));
  }
  
  public final class _putLegacyInfo_closure3 extends Closure implements GeneratedClosure {
    public _putLegacyInfo_closure3(Object _outerInstance, Object _thisObject, Reference versionInfo) {
      super(_outerInstance, _thisObject);
      Reference reference = versionInfo;
      this.versionInfo = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), "projectModuleType"), null))
        return null; 
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[2].callGetProperty(BuildConst.class), arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(it), "projectModuleType")))
        return null; 
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(it)), null))
        return null; 
      Object legacyVersionCode = arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(it)));
      if (DefaultTypeTransformation.booleanUnbox(legacyVersionCode))
        arrayOfCallSite[10].call(this.versionInfo.get(), "legacyVersionCode", legacyVersionCode); 
      Object legacyVersionName = arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(it)));
      if (DefaultTypeTransformation.booleanUnbox(legacyVersionName))
        return arrayOfCallSite[14].call(this.versionInfo.get(), "legacyVersionName", legacyVersionName); 
      return null;
    }
    
    @Generated
    public Map getVersionInfo() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.versionInfo.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private void handleAbilitiesInfo(List abilitiesInfo, ConfigInfo configInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List abilitiesList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[241].callGetProperty(arrayOfCallSite[242].callGetProperty(arrayOfCallSite[243].callGroovyObjectGetProperty(configInfo))), List.class);
    AbilitiesOptions abilitiesOption;
    Iterator iterator;
    for (abilitiesOption = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[244].call(abilitiesList), Iterator.class); iterator.hasNext(); ) {
      abilitiesOption = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      Map abilitiesMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[245].callConstructor(HashMap.class), Map.class);
      String name = ShortTypeHandling.castToString(arrayOfCallSite[246].callGroovyObjectGetProperty(abilitiesOption));
      String label = ShortTypeHandling.castToString(arrayOfCallSite[247].callGroovyObjectGetProperty(abilitiesOption));
      Boolean visible = (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[248].callGroovyObjectGetProperty(abilitiesOption), Boolean.class);
      arrayOfCallSite[249].call(abilitiesMap, "name", name);
      if (ScriptBytecodeAdapter.compareNotEqual(label, null))
        arrayOfCallSite[250].call(abilitiesMap, "label", label); 
      if (ScriptBytecodeAdapter.compareNotEqual(visible, null))
        arrayOfCallSite[251].call(abilitiesMap, "visible", visible); 
      List formsOptionsList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[252].callGroovyObjectGetProperty(abilitiesOption), List.class);
      List formsList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[253].callConstructor(ArrayList.class), List.class);
      if (ScriptBytecodeAdapter.compareNotEqual(formsOptionsList, null)) {
        FormsOptions formsOptions;
        Iterator iterator1;
        for (formsOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[254].call(formsOptionsList), Iterator.class); iterator1.hasNext(); ) {
          formsOptions = (FormsOptions)ScriptBytecodeAdapter.castToType(iterator1.next(), FormsOptions.class);
          Map formsMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[255].callConstructor(HashMap.class), Map.class);
          String formsName = ShortTypeHandling.castToString(arrayOfCallSite[256].callGroovyObjectGetProperty(formsOptions));
          List supportDimensions = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[257].callGroovyObjectGetProperty(formsOptions), List.class);
          String defaultDimension = ShortTypeHandling.castToString(arrayOfCallSite[258].callGroovyObjectGetProperty(formsOptions));
          Integer updateDuration = (Integer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[259].callGroovyObjectGetProperty(formsOptions), Integer.class);
          String scheduledUpdateTime = ShortTypeHandling.castToString(arrayOfCallSite[260].callGroovyObjectGetProperty(formsOptions));
          arrayOfCallSite[261].call(formsMap, "name", formsName);
          arrayOfCallSite[262].call(formsMap, "supportDimensions", supportDimensions);
          arrayOfCallSite[263].call(formsMap, "defaultDimension", defaultDimension);
          if (ScriptBytecodeAdapter.compareNotEqual(updateDuration, null))
            arrayOfCallSite[264].call(formsMap, "updateDuration", updateDuration); 
          if (ScriptBytecodeAdapter.compareNotEqual(scheduledUpdateTime, null))
            arrayOfCallSite[265].call(formsMap, "scheduledUpdateTime", scheduledUpdateTime); 
          arrayOfCallSite[266].call(formsList, formsMap);
        } 
        arrayOfCallSite[267].call(abilitiesMap, "forms", formsList);
      } 
      arrayOfCallSite[268].call(abilitiesInfo, abilitiesMap);
    } 
  }
  
  private static boolean isNeedPack(Project project, File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String fileName = ShortTypeHandling.castToString(arrayOfCallSite[269].callGetProperty(file));
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[270].call(file)) || ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[271].call(FileUtils.class, file), "hap")))
      return false; 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[272].call(fileName, "-rich-unsigned")))
      return true; 
    ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[273].call(arrayOfCallSite[274].call(GlobalDataManager.class, project), project), ConfigInfo.class);
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[275].call(arrayOfCallSite[276].callGroovyObjectGetProperty(configInfo), "liteWearable")) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[277].call(fileName, "-app-unsigned")))))
      return false; 
    return true;
  }
}
