package com.huawei.ohos.build.tasks.test;

import com.huawei.ohos.build.HarmonyHapPluginMain;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
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
import java.util.List;
import java.util.Locale;
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
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.OutputFiles;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class PackageTestHap extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger HM_LOGGER;
  
  private BuildType buildType;
  
  @Internal
  private VariantData variantData;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private PackageInfo packageInfo;
  
  private String toolPath;
  
  @InputFile
  @Optional
  private File jsonPath;
  
  @InputDirectory
  @Optional
  private File dexDir;
  
  @InputFile
  @Optional
  private File dexFile;
  
  @InputDirectory
  @Optional
  private File resourcesPath;
  
  private File assetsPath;
  
  @InputFile
  @Optional
  private File indexPath;
  
  @InputFile
  @Optional
  private File binFile;
  
  @OutputFiles
  private FileCollection hapFiles;
  
  @OutputDirectory
  private File hapFileDir;
  
  static {
    Object object = $getCallSiteArray()[406].call(HMLogger.class, PackageTestHap.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputFiles
  @Optional
  public FileCollection getAssetsFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileCollection assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this)), FileCollection.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(this.configInfo))) {
      assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(assetsFiles, arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), arrayOfCallSite[19].call(this.pathInfo, arrayOfCallSite[20].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[21].callGetProperty(BuildConst.class)))), FileCollection.class);
      arrayOfCallSite[16].call(assetsFiles, arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), arrayOfCallSite[19].call(this.pathInfo, arrayOfCallSite[20].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[21].callGetProperty(BuildConst.class))));
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(this.configInfo))) {
      String device;
      Iterator iterator;
      for (device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this.configInfo)), Iterator.class); iterator.hasNext(); ) {
        device = ShortTypeHandling.castToString(iterator.next());
        boolean isRichDevice = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(arrayOfCallSite[26].call(DeviceType.class, device)));
        assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(assetsFiles, arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), arrayOfCallSite[30].call(this.pathInfo, arrayOfCallSite[31].callGroovyObjectGetProperty(this.variantData), isRichDevice ? arrayOfCallSite[32].callGetProperty(BuildConst.class) : arrayOfCallSite[33].callGetProperty(BuildConst.class)))), FileCollection.class);
        arrayOfCallSite[27].call(assetsFiles, arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), arrayOfCallSite[30].call(this.pathInfo, arrayOfCallSite[31].callGroovyObjectGetProperty(this.variantData), isRichDevice ? arrayOfCallSite[32].callGetProperty(BuildConst.class) : arrayOfCallSite[33].callGetProperty(BuildConst.class))));
      } 
    } else {
      assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].call(assetsFiles, arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this), arrayOfCallSite[37].call(this.pathInfo, arrayOfCallSite[38].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[39].callGetProperty(BuildConst.class)))), FileCollection.class);
      arrayOfCallSite[34].call(assetsFiles, arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this), arrayOfCallSite[37].call(this.pathInfo, arrayOfCallSite[38].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[39].callGetProperty(BuildConst.class))));
    } 
    return assetsFiles;
  }
  
  @InputDirectory
  @Optional
  public File getLibcppsoPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File libcppsoPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].call(arrayOfCallSite[41].call(Paths.class, arrayOfCallSite[42].call(this.pathInfo), arrayOfCallSite[43].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[44].callGetProperty(PathConst.class))), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[45].call(libcppsoPath)))
      return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
    return libcppsoPath;
  }
  
  @InputFiles
  public FileCollection getApkFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[46].callCurrent(this, arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(this))), FileCollection.class);
  }
  
  @Inject
  public PackageTestHap(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object4, SdkInfo.class);
    Object object5 = arrayOfCallSite[4].call(variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object5, PackageInfo.class);
    Object object6 = arrayOfCallSite[5].call(this.sdkInfo);
    this.toolPath = ShortTypeHandling.castToString(object6);
    Object object7 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.pathInfo), arrayOfCallSite[9].callGroovyObjectGetProperty(variantData)));
    this.hapFileDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[10].callCurrent(this, arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this)));
    this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object8, FileCollection.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(this.configInfo))) {
        packageLiteDeviceHap();
        null;
      } else {
        packageRichDeviceHap();
        null;
      } 
      return;
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[49].call(this.configInfo))) {
      arrayOfCallSite[50].callCurrent(this);
    } else {
      arrayOfCallSite[51].callCurrent(this);
    } 
  }
  
  private void packageRichDeviceHap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[54].call(builder, this.toolPath);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    Reference dexFilePath = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].callConstructor(StringBuffer.class), StringBuffer.class));
    arrayOfCallSite[57].call(arrayOfCallSite[58].call(this.dexDir), new _packageRichDeviceHap_closure1(this, this, dexFilePath));
    arrayOfCallSite[59]
      
      .call(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call(options, "hap"), this.jsonPath), arrayOfCallSite[66].call(dexFilePath.get(), Integer.valueOf(0), arrayOfCallSite[67].call(arrayOfCallSite[68].call(dexFilePath.get()), Integer.valueOf(1)))), arrayOfCallSite[69].call(this.resourcesPath)), this.assetsPath), arrayOfCallSite[70].call(this.indexPath)), Boolean.valueOf(true));
    Reference libSoPath = new Reference(arrayOfCallSite[71].call(this.pathInfo));
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[72].callGroovyObjectGetProperty(this), null))
      arrayOfCallSite[73].call(arrayOfCallSite[74].callGroovyObjectGetProperty(this), new _packageRichDeviceHap_closure2(this, this, libSoPath)); 
    File libsDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].callConstructor(File.class, libSoPath.get()), File.class);
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[76].call(libsDir)) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[77].callGetProperty(arrayOfCallSite[78].call(libsDir)), Integer.valueOf(0))))
      arrayOfCallSite[79].call(options, libSoPath.get()); 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[80].call(this.configInfo), "feature")) {
      JavaCommandBuilder moduleBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[81].callConstructor(JavaCommandBuilder.class, builder), JavaCommandBuilder.class);
      JavaCommandBuilder.PackingToolOptions moduleOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[82].callConstructor(JavaCommandBuilder.PackingToolOptions.class, moduleBuilder), JavaCommandBuilder.PackingToolOptions.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[83].call(this.variantData))) {
        List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[84].call(ModuleExtensionData.class, arrayOfCallSite[85].callGroovyObjectGetProperty(this)), List.class);
        String entryModule;
        Iterator iterator;
        for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[86].call(entryModules), Iterator.class); iterator.hasNext(); ) {
          entryModule = ShortTypeHandling.castToString(iterator.next());
          Object hapName = arrayOfCallSite[87].call(arrayOfCallSite[88].call(arrayOfCallSite[89].call(arrayOfCallSite[90].call(arrayOfCallSite[91].callGroovyObjectGetProperty(this)), "-"), entryModule), "-test-unsigned.hap");
          Object hapPath = arrayOfCallSite[92].call(arrayOfCallSite[93].call(Paths.class, arrayOfCallSite[94].call(this.pathInfo), arrayOfCallSite[95].callGroovyObjectGetProperty(this.variantData), hapName));
          Object myApkPath = arrayOfCallSite[96].call(arrayOfCallSite[97].call(this.packageInfo), arrayOfCallSite[98].call(entryModule, "_test"));
          arrayOfCallSite[99].call(moduleOptions, hapPath);
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[100].call(this.configInfo)))
            arrayOfCallSite[101].call(moduleOptions, arrayOfCallSite[102].call(String.class, arrayOfCallSite[103].callGetProperty(Locale.class), "%s", myApkPath)); 
        } 
      } else {
        Object hapName = arrayOfCallSite[104].call(arrayOfCallSite[105].call(arrayOfCallSite[106].callGroovyObjectGetProperty(this)), "-test-unsigned.hap");
        Object hapPath = arrayOfCallSite[107].call(arrayOfCallSite[108].call(Paths.class, arrayOfCallSite[109].call(this.pathInfo), arrayOfCallSite[110].callGroovyObjectGetProperty(this.variantData), hapName));
        Object myApkPath = arrayOfCallSite[111].call(arrayOfCallSite[112].call(this.packageInfo), arrayOfCallSite[113].call(arrayOfCallSite[114].call(arrayOfCallSite[115].callGroovyObjectGetProperty(this)), "_test"));
        arrayOfCallSite[116].call(moduleOptions, hapPath);
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[117].call(this.configInfo)))
          arrayOfCallSite[118].call(moduleOptions, arrayOfCallSite[119].call(String.class, arrayOfCallSite[120].callGetProperty(Locale.class), "%s", myApkPath)); 
      } 
      arrayOfCallSite[121].call(HM_LOGGER, "package", arrayOfCallSite[122].call(arrayOfCallSite[123].call(moduleBuilder), " "));
      ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[124].callConstructor(ProcessUtils.class, arrayOfCallSite[125].callGroovyObjectGetProperty(this), "Package failed"), ProcessUtils.class);
      arrayOfCallSite[126].call(processUtils, arrayOfCallSite[127].call(moduleBuilder), HM_LOGGER);
    } 
  }
  
  public final class _packageRichDeviceHap_closure1 extends Closure implements GeneratedClosure {
    public _packageRichDeviceHap_closure1(Object _outerInstance, Object _thisObject, Reference dexFilePath) {
      super(_outerInstance, _thisObject);
      Reference reference = dexFilePath;
      this.dexFilePath = reference;
    }
    
    public Object doCall(Object dex) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(dex), ".dex"))) {
        arrayOfCallSite[2].call(this.dexFilePath.get(), arrayOfCallSite[3].call(dex));
        return arrayOfCallSite[4].call(this.dexFilePath.get(), ",");
      } 
      return null;
    }
    
    @Generated
    public StringBuffer getDexFilePath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (StringBuffer)ScriptBytecodeAdapter.castToType(this.dexFilePath.get(), StringBuffer.class);
    }
  }
  
  public final class _packageRichDeviceHap_closure2 extends Closure implements GeneratedClosure {
    public _packageRichDeviceHap_closure2(Object _outerInstance, Object _thisObject, Reference libSoPath) {
      super(_outerInstance, _thisObject);
      Reference reference = libSoPath;
      this.libSoPath = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].callGroovyObjectGetProperty(this), new _closure3(this, getThisObject()));
      return arrayOfCallSite[2].callCurrent((GroovyObject)this, this.libSoPath.get());
    }
    
    @Generated
    public Object getLibSoPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.libSoPath.get();
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
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, "**/*.so");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  private void packageLiteDeviceHap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[128].call(this.configInfo))) {
      List deviceTypes = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[129].call(this.configInfo), List.class);
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        String str;
        Iterator iterator1;
        for (str = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].call(deviceTypes), Iterator.class); iterator1.hasNext(); ) {
          str = ShortTypeHandling.castToString(iterator1.next());
          packageLiteHap(str);
          null;
        } 
        return;
      } 
      String deviceType;
      Iterator iterator;
      for (deviceType = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[130].call(deviceTypes), Iterator.class); iterator.hasNext(); ) {
        deviceType = ShortTypeHandling.castToString(iterator.next());
        arrayOfCallSite[131].callCurrent(this, deviceType);
      } 
    } else {
      arrayOfCallSite[133].callCurrent(this, arrayOfCallSite[134].call(this.configInfo));
    } 
  }
  
  private void packageLiteHap(String device) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[142].callGetProperty(arrayOfCallSite[143].callGetProperty(DeviceType.class)), device)) {
        executePackageHap(device, "bin");
        null;
      } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[144].call(arrayOfCallSite[145].call(DeviceType.class, device)))) {
        executePackageHap(device, "shell");
        null;
      } else {
        executePackageHap(device, "hap");
        null;
      } 
      return;
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[135].callGetProperty(arrayOfCallSite[136].callGetProperty(DeviceType.class)), device)) {
      arrayOfCallSite[137].callCurrent(this, device, "bin");
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[138].call(arrayOfCallSite[139].call(DeviceType.class, device)))) {
      arrayOfCallSite[140].callCurrent(this, device, "shell");
    } else {
      arrayOfCallSite[141].callCurrent(this, device, "hap");
    } 
  }
  
  private void executePackageHap(String device, String hapType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String buildTypeName = ShortTypeHandling.castToString(arrayOfCallSite[146].callGroovyObjectGetProperty(this.variantData));
    String hapFileName = ShortTypeHandling.castToString(arrayOfCallSite[147].call(arrayOfCallSite[148].call(arrayOfCallSite[149].call(arrayOfCallSite[150].call(arrayOfCallSite[151].callGetProperty(arrayOfCallSite[152].callGroovyObjectGetProperty(this)), "-test-"), device), ScriptBytecodeAdapter.compareEqual(hapType, "app") ? "-app" : ""), "-unsigned.hap"));
    File hapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[153].call(arrayOfCallSite[154].call(Paths.class, arrayOfCallSite[155].call(this.pathInfo), buildTypeName, hapFileName)), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[156].call(hapFile))) {
      arrayOfCallSite[157].call(hapFile);
    } else {
      arrayOfCallSite[158].call(arrayOfCallSite[159].call(hapFile));
    } 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[160].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[161].call(builder, this.toolPath);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[162].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    arrayOfCallSite[163]
      
      .call(arrayOfCallSite[164].call(arrayOfCallSite[165].call(options, "hap"), Boolean.valueOf(true)), arrayOfCallSite[166].call(hapFile));
    if (ScriptBytecodeAdapter.compareEqual(hapType, "bin")) {
      arrayOfCallSite[167].call(options, arrayOfCallSite[168].call(this.binFile));
    } else if (ScriptBytecodeAdapter.compareEqual(hapType, "shell")) {
      Object apkPath = arrayOfCallSite[169].call(arrayOfCallSite[170].call(this.packageInfo), arrayOfCallSite[171].call(arrayOfCallSite[172].call(arrayOfCallSite[173].callGroovyObjectGetProperty(this)), "_test"));
      arrayOfCallSite[174]
        
        .call(arrayOfCallSite[175].call(arrayOfCallSite[176].call(arrayOfCallSite[177].call(arrayOfCallSite[178].call(arrayOfCallSite[179].call(options, this.jsonPath), arrayOfCallSite[180].call(this.resourcesPath)), this.assetsPath), arrayOfCallSite[181].call(String.class, arrayOfCallSite[182].callGetProperty(Locale.class), "%s", apkPath)), arrayOfCallSite[183].call(this.indexPath)), arrayOfCallSite[184].call(this.dexFile));
    } else {
      arrayOfCallSite[185]
        
        .call(arrayOfCallSite[186].call(arrayOfCallSite[187].call(arrayOfCallSite[188].call(options, this.jsonPath), arrayOfCallSite[189].call(this.resourcesPath)), this.assetsPath), arrayOfCallSite[190].call(this.indexPath));
    } 
    arrayOfCallSite[191].call(HM_LOGGER, "package", arrayOfCallSite[192].call(builder));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[193].callConstructor(ProcessUtils.class, arrayOfCallSite[194].callGroovyObjectGetProperty(this), "Package hap failed"), ProcessUtils.class);
    arrayOfCallSite[195].call(processUtils, arrayOfCallSite[196].call(builder), HM_LOGGER);
  }
  
  private FileCollection configInput(FileCollection hapFiles) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[197].call(this.configInfo))) {
      Map hapPathMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[198].call(this.packageInfo), Map.class);
      Object object1 = arrayOfCallSite[199].callConstructor(File.class, arrayOfCallSite[200].call(this.pathInfo));
      this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object1, File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[201].call(this.configInfo))) {
        Object object = arrayOfCallSite[202].callConstructor(File.class, arrayOfCallSite[203].call(this.pathInfo, arrayOfCallSite[204].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[205].callGetProperty(BuildConst.class)));
        this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object, File.class);
      } 
      Object object2 = arrayOfCallSite[206].call(arrayOfCallSite[207].call(Paths.class, arrayOfCallSite[208].call(this.pathInfo, arrayOfCallSite[209].callGroovyObjectGetProperty(this.variantData))));
      this.dexDir = (File)ScriptBytecodeAdapter.castToType(object2, File.class);
      Object object3 = arrayOfCallSite[210].callConstructor(File.class, arrayOfCallSite[211].call(this.pathInfo, arrayOfCallSite[212].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[213].callGetProperty(BuildConst.class)));
      this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
      Object object4 = arrayOfCallSite[214].callConstructor(File.class, arrayOfCallSite[215].call(this.pathInfo, arrayOfCallSite[216].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[217].callGetProperty(BuildConst.class)));
      this.indexPath = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
      Object object5 = arrayOfCallSite[218].callConstructor(File.class, arrayOfCallSite[219].call(this.pathInfo, arrayOfCallSite[220].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[221].callGetProperty(BuildConst.class)));
      this.assetsPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[222].call(this.configInfo), "feature")) {
        VariantData mainVariantData = (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[223].call(arrayOfCallSite[224].call(arrayOfCallSite[225].call(arrayOfCallSite[226].callGetProperty(arrayOfCallSite[227].callGroovyObjectGetProperty(this)), HarmonyHapPluginMain.class)), this.buildType), VariantData.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[228].call(arrayOfCallSite[229].callGroovyObjectGetProperty(mainVariantData)), "feature")) {
          List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[230].call(ModuleExtensionData.class, arrayOfCallSite[231].callGroovyObjectGetProperty(this)), List.class);
          String entryModule;
          Iterator iterator;
          for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[232].call(entryModules), Iterator.class); iterator.hasNext(); ) {
            entryModule = ShortTypeHandling.castToString(iterator.next());
            Object hapName = arrayOfCallSite[233].call(arrayOfCallSite[234].call(arrayOfCallSite[235].call(arrayOfCallSite[236].call(arrayOfCallSite[237].callGroovyObjectGetProperty(this)), "-"), entryModule), "-test-unsigned.hap");
            Object hapPath = arrayOfCallSite[238].call(arrayOfCallSite[239].call(Paths.class, arrayOfCallSite[240].call(this.pathInfo), arrayOfCallSite[241].callGroovyObjectGetProperty(this.variantData), hapName));
            arrayOfCallSite[242].call(hapPathMap, arrayOfCallSite[243].call(entryModule, "_test"), hapPath);
            Object object6 = arrayOfCallSite[244].call(hapFiles, arrayOfCallSite[245].call(arrayOfCallSite[246].callGroovyObjectGetProperty(this), hapPath));
            hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object6, FileCollection.class);
          } 
        } else {
          Object hapName = arrayOfCallSite[247].call(arrayOfCallSite[248].call(arrayOfCallSite[249].callGroovyObjectGetProperty(this)), "-test-unsigned.hap");
          Object hapPath = arrayOfCallSite[250].call(arrayOfCallSite[251].call(Paths.class, arrayOfCallSite[252].call(this.pathInfo), arrayOfCallSite[253].callGroovyObjectGetProperty(this.variantData), hapName));
          arrayOfCallSite[254].call(hapPathMap, arrayOfCallSite[255].call(arrayOfCallSite[256].call(arrayOfCallSite[257].callGroovyObjectGetProperty(this)), "_test"), hapPath);
          Object object6 = arrayOfCallSite[258].call(hapFiles, arrayOfCallSite[259].call(arrayOfCallSite[260].callGroovyObjectGetProperty(this), hapPath));
          hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object6, FileCollection.class);
        } 
      } 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[261].call(this.configInfo))) {
      List deviceTypes = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[262].call(this.configInfo), List.class);
      String deviceType;
      Iterator iterator;
      for (deviceType = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[263].call(deviceTypes), Iterator.class); iterator.hasNext(); ) {
        deviceType = ShortTypeHandling.castToString(iterator.next());
        Object object = arrayOfCallSite[264].callCurrent(this, deviceType, hapFiles);
        hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
      } 
    } else {
      Object object = arrayOfCallSite[265].callCurrent(this, arrayOfCallSite[266].call(this.configInfo), hapFiles);
      hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    } 
    return hapFiles;
  }
  
  private Object configLiteDeviceHap(String device, FileCollection hapFiles) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[267].callGetProperty(arrayOfCallSite[268].callGetProperty(DeviceType.class)), device)) {
      Object object = arrayOfCallSite[269].callCurrent(this, device, "bin", hapFiles);
      hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[270].call(arrayOfCallSite[271].call(DeviceType.class, device)))) {
      Object object = arrayOfCallSite[272].callCurrent(this, device, "shell", hapFiles);
      hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    } else {
      Object object = arrayOfCallSite[273].callCurrent(this, device, "hap", hapFiles);
      hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    } 
    return hapFiles;
  }
  
  private Object configLiteHap(String device, String hapType, FileCollection hapFiles) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object hapPathMap = arrayOfCallSite[274].call(this.packageInfo);
    String hapFileName = ShortTypeHandling.castToString(arrayOfCallSite[275].call(arrayOfCallSite[276].call(arrayOfCallSite[277].call(arrayOfCallSite[278].call(arrayOfCallSite[279].callGetProperty(arrayOfCallSite[280].callGroovyObjectGetProperty(this)), "-test-"), device), ScriptBytecodeAdapter.compareEqual(hapType, "app") ? "-app" : ""), "-unsigned.hap"));
    File hapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[281].call(arrayOfCallSite[282].call(Paths.class, arrayOfCallSite[283].call(this.pathInfo), arrayOfCallSite[284].callGroovyObjectGetProperty(this.variantData), hapFileName)), File.class);
    Object object1 = arrayOfCallSite[285].call(hapFiles, arrayOfCallSite[286].call(arrayOfCallSite[287].callGroovyObjectGetProperty(this), hapFile));
    hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object1, FileCollection.class);
    boolean richDevice = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[288].call(arrayOfCallSite[289].call(DeviceType.class, device)));
    String deviceType = ShortTypeHandling.castToString(richDevice ? arrayOfCallSite[290].callGetProperty(BuildConst.class) : arrayOfCallSite[291].callGetProperty(BuildConst.class));
    if (ScriptBytecodeAdapter.compareEqual(hapType, "bin")) {
      boolean signConfigured = false;
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        boolean bool = ((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[299].call(KeyStoreHelper.class, arrayOfCallSite[300].callGroovyObjectGetProperty(this), arrayOfCallSite[301].call(this.buildType)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[302].call(arrayOfCallSite[303].callGetProperty(arrayOfCallSite[304].callGroovyObjectGetProperty(this)), arrayOfCallSite[305].callGetProperty(BuildConst.class)))) ? true : false;
      } else {
        boolean bool = ((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[292].call(KeyStoreHelper.class, arrayOfCallSite[293].callGroovyObjectGetProperty(this), arrayOfCallSite[294].call(this.buildType)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[295].call(arrayOfCallSite[296].callGetProperty(arrayOfCallSite[297].callGroovyObjectGetProperty(this)), arrayOfCallSite[298].callGetProperty(BuildConst.class)))) ? true : false;
      } 
      Object object = arrayOfCallSite[306].call(arrayOfCallSite[307].call(Paths.class, arrayOfCallSite[308].call(this.pathInfo, arrayOfCallSite[309].callGroovyObjectGetProperty(this.variantData), Boolean.valueOf(signConfigured))));
      this.binFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else if (ScriptBytecodeAdapter.compareEqual(hapType, "shell")) {
      Object object3 = arrayOfCallSite[310].callConstructor(File.class, arrayOfCallSite[311].call(this.pathInfo, arrayOfCallSite[312].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
      Object object4 = arrayOfCallSite[313].callConstructor(File.class, arrayOfCallSite[314].call(this.pathInfo, arrayOfCallSite[315].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
      Object object5 = arrayOfCallSite[316].callConstructor(File.class, arrayOfCallSite[317].call(this.pathInfo, arrayOfCallSite[318].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.indexPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      Object object6 = arrayOfCallSite[319].call(arrayOfCallSite[320].call(Paths.class, arrayOfCallSite[321].call(this.pathInfo, arrayOfCallSite[322].callGroovyObjectGetProperty(this.variantData)), arrayOfCallSite[323].callGetProperty(BuildConst.class)));
      this.dexFile = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
      Object object7 = arrayOfCallSite[324].callConstructor(File.class, arrayOfCallSite[325].call(this.pathInfo, arrayOfCallSite[326].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.assetsPath = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    } else {
      Object object3 = arrayOfCallSite[327].callConstructor(File.class, arrayOfCallSite[328].call(this.pathInfo, arrayOfCallSite[329].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
      Object object4 = arrayOfCallSite[330].callConstructor(File.class, arrayOfCallSite[331].call(this.pathInfo, arrayOfCallSite[332].callGroovyObjectGetProperty(this.variantData), deviceType, arrayOfCallSite[333].call(this.configInfo)));
      this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
      Object object5 = arrayOfCallSite[334].callConstructor(File.class, arrayOfCallSite[335].call(this.pathInfo, arrayOfCallSite[336].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.indexPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      Object object6 = arrayOfCallSite[337].callConstructor(File.class, arrayOfCallSite[338].call(this.pathInfo, arrayOfCallSite[339].callGroovyObjectGetProperty(this.variantData), deviceType));
      this.assetsPath = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    } 
    arrayOfCallSite[340].call(hapPathMap, arrayOfCallSite[341].call(arrayOfCallSite[342].call(arrayOfCallSite[343].call(arrayOfCallSite[344].call(arrayOfCallSite[345].call(arrayOfCallSite[346].call(arrayOfCallSite[347].callGroovyObjectGetProperty(this)), "-"), hapType), "-"), device), "_test"), arrayOfCallSite[348].call(hapFile));
    Object object2 = arrayOfCallSite[349].call(hapFiles, arrayOfCallSite[350].call(arrayOfCallSite[351].callGroovyObjectGetProperty(this), hapFile));
    hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object2, FileCollection.class);
    return hapFiles;
  }
  
  private FileCollection configApkPathCollection(FileCollection apkPathCollection) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[352].call(this.configInfo))) {
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[353].call(this.configInfo), "feature")) {
        VariantData mainVariantData = (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[354].call(arrayOfCallSite[355].call(arrayOfCallSite[356].call(arrayOfCallSite[357].callGetProperty(arrayOfCallSite[358].callGroovyObjectGetProperty(this)), HarmonyHapPluginMain.class)), this.buildType), VariantData.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[359].call(arrayOfCallSite[360].callGroovyObjectGetProperty(mainVariantData)), "feature")) {
          String entryModule;
          Iterator iterator;
          for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[361].call(arrayOfCallSite[362].call(ModuleExtensionData.class, arrayOfCallSite[363].callGroovyObjectGetProperty(this))), Iterator.class); iterator.hasNext(); ) {
            entryModule = ShortTypeHandling.castToString(iterator.next());
            if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[364].call(this.configInfo))) {
              Object myApkPath = arrayOfCallSite[365].call(arrayOfCallSite[366].call(this.packageInfo), arrayOfCallSite[367].call(entryModule, "_test"));
              String apk;
              Iterator iterator1;
              for (apk = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[368].call(arrayOfCallSite[369].call(myApkPath, ",")), Iterator.class); iterator1.hasNext(); ) {
                apk = ShortTypeHandling.castToString(iterator1.next());
                Object object = arrayOfCallSite[370].call(apkPathCollection, arrayOfCallSite[371].call(arrayOfCallSite[372].callGroovyObjectGetProperty(this), apk));
                apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
              } 
            } 
          } 
        } else if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[373].call(this.configInfo))) {
          Object myApkPath = arrayOfCallSite[374].call(arrayOfCallSite[375].call(this.packageInfo), arrayOfCallSite[376].call(arrayOfCallSite[377].call(arrayOfCallSite[378].callGroovyObjectGetProperty(this)), "_test"));
          String apk;
          Iterator iterator;
          for (apk = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[379].call(arrayOfCallSite[380].call(myApkPath, ",")), Iterator.class); iterator.hasNext(); ) {
            apk = ShortTypeHandling.castToString(iterator.next());
            Object object = arrayOfCallSite[381].call(apkPathCollection, arrayOfCallSite[382].call(arrayOfCallSite[383].callGroovyObjectGetProperty(this), apk));
            apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
          } 
        } 
      } 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[384].call(this.configInfo))) {
      String deviceType;
      Iterator iterator;
      for (deviceType = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[385].call(arrayOfCallSite[386].call(this.configInfo)), Iterator.class); iterator.hasNext(); ) {
        deviceType = ShortTypeHandling.castToString(iterator.next());
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[387].call(arrayOfCallSite[388].call(DeviceType.class, deviceType)))) {
          String shellApkPath = ShortTypeHandling.castToString(arrayOfCallSite[389].call(arrayOfCallSite[390].call(this.packageInfo), arrayOfCallSite[391].call(arrayOfCallSite[392].call(arrayOfCallSite[393].callGroovyObjectGetProperty(this)), "_test")));
          Object object = arrayOfCallSite[394].call(apkPathCollection, arrayOfCallSite[395].call(arrayOfCallSite[396].callGroovyObjectGetProperty(this), shellApkPath));
          apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
        } 
      } 
    } else if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[397].call(this.configInfo), "shell")) {
      String shellApkPath = ShortTypeHandling.castToString(arrayOfCallSite[398].call(arrayOfCallSite[399].call(this.packageInfo), arrayOfCallSite[400].call(arrayOfCallSite[401].call(arrayOfCallSite[402].callGroovyObjectGetProperty(this)), "_test")));
      Object object = arrayOfCallSite[403].call(apkPathCollection, arrayOfCallSite[404].call(arrayOfCallSite[405].callGroovyObjectGetProperty(this), shellApkPath));
      apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    } 
    return apkPathCollection;
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
  public File getJsonPath() {
    return this.jsonPath;
  }
  
  @Generated
  public void setJsonPath(File paramFile) {
    this.jsonPath = paramFile;
  }
  
  @Generated
  public File getDexDir() {
    return this.dexDir;
  }
  
  @Generated
  public void setDexDir(File paramFile) {
    this.dexDir = paramFile;
  }
  
  @Generated
  public File getDexFile() {
    return this.dexFile;
  }
  
  @Generated
  public void setDexFile(File paramFile) {
    this.dexFile = paramFile;
  }
  
  @Generated
  public File getResourcesPath() {
    return this.resourcesPath;
  }
  
  @Generated
  public void setResourcesPath(File paramFile) {
    this.resourcesPath = paramFile;
  }
  
  @Generated
  public File getAssetsPath() {
    return this.assetsPath;
  }
  
  @Generated
  public void setAssetsPath(File paramFile) {
    this.assetsPath = paramFile;
  }
  
  @Generated
  public File getIndexPath() {
    return this.indexPath;
  }
  
  @Generated
  public void setIndexPath(File paramFile) {
    this.indexPath = paramFile;
  }
  
  @Generated
  public File getBinFile() {
    return this.binFile;
  }
  
  @Generated
  public void setBinFile(File paramFile) {
    this.binFile = paramFile;
  }
  
  @Generated
  public FileCollection getHapFiles() {
    return this.hapFiles;
  }
  
  @Generated
  public void setHapFiles(FileCollection paramFileCollection) {
    this.hapFiles = paramFileCollection;
  }
  
  @Generated
  public File getHapFileDir() {
    return this.hapFileDir;
  }
  
  @Generated
  public void setHapFileDir(File paramFile) {
    this.hapFileDir = paramFile;
  }
}
