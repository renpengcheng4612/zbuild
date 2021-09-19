package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import com.huawei.ohos.build.utils.deserializer.NumberDeserializer;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class FormsOptions implements Options, GroovyObject {
  @Validate(notNull = true, maxLength = 127)
  public String name;
  
  @Validate(maxLength = 255)
  public String description;
  
  @Validate(notNull = true, range = {"Java", "JS"})
  public String type;
  
  @Validate(maxLength = 127)
  public String jsComponentName;
  
  @Validate(range = {"auto", "dark", "light"})
  public String colorMode;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean isDefault;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean updateEnabled;
  
  public String scheduledUpdateTime;
  
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer updateDuration;
  
  @Validate(notNull = true, range = {"1*2", "2*2", "2*4", "4*4"})
  public String defaultDimension;
  
  @Validate(notNull = true, range = {"1*2", "2*2", "2*4", "4*4"})
  public List<String> supportDimensions;
  
  public List<String> landscapeLayouts;
  
  public List<String> portraitLayouts;
  
  public String deepLink;
  
  public MetaDataOptions metaData;
  
  @Validate(maxLength = 127)
  public String formConfigAbility;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean formVisibleNotify;
  
  public FormsOptions() {
    boolean bool = false;
    this.formVisibleNotify = Boolean.valueOf(bool);
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[3].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.name, null) ? Integer.valueOf(0) : arrayOfCallSite[2].call(this.name));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[8].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.type, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.type));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.type, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.type));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[13].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.isDefault, null) ? Integer.valueOf(0) : arrayOfCallSite[14].call(this.isDefault));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.isDefault, null) ? Integer.valueOf(0) : arrayOfCallSite[12].call(this.isDefault));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[18].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.updateEnabled, null) ? Integer.valueOf(0) : arrayOfCallSite[19].call(this.updateEnabled));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[15].call(arrayOfCallSite[16].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.updateEnabled, null) ? Integer.valueOf(0) : arrayOfCallSite[17].call(this.updateEnabled));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[23].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.scheduledUpdateTime, null) ? Integer.valueOf(0) : arrayOfCallSite[24].call(this.scheduledUpdateTime));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[20].call(arrayOfCallSite[21].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.scheduledUpdateTime, null) ? Integer.valueOf(0) : arrayOfCallSite[22].call(this.scheduledUpdateTime));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[28].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.defaultDimension, null) ? Integer.valueOf(0) : arrayOfCallSite[29].call(this.defaultDimension));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[25].call(arrayOfCallSite[26].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.defaultDimension, null) ? Integer.valueOf(0) : arrayOfCallSite[27].call(this.defaultDimension));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[33].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.supportDimensions, null) ? Integer.valueOf(0) : arrayOfCallSite[34].call(this.supportDimensions));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[30].call(arrayOfCallSite[31].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.supportDimensions, null) ? Integer.valueOf(0) : arrayOfCallSite[32].call(this.supportDimensions));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public void setName(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
  }
  
  public String getDescription() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.description;
  }
  
  public void setDescription(String description) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = description;
    this.description = ShortTypeHandling.castToString(str);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public void setType(String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = type;
    this.type = ShortTypeHandling.castToString(str);
  }
  
  public String getJsComponentName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.jsComponentName;
  }
  
  public void setJsComponentName(String jsComponentName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = jsComponentName;
    this.jsComponentName = ShortTypeHandling.castToString(str);
  }
  
  public String getColorMode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.colorMode;
  }
  
  public void setColorMode(String colorMode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = colorMode;
    this.colorMode = ShortTypeHandling.castToString(str);
  }
  
  public Boolean getIsDefault() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.isDefault;
  }
  
  public void setIsDefault(Boolean isDefault) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = isDefault;
    this.isDefault = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public Boolean getUpdateEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.updateEnabled;
  }
  
  public void setUpdateEnabled(Boolean updateEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = updateEnabled;
    this.updateEnabled = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getDefaultDimension() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defaultDimension;
  }
  
  public void setDefaultDimension(String defaultDimension) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = defaultDimension;
    this.defaultDimension = ShortTypeHandling.castToString(str);
  }
  
  public List<String> getSupportDimensions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.supportDimensions;
  }
  
  public void setSupportDimensions(List supportDimensions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = supportDimensions;
    this.supportDimensions = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getScheduledUpdateTime() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.scheduledUpdateTime;
  }
  
  public void setScheduledUpdateTime(String scheduledUpdateTime) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = scheduledUpdateTime;
    this.scheduledUpdateTime = ShortTypeHandling.castToString(str);
  }
  
  public Integer getUpdateDuration() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.updateDuration;
  }
  
  public void setUpdateDuration(Integer updateDuration) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = updateDuration;
    this.updateDuration = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public List<String> getLandscapeLayouts() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.landscapeLayouts;
  }
  
  public void setLandscapeLayouts(List landscapeLayouts) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = landscapeLayouts;
    this.landscapeLayouts = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getPortraitLayouts() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.portraitLayouts;
  }
  
  public void setPortraitLayouts(List portraitLayouts) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = portraitLayouts;
    this.portraitLayouts = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getDeepLink() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.deepLink;
  }
  
  public void setDeepLink(String deepLink) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = deepLink;
    this.deepLink = ShortTypeHandling.castToString(str);
  }
  
  public MetaDataOptions getMetaData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.metaData;
  }
  
  public void setMetaData(MetaDataOptions metaData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    MetaDataOptions metaDataOptions = metaData;
    this.metaData = (MetaDataOptions)ScriptBytecodeAdapter.castToType(metaDataOptions, MetaDataOptions.class);
  }
  
  public Boolean getFormVisibleNotify() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.formVisibleNotify;
  }
  
  public void setFormVisibleNotify(Boolean formVisibleNotify) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = formVisibleNotify;
    this.formVisibleNotify = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getFormConfigAbility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.formConfigAbility;
  }
  
  public void setFormConfigAbility(String formConfigAbility) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = formConfigAbility;
    this.formConfigAbility = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[35].call(arrayOfCallSite[36].call(arrayOfCallSite[37].call(arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].call(arrayOfCallSite[54].call(arrayOfCallSite[55].call(arrayOfCallSite[56].call(arrayOfCallSite[57].call(arrayOfCallSite[58].call(arrayOfCallSite[59].call(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call(arrayOfCallSite[66].call(arrayOfCallSite[67].call(arrayOfCallSite[68].call(arrayOfCallSite[69].call(arrayOfCallSite[70].call(arrayOfCallSite[71].call(arrayOfCallSite[72].call(arrayOfCallSite[73].call(arrayOfCallSite[74].call(arrayOfCallSite[75].call("FormsOptions{", "name='"), this.name), "'"), ", description='"), this.description), "'"), ", type='"), this.type), "'"), ", jsComponentName='"), this.jsComponentName), "'"), ", colorMode='"), this.colorMode), "'"), ", isDefault="), this.isDefault), ", updateEnabled="), this.updateEnabled), ", scheduledUpdateTime='"), this.scheduledUpdateTime), "'"), ", updateDuration="), this.updateDuration), ", defaultDimension='"), this.defaultDimension), "'"), ", supportDimensions="), this.supportDimensions), ", landscapeLayouts='"), this.landscapeLayouts), "'"), ", portraitLayouts='"), this.portraitLayouts), "'"), ", deepLink='"), this.deepLink), "'"), ", metaData="), this.metaData), "}"));
  }
}
