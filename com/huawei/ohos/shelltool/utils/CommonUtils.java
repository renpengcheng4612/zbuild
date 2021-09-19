package com.huawei.ohos.shelltool.utils;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import org.gradle.api.logging.Logging;

public class CommonUtils {
  public static final String HUAWEI_OS_KEY = "ohos";
  
  public static final String DOT_XML = ".xml";
  
  public static final String STYLES_XML = "styles.xml";
  
  public static final String SMART_LEARNING = "fa_manager_enhance_smart_learning.xml";
  
  public static final String ANDROID_NS_NAME = "android";
  
  public static final String ANDROID_NS_VALUE = "http://schemas.android.com/apk/res/android";
  
  public static void createSubFile(File file) {
    File dir = file.getParentFile();
    try {
      if (!dir.exists() && 
        !dir.mkdirs())
        Logging.getLogger(CommonUtils.class).info("mkdir " + dir.toString() + ", directory already exist"); 
      if (!file.createNewFile())
        Logging.getLogger(CommonUtils.class).info("create file " + file.toString() + ", file already exist"); 
    } catch (IOException e) {
      Logging.getLogger(CommonUtils.class).error(String.format(Locale.ENGLISH, "mkdir %s create file %s failed:error:%s", new Object[] { dir.toString(), file.toString(), e.getMessage() }));
    } 
  }
}
