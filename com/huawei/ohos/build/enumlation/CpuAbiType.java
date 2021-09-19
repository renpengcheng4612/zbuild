package com.huawei.ohos.build.enumlation;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class CpuAbiType implements GroovyObject {
  private static Map<String, String> ABI_FOLDER;
  
  @Generated
  public CpuAbiType() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  static {
    Object object = $getCallSiteArray()[0].callConstructor(HashMap.class);
    ABI_FOLDER = (Map<String, String>)ScriptBytecodeAdapter.castToType(object, Map.class);
    $getCallSiteArray()[1].call(ABI_FOLDER, $getCallSiteArray()[2].call($getCallSiteArray()[3].callGetProperty(CpuAbiEnum.class)), "aarch64-linux-ohos");
    $getCallSiteArray()[4].call(ABI_FOLDER, $getCallSiteArray()[5].call($getCallSiteArray()[6].callGetProperty(CpuAbiEnum.class)), "arm-linux-ohos");
    $getCallSiteArray()[7].call(ABI_FOLDER, $getCallSiteArray()[8].call($getCallSiteArray()[9].callGetProperty(CpuAbiEnum.class)), "x86_64-linux-ohos");
  }
  
  public static String getAbiFolder(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[10].call(ABI_FOLDER, name));
  }
}
