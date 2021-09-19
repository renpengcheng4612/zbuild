package com.huawei.ohos.build;

import com.huawei.ohos.build.dsl.BuildTypeOptions;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;

public class AppExtension extends BaseExtension {
  @Inject
  public AppExtension(Project project, NamedDomainObjectContainer<BuildTypeOptions> buildTypeContainer, NamedDomainObjectContainer<VariantFlavorOptions> variantFlavorContainer, NamedDomainObjectContainer<SigningConfigOptions> signingConfigContainer) {
    super(project, buildTypeContainer, variantFlavorContainer, signingConfigContainer);
    MetaClass metaClass = $getStaticMetaClass();
  }
}
