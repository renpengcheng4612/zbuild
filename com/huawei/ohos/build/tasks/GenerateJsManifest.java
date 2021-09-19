package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.shell.JsOptions;
import com.huawei.ohos.build.shell.js.WindowOptions;
import com.huawei.ohos.build.utils.StringHandler;
import groovy.json.JsonBuilder;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.gradle.api.tasks.TaskAction;

public class GenerateJsManifest extends DefaultTask implements GroovyObject {
  @Nonnull
  private BuildType buildType;
  
  private ConfigInfo configInfo;
  
  private VariantData variantData;
  
  private SdkInfo sdkInfo;
  
  private PathInfo pathInfo;
  
  @OutputDirectory
  private Path jsManifestDir;
  
  @InputFile
  private Path configPath;
  
  @InputDirectory
  @SkipWhenEmpty
  private File jsComponentSrcPath;
  
  @Inject
  public GenerateJsManifest(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(object1, BuildType.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object2 = arrayOfCallSite[1].call(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object2, ConfigInfo.class);
    Object object3 = arrayOfCallSite[2].call(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object4, PathInfo.class);
    Object object5 = arrayOfCallSite[4].call(Paths.class, arrayOfCallSite[5].call(this.pathInfo));
    this.jsManifestDir = (Path)ScriptBytecodeAdapter.castToType(object5, Path.class);
    Object object6 = arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(this.pathInfo));
    this.configPath = (Path)ScriptBytecodeAdapter.castToType(object6, Path.class);
    Object object7 = arrayOfCallSite[8].call(variantData);
    this.jsComponentSrcPath = (File)ScriptBytecodeAdapter.castToType(object7, File.class);
  }
  
  @TaskAction
  public void run() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String jsManifestDir = ShortTypeHandling.castToString(arrayOfCallSite[9].call(this.jsManifestDir));
    JsOptions jsModule;
    Iterator iterator;
    for (jsModule = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(arrayOfCallSite[11].call(this.configInfo)), Iterator.class); iterator.hasNext(); ) {
      jsModule = (JsOptions)ScriptBytecodeAdapter.castToType(iterator.next(), JsOptions.class);
      String myJsModuleName = ShortTypeHandling.castToString(arrayOfCallSite[12].call(jsModule));
      File myJSManifestPath = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(arrayOfCallSite[14].call(Paths.class, arrayOfCallSite[15].call(jsManifestDir), myJsModuleName)), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(myJSManifestPath)))
        arrayOfCallSite[17].call(myJSManifestPath); 
      arrayOfCallSite[18].call(myJSManifestPath);
      File myJSManifest = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[19].call(arrayOfCallSite[20].call(Paths.class, arrayOfCallSite[21].call(myJSManifestPath), arrayOfCallSite[22].callGetProperty(CommonConst.class))), File.class);
      Map manifestContent = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].callConstructor(LinkedHashMap.class), Map.class);
      arrayOfCallSite[24].call(manifestContent, "appID", arrayOfCallSite[25].call(this.configInfo));
      arrayOfCallSite[26].call(manifestContent, "appName", arrayOfCallSite[27].call(this.configInfo));
      arrayOfCallSite[28].call(manifestContent, "versionName", arrayOfCallSite[29].call(this.configInfo));
      arrayOfCallSite[30].call(manifestContent, "versionCode", arrayOfCallSite[31].call(this.configInfo));
      arrayOfCallSite[32].call(manifestContent, "minPlatformVersion", arrayOfCallSite[33].call(this.configInfo));
      arrayOfCallSite[34].call(manifestContent, "pages", arrayOfCallSite[35].call(jsModule));
      arrayOfCallSite[36].call(manifestContent, "deviceType", arrayOfCallSite[37].callGetProperty(arrayOfCallSite[38].call(arrayOfCallSite[39].callGroovyObjectGetProperty(this.configInfo))));
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(StringHandler.class, arrayOfCallSite[41].call(jsModule))))
        arrayOfCallSite[42].call(manifestContent, "type", arrayOfCallSite[43].call(jsModule)); 
      arrayOfCallSite[44].callCurrent(this, jsModule, manifestContent);
      Reference myJSManifestContext = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[45].callConstructor(JsonBuilder.class), JsonBuilder.class));
      arrayOfCallSite[46].call(myJSManifestContext.get(), manifestContent);
      arrayOfCallSite[47].call(myJSManifest, "utf-8", new _run_closure1(this, this, myJSManifestContext));
    } 
  }
  
  public final class _run_closure1 extends Closure implements GeneratedClosure {
    public _run_closure1(Object _outerInstance, Object _thisObject, Reference myJSManifestContext) {
      super(_outerInstance, _thisObject);
      Reference reference = myJSManifestContext;
      this.myJSManifestContext = reference;
    }
    
    public Object doCall(Object writer) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(writer, arrayOfCallSite[1].call(this.myJSManifestContext.get()));
    }
    
    @Generated
    public JsonBuilder getMyJSManifestContext() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (JsonBuilder)ScriptBytecodeAdapter.castToType(this.myJSManifestContext.get(), JsonBuilder.class);
    }
  }
  
  private void addWindowTag(JsOptions jsModule, Map manifestContent) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(this.configInfo))) {
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[49].call(jsModule), null))
        arrayOfCallSite[50].call(jsModule, arrayOfCallSite[51].call(WindowOptions.class)); 
      arrayOfCallSite[52].call(manifestContent, "window", arrayOfCallSite[53].call(jsModule));
    } else if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(this.configInfo))) {
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[55].call(jsModule), null))
        arrayOfCallSite[56].call(manifestContent, "window", arrayOfCallSite[57].call(jsModule)); 
    } 
  }
  
  @Generated
  public Path getJsManifestDir() {
    return this.jsManifestDir;
  }
  
  @Generated
  public void setJsManifestDir(Path paramPath) {
    this.jsManifestDir = paramPath;
  }
  
  @Generated
  public Path getConfigPath() {
    return this.configPath;
  }
  
  @Generated
  public void setConfigPath(Path paramPath) {
    this.configPath = paramPath;
  }
  
  @Generated
  public File getJsComponentSrcPath() {
    return this.jsComponentSrcPath;
  }
  
  @Generated
  public void setJsComponentSrcPath(File paramFile) {
    this.jsComponentSrcPath = paramFile;
  }
}
