package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class IdlCommandBuilder extends BaseCommandBuilder {
  public IdlCommandBuilder(String executor) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), executor);
  }
  
  public IdlCommandBuilder generateJava() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), "-gen-java");
    return this;
  }
  
  public IdlCommandBuilder addOutputDir(String output) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "-d");
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), output);
    return this;
  }
  
  public IdlCommandBuilder compileIdlFile(String file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "-c");
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), file);
    return this;
  }
}
