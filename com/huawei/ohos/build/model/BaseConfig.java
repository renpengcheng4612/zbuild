package com.huawei.ohos.build.model;

import com.huawei.ohos.build.utils.configJson.ClassField;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.gradle.api.tasks.Input;

public interface BaseConfig {
  @Nonnull
  @Input
  String getName();
  
  @Nullable
  @Input
  String getBundleNameSuffix();
  
  @Nullable
  @Input
  String getBundleName();
  
  @Nullable
  Map<String, Object> getConfigPlaceholders();
  
  @Nullable
  List<ClassField> getBuildConfigField();
  
  @Nullable
  void buildConfigField(@Nonnull String paramString1, @Nonnull String paramString2, @Nonnull String paramString3);
}
