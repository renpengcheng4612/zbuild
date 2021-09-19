package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.utils.ListUtils;
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

public class FormOptions implements Options, GroovyObject {
  @Validate(range = {"homeScreen", "searchbox"})
  public List<String> formEntity;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer minHeight;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer defaultHeight;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer minWidth;
  
  @Validate(notNull = true)
  @JsonDeserialize(using = NumberDeserializer.class)
  public Integer defaultWidth;
  
  public FormOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[3].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.formEntity, null) ? Integer.valueOf(0) : arrayOfCallSite[4].call(this.formEntity));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.formEntity, null) ? Integer.valueOf(0) : arrayOfCallSite[2].call(this.formEntity));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[8].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.minHeight, null) ? Integer.valueOf(0) : arrayOfCallSite[9].call(this.minHeight));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[5].call(arrayOfCallSite[6].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.minHeight, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.minHeight));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[13].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.defaultHeight, null) ? Integer.valueOf(0) : arrayOfCallSite[14].call(this.defaultHeight));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.defaultHeight, null) ? Integer.valueOf(0) : arrayOfCallSite[12].call(this.defaultHeight));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[18].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.minWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[19].call(this.minWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[15].call(arrayOfCallSite[16].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.minWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[17].call(this.minWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[23].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.defaultWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[24].call(this.defaultWidth));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[20].call(arrayOfCallSite[21].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.defaultWidth, null) ? Integer.valueOf(0) : arrayOfCallSite[22].call(this.defaultWidth));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (obj instanceof FormOptions) {
      FormOptions otherObj = (FormOptions)ScriptBytecodeAdapter.castToType(obj, FormOptions.class);
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((((((((ScriptBytecodeAdapter.compareEqual(this.defaultHeight, arrayOfCallSite[31].callGroovyObjectGetProperty(otherObj)) && ScriptBytecodeAdapter.compareEqual(this.minHeight, arrayOfCallSite[32].callGroovyObjectGetProperty(otherObj)))) && ScriptBytecodeAdapter.compareEqual(this.defaultWidth, arrayOfCallSite[33].callGroovyObjectGetProperty(otherObj)))) && ScriptBytecodeAdapter.compareEqual(this.minWidth, arrayOfCallSite[34].callGroovyObjectGetProperty(otherObj)))) && 
          DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[35].call(ListUtils.class, this.formEntity, arrayOfCallSite[36].callGroovyObjectGetProperty(otherObj)))))
          return true; 
        return false;
      } 
      if ((((((((ScriptBytecodeAdapter.compareEqual(this.defaultHeight, arrayOfCallSite[25].callGroovyObjectGetProperty(otherObj)) && ScriptBytecodeAdapter.compareEqual(this.minHeight, arrayOfCallSite[26].callGroovyObjectGetProperty(otherObj)))) && ScriptBytecodeAdapter.compareEqual(this.defaultWidth, arrayOfCallSite[27].callGroovyObjectGetProperty(otherObj)))) && ScriptBytecodeAdapter.compareEqual(this.minWidth, arrayOfCallSite[28].callGroovyObjectGetProperty(otherObj)))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(ListUtils.class, this.formEntity, arrayOfCallSite[30].callGroovyObjectGetProperty(otherObj)))))
        return true; 
    } 
    return false;
  }
  
  public List<String> getFormEntity() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.formEntity;
  }
  
  public void setFormEntity(List formEntity) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = formEntity;
    this.formEntity = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public Integer getMinHeight() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.minHeight;
  }
  
  public void setMinHeight(Integer minHeight) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = minHeight;
    this.minHeight = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getMinWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.minWidth;
  }
  
  public void setMinWidth(Integer minWidth) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = minWidth;
    this.minWidth = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getDefaultHeight() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defaultHeight;
  }
  
  public void setDefaultHeight(Integer defaultHeight) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = defaultHeight;
    this.defaultHeight = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getDefaultWidth() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defaultWidth;
  }
  
  public void setDefaultWidth(Integer defaultWidth) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = defaultWidth;
    this.defaultWidth = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
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
        
        arrayOfCallSite[37].call(arrayOfCallSite[38].call(arrayOfCallSite[39].call(arrayOfCallSite[40].call(arrayOfCallSite[41].call(arrayOfCallSite[42].call(arrayOfCallSite[43].call(arrayOfCallSite[44].call(arrayOfCallSite[45].call(arrayOfCallSite[46].call(arrayOfCallSite[47].call("FormOptions{", "formEntity="), this.formEntity), ", minHeight="), this.minHeight), ", defaultHeight="), this.defaultHeight), ", minWidth="), this.minWidth), ", defaultWidth="), this.defaultWidth), "}"));
  }
}
