package com.huawei.ohos.build;

import com.huawei.ohos.build.dsl.BuildTypeOptions;
import com.huawei.ohos.build.dsl.CompileOptions;
import com.huawei.ohos.build.dsl.DefaultConfigOptions;
import com.huawei.ohos.build.dsl.DexOptions;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.dsl.IdlToolOptions;
import com.huawei.ohos.build.dsl.PackingToolOptions;
import com.huawei.ohos.build.dsl.RestoolOptions;
import com.huawei.ohos.build.dsl.ShellPackingOptions;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import java.util.Collection;
import java.util.Set;

public interface HarmonyConfig {
  int getCompileSdkVersion();
  
  String getConsoleLogCharset();
  
  String getEntryModules();
  
  Collection<? extends BuildTypeOptions> getBuildTypes();
  
  CompileOptions getCompileOptions();
  
  DefaultConfigOptions getDefaultConfig();
  
  DexOptions getDexOptions();
  
  PackingToolOptions getPackingToolOptions();
  
  RestoolOptions getRestoolOptions();
  
  IdlToolOptions getIdlToolOptions();
  
  ShellPackingOptions getShellPackingOptions();
  
  Collection<? extends SigningConfigOptions> getSigningConfigs();
  
  ExternalNativeBuild getExternalNativeBuild();
  
  String getPackageVersion();
  
  Set<String> getFlavorDimensions();
}
