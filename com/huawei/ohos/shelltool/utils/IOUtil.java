package com.huawei.ohos.shelltool.utils;

import java.util.Locale;
import org.gradle.api.GradleException;

public class IOUtil {
  public static void closeAll(AutoCloseable... io) {
    for (AutoCloseable temp : io) {
      try {
        if (null != temp)
          temp.close(); 
      } catch (Exception e) {
        throw new GradleException(String.format(Locale.ENGLISH, "An error happened:%s IO Stream close failed. error:%s.", new Object[] { temp.getClass().getName(), e.getMessage() }));
      } 
    } 
  }
}
