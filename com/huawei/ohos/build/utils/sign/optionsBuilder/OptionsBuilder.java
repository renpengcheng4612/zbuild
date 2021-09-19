package com.huawei.ohos.build.utils.sign.optionsBuilder;

import java.io.File;
import java.util.List;

public interface OptionsBuilder {
  File getWorkDir();
  
  List<String> getSignCommand();
  
  void initOfflineParams();
}
