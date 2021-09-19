package com.huawei.ohos.build.utils.sign.optionsBuilder;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class AppOptionsBuilder extends CommonOptionsBuilder {
  @Nonnull
  private JavaCommandBuilder.SigningOptions options;
  
  public AppOptionsBuilder(Project project, JavaCommandBuilder builder, SigningConfig signingConfig, SdkInfo sdkInfo, SignModel signModel) {
    super(project, builder, sdkInfo, signingConfig, signModel);
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].callConstructor(JavaCommandBuilder.SigningOptions.class, builder);
    this.options = (JavaCommandBuilder.SigningOptions)ScriptBytecodeAdapter.castToType(object, JavaCommandBuilder.SigningOptions.class);
  }
  
  public void initOfflineParams() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[1]
      
      .call(arrayOfCallSite[2].call(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].call(arrayOfCallSite[11].call(this.options), "localjks"), arrayOfCallSite[12].callGetProperty(arrayOfCallSite[13].callGetProperty(arrayOfCallSite[14].callGroovyObjectGetProperty(this)))), arrayOfCallSite[15].callGroovyObjectGetProperty(this)), arrayOfCallSite[16].callGetProperty(arrayOfCallSite[17].callGroovyObjectGetProperty(this))), arrayOfCallSite[18].callGroovyObjectGetProperty(this)), arrayOfCallSite[19].callGetProperty(arrayOfCallSite[20].callGroovyObjectGetProperty(this))), arrayOfCallSite[21].callGetProperty(arrayOfCallSite[22].call(arrayOfCallSite[23].callGroovyObjectGetProperty(this)))), arrayOfCallSite[24].callGetProperty(arrayOfCallSite[25].call(arrayOfCallSite[26].callGroovyObjectGetProperty(this)))), arrayOfCallSite[27].callGetProperty(arrayOfCallSite[28].callGroovyObjectGetProperty(arrayOfCallSite[29].callGroovyObjectGetProperty(this)))), arrayOfCallSite[30].callGetProperty(arrayOfCallSite[31].callGroovyObjectGetProperty(arrayOfCallSite[32].callGroovyObjectGetProperty(this))));
  }
  
  public String getSignToolName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[33].callGetProperty(SdkConst.class));
  }
}
