package com.huawei.ohos.build.model.dependencies;

import com.huawei.ohos.build.utils.FileUtils;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.StringJoiner;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class HarDependency implements GroovyObject {
  @Nonnull
  private final File mHarFile;
  
  public final String mHarExplodedPath;
  
  private final boolean mCompiled;
  
  private final boolean mPackaged;
  
  public HarDependency(@Nonnull File mHarFile, @Nonnull String mHarExplodedPath, boolean mCompiled, boolean mPackaged) {
    MetaClass metaClass = $getStaticMetaClass();
    File file = mHarFile;
    this.mHarFile = (File)ScriptBytecodeAdapter.castToType(file, File.class);
    Object object = arrayOfCallSite[0].call(arrayOfCallSite[1].call(mHarExplodedPath, arrayOfCallSite[2].callGetProperty(File.class)), arrayOfCallSite[3].call(FileUtils.class, arrayOfCallSite[4].callGetProperty(mHarFile)));
    this.mHarExplodedPath = ShortTypeHandling.castToString(object);
    boolean bool1 = mCompiled;
    this.mCompiled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool1));
    boolean bool2 = mPackaged;
    this.mPackaged = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool2));
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[5].call(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(arrayOfCallSite[9].call(arrayOfCallSite[10].callConstructor(StringJoiner.class, ",", arrayOfCallSite[11].call(arrayOfCallSite[12].callGetProperty(HarDependency.class), "["), "]"), arrayOfCallSite[13].call("harFile:", this.mHarFile)), arrayOfCallSite[14].call("compiled:", Boolean.valueOf(this.mCompiled))), arrayOfCallSite[15].call("packaged:", Boolean.valueOf(this.mPackaged))), arrayOfCallSite[16].call("explodedPath:", this.mHarExplodedPath))));
  }
}
