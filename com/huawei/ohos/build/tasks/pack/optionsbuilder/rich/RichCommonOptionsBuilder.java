package com.huawei.ohos.build.tasks.pack.optionsbuilder.rich;

import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.tasks.pack.model.PackModel;
import com.huawei.ohos.build.tasks.pack.model.hap.rich.HapPackModel;
import com.huawei.ohos.build.tasks.pack.optionsbuilder.CoreCommonOptionsBuilder;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public abstract class RichCommonOptionsBuilder extends CoreCommonOptionsBuilder {
  @Nonnull
  protected HapPackModel hapPackModel;
  
  protected JavaCommandBuilder builder;
  
  protected JavaCommandBuilder.PackingToolOptions options;
  
  public RichCommonOptionsBuilder(PackModel packModel) {
    super(packModel);
    Object object1 = arrayOfCallSite[0].callConstructor(JavaCommandBuilder.class);
    this.builder = (JavaCommandBuilder)ScriptBytecodeAdapter.castToType(object1, JavaCommandBuilder.class);
    Object object2 = arrayOfCallSite[1].callConstructor(JavaCommandBuilder.PackingToolOptions.class, this.builder);
    this.options = (JavaCommandBuilder.PackingToolOptions)ScriptBytecodeAdapter.castToType(object2, JavaCommandBuilder.PackingToolOptions.class);
    MetaClass metaClass = $getStaticMetaClass();
    HapPackModel hapPackModel = (HapPackModel)ScriptBytecodeAdapter.asType(packModel, HapPackModel.class);
    this.hapPackModel = (HapPackModel)ScriptBytecodeAdapter.castToType(hapPackModel, HapPackModel.class);
  }
  
  protected void initCommonOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String dexFilePath = ShortTypeHandling.castToString(arrayOfCallSite[2].call(this.hapPackModel));
    Object harAssetsFiles = arrayOfCallSite[3].call(this.hapPackModel);
    Reference assetsPath = new Reference(arrayOfCallSite[4].callGroovyObjectGetProperty(this.hapPackModel));
    Reference file;
    Iterator iterator;
    for (file = new Reference(null), iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(harAssetsFiles), Iterator.class); iterator.hasNext(); ) {
      file.set(ScriptBytecodeAdapter.castToType(iterator.next(), File.class));
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGroovyObjectGetProperty(this), new _initCommonOptions_closure1(this, this, file, assetsPath));
    } 
    arrayOfCallSite[8]
      
      .call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].call(this.options, "hap"), arrayOfCallSite[15].callGroovyObjectGetProperty(this.hapPackModel)), arrayOfCallSite[16].call(dexFilePath, Integer.valueOf(0), arrayOfCallSite[17].call(arrayOfCallSite[18].call(dexFilePath), Integer.valueOf(1)))), arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this.hapPackModel))), assetsPath.get()), arrayOfCallSite[21].call(arrayOfCallSite[22].callGroovyObjectGetProperty(this.hapPackModel))), Boolean.valueOf(true));
    Object libSoPath = arrayOfCallSite[23].call(this.hapPackModel);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((DefaultTypeTransformation.booleanUnbox(libSoPath) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(libSoPath)))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].call(libSoPath)), Integer.valueOf(0))))
        arrayOfCallSite[32].call(this.options, arrayOfCallSite[33].callGetProperty(libSoPath)); 
      return;
    } 
    if ((((DefaultTypeTransformation.booleanUnbox(libSoPath) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(libSoPath)))) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[25].callGetProperty(arrayOfCallSite[26].call(libSoPath)), Integer.valueOf(0))))
      arrayOfCallSite[27].call(this.options, arrayOfCallSite[28].callGetProperty(libSoPath)); 
  }
  
  public final class _initCommonOptions_closure1 extends Closure implements GeneratedClosure {
    public _initCommonOptions_closure1(Object _outerInstance, Object _thisObject, Reference file, Reference assetsPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = file;
      this.file = reference1;
      Reference reference2 = assetsPath;
      this.assetsPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(this.file.get()), arrayOfCallSite[4].callGetProperty(PathConst.class))));
      return arrayOfCallSite[5].callCurrent((GroovyObject)this, arrayOfCallSite[6].call(this.assetsPath.get()));
    }
    
    @Generated
    public File getFile() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.file.get(), File.class);
    }
    
    @Generated
    public Object getAssetsPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.assetsPath.get();
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public PackModel getPackModel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (PackModel)this.hapPackModel;
  }
}
