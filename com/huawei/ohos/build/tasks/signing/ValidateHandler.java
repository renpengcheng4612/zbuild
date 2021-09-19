package com.huawei.ohos.build.tasks.signing;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.json.JsonBuilder;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class ValidateHandler implements IValidateHandler, GroovyObject {
  private static final HMLogger hmLogger;
  
  private final Project project;
  
  private BuildType buildType;
  
  private PathInfo pathInfo;
  
  private ConfigInfo configInfo;
  
  private SigningConfig hapSigningConfig;
  
  static {
    Object object = $getCallSiteArray()[64].call(HMLogger.class, ValidateHandler.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public ValidateHandler(Project project, BuildType buildType) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    BuildType buildType1 = buildType;
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(buildType1, BuildType.class);
    Object object1 = arrayOfCallSite[0].call(buildType);
    this.hapSigningConfig = (SigningConfig)ScriptBytecodeAdapter.castToType(object1, SigningConfig.class);
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(GlobalDataManager.class, project), project);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[3].call(arrayOfCallSite[4].call(GlobalDataManager.class, project), project);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object3, ConfigInfo.class);
  }
  
  public void validateHapSigning() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(KeyStoreHelper.class, this.project, this.hapSigningConfig))) {
      String err = ShortTypeHandling.castToString(arrayOfCallSite[6].call(arrayOfCallSite[7].call("Check if '%s' is configured correctly, it can't be null or empty.", arrayOfCallSite[8].call(System.class)), new GStringImpl(new Object[] { arrayOfCallSite[9].callGetProperty(this.buildType), arrayOfCallSite[10].callGetProperty(this.project) }, new String[] { "Please configure '", "' signingConfigs in File -> Project Structure -> Modules -> ", " -> Signing Configs." })));
      arrayOfCallSite[11].call(this.hapSigningConfig, this.project, err);
    } 
  }
  
  public void validateAppSigning() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(KeyStoreHelper.class, this.project, this.hapSigningConfig))) {
      String str = ShortTypeHandling.castToString(arrayOfCallSite[13].call(arrayOfCallSite[14].call("Signing configs can't be empty when build APP.", arrayOfCallSite[15].call(System.class)), "Please configure 'release' signingConfigs in File -> Project Structure -> Project -> Signing Configs."));
      throw (Throwable)arrayOfCallSite[16].callConstructor(GradleException.class, str);
    } 
    String err = ShortTypeHandling.castToString(arrayOfCallSite[17].call(arrayOfCallSite[18].call("Check if '%s' is configured correctly, it can't be null or empty.", arrayOfCallSite[19].call(System.class)), "Please configure 'release' signingConfigs in File -> Project Structure -> Project -> Signing Configs."));
    arrayOfCallSite[20].call(this.hapSigningConfig, this.project, err);
  }
  
  public void validateSigning() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[21].call(hmLogger, "sign", "mode: local");
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.configInfo, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[26].callGroovyObjectGetProperty(this.configInfo), arrayOfCallSite[27].callGetProperty(BuildConst.class)))) {
        validateAppSigning();
        null;
      } else {
        validateHapSigning();
        null;
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(this.configInfo, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[22].callGroovyObjectGetProperty(this.configInfo), arrayOfCallSite[23].callGetProperty(BuildConst.class)))) {
      arrayOfCallSite[24].callCurrent(this);
    } else {
      arrayOfCallSite[25].callCurrent(this);
    } 
  }
  
  public void reports() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map signingConfigs = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].callConstructor(HashMap.class), Map.class);
    Object storeFile = arrayOfCallSite[29].call(this.hapSigningConfig);
    Object signAlg = arrayOfCallSite[30].call(this.hapSigningConfig);
    Object profile = arrayOfCallSite[31].call(this.hapSigningConfig);
    Object certpath = arrayOfCallSite[32].call(this.hapSigningConfig);
    Object storePassword = arrayOfCallSite[33].call(this.hapSigningConfig);
    Object keyAlias = arrayOfCallSite[34].call(arrayOfCallSite[35].call(this.hapSigningConfig));
    Object keyPassword = arrayOfCallSite[36].call(this.hapSigningConfig);
    arrayOfCallSite[37].call(signingConfigs, "buildType", arrayOfCallSite[38].callGetProperty(this.buildType));
    arrayOfCallSite[39].call(signingConfigs, "mode", "local");
    arrayOfCallSite[40].call(signingConfigs, "signAlg", signAlg);
    arrayOfCallSite[41].call(signingConfigs, "profile", ScriptBytecodeAdapter.compareEqual(profile, null) ? null : arrayOfCallSite[42].callGetProperty(profile));
    arrayOfCallSite[43].call(signingConfigs, "certpath", ScriptBytecodeAdapter.compareEqual(certpath, null) ? null : arrayOfCallSite[44].callGetProperty(certpath));
    arrayOfCallSite[45].call(signingConfigs, "storeFile", arrayOfCallSite[46].callGetProperty(storeFile));
    arrayOfCallSite[47].call(signingConfigs, "storePassword", storePassword);
    arrayOfCallSite[48].call(signingConfigs, "keyAlias", keyAlias);
    arrayOfCallSite[49].call(signingConfigs, "keyPassword", keyPassword);
    String signingInfoFilePath = ShortTypeHandling.castToString(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(this.pathInfo), arrayOfCallSite[53].callGetProperty(File.class)), arrayOfCallSite[54].callGetProperty(this.buildType)));
    File signingDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].callConstructor(File.class, signingInfoFilePath), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[56].call(signingDir)))
      arrayOfCallSite[57].call(signingDir); 
    File signingInfoFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].call(this.project, arrayOfCallSite[59].call(arrayOfCallSite[60].call(signingInfoFilePath, arrayOfCallSite[61].callGetProperty(File.class)), "signing-config.json")), File.class);
    Reference signingInfo = new Reference(arrayOfCallSite[62].callConstructor(JsonBuilder.class, signingConfigs));
    arrayOfCallSite[63].call(signingInfoFile, "utf-8", new _reports_closure1(this, this, signingInfo));
  }
  
  public final class _reports_closure1 extends Closure implements GeneratedClosure {
    public _reports_closure1(Object _outerInstance, Object _thisObject, Reference signingInfo) {
      super(_outerInstance, _thisObject);
      Reference reference = signingInfo;
      this.signingInfo = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(this.signingInfo.get()));
    }
    
    @Generated
    public Object getSigningInfo() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.signingInfo.get();
    }
  }
}
