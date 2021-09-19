package com.huawei.ohos.build.model.variant;

import com.huawei.ohos.build.model.BaseConfig;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.gradle.api.tasks.Input;

public interface VariantFlavor extends BaseConfig {
  @Nonnull
  @Input
  String getDimension();
  
  @Nullable
  @Input
  Integer getCompileSdkVersion();
  
  @Nonnull
  @Input
  Integer getCompatibleSdkVersion();
}
