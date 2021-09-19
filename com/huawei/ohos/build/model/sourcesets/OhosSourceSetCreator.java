package com.huawei.ohos.build.model.sourcesets;

import java.util.Map;

public interface OhosSourceSetCreator {
  Boolean getIsLibrary();
  
  OhosSourceSet maybeSetup(String paramString);
  
  Map<String, OhosSourceSet> getConfiguredSourceSets();
}
