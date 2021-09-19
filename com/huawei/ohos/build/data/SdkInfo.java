package com.huawei.ohos.build.data;

import com.huawei.deveco.sdkmanager.common.api.CommonSdkInfoHandler;
import com.huawei.deveco.sdkmanager.common.api.SdkComponent;
import com.huawei.deveco.sdkmanager.common.api.SdkInfoConfig;
import com.huawei.deveco.sdkmanager.common.api.SdkInfoHandler;
import com.huawei.deveco.sdkmanager.common.api.SdkInfoProgress;
import com.huawei.deveco.sdkmanager.common.api.SdkInfoProxy;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.proxy.DownloadProxyFilter;
import com.huawei.ohos.build.utils.proxy.ProxyInfoOptions;
import com.huawei.ohos.build.utils.validate.ValidateUtil;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.internal.os.OperatingSystem;

public class SdkInfo implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private Project project;
  
  private ConfigInfo configInfo;
  
  private PathConfiguration pathConfiguration;
  
  private String hwSdkDir;
  
  private String nativeDir;
  
  private String nodeJsDir;
  
  private String npmDir;
  
  private String npmConfigDir;
  
  private int sdkVersion;
  
  private String sdkJavaDir;
  
  private String sdkJsDir;
  
  public String sdkNativeDir;
  
  private String sdkToolChainsDir;
  
  private String apiDir;
  
  private String buildToolsDir;
  
  private String debugToolsDir;
  
  private String d8;
  
  private String d8Dir;
  
  private String aapt2;
  
  private String idl;
  
  private String restool;
  
  private String packageTool;
  
  private String unpacking_tool;
  
  private String signDir;
  
  private String assistantDir;
  
  private String jsLoader;
  
  private String proguard;
  
  private String dataBindingJar;
  
  private String jsBinaryTool;
  
  public String cmakeLists;
  
  public boolean haveJsModule;
  
  public boolean haveNative;
  
  private Map<String, Integer> components;
  
  private String proguardDefaultRulesDir;
  
  static {
    Object object = $getCallSiteArray()[154].call(HMLogger.class, SdkInfo.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public SdkInfo(Project project, ConfigInfo configInfo) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    ConfigInfo configInfo1 = configInfo;
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(configInfo1, ConfigInfo.class);
    Object object = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(project));
    this.sdkVersion = DefaultTypeTransformation.intUnbox(object);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      initComponents();
      null;
    } else {
      arrayOfCallSite[2].callCurrent(this);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      getPathConfiguration();
      null;
    } else {
      arrayOfCallSite[3].callCurrent(this);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      getComponentVersion();
      null;
    } else {
      arrayOfCallSite[4].callCurrent(this);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      getBuildToolPath();
      null;
    } else {
      arrayOfCallSite[5].callCurrent(this);
    } 
    arrayOfCallSite[6].call(ValidateUtil.class, this);
  }
  
  private void initComponents() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object = arrayOfCallSite[7].callConstructor(HashMap.class);
    this.components = (Map<String, Integer>)ScriptBytecodeAdapter.castToType(object, Map.class);
    arrayOfCallSite[8].call(this.components, arrayOfCallSite[9].callGetProperty(SdkConst.class), Integer.valueOf(this.sdkVersion));
    arrayOfCallSite[10].call(this.components, arrayOfCallSite[11].callGetProperty(SdkConst.class), Integer.valueOf(0));
    if ((ScriptBytecodeAdapter.compareNotEqual(this.configInfo, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(this.configInfo)))) {
      boolean bool = true;
      this.haveJsModule = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
      arrayOfCallSite[13].call(this.components, arrayOfCallSite[14].callGetProperty(SdkConst.class), Integer.valueOf(this.sdkVersion));
    } 
    ExternalNativeBuild nativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callGetProperty(arrayOfCallSite[16].callGetProperty(this.project)), ExternalNativeBuild.class);
    if ((ScriptBytecodeAdapter.compareNotEqual(nativeBuild, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(nativeBuild)))) {
      boolean bool = true;
      this.haveNative = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
      arrayOfCallSite[18].call(this.components, arrayOfCallSite[19].callGetProperty(SdkConst.class), Integer.valueOf(this.sdkVersion));
      Object object1 = arrayOfCallSite[20].call(arrayOfCallSite[21].call(Paths.class, arrayOfCallSite[22].call(arrayOfCallSite[23].call(this.project)), arrayOfCallSite[24].callGroovyObjectGetProperty(nativeBuild)));
      this.cmakeLists = ShortTypeHandling.castToString(object1);
    } 
  }
  
  private void getPathConfiguration() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object1 = arrayOfCallSite[25].callConstructor(PathConfiguration.class, this.project);
    this.pathConfiguration = (PathConfiguration)ScriptBytecodeAdapter.castToType(object1, PathConfiguration.class);
    Object object2 = arrayOfCallSite[26].call(this.pathConfiguration);
    this.hwSdkDir = ShortTypeHandling.castToString(object2);
    Object object3 = arrayOfCallSite[27].call(this.pathConfiguration);
    this.nativeDir = ShortTypeHandling.castToString(object3);
    Object object4 = arrayOfCallSite[28].call(this.pathConfiguration);
    this.nodeJsDir = ShortTypeHandling.castToString(object4);
    Object object5 = arrayOfCallSite[29].call(this.pathConfiguration);
    this.npmDir = ShortTypeHandling.castToString(object5);
    Object object6 = arrayOfCallSite[30].call(this.pathConfiguration);
    this.npmConfigDir = ShortTypeHandling.castToString(object6);
  }
  
  private void getComponentVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((this.sdkVersion == 0))
        throw (Throwable)arrayOfCallSite[32].callConstructor(GradleException.class, "Verify that 'compileSdkVersion' is correctly set in build.gradle."); 
    } else if ((this.sdkVersion == 0)) {
      throw (Throwable)arrayOfCallSite[31].callConstructor(GradleException.class, "Verify that 'compileSdkVersion' is correctly set in build.gradle.");
    } 
    try {
      ProxyInfoOptions proxyInfoOptions = (ProxyInfoOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(ProxyInfoOptions.class, this.project), ProxyInfoOptions.class);
      SdkInfoConfig sdkInfoConfig = null;
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(proxyInfoOptions))) {
        Object object = arrayOfCallSite[35].call(arrayOfCallSite[36].call(arrayOfCallSite[37].call(SdkInfoConfig.class, this.hwSdkDir), this.npmDir), this.npmConfigDir);
        sdkInfoConfig = (SdkInfoConfig)ScriptBytecodeAdapter.castToType(object, SdkInfoConfig.class);
      } else {
        Object object = arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(SdkInfoConfig.class, this.hwSdkDir), this.npmDir), this.npmConfigDir), arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(SdkInfoProxy.class, arrayOfCallSite[45].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[46].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[47].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[48].callGroovyObjectGetProperty(proxyInfoOptions)), arrayOfCallSite[49].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[50].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[51].callGroovyObjectGetProperty(proxyInfoOptions), arrayOfCallSite[52].callGroovyObjectGetProperty(proxyInfoOptions)), arrayOfCallSite[53].callConstructor(DownloadProxyFilter.class, arrayOfCallSite[54].callGroovyObjectGetProperty(proxyInfoOptions))));
        sdkInfoConfig = (SdkInfoConfig)ScriptBytecodeAdapter.castToType(object, SdkInfoConfig.class);
      } 
      SdkInfoHandler sdkInfoHandler = (SdkInfoHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].callConstructor(CommonSdkInfoHandler.class, sdkInfoConfig), SdkInfoHandler.class);
      Map localDetectionResult = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(sdkInfoHandler, this.components), Map.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].callCurrent(this, localDetectionResult))) {
        arrayOfCallSite[58].call(sdkInfoHandler, new GroovyObject() {
              public void info(String msg) {
                CallSite[] arrayOfCallSite = $getCallSiteArray();
                arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(SdkInfo.class), msg);
              }
            });
        Map resultMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].call(sdkInfoHandler, this.components), Map.class);
        arrayOfCallSite[60].callCurrent(this, resultMap);
      } 
    } catch (Exception e) {
      String msg = ShortTypeHandling.castToString(arrayOfCallSite[61].call(String.class, arrayOfCallSite[62].callGetProperty(Locale.class), "Unable to download the HarmonyOS SDK. %s", arrayOfCallSite[63].call(e)));
      throw (Throwable)arrayOfCallSite[64].callConstructor(GradleException.class, msg, e);
    } finally {}
    Object object1 = arrayOfCallSite[65].call(arrayOfCallSite[66].call(Paths.class, this.sdkJavaDir, arrayOfCallSite[67].callGetProperty(SdkConst.class)));
    this.apiDir = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[68].call(arrayOfCallSite[69].call(Paths.class, this.sdkJavaDir, arrayOfCallSite[70].callGetProperty(SdkConst.class), arrayOfCallSite[71].callGetProperty(SdkConst.class)));
    this.buildToolsDir = ShortTypeHandling.castToString(object2);
    if (this.haveJsModule) {
      arrayOfCallSite[72].call(DataChecker.class, arrayOfCallSite[73].call(Paths.class, this.sdkJsDir, arrayOfCallSite[74].callGetProperty(SdkConst.class), arrayOfCallSite[75].callGetProperty(SdkConst.class)), this.project, this.npmDir, this.sdkJsDir);
      Object object3 = arrayOfCallSite[76].call(arrayOfCallSite[77].call(Paths.class, this.sdkJsDir, arrayOfCallSite[78].callGetProperty(SdkConst.class)));
      this.debugToolsDir = ShortTypeHandling.castToString(object3);
      Object object4 = arrayOfCallSite[79].call(arrayOfCallSite[80].call(Paths.class, this.sdkJsDir, arrayOfCallSite[81].callGetProperty(SdkConst.class), arrayOfCallSite[82].callGetProperty(SdkConst.class)));
      this.jsLoader = ShortTypeHandling.castToString(object4);
      Object object5 = arrayOfCallSite[83].call(arrayOfCallSite[84].call(Paths.class, this.sdkJsDir, arrayOfCallSite[85].callGetProperty(SdkConst.class), arrayOfCallSite[86].callGetProperty(SdkConst.class), arrayOfCallSite[87].callGetProperty(SdkConst.class)));
      this.jsBinaryTool = ShortTypeHandling.castToString(object5);
    } 
    if ((this.haveNative && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[88].call(FileUtils.class, this.nativeDir))))) {
      String str = this.sdkNativeDir;
      this.nativeDir = ShortTypeHandling.castToString(str);
    } 
  }
  
  private boolean isDownloadSdk(Map versions) {
    CallSite[] arrayOfCallSite;
    Map.Entry entry;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), entry = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[89].call(arrayOfCallSite[90].call(versions)), Iterator.class); iterator.hasNext(); ) {
      entry = (Map.Entry)ScriptBytecodeAdapter.castToType(iterator.next(), Map.Entry.class);
      SdkComponent version = (SdkComponent)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].call(entry), SdkComponent.class);
      if (ScriptBytecodeAdapter.compareEqual(version, null))
        return true; 
      Object object = arrayOfCallSite[92].call(entry);
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[93].callGetProperty(SdkConst.class))) {
        Object object1 = arrayOfCallSite[94].callGetProperty(version);
        this.sdkJavaDir = ShortTypeHandling.castToString(object1);
        continue;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[95].callGetProperty(SdkConst.class))) {
        Object object1 = arrayOfCallSite[96].callGetProperty(version);
        this.sdkJsDir = ShortTypeHandling.castToString(object1);
        continue;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[97].callGetProperty(SdkConst.class))) {
        Object object1 = arrayOfCallSite[98].callGetProperty(version);
        this.sdkToolChainsDir = ShortTypeHandling.castToString(object1);
        continue;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[99].callGetProperty(SdkConst.class))) {
        Object object1 = arrayOfCallSite[100].callGetProperty(version);
        this.sdkNativeDir = ShortTypeHandling.castToString(object1);
      } 
    } 
    return false;
  }
  
  private void parsePathAndApi(Map versions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[101].call(versions, new _parsePathAndApi_closure1(this, this));
  }
  
  public final class _parsePathAndApi_closure1 extends Closure implements GeneratedClosure {
    public _parsePathAndApi_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object k, Object sdkComponent) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Object object = k;
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[0].callGetProperty(SdkConst.class))) {
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[6].call(sdkComponent), arrayOfCallSite[7].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[8].call(sdkComponent), arrayOfCallSite[9].callGroovyObjectGetProperty(this)))) {
            Object object1 = arrayOfCallSite[10].callGetProperty(sdkComponent);
            ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkJavaDir");
            return object1;
          } 
          return null;
        } 
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[1].call(sdkComponent), arrayOfCallSite[2].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].call(sdkComponent), arrayOfCallSite[4].callGroovyObjectGetProperty(this)))) {
          Object object1 = arrayOfCallSite[5].callGetProperty(sdkComponent);
          ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkJavaDir");
          return object1;
        } 
        return null;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[11].callGetProperty(SdkConst.class))) {
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].call(sdkComponent), arrayOfCallSite[17].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[18].call(sdkComponent), Integer.valueOf(0)))) {
            Object object1 = arrayOfCallSite[19].callGetProperty(sdkComponent);
            ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkToolChainsDir");
            return object1;
          } 
          return null;
        } 
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[12].call(sdkComponent), arrayOfCallSite[13].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[14].call(sdkComponent), Integer.valueOf(0)))) {
          Object object1 = arrayOfCallSite[15].callGetProperty(sdkComponent);
          ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkToolChainsDir");
          return object1;
        } 
        return null;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[20].callGetProperty(SdkConst.class))) {
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[26].call(sdkComponent), arrayOfCallSite[27].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[28].call(sdkComponent), arrayOfCallSite[29].callGroovyObjectGetProperty(this)))) {
            Object object1 = arrayOfCallSite[30].callGetProperty(sdkComponent);
            ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkJsDir");
            return object1;
          } 
          return null;
        } 
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[21].call(sdkComponent), arrayOfCallSite[22].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[23].call(sdkComponent), arrayOfCallSite[24].callGroovyObjectGetProperty(this)))) {
          Object object1 = arrayOfCallSite[25].callGetProperty(sdkComponent);
          ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkJsDir");
          return object1;
        } 
        return null;
      } 
      if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[31].callGetProperty(SdkConst.class))) {
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[37].call(sdkComponent), arrayOfCallSite[38].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[39].call(sdkComponent), arrayOfCallSite[40].callGroovyObjectGetProperty(this)))) {
            Object object1 = arrayOfCallSite[41].callGetProperty(sdkComponent);
            ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkNativeDir");
            return object1;
          } 
          return null;
        } 
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[32].call(sdkComponent), arrayOfCallSite[33].callGetProperty(SdkConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[34].call(sdkComponent), arrayOfCallSite[35].callGroovyObjectGetProperty(this)))) {
          Object object1 = arrayOfCallSite[36].callGetProperty(sdkComponent);
          ScriptBytecodeAdapter.setGroovyObjectProperty(ShortTypeHandling.castToString(object1), _parsePathAndApi_closure1.class, (GroovyObject)this, "sdkNativeDir");
          return object1;
        } 
        return null;
      } 
      return null;
    }
    
    public Object call(Object k, Object sdkComponent) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[42].callCurrent((GroovyObject)this, k, sdkComponent);
    }
  }
  
  private void getBuildToolPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean isWindows = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[102].call(arrayOfCallSite[103].call(OperatingSystem.class)));
    Object object1 = arrayOfCallSite[104].call(arrayOfCallSite[105].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[106].callGetProperty(SdkConst.class), arrayOfCallSite[107].callGetProperty(SdkConst.class), arrayOfCallSite[108].callGetProperty(SdkConst.class)));
    this.d8 = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[109].call(arrayOfCallSite[110].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[111].callGetProperty(SdkConst.class)));
    this.d8Dir = ShortTypeHandling.castToString(object2);
    Object object3 = isWindows ? arrayOfCallSite[112].callGetProperty(SdkConst.class) : arrayOfCallSite[113].callGetProperty(SdkConst.class);
    this.aapt2 = ShortTypeHandling.castToString(object3);
    Object object4 = arrayOfCallSite[114].call(arrayOfCallSite[115].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[116].callGetProperty(SdkConst.class), this.aapt2));
    this.aapt2 = ShortTypeHandling.castToString(object4);
    Object object5 = isWindows ? arrayOfCallSite[117].callGetProperty(SdkConst.class) : arrayOfCallSite[118].callGetProperty(SdkConst.class);
    this.restool = ShortTypeHandling.castToString(object5);
    Object object6 = arrayOfCallSite[119].call(arrayOfCallSite[120].call(Paths.class, this.sdkJavaDir, arrayOfCallSite[121].callGetProperty(SdkConst.class), this.restool));
    this.restool = ShortTypeHandling.castToString(object6);
    Object object7 = isWindows ? arrayOfCallSite[122].callGetProperty(SdkConst.class) : arrayOfCallSite[123].callGetProperty(SdkConst.class);
    this.idl = ShortTypeHandling.castToString(object7);
    Object object8 = arrayOfCallSite[124].call(arrayOfCallSite[125].call(Paths.class, this.sdkJavaDir, arrayOfCallSite[126].callGetProperty(SdkConst.class), this.idl));
    this.idl = ShortTypeHandling.castToString(object8);
    Object object9 = arrayOfCallSite[127].call(arrayOfCallSite[128].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[129].callGetProperty(SdkConst.class), arrayOfCallSite[130].callGetProperty(SdkConst.class)));
    this.packageTool = ShortTypeHandling.castToString(object9);
    Object object10 = arrayOfCallSite[131].call(arrayOfCallSite[132].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[133].callGetProperty(SdkConst.class), arrayOfCallSite[134].callGetProperty(SdkConst.class)));
    this.unpacking_tool = ShortTypeHandling.castToString(object10);
    Object object11 = arrayOfCallSite[135].call(arrayOfCallSite[136].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[137].callGetProperty(SdkConst.class)));
    this.signDir = ShortTypeHandling.castToString(object11);
    Object object12 = arrayOfCallSite[138].call(arrayOfCallSite[139].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[140].callGetProperty(SdkConst.class), arrayOfCallSite[141].callGetProperty(SdkConst.class)));
    this.assistantDir = ShortTypeHandling.castToString(object12);
    Object object13 = arrayOfCallSite[142].call(arrayOfCallSite[143].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[144].callGetProperty(SdkConst.class), arrayOfCallSite[145].callGetProperty(SdkConst.class)));
    this.proguard = ShortTypeHandling.castToString(object13);
    Object object14 = arrayOfCallSite[146].call(arrayOfCallSite[147].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[148].callGetProperty(SdkConst.class), arrayOfCallSite[149].callGetProperty(SdkConst.class)));
    this.proguardDefaultRulesDir = ShortTypeHandling.castToString(object14);
    Object object15 = arrayOfCallSite[150].call(arrayOfCallSite[151].call(Paths.class, this.sdkToolChainsDir, arrayOfCallSite[152].callGetProperty(SdkConst.class), arrayOfCallSite[153].callGetProperty(SdkConst.class)));
    this.dataBindingJar = ShortTypeHandling.castToString(object15);
  }
  
  public String getSdkJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sdkJavaDir;
  }
  
  public String getSdkJsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sdkJsDir;
  }
  
  public String getSdkToolChainsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sdkToolChainsDir;
  }
  
  public int getSdkVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sdkVersion;
  }
  
  public String getApiDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.apiDir;
  }
  
  public String getBuildToolsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.buildToolsDir;
  }
  
  public String getDebugToolsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.debugToolsDir;
  }
  
  public String getD8() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.d8;
  }
  
  public String getD8Dir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.d8Dir;
  }
  
  public String getIdl() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.idl;
  }
  
  public String getRestool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.restool;
  }
  
  public String getAapt2() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.aapt2;
  }
  
  public String getPackageTool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageTool;
  }
  
  public String getSignDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signDir;
  }
  
  public String getAssistantDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.assistantDir;
  }
  
  public String getJsLoader() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jsLoader;
  }
  
  public String getJsBinaryTool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jsBinaryTool;
  }
  
  public String getHwSdkDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.hwSdkDir;
  }
  
  public String getNativeDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.nativeDir;
  }
  
  public String getNodeJsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.nodeJsDir;
  }
  
  public String getUnpacking_tool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.unpacking_tool;
  }
  
  public String getProguard() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.proguard;
  }
  
  public String getProguardDefaultRulesDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.proguardDefaultRulesDir;
  }
  
  public String getDataBindingJar() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dataBindingJar;
  }
  
  @Generated
  public Map<String, Integer> getComponents() {
    return this.components;
  }
  
  @Generated
  public void setComponents(Map<String, Integer> paramMap) {
    this.components = paramMap;
  }
}
