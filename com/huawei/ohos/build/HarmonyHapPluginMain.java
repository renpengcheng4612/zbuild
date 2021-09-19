package com.huawei.ohos.build;

import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import com.huawei.ohos.build.tasks.factory.HapTaskManager;
import com.huawei.ohos.build.tasks.factory.TaskManager;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.file.Paths;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.annotation.Nonnull;
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
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;

public class HarmonyHapPluginMain extends BasePlugin {
  private static final HMLogger HM_LOGGER;
  
  static {
    Object object = $getCallSiteArray()[37].call(HMLogger.class, HarmonyHapPluginMain.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public HarmonyHapPluginMain(@Nonnull ToolingModelBuilderRegistry registry, @Nonnull SoftwareComponentFactory softwareComponentFactory) {
    super(registry, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  protected void pluginSpecificApply(@Nonnull Project project, @Nonnull VariantManager variantManager) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      printHapVersion();
      null;
    } else {
      arrayOfCallSite[0].callCurrent(this);
    } 
    arrayOfCallSite[1].callCurrent(this, arrayOfCallSite[2].callGroovyObjectGetProperty(this), variantManager, arrayOfCallSite[3].callGroovyObjectGetProperty(this));
  }
  
  protected void initDefaultSigningConfigs(NamedDomainObjectContainer signingConfigContainer) {
    Reference reference = new Reference(signingConfigContainer);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    AppExtension appExtension = (AppExtension)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(arrayOfCallSite[7].callGroovyObjectGetProperty(this))), AppExtension.class), AppExtension.class);
    arrayOfCallSite[8].call(arrayOfCallSite[9].callGroovyObjectGetProperty(appExtension), new _initDefaultSigningConfigs_closure1(this, this, reference));
  }
  
  public final class _initDefaultSigningConfigs_closure1 extends Closure implements GeneratedClosure {
    public _initDefaultSigningConfigs_closure1(Object _outerInstance, Object _thisObject, Reference signingConfigContainer) {
      super(_outerInstance, _thisObject);
      Reference reference = signingConfigContainer;
      this.signingConfigContainer = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      SigningConfigOptions signingConfig = (SigningConfigOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGroovyObjectGetProperty(this)), SigningConfigOptions.class, arrayOfCallSite[3].callGetProperty(it)), SigningConfigOptions.class);
      arrayOfCallSite[4].call(signingConfig, it);
      return arrayOfCallSite[5].call(this.signingConfigContainer.get(), signingConfig);
    }
    
    @Generated
    public NamedDomainObjectContainer getSigningConfigContainer() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (NamedDomainObjectContainer)ScriptBytecodeAdapter.castToType(this.signingConfigContainer.get(), NamedDomainObjectContainer.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public void printHapVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    URI jarLocation = (URI)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].call(arrayOfCallSite[11].call(arrayOfCallSite[12].call(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(this))))), URI.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(arrayOfCallSite[16].call(jarLocation), "jar")))
      return; 
    JarFile jar = (JarFile)ScriptBytecodeAdapter.castToType(arrayOfCallSite[17].callConstructor(JarFile.class, arrayOfCallSite[18].call(arrayOfCallSite[19].call(Paths.class, jarLocation))), JarFile.class);
    Manifest manifest = (Manifest)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].call(jar), Manifest.class);
    Attributes attributes = (Attributes)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].call(manifest), Attributes.class);
    String buildTime = ShortTypeHandling.castToString(arrayOfCallSite[22].call(attributes, "Build_Time"));
    String pluginVersion = ShortTypeHandling.castToString(arrayOfCallSite[23].call(attributes, "Plugin_Version"));
    arrayOfCallSite[24].call(HM_LOGGER, arrayOfCallSite[25].call(arrayOfCallSite[26].call(arrayOfCallSite[27].call(arrayOfCallSite[28].call("Build #", buildTime), ","), " hap gradle plugin version "), pluginVersion));
  }
  
  protected BaseExtension createExtension(Project project, NamedDomainObjectContainer buildTypeContainer, NamedDomainObjectContainer variantFlavorContainer, NamedDomainObjectContainer signingConfigContainer) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (BaseExtension)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(arrayOfCallSite[30].call(project), ArrayUtil.createArray("ohos", HapExtension.class, project, buildTypeContainer, variantFlavorContainer, signingConfigContainer)), BaseExtension.class);
  }
  
  protected TaskManager createTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (TaskManager)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].callConstructor(HapTaskManager.class, project, dependencyManager, softwareComponentFactory), TaskManager.class);
  }
  
  protected void baseDataHandleBeforeApply(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(arrayOfCallSite[33].call(GlobalDataManager.class, project), project), PathInfo.class);
    arrayOfCallSite[34].call(arrayOfCallSite[35].call(GlobalDataManager.class, project), project, arrayOfCallSite[36].call(pathInfo));
  }
}
