package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.DependenciesModel;
import com.huawei.ohos.zbuild.model.HarmonyArtifactModel;
import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class HarmonyArtifactModelImpl implements HarmonyArtifactModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final DependenciesModel compileDependencies;
  
  private final SourceSetsProvider sourceSetsProvider;
  
  private final Set<File> generatedSourceFolders;
  
  private final Set<File> generatedResourceFolders;
  
  private final String assembleTaskName;
  
  private final String generateResourcesTaskName;
  
  private final File outputFolders;
  
  public HarmonyArtifactModelImpl(String name, DependenciesModel compileDependencies, SourceSetsProvider sourceSetsProvider, Set<File> generatedSourceFolders, Set<File> generatedResourceFolders, String assembleTaskName, String generateResourcesTaskName, File outputFolders) {
    this.name = name;
    this.compileDependencies = compileDependencies;
    this.sourceSetsProvider = sourceSetsProvider;
    this.generatedSourceFolders = generatedSourceFolders;
    this.generatedResourceFolders = generatedResourceFolders;
    this.assembleTaskName = assembleTaskName;
    this.generateResourcesTaskName = generateResourcesTaskName;
    this.outputFolders = outputFolders;
  }
  
  public String getName() {
    return this.name;
  }
  
  public DependenciesModel getCompileDependencies() {
    return this.compileDependencies;
  }
  
  public SourceSetsProvider getSourceSetsProvider() {
    return this.sourceSetsProvider;
  }
  
  public Set<File> getGeneratedSourceFolders() {
    return this.generatedSourceFolders;
  }
  
  public Set<File> getGeneratedResourceFolders() {
    return this.generatedResourceFolders;
  }
  
  public String getAssembleTaskName() {
    return this.assembleTaskName;
  }
  
  public String getGenerateResourcesTaskName() {
    return this.generateResourcesTaskName;
  }
  
  public File getOutputFolders() {
    return this.outputFolders;
  }
}
