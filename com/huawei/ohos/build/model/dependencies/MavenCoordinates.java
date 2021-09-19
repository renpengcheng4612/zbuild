package com.huawei.ohos.build.model.dependencies;

import javax.annotation.Nonnull;

public interface MavenCoordinates {
  @Nonnull
  String getGroupId();
  
  @Nonnull
  String getArtifactId();
  
  @Nonnull
  String getVersion();
  
  @Nonnull
  String getPackaging();
  
  @Nonnull
  String getClassifier();
}
