package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.os.OperatingSystem;

public class MergeJavaResource extends DefaultTask implements GroovyObject {
  @Nonnull
  private VariantData variantData;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private PathInfo pathInfo;
  
  @InputFiles
  private FileCollection classesJarFiles;
  
  @InputFiles
  private FileCollection harLibsJarFiles;
  
  @OutputDirectory
  private File classBuildRoot;
  
  @InputFile
  @Optional
  private File rFile;
  
  @Input
  private Configuration runtimeClassPath;
  
  @Inject
  public MergeJavaResource(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(arrayOfCallSite[5].call(variantData)), arrayOfCallSite[6].callGroovyObjectGetProperty(variantData), arrayOfCallSite[7].callGetProperty(BuildConst.class)));
    this.classBuildRoot = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = arrayOfCallSite[8].call(variantData);
    this.classesJarFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object4, FileCollection.class);
    Object object5 = arrayOfCallSite[9].call(variantData);
    this.harLibsJarFiles = (FileCollection)ScriptBytecodeAdapter.castToType(object5, FileCollection.class);
    Object object6 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(variantData));
    this.runtimeClassPath = (Configuration)ScriptBytecodeAdapter.castToType(object6, Configuration.class);
    Object object7 = arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(this.pathInfo), arrayOfCallSite[15].callGetProperty(BuildConst.class)));
    this.rFile = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set files = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callGetProperty(this.classesJarFiles), Set.class);
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[17].call(this.configInfo), arrayOfCallSite[18].callGetProperty(BuildConst.class)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(this.rFile))))
      arrayOfCallSite[20].call(files, this.rFile); 
    arrayOfCallSite[21].call(files, this.harLibsJarFiles);
    arrayOfCallSite[22].call(files, new _run_closure1(this, this));
  }
  
  @Generated
  public FileCollection getClassesJarFiles() {
    return this.classesJarFiles;
  }
  
  @Generated
  public void setClassesJarFiles(FileCollection paramFileCollection) {
    this.classesJarFiles = paramFileCollection;
  }
  
  @Generated
  public FileCollection getHarLibsJarFiles() {
    return this.harLibsJarFiles;
  }
  
  @Generated
  public void setHarLibsJarFiles(FileCollection paramFileCollection) {
    this.harLibsJarFiles = paramFileCollection;
  }
  
  @Generated
  public File getClassBuildRoot() {
    return this.classBuildRoot;
  }
  
  @Generated
  public void setClassBuildRoot(File paramFile) {
    this.classBuildRoot = paramFile;
  }
  
  @Generated
  public File getrFile() {
    return this.rFile;
  }
  
  @Generated
  public void setrFile(File paramFile) {
    this.rFile = paramFile;
  }
  
  @Generated
  public Configuration getRuntimeClassPath() {
    return this.runtimeClassPath;
  }
  
  @Generated
  public void setRuntimeClassPath(Configuration paramConfiguration) {
    this.runtimeClassPath = paramConfiguration;
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object packageLibsFile) {
      Reference reference = new Reference(packageLibsFile);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), new _closure2(this, getThisObject(), reference));
    }
    
    public final class _closure2 extends Closure implements GeneratedClosure {
      public _closure2(Object _outerInstance, Object _thisObject, Reference packageLibsFile) {
        super(_outerInstance, _thisObject);
        Reference reference = packageLibsFile;
        this.packageLibsFile = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this), this.packageLibsFile.get()));
        arrayOfCallSite[3].callCurrent((GroovyObject)this, arrayOfCallSite[4].callGroovyObjectGetProperty(this));
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(arrayOfCallSite[6].call(OperatingSystem.class)))) {
          arrayOfCallSite[7].callCurrent((GroovyObject)this, Integer.valueOf(488));
          arrayOfCallSite[8].callCurrent((GroovyObject)this, Integer.valueOf(488));
        } 
        return arrayOfCallSite[9].callCurrent((GroovyObject)this, "**/META-INF/");
      }
      
      @Generated
      public Object getPackageLibsFile() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.packageLibsFile.get();
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
