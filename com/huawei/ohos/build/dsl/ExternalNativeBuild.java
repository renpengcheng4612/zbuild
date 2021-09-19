package com.huawei.ohos.build.dsl;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class ExternalNativeBuild implements GroovyObject {
  private String path;
  
  private String version;
  
  private String[] cppFlags;
  
  private String[] cFlags;
  
  private String[] arguments;
  
  private String[] abiFilters;
  
  @Inject
  public ExternalNativeBuild(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public String getPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.path;
  }
  
  public String getVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.version;
  }
  
  public String[] getCppFlags() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.cppFlags, null))
      return (String[])ScriptBytecodeAdapter.castToType(null, String[].class); 
    return (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(this.cppFlags), String[].class);
  }
  
  public String[] getcFlags() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.cFlags, null))
      return (String[])ScriptBytecodeAdapter.castToType(null, String[].class); 
    return (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(this.cFlags), String[].class);
  }
  
  public String[] getArguments() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.arguments, null))
      return (String[])ScriptBytecodeAdapter.castToType(null, String[].class); 
    return (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(this.arguments), String[].class);
  }
  
  public String[] getAbiFilters() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.abiFilters, null))
      return (String[])ScriptBytecodeAdapter.castToType(null, String[].class); 
    return (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(this.abiFilters), String[].class);
  }
  
  public boolean containCFlags() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (((ScriptBytecodeAdapter.compareNotEqual(this.cFlags, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[7].callGetProperty(this.cFlags), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[8].call(BytecodeInterface8.objectArrayGet((Object[])this.cFlags, 0)), Integer.valueOf(0))); 
    return (((ScriptBytecodeAdapter.compareNotEqual(this.cFlags, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[4].callGetProperty(this.cFlags), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[5].call(arrayOfCallSite[6].call(this.cFlags, Integer.valueOf(0))), Integer.valueOf(0)));
  }
  
  public boolean containCppFlags() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return (((ScriptBytecodeAdapter.compareNotEqual(this.cppFlags, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[12].callGetProperty(this.cppFlags), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[13].call(BytecodeInterface8.objectArrayGet((Object[])this.cppFlags, 0)), Integer.valueOf(0))); 
    return (((ScriptBytecodeAdapter.compareNotEqual(this.cppFlags, null) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[9].callGetProperty(this.cppFlags), Integer.valueOf(0)))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[10].call(arrayOfCallSite[11].call(this.cppFlags, Integer.valueOf(0))), Integer.valueOf(0)));
  }
  
  public List<String> getArgumentList() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.arguments, null))
      return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(ArrayList.class), List.class); 
    List<String> argumentList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[15].callConstructor(ArrayList.class), List.class);
    String argument;
    Iterator iterator;
    for (argument = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(this.arguments), Iterator.class); iterator.hasNext(); ) {
      argument = ShortTypeHandling.castToString(iterator.next());
      String[] arr = (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].call(argument, " "), String[].class);
      arrayOfCallSite[18].call(argumentList, arr);
    } 
    return argumentList;
  }
  
  public boolean containsArgument(String parameter) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> argumentList = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<String> list = getArgumentList();
    } else {
      Object object = arrayOfCallSite[19].callCurrent(this);
      argumentList = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
    } 
    String argument;
    Iterator iterator;
    for (argument = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].call(argumentList), Iterator.class); iterator.hasNext(); ) {
      argument = ShortTypeHandling.castToString(iterator.next());
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[21].call(argument, parameter)))
        return true; 
    } 
    return false;
  }
  
  public boolean getArgumentValue(String parameter) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> argumentList = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      List<String> list = getArgumentList();
    } else {
      Object object = arrayOfCallSite[22].callCurrent(this);
      argumentList = (List<String>)ScriptBytecodeAdapter.castToType(object, List.class);
    } 
    String argument = null;
    String temp;
    Iterator iterator;
    for (temp = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(argumentList), Iterator.class); iterator.hasNext(); ) {
      temp = ShortTypeHandling.castToString(iterator.next());
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(temp, parameter))) {
        String str = temp;
        break;
      } 
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(null, argument)) {
      String[] arr = (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[25].call(argument, "="), String[].class);
      return (BytecodeInterface8.isOrigInt() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? DefaultTypeTransformation.booleanUnbox(BytecodeInterface8.objectArrayGet((Object[])arr, 1)) : DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[26].call(arr, Integer.valueOf(1)));
    } 
    return DefaultTypeTransformation.booleanUnbox(null);
  }
  
  public List<String> getAbiFilterList() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.abiFilters, null) || ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[30].callGetProperty(this.abiFilters), Integer.valueOf(1)) && ScriptBytecodeAdapter.compareEqual(BytecodeInterface8.objectArrayGet((Object[])this.abiFilters, 0), "")))))
        return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].callConstructor(ArrayList.class), List.class); 
      return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(Arrays.class, this.abiFilters), List.class);
    } 
    if ((ScriptBytecodeAdapter.compareEqual(this.abiFilters, null) || ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[27].callGetProperty(this.abiFilters), Integer.valueOf(1)) && ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[28].call(this.abiFilters, Integer.valueOf(0)), "")))))
      return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].callConstructor(ArrayList.class), List.class); 
    return (List<String>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(Arrays.class, this.abiFilters), List.class);
  }
  
  public String getCFlagStr() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(this.cFlags, null))
      return ShortTypeHandling.castToString(arrayOfCallSite[33].call(String.class, " ", this.cFlags)); 
    return ShortTypeHandling.castToString(null);
  }
  
  public String getCppFlagStr() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(this.cppFlags, null))
      return ShortTypeHandling.castToString(arrayOfCallSite[34].call(String.class, " ", this.cppFlags)); 
    return ShortTypeHandling.castToString(null);
  }
  
  public boolean isConfigured() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((((((((ScriptBytecodeAdapter.compareNotEqual(this.path, null) || ScriptBytecodeAdapter.compareNotEqual(this.version, null))) || containCFlags())) || containCppFlags())) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[41].call(getArgumentList()))))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[42].call(getAbiFilterList())))))
        return true; 
      return false;
    } 
    if ((((((((((ScriptBytecodeAdapter.compareNotEqual(this.path, null) || ScriptBytecodeAdapter.compareNotEqual(this.version, null))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[35].callCurrent(this)))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[36].callCurrent(this)))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[37].call(arrayOfCallSite[38].callCurrent(this)))))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[39].call(arrayOfCallSite[40].callCurrent(this))))))
      return true; 
    return false;
  }
  
  @Generated
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  @Generated
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  @Generated
  public void setCppFlags(String... paramVarArgs) {
    this.cppFlags = paramVarArgs;
  }
  
  @Generated
  public void setcFlags(String... paramVarArgs) {
    this.cFlags = paramVarArgs;
  }
  
  @Generated
  public void setArguments(String... paramVarArgs) {
    this.arguments = paramVarArgs;
  }
  
  @Generated
  public void setAbiFilters(String... paramVarArgs) {
    this.abiFilters = paramVarArgs;
  }
}
