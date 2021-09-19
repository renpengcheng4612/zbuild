package com.huawei.ohos.build.tasks.pack.model.hap.rich;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.tasks.pack.model.DefaultPackModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
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

public class HapPackModel extends DefaultPackModel {
  @InputFile
  @Optional
  private File jsonPath;
  
  @InputDirectory
  @Optional
  private File dexDir;
  
  @InputDirectory
  @Optional
  private File resourcesPath;
  
  private File assetsPath;
  
  @InputFile
  @Optional
  private File indexPath;
  
  @OutputFiles
  @Optional
  private FileCollection hapFiles;
  
  private Map<String, File> hapFileMap;
  
  @InputDirectory
  @Optional
  public File getLibSoPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File libSoPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[41].callConstructor(File.class, arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this))), File.class);
    return (File)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[44].call(libSoPath)) ? libSoPath : null, File.class);
  }
  
  @InputFiles
  @Optional
  public FileCollection getHarAssetsFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this), arrayOfCallSite[47].callGetProperty(HarmonyArtifacts.ArtifactType.class)), FileCollection.class);
  }
  
  @InputFiles
  @Optional
  public FileCollection getAssetsFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this), arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), arrayOfCallSite[52].callGroovyObjectGetProperty(arrayOfCallSite[53].callGroovyObjectGetProperty(this)), arrayOfCallSite[54].callGetProperty(BuildConst.class))), FileCollection.class);
  }
  
  public HapPackModel(Project project, VariantData variantData) {
    super(project, variantData);
    Object object1 = arrayOfCallSite[0].callConstructor(HashMap.class);
    this.hapFileMap = (Map<String, File>)ScriptBytecodeAdapter.castToType(object1, Map.class);
    MetaClass metaClass = $getStaticMetaClass();
    Object object2 = arrayOfCallSite[1].callGroovyObjectGetProperty(this);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, HapPackModel.class, (GroovyObject)this, "packageType");
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(project), "-"), arrayOfCallSite[6].callGroovyObjectGetProperty(variantData)), "-rich-unsigned.hap");
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, HapPackModel.class, (GroovyObject)this, "outputFileName");
    Object object4 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)), arrayOfCallSite[11].callGroovyObjectGetProperty(variantData)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, HapPackModel.class, (GroovyObject)this, "outputDir");
    Object object5 = arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object5, HapPackModel.class, (GroovyObject)this, "packageTool");
    Object object6 = arrayOfCallSite[16].callConstructor(File.class, arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), arrayOfCallSite[19].callGroovyObjectGetProperty(variantData), arrayOfCallSite[20].callGetProperty(BuildConst.class)));
    this.jsonPath = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[21].call(arrayOfCallSite[22].call(Paths.class, arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), arrayOfCallSite[25].callGroovyObjectGetProperty(variantData))));
    this.dexDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[26].callConstructor(File.class, arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), arrayOfCallSite[29].callGroovyObjectGetProperty(variantData), arrayOfCallSite[30].callGetProperty(BuildConst.class)));
    this.resourcesPath = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[31].callConstructor(File.class, arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), arrayOfCallSite[34].callGroovyObjectGetProperty(variantData), arrayOfCallSite[35].callGetProperty(BuildConst.class)));
    this.indexPath = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[36].callConstructor(File.class, arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this), arrayOfCallSite[39].callGroovyObjectGetProperty(variantData), arrayOfCallSite[40].callGetProperty(BuildConst.class)));
    this.assetsPath = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
  }
  
  public String getAllDexFilePath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference dexFilePath = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].callConstructor(StringBuffer.class), StringBuffer.class));
    arrayOfCallSite[56].call(arrayOfCallSite[57].call(this.dexDir), new _getAllDexFilePath_closure1(this, this, dexFilePath));
    return ShortTypeHandling.castToString(arrayOfCallSite[58].call(dexFilePath.get()));
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
  public File getDexDir() {
    return this.dexDir;
  }
  
  @Generated
  public void setDexDir(File paramFile) {
    this.dexDir = paramFile;
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
  
  public final class _getAllDexFilePath_closure1 extends Closure implements GeneratedClosure {
    public _getAllDexFilePath_closure1(Object _outerInstance, Object _thisObject, Reference dexFilePath) {
      super(_outerInstance, _thisObject);
      Reference reference = dexFilePath;
      this.dexFilePath = reference;
    }
    
    public Object doCall(Object dex) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(dex), ".dex"))) {
        arrayOfCallSite[2].call(this.dexFilePath.get(), arrayOfCallSite[3].call(dex));
        return arrayOfCallSite[4].call(this.dexFilePath.get(), ",");
      } 
      return null;
    }
    
    @Generated
    public StringBuffer getDexFilePath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (StringBuffer)ScriptBytecodeAdapter.castToType(this.dexFilePath.get(), StringBuffer.class);
    }
  }
}
