package com.huawei.ohos.build.utils.validate;

import javax.annotation.Nonnull;

public interface Validator {
  boolean doValidate();
  
  @Nonnull
  String getErrorMessage();
}
