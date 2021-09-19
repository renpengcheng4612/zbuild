package com.huawei.ohos.build.model.dependencies;

import java.io.File;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface HarmonyLibrary extends Library {
  @Nullable
  String getProjectPath();
  
  @Nonnull
  File getBundle();
  
  @Nonnull
  File getBundleFolder();
  
  @Nonnull
  List<? extends HarmonyLibrary> getLibraryDependencies();
  
  @Nonnull
  File getConfigJson();
  
  @Nullable
  String getVariantName();
  
  @Nonnull
  File getJarFile();
  
  @Nonnull
  Collection<File> getLocalJars();
  
  boolean isOptional();
}
