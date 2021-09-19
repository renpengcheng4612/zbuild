package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dsl.ProguardOptions;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class MergeProguardFiles extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  private ProguardOptions proguardOpt;
  
  private SdkInfo sdkInfo;
  
  @InputFiles
  private FileCollection sdkProguardFiles;
  
  @InputFiles
  @Optional
  private FileCollection harProguardFiles;
  
  @InputFiles
  @Optional
  private FileCollection projectProguardFiles;
  
  @OutputFile
  private File outputFile;
  
  @OutputFile
  @Optional
  private File consumerFile;
  
  static {
    Object object = $getCallSiteArray()[48].call(HMLogger.class, MergeProguardFiles.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public MergeProguardFiles(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGroovyObjectGetProperty(variantData));
    this.proguardOpt = (ProguardOptions)ScriptBytecodeAdapter.castToType(object1, ProguardOptions.class);
    Object object2 = arrayOfCallSite[2].callGroovyObjectGetProperty(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this), arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(this.sdkInfo)))));
    this.sdkProguardFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object3, FileCollection.class);
    Object object4 = arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].callGroovyObjectGetProperty(this.proguardOpt));
    this.projectProguardFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object4, FileCollection.class);
    Object object5 = arrayOfCallSite[12].call(variantData, arrayOfCallSite[13].callGetProperty(HarmonyArtifacts.ArtifactType.class));
    this.harProguardFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object5, FileCollection.class);
    Object object6 = arrayOfCallSite[14].call(arrayOfCallSite[15].call(Paths.class, arrayOfCallSite[16].call(arrayOfCallSite[17].call(variantData))));
    this.outputFile = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[18].call(arrayOfCallSite[19].call(Paths.class, arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[22].callGroovyObjectGetProperty(variantData), arrayOfCallSite[23].callGetProperty(BuildConst.class), arrayOfCallSite[24].callGetProperty(BuildConst.class)));
    this.consumerFile = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(FileUtils.class, arrayOfCallSite[26].callGetProperty(this.outputFile))))
      arrayOfCallSite[27].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[28].callGetProperty(arrayOfCallSite[29].callGetProperty(this.outputFile))); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[30].call(FileUtils.class, this.outputFile)))
      arrayOfCallSite[31].call(hmLogger, "Unable to create or delete the %s file. An incremental problem may occur.", arrayOfCallSite[32].callGetProperty(this.outputFile)); 
    FileCollection fullProguardRules = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(arrayOfCallSite[34].call(this.sdkProguardFiles, this.projectProguardFiles), this.harProguardFiles), FileCollection.class);
    File file;
    Iterator iterator1;
    for (file = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].call(fullProguardRules), Iterator.class); iterator1.hasNext(); ) {
      file = (File)ScriptBytecodeAdapter.castToType(iterator1.next(), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].call(file)))
        continue; 
      arrayOfCallSite[37].call(FileUtils.class, this.outputFile, file);
    } 
    if (ScriptBytecodeAdapter.compareLessThanEqual(arrayOfCallSite[38].call(arrayOfCallSite[39].call(this.proguardOpt)), Integer.valueOf(0)))
      return; 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(FileUtils.class, this.consumerFile)))
      arrayOfCallSite[41].call(hmLogger, "Unable to create or delete the %s file. An incremental problem may occur.", arrayOfCallSite[42].callGetProperty(arrayOfCallSite[43].callGroovyObjectGetProperty(this))); 
    File rules;
    Iterator iterator2;
    for (rules = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[44].call(arrayOfCallSite[45].call(this.proguardOpt)), Iterator.class); iterator2.hasNext(); ) {
      rules = (File)ScriptBytecodeAdapter.castToType(iterator2.next(), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[46].call(rules)))
        continue; 
      arrayOfCallSite[47].call(FileUtils.class, this.consumerFile, rules);
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
  public ProguardOptions getProguardOpt() {
    return this.proguardOpt;
  }
  
  @Generated
  public void setProguardOpt(ProguardOptions paramProguardOptions) {
    this.proguardOpt = paramProguardOptions;
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
  public FileCollection getSdkProguardFiles() {
    return this.sdkProguardFiles;
  }
  
  @Generated
  public void setSdkProguardFiles(FileCollection paramFileCollection) {
    this.sdkProguardFiles = paramFileCollection;
  }
  
  @Generated
  public FileCollection getHarProguardFiles() {
    return this.harProguardFiles;
  }
  
  @Generated
  public void setHarProguardFiles(FileCollection paramFileCollection) {
    this.harProguardFiles = paramFileCollection;
  }
  
  @Generated
  public FileCollection getProjectProguardFiles() {
    return this.projectProguardFiles;
  }
  
  @Generated
  public void setProjectProguardFiles(FileCollection paramFileCollection) {
    this.projectProguardFiles = paramFileCollection;
  }
  
  @Generated
  public File getOutputFile() {
    return this.outputFile;
  }
  
  @Generated
  public void setOutputFile(File paramFile) {
    this.outputFile = paramFile;
  }
  
  @Generated
  public File getConsumerFile() {
    return this.consumerFile;
  }
  
  @Generated
  public void setConsumerFile(File paramFile) {
    this.consumerFile = paramFile;
  }
}
