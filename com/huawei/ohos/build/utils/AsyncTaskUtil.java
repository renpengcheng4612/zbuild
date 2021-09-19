package com.huawei.ohos.build.utils;

import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class AsyncTaskUtil implements GroovyObject {
  private static long CHECK_TIME_OUT;
  
  private static final long CHECK_TIME_GAP = 10L;
  
  @Generated
  public AsyncTaskUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static long getCHECK_TIME_OUT() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return CHECK_TIME_OUT;
  }
  
  public static void setCHECK_TIME_OUT(long checkTimeOut) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    long l = checkTimeOut;
  }
  
  public static boolean isFinished(FutureTask task) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ExecutorService executor = (ExecutorService)ScriptBytecodeAdapter.castToType(arrayOfCallSite[0].call(Executors.class), ExecutorService.class);
    arrayOfCallSite[1].call(executor, task);
    arrayOfCallSite[2].call(executor);
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(task));
  }
  
  public static boolean checkFiles(String[] checkFiles, HMLogger hmLogger) {
    // Byte code:
    //   0: aload_0
    //   1: new groovy/lang/Reference
    //   4: dup_x1
    //   5: swap
    //   6: invokespecial <init> : (Ljava/lang/Object;)V
    //   9: astore_2
    //   10: aload_1
    //   11: new groovy/lang/Reference
    //   14: dup_x1
    //   15: swap
    //   16: invokespecial <init> : (Ljava/lang/Object;)V
    //   19: astore_3
    //   20: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    //   23: astore #4
    //   25: aload #4
    //   27: ldc 4
    //   29: aaload
    //   30: ldc java/util/concurrent/FutureTask
    //   32: new com/huawei/ohos/build/utils/AsyncTaskUtil$1
    //   35: dup
    //   36: ldc com/huawei/ohos/build/utils/AsyncTaskUtil
    //   38: aload_2
    //   39: aload_3
    //   40: invokespecial <init> : (Ljava/lang/Class;Lgroovy/lang/Reference;Lgroovy/lang/Reference;)V
    //   43: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   48: ldc java/util/concurrent/FutureTask
    //   50: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   53: checkcast java/util/concurrent/FutureTask
    //   56: astore #5
    //   58: aload #5
    //   60: pop
    //   61: aload #4
    //   63: ldc 5
    //   65: aaload
    //   66: ldc com/huawei/ohos/build/utils/AsyncTaskUtil
    //   68: aload #5
    //   70: invokeinterface callStatic : (Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    //   75: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   78: ireturn
    //   79: nop
    //   80: nop
    //   81: nop
    //   82: nop
    //   83: nop
    //   84: nop
    //   85: nop
    //   86: nop
    //   87: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #55	-> 25
    //   #82	-> 61
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1	78	2	checkFiles	Lgroovy/lang/Reference;
    //   0	1	0	checkFiles	[Ljava/lang/String;
    //   11	68	3	hmLogger	Lgroovy/lang/Reference;
    //   0	11	1	hmLogger	Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   58	21	5	task	Ljava/util/concurrent/FutureTask;
  }
  
  static {
    __$swapInit();
    long l = 30000L;
    CHECK_TIME_OUT = l;
  }
}
