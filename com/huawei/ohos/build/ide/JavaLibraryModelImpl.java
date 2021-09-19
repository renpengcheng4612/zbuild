package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.JavaLibraryModel;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

class JavaLibraryModelImpl implements JavaLibraryModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String type;
  
  private final String name;
  
  private final String projectName;
  
  private final File jarFile;
  
  private final List<JavaLibraryModel> dependencies;
  
  JavaLibraryModelImpl() {
    this.type = "";
    this.name = "";
    this.projectName = "";
    this.jarFile = null;
    this.dependencies = Collections.emptyList();
  }
  
  JavaLibraryModelImpl(String type, String name, String projectName, File jarFile, List<JavaLibraryModel> dependencies) {
    this.type = type;
    this.dependencies = dependencies;
    this.jarFile = jarFile;
    this.projectName = projectName;
    this.name = name;
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
  
  public File getJarFile() {
    return this.jarFile;
  }
  
  public List<JavaLibraryModel> getDependencies() {
    return this.dependencies;
  }
}
