package com.huawei.ohos.build.tasks.pack.optionsbuilder.rich;

import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class FeatureOptionsBuilder extends RichCommonOptionsBuilder {
  @Nonnull
  private static final Object HM_LOGGER;
  
  static {
    Object object = $getCallSiteArray()[31].call(HMLogger.class, EntryOptionsBuilder.class);
  }
  
  public FeatureOptionsBuilder(PackModel packModel) {
    super(packModel);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public void initPackCommand() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].callCurrent((GroovyObject)this);
  }
  
  public void executePack() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      initPackCommand();
      null;
    } else {
      arrayOfCallSite[1].callCurrent((GroovyObject)this);
    } 
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(ProcessUtils.class, arrayOfCallSite[3].callGroovyObjectGetProperty(this), "Package failed"), ProcessUtils.class);
    arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this))));
    List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].call(ModuleExtensionData.class, arrayOfCallSite[10].callGroovyObjectGetProperty(this)), List.class);
    String entryModule;
    Iterator iterator;
    for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(entryModules), Iterator.class); iterator.hasNext(); ) {
      entryModule = ShortTypeHandling.castToString(iterator.next());
      Object myApkPath = arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this)), entryModule);
      JavaCommandBuilder moduleBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callConstructor(JavaCommandBuilder.class, arrayOfCallSite[16].callGroovyObjectGetProperty(this)), JavaCommandBuilder.class);
      JavaCommandBuilder.PackingToolOptions moduleOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].callConstructor(JavaCommandBuilder.PackingToolOptions.class, moduleBuilder), JavaCommandBuilder.PackingToolOptions.class);
      File outPutFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(arrayOfCallSite[20].callGroovyObjectGetProperty(this)), entryModule), File.class);
      arrayOfCallSite[21].call(moduleOptions, arrayOfCallSite[22].callGetProperty(outPutFile));
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(this))))
        arrayOfCallSite[25].call(moduleOptions, myApkPath); 
      arrayOfCallSite[26].call(HM_LOGGER, "package", arrayOfCallSite[27].call(arrayOfCallSite[28].call(moduleBuilder), " "));
      arrayOfCallSite[29].call(processUtils, arrayOfCallSite[30].call(moduleBuilder), HM_LOGGER);
    } 
  }
}
