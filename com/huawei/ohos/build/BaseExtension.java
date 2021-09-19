package com.huawei.ohos.build;

import com.huawei.ohos.build.dsl.BuildTypeOptions;
import com.huawei.ohos.build.dsl.CompileOptions;
import com.huawei.ohos.build.dsl.DefaultConfigOptions;
import com.huawei.ohos.build.dsl.DexOptions;
import com.huawei.ohos.build.dsl.ExternalNativeBuild;
import com.huawei.ohos.build.dsl.IdlToolOptions;
import com.huawei.ohos.build.dsl.PackingToolOptions;
import com.huawei.ohos.build.dsl.RestoolOptions;
import com.huawei.ohos.build.dsl.ShellPackingOptions;
import com.huawei.ohos.build.dsl.SigningConfigOptions;
import com.huawei.ohos.build.dsl.variant.VariantFilter;
import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.SigningConfig;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;

public class BaseExtension implements HarmonyConfig, GroovyObject {
  protected Project project;
  
  private int compileSdkVersion;
  
  private String consoleLogCharset;
  
  private String entryModules;
  
  private CompileOptions compileOptions;
  
  private DefaultConfigOptions defaultConfig;
  
  private DexOptions dexOptions;
  
  private PackingToolOptions packingToolOptions;
  
  private RestoolOptions restoolOptions;
  
  private IdlToolOptions idlToolOptions;
  
  private ShellPackingOptions shellPackingOptions;
  
  private String packageVersion;
  
  private ExternalNativeBuild externalNativeBuild;
  
  private NamedDomainObjectContainer<SigningConfigOptions> signingConfigs;
  
  private NamedDomainObjectContainer<BuildTypeOptions> buildTypes;
  
  private NamedDomainObjectContainer<VariantFlavorOptions> variantFlavors;
  
  private Set<String> flavorDimensions;
  
  private Action<VariantFilter> variantFilter;
  
  public BaseExtension(Project project, NamedDomainObjectContainer buildTypeContainer, NamedDomainObjectContainer variantFlavorContainer, NamedDomainObjectContainer signingConfigContainer) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    ObjectFactory objectFactory = (ObjectFactory)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(project), ObjectFactory.class);
    Object object1 = arrayOfCallSite[1].call(objectFactory, CompileOptions.class, project);
    this.compileOptions = (CompileOptions)ScriptBytecodeAdapter.castToType(object1, CompileOptions.class);
    Object object2 = arrayOfCallSite[2].call(objectFactory, DefaultConfigOptions.class, project);
    this.defaultConfig = (DefaultConfigOptions)ScriptBytecodeAdapter.castToType(object2, DefaultConfigOptions.class);
    Object object3 = arrayOfCallSite[3].call(objectFactory, DexOptions.class, project);
    this.dexOptions = (DexOptions)ScriptBytecodeAdapter.castToType(object3, DexOptions.class);
    Object object4 = arrayOfCallSite[4].call(objectFactory, PackingToolOptions.class, project);
    this.packingToolOptions = (PackingToolOptions)ScriptBytecodeAdapter.castToType(object4, PackingToolOptions.class);
    Object object5 = arrayOfCallSite[5].call(objectFactory, RestoolOptions.class, project);
    this.restoolOptions = (RestoolOptions)ScriptBytecodeAdapter.castToType(object5, RestoolOptions.class);
    Object object6 = arrayOfCallSite[6].call(objectFactory, IdlToolOptions.class, project);
    this.idlToolOptions = (IdlToolOptions)ScriptBytecodeAdapter.castToType(object6, IdlToolOptions.class);
    Object object7 = arrayOfCallSite[7].call(objectFactory, ShellPackingOptions.class, project);
    this.shellPackingOptions = (ShellPackingOptions)ScriptBytecodeAdapter.castToType(object7, ShellPackingOptions.class);
    Object object8 = arrayOfCallSite[8].call(objectFactory, ExternalNativeBuild.class, project);
    this.externalNativeBuild = (ExternalNativeBuild)ScriptBytecodeAdapter.castToType(object8, ExternalNativeBuild.class);
    NamedDomainObjectContainer namedDomainObjectContainer1 = buildTypeContainer;
    this.buildTypes = (NamedDomainObjectContainer<BuildTypeOptions>)ScriptBytecodeAdapter.castToType(namedDomainObjectContainer1, NamedDomainObjectContainer.class);
    NamedDomainObjectContainer namedDomainObjectContainer2 = signingConfigContainer;
    this.signingConfigs = (NamedDomainObjectContainer<SigningConfigOptions>)ScriptBytecodeAdapter.castToType(namedDomainObjectContainer2, NamedDomainObjectContainer.class);
    NamedDomainObjectContainer namedDomainObjectContainer3 = variantFlavorContainer;
    this.variantFlavors = (NamedDomainObjectContainer<VariantFlavorOptions>)ScriptBytecodeAdapter.castToType(namedDomainObjectContainer3, NamedDomainObjectContainer.class);
    Object object9 = arrayOfCallSite[9].callConstructor(LinkedHashSet.class);
    this.flavorDimensions = (Set<String>)ScriptBytecodeAdapter.castToType(object9, Set.class);
  }
  
  public void buildTypes(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[10].call(action, this.buildTypes);
  }
  
  public void compileOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[11].call(action, this.compileOptions);
  }
  
  public void defaultConfig(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[12].call(action, this.defaultConfig);
  }
  
  public void dexOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[13].call(action, this.dexOptions);
  }
  
  public void packingToolOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[14].call(action, this.packingToolOptions);
  }
  
  public void restoolOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[15].call(action, this.restoolOptions);
  }
  
  public void idlToolOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[16].call(action, this.idlToolOptions);
  }
  
  public void shellPackingOptions(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[17].call(action, this.shellPackingOptions);
  }
  
  public void signingConfigs(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[18].call(action, this.signingConfigs);
  }
  
  public void externalNativeBuild(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[19].call(action, this.externalNativeBuild);
  }
  
  public void variantFlavors(Action action) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[20].call(action, this.variantFlavors);
  }
  
  public void flavorDimensions(String... dimensions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[21].call(this.flavorDimensions);
    arrayOfCallSite[22].call(this.flavorDimensions, dimensions);
  }
  
  public void variantFilter(Action<VariantFilter> filter) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Action<VariantFilter> action = filter;
  }
  
  public String getPackageVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageVersion;
  }
  
  public int getCompileSdkVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileSdkVersion;
  }
  
  public String getConsoleLogCharset() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.consoleLogCharset;
  }
  
  public CompileOptions getCompileOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.compileOptions;
  }
  
  public DefaultConfigOptions getDefaultConfig() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.defaultConfig;
  }
  
  public DexOptions getDexOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.dexOptions;
  }
  
  public PackingToolOptions getPackingToolOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packingToolOptions;
  }
  
  public RestoolOptions getRestoolOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.restoolOptions;
  }
  
  public IdlToolOptions getIdlToolOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.idlToolOptions;
  }
  
  public ShellPackingOptions getShellPackingOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shellPackingOptions;
  }
  
  public Collection<? extends SigningConfig> getSigningConfigs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection)this.signingConfigs;
  }
  
  public Collection<? extends BuildType> getBuildTypes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Collection)this.buildTypes;
  }
  
  public ExternalNativeBuild getExternalNativeBuild() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.externalNativeBuild;
  }
  
  public String getEntryModules() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.entryModules;
  }
  
  public Set<String> getFlavorDimensions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.flavorDimensions;
  }
  
  public Action<VariantFilter> getVariantFilter() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantFilter;
  }
  
  @Generated
  public void setCompileSdkVersion(int paramInt) {
    this.compileSdkVersion = paramInt;
  }
  
  @Generated
  public void setConsoleLogCharset(String paramString) {
    this.consoleLogCharset = paramString;
  }
  
  @Generated
  public void setEntryModules(String paramString) {
    this.entryModules = paramString;
  }
  
  @Generated
  public void setCompileOptions(CompileOptions paramCompileOptions) {
    this.compileOptions = paramCompileOptions;
  }
  
  @Generated
  public void setDefaultConfig(DefaultConfigOptions paramDefaultConfigOptions) {
    this.defaultConfig = paramDefaultConfigOptions;
  }
  
  @Generated
  public void setDexOptions(DexOptions paramDexOptions) {
    this.dexOptions = paramDexOptions;
  }
  
  @Generated
  public void setPackingToolOptions(PackingToolOptions paramPackingToolOptions) {
    this.packingToolOptions = paramPackingToolOptions;
  }
  
  @Generated
  public void setRestoolOptions(RestoolOptions paramRestoolOptions) {
    this.restoolOptions = paramRestoolOptions;
  }
  
  @Generated
  public void setIdlToolOptions(IdlToolOptions paramIdlToolOptions) {
    this.idlToolOptions = paramIdlToolOptions;
  }
  
  @Generated
  public void setShellPackingOptions(ShellPackingOptions paramShellPackingOptions) {
    this.shellPackingOptions = paramShellPackingOptions;
  }
  
  @Generated
  public void setPackageVersion(String paramString) {
    this.packageVersion = paramString;
  }
  
  @Generated
  public void setExternalNativeBuild(ExternalNativeBuild paramExternalNativeBuild) {
    this.externalNativeBuild = paramExternalNativeBuild;
  }
  
  @Generated
  public void setSigningConfigs(NamedDomainObjectContainer<SigningConfigOptions> paramNamedDomainObjectContainer) {
    this.signingConfigs = paramNamedDomainObjectContainer;
  }
  
  @Generated
  public void setBuildTypes(NamedDomainObjectContainer<BuildTypeOptions> paramNamedDomainObjectContainer) {
    this.buildTypes = paramNamedDomainObjectContainer;
  }
  
  @Generated
  public NamedDomainObjectContainer<VariantFlavorOptions> getVariantFlavors() {
    return this.variantFlavors;
  }
  
  @Generated
  public void setVariantFlavors(NamedDomainObjectContainer<VariantFlavorOptions> paramNamedDomainObjectContainer) {
    this.variantFlavors = paramNamedDomainObjectContainer;
  }
  
  @Generated
  public void setFlavorDimensions(Set<String> paramSet) {
    this.flavorDimensions = paramSet;
  }
  
  @Generated
  public void setVariantFilter(Action<VariantFilter> paramAction) {
    this.variantFilter = paramAction;
  }
}
