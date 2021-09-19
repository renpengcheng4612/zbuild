package com.huawei.ohos.build.tasks.pack.optionsbuilder.lite;

import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.CoreCommonOptionsBuilder;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public abstract class LiteCommonOptionsBuilder extends CoreCommonOptionsBuilder {
  @Nonnull
  protected PackModel packModel;
  
  protected JavaCommandBuilder builder;
  
  protected JavaCommandBuilder.PackingToolOptions options;
  
  public LiteCommonOptionsBuilder(PackModel packModel) {
    super(packModel);
    Object object1 = arrayOfCallSite[0].callConstructor(JavaCommandBuilder.class);
    this.builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(object1, JavaCommandBuilder.class);
    MetaClass metaClass = $getStaticMetaClass();
    PackModel packModel1 = packModel;
    this.packModel = (PackModel)ScriptBytecodeAdapter.castToType(packModel1, PackModel.class);
    Object object2 = arrayOfCallSite[1].callConstructor(JavaCommandBuilder.PackingToolOptions.class, this.builder);
    this.options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(object2, JavaCommandBuilder.PackingToolOptions.class);
  }
}
