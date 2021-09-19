package com.huawei.ohos.build.utils;

import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.internal.os.OperatingSystem;

public class ProcessUtils implements GroovyObject {
  public static final int PROCESS_SUCCESS_EXIT_VALUE = 0;
  
  private Project project;
  
  private String errorLog;
  
  private Boolean ignoreExitValue;
  
  private Object exitValue;
  
  private static final Object COMPRESSED;
  
  private static final Object SUCCESS;
  
  private static final Object NOTE;
  
  private static final Object WARNING;
  
  private static final Object FAILED;
  
  private static final Object ERROR;
  
  private static final Object WEBPACK_WATCHING_MODE;
  
  private static final Object BLUE;
  
  private static final Object RESET;
  
  private static final int MIN_NAME_LENGTH = 1;
  
  private String ohosCharSet;
  
  public ProcessUtils(Project project) {
    String str = "Build failed";
    boolean bool = false;
    this.ignoreExitValue = Boolean.valueOf(bool);
    Integer integer = Integer.valueOf(-1);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Object object1 = arrayOfCallSite[0].call("Build failed, please check ", arrayOfCallSite[1].call(arrayOfCallSite[2].call(project)));
    this.errorLog = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[3].callGetProperty(arrayOfCallSite[4].callGetProperty(project));
    this.ohosCharSet = ShortTypeHandling.castToString(object2);
  }
  
  public ProcessUtils(Project project, Boolean ignoreExitValue) {
    String str = "Build failed";
    boolean bool = false;
    this.ignoreExitValue = Boolean.valueOf(bool);
    Integer integer = Integer.valueOf(-1);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    Boolean bool1 = ignoreExitValue;
    this.ignoreExitValue = (Boolean)ScriptBytecodeAdapter.castToType(bool1, Boolean.class);
    Object object1 = arrayOfCallSite[5].call("Build failed, please check ", arrayOfCallSite[6].call(arrayOfCallSite[7].call(project)));
    this.errorLog = ShortTypeHandling.castToString(object1);
    Object object2 = arrayOfCallSite[8].callGetProperty(arrayOfCallSite[9].callGetProperty(project));
    this.ohosCharSet = ShortTypeHandling.castToString(object2);
  }
  
  public ProcessUtils(Project project, String errLog) {
    String str1 = "Build failed";
    boolean bool = false;
    this.ignoreExitValue = Boolean.valueOf(bool);
    Integer integer = Integer.valueOf(-1);
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    String str2 = errLog;
    this.errorLog = ShortTypeHandling.castToString(str2);
    Object object = arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].callGetProperty(project));
    this.ohosCharSet = ShortTypeHandling.castToString(object);
  }
  
  public ProcessUtils(String errLog, String charset) {
    String str1 = "Build failed";
    boolean bool = false;
    this.ignoreExitValue = Boolean.valueOf(bool);
    Integer integer = Integer.valueOf(-1);
    MetaClass metaClass = $getStaticMetaClass();
    String str2 = errLog;
    this.errorLog = ShortTypeHandling.castToString(str2);
    String str3 = charset;
    this.ohosCharSet = ShortTypeHandling.castToString(str3);
  }
  
  public Object exitValue() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.exitValue;
  }
  
  public void execute(List command, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[12].callCurrent(this, command, null, hmLogger);
  }
  
  public void execute(List command, File workDir, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[13].callCurrent(this, ArrayUtil.createArray(command, workDir, null, Boolean.valueOf(true), hmLogger));
  }
  
  public void execute(List command, File workDir, Map cmdEnv, boolean wait, HMLogger hmLogger, String charset, File successFile) {
    Reference reference = new Reference(hmLogger);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    ProcessBuilder builder = (ProcessBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[14].callConstructor(ProcessBuilder.class, command), ProcessBuilder.class);
    arrayOfCallSite[15].call(builder, Boolean.valueOf(false));
    if (ScriptBytecodeAdapter.compareNotEqual(workDir, null))
      arrayOfCallSite[16].call(builder, workDir); 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareNotEqual(cmdEnv, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[20].call(cmdEnv), Integer.valueOf(0)))) {
        arrayOfCallSite[21].call(cmdEnv, new _execute_closure1(this, this, reference));
        arrayOfCallSite[22].callStatic(ProcessUtils.class, builder, cmdEnv);
      } 
    } else if ((ScriptBytecodeAdapter.compareNotEqual(cmdEnv, null) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[17].call(cmdEnv), Integer.valueOf(0)))) {
      arrayOfCallSite[18].call(cmdEnv, new _execute_closure1(this, this, reference));
      arrayOfCallSite[19].callStatic(ProcessUtils.class, builder, cmdEnv);
    } 
    Process process = (Process)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].call(builder), Process.class);
    if (wait) {
      arrayOfCallSite[24].callCurrent(this, process, reference.get(), charset);
    } else {
      arrayOfCallSite[25].callCurrent(this, ArrayUtil.createArray(arrayOfCallSite[26].call(process), reference.get(), Boolean.valueOf(false), charset, successFile));
      arrayOfCallSite[27].callCurrent(this, ArrayUtil.createArray(arrayOfCallSite[28].call(process), reference.get(), Boolean.valueOf(true), charset, null));
    } 
  }
  
  public final class _execute_closure1 extends Closure implements GeneratedClosure {
    public _execute_closure1(Object _outerInstance, Object _thisObject, Reference hmLogger) {
      super(_outerInstance, _thisObject);
      Reference reference = hmLogger;
      this.hmLogger = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].call(this.hmLogger.get(), "cmdEnv", arrayOfCallSite[1].call(arrayOfCallSite[2].call(arrayOfCallSite[3].callGetProperty(it), "="), arrayOfCallSite[4].callGetProperty(it)));
    }
    
    @Generated
    public HMLogger getHmLogger() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (HMLogger)ScriptBytecodeAdapter.castToType(this.hmLogger.get(), HMLogger.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  private Object processWait(Process process, HMLogger hmLogger, String charset) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[29].callCurrent(this, ArrayUtil.createArray(arrayOfCallSite[30].call(process), hmLogger, Boolean.valueOf(false), charset, null));
    arrayOfCallSite[31].callCurrent(this, ArrayUtil.createArray(arrayOfCallSite[32].call(process), hmLogger, Boolean.valueOf(true), charset, null));
    arrayOfCallSite[33].call(process);
    Object object = arrayOfCallSite[34].call(process);
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(this.ignoreExitValue)) && ScriptBytecodeAdapter.compareNotEqual(this.exitValue, Integer.valueOf(PROCESS_SUCCESS_EXIT_VALUE))))
        throw (Throwable)arrayOfCallSite[36].callConstructor(GradleException.class, this.errorLog); 
      return null;
    } 
    if (((!DefaultTypeTransformation.booleanUnbox(this.ignoreExitValue)) && ScriptBytecodeAdapter.compareNotEqual(this.exitValue, Integer.valueOf(PROCESS_SUCCESS_EXIT_VALUE))))
      throw (Throwable)arrayOfCallSite[35].callConstructor(GradleException.class, this.errorLog); 
    return null;
  }
  
  private void printMessage(InputStream input, HMLogger hmLogger, Boolean isError, String charset, File successFile) {
    // Byte code:
    //   0: aload_1
    //   1: new groovy/lang/Reference
    //   4: dup_x1
    //   5: swap
    //   6: invokespecial <init> : (Ljava/lang/Object;)V
    //   9: astore #6
    //   11: aload_2
    //   12: new groovy/lang/Reference
    //   15: dup_x1
    //   16: swap
    //   17: invokespecial <init> : (Ljava/lang/Object;)V
    //   20: astore #7
    //   22: aload_3
    //   23: new groovy/lang/Reference
    //   26: dup_x1
    //   27: swap
    //   28: invokespecial <init> : (Ljava/lang/Object;)V
    //   31: astore #8
    //   33: aload #5
    //   35: new groovy/lang/Reference
    //   38: dup_x1
    //   39: swap
    //   40: invokespecial <init> : (Ljava/lang/Object;)V
    //   43: astore #9
    //   45: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    //   48: astore #10
    //   50: aload #4
    //   52: aconst_null
    //   53: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   56: ifeq -> 64
    //   59: aload #4
    //   61: goto -> 68
    //   64: aload_0
    //   65: getfield ohosCharSet : Ljava/lang/String;
    //   68: new groovy/lang/Reference
    //   71: dup_x1
    //   72: swap
    //   73: invokespecial <init> : (Ljava/lang/Object;)V
    //   76: astore #11
    //   78: aload #11
    //   80: pop
    //   81: invokestatic isOrigZ : ()Z
    //   84: ifeq -> 102
    //   87: getstatic com/huawei/ohos/build/utils/ProcessUtils.__$stMC : Z
    //   90: ifne -> 102
    //   93: invokestatic disabledStandardMetaClass : ()Z
    //   96: ifne -> 102
    //   99: goto -> 226
    //   102: aload #11
    //   104: invokevirtual get : ()Ljava/lang/Object;
    //   107: checkcast java/lang/String
    //   110: aconst_null
    //   111: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   114: ifne -> 133
    //   117: aload #11
    //   119: invokevirtual get : ()Ljava/lang/Object;
    //   122: checkcast java/lang/String
    //   125: ldc ''
    //   127: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   130: ifeq -> 137
    //   133: iconst_1
    //   134: goto -> 138
    //   137: iconst_0
    //   138: ifeq -> 223
    //   141: aload #10
    //   143: ldc 37
    //   145: aaload
    //   146: aload #10
    //   148: ldc 38
    //   150: aaload
    //   151: ldc_w org/gradle/internal/os/OperatingSystem
    //   154: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   159: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   164: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   167: ifeq -> 187
    //   170: aload #10
    //   172: ldc_w 39
    //   175: aaload
    //   176: ldc_w com/huawei/ohos/build/consts/CommonConst
    //   179: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: goto -> 201
    //   187: aload #10
    //   189: ldc_w 40
    //   192: aaload
    //   193: ldc_w com/huawei/ohos/build/consts/CommonConst
    //   196: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   201: astore #12
    //   203: aload #12
    //   205: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   208: checkcast java/lang/String
    //   211: aload #11
    //   213: checkcast groovy/lang/Reference
    //   216: swap
    //   217: invokevirtual set : (Ljava/lang/Object;)V
    //   220: aload #12
    //   222: pop
    //   223: goto -> 349
    //   226: aload #11
    //   228: invokevirtual get : ()Ljava/lang/Object;
    //   231: checkcast java/lang/String
    //   234: aconst_null
    //   235: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   238: ifne -> 257
    //   241: aload #11
    //   243: invokevirtual get : ()Ljava/lang/Object;
    //   246: checkcast java/lang/String
    //   249: ldc ''
    //   251: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   254: ifeq -> 261
    //   257: iconst_1
    //   258: goto -> 262
    //   261: iconst_0
    //   262: ifeq -> 349
    //   265: aload #10
    //   267: ldc_w 41
    //   270: aaload
    //   271: aload #10
    //   273: ldc_w 42
    //   276: aaload
    //   277: ldc_w org/gradle/internal/os/OperatingSystem
    //   280: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   285: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   290: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   293: ifeq -> 313
    //   296: aload #10
    //   298: ldc_w 43
    //   301: aaload
    //   302: ldc_w com/huawei/ohos/build/consts/CommonConst
    //   305: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   310: goto -> 327
    //   313: aload #10
    //   315: ldc_w 44
    //   318: aaload
    //   319: ldc_w com/huawei/ohos/build/consts/CommonConst
    //   322: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   327: astore #13
    //   329: aload #13
    //   331: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   334: checkcast java/lang/String
    //   337: aload #11
    //   339: checkcast groovy/lang/Reference
    //   342: swap
    //   343: invokevirtual set : (Ljava/lang/Object;)V
    //   346: aload #13
    //   348: pop
    //   349: aload #10
    //   351: ldc_w 45
    //   354: aaload
    //   355: aload #10
    //   357: ldc_w 46
    //   360: aaload
    //   361: ldc_w java/lang/Thread
    //   364: new com/huawei/ohos/build/utils/ProcessUtils$1
    //   367: dup
    //   368: aload_0
    //   369: aload #6
    //   371: aload #11
    //   373: aload #8
    //   375: aload #7
    //   377: aload #9
    //   379: invokespecial <init> : (Lcom/huawei/ohos/build/utils/ProcessUtils;Lgroovy/lang/Reference;Lgroovy/lang/Reference;Lgroovy/lang/Reference;Lgroovy/lang/Reference;Lgroovy/lang/Reference;)V
    //   382: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   387: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   392: pop
    //   393: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #122	-> 50
    //   #123	-> 81
    //   #124	-> 141
    //   #125	-> 223
    //   #123	-> 226
    //   #124	-> 265
    //   #125	-> 349
    //   #126	-> 349
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	393	0	this	Lcom/huawei/ohos/build/utils/ProcessUtils;
    //   1	392	6	input	Lgroovy/lang/Reference;
    //   0	1	1	input	Ljava/io/InputStream;
    //   12	381	7	hmLogger	Lgroovy/lang/Reference;
    //   0	12	2	hmLogger	Lcom/huawei/ohos/build/utils/logUtils/HMLogger;
    //   23	370	8	isError	Lgroovy/lang/Reference;
    //   0	23	3	isError	Ljava/lang/Boolean;
    //   0	393	4	charset	Ljava/lang/String;
    //   35	358	9	successFile	Lgroovy/lang/Reference;
    //   0	35	5	successFile	Ljava/io/File;
    //   78	315	11	consoleLogCharset	Lgroovy/lang/Reference;
  }
  
  public void setErrLog(String errLog) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = errLog;
    this.errorLog = ShortTypeHandling.castToString(str);
  }
  
  public static void killProcess(String command, String keyWords, boolean isWindows, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (isWindows) {
      arrayOfCallSite[47].callStatic(ProcessUtils.class, command, keyWords, hmLogger);
    } else {
      arrayOfCallSite[48].callStatic(ProcessUtils.class, command, keyWords, hmLogger);
    } 
  }
  
  private static void killUnix(String command, String keyWords, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String killCommand = ShortTypeHandling.castToString(arrayOfCallSite[49].call(arrayOfCallSite[50].call(arrayOfCallSite[51].call(arrayOfCallSite[52].call("ps -ef | grep ", command), " | grep "), keyWords), " | awk '{print $2}' | xargs kill -9"));
    ArrayList cmd = (ArrayList)ScriptBytecodeAdapter.castToType(arrayOfCallSite[53].callConstructor(ArrayList.class), ArrayList.class);
    arrayOfCallSite[54].call(cmd, "/bin/sh");
    arrayOfCallSite[55].call(cmd, "-c");
    arrayOfCallSite[56].call(cmd, killCommand);
    arrayOfCallSite[57].call(hmLogger, "kill node", arrayOfCallSite[58].call(String.class, " ", cmd));
    BufferedReader br = null;
    try {
      ProcessBuilder pb = (ProcessBuilder)ScriptBytecodeAdapter.castToType(arrayOfCallSite[59].callConstructor(ProcessBuilder.class, cmd), ProcessBuilder.class);
      Process p = (Process)ScriptBytecodeAdapter.castToType(arrayOfCallSite[60].call(pb), Process.class);
      Object object = arrayOfCallSite[61].callConstructor(BufferedReader.class, arrayOfCallSite[62].callConstructor(InputStreamReader.class, arrayOfCallSite[63].call(p)));
      br = (BufferedReader)ScriptBytecodeAdapter.castToType(object, BufferedReader.class);
      String line = null;
      while (true) {
        Object object1 = arrayOfCallSite[64].call(br);
        line = ShortTypeHandling.castToString(object1);
        if (ScriptBytecodeAdapter.compareNotEqual(object1, null)) {
          arrayOfCallSite[65].call(hmLogger, line);
          continue;
        } 
        break;
      } 
    } catch (IOException e) {
    
    } finally {
      if (ScriptBytecodeAdapter.compareNotEqual(br, null))
        arrayOfCallSite[68].call(br); 
    } 
  }
  
  private static void killWindows(String command, String keyWords, HMLogger hmLogger) {
    Reference reference = new Reference(hmLogger);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List processIds = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].callStatic(ProcessUtils.class, command, keyWords, reference.get()), List.class);
    arrayOfCallSite[70].call(processIds, new _killWindows_closure2(ProcessUtils.class, ProcessUtils.class, reference));
  }
  
  public final class _killWindows_closure2 extends Closure implements GeneratedClosure {
    public _killWindows_closure2(Object _outerInstance, Object _thisObject, Reference hmLogger) {
      super(_outerInstance, _thisObject);
      Reference reference = hmLogger;
      this.hmLogger = reference;
    }
    
    public Object doCall(Object processId) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      arrayOfCallSite[0].call(arrayOfCallSite[1].call(Runtime.class), arrayOfCallSite[2].call("cmd /c taskkill /T /F /PID ", processId));
      return arrayOfCallSite[3].call(this.hmLogger.get(), arrayOfCallSite[4].call("kill process : ", processId));
    }
    
    @Generated
    public HMLogger getHmLogger() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (HMLogger)ScriptBytecodeAdapter.castToType(this.hmLogger.get(), HMLogger.class);
    }
  }
  
  private static List<String> getProcessId(String command, String keyWords, HMLogger hmLogger) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List<String> list = (List)ScriptBytecodeAdapter.castToType(arrayOfCallSite[71].callConstructor(ArrayList.class), List.class);
    Object object = arrayOfCallSite[72].call(keyWords, "\\", "\\\\");
    keyWords = ShortTypeHandling.castToString(object);
    String findCommand = ShortTypeHandling.castToString(
        
        arrayOfCallSite[73].call(arrayOfCallSite[74].call(arrayOfCallSite[75].call(arrayOfCallSite[76].call(arrayOfCallSite[77].call(arrayOfCallSite[78].call(arrayOfCallSite[79].call("cmd /c wmic process where ", "(name like \"%"), command), "%\""), "and commandline like \"%"), keyWords), "%\") "), "get processid"));
    Process process = (Process)ScriptBytecodeAdapter.castToType(arrayOfCallSite[80].call(arrayOfCallSite[81].call(Runtime.class), findCommand), Process.class);
    String msg = null;
    BufferedReader reader = (BufferedReader)ScriptBytecodeAdapter.castToType(arrayOfCallSite[82].callConstructor(BufferedReader.class, arrayOfCallSite[83].callConstructor(InputStreamReader.class, arrayOfCallSite[84].call(process))), BufferedReader.class);
    try {
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        while (true) {
          Object object1 = arrayOfCallSite[90].call(reader);
          msg = ShortTypeHandling.castToString(object1);
          if (ScriptBytecodeAdapter.compareNotEqual(object1, null)) {
            Object object2 = arrayOfCallSite[91].call(msg);
            msg = ShortTypeHandling.castToString(object2);
            if ((ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[92].call(msg), Integer.valueOf(0)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[93].call(msg, "\\d+"))))
              arrayOfCallSite[94].call(list, msg); 
            continue;
          } 
          break;
        } 
      } else {
        while (true) {
          Object object1 = arrayOfCallSite[85].call(reader);
          msg = ShortTypeHandling.castToString(object1);
          if (ScriptBytecodeAdapter.compareNotEqual(object1, null)) {
            Object object2 = arrayOfCallSite[86].call(msg);
            msg = ShortTypeHandling.castToString(object2);
            if ((ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[87].call(msg), Integer.valueOf(0)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[88].call(msg, "\\d+"))))
              arrayOfCallSite[89].call(list, msg); 
            continue;
          } 
          break;
        } 
      } 
    } catch (Exception e) {
    
    } finally {
      if (DefaultTypeTransformation.booleanUnbox(reader))
        arrayOfCallSite[97].call(reader); 
    } 
    return list;
  }
  
  private static ProcessBuilder setEnv(ProcessBuilder builder, Map cmdEnv) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(cmdEnv, null))
      return builder; 
    Reference environment = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[98].call(builder), Map.class));
    arrayOfCallSite[99].call(cmdEnv, new _setEnv_closure3(ProcessUtils.class, ProcessUtils.class, environment));
    return builder;
  }
  
  @Generated
  public void execute(List<String> command, File workDir, Map<String, String> cmdEnv, boolean wait, HMLogger hmLogger, String charset) {
    Reference reference = new Reference(hmLogger);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    execute(command, workDir, cmdEnv, wait, (HMLogger)reference.get(), charset, null);
    null;
  }
  
  @Generated
  public void execute(List<String> command, File workDir, Map<String, String> cmdEnv, boolean wait, HMLogger hmLogger) {
    Reference reference = new Reference(hmLogger);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    execute(command, workDir, cmdEnv, wait, (HMLogger)reference.get(), null, null);
    null;
  }
  
  static {
    String str1 = "\033[39m";
    RESET = str1;
    String str2 = "\033[34m";
    BLUE = str2;
    String str3 = "webpack is watching";
    WEBPACK_WATCHING_MODE = str3;
    String str4 = "error";
    ERROR = str4;
    String str5 = "FAILED";
    FAILED = str5;
    String str6 = "Warning";
    WARNING = str6;
    String str7 = "note";
    NOTE = str7;
    String str8 = "COMPILE RESULT:SUCCESS";
    SUCCESS = str8;
    String str9 = "compressed";
    COMPRESSED = str9;
  }
  
  @Generated
  public Project getProject() {
    return this.project;
  }
  
  @Generated
  public void setProject(Project paramProject) {
    this.project = paramProject;
  }
  
  @Generated
  public String getErrorLog() {
    return this.errorLog;
  }
  
  @Generated
  public void setErrorLog(String paramString) {
    this.errorLog = paramString;
  }
  
  @Generated
  public static int getMIN_NAME_LENGTH() {
    return MIN_NAME_LENGTH;
  }
  
  public final class _setEnv_closure3 extends Closure implements GeneratedClosure {
    public _setEnv_closure3(Object _outerInstance, Object _thisObject, Reference environment) {
      super(_outerInstance, _thisObject);
      Reference reference = environment;
      this.environment = reference;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(it)), "PATH")) {
        arrayOfCallSite[2].call(this.environment.get(), arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(it)), arrayOfCallSite[5].call(arrayOfCallSite[6].callGetProperty(it)));
        return null;
      } 
      String envPath = ShortTypeHandling.castToString(arrayOfCallSite[7].call(this.environment.get(), "PATH"));
      if (DefaultTypeTransformation.booleanUnbox(envPath)) {
        boolean isWindows = DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(arrayOfCallSite[9].call(OperatingSystem.class)));
        String originalPath = ShortTypeHandling.castToString(isWindows ? new GStringImpl(new Object[] { envPath }, new String[] { "", ";" }) : new GStringImpl(new Object[] { envPath }, new String[] { "", ":" }));
        return arrayOfCallSite[10].call(this.environment.get(), arrayOfCallSite[11].call(arrayOfCallSite[12].callGetProperty(it)), arrayOfCallSite[13].call(originalPath, arrayOfCallSite[14].call(arrayOfCallSite[15].callGetProperty(it))));
      } 
      return arrayOfCallSite[16].call(this.environment.get(), arrayOfCallSite[17].call(arrayOfCallSite[18].callGetProperty(it)), arrayOfCallSite[19].call(arrayOfCallSite[20].callGetProperty(it)));
    }
    
    @Generated
    public Map getEnvironment() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Map)ScriptBytecodeAdapter.castToType(this.environment.get(), Map.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
