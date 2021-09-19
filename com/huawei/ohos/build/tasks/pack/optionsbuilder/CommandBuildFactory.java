package com.huawei.ohos.build.tasks.pack.optionsbuilder;

import com.huawei.ohos.build.tasks.pack.model.component.DeviceTypeComponent;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.lite.HybridLiteOptionsBuilder;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.lite.SingleLiteOptionsBuilder;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.rich.EntryOptionsBuilder;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.rich.FeatureOptionsBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.powerassert.AssertionRenderer;
import org.codehaus.groovy.runtime.powerassert.ValueRecorder;
import org.gradle.internal.Pair;

public class CommandBuildFactory implements GroovyObject {
  @Nonnull
  private static final Object HM_LOG;
  
  private static CommandBuildFactory commandBuildFactory;
  
  static {
    Object object = $getCallSiteArray()[20].call(HMLogger.class, CommandBuildFactory.class);
  }
  
  public static CommandBuildFactory getInstance() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(commandBuildFactory, null))
      synchronized (CommandBuildFactory.class) {
        if (ScriptBytecodeAdapter.compareEqual(commandBuildFactory, null)) {
          Object object = arrayOfCallSite[0].callConstructor(CommandBuildFactory.class);
          commandBuildFactory = (CommandBuildFactory)ScriptBytecodeAdapter.castToType(object, CommandBuildFactory.class);
        } 
      }  
    return commandBuildFactory;
  }
  
  public static PackOptionsBuilder createOptionsBuilder(Pair packModel) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(packModel, null))
      arrayOfCallSite[1].call(HM_LOG, arrayOfCallSite[2].callConstructor(IllegalStateException.class, "Device Type component error,Please Check!")); 
    PackOptionsBuilder packOptionsBuilder = null;
    Object object = arrayOfCallSite[3].call(packModel);
    if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[4].callGetProperty(DeviceTypeComponent.PackedModeResult.class))) {
      Object object1 = arrayOfCallSite[5].callConstructor(EntryOptionsBuilder.class, arrayOfCallSite[6].call(packModel));
      packOptionsBuilder = (PackOptionsBuilder)ScriptBytecodeAdapter.castToType(object1, PackOptionsBuilder.class);
    } else if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[7].callGetProperty(DeviceTypeComponent.PackedModeResult.class))) {
      Object object1 = arrayOfCallSite[8].callConstructor(FeatureOptionsBuilder.class, arrayOfCallSite[9].call(packModel));
      packOptionsBuilder = (PackOptionsBuilder)ScriptBytecodeAdapter.castToType(object1, PackOptionsBuilder.class);
    } else if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[10].callGetProperty(DeviceTypeComponent.PackedModeResult.class)) || ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[11].callGetProperty(DeviceTypeComponent.PackedModeResult.class)) || ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[12].callGetProperty(DeviceTypeComponent.PackedModeResult.class))) {
      Object object1 = arrayOfCallSite[13].callConstructor(SingleLiteOptionsBuilder.class, arrayOfCallSite[14].call(packModel));
      packOptionsBuilder = (PackOptionsBuilder)ScriptBytecodeAdapter.castToType(object1, PackOptionsBuilder.class);
    } else if (ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[15].callGetProperty(DeviceTypeComponent.PackedModeResult.class)) || ScriptBytecodeAdapter.isCase(object, arrayOfCallSite[16].callGetProperty(DeviceTypeComponent.PackedModeResult.class))) {
      Object object1 = arrayOfCallSite[17].callConstructor(HybridLiteOptionsBuilder.class, arrayOfCallSite[18].call(packModel));
      packOptionsBuilder = (PackOptionsBuilder)ScriptBytecodeAdapter.castToType(object1, PackOptionsBuilder.class);
    } else {
      arrayOfCallSite[19].call(HM_LOG, "Unsupported packedMode,please check deviceType");
    } 
    ValueRecorder valueRecorder = new ValueRecorder();
    try {
      valueRecorder.record(packOptionsBuilder, 8);
      valueRecorder.record(Boolean.valueOf(ScriptBytecodeAdapter.compareNotEqual(packOptionsBuilder, null)), 27);
      if (ScriptBytecodeAdapter.compareNotEqual(packOptionsBuilder, null)) {
        valueRecorder.clear();
      } else {
        ScriptBytecodeAdapter.assertFailed(AssertionRenderer.render("assert packOptionsBuilder != null", valueRecorder), null);
      } 
    } finally {
      valueRecorder.clear();
    } 
  }
  
  private CommandBuildFactory() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
