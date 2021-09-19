package com.huawei.ohos.build.utils.command;

import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class NodeCommandBuilder extends BaseCommandBuilder {
  private static final int WINDOWS_COMMAND_INDEX = 0;
  
  private static final int WINDOWS_COMMAND_CLOSE_INDEX = 1;
  
  public NodeCommandBuilder() {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), "node");
  }
  
  public NodeCommandBuilder(String path) {
    MetaClass metaClass = $getStaticMetaClass();
    arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(arrayOfCallSite[5].call(Paths.class, path, "node")));
  }
  
  public NodeCommandBuilder addWebpackPath(String path) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), path);
    return this;
  }
  
  public NodeCommandBuilder addWebpackConfig(String config) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this), "--config");
    arrayOfCallSite[10].call(arrayOfCallSite[11].callGroovyObjectGetProperty(this), config);
    return this;
  }
  
  public NodeCommandBuilder setWindows() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(j), arrayOfCallSite[20].call(arrayOfCallSite[21].callGroovyObjectGetProperty(this))); ) {
        arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this), Integer.valueOf(j), arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this), Integer.valueOf(j)), "/", "\\\\"));
        int k;
        j = (k = j) + 1;
      } 
      arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_INDEX), "cmd");
      arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_CLOSE_INDEX), "/c");
      return this;
    } 
    for (int i = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this))); ) {
      arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this), Integer.valueOf(i), arrayOfCallSite[16].call(arrayOfCallSite[17].call(arrayOfCallSite[18].callGroovyObjectGetProperty(this), Integer.valueOf(i)), "/", "\\\\"));
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[19].call(Integer.valueOf(j = i)));
      arrayOfCallSite[19].call(Integer.valueOf(j = i));
    } 
    arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_INDEX), "cmd");
    arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this), Integer.valueOf(WINDOWS_COMMAND_CLOSE_INDEX), "/c");
    return this;
  }
  
  public NodeCommandBuilder addTitle(String title) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this), arrayOfCallSite[33].call("--title=", title));
    return this;
  }
  
  public NodeCommandBuilder addDeviceType(List deviceTypeList) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this), "--deviceType");
    arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this), arrayOfCallSite[38].call(String.class, ",", deviceTypeList));
    return this;
  }
  
  public NodeCommandBuilder addBuildMode(String buildMode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[39].call(arrayOfCallSite[40].callGroovyObjectGetProperty(this), "--buildMode");
    arrayOfCallSite[41].call(arrayOfCallSite[42].callGroovyObjectGetProperty(this), buildMode);
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
