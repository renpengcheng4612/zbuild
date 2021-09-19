package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.har.HarPackModel;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Date;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.internal.artifacts.publish.DefaultPublishArtifact;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.InputChanges;

public class PackageHar extends IncrementalTask {
  private static final HMLogger hmLogger;
  
  @NonNull
  private BuildType buildType;
  
  private VariantData variantData;
  
  private PathInfo pathInfo;
  
  @InputFile
  private File packageToolFile;
  
  @InputFile
  private File configJsonFile;
  
  @InputFile
  private File classesJarFile;
  
  @InputDirectory
  private File resDir;
  
  @InputDirectory
  private File libSoDir;
  
  @OutputFile
  private File outputHar;
  
  @Internal
  private PackModel packModel;
  
  static {
    Object object = $getCallSiteArray()[130].call(HMLogger.class, PackageHar.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputDirectory
  @Optional
  public File getAssetsPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File assetsFolder = null;
    Object object = arrayOfCallSite[30].callConstructor(File.class, arrayOfCallSite[31].call(this.pathInfo, arrayOfCallSite[32].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[33].callGetProperty(BuildConst.class)));
    assetsFolder = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(assetsFolder)))
      return (File)ScriptBytecodeAdapter.castToType(null, File.class); 
    return assetsFolder;
  }
  
  @InputDirectory
  @Optional
  public File getAssetsWatchOnly() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File assetsWatchOnly = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].call(arrayOfCallSite[36].call(Paths.class, arrayOfCallSite[37].call(this.pathInfo), arrayOfCallSite[38].callGetProperty(PathConst.class))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[39].call(assetsWatchOnly)))
      return assetsWatchOnly; 
    return (File)ScriptBytecodeAdapter.castToType(null, File.class);
  }
  
  @Inject
  public PackageHar(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].callConstructor(HarPackModel.class, arrayOfCallSite[2].callGroovyObjectGetProperty(this), variantData);
    this.packModel = (PackModel)ScriptBytecodeAdapter.castToType(object2, PackModel.class);
    Object object3 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[4].call(this.packModel);
    this.packageToolFile = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    Object object5 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(this.pathInfo), arrayOfCallSite[8].callGetProperty(CommonConst.class)));
    this.configJsonFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[9].callGetProperty(this.buildType), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(arrayOfCallSite[11].callGetProperty(this.buildType))))) {
      Object object = arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(this.pathInfo), arrayOfCallSite[15].callGetProperty(BuildConst.class)));
      this.classesJarFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[16].call(arrayOfCallSite[17].call(Paths.class, arrayOfCallSite[18].call(this.pathInfo), arrayOfCallSite[19].callGroovyObjectGetProperty(variantData), arrayOfCallSite[20].callGetProperty(BuildConst.class)));
      this.classesJarFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    Object object6 = arrayOfCallSite[21].call(arrayOfCallSite[22].call(Paths.class, arrayOfCallSite[23].call(this.pathInfo), arrayOfCallSite[24].callGetProperty(PathConst.class)));
    this.resDir = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[25].call(arrayOfCallSite[26].call(Paths.class, arrayOfCallSite[27].call(this.pathInfo)));
    this.libSoDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[28].call(this.packModel);
    this.outputHar = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      configPublishArtifact();
      null;
      return;
    } 
    arrayOfCallSite[29].callCurrent(this);
  }
  
  private void configPublishArtifact() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String archiveName = ShortTypeHandling.castToString(arrayOfCallSite[40].call(arrayOfCallSite[41].callGetProperty(arrayOfCallSite[42].callGroovyObjectGetProperty(this)), arrayOfCallSite[43].callGetProperty(BuildConst.class)));
    String archiveExtension = ShortTypeHandling.castToString(arrayOfCallSite[44].call(this.packModel));
    File archiveFile = this.outputHar;
    String archiveClassifier = null;
    String archiveType = ShortTypeHandling.castToString(arrayOfCallSite[45].call(this.packModel));
    Date date = (Date)ScriptBytecodeAdapter.castToType(arrayOfCallSite[46].callConstructor(Date.class), Date.class);
    DefaultPublishArtifact defaultPublishArtifact = (DefaultPublishArtifact)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].callConstructor(DefaultPublishArtifact.class, ArrayUtil.createArray(archiveName, archiveExtension, archiveType, archiveClassifier, date, archiveFile, this)), DefaultPublishArtifact.class);
    arrayOfCallSite[48].call(arrayOfCallSite[49].call(arrayOfCallSite[50].callGroovyObjectGetProperty(this)), arrayOfCallSite[51].call(arrayOfCallSite[52].callGroovyObjectGetProperty(this.variantData), "ApiPublish"), defaultPublishArtifact);
    arrayOfCallSite[53].call(arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(this)), arrayOfCallSite[56].call(arrayOfCallSite[57].callGroovyObjectGetProperty(this.variantData), "RuntimePublish"), defaultPublishArtifact);
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object libPath = arrayOfCallSite[58].call(arrayOfCallSite[59].call(Paths.class, arrayOfCallSite[60].callGroovyObjectGetProperty(this.pathInfo)));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[61].call(libPath)))
      arrayOfCallSite[62].call(hmLogger, "WARN: %s", arrayOfCallSite[63].call(arrayOfCallSite[64].call(new GStringImpl(new Object[] { arrayOfCallSite[65].callGetProperty(arrayOfCallSite[66].callGroovyObjectGetProperty(this)) }, new String[] { "HAR generated by this ", " project has been corrupted. " }), "Direct local .har file dependencies are not supported when building HAR. As a result, The resulting HAR is broken because the classes "), "and Harmony resources from the local .har file dependencies are not packaged in the resulting HAR.")); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[67].call(this.libSoDir)))
      arrayOfCallSite[68].call(this.libSoDir); 
    File harFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].call(this.packModel), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call(harFile)))
      arrayOfCallSite[71].call(harFile); 
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    JavaCommandBuilder.PackingToolOptions options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[73].callConstructor(JavaCommandBuilder.PackingToolOptions.class, builder), JavaCommandBuilder.PackingToolOptions.class);
    arrayOfCallSite[74].call(builder, arrayOfCallSite[75].call(arrayOfCallSite[76].call(this.packageToolFile)));
    arrayOfCallSite[77].call(arrayOfCallSite[78].call(options, "har"), this.configJsonFile);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[79].call(this.classesJarFile)))
      arrayOfCallSite[80].call(options, arrayOfCallSite[81].call(arrayOfCallSite[82].call(this.classesJarFile))); 
    arrayOfCallSite[83].callCurrent(this, options);
    arrayOfCallSite[84]
      
      .call(arrayOfCallSite[85].call(arrayOfCallSite[86].call(arrayOfCallSite[87].call(arrayOfCallSite[88].call(options, arrayOfCallSite[89].call(arrayOfCallSite[90].call(this.libSoDir))), arrayOfCallSite[91].callGroovyObjectGetProperty(this)), arrayOfCallSite[92].call(arrayOfCallSite[93].call(this.resDir))), arrayOfCallSite[94].call(arrayOfCallSite[95].call(this.outputHar))), Boolean.valueOf(true));
    arrayOfCallSite[96].call(hmLogger, "package", arrayOfCallSite[97].call(arrayOfCallSite[98].call(builder), " "));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[99].callConstructor(ProcessUtils.class, arrayOfCallSite[100].callGroovyObjectGetProperty(this), "Package failed"), ProcessUtils.class);
    arrayOfCallSite[101].call(processUtils, arrayOfCallSite[102].call(builder), hmLogger);
  }
  
  private Object writeTxtToHar(JavaCommandBuilder.PackingToolOptions options) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File txtDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[103].call(arrayOfCallSite[104].call(Paths.class, arrayOfCallSite[105].call(this.pathInfo), arrayOfCallSite[106].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[107].callGetProperty(BuildConst.class))), File.class);
    File rTxt = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[108].call(arrayOfCallSite[109].call(Paths.class, arrayOfCallSite[110].callGetProperty(txtDir), arrayOfCallSite[111].callGetProperty(BuildConst.class))), File.class);
    File resourceTableTxt = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[112].call(arrayOfCallSite[113].call(Paths.class, arrayOfCallSite[114].callGetProperty(txtDir), arrayOfCallSite[115].callGetProperty(BuildConst.class))), File.class);
    File proguardTxt = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[116].call(arrayOfCallSite[117].call(Paths.class, arrayOfCallSite[118].callGetProperty(txtDir), arrayOfCallSite[119].callGetProperty(BuildConst.class))), File.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[122].call(rTxt))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[123].call(proguardTxt)))))
        return null; 
    } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[120].call(rTxt))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[121].call(proguardTxt))))) {
      return null;
    } 
    arrayOfCallSite[124].call(resourceTableTxt);
    arrayOfCallSite[125].call(rTxt, resourceTableTxt);
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[126].call(resourceTableTxt)) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[127].call(proguardTxt))))
      return arrayOfCallSite[128].call(options, arrayOfCallSite[129].callGetProperty(txtDir)); 
    return null;
  }
  
  @Generated
  public File getPackageToolFile() {
    return this.packageToolFile;
  }
  
  @Generated
  public void setPackageToolFile(File paramFile) {
    this.packageToolFile = paramFile;
  }
  
  @Generated
  public File getConfigJsonFile() {
    return this.configJsonFile;
  }
  
  @Generated
  public void setConfigJsonFile(File paramFile) {
    this.configJsonFile = paramFile;
  }
  
  @Generated
  public File getClassesJarFile() {
    return this.classesJarFile;
  }
  
  @Generated
  public void setClassesJarFile(File paramFile) {
    this.classesJarFile = paramFile;
  }
  
  @Generated
  public File getResDir() {
    return this.resDir;
  }
  
  @Generated
  public void setResDir(File paramFile) {
    this.resDir = paramFile;
  }
  
  @Generated
  public File getLibSoDir() {
    return this.libSoDir;
  }
  
  @Generated
  public void setLibSoDir(File paramFile) {
    this.libSoDir = paramFile;
  }
  
  @Generated
  public File getOutputHar() {
    return this.outputHar;
  }
  
  @Generated
  public void setOutputHar(File paramFile) {
    this.outputHar = paramFile;
  }
  
  @Generated
  public PackModel getPackModel() {
    return this.packModel;
  }
  
  @Generated
  public void setPackModel(PackModel paramPackModel) {
    this.packModel = paramPackModel;
  }
}
