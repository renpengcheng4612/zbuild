package com.huawei.ohos.build.utils.configJson;

import com.huawei.ohos.build.enumlation.CompareTestProfileEnum;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.ApiVersionOptions;
import com.huawei.ohos.build.shell.AppOptions;
import com.huawei.ohos.build.shell.ArkOptions;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.DeviceConfigOptions;
import com.huawei.ohos.build.shell.DistroOptions;
import com.huawei.ohos.build.shell.JsOptions;
import com.huawei.ohos.build.shell.ModuleOptions;
import com.huawei.ohos.build.shell.NetworkOptions;
import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.shell.VersionOptions;
import com.huawei.ohos.build.shell.js.WindowOptions;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class CompareTestProfileUtil implements GroovyObject {
  private static final HMLogger HM_LOGGER;
  
  private static String packageName;
  
  private static String defaultValueError;
  
  private static String endWithError;
  
  private static String nonConsistentFieldError;
  
  private static String nonConsistentError;
  
  static {
    String str1 = "The tag '%s' content of the test module is inconsistent with that of the main module.", str2 = "The '%s' sub-tag '%s' content of the test module is inconsistent with that of the main module.", str3 = "The 'distro' sub-tag 'moduleName' naming rule not comply with the combination of moduleName and '_test' of the main project", str4 = "The '%s' sub-tag '%s' content of the test module is inconsistent with that of the default value.";
    Object object = $getCallSiteArray()[79].call(HMLogger.class, CompareTestProfileUtil.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static <T> void compareProfile(Object mainConfigOptions, Object testConfigOptions, Class clazz) {
    Reference reference1 = new Reference(mainConfigOptions), reference2 = new Reference(testConfigOptions), reference3 = new Reference(clazz);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(reference2.get(), null))
      return; 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && ScriptBytecodeAdapter.compareEqual(reference1.get(), null))) {
        arrayOfCallSite[6].call(HM_LOGGER, nonConsistentError, arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(reference3.get()), Integer.valueOf(0), arrayOfCallSite[10].call(arrayOfCallSite[11].callGetProperty(reference3.get()), "O"))));
        return;
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(reference2.get(), null) && ScriptBytecodeAdapter.compareEqual(reference1.get(), null))) {
      arrayOfCallSite[0].call(HM_LOGGER, nonConsistentError, arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(reference3.get()), Integer.valueOf(0), arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(reference3.get()), "O"))));
      return;
    } 
    if (ScriptBytecodeAdapter.compareEqual(reference3.get(), ConfigOptions.class)) {
      ConfigOptions mainConfig = (ConfigOptions)ScriptBytecodeAdapter.castToType(reference1.get(), ConfigOptions.class);
      Object object = arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGroovyObjectGetProperty(mainConfig));
      packageName = ShortTypeHandling.castToString(object);
    } 
    Field[] fields = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(reference3.get()), Field[].class);
    arrayOfCallSite[15].call(fields, new _compareProfile_closure1(CompareTestProfileUtil.class, CompareTestProfileUtil.class, reference1, reference2, reference3));
  }
  
  public final class _compareProfile_closure1 extends Closure implements GeneratedClosure {
    public _compareProfile_closure1(Object _outerInstance, Object _thisObject, Reference mainConfigOptions, Reference testConfigOptions, Reference clazz) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mainConfigOptions;
      this.mainConfigOptions = reference1;
      Reference reference2 = testConfigOptions;
      this.testConfigOptions = reference2;
      Reference reference3 = clazz;
      this.clazz = reference3;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(field), "$stMC")))
        return null; 
      Class type = ShortTypeHandling.castToClass(arrayOfCallSite[2].call(field));
      String getMethod = ShortTypeHandling.castToString(arrayOfCallSite[3].call(TransformUtil.class, field));
      Object mainValue = arrayOfCallSite[4].call(this.mainConfigOptions.get(), getMethod, null);
      Object testValue = arrayOfCallSite[5].call(this.testConfigOptions.get(), getMethod, null);
      Class clazz1 = type;
      if (ScriptBytecodeAdapter.isCase(clazz1, String.class) || ScriptBytecodeAdapter.isCase(clazz1, Boolean.class) || ScriptBytecodeAdapter.isCase(clazz1, Integer.class)) {
        if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), AbilitiesOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(CompareTestProfileEnum.AbilityEnum.class, arrayOfCallSite[7].callGetProperty(field))))) {
          String defaultValue = ShortTypeHandling.castToString(arrayOfCallSite[8].call(arrayOfCallSite[9].call(CompareTestProfileEnum.AbilityEnum.class, arrayOfCallSite[10].callGetProperty(field))));
          if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[44].callGetProperty(field), arrayOfCallSite[45].callGetProperty(arrayOfCallSite[46].callGetProperty(CompareTestProfileEnum.AbilityEnum.class)))) {
              if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[47].call(CompareTestProfileEnum.AbilityNameEnum.class, testValue))) {
                arrayOfCallSite[48].call(arrayOfCallSite[49].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[50].callGroovyObjectGetProperty(this), arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[54].call(arrayOfCallSite[55].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[56].callGetProperty(field));
                return null;
              } 
            } else {
              if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
                arrayOfCallSite[57].call(arrayOfCallSite[58].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[59].callGroovyObjectGetProperty(this), arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[63].call(arrayOfCallSite[64].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[65].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[66].callGetProperty(field));
                return null;
              } 
              if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[67].call(testValue), defaultValue))) {
                arrayOfCallSite[68].call(arrayOfCallSite[69].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[70].callGroovyObjectGetProperty(this), arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[74].call(arrayOfCallSite[75].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[76].callGetProperty(field));
                return null;
              } 
            } 
          } else if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[11].callGetProperty(field), arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(CompareTestProfileEnum.AbilityEnum.class)))) {
            if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call(CompareTestProfileEnum.AbilityNameEnum.class, testValue))) {
              arrayOfCallSite[15].call(arrayOfCallSite[16].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[17].callGroovyObjectGetProperty(this), arrayOfCallSite[18].call(arrayOfCallSite[19].call(arrayOfCallSite[20].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[21].call(arrayOfCallSite[22].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[23].callGetProperty(field));
              return null;
            } 
          } else {
            if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
              arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[26].callGroovyObjectGetProperty(this), arrayOfCallSite[27].call(arrayOfCallSite[28].call(arrayOfCallSite[29].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[30].call(arrayOfCallSite[31].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[32].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[33].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[34].call(testValue), defaultValue))) {
              arrayOfCallSite[35].call(arrayOfCallSite[36].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[37].callGroovyObjectGetProperty(this), arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[41].call(arrayOfCallSite[42].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[43].callGetProperty(field));
              return null;
            } 
          } 
        } 
        if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ModuleOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[77].call(CompareTestProfileEnum.ModuleEnum.class, arrayOfCallSite[78].callGetProperty(field))))) {
          String defaultValue = ShortTypeHandling.castToString(arrayOfCallSite[79].call(arrayOfCallSite[80].call(CompareTestProfileEnum.ModuleEnum.class, arrayOfCallSite[81].callGetProperty(field))));
          if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
              arrayOfCallSite[102].call(arrayOfCallSite[103].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[104].callGroovyObjectGetProperty(this), arrayOfCallSite[105].call(arrayOfCallSite[106].call(arrayOfCallSite[107].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[108].call(arrayOfCallSite[109].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[110].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[111].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[112].call(testValue), defaultValue))) {
              arrayOfCallSite[113].call(arrayOfCallSite[114].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[115].callGroovyObjectGetProperty(this), arrayOfCallSite[116].call(arrayOfCallSite[117].call(arrayOfCallSite[118].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[119].call(arrayOfCallSite[120].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[121].callGetProperty(field));
              return null;
            } 
          } else {
            if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
              arrayOfCallSite[82].call(arrayOfCallSite[83].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[84].callGroovyObjectGetProperty(this), arrayOfCallSite[85].call(arrayOfCallSite[86].call(arrayOfCallSite[87].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[88].call(arrayOfCallSite[89].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[90].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[91].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[92].call(testValue), defaultValue))) {
              arrayOfCallSite[93].call(arrayOfCallSite[94].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[95].callGroovyObjectGetProperty(this), arrayOfCallSite[96].call(arrayOfCallSite[97].call(arrayOfCallSite[98].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[99].call(arrayOfCallSite[100].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[101].callGetProperty(field));
              return null;
            } 
          } 
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DistroOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[158].call(CompareTestProfileEnum.DistroEnum.class, arrayOfCallSite[159].callGetProperty(field))))) {
            if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[160].callGetProperty(field), arrayOfCallSite[161].callGetProperty(arrayOfCallSite[162].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && ScriptBytecodeAdapter.compareNotEqual(testValue, arrayOfCallSite[163].call(mainValue, "_test")))) {
              arrayOfCallSite[164].call(arrayOfCallSite[165].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[166].callGroovyObjectGetProperty(this));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[167].callGetProperty(field), arrayOfCallSite[168].callGetProperty(arrayOfCallSite[169].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && 
              ScriptBytecodeAdapter.compareNotEqual(testValue, arrayOfCallSite[170].call(arrayOfCallSite[171].call(CompareTestProfileEnum.DistroEnum.class, arrayOfCallSite[172].callGetProperty(field)))))) {
              arrayOfCallSite[173].call(arrayOfCallSite[174].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[175].callGroovyObjectGetProperty(this), arrayOfCallSite[176].call(arrayOfCallSite[177].call(arrayOfCallSite[178].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[179].call(arrayOfCallSite[180].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[181].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[182].callGetProperty(field), arrayOfCallSite[183].callGetProperty(arrayOfCallSite[184].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && ScriptBytecodeAdapter.compareNotEqual(testValue, mainValue))) {
              arrayOfCallSite[185].call(arrayOfCallSite[186].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[187].callGroovyObjectGetProperty(this), arrayOfCallSite[188].call(arrayOfCallSite[189].call(arrayOfCallSite[190].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[191].call(arrayOfCallSite[192].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[193].callGetProperty(field));
              return null;
            } 
          } 
        } else if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DistroOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[122].call(CompareTestProfileEnum.DistroEnum.class, arrayOfCallSite[123].callGetProperty(field))))) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[124].callGetProperty(field), arrayOfCallSite[125].callGetProperty(arrayOfCallSite[126].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && ScriptBytecodeAdapter.compareNotEqual(testValue, arrayOfCallSite[127].call(mainValue, "_test")))) {
            arrayOfCallSite[128].call(arrayOfCallSite[129].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[130].callGroovyObjectGetProperty(this));
            return null;
          } 
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[131].callGetProperty(field), arrayOfCallSite[132].callGetProperty(arrayOfCallSite[133].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && ScriptBytecodeAdapter.compareNotEqual(testValue, arrayOfCallSite[134].call(arrayOfCallSite[135].call(CompareTestProfileEnum.DistroEnum.class, arrayOfCallSite[136].callGetProperty(field)))))) {
            arrayOfCallSite[137].call(arrayOfCallSite[138].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[139].callGroovyObjectGetProperty(this), arrayOfCallSite[140].call(arrayOfCallSite[141].call(arrayOfCallSite[142].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[143].call(arrayOfCallSite[144].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[145].callGetProperty(field));
            return null;
          } 
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[146].callGetProperty(field), arrayOfCallSite[147].callGetProperty(arrayOfCallSite[148].callGetProperty(CompareTestProfileEnum.DistroEnum.class))) && ScriptBytecodeAdapter.compareNotEqual(testValue, mainValue))) {
            arrayOfCallSite[149].call(arrayOfCallSite[150].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[151].callGroovyObjectGetProperty(this), arrayOfCallSite[152].call(arrayOfCallSite[153].call(arrayOfCallSite[154].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[155].call(arrayOfCallSite[156].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[157].callGetProperty(field));
            return null;
          } 
        } 
        if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), JsOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[194].call(CompareTestProfileEnum.JsEnum.class, arrayOfCallSite[195].callGetProperty(field))))) {
          String defaultValue = ShortTypeHandling.castToString(arrayOfCallSite[196].call(arrayOfCallSite[197].call(CompareTestProfileEnum.JsEnum.class, arrayOfCallSite[198].callGetProperty(field))));
          if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
              arrayOfCallSite[219].call(arrayOfCallSite[220].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[221].callGroovyObjectGetProperty(this), arrayOfCallSite[222].call(arrayOfCallSite[223].call(arrayOfCallSite[224].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[225].call(arrayOfCallSite[226].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[227].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[228].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[229].call(testValue), defaultValue))) {
              arrayOfCallSite[230].call(arrayOfCallSite[231].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[232].callGroovyObjectGetProperty(this), arrayOfCallSite[233].call(arrayOfCallSite[234].call(arrayOfCallSite[235].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[236].call(arrayOfCallSite[237].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[238].callGetProperty(field));
              return null;
            } 
          } else {
            if ((ScriptBytecodeAdapter.compareEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) {
              arrayOfCallSite[199].call(arrayOfCallSite[200].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[201].callGroovyObjectGetProperty(this), arrayOfCallSite[202].call(arrayOfCallSite[203].call(arrayOfCallSite[204].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[205].call(arrayOfCallSite[206].callGetProperty(this.clazz.get()), "O"))), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[207].callGetProperty(field), "packageName") ? "package" : arrayOfCallSite[208].callGetProperty(field));
              return null;
            } 
            if ((ScriptBytecodeAdapter.compareNotEqual(defaultValue, "") && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[209].call(testValue), defaultValue))) {
              arrayOfCallSite[210].call(arrayOfCallSite[211].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[212].callGroovyObjectGetProperty(this), arrayOfCallSite[213].call(arrayOfCallSite[214].call(arrayOfCallSite[215].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[216].call(arrayOfCallSite[217].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[218].callGetProperty(field));
              return null;
            } 
          } 
        } 
        if ((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), WindowOptions.class) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[239].call(CompareTestProfileEnum.WindowEnum.class, arrayOfCallSite[240].callGetProperty(field))))) {
          String defaultValue = ShortTypeHandling.castToString(arrayOfCallSite[241].call(arrayOfCallSite[242].call(CompareTestProfileEnum.WindowEnum.class, arrayOfCallSite[243].callGetProperty(field))));
          if (ScriptBytecodeAdapter.compareNotEqual(defaultValue, arrayOfCallSite[244].call(testValue))) {
            arrayOfCallSite[245].call(arrayOfCallSite[246].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[247].callGroovyObjectGetProperty(this), arrayOfCallSite[248].call(arrayOfCallSite[249].call(arrayOfCallSite[250].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[251].call(arrayOfCallSite[252].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[253].callGetProperty(field));
            return null;
          } 
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((((((((((((((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), AppOptions.class) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DeviceConfigOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), VersionOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ApiVersionOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ArkOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), NetworkOptions.class))) && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) && ScriptBytecodeAdapter.compareNotEqual(testValue, null))) {
            arrayOfCallSite[263].call(arrayOfCallSite[264].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[265].callGroovyObjectGetProperty(this), arrayOfCallSite[266].call(arrayOfCallSite[267].call(arrayOfCallSite[268].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[269].call(arrayOfCallSite[270].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[271].callGetProperty(field));
            return null;
          } 
          return null;
        } 
        if ((((((((((((((ScriptBytecodeAdapter.compareEqual(this.clazz.get(), AppOptions.class) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), DeviceConfigOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), VersionOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ApiVersionOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), ArkOptions.class))) || ScriptBytecodeAdapter.compareEqual(this.clazz.get(), NetworkOptions.class))) && ScriptBytecodeAdapter.compareNotEqual(mainValue, testValue))) && ScriptBytecodeAdapter.compareNotEqual(testValue, null))) {
          arrayOfCallSite[254].call(arrayOfCallSite[255].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[256].callGroovyObjectGetProperty(this), arrayOfCallSite[257].call(arrayOfCallSite[258].call(arrayOfCallSite[259].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[260].call(arrayOfCallSite[261].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[262].callGetProperty(field));
          return null;
        } 
        return null;
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, List.class)) {
        Class subObjectClass = ShortTypeHandling.castToClass(arrayOfCallSite[272].call(TransformUtil.class, field));
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[273].callStatic(CompareTestProfileUtil.class, this.mainConfigOptions.get(), this.testConfigOptions.get(), field, subObjectClass))) {
          arrayOfCallSite[274].call(arrayOfCallSite[275].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[276].callGroovyObjectGetProperty(this), arrayOfCallSite[277].call(arrayOfCallSite[278].call(arrayOfCallSite[279].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[280].call(arrayOfCallSite[281].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[282].callGetProperty(field));
          return null;
        } 
        return null;
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Map.class)) {
        Reference mainMap = new Reference(ScriptBytecodeAdapter.asType(arrayOfCallSite[283].call(this.mainConfigOptions.get(), getMethod, null), Map.class));
        Reference testMap = new Reference(ScriptBytecodeAdapter.asType(arrayOfCallSite[284].call(this.testConfigOptions.get(), getMethod, null), Map.class));
        if ((ScriptBytecodeAdapter.compareEqual(testMap.get(), null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[285].call(testMap.get()))))
          return null; 
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[297].call(testMap.get()), Integer.valueOf(0)) && ((ScriptBytecodeAdapter.compareEqual(mainMap.get(), null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[298].call(mainMap.get())))))) {
            arrayOfCallSite[299].call(arrayOfCallSite[300].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[301].callGroovyObjectGetProperty(this), arrayOfCallSite[302].call(arrayOfCallSite[303].call(arrayOfCallSite[304].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[305].call(arrayOfCallSite[306].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[307].callGetProperty(field));
            return null;
          } 
        } else if ((ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[286].call(testMap.get()), Integer.valueOf(0)) && ((ScriptBytecodeAdapter.compareEqual(mainMap.get(), null) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[287].call(mainMap.get())))))) {
          arrayOfCallSite[288].call(arrayOfCallSite[289].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[290].callGroovyObjectGetProperty(this), arrayOfCallSite[291].call(arrayOfCallSite[292].call(arrayOfCallSite[293].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[294].call(arrayOfCallSite[295].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[296].callGetProperty(field));
          return null;
        } 
        Set mainSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[308].callConstructor(HashSet.class, arrayOfCallSite[309].call(mainMap.get())), Set.class);
        Set testSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[310].callConstructor(HashSet.class, arrayOfCallSite[311].call(testMap.get())), Set.class);
        arrayOfCallSite[312].call(testSet, mainSet);
        if (ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[313].call(testSet), Integer.valueOf(0))) {
          arrayOfCallSite[314].call(arrayOfCallSite[315].callGetProperty(CompareTestProfileUtil.class), arrayOfCallSite[316].callGroovyObjectGetProperty(this), arrayOfCallSite[317].call(arrayOfCallSite[318].call(arrayOfCallSite[319].callGetProperty(this.clazz.get()), Integer.valueOf(0), arrayOfCallSite[320].call(arrayOfCallSite[321].callGetProperty(this.clazz.get()), "O"))), arrayOfCallSite[322].callGetProperty(field));
          return null;
        } 
        return arrayOfCallSite[323].call(testMap.get(), new _closure5(this, getThisObject(), testMap, mainMap));
      } 
      if (ScriptBytecodeAdapter.isCase(clazz1, Options.class))
        return arrayOfCallSite[324].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[325].call(this.mainConfigOptions.get(), getMethod, null), arrayOfCallSite[326].call(this.testConfigOptions.get(), getMethod, null), type); 
      if (ScriptBytecodeAdapter.isCase(clazz1, WindowOptions.class))
        return arrayOfCallSite[327].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[328].call(this.mainConfigOptions.get(), getMethod, null), arrayOfCallSite[329].call(this.testConfigOptions.get(), getMethod, null), type); 
      return null;
    }
    
    @Generated
    public Object getMainConfigOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.mainConfigOptions.get();
    }
    
    @Generated
    public Object getTestConfigOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.testConfigOptions.get();
    }
    
    @Generated
    public Class getClazz() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToClass(this.clazz.get());
    }
    
    public final class _closure5 extends Closure implements GeneratedClosure {
      public _closure5(Object _outerInstance, Object _thisObject, Reference testMap, Reference mainMap) {
        super(_outerInstance, _thisObject);
        Reference reference1 = testMap;
        this.testMap = reference1;
        Reference reference2 = mainMap;
        this.mainMap = reference2;
      }
      
      public Object doCall(Object k, Object v) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        Class valueType = ShortTypeHandling.castToClass(arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].call(this.testMap.get(), k)));
        Class clazz1 = valueType;
        if (ScriptBytecodeAdapter.isCase(clazz1, Options.class))
          return arrayOfCallSite[2].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[3].call(this.mainMap.get(), k), v, valueType); 
        return null;
      }
      
      public Object call(Object k, Object v) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[4].callCurrent((GroovyObject)this, k, v);
      }
      
      @Generated
      public Map getTestMap() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Map)ScriptBytecodeAdapter.castToType(this.testMap.get(), Map.class);
      }
      
      @Generated
      public Map getMainMap() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (Map)ScriptBytecodeAdapter.castToType(this.mainMap.get(), Map.class);
      }
    }
  }
  
  public static <T, E> boolean disposeList(Object mainConfigOptions, Object testConfigOptions, Field curListField, Class clazz) {
    // Byte code:
    //   0: aload_3
    //   1: new groovy/lang/Reference
    //   4: dup_x1
    //   5: swap
    //   6: invokespecial <init> : (Ljava/lang/Object;)V
    //   9: astore #4
    //   11: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    //   14: astore #5
    //   16: aload #5
    //   18: ldc 16
    //   20: aaload
    //   21: ldc com/huawei/ohos/build/utils/configJson/TransformUtil
    //   23: aload_2
    //   24: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   29: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   32: checkcast java/lang/String
    //   35: astore #6
    //   37: aload #6
    //   39: pop
    //   40: aload #5
    //   42: ldc 17
    //   44: aaload
    //   45: aload_0
    //   46: aload #6
    //   48: aconst_null
    //   49: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   54: ldc java/util/List
    //   56: invokestatic asType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   59: checkcast java/util/List
    //   62: astore #7
    //   64: aload #7
    //   66: pop
    //   67: aload #5
    //   69: ldc 18
    //   71: aaload
    //   72: aload_1
    //   73: aload #6
    //   75: aconst_null
    //   76: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   81: ldc java/util/List
    //   83: invokestatic asType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   86: checkcast java/util/List
    //   89: astore #8
    //   91: aload #8
    //   93: pop
    //   94: aload #8
    //   96: aconst_null
    //   97: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   100: ifeq -> 108
    //   103: aconst_null
    //   104: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   107: ireturn
    //   108: aload #4
    //   110: invokevirtual get : ()Ljava/lang/Object;
    //   113: checkcast java/lang/Class
    //   116: astore #9
    //   118: aload #9
    //   120: ldc java/lang/String
    //   122: invokestatic isCase : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   125: ifeq -> 573
    //   128: invokestatic isOrigInt : ()Z
    //   131: ifeq -> 155
    //   134: invokestatic isOrigZ : ()Z
    //   137: ifeq -> 155
    //   140: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.__$stMC : Z
    //   143: ifne -> 155
    //   146: invokestatic disabledStandardMetaClass : ()Z
    //   149: ifne -> 155
    //   152: goto -> 305
    //   155: aload #5
    //   157: ldc 19
    //   159: aaload
    //   160: aload_2
    //   161: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   166: ldc 'pages'
    //   168: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   171: ifeq -> 272
    //   174: aload #5
    //   176: ldc 20
    //   178: aaload
    //   179: aload #8
    //   181: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   186: iconst_1
    //   187: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   190: invokestatic compareGreaterThan : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   193: ifne -> 260
    //   196: aload #5
    //   198: ldc 21
    //   200: aaload
    //   201: aload #8
    //   203: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   208: iconst_1
    //   209: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   212: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   215: ifeq -> 256
    //   218: aload #5
    //   220: ldc 22
    //   222: aaload
    //   223: aload #5
    //   225: ldc 23
    //   227: aaload
    //   228: aload #8
    //   230: iconst_0
    //   231: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   234: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   239: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   244: ldc 'pages/index/index'
    //   246: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   249: ifeq -> 256
    //   252: iconst_1
    //   253: goto -> 257
    //   256: iconst_0
    //   257: ifeq -> 264
    //   260: iconst_1
    //   261: goto -> 265
    //   264: iconst_0
    //   265: ifeq -> 272
    //   268: iconst_1
    //   269: goto -> 273
    //   272: iconst_0
    //   273: ifeq -> 302
    //   276: aload #5
    //   278: ldc 24
    //   280: aaload
    //   281: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   284: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.defaultValueError : Ljava/lang/String;
    //   287: ldc 'js'
    //   289: ldc 'pages'
    //   291: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: aconst_null
    //   298: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   301: ireturn
    //   302: goto -> 452
    //   305: aload #5
    //   307: ldc 25
    //   309: aaload
    //   310: aload_2
    //   311: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   316: ldc 'pages'
    //   318: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   321: ifeq -> 422
    //   324: aload #5
    //   326: ldc 26
    //   328: aaload
    //   329: aload #8
    //   331: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   336: iconst_1
    //   337: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   340: invokestatic compareGreaterThan : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   343: ifne -> 410
    //   346: aload #5
    //   348: ldc 27
    //   350: aaload
    //   351: aload #8
    //   353: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   358: iconst_1
    //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   362: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   365: ifeq -> 406
    //   368: aload #5
    //   370: ldc 28
    //   372: aaload
    //   373: aload #5
    //   375: ldc 29
    //   377: aaload
    //   378: aload #8
    //   380: iconst_0
    //   381: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   384: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   389: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   394: ldc 'pages/index/index'
    //   396: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   399: ifeq -> 406
    //   402: iconst_1
    //   403: goto -> 407
    //   406: iconst_0
    //   407: ifeq -> 414
    //   410: iconst_1
    //   411: goto -> 415
    //   414: iconst_0
    //   415: ifeq -> 422
    //   418: iconst_1
    //   419: goto -> 423
    //   422: iconst_0
    //   423: ifeq -> 452
    //   426: aload #5
    //   428: ldc 30
    //   430: aaload
    //   431: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   434: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.defaultValueError : Ljava/lang/String;
    //   437: ldc 'js'
    //   439: ldc 'pages'
    //   441: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   446: pop
    //   447: aconst_null
    //   448: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   451: ireturn
    //   452: invokestatic isOrigZ : ()Z
    //   455: ifeq -> 473
    //   458: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.__$stMC : Z
    //   461: ifne -> 473
    //   464: invokestatic disabledStandardMetaClass : ()Z
    //   467: ifne -> 473
    //   470: goto -> 504
    //   473: aload #7
    //   475: aconst_null
    //   476: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   479: ifne -> 491
    //   482: aload #8
    //   484: aconst_null
    //   485: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   488: ifeq -> 495
    //   491: iconst_1
    //   492: goto -> 496
    //   495: iconst_0
    //   496: ifeq -> 501
    //   499: iconst_0
    //   500: ireturn
    //   501: goto -> 532
    //   504: aload #7
    //   506: aconst_null
    //   507: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   510: ifne -> 522
    //   513: aload #8
    //   515: aconst_null
    //   516: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   519: ifeq -> 526
    //   522: iconst_1
    //   523: goto -> 527
    //   526: iconst_0
    //   527: ifeq -> 532
    //   530: iconst_0
    //   531: ireturn
    //   532: aload #5
    //   534: ldc 31
    //   536: aaload
    //   537: aload #8
    //   539: aload #7
    //   541: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   546: pop
    //   547: aload #5
    //   549: ldc 32
    //   551: aaload
    //   552: aload #8
    //   554: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   559: iconst_0
    //   560: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   563: invokestatic compareGreaterThan : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   566: ireturn
    //   567: nop
    //   568: nop
    //   569: athrow
    //   570: nop
    //   571: nop
    //   572: athrow
    //   573: aload #9
    //   575: ldc com/huawei/ohos/build/shell/Options
    //   577: invokestatic isCase : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   580: ifeq -> 1574
    //   583: aload #5
    //   585: ldc 33
    //   587: aaload
    //   588: aload #4
    //   590: invokevirtual get : ()Ljava/lang/Object;
    //   593: checkcast java/lang/Class
    //   596: ldc 'getUniqueKey'
    //   598: aconst_null
    //   599: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   604: ldc java/lang/reflect/Method
    //   606: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   609: checkcast java/lang/reflect/Method
    //   612: astore #10
    //   614: aload #10
    //   616: pop
    //   617: aload #10
    //   619: aconst_null
    //   620: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   623: ifeq -> 631
    //   626: aconst_null
    //   627: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   630: ireturn
    //   631: aload #5
    //   633: ldc 34
    //   635: aaload
    //   636: ldc java/util/HashMap
    //   638: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   643: ldc java/util/Map
    //   645: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   648: checkcast java/util/Map
    //   651: new groovy/lang/Reference
    //   654: dup_x1
    //   655: swap
    //   656: invokespecial <init> : (Ljava/lang/Object;)V
    //   659: astore #11
    //   661: aload #11
    //   663: pop
    //   664: aload #5
    //   666: ldc 35
    //   668: aaload
    //   669: ldc java/util/HashMap
    //   671: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   676: ldc java/util/Map
    //   678: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   681: checkcast java/util/Map
    //   684: new groovy/lang/Reference
    //   687: dup_x1
    //   688: swap
    //   689: invokespecial <init> : (Ljava/lang/Object;)V
    //   692: astore #12
    //   694: aload #12
    //   696: pop
    //   697: aload #5
    //   699: ldc 36
    //   701: aaload
    //   702: aload #7
    //   704: new com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil$_disposeList_closure2
    //   707: dup
    //   708: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   710: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   712: aload #11
    //   714: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;)V
    //   717: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   722: pop
    //   723: aload #5
    //   725: ldc 37
    //   727: aaload
    //   728: aload #8
    //   730: new com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil$_disposeList_closure3
    //   733: dup
    //   734: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   736: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   738: aload #12
    //   740: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;)V
    //   743: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   748: pop
    //   749: aload #5
    //   751: ldc 38
    //   753: aaload
    //   754: ldc java/util/HashSet
    //   756: aload #5
    //   758: ldc 39
    //   760: aaload
    //   761: aload #11
    //   763: invokevirtual get : ()Ljava/lang/Object;
    //   766: checkcast java/util/Map
    //   769: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   774: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   779: ldc java/util/Collection
    //   781: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   784: checkcast java/util/Collection
    //   787: astore #13
    //   789: aload #13
    //   791: pop
    //   792: aload #4
    //   794: invokevirtual get : ()Ljava/lang/Object;
    //   797: checkcast java/lang/Class
    //   800: ldc com/huawei/ohos/build/shell/AbilitiesOptions
    //   802: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   805: ifeq -> 913
    //   808: aload #5
    //   810: ldc 40
    //   812: aaload
    //   813: aload #13
    //   815: aload #5
    //   817: ldc 41
    //   819: aaload
    //   820: aload #5
    //   822: ldc 42
    //   824: aaload
    //   825: ldc com/huawei/ohos/build/enumlation/CompareTestProfileEnum$AbilityNameEnum
    //   827: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   832: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   837: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   842: pop
    //   843: aload #5
    //   845: ldc 43
    //   847: aaload
    //   848: aload #13
    //   850: aload #5
    //   852: ldc 44
    //   854: aaload
    //   855: aload #5
    //   857: ldc 45
    //   859: aaload
    //   860: ldc com/huawei/ohos/build/enumlation/CompareTestProfileEnum$AbilityNameEnum
    //   862: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   867: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   872: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   877: pop
    //   878: aload #5
    //   880: ldc 46
    //   882: aaload
    //   883: aload #13
    //   885: aload #5
    //   887: ldc 47
    //   889: aaload
    //   890: aload #5
    //   892: ldc 48
    //   894: aaload
    //   895: ldc com/huawei/ohos/build/enumlation/CompareTestProfileEnum$AbilityNameEnum
    //   897: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   902: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   907: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   912: pop
    //   913: aload #5
    //   915: ldc 49
    //   917: aaload
    //   918: ldc java/util/HashSet
    //   920: aload #5
    //   922: ldc 50
    //   924: aaload
    //   925: aload #12
    //   927: invokevirtual get : ()Ljava/lang/Object;
    //   930: checkcast java/util/Map
    //   933: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   938: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   943: ldc java/util/Collection
    //   945: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   948: checkcast java/util/Collection
    //   951: astore #14
    //   953: aload #14
    //   955: pop
    //   956: aload #5
    //   958: ldc_w 51
    //   961: aaload
    //   962: aload #14
    //   964: aload #13
    //   966: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   971: pop
    //   972: invokestatic isOrigInt : ()Z
    //   975: ifeq -> 999
    //   978: invokestatic isOrigZ : ()Z
    //   981: ifeq -> 999
    //   984: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.__$stMC : Z
    //   987: ifne -> 999
    //   990: invokestatic disabledStandardMetaClass : ()Z
    //   993: ifne -> 999
    //   996: goto -> 1269
    //   999: aload #5
    //   1001: ldc_w 52
    //   1004: aaload
    //   1005: aload #14
    //   1007: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1012: iconst_0
    //   1013: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1016: invokestatic compareGreaterThan : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1019: ifeq -> 1266
    //   1022: aload #4
    //   1024: invokevirtual get : ()Ljava/lang/Object;
    //   1027: checkcast java/lang/Class
    //   1030: ldc com/huawei/ohos/build/shell/AbilitiesOptions
    //   1032: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1035: ifne -> 1055
    //   1038: aload #4
    //   1040: invokevirtual get : ()Ljava/lang/Object;
    //   1043: checkcast java/lang/Class
    //   1046: ldc_w com/huawei/ohos/build/shell/JsOptions
    //   1049: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1052: ifeq -> 1059
    //   1055: iconst_1
    //   1056: goto -> 1060
    //   1059: iconst_0
    //   1060: ifeq -> 1166
    //   1063: aload #5
    //   1065: ldc_w 53
    //   1068: aaload
    //   1069: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   1072: ldc_w 'The tag '%s' content of the test module is inconsistent with that of the default value.'
    //   1075: aload #5
    //   1077: ldc_w 54
    //   1080: aaload
    //   1081: aload #5
    //   1083: ldc_w 55
    //   1086: aaload
    //   1087: aload #5
    //   1089: ldc_w 56
    //   1092: aaload
    //   1093: aload #4
    //   1095: invokevirtual get : ()Ljava/lang/Object;
    //   1098: checkcast java/lang/Class
    //   1101: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1106: iconst_0
    //   1107: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1110: aload #5
    //   1112: ldc_w 57
    //   1115: aaload
    //   1116: aload #5
    //   1118: ldc_w 58
    //   1121: aaload
    //   1122: aload #4
    //   1124: invokevirtual get : ()Ljava/lang/Object;
    //   1127: checkcast java/lang/Class
    //   1130: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1135: ldc 'O'
    //   1137: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1142: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1147: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1152: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1157: pop
    //   1158: aconst_null
    //   1159: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1162: ireturn
    //   1163: nop
    //   1164: nop
    //   1165: athrow
    //   1166: aload #5
    //   1168: ldc_w 59
    //   1171: aaload
    //   1172: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   1175: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.nonConsistentError : Ljava/lang/String;
    //   1178: aload #5
    //   1180: ldc_w 60
    //   1183: aaload
    //   1184: aload #5
    //   1186: ldc_w 61
    //   1189: aaload
    //   1190: aload #5
    //   1192: ldc_w 62
    //   1195: aaload
    //   1196: aload #4
    //   1198: invokevirtual get : ()Ljava/lang/Object;
    //   1201: checkcast java/lang/Class
    //   1204: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1209: iconst_0
    //   1210: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1213: aload #5
    //   1215: ldc_w 63
    //   1218: aaload
    //   1219: aload #5
    //   1221: ldc_w 64
    //   1224: aaload
    //   1225: aload #4
    //   1227: invokevirtual get : ()Ljava/lang/Object;
    //   1230: checkcast java/lang/Class
    //   1233: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1238: ldc 'O'
    //   1240: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1245: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1250: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1255: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1260: pop
    //   1261: aconst_null
    //   1262: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1265: ireturn
    //   1266: goto -> 1536
    //   1269: aload #5
    //   1271: ldc_w 65
    //   1274: aaload
    //   1275: aload #14
    //   1277: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1282: iconst_0
    //   1283: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1286: invokestatic compareGreaterThan : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1289: ifeq -> 1536
    //   1292: aload #4
    //   1294: invokevirtual get : ()Ljava/lang/Object;
    //   1297: checkcast java/lang/Class
    //   1300: ldc com/huawei/ohos/build/shell/AbilitiesOptions
    //   1302: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1305: ifne -> 1325
    //   1308: aload #4
    //   1310: invokevirtual get : ()Ljava/lang/Object;
    //   1313: checkcast java/lang/Class
    //   1316: ldc_w com/huawei/ohos/build/shell/JsOptions
    //   1319: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1322: ifeq -> 1329
    //   1325: iconst_1
    //   1326: goto -> 1330
    //   1329: iconst_0
    //   1330: ifeq -> 1436
    //   1333: aload #5
    //   1335: ldc_w 66
    //   1338: aaload
    //   1339: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   1342: ldc_w 'The tag '%s' content of the test module is inconsistent with that of the default value.'
    //   1345: aload #5
    //   1347: ldc_w 67
    //   1350: aaload
    //   1351: aload #5
    //   1353: ldc_w 68
    //   1356: aaload
    //   1357: aload #5
    //   1359: ldc_w 69
    //   1362: aaload
    //   1363: aload #4
    //   1365: invokevirtual get : ()Ljava/lang/Object;
    //   1368: checkcast java/lang/Class
    //   1371: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1376: iconst_0
    //   1377: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1380: aload #5
    //   1382: ldc_w 70
    //   1385: aaload
    //   1386: aload #5
    //   1388: ldc_w 71
    //   1391: aaload
    //   1392: aload #4
    //   1394: invokevirtual get : ()Ljava/lang/Object;
    //   1397: checkcast java/lang/Class
    //   1400: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1405: ldc 'O'
    //   1407: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1412: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1417: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1422: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1427: pop
    //   1428: aconst_null
    //   1429: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1432: ireturn
    //   1433: nop
    //   1434: nop
    //   1435: athrow
    //   1436: aload #5
    //   1438: ldc_w 72
    //   1441: aaload
    //   1442: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.HM_LOGGER : Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   1445: getstatic com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil.nonConsistentError : Ljava/lang/String;
    //   1448: aload #5
    //   1450: ldc_w 73
    //   1453: aaload
    //   1454: aload #5
    //   1456: ldc_w 74
    //   1459: aaload
    //   1460: aload #5
    //   1462: ldc_w 75
    //   1465: aaload
    //   1466: aload #4
    //   1468: invokevirtual get : ()Ljava/lang/Object;
    //   1471: checkcast java/lang/Class
    //   1474: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1479: iconst_0
    //   1480: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1483: aload #5
    //   1485: ldc_w 76
    //   1488: aaload
    //   1489: aload #5
    //   1491: ldc_w 77
    //   1494: aaload
    //   1495: aload #4
    //   1497: invokevirtual get : ()Ljava/lang/Object;
    //   1500: checkcast java/lang/Class
    //   1503: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1508: ldc 'O'
    //   1510: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1515: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1520: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1525: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1530: pop
    //   1531: aconst_null
    //   1532: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1535: ireturn
    //   1536: aload #5
    //   1538: ldc_w 78
    //   1541: aaload
    //   1542: aload #12
    //   1544: invokevirtual get : ()Ljava/lang/Object;
    //   1547: checkcast java/util/Map
    //   1550: new com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil$_disposeList_closure4
    //   1553: dup
    //   1554: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   1556: ldc com/huawei/ohos/build/utils/configJson/CompareTestProfileUtil
    //   1558: aload #11
    //   1560: aload #4
    //   1562: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lgroovy/lang/Reference;Lgroovy/lang/Reference;)V
    //   1565: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1570: pop
    //   1571: goto -> 1574
    //   1574: iconst_0
    //   1575: ireturn
    //   1576: nop
    //   1577: nop
    //   1578: nop
    //   1579: nop
    //   1580: nop
    //   1581: nop
    //   1582: nop
    //   1583: nop
    //   1584: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #199	-> 16
    //   #200	-> 40
    //   #201	-> 67
    //   #202	-> 94
    //   #203	-> 103
    //   #204	-> 108
    //   #205	-> 108
    //   #206	-> 118
    //   #207	-> 128
    //   #208	-> 276
    //   #209	-> 297
    //   #210	-> 302
    //   #207	-> 305
    //   #208	-> 426
    //   #209	-> 447
    //   #210	-> 452
    //   #211	-> 452
    //   #212	-> 499
    //   #213	-> 501
    //   #211	-> 504
    //   #212	-> 530
    //   #213	-> 532
    //   #214	-> 532
    //   #215	-> 547
    //   #216	-> 567
    //   #217	-> 570
    //   #217	-> 573
    //   #218	-> 583
    //   #219	-> 617
    //   #220	-> 626
    //   #221	-> 631
    //   #222	-> 631
    //   #223	-> 664
    //   #224	-> 697
    //   #227	-> 723
    //   #231	-> 749
    //   #232	-> 792
    //   #233	-> 808
    //   #234	-> 843
    //   #235	-> 878
    //   #237	-> 913
    //   #238	-> 913
    //   #239	-> 956
    //   #240	-> 972
    //   #241	-> 1022
    //   #242	-> 1063
    //   #243	-> 1075
    //   #244	-> 1158
    //   #245	-> 1163
    //   #246	-> 1166
    //   #247	-> 1261
    //   #248	-> 1266
    //   #249	-> 1266
    //   #240	-> 1269
    //   #241	-> 1292
    //   #242	-> 1333
    //   #243	-> 1345
    //   #244	-> 1428
    //   #245	-> 1433
    //   #246	-> 1436
    //   #247	-> 1531
    //   #248	-> 1536
    //   #249	-> 1536
    //   #251	-> 1536
    //   #258	-> 1571
    //   #259	-> 1574
    //   #260	-> 1574
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1576	0	mainConfigOptions	Ljava/lang/Object;
    //   0	1576	1	testConfigOptions	Ljava/lang/Object;
    //   0	1576	2	curListField	Ljava/lang/reflect/Field;
    //   1	1575	4	clazz	Lgroovy/lang/Reference;
    //   0	1	3	clazz	Ljava/lang/Class;
    //   37	1539	6	fieldGetMethodName	Ljava/lang/String;
    //   64	1512	7	mainOptions	Ljava/util/List;
    //   91	1485	8	testOptions	Ljava/util/List;
    //   614	960	10	method	Ljava/lang/reflect/Method;
    //   661	913	11	mainMap	Lgroovy/lang/Reference;
    //   694	880	12	testMap	Lgroovy/lang/Reference;
    //   789	785	13	mainKeySet	Ljava/util/Collection;
    //   953	621	14	testKeySet	Ljava/util/Collection;
  }
  
  @Generated
  public CompareTestProfileUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public final class _disposeList_closure2 extends Closure implements GeneratedClosure {
    public _disposeList_closure2(Object _outerInstance, Object _thisObject, Reference mainMap) {
      super(_outerInstance, _thisObject);
      Reference reference = mainMap;
      this.mainMap = reference;
    }
    
    public Object doCall(Object mainOption) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.mainMap.get(), arrayOfCallSite[1].call(mainOption, "name"), mainOption);
    }
    
    @Generated
    public Map getMainMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mainMap.get(), Map.class);
    }
  }
  
  public final class _disposeList_closure3 extends Closure implements GeneratedClosure {
    public _disposeList_closure3(Object _outerInstance, Object _thisObject, Reference testMap) {
      super(_outerInstance, _thisObject);
      Reference reference = testMap;
      this.testMap = reference;
    }
    
    public Object doCall(Object testOption) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.testMap.get(), arrayOfCallSite[1].call(testOption, "name"), testOption);
    }
    
    @Generated
    public Map getTestMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.testMap.get(), Map.class);
    }
  }
  
  public final class _disposeList_closure4 extends Closure implements GeneratedClosure {
    public _disposeList_closure4(Object _outerInstance, Object _thisObject, Reference mainMap, Reference clazz) {
      super(_outerInstance, _thisObject);
      Reference reference1 = mainMap;
      this.mainMap = reference1;
      Reference reference2 = clazz;
      this.clazz = reference2;
    }
    
    public Object doCall(Object key, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(key, arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].callGetProperty(CompareTestProfileEnum.AbilityNameEnum.class))) || ScriptBytecodeAdapter.compareEqual(key, arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(CompareTestProfileEnum.AbilityNameEnum.class)))))
          return arrayOfCallSite[14].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[15].call(this.mainMap.get(), arrayOfCallSite[16].call(arrayOfCallSite[17].callGroovyObjectGetProperty(this), ".MainAbility")), v, this.clazz.get()); 
        return arrayOfCallSite[18].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[19].call(this.mainMap.get(), key), v, this.clazz.get());
      } 
      if ((ScriptBytecodeAdapter.compareEqual(key, arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(CompareTestProfileEnum.AbilityNameEnum.class))) || ScriptBytecodeAdapter.compareEqual(key, arrayOfCallSite[2].callGetProperty(arrayOfCallSite[3].callGetProperty(CompareTestProfileEnum.AbilityNameEnum.class)))))
        return arrayOfCallSite[4].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[5].call(this.mainMap.get(), arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), ".MainAbility")), v, this.clazz.get()); 
      return arrayOfCallSite[8].callStatic(CompareTestProfileUtil.class, arrayOfCallSite[9].call(this.mainMap.get(), key), v, this.clazz.get());
    }
    
    public Object call(Object key, Object v) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[20].callCurrent((GroovyObject)this, key, v);
    }
    
    @Generated
    public Map getMainMap() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.mainMap.get(), Map.class);
    }
    
    @Generated
    public Class getClazz() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToClass(this.clazz.get());
    }
  }
}
