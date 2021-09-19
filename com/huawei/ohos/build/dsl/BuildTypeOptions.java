package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.DefaultBuildType;
import com.huawei.ohos.build.model.SigningConfig;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.powerassert.AssertionRenderer;
import org.codehaus.groovy.runtime.powerassert.ValueRecorder;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;

public class BuildTypeOptions extends DefaultBuildType implements BuildType {
  @Nonnull
  private final Project project;
  
  @Inject
  public BuildTypeOptions(String name, Project project, ObjectFactory objectFactory) {
    super(name);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object1 = arrayOfCallSite[0].call(objectFactory, RestoolOptions.class, project);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, BuildTypeOptions.class, (GroovyObject)this, "restoolOptions");
    Object object2 = arrayOfCallSite[1].call(objectFactory, ProguardOptions.class, project);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, BuildTypeOptions.class, (GroovyObject)this, "proguardOpt");
  }
  
  public BuildTypeOptions(String name, SigningConfig signingConfig) {
    super(name);
    MetaClass metaClass = $getStaticMetaClass();
    ValueRecorder valueRecorder = new ValueRecorder();
    try {
      valueRecorder.record(signingConfig, 8);
      valueRecorder.record(Boolean.valueOf(ScriptBytecodeAdapter.compareNotEqual(signingConfig, null)), 22);
      if (ScriptBytecodeAdapter.compareNotEqual(signingConfig, null)) {
        valueRecorder.clear();
      } else {
        ScriptBytecodeAdapter.assertFailed(AssertionRenderer.render("assert signingConfig != null", valueRecorder), null);
      } 
    } finally {
      valueRecorder.clear();
    } 
  }
  
  @Nullable
  public SigningConfig getSigningConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (SigningConfig)ScriptBytecodeAdapter.castToType(ScriptBytecodeAdapter.invokeMethodOnSuper0(DefaultBuildType.class, (GroovyObject)this, "getSigningConfig"), SigningConfig.class);
  }
  
  public void restoolOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[3].call(action, arrayOfCallSite[4].callGroovyObjectGetProperty(this));
  }
  
  public void proguardOpt(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[5].call(action, arrayOfCallSite[6].callGroovyObjectGetProperty(this));
  }
}
