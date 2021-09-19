package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.build.tasks.signing.ValidateHandler;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PreBuild extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger hmLogger;
  
  private VariantManager variantManager;
  
  static {
    Object object = $getCallSiteArray()[19].call(HMLogger.class, PreBuild.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public PreBuild(VariantManager variantManager) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantManager variantManager1 = variantManager;
    this.variantManager = (VariantManager)ScriptBytecodeAdapter.castToType(variantManager1, VariantManager.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].call(hmLogger, "Try to build ..");
    arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this.variantManager), new _run_closure1(this, this));
    File intermediatesJavacDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this))), arrayOfCallSite[8].callGetProperty(PathConst.class), arrayOfCallSite[9].callGetProperty(PathConst.class))), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(intermediatesJavacDir)))
      return; 
    File variantJavacFile;
    Iterator iterator;
    for (variantJavacFile = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].call(arrayOfCallSite[12].call(intermediatesJavacDir)), Iterator.class); iterator.hasNext(); ) {
      variantJavacFile = (File)ScriptBytecodeAdapter.castToType(iterator.next(), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(variantJavacFile)))
        continue; 
      File previewFlag = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(File.class, variantJavacFile, "preview.flag"), File.class);
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(previewFlag)) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(previewFlag)))))
        arrayOfCallSite[17]
          .call(hmLogger, "Unable to delete the %s file. The previewer may be not running properly.", arrayOfCallSite[18].call(intermediatesJavacDir)); 
    } 
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ValidateHandler validateHandler = (ValidateHandler)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callConstructor(ValidateHandler.class, arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(it)), ValidateHandler.class);
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].callGroovyObjectGetProperty(this)))
        return arrayOfCallSite[6].call(validateHandler); 
      return null;
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
