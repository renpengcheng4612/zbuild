package com.huawei.ohos.build.tasks.signing;

import java.io.File;

public interface ISigningHandler {
  @Deprecated
  File sign(File paramFile, String paramString);
}
