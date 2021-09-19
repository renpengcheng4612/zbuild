package com.huawei.ohos.build.model.sourcesets;

import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Collection;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class OhosSourceSet implements SourceSetsProvider, GroovyObject {
  public static final String JAVA_FILE_PATTERN = "**/*.java";
  
  public static final String IDL_PATTERN = "**/*.idl";
  
  public static final String RESOURCE_TABLE_PATTERN = "**/ResourceTable.java";
  
  public static final String BUILD_CONFIG_PATTERN = "**/BuildConfig.java";
  
  public static final String ANNOTATION_DIR = "**/annotation";
  
  public static final String RUNTIME_PUBLISH = "runtimePublish";
  
  public static final String API_PUBLISH = "apiPublish";
  
  public static final String DEFAULT_MAIN = "main";
  
  public static final String DEFAULT_OHOS_TEST = "ohosTest";
  
  public static final String DEFAULT_UNIT_TEST = "test";
  
  public static final String RUNTIME_CLASS_PATH = "runtimeClassPath";
  
  public static final String COMPILE_CLASS_PATH = "compileClassPath";
  
  public static final String API_ELEMENT = "apiElements";
  
  public static final String RUNTIME_ELEMENT = "runtimeElements";
  
  public static final String IMPLEMENTATION = "implementation";
  
  public static final String API = "api";
  
  public static final String COMPILE = "compile";
  
  public static final String COMPILE_ONLY = "compileOnly";
  
  public static final String RUNTIME_ONLY = "runtimeOnly";
  
  public static final String ANNOTATION_PROCESSOR = "annotationProcessor";
  
  public static final String ANNOTATION_PROCESSOR_CLASS_PATH = "annotationProcessorClassPath";
  
  private String name;
  
  private OhosFilterableSourceDirectory javaSource;
  
  private OhosFilterableSourceDirectory javaResource;
  
  private OhosFilterableSourceDirectory config;
  
  private OhosFilterableSourceDirectory zidl;
  
  private OhosFilterableSourceDirectory resource;
  
  private OhosFilterableSourceDirectory js;
  
  @Inject
  public OhosSourceSet(String name, Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
    Object object1 = arrayOfCallSite[0].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " Java Sources" }), project, arrayOfCallSite[1].callGetProperty(SourceType.class));
    this.javaSource = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object1, OhosFilterableSourceDirectory.class);
    Object object2 = arrayOfCallSite[2].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " config.json" }), project, arrayOfCallSite[3].callGetProperty(SourceType.class));
    this.config = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object2, OhosFilterableSourceDirectory.class);
    Object object3 = arrayOfCallSite[4].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " Java Resources" }), project, arrayOfCallSite[5].callGetProperty(SourceType.class));
    this.javaResource = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object3, OhosFilterableSourceDirectory.class);
    Object object4 = arrayOfCallSite[6].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " Zidl Source" }), project, arrayOfCallSite[7].callGetProperty(SourceType.class));
    this.zidl = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object4, OhosFilterableSourceDirectory.class);
    Object object5 = arrayOfCallSite[8].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " Resouece" }), project, arrayOfCallSite[9].callGetProperty(SourceType.class));
    this.resource = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object5, OhosFilterableSourceDirectory.class);
    Object object6 = arrayOfCallSite[10].call(arrayOfCallSite[11].callConstructor(OhosFilterableSourceDirectory.class, new GStringImpl(new Object[] { name }, new String[] { "", " Js Source" }), project, arrayOfCallSite[12].callGetProperty(SourceType.class)), new GStringImpl(new Object[] { name }, new String[] { "src/", "/js" }));
    this.js = (OhosFilterableSourceDirectory)ScriptBytecodeAdapter.castToType(object6, OhosFilterableSourceDirectory.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      init();
      return;
    } 
    arrayOfCallSite[13].callCurrent(this);
  }
  
  public String getApiPublishName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(API_PUBLISH); 
    return ShortTypeHandling.castToString(arrayOfCallSite[14].callCurrent(this, API_PUBLISH));
  }
  
  public String getCompileClassPathName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(COMPILE_CLASS_PATH); 
    return ShortTypeHandling.castToString(arrayOfCallSite[15].callCurrent(this, COMPILE_CLASS_PATH));
  }
  
  public String getCompileOnlyName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(COMPILE_ONLY); 
    return ShortTypeHandling.castToString(arrayOfCallSite[16].callCurrent(this, COMPILE_ONLY));
  }
  
  public String getRuntimeOnlyName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(RUNTIME_ONLY); 
    return ShortTypeHandling.castToString(arrayOfCallSite[17].callCurrent(this, RUNTIME_ONLY));
  }
  
  public String getApiName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(API); 
    return ShortTypeHandling.castToString(arrayOfCallSite[18].callCurrent(this, API));
  }
  
  public String getApiElementsName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(API_ELEMENT); 
    return ShortTypeHandling.castToString(arrayOfCallSite[19].callCurrent(this, API_ELEMENT));
  }
  
  public String getRuntimeElementsName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(RUNTIME_ELEMENT); 
    return ShortTypeHandling.castToString(arrayOfCallSite[20].callCurrent(this, RUNTIME_ELEMENT));
  }
  
  public String getImplementationName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(IMPLEMENTATION); 
    return ShortTypeHandling.castToString(arrayOfCallSite[21].callCurrent(this, IMPLEMENTATION));
  }
  
  @Deprecated
  public String getCompileName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(COMPILE); 
    return ShortTypeHandling.castToString(arrayOfCallSite[22].callCurrent(this, COMPILE));
  }
  
  public String getRunTimeClassPathName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(RUNTIME_CLASS_PATH); 
    return ShortTypeHandling.castToString(arrayOfCallSite[23].callCurrent(this, RUNTIME_CLASS_PATH));
  }
  
  public String getRunTimePublishName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(RUNTIME_PUBLISH); 
    return ShortTypeHandling.castToString(arrayOfCallSite[24].callCurrent(this, RUNTIME_PUBLISH));
  }
  
  public String getAnnotationProcessorName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(ANNOTATION_PROCESSOR); 
    return ShortTypeHandling.castToString(arrayOfCallSite[25].callCurrent(this, ANNOTATION_PROCESSOR));
  }
  
  public String getAnnotationProcessorClassPathName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return getConfigurationName(ANNOTATION_PROCESSOR_CLASS_PATH); 
    return ShortTypeHandling.castToString(arrayOfCallSite[26].callCurrent(this, ANNOTATION_PROCESSOR_CLASS_PATH));
  }
  
  public Object allZidlFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[27].call(this.zidl);
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public File getConfigJsonFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].call(arrayOfCallSite[29].call(this.config), Integer.valueOf(0)), File.class);
  }
  
  public Collection<File> getJavaSourceDirectories() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection<File>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].call(this.javaSource), Collection.class);
  }
  
  public Collection<File> getResourcesDirectories() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection<File>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(this.javaResource), Collection.class);
  }
  
  public Collection<File> getZidlDirectories() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection<File>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(this.zidl), Collection.class);
  }
  
  public Collection<File> getJsDirectories() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection<File>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(this.js), Collection.class);
  }
  
  private Object init() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[34].call(arrayOfCallSite[35].call(this.javaSource, new GStringImpl(new Object[] { this.name }, new String[] { "src/", "/java" })), JAVA_FILE_PATTERN);
    arrayOfCallSite[36].call(this.config, new GStringImpl(new Object[] { this.name }, new String[] { "src/", "/config.json" }));
    arrayOfCallSite[37].call(arrayOfCallSite[38].call(this.javaResource, new GStringImpl(new Object[] { this.name }, new String[] { "src/", "/resources" })), JAVA_FILE_PATTERN);
    arrayOfCallSite[39].call(this.zidl, new GStringImpl(new Object[] { this.name }, new String[] { "src/", "/idl" }));
    return arrayOfCallSite[40].call(this.resource, new GStringImpl(new Object[] { this.name }, new String[] { "src/", "" }));
  }
  
  private String getConfigurationName(String configurationName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.name, DEFAULT_MAIN))
      return configurationName; 
    return ShortTypeHandling.castToString(new GStringImpl(new Object[] { this.name, arrayOfCallSite[41].call(configurationName) }, new String[] { "", "", "" }));
  }
  
  @Generated
  public OhosFilterableSourceDirectory getJavaSource() {
    return this.javaSource;
  }
  
  @Generated
  public void setJavaSource(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.javaSource = paramOhosFilterableSourceDirectory;
  }
  
  @Generated
  public OhosFilterableSourceDirectory getJavaResource() {
    return this.javaResource;
  }
  
  @Generated
  public void setJavaResource(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.javaResource = paramOhosFilterableSourceDirectory;
  }
  
  @Generated
  public OhosFilterableSourceDirectory getConfig() {
    return this.config;
  }
  
  @Generated
  public void setConfig(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.config = paramOhosFilterableSourceDirectory;
  }
  
  @Generated
  public OhosFilterableSourceDirectory getZidl() {
    return this.zidl;
  }
  
  @Generated
  public void setZidl(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.zidl = paramOhosFilterableSourceDirectory;
  }
  
  @Generated
  public OhosFilterableSourceDirectory getResource() {
    return this.resource;
  }
  
  @Generated
  public void setResource(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.resource = paramOhosFilterableSourceDirectory;
  }
  
  @Generated
  public OhosFilterableSourceDirectory getJs() {
    return this.js;
  }
  
  @Generated
  public void setJs(OhosFilterableSourceDirectory paramOhosFilterableSourceDirectory) {
    this.js = paramOhosFilterableSourceDirectory;
  }
}
