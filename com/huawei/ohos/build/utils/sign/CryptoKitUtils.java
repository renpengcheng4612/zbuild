package com.huawei.ohos.build.utils.sign;

import com.huawei.deveco.common.security.encrypt.CryptoKit;
import com.huawei.deveco.common.security.encrypt.CryptoKitFactory;
import com.huawei.deveco.common.security.encrypt.KeyManager;
import com.huawei.deveco.common.security.exception.CryptoException;
import com.huawei.ohos.build.utils.FileUtils;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;

public class CryptoKitUtils implements GroovyObject {
  private static final CryptoKit gcmKit;
  
  static {
    Object object = $getCallSiteArray()[10].call(CryptoKitFactory.class, "AES-GCM-128");
    gcmKit = (CryptoKit)ScriptBytecodeAdapter.castToType(object, CryptoKit.class);
  }
  
  public static String decryptHex2Str(String path, String hex) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(FileUtils.class, path)))
      throw (Throwable)arrayOfCallSite[1].callConstructor(GradleException.class, "An error happened while decrypt the signing information. Verify that the material path exists."); 
    String actual = null;
    byte[] key = null;
    try {
      Object object1 = arrayOfCallSite[2].call(arrayOfCallSite[3].callConstructor(KeyManager.class), path);
      key = (byte[])ScriptBytecodeAdapter.castToType(object1, byte[].class);
      Object object2 = arrayOfCallSite[4].call(gcmKit, key, hex);
      actual = ShortTypeHandling.castToString(object2);
    } catch (CryptoException e) {
      throw (Throwable)arrayOfCallSite[5].callConstructor(GradleException.class, arrayOfCallSite[6].call("An error happened while decrypt the signing information. Verify that the material path exists and the password is correct.", arrayOfCallSite[7].call(e)));
    } finally {
      if (ScriptBytecodeAdapter.compareNotEqual(key, null))
        arrayOfCallSite[9].call(Arrays.class, key, ScriptBytecodeAdapter.createPojoWrapper(Byte.valueOf((byte)0), byte.class)); 
    } 
    return actual;
  }
  
  @Generated
  public CryptoKitUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
