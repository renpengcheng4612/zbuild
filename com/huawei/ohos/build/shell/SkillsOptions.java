package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.utils.XmlNodeHandler;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class SkillsOptions extends Transform2Node {
  public List<String> actions;
  
  public List<String> entities;
  
  public List<String> attributes;
  
  public List<UrisOptions> uris;
  
  public SkillsOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Node intentFilter = null;
    HashMap actionMap = (HashMap)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(HashMap.class), HashMap.class);
    arrayOfCallSite[1].call(actionMap, "action.system.home", "android.intent.action.MAIN");
    arrayOfCallSite[2].call(actionMap, "ohos.intent.action.dial", "android.intent.action.DIAL");
    arrayOfCallSite[3].call(actionMap, "ohos.intent.action.search", "android.intent.action.SEARCH");
    arrayOfCallSite[4].call(actionMap, "ohos.settings.wireless", "android.settings.WIRELESS_SETTINGS");
    arrayOfCallSite[5].call(actionMap, "ohos.settings.manage.applications", "android.settings.MANAGE_APPLICATIONS_SETTINGS");
    arrayOfCallSite[6].call(actionMap, "ohos.settings.application.details", "android.settings.APPLICATION_DETAILS_SETTINGS");
    arrayOfCallSite[7].call(actionMap, "ohos.intent.action.setalarm", "android.intent.action.SET_ALARM");
    arrayOfCallSite[8].call(actionMap, "ohos.intent.action.showalarms", "android.intent.action.SHOW_ALARMS");
    arrayOfCallSite[9].call(actionMap, "ohos.intent.action.snoozealarm", "android.intent.action.SNOOZE_ALARM");
    arrayOfCallSite[10].call(actionMap, "ohos.intent.action.dismissalarm", "android.intent.action.DISMISS_ALARM");
    arrayOfCallSite[11].call(actionMap, "ohos.intent.action.dismisstimer", "android.intent.action.DISMISS_TIMER");
    arrayOfCallSite[12].call(actionMap, "ohos.intent.action.CALL", "android.intent.action.CALL");
    arrayOfCallSite[13].call(actionMap, "ohos.intent.action.connectInputMethod", "android.view.InputMethod");
    arrayOfCallSite[14].call(actionMap, "ohos.accessibilityservice.AccessibilityService", "android.accessibilityservice.AccessibilityService");
    HashMap entriesMap = (HashMap)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callConstructor(HashMap.class), HashMap.class);
    arrayOfCallSite[16].call(entriesMap, "entity.system.default", "android.intent.category.DEFAULT");
    arrayOfCallSite[17].call(entriesMap, "entity.system.voice", "android.intent.category.VOICE");
    arrayOfCallSite[18].call(entriesMap, "entity.system.home", "android.intent.category.LAUNCHER");
    XmlNodeHandler handler = (XmlNodeHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].callConstructor(XmlNodeHandler.class), XmlNodeHandler.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int i = 0; (ScriptBytecodeAdapter.compareNotEqual(this.actions, null) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[29].call(this.actions))); ) {
        String actionValue = ShortTypeHandling.castToString(arrayOfCallSite[30].call(this.actions, Integer.valueOf(i)));
        if (ScriptBytecodeAdapter.compareEqual(intentFilter, null)) {
          Object object = arrayOfCallSite[31].callConstructor(Node.class, parent, "intent-filter", arrayOfCallSite[32].callConstructor(HashMap.class));
          intentFilter = (Node)ScriptBytecodeAdapter.castToType(object, Node.class);
        } 
        Node actionNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(Node.class, intentFilter, "action", arrayOfCallSite[34].callConstructor(HashMap.class)), Node.class);
        arrayOfCallSite[35].call(handler, actionNode, "android:name", arrayOfCallSite[36].call(actionMap, actionValue, actionValue));
        int j;
        i = (j = i) + 1;
      } 
    } else {
      for (int i = 0; (ScriptBytecodeAdapter.compareNotEqual(this.actions, null) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[20].call(this.actions))); ) {
        String actionValue = ShortTypeHandling.castToString(arrayOfCallSite[21].call(this.actions, Integer.valueOf(i)));
        if (ScriptBytecodeAdapter.compareEqual(intentFilter, null)) {
          Object object = arrayOfCallSite[22].callConstructor(Node.class, parent, "intent-filter", arrayOfCallSite[23].callConstructor(HashMap.class));
          intentFilter = (Node)ScriptBytecodeAdapter.castToType(object, Node.class);
        } 
        Node actionNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].callConstructor(Node.class, intentFilter, "action", arrayOfCallSite[25].callConstructor(HashMap.class)), Node.class);
        arrayOfCallSite[26].call(handler, actionNode, "android:name", arrayOfCallSite[27].call(actionMap, actionValue, actionValue));
        int j;
        i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[28].call(Integer.valueOf(j = i)));
        arrayOfCallSite[28].call(Integer.valueOf(j = i));
      } 
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int i = 0; (ScriptBytecodeAdapter.compareNotEqual(this.entities, null) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[46].call(this.entities))); ) {
        String categoryValue = ShortTypeHandling.castToString(arrayOfCallSite[47].call(this.entities, Integer.valueOf(i)));
        if (ScriptBytecodeAdapter.compareEqual(intentFilter, null)) {
          Object object = arrayOfCallSite[48].callConstructor(Node.class, parent, "intent-filter", arrayOfCallSite[49].callConstructor(HashMap.class));
          intentFilter = (Node)ScriptBytecodeAdapter.castToType(object, Node.class);
        } 
        Node categoryNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[50].callConstructor(Node.class, intentFilter, "category", arrayOfCallSite[51].callConstructor(HashMap.class)), Node.class);
        arrayOfCallSite[52].call(handler, categoryNode, "android:name", arrayOfCallSite[53].call(entriesMap, categoryValue, categoryValue));
        int j;
        i = (j = i) + 1;
      } 
    } else {
      for (int i = 0; (ScriptBytecodeAdapter.compareNotEqual(this.entities, null) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[37].call(this.entities))); ) {
        String categoryValue = ShortTypeHandling.castToString(arrayOfCallSite[38].call(this.entities, Integer.valueOf(i)));
        if (ScriptBytecodeAdapter.compareEqual(intentFilter, null)) {
          Object object = arrayOfCallSite[39].callConstructor(Node.class, parent, "intent-filter", arrayOfCallSite[40].callConstructor(HashMap.class));
          intentFilter = (Node)ScriptBytecodeAdapter.castToType(object, Node.class);
        } 
        Node categoryNode = (Node)ScriptBytecodeAdapter.castToType(arrayOfCallSite[41].callConstructor(Node.class, intentFilter, "category", arrayOfCallSite[42].callConstructor(HashMap.class)), Node.class);
        arrayOfCallSite[43].call(handler, categoryNode, "android:name", arrayOfCallSite[44].call(entriesMap, categoryValue, categoryValue));
        int j;
        i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[45].call(Integer.valueOf(j = i)));
        arrayOfCallSite[45].call(Integer.valueOf(j = i));
      } 
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(this.uris, null)) {
      UrisOptions uriInfo;
      Iterator iterator;
      for (uriInfo = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[54].call(this.uris), Iterator.class); iterator.hasNext(); ) {
        uriInfo = (UrisOptions)ScriptBytecodeAdapter.castToType(iterator.next(), UrisOptions.class);
        if (ScriptBytecodeAdapter.compareNotEqual(uriInfo, null)) {
          if (ScriptBytecodeAdapter.compareEqual(intentFilter, null)) {
            Object object = arrayOfCallSite[55].callConstructor(Node.class, parent, "intent-filter", arrayOfCallSite[56].callConstructor(HashMap.class));
            intentFilter = (Node)ScriptBytecodeAdapter.castToType(object, Node.class);
          } 
          arrayOfCallSite[57].call(uriInfo, intentFilter, moduleType, project);
        } 
      } 
    } 
  }
  
  public List<String> getActions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.actions;
  }
  
  public void setActions(List actions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = actions;
    this.actions = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getEntities() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.entities;
  }
  
  public void setEntities(List entities) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = entities;
    this.entities = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getAttributes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.attributes;
  }
  
  public void setAttributes(List attributes) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = attributes;
    this.attributes = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<UrisOptions> getUris() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.uris;
  }
  
  public void setUris(List uris) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = uris;
    this.uris = (List<UrisOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
