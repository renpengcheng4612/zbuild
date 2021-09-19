package com.huawei.ohos.build.tasks.pack.model.hap.rich;

import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;

public class FeaturePackModel extends HapPackModel {
  @InputFiles
  public FileCollection getApkFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileCollection apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this)), FileCollection.class);
    String entryModule;
    Iterator iterator;
    for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(arrayOfCallSite[4].call(ModuleExtensionData.class, arrayOfCallSite[5].callGroovyObjectGetProperty(this))), Iterator.class); iterator.hasNext(); ) {
      entryModule = ShortTypeHandling.castToString(iterator.next());
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this)))) {
        Object myApkPath = arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)), entryModule);
        String apk;
        Iterator iterator1;
        for (apk = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(arrayOfCallSite[12].call(myApkPath, ",")), Iterator.class); iterator1.hasNext(); ) {
          apk = ShortTypeHandling.castToString(iterator1.next());
          Object object = arrayOfCallSite[13].call(apkPathCollection, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), apk));
          apkPathCollection = (FileCollection)ScriptBytecodeAdapter.castToType(object, FileCollection.class);
        } 
      } 
    } 
    return apkPathCollection;
  }
  
  public FeaturePackModel(Project project, VariantData variantData) {
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
    Object object = arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this));
    ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, FileCollection.class), FeaturePackModel.class, (GroovyObject)this, "hapFiles");
    String entryModule;
    Iterator iterator;
    for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(arrayOfCallSite[19].call(ModuleExtensionData.class, arrayOfCallSite[20].callGroovyObjectGetProperty(this))), Iterator.class); iterator.hasNext(); ) {
      entryModule = ShortTypeHandling.castToString(iterator.next());
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this)))) {
        String curOutputFileName = ShortTypeHandling.castToString(arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].call(arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this)), "-"), entryModule), "-"), arrayOfCallSite[31].callGroovyObjectGetProperty(arrayOfCallSite[32].callGroovyObjectGetProperty(this))), "-rich"), "-unsigned.hap"));
        File curOutPutFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(File.class, arrayOfCallSite[34].callGroovyObjectGetProperty(this), curOutputFileName), File.class);
        ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this), arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this), curOutPutFile)), FeaturePackModel.class, (GroovyObject)this, "hapFiles");
        arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this), arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this), curOutPutFile));
        arrayOfCallSite[39].call(arrayOfCallSite[40].callGroovyObjectGetProperty(this), entryModule, curOutPutFile);
        arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(arrayOfCallSite[43].callGroovyObjectGetProperty(this)), entryModule, arrayOfCallSite[44].callGetProperty(curOutPutFile));
      } 
    } 
  }
}
