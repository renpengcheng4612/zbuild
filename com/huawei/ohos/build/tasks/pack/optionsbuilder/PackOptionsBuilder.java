package com.huawei.ohos.build.tasks.pack.optionsbuilder;

import com.huawei.ohos.build.tasks.pack.model.PackModel;
import java.io.File;
import java.util.List;

public interface PackOptionsBuilder {
  void initPackCommand();
  
  void executePack();
  
  List<File> getOutputFiles();
  
  PackModel getPackModel();
}
