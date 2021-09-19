package com.huawei.ohos.build.model.dependencies;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringJoiner;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public abstract class LibraryBundle implements LibraryDependency, GroovyObject {
  private final File myBundle;
  
  private final File myBundleFolder;
  
  private final String myName;
  
  private final String myProjectPath;
  
  protected LibraryBundle(@Nonnull File bundle, @Nonnull File bundleFolder, @Nullable String name, @Nullable String projectPath) {
    MetaClass metaClass = $getStaticMetaClass();
    File file1 = bundle;
    this.myBundle = (File)ScriptBytecodeAdapter.castToType(file1, File.class);
    File file2 = bundleFolder;
    this.myBundleFolder = (File)ScriptBytecodeAdapter.castToType(file2, File.class);
    String str1 = name;
    this.myName = ShortTypeHandling.castToString(str1);
    String str2 = projectPath;
    this.myProjectPath = ShortTypeHandling.castToString(str2);
  }
  
  @Nonnull
  public File getBundle() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.myBundle;
  }
  
  @Nonnull
  public File getBundleFolder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.myBundleFolder;
  }
  
  @Nonnull
  public File getConfigJson() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(File.class, this.myBundleFolder, arrayOfCallSite[1].callGetProperty(CommonConst.class)), File.class);
  }
  
  @Nonnull
  public File getJarFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(File.class, this.myBundleFolder, "classes.jar"), File.class);
  }
  
  @Nullable
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.myName;
  }
  
  @Nullable
  public String getProjectPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.myProjectPath;
  }
  
  @Nonnull
  public List<JarDependency> getLocalDependencies() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<File> jars = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<File> list = getLocalJars();
      Reference localDependencies = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(ArrayList.class, arrayOfCallSite[5].call(jars)), List.class));
      arrayOfCallSite[6].call(jars, new _getLocalDependencies_closure1(this, this, localDependencies));
      return (List<JarDependency>)localDependencies.get();
    } 
    Object object = arrayOfCallSite[3].callCurrent(this);
    jars = (List<File>)ScriptBytecodeAdapter.castToType(object, List.class);
    Reference reference = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(ArrayList.class, arrayOfCallSite[5].call(jars)), List.class));
    arrayOfCallSite[6].call(jars, new _getLocalDependencies_closure1(this, this, reference));
    return (List<JarDependency>)reference.get();
  }
  
  public final class _getLocalDependencies_closure1 extends Closure implements GeneratedClosure {
    public _getLocalDependencies_closure1(Object _outerInstance, Object _thisObject, Reference localDependencies) {
      super(_outerInstance, _thisObject);
      Reference reference = localDependencies;
      this.localDependencies = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.localDependencies.get(), arrayOfCallSite[1].callConstructor(JarDependency.class, ArrayUtil.createArray(it, Boolean.valueOf(true), Boolean.valueOf(true), null, null)));
    }
    
    @Generated
    public List getLocalDependencies() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.localDependencies.get(), List.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  @Nonnull
  protected File getJarsRootFolder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(File.class, this.myBundleFolder, arrayOfCallSite[8].callGetProperty(BuildConst.class)), File.class);
  }
  
  @Nonnull
  public List<File> getLocalJars() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference localJars = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(ArrayList.class), List.class));
    File jarLibsFile = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[14].call(arrayOfCallSite[15].call(Paths.class, arrayOfCallSite[16].callGetProperty(getJarsRootFolder()), "libs"));
      jarLibsFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Paths.class, arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callCurrent(this)), "libs"));
      jarLibsFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[17].call(jarLibsFile)))
      arrayOfCallSite[18].call(arrayOfCallSite[19].call(jarLibsFile), new _getLocalJars_closure2(this, this, localJars)); 
    return (List<File>)localJars.get();
  }
  
  public final class _getLocalJars_closure2 extends Closure implements GeneratedClosure {
    public _getLocalJars_closure2(Object _outerInstance, Object _thisObject, Reference localJars) {
      super(_outerInstance, _thisObject);
      Reference reference = localJars;
      this.localJars = reference;
    }
    
    public Object doCall(Object jar) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(jar)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(jar), arrayOfCallSite[3].callGetProperty(BuildConst.class)))))
        return arrayOfCallSite[4].call(this.localJars.get(), jar); 
      return null;
    }
    
    @Generated
    public List getLocalJars() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (List)ScriptBytecodeAdapter.castToType(this.localJars.get(), List.class);
    }
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[20].call(arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].callConstructor(StringJoiner.class, ",", arrayOfCallSite[26].call(arrayOfCallSite[27].callGetProperty(LibraryBundle.class), "["), "]"), arrayOfCallSite[28].call("mBundle:", this.myBundle)), arrayOfCallSite[29].call("mBundleFolder:", this.myBundleFolder)), arrayOfCallSite[30].call("mName:", this.myName)), arrayOfCallSite[31].call("mProjectPath:", this.myProjectPath))));
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
}
