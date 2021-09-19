package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.dsl.DefaultConfigOptions;
import com.huawei.ohos.zbuild.model.DefaultConfigModel;
import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import java.io.Serializable;

public class DefaultConfigModelImpl implements DefaultConfigModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final int compatibleSdkVersion;
  
  private final SourceSetsProvider sourceSetsProvider;
  
  private final SourceSetsProvider extraOhosTestSourceSetsProvider;
  
  private final SourceSetsProvider extraUnitTestSourceSetsProvider;
  
  public DefaultConfigModelImpl(int compatibleSdkVersion, SourceSetsProvider sourceSetsProvider, SourceSetsProvider extraOhosTestSourceSetsProvider, SourceSetsProvider extraUnitTestSourceSetsProvider) {
    this.compatibleSdkVersion = compatibleSdkVersion;
    this.sourceSetsProvider = sourceSetsProvider;
    this.extraOhosTestSourceSetsProvider = extraOhosTestSourceSetsProvider;
    this.extraUnitTestSourceSetsProvider = extraUnitTestSourceSetsProvider;
  }
  
  public static DefaultConfigModelImpl create(DefaultConfigOptions defaultConfig, SourceSetsProvider sourceSetsProvider, SourceSetsProvider extraOhosTestSourceSetsProvider, SourceSetsProvider extraUnitTestSourceSetsProvider) {
    return new DefaultConfigModelImpl(defaultConfig
        .getCompatibleSdkVersion(), sourceSetsProvider, extraOhosTestSourceSetsProvider, extraUnitTestSourceSetsProvider);
  }
  
  public Integer getCompatibleSdkVersion() {
    return Integer.valueOf(this.compatibleSdkVersion);
  }
  
  public SourceSetsProvider getSourceSetsProvider() {
    return this.sourceSetsProvider;
  }
  
  public SourceSetsProvider getExtraOhosTestSourceSetsProvider() {
    return this.extraOhosTestSourceSetsProvider;
  }
  
  public SourceSetsProvider getExtraUnitTestSourceSetsProvider() {
    return this.extraUnitTestSourceSetsProvider;
  }
}
