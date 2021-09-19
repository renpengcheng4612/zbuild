package com.huawei.ohos.build.tasks.factory;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.component.AdhocComponentWithVariants;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.api.plugins.internal.JavaConfigurationVariantMapping;

public class HarTaskManager extends TaskManager {
  private ConfigInfo configInfo;
  
  public HarTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    super(project, dependencyManager, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].call(arrayOfCallSite[1].call(GlobalDataManager.class, project), project);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object, ConfigInfo.class);
  }
  
  public void createRichDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[4].callGetProperty(VariantModel.class))) {
      arrayOfCallSite[5].callCurrent(this, variantData);
      return;
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[8].callGetProperty(VariantModel.class)))
      return; 
    arrayOfCallSite[9].callCurrent(this, variantData);
    arrayOfCallSite[10].callCurrent(this, variantData);
    arrayOfCallSite[11].callCurrent(this, variantData);
    arrayOfCallSite[12].callCurrent(this, variantData);
    arrayOfCallSite[13].callCurrent(this, variantData);
    arrayOfCallSite[14].callCurrent(this, variantData);
    arrayOfCallSite[15].callCurrent(this, variantData);
    arrayOfCallSite[16].callCurrent(this, variantData);
    arrayOfCallSite[17].callCurrent(this, variantData);
    arrayOfCallSite[18].callCurrent(this, variantData);
    arrayOfCallSite[19].callCurrent(this, variantData);
    arrayOfCallSite[20].callCurrent(this, variantData);
    arrayOfCallSite[21].callCurrent(this, variantData);
    arrayOfCallSite[22].callCurrent(this, variantData);
    arrayOfCallSite[23].callCurrent(this, variantData);
    arrayOfCallSite[24].callCurrent(this, arrayOfCallSite[25].callGroovyObjectGetProperty(this), variantData);
    arrayOfCallSite[26].callCurrent(this, variantData);
  }
  
  private void registerSoftwareComponents(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    AdhocComponentWithVariants harComponent = (AdhocComponentWithVariants)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this), arrayOfCallSite[29].callGroovyObjectGetProperty(variantData)), AdhocComponentWithVariants.class);
    ConfigurationContainer configurations = (ConfigurationContainer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callGetProperty(project), ConfigurationContainer.class);
    arrayOfCallSite[31].call(harComponent, arrayOfCallSite[32].call(configurations, arrayOfCallSite[33].call(arrayOfCallSite[34].callGroovyObjectGetProperty(variantData), "ApiPublish")), arrayOfCallSite[35].callConstructor(JavaConfigurationVariantMapping.class, "compile", Boolean.valueOf(false)));
    arrayOfCallSite[36].call(harComponent, arrayOfCallSite[37].call(configurations, arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(variantData), "RuntimePublish")), arrayOfCallSite[40].callConstructor(JavaConfigurationVariantMapping.class, "runtime", Boolean.valueOf(false)));
    arrayOfCallSite[41].call(arrayOfCallSite[42].call(project), harComponent);
  }
  
  public void createRichDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[43].call(variantData), arrayOfCallSite[44].callGetProperty(VariantModel.class))) {
      arrayOfCallSite[45].callCurrent(this, arrayOfCallSite[46].callGroovyObjectGetProperty(this), variantData);
      return;
    } 
    Object object = arrayOfCallSite[47].callConstructor(SpecificTaskContainer.class, arrayOfCallSite[48].callGroovyObjectGetProperty(this), arrayOfCallSite[49].callGroovyObjectGetProperty(this), variantData);
    ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, SpecificTaskContainer.class), HarTaskManager.class, this, "specificTaskManager");
    arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), arrayOfCallSite[52].call(arrayOfCallSite[53].callGroovyObjectGetProperty(this), arrayOfCallSite[54].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[55].call(arrayOfCallSite[56].call(arrayOfCallSite[57].callGroovyObjectGetProperty(this)), arrayOfCallSite[58].callGroovyObjectGetProperty(this));
    arrayOfCallSite[59].call(arrayOfCallSite[60].call(arrayOfCallSite[61].callGroovyObjectGetProperty(this)), arrayOfCallSite[62].callGroovyObjectGetProperty(this));
    arrayOfCallSite[63]
      .call(arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(this)), arrayOfCallSite[66].call(arrayOfCallSite[67].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[68]
      .call(arrayOfCallSite[69].call(arrayOfCallSite[70].callGroovyObjectGetProperty(this)), arrayOfCallSite[71].call(arrayOfCallSite[72].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[73]
      .call(arrayOfCallSite[74].call(arrayOfCallSite[75].callGroovyObjectGetProperty(this)), arrayOfCallSite[76].call(arrayOfCallSite[77].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[78].call(arrayOfCallSite[79].callGroovyObjectGetProperty(arrayOfCallSite[80].callGroovyObjectGetProperty(this)), arrayOfCallSite[81].callGroovyObjectGetProperty(this));
    arrayOfCallSite[82]
      
      .call(arrayOfCallSite[83].call(arrayOfCallSite[84].call(arrayOfCallSite[85].call(arrayOfCallSite[86].call(arrayOfCallSite[87].callGroovyObjectGetProperty(this)), arrayOfCallSite[88].call(arrayOfCallSite[89].callGroovyObjectGetProperty(this))), arrayOfCallSite[90].call(arrayOfCallSite[91].callGroovyObjectGetProperty(this))), arrayOfCallSite[92].call(arrayOfCallSite[93].callGroovyObjectGetProperty(this))), arrayOfCallSite[94].call(arrayOfCallSite[95].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[96]
      .call(arrayOfCallSite[97].call(arrayOfCallSite[98].callGroovyObjectGetProperty(this)), arrayOfCallSite[99].call(arrayOfCallSite[100].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[101]
      
      .call(arrayOfCallSite[102].call(arrayOfCallSite[103].call(arrayOfCallSite[104].callGroovyObjectGetProperty(this)), arrayOfCallSite[105].call(arrayOfCallSite[106].callGroovyObjectGetProperty(this))), arrayOfCallSite[107].call(arrayOfCallSite[108].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[109].call(arrayOfCallSite[110].call(arrayOfCallSite[111].callGroovyObjectGetProperty(this)), arrayOfCallSite[112].callGroovyObjectGetProperty(this));
    arrayOfCallSite[113]
      
      .call(arrayOfCallSite[114].call(arrayOfCallSite[115].call(arrayOfCallSite[116].call(arrayOfCallSite[117].callGroovyObjectGetProperty(this)), arrayOfCallSite[118].call(arrayOfCallSite[119].callGroovyObjectGetProperty(this))), arrayOfCallSite[120].call(arrayOfCallSite[121].callGroovyObjectGetProperty(this))), arrayOfCallSite[122].call(arrayOfCallSite[123].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[124]
      .call(arrayOfCallSite[125].call(arrayOfCallSite[126].callGroovyObjectGetProperty(this)), arrayOfCallSite[127].call(arrayOfCallSite[128].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[129]
      .call(arrayOfCallSite[130].call(arrayOfCallSite[131].callGroovyObjectGetProperty(this)), arrayOfCallSite[132].call(arrayOfCallSite[133].callGroovyObjectGetProperty(this)));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[134].call(arrayOfCallSite[135].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[136]
        
        .call(arrayOfCallSite[137].call(arrayOfCallSite[138].call(arrayOfCallSite[139].call(arrayOfCallSite[140].callGroovyObjectGetProperty(this)), arrayOfCallSite[141].call(arrayOfCallSite[142].callGroovyObjectGetProperty(this))), arrayOfCallSite[143].call(arrayOfCallSite[144].callGroovyObjectGetProperty(this))), arrayOfCallSite[145].call(arrayOfCallSite[146].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[147]
        .call(arrayOfCallSite[148].call(arrayOfCallSite[149].callGroovyObjectGetProperty(this)), arrayOfCallSite[150].call(arrayOfCallSite[151].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[152]
        .call(arrayOfCallSite[153].call(arrayOfCallSite[154].callGroovyObjectGetProperty(this)), arrayOfCallSite[155].call(arrayOfCallSite[156].callGroovyObjectGetProperty(this)));
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[157].callGroovyObjectGetProperty(variantData), "debug"))
      arrayOfCallSite[158]
        .call(arrayOfCallSite[159].call(arrayOfCallSite[160].callGroovyObjectGetProperty(this)), arrayOfCallSite[161].call(arrayOfCallSite[162].callGroovyObjectGetProperty(this))); 
    arrayOfCallSite[163].callCurrent(this, variantData);
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[164].callGetProperty(arrayOfCallSite[165].callGroovyObjectGetProperty(variantData)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[166].call(arrayOfCallSite[167].callGetProperty(arrayOfCallSite[168].callGroovyObjectGetProperty(variantData))))))
      arrayOfCallSite[169]
        .call(arrayOfCallSite[170].call(arrayOfCallSite[171].callGroovyObjectGetProperty(this)), arrayOfCallSite[172].call(arrayOfCallSite[173].callGroovyObjectGetProperty(this))); 
  }
  
  public void createLiteDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[174].callCurrent(this, variantData);
  }
  
  public void createLiteDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[175].callCurrent(this, variantData);
  }
  
  public void configureEntryModule(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[176].callGetProperty(arrayOfCallSite[177].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[178].callGetProperty(VariantModel.class))) {
      String dependVariantName = ShortTypeHandling.castToString(arrayOfCallSite[179].call(arrayOfCallSite[180].call(variantData)));
      arrayOfCallSite[181]
        .call(arrayOfCallSite[182].call(arrayOfCallSite[183].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "TestJavaWithJavac" })), arrayOfCallSite[184].call(arrayOfCallSite[185].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "JavaWithJavac" })));
    } 
  }
  
  @Generated
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
  }
}
