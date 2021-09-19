package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class Aapt2CommandBuilder extends BaseCommandBuilder {
  public Aapt2CommandBuilder(String executor) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), executor);
  }
  
  public Aapt2CommandBuilder compile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), "compile");
    return this;
  }
  
  public Aapt2CommandBuilder link() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), "link");
    return this;
  }
  
  public Aapt2CommandBuilder showDetail() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), "-v");
    return this;
  }
  
  public Aapt2CommandBuilder addDirectory(String dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "--dir");
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), dir);
    return this;
  }
  
  public Aapt2CommandBuilder addOutputPath(String outputPath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), "-o");
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), outputPath);
    return this;
  }
  
  public Aapt2CommandBuilder addApkPath(String apkPath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), "-I");
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), apkPath);
    return this;
  }
  
  public Aapt2CommandBuilder addRFilePath(String rFilePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), "--java");
    arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), rFilePath);
    return this;
  }
  
  public Aapt2CommandBuilder addManifestPath(String manifest) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), "--manifest");
    arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), manifest);
    return this;
  }
  
  public Aapt2CommandBuilder addPackageId(String packageId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), "--package-id");
    arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this), packageId);
    return this;
  }
  
  public Aapt2CommandBuilder addIntermediates(String intermediates) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), intermediates);
    return this;
  }
}
