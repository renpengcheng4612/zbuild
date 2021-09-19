package com.huawei.ohos.build.plugins;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Locale;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.util.GradleVersion;

public class VersionCheckPlugin implements Plugin<Project>, GroovyObject {
  public static final GradleVersion GRADLE_MIN_VERSION;
  
  private static final HMLogger HM_LOGGER;
  
  static {
    Object object1 = $getCallSiteArray()[12].call(GradleVersion.class, $getCallSiteArray()[13].callGetProperty(SdkConst.class));
    GRADLE_MIN_VERSION = (GradleVersion)ScriptBytecodeAdapter.castToType(object1, GradleVersion.class);
    Object object2 = $getCallSiteArray()[14].call(HMLogger.class, VersionCheckPlugin.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object2, HMLogger.class);
  }
  
  public void apply(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object currentVersion = arrayOfCallSite[0].call(GradleVersion.class, arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(project)));
    if (ScriptBytecodeAdapter.compareGreaterThan(GRADLE_MIN_VERSION, currentVersion)) {
      Object file = arrayOfCallSite[3].call(arrayOfCallSite[4].call(Paths.class, "gradle", "wrapper", "gradle-wrapper.properties"));
      Object errorMessage = arrayOfCallSite[5].call(String.class, arrayOfCallSite[6].callGetProperty(Locale.class), arrayOfCallSite[7].call(arrayOfCallSite[8].call(new GStringImpl(new Object[] { GRADLE_MIN_VERSION, currentVersion }, new String[] { "Minimum supported Gradle version is ", ". Current version is ", ". " }), new GStringImpl(new Object[] { arrayOfCallSite[9].callGetProperty(file) }, new String[] { "If using the gradle wrapper, try editing the distributionUrl in ", " " })), new GStringImpl(new Object[] { GRADLE_MIN_VERSION }, new String[] { "to gradle-", "-all.zip" })));
      arrayOfCallSite[10].call(HM_LOGGER, arrayOfCallSite[11].callConstructor(RuntimeException.class, errorMessage));
    } 
  }
  
  @Generated
  public VersionCheckPlugin() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
