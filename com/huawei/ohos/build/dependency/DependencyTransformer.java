package com.huawei.ohos.build.dependency;

import com.huawei.ohos.build.data.GlobalDataManager;
import com.huawei.ohos.build.data.SdkInfo;
import com.huawei.ohos.build.model.transform.HarmonyArtifacts;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;
import org.gradle.api.attributes.Attribute;

public class DependencyTransformer implements GroovyObject {
  private Project project;
  
  private final Object artifactType;
  
  public DependencyTransformer(Project project) {
    Object object = arrayOfCallSite[0].call(Attribute.class, "artifactType", String.class);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public void registerAll() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference dependencies = new Reference(arrayOfCallSite[1].callGetProperty(this.project));
    SdkInfo sdkInfo = (SdkInfo)ScriptBytecodeAdapter.castToType(arrayOfCallSite[2].call(arrayOfCallSite[3].call(GlobalDataManager.class, this.project), this.project), SdkInfo.class);
    Reference unpackingToolPath = new Reference(arrayOfCallSite[4].call(sdkInfo));
    Reference charset = new Reference("");
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[5].callGetProperty(arrayOfCallSite[6].callGetProperty(this.project)), null)) {
      Object object = arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(this.project));
      charset.set(ShortTypeHandling.castToString(object));
    } 
    arrayOfCallSite[9].call(dependencies.get(), TagTransform.class, new _registerAll_closure1(this, this));
    arrayOfCallSite[10].call(dependencies.get(), ExtractHarTransform.class, new _registerAll_closure2(this, this, unpackingToolPath, charset));
    arrayOfCallSite[11].call(arrayOfCallSite[12].callGetProperty(HarContentTransform.class), new _registerAll_closure3(this, this, dependencies));
    arrayOfCallSite[13].call(arrayOfCallSite[14].callGetProperty(HarLibsContentTransform.class), new _registerAll_closure4(this, this, dependencies));
    arrayOfCallSite[15].call(dependencies.get(), TagTransform.class, new _registerAll_closure5(this, this));
    arrayOfCallSite[16].call(dependencies.get(), TagTransform.class, new _registerAll_closure6(this, this));
  }
  
  public final class _registerAll_closure1 extends Closure implements GeneratedClosure {
    public _registerAll_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
      return arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(it), arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _registerAll_closure2 extends Closure implements GeneratedClosure {
    public _registerAll_closure2(Object _outerInstance, Object _thisObject, Reference unpackingToolPath, Reference charset) {
      super(_outerInstance, _thisObject);
      Reference reference1 = unpackingToolPath;
      this.unpackingToolPath = reference1;
      Reference reference2 = charset;
      this.charset = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(it)), this.unpackingToolPath.get());
      arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].callGetProperty(it)), this.charset.get());
      arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(it), arrayOfCallSite[8].callGroovyObjectGetProperty(this), arrayOfCallSite[9].call(arrayOfCallSite[10].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
      return arrayOfCallSite[11].call(arrayOfCallSite[12].callGetProperty(it), arrayOfCallSite[13].callGroovyObjectGetProperty(this), arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    }
    
    @Generated
    public Object getUnpackingToolPath() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.unpackingToolPath.get();
    }
    
    @Generated
    public String getCharset() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.charset.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _registerAll_closure3 extends Closure implements GeneratedClosure {
    public _registerAll_closure3(Object _outerInstance, Object _thisObject, Reference dependencies) {
      super(_outerInstance, _thisObject);
      Reference reference = dependencies;
      this.dependencies = reference;
    }
    
    public Object doCall(Object content) {
      Reference reference = new Reference(content);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.dependencies.get(), HarContentTransform.class, new _closure7(this, getThisObject(), reference));
    }
    
    @Generated
    public Object getDependencies() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.dependencies.get();
    }
    
    public final class _closure7 extends Closure implements GeneratedClosure {
      public _closure7(Object _outerInstance, Object _thisObject, Reference content) {
        super(_outerInstance, _thisObject);
        Reference reference = content;
        this.content = reference;
      }
      
      public Object doCall(Object spec) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(spec)), this.content.get());
        arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(spec), arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
        return arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(spec), arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].call(this.content.get()));
      }
      
      @Generated
      public Object getContent() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.content.get();
      }
    }
  }
  
  public final class _registerAll_closure4 extends Closure implements GeneratedClosure {
    public _registerAll_closure4(Object _outerInstance, Object _thisObject, Reference dependencies) {
      super(_outerInstance, _thisObject);
      Reference reference = dependencies;
      this.dependencies = reference;
    }
    
    public Object doCall(Object content) {
      Reference reference = new Reference(content);
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.dependencies.get(), HarLibsContentTransform.class, new _closure8(this, getThisObject(), reference));
    }
    
    @Generated
    public Object getDependencies() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.dependencies.get();
    }
    
    public final class _closure8 extends Closure implements GeneratedClosure {
      public _closure8(Object _outerInstance, Object _thisObject, Reference content) {
        super(_outerInstance, _thisObject);
        Reference reference = content;
        this.content = reference;
      }
      
      public Object doCall(Object spec) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].callGetProperty(spec)), this.content.get());
        arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(spec), arrayOfCallSite[5].callGroovyObjectGetProperty(this), arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
        return arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(spec), arrayOfCallSite[10].callGroovyObjectGetProperty(this), arrayOfCallSite[11].call(this.content.get()));
      }
      
      @Generated
      public Object getContent() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return this.content.get();
      }
    }
  }
  
  public final class _registerAll_closure5 extends Closure implements GeneratedClosure {
    public _registerAll_closure5(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
      return arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(it), arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public final class _registerAll_closure6 extends Closure implements GeneratedClosure {
    public _registerAll_closure6(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it), arrayOfCallSite[2].callGroovyObjectGetProperty(this), arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
      return arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(it), arrayOfCallSite[7].callGroovyObjectGetProperty(this), arrayOfCallSite[8].call(arrayOfCallSite[9].callGetProperty(HarmonyArtifacts.ArtifactType.class)));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
