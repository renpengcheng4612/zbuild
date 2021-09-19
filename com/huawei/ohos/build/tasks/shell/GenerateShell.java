package com.huawei.ohos.build.tasks.shell;

import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.Configure;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.shelltool.ShellToolBuilder;
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
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public class GenerateShell extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @InputFile
  private File profileFile;
  
  @OutputDirectory
  private File destDir;
  
  static {
    Object object = $getCallSiteArray()[85].call(HMLogger.class, GenerateShell.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @InputDirectory
  @Optional
  public File getSrcDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(arrayOfCallSite[15].call(Paths.class, arrayOfCallSite[16].call(this.pathInfo), arrayOfCallSite[17].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[18].callGetProperty(PathConst.class))), File.class);
  }
  
  @Inject
  public GenerateShell(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo)));
    this.profileFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[7].callConstructor(File.class, arrayOfCallSite[8].call(this.pathInfo));
    this.destDir = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    File shellRootDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(File.class, arrayOfCallSite[10].call(this.pathInfo)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(FileUtils.class, shellRootDir)))
      arrayOfCallSite[12].call(hmLogger, "Unable to create the %s folder. The file may be occupied by another user.", arrayOfCallSite[13].callGetProperty(shellRootDir)); 
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(this.configInfo)))
      return; 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[20].call(FileUtils.class, this.destDir)))
      arrayOfCallSite[21].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[22].callGetProperty(this.destDir)); 
    arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), new _run_closure1(this, this));
    Configure configure = (Configure)ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].callConstructor(Configure.class, arrayOfCallSite[26].callGroovyObjectGetProperty(this)), Configure.class);
    Object object1 = arrayOfCallSite[27].call(this.variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    arrayOfCallSite[28].call(configure, this.configInfo, this.pathInfo);
    Object configOptions = arrayOfCallSite[29].call(this.configInfo);
    arrayOfCallSite[30].call(configure, this.configInfo, arrayOfCallSite[31].callGroovyObjectGetProperty(this), this.pathInfo);
    Object networkOptions = null;
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[32].call(arrayOfCallSite[33].call(configOptions), "default"), null))
      Object object = arrayOfCallSite[34].call(arrayOfCallSite[35].call(arrayOfCallSite[36].call(configOptions), "default")); 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(networkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[48].call(networkOptions), null))) {
        Object networkPath = arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].call(this.pathInfo), arrayOfCallSite[54].callGetProperty(File.class)), "res"), arrayOfCallSite[55].callGetProperty(File.class)), "xml");
        arrayOfCallSite[56].call(arrayOfCallSite[57].callConstructor(File.class, networkPath));
        arrayOfCallSite[58].call(configure, networkOptions, networkPath);
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(networkOptions, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[37].call(networkOptions), null))) {
      Object networkPath = arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(this.pathInfo), arrayOfCallSite[43].callGetProperty(File.class)), "res"), arrayOfCallSite[44].callGetProperty(File.class)), "xml");
      arrayOfCallSite[45].call(arrayOfCallSite[46].callConstructor(File.class, networkPath));
      arrayOfCallSite[47].call(configure, networkOptions, networkPath);
    } 
    if (ScriptBytecodeAdapter.compareEqual("feature", arrayOfCallSite[59].call(this.configInfo))) {
      File entryShellFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].call(arrayOfCallSite[61].callGroovyObjectGetProperty(this), arrayOfCallSite[62].call(this.pathInfo)), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[63].call(entryShellFile)))
        arrayOfCallSite[64].call(entryShellFile); 
      arrayOfCallSite[65].call(entryShellFile);
      String entryModule;
      Iterator iterator;
      for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[66].call(arrayOfCallSite[67].call(ModuleExtensionData.class, arrayOfCallSite[68].callGroovyObjectGetProperty(this))), Iterator.class); iterator.hasNext(); ) {
        entryModule = ShortTypeHandling.castToString(iterator.next());
        File entryShellModuleFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].call(arrayOfCallSite[70].call(Paths.class, arrayOfCallSite[71].call(entryShellFile), entryModule)), File.class);
        arrayOfCallSite[72].call(entryShellModuleFile);
      } 
    } 
    Path originalResPath = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[73].call(Paths.class, arrayOfCallSite[74].call(this.pathInfo)), Path.class);
    Path shellResPath = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(Paths.class, arrayOfCallSite[76].call(this.pathInfo)), Path.class);
    ShellToolBuilder shellToolBuilder = (ShellToolBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[77].callConstructor(ShellToolBuilder.class, originalResPath, shellResPath), ShellToolBuilder.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[78].call(shellToolBuilder))) {
      arrayOfCallSite[79].call(hmLogger, "generateShell", "shellTool handle success");
    } else {
      arrayOfCallSite[80].call(hmLogger, arrayOfCallSite[81].callConstructor(GradleException.class, arrayOfCallSite[82].call(String.class, arrayOfCallSite[83].callGetProperty(Locale.class), "An error happened in Task: %s. Unable to use the shell tool.", arrayOfCallSite[84].callCurrent(this))));
    } 
  }
  
  @Generated
  public File getProfileFile() {
    return this.profileFile;
  }
  
  @Generated
  public void setProfileFile(File paramFile) {
    this.profileFile = paramFile;
  }
  
  @Generated
  public File getDestDir() {
    return this.destDir;
  }
  
  @Generated
  public void setDestDir(File paramFile) {
    this.destDir = paramFile;
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].callCurrent((GroovyObject)this), new _closure2(this, getThisObject()));
      return arrayOfCallSite[2].callCurrent((GroovyObject)this, arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)));
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
        arrayOfCallSite[0].callCurrent((GroovyObject)this, "/assets/**/*");
        return arrayOfCallSite[1].callCurrent((GroovyObject)this, "/res/**/*");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
}
