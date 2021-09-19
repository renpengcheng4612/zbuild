package com.huawei.ohos.build.dsl;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import javax.inject.Inject;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.tasks.Input;

public class PseudoLocalization implements GroovyObject {
  @Input
  private boolean enabled;
  
  @Input
  private boolean pseudoAccent;
  
  @Input
  private boolean pseudoBorder;
  
  @Input
  private String pseudoRatio;
  
  @Input
  private String pseudoChars;
  
  @Inject
  public PseudoLocalization(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    boolean bool1 = true;
    this.pseudoAccent = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool1));
    boolean bool2 = true;
    this.pseudoBorder = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool2));
    String str1 = "";
    this.pseudoRatio = ShortTypeHandling.castToString(str1);
    String str2 = "ReÇÉÄßÑ¿ÃóèìжДﺥ";
    this.pseudoChars = ShortTypeHandling.castToString(str2);
  }
  
  public boolean getEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.enabled;
  }
  
  public boolean getPseudoAccent() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pseudoAccent;
  }
  
  public boolean getPseudoBorder() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pseudoBorder;
  }
  
  public String getPseudoRatio() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pseudoRatio;
  }
  
  public String getPseudoChars() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.pseudoChars;
  }
  
  public void setEnabled(boolean enabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = enabled;
    this.enabled = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public void setPseudoAccent(boolean pseudoAccent) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = pseudoAccent;
    this.pseudoAccent = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public void setPseudoBorder(boolean pseudoBorder) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    boolean bool = pseudoBorder;
    this.pseudoBorder = DefaultTypeTransformation.booleanUnbox(Boolean.valueOf(bool));
  }
  
  public void setPseudoRatio(String pseudoRatio) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = pseudoRatio;
    this.pseudoRatio = ShortTypeHandling.castToString(str);
  }
  
  public void setPseudoChars(String pseudoChars) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = pseudoChars;
    this.pseudoChars = ShortTypeHandling.castToString(str);
  }
}
