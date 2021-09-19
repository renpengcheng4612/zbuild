package com.huawei.ohos.build.ide.dependencies;

import com.huawei.ohos.zbuild.model.DependencyItem;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class DependencyItemImpl implements DependencyItem, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String artifactAddress;
  
  private final List<DependencyItem> dependencies;
  
  DependencyItemImpl() {
    this.artifactAddress = "";
    this.dependencies = Collections.emptyList();
  }
  
  public DependencyItemImpl(String artifactAddress, List<DependencyItem> dependencies) {
    this.artifactAddress = artifactAddress;
    this.dependencies = dependencies;
  }
  
  @Nonnull
  public String getArtifactAddress() {
    return this.artifactAddress;
  }
  
  @Nonnull
  public String getRequestedCoordinates() {
    return "";
  }
  
  @Nonnull
  public List<DependencyItem> getDependencies() {
    return this.dependencies;
  }
}
