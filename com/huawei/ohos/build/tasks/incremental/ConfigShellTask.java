package com.huawei.ohos.build.tasks.incremental;

import java.io.File;
import javax.annotation.Nonnull;

public interface ConfigShellTask {
  @Nonnull
  File getShellSrcDir();
  
  @Nonnull
  File getShellLocalPropertiesDir();
  
  @Nonnull
  File getShellLibsDir();
}
