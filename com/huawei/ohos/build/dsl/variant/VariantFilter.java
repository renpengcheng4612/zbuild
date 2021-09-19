package com.huawei.ohos.build.dsl.variant;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import java.util.List;

public interface VariantFilter {
  void setIgnore(boolean paramBoolean);
  
  BuildType getBuildType();
  
  List<VariantFlavor> getFlavors();
}
