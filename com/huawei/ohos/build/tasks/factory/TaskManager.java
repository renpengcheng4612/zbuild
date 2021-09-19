package com.huawei.ohos.build.tasks.factory;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.model.VariantData;
import com.huawei.ohos.build.tasks.Assemble;
import com.huawei.ohos.build.tasks.CompileIdl;
import com.huawei.ohos.build.tasks.CompileJavaWithJavac;
import com.huawei.ohos.build.tasks.CompileJsWithNode;
import com.huawei.ohos.build.tasks.CompileNativeWithCmake;
import com.huawei.ohos.build.tasks.CompileRFileWithJavac;
import com.huawei.ohos.build.tasks.CompileResources;
import com.huawei.ohos.build.tasks.GenerateBuildConfig;
import com.huawei.ohos.build.tasks.GenerateClasses;
import com.huawei.ohos.build.tasks.GenerateDataBinding;
import com.huawei.ohos.build.tasks.GenerateJsBin;
import com.huawei.ohos.build.tasks.GenerateJsBinSource;
import com.huawei.ohos.build.tasks.GenerateJsManifest;
import com.huawei.ohos.build.tasks.GenerateResources;
import com.huawei.ohos.build.tasks.MergeJavaResource;
import com.huawei.ohos.build.tasks.MergeProfile;
import com.huawei.ohos.build.tasks.MergeProguardFiles;
import com.huawei.ohos.build.tasks.MergeProjectDex;
import com.huawei.ohos.build.tasks.MergeResources;
import com.huawei.ohos.build.tasks.ObfuscateWithProguard;
import com.huawei.ohos.build.tasks.PackageApp;
import com.huawei.ohos.build.tasks.PackageHap;
import com.huawei.ohos.build.tasks.PackageHar;
import com.huawei.ohos.build.tasks.PackageRClass;
import com.huawei.ohos.build.tasks.PreBuild;
import com.huawei.ohos.build.tasks.ProcessLibsFile;
import com.huawei.ohos.build.tasks.SignApp;
import com.huawei.ohos.build.tasks.SignHap;
import com.huawei.ohos.build.tasks.SignJsBin;
import com.huawei.ohos.build.tasks.SigningConfigReports;
import com.huawei.ohos.build.tasks.ValidateAppSign;
import com.huawei.ohos.build.tasks.ValidateSigning;
import com.huawei.ohos.build.tasks.manager.DependencyManager;
import com.huawei.ohos.build.tasks.manager.VariantManager;
import com.huawei.ohos.build.tasks.preview.BuildPreviewerResource;
import com.huawei.ohos.build.tasks.preview.CompileJsWithNodeJs;
import com.huawei.ohos.build.tasks.shell.CompileShellJavaWithJavac;
import com.huawei.ohos.build.tasks.shell.CompileShellResources;
import com.huawei.ohos.build.tasks.shell.GenerateShell;
import com.huawei.ohos.build.tasks.shell.LegacyReplace;
import com.huawei.ohos.build.tasks.shell.LinkShellResources;
import com.huawei.ohos.build.tasks.shell.MergeShellDex;
import com.huawei.ohos.build.tasks.shell.PackageShell;
import com.huawei.ohos.build.tasks.shell.PackageShellClass;
import com.huawei.ohos.build.tasks.shell.PackageSimplifyShell;
import com.huawei.ohos.build.tasks.shell.ProcessShellManifest;
import com.huawei.ohos.build.tasks.shell.SignShell;
import com.huawei.ohos.build.tasks.test.CompileTestJavac;
import com.huawei.ohos.build.tasks.test.CompileTestResources;
import com.huawei.ohos.build.tasks.test.PackageTestHap;
import com.huawei.ohos.build.tasks.test.SignTestHap;
import com.huawei.ohos.build.tasks.test.shell.GenerateTestShell;
import com.huawei.ohos.build.tasks.test.shell.PackageTestShell;
import com.huawei.ohos.build.tasks.test.shell.SignTestShell;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.internal.Pair;

public abstract class TaskManager implements GroovyObject {
  public static final String MAIN_PREBUILD = "preBuild";
  
  public static final String CLEAN = "clean";
  
  public static final String TASK_GROUP = "ohos";
  
  @Nonnull
  protected final SoftwareComponentFactory softwareComponentFactory;
  
  protected final Project project;
  
  protected final TaskContainer taskContainer;
  
  protected DependencyManager dependencyManager;
  
  protected SpecificTaskContainer specificTaskManager;
  
  protected Task preBuildTask;
  
  public TaskManager(Project project, DependencyManager dependencyManager, SoftwareComponentFactory softwareComponentFactory) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object = arrayOfCallSite[0].call(project);
    this.taskContainer = (TaskContainer)ScriptBytecodeAdapter.castToType(object, TaskContainer.class);
    DependencyManager dependencyManager1 = dependencyManager;
    this.dependencyManager = (DependencyManager)ScriptBytecodeAdapter.castToType(dependencyManager1, DependencyManager.class);
    SoftwareComponentFactory softwareComponentFactory1 = softwareComponentFactory;
    this.softwareComponentFactory = (SoftwareComponentFactory)ScriptBytecodeAdapter.castToType(softwareComponentFactory1, SoftwareComponentFactory.class);
  }
  
  public void createTaskBeforeEvaluate(VariantManager variantManager) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object object = arrayOfCallSite[1].call(this.taskContainer, MAIN_PREBUILD, PreBuild.class, variantManager);
    this.preBuildTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    arrayOfCallSite[2].call(this.preBuildTask, TASK_GROUP);
    arrayOfCallSite[3].call(this.preBuildTask, "Preparing for the build...");
  }
  
  protected Task createLegacyReplaceTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task legacyReplace = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(this.taskContainer, arrayOfCallSite[5].call(variantData, "replace", "legacy"), LegacyReplace.class, variantData), Task.class);
    arrayOfCallSite[6].call(legacyReplace, arrayOfCallSite[7].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(legacyReplace, "Replace legacy apk."), Task.class);
  }
  
  protected Task createAssembleTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task assemble = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].call(this.taskContainer, arrayOfCallSite[10].call(variantData, "assemble", ""), Assemble.class, variantData), Task.class);
    arrayOfCallSite[11].call(assemble, TASK_GROUP);
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[12].call(assemble, "Assemble the main output of this variant."), Task.class);
  }
  
  protected Task createPackageHapTask(VariantData variantData, Pair packModelPair) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageHap = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(arrayOfCallSite[14].callGroovyObjectGetProperty(variantData), arrayOfCallSite[15].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[16].call(this.taskContainer, arrayOfCallSite[17].call(variantData, "package", "hap"), PackageTestHap.class, variantData);
      packageHap = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[18].call(this.taskContainer, arrayOfCallSite[19].call(variantData, "package", "hap"), PackageHap.class, packModelPair);
      packageHap = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[20].call(packageHap, arrayOfCallSite[21].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[22].call(packageHap, "Build the HAP package."), Task.class);
  }
  
  protected Task createSignHapTask(VariantData variantData, Pair packModelPair) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task signHap = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[23].call(arrayOfCallSite[24].callGroovyObjectGetProperty(variantData), arrayOfCallSite[25].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[26].call(this.taskContainer, arrayOfCallSite[27].call(variantData, "sign", "hap"), SignTestHap.class, variantData);
      signHap = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[28].call(this.taskContainer, arrayOfCallSite[29].call(variantData, "sign", "hap"), SignHap.class, packModelPair);
      signHap = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[30].call(signHap, arrayOfCallSite[31].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[32].call(signHap, "Sign the HAP package."), Task.class);
  }
  
  protected Task createPackageHarTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageHar = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[33].call(this.taskContainer, arrayOfCallSite[34].call(variantData, "package", "har"), PackageHar.class, variantData), Task.class);
    arrayOfCallSite[35].call(packageHar, arrayOfCallSite[36].callGroovyObjectGetProperty(variantData));
    arrayOfCallSite[37].call(packageHar, "Build the HAR package.");
    return packageHar;
  }
  
  protected Task createMergeProjectDexTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeProjectDex = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[38].call(this.taskContainer, arrayOfCallSite[39].call(variantData, "merge", "projectDex"), MergeProjectDex.class, variantData), Task.class);
    arrayOfCallSite[40].call(mergeProjectDex, arrayOfCallSite[41].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].call(mergeProjectDex, "Process the compiled binary file."), Task.class);
  }
  
  protected Task createGenerateBuildConfigTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateBuildConfig = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[43].call(this.taskContainer, arrayOfCallSite[44].call(variantData, "generate", "buildConfig"), GenerateBuildConfig.class, variantData), Task.class);
    arrayOfCallSite[45].call(generateBuildConfig, arrayOfCallSite[46].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[47].call(generateBuildConfig, "Generate BuildConfig."), Task.class);
  }
  
  protected Task createGenerateDataBindingTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateBuildConfig = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[48].call(this.taskContainer, arrayOfCallSite[49].call(variantData, "generate", "dataBinding"), GenerateDataBinding.class, variantData), Task.class);
    arrayOfCallSite[50].call(generateBuildConfig, arrayOfCallSite[51].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[52].call(generateBuildConfig, "Generate BuildConfig."), Task.class);
  }
  
  protected Task createCompileIdlTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileIdl = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].call(this.taskContainer, arrayOfCallSite[54].call(variantData, "compile", "idl"), CompileIdl.class, variantData), Task.class);
    arrayOfCallSite[55].call(compileIdl, arrayOfCallSite[56].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[57].call(compileIdl, "Build the HarmonyOS interface definition file."), Task.class);
  }
  
  protected Task createCompileResourcesTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileResources = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[58].call(arrayOfCallSite[59].callGroovyObjectGetProperty(variantData), arrayOfCallSite[60].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[61].call(this.taskContainer, arrayOfCallSite[62].call(variantData, "compile", "resources"), CompileTestResources.class, variantData);
      compileResources = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[63].call(this.taskContainer, arrayOfCallSite[64].call(variantData, "compile", "resources"), CompileResources.class, variantData);
      compileResources = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[65].call(compileResources, arrayOfCallSite[66].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[67].call(compileResources, "Build HarmonyOS app resources."), Task.class);
  }
  
  protected Task createNativeWithCmakeTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileNativeWithCmake = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].call(this.taskContainer, arrayOfCallSite[69].call(variantData, "compile", "nativeWithCmake"), CompileNativeWithCmake.class, variantData), Task.class);
    arrayOfCallSite[70].call(compileNativeWithCmake, arrayOfCallSite[71].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].call(compileNativeWithCmake, "Use CMake to build native resources."), Task.class);
  }
  
  protected Task createProcessLibsFile(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task processLibsFile = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[73].call(this.taskContainer, arrayOfCallSite[74].call(variantData, "process", "libsFile"), ProcessLibsFile.class, variantData), Task.class);
    arrayOfCallSite[75].call(processLibsFile, arrayOfCallSite[76].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[77].call(processLibsFile, "Process libs files"), Task.class);
  }
  
  protected Task createCompileJavaWithJavacTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileJavaWithJavac = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[78].call(arrayOfCallSite[79].callGroovyObjectGetProperty(variantData), arrayOfCallSite[80].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[81].call(this.taskContainer, arrayOfCallSite[82].call(variantData, "compile", "javaWithJavac"), CompileTestJavac.class, variantData);
      compileJavaWithJavac = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[83].call(this.taskContainer, arrayOfCallSite[84].call(variantData, "compile", "javaWithJavac"), CompileJavaWithJavac.class, variantData);
      compileJavaWithJavac = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[85].call(compileJavaWithJavac, arrayOfCallSite[86].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[87].call(compileJavaWithJavac, "Build Java resources."), Task.class);
  }
  
  protected Task createMergeJavaResourceTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeJavaResource = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[88].call(this.taskContainer, arrayOfCallSite[89].call(variantData, "merge", "javaResource"), MergeJavaResource.class, variantData), Task.class);
    arrayOfCallSite[90].call(mergeJavaResource, arrayOfCallSite[91].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[92].call(mergeJavaResource, "Combine Java resources."), Task.class);
  }
  
  protected Task createGenerateShellTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateShellTask = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[93].call(arrayOfCallSite[94].callGroovyObjectGetProperty(variantData), arrayOfCallSite[95].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[96].call(this.taskContainer, arrayOfCallSite[97].call(variantData, "generate", "shell"), GenerateTestShell.class, variantData);
      generateShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[98].call(this.taskContainer, arrayOfCallSite[99].call(variantData, "generate", "shell"), GenerateShell.class, variantData);
      generateShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[100].call(generateShellTask, arrayOfCallSite[101].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[102].call(generateShellTask, "Generate a shell project from the HarmonyOS project."), Task.class);
  }
  
  protected Task createProcessShellManifest(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task processShellManifest = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[103].call(this.taskContainer, arrayOfCallSite[104].call(variantData, "process", "shellManifest"), ProcessShellManifest.class, variantData), Task.class);
    arrayOfCallSite[105].call(processShellManifest, arrayOfCallSite[106].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[107].call(processShellManifest, "Run the shell manifest file."), Task.class);
  }
  
  protected Task createMergeShellDex(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeShellDex = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[108].call(this.taskContainer, arrayOfCallSite[109].call(variantData, "merge", "shellDex"), MergeShellDex.class, variantData), Task.class);
    arrayOfCallSite[110].call(mergeShellDex, arrayOfCallSite[111].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[112].call(mergeShellDex, "process shell manifest."), Task.class);
  }
  
  protected Task createCompileShellJavaWithJavacTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task CompileShellJavaWithJavac = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[113].call(this.taskContainer, arrayOfCallSite[114].call(variantData, "compile", "shellJavaWithJavac"), CompileShellJavaWithJavac.class, variantData), Task.class);
    arrayOfCallSite[115].call(CompileShellJavaWithJavac, arrayOfCallSite[116].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[117].call(CompileShellJavaWithJavac, "Build shell java source code."), Task.class);
  }
  
  protected Task createPackageShellClass(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task PackageJavacOutput = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[118].call(this.taskContainer, arrayOfCallSite[119].call(variantData, "package", "shellClass"), PackageShellClass.class, variantData), Task.class);
    arrayOfCallSite[120].call(PackageJavacOutput, arrayOfCallSite[121].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[122].call(PackageJavacOutput, "package some class file."), Task.class);
  }
  
  protected Task createCompileShellResourcesTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileShellResources = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[123].call(this.taskContainer, arrayOfCallSite[124].call(variantData, "compile", "shellResources"), CompileShellResources.class, variantData), Task.class);
    arrayOfCallSite[125].call(compileShellResources, arrayOfCallSite[126].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[127].call(compileShellResources, "Build shell app resources."), Task.class);
  }
  
  protected Task createLinkShellResourcesTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task linkShellResources = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[128].call(this.taskContainer, arrayOfCallSite[129].call(variantData, "link", "shellResources"), LinkShellResources.class, variantData), Task.class);
    arrayOfCallSite[130].call(linkShellResources, arrayOfCallSite[131].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].call(linkShellResources, "Link shell resources."), Task.class);
  }
  
  protected Task createPackageShellTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageShellTask = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[133].call(arrayOfCallSite[134].callGroovyObjectGetProperty(variantData), arrayOfCallSite[135].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[136].call(this.taskContainer, arrayOfCallSite[137].call(variantData, "package", "shell"), PackageTestShell.class, variantData);
      packageShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[138].call(this.taskContainer, arrayOfCallSite[139].call(variantData, "package", "shell"), PackageShell.class, variantData);
      packageShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[140].call(packageShellTask, arrayOfCallSite[141].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[142].call(packageShellTask, "Pack output for shell."), Task.class);
  }
  
  protected Task createPackageSimplifyShellTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageSimplifyShellTask = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[143].call(this.taskContainer, arrayOfCallSite[144].call(variantData, "package", "simplifyShell"), PackageSimplifyShell.class, variantData), Task.class);
    arrayOfCallSite[145].call(packageSimplifyShellTask, arrayOfCallSite[146].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[147].call(packageSimplifyShellTask, "Package a output for the simplifyShell."), Task.class);
  }
  
  protected Task createSignShellTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task signShellTask = null;
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[148].call(arrayOfCallSite[149].callGroovyObjectGetProperty(variantData), arrayOfCallSite[150].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[151].call(this.taskContainer, arrayOfCallSite[152].call(variantData, "sign", "shell"), SignTestShell.class, variantData);
      signShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } else {
      Object object = arrayOfCallSite[153].call(this.taskContainer, arrayOfCallSite[154].call(variantData, "sign", "shell"), SignShell.class, variantData);
      signShellTask = (Task)ScriptBytecodeAdapter.castToType(object, Task.class);
    } 
    arrayOfCallSite[155].call(signShellTask, arrayOfCallSite[156].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[157].call(signShellTask, "Sign the shell APK."), Task.class);
  }
  
  protected Task createValidateSigningTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task validateSigning = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[158].call(this.taskContainer, arrayOfCallSite[159].call(variantData, "validate", "signing"), ValidateSigning.class, variantData), Task.class);
    arrayOfCallSite[160].call(validateSigning, arrayOfCallSite[161].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[162].call(validateSigning, "Verify the signature configuration."), Task.class);
  }
  
  protected Task createCompileRFileWithJavac(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileRFileWithJavac = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[163].call(this.taskContainer, arrayOfCallSite[164].call(variantData, "compile", "RFile"), CompileRFileWithJavac.class, variantData), Task.class);
    arrayOfCallSite[165].call(compileRFileWithJavac, arrayOfCallSite[166].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[167].call(compileRFileWithJavac, "Build all Java resources."), Task.class);
  }
  
  protected Task createPackageRClass(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageRClass = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[168].call(this.taskContainer, arrayOfCallSite[169].call(variantData, "package", "RClass"), PackageRClass.class, variantData), Task.class);
    arrayOfCallSite[170].call(packageRClass, arrayOfCallSite[171].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[172].call(packageRClass, "Package R.class"), Task.class);
  }
  
  protected Task createGenerateClasses(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateClasses = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[173].call(this.taskContainer, arrayOfCallSite[174].call(variantData, "generate", "classesJar"), GenerateClasses.class, variantData), Task.class);
    arrayOfCallSite[175].call(generateClasses, arrayOfCallSite[176].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[177].call(generateClasses, "Pack the class file to classes.jar."), Task.class);
  }
  
  protected Task createGenerateJsManifest(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateJsManifest = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[178].call(this.taskContainer, arrayOfCallSite[179].call(variantData, "generate", "jsManifest"), GenerateJsManifest.class, variantData), Task.class);
    arrayOfCallSite[180].call(generateJsManifest, arrayOfCallSite[181].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[182].call(generateJsManifest, "Generate a JS component list from the profile.json file."), Task.class);
  }
  
  protected Task createCompileJsWithNodeJs(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileJsWithNodeJs = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[183].call(this.taskContainer, arrayOfCallSite[184].call(variantData, "compile", "jsWithNodeJs"), CompileJsWithNodeJs.class, variantData), Task.class);
    arrayOfCallSite[185].call(compileJsWithNodeJs, arrayOfCallSite[186].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[187].call(compileJsWithNodeJs, "Start previewer."), Task.class);
  }
  
  protected Task createCompileJsWithNodeTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task compileJsWithNode = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[188].call(this.taskContainer, arrayOfCallSite[189].call(variantData, "compile", "jsWithNode"), CompileJsWithNode.class, variantData), Task.class);
    arrayOfCallSite[190].call(compileJsWithNode, arrayOfCallSite[191].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[192].call(compileJsWithNode, "Build JS components using Node.js."), Task.class);
  }
  
  protected Task createMergeResources(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeResources = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[193].call(this.taskContainer, arrayOfCallSite[194].call(variantData, "merge", "resources"), MergeResources.class, variantData), Task.class);
    arrayOfCallSite[195].call(mergeResources, arrayOfCallSite[196].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[197].call(mergeResources, "Integrate project resources."), Task.class);
  }
  
  protected Task createMergeProfile(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeProfile = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[198].call(this.taskContainer, arrayOfCallSite[199].call(variantData, "merge", "profile"), MergeProfile.class, variantData), Task.class);
    arrayOfCallSite[200].call(mergeProfile, arrayOfCallSite[201].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[202].call(mergeProfile, "Merge config.json files."), Task.class);
  }
  
  protected Task createValidateAppSign(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task validateAppSign = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[203].call(this.taskContainer, arrayOfCallSite[204].call(variantData, "validate", "appSigning"), ValidateAppSign.class, variantData), Task.class);
    arrayOfCallSite[205].call(validateAppSign, arrayOfCallSite[206].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[207].call(validateAppSign, "Verify the app signature configuration."), Task.class);
  }
  
  protected Task createPackageApp(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task packageApp = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[208].call(this.taskContainer, arrayOfCallSite[209].call(variantData, "package", "app"), PackageApp.class, variantData), Task.class);
    arrayOfCallSite[210].call(packageApp, arrayOfCallSite[211].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[212].call(packageApp, "Pack all HAP files into the app package."), Task.class);
  }
  
  protected Task createSignApp(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task signApp = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[213].call(this.taskContainer, arrayOfCallSite[214].call(variantData, "sign", "app"), SignApp.class, variantData), Task.class);
    arrayOfCallSite[215].call(signApp, arrayOfCallSite[216].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[217].call(signApp, "Sign the app."), Task.class);
  }
  
  protected Task createGenerateBinSource(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateJsBinSource = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[218].call(this.taskContainer, arrayOfCallSite[219].call(variantData, "generate", "binSource"), GenerateJsBinSource.class, variantData), Task.class);
    arrayOfCallSite[220].call(generateJsBinSource, arrayOfCallSite[221].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[222].call(generateJsBinSource, "Use Node.js to generate JS Bin files to the Source folder."), Task.class);
  }
  
  protected Task createGenerateJsBin(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateJsBin = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[223].call(this.taskContainer, arrayOfCallSite[224].call(variantData, "generate", "jsBin"), GenerateJsBin.class, variantData), Task.class);
    arrayOfCallSite[225].call(generateJsBin, arrayOfCallSite[226].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[227].call(generateJsBin, "Generate JS Bin files."), Task.class);
  }
  
  protected Task createSignJsBin(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task signJsBin = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[228].call(this.taskContainer, arrayOfCallSite[229].call(variantData, "sign", "jsBin"), SignJsBin.class, variantData), Task.class);
    arrayOfCallSite[230].call(signJsBin, arrayOfCallSite[231].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[232].call(signJsBin, "Sign JS Bin files."), Task.class);
  }
  
  protected Task createSigningConfigReports(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task signingConfigReports = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[233].call(this.taskContainer, arrayOfCallSite[234].call(variantData, "signingConfig", "reports"), SigningConfigReports.class, variantData), Task.class);
    arrayOfCallSite[235].call(signingConfigReports, arrayOfCallSite[236].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[237].call(signingConfigReports, "Report signingConfigs info."), Task.class);
  }
  
  protected Task createGenerateResources(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task generateResources = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[238].call(this.taskContainer, arrayOfCallSite[239].call(variantData, "generate", "resources"), GenerateResources.class, variantData), Task.class);
    arrayOfCallSite[240].call(generateResources, arrayOfCallSite[241].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[242].call(generateResources, "Generate resources."), Task.class);
  }
  
  protected Task createObfuscateWithProguardTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task obfuscateWithProguard = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[243].call(this.taskContainer, arrayOfCallSite[244].call(variantData, "obfuscate", "withProguard"), ObfuscateWithProguard.class, variantData), Task.class);
    arrayOfCallSite[245].call(obfuscateWithProguard, arrayOfCallSite[246].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[247].call(obfuscateWithProguard, "Obfuscate jar with Proguard."), Task.class);
  }
  
  protected Task createMergeProguardFileTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task mergeProguardFile = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[248].call(this.taskContainer, arrayOfCallSite[249].call(variantData, "merge", "proguardFile"), MergeProguardFiles.class, variantData), Task.class);
    arrayOfCallSite[250].call(mergeProguardFile, arrayOfCallSite[251].callGroovyObjectGetProperty(variantData));
    return (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[252].call(mergeProguardFile, "Merge proguard rules file from all resources."), Task.class);
  }
  
  protected void createBuildPreviewerResourceTask(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Task buildPreviewerResource = (Task)ScriptBytecodeAdapter.castToType(arrayOfCallSite[253].call(this.taskContainer, arrayOfCallSite[254].call(variantData, "build", "PreviewerResource"), BuildPreviewerResource.class, variantData), Task.class);
    arrayOfCallSite[255].call(buildPreviewerResource, arrayOfCallSite[256].callGroovyObjectGetProperty(variantData));
    arrayOfCallSite[257].call(buildPreviewerResource, "Prepare for preview.");
  }
  
  public abstract void createRichDeviceTasksForBuildType(VariantData paramVariantData);
  
  public abstract void createRichDeviceDepends(VariantData paramVariantData);
  
  public abstract void createLiteDeviceTasksForBuildType(VariantData paramVariantData);
  
  public abstract void createLiteDeviceDepends(VariantData paramVariantData);
  
  public void maybeCreateProguardTasks(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[258].callGetProperty(arrayOfCallSite[259].callGroovyObjectGetProperty(variantData)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[260].call(arrayOfCallSite[261].callGetProperty(arrayOfCallSite[262].callGroovyObjectGetProperty(variantData)))))) {
      arrayOfCallSite[263].callCurrent(this, variantData);
      arrayOfCallSite[264].callCurrent(this, variantData);
    } 
  }
  
  public void maybeCreateProguardDependsOn(VariantData variantData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[265].callGetProperty(arrayOfCallSite[266].callGroovyObjectGetProperty(variantData)), null) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[267].call(arrayOfCallSite[268].callGetProperty(arrayOfCallSite[269].callGroovyObjectGetProperty(variantData)))))) {
      arrayOfCallSite[270].call(arrayOfCallSite[271].call(this.specificTaskManager), this.preBuildTask);
      arrayOfCallSite[272]
        
        .call(arrayOfCallSite[273].call(arrayOfCallSite[274].call(this.specificTaskManager), arrayOfCallSite[275].call(this.specificTaskManager)), arrayOfCallSite[276].call(this.specificTaskManager));
    } 
  }
  
  @Generated
  @Internal
  public MetaClass getMetaClass() {
    if (this.metaClass != null)
      return this.metaClass; 
    this.metaClass = $getStaticMetaClass();
    return this.metaClass;
  }
  
  @Generated
  @Internal
  public void setMetaClass(MetaClass paramMetaClass) {
    this.metaClass = paramMetaClass;
  }
  
  @Generated
  @Internal
  public Object invokeMethod(String paramString, Object paramObject) {
    return getMetaClass().invokeMethod(this, paramString, paramObject);
  }
  
  @Generated
  @Internal
  public Object getProperty(String paramString) {
    return getMetaClass().getProperty(this, paramString);
  }
  
  @Generated
  @Internal
  public void setProperty(String paramString, Object paramObject) {
    getMetaClass().setProperty(this, paramString, paramObject);
  }
}
