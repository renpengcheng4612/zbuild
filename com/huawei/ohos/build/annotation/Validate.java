package com.huawei.ohos.build.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Repeatable(Validates.class)
public @interface Validate {
  boolean notNull() default false;
  
  int maxLength() default 0;
  
  int minLength() default 0;
  
  String regex() default "";
  
  String message() default "";
  
  String[] range() default {};
  
  int minValue() default -2147483648;
  
  int maxValue() default 2147483647;
  
  String deviceType() default "";
  
  boolean notSupport() default false;
  
  boolean resource() default false;
}
