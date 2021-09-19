package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.IdlCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.FileType;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.ChangeType;
import org.gradle.work.InputChanges;

public class CompileIdl extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  @Internal
  private BuildType buildType;
  
  @Internal
  private PathInfo pathInfo;
  
  @Internal
  private SdkInfo sdkInfo;
  
  @Internal
  private FileCollection dirRoots;
  
  @InputFiles
  @SkipWhenEmpty
  private FileCollection idlFileTree;
  
  @OutputDirectory
  private File generatedDirectory;
  
  static {
    Object object = $getCallSiteArray()[66].call(HMLogger.class, CompileIdl.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public CompileIdl(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData, new _closure1(this, this));
    this.dirRoots = (FileCollection)ScriptBytecodeAdapter.castToType(object1, FileCollection.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object2, BuildType.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object4, SdkInfo.class);
    Object object5 = arrayOfCallSite[4].call(variantData);
    this.idlFileTree = (FileCollection)ScriptBytecodeAdapter.castToType(object5, FileCollection.class);
    Object object6 = arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this), arrayOfCallSite[7].call(this.pathInfo));
    this.generatedDirectory = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
  }
  
  public final class _closure1 extends Closure implements GeneratedClosure {
    public _closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callGetProperty(it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @TaskAction
  public void run(InputChanges changes) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].call(arrayOfCallSite[9].call(changes, this.idlFileTree), new _run_closure2(this, this));
  }
  
  public final class _run_closure2 extends Closure implements GeneratedClosure {
    public _run_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object change) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGetProperty(change), arrayOfCallSite[1].callGetProperty(FileType.class)))
        return null; 
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(change), arrayOfCallSite[3].callGetProperty(ChangeType.class)))
        return arrayOfCallSite[4].callCurrent((GroovyObject)this, arrayOfCallSite[5].callGetProperty(change)); 
      return arrayOfCallSite[6].callCurrent((GroovyObject)this, arrayOfCallSite[7].callGetProperty(change), arrayOfCallSite[8].callGroovyObjectGetProperty(this));
    }
  }
  
  public Object getIdlRoot(File idlFile) {
    CallSite[] arrayOfCallSite;
    Object d;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), d = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(arrayOfCallSite[11].call(this.dirRoots)), Iterator.class); iterator.hasNext(); ) {
      d = iterator.next();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(idlFile), arrayOfCallSite[14].callGetProperty(d))))
        return arrayOfCallSite[15].callGetProperty(d); 
    } 
    return "";
  }
  
  public Path getIdlOutputPath(File idlFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String idlFilePath = ShortTypeHandling.castToString(arrayOfCallSite[16].call(idlFile));
    String idlFileName = ShortTypeHandling.castToString(arrayOfCallSite[17].call(idlFile));
    String idlRelativePath = ShortTypeHandling.castToString(arrayOfCallSite[18].call(idlFilePath, arrayOfCallSite[19].call(arrayOfCallSite[20].callCurrent(this, idlFile)), arrayOfCallSite[21].call(arrayOfCallSite[22].call(idlFilePath), arrayOfCallSite[23].call(idlFileName))));
    return (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(Paths.class, arrayOfCallSite[25].call(this.generatedDirectory), idlRelativePath), Path.class);
  }
  
  public void removeGeneratedJavaFile(File idlFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String idlOutputPath = ShortTypeHandling.castToString(arrayOfCallSite[26].call(arrayOfCallSite[27].callCurrent(this, idlFile)));
    String idlFileName = ShortTypeHandling.castToString(arrayOfCallSite[28].call(idlFile));
    String idlInterfaceName = ShortTypeHandling.castToString(arrayOfCallSite[29].call(idlFileName, Integer.valueOf(0), arrayOfCallSite[30].call(idlFileName, ".")));
    String idlClassName = ShortTypeHandling.castToString(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[31].call(idlInterfaceName, "I")) ? arrayOfCallSite[32].call(idlInterfaceName, Integer.valueOf(1)) : idlInterfaceName);
    arrayOfCallSite[33].call(arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), arrayOfCallSite[36].call(Paths.class, idlOutputPath, arrayOfCallSite[37].call(idlInterfaceName, ".java"))));
    arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].callGroovyObjectGetProperty(this), arrayOfCallSite[41].call(Paths.class, idlOutputPath, arrayOfCallSite[42].call(idlClassName, "Proxy.java"))));
    arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].callGroovyObjectGetProperty(this), arrayOfCallSite[46].call(Paths.class, idlOutputPath, arrayOfCallSite[47].call(idlClassName, "Stub.java"))));
  }
  
  public void regenerateJavaFile(File idlFile, SdkInfo sdkInfo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File idlOutputPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this), arrayOfCallSite[50].callCurrent(this, idlFile)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[51].call(idlOutputPath)))
      arrayOfCallSite[52].call(idlOutputPath); 
    IdlCommandBuilder builder = (IdlCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(IdlCommandBuilder.class, arrayOfCallSite[54].call(sdkInfo)), IdlCommandBuilder.class);
    arrayOfCallSite[55]
      
      .call(arrayOfCallSite[56].call(arrayOfCallSite[57].call(builder), arrayOfCallSite[58].call(idlOutputPath)), arrayOfCallSite[59].call(idlFile));
    arrayOfCallSite[60].call(hmLogger, "idl", arrayOfCallSite[61].call(builder));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[62].callConstructor(ProcessUtils.class, arrayOfCallSite[63].callGroovyObjectGetProperty(this)), ProcessUtils.class);
    arrayOfCallSite[64].call(processUtils, arrayOfCallSite[65].call(builder), hmLogger);
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
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
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
  }
  
  @Generated
  public FileCollection getDirRoots() {
    return this.dirRoots;
  }
  
  @Generated
  public void setDirRoots(FileCollection paramFileCollection) {
    this.dirRoots = paramFileCollection;
  }
  
  @Generated
  public FileCollection getIdlFileTree() {
    return this.idlFileTree;
  }
  
  @Generated
  public void setIdlFileTree(FileCollection paramFileCollection) {
    this.idlFileTree = paramFileCollection;
  }
  
  @Generated
  public File getGeneratedDirectory() {
    return this.generatedDirectory;
  }
  
  @Generated
  public void setGeneratedDirectory(File paramFile) {
    this.generatedDirectory = paramFile;
  }
}
