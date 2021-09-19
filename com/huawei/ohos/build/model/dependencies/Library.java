package com.huawei.ohos.build.model.dependencies;

import javax.annotation.Nonnull;

public interface Library {
  @Nonnull
  MavenCoordinates getRequestedCoordinates();
  
  @Nonnull
  MavenCoordinates getResolvedCoordinates();
}
