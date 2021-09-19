package com.huawei.ohos.build.model.variant;

import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSet;
import com.huawei.ohos.build.utils.configJson.ClassField;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.internal.impldep.org.eclipse.jgit.annotations.NonNull;

public class VariantCombination implements GroovyObject {
  @NonNull
  private BuildType buildType;
  
  private String variantName;
  
  private String flavorsName;
  
  private List<VariantFlavor> flavors;
  
  private VariantFlavorOptions mergedFlavor;
  
  private String variantType;
  
  private List<OhosSourceSet> sources;
  
  public VariantCombination(@NonNull BuildType buildType, List flavors, String variantType) {
    Object object1 = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.sources = (List<OhosSourceSet>)ScriptBytecodeAdapter.castToType(object1, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    BuildType buildType1 = buildType;
    this.buildType = (BuildType)ScriptBytecodeAdapter.castToType(buildType1, BuildType.class);
    List list = flavors;
    this.flavors = (List<VariantFlavor>)ScriptBytecodeAdapter.castToType(list, List.class);
    String str = variantType;
    this.variantType = ShortTypeHandling.castToString(str);
    Object object2 = arrayOfCallSite[1].callConstructor(VariantFlavorOptions.class, "defaultFlavor");
    this.mergedFlavor = (VariantFlavorOptions)ScriptBytecodeAdapter.castToType(object2, VariantFlavorOptions.class);
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      mergeFlavors();
      null;
    } else {
      arrayOfCallSite[2].callCurrent(this);
    } 
    if (!BytecodeInterface8.disabledStandardMetaClass()) {
      computeNames();
      null;
      return;
    } 
    arrayOfCallSite[3].callCurrent(this);
  }
  
  public void addSource(OhosSourceSet s) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[4].call(this.sources, s);
  }
  
  public Set<OhosSourceSet> getDimensionalSources() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (Set<OhosSourceSet>)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].call(arrayOfCallSite[6].call(this.sources, new _getDimensionalSources_closure1(this, this))), Set.class);
  }
  
  public final class _getDimensionalSources_closure1 extends Closure implements GeneratedClosure {
    public _getDimensionalSources_closure1(Object _outerInstance, Object _thisObject) {
      super(_outerInstance, _thisObject);
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return Boolean.valueOf(ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].callGetProperty(it), arrayOfCallSite[1].callGroovyObjectGetProperty(getThisObject())));
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public List<OhosSourceSet> getSources() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.sources;
  }
  
  public String getVariantName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.variantName;
  }
  
  public String getFlavorsName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.flavorsName;
  }
  
  public void computeNames() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    StringBuffer buffer = (StringBuffer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[7].callConstructor(StringBuffer.class), StringBuffer.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(this.flavors, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[18].call(this.flavors), Integer.valueOf(0))))
        for (int i = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[19].call(this.flavors)); ) {
          if ((i == 0)) {
            arrayOfCallSite[20].call(buffer, arrayOfCallSite[21].call(arrayOfCallSite[22].call(this.flavors, Integer.valueOf(i))));
          } else {
            arrayOfCallSite[23].call(buffer, arrayOfCallSite[24].call(arrayOfCallSite[25].call(arrayOfCallSite[26].call(this.flavors, Integer.valueOf(i)))));
          } 
          int j;
          i = (j = i) + 1;
        }  
    } else if ((ScriptBytecodeAdapter.compareNotEqual(this.flavors, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[8].call(this.flavors), Integer.valueOf(0)))) {
      for (int i = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), arrayOfCallSite[9].call(this.flavors)); ) {
        if ((i == 0)) {
          arrayOfCallSite[10].call(buffer, arrayOfCallSite[11].call(arrayOfCallSite[12].call(this.flavors, Integer.valueOf(i))));
        } else {
          arrayOfCallSite[13].call(buffer, arrayOfCallSite[14].call(arrayOfCallSite[15].call(arrayOfCallSite[16].call(this.flavors, Integer.valueOf(i)))));
        } 
        int j;
        i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[17].call(Integer.valueOf(j = i)));
        arrayOfCallSite[17].call(Integer.valueOf(j = i));
      } 
    } 
    Object object1 = arrayOfCallSite[27].call(buffer);
    this.flavorsName = ShortTypeHandling.castToString(object1);
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[28].call(buffer), "")) {
      arrayOfCallSite[29].call(buffer, arrayOfCallSite[30].call(arrayOfCallSite[31].callGetProperty(this.buildType)));
    } else {
      arrayOfCallSite[32].call(buffer, arrayOfCallSite[33].callGetProperty(this.buildType));
    } 
    if (ScriptBytecodeAdapter.compareEqual(this.variantType, arrayOfCallSite[34].callGetProperty(VariantModel.class)))
      arrayOfCallSite[35].call(buffer, arrayOfCallSite[36].call(arrayOfCallSite[37].callGetProperty(OhosSourceSet.class))); 
    if (ScriptBytecodeAdapter.compareEqual(this.variantType, arrayOfCallSite[38].callGetProperty(VariantModel.class)))
      arrayOfCallSite[39].call(buffer, arrayOfCallSite[40].call(arrayOfCallSite[41].callGetProperty(OhosSourceSet.class))); 
    Object object2 = arrayOfCallSite[42].call(buffer);
    this.variantName = ShortTypeHandling.castToString(object2);
  }
  
  public void mergeFlavors() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(this.flavors, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[44].call(this.flavors), Integer.valueOf(0))))
        return; 
    } else if ((ScriptBytecodeAdapter.compareEqual(this.flavors, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[43].call(this.flavors), Integer.valueOf(0)))) {
      return;
    } 
    if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[45].call(this.flavors), Integer.valueOf(1))) {
      VariantFlavorOptions variantFlavorOptions = (VariantFlavorOptions)ScriptBytecodeAdapter.asType(arrayOfCallSite[46].call(this.flavors, Integer.valueOf(0)), VariantFlavorOptions.class);
      return;
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[85].call(arrayOfCallSite[86].call(this.flavors), Integer.valueOf(1))); (j >= 0); ) {
        arrayOfCallSite[87]
          .call(this.mergedFlavor, arrayOfCallSite[88].callStatic(VariantCombination.class, arrayOfCallSite[89].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[90].callGetProperty(arrayOfCallSite[91].call(this.flavors, Integer.valueOf(j)))));
        arrayOfCallSite[92]
          .call(this.mergedFlavor, arrayOfCallSite[93].callStatic(VariantCombination.class, arrayOfCallSite[94].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[95].callGetProperty(arrayOfCallSite[96].call(this.flavors, Integer.valueOf(j)))));
        arrayOfCallSite[97].call(this.mergedFlavor, arrayOfCallSite[98].callStatic(VariantCombination.class, arrayOfCallSite[99].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[100].callGetProperty(arrayOfCallSite[101].call(this.flavors, Integer.valueOf(j)))));
        arrayOfCallSite[102].call(this.mergedFlavor, arrayOfCallSite[103].callStatic(VariantCombination.class, arrayOfCallSite[104].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[105].callGetProperty(arrayOfCallSite[106].call(this.flavors, Integer.valueOf(j)))));
        if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[107].callGroovyObjectGetProperty(this.mergedFlavor), null)) {
          arrayOfCallSite[108].call(this.mergedFlavor, arrayOfCallSite[109].callGetProperty(arrayOfCallSite[110].call(this.flavors, Integer.valueOf(j))));
        } else {
          arrayOfCallSite[111].call(arrayOfCallSite[112].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[113].callGetProperty(arrayOfCallSite[114].call(this.flavors, Integer.valueOf(j))));
          arrayOfCallSite[115].call(this.mergedFlavor, arrayOfCallSite[116].callGroovyObjectGetProperty(this.mergedFlavor));
        } 
        arrayOfCallSite[117].call(this.mergedFlavor, arrayOfCallSite[118].callStatic(VariantCombination.class, arrayOfCallSite[119].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[120].callGetProperty(arrayOfCallSite[121].call(this.flavors, Integer.valueOf(j)))));
        int k;
        j = (k = j) - 1;
      } 
      return;
    } 
    for (int i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[47].call(arrayOfCallSite[48].call(this.flavors), Integer.valueOf(1))); (i >= 0); ) {
      arrayOfCallSite[49].call(this.mergedFlavor, arrayOfCallSite[50].callStatic(VariantCombination.class, arrayOfCallSite[51].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[52].callGetProperty(arrayOfCallSite[53].call(this.flavors, Integer.valueOf(i)))));
      arrayOfCallSite[54].call(this.mergedFlavor, arrayOfCallSite[55].callStatic(VariantCombination.class, arrayOfCallSite[56].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[57].callGetProperty(arrayOfCallSite[58].call(this.flavors, Integer.valueOf(i)))));
      arrayOfCallSite[59].call(this.mergedFlavor, arrayOfCallSite[60].callStatic(VariantCombination.class, arrayOfCallSite[61].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[62].callGetProperty(arrayOfCallSite[63].call(this.flavors, Integer.valueOf(i)))));
      arrayOfCallSite[64].call(this.mergedFlavor, arrayOfCallSite[65].callStatic(VariantCombination.class, arrayOfCallSite[66].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[67].callGetProperty(arrayOfCallSite[68].call(this.flavors, Integer.valueOf(i)))));
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[69].callGroovyObjectGetProperty(this.mergedFlavor), null)) {
        arrayOfCallSite[70].call(this.mergedFlavor, arrayOfCallSite[71].callGetProperty(arrayOfCallSite[72].call(this.flavors, Integer.valueOf(i))));
      } else {
        arrayOfCallSite[73].call(arrayOfCallSite[74].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[75].callGetProperty(arrayOfCallSite[76].call(this.flavors, Integer.valueOf(i))));
        arrayOfCallSite[77].call(this.mergedFlavor, arrayOfCallSite[78].callGroovyObjectGetProperty(this.mergedFlavor));
      } 
      arrayOfCallSite[79].call(this.mergedFlavor, arrayOfCallSite[80].callStatic(VariantCombination.class, arrayOfCallSite[81].callGroovyObjectGetProperty(this.mergedFlavor), arrayOfCallSite[82].callGetProperty(arrayOfCallSite[83].call(this.flavors, Integer.valueOf(i)))));
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[84].call(Integer.valueOf(j = i)));
      arrayOfCallSite[84].call(Integer.valueOf(j = i));
    } 
  }
  
  public String getDefaultSourceSet() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.variantType, arrayOfCallSite[122].callGetProperty(VariantModel.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[123].callGetProperty(OhosSourceSet.class)); 
    if (ScriptBytecodeAdapter.compareEqual(this.variantType, arrayOfCallSite[124].callGetProperty(VariantModel.class)))
      return ShortTypeHandling.castToString(arrayOfCallSite[125].callGetProperty(OhosSourceSet.class)); 
    return ShortTypeHandling.castToString(arrayOfCallSite[126].callGetProperty(OhosSourceSet.class));
  }
  
  public static <T> T assignNotNull(Object origin, Object plus) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ((ScriptBytecodeAdapter.compareEqual(plus, null) || ScriptBytecodeAdapter.compareEqual(plus, ""))) ? (T)origin : (T)plus; 
    return ((ScriptBytecodeAdapter.compareEqual(plus, null) || ScriptBytecodeAdapter.compareEqual(plus, ""))) ? (T)origin : (T)plus;
  }
  
  public static <T> T assignIntegerNotNull(Object origin, Object plus) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ((ScriptBytecodeAdapter.compareEqual(plus, null) || ScriptBytecodeAdapter.compareEqual(plus, Integer.valueOf(0)))) ? (T)origin : (T)plus; 
    return ((ScriptBytecodeAdapter.compareEqual(plus, null) || ScriptBytecodeAdapter.compareEqual(plus, Integer.valueOf(0)))) ? (T)origin : (T)plus;
  }
  
  private static List<ClassField> mergeClassField(List masterFields, List solveFields) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<ClassField> classFieldList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[127].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[128].call(classFieldList, masterFields);
    arrayOfCallSite[129].call(classFieldList, solveFields);
    return classFieldList;
  }
  
  @Generated
  public BuildType getBuildType() {
    return this.buildType;
  }
  
  @Generated
  public void setBuildType(BuildType paramBuildType) {
    this.buildType = paramBuildType;
  }
  
  @Generated
  public void setVariantName(String paramString) {
    this.variantName = paramString;
  }
  
  @Generated
  public void setFlavorsName(String paramString) {
    this.flavorsName = paramString;
  }
  
  @Generated
  public List<VariantFlavor> getFlavors() {
    return this.flavors;
  }
  
  @Generated
  public void setFlavors(List<VariantFlavor> paramList) {
    this.flavors = paramList;
  }
  
  @Generated
  public VariantFlavorOptions getMergedFlavor() {
    return this.mergedFlavor;
  }
  
  @Generated
  public void setMergedFlavor(VariantFlavorOptions paramVariantFlavorOptions) {
    this.mergedFlavor = paramVariantFlavorOptions;
  }
  
  @Generated
  public String getVariantType() {
    return this.variantType;
  }
  
  @Generated
  public void setVariantType(String paramString) {
    this.variantType = paramString;
  }
  
  @Generated
  public void setSources(List<OhosSourceSet> paramList) {
    this.sources = paramList;
  }
}
