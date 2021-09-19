package com.huawei.ohos.shelltool;

import com.huawei.ohos.shelltool.az.Layout;
import com.huawei.ohos.shelltool.az.XmlHandle;
import java.nio.file.Path;

public class ShellToolBuilder {
  Path input;
  
  Path output;
  
  public ShellToolBuilder(Path input, Path output) {
    this.input = input;
    this.output = output;
  }
  
  public boolean run() {
    if (this.input == null || this.output == null)
      return Boolean.FALSE.booleanValue(); 
    XmlHandle xmlHandle = new XmlHandle(this.input, this.output);
    if (!xmlHandle.action())
      return Boolean.FALSE.booleanValue(); 
    Layout layout = new Layout(this.input, this.output);
    if (!layout.action())
      return Boolean.FALSE.booleanValue(); 
    return Boolean.TRUE.booleanValue();
  }
}
