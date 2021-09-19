package com.huawei.ohos.build.utils;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class XmlNodeHandler implements GroovyObject {
  public XmlNodeHandler() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void putAttrToNode(Node parent, String key, Object value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareEqual(value, null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call("", value))))
      return; 
    if ((((value instanceof String && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(value, "$")))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(value, ":"))))
      Object object = arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(arrayOfCallSite[17].call(value, "$media:", "@drawable/"), "$string:", "@string/"), "$strarray:", "@strarray/"), "$plural:", "@plural/"), "$integer:", "@integer/"), "$boolean:", "@boolean/"), "$float:", "@dimen/"), "$intarray:", "@intarray/"), "$color:", "@color/"), "$pattern:", "@style/"), "$theme:", "@style/"), "$layout:", "@layout/"), "$animation:", "@animator/"), "$graphic:", "@drawable/"), "$profile:", "@xml/"); 
    arrayOfCallSite[18].call(arrayOfCallSite[19].call(parent), key, value);
  }
}
