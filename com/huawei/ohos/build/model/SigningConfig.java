package com.huawei.ohos.build.model;

import java.io.File;
import javax.annotation.Nullable;
import org.gradle.api.Project;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public interface SigningConfig {
  @NonNull
  String getName();
  
  @Nullable
  File getStoreFile();
  
  void setStoreFile(File paramFile);
  
  @Nullable
  String getStorePassword();
  
  void setStorePassword(String paramString);
  
  @Nullable
  String getKeyAlias();
  
  void setKeyAlias(String paramString);
  
  @Nullable
  String getKeyPassword();
  
  void setKeyPassword(String paramString);
  
  @Nullable
  String getStoreType();
  
  void setStoreType(String paramString);
  
  @Nullable
  String getSignAlg();
  
  void setSignAlg(String paramString);
  
  @Nullable
  File getProfile();
  
  void setProfile(File paramFile);
  
  @Nullable
  File getCertpath();
  
  void setCertpath(File paramFile);
  
  boolean isV1SigningEnabled();
  
  void setV1SigningEnabled(boolean paramBoolean);
  
  boolean isV2SigningEnabled();
  
  void setV2SigningEnabled(boolean paramBoolean);
  
  boolean isHapSignReady(Project paramProject, String paramString);
  
  boolean isAppSignReady(Project paramProject, String paramString);
}
