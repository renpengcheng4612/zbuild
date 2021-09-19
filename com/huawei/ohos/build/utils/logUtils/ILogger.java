package com.huawei.ohos.build.utils.logUtils;

import javax.annotation.Nullable;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public interface ILogger {
  void error(@Nullable Throwable paramThrowable, @Nullable String paramString, Object... paramVarArgs);
  
  void warning(@NonNull String paramString, Object... paramVarArgs);
  
  void quiet(@NonNull String paramString, Object... paramVarArgs);
  
  void info(@NonNull String paramString, Object... paramVarArgs);
  
  void error(@Nullable Throwable paramThrowable);
}
