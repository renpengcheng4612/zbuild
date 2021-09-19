package com.huawei.ohos.build.utils;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Closer;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.utils.configJson.ClassField;
import com.huawei.ohos.build.utils.configJson.ClassFieldImpl;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class BuildConfigGenerator implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private static final Set<Modifier> PUBLIC_FINAL;
  
  private static final Set<Modifier> PUBLIC_STATIC_FINAL;
  
  private final File mGenFolder;
  
  private final String mBuildConfigPackageName;
  
  private final List<ClassField> mFields;
  
  static {
    Object object1 = $getCallSiteArray()[50].call(HMLogger.class, BuildConfigGenerator.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object1, HMLogger.class);
    Object object2 = $getCallSiteArray()[51].call(EnumSet.class, $getCallSiteArray()[52].callGetProperty(Modifier.class), $getCallSiteArray()[53].callGetProperty(Modifier.class));
    PUBLIC_FINAL = (Set<Modifier>)ScriptBytecodeAdapter.castToType(object2, Set.class);
    Object object3 = $getCallSiteArray()[54].call(EnumSet.class, $getCallSiteArray()[55].callGetProperty(Modifier.class), $getCallSiteArray()[56].callGetProperty(Modifier.class), $getCallSiteArray()[57].callGetProperty(Modifier.class));
    PUBLIC_STATIC_FINAL = (Set<Modifier>)ScriptBytecodeAdapter.castToType(object3, Set.class);
  }
  
  public BuildConfigGenerator(File genFolder, String buildConfigPackageName) {
    Object object = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.mFields = (List<ClassField>)ScriptBytecodeAdapter.castToType(object, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(Preconditions.class, genFolder), File.class);
    this.mGenFolder = (File)ScriptBytecodeAdapter.castToType(file, File.class);
    String str = ShortTypeHandling.castToString(arrayOfCallSite[2].call(Preconditions.class, buildConfigPackageName));
    this.mBuildConfigPackageName = ShortTypeHandling.castToString(str);
  }
  
  public BuildConfigGenerator addField(String type, String name, String value) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[3].call(this.mFields, arrayOfCallSite[4].callConstructor(ClassFieldImpl.class, type, name, value));
    return this;
  }
  
  public File getFolderPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(File.class, this.mGenFolder, arrayOfCallSite[6].call(this.mBuildConfigPackageName, ".", arrayOfCallSite[7].callGetProperty(File.class))), File.class);
  }
  
  public void generate() throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File pkgFolder = null;
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      File file = getFolderPath();
    } else {
      Object object = arrayOfCallSite[8].callCurrent(this);
      pkgFolder = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    } 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[15].call(pkgFolder))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(pkgFolder)))))
        arrayOfCallSite[17].call(hmLogger, arrayOfCallSite[18].callConstructor(RuntimeException.class, arrayOfCallSite[19].call("Failed to create ", arrayOfCallSite[20].call(pkgFolder)))); 
    } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(pkgFolder))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(pkgFolder))))) {
      arrayOfCallSite[11].call(hmLogger, arrayOfCallSite[12].callConstructor(RuntimeException.class, arrayOfCallSite[13].call("Failed to create ", arrayOfCallSite[14].call(pkgFolder))));
    } 
    File buildConfigJava = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[21].callConstructor(File.class, pkgFolder, arrayOfCallSite[22].callGetProperty(BuildConst.class)), File.class);
    Closer closer = (Closer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(Closer.class), Closer.class);
    try {
      FileOutputStream fos = (FileOutputStream)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(closer, arrayOfCallSite[25].callConstructor(FileOutputStream.class, buildConfigJava)), FileOutputStream.class);
      OutputStreamWriter out = (OutputStreamWriter)ScriptBytecodeAdapter.castToType(arrayOfCallSite[26].call(closer, arrayOfCallSite[27].callConstructor(OutputStreamWriter.class, fos, arrayOfCallSite[28].callGetProperty(Charsets.class))), OutputStreamWriter.class);
      BufferedWriter bwr = (BufferedWriter)ScriptBytecodeAdapter.castToType(arrayOfCallSite[29].call(closer, arrayOfCallSite[30].callConstructor(BufferedWriter.class, out)), BufferedWriter.class);
      JavaWriter writer = (JavaWriter)ScriptBytecodeAdapter.castToType(arrayOfCallSite[31].call(closer, arrayOfCallSite[32].callConstructor(JavaWriter.class, bwr)), JavaWriter.class);
      arrayOfCallSite[33].call(arrayOfCallSite[34].call(arrayOfCallSite[35].call(writer, "Automatically generated file. DO NOT MODIFY"), this.mBuildConfigPackageName), "BuildConfig", "class", PUBLIC_FINAL);
      ClassField field;
      Iterator iterator;
      for (field = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[36].call(this.mFields), Iterator.class); iterator.hasNext(); ) {
        field = (ClassField)ScriptBytecodeAdapter.castToType(iterator.next(), ClassField.class);
        arrayOfCallSite[37].call(writer, arrayOfCallSite[38].call(field), arrayOfCallSite[39].call(field), PUBLIC_STATIC_FINAL, arrayOfCallSite[40].call(field));
      } 
      arrayOfCallSite[41].call(writer);
    } catch (Throwable e) {
    
    } finally {
      arrayOfCallSite[49].call(closer);
    } 
  }
}
