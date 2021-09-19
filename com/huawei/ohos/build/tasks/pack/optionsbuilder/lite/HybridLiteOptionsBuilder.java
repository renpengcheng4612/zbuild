package com.huawei.ohos.build.tasks.pack.optionsbuilder.lite;

import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.lite.HybridLitePackModel;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.rich.EntryOptionsBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class HybridLiteOptionsBuilder extends LiteCommonOptionsBuilder {
  private static final HMLogger HM_LOGGER;
  
  @Nonnull
  private HybridLitePackModel hybridLitePackModel;
  
  @Nonnull
  private SingleLiteOptionsBuilder singleLiteOptionsBuilder;
  
  @Nonnull
  private EntryOptionsBuilder richEntryOptionsBuilder;
  
  static {
    Object object = $getCallSiteArray()[6].call(HMLogger.class, SingleLiteOptionsBuilder.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public HybridLiteOptionsBuilder(PackModel packModel) {
    super(packModel);
    MetaClass metaClass = $getStaticMetaClass();
    HybridLitePackModel hybridLitePackModel = (HybridLitePackModel)ScriptBytecodeAdapter.asType(packModel, HybridLitePackModel.class);
    this.hybridLitePackModel = (HybridLitePackModel)ScriptBytecodeAdapter.castToType(hybridLitePackModel, HybridLitePackModel.class);
    Object object1 = arrayOfCallSite[0].callConstructor(SingleLiteOptionsBuilder.class, arrayOfCallSite[1].call(this.hybridLitePackModel));
    this.singleLiteOptionsBuilder = (SingleLiteOptionsBuilder)ScriptBytecodeAdapter.castToType(object1, SingleLiteOptionsBuilder.class);
    Object object2 = arrayOfCallSite[2].callConstructor(EntryOptionsBuilder.class, arrayOfCallSite[3].call(this.hybridLitePackModel));
    this.richEntryOptionsBuilder = (EntryOptionsBuilder)ScriptBytecodeAdapter.castToType(object2, EntryOptionsBuilder.class);
  }
  
  public void initPackCommand() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void executePack() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(this.singleLiteOptionsBuilder);
    arrayOfCallSite[5].call(this.richEntryOptionsBuilder);
  }
  
  public PackModel getPackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (PackModel)this.hybridLitePackModel;
  }
}
