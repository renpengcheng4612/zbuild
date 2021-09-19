package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class JarCommandBuilder extends BaseCommandBuilder {
  public JarCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "jar");
  }
  
  public JarCommandBuilder addOptions(String options) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), options);
    return this;
  }
  
  public JarCommandBuilder addJarFile(String jarFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), jarFile);
    return this;
  }
  
  public JarCommandBuilder addFiles(String files) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), files);
    return this;
  }
  
  public JarCommandBuilder addSpecDir(String dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "-C");
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), dir);
    return this;
  }
}
