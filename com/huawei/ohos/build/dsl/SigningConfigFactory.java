package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.model.DefaultSigningConfig;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.model.ObjectFactory;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class SigningConfigFactory implements NamedDomainObjectFactory<SigningConfigOptions>, GroovyObject {
  @NonNull
  private final ObjectFactory objectFactory;
  
  private final File defaultDebugKeystore;
  
  public SigningConfigFactory(@NonNull ObjectFactory objectFactory, File defaultDebugKeystore) {
    MetaClass metaClass = $getStaticMetaClass();
    ObjectFactory objectFactory1 = objectFactory;
    this.objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(objectFactory1, ObjectFactory.class);
    File file = defaultDebugKeystore;
    this.defaultDebugKeystore = (File)ScriptBytecodeAdapter.castToType(file, File.class);
  }
  
  public SigningConfigOptions create(@NonNull String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    SigningConfigOptions signingConfigs = (SigningConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(this.objectFactory, SigningConfigOptions.class, name), SigningConfigOptions.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(arrayOfCallSite[2].callGetProperty(BuildConst.class), name)))
      arrayOfCallSite[3].call(signingConfigs, arrayOfCallSite[4].call(DefaultSigningConfig.class, name, this.defaultDebugKeystore)); 
    return signingConfigs;
  }
}
