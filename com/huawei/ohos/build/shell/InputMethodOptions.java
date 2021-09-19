package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.utils.XmlNodeHandler;
import com.huawei.ohos.build.utils.configJson.CastTransformUtil;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class InputMethodOptions implements GroovyObject {
  private String settingsAbility;
  
  private String supportsAdvancingToNext;
  
  private List<SubModeOptions> submode;
  
  public InputMethodOptions(Map inputMethod) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(ShortTypeHandling.castToString(arrayOfCallSite[1].call(inputMethod, "settingsAbility")), "ShellActivity");
    this.settingsAbility = ShortTypeHandling.castToString(object1);
    String str = ShortTypeHandling.castToString(arrayOfCallSite[2].call(inputMethod, "supportsAdvancingToNext"));
    this.supportsAdvancingToNext = ShortTypeHandling.castToString(str);
    Object object2 = arrayOfCallSite[3].callConstructor(ArrayList.class);
    this.submode = (List<SubModeOptions>)ScriptBytecodeAdapter.castToType(object2, List.class);
    List submodeList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(CastTransformUtil.class, arrayOfCallSite[5].call(inputMethod, "keyboardType"), Map.class), List.class);
    Map sub;
    Iterator iterator;
    for (sub = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(submodeList), Iterator.class); iterator.hasNext(); ) {
      sub = (Map)ScriptBytecodeAdapter.castToType(iterator.next(), Map.class);
      arrayOfCallSite[7].call(this.submode, arrayOfCallSite[8].callConstructor(SubModeOptions.class, sub));
    } 
  }
  
  public void transform2Node(Node parent) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    XmlNodeHandler xmlNodeHandler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    arrayOfCallSite[10].call(xmlNodeHandler, parent, "android:settingsActivity", this.settingsAbility);
    arrayOfCallSite[11].call(xmlNodeHandler, parent, "android:supportsSwitchingToNextInputMethod ", arrayOfCallSite[12].callCurrent(this, this.supportsAdvancingToNext));
    SubModeOptions subModeOptions;
    Iterator iterator;
    for (subModeOptions = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(this.submode), Iterator.class); iterator.hasNext(); ) {
      subModeOptions = (SubModeOptions)ScriptBytecodeAdapter.castToType(iterator.next(), SubModeOptions.class);
      arrayOfCallSite[14].call(subModeOptions, parent);
    } 
  }
  
  private String handleSupportAd(String ad) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(ad, null))
      return ShortTypeHandling.castToString(null); 
    if (ScriptBytecodeAdapter.compareEqual(ad, "false"))
      return "true"; 
    return "false";
  }
}
