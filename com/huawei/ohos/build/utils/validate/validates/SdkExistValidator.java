package com.huawei.ohos.build.utils.validate.validates;

import com.huawei.ohos.build.utils.validate.Validator;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Locale;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;

public class SdkExistValidator implements Validator, GroovyObject {
  private Path sdkDirPath;
  
  private String sdkType;
  
  private String key;
  
  private String env;
  
  private CheckType checkType;
  
  public SdkExistValidator(@Nonnull String sdkDirPath, String sdkType) {
    String str1 = "", str2 = "", str3 = "";
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[0].call(Paths.class, sdkDirPath);
    this.sdkDirPath = (Path)ScriptBytecodeAdapter.castToType(object1, Path.class);
    String str4 = sdkType;
    this.sdkType = ShortTypeHandling.castToString(str4);
    Object object2 = ScriptBytecodeAdapter.compareEqual(sdkType, "cmakeLists.txt") ? arrayOfCallSite[1].callGetProperty(CheckType.class) : arrayOfCallSite[2].callGetProperty(CheckType.class);
    this.checkType = (CheckType)ShortTypeHandling.castToEnum(object2, CheckType.class);
  }
  
  public SdkExistValidator(@Nonnull String sdkDirPath, String key, String env) {
    String str1 = "", str2 = "", str3 = "";
    MetaClass metaClass = $getStaticMetaClass();
    Object object1 = arrayOfCallSite[3].call(Paths.class, sdkDirPath);
    this.sdkDirPath = (Path)ScriptBytecodeAdapter.castToType(object1, Path.class);
    String str4 = key;
    this.key = ShortTypeHandling.castToString(str4);
    String str5 = env;
    this.env = ShortTypeHandling.castToString(str5);
    Object object2 = arrayOfCallSite[4].callGetProperty(CheckType.class);
    this.checkType = (CheckType)ShortTypeHandling.castToEnum(object2, CheckType.class);
  }
  
  public boolean doValidate() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(Files.class, this.sdkDirPath));
  }
  
  public String getErrorMessage() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    CheckType checkType = this.checkType;
    if (ScriptBytecodeAdapter.isCase(checkType, arrayOfCallSite[6].callGetProperty(CheckType.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[7].call(String.class, arrayOfCallSite[8].callGetProperty(Locale.class), "Verify that '%s' was downloaded from HarmonyOS SDK.", this.sdkType)); 
    if (ScriptBytecodeAdapter.isCase(checkType, arrayOfCallSite[9].callGetProperty(CheckType.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[10].call(String.class, arrayOfCallSite[11].callGetProperty(Locale.class), "Check whether '%s' is configured in the local.properties file or whether '%s' is configured in the environment variables.", this.key, this.env)); 
    if (ScriptBytecodeAdapter.isCase(checkType, arrayOfCallSite[12].callGetProperty(CheckType.class)))
      return "CMakeLists.txt not found. Verify that externalNativeBuild is correctly set in build.gradle."; 
    return "never happen.";
  }
  
  enum CheckType implements GroovyObject {
    SDK_COMPONENT, SDK_CONFIG, CMAKE_LISTS;
    
    public static final CheckType MIN_VALUE;
    
    public static final CheckType MAX_VALUE;
    
    @Generated
    CheckType(LinkedHashMap __namedArgs) {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
      if (ScriptBytecodeAdapter.compareEqual(__namedArgs, null))
        throw (Throwable)arrayOfCallSite[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.huawei.ohos.build.utils.validate.validates.SdkExistValidator$CheckType was initialized with null. Please use a non-null value or define your own constructor."); 
      arrayOfCallSite[1].callStatic(ImmutableASTTransformation.class, this, __namedArgs);
    }
    
    static {
      Object object1 = $getCallSiteArray()[13].callStatic(CheckType.class, "SDK_COMPONENT", Integer.valueOf(0));
      SDK_COMPONENT = (CheckType)ShortTypeHandling.castToEnum(object1, CheckType.class);
      Object object2 = $getCallSiteArray()[14].callStatic(CheckType.class, "SDK_CONFIG", Integer.valueOf(1));
      SDK_CONFIG = (CheckType)ShortTypeHandling.castToEnum(object2, CheckType.class);
      Object object3 = $getCallSiteArray()[15].callStatic(CheckType.class, "CMAKE_LISTS", Integer.valueOf(2));
      CMAKE_LISTS = (CheckType)ShortTypeHandling.castToEnum(object3, CheckType.class);
      CheckType checkType1 = SDK_COMPONENT;
      MIN_VALUE = checkType1;
      CheckType checkType2 = CMAKE_LISTS;
      MAX_VALUE = checkType2;
      CheckType[] arrayOfCheckType = { SDK_COMPONENT, SDK_CONFIG, CMAKE_LISTS };
      $VALUES = arrayOfCheckType;
    }
  }
}
