package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.internal.os.OperatingSystem;

public class JavaCompileCommandBuilder extends BaseCommandBuilder {
  private static final int DEBUG_INFO_OPTION_INDEX = 1;
  
  public JavaCompileCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    Object javaTool = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].call(OperatingSystem.class))) ? "javac.exe" : "javac";
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this), arrayOfCallSite[9].call(arrayOfCallSite[10].call(Paths.class, findJdkBin(), javaTool)));
      return;
    } 
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, arrayOfCallSite[6].callCurrent(this), javaTool)));
  }
  
  public JavaCompileCommandBuilder addEncoding(String encoding) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), "-encoding");
    arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this), encoding);
    return this;
  }
  
  public JavaCompileCommandBuilder addTarget(String target) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this), "-target");
    arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), target);
    return this;
  }
  
  public JavaCompileCommandBuilder addBootClasspath(String bootClasspath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this), "-bootclasspath");
    arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this), bootClasspath);
    return this;
  }
  
  public JavaCompileCommandBuilder addClasspath(String classpath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), "-classpath");
    arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this), classpath);
    return this;
  }
  
  public JavaCompileCommandBuilder addDest(String dest) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), "-d");
    arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), dest);
    return this;
  }
  
  public JavaCompileCommandBuilder addProcessor(String processor) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this), "-processor");
    arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(this), processor);
    return this;
  }
  
  public JavaCompileCommandBuilder addProcessorPath(String processorPath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this), "-processorpath");
    arrayOfCallSite[37].call(arrayOfCallSite[38].callGroovyObjectGetProperty(this), processorPath);
    return this;
  }
  
  public JavaCompileCommandBuilder addIndexFile(String indexFile) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[39].call(arrayOfCallSite[40].callGroovyObjectGetProperty(this), arrayOfCallSite[41].call("@", indexFile));
    return this;
  }
  
  public JavaCompileCommandBuilder showDebugInfo() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[42].call(arrayOfCallSite[43].callGroovyObjectGetProperty(this), Integer.valueOf(DEBUG_INFO_OPTION_INDEX), "-g");
    return this;
  }
  
  public String findJdkBin() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object javaHome = arrayOfCallSite[44].call(arrayOfCallSite[45].callGetProperty(arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].call(System.class, "java.home"))));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(arrayOfCallSite[49].callConstructor(File.class, arrayOfCallSite[50].call(arrayOfCallSite[51].call(Paths.class, javaHome, "bin"))))))
      return ShortTypeHandling.castToString(arrayOfCallSite[52].call(arrayOfCallSite[53].call(Paths.class, javaHome, "bin"))); 
    return "";
  }
  
  @Generated
  public static int getDEBUG_INFO_OPTION_INDEX() {
    return DEBUG_INFO_OPTION_INDEX;
  }
}
