package com.huawei.ohos.build.model.variant;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.dsl.variant.VariantFilterOptions;
import com.huawei.ohos.build.dsl.variant.VariantFlavorOptions;
import com.huawei.ohos.build.model.BuildType;
import com.huawei.ohos.build.model.sourcesets.OhosSourceSetCreator;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import com.huawei.ohos.zbuild.model.VariantModel;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Action;

public class VariantCombinator implements GroovyObject {
  private static final HMLogger HM_LOGGER;
  
  @Nonnull
  private List<BuildType> buildTypes;
  
  @Nonnull
  private List<VariantFlavorOptions> flavorList;
  
  @Nonnull
  private Set<String> flavorDimensions;
  
  @Nonnull
  private OhosSourceSetCreator sourceSetCreator;
  
  @Nonnull
  private Boolean isLiteDevice;
  
  static {
    Object object = $getCallSiteArray()[104].call(HMLogger.class, VariantCombinator.class);
    HM_LOGGER = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public VariantCombinator(@Nonnull List buildTypes, List flavorList, Set flavorDimensions, OhosSourceSetCreator sourceSetCreator, Boolean isLiteDevice) {
    boolean bool = false;
    this.isLiteDevice = Boolean.valueOf(bool);
    MetaClass metaClass = $getStaticMetaClass();
    List list1 = buildTypes;
    this.buildTypes = (List<BuildType>)ScriptBytecodeAdapter.castToType(list1, List.class);
    List list2 = flavorList;
    this.flavorList = (List<VariantFlavorOptions>)ScriptBytecodeAdapter.castToType(list2, List.class);
    Set set = flavorDimensions;
    this.flavorDimensions = (Set<String>)ScriptBytecodeAdapter.castToType(set, Set.class);
    OhosSourceSetCreator ohosSourceSetCreator = sourceSetCreator;
    this.sourceSetCreator = (OhosSourceSetCreator)ScriptBytecodeAdapter.castToType(ohosSourceSetCreator, OhosSourceSetCreator.class);
    Boolean bool1 = isLiteDevice;
    this.isLiteDevice = (Boolean)ScriptBytecodeAdapter.castToType(bool1, Boolean.class);
  }
  
  public List<VariantCombination> combine(Action filterAction) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object result = arrayOfCallSite[0].callConstructor(ArrayList.class);
    BuildType type;
    Iterator iterator;
    for (type = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].call(this.buildTypes), Iterator.class); iterator.hasNext(); ) {
      type = (BuildType)ScriptBytecodeAdapter.castToType(iterator.next(), BuildType.class);
      if (ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[2].call(this.flavorList), Integer.valueOf(0))) {
        List flavorComboList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].callCurrent(this), List.class);
        List flavorCombo;
        Iterator iterator1;
        for (flavorCombo = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[4].call(flavorComboList), Iterator.class); iterator1.hasNext(); ) {
          flavorCombo = (List)ScriptBytecodeAdapter.castToType(iterator1.next(), List.class);
          VariantFilterOptions variantFilter = (VariantFilterOptions)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(VariantFilterOptions.class), VariantFilterOptions.class);
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].callStatic(VariantCombinator.class, variantFilter, type, flavorCombo, filterAction)))
            arrayOfCallSite[7].call(result, arrayOfCallSite[8].callCurrent(this, type, flavorCombo)); 
        } 
        continue;
      } 
      arrayOfCallSite[9].call(result, arrayOfCallSite[10].callCurrent(this, type, null));
    } 
    return (List<VariantCombination>)ScriptBytecodeAdapter.castToType(result, List.class);
  }
  
  private List<VariantCombination> createCombinationList(BuildType type, List flavorCombo) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<VariantCombination> combinations = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[11].callConstructor(ArrayList.class), List.class);
    arrayOfCallSite[12].call(combinations, arrayOfCallSite[13].callCurrent(this, type, flavorCombo, arrayOfCallSite[14].callGetProperty(VariantModel.class)));
    arrayOfCallSite[15].call(combinations, arrayOfCallSite[16].callCurrent(this, type, flavorCombo, arrayOfCallSite[17].callGetProperty(VariantModel.class)));
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[23].callGetProperty(type), arrayOfCallSite[24].callGetProperty(BuildConst.class)) && (!DefaultTypeTransformation.booleanUnbox(this.isLiteDevice))))
        arrayOfCallSite[25].call(combinations, arrayOfCallSite[26].callCurrent(this, type, flavorCombo, arrayOfCallSite[27].callGetProperty(VariantModel.class))); 
      return combinations;
    } 
    if ((ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[18].callGetProperty(type), arrayOfCallSite[19].callGetProperty(BuildConst.class)) && (!DefaultTypeTransformation.booleanUnbox(this.isLiteDevice))))
      arrayOfCallSite[20].call(combinations, arrayOfCallSite[21].callCurrent(this, type, flavorCombo, arrayOfCallSite[22].callGetProperty(VariantModel.class))); 
    return combinations;
  }
  
  private VariantCombination createCombination(BuildType type, List flavorCombo, String variantType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    VariantCombination comb = (VariantCombination)ScriptBytecodeAdapter.castToType(arrayOfCallSite[28].callConstructor(VariantCombination.class, type, flavorCombo, variantType), VariantCombination.class);
    arrayOfCallSite[29].call(this.sourceSetCreator, arrayOfCallSite[30].call(comb));
    String defaultSourceSet = ShortTypeHandling.castToString(arrayOfCallSite[31].call(comb));
    arrayOfCallSite[32].call(comb, arrayOfCallSite[33].call(this.sourceSetCreator, arrayOfCallSite[34].call(comb)));
    arrayOfCallSite[35].call(comb, arrayOfCallSite[36].call(this.sourceSetCreator, arrayOfCallSite[37].call(type)));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(flavorCombo, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[46].call(flavorCombo), Integer.valueOf(0)))) {
        arrayOfCallSite[47].call(comb, arrayOfCallSite[48].call(this.sourceSetCreator, arrayOfCallSite[49].call(comb)));
        Object flavor;
        Iterator iterator;
        for (flavor = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[50].call(flavorCombo), Iterator.class); iterator.hasNext(); ) {
          flavor = iterator.next();
          arrayOfCallSite[51].call(comb, arrayOfCallSite[52].call(this.sourceSetCreator, arrayOfCallSite[53].call(flavor)));
        } 
      } 
      arrayOfCallSite[54].call(comb, arrayOfCallSite[55].call(this.sourceSetCreator, defaultSourceSet));
      return comb;
    } 
    if ((ScriptBytecodeAdapter.compareNotEqual(flavorCombo, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[38].call(flavorCombo), Integer.valueOf(0)))) {
      arrayOfCallSite[39].call(comb, arrayOfCallSite[40].call(this.sourceSetCreator, arrayOfCallSite[41].call(comb)));
      Object flavor;
      Iterator iterator;
      for (flavor = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[42].call(flavorCombo), Iterator.class); iterator.hasNext(); ) {
        flavor = iterator.next();
        arrayOfCallSite[43].call(comb, arrayOfCallSite[44].call(this.sourceSetCreator, arrayOfCallSite[45].call(flavor)));
      } 
    } 
    arrayOfCallSite[54].call(comb, arrayOfCallSite[55].call(this.sourceSetCreator, defaultSourceSet));
    return comb;
  }
  
  private List<List<VariantFlavor>> combineFlavorList() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map dimensionMap = (Map)ScriptBytecodeAdapter.castToType(arrayOfCallSite[56].callConstructor(HashMap.class), Map.class);
    List<List<VariantFlavor>> comb = null;
    Object flavor;
    Iterator iterator1;
    for (flavor = null, iterator1 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[57].call(this.flavorList), Iterator.class); iterator1.hasNext(); ) {
      flavor = iterator1.next();
      arrayOfCallSite[58].callCurrent(this, flavor);
      String dimension = ShortTypeHandling.castToString(arrayOfCallSite[59].call(flavor));
      List flavorList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].call(dimensionMap, dimension, arrayOfCallSite[61].callConstructor(ArrayList.class)), List.class);
      arrayOfCallSite[62].call(flavorList, flavor);
      arrayOfCallSite[63].call(dimensionMap, dimension, flavorList);
    } 
    int dimensionSize = DefaultTypeTransformation.intUnbox(arrayOfCallSite[64].call(this.flavorDimensions));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((dimensionSize == 1)) {
        Object object3 = arrayOfCallSite[71].callConstructor(ArrayList.class, arrayOfCallSite[72].call(this.flavorList));
        comb = (List)ScriptBytecodeAdapter.castToType(object3, List.class);
        Object object4;
        Iterator iterator;
        for (object4 = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[73].call(this.flavorList), Iterator.class); iterator.hasNext(); ) {
          object4 = iterator.next();
          arrayOfCallSite[74].call(comb, arrayOfCallSite[75].callConstructor(ArrayList.class, arrayOfCallSite[76].call(Arrays.class, object4)));
        } 
        return comb;
      } 
    } else if ((dimensionSize == 1)) {
      Object object3 = arrayOfCallSite[65].callConstructor(ArrayList.class, arrayOfCallSite[66].call(this.flavorList));
      comb = (List<List<VariantFlavor>>)ScriptBytecodeAdapter.castToType(object3, List.class);
      Object object4;
      Iterator iterator;
      for (object4 = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[67].call(this.flavorList), Iterator.class); iterator.hasNext(); ) {
        object4 = iterator.next();
        arrayOfCallSite[68].call(comb, arrayOfCallSite[69].callConstructor(ArrayList.class, arrayOfCallSite[70].call(Arrays.class, object4)));
      } 
      return comb;
    } 
    Object object1 = arrayOfCallSite[77].callConstructor(LinkedList.class);
    comb = (List<List<VariantFlavor>>)ScriptBytecodeAdapter.castToType(object1, List.class);
    Object object2;
    Iterator iterator2;
    for (object2 = null, iterator2 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[78].call(arrayOfCallSite[79].call(dimensionMap, arrayOfCallSite[80].call(this.flavorDimensions, Integer.valueOf(0)))), Iterator.class); iterator2.hasNext(); ) {
      object2 = iterator2.next();
      arrayOfCallSite[81].call(comb, arrayOfCallSite[82].callConstructor(ArrayList.class, arrayOfCallSite[83].call(Arrays.class, object2)));
    } 
    Object i;
    Iterator iterator3;
    for (i = null, iterator3 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[84].call(ScriptBytecodeAdapter.createRange(Integer.valueOf(1), Integer.valueOf(dimensionSize), false)), Iterator.class); iterator3.hasNext(); ) {
      i = iterator3.next();
      List nextFlavorList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[85].call(dimensionMap, arrayOfCallSite[86].call(this.flavorDimensions, i)), List.class);
      int queueSize = DefaultTypeTransformation.intUnbox(arrayOfCallSite[87].call(comb));
      Object j;
      Iterator iterator;
      for (j = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[88].call(ScriptBytecodeAdapter.createRange(Integer.valueOf(0), Integer.valueOf(queueSize), false)), Iterator.class); iterator.hasNext(); ) {
        j = iterator.next();
        List curFlavorList = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[89].call(comb), List.class);
        List newFlavorList = null;
        Object nextFlavor;
        Iterator iterator4;
        for (nextFlavor = null, iterator4 = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[90].call(nextFlavorList), Iterator.class); iterator4.hasNext(); ) {
          nextFlavor = iterator4.next();
          Object object = arrayOfCallSite[91].callConstructor(ArrayList.class, curFlavorList);
          newFlavorList = (List)ScriptBytecodeAdapter.castToType(object, List.class);
          arrayOfCallSite[92].call(newFlavorList, nextFlavor);
          arrayOfCallSite[93].call(comb, newFlavorList);
        } 
      } 
    } 
    return comb;
  }
  
  public void checkFlavorDimension(VariantFlavorOptions variantFlavorOptions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[94].call(this.flavorDimensions, arrayOfCallSite[95].call(variantFlavorOptions))))
      arrayOfCallSite[96]
        .call(HM_LOGGER, arrayOfCallSite[97].callConstructor(IllegalStateException.class, arrayOfCallSite[98].call(String.class, arrayOfCallSite[99].callGetProperty(Locale.class), "Variant flavor dimension '%s' config error!", arrayOfCallSite[100].call(variantFlavorOptions))), "All variantFlavor must belong to a named flavor dimension,Please check!"); 
  }
  
  public static boolean ignoreVariant(VariantFilterOptions variantFilter, BuildType buildType, List flavors, Action filterAction) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[101].call(variantFilter, buildType, flavors);
    if (ScriptBytecodeAdapter.compareNotEqual(filterAction, null))
      arrayOfCallSite[102].call(filterAction, variantFilter); 
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[103].call(variantFilter));
  }
  
  @Generated
  public List<BuildType> getBuildTypes() {
    return this.buildTypes;
  }
  
  @Generated
  public void setBuildTypes(List<BuildType> paramList) {
    this.buildTypes = paramList;
  }
  
  @Generated
  public List<VariantFlavorOptions> getFlavorList() {
    return this.flavorList;
  }
  
  @Generated
  public void setFlavorList(List<VariantFlavorOptions> paramList) {
    this.flavorList = paramList;
  }
  
  @Generated
  public Set<String> getFlavorDimensions() {
    return this.flavorDimensions;
  }
  
  @Generated
  public void setFlavorDimensions(Set<String> paramSet) {
    this.flavorDimensions = paramSet;
  }
  
  @Generated
  public OhosSourceSetCreator getSourceSetCreator() {
    return this.sourceSetCreator;
  }
  
  @Generated
  public void setSourceSetCreator(OhosSourceSetCreator paramOhosSourceSetCreator) {
    this.sourceSetCreator = paramOhosSourceSetCreator;
  }
  
  @Generated
  public Boolean getIsLiteDevice() {
    return this.isLiteDevice;
  }
  
  @Generated
  public void setIsLiteDevice(Boolean paramBoolean) {
    this.isLiteDevice = paramBoolean;
  }
}
