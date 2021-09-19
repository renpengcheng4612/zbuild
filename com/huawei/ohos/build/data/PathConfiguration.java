package com.huawei.ohos.build.data;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.utils.FileUtils;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Properties;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class PathConfiguration implements GroovyObject {
  private Project project;
  
  private String hwSdkDir;
  
  private String nodeJsDir;
  
  private String nativeDir;
  
  private String npmDir;
  
  private String npmConfigDir;
  
  private Properties properties;
  
  public PathConfiguration(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object1 = arrayOfCallSite[0].callConstructor(Properties.class);
    this.properties = (Properties)ScriptBytecodeAdapter.castToType(object1, Properties.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(project), arrayOfCallSite[4].callGetProperty(SdkConst.class)))))
      arrayOfCallSite[5].call(this.properties, arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].callGetProperty(project), arrayOfCallSite[9].callGetProperty(SdkConst.class)))); 
    Object object2 = arrayOfCallSite[10].callCurrent(this, arrayOfCallSite[11].callGetProperty(SdkConst.class), arrayOfCallSite[12].callGetProperty(SdkConst.class));
    this.hwSdkDir = ShortTypeHandling.castToString(object2);
    Object object3 = arrayOfCallSite[13].callCurrent(this, arrayOfCallSite[14].callGetProperty(SdkConst.class), arrayOfCallSite[15].callGetProperty(SdkConst.class));
    this.nodeJsDir = ShortTypeHandling.castToString(object3);
    Object object4 = arrayOfCallSite[16].callCurrent(this, arrayOfCallSite[17].callGetProperty(SdkConst.class), arrayOfCallSite[18].callGetProperty(SdkConst.class));
    this.nativeDir = ShortTypeHandling.castToString(object4);
    Object object5 = arrayOfCallSite[19].callCurrent(this, arrayOfCallSite[20].callGetProperty(SdkConst.class), this.nodeJsDir);
    this.npmDir = ShortTypeHandling.castToString(object5);
    Object object6 = arrayOfCallSite[21].callCurrent(this, arrayOfCallSite[22].callGetProperty(SdkConst.class), "");
    this.npmConfigDir = ShortTypeHandling.castToString(object6);
  }
  
  private String getConfigurationDir(String key, String env) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String dir = ShortTypeHandling.castToString(arrayOfCallSite[23].call(this.properties, key));
    return ShortTypeHandling.castToString(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(FileUtils.class, dir)) ? dir : arrayOfCallSite[25].call(System.class, env));
  }
  
  private String getConfigurationDirWithDefault(String key, String defaultValue) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String dir = ShortTypeHandling.castToString(arrayOfCallSite[26].call(this.properties, key));
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(FileUtils.class, dir)) ? dir : defaultValue;
  }
  
  public String getHwSdkDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.hwSdkDir;
  }
  
  public String getNodeJsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.nodeJsDir;
  }
  
  public String getNativeDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.nativeDir;
  }
  
  public String getNpmDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.npmDir;
  }
  
  public String getNpmConfigDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.npmConfigDir;
  }
}
