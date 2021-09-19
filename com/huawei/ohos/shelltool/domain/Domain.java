package com.huawei.ohos.shelltool.domain;

import java.nio.file.Path;

public abstract class Domain {
  public Path input;
  
  public Path output;
  
  public Domain(Path input, Path output) {
    this.input = input;
    this.output = output;
  }
  
  public abstract boolean action();
}
