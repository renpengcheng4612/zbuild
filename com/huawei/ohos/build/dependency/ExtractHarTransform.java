package com.huawei.ohos.build.dependency;

import com.huawei.ohos.build.utils.har.ExplodedHarUtil;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import javax.annotation.Nullable;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
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

public abstract class ExtractHarTransform implements TransformAction<ExtractHarTransform.Parameters>, GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[20].call(HMLogger.class, ExtractHarTransform.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  public void transform(TransformOutputs transformOutputs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File input = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].call(getInputArtifact()));
      input = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].call(arrayOfCallSite[2].callCurrent(this)));
      input = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    Object nameWithoutExt = arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(input), arrayOfCallSite[7].call(arrayOfCallSite[8].callGetProperty(input), "."));
    Object outputPath = arrayOfCallSite[9].call(transformOutputs, nameWithoutExt);
    arrayOfCallSite[10].call(Files.class, arrayOfCallSite[11].call(outputPath));
    Object toolpath = arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this)));
    Object charset = arrayOfCallSite[15].call(arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[18].call(ExplodedHarUtil.class, ArrayUtil.createArray(toolpath, input, arrayOfCallSite[19].call(outputPath), hmLogger, charset));
  }
  
  @PathSensitive(PathSensitivity.NAME_ONLY)
  @InputArtifact
  public abstract Provider<FileSystemLocation> getInputArtifact();
  
  @Generated
  public ExtractHarTransform() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public interface Parameters extends TransformParameters {
    @Input
    Property<String> getToolPath();
    
    @Input
    @Nullable
    Property<String> getCharset();
  }
}
