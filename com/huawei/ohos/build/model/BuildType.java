package com.huawei.ohos.build.model;

import com.huawei.ohos.build.dsl.ProguardOptions;
import com.huawei.ohos.build.dsl.RestoolOptions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface BuildType extends BaseConfig {
  @Nonnull
  String getName();
  
  @Nullable
  SigningConfig getSigningConfig();
  
  @Nullable
  boolean isDataBindingEnabled();
  
  @Nullable
  boolean getDebuggable();
  
  @Nullable
  RestoolOptions getRestoolOptions();
  
  @Nullable
  ProguardOptions getProguardOpt();
}
