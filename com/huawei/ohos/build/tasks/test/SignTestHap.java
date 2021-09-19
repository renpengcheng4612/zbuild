package com.huawei.ohos.build.tasks.test;

import com.huawei.ohos.build.HarmonyHapPluginMain;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.IncrementalTask;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.SignUtil;
import groovy.json.JsonBuilder;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.OutputFiles;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.ChangeType;
import org.gradle.work.Incremental;
import org.gradle.work.InputChanges;

public class SignTestHap extends IncrementalTask {
  private static final String MODULE_TYPE = "hap";
  
  @NonNull
  private static final HMLogger HM_LOGGER;
  
  @Internal
  private BuildType buildType;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private PathInfo pathInfo;
  
  @Internal
  private PackageInfo packageInfo;
  
  @Internal
  private List<Map<String, String>> infoList;
  
  @Internal
  private SignUtil signUtil;
  
  @Incremental
  @InputFiles
  private FileCollection unsignedHapFiles;
  
  @OutputFiles
  private FileCollection signedHapFiles;
  
  @Internal
  private Map<File, File> signedMap;
  
  @OutputFile
  private File hapInfoFile;
  
  @OutputDirectory
  private File projectBuildRootDir;
  
  static {
    Object object = $getCallSiteArray()[151].call(HMLogger.class, SignTestHap.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Input
  public String getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[17].call(arrayOfCallSite[18].callGetProperty(this.buildType)));
  }
  
  @Inject
  public SignTestHap(VariantData variantData) {
    Object object1 = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.infoList = (List<Map<String, String>>)ScriptBytecodeAdapter.castToType(object1, List.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HashMap.class);
    this.signedMap = (Map<File, File>)ScriptBytecodeAdapter.castToType(object2, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object3 = arrayOfCallSite[2].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object3, BuildType.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object5, ConfigInfo.class);
    Object object6 = arrayOfCallSite[5].call(variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object6, PackageInfo.class);
    Object object7 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.pathInfo), arrayOfCallSite[9].callGroovyObjectGetProperty(variantData), "hapInfo.json"));
    this.hapInfoFile = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[10].callConstructor(SignUtil.class, arrayOfCallSite[11].callGroovyObjectGetProperty(this), MODULE_TYPE, variantData);
    this.signUtil = (SignUtil)ScriptBytecodeAdapter.castToType(object8, SignUtil.class);
    Object object9 = arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(this.pathInfo), arrayOfCallSite[15].callGroovyObjectGetProperty(variantData)));
    this.projectBuildRootDir = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      initSignedMap();
      null;
      return;
    } 
    arrayOfCallSite[16].callCurrent((GroovyObject)this);
  }
  
  public void initSignedMap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(this.configInfo))) {
        processLiteDeviceHap();
        null;
      } else {
        processRichDeviceHap();
        null;
      } 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(this.configInfo))) {
      arrayOfCallSite[20].callCurrent((GroovyObject)this);
    } else {
      arrayOfCallSite[21].callCurrent((GroovyObject)this);
    } 
    Object object1 = arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), arrayOfCallSite[25].call(this.signedMap));
    this.unsignedHapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object1, FileCollection.class);
    Object object2 = arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), arrayOfCallSite[28].call(this.signedMap));
    this.signedHapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object2, FileCollection.class);
  }
  
  private void processRichDeviceHap() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[29].call(this.configInfo), "feature")) {
      VariantData mainVariantData = (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].call(arrayOfCallSite[31].call(arrayOfCallSite[32].call(arrayOfCallSite[33].callGetProperty(arrayOfCallSite[34].callGroovyObjectGetProperty(this)), HarmonyHapPluginMain.class)), this.buildType), VariantData.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(mainVariantData)), "feature")) {
        List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[37].call(ModuleExtensionData.class, arrayOfCallSite[38].callGroovyObjectGetProperty(this)), List.class);
        String entryModule;
        Iterator iterator;
        for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(entryModules), Iterator.class); iterator.hasNext(); ) {
          entryModule = ShortTypeHandling.castToString(iterator.next());
          String hapPath = ShortTypeHandling.castToString(arrayOfCallSite[40].call(arrayOfCallSite[41].call(this.packageInfo), arrayOfCallSite[42].call(entryModule, "_test")));
          File unsignedHapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(arrayOfCallSite[44].callGroovyObjectGetProperty(this), hapPath), File.class);
          File signedHapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(SignUtil.class, unsignedHapFile))), File.class);
          arrayOfCallSite[48].call(this.signedMap, unsignedHapFile, signedHapFile);
        } 
      } else {
        String hapPath = ShortTypeHandling.castToString(arrayOfCallSite[49].call(arrayOfCallSite[50].call(this.packageInfo), arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].callGroovyObjectGetProperty(this)), "_test")));
        File unsignedHapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this), hapPath), File.class);
        File signedHapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(arrayOfCallSite[57].call(Paths.class, arrayOfCallSite[58].call(SignUtil.class, unsignedHapFile))), File.class);
        arrayOfCallSite[59].call(this.signedMap, unsignedHapFile, signedHapFile);
      } 
    } 
  }
  
  public void copyRichDeviceHap(File signedHapFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[60].call(this.configInfo), "feature")) {
      VariantData mainVariantData = (VariantData)ScriptBytecodeAdapter.castToType(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].callGetProperty(arrayOfCallSite[65].callGroovyObjectGetProperty(this)), HarmonyHapPluginMain.class)), this.buildType), VariantData.class);
      List deviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[66].callConstructor(ArrayList.class), List.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[67].call(arrayOfCallSite[68].callGroovyObjectGetProperty(mainVariantData)), "feature")) {
        String signedHapName = ShortTypeHandling.castToString(arrayOfCallSite[69].callGetProperty(signedHapFile));
        String entryModule = ShortTypeHandling.castToString(arrayOfCallSite[70].call(signedHapName, arrayOfCallSite[71].call(arrayOfCallSite[72].call(signedHapName, "-"), Integer.valueOf(1))));
        Object object1 = arrayOfCallSite[73].call(entryModule, Integer.valueOf(0), arrayOfCallSite[74].call(entryModule, "-"));
        entryModule = ShortTypeHandling.castToString(object1);
        Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].call(arrayOfCallSite[78].callGroovyObjectGetProperty(this))), entryModule), Project.class);
        ConfigInfo entryProfile = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[79].call(arrayOfCallSite[80].call(GlobalDataManager.class, arrayOfCallSite[81].callGroovyObjectGetProperty(this)), entryProject), ConfigInfo.class);
        Object object2 = arrayOfCallSite[82].call(entryProfile);
        deviceType = (List)ScriptBytecodeAdapter.castToType(object2, List.class);
      } else {
        ConfigInfo entryConfig = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[83].call(arrayOfCallSite[84].call(GlobalDataManager.class, arrayOfCallSite[85].callGroovyObjectGetProperty(this)), arrayOfCallSite[86].callGroovyObjectGetProperty(this)), ConfigInfo.class);
        Object object = arrayOfCallSite[87].call(entryConfig);
        deviceType = (List)ScriptBytecodeAdapter.castToType(object, List.class);
      } 
      String device;
      Iterator iterator;
      for (device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[88].call(deviceType), Iterator.class); iterator.hasNext(); ) {
        device = ShortTypeHandling.castToString(iterator.next());
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[89].call(arrayOfCallSite[90].call(this.configInfo), device)))
          continue; 
        arrayOfCallSite[91].callCurrent((GroovyObject)this, device, arrayOfCallSite[92].callGetProperty(signedHapFile), arrayOfCallSite[93].callGetProperty(signedHapFile), this.infoList);
      } 
    } 
  }
  
  private void processLiteDeviceHap() {
    CallSite[] arrayOfCallSite;
    Map.Entry hapPath;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), hapPath = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[94].call(arrayOfCallSite[95].call(arrayOfCallSite[96].call(this.packageInfo))), Iterator.class); iterator.hasNext(); ) {
      hapPath = (Map.Entry)ScriptBytecodeAdapter.castToType(iterator.next(), Map.Entry.class);
      String key = ShortTypeHandling.castToString(arrayOfCallSite[97].callGetProperty(hapPath));
      String coreKey = ShortTypeHandling.castToString(arrayOfCallSite[98].call(key, Integer.valueOf(0), arrayOfCallSite[99].call(key, "-")));
      String device = ShortTypeHandling.castToString(arrayOfCallSite[100].call(coreKey, arrayOfCallSite[101].call(arrayOfCallSite[102].call(coreKey, "-"), Integer.valueOf(1))));
      String hapType = ShortTypeHandling.castToString(arrayOfCallSite[103].call(coreKey, Integer.valueOf(0), arrayOfCallSite[104].call(coreKey, "-")));
      Object object = arrayOfCallSite[105].call(hapType, arrayOfCallSite[106].call(arrayOfCallSite[107].call(hapType, "-"), Integer.valueOf(1)));
      hapType = ShortTypeHandling.castToString(object);
      if (!((ScriptBytecodeAdapter.compareEqual(device, arrayOfCallSite[108].callGetProperty(arrayOfCallSite[109].callGetProperty(DeviceType.class))) && ScriptBytecodeAdapter.compareEqual(hapType, "app")) ? 1 : 0)) {
        File hapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[110].call(arrayOfCallSite[111].call(Paths.class, arrayOfCallSite[112].callGetProperty(hapPath))), File.class);
        File signedHapFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[113].call(arrayOfCallSite[114].call(Paths.class, arrayOfCallSite[115].call(SignUtil.class, hapFile))), File.class);
        arrayOfCallSite[116].call(this.signedMap, hapFile, signedHapFile);
      } 
    } 
  }
  
  public void copyLiteDeviceHap(File signedHapFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String signedHapName = ShortTypeHandling.castToString(arrayOfCallSite[117].callGetProperty(signedHapFile));
    String device = ShortTypeHandling.castToString(arrayOfCallSite[118].call(signedHapName, Integer.valueOf(0), arrayOfCallSite[119].call(signedHapName, "-")));
    Object object = arrayOfCallSite[120].call(device, arrayOfCallSite[121].call(arrayOfCallSite[122].call(device, "-"), Integer.valueOf(1)));
    device = ShortTypeHandling.castToString(object);
    arrayOfCallSite[123].callCurrent((GroovyObject)this, device, arrayOfCallSite[124].callGetProperty(signedHapFile), arrayOfCallSite[125].callGetProperty(signedHapFile), this.infoList);
  }
  
  private void writeHapInfoFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference hapInfo = new Reference(arrayOfCallSite[126].callConstructor(JsonBuilder.class, this.infoList));
    arrayOfCallSite[127].call(this.hapInfoFile, "utf-8", new _writeHapInfoFile_closure1(this, this, hapInfo));
  }
  
  public final class _writeHapInfoFile_closure1 extends Closure implements GeneratedClosure {
    public _writeHapInfoFile_closure1(Object _outerInstance, Object _thisObject, Reference hapInfo) {
      super(_outerInstance, _thisObject);
      Reference reference = hapInfo;
      this.hapInfo = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(this.hapInfo.get()));
    }
    
    @Generated
    public Object getHapInfo() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.hapInfo.get();
    }
  }
  
  private void copyHapsToRoot(String device, String hapName, String signedHapPath, List infoList) {
    Reference reference1 = new Reference(signedHapPath);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map deviceMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[128].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[129].call(deviceMap, "device", device);
    arrayOfCallSite[130].call(deviceMap, "hapPath", hapName);
    arrayOfCallSite[131].call(infoList, deviceMap);
    Object deviceName = device;
    if (ScriptBytecodeAdapter.compareEqual(device, "default"))
      String str = "phone"; 
    Reference projectBuildDir = new Reference(arrayOfCallSite[132].call(arrayOfCallSite[133].call(Paths.class, arrayOfCallSite[134].call(this.pathInfo), arrayOfCallSite[135].callGroovyObjectGetProperty(this.variantData), deviceName)));
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[139].call(projectBuildDir.get()))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[140].call(projectBuildDir.get())))))
        arrayOfCallSite[141].call(projectBuildDir.get()); 
    } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[136].call(projectBuildDir.get()))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[137].call(projectBuildDir.get()))))) {
      arrayOfCallSite[138].call(projectBuildDir.get());
    } 
    Reference hapModuleName = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[142].call(hapName, Integer.valueOf(0), arrayOfCallSite[143].call(hapName, "-"))));
    arrayOfCallSite[144].call(arrayOfCallSite[145].call(projectBuildDir.get()), new _copyHapsToRoot_closure2(this, this, hapModuleName));
    arrayOfCallSite[146].call(arrayOfCallSite[147].callGroovyObjectGetProperty(this), new _copyHapsToRoot_closure3(this, this, reference1, projectBuildDir));
  }
  
  public final class _copyHapsToRoot_closure2 extends Closure implements GeneratedClosure {
    public _copyHapsToRoot_closure2(Object _outerInstance, Object _thisObject, Reference hapModuleName) {
      super(_outerInstance, _thisObject);
      Reference reference = hapModuleName;
      this.hapModuleName = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), this.hapModuleName.get()))) {
        arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(SignTestHap.class), "Delete", arrayOfCallSite[4].call(arrayOfCallSite[5].call("Delete old file:", arrayOfCallSite[6].callGetProperty(it)), new GStringImpl(new Object[] { arrayOfCallSite[7].callGetProperty(it) }, new String[] { ",since it has same prefix '", "'." })));
        return arrayOfCallSite[8].call(it);
      } 
      return null;
    }
    
    @Generated
    public String getHapModuleName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.hapModuleName.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _copyHapsToRoot_closure3 extends Closure implements GeneratedClosure {
    public _copyHapsToRoot_closure3(Object _outerInstance, Object _thisObject, Reference signedHapPath, Reference projectBuildDir) {
      super(_outerInstance, _thisObject);
      Reference reference1 = signedHapPath;
      this.signedHapPath = reference1;
      Reference reference2 = projectBuildDir;
      this.projectBuildDir = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.signedHapPath.get());
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.projectBuildDir.get());
    }
    
    @Generated
    public String getSignedHapPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.signedHapPath.get());
    }
    
    @Generated
    public Object getProjectBuildDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.projectBuildDir.get();
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[148].call(arrayOfCallSite[149].call(inputChanges, this.unsignedHapFiles), new _doTaskAction_closure4(this, this));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      writeHapInfoFile();
      null;
      return;
    } 
    arrayOfCallSite[150].callCurrent((GroovyObject)this);
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
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
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
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
  public PackageInfo getPackageInfo() {
    return this.packageInfo;
  }
  
  @Generated
  public void setPackageInfo(PackageInfo paramPackageInfo) {
    this.packageInfo = paramPackageInfo;
  }
  
  @Generated
  public List<Map<String, String>> getInfoList() {
    return this.infoList;
  }
  
  @Generated
  public void setInfoList(List<Map<String, String>> paramList) {
    this.infoList = paramList;
  }
  
  @Generated
  public SignUtil getSignUtil() {
    return this.signUtil;
  }
  
  @Generated
  public void setSignUtil(SignUtil paramSignUtil) {
    this.signUtil = paramSignUtil;
  }
  
  @Generated
  public FileCollection getUnsignedHapFiles() {
    return this.unsignedHapFiles;
  }
  
  @Generated
  public void setUnsignedHapFiles(FileCollection paramFileCollection) {
    this.unsignedHapFiles = paramFileCollection;
  }
  
  @Generated
  public FileCollection getSignedHapFiles() {
    return this.signedHapFiles;
  }
  
  @Generated
  public void setSignedHapFiles(FileCollection paramFileCollection) {
    this.signedHapFiles = paramFileCollection;
  }
  
  @Generated
  public Map<File, File> getSignedMap() {
    return this.signedMap;
  }
  
  @Generated
  public void setSignedMap(Map<File, File> paramMap) {
    this.signedMap = paramMap;
  }
  
  @Generated
  public File getHapInfoFile() {
    return this.hapInfoFile;
  }
  
  @Generated
  public void setHapInfoFile(File paramFile) {
    this.hapInfoFile = paramFile;
  }
  
  @Generated
  public File getProjectBuildRootDir() {
    return this.projectBuildRootDir;
  }
  
  @Generated
  public void setProjectBuildRootDir(File paramFile) {
    this.projectBuildRootDir = paramFile;
  }
  
  public final class _doTaskAction_closure4 extends Closure implements GeneratedClosure {
    public _doTaskAction_closure4(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object change) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File outputFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].callGetProperty(change)), File.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGetProperty(change), arrayOfCallSite[4].callGetProperty(ChangeType.class))) {
        if (ScriptBytecodeAdapter.compareNotEqual(outputFile, null))
          return arrayOfCallSite[5].call(outputFile); 
        return null;
      } 
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].callGetProperty(change), outputFile);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)))) {
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(outputFile)))
          return arrayOfCallSite[12].callCurrent((GroovyObject)this, arrayOfCallSite[13].callGetProperty(change)); 
        return arrayOfCallSite[14].callCurrent((GroovyObject)this, outputFile);
      } 
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(outputFile)))
        return arrayOfCallSite[16].callCurrent((GroovyObject)this, arrayOfCallSite[17].callGetProperty(change)); 
      return arrayOfCallSite[18].callCurrent((GroovyObject)this, outputFile);
    }
  }
}
