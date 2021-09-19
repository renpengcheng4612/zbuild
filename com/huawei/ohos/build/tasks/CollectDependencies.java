package com.huawei.ohos.build.tasks;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.model.dependencies.HarDependency;
import com.huawei.ohos.build.model.dependencies.JarDependency;
import com.huawei.ohos.build.model.dependencies.LibraryDependency;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskAction;

public class CollectDependencies extends DefaultTask implements GroovyObject {
  private static final boolean PRINT_DEBUG_INFO;
  
  private static final HMLogger hmLogger;
  
  @Nonnull
  private ConfigurationContainer configurationContainer;
  
  @Nonnull
  private VariantData variantData;
  
  private PathInfo pathInfo;
  
  static {
    boolean bool = true;
    Object object = $getCallSiteArray()[78].call(HMLogger.class, CollectDependencies.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Inject
  public CollectDependencies(VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGetProperty(arrayOfCallSite[1].callGroovyObjectGetProperty(this));
    this.configurationContainer = (ConfigurationContainer)ScriptBytecodeAdapter.castToType(object1, ConfigurationContainer.class);
    Object object2 = arrayOfCallSite[2].call(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
  }
  
  @TaskAction
  public void collect() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object hmLogger = CollectDependencies.hmLogger;
    Configuration compileClasspath = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(arrayOfCallSite[4].call(this.variantData)), Configuration.class);
    Configuration packageClasspath = (Configuration)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(this.variantData)), Configuration.class);
    Set localCompiledJars = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(HashSet.class), Set.class);
    Set localCompiledHars = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].callConstructor(HashSet.class), Set.class);
    arrayOfCallSite[9].callCurrent(this, compileClasspath, localCompiledJars, localCompiledHars);
    Set localPackagedJars = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[10].callConstructor(HashSet.class), Set.class);
    Set localPackageHars = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(HashSet.class), Set.class);
    arrayOfCallSite[12].callCurrent(this, packageClasspath, localPackagedJars, localPackageHars);
    Map localJars = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].callConstructor(HashMap.class), Map.class);
    Map localHars = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(HashMap.class), Map.class);
    String myExplodedHarParentPath = ShortTypeHandling.castToString(arrayOfCallSite[15].call(this.pathInfo));
    File file;
    Iterator iterator1;
    for (file = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[16].call(localCompiledJars), Iterator.class); iterator1.hasNext(); ) {
      file = (File)ScriptBytecodeAdapter.castToType(iterator1.next(), File.class);
      arrayOfCallSite[17]
        
        .call(localJars, file, arrayOfCallSite[18].callConstructor(JarDependency.class, ArrayUtil.createArray(file, Boolean.valueOf(true), arrayOfCallSite[19].call(localPackagedJars, file), null, null)));
    } 
    File file1;
    Iterator iterator2;
    for (file1 = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[20].call(localCompiledHars), Iterator.class); iterator2.hasNext(); ) {
      file1 = (File)ScriptBytecodeAdapter.castToType(iterator2.next(), File.class);
      arrayOfCallSite[21]
        
        .call(localHars, file1, arrayOfCallSite[22].callConstructor(HarDependency.class, file1, myExplodedHarParentPath, Boolean.valueOf(true), arrayOfCallSite[23].call(localPackageHars, file1)));
    } 
    File file2;
    Iterator iterator3;
    for (file2 = null, iterator3 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[24].call(localPackagedJars), Iterator.class); iterator3.hasNext(); ) {
      file2 = (File)ScriptBytecodeAdapter.castToType(iterator3.next(), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[25].call(localCompiledJars, file2)))
        arrayOfCallSite[26].call(localJars, file2, arrayOfCallSite[27].callConstructor(JarDependency.class, ArrayUtil.createArray(file2, Boolean.valueOf(false), Boolean.valueOf(true), null, null))); 
    } 
    File file3;
    Iterator iterator4;
    for (file3 = null, iterator4 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].call(localCompiledHars), Iterator.class); iterator4.hasNext(); ) {
      file3 = (File)ScriptBytecodeAdapter.castToType(iterator4.next(), File.class);
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[29].call(localCompiledHars, file3)))
        arrayOfCallSite[30].call(localHars, file3, arrayOfCallSite[31].callConstructor(HarDependency.class, file3, myExplodedHarParentPath, Boolean.valueOf(false), Boolean.valueOf(true))); 
    } 
    arrayOfCallSite[32].call(arrayOfCallSite[33].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[34].call(localJars));
    arrayOfCallSite[35].call(arrayOfCallSite[36].callGroovyObjectGetProperty(this.variantData), arrayOfCallSite[37].call(localHars));
    if (PRINT_DEBUG_INFO) {
      HarDependency har;
      Iterator iterator5;
      for (har = null, iterator5 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].call(arrayOfCallSite[39].call(localHars)), Iterator.class); iterator5.hasNext(); ) {
        har = (HarDependency)ScriptBytecodeAdapter.castToType(iterator5.next(), HarDependency.class);
        arrayOfCallSite[40].call(hmLogger, "LOCAL-LIB", arrayOfCallSite[41].call(har));
      } 
      JarDependency jar;
      Iterator iterator6;
      for (jar = null, iterator6 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].call(arrayOfCallSite[43].call(localJars)), Iterator.class); iterator6.hasNext(); ) {
        jar = (JarDependency)ScriptBytecodeAdapter.castToType(iterator6.next(), JarDependency.class);
        arrayOfCallSite[44].call(hmLogger, "LOCAL-JAR:", arrayOfCallSite[45].call(jar));
      } 
      LibraryDependency lib;
      Iterator iterator7;
      for (lib = null, iterator7 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[46].call(arrayOfCallSite[47].callGetProperty(arrayOfCallSite[48].callGroovyObjectGetProperty(this.variantData))), Iterator.class); iterator7.hasNext(); ) {
        lib = (LibraryDependency)ScriptBytecodeAdapter.castToType(iterator7.next(), LibraryDependency.class);
        arrayOfCallSite[49].call(hmLogger, "LIB", arrayOfCallSite[50].call(lib));
      } 
      JarDependency jarDependency1;
      Iterator iterator8;
      for (jarDependency1 = null, iterator8 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(arrayOfCallSite[52].callGetProperty(arrayOfCallSite[53].callGroovyObjectGetProperty(this.variantData))), Iterator.class); iterator8.hasNext(); ) {
        jarDependency1 = (JarDependency)ScriptBytecodeAdapter.castToType(iterator8.next(), JarDependency.class);
        arrayOfCallSite[54].call(hmLogger, "JAR", arrayOfCallSite[55].call(jarDependency1));
      } 
    } 
  }
  
  private void gatherLocalDependencies(Configuration configuration, HashSet localJars, HashSet localHars) {
    CallSite[] arrayOfCallSite;
    Dependency dependency;
    Iterator iterator;
    for (arrayOfCallSite = $getCallSiteArray(), dependency = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].call(arrayOfCallSite[57].call(configuration)), Iterator.class); iterator.hasNext(); ) {
      dependency = (Dependency)ScriptBytecodeAdapter.castToType(iterator.next(), Dependency.class);
      if ((dependency instanceof org.gradle.api.artifacts.SelfResolvingDependency && (
        !(dependency instanceof org.gradle.api.artifacts.ProjectDependency)))) {
        Set files = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[58].call(dependency), Set.class);
        File f;
        Iterator iterator1;
        for (f = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].call(files), Iterator.class); iterator1.hasNext(); ) {
          f = (File)ScriptBytecodeAdapter.castToType(iterator1.next(), File.class);
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(f), arrayOfCallSite[63].call(Locale.class)), arrayOfCallSite[64].callGetProperty(BuildConst.class)))) {
            arrayOfCallSite[65].call(localJars, f);
            continue;
          } 
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[66].call(arrayOfCallSite[67].call(arrayOfCallSite[68].call(f), arrayOfCallSite[69].call(Locale.class)), arrayOfCallSite[70].callGetProperty(BuildConst.class)))) {
            arrayOfCallSite[71].call(localHars, f);
            continue;
          } 
          throw (Throwable)arrayOfCallSite[72]
            
            .callConstructor(GradleException.class, arrayOfCallSite[73].call(String.class, arrayOfCallSite[74].callGetProperty(Locale.class), "Project %s: Only compatible with local dependencies in JAR or HAR format. Unable to process %s.", arrayOfCallSite[75].call(arrayOfCallSite[76].callGroovyObjectGetProperty(this)), arrayOfCallSite[77].call(f)));
        } 
      } 
    } 
  }
}
