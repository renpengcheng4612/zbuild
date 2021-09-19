package com.huawei.ohos.build.tasks.pack.model.hap.lite;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFiles;

public class SingleLitePackModel extends CoreLitePackModel {
  @InputFile
  @Optional
  private File jsonPath;
  
  @InputDirectory
  @Optional
  private File resourcesPath;
  
  private File assetsPath;
  
  @InputFile
  @Optional
  private File indexPath;
  
  @InputFile
  @Optional
  private File binFile;
  
  @OutputFiles
  @Optional
  private FileCollection hapFiles;
  
  private Map<String, File> hapFileMap;
  
  private String liteWearableReleaseHapName;
  
  @InputFiles
  @Optional
  public FileCollection getAssetsFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[73].call(arrayOfCallSite[74].callGroovyObjectGetProperty(this))))
      return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(arrayOfCallSite[76].callGroovyObjectGetProperty(this), arrayOfCallSite[77].call(arrayOfCallSite[78].callGroovyObjectGetProperty(this), arrayOfCallSite[79].callGroovyObjectGetProperty(arrayOfCallSite[80].callGroovyObjectGetProperty(this)), arrayOfCallSite[81].callGetProperty(BuildConst.class))), FileCollection.class); 
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[82].call(arrayOfCallSite[83].callGroovyObjectGetProperty(this), arrayOfCallSite[84].call(arrayOfCallSite[85].callGroovyObjectGetProperty(this), arrayOfCallSite[86].callGroovyObjectGetProperty(arrayOfCallSite[87].callGroovyObjectGetProperty(this)), arrayOfCallSite[88].callGetProperty(BuildConst.class))), FileCollection.class);
  }
  
  @InputFiles
  public FileCollection getApkFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[89].call(arrayOfCallSite[90].call(arrayOfCallSite[91].callGroovyObjectGetProperty(this)), arrayOfCallSite[92].call(arrayOfCallSite[93].callGroovyObjectGetProperty(this))), null))
      return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[94].call(arrayOfCallSite[95].callGroovyObjectGetProperty(this), arrayOfCallSite[96].call(arrayOfCallSite[97].call(arrayOfCallSite[98].callGroovyObjectGetProperty(this)), arrayOfCallSite[99].call(arrayOfCallSite[100].callGroovyObjectGetProperty(this)))), FileCollection.class); 
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[101].call(arrayOfCallSite[102].callGroovyObjectGetProperty(this)), FileCollection.class);
  }
  
  public SingleLitePackModel(Project project, VariantData variantData, DeviceType liteDeviceType) {
    super(project, variantData, liteDeviceType);
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.hapFileMap = (Map<String, File>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    String liteDeviceBuildConst = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[1].callGetProperty(DeviceType.class)) ? arrayOfCallSite[2].callGetProperty(BuildConst.class) : arrayOfCallSite[3].callGetProperty(BuildConst.class));
    Object object2 = arrayOfCallSite[4].call(project, arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this), arrayOfCallSite[7].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
    this.indexPath = (File)ScriptBytecodeAdapter.castToType(object2, File.class);
    Object object3 = arrayOfCallSite[8].call(project, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
    this.assetsPath = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(project), "-"), arrayOfCallSite[16].callGroovyObjectGetProperty(variantData)), "-lite-unsigned.hap");
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, SingleLitePackModel.class, (GroovyObject)this, "outputFileName");
    if (ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[17].callGetProperty(DeviceType.class))) {
      Object object5 = arrayOfCallSite[18].call(project, arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this), arrayOfCallSite[21].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
      this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      Object object6 = arrayOfCallSite[22].call(project, arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), arrayOfCallSite[25].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
      this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    } 
    if (BytecodeInterface8.isOrigZ() && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[38].callGetProperty(DeviceType.class)) || ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[39].callGetProperty(DeviceType.class)))) {
        Object object5 = arrayOfCallSite[40].call(project, arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this), arrayOfCallSite[43].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
        this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
        Object object6 = arrayOfCallSite[44].call(project, arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this), arrayOfCallSite[47].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst, arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this))));
        this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
      } 
    } else if ((ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[26].callGetProperty(DeviceType.class)) || ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[27].callGetProperty(DeviceType.class)))) {
      Object object5 = arrayOfCallSite[28].call(project, arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), arrayOfCallSite[31].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst));
      this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      Object object6 = arrayOfCallSite[32].call(project, arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), arrayOfCallSite[35].callGroovyObjectGetProperty(variantData), liteDeviceBuildConst, arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this))));
      this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    } 
    if (ScriptBytecodeAdapter.compareEqual(liteDeviceType, arrayOfCallSite[50].callGetProperty(DeviceType.class))) {
      BuildType buildType = (BuildType)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(variantData), BuildType.class);
      boolean signConfigured = false;
      if (BytecodeInterface8.isOrigZ() && !BytecodeInterface8.disabledStandardMetaClass()) {
        boolean bool = ((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].call(KeyStoreHelper.class, project, arrayOfCallSite[58].call(buildType)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[59].call(arrayOfCallSite[60].callGetProperty(project), arrayOfCallSite[61].callGetProperty(BuildConst.class)))) ? true : false;
      } else {
        boolean bool = ((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(KeyStoreHelper.class, project, arrayOfCallSite[53].call(buildType)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(arrayOfCallSite[55].callGetProperty(project), arrayOfCallSite[56].callGetProperty(BuildConst.class)))) ? true : false;
      } 
      Object object5 = arrayOfCallSite[62].call(arrayOfCallSite[63].call(Paths.class, arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this), arrayOfCallSite[66].callGroovyObjectGetProperty(variantData), Boolean.valueOf(signConfigured))));
      this.binFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
      Object object6 = arrayOfCallSite[67].call(arrayOfCallSite[68].call(arrayOfCallSite[69].call(arrayOfCallSite[70].callGetProperty(project), "-"), arrayOfCallSite[71].callGroovyObjectGetProperty(variantData)), "-app-unsigned.hap");
      this.liteWearableReleaseHapName = ShortTypeHandling.castToString(object6);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      populateOutputs();
      null;
      return;
    } 
    arrayOfCallSite[72].callCurrent((GroovyObject)this);
  }
  
  public File getLiteWearableReleaseHapFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[103].call(arrayOfCallSite[104].call(Paths.class, arrayOfCallSite[105].callGetProperty(arrayOfCallSite[106].callGroovyObjectGetProperty(this)), this.liteWearableReleaseHapName)), File.class);
  }
  
  public boolean isLiteWearable() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[107].callGroovyObjectGetProperty(this), arrayOfCallSite[108].callGetProperty(DeviceType.class));
  }
  
  public void populateOutputs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File hapPathValue = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[109].callCurrent((GroovyObject)this), File.class);
    String hapKey = ShortTypeHandling.castToString(arrayOfCallSite[110].call(arrayOfCallSite[111].call(arrayOfCallSite[112].callGroovyObjectGetProperty(this)), "-app"));
    Object object = arrayOfCallSite[113].call(arrayOfCallSite[114].callGroovyObjectGetProperty(this), hapPathValue);
    this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
    arrayOfCallSite[115].call(this.hapFileMap, arrayOfCallSite[116].call(arrayOfCallSite[117].call(arrayOfCallSite[118].callGroovyObjectGetProperty(this)), arrayOfCallSite[119].call(arrayOfCallSite[120].callGroovyObjectGetProperty(arrayOfCallSite[121].callGroovyObjectGetProperty(this)))), hapPathValue);
    arrayOfCallSite[122].call(arrayOfCallSite[123].callGroovyObjectGetProperty(arrayOfCallSite[124].callGroovyObjectGetProperty(this)), hapKey, arrayOfCallSite[125].callGetProperty(hapPathValue));
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((isLiteWearable() && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[140].callGetProperty(arrayOfCallSite[141].callGroovyObjectGetProperty(arrayOfCallSite[142].callGroovyObjectGetProperty(this))), "release"))) {
        this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[143].call(this.hapFiles, arrayOfCallSite[144].call(arrayOfCallSite[145].callGroovyObjectGetProperty(this), getLiteWearableReleaseHapFile())), FileCollection.class);
        arrayOfCallSite[143].call(this.hapFiles, arrayOfCallSite[144].call(arrayOfCallSite[145].callGroovyObjectGetProperty(this), getLiteWearableReleaseHapFile()));
        arrayOfCallSite[146].call(this.hapFileMap, hapKey, hapPathValue);
        arrayOfCallSite[147].call(arrayOfCallSite[148].callGroovyObjectGetProperty(arrayOfCallSite[149].callGroovyObjectGetProperty(this)), hapKey, arrayOfCallSite[150].callGetProperty(getLiteWearableReleaseHapFile()));
      } 
      return;
    } 
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[126].callCurrent((GroovyObject)this)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[127].callGetProperty(arrayOfCallSite[128].callGroovyObjectGetProperty(arrayOfCallSite[129].callGroovyObjectGetProperty(this))), "release"))) {
      this.hapFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[130].call(this.hapFiles, arrayOfCallSite[131].call(arrayOfCallSite[132].callGroovyObjectGetProperty(this), arrayOfCallSite[133].callCurrent((GroovyObject)this))), FileCollection.class);
      arrayOfCallSite[130].call(this.hapFiles, arrayOfCallSite[131].call(arrayOfCallSite[132].callGroovyObjectGetProperty(this), arrayOfCallSite[133].callCurrent((GroovyObject)this)));
      arrayOfCallSite[134].call(this.hapFileMap, hapKey, hapPathValue);
      arrayOfCallSite[135].call(arrayOfCallSite[136].callGroovyObjectGetProperty(arrayOfCallSite[137].callGroovyObjectGetProperty(this)), hapKey, arrayOfCallSite[138].callGetProperty(arrayOfCallSite[139].callCurrent((GroovyObject)this)));
    } 
  }
  
  @Generated
  public File getJsonPath() {
    return this.jsonPath;
  }
  
  @Generated
  public void setJsonPath(File paramFile) {
    this.jsonPath = paramFile;
  }
  
  @Generated
  public File getResourcesPath() {
    return this.resourcesPath;
  }
  
  @Generated
  public void setResourcesPath(File paramFile) {
    this.resourcesPath = paramFile;
  }
  
  @Generated
  public File getAssetsPath() {
    return this.assetsPath;
  }
  
  @Generated
  public void setAssetsPath(File paramFile) {
    this.assetsPath = paramFile;
  }
  
  @Generated
  public File getIndexPath() {
    return this.indexPath;
  }
  
  @Generated
  public void setIndexPath(File paramFile) {
    this.indexPath = paramFile;
  }
  
  @Generated
  public File getBinFile() {
    return this.binFile;
  }
  
  @Generated
  public void setBinFile(File paramFile) {
    this.binFile = paramFile;
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
  
  @Generated
  public String getLiteWearableReleaseHapName() {
    return this.liteWearableReleaseHapName;
  }
  
  @Generated
  public void setLiteWearableReleaseHapName(String paramString) {
    this.liteWearableReleaseHapName = paramString;
  }
}
