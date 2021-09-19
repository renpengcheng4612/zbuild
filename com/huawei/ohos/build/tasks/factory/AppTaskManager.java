package com.huawei.ohos.build.tasks.factory;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;
import org.gradle.api.component.SoftwareComponentFactory;

public class AppTaskManager extends TaskManager {
  public AppTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    super(project, dependencyManager, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public void createRichDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[8].call(arrayOfCallSite[9].call(variantData)), arrayOfCallSite[10].callGetProperty(BuildConst.class)) && 
        ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[11].callGroovyObjectGetProperty(variantData), arrayOfCallSite[12].callGetProperty(VariantModel.class)))) {
        arrayOfCallSite[13].callCurrent(this, variantData);
        arrayOfCallSite[14].callCurrent(this, variantData);
        arrayOfCallSite[15].callCurrent(this, variantData);
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].call(variantData)), arrayOfCallSite[2].callGetProperty(BuildConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGroovyObjectGetProperty(variantData), arrayOfCallSite[4].callGetProperty(VariantModel.class)))) {
      arrayOfCallSite[5].callCurrent(this, variantData);
      arrayOfCallSite[6].callCurrent(this, variantData);
      arrayOfCallSite[7].callCurrent(this, variantData);
    } 
  }
  
  public void createRichDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[38].call(arrayOfCallSite[39].call(variantData)), arrayOfCallSite[40].callGetProperty(BuildConst.class)) && 
        ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[41].callGroovyObjectGetProperty(variantData), arrayOfCallSite[42].callGetProperty(VariantModel.class)))) {
        Object object = arrayOfCallSite[43].callConstructor(SpecificTaskContainer.class, arrayOfCallSite[44].callGroovyObjectGetProperty(this), arrayOfCallSite[45].callGroovyObjectGetProperty(this), variantData);
        ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, SpecificTaskContainer.class), AppTaskManager.class, this, "specificTaskManager");
        arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(this)), arrayOfCallSite[49].callGroovyObjectGetProperty(this));
        arrayOfCallSite[50]
          .call(arrayOfCallSite[51].call(arrayOfCallSite[52].callGroovyObjectGetProperty(this)), arrayOfCallSite[53].call(arrayOfCallSite[54].callGroovyObjectGetProperty(this)));
        arrayOfCallSite[55]
          .call(arrayOfCallSite[56].call(arrayOfCallSite[57].callGroovyObjectGetProperty(this)), arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(this)));
      } 
      return;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].call(arrayOfCallSite[17].call(variantData)), arrayOfCallSite[18].callGetProperty(BuildConst.class)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[19].callGroovyObjectGetProperty(variantData), arrayOfCallSite[20].callGetProperty(VariantModel.class)))) {
      Object object = arrayOfCallSite[21].callConstructor(SpecificTaskContainer.class, arrayOfCallSite[22].callGroovyObjectGetProperty(this), arrayOfCallSite[23].callGroovyObjectGetProperty(this), variantData);
      ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, SpecificTaskContainer.class), AppTaskManager.class, this, "specificTaskManager");
      arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this)), arrayOfCallSite[27].callGroovyObjectGetProperty(this));
      arrayOfCallSite[28].call(arrayOfCallSite[29].call(arrayOfCallSite[30].callGroovyObjectGetProperty(this)), arrayOfCallSite[31].call(arrayOfCallSite[32].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[33].call(arrayOfCallSite[34].call(arrayOfCallSite[35].callGroovyObjectGetProperty(this)), arrayOfCallSite[36].call(arrayOfCallSite[37].callGroovyObjectGetProperty(this)));
    } 
  }
  
  public void createLiteDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[60].callCurrent(this, variantData);
  }
  
  public void createLiteDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[61].callCurrent(this, variantData);
  }
}
