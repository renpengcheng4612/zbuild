package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GenerateJsBinSource extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  @Nonnull
  private BuildType buildType;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private VariantData variantData;
  
  static {
    Object object = $getCallSiteArray()[34].call(HMLogger.class, $getCallSiteArray()[35].call(GenerateJsBinSource.class));
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public GenerateJsBinSource(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].callCurrent(this, arrayOfCallSite[5].callGetProperty(BuildConst.class));
  }
  
  private void copyBinSource(String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String variantName = ShortTypeHandling.castToString(arrayOfCallSite[6].call(this.variantData));
    String sourceDir = ShortTypeHandling.castToString(arrayOfCallSite[7].call(this.pathInfo, variantName, deviceType));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(FileUtils.class, arrayOfCallSite[9].call(arrayOfCallSite[10].call(Paths.class, sourceDir)))))
      arrayOfCallSite[11].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", sourceDir); 
    Reference intermediatesAssetsDir = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[12].call(this.pathInfo, variantName, deviceType)));
    Reference binPackageAssetsDir = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[13].call(this.pathInfo, variantName, deviceType)));
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), new _copyBinSource_closure1(this, this, intermediatesAssetsDir, binPackageAssetsDir));
    Reference profilePath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[16].call(this.pathInfo, variantName, arrayOfCallSite[17].callGetProperty(BuildConst.class))));
    Reference sourceProfilePath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[18].call(this.pathInfo, variantName, deviceType)));
    arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this), new _copyBinSource_closure2(this, this, profilePath, sourceProfilePath));
    Reference buildJsResourcesPath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[21].call(this.pathInfo, variantName)));
    Reference sourceResourcesPath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[22].call(this.pathInfo, variantName, deviceType, arrayOfCallSite[23].call(this.configInfo))));
    arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), new _copyBinSource_closure3(this, this, buildJsResourcesPath, sourceResourcesPath));
    Reference compiledResourcesPath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[26].call(this.pathInfo, variantName, arrayOfCallSite[27].callGetProperty(BuildConst.class))));
    arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), new _copyBinSource_closure4(this, this, compiledResourcesPath, sourceResourcesPath));
    Reference compiledResourcesIndexFile = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[30].call(this.pathInfo, variantName, arrayOfCallSite[31].callGetProperty(BuildConst.class))));
    arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), new _copyBinSource_closure5(this, this, compiledResourcesIndexFile, sourceResourcesPath));
  }
  
  public final class _copyBinSource_closure1 extends Closure implements GeneratedClosure {
    public _copyBinSource_closure1(Object _outerInstance, Object _thisObject, Reference intermediatesAssetsDir, Reference binPackageAssetsDir) {
      super(_outerInstance, _thisObject);
      Reference reference1 = intermediatesAssetsDir;
      this.intermediatesAssetsDir = reference1;
      Reference reference2 = binPackageAssetsDir;
      this.binPackageAssetsDir = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.intermediatesAssetsDir.get(), new _closure6(this, getThisObject()));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.binPackageAssetsDir.get());
    }
    
    @Generated
    public String getIntermediatesAssetsDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.intermediatesAssetsDir.get());
    }
    
    @Generated
    public String getBinPackageAssetsDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.binPackageAssetsDir.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure6 extends Closure implements GeneratedClosure {
      public _closure6(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, "**/*.txt");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public final class _copyBinSource_closure2 extends Closure implements GeneratedClosure {
    public _copyBinSource_closure2(Object _outerInstance, Object _thisObject, Reference profilePath, Reference sourceProfilePath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = profilePath;
      this.profilePath = reference1;
      Reference reference2 = sourceProfilePath;
      this.sourceProfilePath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.profilePath.get());
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.sourceProfilePath.get());
    }
    
    @Generated
    public String getProfilePath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.profilePath.get());
    }
    
    @Generated
    public String getSourceProfilePath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.sourceProfilePath.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _copyBinSource_closure3 extends Closure implements GeneratedClosure {
    public _copyBinSource_closure3(Object _outerInstance, Object _thisObject, Reference buildJsResourcesPath, Reference sourceResourcesPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = buildJsResourcesPath;
      this.buildJsResourcesPath = reference1;
      Reference reference2 = sourceResourcesPath;
      this.sourceResourcesPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.buildJsResourcesPath.get(), new _closure7(this, getThisObject()));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.sourceResourcesPath.get());
    }
    
    @Generated
    public String getBuildJsResourcesPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.buildJsResourcesPath.get());
    }
    
    @Generated
    public String getSourceResourcesPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.sourceResourcesPath.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure7 extends Closure implements GeneratedClosure {
      public _closure7(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, "**/*.bin");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public final class _copyBinSource_closure4 extends Closure implements GeneratedClosure {
    public _copyBinSource_closure4(Object _outerInstance, Object _thisObject, Reference compiledResourcesPath, Reference sourceResourcesPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = compiledResourcesPath;
      this.compiledResourcesPath = reference1;
      Reference reference2 = sourceResourcesPath;
      this.sourceResourcesPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.compiledResourcesPath.get());
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.sourceResourcesPath.get());
    }
    
    @Generated
    public String getCompiledResourcesPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.compiledResourcesPath.get());
    }
    
    @Generated
    public String getSourceResourcesPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.sourceResourcesPath.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _copyBinSource_closure5 extends Closure implements GeneratedClosure {
    public _copyBinSource_closure5(Object _outerInstance, Object _thisObject, Reference compiledResourcesIndexFile, Reference sourceResourcesPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = compiledResourcesIndexFile;
      this.compiledResourcesIndexFile = reference1;
      Reference reference2 = sourceResourcesPath;
      this.sourceResourcesPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.compiledResourcesIndexFile.get());
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].call(Paths.class, this.sourceResourcesPath.get()))));
    }
    
    @Generated
    public String getCompiledResourcesIndexFile() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.compiledResourcesIndexFile.get());
    }
    
    @Generated
    public String getSourceResourcesPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.sourceResourcesPath.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
