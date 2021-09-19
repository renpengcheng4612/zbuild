package com.huawei.ohos.build.utils.sign;

import com.huawei.ohos.build.exception.KeytoolException;
import com.huawei.ohos.build.model.DefaultSigningConfig;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import sun.security.tools.keytool.CertAndKeyGen;
import sun.security.x509.X500Name;

public class KeyStoreHelper implements GroovyObject {
  private static final HMLogger HMLOGGER;
  
  private static final String CERTIFICATE_DESC = "CN=debugkey";
  
  private static final String PK_12 = "PKCS12";
  
  private static final String DEFAULT_IDE_CONFIG_PATH = ".ohos";
  
  private static final String CONFIG = "config";
  
  private static final String DEFAULT_DEBUG_SIGN_FILE = "debug.p12";
  
  private static final int keyBitsLength = 3072;
  
  static {
    Object object = $getCallSiteArray()[73].call(HMLogger.class, KeyStoreHelper.class);
    HMLOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static File getDefaultDebugKeyStoreLocation(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String userHome = ShortTypeHandling.castToString(arrayOfCallSite[0].call(System.class, "user.home"));
    File configFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, userHome, DEFAULT_IDE_CONFIG_PATH, CONFIG)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(configFile)))
      arrayOfCallSite[4].call(configFile); 
    String filePath = ShortTypeHandling.castToString(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(configFile), arrayOfCallSite[8].callGetProperty(File.class)), DEFAULT_DEBUG_SIGN_FILE));
    File debugKeyStoreFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].call(project, filePath), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(debugKeyStoreFile)))
      arrayOfCallSite[11].call(HMLOGGER, arrayOfCallSite[12].call("Failed to get default debug keystore location:", arrayOfCallSite[13].callGetProperty(debugKeyStoreFile))); 
    return debugKeyStoreFile;
  }
  
  public static boolean isUseDefaultSignConfig(Project project, SigningConfig signingConfig) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DefaultSigningConfig defaultSigningConfig = (DefaultSigningConfig)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(DefaultSigningConfig.class, "debug", arrayOfCallSite[15].callStatic(KeyStoreHelper.class, project)), DefaultSigningConfig.class);
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (((((((((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[28].callGetProperty(arrayOfCallSite[29].call(defaultSigningConfig)), arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].call(signingConfig))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[32].call(defaultSigningConfig), arrayOfCallSite[33].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[34].call(defaultSigningConfig), arrayOfCallSite[35].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[36].call(defaultSigningConfig), arrayOfCallSite[37].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[38].call(signingConfig), null))) && 
        ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[39].call(signingConfig), null)); 
    return (((((((((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].call(defaultSigningConfig)), arrayOfCallSite[18].callGetProperty(arrayOfCallSite[19].call(signingConfig))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[20].call(defaultSigningConfig), arrayOfCallSite[21].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[22].call(defaultSigningConfig), arrayOfCallSite[23].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[24].call(defaultSigningConfig), arrayOfCallSite[25].call(signingConfig)))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[26].call(signingConfig), null))) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[27].call(signingConfig), null));
  }
  
  public static Object createDefaultDebugStore(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SigningConfig signingConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(arrayOfCallSite[40].call(DefaultSigningConfig.class, "debug", arrayOfCallSite[41].callStatic(KeyStoreHelper.class, project)), SigningConfig.class);
    try {
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[42].callStatic(KeyStoreHelper.class, arrayOfCallSite[43].callGetProperty(signingConfig), arrayOfCallSite[44].callGetProperty(signingConfig), arrayOfCallSite[45].callGetProperty(signingConfig), arrayOfCallSite[46].callGetProperty(signingConfig))))
        return arrayOfCallSite[47].call(HMLOGGER, arrayOfCallSite[48].callConstructor(KeytoolException.class, "Unable to create missing debug keystore.")); 
      return null;
    } catch (KeytoolException e) {
      return arrayOfCallSite[49].call(HMLOGGER, arrayOfCallSite[50].callConstructor(KeytoolException.class, "create default debugStore failed"));
    } finally {}
  }
  
  public static boolean createDebugStore(@Nonnull File storeFile, @Nonnull String storePassword, @Nonnull String keyPassword, @Nonnull String keyAlias) throws KeytoolException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[51].callStatic(KeyStoreHelper.class, ArrayUtil.createArray(storeFile, storePassword, keyPassword, keyAlias, CERTIFICATE_DESC)));
  }
  
  public static boolean createNewStore(@Nonnull File storeFile, @Nonnull String storePassword, @Nonnull String keyPassword, @Nonnull String keyAlias, @Nonnull String dn) throws KeytoolException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileOutputStream fos = null;
    try {
      KeyStore keyStore = (KeyStore)ScriptBytecodeAdapter.castToType(arrayOfCallSite[52].call(KeyStore.class, PK_12), KeyStore.class);
      arrayOfCallSite[53].call(keyStore, null, null);
      CertAndKeyGen gen = (CertAndKeyGen)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].callConstructor(CertAndKeyGen.class, "RSA", "SHA256withRSA"), CertAndKeyGen.class);
      arrayOfCallSite[55].call(gen, Integer.valueOf(keyBitsLength));
      Key key = (Key)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(gen), Key.class);
      X509Certificate cert = null;
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigL() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        Object object1 = arrayOfCallSite[61].call(gen, arrayOfCallSite[62].callConstructor(X500Name.class, dn), Long.valueOf(365L * 24L * 3600L));
        cert = (X509Certificate)ScriptBytecodeAdapter.castToType(object1, X509Certificate.class);
      } else {
        Object object1 = arrayOfCallSite[57].call(gen, arrayOfCallSite[58].callConstructor(X500Name.class, dn), arrayOfCallSite[59].call(arrayOfCallSite[60].call(Long.valueOf(365L), Integer.valueOf(24)), Integer.valueOf(3600)));
        cert = (X509Certificate)ScriptBytecodeAdapter.castToType(object1, X509Certificate.class);
      } 
      X509Certificate[] chain = new X509Certificate[1];
      if (BytecodeInterface8.isOrigInt() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        X509Certificate x509Certificate = cert;
        BytecodeInterface8.objectArraySet((Object[])chain, 0, x509Certificate);
      } else {
        X509Certificate x509Certificate = cert;
        arrayOfCallSite[63].call(chain, Integer.valueOf(0), x509Certificate);
      } 
      arrayOfCallSite[64].call(keyStore, keyAlias, key, arrayOfCallSite[65].call(keyPassword), chain);
      Object object = arrayOfCallSite[66].callConstructor(FileOutputStream.class, storeFile);
      fos = (FileOutputStream)ScriptBytecodeAdapter.castToType(object, FileOutputStream.class);
      arrayOfCallSite[67].call(keyStore, fos, arrayOfCallSite[68].call(storePassword));
    } catch (Exception e) {
    
    } finally {
      if (ScriptBytecodeAdapter.compareNotEqual(fos, null))
        arrayOfCallSite[72].call(fos); 
    } 
    return true;
  }
  
  @Generated
  public KeyStoreHelper() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
