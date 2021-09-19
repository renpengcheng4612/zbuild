package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.ModuleLibraryModel;
import java.io.Serializable;

public class ModuleLibraryModelImpl implements ModuleLibraryModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String type;
  
  private final String name;
  
  private final String projectName;
  
  private final String variantName;
  
  ModuleLibraryModelImpl() {
    this.type = "";
    this.name = "";
    this.projectName = "";
    this.variantName = "";
  }
  
  public ModuleLibraryModelImpl(String type, String name, String projectName, String variantName) {
    this.type = type;
    this.name = name;
    this.projectName = projectName;
    this.variantName = variantName;
  }
  
  public String getVariantName() {
    return this.variantName;
  }
  
  public String getType() {
    return this.type;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getProjectName() {
    return this.projectName;
  }
}
