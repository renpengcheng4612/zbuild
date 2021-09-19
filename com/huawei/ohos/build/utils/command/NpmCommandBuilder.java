package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class NpmCommandBuilder extends BaseCommandBuilder {
  private static final int WINDOWS_COMMAND_INDEX = 0;
  
  private static final int WINDOWS_COMMAND_CLOSE_INDEX = 1;
  
  public NpmCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "npm");
  }
  
  public NpmCommandBuilder(String path) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, path, "npm")));
  }
  
  public NpmCommandBuilder runScript(String script) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), "run");
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), script);
    return this;
  }
  
  public NpmCommandBuilder setWindows() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(j), arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this))); ) {
        arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this), Integer.valueOf(j), arrayOfCallSite[22].call(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this), Integer.valueOf(j)), "/", "\\\\"));
        int k;
        j = (k = j) + 1;
      } 
      arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_INDEX), "cmd");
      arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_CLOSE_INDEX), "/c");
      return this;
    } 
    for (int i = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this))); ) {
      arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this), Integer.valueOf(i), arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].callGroovyObjectGetProperty(this), Integer.valueOf(i)), "/", "\\\\"));
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[17].call(Integer.valueOf(j = i)));
      arrayOfCallSite[17].call(Integer.valueOf(j = i));
    } 
    arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_INDEX), "cmd");
    arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_CLOSE_INDEX), "/c");
    return this;
  }
  
  @Generated
  public static int getWINDOWS_COMMAND_INDEX() {
    return WINDOWS_COMMAND_INDEX;
  }
  
  @Generated
  public static int getWINDOWS_COMMAND_CLOSE_INDEX() {
    return WINDOWS_COMMAND_CLOSE_INDEX;
  }
}
