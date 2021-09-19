package com.huawei.ohos.build.tasks.preview;

import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.FileUtils;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.TaskAction;

public class BuildPreviewerResource extends DefaultTask implements GroovyObject {
  @Nonnull
  private static final HMLogger HM_LOGGER;
  
  private final VariantData variantData;
  
  @Internal
  private final File previewFlag;
  
  static {
    Object object = $getCallSiteArray()[8].call(HMLogger.class, BuildPreviewerResource.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public BuildPreviewerResource(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    PathInfo pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(variantData), PathInfo.class);
    Object object = arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(pathInfo), arrayOfCallSite[4].callGroovyObjectGetProperty(variantData), "preview.flag"));
    this.previewFlag = (File)ScriptBytecodeAdapter.castToType(object, File.class);
  }
  
  @TaskAction
  public void readyToPreview() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(FileUtils.class, this.previewFlag)))
      arrayOfCallSite[6]
        .call(HM_LOGGER, "Unable to refresh the %s file. The previewer may be not running properly.", arrayOfCallSite[7].call(this.previewFlag)); 
  }
}
