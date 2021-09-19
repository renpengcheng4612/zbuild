package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.BuildTypeContainer;
import com.huawei.ohos.zbuild.model.DefaultConfigModel;
import com.huawei.ohos.zbuild.model.HarmonyProject;
import com.huawei.ohos.zbuild.model.VariantFlavorContainer;
import com.huawei.ohos.zbuild.model.VariantModel;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

public final class DefaultHarmonyProject implements HarmonyProject, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final Collection<String> bootClasspath;
  
  private final DefaultConfigModel defaultConfig;
  
  private final Map<String, VariantModel> mainVariants;
  
  private final Map<String, VariantModel> extraOhosTestVariants;
  
  private final Map<String, VariantModel> extraUnitTestVariants;
  
  private final Collection<String> variantNames;
  
  private final Map<String, BuildTypeContainer> buildTypes;
  
  private final Map<String, VariantFlavorContainer> variantFlavors;
  
  private final String defaultVariantName;
  
  private final File buildFolder;
  
  private final Integer compileSdkVersion;
  
  private final List<File> extraExcludeFolders;
  
  public DefaultHarmonyProject(String name, Collection<String> bootClasspath, DefaultConfigModel defaultConfig, Map<String, VariantModel> mainVariants, Map<String, VariantModel> extraOhosTestVariants, Map<String, VariantModel> extraUnitTestVariants, Collection<String> variantNames, Map<String, BuildTypeContainer> buildTypes, Map<String, VariantFlavorContainer> variantFlavors, String defaultVariantName, File buildFolder, Integer compileSdkVersion, List<File> extraExcludeFolders) {
    this.name = name;
    this.mainVariants = mainVariants;
    this.extraOhosTestVariants = extraOhosTestVariants;
    this.extraUnitTestVariants = extraUnitTestVariants;
    this.defaultConfig = defaultConfig;
    this.bootClasspath = bootClasspath;
    this.variantNames = variantNames;
    this.buildTypes = buildTypes;
    this.variantFlavors = variantFlavors;
    this.defaultVariantName = defaultVariantName;
    this.buildFolder = buildFolder;
    this.compileSdkVersion = compileSdkVersion;
    this.extraExcludeFolders = extraExcludeFolders;
  }
  
  @Nonnull
  public String getName() {
    return this.name;
  }
  
  @Nonnull
  public Collection<String> getBootClasspath() {
    return this.bootClasspath;
  }
  
  public Map<String, BuildTypeContainer> getBuildTypes() {
    return this.buildTypes;
  }
  
  public Map<String, VariantFlavorContainer> getVariantFlavor() {
    return this.variantFlavors;
  }
  
  public Collection<String> getVariantNames() {
    return this.variantNames;
  }
  
  @Nonnull
  public DefaultConfigModel getDefaultConfig() {
    return this.defaultConfig;
  }
  
  public Map<String, VariantModel> getMainVariants() {
    return this.mainVariants;
  }
  
  public Map<String, VariantModel> getExtraOhosTestVariants() {
    return this.extraOhosTestVariants;
  }
  
  public Map<String, VariantModel> getExtraUnitTestVariants() {
    return this.extraUnitTestVariants;
  }
  
  public String getDefaultVariantName() {
    return this.defaultVariantName;
  }
  
  public File getBuildFolder() {
    return this.buildFolder;
  }
  
  public Integer getCompileSdkVersion() {
    return this.compileSdkVersion;
  }
  
  public List<File> getExtraExcludeFolders() {
    return this.extraExcludeFolders;
  }
}
