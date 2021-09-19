package com.huawei.ohos.common;

import java.util.Locale;

public enum Version {
  CUR_VERSION("version 2.4.2.0"),
  VERSION_2_5("version 2.5.0.0");
  
  private String version;
  
  Version(String version) {
    this.version = version;
  }
  
  public String getDeprecationTargetVersionMessage() {
    return String.format(Locale.ENGLISH, "It will be removed in '%s' of the Ohos Gradle Plugin", new Object[] { this.version });
  }
}
