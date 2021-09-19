package com.huawei.ohos.build.tasks.pack.optionsbuilder.lite;

import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.lite.SingleLitePackModel;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

public class SingleLiteOptionsBuilder extends LiteCommonOptionsBuilder {
  private static final HMLogger HM_LOGGER;
  
  @Nonnull
  private SingleLitePackModel singleLitePackModel;
  
  private JavaCommandBuilder binBuilder;
  
  private JavaCommandBuilder jsBundleBuilder;
  
  static {
    Object object = $getCallSiteArray()[64].call(HMLogger.class, SingleLiteOptionsBuilder.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public SingleLiteOptionsBuilder(PackModel packModel) {
    super(packModel);
    MetaClass metaClass = $getStaticMetaClass();
    SingleLitePackModel singleLitePackModel = (SingleLitePackModel)ScriptBytecodeAdapter.asType(packModel, SingleLitePackModel.class);
    this.singleLitePackModel = (SingleLitePackModel)ScriptBytecodeAdapter.castToType(singleLitePackModel, SingleLitePackModel.class);
  }
  
  public void initPackCommand() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File outputFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this)), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(outputFile))) {
      arrayOfCallSite[3].call(outputFile);
    } else {
      arrayOfCallSite[4].call(arrayOfCallSite[5].call(outputFile));
    } 
    arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this), "hap"), Boolean.valueOf(true));
    arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].call(arrayOfCallSite[13].callGroovyObjectGetProperty(this))));
    Object object = arrayOfCallSite[14].callConstructor(JavaCommandBuilder.class, arrayOfCallSite[15].callGroovyObjectGetProperty(this));
    this.jsBundleBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(object, JavaCommandBuilder.class);
    JavaCommandBuilder.PackingToolOptions jsBundleBuilderOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].callConstructor(JavaCommandBuilder.PackingToolOptions.class, this.jsBundleBuilder), JavaCommandBuilder.PackingToolOptions.class);
    arrayOfCallSite[17]
      
      .call(arrayOfCallSite[18].call(arrayOfCallSite[19].call(arrayOfCallSite[20].call(jsBundleBuilderOptions, arrayOfCallSite[21].callGroovyObjectGetProperty(this.singleLitePackModel)), arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this.singleLitePackModel))), arrayOfCallSite[24].callGroovyObjectGetProperty(this.singleLitePackModel)), arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this.singleLitePackModel)));
    File jsBundleOutPutFile = (File)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(this.singleLitePackModel)) ? arrayOfCallSite[28].call(this.singleLitePackModel) : arrayOfCallSite[29].call(this.singleLitePackModel), File.class);
    arrayOfCallSite[30].call(jsBundleBuilderOptions, arrayOfCallSite[31].callGetProperty(jsBundleOutPutFile));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[32].call(this.singleLitePackModel))) {
      Object object1 = arrayOfCallSite[33].callConstructor(JavaCommandBuilder.class, arrayOfCallSite[34].callGroovyObjectGetProperty(this));
      this.binBuilder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(object1, JavaCommandBuilder.class);
      JavaCommandBuilder.PackingToolOptions binBuilderOptions = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].callConstructor(JavaCommandBuilder.PackingToolOptions.class, this.binBuilder), JavaCommandBuilder.PackingToolOptions.class);
      arrayOfCallSite[36].call(binBuilderOptions, arrayOfCallSite[37].callGetProperty(arrayOfCallSite[38].callGroovyObjectGetProperty(this.singleLitePackModel)));
      File binOutPutFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(this.singleLitePackModel), File.class);
      arrayOfCallSite[40].call(binBuilderOptions, arrayOfCallSite[41].callGetProperty(binOutPutFile));
    } 
  }
  
  public void executePack() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      initPackCommand();
      null;
    } else {
      arrayOfCallSite[42].callCurrent((GroovyObject)this);
    } 
    ProcessUtils processUtils = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].callConstructor(ProcessUtils.class, arrayOfCallSite[44].callGroovyObjectGetProperty(this), "Package failed"), ProcessUtils.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[45].call(this.singleLitePackModel))) {
      arrayOfCallSite[46].call(HM_LOGGER, "package bin", arrayOfCallSite[47].call(arrayOfCallSite[48].call(this.binBuilder), " "));
      arrayOfCallSite[49].call(processUtils, arrayOfCallSite[50].call(this.binBuilder), HM_LOGGER);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[51].callGetProperty(arrayOfCallSite[52].callGroovyObjectGetProperty(arrayOfCallSite[53].callGroovyObjectGetProperty(this))), "release")) {
        arrayOfCallSite[54].call(HM_LOGGER, "package jsBundle", arrayOfCallSite[55].call(arrayOfCallSite[56].call(this.jsBundleBuilder), " "));
        arrayOfCallSite[57].call(processUtils, arrayOfCallSite[58].call(this.jsBundleBuilder), HM_LOGGER);
      } 
    } else {
      arrayOfCallSite[59].call(HM_LOGGER, "package jsBundle", arrayOfCallSite[60].call(arrayOfCallSite[61].call(this.jsBundleBuilder), " "));
      arrayOfCallSite[62].call(processUtils, arrayOfCallSite[63].call(this.jsBundleBuilder), HM_LOGGER);
    } 
  }
  
  public PackModel getPackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (PackModel)this.singleLitePackModel;
  }
}
