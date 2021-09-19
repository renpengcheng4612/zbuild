package com.huawei.ohos.build.utils.command;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.internal.os.OperatingSystem;

public class JavaCommandBuilder extends BaseCommandBuilder {
  private static final int JAR_OPTION_INDEX = 1;
  
  private static final int JAR_FILE_INDEX = 2;
  
  public JavaCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    Object javaHome = arrayOfCallSite[0].call(System.class, "java.home");
    Object javaTool = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].call(OperatingSystem.class))) ? "java.exe" : "java";
    arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this), arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, javaHome, "bin", javaTool)));
  }
  
  public JavaCommandBuilder(JavaCommandBuilder javaCommandBuilder) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this), arrayOfCallSite[9].call(javaCommandBuilder));
  }
  
  public JavaCommandBuilder addCalledJarFile(String jarFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), Integer.valueOf(JAR_OPTION_INDEX), "-jar");
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), Integer.valueOf(JAR_FILE_INDEX), jarFile);
    return this;
  }
  
  public JavaCommandBuilder addJvmOption(String jvmOption) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), jvmOption);
    return this;
  }
  
  public JavaCommandBuilder addClasspath(String classpath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), "-classpath");
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), classpath);
    return this;
  }
  
  public JavaCommandBuilder addMainClass(String mainClass) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), mainClass);
    return this;
  }
  
  @Generated
  public static int getJAR_OPTION_INDEX() {
    return JAR_OPTION_INDEX;
  }
  
  @Generated
  public static int getJAR_FILE_INDEX() {
    return JAR_FILE_INDEX;
  }
  
  public class BinaryToolOptions implements GroovyObject {
    @Generated
    public BinaryToolOptions() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public BinaryToolOptions addProjectPath(String projectPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "--project-path");
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), projectPath);
      return this;
    }
    
    public BinaryToolOptions addBinPath(String binPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "--bin-path");
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), binPath);
      return this;
    }
  }
  
  public class D8Options implements GroovyObject {
    @Generated
    public D8Options() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public D8Options addInputFile(String inputFile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), inputFile);
      return this;
    }
    
    public D8Options addInputDir(String inputDir) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call("@", inputDir));
      return this;
    }
    
    public D8Options addOutputDir(String output) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this), "--output");
      arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this), output);
      return this;
    }
    
    public D8Options addLib(String lib) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), "--lib");
      arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), lib);
      return this;
    }
    
    public D8Options addMinApi(String api) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this), "--min-api");
      arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this), api);
      return this;
    }
    
    public D8Options addIntermediate() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), "--intermediate");
      return this;
    }
  }
  
  public class PackingToolOptions implements GroovyObject {
    @Generated
    public PackingToolOptions() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public PackingToolOptions addMode(String mode) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "--mode");
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), mode);
      return this;
    }
    
    public PackingToolOptions addHapPath(String hapPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "--hap-path");
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), hapPath);
      return this;
    }
    
    public PackingToolOptions addHarPath(String harPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "--har-path");
      arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), harPath);
      return this;
    }
    
    public PackingToolOptions addPackInfoPath(String packInfoPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), "--pack-info-path");
      arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), packInfoPath);
      return this;
    }
    
    public PackingToolOptions addOutPath(String outPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), "--out-path");
      arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), outPath);
      return this;
    }
    
    public PackingToolOptions addBinPath(String binPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), "--bin-path");
      arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), binPath);
      return this;
    }
    
    public PackingToolOptions addJsonPath(File jsonPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), "--json-path");
      arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), arrayOfCallSite[28].callGetProperty(jsonPath));
      return this;
    }
    
    public PackingToolOptions addPackResPath(File packResPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(packResPath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[30].call(packResPath)))))
          return this; 
        arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this), "--pack-res-path");
        arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].callGetProperty(packResPath));
        return this;
      } 
      if ((ScriptBytecodeAdapter.compareEqual(packResPath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(packResPath)))))
        return this; 
      arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this), "--pack-res-path");
      arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].callGetProperty(packResPath));
      return this;
    }
    
    public PackingToolOptions addEntryCardPath(File entryCardFile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(entryCardFile, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[37].call(entryCardFile)))))
          return this; 
        arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), "--entrycard-path");
        arrayOfCallSite[40].call(arrayOfCallSite[41].callGroovyObjectGetProperty(this), arrayOfCallSite[42].callGetProperty(entryCardFile));
        return this;
      } 
      if ((ScriptBytecodeAdapter.compareEqual(entryCardFile, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].call(entryCardFile)))))
        return this; 
      arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), "--entrycard-path");
      arrayOfCallSite[40].call(arrayOfCallSite[41].callGroovyObjectGetProperty(this), arrayOfCallSite[42].callGetProperty(entryCardFile));
      return this;
    }
    
    public PackingToolOptions addResourcesPath(String resourcesPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[43].call(arrayOfCallSite[44].callGroovyObjectGetProperty(this), "--resources-path");
      arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this), resourcesPath);
      return this;
    }
    
    public PackingToolOptions addResourceTableTxtPath(String txtPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(this), "--txt-path");
      arrayOfCallSite[49].call(arrayOfCallSite[50].callGroovyObjectGetProperty(this), txtPath);
      return this;
    }
    
    public PackingToolOptions addAssetsPath(File assetPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(assetPath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(assetPath)))))
          return this; 
        arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this), "--assets-path");
        arrayOfCallSite[55].call(arrayOfCallSite[56].callGroovyObjectGetProperty(this), arrayOfCallSite[57].callGetProperty(assetPath));
        return this;
      } 
      if ((ScriptBytecodeAdapter.compareEqual(assetPath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[51].call(assetPath)))))
        return this; 
      arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this), "--assets-path");
      arrayOfCallSite[55].call(arrayOfCallSite[56].callGroovyObjectGetProperty(this), arrayOfCallSite[57].callGetProperty(assetPath));
      return this;
    }
    
    public PackingToolOptions addDexPath(String dexPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), "--dex-path");
      arrayOfCallSite[60].call(arrayOfCallSite[61].callGroovyObjectGetProperty(this), dexPath);
      return this;
    }
    
    public PackingToolOptions addIndexPath(String indexPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[62].call(arrayOfCallSite[63].callGroovyObjectGetProperty(this), "--index-path");
      arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this), indexPath);
      return this;
    }
    
    public PackingToolOptions addLibPath(String libPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[66].call(arrayOfCallSite[67].callGroovyObjectGetProperty(this), "--lib-path");
      arrayOfCallSite[68].call(arrayOfCallSite[69].callGroovyObjectGetProperty(this), libPath);
      return this;
    }
    
    public PackingToolOptions addShellApkPath(String shellApkPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[70].call(arrayOfCallSite[71].callGroovyObjectGetProperty(this), "--shell-apk-path");
      arrayOfCallSite[72].call(arrayOfCallSite[73].callGroovyObjectGetProperty(this), shellApkPath);
      return this;
    }
    
    public PackingToolOptions addJarPath(String jarPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[74].call(arrayOfCallSite[75].callGroovyObjectGetProperty(this), "--jar-path");
      arrayOfCallSite[76].call(arrayOfCallSite[77].callGroovyObjectGetProperty(this), jarPath);
      return this;
    }
    
    public PackingToolOptions force(boolean force) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[78].call(arrayOfCallSite[79].callGroovyObjectGetProperty(this), "--force");
      arrayOfCallSite[80].call(arrayOfCallSite[81].callGroovyObjectGetProperty(this), arrayOfCallSite[82].call(String.class, Boolean.valueOf(force)));
      return this;
    }
  }
  
  public class SigningOptions implements GroovyObject {
    @Generated
    public SigningOptions() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public SigningOptions sign() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "sign");
      return this;
    }
    
    public SigningOptions addMode(String mode) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), "-mode");
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), mode);
      return this;
    }
    
    public SigningOptions addProfile(String profile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), "-profile");
      arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), profile);
      return this;
    }
    
    public SigningOptions addSignAlg(String signAlg) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), "-signAlg");
      arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), signAlg);
      return this;
    }
    
    public SigningOptions addPrivateKey(String privatekey) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), "-privatekey");
      arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), privatekey);
      return this;
    }
    
    public SigningOptions profileSigned() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), "-profileSigned");
      arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), "1");
      return this;
    }
    
    public SigningOptions addKeyStore(String keyStoreFile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), "-keystore");
      arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), keyStoreFile);
      return this;
    }
    
    public SigningOptions addKeyStorePwd(String keyStorePwd) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), "-keystorepasswd");
      arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), keyStorePwd);
      return this;
    }
    
    public SigningOptions addKeyAliasPwd(String keyAliasPwd) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this), "-keyaliaspasswd");
      arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), keyAliasPwd);
      return this;
    }
    
    public SigningOptions addCertPath(String certPath) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), "-certpath");
      arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this), certPath);
      return this;
    }
    
    public SigningOptions addKs(String ks) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), "--ks");
      arrayOfCallSite[40].call(arrayOfCallSite[41].callGroovyObjectGetProperty(this), ks);
      return this;
    }
    
    public SigningOptions addKsPass(String ksPass) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), "--ks-pass");
      arrayOfCallSite[44].call(arrayOfCallSite[45].callGroovyObjectGetProperty(this), ksPass);
      return this;
    }
    
    public SigningOptions addKsKeyAlias(String ksKeyAlias) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[46].call(arrayOfCallSite[47].callGroovyObjectGetProperty(this), "--ks-key-alias");
      arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this), ksKeyAlias);
      return this;
    }
    
    public SigningOptions addKeyPass(String keyPass) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), "--key-pass");
      arrayOfCallSite[52].call(arrayOfCallSite[53].callGroovyObjectGetProperty(this), keyPass);
      return this;
    }
    
    public SigningOptions addOut(String out) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this), "--out");
      arrayOfCallSite[56].call(arrayOfCallSite[57].callGroovyObjectGetProperty(this), out);
      return this;
    }
    
    public SigningOptions addInputFile(String inputFile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), "-inputFile");
      arrayOfCallSite[60].call(arrayOfCallSite[61].callGroovyObjectGetProperty(this), inputFile);
      return this;
    }
    
    public SigningOptions addOutputFile(String outputFile) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[62].call(arrayOfCallSite[63].callGroovyObjectGetProperty(this), "-outputFile");
      arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this), outputFile);
      return this;
    }
    
    public SigningOptions add(String param) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[66].call(arrayOfCallSite[67].callGroovyObjectGetProperty(this), param);
      return this;
    }
  }
  
  public class ProguardOptions implements GroovyObject {
    @Generated
    public ProguardOptions() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public ProguardOptions inJars(String path) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "-injars");
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), path);
      return this;
    }
    
    public ProguardOptions outJars(String path) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "-outjars");
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), path);
      return this;
    }
    
    public ProguardOptions libraryJars(String path) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "-libraryjars");
      arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), path);
      return this;
    }
    
    public ProguardOptions filePath(String path) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), arrayOfCallSite[14].call("@", path));
      return this;
    }
  }
  
  public class DataBindingOptions implements GroovyObject {
    @Generated
    public DataBindingOptions() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public DataBindingOptions setOutputDir(String outputDir) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "--target-src-path");
      arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), outputDir);
      return this;
    }
    
    public DataBindingOptions setModulePackageName(String packageName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "--package-name");
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].call(packageName, ".databinding"));
      return this;
    }
    
    public DataBindingOptions addInputDir(String inputDir) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), "--layout-path");
      arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), inputDir);
      return this;
    }
  }
}
