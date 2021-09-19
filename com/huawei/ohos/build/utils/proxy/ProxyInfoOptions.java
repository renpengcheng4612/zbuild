package com.huawei.ohos.build.utils.proxy;

import com.huawei.deveco.common.security.util.StringUtil;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.utils.StringHandler;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class ProxyInfoOptions implements GroovyObject {
  private static final HMLogger HM_LOGGER;
  
  private static final String proxyHostHttpAttr = "systemProp.http.proxyHost";
  
  private static final String proxyHostHttpsAttr = "systemProp.https.proxyHost";
  
  private static final String proxyPortHttpAttr = "systemProp.http.proxyPort";
  
  private static final String proxyPortHttpsAttr = "systemProp.https.proxyPort";
  
  private static final String nonProxyHostsHttpAttr = "systemProp.http.nonProxyHosts";
  
  private static final String nonProxyHostsHttpsAttr = "systemProp.https.nonProxyHosts";
  
  private static final String proxyUserHttpAttr = "systemProp.http.proxyUser";
  
  private static final String proxyUserHttpsAttr = "systemProp.https.proxyUser";
  
  private static final String proxyPasswordHttpAttr = "systemProp.http.proxyPassword";
  
  private static final String proxyPasswordHttpsAttr = "systemProp.https.proxyPassword";
  
  private String proxyHostHttp;
  
  private String proxyHostHttps;
  
  private Integer proxyPortHttp;
  
  private Integer proxyPortHttps;
  
  private String nonProxyHostsHttp;
  
  private String nonProxyHostsHttps;
  
  private String proxyUserHttp;
  
  private String proxyUserHttps;
  
  private String proxyPasswordHttp;
  
  private String proxyPasswordHttps;
  
  private String gradleUserHome;
  
  private String projectName;
  
  static {
    Object object = $getCallSiteArray()[94].call(HMLogger.class, ProxyInfoOptions.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public boolean isEmptyProxy() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.proxyHostHttp, null) || ScriptBytecodeAdapter.compareEqual(this.proxyPortHttp, null)))
        return true; 
      return false;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(this.proxyHostHttp, null) || ScriptBytecodeAdapter.compareEqual(this.proxyPortHttp, null)))
      return true; 
    return false;
  }
  
  public ProxyInfoOptions(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(project), proxyHostHttpAttr);
    this.proxyHostHttp = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(project), proxyHostHttpsAttr);
    this.proxyHostHttps = ShortTypeHandling.castToString(object2);
    Object object3 = arrayOfCallSite[4].call(Math.class, arrayOfCallSite[5].call(StringHandler.class, arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(project), proxyPortHttpAttr), Integer.valueOf(0)), Integer.valueOf(0));
    this.proxyPortHttp = (Integer)ScriptBytecodeAdapter.castToType(object3, Integer.class);
    Object object4 = arrayOfCallSite[8].call(Math.class, arrayOfCallSite[9].call(StringHandler.class, arrayOfCallSite[10].call(arrayOfCallSite[11].callGetProperty(project), proxyPortHttpsAttr), Integer.valueOf(0)), Integer.valueOf(0));
    this.proxyPortHttps = (Integer)ScriptBytecodeAdapter.castToType(object4, Integer.class);
    Object object5 = arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(project), nonProxyHostsHttpAttr);
    this.nonProxyHostsHttp = ShortTypeHandling.castToString(object5);
    Object object6 = arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(project), nonProxyHostsHttpsAttr);
    this.nonProxyHostsHttps = ShortTypeHandling.castToString(object6);
    Object object7 = arrayOfCallSite[16].call(arrayOfCallSite[17].callGetProperty(project), proxyUserHttpAttr);
    this.proxyUserHttp = ShortTypeHandling.castToString(object7);
    Object object8 = arrayOfCallSite[18].call(arrayOfCallSite[19].callGetProperty(project), proxyUserHttpsAttr);
    this.proxyUserHttps = ShortTypeHandling.castToString(object8);
    Object object9 = arrayOfCallSite[20].call(arrayOfCallSite[21].callGetProperty(project), proxyPasswordHttpAttr);
    this.proxyPasswordHttp = ShortTypeHandling.castToString(object9);
    Object object10 = arrayOfCallSite[22].call(arrayOfCallSite[23].callGetProperty(project), proxyPasswordHttpsAttr);
    this.proxyPasswordHttps = ShortTypeHandling.castToString(object10);
    Object object11 = arrayOfCallSite[24].callGetProperty(arrayOfCallSite[25].callGetProperty(arrayOfCallSite[26].callGetProperty(project)));
    this.gradleUserHome = ShortTypeHandling.castToString(object11);
    Object object12 = arrayOfCallSite[27].callGetProperty(arrayOfCallSite[28].callGetProperty(project));
    this.projectName = ShortTypeHandling.castToString(object12);
    String blankHostMessage = "proxyHostHttp or proxyHostHttps should not contains blank, ";
    String emptyPassWordMessage = "proxyPwd should not be null when proxyUser is not null, ";
    String checkProMessage = ShortTypeHandling.castToString(
        arrayOfCallSite[29].call(arrayOfCallSite[30].call(arrayOfCallSite[31].call(arrayOfCallSite[32].call(arrayOfCallSite[33].call(arrayOfCallSite[34].call(arrayOfCallSite[35].call("please check ", this.gradleUserHome), arrayOfCallSite[36].callGetProperty(File.class)), arrayOfCallSite[37].callGetProperty(SdkConst.class)), " or "), this.projectName), arrayOfCallSite[38].callGetProperty(File.class)), arrayOfCallSite[39].callGetProperty(SdkConst.class)));
    if ((ScriptBytecodeAdapter.compareNotEqual(this.proxyHostHttps, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(this.proxyHostHttps, " "))))
      arrayOfCallSite[41].call(HM_LOGGER, arrayOfCallSite[42].callConstructor(GradleException.class, arrayOfCallSite[43].call(arrayOfCallSite[44].call(blankHostMessage, arrayOfCallSite[45].call(System.class)), checkProMessage))); 
    if ((ScriptBytecodeAdapter.compareNotEqual(this.proxyHostHttp, null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[46].call(this.proxyHostHttp, " "))))
      arrayOfCallSite[47].call(HM_LOGGER, arrayOfCallSite[48].callConstructor(GradleException.class, arrayOfCallSite[49].call(arrayOfCallSite[50].call(blankHostMessage, arrayOfCallSite[51].call(System.class)), checkProMessage))); 
    if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(StringUtil.class, this.proxyUserHttp))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[53].call(StringUtil.class, this.proxyPasswordHttp))))
      arrayOfCallSite[54].call(HM_LOGGER, arrayOfCallSite[55].callConstructor(GradleException.class, arrayOfCallSite[56].call(arrayOfCallSite[57].call(emptyPassWordMessage, arrayOfCallSite[58].call(System.class)), checkProMessage))); 
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[59].call(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call(arrayOfCallSite[66].call(arrayOfCallSite[67].call(arrayOfCallSite[68].call(arrayOfCallSite[69].call(arrayOfCallSite[70].call(arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].call(arrayOfCallSite[74].call(arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].call(arrayOfCallSite[78].call(arrayOfCallSite[79].call(arrayOfCallSite[80].call(arrayOfCallSite[81].call(arrayOfCallSite[82].call(arrayOfCallSite[83].call(arrayOfCallSite[84].call(arrayOfCallSite[85].call(arrayOfCallSite[86].call(arrayOfCallSite[87].call(arrayOfCallSite[88].call(arrayOfCallSite[89].call(arrayOfCallSite[90].call(arrayOfCallSite[91].call(arrayOfCallSite[92].call(arrayOfCallSite[93].call("ProxyInfoOptions{", "proxyHostHttp='"), this.proxyHostHttp), "'"), ", proxyHostHttps='"), this.proxyHostHttps), "'"), ", proxyPortHttp="), this.proxyPortHttp), ", proxyPortHttps="), this.proxyPortHttps), ", nonProxyHostsHttp='"), this.nonProxyHostsHttp), "'"), ", nonProxyHostsHttps='"), this.nonProxyHostsHttps), "'"), ", proxyUserHttp='"), this.proxyUserHttp), "'"), ", proxyUserHttps='"), this.proxyUserHttps), "'"), ", proxyPasswordHttp='"), this.proxyPasswordHttp), "'"), ", proxyPasswordHttps='"), this.proxyPasswordHttps), "'"), ", gradleUserHome='"), this.gradleUserHome), "'"), ", projectName='"), this.projectName), "'"), "}"));
  }
  
  @Generated
  public String getProxyHostHttp() {
    return this.proxyHostHttp;
  }
  
  @Generated
  public void setProxyHostHttp(String paramString) {
    this.proxyHostHttp = paramString;
  }
  
  @Generated
  public String getProxyHostHttps() {
    return this.proxyHostHttps;
  }
  
  @Generated
  public void setProxyHostHttps(String paramString) {
    this.proxyHostHttps = paramString;
  }
  
  @Generated
  public Integer getProxyPortHttp() {
    return this.proxyPortHttp;
  }
  
  @Generated
  public void setProxyPortHttp(Integer paramInteger) {
    this.proxyPortHttp = paramInteger;
  }
  
  @Generated
  public Integer getProxyPortHttps() {
    return this.proxyPortHttps;
  }
  
  @Generated
  public void setProxyPortHttps(Integer paramInteger) {
    this.proxyPortHttps = paramInteger;
  }
  
  @Generated
  public String getNonProxyHostsHttp() {
    return this.nonProxyHostsHttp;
  }
  
  @Generated
  public void setNonProxyHostsHttp(String paramString) {
    this.nonProxyHostsHttp = paramString;
  }
  
  @Generated
  public String getNonProxyHostsHttps() {
    return this.nonProxyHostsHttps;
  }
  
  @Generated
  public void setNonProxyHostsHttps(String paramString) {
    this.nonProxyHostsHttps = paramString;
  }
  
  @Generated
  public String getProxyUserHttp() {
    return this.proxyUserHttp;
  }
  
  @Generated
  public void setProxyUserHttp(String paramString) {
    this.proxyUserHttp = paramString;
  }
  
  @Generated
  public String getProxyUserHttps() {
    return this.proxyUserHttps;
  }
  
  @Generated
  public void setProxyUserHttps(String paramString) {
    this.proxyUserHttps = paramString;
  }
  
  @Generated
  public String getProxyPasswordHttp() {
    return this.proxyPasswordHttp;
  }
  
  @Generated
  public void setProxyPasswordHttp(String paramString) {
    this.proxyPasswordHttp = paramString;
  }
  
  @Generated
  public String getProxyPasswordHttps() {
    return this.proxyPasswordHttps;
  }
  
  @Generated
  public void setProxyPasswordHttps(String paramString) {
    this.proxyPasswordHttps = paramString;
  }
  
  @Generated
  public String getGradleUserHome() {
    return this.gradleUserHome;
  }
  
  @Generated
  public void setGradleUserHome(String paramString) {
    this.gradleUserHome = paramString;
  }
  
  @Generated
  public String getProjectName() {
    return this.projectName;
  }
  
  @Generated
  public void setProjectName(String paramString) {
    this.projectName = paramString;
  }
}
