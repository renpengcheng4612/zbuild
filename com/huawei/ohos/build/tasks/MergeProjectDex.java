package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.BaseExtension;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.InputChanges;

public class MergeProjectDex extends IncrementalTask {
  private static final String COM_ANDROID_TOOLS_R8_D8 = "com.android.tools.r8.D8";
  
  private static final String CLASS_FILE_EXTENSION = "class";
  
  private static final String MODULE_INFO_FILE = "module-info";
  
  @NonNull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputFile
  private File ohosJar;
  
  @InputFile
  private File rtJavaJar;
  
  @InputFile
  private File ohosIviJar;
  
  @Internal
  private File classFile;
  
  @InputDirectory
  @Optional
  private File obfuscatedClassesDir;
  
  @InputDirectory
  @Optional
  private File classesDir;
  
  static {
    Object object = $getCallSiteArray()[107].call(HMLogger.class, MergeProjectDex.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @OutputDirectory
  @Optional
  public File getOutputDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(arrayOfCallSite[30].call(Paths.class, arrayOfCallSite[31].call(this.pathInfo, arrayOfCallSite[32].call(this.variantData)))), File.class);
  }
  
  @Inject
  public MergeProjectDex(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].call(arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].call(this.sdkInfo), "car", arrayOfCallSite[6].callGetProperty(SdkConst.class)));
    this.ohosIviJar = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    Object object5 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, arrayOfCallSite[9].call(this.sdkInfo), arrayOfCallSite[10].callGetProperty(SdkConst.class)));
    this.ohosJar = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[11].call(arrayOfCallSite[12].call(Paths.class, arrayOfCallSite[13].call(this.sdkInfo), arrayOfCallSite[14].callGetProperty(SdkConst.class)));
    this.rtJavaJar = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[15].call(arrayOfCallSite[16].call(Paths.class, arrayOfCallSite[17].call(this.pathInfo), arrayOfCallSite[18].callGroovyObjectGetProperty(variantData), "classes"));
    this.classesDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[19].call(arrayOfCallSite[20].call(Paths.class, arrayOfCallSite[21].call(this.pathInfo), arrayOfCallSite[22].callGroovyObjectGetProperty(variantData), "classFiles"));
    this.classFile = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[23].callGetProperty(this.buildType), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(this.buildType))))) {
      Object object = arrayOfCallSite[26].call(arrayOfCallSite[27].call(Paths.class, arrayOfCallSite[28].call(this.pathInfo)));
      this.obfuscatedClassesDir = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[33].call(FileUtils.class, arrayOfCallSite[34].callGroovyObjectGetProperty(this))))
      arrayOfCallSite[35].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[36].callGetProperty(arrayOfCallSite[37].callGroovyObjectGetProperty(this))); 
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].callConstructor(ProcessUtils.class, arrayOfCallSite[39].callGroovyObjectGetProperty(this)), ProcessUtils.class);
    File workDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].callConstructor(File.class, arrayOfCallSite[41].call(this.sdkInfo)), File.class);
    Object minSdkVersion = arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this)), BaseExtension.class)));
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[48]
      
      .call(arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(builder, "-Xmx1024M"), "-Xss1m"), arrayOfCallSite[52].call(this.sdkInfo)), COM_ANDROID_TOOLS_R8_D8);
    JavaCommandBuilder.D8Options options = (JavaCommandBuilder.D8Options)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(JavaCommandBuilder.D8Options.class, builder), JavaCommandBuilder.D8Options.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[66].callGetProperty(this.buildType), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[67].call(arrayOfCallSite[68].callGetProperty(this.buildType))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[69].call(this.obfuscatedClassesDir)))) {
        arrayOfCallSite[70].callCurrent(this, this.classFile, this.obfuscatedClassesDir);
        arrayOfCallSite[71].call(hmLogger, "d8", "Execute the obfuscated packaging.");
      } else if ((ScriptBytecodeAdapter.compareNotEqual(this.classesDir, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[72].call(arrayOfCallSite[73].call(this.classesDir)), Integer.valueOf(0)))) {
        arrayOfCallSite[74].callCurrent(this, this.classFile, this.classesDir);
        arrayOfCallSite[75].call(hmLogger, "d8", "Execute non-obfuscation packaging.");
      } else {
        arrayOfCallSite[76].call(hmLogger, arrayOfCallSite[77].callConstructor(GradleException.class, "No dex input file. D8 will exit."));
      } 
    } else if ((((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[54].callGetProperty(this.buildType), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(arrayOfCallSite[56].callGetProperty(this.buildType))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].call(this.obfuscatedClassesDir)))) {
      arrayOfCallSite[58].callCurrent(this, this.classFile, this.obfuscatedClassesDir);
      arrayOfCallSite[59].call(hmLogger, "d8", "Execute the obfuscated packaging.");
    } else if ((ScriptBytecodeAdapter.compareNotEqual(this.classesDir, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[60].call(arrayOfCallSite[61].call(this.classesDir)), Integer.valueOf(0)))) {
      arrayOfCallSite[62].callCurrent(this, this.classFile, this.classesDir);
      arrayOfCallSite[63].call(hmLogger, "d8", "Execute non-obfuscation packaging.");
    } else {
      arrayOfCallSite[64].call(hmLogger, arrayOfCallSite[65].callConstructor(GradleException.class, "No dex input file. D8 will exit."));
    } 
    arrayOfCallSite[78]
      
      .call(arrayOfCallSite[79].call(arrayOfCallSite[80].call(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(options, arrayOfCallSite[84].callGetProperty(this.classFile)), arrayOfCallSite[85].callGetProperty(arrayOfCallSite[86].callGroovyObjectGetProperty(this))), arrayOfCallSite[87].callGetProperty(this.rtJavaJar)), arrayOfCallSite[88].callGetProperty(this.ohosJar)), arrayOfCallSite[89].callGetProperty(this.ohosIviJar)), arrayOfCallSite[90].call(minSdkVersion));
    arrayOfCallSite[91].call(hmLogger, "d8", arrayOfCallSite[92].call(arrayOfCallSite[93].call(builder), " "));
    arrayOfCallSite[94].call(processUtils, arrayOfCallSite[95].call(builder), workDir, hmLogger);
    arrayOfCallSite[96].call(Files.class, arrayOfCallSite[97].call(Paths.class, arrayOfCallSite[98].call(this.classFile)));
  }
  
  private void generateClassFile(File allClassesFile, File classesDir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference bw = new Reference(null);
    File outputClassesFile = allClassesFile;
    File beginDir = classesDir;
    try {
      Object object = arrayOfCallSite[99].callConstructor(BufferedWriter.class, arrayOfCallSite[100].callConstructor(FileWriter.class, outputClassesFile));
      bw.set(ScriptBytecodeAdapter.castToType(object, BufferedWriter.class));
      arrayOfCallSite[101].call(Files.class, arrayOfCallSite[102].call(Paths.class, arrayOfCallSite[103].call(beginDir)), new GroovyObject(bw) {
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              String fileExtension = ShortTypeHandling.castToString(arrayOfCallSite[0].call(FileUtils.class, arrayOfCallSite[1].call(arrayOfCallSite[2].call(file))));
              String fileBaseName = ShortTypeHandling.castToString(arrayOfCallSite[3].call(FileUtils.class, arrayOfCallSite[4].call(arrayOfCallSite[5].call(file))));
              if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
                if ((ScriptBytecodeAdapter.compareNotEqual(fileBaseName, arrayOfCallSite[10].callGetProperty(MergeProjectDex.class)) && ScriptBytecodeAdapter.compareEqual(fileExtension, arrayOfCallSite[11].callGetProperty(MergeProjectDex.class))))
                  arrayOfCallSite[12].call(this.bw.get(), arrayOfCallSite[13].call(file)); 
                return (FileVisitResult)ShortTypeHandling.castToEnum(arrayOfCallSite[14].callGetProperty(FileVisitResult.class), FileVisitResult.class);
              } 
              if ((ScriptBytecodeAdapter.compareNotEqual(fileBaseName, arrayOfCallSite[6].callGetProperty(MergeProjectDex.class)) && ScriptBytecodeAdapter.compareEqual(fileExtension, arrayOfCallSite[7].callGetProperty(MergeProjectDex.class))))
                arrayOfCallSite[8].call(this.bw.get(), arrayOfCallSite[9].call(file)); 
              return (FileVisitResult)ShortTypeHandling.castToEnum(arrayOfCallSite[14].callGetProperty(FileVisitResult.class), FileVisitResult.class);
            }
            
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
              CallSite[] arrayOfCallSite = $getCallSiteArray();
              arrayOfCallSite[15].call(arrayOfCallSite[16].callGetProperty(MergeProjectDex.class), "Visit %s failed.", arrayOfCallSite[17].call(file));
              return (FileVisitResult)ShortTypeHandling.castToEnum(arrayOfCallSite[18].callGetProperty(FileVisitResult.class), FileVisitResult.class);
            }
          });
    } catch (IOException e) {
    
    } finally {
      arrayOfCallSite[106].call(bw.get());
    } 
  }
  
  @Generated
  public File getOhosJar() {
    return this.ohosJar;
  }
  
  @Generated
  public void setOhosJar(File paramFile) {
    this.ohosJar = paramFile;
  }
  
  @Generated
  public File getRtJavaJar() {
    return this.rtJavaJar;
  }
  
  @Generated
  public void setRtJavaJar(File paramFile) {
    this.rtJavaJar = paramFile;
  }
  
  @Generated
  public File getOhosIviJar() {
    return this.ohosIviJar;
  }
  
  @Generated
  public void setOhosIviJar(File paramFile) {
    this.ohosIviJar = paramFile;
  }
  
  @Generated
  public File getClassFile() {
    return this.classFile;
  }
  
  @Generated
  public void setClassFile(File paramFile) {
    this.classFile = paramFile;
  }
  
  @Generated
  public File getObfuscatedClassesDir() {
    return this.obfuscatedClassesDir;
  }
  
  @Generated
  public void setObfuscatedClassesDir(File paramFile) {
    this.obfuscatedClassesDir = paramFile;
  }
  
  @Generated
  public File getClassesDir() {
    return this.classesDir;
  }
  
  @Generated
  public void setClassesDir(File paramFile) {
    this.classesDir = paramFile;
  }
}
