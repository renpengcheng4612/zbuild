package com.huawei.ohos.shelltool.az;

import com.huawei.ohos.shelltool.domain.Domain;
import com.huawei.ohos.shelltool.utils.XmlUtils;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlHandle extends Domain {
  public XmlHandle(Path input, Path output) {
    super(input, output);
  }
  
  public boolean action() {
    File inputRes = this.input.toFile();
    if (inputRes == null || !inputRes.exists())
      return Boolean.TRUE.booleanValue(); 
    File[] resDirs = inputRes.listFiles();
    for (File resDir : resDirs) {
      File[] resFileInDir = resDir.listFiles();
      for (File resFile : resFileInDir) {
        String fileName = resFile.getName();
        if (fileName.endsWith(".xml")) {
          File outputFile = new File(Paths.get(this.output.toString(), new String[] { resDir.getName(), resFile.getName() }).toString());
          if (!XmlUtils.transformXml(resFile, outputFile, null))
            return Boolean.FALSE.booleanValue(); 
        } 
      } 
    } 
    return Boolean.TRUE.booleanValue();
  }
}
