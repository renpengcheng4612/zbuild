package com.huawei.ohos.build.tasks.pack.model.hap.rich;

import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;

public class EntryPackModel extends HapPackModel {
  @InputFiles
  public FileCollection getApkFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileCollection apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this)), FileCollection.class);
    Object apkPath = arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this)), arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this)));
    apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(apkPathCollection, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), apkPath)), FileCollection.class);
    arrayOfCallSite[8].call(apkPathCollection, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), apkPath));
    return apkPathCollection;
  }
  
  public EntryPackModel(Project project, VariantData variantData) {
    this(project, variantData, Boolean.valueOf(false));
  }
  
  public EntryPackModel(Project project, VariantData variantData, Boolean isHybridMode) {
    super(project, variantData);
    MetaClass metaClass = $getStaticMetaClass();
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      populateOutputs();
      null;
      return;
    } 
    arrayOfCallSite[0].callCurrent((GroovyObject)this);
  }
  
  public void populateOutputs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object = arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].callGroovyObjectGetProperty(this));
    ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, FileCollection.class), EntryPackModel.class, (GroovyObject)this, "hapFiles");
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].callGroovyObjectGetProperty(this)), ScriptBytecodeAdapter.createPojoWrapper(ScriptBytecodeAdapter.asType(arrayOfCallSite[18].callGroovyObjectGetProperty(this), File.class), File.class));
    arrayOfCallSite[19].call(arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this)), arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGroovyObjectGetProperty(this)), arrayOfCallSite[24].callGetProperty(arrayOfCallSite[25].callGroovyObjectGetProperty(this)));
  }
}
