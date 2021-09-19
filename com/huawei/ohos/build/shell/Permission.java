package com.huawei.ohos.build.shell;

import java.util.Map;

public interface Permission {
  Permission getModel(Map paramMap);
  
  String getName();
  
  void setName(String paramString);
}
