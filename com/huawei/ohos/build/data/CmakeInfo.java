package com.huawei.ohos.build.data;

import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.enumlation.CpuAbiEnum;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.internal.os.OperatingSystem;

public class CmakeInfo implements GroovyObject {
  private String nativeDir;
  
  private String cxxDir;
  
  private String cmakePath;
  
  private String ninjaPath;
  
  private String cmakeVersion;
  
  private boolean isWindows;
  
  private boolean isMac;
  
  private String cmake;
  
  private String ninja;
  
  private ExternalNativeBuild nativeBuild;
  
  public CmakeInfo(Project project, String nativeDir) {
    Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(OperatingSystem.class));
    this.isWindows = DefaultTypeTransformation.booleanUnbox(object1);
    Object object2 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(OperatingSystem.class));
    this.isMac = DefaultTypeTransformation.booleanUnbox(object2);
    MetaClass metaClass = $getStaticMetaClass();
    String str = nativeDir;
    this.nativeDir = ShortTypeHandling.castToString(str);
    Object object3 = this.isWindows ? arrayOfCallSite[4].callGetProperty(SdkConst.class) : arrayOfCallSite[5].callGetProperty(SdkConst.class);
    this.cmake = ShortTypeHandling.castToString(object3);
    Object object4 = this.isWindows ? arrayOfCallSite[6].callGetProperty(SdkConst.class) : arrayOfCallSite[7].callGetProperty(SdkConst.class);
    this.ninja = ShortTypeHandling.castToString(object4);
    Object object5 = arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(project));
    this.nativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(object5, ExternalNativeBuild.class);
    Object object6 = arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callGetProperty(project)));
    this.cmakeVersion = ShortTypeHandling.castToString(object6);
    Object object7 = arrayOfCallSite[13].call(arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].callGetProperty(arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].call(project))), arrayOfCallSite[18].callGetProperty(PathConst.class)));
    this.cxxDir = ShortTypeHandling.castToString(object7);
    if (BytecodeInterface8.isOrigZ() && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.cmakeVersion, null) && ScriptBytecodeAdapter.compareNotEqual(this.cmakeVersion, ""))) {
        getCustomCmakeVersion();
        null;
      } else {
        Object object = arrayOfCallSite[25].call(arrayOfCallSite[26].call(Paths.class, ArrayUtil.createArray(this.nativeDir, arrayOfCallSite[27].callGetProperty(SdkConst.class), arrayOfCallSite[28].callGetProperty(SdkConst.class), arrayOfCallSite[29].callGetProperty(SdkConst.class), this.cmake)));
        this.cmakePath = ShortTypeHandling.castToString(object);
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(this.cmakeVersion, null) && ScriptBytecodeAdapter.compareNotEqual(this.cmakeVersion, ""))) {
      arrayOfCallSite[19].callCurrent(this);
    } else {
      Object object = arrayOfCallSite[20].call(arrayOfCallSite[21].call(Paths.class, ArrayUtil.createArray(this.nativeDir, arrayOfCallSite[22].callGetProperty(SdkConst.class), arrayOfCallSite[23].callGetProperty(SdkConst.class), arrayOfCallSite[24].callGetProperty(SdkConst.class), this.cmake)));
      this.cmakePath = ShortTypeHandling.castToString(object);
    } 
    Object object8 = arrayOfCallSite[30].call(arrayOfCallSite[31].call(Paths.class, ArrayUtil.createArray(this.nativeDir, arrayOfCallSite[32].callGetProperty(SdkConst.class), arrayOfCallSite[33].callGetProperty(SdkConst.class), arrayOfCallSite[34].callGetProperty(SdkConst.class), this.ninja)));
    this.ninjaPath = ShortTypeHandling.castToString(object8);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      validateCmakeParameter();
      null;
      return;
    } 
    arrayOfCallSite[35].callCurrent(this);
  }
  
  private void getCustomCmakeVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].call(this.cmakeVersion, "[\\d+][\\.\\d+]*")))
      throw (Throwable)arrayOfCallSite[37].callConstructor(GradleException.class, "Invalid CMake version. Please check the SDK manager and ensure Native installed correctly."); 
    String cmakeEnv = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getCmakeEnv();
    } else {
      Object object = arrayOfCallSite[38].callCurrent(this);
      cmakeEnv = ShortTypeHandling.castToString(object);
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(null, cmakeEnv) && ScriptBytecodeAdapter.compareEqual(this.cmakeVersion, getCmakeVersion()))) {
        Object object = arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, cmakeEnv, this.cmake));
        this.cmakePath = ShortTypeHandling.castToString(object);
      } else {
        throw (Throwable)arrayOfCallSite[47].callConstructor(GradleException.class, arrayOfCallSite[48].call(String.class, arrayOfCallSite[49].callGetProperty(Locale.class), "CMake version not found in %s. Please check the SDK manager and ensure Native installed correctly.", this.cmakeVersion));
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(null, cmakeEnv) && ScriptBytecodeAdapter.compareEqual(this.cmakeVersion, arrayOfCallSite[39].callCurrent(this)))) {
      Object object = arrayOfCallSite[40].call(arrayOfCallSite[41].call(Paths.class, cmakeEnv, this.cmake));
      this.cmakePath = ShortTypeHandling.castToString(object);
    } else {
      throw (Throwable)arrayOfCallSite[42].callConstructor(GradleException.class, arrayOfCallSite[43].call(String.class, arrayOfCallSite[44].callGetProperty(Locale.class), "CMake version not found in %s. Please check the SDK manager and ensure Native installed correctly.", this.cmakeVersion));
    } 
  }
  
  private void validateCmakeParameter() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((ScriptBytecodeAdapter.compareEqual(this.nativeDir, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(this.nativeDir, "")))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(arrayOfCallSite[56].callConstructor(File.class, this.nativeDir))))))
        throw (Throwable)arrayOfCallSite[57].callConstructor(GradleException.class, "Native directory was not found in PATH. Please check the SDK manager and ensure Native installed correctly."); 
    } else if ((((ScriptBytecodeAdapter.compareEqual(this.nativeDir, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[50].call(this.nativeDir, "")))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[51].call(arrayOfCallSite[52].callConstructor(File.class, this.nativeDir)))))) {
      throw (Throwable)arrayOfCallSite[53].callConstructor(GradleException.class, "Native directory was not found in PATH. Please check the SDK manager and ensure Native installed correctly.");
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(arrayOfCallSite[59].callConstructor(File.class, this.cmakePath))))
      throw (Throwable)arrayOfCallSite[60].callConstructor(GradleException.class, arrayOfCallSite[61].call(String.class, arrayOfCallSite[62].callGetProperty(Locale.class), "The path of the CMake executable file does not exist in %s. Please check the SDK manager and ensure Native installed correctly.", this.cmakePath)); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[63].call(arrayOfCallSite[64].callConstructor(File.class, this.ninjaPath))))
      throw (Throwable)arrayOfCallSite[65].callConstructor(GradleException.class, arrayOfCallSite[66].call(String.class, arrayOfCallSite[67].callGetProperty(Locale.class), "The path of the Ninja executable file does not exist in %s. Please check the SDK manager and ensure Native installed correctly.", this.ninjaPath)); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[68].call(arrayOfCallSite[69].call(this.nativeBuild))))
      throw (Throwable)arrayOfCallSite[70].callConstructor(GradleException.class, "'abiFilters' is mandatory correctly in build.gradle."); 
    String abiFilter;
    Iterator iterator;
    for (abiFilter = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[71].call(arrayOfCallSite[72].call(this.nativeBuild)), Iterator.class); iterator.hasNext(); ) {
      abiFilter = ShortTypeHandling.castToString(iterator.next());
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[73].call(CpuAbiEnum.class, abiFilter)))
        throw (Throwable)arrayOfCallSite[74].callConstructor(GradleException.class, arrayOfCallSite[75].call(String.class, arrayOfCallSite[76].callGetProperty(Locale.class), "Parameter %s in 'abiFilters' is not supported.", abiFilter)); 
    } 
  }
  
  private String getCmakeEnv() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String path = ShortTypeHandling.castToString(this.isWindows ? arrayOfCallSite[77].call(System.class, "Path") : arrayOfCallSite[78].call(System.class, "PATH"));
    String[] dirs = (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[79].call(path, ":"), String[].class);
    String dir;
    Iterator iterator;
    for (dir = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].call(dirs), Iterator.class); iterator.hasNext(); ) {
      dir = ShortTypeHandling.castToString(iterator.next());
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[81].call(dir, "Cmake")) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[82].call(dir, "cmake"))))
        return dir; 
    } 
    return ShortTypeHandling.castToString(null);
  }
  
  private String getCmakeVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String cmd = "cmake -version";
    Process process = (Process)ScriptBytecodeAdapter.castToType(arrayOfCallSite[83].call(arrayOfCallSite[84].call(Runtime.class), cmd), Process.class);
    BufferedReader bf = (BufferedReader)ScriptBytecodeAdapter.castToType(arrayOfCallSite[85].callConstructor(BufferedReader.class, arrayOfCallSite[86].callConstructor(InputStreamReader.class, arrayOfCallSite[87].call(process))), BufferedReader.class);
    String line = null;
    try {
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        Object object1 = arrayOfCallSite[89].call(bf);
        line = ShortTypeHandling.castToString(object1);
        if (ScriptBytecodeAdapter.compareNotEqual(object1, null));
        return ShortTypeHandling.castToString(arrayOfCallSite[92].call(line, Integer.valueOf(14)));
      } 
      Object object = arrayOfCallSite[88].call(bf);
      line = ShortTypeHandling.castToString(object);
      if (ScriptBytecodeAdapter.compareNotEqual(object, null));
    } catch (IOException e) {
      arrayOfCallSite[90].callCurrent(this, arrayOfCallSite[91].call(e));
    } finally {}
    return ShortTypeHandling.castToString(arrayOfCallSite[92].call(line, Integer.valueOf(14)));
  }
  
  @Generated
  public String getNativeDir() {
    return this.nativeDir;
  }
  
  @Generated
  public void setNativeDir(String paramString) {
    this.nativeDir = paramString;
  }
  
  @Generated
  public String getCxxDir() {
    return this.cxxDir;
  }
  
  @Generated
  public void setCxxDir(String paramString) {
    this.cxxDir = paramString;
  }
  
  @Generated
  public String getCmakePath() {
    return this.cmakePath;
  }
  
  @Generated
  public void setCmakePath(String paramString) {
    this.cmakePath = paramString;
  }
  
  @Generated
  public String getNinjaPath() {
    return this.ninjaPath;
  }
  
  @Generated
  public void setNinjaPath(String paramString) {
    this.ninjaPath = paramString;
  }
  
  @Generated
  public void setCmakeVersion(String paramString) {
    this.cmakeVersion = paramString;
  }
  
  @Generated
  public boolean getIsWindows() {
    return this.isWindows;
  }
  
  @Generated
  public boolean isIsWindows() {
    return this.isWindows;
  }
  
  @Generated
  public void setIsWindows(boolean paramBoolean) {
    this.isWindows = paramBoolean;
  }
  
  @Generated
  public boolean getIsMac() {
    return this.isMac;
  }
  
  @Generated
  public boolean isIsMac() {
    return this.isMac;
  }
  
  @Generated
  public void setIsMac(boolean paramBoolean) {
    this.isMac = paramBoolean;
  }
  
  @Generated
  public String getCmake() {
    return this.cmake;
  }
  
  @Generated
  public void setCmake(String paramString) {
    this.cmake = paramString;
  }
  
  @Generated
  public String getNinja() {
    return this.ninja;
  }
  
  @Generated
  public void setNinja(String paramString) {
    this.ninja = paramString;
  }
  
  @Generated
  public ExternalNativeBuild getNativeBuild() {
    return this.nativeBuild;
  }
  
  @Generated
  public void setNativeBuild(ExternalNativeBuild paramExternalNativeBuild) {
    this.nativeBuild = paramExternalNativeBuild;
  }
}
