package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.PathConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.enumlation.DeviceType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.command.NodeCommandBuilder;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;
import org.gradle.work.InputChanges;

public abstract class CompileJsTask extends IncrementalTask {
  private VariantData variantData;
  
  private ConfigInfo configInfo;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  private Boolean mergeSrc;
  
  private List<String> jsModules;
  
  private File jsComponentSrcPath;
  
  private File jsManifestDir;
  
  private File richAssetsDir;
  
  private File liteAssetsDir;
  
  private File routerAssetsDir;
  
  private File jsResourcesDir;
  
  private File intermediatesMergeJsDir;
  
  private File superVisualDir;
  
  @Inject
  public CompileJsTask(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object2, SdkInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object3, PathInfo.class);
    Object object4 = arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].callGetProperty(arrayOfCallSite[5].callGroovyObjectGetProperty(this)));
    this.mergeSrc = (Boolean)ScriptBytecodeAdapter.castToType(object4, Boolean.class);
    Object object5 = arrayOfCallSite[6].call(this.configInfo);
    this.jsModules = (List<String>)ScriptBytecodeAdapter.castToType(object5, List.class);
    Object object6 = arrayOfCallSite[7].call(arrayOfCallSite[8].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[9].call(this.pathInfo), arrayOfCallSite[10].callGroovyObjectGetProperty(variantData), arrayOfCallSite[11].callGetProperty(BuildConst.class), arrayOfCallSite[12].callGetProperty(PathConst.class), arrayOfCallSite[13].callGetProperty(PathConst.class))));
    this.richAssetsDir = (File)ScriptBytecodeAdapter.castToType(object6, File.class);
    Object object7 = arrayOfCallSite[14].call(arrayOfCallSite[15].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[16].call(this.pathInfo), arrayOfCallSite[17].callGroovyObjectGetProperty(variantData), arrayOfCallSite[18].callGetProperty(BuildConst.class), arrayOfCallSite[19].callGetProperty(PathConst.class), arrayOfCallSite[20].callGetProperty(PathConst.class))));
    this.liteAssetsDir = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
    Object object8 = arrayOfCallSite[21].call(arrayOfCallSite[22].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[23].call(this.pathInfo), arrayOfCallSite[24].callGroovyObjectGetProperty(variantData), arrayOfCallSite[25].callGetProperty(BuildConst.class), arrayOfCallSite[26].callGetProperty(PathConst.class), arrayOfCallSite[27].callGetProperty(PathConst.class))));
    this.routerAssetsDir = (File)ScriptBytecodeAdapter.castToType(object8, File.class);
    Object object9 = arrayOfCallSite[28].call(arrayOfCallSite[29].call(Paths.class, arrayOfCallSite[30].call(this.pathInfo), arrayOfCallSite[31].callGroovyObjectGetProperty(variantData), arrayOfCallSite[32].callGetProperty(PathConst.class)));
    this.jsResourcesDir = (File)ScriptBytecodeAdapter.castToType(object9, File.class);
    Object object10 = arrayOfCallSite[33].call(arrayOfCallSite[34].call(Paths.class, arrayOfCallSite[35].call(this.pathInfo), arrayOfCallSite[36].callGroovyObjectGetProperty(variantData), arrayOfCallSite[37].callGetProperty(PathConst.class)));
    this.jsManifestDir = (File)ScriptBytecodeAdapter.castToType(object10, File.class);
    Object object11 = arrayOfCallSite[38].call(variantData);
    this.jsComponentSrcPath = (File)ScriptBytecodeAdapter.castToType(object11, File.class);
    Object object12 = arrayOfCallSite[39].call(arrayOfCallSite[40].call(Paths.class, arrayOfCallSite[41].call(this.pathInfo)));
    this.intermediatesMergeJsDir = (File)ScriptBytecodeAdapter.castToType(object12, File.class);
    Object object13 = arrayOfCallSite[42].call(arrayOfCallSite[43].call(Paths.class, arrayOfCallSite[44].call(this.pathInfo)));
    this.superVisualDir = (File)ScriptBytecodeAdapter.castToType(object13, File.class);
  }
  
  public abstract void compileJs(DeviceTypeForJsCompile paramDeviceTypeForJsCompile, boolean paramBoolean, InputChanges paramInputChanges);
  
  public abstract NodeCommandBuilder initJsCommandBuilder(DeviceTypeForJsCompile paramDeviceTypeForJsCompile);
  
  public void copyJsonAndResource(String myAceManifestPath, String myAssetManifestPath, HMLogger hmLogger) {
    Reference reference1 = new Reference(myAceManifestPath), reference2 = new Reference(myAssetManifestPath);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[45].call(arrayOfCallSite[46].callGroovyObjectGetProperty(this), new _copyJsonAndResource_closure1(this, this, reference1, reference2));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[47].call(FileUtils.class, this.jsResourcesDir)))
      arrayOfCallSite[48].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[49].callGetProperty(this.jsResourcesDir)); 
    arrayOfCallSite[50].call(arrayOfCallSite[51].callGroovyObjectGetProperty(this), new _copyJsonAndResource_closure2(this, this));
  }
  
  public enum DeviceTypeForJsCompile implements GroovyObject {
    LITE, RICH, ROUTER;
    
    public static final DeviceTypeForJsCompile MIN_VALUE;
    
    public static final DeviceTypeForJsCompile MAX_VALUE;
    
    @Generated
    DeviceTypeForJsCompile(LinkedHashMap __namedArgs) {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
      if (ScriptBytecodeAdapter.compareEqual(__namedArgs, null))
        throw (Throwable)arrayOfCallSite[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.huawei.ohos.build.tasks.CompileJsTask$DeviceTypeForJsCompile was initialized with null. Please use a non-null value or define your own constructor."); 
      arrayOfCallSite[1].callStatic(ImmutableASTTransformation.class, this, __namedArgs);
    }
    
    static {
      Object object1 = $getCallSiteArray()[13].callStatic(DeviceTypeForJsCompile.class, "LITE", Integer.valueOf(0));
      LITE = (DeviceTypeForJsCompile)ShortTypeHandling.castToEnum(object1, DeviceTypeForJsCompile.class);
      Object object2 = $getCallSiteArray()[14].callStatic(DeviceTypeForJsCompile.class, "RICH", Integer.valueOf(1));
      RICH = (DeviceTypeForJsCompile)ShortTypeHandling.castToEnum(object2, DeviceTypeForJsCompile.class);
      Object object3 = $getCallSiteArray()[15].callStatic(DeviceTypeForJsCompile.class, "ROUTER", Integer.valueOf(2));
      ROUTER = (DeviceTypeForJsCompile)ShortTypeHandling.castToEnum(object3, DeviceTypeForJsCompile.class);
      DeviceTypeForJsCompile deviceTypeForJsCompile1 = LITE;
      MIN_VALUE = deviceTypeForJsCompile1;
      DeviceTypeForJsCompile deviceTypeForJsCompile2 = ROUTER;
      MAX_VALUE = deviceTypeForJsCompile2;
      DeviceTypeForJsCompile[] arrayOfDeviceTypeForJsCompile = { LITE, RICH, ROUTER };
      $VALUES = arrayOfDeviceTypeForJsCompile;
    }
  }
  
  public final class _copyJsonAndResource_closure1 extends Closure implements GeneratedClosure {
    public _copyJsonAndResource_closure1(Object _outerInstance, Object _thisObject, Reference myAceManifestPath, Reference myAssetManifestPath) {
      super(_outerInstance, _thisObject);
      Reference reference1 = myAceManifestPath;
      this.myAceManifestPath = reference1;
      Reference reference2 = myAssetManifestPath;
      this.myAssetManifestPath = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.myAceManifestPath.get());
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, this.myAssetManifestPath.get());
    }
    
    @Generated
    public String getMyAceManifestPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.myAceManifestPath.get());
    }
    
    @Generated
    public String getMyAssetManifestPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.myAssetManifestPath.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _copyJsonAndResource_closure2 extends Closure implements GeneratedClosure {
    public _copyJsonAndResource_closure2(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(arrayOfCallSite[2].callGroovyObjectGetProperty(this)), new _closure5(this, getThisObject()));
      return arrayOfCallSite[3].callCurrent((GroovyObject)this, arrayOfCallSite[4].callGroovyObjectGetProperty(this));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure5 extends Closure implements GeneratedClosure {
      public _closure5(Object _outerInstance, Object _thisObject) {
        super(_outerInstance, _thisObject);
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].callCurrent((GroovyObject)this, "**/*.png");
        arrayOfCallSite[1].callCurrent((GroovyObject)this, "**/*.PNG");
        arrayOfCallSite[2].callCurrent((GroovyObject)this, "**/*.jpg");
        return arrayOfCallSite[3].callCurrent((GroovyObject)this, "**/*.JPG");
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public boolean checkMergeSource() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].callGetProperty(arrayOfCallSite[53].callGetProperty(arrayOfCallSite[54].callGroovyObjectGetProperty(this))))) {
      String module;
      Iterator iterator;
      for (module = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[55].call(this.jsModules), Iterator.class); iterator.hasNext(); ) {
        module = ShortTypeHandling.castToString(iterator.next());
        File fitnessWatchDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(arrayOfCallSite[57].call(Paths.class, arrayOfCallSite[58].call(this.pathInfo), module, arrayOfCallSite[59].callGetProperty(arrayOfCallSite[60].callGetProperty(DeviceType.class)))), File.class);
        File watchDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[61].call(arrayOfCallSite[62].call(Paths.class, arrayOfCallSite[63].call(this.pathInfo), module, arrayOfCallSite[64].callGetProperty(arrayOfCallSite[65].callGetProperty(DeviceType.class)))), File.class);
        if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[66].call(FileUtils.class, fitnessWatchDir, arrayOfCallSite[67].callGetProperty(arrayOfCallSite[68].callGetProperty(DeviceType.class)))) || 
          DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[69].call(FileUtils.class, watchDir, arrayOfCallSite[70].callGetProperty(arrayOfCallSite[71].callGetProperty(DeviceType.class))))))
          return true; 
      } 
    } 
    return false;
  }
  
  public void mergeSource(boolean needMerge, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!needMerge)
      return; 
    String module;
    Iterator iterator;
    for (module = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].call(this.jsModules), Iterator.class); iterator.hasNext(); ) {
      module = ShortTypeHandling.castToString(iterator.next());
      arrayOfCallSite[73].callCurrent(this, arrayOfCallSite[74].callGetProperty(arrayOfCallSite[75].callGetProperty(DeviceType.class)), arrayOfCallSite[76].callGetProperty(arrayOfCallSite[77].callGetProperty(DeviceType.class)), module, hmLogger);
      arrayOfCallSite[78].callCurrent(this, arrayOfCallSite[79].callGetProperty(arrayOfCallSite[80].callGetProperty(DeviceType.class)), arrayOfCallSite[81].callGetProperty(arrayOfCallSite[82].callGetProperty(DeviceType.class)), module, hmLogger);
    } 
  }
  
  public void mergeSource(String device, String excludeDevice, String module, HMLogger hmLogger) {
    Reference reference1 = new Reference(device), reference2 = new Reference(excludeDevice);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference jsComponentSrcPath = new Reference(ShortTypeHandling.castToString(arrayOfCallSite[83].call(Paths.class, arrayOfCallSite[84].call(this.pathInfo), module)));
    File pageDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[85].call(arrayOfCallSite[86].call(Paths.class, jsComponentSrcPath.get(), "pages")), File.class);
    Reference deviceSrcDir = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[87].call(arrayOfCallSite[88].call(Paths.class, jsComponentSrcPath.get(), reference1.get())), File.class));
    arrayOfCallSite[89].call(FileUtils.class, pageDir, deviceSrcDir.get());
    Reference destDir = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[90].call(arrayOfCallSite[91].call(Paths.class, arrayOfCallSite[92].call(this.pathInfo, reference1.get(), module))), File.class));
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[93].call(FileUtils.class, destDir.get())))
      arrayOfCallSite[94].call(hmLogger, "Unable to create or delete the %s folder. An incremental problem may occur.", arrayOfCallSite[95].callGetProperty(destDir.get())); 
    arrayOfCallSite[96].call(arrayOfCallSite[97].callGroovyObjectGetProperty(this), new _mergeSource_closure3(this, this, jsComponentSrcPath, reference1, reference2, destDir));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[98].call(FileUtils.class, deviceSrcDir.get(), reference1.get())))
      arrayOfCallSite[99].call(arrayOfCallSite[100].callGroovyObjectGetProperty(this), new _mergeSource_closure4(this, this, deviceSrcDir, destDir)); 
  }
  
  public final class _mergeSource_closure3 extends Closure implements GeneratedClosure {
    public _mergeSource_closure3(Object _outerInstance, Object _thisObject, Reference jsComponentSrcPath, Reference device, Reference excludeDevice, Reference destDir) {
      super(_outerInstance, _thisObject);
      Reference reference1 = jsComponentSrcPath;
      this.jsComponentSrcPath = reference1;
      Reference reference2 = device;
      this.device = reference2;
      Reference reference3 = excludeDevice;
      this.excludeDevice = reference3;
      Reference reference4 = destDir;
      this.destDir = reference4;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, this.jsComponentSrcPath.get(), new _closure6(this, getThisObject(), this.device, this.excludeDevice));
      return arrayOfCallSite[1].callCurrent((GroovyObject)this, arrayOfCallSite[2].call(this.destDir.get()));
    }
    
    @Generated
    public String getJsComponentSrcPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.jsComponentSrcPath.get());
    }
    
    @Generated
    public String getDevice() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.device.get());
    }
    
    @Generated
    public String getExcludeDevice() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.excludeDevice.get());
    }
    
    @Generated
    public File getDestDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.destDir.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
    
    public final class _closure6 extends Closure implements GeneratedClosure {
      public _closure6(Object _outerInstance, Object _thisObject, Reference device, Reference excludeDevice) {
        super(_outerInstance, _thisObject);
        Reference reference1 = device;
        this.device = reference1;
        Reference reference2 = excludeDevice;
        this.excludeDevice = reference2;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].callCurrent((GroovyObject)this, new _closure7(this, getThisObject(), this.device, this.excludeDevice));
      }
      
      @Generated
      public String getDevice() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return ShortTypeHandling.castToString(this.device.get());
      }
      
      @Generated
      public String getExcludeDevice() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return ShortTypeHandling.castToString(this.excludeDevice.get());
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
      
      public final class _closure7 extends Closure implements GeneratedClosure {
        public _closure7(Object _outerInstance, Object _thisObject, Reference device, Reference excludeDevice) {
          super(_outerInstance, _thisObject);
          Reference reference1 = device;
          this.device = reference1;
          Reference reference2 = excludeDevice;
          this.excludeDevice = reference2;
        }
        
        public Object doCall(Object it) {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].callGetProperty(it), File.class);
          return (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? Boolean.valueOf((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file)) && ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[5].callGetProperty(file), this.device.get()) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[6].callGetProperty(file), this.excludeDevice.get()))))) : Boolean.valueOf((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(file)) && ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[2].callGetProperty(file), this.device.get()) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[3].callGetProperty(file), this.excludeDevice.get())))));
        }
        
        @Generated
        public String getDevice() {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return ShortTypeHandling.castToString(this.device.get());
        }
        
        @Generated
        public String getExcludeDevice() {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return ShortTypeHandling.castToString(this.excludeDevice.get());
        }
        
        @Generated
        public Object doCall() {
          CallSite[] arrayOfCallSite = $getCallSiteArray();
          return doCall(null);
        }
      }
    }
  }
  
  public final class _mergeSource_closure4 extends Closure implements GeneratedClosure {
    public _mergeSource_closure4(Object _outerInstance, Object _thisObject, Reference deviceSrcDir, Reference destDir) {
      super(_outerInstance, _thisObject);
      Reference reference1 = deviceSrcDir;
      this.deviceSrcDir = reference1;
      Reference reference2 = destDir;
      this.destDir = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].callCurrent((GroovyObject)this, arrayOfCallSite[1].call(this.deviceSrcDir.get()));
      return arrayOfCallSite[2].callCurrent((GroovyObject)this, arrayOfCallSite[3].call(Paths.class, arrayOfCallSite[4].call(this.destDir.get()), "pages"));
    }
    
    @Generated
    public File getDeviceSrcDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.deviceSrcDir.get(), File.class);
    }
    
    @Generated
    public File getDestDir() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (File)ScriptBytecodeAdapter.castToType(this.destDir.get(), File.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public static List<String> getHybridLiteDeviceType(boolean isLite, List deviceTypeList) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> currentDeviceType = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[101].callConstructor(ArrayList.class), List.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(j), arrayOfCallSite[120].call(deviceTypeList)); ) {
        if (isLite) {
          if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[121].call(deviceTypeList, Integer.valueOf(j)), arrayOfCallSite[122].callGetProperty(arrayOfCallSite[123].callGetProperty(DeviceType.class))) || 
            ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[124].call(deviceTypeList, Integer.valueOf(j)), arrayOfCallSite[125].callGetProperty(arrayOfCallSite[126].callGetProperty(DeviceType.class)))))
            arrayOfCallSite[127].call(currentDeviceType, arrayOfCallSite[128].call(deviceTypeList, Integer.valueOf(j))); 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[129].call(deviceTypeList, Integer.valueOf(j)), arrayOfCallSite[130].callGetProperty(arrayOfCallSite[131].callGetProperty(DeviceType.class))) && 
          ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[132].call(deviceTypeList, Integer.valueOf(j)), arrayOfCallSite[133].callGetProperty(arrayOfCallSite[134].callGetProperty(DeviceType.class))))) {
          arrayOfCallSite[135].call(currentDeviceType, arrayOfCallSite[136].call(deviceTypeList, Integer.valueOf(j)));
        } 
        int k;
        j = (k = j) + 1;
      } 
      return currentDeviceType;
    } 
    for (int i = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[102].call(deviceTypeList)); ) {
      if (isLite) {
        if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[103].call(deviceTypeList, Integer.valueOf(i)), arrayOfCallSite[104].callGetProperty(arrayOfCallSite[105].callGetProperty(DeviceType.class))) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[106].call(deviceTypeList, Integer.valueOf(i)), arrayOfCallSite[107].callGetProperty(arrayOfCallSite[108].callGetProperty(DeviceType.class)))))
          arrayOfCallSite[109].call(currentDeviceType, arrayOfCallSite[110].call(deviceTypeList, Integer.valueOf(i))); 
      } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[111].call(deviceTypeList, Integer.valueOf(i)), arrayOfCallSite[112].callGetProperty(arrayOfCallSite[113].callGetProperty(DeviceType.class))) && ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[114].call(deviceTypeList, Integer.valueOf(i)), arrayOfCallSite[115].callGetProperty(arrayOfCallSite[116].callGetProperty(DeviceType.class))))) {
        arrayOfCallSite[117].call(currentDeviceType, arrayOfCallSite[118].call(deviceTypeList, Integer.valueOf(i)));
      } 
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[119].call(Integer.valueOf(j = i)));
      arrayOfCallSite[119].call(Integer.valueOf(j = i));
    } 
    return currentDeviceType;
  }
  
  public static String handleDriveLetter(String path) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[137].call(path, "^[A-Z]\\:[\\\\\\/].*$"))) {
      char[] pathChars = (char[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[138].call(path), char[].class);
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigC() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        boolean bool1 = false;
        int i;
        BytecodeInterface8.cArraySet(pathChars, bool1, i = BytecodeInterface8.cArrayGet(pathChars, bool1) + (char)' ');
        return ShortTypeHandling.castToString(arrayOfCallSite[142].call(String.class, pathChars));
      } 
      char[] arrayOfChar1;
      boolean bool;
      Object object;
      arrayOfCallSite[139].call(arrayOfChar1 = pathChars, Integer.valueOf(bool = false), object = arrayOfCallSite[140].call(arrayOfCallSite[141].call(arrayOfChar1, Integer.valueOf(bool)), Integer.valueOf(32)));
      return ShortTypeHandling.castToString(arrayOfCallSite[142].call(String.class, pathChars));
    } 
    return path;
  }
  
  public String getOutputDir(DeviceTypeForJsCompile deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    DeviceTypeForJsCompile deviceTypeForJsCompile = deviceType;
    if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[143].callGetProperty(DeviceTypeForJsCompile.class)))
      return ShortTypeHandling.castToString(this.routerAssetsDir); 
    if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[144].callGetProperty(DeviceTypeForJsCompile.class)))
      return ShortTypeHandling.castToString(this.liteAssetsDir); 
    if (ScriptBytecodeAdapter.isCase(deviceTypeForJsCompile, arrayOfCallSite[145].callGetProperty(DeviceTypeForJsCompile.class)))
      return ShortTypeHandling.castToString(this.richAssetsDir); 
    return ShortTypeHandling.castToString(null);
  }
  
  @Generated
  public VariantData getVariantData() {
    return this.variantData;
  }
  
  @Generated
  public void setVariantData(VariantData paramVariantData) {
    this.variantData = paramVariantData;
  }
  
  @Generated
  public ConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  @Generated
  public void setConfigInfo(ConfigInfo paramConfigInfo) {
    this.configInfo = paramConfigInfo;
  }
  
  @Generated
  public SdkInfo getSdkInfo() {
    return this.sdkInfo;
  }
  
  @Generated
  public void setSdkInfo(SdkInfo paramSdkInfo) {
    this.sdkInfo = paramSdkInfo;
  }
  
  @Generated
  public PathInfo getPathInfo() {
    return this.pathInfo;
  }
  
  @Generated
  public void setPathInfo(PathInfo paramPathInfo) {
    this.pathInfo = paramPathInfo;
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
  public List<String> getJsModules() {
    return this.jsModules;
  }
  
  @Generated
  public void setJsModules(List<String> paramList) {
    this.jsModules = paramList;
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
  
  @Generated
  public File getSuperVisualDir() {
    return this.superVisualDir;
  }
  
  @Generated
  public void setSuperVisualDir(File paramFile) {
    this.superVisualDir = paramFile;
  }
}
