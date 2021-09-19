package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class CmakeCommandBuilder extends BaseCommandBuilder {
  public CmakeCommandBuilder(String executor) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), executor);
  }
  
  public CmakeCommandBuilder addCmakeList(String cmakeList) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(String.class, arrayOfCallSite[5].callGetProperty(Locale.class), "-H%s", cmakeList));
    return this;
  }
  
  public CmakeCommandBuilder addTempFilePath(String tempFilePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].call(String.class, arrayOfCallSite[9].callGetProperty(Locale.class), "-B%s", tempFilePath));
    return this;
  }
  
  public CmakeCommandBuilder addHarmonyosArch(String arch) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), arrayOfCallSite[12].call(String.class, arrayOfCallSite[13].callGetProperty(Locale.class), "-DOHOS_ARCH=%s", arch));
    return this;
  }
  
  public CmakeCommandBuilder addOutputDir(String outputDir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), arrayOfCallSite[16].call(String.class, arrayOfCallSite[17].callGetProperty(Locale.class), "-DCMAKE_LIBRARY_OUTPUT_DIRECTORY=%s", outputDir));
    return this;
  }
  
  public CmakeCommandBuilder addBuildType(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), arrayOfCallSite[20].call(String.class, arrayOfCallSite[21].callGetProperty(Locale.class), "-DCMAKE_BUILD_TYPE=%s", buildType));
    return this;
  }
  
  public CmakeCommandBuilder addNativeSdk(String nativeSdk) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), arrayOfCallSite[24].call(String.class, arrayOfCallSite[25].callGetProperty(Locale.class), "-DOHOS_SDK_NATIVE=%s", nativeSdk));
    return this;
  }
  
  public CmakeCommandBuilder addSystemName(String systemName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), arrayOfCallSite[28].call(String.class, arrayOfCallSite[29].callGetProperty(Locale.class), "-DCMAKE_SYSTEM_NAME=%s", systemName));
    return this;
  }
  
  public CmakeCommandBuilder addHarmonyosArchAbi(String archAbi) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this), arrayOfCallSite[32].call(String.class, arrayOfCallSite[33].callGetProperty(Locale.class), "-DCMAKE_OHOS_ARCH_ABI=%s", archAbi));
    return this;
  }
  
  public CmakeCommandBuilder exportCompileCommands(String export) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), arrayOfCallSite[36].call(String.class, arrayOfCallSite[37].callGetProperty(Locale.class), "-DCMAKE_EXPORT_COMPILE_COMMANDS=%s", export));
    return this;
  }
  
  public CmakeCommandBuilder addToolChain(String toolChain) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), arrayOfCallSite[40].call(String.class, arrayOfCallSite[41].callGetProperty(Locale.class), "-DCMAKE_TOOLCHAIN_FILE=%s", toolChain));
    return this;
  }
  
  public CmakeCommandBuilder addGenerator(String generator) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), "-G");
    arrayOfCallSite[44].call(arrayOfCallSite[45].callGroovyObjectGetProperty(this), generator);
    return this;
  }
  
  public CmakeCommandBuilder addMakeProgramPath(String makeProgramPath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[46].call(arrayOfCallSite[47].callGroovyObjectGetProperty(this), arrayOfCallSite[48].call(String.class, arrayOfCallSite[49].callGetProperty(Locale.class), "-DCMAKE_MAKE_PROGRAM=%s", makeProgramPath));
    return this;
  }
  
  public CmakeCommandBuilder addCFlags(String cFlags) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), arrayOfCallSite[52].call(String.class, arrayOfCallSite[53].callGetProperty(Locale.class), "-DCMAKE_C_FLAGS=%s", cFlags));
    return this;
  }
  
  public CmakeCommandBuilder addCxxFlags(String cppFlags) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this), arrayOfCallSite[56].call(String.class, arrayOfCallSite[57].callGetProperty(Locale.class), "-DCMAKE_CXX_FLAGS=%s", cppFlags));
    return this;
  }
  
  public CmakeCommandBuilder changeToDir(String dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), "-C");
    arrayOfCallSite[60].call(arrayOfCallSite[61].callGroovyObjectGetProperty(this), dir);
    return this;
  }
}
