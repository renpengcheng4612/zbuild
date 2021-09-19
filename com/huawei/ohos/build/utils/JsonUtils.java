package com.huawei.ohos.build.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huawei.ohos.build.exception.JsonTransException;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public final class JsonUtils implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private static final String PARSER_TO_JSON_ERROR = "Parser object to json error.";
  
  private static final String JSON_STR_IS_EMPTY = "The jsonStr is empty";
  
  private static final ObjectMapper MAPPER;
  
  @Generated
  public JsonUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    Object object1 = $getCallSiteArray()[0].call(HMLogger.class, JsonUtils.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object1, HMLogger.class);
    Object object2 = $getCallSiteArray()[1].callConstructor(ObjectMapper.class);
    MAPPER = (ObjectMapper)ScriptBytecodeAdapter.castToType(object2, ObjectMapper.class);
    $getCallSiteArray()[2].call(MAPPER, $getCallSiteArray()[3].callGetProperty(DeserializationFeature.class), Boolean.valueOf(false));
    $getCallSiteArray()[4].call(MAPPER, $getCallSiteArray()[5].callGetProperty(JsonParser.Feature.class), Boolean.valueOf(true));
    $getCallSiteArray()[6].call(MAPPER, $getCallSiteArray()[7].callGetProperty(JsonInclude.Include.class));
    $getCallSiteArray()[8].call(MAPPER, $getCallSiteArray()[9].callGetProperty(DeserializationFeature.class), Boolean.valueOf(false));
    $getCallSiteArray()[10].call(MAPPER, $getCallSiteArray()[11].call($getCallSiteArray()[12].callGetProperty(JsonReadFeature.class)), Boolean.valueOf(true));
    $getCallSiteArray()[13].call(MAPPER, $getCallSiteArray()[14].call($getCallSiteArray()[15].callGetProperty(JsonReadFeature.class)), Boolean.valueOf(true));
    $getCallSiteArray()[16].call(MAPPER, $getCallSiteArray()[17].callGetProperty(DeserializationFeature.class), Boolean.valueOf(true));
    $getCallSiteArray()[18].call(MAPPER, $getCallSiteArray()[19].callGetProperty(DeserializationFeature.class), Boolean.valueOf(true));
    $getCallSiteArray()[20].call(MAPPER, $getCallSiteArray()[21].callGetProperty(DeserializationFeature.class), Boolean.valueOf(false));
    $getCallSiteArray()[22].call(MAPPER, $getCallSiteArray()[23].callGetProperty(DeserializationFeature.class));
    $getCallSiteArray()[24].call(MAPPER, $getCallSiteArray()[25].callGetProperty(JsonParser.Feature.class));
  }
  
  private Object JsonUtil() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return null;
  }
  
  public static ObjectMapper getMapper() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return MAPPER;
  }
  
  public static String toJson(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(obj, null))
      arrayOfCallSite[26].call(hmLogger, arrayOfCallSite[27].callConstructor(JsonTransException.class, "The obj is null ,config.json convert exceptions")); 
    try {
      return ShortTypeHandling.castToString(arrayOfCallSite[28].call(MAPPER, obj));
    } catch (IOException ex) {
      return ShortTypeHandling.castToString(arrayOfCallSite[29].call(hmLogger, ex, PARSER_TO_JSON_ERROR));
    } finally {}
  }
  
  public static <T> T fromJson(String jsonStr, Class objClass) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (T)arrayOfCallSite[30].callStatic(JsonUtils.class, MAPPER, jsonStr, objClass);
  }
  
  public static <T> T fromJson(String jsonStr, TypeReference typeRef) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (T)arrayOfCallSite[31].callStatic(JsonUtils.class, MAPPER, jsonStr, typeRef);
  }
  
  public static <T> T fromJson(ObjectMapper mapper, String jsonStr, Class objClass) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareEqual(mapper, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(StringHandler.class, jsonStr))))
      arrayOfCallSite[33].call(hmLogger, arrayOfCallSite[34].callConstructor(JsonTransException.class, JSON_STR_IS_EMPTY)); 
    try {
      return (T)arrayOfCallSite[35].call(mapper, jsonStr, objClass);
    } catch (IOException ex) {
      return (T)arrayOfCallSite[36].call(hmLogger, arrayOfCallSite[37].callConstructor(JsonTransException.class, PARSER_TO_JSON_ERROR));
    } finally {}
  }
  
  public static <T> T fromJson(ObjectMapper mapper, String jsonStr, TypeReference typeRef) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareEqual(mapper, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[38].call(StringHandler.class, jsonStr))))
      arrayOfCallSite[39].call(hmLogger, arrayOfCallSite[40].callConstructor(JsonTransException.class, JSON_STR_IS_EMPTY)); 
    try {
      return (T)arrayOfCallSite[41].call(mapper, jsonStr, typeRef);
    } catch (IOException ex) {
      return (T)arrayOfCallSite[42].call(hmLogger, arrayOfCallSite[43].callConstructor(JsonTransException.class, PARSER_TO_JSON_ERROR));
    } finally {}
  }
  
  public static <T> T fromJson(File file, Class objClass) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[44].call(file)))
      arrayOfCallSite[45].call(hmLogger, arrayOfCallSite[46].callConstructor(JsonTransException.class, "check this config.json whether exist")); 
    try {
      return (T)arrayOfCallSite[47].call(MAPPER, file, objClass);
    } catch (JsonMappingException ex) {
      return (T)arrayOfCallSite[48].call(hmLogger, arrayOfCallSite[49].callConstructor(JsonMappingException.class, arrayOfCallSite[50].call(arrayOfCallSite[51].call(new GStringImpl(new Object[] { arrayOfCallSite[52].call(arrayOfCallSite[53].call(ex), "File", arrayOfCallSite[54].call(file)) }new String[] { "", "," }), arrayOfCallSite[55].call(System.class)), "exception configuration config.json file,please check it.")));
    } catch (IOException ex) {
      return (T)arrayOfCallSite[56].call(hmLogger, arrayOfCallSite[57].callConstructor(IOException.class, arrayOfCallSite[58].call(arrayOfCallSite[59].call(new GStringImpl(new Object[] { arrayOfCallSite[60].call(arrayOfCallSite[61].call(ex), "File", arrayOfCallSite[62].call(file)) }new String[] { "", "," }), arrayOfCallSite[63].call(System.class)), "exception configuration config.json file,please check it.")));
    } finally {}
  }
  
  public static <T> T fromJson(File file, TypeReference typeRef) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[64].call(file)))
      arrayOfCallSite[65].call(hmLogger, arrayOfCallSite[66].callConstructor(JsonTransException.class, "check this config.json whether exist")); 
    try {
      return (T)arrayOfCallSite[67].call(MAPPER, file, typeRef);
    } catch (IOException ex) {
      return (T)arrayOfCallSite[68].call(hmLogger, arrayOfCallSite[69].callConstructor(JsonTransException.class, PARSER_TO_JSON_ERROR));
    } finally {}
  }
  
  public static boolean isGoodJson(String jsonStr) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareNotEqual(jsonStr, null)) {
        boolean isTrue = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[75].call(jsonStr, "{")) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[76].call(jsonStr, "}")));
        boolean isList = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[77].call(jsonStr, "[")) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[78].call(jsonStr, "]")));
        return (((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[79].call("null", jsonStr)) || isList)) || isTrue);
      } 
      return false;
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(jsonStr, null)) {
      boolean isTrue = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[70].call(jsonStr, "{")) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[71].call(jsonStr, "}")));
      boolean isList = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].call(jsonStr, "[")) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[73].call(jsonStr, "]")));
      return (((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[74].call("null", jsonStr)) || isList)) || isTrue);
    } 
    return false;
  }
}
