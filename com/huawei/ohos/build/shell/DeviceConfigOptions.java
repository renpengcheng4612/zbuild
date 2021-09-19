package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.annotation.Validates;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class DeviceConfigOptions extends Transform2Node {
  @Validate(deviceType = "lite", notSupport = true)
  public String jointUserId;
  
  @Validates({@Validate(deviceType = "rich", maxLength = 31), @Validate(deviceType = "lite", notSupport = true)})
  public String process;
  
  @Validate(deviceType = "lite", notSupport = true)
  public ArkOptions ark;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean keepAlive;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean directLaunch;
  
  @Validate(deviceType = "lite", notSupport = true)
  public NetworkOptions network;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean supportBackup;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean compressNativeLibs;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean allowComponentsProxy;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean debug;
  
  public DeviceConfigOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public Boolean getDebug() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.debug;
  }
  
  public void setDebug(Boolean debug) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = debug;
    this.debug = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getJointUserId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jointUserId;
  }
  
  public void setJointUserId(String jointUserId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = jointUserId;
    this.jointUserId = ShortTypeHandling.castToString(str);
  }
  
  public String getProcess() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.process;
  }
  
  public void setProcess(String process) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = process;
    this.process = ShortTypeHandling.castToString(str);
  }
  
  public ArkOptions getArk() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.ark;
  }
  
  public void setArk(ArkOptions ark) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ArkOptions arkOptions = ark;
    this.ark = (ArkOptions)ScriptBytecodeAdapter.castToType(arkOptions, ArkOptions.class);
  }
  
  public Boolean getKeepAlive() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.keepAlive;
  }
  
  public void setKeepAlive(Boolean keepAlive) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = keepAlive;
    this.keepAlive = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public Boolean getDirectLaunch() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.directLaunch;
  }
  
  public void setDirectLaunch(Boolean directLaunch) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = directLaunch;
    this.directLaunch = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public NetworkOptions getNetwork() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.network;
  }
  
  public void setNetwork(NetworkOptions network) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    NetworkOptions networkOptions = network;
    this.network = (NetworkOptions)ScriptBytecodeAdapter.castToType(networkOptions, NetworkOptions.class);
  }
  
  public Boolean getSupportBackup() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.supportBackup;
  }
  
  public void setSupportBackup(Boolean supportBackup) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = supportBackup;
    this.supportBackup = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public Boolean getCompressNativeLibs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compressNativeLibs;
  }
  
  public void setCompressNativeLibs(Boolean compressNativeLibs) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = compressNativeLibs;
    this.compressNativeLibs = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public Boolean getAllowComponentsProxy() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.allowComponentsProxy;
  }
  
  public void setAllowComponentsProxy(Boolean allowComponentsProxy) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = allowComponentsProxy;
    this.allowComponentsProxy = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void transform2Node(Node parent, String moduleType, Project project, AppOptions appOptions, ModuleOptions moduleOptions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    if (ScriptBytecodeAdapter.compareNotEqual(this.keepAlive, null)) {
      arrayOfCallSite[1].call(handler, parent, "android:persistent", this.keepAlive);
    } else {
      arrayOfCallSite[2].call(handler, parent, "android:persistent", Boolean.valueOf(false));
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(this.directLaunch, null)) {
      arrayOfCallSite[3].call(handler, parent, "android:directBootAware", this.directLaunch);
    } else {
      arrayOfCallSite[4].call(handler, parent, "android:directBootAware", Boolean.valueOf(false));
    } 
    arrayOfCallSite[5].call(handler, parent, "android:process", this.process);
    if (ScriptBytecodeAdapter.compareNotEqual(this.supportBackup, null)) {
      arrayOfCallSite[6].call(handler, parent, "android:allowBackup", this.supportBackup);
    } else {
      arrayOfCallSite[7].call(handler, parent, "android:allowBackup", Boolean.valueOf(false));
    } 
    Node node = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(parent), Node.class);
    if (ScriptBytecodeAdapter.compareNotEqual(this.jointUserId, null))
      arrayOfCallSite[9].call(handler, node, "android:sharedUserId", this.jointUserId); 
    if (ScriptBytecodeAdapter.compareNotEqual(this.ark, null))
      arrayOfCallSite[10].call(this.ark, parent, moduleType, project); 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.network, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[15].callGetProperty(this.network), null))) {
        arrayOfCallSite[16].call(handler, parent, "android:usesCleartextTraffic", arrayOfCallSite[17].callGetProperty(this.network));
      } else {
        arrayOfCallSite[18].call(handler, parent, "android:usesCleartextTraffic", Boolean.valueOf(false));
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(this.network, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[11].callGetProperty(this.network), null))) {
      arrayOfCallSite[12].call(handler, parent, "android:usesCleartextTraffic", arrayOfCallSite[13].callGetProperty(this.network));
    } else {
      arrayOfCallSite[14].call(handler, parent, "android:usesCleartextTraffic", Boolean.valueOf(false));
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.network, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[21].callGetProperty(this.network), null)))
        arrayOfCallSite[22].call(handler, parent, "android:networkSecurityConfig", "@xml/network_security_config"); 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(this.network, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[19].callGetProperty(this.network), null))) {
      arrayOfCallSite[20].call(handler, parent, "android:networkSecurityConfig", "@xml/network_security_config");
    } 
    if (DefaultTypeTransformation.booleanUnbox(this.allowComponentsProxy)) {
      Object packageName = arrayOfCallSite[23].call(moduleOptions);
      arrayOfCallSite[24].call(handler, parent, "tools:replace", "android:appComponentFactory");
      arrayOfCallSite[25].call(handler, parent, "android:appComponentFactory", arrayOfCallSite[26].call(packageName, ".ShellComponentProxy"));
    } 
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].call(arrayOfCallSite[31].call(arrayOfCallSite[32].call(arrayOfCallSite[33].call(arrayOfCallSite[34].call(arrayOfCallSite[35].call(arrayOfCallSite[36].call(arrayOfCallSite[37].call(arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call("DeviceConfigOptions{", "jointUserId='"), this.jointUserId), "'"), ", process='"), this.process), "'"), ", ark="), this.ark), ", keepAlive="), this.keepAlive), ", directLaunch="), this.directLaunch), ", network="), this.network), ", supportBackup="), this.supportBackup), ", compressNativeLibs="), this.compressNativeLibs), ", allowComponentsProxy="), this.allowComponentsProxy), ", debug="), this.debug), "}"));
  }
}
