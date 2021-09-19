package com.huawei.ohos.shelltool.enumlation;

public enum TranfromTypeEnum {
  STYLE_FILE("styleFile"),
  SMART_LEAN_FILE("smartLeanFile");
  
  private String value;
  
  TranfromTypeEnum(String value) {
    this.value = value;
  }
  
  public String getValue() {
    return this.value;
  }
}
