package com.huawei.ohos.build.dsl.legacy;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public class LegacySignConfig implements GroovyObject {
  private File storeFile;
  
  @Inject
  public LegacySignConfig(Project project) {
    Object object = null;
    this.storeFile = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public File getStoreFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.storeFile;
  }
  
  public void setStoreFile(File storeFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File file = storeFile;
    this.storeFile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
  }
}
