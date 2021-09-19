package com.huawei.ohos.build.model.transform;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.attributes.Attribute;

public class HarmonyArtifacts implements GroovyObject {
  public static final Object ARTIFACT_TYPE;
  
  private static final String TYPE_HAR = "har";
  
  private static final String TYPE_EXPLODED_HAR = "harmony-exploded-har";
  
  private static final String TYPE_CLASSES = "harmony-classes";
  
  private static final String TYPE_PROFILE = "harmony-profile";
  
  private static final String TYPE_RES = "harmony-res";
  
  private static final String TYPE_ASSETS = "harmony-assets";
  
  private static final String TYPE_JAR = "jar";
  
  private static final String TYPE_CLASSES_JAR = "ohos-classes-jar";
  
  private static final String TYPE_JAVASCRIPT_RESOURCES = "ohso-js-resources";
  
  private static final String TYPE_BASE_RESOURCES = "base-resources";
  
  private static final String TYPE_LIBS = "ohos-libs";
  
  private static final String TYPE_SO = "type-so";
  
  private static final String TYPE_JAVA_RES = "java-res";
  
  private static final String TYPE_PROCESS_JAR = "processed-jar";
  
  private static final String TYPE_EXTRACT_HAR = "extract_har";
  
  private static final String TYPE_PROGUARD_TXT = "proguard-txt";
  
  private static final String ATTR_HAP = "Hap";
  
  public static final String ATTR_HAR = "Har";
  
  private static final String ATTR_FEATURE = "Feature";
  
  private static final String TYPE_LIBS_JAR = "libs_jar";
  
  private static final String TYPE_LIBS_SO = "libs_so";
  
  @Generated
  public HarmonyArtifacts() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    Object object = $getCallSiteArray()[0].call(Attribute.class, "artifactType", String.class);
  }
  
  public enum ArtifactType implements GroovyObject {
    JAR, HAR, EXTRACTED_HAR, PROCESSED_JAR, CLASSES_JAR, HARMONY_PROFILE, JAVASCRIPT_RESOURCES, BASE_RESOURCES, RESOURCES, ASSETS, LIBS, SO, JAVA_RES, PROGUARD_RULE, LIBS_JAR, LIBS_SO;
    
    private String artifactType;
    
    public static final ArtifactType MIN_VALUE;
    
    public static final ArtifactType MAX_VALUE;
    
    ArtifactType(String artifactType) {
      MetaClass metaClass = $getStaticMetaClass();
      String str = artifactType;
      this.artifactType = ShortTypeHandling.castToString(str);
    }
    
    public String type() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.artifactType;
    }
    
    static {
      Object object1 = $getCallSiteArray()[10].callStatic(ArtifactType.class, "JAR", Integer.valueOf(0), $getCallSiteArray()[11].callGetProperty(HarmonyArtifacts.class));
      JAR = (ArtifactType)ShortTypeHandling.castToEnum(object1, ArtifactType.class);
      Object object2 = $getCallSiteArray()[12].callStatic(ArtifactType.class, "HAR", Integer.valueOf(1), $getCallSiteArray()[13].callGetProperty(HarmonyArtifacts.class));
      HAR = (ArtifactType)ShortTypeHandling.castToEnum(object2, ArtifactType.class);
      Object object3 = $getCallSiteArray()[14].callStatic(ArtifactType.class, "EXTRACTED_HAR", Integer.valueOf(2), $getCallSiteArray()[15].callGetProperty(HarmonyArtifacts.class));
      EXTRACTED_HAR = (ArtifactType)ShortTypeHandling.castToEnum(object3, ArtifactType.class);
      Object object4 = $getCallSiteArray()[16].callStatic(ArtifactType.class, "PROCESSED_JAR", Integer.valueOf(3), $getCallSiteArray()[17].callGetProperty(HarmonyArtifacts.class));
      PROCESSED_JAR = (ArtifactType)ShortTypeHandling.castToEnum(object4, ArtifactType.class);
      Object object5 = $getCallSiteArray()[18].callStatic(ArtifactType.class, "CLASSES_JAR", Integer.valueOf(4), $getCallSiteArray()[19].callGetProperty(HarmonyArtifacts.class));
      CLASSES_JAR = (ArtifactType)ShortTypeHandling.castToEnum(object5, ArtifactType.class);
      Object object6 = $getCallSiteArray()[20].callStatic(ArtifactType.class, "HARMONY_PROFILE", Integer.valueOf(5), $getCallSiteArray()[21].callGetProperty(HarmonyArtifacts.class));
      HARMONY_PROFILE = (ArtifactType)ShortTypeHandling.castToEnum(object6, ArtifactType.class);
      Object object7 = $getCallSiteArray()[22].callStatic(ArtifactType.class, "JAVASCRIPT_RESOURCES", Integer.valueOf(6), $getCallSiteArray()[23].callGetProperty(HarmonyArtifacts.class));
      JAVASCRIPT_RESOURCES = (ArtifactType)ShortTypeHandling.castToEnum(object7, ArtifactType.class);
      Object object8 = $getCallSiteArray()[24].callStatic(ArtifactType.class, "BASE_RESOURCES", Integer.valueOf(7), $getCallSiteArray()[25].callGetProperty(HarmonyArtifacts.class));
      BASE_RESOURCES = (ArtifactType)ShortTypeHandling.castToEnum(object8, ArtifactType.class);
      Object object9 = $getCallSiteArray()[26].callStatic(ArtifactType.class, "RESOURCES", Integer.valueOf(8), $getCallSiteArray()[27].callGetProperty(HarmonyArtifacts.class));
      RESOURCES = (ArtifactType)ShortTypeHandling.castToEnum(object9, ArtifactType.class);
      Object object10 = $getCallSiteArray()[28].callStatic(ArtifactType.class, "ASSETS", Integer.valueOf(9), $getCallSiteArray()[29].callGetProperty(HarmonyArtifacts.class));
      ASSETS = (ArtifactType)ShortTypeHandling.castToEnum(object10, ArtifactType.class);
      Object object11 = $getCallSiteArray()[30].callStatic(ArtifactType.class, "LIBS", Integer.valueOf(10), $getCallSiteArray()[31].callGetProperty(HarmonyArtifacts.class));
      LIBS = (ArtifactType)ShortTypeHandling.castToEnum(object11, ArtifactType.class);
      Object object12 = $getCallSiteArray()[32].callStatic(ArtifactType.class, "SO", Integer.valueOf(11), $getCallSiteArray()[33].callGetProperty(HarmonyArtifacts.class));
      SO = (ArtifactType)ShortTypeHandling.castToEnum(object12, ArtifactType.class);
      Object object13 = $getCallSiteArray()[34].callStatic(ArtifactType.class, "JAVA_RES", Integer.valueOf(12), $getCallSiteArray()[35].callGetProperty(HarmonyArtifacts.class));
      JAVA_RES = (ArtifactType)ShortTypeHandling.castToEnum(object13, ArtifactType.class);
      Object object14 = $getCallSiteArray()[36].callStatic(ArtifactType.class, "PROGUARD_RULE", Integer.valueOf(13), $getCallSiteArray()[37].callGetProperty(HarmonyArtifacts.class));
      PROGUARD_RULE = (ArtifactType)ShortTypeHandling.castToEnum(object14, ArtifactType.class);
      Object object15 = $getCallSiteArray()[38].callStatic(ArtifactType.class, "LIBS_JAR", Integer.valueOf(14), $getCallSiteArray()[39].callGetProperty(HarmonyArtifacts.class));
      LIBS_JAR = (ArtifactType)ShortTypeHandling.castToEnum(object15, ArtifactType.class);
      Object object16 = $getCallSiteArray()[40].callStatic(ArtifactType.class, "LIBS_SO", Integer.valueOf(15), $getCallSiteArray()[41].callGetProperty(HarmonyArtifacts.class));
      LIBS_SO = (ArtifactType)ShortTypeHandling.castToEnum(object16, ArtifactType.class);
      ArtifactType artifactType1 = JAR;
      MIN_VALUE = artifactType1;
      ArtifactType artifactType2 = LIBS_SO;
      MAX_VALUE = artifactType2;
      ArtifactType[] arrayOfArtifactType = { 
          JAR, HAR, EXTRACTED_HAR, PROCESSED_JAR, CLASSES_JAR, HARMONY_PROFILE, JAVASCRIPT_RESOURCES, BASE_RESOURCES, RESOURCES, ASSETS, 
          LIBS, SO, JAVA_RES, PROGUARD_RULE, LIBS_JAR, LIBS_SO };
      $VALUES = arrayOfArtifactType;
    }
  }
}
