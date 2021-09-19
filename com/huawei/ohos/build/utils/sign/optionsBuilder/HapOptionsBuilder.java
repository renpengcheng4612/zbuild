package com.huawei.ohos.build.utils.sign.optionsBuilder;

import com.huawei.ohos.build.consts.SdkConst;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.SigningConfig;
import com.huawei.ohos.build.utils.command.JavaCommandBuilder;
import com.huawei.ohos.build.utils.sign.KeyStoreHelper;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class HapOptionsBuilder extends CommonOptionsBuilder {
  @Nonnull
  private JavaCommandBuilder.SigningOptions options;
  
  public HapOptionsBuilder(Project project, JavaCommandBuilder builder, SigningConfig signingConfig, SdkInfo sdkInfo, SignModel signModel) {
    super(project, builder, sdkInfo, signingConfig, signModel);
    MetaClass metaClass = $getStaticMetaClass();
    Object object = arrayOfCallSite[0].callConstructor(JavaCommandBuilder.SigningOptions.class, builder);
    this.options = (JavaCommandBuilder.SigningOptions)ScriptBytecodeAdapter.castToType(object, JavaCommandBuilder.SigningOptions.class);
  }
  
  public void initOfflineParams() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String moduleType = ShortTypeHandling.castToString(arrayOfCallSite[1].callGroovyObjectGetProperty(arrayOfCallSite[2].callGroovyObjectGetProperty(this)));
    arrayOfCallSite[3]
      .call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(this.options), ScriptBytecodeAdapter.compareEqual("bin", moduleType) ? "binlocaljks" : "localjks"), arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].callGetProperty(arrayOfCallSite[12].callGroovyObjectGetProperty(this)))), arrayOfCallSite[13].callGroovyObjectGetProperty(this)), arrayOfCallSite[14].callGetProperty(arrayOfCallSite[15].callGroovyObjectGetProperty(this))), arrayOfCallSite[16].callGroovyObjectGetProperty(this)), arrayOfCallSite[17].callGetProperty(arrayOfCallSite[18].callGroovyObjectGetProperty(this)));
    if (ScriptBytecodeAdapter.compareEqual("bin", moduleType))
      arrayOfCallSite[19].call(this.options); 
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[20].call(KeyStoreHelper.class, arrayOfCallSite[21].callGroovyObjectGetProperty(this), arrayOfCallSite[22].callGroovyObjectGetProperty(this)))) {
      Object profile = arrayOfCallSite[23].callGetProperty(arrayOfCallSite[24].call(arrayOfCallSite[25].callGroovyObjectGetProperty(this)));
      Object certpath = arrayOfCallSite[26].callGetProperty(arrayOfCallSite[27].call(arrayOfCallSite[28].callGroovyObjectGetProperty(this)));
      arrayOfCallSite[29].call(arrayOfCallSite[30].call(this.options, profile), certpath);
    } 
    arrayOfCallSite[31].call(this.options, arrayOfCallSite[32].callGetProperty(arrayOfCallSite[33].callGroovyObjectGetProperty(arrayOfCallSite[34].callGroovyObjectGetProperty(this))));
    arrayOfCallSite[35].call(this.options, arrayOfCallSite[36].callGetProperty(arrayOfCallSite[37].callGroovyObjectGetProperty(arrayOfCallSite[38].callGroovyObjectGetProperty(this))));
  }
  
  public String getSignToolName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[39].callGetProperty(SdkConst.class));
  }
}
