package com.huawei.ohos.build;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.tasks.factory.HarTaskManager;
import com.huawei.ohos.build.tasks.factory.TaskManager;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.artifacts.DependencyResolutionListener;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;

public class HarmonyLibraryPluginMain extends BasePlugin implements DependencyResolutionListener {
  @Inject
  public HarmonyLibraryPluginMain(@Nonnull ToolingModelBuilderRegistry registry, @Nonnull SoftwareComponentFactory softwareComponentFactory) {
    super(registry, softwareComponentFactory);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  protected BaseExtension createExtension(Project project, NamedDomainObjectContainer buildTypeContainer, NamedDomainObjectContainer variantFlavorContainer, NamedDomainObjectContainer signingConfigContainer) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (BaseExtension)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(arrayOfCallSite[1].call(project), ArrayUtil.createArray("ohos", HapExtension.class, project, buildTypeContainer, variantFlavorContainer, signingConfigContainer)), BaseExtension.class);
  }
  
  protected TaskManager createTaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (TaskManager)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].callConstructor(HarTaskManager.class, project, dependencyManager, softwareComponentFactory), TaskManager.class);
  }
  
  protected void baseDataHandleBeforeApply(Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(arrayOfCallSite[4].call(GlobalDataManager.class, project), project), PathInfo.class);
    String myProfileJson = ShortTypeHandling.castToString(arrayOfCallSite[5].call(pathInfo));
    arrayOfCallSite[6].call(arrayOfCallSite[7].call(GlobalDataManager.class, project), project, myProfileJson);
  }
  
  protected void pluginSpecificApply(Project project, VariantManager variantManager) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[8].callCurrent(this, arrayOfCallSite[9].callGroovyObjectGetProperty(this), variantManager, arrayOfCallSite[10].callGroovyObjectGetProperty(this));
    arrayOfCallSite[11].call(arrayOfCallSite[12].callGetProperty(project), this);
  }
  
  protected void initDefaultSigningConfigs(NamedDomainObjectContainer signingConfigContainer) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[13].call(signingConfigContainer, arrayOfCallSite[14].callGetProperty(BuildConst.class));
    arrayOfCallSite[15].call(signingConfigContainer, arrayOfCallSite[16].callGetProperty(BuildConst.class));
  }
  
  protected boolean isLibrary() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return true;
  }
}
