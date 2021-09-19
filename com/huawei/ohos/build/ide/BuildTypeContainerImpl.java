package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.BuildType;
import com.huawei.ohos.zbuild.model.BuildTypeContainer;
import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import java.io.Serializable;
import javax.annotation.Nonnull;

public class BuildTypeContainerImpl implements BuildTypeContainer, Serializable {
  private static final long serialVersionUID = 1L;
  
  @Nonnull
  private final BuildType buildType;
  
  @Nonnull
  private final SourceSetsProvider sourceSetsProvider;
  
  public BuildTypeContainerImpl(@Nonnull BuildTypeImpl buildType, @Nonnull SourceSetsProvider sourceSetsProviderImpl) {
    this.buildType = buildType;
    this.sourceSetsProvider = sourceSetsProviderImpl;
  }
  
  @Nonnull
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Nonnull
  public SourceSetsProvider getSourceSetsProvider() {
    return this.sourceSetsProvider;
  }
}
