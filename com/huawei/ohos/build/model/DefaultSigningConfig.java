package com.huawei.ohos.build.model;

import com.huawei.ohos.build.enumlation.SignAlgType;
import com.huawei.ohos.build.utils.StringHandler;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.security.KeyStore;
import java.util.Locale;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class DefaultSigningConfig implements SigningConfig, GroovyObject {
  private static final HMLogger HMLOGGER;
  
  public static final String DEFAULT_DEBUG_KEY = "DebugKey";
  
  public static final String DEFAULT_ALIAS = "debugKey";
  
  private static final String DEFAULT_SIGN_ALG = "SHA256withECDSA";
  
  @NonNull
  protected final String name;
  
  private String signAlg;
  
  private File profile;
  
  private File certpath;
  
  private File mStoreFile;
  
  private String mStorePassword;
  
  private String mKeyAlias;
  
  private String mKeyPassword;
  
  private String mStoreType;
  
  private boolean mV1SigningEnabled;
  
  private boolean mV2SigningEnabled;
  
  static {
    Object object = $getCallSiteArray()[64].call(HMLogger.class, DefaultSigningConfig.class);
    HMLOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public DefaultSigningConfig(@Nonnull String name) {
    String str1 = DEFAULT_SIGN_ALG;
    Object object1 = null;
    this.profile = (File)ScriptBytecodeAdapter.castToType(object1, File.class);
    Object object2 = null;
    this.certpath = (File)ScriptBytecodeAdapter.castToType(object2, File.class);
    Object object3 = null;
    this.mStoreFile = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = null;
    this.mStorePassword = ShortTypeHandling.castToString(object4);
    Object object5 = null;
    this.mKeyAlias = ShortTypeHandling.castToString(object5);
    Object object6 = null;
    this.mKeyPassword = ShortTypeHandling.castToString(object6);
    Object object = arrayOfCallSite[0].call(KeyStore.class);
    this.mStoreType = ShortTypeHandling.castToString(object);
    boolean bool1 = true, bool2 = true;
    MetaClass metaClass = $getStaticMetaClass();
    String str2 = name;
    this.name = ShortTypeHandling.castToString(str2);
  }
  
  @NonNull
  public static DefaultSigningConfig defaultSigningConfig(String name, File storeFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DefaultSigningConfig result = (DefaultSigningConfig)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callConstructor(DefaultSigningConfig.class, name), DefaultSigningConfig.class);
    File file = storeFile;
    ScriptBytecodeAdapter.setGroovyObjectProperty(file, DefaultSigningConfig.class, result, "mStoreFile");
    String str1 = DEFAULT_DEBUG_KEY;
    ScriptBytecodeAdapter.setGroovyObjectProperty(str1, DefaultSigningConfig.class, result, "mKeyPassword");
    String str2 = DEFAULT_ALIAS;
    ScriptBytecodeAdapter.setGroovyObjectProperty(str2, DefaultSigningConfig.class, result, "mKeyAlias");
    String str3 = DEFAULT_DEBUG_KEY;
    ScriptBytecodeAdapter.setGroovyObjectProperty(str3, DefaultSigningConfig.class, result, "mStorePassword");
    return result;
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public File getStoreFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mStoreFile;
  }
  
  public void setStoreFile(File storeFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = storeFile;
  }
  
  public String getStorePassword() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mStorePassword;
  }
  
  public void setStorePassword(String storePassword) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = storePassword;
  }
  
  public String getKeyAlias() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mKeyAlias;
  }
  
  public void setKeyAlias(String keyAlias) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = keyAlias;
  }
  
  public String getKeyPassword() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mKeyPassword;
  }
  
  public void setKeyPassword(String keyPassword) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = keyPassword;
  }
  
  public String getStoreType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mStoreType;
  }
  
  public void setStoreType(String storeType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = storeType;
  }
  
  public boolean isV1SigningEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mV1SigningEnabled;
  }
  
  public void setV1SigningEnabled(boolean enabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = enabled;
  }
  
  public boolean isV2SigningEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mV2SigningEnabled;
  }
  
  public void setV2SigningEnabled(boolean enabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = enabled;
  }
  
  public String getSignAlg() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signAlg;
  }
  
  public void setSignAlg(String signAlg) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = signAlg;
    this.signAlg = ShortTypeHandling.castToString(str);
  }
  
  public File getProfile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.profile;
  }
  
  public void setProfile(File profile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = profile;
    this.profile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
  }
  
  public File getCertpath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.certpath;
  }
  
  public void setCertpath(File certpath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = certpath;
    this.certpath = (File)ScriptBytecodeAdapter.castToType(file, File.class);
  }
  
  public boolean isHapSignReady(Project project, String err) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].call(KeyStoreHelper.class, project)) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this))))))
        arrayOfCallSite[14].call(HMLOGGER, arrayOfCallSite[15].callConstructor(GradleException.class, arrayOfCallSite[16].call(String.class, arrayOfCallSite[17].callGetProperty(Locale.class), err, "storeFile"))); 
    } else if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(KeyStoreHelper.class, project)) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this)))))) {
      arrayOfCallSite[6].call(HMLOGGER, arrayOfCallSite[7].callConstructor(GradleException.class, arrayOfCallSite[8].call(String.class, arrayOfCallSite[9].callGetProperty(Locale.class), err, "storeFile")));
    } 
    if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[18].callGroovyObjectGetProperty(this), DEFAULT_DEBUG_KEY) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(StringHandler.class, arrayOfCallSite[20].callGroovyObjectGetProperty(this)))))
      arrayOfCallSite[21].call(HMLOGGER, arrayOfCallSite[22].callConstructor(GradleException.class, arrayOfCallSite[23].call(String.class, arrayOfCallSite[24].callGetProperty(Locale.class), err, "storePassword"))); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(StringHandler.class, arrayOfCallSite[26].callGroovyObjectGetProperty(this))))
      arrayOfCallSite[27].call(HMLOGGER, arrayOfCallSite[28].callConstructor(GradleException.class, arrayOfCallSite[29].call(String.class, arrayOfCallSite[30].callGetProperty(Locale.class), err, "keyAlias"))); 
    if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[31].callGroovyObjectGetProperty(this), DEFAULT_DEBUG_KEY) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(StringHandler.class, arrayOfCallSite[33].callGroovyObjectGetProperty(this)))))
      arrayOfCallSite[34].call(HMLOGGER, arrayOfCallSite[35].callConstructor(GradleException.class, arrayOfCallSite[36].call(String.class, arrayOfCallSite[37].callGetProperty(Locale.class), err, "keyPassword"))); 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.profile, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[43].call(this.profile)))))
        arrayOfCallSite[44].call(HMLOGGER, arrayOfCallSite[45].callConstructor(GradleException.class, arrayOfCallSite[46].call(String.class, arrayOfCallSite[47].callGetProperty(Locale.class), err, "profile"))); 
    } else if ((ScriptBytecodeAdapter.compareEqual(this.profile, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[38].call(this.profile))))) {
      arrayOfCallSite[39].call(HMLOGGER, arrayOfCallSite[40].callConstructor(GradleException.class, arrayOfCallSite[41].call(String.class, arrayOfCallSite[42].callGetProperty(Locale.class), err, "profile")));
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.certpath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[53].call(this.certpath)))))
        arrayOfCallSite[54].call(HMLOGGER, arrayOfCallSite[55].callConstructor(GradleException.class, arrayOfCallSite[56].call(String.class, arrayOfCallSite[57].callGetProperty(Locale.class), err, "certpath"))); 
    } else if ((ScriptBytecodeAdapter.compareEqual(this.certpath, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(this.certpath))))) {
      arrayOfCallSite[49].call(HMLOGGER, arrayOfCallSite[50].callConstructor(GradleException.class, arrayOfCallSite[51].call(String.class, arrayOfCallSite[52].callGetProperty(Locale.class), err, "certpath")));
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(SignAlgType.class, this.signAlg)))
      arrayOfCallSite[59].call(HMLOGGER, arrayOfCallSite[60].callConstructor(GradleException.class, arrayOfCallSite[61].call(String.class, arrayOfCallSite[62].callGetProperty(Locale.class), err, "signAlg"))); 
    return true;
  }
  
  public boolean isAppSignReady(Project project, String err) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[63].callCurrent(this, project, err));
  }
}
