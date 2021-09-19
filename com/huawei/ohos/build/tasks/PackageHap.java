package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.CommandBuildFactory;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.PackOptionsBuilder;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.validate.ValidateUtil;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.Pair;

public class PackageHap extends DefaultTask implements GroovyObject {
  private ConfigInfo configInfo;
  
  private PathInfo pathInfo;
  
  private Path liteJsOutputDir;
  
  private Path richJsOutputDir;
  
  private PackOptionsBuilder packOptionsBuilder;
  
  @Internal
  private VariantData variantData;
  
  @Nested
  private PackModel packModel;
  
  @InputDirectory
  @Optional
  public Path getLitePseudoDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Path litePseudoDir = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(Paths.class, arrayOfCallSite[17].call(this.pathInfo, arrayOfCallSite[18].callGetProperty(BuildConst.class))), Path.class);
    return (Path)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(Files.class, litePseudoDir)) ? litePseudoDir : null, Path.class);
  }
  
  @InputDirectory
  @Optional
  public Path getRichPseudoDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Path richPseudoDir = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].call(Paths.class, arrayOfCallSite[21].call(this.pathInfo, arrayOfCallSite[22].callGetProperty(BuildConst.class))), Path.class);
    return (Path)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[23].call(Files.class, richPseudoDir)) ? richPseudoDir : null, Path.class);
  }
  
  @Inject
  public PackageHap(Pair packModelPair) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(packModelPair);
    this.packModel = (PackModel)ScriptBytecodeAdapter.castToType(object1, PackModel.class);
    Object object2 = arrayOfCallSite[1].call(this.packModel);
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(object2, VariantData.class);
    Object object3 = arrayOfCallSite[2].call(this.variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
    Object object4 = arrayOfCallSite[3].call(this.variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(CommandBuildFactory.class), packModelPair);
    this.packOptionsBuilder = (PackOptionsBuilder)ScriptBytecodeAdapter.castToType(object5, PackOptionsBuilder.class);
    Object object6 = arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(this.pathInfo, arrayOfCallSite[8].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[9].callGetProperty(BuildConst.class)), arrayOfCallSite[10].callGetProperty(PathConst.class));
    this.liteJsOutputDir = (Path)ScriptBytecodeAdapter.castToType(object6, Path.class);
    Object object7 = arrayOfCallSite[11].call(Paths.class, arrayOfCallSite[12].call(this.pathInfo, arrayOfCallSite[13].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[14].callGetProperty(BuildConst.class)), arrayOfCallSite[15].callGetProperty(PathConst.class));
    this.richJsOutputDir = (Path)ScriptBytecodeAdapter.castToType(object7, Path.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[24].call(ValidateUtil.class, this.configInfo);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(this.configInfo))) {
        copyPseudoJsonFile();
        null;
      } 
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(this.configInfo))) {
      arrayOfCallSite[26].callCurrent(this);
    } 
    arrayOfCallSite[28].call(this.packOptionsBuilder);
  }
  
  private void copyPseudoJsonFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[29].callGroovyObjectGetProperty(this), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[30].call(Files.class, arrayOfCallSite[31].callGroovyObjectGetProperty(this))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(Files.class, this.liteJsOutputDir))))
      arrayOfCallSite[33].call(FileUtils.class, arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this)), arrayOfCallSite[36].call(this.liteJsOutputDir)); 
    if ((((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[37].callGroovyObjectGetProperty(this), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[38].call(Files.class, arrayOfCallSite[39].callGroovyObjectGetProperty(this))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(Files.class, this.richJsOutputDir))))
      arrayOfCallSite[41].call(FileUtils.class, arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this)), arrayOfCallSite[44].call(this.richJsOutputDir)); 
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
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
  }
  
  @Generated
  public Path getLiteJsOutputDir() {
    return this.liteJsOutputDir;
  }
  
  @Generated
  public void setLiteJsOutputDir(Path paramPath) {
    this.liteJsOutputDir = paramPath;
  }
  
  @Generated
  public Path getRichJsOutputDir() {
    return this.richJsOutputDir;
  }
  
  @Generated
  public void setRichJsOutputDir(Path paramPath) {
    this.richJsOutputDir = paramPath;
  }
  
  @Generated
  public PackOptionsBuilder getPackOptionsBuilder() {
    return this.packOptionsBuilder;
  }
  
  @Generated
  public void setPackOptionsBuilder(PackOptionsBuilder paramPackOptionsBuilder) {
    this.packOptionsBuilder = paramPackOptionsBuilder;
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
  public PackModel getPackModel() {
    return this.packModel;
  }
  
  @Generated
  public void setPackModel(PackModel paramPackModel) {
    this.packModel = paramPackModel;
  }
}
