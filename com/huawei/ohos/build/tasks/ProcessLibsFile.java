package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public class ProcessLibsFile extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final Object HM_LOG;
  
  @Internal
  private VariantData variantData;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private PathInfo pathInfo;
  
  @OutputDirectory
  private File intermediatesLibsDir;
  
  static {
    Object object = $getCallSiteArray()[25].call(HMLogger.class, ProcessLibsFile.class);
  }
  
  @InputFiles
  public FileCollection getInputFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileCollection inputFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(this.variantData, arrayOfCallSite[6].callGetProperty(HarmonyArtifacts.ArtifactType.class)), FileCollection.class);
    inputFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(inputFiles, arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), arrayOfCallSite[10].call(this.pathInfo))), FileCollection.class);
    arrayOfCallSite[7].call(inputFiles, arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), arrayOfCallSite[10].call(this.pathInfo)));
    inputFiles = (FileCollection)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(inputFiles, arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].call(this.pathInfo), arrayOfCallSite[16].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[17].callGetProperty(PathConst.class)))), FileCollection.class);
    arrayOfCallSite[11].call(inputFiles, arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].call(this.pathInfo), arrayOfCallSite[16].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[17].callGetProperty(PathConst.class))));
    return inputFiles;
  }
  
  @Inject
  public ProcessLibsFile(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.pathInfo)));
    this.intermediatesLibsDir = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(FileUtils.class, this.intermediatesLibsDir);
    Reference fromLibFile;
    Iterator iterator;
    for (fromLibFile = new Reference(null), iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this)), Iterator.class); iterator.hasNext(); ) {
      fromLibFile.set(ScriptBytecodeAdapter.castToType(iterator.next(), File.class));
      arrayOfCallSite[21].call(HM_LOG, "Copy-libs", arrayOfCallSite[22].callGetProperty(fromLibFile.get()));
      arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), new _run_closure1(this, this, fromLibFile));
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
  public File getIntermediatesLibsDir() {
    return this.intermediatesLibsDir;
  }
  
  @Generated
  public void setIntermediatesLibsDir(File paramFile) {
    this.intermediatesLibsDir = paramFile;
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject, Reference fromLibFile) {
      super(_outerInstance, _thisObject);
      Reference reference = fromLibFile;
      this.fromLibFile = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.fromLibFile.get(), new _closure2(this, getThisObject()));
      arrayOfCallSite[1].callCurrent((GroovyObject)this, arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this)));
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, Boolean.valueOf(false));
    }
    
    @Generated
    public File getFromLibFile() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.fromLibFile.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure2 extends Closure implements GeneratedClosure {
      public _closure2(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].callCurrent((GroovyObject)this, "**/*.so");
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[1].callGetProperty(BuildConst.class), arrayOfCallSite[2].callGroovyObjectGetProperty(arrayOfCallSite[3].callGroovyObjectGetProperty(this))))
          return arrayOfCallSite[4].callCurrent((GroovyObject)this, "*.jar"); 
        return null;
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
