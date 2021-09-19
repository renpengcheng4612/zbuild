package com.huawei.ohos.build.tasks.pack.model;

import com.huawei.ohos.build.model.VariantData;
import java.io.File;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;

public interface PackModel {
  public static final String HAR = "har";
  
  public static final String HAP = "hap";
  
  public static final String APP = "app";
  
  public static final String APK = "apk";
  
  Project getProject();
  
  VariantData getVariantData();
  
  String getPackageType();
  
  File getOutputDir();
  
  String getOutputFileName();
  
  File getOutputFile();
  
  File getPackageTool();
  
  void populateOutputs();
  
  FileCollection getHapFiles();
}
