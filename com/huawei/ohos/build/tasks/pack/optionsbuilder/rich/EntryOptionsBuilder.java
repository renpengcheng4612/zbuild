package com.huawei.ohos.build.tasks.pack.optionsbuilder.rich;

import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class EntryOptionsBuilder extends RichCommonOptionsBuilder {
  @Nonnull
  private static final Object HM_LOGGER;
  
  static {
    Object object = $getCallSiteArray()[30].call(HMLogger.class, EntryOptionsBuilder.class);
  }
  
  public EntryOptionsBuilder(PackModel packModel) {
    super(packModel);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public void initPackCommand() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].callCurrent((GroovyObject)this);
    Object apkPath = arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this)), arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this))));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this))))
      arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this), apkPath); 
  }
  
  public void executePack() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      initPackCommand();
      null;
    } else {
      arrayOfCallSite[15].callCurrent((GroovyObject)this);
    } 
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callConstructor(ProcessUtils.class, arrayOfCallSite[17].callGroovyObjectGetProperty(this), "Package failed"), ProcessUtils.class);
    arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this), arrayOfCallSite[20].callGetProperty(arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this))));
    arrayOfCallSite[23].call(HM_LOGGER, "package", arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this)), " "));
    arrayOfCallSite[27].call(processUtils, arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(this)), HM_LOGGER);
  }
}
