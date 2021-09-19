package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.dsl.CmakeThread;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class CompileNativeWithCmake extends DefaultTask implements GroovyObject {
  @NonNull
  private VariantData variantData;
  
  private ExternalNativeBuild nativeBuild;
  
  @Inject
  public CompileNativeWithCmake(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGroovyObjectGetProperty(this)));
    this.nativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(object, ExternalNativeBuild.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.nativeBuild, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(this.nativeBuild)))))
        return; 
    } else if ((ScriptBytecodeAdapter.compareEqual(this.nativeBuild, null) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(this.nativeBuild))))) {
      return;
    } 
    List threadList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(ArrayList.class), List.class);
    List abiFilters = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(this.nativeBuild), List.class);
    String abiFilter;
    Iterator iterator;
    for (abiFilter = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].call(abiFilters), Iterator.class); iterator.hasNext(); ) {
      abiFilter = ShortTypeHandling.castToString(iterator.next());
      CmakeThread thread = (CmakeThread)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(CmakeThread.class, abiFilter, arrayOfCallSite[9].callGroovyObjectGetProperty(this), this.variantData), CmakeThread.class);
      arrayOfCallSite[10].call(thread);
      arrayOfCallSite[11].call(threadList, thread);
    } 
    arrayOfCallSite[12].call(threadList, new _run_closure1(this, this));
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(it);
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[1].callGetProperty(it), null))
        throw (Throwable)arrayOfCallSite[2].callGetProperty(it); 
      return null;
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
