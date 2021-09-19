package com.huawei.ohos.build.utils;

import java.io.File;
import java.util.regex.Matcher;

public class NormalizeUtil {
  public static String normalizePath(String path) {
    String result = path.replaceAll("/+", Matcher.quoteReplacement(File.separator));
    return result.replaceAll("\\\\+", Matcher.quoteReplacement(File.separator));
  }
  
  public static String normalizeUrl(String path) {
    String placeholder = "6445BF55-95C4-41F9-8235-34CE3ED9146D";
    String result = path.replaceAll("\\\\+", "/");
    result = result.replaceAll("/+", "/");
    result = result.replaceAll("http:/+", placeholder);
    return result.replace(placeholder, "http://");
  }
}
