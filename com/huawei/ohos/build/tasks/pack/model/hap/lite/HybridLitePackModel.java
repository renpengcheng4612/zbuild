package com.huawei.ohos.build.tasks.pack.model.hap.lite;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.hap.rich.EntryPackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.rich.HapPackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFiles;

public class HybridLitePackModel extends CoreLitePackModel {
  @Nonnull
  @Nested
  private SingleLitePackModel singleLitePackModel;
  
  @Nonnull
  @Nested
  private HapPackModel hapPackModel;
  
  @OutputFiles
  @Optional
  private FileCollection hapFiles;
  
  private Map<String, File> hapFileMap;
  
  @InputFiles
  public FileCollection getApkFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this)), arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)))), FileCollection.class);
  }
  
  @InputFiles
  @Optional
  public FileCollection getAssetsFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileCollection assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this)), FileCollection.class);
    assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(assetsFiles, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), arrayOfCallSite[18].callGroovyObjectGetProperty(arrayOfCallSite[19].callGroovyObjectGetProperty(this)), arrayOfCallSite[20].callGetProperty(BuildConst.class)))), FileCollection.class);
    arrayOfCallSite[13].call(assetsFiles, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), arrayOfCallSite[18].callGroovyObjectGetProperty(arrayOfCallSite[19].callGroovyObjectGetProperty(this)), arrayOfCallSite[20].callGetProperty(BuildConst.class))));
    assetsFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].call(assetsFiles, arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), arrayOfCallSite[26].callGroovyObjectGetProperty(arrayOfCallSite[27].callGroovyObjectGetProperty(this)), arrayOfCallSite[28].callGetProperty(BuildConst.class)))), FileCollection.class);
    arrayOfCallSite[21].call(assetsFiles, arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), arrayOfCallSite[26].callGroovyObjectGetProperty(arrayOfCallSite[27].callGroovyObjectGetProperty(this)), arrayOfCallSite[28].callGetProperty(BuildConst.class))));
    return assetsFiles;
  }
  
  public HybridLitePackModel(Project project, VariantData variantData, DeviceType liteDeviceType) {
    super(project, variantData, liteDeviceType);
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.hapFileMap = (Map<String, File>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    Object object2 = arrayOfCallSite[1].callConstructor(SingleLitePackModel.class, project, variantData, liteDeviceType);
    this.singleLitePackModel = (SingleLitePackModel)ScriptBytecodeAdapter.castToType(object2, SingleLitePackModel.class);
    Object object3 = arrayOfCallSite[2].callConstructor(EntryPackModel.class, project, variantData, Boolean.valueOf(true));
    this.hapPackModel = (HapPackModel)ScriptBytecodeAdapter.castToType(object3, HapPackModel.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      populateOutputs();
      null;
      return;
    } 
    arrayOfCallSite[3].callCurrent((GroovyObject)this);
  }
  
  @Nonnull
  public SingleLitePackModel getSingleLitePackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.singleLitePackModel;
  }
  
  @Nonnull
  public HapPackModel getHapPackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.hapPackModel;
  }
  
  public void populateOutputs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object = arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), arrayOfCallSite[31].call(this.singleLitePackModel));
    this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(this.hapFiles, arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].call(this.hapPackModel))), FileCollection.class);
    arrayOfCallSite[32].call(this.hapFiles, arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].call(this.hapPackModel)));
    arrayOfCallSite[36].call(this.hapFileMap, arrayOfCallSite[37].call(this.singleLitePackModel));
    arrayOfCallSite[38].call(this.hapFileMap, arrayOfCallSite[39].call(this.hapPackModel));
  }
  
  @Generated
  public FileCollection getHapFiles() {
    return this.hapFiles;
  }
  
  @Generated
  public void setHapFiles(FileCollection paramFileCollection) {
    this.hapFiles = paramFileCollection;
  }
  
  @Generated
  public Map<String, File> getHapFileMap() {
    return this.hapFileMap;
  }
  
  @Generated
  public void setHapFileMap(Map<String, File> paramMap) {
    this.hapFileMap = paramMap;
  }
}
