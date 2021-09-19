package com.huawei.ohos.build.dsl;

import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;

public class ModuleExtensionData implements GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[11].call(HMLogger.class, ModuleExtensionData.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static List<String> getEntryModules(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> entryModules = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(ArrayList.class), List.class);
    String entryModulesStr = ShortTypeHandling.castToString(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(project)));
    if (ScriptBytecodeAdapter.compareNotEqual(entryModulesStr, null)) {
      Object object = arrayOfCallSite[3].call(arrayOfCallSite[4].call(Arrays.class, arrayOfCallSite[5].call(entryModulesStr, ",")), new _getEntryModules_closure1(ModuleExtensionData.class, ModuleExtensionData.class));
      entryModules = (List)ScriptBytecodeAdapter.castToType(object, List.class);
    } else {
      arrayOfCallSite[6].call(hmLogger, arrayOfCallSite[7].callConstructor(GradleException.class, arrayOfCallSite[8].call(new GStringImpl(new Object[] { arrayOfCallSite[9].callGetProperty(project) }, new String[] { "Failed to get 'entryModules' from the 'build.gradle' of the '", "', " }), new GStringImpl(new Object[] { arrayOfCallSite[10].callGetProperty(project) }, new String[] { "the 'entryModules' parameter in the feature module of the '", "'. " }))));
    } 
    return entryModules;
  }
  
  @Generated
  public ModuleExtensionData() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public final class _getEntryModules_closure1 extends Closure implements GeneratedClosure {
    public _getEntryModules_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(it);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
