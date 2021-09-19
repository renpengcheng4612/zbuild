package com.huawei.ohos.build.tasks.factory;

import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.utils.StringHandler;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.TaskContainer;

public class SpecificTaskContainer implements GroovyObject {
  private final Project project;
  
  private final TaskContainer taskContainer;
  
  private final VariantData variantData;
  
  private Task generateShellTask;
  
  private Task processShellManifestTask;
  
  private Task compileShellResourcesTask;
  
  private Task linkShellResourcesTask;
  
  private Task compileShellJavaWithJavacTask;
  
  private Task packageShellClass;
  
  private Task mergeShellDex;
  
  private Task packageShellTask;
  
  private Task packageSimplifyShellTask;
  
  private Task assembleTask;
  
  private Task signShellTask;
  
  private Task legacyReplace;
  
  private Task signHapTask;
  
  private Task compileJavaWithJavacTask;
  
  private Task compileNativeWithCmakeTask;
  
  private Task compileResourcesTask;
  
  private Task compileIdlTask;
  
  private Task mergeProjectDexTask;
  
  private Task generateBuildConfigTask;
  
  private Task generateDataBindingTask;
  
  private Task packageHapTask;
  
  private Task packageHarTask;
  
  private Task validateSigningTask;
  
  private Task compileRFileTask;
  
  private Task packageRClassTask;
  
  private Task generateClassesTask;
  
  private Task mergeResourcesTask;
  
  private Task generateJsManifestTask;
  
  private Task compileJsWithNodeJsTask;
  
  private Task compileJsWithNodeTask;
  
  private Task mergeProfileTask;
  
  private Task collectDependenciesTask;
  
  private Task processLibsFileTask;
  
  private Task mergeJavaResourceTask;
  
  private Task validateAppSignTask;
  
  private Task packageAppTask;
  
  private Task cleanProjectTask;
  
  private Task signAppTask;
  
  private Task generateResourcesTask;
  
  private Task mergeProguardFilesTask;
  
  private Task obfuscateWithProguard;
  
  private Task buildPreviewerResource;
  
  private Task generateJsBinSource;
  
  private Task generateJsBin;
  
  private Task signJsBin;
  
  public SpecificTaskContainer(Project project, TaskContainer taskContainer, VariantData variantData) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    TaskContainer taskContainer1 = taskContainer;
    this.taskContainer = (TaskContainer)ScriptBytecodeAdapter.castToType(taskContainer1, TaskContainer.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "shell");
      this.generateShellTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[0].callCurrent(this, "generate", "shell");
      this.generateShellTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("process", "shellManifest");
      this.processShellManifestTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[1].callCurrent(this, "process", "shellManifest");
      this.processShellManifestTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "shellResources");
      this.compileShellResourcesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[2].callCurrent(this, "compile", "shellResources");
      this.compileShellResourcesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("link", "shellResources");
      this.linkShellResourcesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[3].callCurrent(this, "link", "shellResources");
      this.linkShellResourcesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "shellJavaWithJavac");
      this.compileShellJavaWithJavacTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[4].callCurrent(this, "compile", "shellJavaWithJavac");
      this.compileShellJavaWithJavacTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "shellClass");
      this.packageShellClass = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[5].callCurrent(this, "package", "shellClass");
      this.packageShellClass = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "shellDex");
      this.mergeShellDex = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[6].callCurrent(this, "merge", "shellDex");
      this.mergeShellDex = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "shell");
      this.packageShellTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[7].callCurrent(this, "package", "shell");
      this.packageShellTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "simplifyShell");
      this.packageSimplifyShellTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[8].callCurrent(this, "package", "simplifyShell");
      this.packageSimplifyShellTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("assemble", "");
      this.assembleTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[9].callCurrent(this, "assemble", "");
      this.assembleTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "shell");
      this.packageShellTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[10].callCurrent(this, "package", "shell");
      this.packageShellTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("sign", "shell");
      this.signShellTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[11].callCurrent(this, "sign", "shell");
      this.signShellTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("replace", "legacy");
      this.legacyReplace = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[12].callCurrent(this, "replace", "legacy");
      this.legacyReplace = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("sign", "hap");
      this.signHapTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[13].callCurrent(this, "sign", "hap");
      this.signHapTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "javaWithJavac");
      this.compileJavaWithJavacTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[14].callCurrent(this, "compile", "javaWithJavac");
      this.compileJavaWithJavacTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "nativeWithCmake");
      this.compileNativeWithCmakeTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[15].callCurrent(this, "compile", "nativeWithCmake");
      this.compileNativeWithCmakeTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "resources");
      this.compileResourcesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[16].callCurrent(this, "compile", "resources");
      this.compileResourcesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "idl");
      this.compileIdlTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[17].callCurrent(this, "compile", "idl");
      this.compileIdlTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "projectDex");
      this.mergeProjectDexTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[18].callCurrent(this, "merge", "projectDex");
      this.mergeProjectDexTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "buildConfig");
      this.generateBuildConfigTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[19].callCurrent(this, "generate", "buildConfig");
      this.generateBuildConfigTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "dataBinding");
      this.generateDataBindingTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[20].callCurrent(this, "generate", "dataBinding");
      this.generateDataBindingTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "hap");
      this.packageHapTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[21].callCurrent(this, "package", "hap");
      this.packageHapTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "har");
      this.packageHarTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[22].callCurrent(this, "package", "har");
      this.packageHarTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("validate", "signing");
      this.validateSigningTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[23].callCurrent(this, "validate", "signing");
      this.validateSigningTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "RFile");
      this.compileRFileTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[24].callCurrent(this, "compile", "RFile");
      this.compileRFileTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "RClass");
      this.packageRClassTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[25].callCurrent(this, "package", "RClass");
      this.packageRClassTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "ClassesJar");
      this.generateClassesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[26].callCurrent(this, "generate", "ClassesJar");
      this.generateClassesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "resources");
      this.mergeResourcesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[27].callCurrent(this, "merge", "resources");
      this.mergeResourcesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "jsManifest");
      this.generateJsManifestTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[28].callCurrent(this, "generate", "jsManifest");
      this.generateJsManifestTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "jsWithNodeJs");
      this.compileJsWithNodeJsTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[29].callCurrent(this, "compile", "jsWithNodeJs");
      this.compileJsWithNodeJsTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("compile", "jsWithNode");
      this.compileJsWithNodeTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[30].callCurrent(this, "compile", "jsWithNode");
      this.compileJsWithNodeTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "profile");
      this.mergeProfileTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[31].callCurrent(this, "merge", "profile");
      this.mergeProfileTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("collect", "dependencies");
      this.collectDependenciesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[32].callCurrent(this, "collect", "dependencies");
      this.collectDependenciesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("process", "libsFile");
      this.processLibsFileTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[33].callCurrent(this, "process", "libsFile");
      this.processLibsFileTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "javaResource");
      this.mergeJavaResourceTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[34].callCurrent(this, "merge", "javaResource");
      this.mergeJavaResourceTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("validate", "appSigning");
      this.validateAppSignTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[35].callCurrent(this, "validate", "appSigning");
      this.validateAppSignTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("package", "app");
      this.packageAppTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[36].callCurrent(this, "package", "app");
      this.packageAppTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTopLevelTask("clean", "project");
      this.cleanProjectTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[37].callCurrent(this, "clean", "project");
      this.cleanProjectTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("sign", "app");
      this.signAppTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[38].callCurrent(this, "sign", "app");
      this.signAppTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "resources");
      this.generateResourcesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[39].callCurrent(this, "generate", "resources");
      this.generateResourcesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("merge", "proguardFile");
      this.mergeProguardFilesTask = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[40].callCurrent(this, "merge", "proguardFile");
      this.mergeProguardFilesTask = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("obfuscate", "withProguard");
      this.obfuscateWithProguard = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[41].callCurrent(this, "obfuscate", "withProguard");
      this.obfuscateWithProguard = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("build", "PreviewerResource");
      this.buildPreviewerResource = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[42].callCurrent(this, "build", "PreviewerResource");
      this.buildPreviewerResource = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "binSource");
      this.generateJsBinSource = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[43].callCurrent(this, "generate", "binSource");
      this.generateJsBinSource = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("generate", "jsBin");
      this.generateJsBin = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
    } else {
      Object object1 = arrayOfCallSite[44].callCurrent(this, "generate", "jsBin");
      this.generateJsBin = (Task)ScriptBytecodeAdapter.castToType(object1, Task.class);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      Task task = initTask("sign", "jsBin");
      this.signJsBin = (Task)ScriptBytecodeAdapter.castToType(task, Task.class);
      return;
    } 
    Object object = arrayOfCallSite[45].callCurrent(this, "sign", "jsBin");
    this.signJsBin = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
  }
  
  public Task initTask(String prefix, String suffix) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String taskName = ShortTypeHandling.castToString(arrayOfCallSite[46].call(this.variantData, prefix, suffix));
    Set taskNamesContainer = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(this.taskContainer), Set.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[48].call(taskNamesContainer, taskName)))
      return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[49].call(this.taskContainer, taskName), Task.class); 
    return (Task)ScriptBytecodeAdapter.castToType(null, Task.class);
  }
  
  public Task initTopLevelTask(String prefix, String suffix) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String taskName = ShortTypeHandling.castToString(arrayOfCallSite[50].call(StringHandler.class, prefix, suffix));
    Set taskNamesContainer = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[51].call(this.taskContainer), Set.class);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(taskNamesContainer, taskName)))
      return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].call(this.taskContainer, taskName), Task.class); 
    return (Task)ScriptBytecodeAdapter.castToType(null, Task.class);
  }
  
  public Task getAssembleTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.assembleTask;
  }
  
  public Task getCompileJavaWithJavacTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileJavaWithJavacTask;
  }
  
  public Task getCompileNativeWithCmakeTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileNativeWithCmakeTask;
  }
  
  public Task getCompileResourcesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileResourcesTask;
  }
  
  public Task getGenerateShellTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateShellTask;
  }
  
  public Task getPackageShellTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageShellTask;
  }
  
  public Task getPackageSimplifyShellTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageSimplifyShellTask;
  }
  
  public Task getSignShellTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signShellTask;
  }
  
  public Task getLegacyReplace() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.legacyReplace;
  }
  
  public Task getSignHapTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signHapTask;
  }
  
  public Task getCompileIdlTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileIdlTask;
  }
  
  public Task getMergeProjectDexTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeProjectDexTask;
  }
  
  public Task getGenerateBuildConfigTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateBuildConfigTask;
  }
  
  public Task getGenerateDataBindingTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateDataBindingTask;
  }
  
  public Task getPackageHapTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageHapTask;
  }
  
  public Task getPackageHarTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageHarTask;
  }
  
  public Task getValidateSigningTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.validateSigningTask;
  }
  
  public Task getCompileRFileTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileRFileTask;
  }
  
  public Task getPackageRClassTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageRClassTask;
  }
  
  public Task getGenerateClassesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateClassesTask;
  }
  
  public Task getMergeResourcesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeResourcesTask;
  }
  
  public Task getGenerateJsManifestTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateJsManifestTask;
  }
  
  public Task getCompileJsWithNodeJsTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileJsWithNodeJsTask;
  }
  
  public Task getCompileJsWithNodeTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileJsWithNodeTask;
  }
  
  public Task getMergeProfileTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeProfileTask;
  }
  
  public Task getCollectDependenciesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.collectDependenciesTask;
  }
  
  public Task getProcessLibsFileTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.processLibsFileTask;
  }
  
  public Task getMergeJavaResourceTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeJavaResourceTask;
  }
  
  public Task getValidateAppSignTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.validateAppSignTask;
  }
  
  public Task getPackageAppTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageAppTask;
  }
  
  public Task getCleanProjectTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.cleanProjectTask;
  }
  
  public Task getSignAppTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signAppTask;
  }
  
  public Task getProcessShellManifestTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.processShellManifestTask;
  }
  
  public Task getCompileShellResourcesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileShellResourcesTask;
  }
  
  public Task getLinkShellResourcesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.linkShellResourcesTask;
  }
  
  public Task getCompileShellJavaWithJavacTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileShellJavaWithJavacTask;
  }
  
  public Task getPackageShellClass() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageShellClass;
  }
  
  public Task getMergeShellDex() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeShellDex;
  }
  
  public Task getGenerateJsBinSource() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateJsBinSource;
  }
  
  public Task getGenerateJsBin() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateJsBin;
  }
  
  public Task getSignJsBin() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.signJsBin;
  }
  
  public Task getGenerateResourcesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.generateResourcesTask;
  }
  
  public Task getMergeProguardFilesTask() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeProguardFilesTask;
  }
  
  public Task getObfuscateWithProguard() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.obfuscateWithProguard;
  }
  
  public Task getBuildPreviewerResource() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.buildPreviewerResource;
  }
}
