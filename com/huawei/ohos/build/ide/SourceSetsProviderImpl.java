package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Nonnull;

public class SourceSetsProviderImpl implements SourceSetsProvider, Serializable {
  private static final long serialVersionUID = 1L;
  
  @Nonnull
  private final String name;
  
  @Nonnull
  private final File configJsonFile;
  
  @Nonnull
  private final Collection<File> javaSourceDirs;
  
  @Nonnull
  private final Collection<File> resourcesDirs;
  
  @Nonnull
  private final Collection<File> zidlDirs;
  
  @Nonnull
  private final Collection<File> jsDirs;
  
  public SourceSetsProviderImpl(@Nonnull String name, @Nonnull File configJsonFile, @Nonnull Collection<File> javaSourceDirs, @Nonnull Collection<File> resourcesDirs, @Nonnull Collection<File> idlDirs, @Nonnull Collection<File> jsDirs) {
    this.name = name;
    this.configJsonFile = configJsonFile;
    this.javaSourceDirs = javaSourceDirs;
    this.resourcesDirs = resourcesDirs;
    this.zidlDirs = idlDirs;
    this.jsDirs = jsDirs;
  }
  
  public SourceSetsProviderImpl(@Nonnull OhosSourceSet sourceSetsProvider) {
    this.name = sourceSetsProvider.getName();
    this.configJsonFile = sourceSetsProvider.getConfigJsonFile();
    this.javaSourceDirs = sourceSetsProvider.getJavaSourceDirectories();
    this.resourcesDirs = sourceSetsProvider.getResourcesDirectories();
    this.zidlDirs = sourceSetsProvider.getZidlDirectories();
    this.jsDirs = sourceSetsProvider.getJsDirectories();
  }
  
  @Nonnull
  public String getName() {
    return this.name;
  }
  
  @Nonnull
  public File getConfigJsonFile() {
    return this.configJsonFile;
  }
  
  @Nonnull
  public Collection<File> getJavaSourceDirectories() {
    return this.javaSourceDirs;
  }
  
  @Nonnull
  public Collection<File> getResourcesDirectories() {
    return this.resourcesDirs;
  }
  
  @Nonnull
  public Collection<File> getZidlDirectories() {
    return this.zidlDirs;
  }
  
  @Nonnull
  public Collection<File> getJsDirectories() {
    return this.jsDirs;
  }
}
