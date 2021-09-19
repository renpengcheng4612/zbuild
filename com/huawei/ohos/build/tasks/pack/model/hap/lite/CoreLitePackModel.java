package com.huawei.ohos.build.tasks.pack.model.hap.lite;

import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.DefaultPackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public abstract class CoreLitePackModel extends DefaultPackModel {
  @Nonnull
  protected DeviceType liteDeviceType;
  
  public CoreLitePackModel(Project project, VariantData variantData, DeviceType liteDeviceType) {
    super(project, variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(this);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CoreLitePackModel.class, (GroovyObject)this, "packageType");
    DeviceType deviceType = liteDeviceType;
    this.liteDeviceType = (DeviceType)ShortTypeHandling.castToEnum(deviceType, DeviceType.class);
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].callGroovyObjectGetProperty(variantData)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, CoreLitePackModel.class, (GroovyObject)this, "outputDir");
    Object object3 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(Paths.class, arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, CoreLitePackModel.class, (GroovyObject)this, "packageTool");
  }
}
