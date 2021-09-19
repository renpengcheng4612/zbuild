package com.huawei.ohos.build.ide.dependencies;

import com.huawei.ohos.zbuild.model.DependencyGraphs;
import com.huawei.ohos.zbuild.model.DependencyItem;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class DependencyGraphsImpl implements DependencyGraphs, Serializable {
  private static final long serialVersionUID = 1L;
  
  @Nonnull
  private final List<DependencyItem> compileDependencies;
  
  @Nonnull
  private final List<DependencyItem> packageDependencies;
  
  DependencyGraphsImpl() {
    this.compileDependencies = Collections.emptyList();
    this.packageDependencies = Collections.emptyList();
  }
  
  public DependencyGraphsImpl(List<DependencyItem> compileDependencies, List<DependencyItem> packageDependencies) {
    this.compileDependencies = compileDependencies;
    this.packageDependencies = packageDependencies;
  }
  
  @Nonnull
  public List<DependencyItem> getCompileDependencies() {
    return this.compileDependencies;
  }
  
  @Nonnull
  public List<DependencyItem> getPackageDependencies() {
    return this.packageDependencies;
  }
}
