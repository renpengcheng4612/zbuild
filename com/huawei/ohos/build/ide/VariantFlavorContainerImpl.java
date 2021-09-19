package com.huawei.ohos.build.ide;

import com.huawei.ohos.zbuild.model.SourceSetsProvider;
import com.huawei.ohos.zbuild.model.VariantFlavor;
import com.huawei.ohos.zbuild.model.VariantFlavorContainer;
import java.io.Serializable;
import javax.annotation.Nonnull;

public class VariantFlavorContainerImpl implements VariantFlavorContainer, Serializable {
  private static final long serialVersionUID = 1L;
  
  @Nonnull
  private final VariantFlavor variantFlavor;
  
  @Nonnull
  private final SourceSetsProvider sourceSetsProvider;
  
  public VariantFlavorContainerImpl(@Nonnull VariantFlavor variantFlavor, @Nonnull SourceSetsProvider sourceSetsProvider) {
    this.variantFlavor = variantFlavor;
    this.sourceSetsProvider = sourceSetsProvider;
  }
  
  @Nonnull
  public VariantFlavor getVariantFlavor() {
    return this.variantFlavor;
  }
  
  @Nonnull
  public SourceSetsProvider getSourceSetsProvider() {
    return this.sourceSetsProvider;
  }
}
