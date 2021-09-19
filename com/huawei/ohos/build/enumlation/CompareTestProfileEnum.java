package com.huawei.ohos.build.enumlation;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class CompareTestProfileEnum implements GroovyObject {
  @Generated
  public CompareTestProfileEnum() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public enum AbilityNameEnum implements GroovyObject {
    ENTRY_ABILITY, JS_ENTRY_ABILITY, DEFAULT;
    
    private String fieldName;
    
    public static final AbilityNameEnum MIN_VALUE;
    
    public static final AbilityNameEnum MAX_VALUE;
    
    AbilityNameEnum(String fieldName) {
      MetaClass metaClass = $getStaticMetaClass();
      String str = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str);
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        AbilityNameEnum abilityNameEnum;
        Iterator iterator1;
        for (abilityNameEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          abilityNameEnum = (AbilityNameEnum)ShortTypeHandling.castToEnum(iterator1.next(), AbilityNameEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(abilityNameEnum), value))
            return true; 
        } 
        return false;
      } 
      AbilityNameEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(AbilityNameEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (AbilityNameEnum)ShortTypeHandling.castToEnum(iterator.next(), AbilityNameEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(AbilityNameEnum.class, "ENTRY_ABILITY", Integer.valueOf(0), "decc.testkit.runner.EntryAbility");
      ENTRY_ABILITY = (AbilityNameEnum)ShortTypeHandling.castToEnum(object1, AbilityNameEnum.class);
      Object object2 = $getCallSiteArray()[16].callStatic(AbilityNameEnum.class, "JS_ENTRY_ABILITY", Integer.valueOf(1), "decc.testkit.runner.JsEntryAbility");
      JS_ENTRY_ABILITY = (AbilityNameEnum)ShortTypeHandling.castToEnum(object2, AbilityNameEnum.class);
      Object object3 = $getCallSiteArray()[17].callStatic(AbilityNameEnum.class, "DEFAULT", Integer.valueOf(2), "default");
      DEFAULT = (AbilityNameEnum)ShortTypeHandling.castToEnum(object3, AbilityNameEnum.class);
      AbilityNameEnum abilityNameEnum1 = ENTRY_ABILITY;
      MIN_VALUE = abilityNameEnum1;
      AbilityNameEnum abilityNameEnum2 = DEFAULT;
      MAX_VALUE = abilityNameEnum2;
      AbilityNameEnum[] arrayOfAbilityNameEnum = { ENTRY_ABILITY, JS_ENTRY_ABILITY, DEFAULT };
      $VALUES = arrayOfAbilityNameEnum;
    }
  }
  
  public enum AbilityEnum implements GroovyObject {
    NAME, DESCRIPTION, ICON, LABEL, LAUNCH_TYPE, ORIENTATION, VISIBLE, TYPE;
    
    private String fieldName;
    
    private String defaultValue;
    
    private boolean isLite;
    
    public static final AbilityEnum MIN_VALUE;
    
    public static final AbilityEnum MAX_VALUE;
    
    AbilityEnum(String fieldName, String defaultValue, boolean isLite) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str1);
      String str2 = defaultValue;
      this.defaultValue = ShortTypeHandling.castToString(str2);
      boolean bool = isLite;
      this.isLite = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public String getDefaultValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.defaultValue;
    }
    
    public boolean getIsLite() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.isLite;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        AbilityEnum abilityEnum;
        Iterator iterator1;
        for (abilityEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          abilityEnum = (AbilityEnum)ShortTypeHandling.castToEnum(iterator1.next(), AbilityEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(abilityEnum), value))
            return true; 
        } 
        return false;
      } 
      AbilityEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(AbilityEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (AbilityEnum)ShortTypeHandling.castToEnum(iterator.next(), AbilityEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    public static AbilityEnum fromValue(String fieldName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        AbilityEnum abilityEnum;
        Iterator iterator1;
        for (abilityEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(values()), Iterator.class); iterator1.hasNext(); ) {
          abilityEnum = (AbilityEnum)ShortTypeHandling.castToEnum(iterator1.next(), AbilityEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].call(abilityEnum), fieldName))
            return abilityEnum; 
        } 
        return (AbilityEnum)ShortTypeHandling.castToEnum(null, AbilityEnum.class);
      } 
      AbilityEnum abilityAttr;
      Iterator iterator;
      for (abilityAttr = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].callStatic(AbilityEnum.class)), Iterator.class); iterator.hasNext(); ) {
        abilityAttr = (AbilityEnum)ShortTypeHandling.castToEnum(iterator.next(), AbilityEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].call(abilityAttr), fieldName))
          return abilityAttr; 
      } 
      return (AbilityEnum)ShortTypeHandling.castToEnum(null, AbilityEnum.class);
    }
    
    static {
      Object object1 = $getCallSiteArray()[20].callStatic(AbilityEnum.class, "NAME", Integer.valueOf(0), "name");
      NAME = (AbilityEnum)ShortTypeHandling.castToEnum(object1, AbilityEnum.class);
      Object object2 = $getCallSiteArray()[21].callStatic(AbilityEnum.class, ArrayUtil.createArray("DESCRIPTION", Integer.valueOf(1), "description", "Test Entry Ability", Boolean.valueOf(false)));
      DESCRIPTION = (AbilityEnum)ShortTypeHandling.castToEnum(object2, AbilityEnum.class);
      Object object3 = $getCallSiteArray()[22].callStatic(AbilityEnum.class, "ICON", Integer.valueOf(2), "icon");
      ICON = (AbilityEnum)ShortTypeHandling.castToEnum(object3, AbilityEnum.class);
      Object object4 = $getCallSiteArray()[23].callStatic(AbilityEnum.class, "LABEL", Integer.valueOf(3), "label", "TestAbility");
      LABEL = (AbilityEnum)ShortTypeHandling.castToEnum(object4, AbilityEnum.class);
      Object object5 = $getCallSiteArray()[24].callStatic(AbilityEnum.class, ArrayUtil.createArray("LAUNCH_TYPE", Integer.valueOf(4), "launchType", "standard", Boolean.valueOf(false)));
      LAUNCH_TYPE = (AbilityEnum)ShortTypeHandling.castToEnum(object5, AbilityEnum.class);
      Object object6 = $getCallSiteArray()[25].callStatic(AbilityEnum.class, ArrayUtil.createArray("ORIENTATION", Integer.valueOf(5), "orientation", "landscape", Boolean.valueOf(false)));
      ORIENTATION = (AbilityEnum)ShortTypeHandling.castToEnum(object6, AbilityEnum.class);
      Object object7 = $getCallSiteArray()[26].callStatic(AbilityEnum.class, ArrayUtil.createArray("VISIBLE", Integer.valueOf(6), "visible", "true", Boolean.valueOf(false)));
      VISIBLE = (AbilityEnum)ShortTypeHandling.castToEnum(object7, AbilityEnum.class);
      Object object8 = $getCallSiteArray()[27].callStatic(AbilityEnum.class, "TYPE", Integer.valueOf(7), "type", "page");
      TYPE = (AbilityEnum)ShortTypeHandling.castToEnum(object8, AbilityEnum.class);
      AbilityEnum abilityEnum1 = NAME;
      MIN_VALUE = abilityEnum1;
      AbilityEnum abilityEnum2 = TYPE;
      MAX_VALUE = abilityEnum2;
      AbilityEnum[] arrayOfAbilityEnum = { NAME, DESCRIPTION, ICON, LABEL, LAUNCH_TYPE, ORIENTATION, VISIBLE, TYPE };
      $VALUES = arrayOfAbilityEnum;
    }
  }
  
  public enum WindowEnum implements GroovyObject {
    DESIGN_WIDTH, AUTO_DESIGN_WIDTH;
    
    private String fieldName;
    
    private String defaultValue;
    
    public static final WindowEnum MIN_VALUE;
    
    public static final WindowEnum MAX_VALUE;
    
    WindowEnum(String fieldName, String defaultValue) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str1);
      String str2 = defaultValue;
      this.defaultValue = ShortTypeHandling.castToString(str2);
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public String getDefaultValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.defaultValue;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        WindowEnum windowEnum;
        Iterator iterator1;
        for (windowEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          windowEnum = (WindowEnum)ShortTypeHandling.castToEnum(iterator1.next(), WindowEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(windowEnum), value))
            return true; 
        } 
        return false;
      } 
      WindowEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(WindowEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (WindowEnum)ShortTypeHandling.castToEnum(iterator.next(), WindowEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    public static WindowEnum fromValue(String fieldName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        WindowEnum windowEnum;
        Iterator iterator1;
        for (windowEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(values()), Iterator.class); iterator1.hasNext(); ) {
          windowEnum = (WindowEnum)ShortTypeHandling.castToEnum(iterator1.next(), WindowEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].call(windowEnum), fieldName))
            return windowEnum; 
        } 
        return (WindowEnum)ShortTypeHandling.castToEnum(null, WindowEnum.class);
      } 
      WindowEnum window;
      Iterator iterator;
      for (window = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].callStatic(WindowEnum.class)), Iterator.class); iterator.hasNext(); ) {
        window = (WindowEnum)ShortTypeHandling.castToEnum(iterator.next(), WindowEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].call(window), fieldName))
          return window; 
      } 
      return (WindowEnum)ShortTypeHandling.castToEnum(null, WindowEnum.class);
    }
    
    static {
      Object object1 = $getCallSiteArray()[20].callStatic(WindowEnum.class, "DESIGN_WIDTH", Integer.valueOf(0), "designWidth", "750");
      DESIGN_WIDTH = (WindowEnum)ShortTypeHandling.castToEnum(object1, WindowEnum.class);
      Object object2 = $getCallSiteArray()[21].callStatic(WindowEnum.class, "AUTO_DESIGN_WIDTH", Integer.valueOf(1), "autoDesignWidth", "false");
      AUTO_DESIGN_WIDTH = (WindowEnum)ShortTypeHandling.castToEnum(object2, WindowEnum.class);
      WindowEnum windowEnum1 = DESIGN_WIDTH;
      MIN_VALUE = windowEnum1;
      WindowEnum windowEnum2 = AUTO_DESIGN_WIDTH;
      MAX_VALUE = windowEnum2;
      WindowEnum[] arrayOfWindowEnum = { DESIGN_WIDTH, AUTO_DESIGN_WIDTH };
      $VALUES = arrayOfWindowEnum;
    }
  }
  
  public enum ModuleEnum implements GroovyObject {
    PACKAGE_NAME, NAME, REQ_CAPABILITIES, DEVICE_TYPE;
    
    private String fieldName;
    
    private String defaultValue;
    
    private Boolean isLite;
    
    public static final ModuleEnum MIN_VALUE;
    
    public static final ModuleEnum MAX_VALUE;
    
    ModuleEnum(String fieldName, String defaultValue, Boolean isLite) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str1);
      String str2 = defaultValue;
      this.defaultValue = ShortTypeHandling.castToString(str2);
      Boolean bool = isLite;
      this.isLite = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public String getDefaultValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.defaultValue;
    }
    
    public Boolean getIsLite() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.isLite;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        ModuleEnum moduleEnum;
        Iterator iterator1;
        for (moduleEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          moduleEnum = (ModuleEnum)ShortTypeHandling.castToEnum(iterator1.next(), ModuleEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(moduleEnum), value))
            return true; 
        } 
        return false;
      } 
      ModuleEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(ModuleEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (ModuleEnum)ShortTypeHandling.castToEnum(iterator.next(), ModuleEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    public static ModuleEnum fromValue(String fieldName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        ModuleEnum moduleEnum;
        Iterator iterator1;
        for (moduleEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(values()), Iterator.class); iterator1.hasNext(); ) {
          moduleEnum = (ModuleEnum)ShortTypeHandling.castToEnum(iterator1.next(), ModuleEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].call(moduleEnum), fieldName))
            return moduleEnum; 
        } 
        return (ModuleEnum)ShortTypeHandling.castToEnum(null, ModuleEnum.class);
      } 
      ModuleEnum module;
      Iterator iterator;
      for (module = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].callStatic(ModuleEnum.class)), Iterator.class); iterator.hasNext(); ) {
        module = (ModuleEnum)ShortTypeHandling.castToEnum(iterator.next(), ModuleEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].call(module), fieldName))
          return module; 
      } 
      return (ModuleEnum)ShortTypeHandling.castToEnum(null, ModuleEnum.class);
    }
    
    static {
      Object object1 = $getCallSiteArray()[20].callStatic(ModuleEnum.class, ArrayUtil.createArray("PACKAGE_NAME", Integer.valueOf(0), "packageName", "", Boolean.valueOf(false)));
      PACKAGE_NAME = (ModuleEnum)ShortTypeHandling.castToEnum(object1, ModuleEnum.class);
      Object object2 = $getCallSiteArray()[21].callStatic(ModuleEnum.class, ArrayUtil.createArray("NAME", Integer.valueOf(1), "name", "testModule", Boolean.valueOf(false)));
      NAME = (ModuleEnum)ShortTypeHandling.castToEnum(object2, ModuleEnum.class);
      Object object3 = $getCallSiteArray()[22].callStatic(ModuleEnum.class, ArrayUtil.createArray("REQ_CAPABILITIES", Integer.valueOf(2), "reqCapabilities", "", Boolean.valueOf(false)));
      REQ_CAPABILITIES = (ModuleEnum)ShortTypeHandling.castToEnum(object3, ModuleEnum.class);
      Object object4 = $getCallSiteArray()[23].callStatic(ModuleEnum.class, "DEVICE_TYPE", Integer.valueOf(3), "deviceType");
      DEVICE_TYPE = (ModuleEnum)ShortTypeHandling.castToEnum(object4, ModuleEnum.class);
      ModuleEnum moduleEnum1 = PACKAGE_NAME;
      MIN_VALUE = moduleEnum1;
      ModuleEnum moduleEnum2 = DEVICE_TYPE;
      MAX_VALUE = moduleEnum2;
      ModuleEnum[] arrayOfModuleEnum = { PACKAGE_NAME, NAME, REQ_CAPABILITIES, DEVICE_TYPE };
      $VALUES = arrayOfModuleEnum;
    }
  }
  
  public enum JsEnum implements GroovyObject {
    NAME, PAGE;
    
    private String fieldName;
    
    private String defaultValue;
    
    public static final JsEnum MIN_VALUE;
    
    public static final JsEnum MAX_VALUE;
    
    JsEnum(String fieldName, String defaultValue) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str1);
      String str2 = defaultValue;
      this.defaultValue = ShortTypeHandling.castToString(str2);
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public String getDefaultValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.defaultValue;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        JsEnum jsEnum;
        Iterator iterator1;
        for (jsEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          jsEnum = (JsEnum)ShortTypeHandling.castToEnum(iterator1.next(), JsEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(jsEnum), value))
            return true; 
        } 
        return false;
      } 
      JsEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(JsEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (JsEnum)ShortTypeHandling.castToEnum(iterator.next(), JsEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    public static JsEnum fromValue(String fieldName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        JsEnum jsEnum;
        Iterator iterator1;
        for (jsEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(values()), Iterator.class); iterator1.hasNext(); ) {
          jsEnum = (JsEnum)ShortTypeHandling.castToEnum(iterator1.next(), JsEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].call(jsEnum), fieldName))
            return jsEnum; 
        } 
        return (JsEnum)ShortTypeHandling.castToEnum(null, JsEnum.class);
      } 
      JsEnum js;
      Iterator iterator;
      for (js = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].callStatic(JsEnum.class)), Iterator.class); iterator.hasNext(); ) {
        js = (JsEnum)ShortTypeHandling.castToEnum(iterator.next(), JsEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].call(js), fieldName))
          return js; 
      } 
      return (JsEnum)ShortTypeHandling.castToEnum(null, JsEnum.class);
    }
    
    static {
      Object object1 = $getCallSiteArray()[20].callStatic(JsEnum.class, "NAME", Integer.valueOf(0), "name", "default");
      NAME = (JsEnum)ShortTypeHandling.castToEnum(object1, JsEnum.class);
      Object object2 = $getCallSiteArray()[21].callStatic(JsEnum.class, "PAGE", Integer.valueOf(1), "page");
      PAGE = (JsEnum)ShortTypeHandling.castToEnum(object2, JsEnum.class);
      JsEnum jsEnum1 = NAME;
      MIN_VALUE = jsEnum1;
      JsEnum jsEnum2 = PAGE;
      MAX_VALUE = jsEnum2;
      JsEnum[] arrayOfJsEnum = { NAME, PAGE };
      $VALUES = arrayOfJsEnum;
    }
  }
  
  public enum DistroEnum implements GroovyObject {
    DELIVERY_WITH_INSTALL, MODULE_NAME, MODULE_TYPE;
    
    private String fieldName;
    
    private String defaultValue;
    
    public static final DistroEnum MIN_VALUE;
    
    public static final DistroEnum MAX_VALUE;
    
    DistroEnum(String fieldName, String defaultValue) {
      MetaClass metaClass = $getStaticMetaClass();
      String str1 = fieldName;
      this.fieldName = ShortTypeHandling.castToString(str1);
      String str2 = defaultValue;
      this.defaultValue = ShortTypeHandling.castToString(str2);
    }
    
    public String getFieldName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.fieldName;
    }
    
    public String getDefaultValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.defaultValue;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        DistroEnum distroEnum;
        Iterator iterator1;
        for (distroEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          distroEnum = (DistroEnum)ShortTypeHandling.castToEnum(iterator1.next(), DistroEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(distroEnum), value))
            return true; 
        } 
        return false;
      } 
      DistroEnum v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(DistroEnum.class)), Iterator.class); iterator.hasNext(); ) {
        v = (DistroEnum)ShortTypeHandling.castToEnum(iterator.next(), DistroEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    public static DistroEnum fromValue(String fieldName) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        DistroEnum distroEnum;
        Iterator iterator1;
        for (distroEnum = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(values()), Iterator.class); iterator1.hasNext(); ) {
          distroEnum = (DistroEnum)ShortTypeHandling.castToEnum(iterator1.next(), DistroEnum.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[9].call(distroEnum), fieldName))
            return distroEnum; 
        } 
        return (DistroEnum)ShortTypeHandling.castToEnum(null, DistroEnum.class);
      } 
      DistroEnum distro;
      Iterator iterator;
      for (distro = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].callStatic(DistroEnum.class)), Iterator.class); iterator.hasNext(); ) {
        distro = (DistroEnum)ShortTypeHandling.castToEnum(iterator.next(), DistroEnum.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[7].call(distro), fieldName))
          return distro; 
      } 
      return (DistroEnum)ShortTypeHandling.castToEnum(null, DistroEnum.class);
    }
    
    static {
      Object object1 = $getCallSiteArray()[20].callStatic(DistroEnum.class, "DELIVERY_WITH_INSTALL", Integer.valueOf(0), "deliveryWithInstall");
      DELIVERY_WITH_INSTALL = (DistroEnum)ShortTypeHandling.castToEnum(object1, DistroEnum.class);
      Object object2 = $getCallSiteArray()[21].callStatic(DistroEnum.class, "MODULE_NAME", Integer.valueOf(1), "moduleName");
      MODULE_NAME = (DistroEnum)ShortTypeHandling.castToEnum(object2, DistroEnum.class);
      Object object3 = $getCallSiteArray()[22].callStatic(DistroEnum.class, "MODULE_TYPE", Integer.valueOf(2), "moduleType", "feature");
      MODULE_TYPE = (DistroEnum)ShortTypeHandling.castToEnum(object3, DistroEnum.class);
      DistroEnum distroEnum1 = DELIVERY_WITH_INSTALL;
      MIN_VALUE = distroEnum1;
      DistroEnum distroEnum2 = MODULE_TYPE;
      MAX_VALUE = distroEnum2;
      DistroEnum[] arrayOfDistroEnum = { DELIVERY_WITH_INSTALL, MODULE_NAME, MODULE_TYPE };
      $VALUES = arrayOfDistroEnum;
    }
  }
}
