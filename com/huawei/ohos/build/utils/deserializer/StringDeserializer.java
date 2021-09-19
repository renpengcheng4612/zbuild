package com.huawei.ohos.build.utils.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.huawei.ohos.build.utils.ConfigCache;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.gradle.api.GradleException;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class StringDeserializer extends JsonDeserializer {
  @NonNull
  private static final HMLogger hmLogger = HMLogger.getLogger(NumberDeserializer.class);
  
  public String deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    ConfigCache instance = ConfigCache.getInstance();
    String value = jsonParser.getText();
    try {
      if (Pattern.matches(".*\\{.*}.*", value)) {
        Map<String, Object> configPlaceHolder = instance.getConfigPlaceHolder();
        String flagData = value.substring(value.indexOf("{") + 1, value.indexOf("}"));
        if (configPlaceHolder.keySet().contains(flagData))
          return configPlaceHolder.get(flagData).toString(); 
        hmLogger.error((Throwable)new GradleException(String.format(Locale.ENGLISH, "Attribute %s@%s at config.json requires a placeholder substitution but no value for %s is provided", new Object[] { jsonParser
                  .getText(), jsonParser.getParsingContext(), jsonParser.getText() })));
      } 
      return value;
    } catch (NumberFormatException e) {
      throw e;
    } 
  }
}
