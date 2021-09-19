package com.huawei.ohos.build.shell.permission;

import com.huawei.ohos.build.shell.Options;
import com.huawei.ohos.build.utils.ListUtils;
import com.huawei.ohos.build.utils.configJson.CastTransformUtil;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class UsedSceneOptions implements Options, GroovyObject {
  public List<String> ability;
  
  public String when;
  
  public UsedSceneOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public UsedSceneOptions(Map usedSceneMap) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(CastTransformUtil.class, arrayOfCallSite[1].call(usedSceneMap, "ability"), String.class);
    this.ability = (List<String>)ScriptBytecodeAdapter.castToType(object1, List.class);
    Object object2 = arrayOfCallSite[2].call(usedSceneMap, "when");
    this.when = ShortTypeHandling.castToString(object2);
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 17;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[6].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.ability, null) ? Integer.valueOf(0) : arrayOfCallSite[7].call(this.ability));
      result = DefaultTypeTransformation.intUnbox(object1);
    } else {
      Object object1 = arrayOfCallSite[3].call(arrayOfCallSite[4].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.ability, null) ? Integer.valueOf(0) : arrayOfCallSite[5].call(this.ability));
      result = DefaultTypeTransformation.intUnbox(object1);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[11].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareEqual(this.when, null) ? Integer.valueOf(0) : arrayOfCallSite[12].call(this.when));
      result = DefaultTypeTransformation.intUnbox(object1);
      return result;
    } 
    Object object = arrayOfCallSite[8].call(arrayOfCallSite[9].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareEqual(this.when, null) ? Integer.valueOf(0) : arrayOfCallSite[10].call(this.when));
    result = DefaultTypeTransformation.intUnbox(object);
    return result;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!(obj instanceof UsedSceneOptions))
      return false; 
    UsedSceneOptions otherObj = (UsedSceneOptions)ScriptBytecodeAdapter.castToType(obj, UsedSceneOptions.class);
    return (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(ListUtils.class, this.ability, arrayOfCallSite[14].callGroovyObjectGetProperty(otherObj))) && 
      DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(Objects.class, this.when, arrayOfCallSite[16].callGroovyObjectGetProperty(otherObj))));
  }
  
  public List<String> getAbility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.ability;
  }
  
  public void setAbility(List ability) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = ability;
    this.ability = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getWhen() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.when;
  }
  
  public void setWhen(String when) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = when;
    this.when = ShortTypeHandling.castToString(str);
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
}
