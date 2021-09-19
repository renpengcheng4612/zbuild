package com.huawei.ohos.build.utils.reporter;

import com.huawei.ohos.build.utils.logUtils.HMLogger;
import javax.annotation.Nonnull;

public class DeprecationReporterUtil {
  @Nonnull
  private static final HMLogger HM_LOGGER = HMLogger.getLogger(DeprecationReporterUtil.class);
  
  public static void reportDeprecatedConfiguration(String newConfigurationName, String oldConfigurationName, String deprecatedTargetVersion) {
    String message = "Configuration '%s' is obsolete and has been replaced with new configuration '%s'.%s";
    HM_LOGGER.warning(message, new Object[] { oldConfigurationName, newConfigurationName, deprecatedTargetVersion });
  }
}
