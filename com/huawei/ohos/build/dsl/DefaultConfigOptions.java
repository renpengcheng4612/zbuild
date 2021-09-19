package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.model.DefaultConfig;
import java.io.Serializable;
import javax.inject.Inject;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;

public class DefaultConfigOptions implements DefaultConfig, Serializable {
  private static final long serialVersionUID = 1L;
  
  private int compatibleSdkVersion;
  
  private JavaCompileOptions javaCompileOptions;
  
  @Inject
  public DefaultConfigOptions(Project project) {
    ObjectFactory objectFactory = project.getObjects();
    this.javaCompileOptions = (JavaCompileOptions)objectFactory.newInstance(JavaCompileOptions.class, new Object[] { project });
  }
  
  public void javaCompileOptions(Action<? super JavaCompileOptions> action) {
    action.execute(this.javaCompileOptions);
  }
  
  public int getCompatibleSdkVersion() {
    return this.compatibleSdkVersion;
  }
  
  public JavaCompileOptions getJavaCompileOptions() {
    return this.javaCompileOptions;
  }
  
  public void setCompatibleSdkVersion(int compatibleSdkVersion) {
    this.compatibleSdkVersion = compatibleSdkVersion;
  }
  
  public void setJavaCompileOptions(JavaCompileOptions javaCompileOptions) {
    this.javaCompileOptions = javaCompileOptions;
  }
}
