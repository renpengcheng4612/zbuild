package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class RestoolCommandBuilder extends BaseCommandBuilder {
  public RestoolCommandBuilder(String executor) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), executor);
  }
  
  public RestoolCommandBuilder addInputDir(String inputDir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), "-i");
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), inputDir);
    return this;
  }
  
  public RestoolCommandBuilder addJsonFile(String jsonFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), "-j");
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), jsonFile);
    return this;
  }
  
  public RestoolCommandBuilder addModulePackName(String packName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), "-p");
    arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), packName);
    return this;
  }
  
  public RestoolCommandBuilder addOutputDir(String outputDir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), "-o");
    arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), outputDir);
    return this;
  }
  
  public RestoolCommandBuilder addResTable(String resTable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), "-r");
    arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), resTable);
    return this;
  }
  
  public RestoolCommandBuilder forceDelete() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), "-f");
    return this;
  }
  
  public RestoolCommandBuilder incremental() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this), "-c");
    return this;
  }
  
  public RestoolCommandBuilder compressImage() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[26].call(arrayOfCallSite[27].callGroovyObjectGetProperty(this), "-z");
    return this;
  }
  
  public RestoolCommandBuilder addOutputBak(String outputBak) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this), "-n");
    arrayOfCallSite[30].call(arrayOfCallSite[31].callGroovyObjectGetProperty(this), outputBak);
    return this;
  }
  
  public RestoolCommandBuilder addModules(String modules) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this), "-m");
    arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), modules);
    return this;
  }
  
  public RestoolCommandBuilder addPseudoType(String pseudoType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this), "-k");
    arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this), arrayOfCallSite[40].call("pseudoType=", pseudoType));
    return this;
  }
  
  public RestoolCommandBuilder addPseudoAccent(boolean pseudoAccent) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this), "-k");
    arrayOfCallSite[43].call(arrayOfCallSite[44].callGroovyObjectGetProperty(this), arrayOfCallSite[45].call("pseudoAccent=", Boolean.valueOf(pseudoAccent)));
    return this;
  }
  
  public RestoolCommandBuilder addPseudoBorder(boolean pseudoBorder) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[46].call(arrayOfCallSite[47].callGroovyObjectGetProperty(this), "-k");
    arrayOfCallSite[48].call(arrayOfCallSite[49].callGroovyObjectGetProperty(this), arrayOfCallSite[50].call("pseudoBorder=", Boolean.valueOf(pseudoBorder)));
    return this;
  }
  
  public RestoolCommandBuilder addPseudoRatio(String pseudoRatio) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[51].call(arrayOfCallSite[52].callGroovyObjectGetProperty(this), "-k");
    arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this), arrayOfCallSite[55].call("pseudoRatio=", pseudoRatio));
    return this;
  }
  
  public RestoolCommandBuilder addPseudoChars(String pseudoChars) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[56].call(arrayOfCallSite[57].callGroovyObjectGetProperty(this), "-k");
    arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this), arrayOfCallSite[60].call("pseudoChars=", pseudoChars));
    return this;
  }
}
