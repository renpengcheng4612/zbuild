package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.HarmonyLibraryModel;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

public class HarmonyLibraryModelImpl implements HarmonyLibraryModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String type;
  
  private final String name;
  
  private final String projectName;
  
  private final File harFile;
  
  private final Collection<File> localJars;
  
  HarmonyLibraryModelImpl() {
    this.type = "";
    this.name = "";
    this.projectName = "";
    this.harFile = null;
    this.localJars = Collections.emptyList();
  }
  
  public HarmonyLibraryModelImpl(String type, String name, String projectName, File harFile, Collection<File> localJars) {
    this.type = type;
    this.name = name;
    this.projectName = projectName;
    this.harFile = harFile;
    this.localJars = localJars;
  }
  
  public File getHarFile() {
    return this.harFile;
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
  
  public Collection<File> getLocalJars() {
    return this.localJars;
  }
}
