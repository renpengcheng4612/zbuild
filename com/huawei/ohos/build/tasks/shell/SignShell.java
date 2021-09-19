package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.IncrementalTask;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.SignUtil;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFiles;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.ChangeType;
import org.gradle.work.Incremental;
import org.gradle.work.InputChanges;

public class SignShell extends IncrementalTask {
  private static final String MODULE_TYPE = "shell";
  
  @NonNull
  private static final HMLogger hmLogger;
  
  @Internal
  private BuildType buildType;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Incremental
  @InputFiles
  private FileCollection unsignedApkFiles;
  
  @OutputFiles
  private FileCollection signedApkFiles;
  
  @Internal
  private Map<File, File> signMap;
  
  static {
    Object object = $getCallSiteArray()[75].call(HMLogger.class, SignShell.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Input
  public String getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[7].call(arrayOfCallSite[8].callGetProperty(this.buildType)));
  }
  
  @Inject
  public SignShell(VariantData variantData) {
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.signMap = (Map<File, File>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object2, BuildType.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(variantData), PathInfo.class);
    PackageInfo packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(variantData), PackageInfo.class);
    arrayOfCallSite[5].callCurrent((GroovyObject)this, arrayOfCallSite[6].call(packageInfo), pathInfo);
  }
  
  public void initSignFiles(Map pathMap, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File signedApkFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callCurrent((GroovyObject)this, pathMap, pathInfo), File.class);
    arrayOfCallSite[10].callCurrent((GroovyObject)this, signedApkFile, pathMap, pathInfo);
    Object object1 = arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].call(this.signMap));
    this.unsignedApkFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object1, FileCollection.class);
    Object object2 = arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), arrayOfCallSite[16].call(this.signMap));
    this.signedApkFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object2, FileCollection.class);
  }
  
  public File initProjectSignFiles(Map pathMap, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object apkName = arrayOfCallSite[17].call(this.configInfo, this.variantData);
    File unsignedApkFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), arrayOfCallSite[20].call(Paths.class, arrayOfCallSite[21].call(pathInfo), arrayOfCallSite[22].callGroovyObjectGetProperty(this.variantData), apkName)), File.class);
    File signedApkFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), arrayOfCallSite[25].call(SignUtil.class, unsignedApkFile)), File.class);
    arrayOfCallSite[26].call(this.signMap, unsignedApkFile, signedApkFile);
    arrayOfCallSite[27].call(pathMap, arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this)), arrayOfCallSite[30].callGetProperty(signedApkFile));
    return signedApkFile;
  }
  
  public void initModuleSignFiles(File signedApkFile, Map pathMap, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[31].call(this.configInfo), "feature")) {
      List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(ModuleExtensionData.class, arrayOfCallSite[33].callGroovyObjectGetProperty(this)), List.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(entryModules)))
        arrayOfCallSite[35].call(hmLogger, arrayOfCallSite[36].callConstructor(GradleException.class, arrayOfCallSite[37].call(String.class, arrayOfCallSite[38].callGetProperty(Locale.class), "An error happened in Task: %s. Unable to pack the APK using the program package shell.", arrayOfCallSite[39].callCurrent((GroovyObject)this))), "package", arrayOfCallSite[40].call(arrayOfCallSite[41].call("the module : ", arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this))), " has no any entryModules, please check its build.gradle entryModules")); 
      String entryModule;
      Iterator iterator;
      for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[44].call(entryModules), Iterator.class); iterator.hasNext(); ) {
        entryModule = ShortTypeHandling.castToString(iterator.next());
        Object entryApkName = arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(entryModule, "_"), arrayOfCallSite[48].callGroovyObjectGetProperty(this.variantData)), "_unsigned_cut_entry.apk");
        File entryApkPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[49].call(arrayOfCallSite[50].callGroovyObjectGetProperty(this), arrayOfCallSite[51].call(Paths.class, arrayOfCallSite[52].call(pathInfo, arrayOfCallSite[53].callGetProperty(arrayOfCallSite[54].callGetProperty(arrayOfCallSite[55].call(arrayOfCallSite[56].callGetProperty(arrayOfCallSite[57].callGroovyObjectGetProperty(this)), entryModule)))), arrayOfCallSite[58].callGroovyObjectGetProperty(this.variantData), "cut", entryApkName)), File.class);
        File myEntryApkPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].call(arrayOfCallSite[60].callGroovyObjectGetProperty(this), arrayOfCallSite[61].call(Paths.class, arrayOfCallSite[62].call(pathInfo), entryModule, entryApkName)), File.class);
        File signFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[63].call(arrayOfCallSite[64].callGroovyObjectGetProperty(this), arrayOfCallSite[65].call(SignUtil.class, myEntryApkPath)), File.class);
        arrayOfCallSite[66].call(this.signMap, entryApkPath, signFile);
        String featureEntry = ShortTypeHandling.castToString(arrayOfCallSite[67].call(String.class, arrayOfCallSite[68].callGetProperty(Locale.class), "%s,%s", signedApkFile, signFile));
        arrayOfCallSite[69].call(pathMap, entryModule, featureEntry);
      } 
    } 
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call(this.configInfo)))
      return; 
    Reference signUtil = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[71].callConstructor(SignUtil.class, arrayOfCallSite[72].callGroovyObjectGetProperty(this), MODULE_TYPE, this.variantData), SignUtil.class));
    arrayOfCallSite[73].call(arrayOfCallSite[74].call(inputChanges, this.unsignedApkFiles), new _doTaskAction_closure1(this, this, signUtil));
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
  public FileCollection getUnsignedApkFiles() {
    return this.unsignedApkFiles;
  }
  
  @Generated
  public void setUnsignedApkFiles(FileCollection paramFileCollection) {
    this.unsignedApkFiles = paramFileCollection;
  }
  
  @Generated
  public FileCollection getSignedApkFiles() {
    return this.signedApkFiles;
  }
  
  @Generated
  public void setSignedApkFiles(FileCollection paramFileCollection) {
    this.signedApkFiles = paramFileCollection;
  }
  
  @Generated
  public Map<File, File> getSignMap() {
    return this.signMap;
  }
  
  @Generated
  public void setSignMap(Map<File, File> paramMap) {
    this.signMap = paramMap;
  }
  
  public final class _doTaskAction_closure1 extends Closure implements GeneratedClosure {
    public _doTaskAction_closure1(Object _outerInstance, Object _thisObject, Reference signUtil) {
      super(_outerInstance, _thisObject);
      Reference reference = signUtil;
      this.signUtil = reference;
    }
    
    public Object doCall(Object change) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File outputFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].callGetProperty(change)), File.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGetProperty(change), arrayOfCallSite[4].callGetProperty(ChangeType.class)))
        return arrayOfCallSite[5].call(outputFile); 
      return arrayOfCallSite[6].call(this.signUtil.get(), arrayOfCallSite[7].callGetProperty(change), outputFile);
    }
    
    @Generated
    public SignUtil getSignUtil() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (SignUtil)ScriptBytecodeAdapter.castToType(this.signUtil.get(), SignUtil.class);
    }
  }
}
