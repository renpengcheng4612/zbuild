package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.HarmonyArtifactModel;
import com.huawei.ohos.zbuild.model.VariantModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariantModelImpl implements VariantModel, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final HarmonyArtifactModel mainHarmonyArtifact;
  
  private final String buildTypeName;
  
  private final List<String> variantFlavorNames;
  
  private final String variantType;
  
  private final Map<String, String> facetConfigurationMap = new HashMap<>();
  
  public VariantModelImpl(String name, HarmonyArtifactModel harmonyArtifacts, String buildTypeName, List<String> variantFlavorNames, String variantType, Map<String, String> variantFacetConfigurationMap) {
    this.name = name;
    this.mainHarmonyArtifact = harmonyArtifacts;
    this.buildTypeName = buildTypeName;
    this.variantFlavorNames = variantFlavorNames;
    this.variantType = variantType;
    this.facetConfigurationMap.putAll(variantFacetConfigurationMap);
  }
  
  public String getName() {
    return this.name;
  }
  
  public HarmonyArtifactModel getMainHarmonyArtifacts() {
    return this.mainHarmonyArtifact;
  }
  
  public String getBuildTypeName() {
    return this.buildTypeName;
  }
  
  public List<String> getVariantFlavorNames() {
    return this.variantFlavorNames;
  }
  
  public String getVariantType() {
    return this.variantType;
  }
  
  public Map<String, String> getVariantFacetConfigurationMap() {
    return this.facetConfigurationMap;
  }
}
