package com.huawei.ohos.build.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.shell.AbilitiesOptions;
import com.huawei.ohos.build.shell.ConfigOptions;
import com.huawei.ohos.build.shell.SkillsOptions;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.file.FileTree;

public class ShellUtils implements GroovyObject {
  public static final String JS_SHELL_PACKAGE = "com.example.myapplication";
  
  public static final String JS_SHELL_APPLICATION = "ShellMyApplication";
  
  public static final String JS_SHELL_ABILITY = "MainAbility";
  
  public static final String JS_SHELL_APPLICATION_FULL = "com.example.myapplication.ShellMyApplication";
  
  public static final String JS_SHELL_ABILITY_FULL = "com.example.myapplication.MainAbility";
  
  private static final String[] JS_JAVA_TEMPLATE;
  
  @Generated
  public ShellUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static String getShellActivity(Project project, String shellName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ConfigInfo configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(GlobalDataManager.class, project), project), ConfigInfo.class);
    String packageName = ShortTypeHandling.castToString(arrayOfCallSite[2].call(configInfo));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(configInfo))) {
      int index = DefaultTypeTransformation.intUnbox(arrayOfCallSite[4].call(shellName, "."));
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((index > 0)) {
          Object object = arrayOfCallSite[7].call(shellName, Integer.valueOf(index + 1));
          shellName = ShortTypeHandling.castToString(object);
        } 
        return ShortTypeHandling.castToString(arrayOfCallSite[8].call(arrayOfCallSite[9].call(JS_SHELL_PACKAGE, "."), arrayOfCallSite[10].call(shellName)));
      } 
      if ((index > 0)) {
        Object object = arrayOfCallSite[5].call(shellName, arrayOfCallSite[6].call(Integer.valueOf(index), Integer.valueOf(1)));
        shellName = ShortTypeHandling.castToString(object);
      } 
      return ShortTypeHandling.castToString(arrayOfCallSite[8].call(arrayOfCallSite[9].call(JS_SHELL_PACKAGE, "."), arrayOfCallSite[10].call(shellName)));
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(shellName, "."))) {
      Object object = arrayOfCallSite[12].call(packageName, shellName);
      shellName = ShortTypeHandling.castToString(object);
    } 
    return shellName;
  }
  
  public static String getAbilityPackageName(ConfigInfo configInfo, AbilitiesOptions ability) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(configInfo)))
      return JS_SHELL_PACKAGE; 
    String packageName = ShortTypeHandling.castToString(arrayOfCallSite[14].call(configInfo));
    String abilityName = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[15].call(ability), null) ? arrayOfCallSite[16].call(ability) : arrayOfCallSite[17].call(ability));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(abilityName, "."))) {
      Object object = arrayOfCallSite[19].call(packageName, abilityName);
      abilityName = ShortTypeHandling.castToString(object);
    } 
    return ShortTypeHandling.castToString(arrayOfCallSite[20].call(abilityName, Integer.valueOf(0), arrayOfCallSite[21].call(abilityName, ".")));
  }
  
  public static void modifyShellProfile(ConfigOptions configOptions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[22].call(arrayOfCallSite[23].call(configOptions), JS_SHELL_PACKAGE);
    List abilitiesOptionsList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(arrayOfCallSite[25].call(configOptions)), List.class);
    arrayOfCallSite[26].call(abilitiesOptionsList, new _modifyShellProfile_closure1(ShellUtils.class, ShellUtils.class));
  }
  
  public final class _modifyShellProfile_closure1 extends Closure implements GeneratedClosure {
    public _modifyShellProfile_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object ability) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(ability, arrayOfCallSite[1].callGetProperty(ShellUtils.class));
      List skills = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(ArrayList.class), List.class);
      Map skillMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callConstructor(HashMap.class), Map.class);
      List actions = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(ArrayList.class), List.class);
      arrayOfCallSite[5].call(actions, "action.system.home");
      arrayOfCallSite[6].call(skillMap, "actions", actions);
      List entities = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(ArrayList.class), List.class);
      arrayOfCallSite[8].call(entities, "entity.system.home");
      arrayOfCallSite[9].call(skillMap, "entities", entities);
      arrayOfCallSite[10].call(skills, arrayOfCallSite[11].callConstructor(SkillsOptions.class, skillMap));
      return arrayOfCallSite[12].call(ability, skills);
    }
  }
  
  public static void modifyShellProfile(JSONObject jsonObject) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    JSONObject moduleObj = (JSONObject)ScriptBytecodeAdapter.castToType(arrayOfCallSite[27].call(jsonObject, "module"), JSONObject.class);
    arrayOfCallSite[28].call(moduleObj, "package", JS_SHELL_PACKAGE);
    JSONArray abilitiesObj = (JSONArray)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(moduleObj, "abilities"), JSONArray.class);
    JSONArray skillsObj = (JSONArray)ScriptBytecodeAdapter.castToType(arrayOfCallSite[30].callConstructor(JSONArray.class), JSONArray.class);
    JSONObject skillObj = (JSONObject)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].callConstructor(JSONObject.class), JSONObject.class);
    JSONArray actionsObj = (JSONArray)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].callConstructor(JSONArray.class), JSONArray.class);
    arrayOfCallSite[33].call(actionsObj, "action.system.home");
    JSONArray entitiesObj = (JSONArray)ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].callConstructor(JSONArray.class), JSONArray.class);
    arrayOfCallSite[35].call(entitiesObj, "entity.system.home");
    arrayOfCallSite[36].call(skillObj, "actions", actionsObj);
    arrayOfCallSite[37].call(skillObj, "entities", entitiesObj);
    arrayOfCallSite[38].call(skillsObj, skillObj);
    Object ability;
    Iterator iterator;
    for (ability = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(abilitiesObj), Iterator.class); iterator.hasNext(); ) {
      ability = iterator.next();
      JSONObject abilityObj = (JSONObject)ScriptBytecodeAdapter.asType(ability, JSONObject.class);
      arrayOfCallSite[40].call(abilityObj, "name", JS_SHELL_ABILITY_FULL);
      arrayOfCallSite[41].call(abilityObj, "skills", skillsObj);
    } 
  }
  
  public static FileTree putLiteDeviceJavaFile(PathInfo pathInfo, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Path tmpJavaPath = (Path)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].call(Paths.class, arrayOfCallSite[43].call(pathInfo), arrayOfCallSite[44].call(JS_SHELL_PACKAGE, "\\.", "/")), Path.class);
    arrayOfCallSite[45].call(FileUtils.class, arrayOfCallSite[46].call(tmpJavaPath));
    String javaFile;
    Iterator iterator;
    for (javaFile = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(JS_JAVA_TEMPLATE), Iterator.class); iterator.hasNext(); ) {
      javaFile = ShortTypeHandling.castToString(iterator.next());
      String fileName = ShortTypeHandling.castToString(arrayOfCallSite[48].call(javaFile, arrayOfCallSite[49].call(arrayOfCallSite[50].call(javaFile, "/"), Integer.valueOf(1))));
      arrayOfCallSite[51].call(FileUtils.class, javaFile, arrayOfCallSite[52].call(arrayOfCallSite[53].call(Paths.class, arrayOfCallSite[54].call(tmpJavaPath), fileName)));
    } 
    return (FileTree)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].call(project, tmpJavaPath), FileTree.class);
  }
  
  static {
    String[] arrayOfString = { "/templates/shell/MyApplication.java", "/templates/shell/MainAbility.java" };
    JS_JAVA_TEMPLATE = arrayOfString;
  }
}
