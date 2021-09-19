package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ArkOptions extends Transform2Node {
  public ReqVersionOptions reqVersion;
  
  @Validate(range = {"m", "mo", "z"})
  public String flag;
  
  public ArkOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public ReqVersionOptions getReqVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.reqVersion;
  }
  
  public void setReqVersion(ReqVersionOptions reqVersion) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ReqVersionOptions reqVersionOptions = reqVersion;
    this.reqVersion = (ReqVersionOptions)ScriptBytecodeAdapter.castToType(reqVersionOptions, ReqVersionOptions.class);
  }
  
  public String getFlag() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.flag;
  }
  
  public void setFlag(String flag) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = flag;
    this.flag = ShortTypeHandling.castToString(str);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    if (ScriptBytecodeAdapter.compareNotEqual(this.reqVersion, null)) {
      Node node = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(Node.class, parent, "meta-data"), Node.class);
      arrayOfCallSite[2].call(handler, node, "android:name", "ArkMinSdkVersion");
      arrayOfCallSite[3].call(handler, node, "android:value", arrayOfCallSite[4].call(this.reqVersion));
      Node node1 = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(Node.class, parent, "meta-data"), Node.class);
      arrayOfCallSite[6].call(handler, node1, "android:name", "ArkTargetSdkVersion");
      arrayOfCallSite[7].call(handler, node1, "android:value", arrayOfCallSite[8].call(this.reqVersion));
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(this.flag, null)) {
      Node node = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(Node.class, parent, "meta-data"), Node.class);
      arrayOfCallSite[10].call(handler, node, "android:name", "com.huawei.maple.flag");
      arrayOfCallSite[11].call(handler, node, "android:value", this.flag);
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
        
        arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(arrayOfCallSite[17].call("ArkOptions{", "reqVersion="), this.reqVersion), ", flag='"), this.flag), "'"), "}"));
  }
}
