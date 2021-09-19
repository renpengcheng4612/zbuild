package com.huawei.ohos.build.tasks.signing;

public interface IValidateHandler {
  void validateHapSigning();
  
  void validateSigning();
  
  void validateAppSigning();
  
  void reports();
}
