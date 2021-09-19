package com.huawei.ohos.build.attributes;

import org.gradle.api.Named;
import org.gradle.api.attributes.Attribute;

public interface BuildTypeAttr extends Named {
  public static final Attribute<String> ATTRIBUTE = Attribute.of("com.huawei.buildtype", String.class);
  
  public static final String DEBUG = "debug";
  
  public static final String RELEASE = "release";
}
