package com.huawei.ohos.shelltool.az;

import com.alibaba.fastjson.JSONObject;
import com.huawei.ohos.shelltool.domain.Domain;
import com.huawei.ohos.shelltool.utils.XmlUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import org.gradle.api.logging.Logging;

public class Layout extends Domain {
  public Layout(Path input, Path output) {
    super(input, output);
  }
  
  public boolean action() {
    JSONObject layoutRules;
    File inputRes = this.input.toFile();
    if (inputRes == null || !inputRes.exists())
      return Boolean.TRUE.booleanValue(); 
    File[] resDirs = inputRes.listFiles((dir, name) -> name.startsWith("layout"));
    BufferedReader bufferedReader = null;
    try {
      InputStream ruleStream = Layout.class.getResourceAsStream("/rules/layout_rule.json");
      bufferedReader = new BufferedReader(new InputStreamReader(ruleStream, StandardCharsets.UTF_8));
      String ruleStr = bufferedReader.lines().parallel().collect(Collectors.joining(System.lineSeparator()));
      layoutRules = JSONObject.parseObject(ruleStr);
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException e) {
          Logging.getLogger(Layout.class).error("read the rules of layout failed.");
          return Boolean.FALSE.booleanValue();
        }  
    } 
    if (layoutRules == null)
      return Boolean.FALSE.booleanValue(); 
    for (File resDir : resDirs) {
      File[] resFileInDir = resDir.listFiles();
      if (resFileInDir == null)
        return Boolean.FALSE.booleanValue(); 
      for (File resFile : resFileInDir) {
        String fileName = resFile.getName();
        if (fileName.endsWith(".xml")) {
          File outputFile = new File(Paths.get(this.output.toString(), new String[] { resDir.getName(), resFile.getName() }).toString());
          if (!XmlUtils.transformXml(resFile, outputFile, layoutRules))
            return Boolean.FALSE.booleanValue(); 
        } 
      } 
    } 
    return Boolean.TRUE.booleanValue();
  }
}
