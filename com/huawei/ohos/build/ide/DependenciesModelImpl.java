package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.DependenciesModel;
import com.huawei.ohos.zbuild.model.HarmonyLibraryModel;
import com.huawei.ohos.zbuild.model.JavaLibraryModel;
import com.huawei.ohos.zbuild.model.ModuleLibraryModel;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

public class DependenciesModelImpl implements DependenciesModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Collection<HarmonyLibraryModel> harmonyLibraries;
  
  private final Collection<JavaLibraryModel> javaLibraries;
  
  private final Collection<ModuleLibraryModel> moduleLibraries;
  
  DependenciesModelImpl() {
    this.javaLibraries = Collections.emptyList();
    this.harmonyLibraries = Collections.emptyList();
    this.moduleLibraries = Collections.emptyList();
  }
  
  DependenciesModelImpl(Collection<HarmonyLibraryModel> harmonyLibraries, Collection<JavaLibraryModel> javaLibraries, Collection<ModuleLibraryModel> moduleLibraries) {
    this.javaLibraries = javaLibraries;
    this.harmonyLibraries = harmonyLibraries;
    this.moduleLibraries = moduleLibraries;
  }
  
  public Collection<HarmonyLibraryModel> getHarmonyLibraries() {
    return this.harmonyLibraries;
  }
  
  public Collection<JavaLibraryModel> getJavaLibraries() {
    return this.javaLibraries;
  }
  
  public Collection<ModuleLibraryModel> getModuleLibraries() {
    return this.moduleLibraries;
  }
}
