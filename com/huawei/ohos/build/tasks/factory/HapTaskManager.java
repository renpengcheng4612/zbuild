package com.huawei.ohos.build.tasks.factory;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.dsl.ModuleExtensionData;
import com.huawei.ohos.build.dsl.dependencies.HarmonyConfigurationNames;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.pack.model.component.DeviceTypeComponent;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.CommandBuildFactory;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.internal.Pair;

public class HapTaskManager extends TaskManager {
  private CommandBuildFactory commandBuildFactory;
  
  private ConfigInfo configInfo;
  
  public HapTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    super(project, dependencyManager, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(GlobalDataManager.class, project), project);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[2].call(CommandBuildFactory.class);
    this.commandBuildFactory = (CommandBuildFactory)ScriptBytecodeAdapter.castToType(object2, CommandBuildFactory.class);
  }
  
  public void createRichDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Pair packModel = (Pair)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(DeviceTypeComponent.DeviceTypeComponentFactory.class, arrayOfCallSite[4].callGroovyObjectGetProperty(this), variantData), Pair.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[7].callGetProperty(VariantModel.class))) {
      arrayOfCallSite[8].callCurrent(this, variantData);
      return;
    } 
    arrayOfCallSite[9].callCurrent(this, variantData, packModel);
    arrayOfCallSite[10].callCurrent(this, variantData, packModel);
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
    arrayOfCallSite[24].callCurrent(this, variantData);
    arrayOfCallSite[25].callCurrent(this, variantData);
    arrayOfCallSite[26].callCurrent(this, variantData);
    arrayOfCallSite[27].callCurrent(this, variantData);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[28].call(arrayOfCallSite[29].callGroovyObjectGetProperty(variantData))))
      arrayOfCallSite[30].callCurrent(this, variantData); 
    arrayOfCallSite[31].callCurrent(this, variantData);
    arrayOfCallSite[32].callCurrent(this, variantData);
    arrayOfCallSite[33].callCurrent(this, variantData);
    arrayOfCallSite[34].callCurrent(this, variantData);
    arrayOfCallSite[35].callCurrent(this, variantData);
    arrayOfCallSite[36].callCurrent(this, variantData);
    arrayOfCallSite[37].callCurrent(this, variantData);
    arrayOfCallSite[38].callCurrent(this, variantData);
    arrayOfCallSite[39].callCurrent(this, variantData);
    arrayOfCallSite[40].callCurrent(this, variantData);
    arrayOfCallSite[41].callCurrent(this, variantData);
    arrayOfCallSite[42].callCurrent(this, variantData);
    arrayOfCallSite[43].callCurrent(this, variantData);
    arrayOfCallSite[44].callCurrent(this, variantData);
    arrayOfCallSite[45].callCurrent(this, variantData);
    arrayOfCallSite[46].callCurrent(this, variantData);
  }
  
  public void createLiteDeviceTasksForBuildType(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Pair packModel = (Pair)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(DeviceTypeComponent.DeviceTypeComponentFactory.class, arrayOfCallSite[48].callGroovyObjectGetProperty(this), variantData), Pair.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[49].callGetProperty(arrayOfCallSite[50].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[51].callGetProperty(VariantModel.class)))
      return; 
    arrayOfCallSite[52].callCurrent(this, variantData, packModel);
    arrayOfCallSite[53].callCurrent(this, variantData, packModel);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(arrayOfCallSite[55].callGroovyObjectGetProperty(variantData))))
      arrayOfCallSite[56].callCurrent(this, variantData); 
    arrayOfCallSite[57].callCurrent(this, variantData);
    arrayOfCallSite[58].callCurrent(this, variantData);
    arrayOfCallSite[59].callCurrent(this, variantData);
    arrayOfCallSite[60].callCurrent(this, variantData);
    arrayOfCallSite[61].callCurrent(this, variantData);
    arrayOfCallSite[62].callCurrent(this, variantData);
    arrayOfCallSite[63].callCurrent(this, variantData);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[64].call(arrayOfCallSite[65].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[66].callCurrent(this, variantData);
      arrayOfCallSite[67].callCurrent(this, variantData);
    } 
    arrayOfCallSite[68].callCurrent(this, variantData);
    arrayOfCallSite[69].callCurrent(this, variantData);
    arrayOfCallSite[70].callCurrent(this, variantData);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[71].call(arrayOfCallSite[72].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[73].callCurrent(this, variantData);
      arrayOfCallSite[74].callCurrent(this, variantData);
      arrayOfCallSite[75].callCurrent(this, variantData);
      arrayOfCallSite[76].callCurrent(this, variantData);
      arrayOfCallSite[77].callCurrent(this, variantData);
      arrayOfCallSite[78].callCurrent(this, variantData);
      arrayOfCallSite[79].callCurrent(this, variantData);
      arrayOfCallSite[80].callCurrent(this, variantData);
      arrayOfCallSite[81].callCurrent(this, variantData);
      arrayOfCallSite[82].callCurrent(this, variantData);
      arrayOfCallSite[83].callCurrent(this, variantData);
      arrayOfCallSite[84].callCurrent(this, variantData);
      arrayOfCallSite[85].callCurrent(this, variantData);
      arrayOfCallSite[86].callCurrent(this, variantData);
      arrayOfCallSite[87].callCurrent(this, variantData);
      arrayOfCallSite[88].callCurrent(this, variantData);
      arrayOfCallSite[89].callCurrent(this, variantData);
      arrayOfCallSite[90].callCurrent(this, variantData);
    } 
  }
  
  public void createRichDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[91].callCurrent(this, arrayOfCallSite[92].callGroovyObjectGetProperty(this), variantData);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[93].callGetProperty(arrayOfCallSite[94].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[95].callGetProperty(VariantModel.class)))
      return; 
    Object object1 = arrayOfCallSite[96].callConstructor(SpecificTaskContainer.class, arrayOfCallSite[97].callGroovyObjectGetProperty(this), arrayOfCallSite[98].callGroovyObjectGetProperty(this), variantData);
    ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object1, SpecificTaskContainer.class), HapTaskManager.class, this, "specificTaskManager");
    arrayOfCallSite[99].call(arrayOfCallSite[100].callGroovyObjectGetProperty(this), arrayOfCallSite[101].call(arrayOfCallSite[102].callGroovyObjectGetProperty(this), arrayOfCallSite[103].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[104].call(arrayOfCallSite[105].call(arrayOfCallSite[106].callGroovyObjectGetProperty(this)), arrayOfCallSite[107].callGroovyObjectGetProperty(this));
    arrayOfCallSite[108].call(arrayOfCallSite[109].call(arrayOfCallSite[110].callGroovyObjectGetProperty(this)), arrayOfCallSite[111].callGroovyObjectGetProperty(this));
    arrayOfCallSite[112]
      .call(arrayOfCallSite[113].call(arrayOfCallSite[114].callGroovyObjectGetProperty(this)), arrayOfCallSite[115].call(arrayOfCallSite[116].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[117]
      
      .call(arrayOfCallSite[118].call(arrayOfCallSite[119].call(arrayOfCallSite[120].callGroovyObjectGetProperty(this)), arrayOfCallSite[121].call(arrayOfCallSite[122].callGroovyObjectGetProperty(this))), arrayOfCallSite[123].call(arrayOfCallSite[124].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[125]
      .call(arrayOfCallSite[126].call(arrayOfCallSite[127].callGroovyObjectGetProperty(this)), arrayOfCallSite[128].call(arrayOfCallSite[129].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[130].call(arrayOfCallSite[131].call(arrayOfCallSite[132].callGroovyObjectGetProperty(this)), arrayOfCallSite[133].callGroovyObjectGetProperty(this));
    arrayOfCallSite[134]
      .call(arrayOfCallSite[135].call(arrayOfCallSite[136].callGroovyObjectGetProperty(this)), arrayOfCallSite[137].call(arrayOfCallSite[138].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[139]
      .call(arrayOfCallSite[140].call(arrayOfCallSite[141].callGroovyObjectGetProperty(this)), arrayOfCallSite[142].call(arrayOfCallSite[143].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[144]
      
      .call(arrayOfCallSite[145].call(arrayOfCallSite[146].call(arrayOfCallSite[147].callGroovyObjectGetProperty(this)), arrayOfCallSite[148].call(arrayOfCallSite[149].callGroovyObjectGetProperty(this))), arrayOfCallSite[150].call(arrayOfCallSite[151].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[152]
      .call(arrayOfCallSite[153].call(arrayOfCallSite[154].callGroovyObjectGetProperty(this)), arrayOfCallSite[155].call(arrayOfCallSite[156].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[157]
      .call(arrayOfCallSite[158].call(arrayOfCallSite[159].callGroovyObjectGetProperty(this)), arrayOfCallSite[160].call(arrayOfCallSite[161].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[162]
      .call(arrayOfCallSite[163].call(arrayOfCallSite[164].callGroovyObjectGetProperty(this)), arrayOfCallSite[165].call(arrayOfCallSite[166].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[167]
      .call(arrayOfCallSite[168].call(arrayOfCallSite[169].callGroovyObjectGetProperty(this)), arrayOfCallSite[170].call(arrayOfCallSite[171].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[172]
      .call(arrayOfCallSite[173].call(arrayOfCallSite[174].callGroovyObjectGetProperty(this)), arrayOfCallSite[175].call(arrayOfCallSite[176].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[177]
      
      .call(arrayOfCallSite[178].call(arrayOfCallSite[179].call(arrayOfCallSite[180].call(arrayOfCallSite[181].callGroovyObjectGetProperty(this)), arrayOfCallSite[182].call(arrayOfCallSite[183].callGroovyObjectGetProperty(this))), arrayOfCallSite[184].call(arrayOfCallSite[185].callGroovyObjectGetProperty(this))), arrayOfCallSite[186].call(arrayOfCallSite[187].callGroovyObjectGetProperty(this)));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[188].call(arrayOfCallSite[189].callGetProperty(arrayOfCallSite[190].callGroovyObjectGetProperty(this)), "com.huawei.ohos.onlineSignHap"))) {
      arrayOfCallSite[191]
        .call(arrayOfCallSite[192].call(arrayOfCallSite[193].callGroovyObjectGetProperty(this)), arrayOfCallSite[194].call(variantData, "onlineSign", "shell"));
    } else {
      arrayOfCallSite[195].call(arrayOfCallSite[196].call(arrayOfCallSite[197].callGroovyObjectGetProperty(this)), arrayOfCallSite[198].callGroovyObjectGetProperty(arrayOfCallSite[199].callGroovyObjectGetProperty(this)));
    } 
    arrayOfCallSite[200]
      .call(arrayOfCallSite[201].call(arrayOfCallSite[202].callGroovyObjectGetProperty(this)), arrayOfCallSite[203].call(arrayOfCallSite[204].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[205]
      .call(arrayOfCallSite[206].call(arrayOfCallSite[207].callGroovyObjectGetProperty(this)), arrayOfCallSite[208].call(arrayOfCallSite[209].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[210].call(arrayOfCallSite[211].callGroovyObjectGetProperty(arrayOfCallSite[212].callGroovyObjectGetProperty(this)), arrayOfCallSite[213].callGroovyObjectGetProperty(this));
    arrayOfCallSite[214]
      
      .call(arrayOfCallSite[215].call(arrayOfCallSite[216].call(arrayOfCallSite[217].call(arrayOfCallSite[218].call(arrayOfCallSite[219].callGroovyObjectGetProperty(this)), arrayOfCallSite[220].call(arrayOfCallSite[221].callGroovyObjectGetProperty(this))), arrayOfCallSite[222].call(arrayOfCallSite[223].callGroovyObjectGetProperty(this))), arrayOfCallSite[224].call(arrayOfCallSite[225].callGroovyObjectGetProperty(this))), arrayOfCallSite[226].call(arrayOfCallSite[227].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[228]
      
      .call(arrayOfCallSite[229].call(arrayOfCallSite[230].call(arrayOfCallSite[231].callGroovyObjectGetProperty(this)), arrayOfCallSite[232].call(arrayOfCallSite[233].callGroovyObjectGetProperty(this))), arrayOfCallSite[234].call(arrayOfCallSite[235].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[236]
      .call(arrayOfCallSite[237].call(arrayOfCallSite[238].callGroovyObjectGetProperty(this)), arrayOfCallSite[239].call(arrayOfCallSite[240].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[241]
      
      .call(arrayOfCallSite[242].call(arrayOfCallSite[243].call(arrayOfCallSite[244].callGroovyObjectGetProperty(this)), arrayOfCallSite[245].call(arrayOfCallSite[246].callGroovyObjectGetProperty(this))), arrayOfCallSite[247].call(arrayOfCallSite[248].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[249]
      
      .call(arrayOfCallSite[250].call(arrayOfCallSite[251].call(arrayOfCallSite[252].call(arrayOfCallSite[253].callGroovyObjectGetProperty(this)), arrayOfCallSite[254].call(arrayOfCallSite[255].callGroovyObjectGetProperty(this))), arrayOfCallSite[256].call(arrayOfCallSite[257].callGroovyObjectGetProperty(this))), arrayOfCallSite[258].call(arrayOfCallSite[259].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[260].callCurrent(this, variantData);
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[261].callGetProperty(arrayOfCallSite[262].callGroovyObjectGetProperty(variantData)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[263].call(arrayOfCallSite[264].callGetProperty(arrayOfCallSite[265].callGroovyObjectGetProperty(variantData)))))) {
      arrayOfCallSite[266]
        .call(arrayOfCallSite[267].call(arrayOfCallSite[268].callGroovyObjectGetProperty(this)), arrayOfCallSite[269].call(arrayOfCallSite[270].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[271]
        .call(arrayOfCallSite[272].call(arrayOfCallSite[273].callGroovyObjectGetProperty(this)), arrayOfCallSite[274].call(arrayOfCallSite[275].callGroovyObjectGetProperty(this)));
    } else {
      arrayOfCallSite[276]
        
        .call(arrayOfCallSite[277].call(arrayOfCallSite[278].call(arrayOfCallSite[279].callGroovyObjectGetProperty(this)), arrayOfCallSite[280].call(arrayOfCallSite[281].callGroovyObjectGetProperty(this))), arrayOfCallSite[282].call(arrayOfCallSite[283].callGroovyObjectGetProperty(this)));
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[284].call(arrayOfCallSite[285].callGroovyObjectGetProperty(variantData))))
      arrayOfCallSite[286].call(arrayOfCallSite[287].call(arrayOfCallSite[288].callGroovyObjectGetProperty(this)), arrayOfCallSite[289].call(arrayOfCallSite[290].callGroovyObjectGetProperty(this))); 
    arrayOfCallSite[291].call(arrayOfCallSite[292].call(arrayOfCallSite[293].callGroovyObjectGetProperty(this)), arrayOfCallSite[294].callGroovyObjectGetProperty(this));
    Object cmakeTask = arrayOfCallSite[295].call(arrayOfCallSite[296].callGroovyObjectGetProperty(this));
    if (ScriptBytecodeAdapter.compareNotEqual(cmakeTask, null))
      arrayOfCallSite[297].call(cmakeTask, arrayOfCallSite[298].callGroovyObjectGetProperty(this)); 
    arrayOfCallSite[299]
      
      .call(arrayOfCallSite[300].call(arrayOfCallSite[301].call(arrayOfCallSite[302].call(arrayOfCallSite[303].call(arrayOfCallSite[304].callGroovyObjectGetProperty(this)), arrayOfCallSite[305].call(arrayOfCallSite[306].callGroovyObjectGetProperty(this))), arrayOfCallSite[307].call(arrayOfCallSite[308].callGroovyObjectGetProperty(this))), arrayOfCallSite[309].call(arrayOfCallSite[310].callGroovyObjectGetProperty(this))), arrayOfCallSite[311].call(arrayOfCallSite[312].callGroovyObjectGetProperty(this)));
    if (ScriptBytecodeAdapter.compareNotEqual(cmakeTask, null)) {
      arrayOfCallSite[313].call(arrayOfCallSite[314].call(arrayOfCallSite[315].callGroovyObjectGetProperty(this)), cmakeTask);
      arrayOfCallSite[316].call(arrayOfCallSite[317].call(arrayOfCallSite[318].callGroovyObjectGetProperty(this)), cmakeTask);
    } 
    arrayOfCallSite[319]
      .call(arrayOfCallSite[320].call(arrayOfCallSite[321].callGroovyObjectGetProperty(this)), arrayOfCallSite[322].call(arrayOfCallSite[323].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[324]
      .call(arrayOfCallSite[325].call(arrayOfCallSite[326].callGroovyObjectGetProperty(this)), arrayOfCallSite[327].call(arrayOfCallSite[328].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[329].call(arrayOfCallSite[330].call(arrayOfCallSite[331].callGroovyObjectGetProperty(this)), arrayOfCallSite[332].callGroovyObjectGetProperty(arrayOfCallSite[333].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[334].call(arrayOfCallSite[335].call(arrayOfCallSite[336].callGroovyObjectGetProperty(this)), arrayOfCallSite[337].call(arrayOfCallSite[338].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[339]
      
      .call(arrayOfCallSite[340].call(arrayOfCallSite[341].call(arrayOfCallSite[342].call(arrayOfCallSite[343].callGroovyObjectGetProperty(this)), arrayOfCallSite[344].call(arrayOfCallSite[345].callGroovyObjectGetProperty(this))), arrayOfCallSite[346].call(arrayOfCallSite[347].callGroovyObjectGetProperty(this))), arrayOfCallSite[348].callGroovyObjectGetProperty(arrayOfCallSite[349].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[350].call(arrayOfCallSite[351].call(arrayOfCallSite[352].callGroovyObjectGetProperty(this)), arrayOfCallSite[353].call(arrayOfCallSite[354].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[355]
      
      .call(arrayOfCallSite[356].call(arrayOfCallSite[357].call(arrayOfCallSite[358].call(arrayOfCallSite[359].callGroovyObjectGetProperty(this)), arrayOfCallSite[360].callGroovyObjectGetProperty(arrayOfCallSite[361].callGroovyObjectGetProperty(this))), arrayOfCallSite[362].call(arrayOfCallSite[363].callGroovyObjectGetProperty(this))), arrayOfCallSite[364].call(arrayOfCallSite[365].callGroovyObjectGetProperty(this)));
  }
  
  public void createLiteDeviceDepends(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[366].callGetProperty(arrayOfCallSite[367].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[368].callGetProperty(VariantModel.class)))
      return; 
    Object object = arrayOfCallSite[369].callConstructor(SpecificTaskContainer.class, arrayOfCallSite[370].callGroovyObjectGetProperty(this), arrayOfCallSite[371].callGroovyObjectGetProperty(this), variantData);
    ScriptBytecodeAdapter.setGroovyObjectProperty(ScriptBytecodeAdapter.castToType(object, SpecificTaskContainer.class), HapTaskManager.class, this, "specificTaskManager");
    arrayOfCallSite[372].call(arrayOfCallSite[373].call(arrayOfCallSite[374].callGroovyObjectGetProperty(this)), arrayOfCallSite[375].callGroovyObjectGetProperty(this));
    arrayOfCallSite[376].call(arrayOfCallSite[377].callGroovyObjectGetProperty(this), arrayOfCallSite[378].call(arrayOfCallSite[379].callGroovyObjectGetProperty(this), arrayOfCallSite[380].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[381].call(arrayOfCallSite[382].call(arrayOfCallSite[383].callGroovyObjectGetProperty(this)), arrayOfCallSite[384].callGroovyObjectGetProperty(this));
    arrayOfCallSite[385].call(arrayOfCallSite[386].call(arrayOfCallSite[387].callGroovyObjectGetProperty(this)), arrayOfCallSite[388].callGroovyObjectGetProperty(this));
    arrayOfCallSite[389]
      .call(arrayOfCallSite[390].call(arrayOfCallSite[391].callGroovyObjectGetProperty(this)), arrayOfCallSite[392].call(arrayOfCallSite[393].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[394]
      
      .call(arrayOfCallSite[395].call(arrayOfCallSite[396].call(arrayOfCallSite[397].callGroovyObjectGetProperty(this)), arrayOfCallSite[398].call(arrayOfCallSite[399].callGroovyObjectGetProperty(this))), arrayOfCallSite[400].call(arrayOfCallSite[401].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[402]
      
      .call(arrayOfCallSite[403].call(arrayOfCallSite[404].call(arrayOfCallSite[405].callGroovyObjectGetProperty(this)), arrayOfCallSite[406].call(arrayOfCallSite[407].callGroovyObjectGetProperty(this))), arrayOfCallSite[408].call(arrayOfCallSite[409].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[410]
      
      .call(arrayOfCallSite[411].call(arrayOfCallSite[412].call(arrayOfCallSite[413].callGroovyObjectGetProperty(this)), arrayOfCallSite[414].call(arrayOfCallSite[415].callGroovyObjectGetProperty(this))), arrayOfCallSite[416].call(arrayOfCallSite[417].callGroovyObjectGetProperty(this)));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[418].call(arrayOfCallSite[419].callGroovyObjectGetProperty(variantData))))
      arrayOfCallSite[420]
        .call(arrayOfCallSite[421].call(arrayOfCallSite[422].callGroovyObjectGetProperty(this)), arrayOfCallSite[423].call(arrayOfCallSite[424].callGroovyObjectGetProperty(this))); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[425].call(arrayOfCallSite[426].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[427].call(arrayOfCallSite[428].call(arrayOfCallSite[429].callGroovyObjectGetProperty(this)), arrayOfCallSite[430].call(arrayOfCallSite[431].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[432]
        .call(arrayOfCallSite[433].call(arrayOfCallSite[434].call(arrayOfCallSite[435].callGroovyObjectGetProperty(this)), arrayOfCallSite[436].call(arrayOfCallSite[437].callGroovyObjectGetProperty(this))), arrayOfCallSite[438].call(arrayOfCallSite[439].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[440].call(arrayOfCallSite[441].call(arrayOfCallSite[442].callGroovyObjectGetProperty(this)), arrayOfCallSite[443].call(arrayOfCallSite[444].callGroovyObjectGetProperty(this)));
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[445].call(arrayOfCallSite[446].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[447].call(arrayOfCallSite[448].call(arrayOfCallSite[449].callGroovyObjectGetProperty(this)), arrayOfCallSite[450].callGroovyObjectGetProperty(arrayOfCallSite[451].callGroovyObjectGetProperty(this)));
    } else {
      arrayOfCallSite[452].call(arrayOfCallSite[453].call(arrayOfCallSite[454].callGroovyObjectGetProperty(this)), arrayOfCallSite[455].call(arrayOfCallSite[456].callGroovyObjectGetProperty(this)));
    } 
    arrayOfCallSite[457]
      .call(arrayOfCallSite[458].call(arrayOfCallSite[459].call(arrayOfCallSite[460].callGroovyObjectGetProperty(this)), arrayOfCallSite[461].call(arrayOfCallSite[462].callGroovyObjectGetProperty(this))), arrayOfCallSite[463].call(arrayOfCallSite[464].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[465].call(arrayOfCallSite[466].call(arrayOfCallSite[467].callGroovyObjectGetProperty(this)), arrayOfCallSite[468].call(arrayOfCallSite[469].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[470].call(arrayOfCallSite[471].call(arrayOfCallSite[472].call(arrayOfCallSite[473].callGroovyObjectGetProperty(this)), arrayOfCallSite[474].callGroovyObjectGetProperty(arrayOfCallSite[475].callGroovyObjectGetProperty(this))), arrayOfCallSite[476].callGroovyObjectGetProperty(arrayOfCallSite[477].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[478].callCurrent(this, arrayOfCallSite[479].callGroovyObjectGetProperty(this), variantData);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[480].call(arrayOfCallSite[481].callGroovyObjectGetProperty(variantData)))) {
      arrayOfCallSite[482]
        .call(arrayOfCallSite[483].call(arrayOfCallSite[484].callGroovyObjectGetProperty(this)), arrayOfCallSite[485].call(arrayOfCallSite[486].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[487]
        .call(arrayOfCallSite[488].call(arrayOfCallSite[489].callGroovyObjectGetProperty(this)), arrayOfCallSite[490].call(arrayOfCallSite[491].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[492]
        .call(arrayOfCallSite[493].call(arrayOfCallSite[494].callGroovyObjectGetProperty(this)), arrayOfCallSite[495].call(arrayOfCallSite[496].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[497]
        
        .call(arrayOfCallSite[498].call(arrayOfCallSite[499].call(arrayOfCallSite[500].callGroovyObjectGetProperty(this)), arrayOfCallSite[501].call(arrayOfCallSite[502].callGroovyObjectGetProperty(this))), arrayOfCallSite[503].call(arrayOfCallSite[504].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[505]
        .call(arrayOfCallSite[506].call(arrayOfCallSite[507].callGroovyObjectGetProperty(this)), arrayOfCallSite[508].call(arrayOfCallSite[509].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[510]
        .call(arrayOfCallSite[511].call(arrayOfCallSite[512].callGroovyObjectGetProperty(this)), arrayOfCallSite[513].call(arrayOfCallSite[514].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[515]
        .call(arrayOfCallSite[516].call(arrayOfCallSite[517].callGroovyObjectGetProperty(this)), arrayOfCallSite[518].call(arrayOfCallSite[519].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[520]
        .call(arrayOfCallSite[521].call(arrayOfCallSite[522].callGroovyObjectGetProperty(this)), arrayOfCallSite[523].call(arrayOfCallSite[524].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[525]
        .call(arrayOfCallSite[526].call(arrayOfCallSite[527].callGroovyObjectGetProperty(this)), arrayOfCallSite[528].call(arrayOfCallSite[529].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[530]
        
        .call(arrayOfCallSite[531].call(arrayOfCallSite[532].call(arrayOfCallSite[533].call(arrayOfCallSite[534].callGroovyObjectGetProperty(this)), arrayOfCallSite[535].call(arrayOfCallSite[536].callGroovyObjectGetProperty(this))), arrayOfCallSite[537].call(arrayOfCallSite[538].callGroovyObjectGetProperty(this))), arrayOfCallSite[539].call(arrayOfCallSite[540].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[541]
        .call(arrayOfCallSite[542].call(arrayOfCallSite[543].callGroovyObjectGetProperty(this)), arrayOfCallSite[544].call(arrayOfCallSite[545].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[546]
        .call(arrayOfCallSite[547].call(arrayOfCallSite[548].callGroovyObjectGetProperty(this)), arrayOfCallSite[549].call(arrayOfCallSite[550].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[551]
        .call(arrayOfCallSite[552].call(arrayOfCallSite[553].callGroovyObjectGetProperty(this)), arrayOfCallSite[554].call(arrayOfCallSite[555].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[556]
        
        .call(arrayOfCallSite[557].call(arrayOfCallSite[558].call(arrayOfCallSite[559].call(arrayOfCallSite[560].callGroovyObjectGetProperty(this)), arrayOfCallSite[561].call(arrayOfCallSite[562].callGroovyObjectGetProperty(this))), arrayOfCallSite[563].call(arrayOfCallSite[564].callGroovyObjectGetProperty(this))), arrayOfCallSite[565].call(arrayOfCallSite[566].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[567]
        
        .call(arrayOfCallSite[568].call(arrayOfCallSite[569].call(arrayOfCallSite[570].callGroovyObjectGetProperty(this)), arrayOfCallSite[571].call(arrayOfCallSite[572].callGroovyObjectGetProperty(this))), arrayOfCallSite[573].call(arrayOfCallSite[574].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[575]
        
        .call(arrayOfCallSite[576].call(arrayOfCallSite[577].call(arrayOfCallSite[578].callGroovyObjectGetProperty(this)), arrayOfCallSite[579].call(arrayOfCallSite[580].callGroovyObjectGetProperty(this))), arrayOfCallSite[581].call(arrayOfCallSite[582].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[583]
        .call(arrayOfCallSite[584].call(arrayOfCallSite[585].callGroovyObjectGetProperty(this)), arrayOfCallSite[586].call(arrayOfCallSite[587].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[588].callCurrent(this, variantData);
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[589].callGetProperty(arrayOfCallSite[590].callGroovyObjectGetProperty(variantData)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[591].call(arrayOfCallSite[592].callGetProperty(arrayOfCallSite[593].callGroovyObjectGetProperty(variantData)))))) {
        arrayOfCallSite[594]
          .call(arrayOfCallSite[595].call(arrayOfCallSite[596].callGroovyObjectGetProperty(this)), arrayOfCallSite[597].call(arrayOfCallSite[598].callGroovyObjectGetProperty(this)));
        arrayOfCallSite[599]
          .call(arrayOfCallSite[600].call(arrayOfCallSite[601].callGroovyObjectGetProperty(this)), arrayOfCallSite[602].call(arrayOfCallSite[603].callGroovyObjectGetProperty(this)));
      } else {
        arrayOfCallSite[604]
          
          .call(arrayOfCallSite[605].call(arrayOfCallSite[606].call(arrayOfCallSite[607].callGroovyObjectGetProperty(this)), arrayOfCallSite[608].call(arrayOfCallSite[609].callGroovyObjectGetProperty(this))), arrayOfCallSite[610].call(arrayOfCallSite[611].callGroovyObjectGetProperty(this)));
      } 
      arrayOfCallSite[612]
        .call(arrayOfCallSite[613].call(arrayOfCallSite[614].callGroovyObjectGetProperty(this)), arrayOfCallSite[615].call(arrayOfCallSite[616].callGroovyObjectGetProperty(this)));
    } 
  }
  
  public void configureLiteModule(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File ohosTestConfigFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[617].call(project, arrayOfCallSite[618].call(arrayOfCallSite[619].call(variantData))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[620].call(ohosTestConfigFile))) {
      ConfigInfo ohosTestConfig = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[621].callConstructor(ConfigInfo.class, project, arrayOfCallSite[622].call(arrayOfCallSite[623].call(variantData))), ConfigInfo.class);
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[624].call(arrayOfCallSite[625].callGroovyObjectGetProperty(variantData), arrayOfCallSite[626].callGetProperty(BuildConst.class))) && ScriptBytecodeAdapter.compareEqual("feature", arrayOfCallSite[627].call(ohosTestConfig)))) {
        String dependVariantName = ShortTypeHandling.castToString(arrayOfCallSite[628].call(arrayOfCallSite[629].call(arrayOfCallSite[630].callGroovyObjectGetProperty(variantData), Integer.valueOf(0), arrayOfCallSite[631].call(arrayOfCallSite[632].call(arrayOfCallSite[633].callGroovyObjectGetProperty(variantData)), Integer.valueOf(8)))));
        arrayOfCallSite[634]
          .call(arrayOfCallSite[635].call(arrayOfCallSite[636].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "OhosTestResources" })), arrayOfCallSite[637].call(arrayOfCallSite[638].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "merge", "Profile" })));
      } 
    } 
  }
  
  public void configureEntryModule(Project project, VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Configuration configuration = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[639].call(arrayOfCallSite[640].call(project), arrayOfCallSite[641].callGetProperty(HarmonyConfigurationNames.class)), Configuration.class);
    File ohosTestConfigFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[642].call(project, arrayOfCallSite[643].call(arrayOfCallSite[644].call(variantData))), File.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[645].call(ohosTestConfigFile))) {
      ConfigInfo ohosTestConfig = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[646].callConstructor(ConfigInfo.class, project, arrayOfCallSite[647].call(arrayOfCallSite[648].call(variantData))), ConfigInfo.class);
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[649].call(arrayOfCallSite[650].callGroovyObjectGetProperty(variantData), arrayOfCallSite[651].callGetProperty(BuildConst.class))) && ScriptBytecodeAdapter.compareEqual("feature", arrayOfCallSite[652].call(ohosTestConfig)))) {
        String dependVariantName = ShortTypeHandling.castToString(arrayOfCallSite[653].call(arrayOfCallSite[654].call(variantData)));
        arrayOfCallSite[655]
          
          .call(arrayOfCallSite[656].call(arrayOfCallSite[657].call(arrayOfCallSite[658].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "generate", "OhosTestShell" })), arrayOfCallSite[659].call(arrayOfCallSite[660].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "Resources" }))), arrayOfCallSite[661].call(arrayOfCallSite[662].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "sign", "Shell" })));
        arrayOfCallSite[663]
          .call(arrayOfCallSite[664].call(arrayOfCallSite[665].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "OhosTestJavaWithJavac" })), arrayOfCallSite[666].call(arrayOfCallSite[667].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "merge", "JavaResource" })));
        arrayOfCallSite[668]
          .call(arrayOfCallSite[669].call(arrayOfCallSite[670].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "OhosTestResources" })), arrayOfCallSite[671].call(arrayOfCallSite[672].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "merge", "Profile" })));
      } 
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[673].call(arrayOfCallSite[674].callGroovyObjectGetProperty(variantData), arrayOfCallSite[675].callGetProperty(BuildConst.class))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[676].call(variantData)))) {
        List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[677].call(ModuleExtensionData.class, project), List.class);
        String entryModule;
        Iterator iterator;
        for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[678].call(entryModules), Iterator.class); iterator.hasNext(); ) {
          entryModule = ShortTypeHandling.castToString(iterator.next());
          Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[679].call(arrayOfCallSite[680].call(arrayOfCallSite[681].call(project)), entryModule), Project.class);
          if (ScriptBytecodeAdapter.compareEqual(entryProject, null))
            throw (Throwable)arrayOfCallSite[682].callConstructor(GradleException.class, arrayOfCallSite[683].call(arrayOfCallSite[684].call("Entry module ", entryModule), " does not exist. Check entryModules in build.gradle.")); 
          arrayOfCallSite[685]
            .call(arrayOfCallSite[686].call(arrayOfCallSite[687].call(project), arrayOfCallSite[688].call(variantData, "assemble", "")), arrayOfCallSite[689].call(configuration, Boolean.valueOf(true), "signDebugHap"));
        } 
      } 
    } 
    if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[690].call(variantData)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[691].callGetProperty(arrayOfCallSite[692].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[693].callGetProperty(VariantModel.class)))) {
      List entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[694].call(ModuleExtensionData.class, project), List.class);
      String entryModule;
      Iterator iterator;
      for (entryModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[695].call(entryModules), Iterator.class); iterator.hasNext(); ) {
        entryModule = ShortTypeHandling.castToString(iterator.next());
        Project entryProject = (Project)ScriptBytecodeAdapter.castToType(arrayOfCallSite[696].call(arrayOfCallSite[697].call(arrayOfCallSite[698].call(project)), entryModule), Project.class);
        if (ScriptBytecodeAdapter.compareEqual(entryProject, null))
          throw (Throwable)arrayOfCallSite[699].callConstructor(GradleException.class, arrayOfCallSite[700].call(arrayOfCallSite[701].call("Entry module ", entryModule), " does not exist. Check entryModules in build.gradle.")); 
        arrayOfCallSite[702]
          
          .call(arrayOfCallSite[703].call(arrayOfCallSite[704].call(project), arrayOfCallSite[705].call(variantData, "package", "shell")), arrayOfCallSite[706].call(configuration, Boolean.valueOf(true), arrayOfCallSite[707].call(variantData, "package", "shell")));
        arrayOfCallSite[708]
          
          .call(arrayOfCallSite[709].call(arrayOfCallSite[710].call(project), arrayOfCallSite[711].call(variantData, "package", "simplifyShell")), arrayOfCallSite[712].call(configuration, Boolean.valueOf(true), arrayOfCallSite[713].call(variantData, "package", "simplifyShell")));
      } 
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[714].callGetProperty(arrayOfCallSite[715].callGroovyObjectGetProperty(variantData)), arrayOfCallSite[716].callGetProperty(VariantModel.class))) {
      String dependVariantName = ShortTypeHandling.castToString(arrayOfCallSite[717].call(arrayOfCallSite[718].call(variantData)));
      arrayOfCallSite[719]
        .call(arrayOfCallSite[720].call(arrayOfCallSite[721].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "TestJavaWithJavac" })), arrayOfCallSite[722].call(arrayOfCallSite[723].call(project), new GStringImpl(new Object[] { dependVariantName }, new String[] { "compile", "JavaWithJavac" })));
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
