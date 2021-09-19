package com.huawei.ohos.build.utils;

import com.huawei.ohos.build.BaseExtension;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.NetworkOptions;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import groovy.util.XmlParser;
import groovy.xml.StreamingMarkupBuilder;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class Configure implements GroovyObject {
  private Project project;
  
  public Configure(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public void handleProfile(ConfigInfo configInfo, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List abilityInfoList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(configInfo), List.class);
    Object packageName = arrayOfCallSite[1].call(configInfo);
    Object javaPath = arrayOfCallSite[2].call(pathInfo);
    Object packagePath = arrayOfCallSite[3].callConstructor(File.class, arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, javaPath, arrayOfCallSite[6].call(packageName, "\\.", "/"))));
    arrayOfCallSite[7].call(packagePath);
    Object shellApplicationName = arrayOfCallSite[8].call(configInfo);
    File realApplicationFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(File.class, arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(packagePath), arrayOfCallSite[14].callGetProperty(File.class)), shellApplicationName), ".java")), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(configInfo))) {
      arrayOfCallSite[16].call(FileUtils.class, arrayOfCallSite[17].callGetProperty(CommonConst.class), arrayOfCallSite[18].callGetProperty(realApplicationFile));
    } else {
      arrayOfCallSite[19].call(FileUtils.class, arrayOfCallSite[20].callGetProperty(CommonConst.class), arrayOfCallSite[21].callGetProperty(realApplicationFile));
    } 
    arrayOfCallSite[22].call(realApplicationFile, arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(realApplicationFile), "TEPLATEAPPLICTION", shellApplicationName), "PACKAGE", packageName));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[26].call(configInfo))) {
      File shellComponentProxyFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].callConstructor(File.class, arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].call(arrayOfCallSite[31].call(packagePath), arrayOfCallSite[32].callGetProperty(File.class)), "ShellComponentProxy"), ".java")), File.class);
      arrayOfCallSite[33].call(FileUtils.class, arrayOfCallSite[34].callGetProperty(CommonConst.class), arrayOfCallSite[35].callGetProperty(shellComponentProxyFile));
      arrayOfCallSite[36].call(shellComponentProxyFile, arrayOfCallSite[37].call(arrayOfCallSite[38].callGetProperty(shellComponentProxyFile), "PACKAGE", packageName));
    } 
    AbilitiesOptions info;
    Iterator iterator;
    for (info = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(abilityInfoList), Iterator.class); iterator.hasNext(); ) {
      info = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
      Object abilityType = arrayOfCallSite[40].call(info);
      Object formsEnabled = arrayOfCallSite[41].call(info);
      Object formEnabled = arrayOfCallSite[42].call(info);
      Object shellName = arrayOfCallSite[43].call(info);
      Object abilityPkg = arrayOfCallSite[44].call(ShellUtils.class, configInfo, info);
      Object abilityShellPath = arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, javaPath, arrayOfCallSite[47].call(abilityPkg, "\\.", "/")));
      Object abilityShellName = arrayOfCallSite[48].call(arrayOfCallSite[49].call(shellName, arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(info), "."), Integer.valueOf(1))));
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[53].call(StringHandler.class, abilityType)))
        throw (Throwable)arrayOfCallSite[54].callConstructor(GradleException.class, arrayOfCallSite[55].call(arrayOfCallSite[56].call(arrayOfCallSite[57].call(arrayOfCallSite[58].call(info), " aaType not supported. Check the "), arrayOfCallSite[59].callGetProperty(CommonConst.class)), " file.")); 
      Object abilityShellFile = arrayOfCallSite[60].callConstructor(File.class, arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(abilityShellPath, arrayOfCallSite[64].callGetProperty(File.class)), abilityShellName), ".java"));
      Object tmpAbilityShellFile = arrayOfCallSite[65].call(String.class, arrayOfCallSite[66].callGetProperty(CommonConst.class), abilityType);
      arrayOfCallSite[67].call(FileUtils.class, tmpAbilityShellFile, arrayOfCallSite[68].callGetProperty(abilityShellFile));
      arrayOfCallSite[69].call(abilityShellFile, arrayOfCallSite[70].call(arrayOfCallSite[71].call(arrayOfCallSite[72].callGetProperty(abilityShellFile), "TEMPLATESHELL", abilityShellName), "PACKAGE", abilityPkg));
      if ((ScriptBytecodeAdapter.compareEqual(abilityType, "page") && ((DefaultTypeTransformation.booleanUnbox(formsEnabled) || DefaultTypeTransformation.booleanUnbox(formEnabled))))) {
        Object shellFormName = arrayOfCallSite[73].call(arrayOfCallSite[74].call(info), arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].call(info), "."), Integer.valueOf(1)));
        Object shellServiceFormFile = arrayOfCallSite[78].callConstructor(File.class, arrayOfCallSite[79].call(arrayOfCallSite[80].call(arrayOfCallSite[81].call(abilityShellPath, arrayOfCallSite[82].callGetProperty(File.class)), shellFormName), ".java"));
        Object tmpShellServiceFormFile = arrayOfCallSite[83].call(String.class, arrayOfCallSite[84].callGetProperty(CommonConst.class), abilityType);
        arrayOfCallSite[85].call(FileUtils.class, tmpShellServiceFormFile, arrayOfCallSite[86].callGetProperty(shellServiceFormFile));
        arrayOfCallSite[87].call(shellServiceFormFile, arrayOfCallSite[88].call(arrayOfCallSite[89].call(arrayOfCallSite[90].callGetProperty(shellServiceFormFile), "TEMPLATESHELL", shellFormName), "PACKAGE", abilityPkg));
      } 
    } 
  }
  
  public void handleTestProfile(ConfigInfo configInfo, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object packageName = arrayOfCallSite[91].call(configInfo);
    Object javaPath = arrayOfCallSite[92].call(pathInfo);
    Object packagePath = arrayOfCallSite[93].callConstructor(File.class, arrayOfCallSite[94].call(arrayOfCallSite[95].call(Paths.class, javaPath, arrayOfCallSite[96].call(packageName, "\\.", "/"))));
    arrayOfCallSite[97].call(packagePath);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[98].call(configInfo))) {
      Object shellApplicationName = arrayOfCallSite[99].call(configInfo);
      File realApplicationFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[100].callConstructor(File.class, arrayOfCallSite[101].call(arrayOfCallSite[102].call(arrayOfCallSite[103].call(arrayOfCallSite[104].call(packagePath), arrayOfCallSite[105].callGetProperty(File.class)), shellApplicationName), ".java")), File.class);
      arrayOfCallSite[106].call(FileUtils.class, arrayOfCallSite[107].callGetProperty(CommonConst.class), arrayOfCallSite[108].callGetProperty(realApplicationFile));
      arrayOfCallSite[109].call(realApplicationFile, arrayOfCallSite[110].call(arrayOfCallSite[111].call(arrayOfCallSite[112].callGetProperty(realApplicationFile), "TEPLATEAPPLICTION", shellApplicationName), "PACKAGE", packageName));
      List abilityInfoList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[113].call(configInfo), List.class);
      AbilitiesOptions info;
      Iterator iterator;
      for (info = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[114].call(abilityInfoList), Iterator.class); iterator.hasNext(); ) {
        info = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(iterator.next(), AbilitiesOptions.class);
        Object abilityType = arrayOfCallSite[115].call(info);
        Object formEnabled = arrayOfCallSite[116].call(info);
        Object shellName = arrayOfCallSite[117].call(info);
        Object abilityPkg = arrayOfCallSite[118].call(ShellUtils.class, configInfo, info);
        Object abilityShellPath = arrayOfCallSite[119].call(arrayOfCallSite[120].call(Paths.class, javaPath, arrayOfCallSite[121].call(abilityPkg, "\\.", "/")));
        Object abilityShellName = arrayOfCallSite[122].call(arrayOfCallSite[123].call(shellName, arrayOfCallSite[124].call(arrayOfCallSite[125].call(arrayOfCallSite[126].call(info), "."), Integer.valueOf(1))));
        if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[127].call(StringHandler.class, abilityType)))
          throw (Throwable)arrayOfCallSite[128].callConstructor(GradleException.class, arrayOfCallSite[129].call(arrayOfCallSite[130].call(arrayOfCallSite[131].call(info), " aaType is not support, please check "), arrayOfCallSite[132].callGetProperty(CommonConst.class))); 
        Object abilityShellFile = arrayOfCallSite[133].callConstructor(File.class, arrayOfCallSite[134].call(arrayOfCallSite[135].call(arrayOfCallSite[136].call(abilityShellPath, arrayOfCallSite[137].callGetProperty(File.class)), abilityShellName), ".java"));
        Object tmpAbilityShellFile = arrayOfCallSite[138].call(String.class, arrayOfCallSite[139].callGetProperty(CommonConst.class), abilityType);
        arrayOfCallSite[140].call(FileUtils.class, tmpAbilityShellFile, arrayOfCallSite[141].callGetProperty(abilityShellFile));
        arrayOfCallSite[142].call(abilityShellFile, arrayOfCallSite[143].call(arrayOfCallSite[144].call(arrayOfCallSite[145].callGetProperty(abilityShellFile), "TEMPLATESHELL", abilityShellName), "PACKAGE", abilityPkg));
        if ((ScriptBytecodeAdapter.compareEqual(abilityType, "page") && DefaultTypeTransformation.booleanUnbox(formEnabled))) {
          Object shellFormName = arrayOfCallSite[146].call(arrayOfCallSite[147].call(info), arrayOfCallSite[148].call(arrayOfCallSite[149].call(arrayOfCallSite[150].call(info), "."), Integer.valueOf(1)));
          Object shellServiceFormFile = arrayOfCallSite[151].callConstructor(File.class, arrayOfCallSite[152].call(arrayOfCallSite[153].call(arrayOfCallSite[154].call(abilityShellPath, arrayOfCallSite[155].callGetProperty(File.class)), shellFormName), ".java"));
          Object tmpShellServiceFormFile = arrayOfCallSite[156].call(String.class, arrayOfCallSite[157].callGetProperty(CommonConst.class), abilityType);
          arrayOfCallSite[158].call(FileUtils.class, tmpShellServiceFormFile, arrayOfCallSite[159].callGetProperty(shellServiceFormFile));
          arrayOfCallSite[160].call(shellServiceFormFile, arrayOfCallSite[161].call(arrayOfCallSite[162].call(arrayOfCallSite[163].callGetProperty(shellServiceFormFile), "TEMPLATESHELL", shellFormName), "PACKAGE", abilityPkg));
        } 
      } 
    } else {
      File realApplicationFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[164].callConstructor(File.class, arrayOfCallSite[165].call(arrayOfCallSite[166].call(arrayOfCallSite[167].call(packagePath), arrayOfCallSite[168].callGetProperty(File.class)), "MainApplication.java")), File.class);
      arrayOfCallSite[169].call(FileUtils.class, "/templates/test/MainApplication", arrayOfCallSite[170].callGetProperty(realApplicationFile));
      arrayOfCallSite[171].call(realApplicationFile, arrayOfCallSite[172].call(arrayOfCallSite[173].callGetProperty(realApplicationFile), "PACKAGE", packageName));
      Object abilityPath = arrayOfCallSite[174].call(arrayOfCallSite[175].call(Paths.class, javaPath, "decc", "testkit", "runner"));
      File abilityFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[176].callConstructor(File.class, arrayOfCallSite[177].call(arrayOfCallSite[178].call(abilityPath, arrayOfCallSite[179].callGetProperty(File.class)), "EntryAbilityShellActivity.java")), File.class);
      arrayOfCallSite[180].call(FileUtils.class, "/templates/test/EntryAbilityShellActivity", arrayOfCallSite[181].callGetProperty(abilityFile));
    } 
  }
  
  public Object generateAndroidManifest(ConfigInfo configInfo, Project project, PathInfo pathInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference moduleType = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[182].call(configInfo)));
    Reference configOptions = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[183].call(configInfo), ConfigOptions.class));
    Reference minSdkVersion = new Reference(arrayOfCallSite[184].call(arrayOfCallSite[185].call(arrayOfCallSite[186].call(arrayOfCallSite[187].call(project), BaseExtension.class))));
    Reference targetSdkVersion = new Reference(arrayOfCallSite[188].call(arrayOfCallSite[189].call(arrayOfCallSite[190].call(arrayOfCallSite[191].call(project), BaseExtension.class))));
    Object androidManifestTemplate = arrayOfCallSite[192].call(arrayOfCallSite[193].callConstructor(StreamingMarkupBuilder.class), new _generateAndroidManifest_closure1(this, this, moduleType, configOptions, minSdkVersion, targetSdkVersion));
    Object xmlParser = arrayOfCallSite[194].callConstructor(XmlParser.class, Boolean.valueOf(false), Boolean.valueOf(false));
    Object androidManifest = arrayOfCallSite[195].call(xmlParser, arrayOfCallSite[196].call(androidManifestTemplate));
    arrayOfCallSite[197].callCurrent(this, moduleType.get(), project, androidManifest);
    arrayOfCallSite[198].callCurrent(this, project, androidManifest);
    arrayOfCallSite[199].call(configOptions.get(), configInfo, androidManifest, project, pathInfo);
    Object androidManifestFile = arrayOfCallSite[200].callConstructor(File.class, arrayOfCallSite[201].call(arrayOfCallSite[202].call(arrayOfCallSite[203].call(pathInfo), arrayOfCallSite[204].callGetProperty(File.class)), arrayOfCallSite[205].callGetProperty(CommonConst.class)));
    return arrayOfCallSite[206].call(FileUtils.class, androidManifestFile, androidManifest);
  }
  
  public final class _generateAndroidManifest_closure1 extends Closure implements GeneratedClosure {
    public _generateAndroidManifest_closure1(Object _outerInstance, Object _thisObject, Reference moduleType, Reference configOptions, Reference minSdkVersion, Reference targetSdkVersion) {
      super(_outerInstance, _thisObject);
      Reference reference1 = moduleType;
      this.moduleType = reference1;
      Reference reference2 = configOptions;
      this.configOptions = reference2;
      Reference reference3 = minSdkVersion;
      this.minSdkVersion = reference3;
      Reference reference4 = targetSdkVersion;
      this.targetSdkVersion = reference4;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "encoding", "utf-8" }));
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "android", "http://schemas.android.com/apk/res/android" }));
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "tools", "http://schemas.android.com/tools" }));
      if (ScriptBytecodeAdapter.compareEqual(this.moduleType.get(), "feature"))
        arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "dist", "http://schemas.android.com/apk/distribution" })); 
      return arrayOfCallSite[8].callCurrent((GroovyObject)this, ScriptBytecodeAdapter.createMap(new Object[] { "package", arrayOfCallSite[9].call(arrayOfCallSite[10].call(this.configOptions.get())), "android:versionCode", arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(this.configOptions.get()))), "android:versionName", arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(this.configOptions.get()))) }, ), new _closure3(this, getThisObject(), this.minSdkVersion, this.targetSdkVersion));
    }
    
    @Generated
    public String getModuleType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.moduleType.get());
    }
    
    @Generated
    public ConfigOptions getConfigOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (ConfigOptions)ScriptBytecodeAdapter.castToType(this.configOptions.get(), ConfigOptions.class);
    }
    
    @Generated
    public Object getMinSdkVersion() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.minSdkVersion.get();
    }
    
    @Generated
    public Object getTargetSdkVersion() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.targetSdkVersion.get();
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure3 extends Closure implements GeneratedClosure {
      public _closure3(Object _outerInstance, Object _thisObject, Reference minSdkVersion, Reference targetSdkVersion) {
        super(_outerInstance, _thisObject);
        Reference reference1 = minSdkVersion;
        this.minSdkVersion = reference1;
        Reference reference2 = targetSdkVersion;
        this.targetSdkVersion = reference2;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].callCurrent((GroovyObject)this, ScriptBytecodeAdapter.createMap(new Object[] { "android:name", "zidane.software.ability", "android:required", "false" }));
        return arrayOfCallSite[1].callCurrent((GroovyObject)this, ScriptBytecodeAdapter.createMap(new Object[] { "android:minSdkVersion", this.minSdkVersion.get(), "android:targetSdkVersion", this.targetSdkVersion.get() }));
      }
      
      @Generated
      public Object getMinSdkVersion() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.minSdkVersion.get();
      }
      
      @Generated
      public Object getTargetSdkVersion() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.targetSdkVersion.get();
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  private void replaceLegacyVersionFromEntry(String moduleType, Project project, Node androidManifest) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[212].call(arrayOfCallSite[213].callGetProperty(project), "projectModuleType"), null) && 
        ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[214].callGetProperty(BuildConst.class), arrayOfCallSite[215].call(arrayOfCallSite[216].callGetProperty(project), "projectModuleType"))))
        return; 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[207].call(arrayOfCallSite[208].callGetProperty(project), "projectModuleType"), null) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[209].callGetProperty(BuildConst.class), arrayOfCallSite[210].call(arrayOfCallSite[211].callGetProperty(project), "projectModuleType")))) {
      return;
    } 
    List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[217].call(ModuleExtensionData.class, project), List.class);
    Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[218].call(arrayOfCallSite[219].callGetProperty(project), arrayOfCallSite[220].call(entryModules)), Project.class);
    if (ScriptBytecodeAdapter.compareNotEqual(entryProject, null))
      arrayOfCallSite[221].callCurrent(this, entryProject, androidManifest); 
  }
  
  private void replaceLegacyVersion(Project project, Node androidManifest) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[242].callGetProperty(arrayOfCallSite[243].callGetProperty(project)), null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[244].callGetProperty(arrayOfCallSite[245].callGetProperty(arrayOfCallSite[246].callGetProperty(project))), null))) {
        Object object = arrayOfCallSite[247].callGetProperty(arrayOfCallSite[248].callGetProperty(arrayOfCallSite[249].callGetProperty(project)));
        arrayOfCallSite[250].call(arrayOfCallSite[251].call(androidManifest), "android:versionCode", object);
      } 
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[252].callGetProperty(arrayOfCallSite[253].callGetProperty(project)), null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[254].callGetProperty(arrayOfCallSite[255].callGetProperty(arrayOfCallSite[256].callGetProperty(project))), null))) {
        Object object = arrayOfCallSite[257].callGetProperty(arrayOfCallSite[258].callGetProperty(arrayOfCallSite[259].callGetProperty(project)));
        arrayOfCallSite[260].call(arrayOfCallSite[261].call(androidManifest), "android:versionName", object);
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[222].callGetProperty(arrayOfCallSite[223].callGetProperty(project)), null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[224].callGetProperty(arrayOfCallSite[225].callGetProperty(arrayOfCallSite[226].callGetProperty(project))), null))) {
      Object object = arrayOfCallSite[227].callGetProperty(arrayOfCallSite[228].callGetProperty(arrayOfCallSite[229].callGetProperty(project)));
      arrayOfCallSite[230].call(arrayOfCallSite[231].call(androidManifest), "android:versionCode", object);
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[232].callGetProperty(arrayOfCallSite[233].callGetProperty(project)), null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[234].callGetProperty(arrayOfCallSite[235].callGetProperty(arrayOfCallSite[236].callGetProperty(project))), null))) {
      Object object = arrayOfCallSite[237].callGetProperty(arrayOfCallSite[238].callGetProperty(arrayOfCallSite[239].callGetProperty(project)));
      arrayOfCallSite[240].call(arrayOfCallSite[241].call(androidManifest), "android:versionName", object);
    } 
  }
  
  public Object generateNetworkConfig(NetworkOptions networkOptions, String toFilePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object networkTemplate = arrayOfCallSite[262].call(arrayOfCallSite[263].callConstructor(StreamingMarkupBuilder.class), new _generateNetworkConfig_closure2(this, this));
    Object xmlParser = arrayOfCallSite[264].callConstructor(XmlParser.class, Boolean.valueOf(false), Boolean.valueOf(false));
    Object androidNetwork = arrayOfCallSite[265].call(xmlParser, arrayOfCallSite[266].call(networkTemplate));
    arrayOfCallSite[267].call(networkOptions, androidNetwork, null, null);
    Object androidManifestFile = arrayOfCallSite[268].callConstructor(File.class, arrayOfCallSite[269].call(arrayOfCallSite[270].call(toFilePath, arrayOfCallSite[271].callGetProperty(File.class)), "network_security_config.xml"));
    return arrayOfCallSite[272].call(FileUtils.class, androidManifestFile, androidNetwork);
  }
  
  public final class _generateNetworkConfig_closure2 extends Closure implements GeneratedClosure {
    public _generateNetworkConfig_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), ScriptBytecodeAdapter.createMap(new Object[] { "encoding", "utf-8" }));
      return arrayOfCallSite[2].callCurrent((GroovyObject)this);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
