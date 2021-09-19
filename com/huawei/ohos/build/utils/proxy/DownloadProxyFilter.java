package com.huawei.ohos.build.utils.proxy;

import com.huawei.deveco.sdkmanager.common.api.ProxyFilter;
import com.huawei.ohos.build.utils.NormalizeUtil;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class DownloadProxyFilter implements ProxyFilter, GroovyObject {
  private String nonProxyHostsHttp;
  
  public DownloadProxyFilter() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public DownloadProxyFilter(String nonProxyHostsHttp) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = nonProxyHostsHttp;
    this.nonProxyHostsHttp = ShortTypeHandling.castToString(str);
  }
  
  public boolean needProxy(String s) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return DefaultTypeTransformation.booleanUnbox(checkEffectProxyUrl(s, this.nonProxyHostsHttp)); 
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].callCurrent(this, s, this.nonProxyHostsHttp));
  }
  
  private Boolean checkEffectProxyUrl(String url, String nonProxyHostsHttp) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(nonProxyHostsHttp, null))
      return Boolean.valueOf(true); 
    String normalizeUrl = ShortTypeHandling.castToString(arrayOfCallSite[1].call(NormalizeUtil.class, url));
    String[] proxyAddrs = (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(nonProxyHostsHttp, "\\|"), String[].class);
    String proxyAddr;
    Iterator iterator;
    for (proxyAddr = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(proxyAddrs), Iterator.class); iterator.hasNext(); ) {
      proxyAddr = ShortTypeHandling.castToString(iterator.next());
      String regex = ShortTypeHandling.castToString(arrayOfCallSite[4].call(proxyAddr, "*", ""));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(normalizeUrl, regex)))
        return Boolean.valueOf(false); 
    } 
    return Boolean.valueOf(true);
  }
}
