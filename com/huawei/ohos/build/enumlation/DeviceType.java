package com.huawei.ohos.build.enumlation;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public enum DeviceType implements GroovyObject {
  DEFAULT, CAR, SMART_WATCH, TV, LITE_WEARABLE, WEARABLE, SMART_VISION, TABLET, PC, PHONE, FITNESS_BAND, ROUTER;
  
  private String value;
  
  private boolean richDevice;
  
  public static final DeviceType MIN_VALUE;
  
  public static final DeviceType MAX_VALUE;
  
  DeviceType(String value, boolean richDevice) {
    MetaClass metaClass = $getStaticMetaClass();
    String str = value;
    this.value = ShortTypeHandling.castToString(str);
    boolean bool = richDevice;
    this.richDevice = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public String getValue() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.value;
  }
  
  public boolean isRichDevice() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.richDevice;
  }
  
  public static boolean contains(String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(values())), new _contains_closure1(DeviceType.class, DeviceType.class))), value)); 
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callStatic(DeviceType.class))), new _contains_closure1(DeviceType.class, DeviceType.class))), value));
  }
  
  public final class _contains_closure1 extends Closure implements GeneratedClosure {
    public _contains_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(it);
    }
  }
  
  public static DeviceType fromValue(String device) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      DeviceType deviceType1;
      Iterator iterator1;
      for (deviceType1 = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].call(values()), Iterator.class); iterator1.hasNext(); ) {
        deviceType1 = (DeviceType)ShortTypeHandling.castToEnum(iterator1.next(), DeviceType.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[15].call(deviceType1), device))
          return deviceType1; 
      } 
      return (DeviceType)ShortTypeHandling.castToEnum(null, DeviceType.class);
    } 
    DeviceType deviceType;
    Iterator iterator;
    for (deviceType = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(arrayOfCallSite[12].callStatic(DeviceType.class)), Iterator.class); iterator.hasNext(); ) {
      deviceType = (DeviceType)ShortTypeHandling.castToEnum(iterator.next(), DeviceType.class);
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[13].call(deviceType), device))
        return deviceType; 
    } 
    return (DeviceType)ShortTypeHandling.castToEnum(null, DeviceType.class);
  }
  
  static {
    Object object1 = $getCallSiteArray()[26].callStatic(DeviceType.class, "DEFAULT", Integer.valueOf(0), "default");
    DEFAULT = (DeviceType)ShortTypeHandling.castToEnum(object1, DeviceType.class);
    Object object2 = $getCallSiteArray()[27].callStatic(DeviceType.class, "CAR", Integer.valueOf(1), "car");
    CAR = (DeviceType)ShortTypeHandling.castToEnum(object2, DeviceType.class);
    Object object3 = $getCallSiteArray()[28].callStatic(DeviceType.class, "SMART_WATCH", Integer.valueOf(2), "smartWatch");
    SMART_WATCH = (DeviceType)ShortTypeHandling.castToEnum(object3, DeviceType.class);
    Object object4 = $getCallSiteArray()[29].callStatic(DeviceType.class, "TV", Integer.valueOf(3), "tv");
    TV = (DeviceType)ShortTypeHandling.castToEnum(object4, DeviceType.class);
    Object object5 = $getCallSiteArray()[30].callStatic(DeviceType.class, "LITE_WEARABLE", Integer.valueOf(4), "liteWearable", Boolean.valueOf(false));
    LITE_WEARABLE = (DeviceType)ShortTypeHandling.castToEnum(object5, DeviceType.class);
    Object object6 = $getCallSiteArray()[31].callStatic(DeviceType.class, "WEARABLE", Integer.valueOf(5), "wearable");
    WEARABLE = (DeviceType)ShortTypeHandling.castToEnum(object6, DeviceType.class);
    Object object7 = $getCallSiteArray()[32].callStatic(DeviceType.class, "SMART_VISION", Integer.valueOf(6), "smartVision", Boolean.valueOf(false));
    SMART_VISION = (DeviceType)ShortTypeHandling.castToEnum(object7, DeviceType.class);
    Object object8 = $getCallSiteArray()[33].callStatic(DeviceType.class, "TABLET", Integer.valueOf(7), "tablet");
    TABLET = (DeviceType)ShortTypeHandling.castToEnum(object8, DeviceType.class);
    Object object9 = $getCallSiteArray()[34].callStatic(DeviceType.class, "PC", Integer.valueOf(8), "pc");
    PC = (DeviceType)ShortTypeHandling.castToEnum(object9, DeviceType.class);
    Object object10 = $getCallSiteArray()[35].callStatic(DeviceType.class, "PHONE", Integer.valueOf(9), "phone");
    PHONE = (DeviceType)ShortTypeHandling.castToEnum(object10, DeviceType.class);
    Object object11 = $getCallSiteArray()[36].callStatic(DeviceType.class, "FITNESS_BAND", Integer.valueOf(10), "fitnessBand");
    FITNESS_BAND = (DeviceType)ShortTypeHandling.castToEnum(object11, DeviceType.class);
    Object object12 = $getCallSiteArray()[37].callStatic(DeviceType.class, "ROUTER", Integer.valueOf(11), "router", Boolean.valueOf(false));
    ROUTER = (DeviceType)ShortTypeHandling.castToEnum(object12, DeviceType.class);
    DeviceType deviceType1 = DEFAULT;
    MIN_VALUE = deviceType1;
    DeviceType deviceType2 = ROUTER;
    MAX_VALUE = deviceType2;
    DeviceType[] arrayOfDeviceType = { 
        DEFAULT, CAR, SMART_WATCH, TV, LITE_WEARABLE, WEARABLE, SMART_VISION, TABLET, PC, PHONE, 
        FITNESS_BAND, ROUTER };
    $VALUES = arrayOfDeviceType;
  }
}
