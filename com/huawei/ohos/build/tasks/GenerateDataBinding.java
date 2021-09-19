package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
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
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class GenerateDataBinding extends DefaultTask implements GroovyObject {
  @NonNull
  private static final HMLogger hmLogger;
  
  @Internal
  private ConfigInfo configInfo;
  
  @Internal
  private PathInfo pathInfo;
  
  @Internal
  private SdkInfo sdkInfo;
  
  @Internal
  @InputDirectory
  @SkipWhenEmpty
  private FileCollection inputLayoutDirs;
  
  @OutputDirectory
  private File generateDataBindingJavaDir;
  
  static {
    Object object = $getCallSiteArray()[28].call(HMLogger.class, GenerateDataBinding.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public GenerateDataBinding(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this));
    this.inputLayoutDirs = (FileCollection)ScriptBytecodeAdapter.castToType(object4, FileCollection.class);
    arrayOfCallSite[5].call(arrayOfCallSite[6].call(variantData, new _closure1(this, this)), new _closure2(this, this));
    Object object5 = arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this), arrayOfCallSite[9].call(this.pathInfo));
    this.generateDataBindingJavaDir = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(FileUtils.class, this.generateDataBindingJavaDir)))
      arrayOfCallSite[11].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[12].callGetProperty(this.generateDataBindingJavaDir)); 
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
  
  public final class _closure2 extends Closure implements GeneratedClosure {
    public _closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(it), "base", "layout")), File.class);
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(file)))) {
        ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(getThisObject()), arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), file)), GenerateDataBinding.class, (GroovyObject)getThisObject(), "inputLayoutDirs");
        return arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(getThisObject()), arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), file));
      } 
      return null;
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    JavaCommandBuilder builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(JavaCommandBuilder.class), JavaCommandBuilder.class);
    arrayOfCallSite[14].call(builder, arrayOfCallSite[15].call(this.sdkInfo));
    Reference options = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callConstructor(JavaCommandBuilder.DataBindingOptions.class, builder), JavaCommandBuilder.DataBindingOptions.class));
    arrayOfCallSite[17].call(options.get(), arrayOfCallSite[18].call(this.generateDataBindingJavaDir));
    arrayOfCallSite[19].call(options.get(), arrayOfCallSite[20].call(this.configInfo));
    arrayOfCallSite[21].call(this.inputLayoutDirs, new _run_closure3(this, this, options));
    arrayOfCallSite[22].call(hmLogger, "dataBinding", arrayOfCallSite[23].call(builder));
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].callConstructor(ProcessUtils.class, arrayOfCallSite[25].callGroovyObjectGetProperty(this)), ProcessUtils.class);
    arrayOfCallSite[26].call(processUtils, arrayOfCallSite[27].call(builder), hmLogger);
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
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
  }
  
  @Generated
  public FileCollection getInputLayoutDirs() {
    return this.inputLayoutDirs;
  }
  
  @Generated
  public void setInputLayoutDirs(FileCollection paramFileCollection) {
    this.inputLayoutDirs = paramFileCollection;
  }
  
  @Generated
  public File getGenerateDataBindingJavaDir() {
    return this.generateDataBindingJavaDir;
  }
  
  @Generated
  public void setGenerateDataBindingJavaDir(File paramFile) {
    this.generateDataBindingJavaDir = paramFile;
  }
  
  public final class _run_closure3 extends Closure implements GeneratedClosure {
    public _run_closure3(Object _outerInstance, Object _thisObject, Reference options) {
      super(_outerInstance, _thisObject);
      Reference reference = options;
      this.options = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.options.get(), arrayOfCallSite[1].call(it));
    }
    
    @Generated
    public JavaCommandBuilder.DataBindingOptions getOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (JavaCommandBuilder.DataBindingOptions)ScriptBytecodeAdapter.castToType(this.options.get(), JavaCommandBuilder.DataBindingOptions.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
