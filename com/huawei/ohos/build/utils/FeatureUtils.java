package com.huawei.ohos.build.utils;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.utils.command.Aapt2CommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
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
import org.gradle.api.Project;

public class FeatureUtils implements GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[46].call(HMLogger.class, FeatureUtils.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static void setFeaturePackageId(ConfigInfo configInfo, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(configInfo), "feature")) {
      arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(GlobalDataManager.class), arrayOfCallSite[3].callGetProperty(project), arrayOfCallSite[4].call("0x", arrayOfCallSite[5].call(Integer.class, arrayOfCallSite[6].callGetProperty(GlobalDataManager.class))));
      Object object1;
      ScriptBytecodeAdapter.setProperty(arrayOfCallSite[8].call(object1 = arrayOfCallSite[7].callGetProperty(GlobalDataManager.class)), null, GlobalDataManager.class, "START_FEATURE_PACKAGE_ID");
      arrayOfCallSite[8].call(object1 = arrayOfCallSite[7].callGetProperty(GlobalDataManager.class));
      arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(GlobalDataManager.class), arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(project), "_"), arrayOfCallSite[14].callGetProperty(BuildConst.class)), arrayOfCallSite[15].call("0x", arrayOfCallSite[16].call(Integer.class, arrayOfCallSite[17].callGetProperty(GlobalDataManager.class))));
      Object object2;
      ScriptBytecodeAdapter.setProperty(arrayOfCallSite[19].call(object2 = arrayOfCallSite[18].callGetProperty(GlobalDataManager.class)), null, GlobalDataManager.class, "START_FEATURE_PACKAGE_ID");
      arrayOfCallSite[19].call(object2 = arrayOfCallSite[18].callGetProperty(GlobalDataManager.class));
    } else if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[20].call(configInfo), "entry")) {
      arrayOfCallSite[21].call(arrayOfCallSite[22].callGetProperty(GlobalDataManager.class), arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(project), "_"), arrayOfCallSite[26].callGetProperty(BuildConst.class)), arrayOfCallSite[27].call("0x", arrayOfCallSite[28].call(Integer.class, arrayOfCallSite[29].callGetProperty(GlobalDataManager.class))));
      Object object;
      ScriptBytecodeAdapter.setProperty(arrayOfCallSite[31].call(object = arrayOfCallSite[30].callGetProperty(GlobalDataManager.class)), null, GlobalDataManager.class, "START_FEATURE_PACKAGE_ID");
      arrayOfCallSite[31].call(object = arrayOfCallSite[30].callGetProperty(GlobalDataManager.class));
    } 
  }
  
  public static void getFeaturePackageId(String variantName, Project project, Aapt2CommandBuilder builder) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[32].call(hmLogger, new GStringImpl(new Object[] { arrayOfCallSite[33].callGetProperty(GlobalDataManager.class) }, new String[] { "Feature module resources id for'--package-id'：", "" }));
    String packageId = "";
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[34].call(variantName, arrayOfCallSite[35].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[36].call(arrayOfCallSite[37].callGetProperty(GlobalDataManager.class), arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].callGetProperty(project), "_"), arrayOfCallSite[41].callGetProperty(BuildConst.class)));
      packageId = ShortTypeHandling.castToString(object);
    } else {
      Object object = arrayOfCallSite[42].call(arrayOfCallSite[43].callGetProperty(GlobalDataManager.class), arrayOfCallSite[44].callGetProperty(project));
      packageId = ShortTypeHandling.castToString(object);
    } 
    arrayOfCallSite[45].call(builder, packageId);
  }
  
  @Generated
  public FeatureUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
