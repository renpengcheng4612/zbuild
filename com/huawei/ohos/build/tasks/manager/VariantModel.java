package com.huawei.ohos.build.tasks.manager;

import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.model.variant.VariantFlavor;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public interface VariantModel {
  @Nonnull
  Map<String, ? extends SigningConfig> getSigningConfigs();
  
  @NonNull
  Map<String, BuildType> getBuildTypes();
  
  @Nonnull
  Map<String, OhosSourceSet> getSourceSets();
  
  @Nonnull
  Map<String, VariantFlavor> getVariantFlavors();
  
  @Nonnull
  List<VariantData> getVariantDatas();
}
