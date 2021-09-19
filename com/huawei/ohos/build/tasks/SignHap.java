package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.component.DeviceTypeComponent;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.SignUtil;
import groovy.json.JsonBuilder;
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
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.OutputFiles;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.Pair;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class SignHap extends DefaultTask implements GroovyObject {
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
  
  @InputFiles
  @Optional
  private FileCollection unsignedHapFiles;
  
  @OutputFiles
  @Optional
  private FileCollection signedHapFiles;
  
  @Internal
  private SignUtil signUtil;
  
  @OutputFile
  private File hapInfoFile;
  
  @Internal
  private DeviceTypeComponent.PackedModeResult packedModeResult;
  
  @Internal
  private List<String> richDevices;
  
  @Internal
  private List<String> liteDevices;
  
  static {
    Object object = $getCallSiteArray()[81].call(HMLogger.class, SignHap.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Input
  public String getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[25].call(arrayOfCallSite[26].callGetProperty(this.buildType)));
  }
  
  @Inject
  public SignHap(Pair packModelPair) {
    Object object1 = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.infoList = (List<Map<String, String>>)ScriptBytecodeAdapter.castToType(object1, List.class);
    Object object2 = arrayOfCallSite[1].callConstructor(ArrayList.class);
    this.richDevices = (List<String>)ScriptBytecodeAdapter.castToType(object2, List.class);
    Object object3 = arrayOfCallSite[2].callConstructor(ArrayList.class);
    this.liteDevices = (List<String>)ScriptBytecodeAdapter.castToType(object3, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    Object object4 = arrayOfCallSite[3].call(packModelPair);
    this.packedModeResult = (DeviceTypeComponent.PackedModeResult)ShortTypeHandling.castToEnum(object4, DeviceTypeComponent.PackedModeResult.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(packModelPair));
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(object5, VariantData.class);
    Object object6 = arrayOfCallSite[6].call(this.variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object6, BuildType.class);
    Object object7 = arrayOfCallSite[7].call(this.variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object7, PathInfo.class);
    Object object8 = arrayOfCallSite[8].call(this.variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object8, ConfigInfo.class);
    Object object9 = arrayOfCallSite[9].call(this.variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object9, PackageInfo.class);
    Object object10 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Paths.class, arrayOfCallSite[12].call(this.pathInfo), arrayOfCallSite[13].callGroovyObjectGetProperty(this.variantData), "hapInfo.json"));
    this.hapInfoFile = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
    Object object11 = arrayOfCallSite[14].callConstructor(SignUtil.class, arrayOfCallSite[15].callGroovyObjectGetProperty(this), MODULE_TYPE, this.variantData);
    this.signUtil = (SignUtil)ScriptBytecodeAdapter.castToType(object11, SignUtil.class);
    Object object12 = arrayOfCallSite[16].call(arrayOfCallSite[17].call(arrayOfCallSite[18].call(packModelPair)), new _closure1(this, this));
    this.unsignedHapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object12, FileCollection.class);
    Object object13 = arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this));
    this.signedHapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object13, FileCollection.class);
    arrayOfCallSite[21].call(this.unsignedHapFiles, new _closure2(this, this));
    arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this.configInfo)), new _closure3(this, this));
  }
  
  public final class _closure1 extends Closure implements GeneratedClosure {
    public _closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object file) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(SignHap.class, arrayOfCallSite[1].callGetProperty(file));
    }
  }
  
  public final class _closure2 extends Closure implements GeneratedClosure {
    public _closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].callConstructor(File.class, arrayOfCallSite[5].call(SignUtil.class, it)))), _closure2.class, (GroovyObject)this, "signedHapFiles");
      return arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].callConstructor(File.class, arrayOfCallSite[5].call(SignUtil.class, it))));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _closure3 extends Closure implements GeneratedClosure {
    public _closure3(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].call(DeviceType.class, it))))
        return arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), it); 
      return arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void copyRichDeviceHap(File signedHapFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[27].call(this.configInfo), "feature")) {
      String signedHapName = ShortTypeHandling.castToString(arrayOfCallSite[28].callGetProperty(signedHapFile));
      String entryModule = ShortTypeHandling.castToString(arrayOfCallSite[29].call(signedHapName, arrayOfCallSite[30].call(arrayOfCallSite[31].call(signedHapName, "-"), Integer.valueOf(1))));
      Object object = arrayOfCallSite[32].call(entryModule, Integer.valueOf(0), arrayOfCallSite[33].call(entryModule, "-"));
      entryModule = ShortTypeHandling.castToString(object);
      Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].call(arrayOfCallSite[35].call(arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this))), entryModule), Project.class);
      ConfigInfo entryProfile = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].call(arrayOfCallSite[39].call(GlobalDataManager.class, arrayOfCallSite[40].callGroovyObjectGetProperty(this)), entryProject), ConfigInfo.class);
      List deviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[41].call(entryProfile), List.class);
      String device;
      Iterator iterator;
      for (device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].call(deviceType), Iterator.class); iterator.hasNext(); ) {
        device = ShortTypeHandling.castToString(iterator.next());
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[43].call(arrayOfCallSite[44].call(this.configInfo), device)))
          continue; 
        arrayOfCallSite[45].callCurrent(this, device, arrayOfCallSite[46].callGetProperty(signedHapFile), arrayOfCallSite[47].callGetProperty(signedHapFile), this.infoList);
      } 
    } else {
      String device;
      Iterator iterator;
      for (device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].call(this.richDevices), Iterator.class); iterator.hasNext(); ) {
        device = ShortTypeHandling.castToString(iterator.next());
        arrayOfCallSite[49].callCurrent(this, device, arrayOfCallSite[50].callGetProperty(signedHapFile), arrayOfCallSite[51].callGetProperty(signedHapFile), this.infoList);
      } 
    } 
  }
  
  public void copyLiteDeviceHap(File signedHapFile) {
    CallSite[] arrayOfCallSite;
    String device;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), device = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[52].call(this.liteDevices), Iterator.class); iterator.hasNext(); ) {
      device = ShortTypeHandling.castToString(iterator.next());
      arrayOfCallSite[53].callCurrent(this, device, arrayOfCallSite[54].callGetProperty(signedHapFile), arrayOfCallSite[55].callGetProperty(signedHapFile), this.infoList);
    } 
  }
  
  private void writeHapInfoFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference hapInfo = new Reference(arrayOfCallSite[56].callConstructor(JsonBuilder.class, this.infoList));
    arrayOfCallSite[57].call(this.hapInfoFile, "utf-8", new _writeHapInfoFile_closure4(this, this, hapInfo));
  }
  
  public final class _writeHapInfoFile_closure4 extends Closure implements GeneratedClosure {
    public _writeHapInfoFile_closure4(Object _outerInstance, Object _thisObject, Reference hapInfo) {
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
    Map deviceMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[59].call(deviceMap, "device", device);
    arrayOfCallSite[60].call(deviceMap, "hapPath", hapName);
    arrayOfCallSite[61].call(infoList, deviceMap);
    Object deviceName = device;
    if (ScriptBytecodeAdapter.compareEqual(device, "default"))
      String str = "phone"; 
    Reference projectBuildDir = new Reference(arrayOfCallSite[62].call(arrayOfCallSite[63].call(Paths.class, arrayOfCallSite[64].call(this.pathInfo), arrayOfCallSite[65].callGroovyObjectGetProperty(this.variantData), deviceName)));
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[69].call(projectBuildDir.get()))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call(projectBuildDir.get())))))
        arrayOfCallSite[71].call(projectBuildDir.get()); 
    } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[66].call(projectBuildDir.get()))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[67].call(projectBuildDir.get()))))) {
      arrayOfCallSite[68].call(projectBuildDir.get());
    } 
    Reference hapModuleName = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[72].call(hapName, Integer.valueOf(0), arrayOfCallSite[73].call(hapName, "-"))));
    arrayOfCallSite[74].call(arrayOfCallSite[75].call(projectBuildDir.get()), new _copyHapsToRoot_closure5(this, this, hapModuleName));
    arrayOfCallSite[76].call(arrayOfCallSite[77].callGroovyObjectGetProperty(this), new _copyHapsToRoot_closure6(this, this, reference1, projectBuildDir));
  }
  
  public final class _copyHapsToRoot_closure5 extends Closure implements GeneratedClosure {
    public _copyHapsToRoot_closure5(Object _outerInstance, Object _thisObject, Reference hapModuleName) {
      super(_outerInstance, _thisObject);
      Reference reference = hapModuleName;
      this.hapModuleName = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), this.hapModuleName.get()))) {
        arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(SignHap.class), "Delete", arrayOfCallSite[4].call(arrayOfCallSite[5].call("Delete old file:", arrayOfCallSite[6].callGetProperty(it)), new GStringImpl(new Object[] { arrayOfCallSite[7].callGetProperty(it) }, new String[] { ",since it has same prefix '", "'." })));
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
  
  public final class _copyHapsToRoot_closure6 extends Closure implements GeneratedClosure {
    public _copyHapsToRoot_closure6(Object _outerInstance, Object _thisObject, Reference signedHapPath, Reference projectBuildDir) {
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
  
  @TaskAction
  public void doTaskAction() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[78].call(this.unsignedHapFiles, new _doTaskAction_closure7(this, this));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      writeHapInfoFile();
      null;
      return;
    } 
    arrayOfCallSite[79].callCurrent(this);
  }
  
  public final class _doTaskAction_closure7 extends Closure implements GeneratedClosure {
    public _doTaskAction_closure7(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File outputFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(Paths.class, arrayOfCallSite[2].call(SignUtil.class, it))), File.class);
      arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this), it, outputFile);
      File pushFile = (File)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(outputFile)) ? outputFile : it, File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this)))) {
        arrayOfCallSite[8].callCurrent((GroovyObject)this, pushFile);
        return null;
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)))) {
        arrayOfCallSite[11].callCurrent((GroovyObject)this, pushFile);
        return null;
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this)))) {
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(pushFile), "-rich-"))) {
          arrayOfCallSite[16].callCurrent((GroovyObject)this, pushFile);
        } else {
          arrayOfCallSite[17].callCurrent((GroovyObject)this, pushFile);
        } 
        return null;
      } 
      return null;
    }
  }
  
  private static boolean isNeedSign(String fileName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return !DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[80].call(fileName, "-app-unsigned"));
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
  public SignUtil getSignUtil() {
    return this.signUtil;
  }
  
  @Generated
  public void setSignUtil(SignUtil paramSignUtil) {
    this.signUtil = paramSignUtil;
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
  public DeviceTypeComponent.PackedModeResult getPackedModeResult() {
    return this.packedModeResult;
  }
  
  @Generated
  public void setPackedModeResult(DeviceTypeComponent.PackedModeResult paramPackedModeResult) {
    this.packedModeResult = paramPackedModeResult;
  }
  
  @Generated
  public List<String> getRichDevices() {
    return this.richDevices;
  }
  
  @Generated
  public void setRichDevices(List<String> paramList) {
    this.richDevices = paramList;
  }
  
  @Generated
  public List<String> getLiteDevices() {
    return this.liteDevices;
  }
  
  @Generated
  public void setLiteDevices(List<String> paramList) {
    this.liteDevices = paramList;
  }
}
