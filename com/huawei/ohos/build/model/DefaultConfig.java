package com.huawei.ohos.build.model;

import com.huawei.ohos.build.dsl.JavaCompileOptions;

public interface DefaultConfig {
  int getCompatibleSdkVersion();
  
  void setCompatibleSdkVersion(int paramInt);
  
  JavaCompileOptions getJavaCompileOptions();
  
  void setJavaCompileOptions(JavaCompileOptions paramJavaCompileOptions);
}
