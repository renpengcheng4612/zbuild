package com.huawei.ohos.build.shell;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.annotation.Validates;
import com.huawei.ohos.build.data.ConfigInfo;
import com.huawei.ohos.build.data.PathInfo;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.utils.deserializer.BooleanDeserializer;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.util.Node;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class AbilitiesOptions extends Transform2Node {
  private static final HMLogger hmLogger;
  
  private static String onlyConfiguretion;
  
  @Validate(deviceType = "rich", notNull = true, maxLength = 255)
  public String name;
  
  @Validate(maxLength = 255)
  public String description;
  
  @Validate(resource = true)
  public String icon;
  
  @Validate(maxLength = 255)
  public String label;
  
  @Validates({@Validate(deviceType = "rich", resource = true), @Validate(deviceType = "lite", notSupport = true)})
  public String theme;
  
  @Validate(notNull = true, range = {"page", "service", "data", "CA"})
  public String type;
  
  @Validate(deviceType = "rich", maxLength = 255)
  public String uri;
  
  @Validate(deviceType = "rich", range = {"singleton", "standard", "singleMission"})
  public String launchType;
  
  @Validate(deviceType = "lite", notSupport = true)
  public MetaDataOptions metaData;
  
  @Validate(deviceType = "rich", range = {"unspecified", "landscape", "portrait", "followRecent"})
  public String orientation;
  
  @Validate(deviceType = "rich", maxLength = 255)
  public List<String> permissions;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean visible;
  
  public List<SkillsOptions> skills;
  
  @Validate(deviceType = "rich", range = {"mcc", "mnc", "locale", "layout", "fontSize", "orientation", "density", "size", "smallestSize"})
  public List<String> configChanges;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean directLaunch;
  
  public String process;
  
  @Validate(deviceType = "rich", range = {"dataTransfer", "audioPlayback", "audioRecording", "pictureInPicture", "voip", "location", "bluetoothInteraction", "wifiInteraction", "screenFetch", "multiDeviceConnection"})
  public List<String> backgroundModes;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean grantPermission;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean formEnabled;
  
  @Validate(deviceType = "lite", notSupport = true)
  public FormOptions form;
  
  @Validates({@Validate(deviceType = "rich", maxLength = 255), @Validate(deviceType = "lite", notSupport = true)})
  public String readPermission;
  
  @Validates({@Validate(deviceType = "rich", maxLength = 255), @Validate(deviceType = "lite", notSupport = true)})
  public String writePermission;
  
  @Validate(deviceType = "lite", notSupport = true)
  public UriPermissionOptions uriPermission;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean multiUserShared;
  
  @Validate(deviceType = "lite", notSupport = true)
  public String mission;
  
  @Validate(deviceType = "lite", notSupport = true)
  public String targetAbility;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean supportPipMode;
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public Map mergeRule;
  
  @Validate(deviceType = "lite", notSupport = true)
  public List<FormsOptions> forms;
  
  @Validate(deviceType = "lite", notSupport = true)
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean formsEnabled;
  
  @JsonDeserialize(using = BooleanDeserializer.class)
  public Boolean resizeable;
  
  @Validate(maxLength = 64)
  public List<String> deviceCapability;
  
  @Validate(deviceType = "lite", notSupport = true)
  public String originalName;
  
  @Validates({@Validate(deviceType = "rich", resource = true), @Validate(deviceType = "lite", notSupport = true)})
  public String entryTheme;
  
  @JsonIgnore
  private String shellName;
  
  @JsonIgnore
  private String targetShellName;
  
  @JsonIgnore
  private String shellFormName;
  
  @JsonIgnore
  private String abilityShellRealName;
  
  private Integer iconId;
  
  private Integer labelId;
  
  private Integer descriptionId;
  
  static {
    String str = "Please check '%s' config.json,the '%s' label allows configuration only if the type of the 'ability' label is %s";
    Object object = $getCallSiteArray()[270].call(HMLogger.class, AbilitiesOptions.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public void transform2Node(Node parent, String moduleType, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
  }
  
  public void transform2Node(Node parent, String moduleType, Project project, ConfigInfo configInfo, PathInfo pathInfo) {
    // Byte code:
    //   0: invokestatic $getCallSiteArray : ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    //   3: astore #6
    //   5: aload #6
    //   7: ldc 0
    //   9: aaload
    //   10: ldc com/huawei/ohos/build/utils/XmlNodeHandler
    //   12: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: ldc com/huawei/ohos/build/utils/XmlNodeHandler
    //   19: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   22: checkcast com/huawei/ohos/build/utils/XmlNodeHandler
    //   25: astore #7
    //   27: aload #7
    //   29: pop
    //   30: aload #6
    //   32: ldc 1
    //   34: aaload
    //   35: ldc java/util/HashMap
    //   37: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   42: ldc java/util/Map
    //   44: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   47: checkcast java/util/Map
    //   50: astore #8
    //   52: aload #8
    //   54: pop
    //   55: aload #6
    //   57: ldc 2
    //   59: aaload
    //   60: ldc java/util/HashMap
    //   62: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   67: ldc java/util/Map
    //   69: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   72: checkcast java/util/Map
    //   75: astore #9
    //   77: aload #9
    //   79: pop
    //   80: aload #6
    //   82: ldc 3
    //   84: aaload
    //   85: ldc java/util/HashMap
    //   87: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: ldc java/util/Map
    //   94: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   97: checkcast java/util/Map
    //   100: astore #10
    //   102: aload #10
    //   104: pop
    //   105: ldc 'activity'
    //   107: astore #11
    //   109: aload #11
    //   111: pop
    //   112: invokestatic isOrigZ : ()Z
    //   115: ifeq -> 133
    //   118: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   121: ifne -> 133
    //   124: invokestatic disabledStandardMetaClass : ()Z
    //   127: ifne -> 133
    //   130: goto -> 178
    //   133: aload_0
    //   134: getfield targetAbility : Ljava/lang/String;
    //   137: aconst_null
    //   138: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   141: ifeq -> 160
    //   144: aload_0
    //   145: getfield targetAbility : Ljava/lang/String;
    //   148: ldc ''
    //   150: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   153: ifeq -> 160
    //   156: iconst_1
    //   157: goto -> 161
    //   160: iconst_0
    //   161: ifeq -> 175
    //   164: ldc 'activity-alias'
    //   166: astore #12
    //   168: aload #12
    //   170: astore #11
    //   172: aload #12
    //   174: pop
    //   175: goto -> 220
    //   178: aload_0
    //   179: getfield targetAbility : Ljava/lang/String;
    //   182: aconst_null
    //   183: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   186: ifeq -> 205
    //   189: aload_0
    //   190: getfield targetAbility : Ljava/lang/String;
    //   193: ldc ''
    //   195: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   198: ifeq -> 205
    //   201: iconst_1
    //   202: goto -> 206
    //   205: iconst_0
    //   206: ifeq -> 220
    //   209: ldc 'activity-alias'
    //   211: astore #13
    //   213: aload #13
    //   215: astore #11
    //   217: aload #13
    //   219: pop
    //   220: invokestatic isOrigZ : ()Z
    //   223: ifeq -> 241
    //   226: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   229: ifne -> 241
    //   232: invokestatic disabledStandardMetaClass : ()Z
    //   235: ifne -> 241
    //   238: goto -> 287
    //   241: ldc 'service'
    //   243: aload_0
    //   244: getfield type : Ljava/lang/String;
    //   247: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   250: ifne -> 265
    //   253: ldc 'CA'
    //   255: aload_0
    //   256: getfield type : Ljava/lang/String;
    //   259: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   262: ifeq -> 269
    //   265: iconst_1
    //   266: goto -> 270
    //   269: iconst_0
    //   270: ifeq -> 284
    //   273: ldc 'service'
    //   275: astore #14
    //   277: aload #14
    //   279: astore #11
    //   281: aload #14
    //   283: pop
    //   284: goto -> 330
    //   287: ldc 'service'
    //   289: aload_0
    //   290: getfield type : Ljava/lang/String;
    //   293: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   296: ifne -> 311
    //   299: ldc 'CA'
    //   301: aload_0
    //   302: getfield type : Ljava/lang/String;
    //   305: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   308: ifeq -> 315
    //   311: iconst_1
    //   312: goto -> 316
    //   315: iconst_0
    //   316: ifeq -> 330
    //   319: ldc 'service'
    //   321: astore #15
    //   323: aload #15
    //   325: astore #11
    //   327: aload #15
    //   329: pop
    //   330: ldc 'data'
    //   332: aload_0
    //   333: getfield type : Ljava/lang/String;
    //   336: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   339: ifeq -> 353
    //   342: ldc 'provider'
    //   344: astore #16
    //   346: aload #16
    //   348: astore #11
    //   350: aload #16
    //   352: pop
    //   353: aload #6
    //   355: ldc 4
    //   357: aaload
    //   358: ldc groovy/util/Node
    //   360: aload_1
    //   361: aload #11
    //   363: aload #8
    //   365: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   370: ldc groovy/util/Node
    //   372: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   375: checkcast groovy/util/Node
    //   378: astore #17
    //   380: aload #17
    //   382: pop
    //   383: invokestatic isOrigZ : ()Z
    //   386: ifeq -> 404
    //   389: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   392: ifne -> 404
    //   395: invokestatic disabledStandardMetaClass : ()Z
    //   398: ifne -> 404
    //   401: goto -> 489
    //   404: ldc 'service'
    //   406: aload_0
    //   407: getfield type : Ljava/lang/String;
    //   410: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   413: ifeq -> 431
    //   416: aload_0
    //   417: getfield description : Ljava/lang/String;
    //   420: aconst_null
    //   421: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   424: ifeq -> 431
    //   427: iconst_1
    //   428: goto -> 432
    //   431: iconst_0
    //   432: ifeq -> 461
    //   435: aload #6
    //   437: ldc 5
    //   439: aaload
    //   440: aload_0
    //   441: getfield description : Ljava/lang/String;
    //   444: ldc '$'
    //   446: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   451: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   454: ifeq -> 461
    //   457: iconst_1
    //   458: goto -> 462
    //   461: iconst_0
    //   462: ifeq -> 486
    //   465: aload #6
    //   467: ldc 6
    //   469: aaload
    //   470: aload #7
    //   472: aload #17
    //   474: ldc 'android:description'
    //   476: aload_0
    //   477: getfield description : Ljava/lang/String;
    //   480: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   485: pop
    //   486: goto -> 571
    //   489: ldc 'service'
    //   491: aload_0
    //   492: getfield type : Ljava/lang/String;
    //   495: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   498: ifeq -> 516
    //   501: aload_0
    //   502: getfield description : Ljava/lang/String;
    //   505: aconst_null
    //   506: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   509: ifeq -> 516
    //   512: iconst_1
    //   513: goto -> 517
    //   516: iconst_0
    //   517: ifeq -> 546
    //   520: aload #6
    //   522: ldc 7
    //   524: aaload
    //   525: aload_0
    //   526: getfield description : Ljava/lang/String;
    //   529: ldc '$'
    //   531: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   536: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   539: ifeq -> 546
    //   542: iconst_1
    //   543: goto -> 547
    //   546: iconst_0
    //   547: ifeq -> 571
    //   550: aload #6
    //   552: ldc 8
    //   554: aaload
    //   555: aload #7
    //   557: aload #17
    //   559: ldc 'android:description'
    //   561: aload_0
    //   562: getfield description : Ljava/lang/String;
    //   565: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   570: pop
    //   571: aload #6
    //   573: ldc 9
    //   575: aaload
    //   576: aload #4
    //   578: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   583: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   586: ifeq -> 605
    //   589: ldc 'page'
    //   591: aload_0
    //   592: getfield type : Ljava/lang/String;
    //   595: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   598: ifeq -> 605
    //   601: iconst_1
    //   602: goto -> 606
    //   605: iconst_0
    //   606: ifeq -> 628
    //   609: aload #6
    //   611: ldc 10
    //   613: aaload
    //   614: aload #7
    //   616: aload #17
    //   618: ldc 'android:windowSoftInputMode'
    //   620: ldc 'adjustResize'
    //   622: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   627: pop
    //   628: aload #6
    //   630: ldc 11
    //   632: aaload
    //   633: aload #7
    //   635: aload #17
    //   637: ldc 'android:icon'
    //   639: aload_0
    //   640: getfield icon : Ljava/lang/String;
    //   643: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   648: pop
    //   649: aload #6
    //   651: ldc 12
    //   653: aaload
    //   654: aload #7
    //   656: aload #17
    //   658: ldc 'android:label'
    //   660: aload_0
    //   661: getfield label : Ljava/lang/String;
    //   664: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   669: pop
    //   670: invokestatic isOrigZ : ()Z
    //   673: ifeq -> 691
    //   676: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   679: ifne -> 691
    //   682: invokestatic disabledStandardMetaClass : ()Z
    //   685: ifne -> 691
    //   688: goto -> 776
    //   691: aload_0
    //   692: getfield entryTheme : Ljava/lang/String;
    //   695: aconst_null
    //   696: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   699: ifeq -> 728
    //   702: aload #6
    //   704: ldc 13
    //   706: aaload
    //   707: aload_0
    //   708: getfield entryTheme : Ljava/lang/String;
    //   711: ldc '$'
    //   713: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   718: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   721: ifeq -> 728
    //   724: iconst_1
    //   725: goto -> 729
    //   728: iconst_0
    //   729: ifeq -> 748
    //   732: aload_0
    //   733: getfield type : Ljava/lang/String;
    //   736: ldc 'page'
    //   738: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   741: ifeq -> 748
    //   744: iconst_1
    //   745: goto -> 749
    //   748: iconst_0
    //   749: ifeq -> 773
    //   752: aload #6
    //   754: ldc 14
    //   756: aaload
    //   757: aload #7
    //   759: aload #17
    //   761: ldc 'android:theme'
    //   763: aload_0
    //   764: getfield entryTheme : Ljava/lang/String;
    //   767: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   772: pop
    //   773: goto -> 858
    //   776: aload_0
    //   777: getfield entryTheme : Ljava/lang/String;
    //   780: aconst_null
    //   781: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   784: ifeq -> 813
    //   787: aload #6
    //   789: ldc 15
    //   791: aaload
    //   792: aload_0
    //   793: getfield entryTheme : Ljava/lang/String;
    //   796: ldc '$'
    //   798: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   803: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   806: ifeq -> 813
    //   809: iconst_1
    //   810: goto -> 814
    //   813: iconst_0
    //   814: ifeq -> 833
    //   817: aload_0
    //   818: getfield type : Ljava/lang/String;
    //   821: ldc 'page'
    //   823: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   826: ifeq -> 833
    //   829: iconst_1
    //   830: goto -> 834
    //   833: iconst_0
    //   834: ifeq -> 858
    //   837: aload #6
    //   839: ldc 16
    //   841: aaload
    //   842: aload #7
    //   844: aload #17
    //   846: ldc 'android:theme'
    //   848: aload_0
    //   849: getfield entryTheme : Ljava/lang/String;
    //   852: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   857: pop
    //   858: invokestatic isOrigZ : ()Z
    //   861: ifeq -> 879
    //   864: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   867: ifne -> 879
    //   870: invokestatic disabledStandardMetaClass : ()Z
    //   873: ifne -> 879
    //   876: goto -> 1046
    //   879: aload_0
    //   880: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   883: aconst_null
    //   884: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   887: ifeq -> 915
    //   890: aload #6
    //   892: ldc 17
    //   894: aaload
    //   895: aload_0
    //   896: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   899: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   904: aconst_null
    //   905: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   908: ifeq -> 915
    //   911: iconst_1
    //   912: goto -> 916
    //   915: iconst_0
    //   916: ifeq -> 1043
    //   919: aload #6
    //   921: ldc_w 18
    //   924: aaload
    //   925: ldc_w com/huawei/ohos/build/utils/configJson/CastTransformUtil
    //   928: aload #6
    //   930: ldc_w 19
    //   933: aaload
    //   934: aload_0
    //   935: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   938: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   943: ldc_w com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   946: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   951: ldc_w java/util/List
    //   954: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   957: checkcast java/util/List
    //   960: astore #18
    //   962: aload #18
    //   964: pop
    //   965: aconst_null
    //   966: astore #19
    //   968: aload #6
    //   970: ldc_w 20
    //   973: aaload
    //   974: aload #18
    //   976: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   981: ldc_w java/util/Iterator
    //   984: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   987: checkcast java/util/Iterator
    //   990: astore #20
    //   992: aload #20
    //   994: invokeinterface hasNext : ()Z
    //   999: ifeq -> 1043
    //   1002: aload #20
    //   1004: invokeinterface next : ()Ljava/lang/Object;
    //   1009: ldc_w com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   1012: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1015: checkcast com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   1018: astore #19
    //   1020: aload #6
    //   1022: ldc_w 21
    //   1025: aaload
    //   1026: aload #19
    //   1028: aload #17
    //   1030: aload_2
    //   1031: aload_3
    //   1032: aload #5
    //   1034: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1039: pop
    //   1040: goto -> 992
    //   1043: goto -> 1211
    //   1046: aload_0
    //   1047: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   1050: aconst_null
    //   1051: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1054: ifeq -> 1083
    //   1057: aload #6
    //   1059: ldc_w 22
    //   1062: aaload
    //   1063: aload_0
    //   1064: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   1067: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1072: aconst_null
    //   1073: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1076: ifeq -> 1083
    //   1079: iconst_1
    //   1080: goto -> 1084
    //   1083: iconst_0
    //   1084: ifeq -> 1211
    //   1087: aload #6
    //   1089: ldc_w 23
    //   1092: aaload
    //   1093: ldc_w com/huawei/ohos/build/utils/configJson/CastTransformUtil
    //   1096: aload #6
    //   1098: ldc_w 24
    //   1101: aaload
    //   1102: aload_0
    //   1103: getfield metaData : Lcom/huawei/ohos/build/shell/MetaDataOptions;
    //   1106: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1111: ldc_w com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   1114: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1119: ldc_w java/util/List
    //   1122: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1125: checkcast java/util/List
    //   1128: astore #21
    //   1130: aload #21
    //   1132: pop
    //   1133: aconst_null
    //   1134: astore #22
    //   1136: aload #6
    //   1138: ldc_w 25
    //   1141: aaload
    //   1142: aload #21
    //   1144: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1149: ldc_w java/util/Iterator
    //   1152: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1155: checkcast java/util/Iterator
    //   1158: astore #23
    //   1160: aload #23
    //   1162: invokeinterface hasNext : ()Z
    //   1167: ifeq -> 1211
    //   1170: aload #23
    //   1172: invokeinterface next : ()Ljava/lang/Object;
    //   1177: ldc_w com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   1180: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1183: checkcast com/huawei/ohos/build/shell/metadata/CustomizeDataOptions
    //   1186: astore #22
    //   1188: aload #6
    //   1190: ldc_w 26
    //   1193: aaload
    //   1194: aload #22
    //   1196: aload #17
    //   1198: aload_2
    //   1199: aload_3
    //   1200: aload #5
    //   1202: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1207: pop
    //   1208: goto -> 1160
    //   1211: aload #6
    //   1213: ldc_w 27
    //   1216: aaload
    //   1217: ldc_w com/huawei/ohos/build/utils/ShellUtils
    //   1220: aload_3
    //   1221: aload_0
    //   1222: getfield shellName : Ljava/lang/String;
    //   1225: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1230: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1233: checkcast java/lang/String
    //   1236: astore #24
    //   1238: aload #24
    //   1240: pop
    //   1241: aload #6
    //   1243: ldc_w 28
    //   1246: aaload
    //   1247: aload #7
    //   1249: aload #17
    //   1251: ldc_w 'android:name'
    //   1254: aload #24
    //   1256: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: pop
    //   1262: invokestatic isOrigZ : ()Z
    //   1265: ifeq -> 1283
    //   1268: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   1271: ifne -> 1283
    //   1274: invokestatic disabledStandardMetaClass : ()Z
    //   1277: ifne -> 1283
    //   1280: goto -> 1443
    //   1283: aload_0
    //   1284: getfield orientation : Ljava/lang/String;
    //   1287: ldc_w 'unspecified'
    //   1290: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1293: ifne -> 1309
    //   1296: aload_0
    //   1297: getfield orientation : Ljava/lang/String;
    //   1300: ldc_w 'landscape'
    //   1303: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1306: ifeq -> 1313
    //   1309: iconst_1
    //   1310: goto -> 1314
    //   1313: iconst_0
    //   1314: ifne -> 1330
    //   1317: aload_0
    //   1318: getfield orientation : Ljava/lang/String;
    //   1321: ldc_w 'portrait'
    //   1324: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1327: ifeq -> 1334
    //   1330: iconst_1
    //   1331: goto -> 1335
    //   1334: iconst_0
    //   1335: ifne -> 1371
    //   1338: aload_0
    //   1339: getfield orientation : Ljava/lang/String;
    //   1342: ldc_w 'followRecent'
    //   1345: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1348: ifeq -> 1367
    //   1351: aload_0
    //   1352: getfield type : Ljava/lang/String;
    //   1355: ldc 'page'
    //   1357: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1360: ifeq -> 1367
    //   1363: iconst_1
    //   1364: goto -> 1368
    //   1367: iconst_0
    //   1368: ifeq -> 1375
    //   1371: iconst_1
    //   1372: goto -> 1376
    //   1375: iconst_0
    //   1376: ifeq -> 1440
    //   1379: aload_0
    //   1380: getfield orientation : Ljava/lang/String;
    //   1383: ldc_w 'followRecent'
    //   1386: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1389: ifeq -> 1417
    //   1392: aload #6
    //   1394: ldc_w 29
    //   1397: aaload
    //   1398: aload #7
    //   1400: aload #17
    //   1402: ldc_w 'android:screenOrientation'
    //   1405: ldc_w 'behind'
    //   1408: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1413: pop
    //   1414: goto -> 1440
    //   1417: aload #6
    //   1419: ldc_w 30
    //   1422: aaload
    //   1423: aload #7
    //   1425: aload #17
    //   1427: ldc_w 'android:screenOrientation'
    //   1430: aload_0
    //   1431: getfield orientation : Ljava/lang/String;
    //   1434: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1439: pop
    //   1440: goto -> 1600
    //   1443: aload_0
    //   1444: getfield orientation : Ljava/lang/String;
    //   1447: ldc_w 'unspecified'
    //   1450: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1453: ifne -> 1469
    //   1456: aload_0
    //   1457: getfield orientation : Ljava/lang/String;
    //   1460: ldc_w 'landscape'
    //   1463: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1466: ifeq -> 1473
    //   1469: iconst_1
    //   1470: goto -> 1474
    //   1473: iconst_0
    //   1474: ifne -> 1490
    //   1477: aload_0
    //   1478: getfield orientation : Ljava/lang/String;
    //   1481: ldc_w 'portrait'
    //   1484: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1487: ifeq -> 1494
    //   1490: iconst_1
    //   1491: goto -> 1495
    //   1494: iconst_0
    //   1495: ifne -> 1531
    //   1498: aload_0
    //   1499: getfield orientation : Ljava/lang/String;
    //   1502: ldc_w 'followRecent'
    //   1505: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1508: ifeq -> 1527
    //   1511: aload_0
    //   1512: getfield type : Ljava/lang/String;
    //   1515: ldc 'page'
    //   1517: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1520: ifeq -> 1527
    //   1523: iconst_1
    //   1524: goto -> 1528
    //   1527: iconst_0
    //   1528: ifeq -> 1535
    //   1531: iconst_1
    //   1532: goto -> 1536
    //   1535: iconst_0
    //   1536: ifeq -> 1600
    //   1539: aload_0
    //   1540: getfield orientation : Ljava/lang/String;
    //   1543: ldc_w 'followRecent'
    //   1546: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1549: ifeq -> 1577
    //   1552: aload #6
    //   1554: ldc_w 31
    //   1557: aaload
    //   1558: aload #7
    //   1560: aload #17
    //   1562: ldc_w 'android:screenOrientation'
    //   1565: ldc_w 'behind'
    //   1568: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1573: pop
    //   1574: goto -> 1600
    //   1577: aload #6
    //   1579: ldc_w 32
    //   1582: aaload
    //   1583: aload #7
    //   1585: aload #17
    //   1587: ldc_w 'android:screenOrientation'
    //   1590: aload_0
    //   1591: getfield orientation : Ljava/lang/String;
    //   1594: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1599: pop
    //   1600: aload_0
    //   1601: getfield permissions : Ljava/util/List;
    //   1604: ldc ''
    //   1606: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1609: ifeq -> 1774
    //   1612: aload #6
    //   1614: ldc_w 33
    //   1617: aaload
    //   1618: ldc_w java/util/HashSet
    //   1621: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1626: ldc_w java/util/Set
    //   1629: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1632: checkcast java/util/Set
    //   1635: astore #25
    //   1637: aload #25
    //   1639: pop
    //   1640: aconst_null
    //   1641: astore #26
    //   1643: aload #6
    //   1645: ldc_w 34
    //   1648: aaload
    //   1649: aload_0
    //   1650: getfield permissions : Ljava/util/List;
    //   1653: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1658: ldc_w java/util/Iterator
    //   1661: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1664: checkcast java/util/Iterator
    //   1667: astore #27
    //   1669: aload #27
    //   1671: invokeinterface hasNext : ()Z
    //   1676: ifeq -> 1722
    //   1679: aload #27
    //   1681: invokeinterface next : ()Ljava/lang/Object;
    //   1686: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   1689: checkcast java/lang/String
    //   1692: astore #26
    //   1694: aload #26
    //   1696: aconst_null
    //   1697: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1700: ifeq -> 1719
    //   1703: aload #6
    //   1705: ldc_w 35
    //   1708: aaload
    //   1709: aload #25
    //   1711: aload #26
    //   1713: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1718: pop
    //   1719: goto -> 1669
    //   1722: aload #6
    //   1724: ldc_w 36
    //   1727: aaload
    //   1728: aload #7
    //   1730: aload #17
    //   1732: ldc_w 'android:permission'
    //   1735: aload #6
    //   1737: ldc_w 37
    //   1740: aaload
    //   1741: ldc_w java/lang/String
    //   1744: ldc_w '|'
    //   1747: aload #6
    //   1749: ldc_w 38
    //   1752: aaload
    //   1753: ldc_w java/util/ArrayList
    //   1756: aload #25
    //   1758: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1763: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1768: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1773: pop
    //   1774: aload_0
    //   1775: getfield skills : Ljava/util/List;
    //   1778: aconst_null
    //   1779: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1782: ifeq -> 2096
    //   1785: aconst_null
    //   1786: astore #28
    //   1788: aload #6
    //   1790: ldc_w 39
    //   1793: aaload
    //   1794: aload_0
    //   1795: getfield skills : Ljava/util/List;
    //   1798: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1803: ldc_w java/util/Iterator
    //   1806: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1809: checkcast java/util/Iterator
    //   1812: astore #29
    //   1814: aload #29
    //   1816: invokeinterface hasNext : ()Z
    //   1821: ifeq -> 2096
    //   1824: aload #29
    //   1826: invokeinterface next : ()Ljava/lang/Object;
    //   1831: ldc_w com/huawei/ohos/build/shell/SkillsOptions
    //   1834: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1837: checkcast com/huawei/ohos/build/shell/SkillsOptions
    //   1840: astore #28
    //   1842: aload #28
    //   1844: aconst_null
    //   1845: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1848: ifeq -> 2093
    //   1851: aload #6
    //   1853: ldc_w 40
    //   1856: aaload
    //   1857: aload #28
    //   1859: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1864: ldc_w java/util/List
    //   1867: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1870: checkcast java/util/List
    //   1873: astore #30
    //   1875: aload #30
    //   1877: pop
    //   1878: aload #6
    //   1880: ldc_w 41
    //   1883: aaload
    //   1884: aload #28
    //   1886: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1891: ldc_w java/util/List
    //   1894: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1897: checkcast java/util/List
    //   1900: astore #31
    //   1902: aload #31
    //   1904: pop
    //   1905: aload #30
    //   1907: aconst_null
    //   1908: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1911: ifeq -> 1940
    //   1914: aload #6
    //   1916: ldc_w 42
    //   1919: aaload
    //   1920: aload #30
    //   1922: ldc_w 'action.system.home'
    //   1925: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1930: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1933: ifeq -> 1940
    //   1936: iconst_1
    //   1937: goto -> 1941
    //   1940: iconst_0
    //   1941: ifeq -> 1957
    //   1944: aload #31
    //   1946: aconst_null
    //   1947: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1950: ifeq -> 1957
    //   1953: iconst_1
    //   1954: goto -> 1958
    //   1957: iconst_0
    //   1958: ifeq -> 1987
    //   1961: aload #6
    //   1963: ldc_w 43
    //   1966: aaload
    //   1967: aload #31
    //   1969: ldc_w 'entity.system.home'
    //   1972: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1977: invokestatic booleanUnbox : (Ljava/lang/Object;)Z
    //   1980: ifeq -> 1987
    //   1983: iconst_1
    //   1984: goto -> 1988
    //   1987: iconst_0
    //   1988: ifeq -> 2075
    //   1991: aload #6
    //   1993: ldc_w 44
    //   1996: aaload
    //   1997: aload_1
    //   1998: ldc 'android:icon'
    //   2000: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2005: aconst_null
    //   2006: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2009: ifeq -> 2033
    //   2012: aload #6
    //   2014: ldc_w 45
    //   2017: aaload
    //   2018: aload #7
    //   2020: aload_1
    //   2021: ldc 'android:icon'
    //   2023: aload_0
    //   2024: getfield icon : Ljava/lang/String;
    //   2027: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2032: pop
    //   2033: aload #6
    //   2035: ldc_w 46
    //   2038: aaload
    //   2039: aload_1
    //   2040: ldc 'android:label'
    //   2042: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2047: aconst_null
    //   2048: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2051: ifeq -> 2075
    //   2054: aload #6
    //   2056: ldc_w 47
    //   2059: aaload
    //   2060: aload #7
    //   2062: aload_1
    //   2063: ldc 'android:label'
    //   2065: aload_0
    //   2066: getfield label : Ljava/lang/String;
    //   2069: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2074: pop
    //   2075: aload #6
    //   2077: ldc_w 48
    //   2080: aaload
    //   2081: aload #28
    //   2083: aload #17
    //   2085: aload_2
    //   2086: aload_3
    //   2087: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2092: pop
    //   2093: goto -> 1814
    //   2096: invokestatic isOrigInt : ()Z
    //   2099: ifeq -> 2123
    //   2102: invokestatic isOrigZ : ()Z
    //   2105: ifeq -> 2123
    //   2108: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   2111: ifne -> 2123
    //   2114: invokestatic disabledStandardMetaClass : ()Z
    //   2117: ifne -> 2123
    //   2120: goto -> 2372
    //   2123: ldc 'data'
    //   2125: aload_0
    //   2126: getfield type : Ljava/lang/String;
    //   2129: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2132: ifeq -> 2150
    //   2135: aload_0
    //   2136: getfield uri : Ljava/lang/String;
    //   2139: aconst_null
    //   2140: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2143: ifeq -> 2150
    //   2146: iconst_1
    //   2147: goto -> 2151
    //   2150: iconst_0
    //   2151: ifeq -> 2237
    //   2154: aload #6
    //   2156: ldc_w 49
    //   2159: aaload
    //   2160: aload_0
    //   2161: getfield uri : Ljava/lang/String;
    //   2164: aload #6
    //   2166: ldc_w 50
    //   2169: aaload
    //   2170: aload #6
    //   2172: ldc_w 51
    //   2175: aaload
    //   2176: aload_0
    //   2177: getfield uri : Ljava/lang/String;
    //   2180: ldc_w '/'
    //   2183: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2188: iconst_1
    //   2189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2192: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2197: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2202: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   2205: checkcast java/lang/String
    //   2208: astore #32
    //   2210: aload #32
    //   2212: pop
    //   2213: aload #6
    //   2215: ldc_w 52
    //   2218: aaload
    //   2219: aload #7
    //   2221: aload #17
    //   2223: ldc_w 'android:authorities'
    //   2226: aload #32
    //   2228: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2233: pop
    //   2234: goto -> 2369
    //   2237: aload_0
    //   2238: getfield uri : Ljava/lang/String;
    //   2241: aconst_null
    //   2242: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2245: ifeq -> 2277
    //   2248: aload #6
    //   2250: ldc_w 53
    //   2253: aaload
    //   2254: aload_0
    //   2255: getfield uri : Ljava/lang/String;
    //   2258: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2263: iconst_0
    //   2264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2267: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2270: ifeq -> 2277
    //   2273: iconst_1
    //   2274: goto -> 2278
    //   2277: iconst_0
    //   2278: ifeq -> 2369
    //   2281: aload #6
    //   2283: ldc_w 54
    //   2286: aaload
    //   2287: ldc groovy/util/Node
    //   2289: aload #17
    //   2291: ldc_w 'intent-filter'
    //   2294: aload #9
    //   2296: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2301: ldc groovy/util/Node
    //   2303: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   2306: checkcast groovy/util/Node
    //   2309: astore #33
    //   2311: aload #33
    //   2313: pop
    //   2314: aload #6
    //   2316: ldc_w 55
    //   2319: aaload
    //   2320: ldc groovy/util/Node
    //   2322: aload #33
    //   2324: ldc 'data'
    //   2326: aload #10
    //   2328: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2333: ldc groovy/util/Node
    //   2335: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   2338: checkcast groovy/util/Node
    //   2341: astore #34
    //   2343: aload #34
    //   2345: pop
    //   2346: aload #6
    //   2348: ldc_w 56
    //   2351: aaload
    //   2352: aload #7
    //   2354: aload #34
    //   2356: ldc_w 'android:authorities'
    //   2359: aload_0
    //   2360: getfield uri : Ljava/lang/String;
    //   2363: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2368: pop
    //   2369: goto -> 2617
    //   2372: ldc 'data'
    //   2374: aload_0
    //   2375: getfield type : Ljava/lang/String;
    //   2378: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2381: ifeq -> 2399
    //   2384: aload_0
    //   2385: getfield uri : Ljava/lang/String;
    //   2388: aconst_null
    //   2389: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2392: ifeq -> 2399
    //   2395: iconst_1
    //   2396: goto -> 2400
    //   2399: iconst_0
    //   2400: ifeq -> 2486
    //   2403: aload #6
    //   2405: ldc_w 57
    //   2408: aaload
    //   2409: aload_0
    //   2410: getfield uri : Ljava/lang/String;
    //   2413: aload #6
    //   2415: ldc_w 58
    //   2418: aaload
    //   2419: aload #6
    //   2421: ldc_w 59
    //   2424: aaload
    //   2425: aload_0
    //   2426: getfield uri : Ljava/lang/String;
    //   2429: ldc_w '/'
    //   2432: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2437: iconst_1
    //   2438: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2441: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2446: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2451: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   2454: checkcast java/lang/String
    //   2457: astore #35
    //   2459: aload #35
    //   2461: pop
    //   2462: aload #6
    //   2464: ldc_w 60
    //   2467: aaload
    //   2468: aload #7
    //   2470: aload #17
    //   2472: ldc_w 'android:authorities'
    //   2475: aload #35
    //   2477: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2482: pop
    //   2483: goto -> 2617
    //   2486: aload_0
    //   2487: getfield uri : Ljava/lang/String;
    //   2490: aconst_null
    //   2491: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2494: ifeq -> 2526
    //   2497: aload #6
    //   2499: ldc_w 61
    //   2502: aaload
    //   2503: aload_0
    //   2504: getfield uri : Ljava/lang/String;
    //   2507: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2512: iconst_0
    //   2513: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2516: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2519: ifeq -> 2526
    //   2522: iconst_1
    //   2523: goto -> 2527
    //   2526: iconst_0
    //   2527: ifeq -> 2617
    //   2530: aload #6
    //   2532: ldc_w 62
    //   2535: aaload
    //   2536: ldc groovy/util/Node
    //   2538: aload #17
    //   2540: ldc_w 'intent-filter'
    //   2543: aload #9
    //   2545: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2550: ldc groovy/util/Node
    //   2552: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   2555: checkcast groovy/util/Node
    //   2558: astore #36
    //   2560: aload #36
    //   2562: pop
    //   2563: aload #6
    //   2565: ldc_w 63
    //   2568: aaload
    //   2569: ldc groovy/util/Node
    //   2571: aload #36
    //   2573: ldc 'data'
    //   2575: aload #10
    //   2577: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2582: ldc groovy/util/Node
    //   2584: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   2587: checkcast groovy/util/Node
    //   2590: astore #37
    //   2592: aload #37
    //   2594: pop
    //   2595: aload #6
    //   2597: ldc 64
    //   2599: aaload
    //   2600: aload #7
    //   2602: aload #37
    //   2604: ldc_w 'android:authorities'
    //   2607: aload_0
    //   2608: getfield uri : Ljava/lang/String;
    //   2611: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2616: pop
    //   2617: invokestatic isOrigZ : ()Z
    //   2620: ifeq -> 2638
    //   2623: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   2626: ifne -> 2638
    //   2629: invokestatic disabledStandardMetaClass : ()Z
    //   2632: ifne -> 2638
    //   2635: goto -> 2716
    //   2638: aload_0
    //   2639: getfield type : Ljava/lang/String;
    //   2642: ldc 'service'
    //   2644: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2647: ifne -> 2662
    //   2650: aload_0
    //   2651: getfield type : Ljava/lang/String;
    //   2654: ldc 'data'
    //   2656: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2659: ifeq -> 2666
    //   2662: iconst_1
    //   2663: goto -> 2667
    //   2666: iconst_0
    //   2667: ifne -> 2682
    //   2670: aload_0
    //   2671: getfield type : Ljava/lang/String;
    //   2674: ldc 'CA'
    //   2676: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2679: ifeq -> 2686
    //   2682: iconst_1
    //   2683: goto -> 2687
    //   2686: iconst_0
    //   2687: ifeq -> 2713
    //   2690: aload #6
    //   2692: ldc_w 65
    //   2695: aaload
    //   2696: aload #7
    //   2698: aload #17
    //   2700: ldc_w 'android:exported'
    //   2703: aload_0
    //   2704: getfield visible : Ljava/lang/Boolean;
    //   2707: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2712: pop
    //   2713: goto -> 2791
    //   2716: aload_0
    //   2717: getfield type : Ljava/lang/String;
    //   2720: ldc 'service'
    //   2722: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2725: ifne -> 2740
    //   2728: aload_0
    //   2729: getfield type : Ljava/lang/String;
    //   2732: ldc 'data'
    //   2734: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2737: ifeq -> 2744
    //   2740: iconst_1
    //   2741: goto -> 2745
    //   2744: iconst_0
    //   2745: ifne -> 2760
    //   2748: aload_0
    //   2749: getfield type : Ljava/lang/String;
    //   2752: ldc 'CA'
    //   2754: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2757: ifeq -> 2764
    //   2760: iconst_1
    //   2761: goto -> 2765
    //   2764: iconst_0
    //   2765: ifeq -> 2791
    //   2768: aload #6
    //   2770: ldc_w 66
    //   2773: aaload
    //   2774: aload #7
    //   2776: aload #17
    //   2778: ldc_w 'android:exported'
    //   2781: aload_0
    //   2782: getfield visible : Ljava/lang/Boolean;
    //   2785: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2790: pop
    //   2791: invokestatic isOrigZ : ()Z
    //   2794: ifeq -> 2812
    //   2797: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   2800: ifne -> 2812
    //   2803: invokestatic disabledStandardMetaClass : ()Z
    //   2806: ifne -> 2812
    //   2809: goto -> 2902
    //   2812: aload_0
    //   2813: getfield type : Ljava/lang/String;
    //   2816: ldc 'page'
    //   2818: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2821: ifeq -> 2872
    //   2824: aload_0
    //   2825: getfield formsEnabled : Ljava/lang/Boolean;
    //   2828: iconst_1
    //   2829: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2832: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2835: ifne -> 2852
    //   2838: aload_0
    //   2839: getfield formEnabled : Ljava/lang/Boolean;
    //   2842: iconst_1
    //   2843: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2846: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2849: ifeq -> 2856
    //   2852: iconst_1
    //   2853: goto -> 2857
    //   2856: iconst_0
    //   2857: ifne -> 2864
    //   2860: iconst_1
    //   2861: goto -> 2865
    //   2864: iconst_0
    //   2865: ifeq -> 2872
    //   2868: iconst_1
    //   2869: goto -> 2873
    //   2872: iconst_0
    //   2873: ifeq -> 2899
    //   2876: aload #6
    //   2878: ldc_w 67
    //   2881: aaload
    //   2882: aload #7
    //   2884: aload #17
    //   2886: ldc_w 'android:exported'
    //   2889: aload_0
    //   2890: getfield visible : Ljava/lang/Boolean;
    //   2893: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2898: pop
    //   2899: goto -> 2989
    //   2902: aload_0
    //   2903: getfield type : Ljava/lang/String;
    //   2906: ldc 'page'
    //   2908: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2911: ifeq -> 2962
    //   2914: aload_0
    //   2915: getfield formsEnabled : Ljava/lang/Boolean;
    //   2918: iconst_1
    //   2919: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2922: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2925: ifne -> 2942
    //   2928: aload_0
    //   2929: getfield formEnabled : Ljava/lang/Boolean;
    //   2932: iconst_1
    //   2933: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2936: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2939: ifeq -> 2946
    //   2942: iconst_1
    //   2943: goto -> 2947
    //   2946: iconst_0
    //   2947: ifne -> 2954
    //   2950: iconst_1
    //   2951: goto -> 2955
    //   2954: iconst_0
    //   2955: ifeq -> 2962
    //   2958: iconst_1
    //   2959: goto -> 2963
    //   2962: iconst_0
    //   2963: ifeq -> 2989
    //   2966: aload #6
    //   2968: ldc_w 68
    //   2971: aaload
    //   2972: aload #7
    //   2974: aload #17
    //   2976: ldc_w 'android:exported'
    //   2979: aload_0
    //   2980: getfield visible : Ljava/lang/Boolean;
    //   2983: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2988: pop
    //   2989: aload_0
    //   2990: getfield backgroundModes : Ljava/util/List;
    //   2993: aconst_null
    //   2994: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2997: ifeq -> 3394
    //   3000: aload #6
    //   3002: ldc_w 69
    //   3005: aaload
    //   3006: ldc java/util/HashMap
    //   3008: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3013: ldc java/util/Map
    //   3015: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3018: checkcast java/util/Map
    //   3021: astore #38
    //   3023: aload #38
    //   3025: pop
    //   3026: aload #6
    //   3028: ldc_w 70
    //   3031: aaload
    //   3032: aload #38
    //   3034: ldc_w 'dataTransfer'
    //   3037: ldc_w 'dataSync'
    //   3040: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3045: pop
    //   3046: aload #6
    //   3048: ldc_w 71
    //   3051: aaload
    //   3052: aload #38
    //   3054: ldc_w 'audioPlayback'
    //   3057: ldc_w 'mediaPlayback'
    //   3060: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3065: pop
    //   3066: aload #6
    //   3068: ldc_w 72
    //   3071: aaload
    //   3072: aload #38
    //   3074: ldc_w 'audioRecording'
    //   3077: ldc_w 'mediaPlayback'
    //   3080: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3085: pop
    //   3086: aload #6
    //   3088: ldc_w 73
    //   3091: aaload
    //   3092: aload #38
    //   3094: ldc_w 'pictureInPicture'
    //   3097: ldc_w 'mediaProjection'
    //   3100: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3105: pop
    //   3106: aload #6
    //   3108: ldc_w 74
    //   3111: aaload
    //   3112: aload #38
    //   3114: ldc_w 'voip'
    //   3117: ldc_w 'phoneCall'
    //   3120: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3125: pop
    //   3126: aload #6
    //   3128: ldc_w 75
    //   3131: aaload
    //   3132: aload #38
    //   3134: ldc_w 'location'
    //   3137: ldc_w 'location'
    //   3140: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3145: pop
    //   3146: aload #6
    //   3148: ldc_w 76
    //   3151: aaload
    //   3152: aload #38
    //   3154: ldc_w 'bluetoothInteraction'
    //   3157: ldc_w 'connectedDevice'
    //   3160: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3165: pop
    //   3166: aload #6
    //   3168: ldc_w 77
    //   3171: aaload
    //   3172: aload #38
    //   3174: ldc_w 'wifiInteraction'
    //   3177: ldc_w 'connectedDevice'
    //   3180: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3185: pop
    //   3186: aload #6
    //   3188: ldc_w 78
    //   3191: aaload
    //   3192: aload #38
    //   3194: ldc_w 'multiDeviceConnection'
    //   3197: ldc_w 'connectedDevice'
    //   3200: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3205: pop
    //   3206: aload #6
    //   3208: ldc_w 79
    //   3211: aaload
    //   3212: ldc_w java/util/HashSet
    //   3215: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3220: ldc_w java/util/Set
    //   3223: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3226: checkcast java/util/Set
    //   3229: astore #39
    //   3231: aload #39
    //   3233: pop
    //   3234: aconst_null
    //   3235: astore #40
    //   3237: aload #6
    //   3239: ldc_w 80
    //   3242: aaload
    //   3243: aload_0
    //   3244: getfield backgroundModes : Ljava/util/List;
    //   3247: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3252: ldc_w java/util/Iterator
    //   3255: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3258: checkcast java/util/Iterator
    //   3261: astore #41
    //   3263: aload #41
    //   3265: invokeinterface hasNext : ()Z
    //   3270: ifeq -> 3342
    //   3273: aload #41
    //   3275: invokeinterface next : ()Ljava/lang/Object;
    //   3280: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   3283: checkcast java/lang/String
    //   3286: astore #40
    //   3288: aload #6
    //   3290: ldc_w 81
    //   3293: aaload
    //   3294: aload #38
    //   3296: aload #40
    //   3298: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3303: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   3306: checkcast java/lang/String
    //   3309: astore #42
    //   3311: aload #42
    //   3313: pop
    //   3314: aload #42
    //   3316: aconst_null
    //   3317: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3320: ifeq -> 3339
    //   3323: aload #6
    //   3325: ldc_w 82
    //   3328: aaload
    //   3329: aload #39
    //   3331: aload #42
    //   3333: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3338: pop
    //   3339: goto -> 3263
    //   3342: aload #6
    //   3344: ldc_w 83
    //   3347: aaload
    //   3348: aload #7
    //   3350: aload #17
    //   3352: ldc_w 'android:foregroundServiceType'
    //   3355: aload #6
    //   3357: ldc_w 84
    //   3360: aaload
    //   3361: ldc_w java/lang/String
    //   3364: ldc_w '|'
    //   3367: aload #6
    //   3369: ldc_w 85
    //   3372: aaload
    //   3373: ldc_w java/util/ArrayList
    //   3376: aload #39
    //   3378: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3383: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3388: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3393: pop
    //   3394: ldc 'data'
    //   3396: aload_0
    //   3397: getfield type : Ljava/lang/String;
    //   3400: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3403: ifeq -> 3744
    //   3406: aload #6
    //   3408: ldc_w 86
    //   3411: aaload
    //   3412: aload #7
    //   3414: aload #17
    //   3416: ldc_w 'android:singleUser'
    //   3419: aload_0
    //   3420: getfield multiUserShared : Ljava/lang/Boolean;
    //   3423: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3428: pop
    //   3429: aload #6
    //   3431: ldc_w 87
    //   3434: aaload
    //   3435: aload #7
    //   3437: aload #17
    //   3439: ldc_w 'android:readPermission'
    //   3442: aload_0
    //   3443: getfield readPermission : Ljava/lang/String;
    //   3446: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3451: pop
    //   3452: aload #6
    //   3454: ldc_w 88
    //   3457: aaload
    //   3458: aload #7
    //   3460: aload #17
    //   3462: ldc_w 'android:writePermission'
    //   3465: aload_0
    //   3466: getfield writePermission : Ljava/lang/String;
    //   3469: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3474: pop
    //   3475: aload_0
    //   3476: getfield grantPermission : Ljava/lang/Boolean;
    //   3479: aconst_null
    //   3480: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3483: ifeq -> 3520
    //   3486: aload #6
    //   3488: ldc_w 89
    //   3491: aaload
    //   3492: aload #7
    //   3494: aload #17
    //   3496: ldc_w 'android:grantUriPermissions'
    //   3499: aload #6
    //   3501: ldc_w 90
    //   3504: aaload
    //   3505: aload_0
    //   3506: getfield grantPermission : Ljava/lang/Boolean;
    //   3509: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3514: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3519: pop
    //   3520: aload_0
    //   3521: getfield uriPermission : Lcom/huawei/ohos/build/shell/UriPermissionOptions;
    //   3524: aconst_null
    //   3525: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3528: ifeq -> 3744
    //   3531: aload #6
    //   3533: ldc_w 91
    //   3536: aaload
    //   3537: ldc groovy/util/Node
    //   3539: aload #17
    //   3541: ldc_w 'grant-uri-permission'
    //   3544: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3549: ldc groovy/util/Node
    //   3551: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3554: checkcast groovy/util/Node
    //   3557: astore #43
    //   3559: aload #43
    //   3561: pop
    //   3562: aload #6
    //   3564: ldc_w 92
    //   3567: aaload
    //   3568: aload_0
    //   3569: getfield uriPermission : Lcom/huawei/ohos/build/shell/UriPermissionOptions;
    //   3572: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3577: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   3580: checkcast java/lang/String
    //   3583: astore #44
    //   3585: aload #44
    //   3587: pop
    //   3588: aconst_null
    //   3589: astore #45
    //   3591: aload #45
    //   3593: pop
    //   3594: aload #6
    //   3596: ldc_w 93
    //   3599: aaload
    //   3600: aload_0
    //   3601: getfield uriPermission : Lcom/huawei/ohos/build/shell/UriPermissionOptions;
    //   3604: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3609: aconst_null
    //   3610: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3613: ifeq -> 3649
    //   3616: aload #6
    //   3618: ldc_w 94
    //   3621: aaload
    //   3622: aload_0
    //   3623: getfield uriPermission : Lcom/huawei/ohos/build/shell/UriPermissionOptions;
    //   3626: invokeinterface callGetProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3631: astore #46
    //   3633: aload #46
    //   3635: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   3638: checkcast java/lang/String
    //   3641: astore #45
    //   3643: aload #46
    //   3645: pop
    //   3646: goto -> 3670
    //   3649: aload #6
    //   3651: ldc_w 95
    //   3654: aaload
    //   3655: ldc_w org/gradle/api/GradleException
    //   3658: ldc_w 'Invalid config.json file. The uriPermission path is null.'
    //   3661: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3666: checkcast java/lang/Throwable
    //   3669: athrow
    //   3670: ldc_w 'android:path'
    //   3673: astore #47
    //   3675: aload #47
    //   3677: pop
    //   3678: aload #44
    //   3680: ldc_w 'prefix'
    //   3683: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3686: ifeq -> 3701
    //   3689: ldc_w 'android:pathPrefix'
    //   3692: astore #48
    //   3694: aload #48
    //   3696: astore #47
    //   3698: aload #48
    //   3700: pop
    //   3701: aload #44
    //   3703: ldc_w 'pattern'
    //   3706: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3709: ifeq -> 3724
    //   3712: ldc_w 'android:pathPattern'
    //   3715: astore #49
    //   3717: aload #49
    //   3719: astore #47
    //   3721: aload #49
    //   3723: pop
    //   3724: aload #6
    //   3726: ldc_w 96
    //   3729: aaload
    //   3730: aload #7
    //   3732: aload #43
    //   3734: aload #47
    //   3736: aload #45
    //   3738: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3743: pop
    //   3744: aload #6
    //   3746: ldc_w 97
    //   3749: aaload
    //   3750: aload #7
    //   3752: aload #17
    //   3754: ldc_w 'android:process'
    //   3757: aload_0
    //   3758: getfield process : Ljava/lang/String;
    //   3761: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3766: pop
    //   3767: aload_0
    //   3768: getfield configChanges : Ljava/util/List;
    //   3771: aconst_null
    //   3772: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   3775: ifeq -> 4172
    //   3778: aload #6
    //   3780: ldc_w 98
    //   3783: aaload
    //   3784: ldc java/util/HashMap
    //   3786: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3791: ldc java/util/Map
    //   3793: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3796: checkcast java/util/Map
    //   3799: astore #50
    //   3801: aload #50
    //   3803: pop
    //   3804: aload #6
    //   3806: ldc_w 99
    //   3809: aaload
    //   3810: aload #50
    //   3812: ldc_w 'mcc'
    //   3815: ldc_w 'mcc'
    //   3818: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3823: pop
    //   3824: aload #6
    //   3826: ldc_w 100
    //   3829: aaload
    //   3830: aload #50
    //   3832: ldc_w 'mnc'
    //   3835: ldc_w 'mnc'
    //   3838: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3843: pop
    //   3844: aload #6
    //   3846: ldc_w 101
    //   3849: aaload
    //   3850: aload #50
    //   3852: ldc_w 'locale'
    //   3855: ldc_w 'locale'
    //   3858: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3863: pop
    //   3864: aload #6
    //   3866: ldc_w 102
    //   3869: aaload
    //   3870: aload #50
    //   3872: ldc_w 'layout'
    //   3875: ldc_w 'screenLayout'
    //   3878: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3883: pop
    //   3884: aload #6
    //   3886: ldc_w 103
    //   3889: aaload
    //   3890: aload #50
    //   3892: ldc_w 'fontSize'
    //   3895: ldc_w 'fontScale'
    //   3898: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3903: pop
    //   3904: aload #6
    //   3906: ldc_w 104
    //   3909: aaload
    //   3910: aload #50
    //   3912: ldc_w 'orientation'
    //   3915: ldc_w 'orientation'
    //   3918: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3923: pop
    //   3924: aload #6
    //   3926: ldc_w 105
    //   3929: aaload
    //   3930: aload #50
    //   3932: ldc_w 'density'
    //   3935: ldc_w 'density'
    //   3938: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3943: pop
    //   3944: aload #6
    //   3946: ldc_w 106
    //   3949: aaload
    //   3950: aload #50
    //   3952: ldc_w 'size'
    //   3955: ldc_w 'screenSize'
    //   3958: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3963: pop
    //   3964: aload #6
    //   3966: ldc_w 107
    //   3969: aaload
    //   3970: aload #50
    //   3972: ldc_w 'smallestSize'
    //   3975: ldc_w 'smallestScreenSize'
    //   3978: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3983: pop
    //   3984: aload #6
    //   3986: ldc_w 108
    //   3989: aaload
    //   3990: ldc_w java/util/HashSet
    //   3993: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3998: ldc_w java/util/Set
    //   4001: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4004: checkcast java/util/Set
    //   4007: astore #51
    //   4009: aload #51
    //   4011: pop
    //   4012: aconst_null
    //   4013: astore #52
    //   4015: aload #6
    //   4017: ldc_w 109
    //   4020: aaload
    //   4021: aload_0
    //   4022: getfield configChanges : Ljava/util/List;
    //   4025: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4030: ldc_w java/util/Iterator
    //   4033: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4036: checkcast java/util/Iterator
    //   4039: astore #53
    //   4041: aload #53
    //   4043: invokeinterface hasNext : ()Z
    //   4048: ifeq -> 4120
    //   4051: aload #53
    //   4053: invokeinterface next : ()Ljava/lang/Object;
    //   4058: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   4061: checkcast java/lang/String
    //   4064: astore #52
    //   4066: aload #6
    //   4068: ldc_w 110
    //   4071: aaload
    //   4072: aload #50
    //   4074: aload #52
    //   4076: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4081: invokestatic castToString : (Ljava/lang/Object;)Ljava/lang/String;
    //   4084: checkcast java/lang/String
    //   4087: astore #54
    //   4089: aload #54
    //   4091: pop
    //   4092: aload #54
    //   4094: aconst_null
    //   4095: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4098: ifeq -> 4117
    //   4101: aload #6
    //   4103: ldc_w 111
    //   4106: aaload
    //   4107: aload #51
    //   4109: aload #54
    //   4111: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4116: pop
    //   4117: goto -> 4041
    //   4120: aload #6
    //   4122: ldc_w 112
    //   4125: aaload
    //   4126: aload #7
    //   4128: aload #17
    //   4130: ldc_w 'android:configChanges'
    //   4133: aload #6
    //   4135: ldc_w 113
    //   4138: aaload
    //   4139: ldc_w java/lang/String
    //   4142: ldc_w '|'
    //   4145: aload #6
    //   4147: ldc_w 114
    //   4150: aaload
    //   4151: ldc_w java/util/ArrayList
    //   4154: aload #51
    //   4156: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4161: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4166: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4171: pop
    //   4172: invokestatic isOrigZ : ()Z
    //   4175: ifeq -> 4193
    //   4178: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   4181: ifne -> 4193
    //   4184: invokestatic disabledStandardMetaClass : ()Z
    //   4187: ifne -> 4193
    //   4190: goto -> 4270
    //   4193: aload_0
    //   4194: getfield targetAbility : Ljava/lang/String;
    //   4197: aconst_null
    //   4198: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4201: ifeq -> 4220
    //   4204: aload_0
    //   4205: getfield targetAbility : Ljava/lang/String;
    //   4208: ldc ''
    //   4210: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4213: ifeq -> 4220
    //   4216: iconst_1
    //   4217: goto -> 4221
    //   4220: iconst_0
    //   4221: ifeq -> 4240
    //   4224: aload_0
    //   4225: getfield type : Ljava/lang/String;
    //   4228: ldc 'page'
    //   4230: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4233: ifeq -> 4240
    //   4236: iconst_1
    //   4237: goto -> 4241
    //   4240: iconst_0
    //   4241: ifeq -> 4267
    //   4244: aload #6
    //   4246: ldc_w 115
    //   4249: aaload
    //   4250: aload #7
    //   4252: aload #17
    //   4254: ldc_w 'android:targetActivity'
    //   4257: aload_0
    //   4258: getfield targetShellName : Ljava/lang/String;
    //   4261: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4266: pop
    //   4267: goto -> 4344
    //   4270: aload_0
    //   4271: getfield targetAbility : Ljava/lang/String;
    //   4274: aconst_null
    //   4275: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4278: ifeq -> 4297
    //   4281: aload_0
    //   4282: getfield targetAbility : Ljava/lang/String;
    //   4285: ldc ''
    //   4287: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4290: ifeq -> 4297
    //   4293: iconst_1
    //   4294: goto -> 4298
    //   4297: iconst_0
    //   4298: ifeq -> 4317
    //   4301: aload_0
    //   4302: getfield type : Ljava/lang/String;
    //   4305: ldc 'page'
    //   4307: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4310: ifeq -> 4317
    //   4313: iconst_1
    //   4314: goto -> 4318
    //   4317: iconst_0
    //   4318: ifeq -> 4344
    //   4321: aload #6
    //   4323: ldc_w 116
    //   4326: aaload
    //   4327: aload #7
    //   4329: aload #17
    //   4331: ldc_w 'android:targetActivity'
    //   4334: aload_0
    //   4335: getfield targetShellName : Ljava/lang/String;
    //   4338: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4343: pop
    //   4344: ldc 'page'
    //   4346: aload_0
    //   4347: getfield type : Ljava/lang/String;
    //   4350: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4353: ifeq -> 5001
    //   4356: aload_0
    //   4357: getfield resizeable : Ljava/lang/Boolean;
    //   4360: aconst_null
    //   4361: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4364: ifeq -> 4374
    //   4367: iconst_1
    //   4368: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4371: goto -> 4378
    //   4374: aload_0
    //   4375: getfield resizeable : Ljava/lang/Boolean;
    //   4378: astore #55
    //   4380: aload #55
    //   4382: pop
    //   4383: aload #6
    //   4385: ldc_w 117
    //   4388: aaload
    //   4389: aload #7
    //   4391: aload #17
    //   4393: ldc_w 'android:resizeableActivity'
    //   4396: aload #6
    //   4398: ldc_w 118
    //   4401: aaload
    //   4402: aload #55
    //   4404: invokeinterface call : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4409: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4414: pop
    //   4415: aload #6
    //   4417: ldc_w 119
    //   4420: aaload
    //   4421: aload #7
    //   4423: aload #17
    //   4425: ldc_w 'android:taskAffinity'
    //   4428: aload_0
    //   4429: getfield mission : Ljava/lang/String;
    //   4432: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4437: pop
    //   4438: aload_0
    //   4439: getfield launchType : Ljava/lang/String;
    //   4442: ldc_w 'standard'
    //   4445: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4448: ifeq -> 4476
    //   4451: aload #6
    //   4453: ldc_w 120
    //   4456: aaload
    //   4457: aload #7
    //   4459: aload #17
    //   4461: ldc_w 'android:launchMode'
    //   4464: ldc_w 'standard'
    //   4467: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4472: pop
    //   4473: goto -> 4549
    //   4476: aload_0
    //   4477: getfield launchType : Ljava/lang/String;
    //   4480: ldc_w 'singleton'
    //   4483: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4486: ifeq -> 4514
    //   4489: aload #6
    //   4491: ldc_w 121
    //   4494: aaload
    //   4495: aload #7
    //   4497: aload #17
    //   4499: ldc_w 'android:launchMode'
    //   4502: ldc_w 'singleInstance'
    //   4505: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4510: pop
    //   4511: goto -> 4549
    //   4514: aload_0
    //   4515: getfield launchType : Ljava/lang/String;
    //   4518: ldc_w 'singleMission'
    //   4521: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4524: ifeq -> 4549
    //   4527: aload #6
    //   4529: ldc_w 122
    //   4532: aaload
    //   4533: aload #7
    //   4535: aload #17
    //   4537: ldc_w 'android:launchMode'
    //   4540: ldc_w 'singleTask'
    //   4543: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4548: pop
    //   4549: aload_0
    //   4550: getfield supportPipMode : Ljava/lang/Boolean;
    //   4553: aconst_null
    //   4554: invokestatic compareNotEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4557: ifeq -> 4583
    //   4560: aload #6
    //   4562: ldc_w 123
    //   4565: aaload
    //   4566: aload #7
    //   4568: aload #17
    //   4570: ldc_w 'android:supportsPictureInPicture'
    //   4573: aload_0
    //   4574: getfield supportPipMode : Ljava/lang/Boolean;
    //   4577: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4582: pop
    //   4583: invokestatic isOrigZ : ()Z
    //   4586: ifeq -> 4604
    //   4589: getstatic com/huawei/ohos/build/shell/AbilitiesOptions.__$stMC : Z
    //   4592: ifne -> 4604
    //   4595: invokestatic disabledStandardMetaClass : ()Z
    //   4598: ifne -> 4604
    //   4601: goto -> 4804
    //   4604: aload_0
    //   4605: getfield formsEnabled : Ljava/lang/Boolean;
    //   4608: iconst_1
    //   4609: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4612: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4615: ifne -> 4632
    //   4618: aload_0
    //   4619: getfield formEnabled : Ljava/lang/Boolean;
    //   4622: iconst_1
    //   4623: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4626: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4629: ifeq -> 4636
    //   4632: iconst_1
    //   4633: goto -> 4637
    //   4636: iconst_0
    //   4637: ifeq -> 4656
    //   4640: aload_0
    //   4641: getfield type : Ljava/lang/String;
    //   4644: ldc 'page'
    //   4646: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4649: ifeq -> 4656
    //   4652: iconst_1
    //   4653: goto -> 4657
    //   4656: iconst_0
    //   4657: ifeq -> 4801
    //   4660: aload #6
    //   4662: ldc_w 124
    //   4665: aaload
    //   4666: ldc java/util/HashMap
    //   4668: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4673: ldc java/util/Map
    //   4675: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4678: checkcast java/util/Map
    //   4681: astore #56
    //   4683: aload #56
    //   4685: pop
    //   4686: aload #6
    //   4688: ldc_w 125
    //   4691: aaload
    //   4692: ldc groovy/util/Node
    //   4694: aload_1
    //   4695: ldc 'service'
    //   4697: aload #56
    //   4699: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4704: ldc groovy/util/Node
    //   4706: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4709: checkcast groovy/util/Node
    //   4712: astore #57
    //   4714: aload #57
    //   4716: pop
    //   4717: aload #6
    //   4719: ldc_w 126
    //   4722: aaload
    //   4723: aload #7
    //   4725: aload #57
    //   4727: ldc_w 'android:name'
    //   4730: aload_0
    //   4731: getfield shellFormName : Ljava/lang/String;
    //   4734: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4739: pop
    //   4740: aload_0
    //   4741: getfield visible : Ljava/lang/Boolean;
    //   4744: iconst_1
    //   4745: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4748: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4751: ifeq -> 4779
    //   4754: aload #6
    //   4756: ldc_w 127
    //   4759: aaload
    //   4760: aload #7
    //   4762: aload #57
    //   4764: ldc_w 'android:exported'
    //   4767: ldc_w 'true'
    //   4770: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4775: pop
    //   4776: goto -> 4801
    //   4779: aload #6
    //   4781: ldc_w 128
    //   4784: aaload
    //   4785: aload #7
    //   4787: aload #57
    //   4789: ldc_w 'android:exported'
    //   4792: ldc_w 'false'
    //   4795: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4800: pop
    //   4801: goto -> 5001
    //   4804: aload_0
    //   4805: getfield formsEnabled : Ljava/lang/Boolean;
    //   4808: iconst_1
    //   4809: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4812: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4815: ifne -> 4832
    //   4818: aload_0
    //   4819: getfield formEnabled : Ljava/lang/Boolean;
    //   4822: iconst_1
    //   4823: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4826: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4829: ifeq -> 4836
    //   4832: iconst_1
    //   4833: goto -> 4837
    //   4836: iconst_0
    //   4837: ifeq -> 4856
    //   4840: aload_0
    //   4841: getfield type : Ljava/lang/String;
    //   4844: ldc 'page'
    //   4846: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4849: ifeq -> 4856
    //   4852: iconst_1
    //   4853: goto -> 4857
    //   4856: iconst_0
    //   4857: ifeq -> 5001
    //   4860: aload #6
    //   4862: ldc_w 129
    //   4865: aaload
    //   4866: ldc java/util/HashMap
    //   4868: invokeinterface callConstructor : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4873: ldc java/util/Map
    //   4875: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4878: checkcast java/util/Map
    //   4881: astore #58
    //   4883: aload #58
    //   4885: pop
    //   4886: aload #6
    //   4888: ldc_w 130
    //   4891: aaload
    //   4892: ldc groovy/util/Node
    //   4894: aload_1
    //   4895: ldc 'service'
    //   4897: aload #58
    //   4899: invokeinterface callConstructor : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4904: ldc groovy/util/Node
    //   4906: invokestatic castToType : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   4909: checkcast groovy/util/Node
    //   4912: astore #59
    //   4914: aload #59
    //   4916: pop
    //   4917: aload #6
    //   4919: ldc_w 131
    //   4922: aaload
    //   4923: aload #7
    //   4925: aload #59
    //   4927: ldc_w 'android:name'
    //   4930: aload_0
    //   4931: getfield shellFormName : Ljava/lang/String;
    //   4934: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4939: pop
    //   4940: aload_0
    //   4941: getfield visible : Ljava/lang/Boolean;
    //   4944: iconst_1
    //   4945: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4948: invokestatic compareEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   4951: ifeq -> 4979
    //   4954: aload #6
    //   4956: ldc_w 132
    //   4959: aaload
    //   4960: aload #7
    //   4962: aload #59
    //   4964: ldc_w 'android:exported'
    //   4967: ldc_w 'true'
    //   4970: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   4975: pop
    //   4976: goto -> 5001
    //   4979: aload #6
    //   4981: ldc_w 133
    //   4984: aaload
    //   4985: aload #7
    //   4987: aload #59
    //   4989: ldc_w 'android:exported'
    //   4992: ldc_w 'false'
    //   4995: invokeinterface call : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   5000: pop
    //   5001: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #129	-> 5
    //   #130	-> 30
    //   #131	-> 55
    //   #132	-> 80
    //   #133	-> 105
    //   #134	-> 112
    //   #135	-> 164
    //   #136	-> 175
    //   #134	-> 178
    //   #135	-> 209
    //   #136	-> 220
    //   #137	-> 220
    //   #138	-> 273
    //   #139	-> 284
    //   #137	-> 287
    //   #138	-> 319
    //   #139	-> 330
    //   #140	-> 330
    //   #141	-> 342
    //   #142	-> 353
    //   #144	-> 353
    //   #146	-> 383
    //   #147	-> 465
    //   #148	-> 486
    //   #146	-> 489
    //   #147	-> 550
    //   #148	-> 571
    //   #151	-> 571
    //   #152	-> 609
    //   #153	-> 628
    //   #155	-> 628
    //   #156	-> 649
    //   #158	-> 670
    //   #159	-> 752
    //   #160	-> 773
    //   #158	-> 776
    //   #159	-> 837
    //   #160	-> 858
    //   #162	-> 858
    //   #163	-> 919
    //   #164	-> 965
    //   #165	-> 1020
    //   #166	-> 1040
    //   #167	-> 1043
    //   #162	-> 1046
    //   #163	-> 1087
    //   #164	-> 1133
    //   #165	-> 1188
    //   #166	-> 1208
    //   #167	-> 1211
    //   #169	-> 1211
    //   #170	-> 1241
    //   #172	-> 1262
    //   #173	-> 1379
    //   #174	-> 1392
    //   #175	-> 1414
    //   #176	-> 1417
    //   #177	-> 1440
    //   #178	-> 1440
    //   #172	-> 1443
    //   #173	-> 1539
    //   #174	-> 1552
    //   #175	-> 1574
    //   #176	-> 1577
    //   #177	-> 1600
    //   #178	-> 1600
    //   #180	-> 1600
    //   #181	-> 1612
    //   #182	-> 1640
    //   #183	-> 1694
    //   #184	-> 1703
    //   #185	-> 1719
    //   #186	-> 1719
    //   #187	-> 1722
    //   #188	-> 1774
    //   #190	-> 1774
    //   #191	-> 1785
    //   #192	-> 1842
    //   #193	-> 1851
    //   #194	-> 1878
    //   #195	-> 1905
    //   #196	-> 1991
    //   #197	-> 2012
    //   #198	-> 2033
    //   #199	-> 2033
    //   #200	-> 2054
    //   #201	-> 2075
    //   #202	-> 2075
    //   #203	-> 2075
    //   #204	-> 2093
    //   #205	-> 2093
    //   #206	-> 2096
    //   #208	-> 2096
    //   #209	-> 2154
    //   #210	-> 2213
    //   #211	-> 2234
    //   #212	-> 2237
    //   #213	-> 2281
    //   #214	-> 2314
    //   #215	-> 2346
    //   #216	-> 2369
    //   #217	-> 2369
    //   #208	-> 2372
    //   #209	-> 2403
    //   #210	-> 2462
    //   #211	-> 2483
    //   #212	-> 2486
    //   #213	-> 2530
    //   #214	-> 2563
    //   #215	-> 2595
    //   #216	-> 2617
    //   #217	-> 2617
    //   #218	-> 2617
    //   #219	-> 2690
    //   #220	-> 2713
    //   #218	-> 2716
    //   #219	-> 2768
    //   #220	-> 2791
    //   #221	-> 2791
    //   #222	-> 2876
    //   #223	-> 2899
    //   #221	-> 2902
    //   #222	-> 2966
    //   #223	-> 2989
    //   #225	-> 2989
    //   #226	-> 3000
    //   #227	-> 3026
    //   #228	-> 3046
    //   #229	-> 3066
    //   #230	-> 3086
    //   #231	-> 3106
    //   #232	-> 3126
    //   #233	-> 3146
    //   #234	-> 3166
    //   #235	-> 3186
    //   #236	-> 3206
    //   #237	-> 3234
    //   #238	-> 3288
    //   #239	-> 3314
    //   #240	-> 3323
    //   #241	-> 3339
    //   #242	-> 3339
    //   #243	-> 3342
    //   #244	-> 3394
    //   #247	-> 3394
    //   #248	-> 3406
    //   #249	-> 3429
    //   #250	-> 3452
    //   #251	-> 3475
    //   #252	-> 3486
    //   #253	-> 3520
    //   #255	-> 3520
    //   #256	-> 3531
    //   #257	-> 3562
    //   #258	-> 3588
    //   #259	-> 3594
    //   #260	-> 3616
    //   #261	-> 3646
    //   #262	-> 3649
    //   #263	-> 3670
    //   #264	-> 3670
    //   #265	-> 3678
    //   #266	-> 3689
    //   #267	-> 3701
    //   #268	-> 3701
    //   #269	-> 3712
    //   #270	-> 3724
    //   #271	-> 3724
    //   #272	-> 3744
    //   #273	-> 3744
    //   #275	-> 3744
    //   #277	-> 3767
    //   #278	-> 3778
    //   #279	-> 3804
    //   #280	-> 3824
    //   #281	-> 3844
    //   #282	-> 3864
    //   #283	-> 3884
    //   #284	-> 3904
    //   #285	-> 3924
    //   #286	-> 3944
    //   #287	-> 3964
    //   #288	-> 3984
    //   #289	-> 4012
    //   #290	-> 4066
    //   #291	-> 4092
    //   #292	-> 4101
    //   #293	-> 4117
    //   #294	-> 4117
    //   #295	-> 4120
    //   #296	-> 4172
    //   #298	-> 4172
    //   #299	-> 4244
    //   #300	-> 4267
    //   #298	-> 4270
    //   #299	-> 4321
    //   #300	-> 4344
    //   #302	-> 4344
    //   #303	-> 4356
    //   #304	-> 4383
    //   #306	-> 4415
    //   #308	-> 4438
    //   #309	-> 4451
    //   #310	-> 4473
    //   #310	-> 4476
    //   #311	-> 4489
    //   #312	-> 4511
    //   #312	-> 4514
    //   #313	-> 4527
    //   #314	-> 4549
    //   #315	-> 4549
    //   #316	-> 4560
    //   #317	-> 4583
    //   #318	-> 4583
    //   #319	-> 4660
    //   #320	-> 4686
    //   #321	-> 4717
    //   #322	-> 4740
    //   #323	-> 4754
    //   #324	-> 4776
    //   #325	-> 4779
    //   #326	-> 4801
    //   #327	-> 4801
    //   #318	-> 4804
    //   #319	-> 4860
    //   #320	-> 4886
    //   #321	-> 4917
    //   #322	-> 4940
    //   #323	-> 4954
    //   #324	-> 4976
    //   #325	-> 4979
    //   #326	-> 5001
    //   #327	-> 5001
    //   #328	-> 5001
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5001	0	this	Lcom/huawei/ohos/build/shell/AbilitiesOptions;
    //   0	5001	1	parent	Lgroovy/util/Node;
    //   0	5001	2	moduleType	Ljava/lang/String;
    //   0	5001	3	project	Lorg/gradle/api/Project;
    //   0	5001	4	configInfo	Lcom/huawei/ohos/build/data/ConfigInfo;
    //   0	5001	5	pathInfo	Lcom/huawei/ohos/build/data/PathInfo;
    //   27	4974	7	handler	Lcom/huawei/ohos/build/utils/XmlNodeHandler;
    //   52	4949	8	abilityInfoMap	Ljava/util/Map;
    //   77	4924	9	intentFilterMap	Ljava/util/Map;
    //   102	4899	10	intentFilterDataMap	Ljava/util/Map;
    //   109	4892	11	componentName	Ljava/lang/String;
    //   380	4621	17	componentNode	Lgroovy/util/Node;
    //   962	81	18	mapList	Ljava/util/List;
    //   968	75	19	customizeDataOptions	Lcom/huawei/ohos/build/shell/metadata/CustomizeDataOptions;
    //   1130	81	21	mapList	Ljava/util/List;
    //   1136	75	22	customizeDataOptions	Lcom/huawei/ohos/build/shell/metadata/CustomizeDataOptions;
    //   1238	3763	24	shellActivity	Ljava/lang/String;
    //   1637	137	25	permissionsSet	Ljava/util/Set;
    //   1643	79	26	permission	Ljava/lang/String;
    //   1788	308	28	skillInfo	Lcom/huawei/ohos/build/shell/SkillsOptions;
    //   1875	218	30	myActions	Ljava/util/List;
    //   1902	191	31	myEntities	Ljava/util/List;
    //   2210	24	32	authorities	Ljava/lang/String;
    //   2311	58	33	intentFilter	Lgroovy/util/Node;
    //   2343	26	34	intentFilterData	Lgroovy/util/Node;
    //   2459	24	35	authorities	Ljava/lang/String;
    //   2560	57	36	intentFilter	Lgroovy/util/Node;
    //   2592	25	37	intentFilterData	Lgroovy/util/Node;
    //   3023	371	38	backgroundModesMap	Ljava/util/Map;
    //   3231	163	39	backModeSet	Ljava/util/Set;
    //   3237	105	40	str	Ljava/lang/String;
    //   3311	28	42	otherStr	Ljava/lang/String;
    //   3559	185	43	grantUriPermission	Lgroovy/util/Node;
    //   3585	159	44	mode	Ljava/lang/String;
    //   3591	153	45	path	Ljava/lang/String;
    //   3675	69	47	myPathMode	Ljava/lang/String;
    //   3801	371	50	configChangeMap	Ljava/util/Map;
    //   4009	163	51	configChangeSet	Ljava/util/Set;
    //   4015	105	52	str	Ljava/lang/String;
    //   4089	28	54	str2	Ljava/lang/String;
    //   4380	621	55	resizeable	Ljava/lang/Object;
    //   4683	118	56	formServiceMap	Ljava/util/Map;
    //   4714	87	57	formServiceNode	Lgroovy/util/Node;
    //   4883	118	58	formServiceMap	Ljava/util/Map;
    //   4914	87	59	formServiceNode	Lgroovy/util/Node;
  }
  
  public Integer getIconId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.iconId;
  }
  
  public void setIconId(Integer iconId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = iconId;
    this.iconId = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getLabelId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.labelId;
  }
  
  public void setLabelId(Integer labelId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = labelId;
    this.labelId = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public Integer getDescriptionId() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.descriptionId;
  }
  
  public void setDescriptionId(Integer descriptionId) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Integer integer = descriptionId;
    this.descriptionId = (Integer)ScriptBytecodeAdapter.castToType(integer, Integer.class);
  }
  
  public String getName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.name;
  }
  
  public void setName(String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = name;
    this.name = ShortTypeHandling.castToString(str);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      setAbilityShellRealName("");
      null;
      return;
    } 
    arrayOfCallSite[134].callCurrent(this, "");
  }
  
  public String getDescription() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.description;
  }
  
  public void setDescription(String description) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = description;
    this.description = ShortTypeHandling.castToString(str);
  }
  
  public String getIcon() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.icon;
  }
  
  public void setIcon(String icon) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = icon;
    this.icon = ShortTypeHandling.castToString(str);
  }
  
  public String getLabel() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.label;
  }
  
  public void setLabel(String label) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = label;
    this.label = ShortTypeHandling.castToString(str);
  }
  
  public String getTheme() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.theme;
  }
  
  public void setTheme(String theme) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = theme;
    this.theme = ShortTypeHandling.castToString(str);
  }
  
  public String getType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.type;
  }
  
  public void setType(String type) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = type;
    this.type = ShortTypeHandling.castToString(str);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      setShellName("");
      null;
      return;
    } 
    arrayOfCallSite[135].callCurrent(this, "");
  }
  
  public String getUri() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.uri;
  }
  
  public Boolean getResizeable() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.resizeable;
  }
  
  public void setResizeable(Boolean resizeable) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = resizeable;
    this.resizeable = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public void setUri(String uri) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = uri;
    this.uri = ShortTypeHandling.castToString(str);
  }
  
  public String getLaunchType() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.launchType;
  }
  
  public void setLaunchType(String launchType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = launchType;
    this.launchType = ShortTypeHandling.castToString(str);
  }
  
  public MetaDataOptions getMetaData() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.metaData;
  }
  
  public void setMetaData(MetaDataOptions metaData) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    MetaDataOptions metaDataOptions = metaData;
    this.metaData = (MetaDataOptions)ScriptBytecodeAdapter.castToType(metaDataOptions, MetaDataOptions.class);
  }
  
  public String getOrientation() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.orientation;
  }
  
  public void setOrientation(String orientation) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = orientation;
    this.orientation = ShortTypeHandling.castToString(str);
  }
  
  public List<String> getPermissions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.permissions;
  }
  
  public void setPermissions(List permissions) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = permissions;
    this.permissions = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public Boolean getVisible() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.visible;
  }
  
  public void setVisible(Boolean visible) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = visible;
    this.visible = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public List<SkillsOptions> getSkills() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.skills;
  }
  
  public void setSkills(List skills) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = skills;
    this.skills = (List<SkillsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public List<String> getConfigChanges() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.configChanges;
  }
  
  public void setConfigChanges(List configChanges) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = configChanges;
    this.configChanges = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public Boolean getDirectLaunch() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.directLaunch;
  }
  
  public void setDirectLaunch(Boolean directLaunch) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = directLaunch;
    this.directLaunch = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getProcess() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.process;
  }
  
  public void setProcess(String process) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = process;
    this.process = ShortTypeHandling.castToString(str);
  }
  
  public List<String> getBackgroundModes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.backgroundModes;
  }
  
  public void setBackgroundModes(List backgroundModes) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = backgroundModes;
    this.backgroundModes = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public Boolean getGrantPermission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.grantPermission;
  }
  
  public void setGrantPermission(Boolean grantPermission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = grantPermission;
    this.grantPermission = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getReadPermission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.readPermission;
  }
  
  public void setReadPermission(String readPermission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = readPermission;
    this.readPermission = ShortTypeHandling.castToString(str);
  }
  
  public String getWritePermission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.writePermission;
  }
  
  public void setWritePermission(String writePermission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = writePermission;
    this.writePermission = ShortTypeHandling.castToString(str);
  }
  
  public UriPermissionOptions getUriPermission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.uriPermission;
  }
  
  public void setUriPermission(UriPermissionOptions uriPermission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    UriPermissionOptions uriPermissionOptions = uriPermission;
    this.uriPermission = (UriPermissionOptions)ScriptBytecodeAdapter.castToType(uriPermissionOptions, UriPermissionOptions.class);
  }
  
  public Boolean getMultiUserShared() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.multiUserShared;
  }
  
  public void setMultiUserShared(Boolean multiUserShared) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = multiUserShared;
    this.multiUserShared = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public String getMission() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mission;
  }
  
  public void setMission(String mission) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = mission;
    this.mission = ShortTypeHandling.castToString(str);
  }
  
  public String getTargetAbility() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.targetAbility;
  }
  
  public void setTargetAbility(String targetAbility) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = targetAbility;
    this.targetAbility = ShortTypeHandling.castToString(str);
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      setTargetShellName("");
      null;
      return;
    } 
    arrayOfCallSite[136].callCurrent(this, "");
  }
  
  public Boolean getSupportPipMode() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.supportPipMode;
  }
  
  public void setSupportPipMode(Boolean supportPipMode) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Boolean bool = supportPipMode;
    this.supportPipMode = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
  }
  
  public Map getMergeRule() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.mergeRule;
  }
  
  public void setMergeRule(Map mergeRule) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Map map = mergeRule;
    this.mergeRule = (Map)ScriptBytecodeAdapter.castToType(map, Map.class);
  }
  
  public String getShellName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shellName;
  }
  
  public void setShellName(String shellName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (ScriptBytecodeAdapter.compareNotEqual(getType(), null)) {
        String str = getType();
        if (ScriptBytecodeAdapter.isCase(str, "page")) {
          Object object = arrayOfCallSite[149].call(getAbilityShellRealName(), "ShellActivity");
          this.shellName = ShortTypeHandling.castToString(object);
          arrayOfCallSite[150].callCurrent(this, arrayOfCallSite[151].call(getAbilityShellRealName(), "ShellServiceForm"));
        } else if (ScriptBytecodeAdapter.isCase(str, "CA") || ScriptBytecodeAdapter.isCase(str, "service")) {
          Object object = arrayOfCallSite[152].call(getAbilityShellRealName(), "ShellService");
          this.shellName = ShortTypeHandling.castToString(object);
        } else if (ScriptBytecodeAdapter.isCase(str, "data")) {
          Object object = arrayOfCallSite[153].call(getAbilityShellRealName(), "ShellProvider");
          this.shellName = ShortTypeHandling.castToString(object);
        } else {
          String str1 = getAbilityShellRealName();
          this.shellName = ShortTypeHandling.castToString(str1);
        } 
      } 
      return;
    } 
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[137].callCurrent(this), null)) {
      Object object = arrayOfCallSite[138].callCurrent(this);
      if (ScriptBytecodeAdapter.isCase(object, "page")) {
        Object object1 = arrayOfCallSite[139].call(arrayOfCallSite[140].callCurrent(this), "ShellActivity");
        this.shellName = ShortTypeHandling.castToString(object1);
        arrayOfCallSite[141].callCurrent(this, arrayOfCallSite[142].call(arrayOfCallSite[143].callCurrent(this), "ShellServiceForm"));
      } else if (ScriptBytecodeAdapter.isCase(object, "CA") || ScriptBytecodeAdapter.isCase(object, "service")) {
        Object object1 = arrayOfCallSite[144].call(arrayOfCallSite[145].callCurrent(this), "ShellService");
        this.shellName = ShortTypeHandling.castToString(object1);
      } else if (ScriptBytecodeAdapter.isCase(object, "data")) {
        Object object1 = arrayOfCallSite[146].call(arrayOfCallSite[147].callCurrent(this), "ShellProvider");
        this.shellName = ShortTypeHandling.castToString(object1);
      } else {
        Object object1 = arrayOfCallSite[148].callCurrent(this);
        this.shellName = ShortTypeHandling.castToString(object1);
      } 
    } 
  }
  
  public String getTargetShellName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.targetShellName;
  }
  
  public void setTargetShellName(String targetShellName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      Object object1 = arrayOfCallSite[156].call(getTargetAbility(), "ShellActivity");
      this.targetShellName = ShortTypeHandling.castToString(object1);
      return;
    } 
    Object object = arrayOfCallSite[154].call(arrayOfCallSite[155].callCurrent(this), "ShellActivity");
    this.targetShellName = ShortTypeHandling.castToString(object);
  }
  
  public String getShellFormName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.shellFormName;
  }
  
  public void setShellFormName(String shellFormName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = shellFormName;
    this.shellFormName = ShortTypeHandling.castToString(str);
  }
  
  public String getAbilityShellRealName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.abilityShellRealName;
  }
  
  public void setAbilityShellRealName(String abilityShellRealName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      String str1 = ScriptBytecodeAdapter.compareEqual(getTargetAbility(), null) ? getName() : getTargetAbility();
      this.abilityShellRealName = ShortTypeHandling.castToString(str1);
      return;
    } 
    String str = ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[157].callCurrent(this), null) ? ShortTypeHandling.castToString(arrayOfCallSite[158].callCurrent(this)) : ShortTypeHandling.castToString(arrayOfCallSite[159].callCurrent(this));
    this.abilityShellRealName = ShortTypeHandling.castToString(str);
  }
  
  public Boolean getFormsEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.formsEnabled;
  }
  
  public void setFormsEnabled(Boolean formsEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(formsEnabled, null)) {
      Boolean bool = formsEnabled;
      this.formsEnabled = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
    } else {
      boolean bool = false;
      this.formsEnabled = (Boolean)ScriptBytecodeAdapter.castToType(Boolean.valueOf(bool), Boolean.class);
    } 
  }
  
  public List<FormsOptions> getForms() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.forms;
  }
  
  public void setForms(List forms) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = forms;
    this.forms = (List<FormsOptions>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public Boolean getFormEnabled() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.formEnabled;
  }
  
  public void setFormEnabled(Boolean formEnabled) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(formEnabled, null)) {
      Boolean bool = formEnabled;
      this.formEnabled = (Boolean)ScriptBytecodeAdapter.castToType(bool, Boolean.class);
    } else {
      boolean bool = false;
      this.formEnabled = (Boolean)ScriptBytecodeAdapter.castToType(Boolean.valueOf(bool), Boolean.class);
    } 
  }
  
  public FormOptions getForm() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.form;
  }
  
  public void setForm(FormOptions form) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FormOptions formOptions = form;
    this.form = (FormOptions)ScriptBytecodeAdapter.castToType(formOptions, FormOptions.class);
  }
  
  public List<String> getDeviceCapability() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.deviceCapability;
  }
  
  public void setDeviceCapability(List deviceCapability) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    List list = deviceCapability;
    this.deviceCapability = (List<String>)ScriptBytecodeAdapter.castToType(list, List.class);
  }
  
  public String getOriginalName() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.originalName;
  }
  
  public void setOriginalName(String originalName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = originalName;
    this.originalName = ShortTypeHandling.castToString(str);
  }
  
  public String getUniqueKey() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(this.targetAbility, null))
      return this.name; 
    return this.targetAbility;
  }
  
  public String getEntryTheme() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return this.entryTheme;
  }
  
  public void setEntryTheme(String entryTheme) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String str = entryTheme;
    this.entryTheme = ShortTypeHandling.castToString(str);
  }
  
  public boolean isNeedMergeRuleOptions() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return true;
  }
  
  public void validate(Options options, Project project) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    AbilitiesOptions abilitiesOptions = (AbilitiesOptions)ScriptBytecodeAdapter.castToType(options, AbilitiesOptions.class);
    if (ScriptBytecodeAdapter.compareEqual(abilitiesOptions, null))
      return; 
    String str = this.type;
    if (ScriptBytecodeAdapter.isCase(str, "page")) {
      arrayOfCallSite[160].callCurrent(this, project, abilitiesOptions, "service", "backgroundModes");
      arrayOfCallSite[161].callCurrent(this, ArrayUtil.createArray(project, abilitiesOptions, "data", "grantPermission", "readPermission", "writePermission", "uriPermission", "multiUserShared"));
    } else if (ScriptBytecodeAdapter.isCase(str, "service")) {
      arrayOfCallSite[162].callCurrent(this, ArrayUtil.createArray(project, abilitiesOptions, "page", "theme", "orientation", "mission", "supportPipMode"));
      arrayOfCallSite[163].callCurrent(this, ArrayUtil.createArray(project, abilitiesOptions, "data", "grantPermission", "readPermission", "writePermission", "uriPermission", "multiUserShared"));
    } else if (ScriptBytecodeAdapter.isCase(str, "data")) {
      arrayOfCallSite[164].callCurrent(this, project, abilitiesOptions, "service", "backgroundModes");
      arrayOfCallSite[165].callCurrent(this, ArrayUtil.createArray(project, abilitiesOptions, "page", "orientation", "mission", "supportPipMode"));
    } 
    int _i = 0;
  }
  
  public void cannotConfiguration(Project project, AbilitiesOptions abilitiesOptions, String type, String... args) {
    Reference reference1 = new Reference(project), reference2 = new Reference(abilitiesOptions), reference3 = new Reference(type);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[166].call(args, new _cannotConfiguration_closure1(this, this, reference2, reference1, reference3));
  }
  
  public final class _cannotConfiguration_closure1 extends Closure implements GeneratedClosure {
    public _cannotConfiguration_closure1(Object _outerInstance, Object _thisObject, Reference abilitiesOptions, Reference project, Reference type) {
      super(_outerInstance, _thisObject);
      Reference reference1 = abilitiesOptions;
      this.abilitiesOptions = reference1;
      Reference reference2 = project;
      this.project = reference2;
      Reference reference3 = type;
      this.type = reference3;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].call(this.abilitiesOptions.get(), arrayOfCallSite[1].call("get", arrayOfCallSite[2].call(it)), null), null))
        return arrayOfCallSite[3].call(arrayOfCallSite[4].callGetProperty(AbilitiesOptions.class), arrayOfCallSite[5].callConstructor(ValidateException.class, arrayOfCallSite[6].call(String.class, ArrayUtil.createArray(arrayOfCallSite[7].callGetProperty(Locale.class), arrayOfCallSite[8].callGroovyObjectGetProperty(this), arrayOfCallSite[9].callGetProperty(this.project.get()), it, this.type.get())))); 
      return null;
    }
    
    @Generated
    public AbilitiesOptions getAbilitiesOptions() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (AbilitiesOptions)ScriptBytecodeAdapter.castToType(this.abilitiesOptions.get(), AbilitiesOptions.class);
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public String getType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.type.get());
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public String toString() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(
        
        arrayOfCallSite[167].call(arrayOfCallSite[168].call(arrayOfCallSite[169].call(arrayOfCallSite[170].call(arrayOfCallSite[171].call(arrayOfCallSite[172].call(arrayOfCallSite[173].call(arrayOfCallSite[174].call(arrayOfCallSite[175].call(arrayOfCallSite[176].call(arrayOfCallSite[177].call(arrayOfCallSite[178].call(arrayOfCallSite[179].call(arrayOfCallSite[180].call(arrayOfCallSite[181].call(arrayOfCallSite[182].call(arrayOfCallSite[183].call(arrayOfCallSite[184].call(arrayOfCallSite[185].call(arrayOfCallSite[186].call(arrayOfCallSite[187].call(arrayOfCallSite[188].call(arrayOfCallSite[189].call(arrayOfCallSite[190].call(arrayOfCallSite[191].call(arrayOfCallSite[192].call(arrayOfCallSite[193].call(arrayOfCallSite[194].call(arrayOfCallSite[195].call(arrayOfCallSite[196].call(arrayOfCallSite[197].call(arrayOfCallSite[198].call(arrayOfCallSite[199].call(arrayOfCallSite[200].call(arrayOfCallSite[201].call(arrayOfCallSite[202].call(arrayOfCallSite[203].call(arrayOfCallSite[204].call(arrayOfCallSite[205].call(arrayOfCallSite[206].call(arrayOfCallSite[207].call(arrayOfCallSite[208].call(arrayOfCallSite[209].call(arrayOfCallSite[210].call(arrayOfCallSite[211].call(arrayOfCallSite[212].call(arrayOfCallSite[213].call(arrayOfCallSite[214].call(arrayOfCallSite[215].call(arrayOfCallSite[216].call(arrayOfCallSite[217].call(arrayOfCallSite[218].call(arrayOfCallSite[219].call(arrayOfCallSite[220].call(arrayOfCallSite[221].call(arrayOfCallSite[222].call(arrayOfCallSite[223].call(arrayOfCallSite[224].call(arrayOfCallSite[225].call(arrayOfCallSite[226].call(arrayOfCallSite[227].call(arrayOfCallSite[228].call(arrayOfCallSite[229].call(arrayOfCallSite[230].call(arrayOfCallSite[231].call(arrayOfCallSite[232].call(arrayOfCallSite[233].call(arrayOfCallSite[234].call(arrayOfCallSite[235].call(arrayOfCallSite[236].call(arrayOfCallSite[237].call(arrayOfCallSite[238].call(arrayOfCallSite[239].call(arrayOfCallSite[240].call(arrayOfCallSite[241].call(arrayOfCallSite[242].call(arrayOfCallSite[243].call(arrayOfCallSite[244].call(arrayOfCallSite[245].call(arrayOfCallSite[246].call(arrayOfCallSite[247].call(arrayOfCallSite[248].call(arrayOfCallSite[249].call(arrayOfCallSite[250].call(arrayOfCallSite[251].call(arrayOfCallSite[252].call(arrayOfCallSite[253].call(arrayOfCallSite[254].call(arrayOfCallSite[255].call(arrayOfCallSite[256].call(arrayOfCallSite[257].call(arrayOfCallSite[258].call(arrayOfCallSite[259].call(arrayOfCallSite[260].call(arrayOfCallSite[261].call(arrayOfCallSite[262].call(arrayOfCallSite[263].call(arrayOfCallSite[264].call(arrayOfCallSite[265].call(arrayOfCallSite[266].call(arrayOfCallSite[267].call(arrayOfCallSite[268].call(arrayOfCallSite[269].call("AbilitiesOptions{", "name='"), this.name), "'"), ", description='"), this.description), "'"), ", icon='"), this.icon), "'"), ", label='"), this.label), "'"), ", theme='"), this.theme), "'"), ", type='"), this.type), "'"), ", uri='"), this.uri), "'"), ", launchType='"), this.launchType), "'"), ", metaData="), this.metaData), ", orientation='"), this.orientation), "'"), ", permissions="), this.permissions), ", visible="), this.visible), ", skills="), this.skills), ", configChanges="), this.configChanges), ", directLaunch="), this.directLaunch), ", process='"), this.process), "'"), ", backgroundModes="), this.backgroundModes), ", grantPermission="), this.grantPermission), ", formEnabled="), this.formEnabled), ", form="), this.form), ", readPermission='"), this.readPermission), "'"), ", writePermission='"), this.writePermission), "'"), ", uriPermission="), this.uriPermission), ", multiUserShared="), this.multiUserShared), ", mission='"), this.mission), "'"), ", targetAbility='"), this.targetAbility), "'"), ", supportPipMode="), this.supportPipMode), ", mergeRule="), this.mergeRule), ", forms="), this.forms), ", formsEnabled="), this.formsEnabled), ", resizeable="), this.resizeable), ", deviceCapability="), this.deviceCapability), ", originalName='"), this.originalName), "'"), ", entryTheme='"), this.entryTheme), "'"), ", shellName='"), this.shellName), "'"), ", targetShellName='"), this.targetShellName), "'"), ", shellFormName='"), this.shellFormName), "'"), ", abilityShellRealName='"), this.abilityShellRealName), "'"), ", iconId="), this.iconId), ", labelId="), this.labelId), ", descriptionId="), this.descriptionId), "}"));
  }
  
  public AbilitiesOptions() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
}
