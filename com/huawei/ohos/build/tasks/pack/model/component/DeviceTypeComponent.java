package com.huawei.ohos.build.tasks.pack.model.component;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.lite.HybridLitePackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.lite.SingleLitePackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.rich.EntryPackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.rich.FeaturePackModel;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.internal.Pair;

public class DeviceTypeComponent implements Component, GroovyObject {
  @Nonnull
  private Project project;
  
  @Nonnull
  private VariantData variantData;
  
  @Nonnull
  private String moduleType;
  
  public LinkedHashSet<DeviceType> richDevices;
  
  public LinkedHashSet<DeviceType> liteDevices;
  
  public class DeviceTypeComponentFactory implements GroovyObject {
    @Generated
    public DeviceTypeComponentFactory() {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
    }
    
    public static Pair<DeviceTypeComponent.PackedModeResult, ? extends PackModel> getPackModel(Project project, VariantData variantData) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].callGroovyObjectGetProperty(variantData), arrayOfCallSite[1].callGetProperty(VariantModel.class)))
        return (Pair<DeviceTypeComponent.PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(null, Pair.class); 
      ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(variantData), ConfigInfo.class);
      List deviceTypes = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(configInfo), List.class);
      Reference deviceTypeComponent = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(DeviceTypeComponent.class, project, variantData), DeviceTypeComponent.class));
      arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(deviceTypes), new _getPackModel_closure1(DeviceTypeComponentFactory.class, DeviceTypeComponent.class)), new _getPackModel_closure2(DeviceTypeComponentFactory.class, DeviceTypeComponent.class, deviceTypeComponent));
      return (Pair<DeviceTypeComponent.PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(deviceTypeComponent.get()), Pair.class);
    }
    
    public final class _getPackModel_closure1 extends Closure implements GeneratedClosure {
      public _getPackModel_closure1(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object deviceType) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(DeviceType.class, deviceType);
      }
    }
    
    public final class _getPackModel_closure2 extends Closure implements GeneratedClosure {
      public _getPackModel_closure2(Object _outerInstance, Object _thisObject, Reference deviceTypeComponent) {
        super(_outerInstance, _thisObject);
        Reference reference = deviceTypeComponent;
        this.deviceTypeComponent = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.deviceTypeComponent.get(), it);
      }
      
      @Generated
      public DeviceTypeComponent getDeviceTypeComponent() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (DeviceTypeComponent)ScriptBytecodeAdapter.castToType(this.deviceTypeComponent.get(), DeviceTypeComponent.class);
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public DeviceTypeComponent(Project project, VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGroovyObjectGetProperty(variantData));
    this.moduleType = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[2].callConstructor(LinkedHashSet.class);
    this.richDevices = (LinkedHashSet<DeviceType>)ScriptBytecodeAdapter.castToType(object2, LinkedHashSet.class);
    Object object3 = arrayOfCallSite[3].callConstructor(LinkedHashSet.class);
    this.liteDevices = (LinkedHashSet<DeviceType>)ScriptBytecodeAdapter.castToType(object3, LinkedHashSet.class);
  }
  
  public void addDeviceType(DeviceType deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(deviceType)) ? arrayOfCallSite[5].call(this.richDevices, deviceType) : arrayOfCallSite[6].call(this.liteDevices, deviceType);
  }
  
  public void removeDeviceType(DeviceType deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(deviceType)) ? arrayOfCallSite[8].call(this.richDevices, deviceType) : arrayOfCallSite[9].call(this.liteDevices, deviceType);
  }
  
  public Pair<PackedModeResult, ? extends PackModel> populatePackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[10].call(this.liteDevices), Integer.valueOf(0)))
      return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(ScriptBytecodeAdapter.compareEqual(this.moduleType, arrayOfCallSite[11].callGetProperty(BuildConst.class)) ? arrayOfCallSite[12].call(Pair.class, arrayOfCallSite[13].callGetProperty(PackedModeResult.class), arrayOfCallSite[14].callConstructor(EntryPackModel.class, this.project, this.variantData)) : arrayOfCallSite[15].call(Pair.class, arrayOfCallSite[16].callGetProperty(PackedModeResult.class), arrayOfCallSite[17].callConstructor(FeaturePackModel.class, this.project, this.variantData)), Pair.class); 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(this.liteDevices, arrayOfCallSite[19].callGetProperty(DeviceType.class)))) {
      PackModel packModel1 = (PackModel)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].callConstructor(SingleLitePackModel.class, this.project, this.variantData, arrayOfCallSite[21].callGetProperty(DeviceType.class)), PackModel.class);
      return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].call(Pair.class, arrayOfCallSite[23].callGetProperty(PackedModeResult.class), packModel1), Pair.class);
    } 
    DeviceType singleLiteDeviceType = (DeviceType)ShortTypeHandling.castToEnum(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(this.liteDevices, arrayOfCallSite[25].callGetProperty(DeviceType.class))) ? arrayOfCallSite[26].callGetProperty(DeviceType.class) : arrayOfCallSite[27].callGetProperty(DeviceType.class), DeviceType.class);
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[28].call(this.richDevices), Integer.valueOf(0))) {
      PackModel packModel1 = (PackModel)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].callConstructor(SingleLitePackModel.class, this.project, this.variantData, singleLiteDeviceType), PackModel.class);
      if (ScriptBytecodeAdapter.compareEqual(singleLiteDeviceType, arrayOfCallSite[30].callGetProperty(DeviceType.class)))
        return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(Pair.class, arrayOfCallSite[32].callGetProperty(PackedModeResult.class), packModel1), Pair.class); 
      return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(Pair.class, arrayOfCallSite[34].callGetProperty(PackedModeResult.class), packModel1), Pair.class);
    } 
    PackModel packModel = (PackModel)ScriptBytecodeAdapter.castToType(arrayOfCallSite[35].callConstructor(HybridLitePackModel.class, this.project, this.variantData, singleLiteDeviceType), PackModel.class);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(hasLiteWearable()) ? arrayOfCallSite[41].call(Pair.class, arrayOfCallSite[42].callGetProperty(PackedModeResult.class), packModel) : arrayOfCallSite[43].call(Pair.class, arrayOfCallSite[44].callGetProperty(PackedModeResult.class), packModel), Pair.class); 
    return (Pair<PackedModeResult, ? extends PackModel>)ScriptBytecodeAdapter.castToType(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].callCurrent(this)) ? arrayOfCallSite[37].call(Pair.class, arrayOfCallSite[38].callGetProperty(PackedModeResult.class), packModel) : arrayOfCallSite[39].call(Pair.class, arrayOfCallSite[40].callGetProperty(PackedModeResult.class), packModel), Pair.class);
  }
  
  public Boolean hasLiteWearable() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Boolean)ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].call(this.liteDevices, arrayOfCallSite[46].callGetProperty(DeviceType.class)), Boolean.class);
  }
  
  public enum PackedModeResult implements GroovyObject {
    RICH_ENTRY, RICH_FEATURE, LITE_WEARABLE_ENTRY, LITE_ENTRY, ROUTER_ENTRY, LITE_WEARABLE_RICH_ENTRY, LITE_RICH_ENTRY;
    
    public final String deviceType;
    
    public final String moduleType;
    
    public final String description;
    
    public static final PackedModeResult MIN_VALUE;
    
    public static final PackedModeResult MAX_VALUE;
    
    @Nonnull
    PackedModeResult(String deviceType, String moduleType, String description) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = deviceType;
      this.deviceType = ShortTypeHandling.castToString(str1);
      String str2 = moduleType;
      this.moduleType = ShortTypeHandling.castToString(str2);
      String str3 = description;
      this.description = ShortTypeHandling.castToString(str3);
    }
    
    public boolean isRichMode() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
        return (ScriptBytecodeAdapter.compareEqual(this, RICH_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, RICH_FEATURE)); 
      return (ScriptBytecodeAdapter.compareEqual(this, RICH_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, RICH_FEATURE));
    }
    
    public boolean isLiteMode() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
        return (((ScriptBytecodeAdapter.compareEqual(this, LITE_WEARABLE_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, LITE_ENTRY))) || ScriptBytecodeAdapter.compareEqual(this, ROUTER_ENTRY)); 
      return (((ScriptBytecodeAdapter.compareEqual(this, LITE_WEARABLE_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, LITE_ENTRY))) || ScriptBytecodeAdapter.compareEqual(this, ROUTER_ENTRY));
    }
    
    public boolean isHybridMode() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
        return (ScriptBytecodeAdapter.compareEqual(this, LITE_WEARABLE_RICH_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, LITE_RICH_ENTRY)); 
      return (ScriptBytecodeAdapter.compareEqual(this, LITE_WEARABLE_RICH_ENTRY) || ScriptBytecodeAdapter.compareEqual(this, LITE_RICH_ENTRY));
    }
    
    static {
      Object object1 = $getCallSiteArray()[10].callStatic(PackedModeResult.class, ArrayUtil.createArray("RICH_ENTRY", Integer.valueOf(0), $getCallSiteArray()[11].callGetProperty(BuildConst.class), $getCallSiteArray()[12].callGetProperty(BuildConst.class), "entry module with no lite device"));
      RICH_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object1, PackedModeResult.class);
      Object object2 = $getCallSiteArray()[13].callStatic(PackedModeResult.class, ArrayUtil.createArray("RICH_FEATURE", Integer.valueOf(1), $getCallSiteArray()[14].callGetProperty(BuildConst.class), $getCallSiteArray()[15].callGetProperty(BuildConst.class), "feature module with no lite device"));
      RICH_FEATURE = (PackedModeResult)ShortTypeHandling.castToEnum(object2, PackedModeResult.class);
      Object object3 = $getCallSiteArray()[16].callStatic(PackedModeResult.class, ArrayUtil.createArray("LITE_WEARABLE_ENTRY", Integer.valueOf(2), $getCallSiteArray()[17].callGetProperty(BuildConst.class), $getCallSiteArray()[18].callGetProperty(BuildConst.class), "entry module for liteWearable with no rich device"));
      LITE_WEARABLE_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object3, PackedModeResult.class);
      Object object4 = $getCallSiteArray()[19].callStatic(PackedModeResult.class, ArrayUtil.createArray("LITE_ENTRY", Integer.valueOf(3), $getCallSiteArray()[20].callGetProperty(BuildConst.class), $getCallSiteArray()[21].callGetProperty(BuildConst.class), "entry module for lite device with no rich device"));
      LITE_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object4, PackedModeResult.class);
      Object object5 = $getCallSiteArray()[22].callStatic(PackedModeResult.class, ArrayUtil.createArray("ROUTER_ENTRY", Integer.valueOf(4), $getCallSiteArray()[23].callGetProperty(BuildConst.class), $getCallSiteArray()[24].callGetProperty(BuildConst.class), "entry module for router device with no rich device"));
      ROUTER_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object5, PackedModeResult.class);
      Object object6 = $getCallSiteArray()[25].callStatic(PackedModeResult.class, ArrayUtil.createArray("LITE_WEARABLE_RICH_ENTRY", Integer.valueOf(5), $getCallSiteArray()[26].callGetProperty(BuildConst.class), $getCallSiteArray()[27].callGetProperty(BuildConst.class), "entry module for lite device with no rich device"));
      LITE_WEARABLE_RICH_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object6, PackedModeResult.class);
      Object object7 = $getCallSiteArray()[28].callStatic(PackedModeResult.class, ArrayUtil.createArray("LITE_RICH_ENTRY", Integer.valueOf(6), $getCallSiteArray()[29].callGetProperty(BuildConst.class), $getCallSiteArray()[30].callGetProperty(BuildConst.class), "entry module for lite device with no rich device"));
      LITE_RICH_ENTRY = (PackedModeResult)ShortTypeHandling.castToEnum(object7, PackedModeResult.class);
      PackedModeResult packedModeResult1 = RICH_ENTRY;
      MIN_VALUE = packedModeResult1;
      PackedModeResult packedModeResult2 = LITE_RICH_ENTRY;
      MAX_VALUE = packedModeResult2;
      PackedModeResult[] arrayOfPackedModeResult = { RICH_ENTRY, RICH_FEATURE, LITE_WEARABLE_ENTRY, LITE_ENTRY, ROUTER_ENTRY, LITE_WEARABLE_RICH_ENTRY, LITE_RICH_ENTRY };
      $VALUES = arrayOfPackedModeResult;
    }
  }
}
