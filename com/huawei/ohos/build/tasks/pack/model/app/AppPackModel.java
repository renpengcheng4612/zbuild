package com.huawei.ohos.build.tasks.pack.model.app;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.DefaultPackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public class AppPackModel extends DefaultPackModel {
  @Nonnull
  private File packInfoFile;
  
  public AppPackModel(Project project, VariantData variantData) {
    super(project, variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(this);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, AppPackModel.class, (GroovyObject)this, "packageType");
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(project)), "-"), arrayOfCallSite[6].callGroovyObjectGetProperty(variantData)), "-unsigned.app");
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, AppPackModel.class, (GroovyObject)this, "outputFileName");
    Object object3 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this)), arrayOfCallSite[11].callGroovyObjectGetProperty(variantData)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, AppPackModel.class, (GroovyObject)this, "outputDir");
    Object object4 = arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object4, AppPackModel.class, (GroovyObject)this, "packageTool");
    Object object5 = arrayOfCallSite[16].call(arrayOfCallSite[17].call(Paths.class, arrayOfCallSite[18].call(arrayOfCallSite[19].callGroovyObjectGetProperty(this)), arrayOfCallSite[20].callGroovyObjectGetProperty(variantData), arrayOfCallSite[21].callGetProperty(CommonConst.class)));
    this.packInfoFile = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
  }
}
