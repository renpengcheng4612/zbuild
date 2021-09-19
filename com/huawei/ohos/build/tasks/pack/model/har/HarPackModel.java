package com.huawei.ohos.build.tasks.pack.model.har;

import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.DefaultPackModel;
import com.huawei.ohos.build.utils.StringHandler;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class HarPackModel extends DefaultPackModel {
  public HarPackModel(Project project, VariantData variantData) {
    super(project, variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(this);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, HarPackModel.class, (GroovyObject)this, "packageType");
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      String str = populateHarFileName();
      ScriptBytecodeAdapter.setGroovyObjectProperty(str, HarPackModel.class, (GroovyObject)this, "outputFileName");
    } else {
      Object object = arrayOfCallSite[1].callCurrent((GroovyObject)this);
      ScriptBytecodeAdapter.setGroovyObjectProperty(object, HarPackModel.class, (GroovyObject)this, "outputFileName");
    } 
    Object object2 = arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(arrayOfCallSite[5].callGroovyObjectGetProperty(this)), arrayOfCallSite[6].callGroovyObjectGetProperty(variantData)));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, HarPackModel.class, (GroovyObject)this, "outputDir");
    Object object3 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this))));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, HarPackModel.class, (GroovyObject)this, "packageTool");
  }
  
  private String populateHarFileName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    StringBuilder nameBuilder = (StringBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(StringBuilder.class, arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this)), "-"), arrayOfCallSite[16].callGroovyObjectGetProperty(arrayOfCallSite[17].callGroovyObjectGetProperty(this)))), StringBuilder.class);
    String packageVersion = ShortTypeHandling.castToString(arrayOfCallSite[18].callGetProperty(arrayOfCallSite[19].callGetProperty(arrayOfCallSite[20].callGroovyObjectGetProperty(this))));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].call(StringHandler.class, packageVersion))) {
      arrayOfCallSite[22].call(nameBuilder, "-");
      arrayOfCallSite[23].call(nameBuilder, packageVersion);
    } 
    arrayOfCallSite[24].call(nameBuilder, ".har");
    return ShortTypeHandling.castToString(arrayOfCallSite[25].call(nameBuilder));
  }
}
