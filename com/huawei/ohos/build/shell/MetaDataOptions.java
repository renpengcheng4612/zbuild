package com.huawei.ohos.build.shell;

import com.huawei.ohos.build.shell.metadata.CustomizeDataOptions;
import com.huawei.ohos.build.shell.metadata.ParametersOptions;
import com.huawei.ohos.build.shell.metadata.ResultsOptions;
import groovy.lang.MetaClass;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class MetaDataOptions extends Transform2Node {
  public List<ParametersOptions> parameters;
  
  public List<ResultsOptions> results;
  
  public List<CustomizeDataOptions> customizeData;
  
  public MetaDataOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public List<ParametersOptions> getParameters() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.parameters;
  }
  
  public void setParameters(List parameters) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = parameters;
    this.parameters = (List<ParametersOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<ResultsOptions> getResults() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.results;
  }
  
  public void setResults(List results) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = results;
    this.results = (List<ResultsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<CustomizeDataOptions> getCustomizeData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.customizeData;
  }
  
  public void setCustomizeData(List customizeData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = customizeData;
    this.customizeData = (List<CustomizeDataOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(null);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return false;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
}
