package com.huawei.ohos.build.utils.proxy;

import com.huawei.deveco.sdkmanager.common.api.SdkInfoProgress;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class DownloadProxyProgress extends SdkInfoProgress implements GroovyObject {
  private static final HMLogger hmLogger;
  
  private Integer barLen;
  
  private String showChar;
  
  private DecimalFormat format;
  
  private double fraction;
  
  private int lastFraction;
  
  static {
    __$swapInit();
    Object object = $getCallSiteArray()[30].call(HMLogger.class, DownloadProxyProgress.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  @Generated
  public DownloadProxyProgress() {
    byte b = 50;
    this.barLen = Integer.valueOf(b);
    String str = "#";
    Object object = arrayOfCallSite[0].callConstructor(DecimalFormat.class, "#.##%");
    this.format = (DecimalFormat)ScriptBytecodeAdapter.castToType(object, DecimalFormat.class);
    MetaClass metaClass = $getStaticMetaClass();
  }
  
  public void setFraction(double fraction) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    double d = fraction;
    this;
    this.fraction = DefaultTypeTransformation.doubleUnbox(Double.valueOf(d));
    int fractionInt = 0;
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigD() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      int j = (int)(fraction * 100);
    } else {
      int j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[1].call(Double.valueOf(fraction), Integer.valueOf(100)));
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((fractionInt == 0))
        arrayOfCallSite[3].call(hmLogger, "Begin Installing SDK "); 
    } else if ((fractionInt == 0)) {
      arrayOfCallSite[2].call(hmLogger, "Begin Installing SDK ");
    } 
    int length = 0;
    if (BytecodeInterface8.isOrigInt() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      int j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[5].call(Double.valueOf(fraction), this.barLen));
    } else {
      int j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[4].call(Double.valueOf(fraction), this.barLen));
    } 
    StringBuilder consoleOut = (StringBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].callConstructor(StringBuilder.class), StringBuilder.class);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; (j < length); ) {
        arrayOfCallSite[9].call(consoleOut, this.showChar);
        int k;
        j = (k = j) + 1;
      } 
    } else {
      for (int j = 0; (j < length); ) {
        arrayOfCallSite[7].call(consoleOut, this.showChar);
        int k;
        j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[8].call(Integer.valueOf(k = j)));
        arrayOfCallSite[8].call(Integer.valueOf(k = j));
      } 
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(j), arrayOfCallSite[13].call(this.barLen, Integer.valueOf(length))); ) {
        arrayOfCallSite[14].call(consoleOut, " ");
        int k;
        j = (k = j) + 1;
      } 
    } else {
      for (int j = 0; ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(j), arrayOfCallSite[10].call(this.barLen, Integer.valueOf(length))); ) {
        arrayOfCallSite[11].call(consoleOut, " ");
        int k;
        j = DefaultTypeTransformation.intUnbox(arrayOfCallSite[12].call(Integer.valueOf(k = j)));
        arrayOfCallSite[12].call(Integer.valueOf(k = j));
      } 
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((this.lastFraction < fractionInt)) && ((fractionInt % 10 == 0))))
        arrayOfCallSite[22].call(hmLogger, arrayOfCallSite[23].call(arrayOfCallSite[24].call(consoleOut, " |"), format(DefaultTypeTransformation.floatUnbox(arrayOfCallSite[25].call(arrayOfCallSite[26].call(Integer.valueOf(fractionInt), $const$0), Integer.valueOf(100)))))); 
    } else if ((((this.lastFraction < fractionInt)) && ((DefaultTypeTransformation.intUnbox(arrayOfCallSite[15].call(Integer.valueOf(fractionInt), Integer.valueOf(10))) == 0)))) {
      arrayOfCallSite[16].call(hmLogger, arrayOfCallSite[17].call(arrayOfCallSite[18].call(consoleOut, " |"), arrayOfCallSite[19].callCurrent(this, ScriptBytecodeAdapter.createPojoWrapper(Float.valueOf(DefaultTypeTransformation.floatUnbox(arrayOfCallSite[20].call(arrayOfCallSite[21].call(Integer.valueOf(fractionInt), $const$0), Integer.valueOf(100)))), float.class))));
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((fractionInt == 100))
        arrayOfCallSite[28].call(hmLogger, "SDK is installed"); 
    } else if ((fractionInt == 100)) {
      arrayOfCallSite[27].call(hmLogger, "SDK is installed");
    } 
    int i = fractionInt;
    this.lastFraction = DefaultTypeTransformation.intUnbox(Integer.valueOf(i));
  }
  
  public double getFraction() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.fraction;
  }
  
  private String format(float num) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[29].call(this.format, Float.valueOf(num)));
  }
  
  @Generated
  public int getLastFraction() {
    return this.lastFraction;
  }
  
  @Generated
  public void setLastFraction(int paramInt) {
    this.lastFraction = paramInt;
  }
}
