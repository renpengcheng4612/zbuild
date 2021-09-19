package com.huawei.ohos.build.tasks.pack.model.shell;

import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.pack.model.DefaultPackModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;

public class CutShellPackModel extends DefaultPackModel {
  public CutShellPackModel(Project project, VariantData variantData) {
    super(project, variantData);
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(this);
    ScriptBytecodeAdapter.setGroovyObjectProperty(object1, CutShellPackModel.class, (GroovyObject)this, "packageType");
    Object object2 = arrayOfCallSite[1].call(arrayOfCallSite[2].call(Paths.class, arrayOfCallSite[3].call(arrayOfCallSite[4].callGroovyObjectGetProperty(this)), arrayOfCallSite[5].callGroovyObjectGetProperty(variantData), "cut"));
    ScriptBytecodeAdapter.setGroovyObjectProperty(object2, CutShellPackModel.class, (GroovyObject)this, "outputDir");
    Object object3 = arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(project), "_"), arrayOfCallSite[10].callGroovyObjectGetProperty(variantData)), "_unsigned_cut_entry.apk");
    ScriptBytecodeAdapter.setGroovyObjectProperty(object3, CutShellPackModel.class, (GroovyObject)this, "outputFileName");
  }
}
