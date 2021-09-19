package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class MergeResources extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger HM_LOGGER;
  
  private BuildType buildType;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private FileCollection projectResources;
  
  private File mergeResDir;
  
  private File mergeFile;
  
  @Input
  private Configuration runtimeClassPath;
  
  static {
    Object object = $getCallSiteArray()[34].call(HMLogger.class, MergeResources.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public MergeResources(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData, new _closure1(this, this));
    this.projectResources = (FileCollection)ScriptBytecodeAdapter.castToType(object4, FileCollection.class);
    Object object5 = arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].call(this.pathInfo), arrayOfCallSite[7].callGetProperty(this.variantData)));
    this.mergeResDir = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = arrayOfCallSite[8].call(arrayOfCallSite[9].call(Paths.class, arrayOfCallSite[10].callGetProperty(this.mergeResDir), arrayOfCallSite[11].callGetProperty(BuildConst.class)));
    this.mergeFile = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(arrayOfCallSite[14].callGroovyObjectGetProperty(this)), new GStringImpl(new Object[] { arrayOfCallSite[15].callGroovyObjectGetProperty(variantData) }, new String[] { "", "RuntimeClassPath" }));
    this.runtimeClassPath = (Configuration)ScriptBytecodeAdapter.castToType(object7, Configuration.class);
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
  public void merge() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].call(FileUtils.class, this.mergeResDir);
    arrayOfCallSite[17].call(FileUtils.class, this.mergeFile);
    Object f;
    Iterator iterator;
    for (f = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(arrayOfCallSite[19].call(this.projectResources)), Iterator.class); iterator.hasNext(); ) {
      f = iterator.next();
      if (!((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[20].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[21].callGetProperty(VariantModel.class)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(arrayOfCallSite[23].callGetProperty(f), "main"))) ? 1 : 0))
        arrayOfCallSite[24].callCurrent(this, f); 
    } 
    arrayOfCallSite[25].call(arrayOfCallSite[26].call(this.variantData, arrayOfCallSite[27].callGetProperty(HarmonyArtifacts.ArtifactType.class)), new _merge_closure2(this, this));
  }
  
  public final class _merge_closure2 extends Closure implements GeneratedClosure {
    public _merge_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(MergeResources.class), "MergeResources", arrayOfCallSite[2].call("Add har resource path:", arrayOfCallSite[3].callGetProperty(it)));
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public Object addPath(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[28].call(this.mergeFile, arrayOfCallSite[29].call(arrayOfCallSite[30].call("\"", arrayOfCallSite[31].call(file)), "\""));
    return arrayOfCallSite[32].call(this.mergeFile, arrayOfCallSite[33].call(System.class));
  }
  
  @Generated
  public Configuration getRuntimeClassPath() {
    return this.runtimeClassPath;
  }
  
  @Generated
  public void setRuntimeClassPath(Configuration paramConfiguration) {
    this.runtimeClassPath = paramConfiguration;
  }
}
