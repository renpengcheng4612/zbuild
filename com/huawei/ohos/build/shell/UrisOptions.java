package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class UrisOptions extends Transform2Node {
  public String scheme;
  
  public String host;
  
  public String port;
  
  public String path;
  
  public String pathStartWith;
  
  public String pathRegx;
  
  public String type;
  
  public String uri;
  
  public UrisOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    Node dataNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(Node.class, parent, "data"), Node.class);
    if (ScriptBytecodeAdapter.compareEqual(this.scheme, null))
      throw (Throwable)arrayOfCallSite[2].callConstructor(GradleException.class, "Invalid config.json file. The value of skills.uris.scheme is null."); 
    arrayOfCallSite[3].call(handler, dataNode, "android:scheme", this.scheme);
    arrayOfCallSite[4].call(handler, dataNode, "android:host", this.host);
    arrayOfCallSite[5].call(handler, dataNode, "android:port", this.port);
    arrayOfCallSite[6].call(handler, dataNode, "android:path", this.path);
    arrayOfCallSite[7].call(handler, dataNode, "android:pathPrefix", this.pathStartWith);
    arrayOfCallSite[8].call(handler, dataNode, "android:pathPattern", this.pathRegx);
    arrayOfCallSite[9].call(handler, dataNode, "android:mimeType", this.type);
  }
  
  public String getScheme() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.scheme;
  }
  
  public void setScheme(String scheme) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = scheme;
    this.scheme = ShortTypeHandling.castToString(str);
  }
  
  public String getHost() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.host;
  }
  
  public void setHost(String host) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = host;
    this.host = ShortTypeHandling.castToString(str);
  }
  
  public String getPort() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.port;
  }
  
  public void setPort(String port) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = port;
    this.port = ShortTypeHandling.castToString(str);
  }
  
  public String getPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.path;
  }
  
  public void setPath(String path) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = path;
    this.path = ShortTypeHandling.castToString(str);
  }
  
  public String getPathStartWith() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pathStartWith;
  }
  
  public void setPathStartWith(String pathStartWith) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = pathStartWith;
    this.pathStartWith = ShortTypeHandling.castToString(str);
  }
  
  public String getPathRegx() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pathRegx;
  }
  
  public void setPathRegx(String pathRegx) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = pathRegx;
    this.pathRegx = ShortTypeHandling.castToString(str);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public void setType(String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = type;
    this.type = ShortTypeHandling.castToString(str);
  }
  
  public String getUri() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.uri;
  }
  
  public void setUri(String uri) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = uri;
    this.uri = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
