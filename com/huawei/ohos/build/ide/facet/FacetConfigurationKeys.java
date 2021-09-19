package com.huawei.ohos.build.ide.facet;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class FacetConfigurationKeys implements GroovyObject {
  public static final String FACET_CONF_MODULE_TYPE_KEY = "MODULE_TYPE";
  
  public static final String FACET_CONF_DEBUGGABLE_KEY = "DEBUGGABLE";
  
  @Deprecated
  public static final String FACET_CONF_HAP_OUTPUT_FOLDER_PATH = "HAP_OUTPUT_FOLDER_PATH";
  
  public static final String FACET_CONF_INSTALLATION_FREE = "INSTALLATION_FREE";
  
  @Deprecated
  public static final String FACET_CONF_PREVIEW_EXECUTE_TASK_NAME = "PREVIEW_EXECUTE_TASK_NAME";
  
  public static final String FACET_CONF_JS_DIR_PATH = "JS_SOURCE_DIR_PATH";
  
  public static final String FACET_CONF_SUPERVISUAL_DIR_PATH = "SUPERVISUAL_SOURCE_DIR_PATH";
  
  @Deprecated
  public static final String FACET_CONF_JS_MANIFEST_PATH = "JS_MANIFEST_PATH";
  
  public static final String FACET_CONF_MERGE_JS_SRC = "MERGE_JS_SRC";
  
  @Generated
  public FacetConfigurationKeys() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
