package com.huawei.ohos.build.tasks.pack.model.component;

import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import org.gradle.internal.Pair;

public interface Component {
  void addDeviceType(DeviceType paramDeviceType);
  
  void removeDeviceType(DeviceType paramDeviceType);
  
  Pair<DeviceTypeComponent.PackedModeResult, PackModel> populatePackModel();
}
