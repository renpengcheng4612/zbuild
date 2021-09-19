package com.huawei.ohos.build.dependency;

import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.artifacts.transform.InputArtifact;
import org.gradle.api.artifacts.transform.TransformAction;
import org.gradle.api.artifacts.transform.TransformOutputs;
import org.gradle.api.artifacts.transform.TransformParameters;
import org.gradle.api.file.FileSystemLocation;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;

public abstract class HarLibsContentTransform implements TransformAction<HarLibsContentTransform.Parameters>, GroovyObject {
  private static final HMLogger HM_LOG;
  
  static {
    Object object = $getCallSiteArray()[17].call(HMLogger.class, HarContentTransform.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static Object getContentTypes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ScriptBytecodeAdapter.createList(new Object[] { arrayOfCallSite[0].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[1].callGetProperty(HarmonyArtifacts.ArtifactType.class) });
  }
  
  public void transform(TransformOutputs transformOutputs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File inputLibsFile = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].call(getInputArtifact()));
      inputLibsFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].call(arrayOfCallSite[4].callCurrent(this)));
      inputLibsFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    Object contentType = arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this)));
    Object object1 = contentType;
    if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[10].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[11].callStatic(TransformOutputsUtil.class, inputLibsFile, transformOutputs, ".jar");
    } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[12].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[13].callStatic(TransformOutputsUtil.class, inputLibsFile, transformOutputs, ".so");
    } else {
      arrayOfCallSite[14].call(HM_LOG, arrayOfCallSite[15].call(String.class, arrayOfCallSite[16].callGetProperty(Locale.class), "Unsupported transform type '%s'", contentType));
    } 
  }
  
  @Generated
  public HarLibsContentTransform() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  @PathSensitive(PathSensitivity.NAME_ONLY)
  @InputArtifact
  public abstract Provider<FileSystemLocation> getInputArtifact();
  
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
  
  public interface Parameters extends TransformParameters {
    @Input
    Property<HarmonyArtifacts.ArtifactType> getContentType();
  }
}
