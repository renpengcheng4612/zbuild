package com.huawei.ohos.build.utils.sign.optionsBuilder;

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
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class SignModel implements GroovyObject {
  public String moduleType;
  
  public File inputFile;
  
  public File outputFile;
  
  public SignModel(String moduleType, File inputFile, File outputFile) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = moduleType;
    this.moduleType = ShortTypeHandling.castToString(str);
    File file1 = inputFile;
    this.inputFile = (File)ScriptBytecodeAdapter.castToType(file1, File.class);
    File file2 = outputFile;
    this.outputFile = (File)ScriptBytecodeAdapter.castToType(file2, File.class);
  }
}
