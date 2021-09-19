package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.zbuild.model.SigningConfig;
import java.io.File;
import java.io.Serializable;
import javax.annotation.Nonnull;

public class SigningConfigImpl implements SigningConfig, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final File storeFile;
  
  public SigningConfigImpl(SigningConfig signingConfig) {
    this.name = signingConfig.getName();
    this.storeFile = signingConfig.getStoreFile();
  }
  
  public String getName() {
    return this.name;
  }
  
  @Nonnull
  public File getStoreFile() {
    return this.storeFile;
  }
}
