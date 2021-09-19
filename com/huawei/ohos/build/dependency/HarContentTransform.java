package com.huawei.ohos.build.dependency;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.io.FileType;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
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

public abstract class HarContentTransform implements TransformAction<HarContentTransform.Parameters>, GroovyObject {
  private static final HMLogger HM_LOG;
  
  static {
    Object object = $getCallSiteArray()[44].call(HMLogger.class, HarContentTransform.class);
    HM_LOG = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static Object getContentTypes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ScriptBytecodeAdapter.createList(new Object[] { arrayOfCallSite[0].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[1].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[2].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[3].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[4].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[5].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[6].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[7].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[8].callGetProperty(HarmonyArtifacts.ArtifactType.class), arrayOfCallSite[9].callGetProperty(HarmonyArtifacts.ArtifactType.class) });
  }
  
  public void transform(TransformOutputs transformOutputs) {
    Reference reference = new Reference(transformOutputs);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File input = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this))), File.class);
    Object contentType = arrayOfCallSite[13].call(arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].callGroovyObjectGetProperty(this)));
    Object object1 = contentType;
    if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[16].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[17].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[18].callGetProperty(BuildConst.class));
    } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[19].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[20].call(input, arrayOfCallSite[21].callGetProperty(FileType.class), new _transform_closure1(this, this, reference));
    } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[22].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[23].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[24].callGetProperty(PathConst.class));
    } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[25].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      arrayOfCallSite[26].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[27].callGetProperty(BuildConst.class));
    } else if (!ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[28].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
      if (!ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[29].callGetProperty(HarmonyArtifacts.ArtifactType.class)))
        if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[30].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
          arrayOfCallSite[31].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[32].callGetProperty(PathConst.class));
        } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[33].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
          arrayOfCallSite[34].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[35].callGetProperty(PathConst.class));
        } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[36].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
          arrayOfCallSite[37].callStatic(TransformOutputsUtil.class, input, reference.get(), ".so");
        } else if (ScriptBytecodeAdapter.isCase(object1, arrayOfCallSite[38].callGetProperty(HarmonyArtifacts.ArtifactType.class))) {
          arrayOfCallSite[39].callStatic(TransformOutputsUtil.class, input, reference.get(), arrayOfCallSite[40].callGetProperty(BuildConst.class));
        } else {
          arrayOfCallSite[41].call(HM_LOG, arrayOfCallSite[42].call(String.class, arrayOfCallSite[43].callGetProperty(Locale.class), "Unsupported transform type '%s'", contentType));
        }  
    } 
  }
  
  @Generated
  public HarContentTransform() {
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
  
  public final class _transform_closure1 extends Closure implements GeneratedClosure {
    public _transform_closure1(Object _outerInstance, Object _thisObject, Reference transformOutputs) {
      super(_outerInstance, _thisObject);
      Reference reference = transformOutputs;
      this.transformOutputs = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      Object isClassJar = arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), arrayOfCallSite[2].callGetProperty(BuildConst.class));
      if (((!DefaultTypeTransformation.booleanUnbox(isClassJar)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(it), arrayOfCallSite[5].callGetProperty(BuildConst.class)))))
        return arrayOfCallSite[6].call(this.transformOutputs.get(), it); 
      return null;
    }
    
    @Generated
    public TransformOutputs getTransformOutputs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (TransformOutputs)ScriptBytecodeAdapter.castToType(this.transformOutputs.get(), TransformOutputs.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
