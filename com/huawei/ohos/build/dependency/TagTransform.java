package com.huawei.ohos.build.dependency;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.artifacts.transform.InputArtifact;
import org.gradle.api.artifacts.transform.TransformAction;
import org.gradle.api.artifacts.transform.TransformOutputs;
import org.gradle.api.artifacts.transform.TransformParameters;
import org.gradle.api.file.FileSystemLocation;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;

public abstract class TagTransform implements TransformAction<TransformParameters.None>, GroovyObject {
  @Generated
  public TagTransform() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  @PathSensitive(PathSensitivity.NAME_ONLY)
  @InputArtifact
  public abstract Provider<FileSystemLocation> getInputArtifact();
  
  public void transform(TransformOutputs transformOutputs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].call(getInputArtifact()));
      file = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].call(arrayOfCallSite[2].callCurrent(this)));
      file = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].callGetProperty(file))) {
      arrayOfCallSite[6].call(transformOutputs, file);
    } else {
      arrayOfCallSite[7].call(transformOutputs, file);
    } 
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
