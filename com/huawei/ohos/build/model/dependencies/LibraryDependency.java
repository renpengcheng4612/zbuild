package com.huawei.ohos.build.model.dependencies;

import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;

public interface LibraryDependency extends HarmonyLibrary {
  @Nonnull
  List<LibraryDependency> getDependencies();
  
  @Nonnull
  Collection<JarDependency> getLocalDependencies();
}
