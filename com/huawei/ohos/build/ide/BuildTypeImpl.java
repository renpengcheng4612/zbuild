package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.zbuild.model.BuildType;
import com.huawei.ohos.zbuild.model.SigningConfig;
import java.io.Serializable;
import javax.annotation.Nonnull;

public class BuildTypeImpl implements BuildType, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final SigningConfig signingConfig;
  
  public BuildTypeImpl(BuildType buildType) {
    this.name = buildType.getName();
    this.signingConfig = new SigningConfigImpl(buildType.getSigningConfig());
  }
  
  public String getName() {
    return this.name;
  }
  
  @Nonnull
  public SigningConfig getSigningConfig() {
    return this.signingConfig;
  }
}
