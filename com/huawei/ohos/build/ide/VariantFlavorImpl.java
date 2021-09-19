package com.huawei.ohos.build.ide;

import com.huawei.ohos.build.model.variant.VariantFlavor;
import com.huawei.ohos.zbuild.model.VariantFlavor;
import java.io.Serializable;
import javax.annotation.Nonnull;

public class VariantFlavorImpl implements VariantFlavor, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final String name;
  
  private final Integer compileSdkVersion;
  
  private final Integer compatibleSdkVersion;
  
  private final String bundleName;
  
  private final String dimension;
  
  public VariantFlavorImpl(VariantFlavor variantFlavor) {
    this.name = variantFlavor.getName();
    this.compileSdkVersion = variantFlavor.getCompileSdkVersion();
    this.dimension = variantFlavor.getDimension();
    this.compatibleSdkVersion = variantFlavor.getCompatibleSdkVersion();
    this.bundleName = variantFlavor.getBundleName();
  }
  
  public String getName() {
    return this.name;
  }
  
  @Nonnull
  public String getDimension() {
    return this.dimension;
  }
  
  @Nonnull
  public Integer getCompileSdkVersion() {
    return this.compileSdkVersion;
  }
  
  @Nonnull
  public Integer getCompatibleSdkVersion() {
    return this.compatibleSdkVersion;
  }
  
  @Nonnull
  public String getBundleName() {
    return this.bundleName;
  }
}
