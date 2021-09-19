package com.huawei.ohos.build.utils.sign.optionsBuilder;

import com.huawei.deveco.common.security.util.ByteUtil;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.DefaultSigningConfig;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.sign.CryptoKitUtils;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public abstract class CommonOptionsBuilder implements OptionsBuilder, GroovyObject {
  @Nonnull
  protected Project project;
  
  @Nonnull
  protected JavaCommandBuilder builder;
  
  @Nonnull
  protected SigningConfig signingConfig;
  
  @Nonnull
  protected SdkInfo sdkInfo;
  
  @Nonnull
  protected SignModel signModel;
  
  @Nonnull
  private String materialKeyPath;
  
  protected String decryptStorePassword;
  
  protected String decryptKeyPassword;
  
  public CommonOptionsBuilder(Project project, JavaCommandBuilder builder, SdkInfo sdkInfo, SigningConfig signingConfig, SignModel signModel) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    JavaCommandBuilder javaCommandBuilder = builder;
    this.builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(javaCommandBuilder, JavaCommandBuilder.class);
    SdkInfo sdkInfo1 = sdkInfo;
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(sdkInfo1, SdkInfo.class);
    SigningConfig signingConfig1 = signingConfig;
    this.signingConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(signingConfig1, SigningConfig.class);
    SignModel signModel1 = signModel;
    this.signModel = (SignModel)ScriptBytecodeAdapter.castToType(signModel1, SignModel.class);
    Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(signingConfig));
    this.materialKeyPath = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[2].callCurrent(this, arrayOfCallSite[3].callGetProperty(signingConfig));
    this.decryptStorePassword = ShortTypeHandling.castToString(object2);
    Object object3 = arrayOfCallSite[4].callCurrent(this, arrayOfCallSite[5].callGetProperty(signingConfig));
    this.decryptKeyPassword = ShortTypeHandling.castToString(object3);
  }
  
  public File getWorkDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File workDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].callConstructor(File.class, arrayOfCallSite[7].call(this.sdkInfo)), File.class);
    return workDir;
  }
  
  public List<String> getSignCommand() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].callCurrent(this);
    Object signTool = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str = getSignTool();
      arrayOfCallSite[10].call(this.builder, signTool);
      return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(this.builder), List.class);
    } 
    Object object1 = arrayOfCallSite[9].callCurrent(this);
    arrayOfCallSite[10].call(this.builder, signTool);
    return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(this.builder), List.class);
  }
  
  private String getSignTool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File signFile = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[19].callConstructor(File.class, arrayOfCallSite[20].call(arrayOfCallSite[21].call(arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGroovyObjectGetProperty(this)), arrayOfCallSite[24].callGetProperty(File.class)), getSignToolName()));
      signFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } else {
      Object object = arrayOfCallSite[12].callConstructor(File.class, arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(arrayOfCallSite[16].callGroovyObjectGetProperty(this)), arrayOfCallSite[17].callGetProperty(File.class)), arrayOfCallSite[18].callCurrent(this)));
      signFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(signFile)))
      throw (Throwable)arrayOfCallSite[26].callConstructor(GradleException.class, new GStringImpl(new Object[] { arrayOfCallSite[27].callGetProperty(signFile) }, new String[] { "Missing sign Tools '", "'! Please configure sign tool in build.gradle file or update ohos sdk!" })); 
    return ShortTypeHandling.castToString(arrayOfCallSite[28].callGetProperty(signFile));
  }
  
  public abstract String getSignToolName();
  
  private String getDecryptPassword(String pwd) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(ByteUtil.class, pwd))) && ScriptBytecodeAdapter.compareEqual(pwd, arrayOfCallSite[33].callGetProperty(DefaultSigningConfig.class))))
        return pwd; 
      return ShortTypeHandling.castToString(arrayOfCallSite[34].call(CryptoKitUtils.class, this.materialKeyPath, pwd));
    } 
    if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(ByteUtil.class, pwd))) && ScriptBytecodeAdapter.compareEqual(pwd, arrayOfCallSite[30].callGetProperty(DefaultSigningConfig.class))))
      return pwd; 
    return ShortTypeHandling.castToString(arrayOfCallSite[31].call(CryptoKitUtils.class, this.materialKeyPath, pwd));
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
}
