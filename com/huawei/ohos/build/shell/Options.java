package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.gradle.api.Project;

public interface Options {
  @JsonIgnore
  String getUniqueKey();
  
  @JsonIgnore
  boolean isNeedMergeRuleOptions();
  
  @JsonIgnore
  void validate(Options paramOptions, Project paramProject);
}
