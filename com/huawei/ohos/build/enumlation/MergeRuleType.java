package com.huawei.ohos.build.enumlation;

import com.huawei.ohos.build.shell.AppOptions;
import com.huawei.ohos.build.shell.ArkOptions;
import com.huawei.ohos.build.shell.ConfigConst;
import com.huawei.ohos.build.shell.DistroOptions;
import com.huawei.ohos.build.shell.NetworkOptions;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class MergeRuleType implements GroovyObject {
  private static final String packageField = "package";
  
  private static final String nameField = "name";
  
  private static final String descriptionField = "description";
  
  private static final String deviceTypeField = "deviceType";
  
  private static final String supportedModesField = "supportedModes";
  
  private static final String shortcutsField = "shortcuts";
  
  private static final String distroField = "distro";
  
  private static final String permissionsField = "permissions";
  
  private static final String backgroundModesField = "backgroundModes";
  
  private static final String configChangesField = "configChanges";
  
  private static final String metaDataField = "metaData";
  
  private static final String readPermissionField = "readPermission";
  
  private static final String writePermissionField = "writePermission";
  
  private static final String defPermissionsField = "defPermissions";
  
  private static final String defPermissionGroupsField = "defPermissionGroups";
  
  private static final String abilitiesField = "abilities";
  
  @Generated
  public MergeRuleType() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public enum KeepHapOptions implements GroovyObject {
    APP_OPTIONS, ARK_OPTIONS, NETWORK_OPTIONS, DISTRO_OPTIONS;
    
    private String optionClassName;
    
    public static final KeepHapOptions MIN_VALUE;
    
    public static final KeepHapOptions MAX_VALUE;
    
    KeepHapOptions(Class optionClass) {
      MetaClass metaClass = $getStaticMetaClass();
      Object object = arrayOfCallSite[0].callGetProperty(optionClass);
      this.optionClassName = ShortTypeHandling.castToString(object);
    }
    
    public String getOptionClassName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.optionClassName;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        KeepHapOptions keepHapOptions;
        Iterator iterator1;
        for (keepHapOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(values()), Iterator.class); iterator1.hasNext(); ) {
          keepHapOptions = (KeepHapOptions)ShortTypeHandling.castToEnum(iterator1.next(), KeepHapOptions.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].call(keepHapOptions), value))
            return true; 
        } 
        return false;
      } 
      KeepHapOptions v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(arrayOfCallSite[2].callStatic(KeepHapOptions.class)), Iterator.class); iterator.hasNext(); ) {
        v = (KeepHapOptions)ShortTypeHandling.castToEnum(iterator.next(), KeepHapOptions.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[16].callStatic(KeepHapOptions.class, "APP_OPTIONS", Integer.valueOf(0), AppOptions.class);
      APP_OPTIONS = (KeepHapOptions)ShortTypeHandling.castToEnum(object1, KeepHapOptions.class);
      Object object2 = $getCallSiteArray()[17].callStatic(KeepHapOptions.class, "ARK_OPTIONS", Integer.valueOf(1), ArkOptions.class);
      ARK_OPTIONS = (KeepHapOptions)ShortTypeHandling.castToEnum(object2, KeepHapOptions.class);
      Object object3 = $getCallSiteArray()[18].callStatic(KeepHapOptions.class, "NETWORK_OPTIONS", Integer.valueOf(2), NetworkOptions.class);
      NETWORK_OPTIONS = (KeepHapOptions)ShortTypeHandling.castToEnum(object3, KeepHapOptions.class);
      Object object4 = $getCallSiteArray()[19].callStatic(KeepHapOptions.class, "DISTRO_OPTIONS", Integer.valueOf(3), DistroOptions.class);
      DISTRO_OPTIONS = (KeepHapOptions)ShortTypeHandling.castToEnum(object4, KeepHapOptions.class);
      KeepHapOptions keepHapOptions1 = APP_OPTIONS;
      MIN_VALUE = keepHapOptions1;
      KeepHapOptions keepHapOptions2 = DISTRO_OPTIONS;
      MAX_VALUE = keepHapOptions2;
      KeepHapOptions[] arrayOfKeepHapOptions = { APP_OPTIONS, ARK_OPTIONS, NETWORK_OPTIONS, DISTRO_OPTIONS };
      $VALUES = arrayOfKeepHapOptions;
    }
  }
  
  public enum KeepModuleAttr implements GroovyObject {
    PACKAGE, NAME, DESCRIPTION, DEVICE_TYPE, SUPPORTED_MODES, SHORTCUTS, DISTRO;
    
    private String fieldName;
    
    public static final KeepModuleAttr MIN_VALUE;
    
    public static final KeepModuleAttr MAX_VALUE;
    
    KeepModuleAttr(String fieldName) {
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
        KeepModuleAttr keepModuleAttr;
        Iterator iterator1;
        for (keepModuleAttr = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          keepModuleAttr = (KeepModuleAttr)ShortTypeHandling.castToEnum(iterator1.next(), KeepModuleAttr.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(keepModuleAttr), value))
            return true; 
        } 
        return false;
      } 
      KeepModuleAttr v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(KeepModuleAttr.class)), Iterator.class); iterator.hasNext(); ) {
        v = (KeepModuleAttr)ShortTypeHandling.castToEnum(iterator.next(), KeepModuleAttr.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(KeepModuleAttr.class, "PACKAGE", Integer.valueOf(0), $getCallSiteArray()[16].callGetProperty(MergeRuleType.class));
      PACKAGE = (KeepModuleAttr)ShortTypeHandling.castToEnum(object1, KeepModuleAttr.class);
      Object object2 = $getCallSiteArray()[17].callStatic(KeepModuleAttr.class, "NAME", Integer.valueOf(1), $getCallSiteArray()[18].callGetProperty(MergeRuleType.class));
      NAME = (KeepModuleAttr)ShortTypeHandling.castToEnum(object2, KeepModuleAttr.class);
      Object object3 = $getCallSiteArray()[19].callStatic(KeepModuleAttr.class, "DESCRIPTION", Integer.valueOf(2), $getCallSiteArray()[20].callGetProperty(MergeRuleType.class));
      DESCRIPTION = (KeepModuleAttr)ShortTypeHandling.castToEnum(object3, KeepModuleAttr.class);
      Object object4 = $getCallSiteArray()[21].callStatic(KeepModuleAttr.class, "DEVICE_TYPE", Integer.valueOf(3), $getCallSiteArray()[22].callGetProperty(MergeRuleType.class));
      DEVICE_TYPE = (KeepModuleAttr)ShortTypeHandling.castToEnum(object4, KeepModuleAttr.class);
      Object object5 = $getCallSiteArray()[23].callStatic(KeepModuleAttr.class, "SUPPORTED_MODES", Integer.valueOf(4), $getCallSiteArray()[24].callGetProperty(MergeRuleType.class));
      SUPPORTED_MODES = (KeepModuleAttr)ShortTypeHandling.castToEnum(object5, KeepModuleAttr.class);
      Object object6 = $getCallSiteArray()[25].callStatic(KeepModuleAttr.class, "SHORTCUTS", Integer.valueOf(5), $getCallSiteArray()[26].callGetProperty(MergeRuleType.class));
      SHORTCUTS = (KeepModuleAttr)ShortTypeHandling.castToEnum(object6, KeepModuleAttr.class);
      Object object7 = $getCallSiteArray()[27].callStatic(KeepModuleAttr.class, "DISTRO", Integer.valueOf(6), $getCallSiteArray()[28].callGetProperty(MergeRuleType.class));
      DISTRO = (KeepModuleAttr)ShortTypeHandling.castToEnum(object7, KeepModuleAttr.class);
      KeepModuleAttr keepModuleAttr1 = PACKAGE;
      MIN_VALUE = keepModuleAttr1;
      KeepModuleAttr keepModuleAttr2 = DISTRO;
      MAX_VALUE = keepModuleAttr2;
      KeepModuleAttr[] arrayOfKeepModuleAttr = { PACKAGE, NAME, DESCRIPTION, DEVICE_TYPE, SUPPORTED_MODES, SHORTCUTS, DISTRO };
      $VALUES = arrayOfKeepModuleAttr;
    }
  }
  
  public enum KeepAbilityMergeList implements GroovyObject {
    PERMISSIONS, BACKGROUND_MODES, CONFIG_CHANGES, META_DATA;
    
    private String listName;
    
    public static final KeepAbilityMergeList MIN_VALUE;
    
    public static final KeepAbilityMergeList MAX_VALUE;
    
    KeepAbilityMergeList(String listName) {
      MetaClass metaClass = $getStaticMetaClass();
      String str = listName;
      this.listName = ShortTypeHandling.castToString(str);
    }
    
    public String getListName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.listName;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        KeepAbilityMergeList keepAbilityMergeList;
        Iterator iterator1;
        for (keepAbilityMergeList = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          keepAbilityMergeList = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(iterator1.next(), KeepAbilityMergeList.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(keepAbilityMergeList), value))
            return true; 
        } 
        return false;
      } 
      KeepAbilityMergeList v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(KeepAbilityMergeList.class)), Iterator.class); iterator.hasNext(); ) {
        v = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(iterator.next(), KeepAbilityMergeList.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(KeepAbilityMergeList.class, "PERMISSIONS", Integer.valueOf(0), $getCallSiteArray()[16].callGetProperty(MergeRuleType.class));
      PERMISSIONS = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(object1, KeepAbilityMergeList.class);
      Object object2 = $getCallSiteArray()[17].callStatic(KeepAbilityMergeList.class, "BACKGROUND_MODES", Integer.valueOf(1), $getCallSiteArray()[18].callGetProperty(MergeRuleType.class));
      BACKGROUND_MODES = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(object2, KeepAbilityMergeList.class);
      Object object3 = $getCallSiteArray()[19].callStatic(KeepAbilityMergeList.class, "CONFIG_CHANGES", Integer.valueOf(2), $getCallSiteArray()[20].callGetProperty(MergeRuleType.class));
      CONFIG_CHANGES = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(object3, KeepAbilityMergeList.class);
      Object object4 = $getCallSiteArray()[21].callStatic(KeepAbilityMergeList.class, "META_DATA", Integer.valueOf(3), $getCallSiteArray()[22].callGetProperty(MergeRuleType.class));
      META_DATA = (KeepAbilityMergeList)ShortTypeHandling.castToEnum(object4, KeepAbilityMergeList.class);
      KeepAbilityMergeList keepAbilityMergeList1 = PERMISSIONS;
      MIN_VALUE = keepAbilityMergeList1;
      KeepAbilityMergeList keepAbilityMergeList2 = META_DATA;
      MAX_VALUE = keepAbilityMergeList2;
      KeepAbilityMergeList[] arrayOfKeepAbilityMergeList = { PERMISSIONS, BACKGROUND_MODES, CONFIG_CHANGES, META_DATA };
      $VALUES = arrayOfKeepAbilityMergeList;
    }
  }
  
  public enum KeepOneOfThem implements GroovyObject {
    ALLOW_COMPONENTS_PROXY, ALLOW_CLASS_MAP;
    
    private String fieldName;
    
    public static final KeepOneOfThem MIN_VALUE;
    
    public static final KeepOneOfThem MAX_VALUE;
    
    KeepOneOfThem(String fieldName) {
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
        KeepOneOfThem keepOneOfThem;
        Iterator iterator1;
        for (keepOneOfThem = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          keepOneOfThem = (KeepOneOfThem)ShortTypeHandling.castToEnum(iterator1.next(), KeepOneOfThem.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(keepOneOfThem), value))
            return true; 
        } 
        return false;
      } 
      KeepOneOfThem v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(KeepOneOfThem.class)), Iterator.class); iterator.hasNext(); ) {
        v = (KeepOneOfThem)ShortTypeHandling.castToEnum(iterator.next(), KeepOneOfThem.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(KeepOneOfThem.class, "ALLOW_COMPONENTS_PROXY", Integer.valueOf(0), $getCallSiteArray()[16].callGetProperty(ConfigConst.class));
      ALLOW_COMPONENTS_PROXY = (KeepOneOfThem)ShortTypeHandling.castToEnum(object1, KeepOneOfThem.class);
      Object object2 = $getCallSiteArray()[17].callStatic(KeepOneOfThem.class, "ALLOW_CLASS_MAP", Integer.valueOf(1), $getCallSiteArray()[18].callGetProperty(ConfigConst.class));
      ALLOW_CLASS_MAP = (KeepOneOfThem)ShortTypeHandling.castToEnum(object2, KeepOneOfThem.class);
      KeepOneOfThem keepOneOfThem1 = ALLOW_COMPONENTS_PROXY;
      MIN_VALUE = keepOneOfThem1;
      KeepOneOfThem keepOneOfThem2 = ALLOW_CLASS_MAP;
      MAX_VALUE = keepOneOfThem2;
      KeepOneOfThem[] arrayOfKeepOneOfThem = { ALLOW_COMPONENTS_PROXY, ALLOW_CLASS_MAP };
      $VALUES = arrayOfKeepOneOfThem;
    }
  }
  
  public enum NeedDisposePlaceholder implements GroovyObject {
    PERMISSIONS, READ_PERMISSIONS, WRITE_PERMISSIONS, NAME;
    
    private String filedName;
    
    public static final NeedDisposePlaceholder MIN_VALUE;
    
    public static final NeedDisposePlaceholder MAX_VALUE;
    
    NeedDisposePlaceholder(String fieldName) {
      MetaClass metaClass = $getStaticMetaClass();
      String str = fieldName;
      this.filedName = ShortTypeHandling.castToString(str);
    }
    
    public String getFiledName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.filedName;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        NeedDisposePlaceholder needDisposePlaceholder;
        Iterator iterator1;
        for (needDisposePlaceholder = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          needDisposePlaceholder = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(iterator1.next(), NeedDisposePlaceholder.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(needDisposePlaceholder), value))
            return true; 
        } 
        return false;
      } 
      NeedDisposePlaceholder v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(NeedDisposePlaceholder.class)), Iterator.class); iterator.hasNext(); ) {
        v = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(iterator.next(), NeedDisposePlaceholder.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(NeedDisposePlaceholder.class, "PERMISSIONS", Integer.valueOf(0), $getCallSiteArray()[16].callGetProperty(MergeRuleType.class));
      PERMISSIONS = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(object1, NeedDisposePlaceholder.class);
      Object object2 = $getCallSiteArray()[17].callStatic(NeedDisposePlaceholder.class, "READ_PERMISSIONS", Integer.valueOf(1), $getCallSiteArray()[18].callGetProperty(MergeRuleType.class));
      READ_PERMISSIONS = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(object2, NeedDisposePlaceholder.class);
      Object object3 = $getCallSiteArray()[19].callStatic(NeedDisposePlaceholder.class, "WRITE_PERMISSIONS", Integer.valueOf(2), $getCallSiteArray()[20].callGetProperty(MergeRuleType.class));
      WRITE_PERMISSIONS = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(object3, NeedDisposePlaceholder.class);
      Object object4 = $getCallSiteArray()[21].callStatic(NeedDisposePlaceholder.class, "NAME", Integer.valueOf(3), $getCallSiteArray()[22].callGetProperty(MergeRuleType.class));
      NAME = (NeedDisposePlaceholder)ShortTypeHandling.castToEnum(object4, NeedDisposePlaceholder.class);
      NeedDisposePlaceholder needDisposePlaceholder1 = PERMISSIONS;
      MIN_VALUE = needDisposePlaceholder1;
      NeedDisposePlaceholder needDisposePlaceholder2 = NAME;
      MAX_VALUE = needDisposePlaceholder2;
      NeedDisposePlaceholder[] arrayOfNeedDisposePlaceholder = { PERMISSIONS, READ_PERMISSIONS, WRITE_PERMISSIONS, NAME };
      $VALUES = arrayOfNeedDisposePlaceholder;
    }
  }
  
  public enum HasPlaceholderOptions implements GroovyObject {
    ABILITIES, DEF_PERMISSIONS, DEF_PERMISSION_GROUPS;
    
    private String filedName;
    
    public static final HasPlaceholderOptions MIN_VALUE;
    
    public static final HasPlaceholderOptions MAX_VALUE;
    
    HasPlaceholderOptions(String fieldName) {
      MetaClass metaClass = $getStaticMetaClass();
      String str = fieldName;
      this.filedName = ShortTypeHandling.castToString(str);
    }
    
    public String getFiledName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.filedName;
    }
    
    public static boolean contains(String value) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        HasPlaceholderOptions hasPlaceholderOptions;
        Iterator iterator1;
        for (hasPlaceholderOptions = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(values()), Iterator.class); iterator1.hasNext(); ) {
          hasPlaceholderOptions = (HasPlaceholderOptions)ShortTypeHandling.castToEnum(iterator1.next(), HasPlaceholderOptions.class);
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[4].call(hasPlaceholderOptions), value))
            return true; 
        } 
        return false;
      } 
      HasPlaceholderOptions v;
      Iterator iterator;
      for (v = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callStatic(HasPlaceholderOptions.class)), Iterator.class); iterator.hasNext(); ) {
        v = (HasPlaceholderOptions)ShortTypeHandling.castToEnum(iterator.next(), HasPlaceholderOptions.class);
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].call(v), value))
          return true; 
      } 
      return false;
    }
    
    static {
      Object object1 = $getCallSiteArray()[15].callStatic(HasPlaceholderOptions.class, "ABILITIES", Integer.valueOf(0), $getCallSiteArray()[16].callGetProperty(MergeRuleType.class));
      ABILITIES = (HasPlaceholderOptions)ShortTypeHandling.castToEnum(object1, HasPlaceholderOptions.class);
      Object object2 = $getCallSiteArray()[17].callStatic(HasPlaceholderOptions.class, "DEF_PERMISSIONS", Integer.valueOf(1), $getCallSiteArray()[18].callGetProperty(MergeRuleType.class));
      DEF_PERMISSIONS = (HasPlaceholderOptions)ShortTypeHandling.castToEnum(object2, HasPlaceholderOptions.class);
      Object object3 = $getCallSiteArray()[19].callStatic(HasPlaceholderOptions.class, "DEF_PERMISSION_GROUPS", Integer.valueOf(2), $getCallSiteArray()[20].callGetProperty(MergeRuleType.class));
      DEF_PERMISSION_GROUPS = (HasPlaceholderOptions)ShortTypeHandling.castToEnum(object3, HasPlaceholderOptions.class);
      HasPlaceholderOptions hasPlaceholderOptions1 = ABILITIES;
      MIN_VALUE = hasPlaceholderOptions1;
      HasPlaceholderOptions hasPlaceholderOptions2 = DEF_PERMISSION_GROUPS;
      MAX_VALUE = hasPlaceholderOptions2;
      HasPlaceholderOptions[] arrayOfHasPlaceholderOptions = { ABILITIES, DEF_PERMISSIONS, DEF_PERMISSION_GROUPS };
      $VALUES = arrayOfHasPlaceholderOptions;
    }
  }
}
