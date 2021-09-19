package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.ProcessUtils;
import com.huawei.ohos.build.utils.command.NodeCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;
import org.gradle.work.ChangeType;
import org.gradle.work.Incremental;
import org.gradle.work.InputChanges;

public class CompileJsWithNode extends CompileJsTask {
  @NonNull
  private static final HMLogger hmLogger;
  
  @Input
  private Boolean mergeSrc;
  
  @InputFile
  @Incremental
  private File configFile;
  
  @InputDirectory
  @SkipWhenEmpty
  private File jsComponentSrcPath;
  
  @InputFiles
  @Incremental
  private FileCollection jsComponents;
  
  @InputFiles
  @Incremental
  private FileCollection superVisualComponents;
  
  @InputDirectory
  @Incremental
  private File jsManifestDir;
  
  @OutputDirectory
  private File richAssetsDir;
  
  @OutputDirectory
  private File liteAssetsDir;
  
  @OutputDirectory
  private File routerAssetsDir;
  
  @OutputDirectory
  private File jsResourcesDir;
  
  @OutputDirectory
  private File intermediatesMergeJsDir;
  
  static {
    Object object = $getCallSiteArray()[157].call(HMLogger.class, CompileJsWithNode.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public CompileJsWithNode(VariantData variantData) {
    super(variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(arrayOfCallSite[1].call(Paths.class, arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this)), arrayOfCallSite[4].callGetProperty(CommonConst.class)));
    this.configFile = (File)ScriptBytecodeAdapter.castToType(object1, File.class);
    Object object2 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getMergeSrc");
    this.mergeSrc = (Boolean)ScriptBytecodeAdapter.castToType(object2, Boolean.class);
    Object object3 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getRichAssetsDir");
    this.richAssetsDir = (File)ScriptBytecodeAdapter.castToType(object3, File.class);
    Object object4 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getLiteAssetsDir");
    this.liteAssetsDir = (File)ScriptBytecodeAdapter.castToType(object4, File.class);
    Object object5 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getRouterAssetsDir");
    this.routerAssetsDir = (File)ScriptBytecodeAdapter.castToType(object5, File.class);
    Object object6 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getJsResourcesDir");
    this.jsResourcesDir = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getJsManifestDir");
    this.jsManifestDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getJsComponentSrcPath");
    this.jsComponentSrcPath = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, this, "getIntermediatesMergeJsDir");
    this.intermediatesMergeJsDir = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this));
    this.jsComponents = (FileCollection)ScriptBytecodeAdapter.castToType(object10, FileCollection.class);
    Object object11 = arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this));
    this.superVisualComponents = (FileCollection)ScriptBytecodeAdapter.castToType(object11, FileCollection.class);
    arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), new _closure1(this, this));
  }
  
  public final class _closure1 extends Closure implements GeneratedClosure {
    public _closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object component) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this)), component))), _closure1.class, (GroovyObject)this, "jsComponents");
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this), arrayOfCallSite[2].call(arrayOfCallSite[3].callGroovyObjectGetProperty(this), arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].call(arrayOfCallSite[6].callGroovyObjectGetProperty(this)), component)));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(arrayOfCallSite[8].callGroovyObjectGetProperty(this)))) {
        ScriptBytecodeAdapter.setGroovyObjectProperty(arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this)), component))), _closure1.class, (GroovyObject)this, "superVisualComponents");
        return arrayOfCallSite[9].call(arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this), arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].call(arrayOfCallSite[15].callGroovyObjectGetProperty(this)), component)));
      } 
      return null;
    }
  }
  
  public void doTaskAction(InputChanges inputChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[11].call(arrayOfCallSite[12].callGroovyObjectGetProperty(this)))) {
      boolean needMergeSource = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].callCurrent(this));
      arrayOfCallSite[14].callCurrent(this, Boolean.valueOf(needMergeSource), hmLogger);
      arrayOfCallSite[15].callCurrent(this, arrayOfCallSite[16].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(needMergeSource), inputChanges);
      arrayOfCallSite[17].callCurrent(this, arrayOfCallSite[18].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(needMergeSource), inputChanges);
    } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[19].call(arrayOfCallSite[20].callGroovyObjectGetProperty(this)))) {
      arrayOfCallSite[21].callCurrent(this, arrayOfCallSite[22].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(false), inputChanges);
    } else {
      arrayOfCallSite[23].callCurrent(this, DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this))) ? arrayOfCallSite[26].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class) : arrayOfCallSite[27].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class), Boolean.valueOf(false), inputChanges);
    } 
  }
  
  public void compileJs(CompileJsTask.DeviceTypeForJsCompile deviceType, boolean needMergeSource, InputChanges inputChanges) {
    Reference reference1 = new Reference(deviceType), reference2 = new Reference(Boolean.valueOf(needMergeSource));
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (((!DefaultTypeTransformation.booleanUnbox(reference2.get())) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[28].call(this.intermediatesMergeJsDir)))) {
      arrayOfCallSite[29].call(FileUtils.class, this.intermediatesMergeJsDir);
      arrayOfCallSite[30].call(this.intermediatesMergeJsDir);
    } 
    Reference assetsDir = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[31].callCurrent(this, reference1.get()))), builder = new Reference(null);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      NodeCommandBuilder nodeCommandBuilder = initJsCommandBuilder((CompileJsTask.DeviceTypeForJsCompile)reference1.get());
      builder.set(nodeCommandBuilder);
    } else {
      Object object = arrayOfCallSite[32].callCurrent(this, reference1.get());
      builder.set(ScriptBytecodeAdapter.castToType(object, NodeCommandBuilder.class));
    } 
    Reference removeComponents = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].callConstructor(HashSet.class), Set.class));
    Reference recompileComponents = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[34].callConstructor(HashSet.class), Set.class));
    arrayOfCallSite[35].call(arrayOfCallSite[36].call(inputChanges, this.jsComponents), new _compileJs_closure2(this, this, removeComponents, recompileComponents));
    arrayOfCallSite[37].call(arrayOfCallSite[38].call(inputChanges, this.superVisualComponents), new _compileJs_closure3(this, this, recompileComponents));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[39].call(arrayOfCallSite[40].callGroovyObjectGetProperty(arrayOfCallSite[41].callGroovyObjectGetProperty(this)), arrayOfCallSite[42].callGetProperty(BuildConst.class))))
      arrayOfCallSite[43].call(recompileComponents.get(), arrayOfCallSite[44].callGroovyObjectGetProperty(this)); 
    arrayOfCallSite[45].call(removeComponents.get(), new _compileJs_closure4(this, this, assetsDir));
    arrayOfCallSite[46].call(recompileComponents.get(), new _compileJs_closure5(this, this, assetsDir, builder, reference2, reference1));
  }
  
  public final class _compileJs_closure2 extends Closure implements GeneratedClosure {
    public _compileJs_closure2(Object _outerInstance, Object _thisObject, Reference removeComponents, Reference recompileComponents) {
      super(_outerInstance, _thisObject);
      Reference reference1 = removeComponents;
      this.removeComponents = reference1;
      Reference reference2 = recompileComponents;
      this.recompileComponents = reference2;
    }
    
    public Object doCall(Object fileChange) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      File jsComponentFile = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].callGetProperty(fileChange)), File.class);
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[16].callGetProperty(fileChange), arrayOfCallSite[17].callGetProperty(ChangeType.class)) && ScriptBytecodeAdapter.compareEqual(jsComponentFile, null))) {
          int jsSourceDirLength = DefaultTypeTransformation.intUnbox(arrayOfCallSite[18].call(arrayOfCallSite[19].callGetProperty(arrayOfCallSite[20].callGroovyObjectGetProperty(this))));
          String removedComponent = ShortTypeHandling.castToString(arrayOfCallSite[21].call(arrayOfCallSite[22].callGetProperty(arrayOfCallSite[23].callGetProperty(fileChange)), Integer.valueOf(jsSourceDirLength + 1)));
          if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[24].call(removedComponent, arrayOfCallSite[25].callGetProperty(File.class)), Integer.valueOf(-1)))
            return arrayOfCallSite[26].call(this.removeComponents.get(), removedComponent); 
          return null;
        } 
        return arrayOfCallSite[27].call(this.recompileComponents.get(), arrayOfCallSite[28].callGetProperty(jsComponentFile));
      } 
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(fileChange), arrayOfCallSite[3].callGetProperty(ChangeType.class)) && ScriptBytecodeAdapter.compareEqual(jsComponentFile, null))) {
        int jsSourceDirLength = DefaultTypeTransformation.intUnbox(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGroovyObjectGetProperty(this))));
        String removedComponent = ShortTypeHandling.castToString(arrayOfCallSite[7].call(arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(fileChange)), arrayOfCallSite[10].call(Integer.valueOf(jsSourceDirLength), Integer.valueOf(1))));
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[11].call(removedComponent, arrayOfCallSite[12].callGetProperty(File.class)), Integer.valueOf(-1)))
          return arrayOfCallSite[13].call(this.removeComponents.get(), removedComponent); 
        return null;
      } 
      return arrayOfCallSite[14].call(this.recompileComponents.get(), arrayOfCallSite[15].callGetProperty(jsComponentFile));
    }
    
    @Generated
    public Set getRemoveComponents() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.removeComponents.get(), Set.class);
    }
    
    @Generated
    public Set getRecompileComponents() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.recompileComponents.get(), Set.class);
    }
  }
  
  public final class _compileJs_closure3 extends Closure implements GeneratedClosure {
    public _compileJs_closure3(Object _outerInstance, Object _thisObject, Reference recompileComponents) {
      super(_outerInstance, _thisObject);
      Reference reference = recompileComponents;
      this.recompileComponents = reference;
    }
    
    public Object doCall(Object fileChange) {
      CallSite[] arrayOfCallSite;
      String component;
      Iterator iterator;
      for (arrayOfCallSite = $getCallSiteArray(), component = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGroovyObjectGetProperty(this)), Iterator.class); iterator.hasNext(); ) {
        component = ShortTypeHandling.castToString(iterator.next());
        File aliveJsComponent = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].callGetProperty(ScriptBytecodeAdapter.invokeMethodOnSuper0(CompileJsTask.class, (GroovyObject)getThisObject(), "getSuperVisualDir")), component)), File.class);
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].callGetProperty(fileChange)), arrayOfCallSite[8].callGetProperty(aliveJsComponent))))
          arrayOfCallSite[9].call(this.recompileComponents.get(), component); 
      } 
      return null;
    }
    
    @Generated
    public Set getRecompileComponents() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Set)ScriptBytecodeAdapter.castToType(this.recompileComponents.get(), Set.class);
    }
  }
  
  public final class _compileJs_closure4 extends Closure implements GeneratedClosure {
    public _compileJs_closure4(Object _outerInstance, Object _thisObject, Reference assetsDir) {
      super(_outerInstance, _thisObject);
      Reference reference = assetsDir;
      this.assetsDir = reference;
    }
    
    public Object doCall(Object component) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(CompileJsWithNode.class), "remove", arrayOfCallSite[2].call(arrayOfCallSite[3].call("remove ", component), " component!"));
      return arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, this.assetsDir.get(), component)));
    }
    
    @Generated
    public String getAssetsDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.assetsDir.get());
    }
  }
  
  public final class _compileJs_closure5 extends Closure implements GeneratedClosure {
    public _compileJs_closure5(Object _outerInstance, Object _thisObject, Reference assetsDir, Reference builder, Reference needMergeSource, Reference deviceType) {
      super(_outerInstance, _thisObject);
      Reference reference1 = assetsDir;
      this.assetsDir = reference1;
      Reference reference2 = builder;
      this.builder = reference2;
      Reference reference3 = needMergeSource;
      this.needMergeSource = reference3;
      Reference reference4 = deviceType;
      this.deviceType = reference4;
    }
    
    public Object doCall(Object component) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(CompileJsWithNode.class), "compile", arrayOfCallSite[2].call(arrayOfCallSite[3].call("compile ", component), " component!"));
      return arrayOfCallSite[4].callCurrent((GroovyObject)this, ArrayUtil.createArray(component, this.assetsDir.get(), this.builder.get(), this.needMergeSource.get(), this.deviceType.get()));
    }
    
    @Generated
    public String getAssetsDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.assetsDir.get());
    }
    
    @Generated
    public NodeCommandBuilder getBuilder() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (NodeCommandBuilder)ScriptBytecodeAdapter.castToType(this.builder.get(), NodeCommandBuilder.class);
    }
    
    @Generated
    public boolean getNeedMergeSource() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return DefaultTypeTransformation.booleanUnbox(this.needMergeSource.get());
    }
    
    @Generated
    public CompileJsTask.DeviceTypeForJsCompile getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (CompileJsTask.DeviceTypeForJsCompile)ShortTypeHandling.castToEnum(this.deviceType.get(), CompileJsTask.DeviceTypeForJsCompile.class);
    }
  }
  
  @Nullable
  public File getJsComponent(File changeFile) {
    CallSite[] arrayOfCallSite;
    String component;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), component = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(arrayOfCallSite[48].callGroovyObjectGetProperty(this)), Iterator.class); iterator.hasNext(); ) {
      component = ShortTypeHandling.castToString(iterator.next());
      File aliveJsComponent = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[49].callConstructor(File.class, this.jsComponentSrcPath, component), File.class);
      String jsComponentDir = ShortTypeHandling.castToString(arrayOfCallSite[50].call(arrayOfCallSite[51].callGetProperty(aliveJsComponent), arrayOfCallSite[52].callGetProperty(File.class)));
      String changeFileDir = ShortTypeHandling.castToString(DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[53].call(changeFile)) ? arrayOfCallSite[54].call(arrayOfCallSite[55].callGetProperty(changeFile), arrayOfCallSite[56].callGetProperty(File.class)) : arrayOfCallSite[57].callGetProperty(changeFile));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(changeFileDir, jsComponentDir)))
        return aliveJsComponent; 
    } 
    return (File)ScriptBytecodeAdapter.castToType(null, File.class);
  }
  
  public void compileJsComponent(String component, String assetsDir, NodeCommandBuilder builder, boolean needMergeSource, CompileJsTask.DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ProcessUtils process = (ProcessUtils)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].callConstructor(ProcessUtils.class, arrayOfCallSite[60].callGroovyObjectGetProperty(this), "webpack"), ProcessUtils.class);
    String myAceManifestPath = ShortTypeHandling.castToString(arrayOfCallSite[61].call(arrayOfCallSite[62].call(Paths.class, arrayOfCallSite[63].call(this.jsManifestDir), component, arrayOfCallSite[64].callGetProperty(CommonConst.class))));
    File myAceModuleOutputDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[65].call(arrayOfCallSite[66].call(Paths.class, assetsDir, component)), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[67].call(FileUtils.class, myAceModuleOutputDir)))
      arrayOfCallSite[68].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[69].callGetProperty(myAceModuleOutputDir)); 
    arrayOfCallSite[70].callCurrent(this, myAceManifestPath, arrayOfCallSite[71].callGetProperty(myAceModuleOutputDir), hmLogger);
    boolean img2bin = false;
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      boolean bool = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[75].call(arrayOfCallSite[76].callGroovyObjectGetProperty(this))) && ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[77].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))) ? true : false;
    } else {
      boolean bool = (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[72].call(arrayOfCallSite[73].callGroovyObjectGetProperty(this))) && ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[74].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))) ? true : false;
    } 
    String aceModuleRoot = ShortTypeHandling.castToString(arrayOfCallSite[78].call(Paths.class, arrayOfCallSite[79].call(this.jsComponentSrcPath), component));
    if (needMergeSource) {
      String deviceTypeName = ShortTypeHandling.castToString(ScriptBytecodeAdapter.compareEqual(deviceType, arrayOfCallSite[80].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class)) ? arrayOfCallSite[81].callGetProperty(arrayOfCallSite[82].callGetProperty(DeviceType.class)) : arrayOfCallSite[83].callGetProperty(arrayOfCallSite[84].callGetProperty(DeviceType.class)));
      Object object = arrayOfCallSite[85].call(arrayOfCallSite[86].callGroovyObjectGetProperty(this), deviceTypeName, component);
      aceModuleRoot = ShortTypeHandling.castToString(object);
    } 
    String aceSuperVisualPath = ShortTypeHandling.castToString(arrayOfCallSite[87].call(arrayOfCallSite[88].call(Paths.class, arrayOfCallSite[89].callGetProperty(arrayOfCallSite[90].callGroovyObjectGetProperty(this)), component)));
    Map aceEnv = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[91].callConstructor(HashMap.class), Map.class);
    arrayOfCallSite[92].call(aceEnv, "aceModuleRoot", arrayOfCallSite[93].callStatic(CompileJsWithNode.class, aceModuleRoot));
    arrayOfCallSite[94].call(aceEnv, "aceModuleBuild", arrayOfCallSite[95].callStatic(CompileJsWithNode.class, arrayOfCallSite[96].callGetProperty(myAceModuleOutputDir)));
    arrayOfCallSite[97].call(aceEnv, "aceManifestPath", arrayOfCallSite[98].callStatic(CompileJsWithNode.class, myAceManifestPath));
    arrayOfCallSite[99].call(aceEnv, "watchMode", "false");
    arrayOfCallSite[100].call(aceEnv, "hapMode", arrayOfCallSite[101].call(String.class, Boolean.valueOf(ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[102].callGetProperty(arrayOfCallSite[103].callGroovyObjectGetProperty(arrayOfCallSite[104].callGroovyObjectGetProperty(this))), arrayOfCallSite[105].callGetProperty(BuildConst.class)))));
    arrayOfCallSite[106].call(aceEnv, "iconPath", arrayOfCallSite[107].callStatic(CompileJsWithNode.class, arrayOfCallSite[108].call(this.jsResourcesDir)));
    arrayOfCallSite[109].call(aceEnv, "img2bin", arrayOfCallSite[110].call(String.class, Boolean.valueOf(img2bin)));
    arrayOfCallSite[111].call(aceEnv, "aceSuperVisualPath", arrayOfCallSite[112].callStatic(CompileJsWithNode.class, aceSuperVisualPath));
    arrayOfCallSite[113].call(aceEnv, "PATH", arrayOfCallSite[114].callStatic(CompileJsWithNode.class, arrayOfCallSite[115].call(arrayOfCallSite[116].callGroovyObjectGetProperty(this))));
    String errorLog = ShortTypeHandling.castToString(arrayOfCallSite[117].call(arrayOfCallSite[118].call(arrayOfCallSite[119].call(arrayOfCallSite[120].call(arrayOfCallSite[121].callGroovyObjectGetProperty(this)), "-"), component), " build js failed."));
    arrayOfCallSite[122].call(process, errorLog);
    arrayOfCallSite[123].call(hmLogger, "nodeJs", arrayOfCallSite[124].call(arrayOfCallSite[125].call(builder), " "));
    arrayOfCallSite[126]
      .call(process, ArrayUtil.createArray(arrayOfCallSite[127].call(builder), arrayOfCallSite[128].call(arrayOfCallSite[129].call(Paths.class, arrayOfCallSite[130].call(arrayOfCallSite[131].callGroovyObjectGetProperty(this)))), aceEnv, Boolean.valueOf(true), hmLogger, arrayOfCallSite[132].callGetProperty(CommonConst.class)));
  }
  
  public NodeCommandBuilder initJsCommandBuilder(CompileJsTask.DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    NodeCommandBuilder builder = (NodeCommandBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[133].callConstructor(NodeCommandBuilder.class, arrayOfCallSite[134].call(arrayOfCallSite[135].callGroovyObjectGetProperty(this))), NodeCommandBuilder.class);
    arrayOfCallSite[136].call(builder, "./node_modules/webpack/bin/webpack.js");
    List deviceTypeList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[137].call(arrayOfCallSite[138].callGroovyObjectGetProperty(this)), List.class);
    CompileJsTask.DeviceTypeForJsCompile deviceTypeForJsCompile = deviceType;
    if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[139].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))) {
      arrayOfCallSite[140].call(arrayOfCallSite[141].call(builder, deviceTypeList), arrayOfCallSite[142].callGetProperty(SdkConst.class));
    } else if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[143].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))) {
      List currentDeviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[144].callStatic(CompileJsWithNode.class, Boolean.valueOf(true), deviceTypeList), List.class);
      arrayOfCallSite[145].call(arrayOfCallSite[146].call(builder, currentDeviceType), arrayOfCallSite[147].callGetProperty(SdkConst.class));
    } else if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[148].callGetProperty(CompileJsTask.DeviceTypeForJsCompile.class))) {
      List currentDeviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[149].callStatic(CompileJsWithNode.class, Boolean.valueOf(false), deviceTypeList), List.class);
      arrayOfCallSite[150].call(arrayOfCallSite[151].call(builder, currentDeviceType), arrayOfCallSite[152].callGetProperty(SdkConst.class));
    } 
    arrayOfCallSite[153].call(builder, arrayOfCallSite[154].callGetProperty(arrayOfCallSite[155].callGroovyObjectGetProperty(arrayOfCallSite[156].callGroovyObjectGetProperty(this))));
    return builder;
  }
  
  @Generated
  public Boolean getMergeSrc() {
    return this.mergeSrc;
  }
  
  @Generated
  public void setMergeSrc(Boolean paramBoolean) {
    this.mergeSrc = paramBoolean;
  }
  
  @Generated
  public File getConfigFile() {
    return this.configFile;
  }
  
  @Generated
  public void setConfigFile(File paramFile) {
    this.configFile = paramFile;
  }
  
  @Generated
  public File getJsComponentSrcPath() {
    return this.jsComponentSrcPath;
  }
  
  @Generated
  public void setJsComponentSrcPath(File paramFile) {
    this.jsComponentSrcPath = paramFile;
  }
  
  @Generated
  public FileCollection getJsComponents() {
    return this.jsComponents;
  }
  
  @Generated
  public void setJsComponents(FileCollection paramFileCollection) {
    this.jsComponents = paramFileCollection;
  }
  
  @Generated
  public FileCollection getSuperVisualComponents() {
    return this.superVisualComponents;
  }
  
  @Generated
  public void setSuperVisualComponents(FileCollection paramFileCollection) {
    this.superVisualComponents = paramFileCollection;
  }
  
  @Generated
  public File getJsManifestDir() {
    return this.jsManifestDir;
  }
  
  @Generated
  public void setJsManifestDir(File paramFile) {
    this.jsManifestDir = paramFile;
  }
  
  @Generated
  public File getRichAssetsDir() {
    return this.richAssetsDir;
  }
  
  @Generated
  public void setRichAssetsDir(File paramFile) {
    this.richAssetsDir = paramFile;
  }
  
  @Generated
  public File getLiteAssetsDir() {
    return this.liteAssetsDir;
  }
  
  @Generated
  public void setLiteAssetsDir(File paramFile) {
    this.liteAssetsDir = paramFile;
  }
  
  @Generated
  public File getRouterAssetsDir() {
    return this.routerAssetsDir;
  }
  
  @Generated
  public void setRouterAssetsDir(File paramFile) {
    this.routerAssetsDir = paramFile;
  }
  
  @Generated
  public File getJsResourcesDir() {
    return this.jsResourcesDir;
  }
  
  @Generated
  public void setJsResourcesDir(File paramFile) {
    this.jsResourcesDir = paramFile;
  }
  
  @Generated
  public File getIntermediatesMergeJsDir() {
    return this.intermediatesMergeJsDir;
  }
  
  @Generated
  public void setIntermediatesMergeJsDir(File paramFile) {
    this.intermediatesMergeJsDir = paramFile;
  }
}
