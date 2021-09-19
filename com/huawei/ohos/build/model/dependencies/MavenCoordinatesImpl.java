package com.huawei.ohos.build.model.dependencies;

import com.huawei.ohos.build.consts.BuildConst;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.artifacts.ResolvedArtifact;

public class MavenCoordinatesImpl implements MavenCoordinates, GroovyObject {
  private final String groupId;
  
  private final String artifactId;
  
  private final String version;
  
  private final String packaging;
  
  private final String classifier;
  
  public MavenCoordinatesImpl(@Nonnull ResolvedArtifact resolvedArtifact) {
    this(ShortTypeHandling.castToString(arrayOfCallSite[0].call(arrayOfCallSite[1].call(arrayOfCallSite[2].call(resolvedArtifact)))), ShortTypeHandling.castToString(arrayOfCallSite[3].call(arrayOfCallSite[4].call(arrayOfCallSite[5].call(resolvedArtifact)))), ShortTypeHandling.castToString(arrayOfCallSite[6].call(arrayOfCallSite[7].call(arrayOfCallSite[8].call(resolvedArtifact)))), ShortTypeHandling.castToString(arrayOfCallSite[9].call(resolvedArtifact)), ShortTypeHandling.castToString(arrayOfCallSite[10].call(resolvedArtifact)));
  }
  
  public MavenCoordinatesImpl(String groupId, String artifactId, String version) {
    this(groupId, artifactId, version, null, null);
  }
  
  public MavenCoordinatesImpl(String groupId, String artifactId, String version, String packaging, String classifier) {
    MetaClass metaClass = $getStaticMetaClass();
    String str1 = groupId;
    this.groupId = ShortTypeHandling.castToString(str1);
    String str2 = artifactId;
    this.artifactId = ShortTypeHandling.castToString(str2);
    String str3 = version;
    this.version = ShortTypeHandling.castToString(str3);
    Object object = ScriptBytecodeAdapter.compareNotEqual(packaging, null) ? packaging : arrayOfCallSite[11].callGetProperty(BuildConst.class);
    this.packaging = ShortTypeHandling.castToString(object);
    String str4 = classifier;
    this.classifier = ShortTypeHandling.castToString(str4);
  }
  
  public String getGroupId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.groupId;
  }
  
  public String getArtifactId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.artifactId;
  }
  
  public String getVersion() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.version;
  }
  
  public String getPackaging() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.packaging;
  }
  
  public String getClassifier() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.classifier;
  }
  
  public boolean equals(Object obj) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(obj, this))
      return true; 
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(obj, null) || ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[14].callCurrent(this), arrayOfCallSite[15].call(obj))))
        return false; 
    } else if ((ScriptBytecodeAdapter.compareEqual(obj, null) || ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[12].callCurrent(this), arrayOfCallSite[13].call(obj)))) {
      return false;
    } 
    if (!(obj instanceof MavenCoordinatesImpl))
      return false; 
    MavenCoordinatesImpl that = (MavenCoordinatesImpl)ScriptBytecodeAdapter.castToType(obj, MavenCoordinatesImpl.class);
    return (((((((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[16].call(Objects.class, this.groupId, arrayOfCallSite[17].callGroovyObjectGetProperty(that))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[18].call(Objects.class, this.artifactId, arrayOfCallSite[19].callGroovyObjectGetProperty(that))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[20].call(Objects.class, this.version, arrayOfCallSite[21].callGroovyObjectGetProperty(that))))) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[22].call(Objects.class, this.packaging, arrayOfCallSite[23].callGroovyObjectGetProperty(that))))) && 
      DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(Objects.class, this.classifier, arrayOfCallSite[25].callGroovyObjectGetProperty(that))));
  }
  
  public int hashCode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int result = 0;
    Object object1 = ScriptBytecodeAdapter.compareNotEqual(this.groupId, null) ? arrayOfCallSite[26].call(this.groupId) : Integer.valueOf(0);
    result = DefaultTypeTransformation.intUnbox(object1);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[30].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareNotEqual(this.artifactId, null) ? arrayOfCallSite[31].call(this.artifactId) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } else {
      Object object = arrayOfCallSite[27].call(arrayOfCallSite[28].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareNotEqual(this.artifactId, null) ? arrayOfCallSite[29].call(this.artifactId) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[35].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareNotEqual(this.version, null) ? arrayOfCallSite[36].call(this.version) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } else {
      Object object = arrayOfCallSite[32].call(arrayOfCallSite[33].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareNotEqual(this.version, null) ? arrayOfCallSite[34].call(this.version) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[40].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareNotEqual(this.packaging, null) ? arrayOfCallSite[41].call(this.packaging) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } else {
      Object object = arrayOfCallSite[37].call(arrayOfCallSite[38].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareNotEqual(this.packaging, null) ? arrayOfCallSite[39].call(this.packaging) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object = arrayOfCallSite[45].call(Integer.valueOf(31 * result), ScriptBytecodeAdapter.compareNotEqual(this.classifier, null) ? arrayOfCallSite[46].call(this.classifier) : Integer.valueOf(0));
      result = DefaultTypeTransformation.intUnbox(object);
      return result;
    } 
    Object object2 = arrayOfCallSite[42].call(arrayOfCallSite[43].call(Integer.valueOf(31), Integer.valueOf(result)), ScriptBytecodeAdapter.compareNotEqual(this.classifier, null) ? arrayOfCallSite[44].call(this.classifier) : Integer.valueOf(0));
    result = DefaultTypeTransformation.intUnbox(object2);
    return result;
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[47].call(arrayOfCallSite[48].call(arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call(arrayOfCallSite[53].callConstructor(StringJoiner.class, ",", arrayOfCallSite[54].call(arrayOfCallSite[55].callGetProperty(MavenCoordinatesImpl.class), "["), "]"), arrayOfCallSite[56].call("groupId:", this.groupId)), arrayOfCallSite[57].call("artifactId:", this.artifactId)), arrayOfCallSite[58].call("version:", this.version)), arrayOfCallSite[59].call("packaging:", this.packaging)), arrayOfCallSite[60].call("classifier:", this.classifier))));
  }
}
