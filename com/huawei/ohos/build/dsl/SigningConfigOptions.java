package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.model.DefaultSigningConfig;
import com.huawei.ohos.build.model.SigningConfig;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import java.util.StringJoiner;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Named;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class SigningConfigOptions extends DefaultSigningConfig implements Named {
  @Inject
  public SigningConfigOptions(@NonNull String name) {
    super(name);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public SigningConfig initWith(SigningConfig that) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(that));
    arrayOfCallSite[2].callCurrent((GroovyObject)this, arrayOfCallSite[3].call(that));
    arrayOfCallSite[4].callCurrent((GroovyObject)this, arrayOfCallSite[5].call(that));
    arrayOfCallSite[6].callCurrent((GroovyObject)this, arrayOfCallSite[7].call(that));
    arrayOfCallSite[8].callCurrent((GroovyObject)this, arrayOfCallSite[9].call(that));
    arrayOfCallSite[10].callCurrent((GroovyObject)this, arrayOfCallSite[11].call(that));
    arrayOfCallSite[12].callCurrent((GroovyObject)this, arrayOfCallSite[13].call(that));
    arrayOfCallSite[14].callCurrent((GroovyObject)this, arrayOfCallSite[15].call(that));
    arrayOfCallSite[16].callCurrent((GroovyObject)this, arrayOfCallSite[17].call(that));
    arrayOfCallSite[18].callCurrent((GroovyObject)this, arrayOfCallSite[19].call(that));
    return (SigningConfig)this;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[20].call(arrayOfCallSite[21].call(arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].call(arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].call(arrayOfCallSite[31].callConstructor(StringJoiner.class, ",", arrayOfCallSite[32].call(arrayOfCallSite[33].call(SigningConfigOptions.class), "["), "]"), arrayOfCallSite[34].call("name:", arrayOfCallSite[35].callGroovyObjectGetProperty(this))), arrayOfCallSite[36].call("storeFile:", ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[37].callCurrent((GroovyObject)this), null) ? arrayOfCallSite[38].callGetProperty(arrayOfCallSite[39].callCurrent((GroovyObject)this)) : "null")), arrayOfCallSite[40].call("storePassword:", arrayOfCallSite[41].callCurrent((GroovyObject)this))), arrayOfCallSite[42].call("keyAlias:", arrayOfCallSite[43].callCurrent((GroovyObject)this))), arrayOfCallSite[44].call("storeType:", arrayOfCallSite[45].callCurrent((GroovyObject)this))), arrayOfCallSite[46].call("v1SigningEnabled:", arrayOfCallSite[47].callCurrent((GroovyObject)this))), arrayOfCallSite[48].call("v2SigningEnabled:", arrayOfCallSite[49].callCurrent((GroovyObject)this))), arrayOfCallSite[50].call("signAlg:", arrayOfCallSite[51].callCurrent((GroovyObject)this))), arrayOfCallSite[52].call("profile:", ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[53].callCurrent((GroovyObject)this), null) ? arrayOfCallSite[54].callGetProperty(arrayOfCallSite[55].callCurrent((GroovyObject)this)) : "null")), arrayOfCallSite[56].call("certpath:", ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[57].callCurrent((GroovyObject)this), null) ? arrayOfCallSite[58].callGetProperty(arrayOfCallSite[59].callCurrent((GroovyObject)this)) : "null"))));
  }
}
