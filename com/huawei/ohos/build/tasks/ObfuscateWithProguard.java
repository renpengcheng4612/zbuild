package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class ObfuscateWithProguard extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputDirectory
  private File classesDir;
  
  @InputFile
  private File proguardRules;
  
  @OutputDirectory
  private File outputDir;
  
  static {
    Object object = $getCallSiteArray()[88].call(HMLogger.class, ObfuscateWithProguard.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public ObfuscateWithProguard(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object1, SdkInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    File classDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(File.class, arrayOfCallSite[3].call(this.pathInfo, arrayOfCallSite[4].callGroovyObjectGetProperty(variantData))), File.class);
    Object object3 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(classDir)), arrayOfCallSite[9].callGetProperty(BuildConst.class)));
    this.classesDir = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Paths.class, arrayOfCallSite[12].call(this.pathInfo)));
    this.outputDir = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    Object object5 = arrayOfCallSite[13].call(arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].call(arrayOfCallSite[16].call(variantData))));
    this.proguardRules = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String proguard = ShortTypeHandling.castToString(arrayOfCallSite[17].call(this.sdkInfo));
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    JavaCommandBuilder.ProguardOptions options = (JavaCommandBuilder.ProguardOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].callConstructor(JavaCommandBuilder.ProguardOptions.class, builder), JavaCommandBuilder.ProguardOptions.class);
    arrayOfCallSite[20].call(builder, proguard);
    arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].call(options, arrayOfCallSite[24].callGetProperty(this.classesDir)), arrayOfCallSite[25].callGetProperty(this.outputDir)), arrayOfCallSite[26].callGetProperty(this.proguardRules));
    List<String> jdkLibPaths = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<String> list = findJdkLibs();
    } else {
      Object object1 = arrayOfCallSite[27].callStatic(ObfuscateWithProguard.class);
      jdkLibPaths = (List<String>)ScriptBytecodeAdapter.castToType(object1, List.class);
    } 
    String path;
    Iterator iterator1;
    for (path = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].call(jdkLibPaths), Iterator.class); iterator1.hasNext(); ) {
      path = ShortTypeHandling.castToString(iterator1.next());
      arrayOfCallSite[29].call(options, path);
    } 
    FileCollection libraries = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this), arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), arrayOfCallSite[34].call(arrayOfCallSite[35].call(arrayOfCallSite[36].call(this.variantData)), arrayOfCallSite[37].callGetProperty(File.class)))), FileCollection.class);
    Object object = arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(libraries, arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), arrayOfCallSite[44].call(arrayOfCallSite[45].call(Paths.class, arrayOfCallSite[46].call(this.pathInfo), arrayOfCallSite[47].callGetProperty(BuildConst.class))))), arrayOfCallSite[48].call(this.variantData)), arrayOfCallSite[49].call(this.variantData)), arrayOfCallSite[50].call(this.variantData));
    libraries = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    File file;
    Iterator iterator2;
    for (file = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(arrayOfCallSite[52].call(libraries)), Iterator.class); iterator2.hasNext(); ) {
      file = (File)ScriptBytecodeAdapter.castToType(iterator2.next(), File.class);
      arrayOfCallSite[53].call(options, arrayOfCallSite[54].callGetProperty(file));
    } 
    arrayOfCallSite[55].call(hmLogger, "proguard", arrayOfCallSite[56].call(arrayOfCallSite[57].call(builder), " "));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].callConstructor(ProcessUtils.class, arrayOfCallSite[59].callGroovyObjectGetProperty(this)), ProcessUtils.class);
    arrayOfCallSite[60].call(processUtils, arrayOfCallSite[61].call(builder), hmLogger);
  }
  
  public static List<String> findJdkLibs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> libraries = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].callConstructor(ArrayList.class), List.class);
    Object javaHome = arrayOfCallSite[63].call(System.class, "java.home");
    if (ScriptBytecodeAdapter.compareNotEqual(javaHome, null)) {
      arrayOfCallSite[64].callStatic(ObfuscateWithProguard.class, arrayOfCallSite[65].callConstructor(File.class, arrayOfCallSite[66].call(arrayOfCallSite[67].call(javaHome, arrayOfCallSite[68].callGetProperty(File.class)), "lib")), libraries);
      arrayOfCallSite[69].callStatic(ObfuscateWithProguard.class, arrayOfCallSite[70].callConstructor(File.class, arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].call(arrayOfCallSite[74].call(javaHome, arrayOfCallSite[75].callGetProperty(File.class)), "lib"), arrayOfCallSite[76].callGetProperty(File.class)), "ext")), libraries);
    } 
    return libraries;
  }
  
  public static void findJars(File dir, List list) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File[] files = (File[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[77].call(dir), File[].class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(files, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[79].callGetProperty(files), Integer.valueOf(0))))
        return; 
    } else if ((ScriptBytecodeAdapter.compareEqual(files, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[78].callGetProperty(files), Integer.valueOf(0)))) {
      return;
    } 
    File f;
    Iterator iterator;
    for (f = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].call(files), Iterator.class); iterator.hasNext(); ) {
      f = (File)ScriptBytecodeAdapter.castToType(iterator.next(), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(f), arrayOfCallSite[84].call(Locale.class)), arrayOfCallSite[85].callGetProperty(BuildConst.class))))
        arrayOfCallSite[86].call(list, arrayOfCallSite[87].callGetProperty(f)); 
    } 
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
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
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
  public File getClassesDir() {
    return this.classesDir;
  }
  
  @Generated
  public void setClassesDir(File paramFile) {
    this.classesDir = paramFile;
  }
  
  @Generated
  public File getProguardRules() {
    return this.proguardRules;
  }
  
  @Generated
  public void setProguardRules(File paramFile) {
    this.proguardRules = paramFile;
  }
  
  @Generated
  public File getOutputDir() {
    return this.outputDir;
  }
  
  @Generated
  public void setOutputDir(File paramFile) {
    this.outputDir = paramFile;
  }
}
