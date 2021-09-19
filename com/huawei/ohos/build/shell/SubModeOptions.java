package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class SubModeOptions implements GroovyObject {
  private String label;
  
  private String language;
  
  private String supportsAscii;
  
  private String icon;
  
  private String inputSource;
  
  private String customizedValue;
  
  public SubModeOptions(Map submode) {
    MetaClass metaClass = $getStaticMetaClass();
    String str1 = ShortTypeHandling.castToString(arrayOfCallSite[0].call(submode, "label"));
    this.label = ShortTypeHandling.castToString(str1);
    String str2 = ShortTypeHandling.castToString(arrayOfCallSite[1].call(submode, "language"));
    this.language = ShortTypeHandling.castToString(str2);
    String str3 = ShortTypeHandling.castToString(arrayOfCallSite[2].call(submode, "supportsAscii"));
    this.supportsAscii = ShortTypeHandling.castToString(str3);
    String str4 = ShortTypeHandling.castToString(arrayOfCallSite[3].call(submode, "icon"));
    this.icon = ShortTypeHandling.castToString(str4);
    String str5 = ShortTypeHandling.castToString(arrayOfCallSite[4].call(submode, "inputSource"));
    this.inputSource = ShortTypeHandling.castToString(str5);
    String str6 = ShortTypeHandling.castToString(arrayOfCallSite[5].call(submode, "customizedValue"));
    this.customizedValue = ShortTypeHandling.castToString(str6);
  }
  
  public void transform2Node(Node parent) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Node subtype = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].callConstructor(Node.class, parent, "subtype"), Node.class);
    XmlNodeHandler xmlNodeHandler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    arrayOfCallSite[8].call(xmlNodeHandler, subtype, "android:label", this.label);
    arrayOfCallSite[9].call(xmlNodeHandler, subtype, "android:languageTag", this.language);
    arrayOfCallSite[10].call(xmlNodeHandler, subtype, "android:isAsciiCapable", this.supportsAscii);
    arrayOfCallSite[11].call(xmlNodeHandler, subtype, "android:icon", this.icon);
    arrayOfCallSite[12].call(xmlNodeHandler, subtype, "android:imeSubtypeMode", this.inputSource);
    arrayOfCallSite[13].call(xmlNodeHandler, subtype, "android:imeSubtypeExtraValue", this.customizedValue);
  }
}
