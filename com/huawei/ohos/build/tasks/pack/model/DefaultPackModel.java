package com.huawei.ohos.build.tasks.pack.model;

import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PackageInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.VariantData;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.OutputDirectory;

public class DefaultPackModel implements PackModel, GroovyObject {
  @Nonnull
  protected Project project;
  
  @Nonnull
  protected VariantData variantData;
  
  protected ConfigInfo configInfo;
  
  protected PathInfo pathInfo;
  
  protected SdkInfo sdkInfo;
  
  protected PackageInfo packageInfo;
  
  protected String packageType;
  
  @OutputDirectory
  protected File outputDir;
  
  protected String outputFileName;
  
  protected File outputFile;
  
  protected File packageTool;
  
  public DefaultPackModel(Project project, VariantData variantData) {
    Object object = null;
    this.packageTool = (File)ScriptBytecodeAdapter.castToType(object, File.class);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    VariantData variantData1 = variantData;
    this.variantData = (VariantData)ScriptBytecodeAdapter.castToType(variantData1, VariantData.class);
    Object object1 = arrayOfCallSite[0].callGroovyObjectGetProperty(variantData);
    this.configInfo = (ConfigInfo)ScriptBytecodeAdapter.castToType(object1, ConfigInfo.class);
    Object object2 = arrayOfCallSite[1].callGroovyObjectGetProperty(variantData);
    this.pathInfo = (PathInfo)ScriptBytecodeAdapter.castToType(object2, PathInfo.class);
    Object object3 = arrayOfCallSite[2].callGroovyObjectGetProperty(variantData);
    this.sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(object3, SdkInfo.class);
    Object object4 = arrayOfCallSite[3].callGroovyObjectGetProperty(variantData);
    this.packageInfo = (PackageInfo)ScriptBytecodeAdapter.castToType(object4, PackageInfo.class);
  }
  
  public Project getProject() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.project;
  }
  
  public VariantData getVariantData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantData;
  }
  
  public String getPackageType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageType;
  }
  
  public File getOutputDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.outputDir;
  }
  
  public String getOutputFileName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.outputFileName;
  }
  
  public File getOutputFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].callConstructor(File.class, this.outputDir, this.outputFileName), File.class);
  }
  
  public File getPackageTool() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packageTool;
  }
  
  public void populateOutputs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public FileCollection getHapFiles() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (FileCollection)ScriptBytecodeAdapter.castToType(null, FileCollection.class);
  }
}
