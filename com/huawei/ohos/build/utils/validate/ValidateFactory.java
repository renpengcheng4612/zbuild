package com.huawei.ohos.build.utils.validate;

import com.huawei.ohos.build.shell.Options;
import org.gradle.api.Project;

public interface ValidateFactory {
  void validate(Options paramOptions, String paramString);
  
  void validate(Options paramOptions, String paramString, Project paramProject);
}
