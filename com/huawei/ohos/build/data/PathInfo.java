package com.huawei.ohos.build.data;

import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.build.consts.PathConst;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.nio.file.Paths;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Project;

public class PathInfo implements GroovyObject {
  private Project project;
  
  private String variantName;
  
  public PathInfo(Project project) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
  }
  
  public PathInfo(Project project, String variantName) {
    MetaClass metaClass = $getStaticMetaClass();
    Project project1 = project;
    this.project = (Project)ScriptBytecodeAdapter.castToType(project1, Project.class);
    String str = variantName;
    this.variantName = ShortTypeHandling.castToString(str);
  }
  
  public String getJsManifestPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[3].call(Paths.class, getIntermediatesRes(), this.variantName, arrayOfCallSite[4].callGetProperty(PathConst.class))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[0].call(Paths.class, arrayOfCallSite[1].callCurrent(this), this.variantName, arrayOfCallSite[2].callGetProperty(PathConst.class)));
  }
  
  public String getProjectBuildPath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[5].call(arrayOfCallSite[6].call(Paths.class, arrayOfCallSite[7].call(arrayOfCallSite[8].call(this.project)), "build", "outputs", "hap")));
  }
  
  public String getModulePath() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[9].callGetProperty(arrayOfCallSite[10].callGetProperty(arrayOfCallSite[11].call(this.project))));
  }
  
  public String getHapMainDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[16].call(arrayOfCallSite[17].call(Paths.class, getModulePath(), arrayOfCallSite[18].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[12].call(arrayOfCallSite[13].call(Paths.class, arrayOfCallSite[14].callCurrent(this), arrayOfCallSite[15].callGetProperty(PathConst.class))));
  }
  
  public String getSuperVisualDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[23].call(arrayOfCallSite[24].call(Paths.class, getModulePath(), arrayOfCallSite[25].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[19].call(arrayOfCallSite[20].call(Paths.class, arrayOfCallSite[21].callCurrent(this), arrayOfCallSite[22].callGetProperty(PathConst.class))));
  }
  
  public String getHapConfigJson() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[30].call(arrayOfCallSite[31].call(Paths.class, getHapMainDir(), arrayOfCallSite[32].callGetProperty(CommonConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[26].call(arrayOfCallSite[27].call(Paths.class, arrayOfCallSite[28].callCurrent(this), arrayOfCallSite[29].callGetProperty(CommonConst.class))));
  }
  
  public String getConfigJson() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[40].call(this.variantName, arrayOfCallSite[41].callGetProperty(BuildConst.class))))
        return getOhosTestConfigJson(); 
      return ShortTypeHandling.castToString(arrayOfCallSite[42].call(arrayOfCallSite[43].call(Paths.class, getHapMainDir(), arrayOfCallSite[44].callGetProperty(CommonConst.class))));
    } 
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[33].call(this.variantName, arrayOfCallSite[34].callGetProperty(BuildConst.class))))
      return ShortTypeHandling.castToString(arrayOfCallSite[35].callCurrent(this)); 
    return ShortTypeHandling.castToString(arrayOfCallSite[36].call(arrayOfCallSite[37].call(Paths.class, arrayOfCallSite[38].callCurrent(this), arrayOfCallSite[39].callGetProperty(CommonConst.class))));
  }
  
  public String getMergedConfigJson() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[49].call(arrayOfCallSite[50].call(Paths.class, getIntermediatesMergeProfile(), this.variantName, arrayOfCallSite[51].callGetProperty(CommonConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[45].call(arrayOfCallSite[46].call(Paths.class, arrayOfCallSite[47].callCurrent(this), this.variantName, arrayOfCallSite[48].callGetProperty(CommonConst.class))));
  }
  
  public String getHapJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[56].call(arrayOfCallSite[57].call(Paths.class, getModulePath(), arrayOfCallSite[58].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[52].call(arrayOfCallSite[53].call(Paths.class, arrayOfCallSite[54].callCurrent(this), arrayOfCallSite[55].callGetProperty(PathConst.class))));
  }
  
  public String getHapBaseProfileDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[63].call(arrayOfCallSite[64].call(Paths.class, getModulePath(), arrayOfCallSite[65].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[59].call(arrayOfCallSite[60].call(Paths.class, arrayOfCallSite[61].callCurrent(this), arrayOfCallSite[62].callGetProperty(PathConst.class))));
  }
  
  public String getHapJsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[70].call(arrayOfCallSite[71].call(Paths.class, getModulePath(), arrayOfCallSite[72].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[66].call(arrayOfCallSite[67].call(Paths.class, arrayOfCallSite[68].callCurrent(this), arrayOfCallSite[69].callGetProperty(PathConst.class))));
  }
  
  public String getHapResourcesDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[77].call(arrayOfCallSite[78].call(Paths.class, getModulePath(), arrayOfCallSite[79].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[73].call(arrayOfCallSite[74].call(Paths.class, arrayOfCallSite[75].callCurrent(this), arrayOfCallSite[76].callGetProperty(PathConst.class))));
  }
  
  public String getHapLibsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[84].call(arrayOfCallSite[85].call(Paths.class, getModulePath(), arrayOfCallSite[86].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[80].call(arrayOfCallSite[81].call(Paths.class, arrayOfCallSite[82].callCurrent(this), arrayOfCallSite[83].callGetProperty(PathConst.class))));
  }
  
  public String getBuildLibs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[87].call(arrayOfCallSite[88].call(Paths.class, arrayOfCallSite[89].call(arrayOfCallSite[90].call(this.project)), arrayOfCallSite[91].callGetProperty(PathConst.class))));
  }
  
  public String getGeneratedDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[92].call(arrayOfCallSite[93].call(Paths.class, arrayOfCallSite[94].call(arrayOfCallSite[95].call(this.project)), arrayOfCallSite[96].callGetProperty(PathConst.class))));
  }
  
  public String getGeneratedSourceDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[101].call(arrayOfCallSite[102].call(Paths.class, getGeneratedDir(), arrayOfCallSite[103].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[97].call(arrayOfCallSite[98].call(Paths.class, arrayOfCallSite[99].callCurrent(this), arrayOfCallSite[100].callGetProperty(PathConst.class))));
  }
  
  public String getGenerateApDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[109].call(arrayOfCallSite[110].call(Paths.class, getGeneratedDir(), arrayOfCallSite[111].callGetProperty(PathConst.class), arrayOfCallSite[112].callGetProperty(PathConst.class), this.variantName))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[104].call(arrayOfCallSite[105].call(Paths.class, arrayOfCallSite[106].callCurrent(this), arrayOfCallSite[107].callGetProperty(PathConst.class), arrayOfCallSite[108].callGetProperty(PathConst.class), this.variantName)));
  }
  
  public String getGeneratedSourceRDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[117].call(arrayOfCallSite[118].call(Paths.class, getGeneratedSourceDir(), arrayOfCallSite[119].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[113].call(arrayOfCallSite[114].call(Paths.class, arrayOfCallSite[115].callCurrent(this), arrayOfCallSite[116].callGetProperty(PathConst.class))));
  }
  
  public String getGeneratedSourceIdlDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[124].call(arrayOfCallSite[125].call(Paths.class, getGeneratedSourceDir(), arrayOfCallSite[126].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[120].call(arrayOfCallSite[121].call(Paths.class, arrayOfCallSite[122].callCurrent(this), arrayOfCallSite[123].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[127].call(arrayOfCallSite[128].call(Paths.class, arrayOfCallSite[129].call(arrayOfCallSite[130].call(this.project)), arrayOfCallSite[131].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesDexDir(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[136].call(arrayOfCallSite[137].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[138].callGetProperty(PathConst.class), buildType))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[132].call(arrayOfCallSite[133].call(Paths.class, arrayOfCallSite[134].callCurrent(this), arrayOfCallSite[135].callGetProperty(PathConst.class), buildType)));
  }
  
  public String getIntermediatesExternalLibs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[143].call(arrayOfCallSite[144].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[145].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[139].call(arrayOfCallSite[140].call(Paths.class, arrayOfCallSite[141].callCurrent(this), arrayOfCallSite[142].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesJavac() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[150].call(arrayOfCallSite[151].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[152].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[146].call(arrayOfCallSite[147].call(Paths.class, arrayOfCallSite[148].callCurrent(this), arrayOfCallSite[149].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesMergeProfile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[157].call(arrayOfCallSite[158].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[159].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[153].call(arrayOfCallSite[154].call(Paths.class, arrayOfCallSite[155].callCurrent(this), arrayOfCallSite[156].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesMergeRes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[164].call(arrayOfCallSite[165].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[166].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[160].call(arrayOfCallSite[161].call(Paths.class, arrayOfCallSite[162].callCurrent(this), arrayOfCallSite[163].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesOriginalRes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[171].call(arrayOfCallSite[172].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[173].callGetProperty(PathConst.class), this.variantName, "original_res", "res")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[167].call(arrayOfCallSite[168].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[169].callCurrent(this), arrayOfCallSite[170].callGetProperty(PathConst.class), this.variantName, "original_res", "res"))));
  }
  
  public String getIntermediatesRes() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[178].call(arrayOfCallSite[179].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[180].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[174].call(arrayOfCallSite[175].call(Paths.class, arrayOfCallSite[176].callCurrent(this), arrayOfCallSite[177].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesCmake() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[185].call(arrayOfCallSite[186].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[187].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[181].call(arrayOfCallSite[182].call(Paths.class, arrayOfCallSite[183].callCurrent(this), arrayOfCallSite[184].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesPackagedLocalHars() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[192].call(arrayOfCallSite[193].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[194].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[188].call(arrayOfCallSite[189].call(Paths.class, arrayOfCallSite[190].callCurrent(this), arrayOfCallSite[191].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesLibs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[199].call(arrayOfCallSite[200].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[201].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[195].call(arrayOfCallSite[196].call(Paths.class, arrayOfCallSite[197].callCurrent(this), arrayOfCallSite[198].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesSigningConfigDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[206].call(arrayOfCallSite[207].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[208].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[202].call(arrayOfCallSite[203].call(Paths.class, arrayOfCallSite[204].callCurrent(this), arrayOfCallSite[205].callGetProperty(PathConst.class))));
  }
  
  public String getShellRootDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[213].call(arrayOfCallSite[214].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[215].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[209].call(arrayOfCallSite[210].call(Paths.class, arrayOfCallSite[211].callCurrent(this), arrayOfCallSite[212].callGetProperty(PathConst.class))));
  }
  
  public String getShellOutPutDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[220].call(arrayOfCallSite[221].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[222].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[216].call(arrayOfCallSite[217].call(Paths.class, arrayOfCallSite[218].callCurrent(this), arrayOfCallSite[219].callGetProperty(PathConst.class))));
  }
  
  public String getShellOutPutDir(String modulePath) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[223].call(arrayOfCallSite[224].call(Paths.class, modulePath, arrayOfCallSite[225].callGetProperty(PathConst.class), arrayOfCallSite[226].callGetProperty(PathConst.class))));
  }
  
  public String getShellJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[227].call(arrayOfCallSite[228].call(Paths.class, arrayOfCallSite[229].call(arrayOfCallSite[230].call(this.project)), arrayOfCallSite[231].callGetProperty(PathConst.class), arrayOfCallSite[232].callGetProperty(PathConst.class), arrayOfCallSite[233].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesShellManifestDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[234].call(arrayOfCallSite[235].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[236].call(arrayOfCallSite[237].call(this.project)), arrayOfCallSite[238].callGetProperty(PathConst.class), arrayOfCallSite[239].callGetProperty(PathConst.class), arrayOfCallSite[240].callGetProperty(PathConst.class), "mergedManifest"))));
  }
  
  public String getIntermediatesSimplifyShellManifestDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[241].call(arrayOfCallSite[242].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[243].call(arrayOfCallSite[244].call(this.project)), arrayOfCallSite[245].callGetProperty(PathConst.class), arrayOfCallSite[246].callGetProperty(PathConst.class), arrayOfCallSite[247].callGetProperty(PathConst.class), "simplifyManifest"))));
  }
  
  public String getIntermediatesShellJavacDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[248].call(arrayOfCallSite[249].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[250].call(arrayOfCallSite[251].call(this.project)), arrayOfCallSite[252].callGetProperty(PathConst.class), arrayOfCallSite[253].callGetProperty(PathConst.class), arrayOfCallSite[254].callGetProperty(PathConst.class), "javac"))));
  }
  
  public String getIntermediatesShellDexDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[255].call(arrayOfCallSite[256].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[257].call(arrayOfCallSite[258].call(this.project)), arrayOfCallSite[259].callGetProperty(PathConst.class), arrayOfCallSite[260].callGetProperty(PathConst.class), arrayOfCallSite[261].callGetProperty(PathConst.class), "dex"))));
  }
  
  public String getIntermediatesShellResDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[262].call(arrayOfCallSite[263].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[264].call(arrayOfCallSite[265].call(this.project)), arrayOfCallSite[266].callGetProperty(PathConst.class), arrayOfCallSite[267].callGetProperty(PathConst.class), arrayOfCallSite[268].callGetProperty(PathConst.class), "res"))));
  }
  
  public String getShellManifest() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[269].call(arrayOfCallSite[270].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[271].call(arrayOfCallSite[272].call(this.project)), arrayOfCallSite[273].callGetProperty(PathConst.class), arrayOfCallSite[274].callGetProperty(PathConst.class), arrayOfCallSite[275].callGetProperty(PathConst.class), arrayOfCallSite[276].callGetProperty(CommonConst.class)))));
  }
  
  public String getEntryShellDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[281].call(arrayOfCallSite[282].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[283].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[277].call(arrayOfCallSite[278].call(Paths.class, arrayOfCallSite[279].callCurrent(this), arrayOfCallSite[280].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[284].call(arrayOfCallSite[285].call(Paths.class, arrayOfCallSite[286].call(arrayOfCallSite[287].call(this.project)), arrayOfCallSite[288].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsAapDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[293].call(arrayOfCallSite[294].call(Paths.class, getOutPutsDir(), arrayOfCallSite[295].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[289].call(arrayOfCallSite[290].call(Paths.class, arrayOfCallSite[291].callCurrent(this), arrayOfCallSite[292].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsHapDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[300].call(arrayOfCallSite[301].call(Paths.class, getOutPutsDir(), arrayOfCallSite[302].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[296].call(arrayOfCallSite[297].call(Paths.class, arrayOfCallSite[298].callCurrent(this), arrayOfCallSite[299].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsVariantHapDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[307].call(arrayOfCallSite[308].call(Paths.class, getOutPutsDir(), arrayOfCallSite[309].callGetProperty(PathConst.class), this.variantName))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[303].call(arrayOfCallSite[304].call(Paths.class, arrayOfCallSite[305].callCurrent(this), arrayOfCallSite[306].callGetProperty(PathConst.class), this.variantName)));
  }
  
  public String getOutPutsHarDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[314].call(arrayOfCallSite[315].call(Paths.class, getOutPutsDir(), arrayOfCallSite[316].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[310].call(arrayOfCallSite[311].call(Paths.class, arrayOfCallSite[312].callCurrent(this), arrayOfCallSite[313].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsLogDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[321].call(arrayOfCallSite[322].call(Paths.class, getOutPutsDir(), arrayOfCallSite[323].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[317].call(arrayOfCallSite[318].call(Paths.class, arrayOfCallSite[319].callCurrent(this), arrayOfCallSite[320].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsBinDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[328].call(arrayOfCallSite[329].call(Paths.class, getOutPutsDir(), arrayOfCallSite[330].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[324].call(arrayOfCallSite[325].call(Paths.class, arrayOfCallSite[326].callCurrent(this), arrayOfCallSite[327].callGetProperty(PathConst.class))));
  }
  
  public String getOutPutsBinFile(String buildType, boolean signed) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String fileName = ShortTypeHandling.castToString(arrayOfCallSite[331].call(arrayOfCallSite[332].call(arrayOfCallSite[333].call(arrayOfCallSite[334].callGetProperty(this.project), "-"), buildType), signed ? "-signed.bin" : "-unsigned.bin"));
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[335].call(this.variantName, arrayOfCallSite[336].callGetProperty(BuildConst.class)))) {
      Object object = arrayOfCallSite[337].call(arrayOfCallSite[338].call(arrayOfCallSite[339].callGetProperty(this.project), "-test"), signed ? "-signed.bin" : "-unsigned.bin");
      fileName = ShortTypeHandling.castToString(object);
    } 
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? ShortTypeHandling.castToString(arrayOfCallSite[343].call(arrayOfCallSite[344].call(Paths.class, getOutPutsBinDir(), this.variantName, fileName))) : ShortTypeHandling.castToString(arrayOfCallSite[340].call(arrayOfCallSite[341].call(Paths.class, arrayOfCallSite[342].callCurrent(this), this.variantName, fileName)));
  }
  
  public String getIntermediatesBinSource(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[349].call(arrayOfCallSite[350].call(Paths.class, getIntermediatesRes(), buildType, deviceType, arrayOfCallSite[351].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[345].call(arrayOfCallSite[346].call(Paths.class, arrayOfCallSite[347].callCurrent(this), buildType, deviceType, arrayOfCallSite[348].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesAssets(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[356].call(arrayOfCallSite[357].call(Paths.class, getIntermediatesRes(), buildType, deviceType, arrayOfCallSite[358].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[352].call(arrayOfCallSite[353].call(Paths.class, arrayOfCallSite[354].callCurrent(this), buildType, deviceType, arrayOfCallSite[355].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesJsResources(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[363].call(arrayOfCallSite[364].call(Paths.class, getIntermediatesRes(), buildType, arrayOfCallSite[365].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[359].call(arrayOfCallSite[360].call(Paths.class, arrayOfCallSite[361].callCurrent(this), buildType, arrayOfCallSite[362].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesBinAssets(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[370].call(arrayOfCallSite[371].call(Paths.class, getIntermediatesBinSource(buildType, deviceType), arrayOfCallSite[372].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[366].call(arrayOfCallSite[367].call(Paths.class, arrayOfCallSite[368].callCurrent(this, buildType, deviceType), arrayOfCallSite[369].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesBinConfigJson(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[377].call(arrayOfCallSite[378].call(Paths.class, getIntermediatesBinSource(buildType, deviceType), arrayOfCallSite[379].callGetProperty(CommonConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[373].call(arrayOfCallSite[374].call(Paths.class, arrayOfCallSite[375].callCurrent(this, buildType, deviceType), arrayOfCallSite[376].callGetProperty(CommonConst.class))));
  }
  
  public String getIntermediatesBinResources(String buildType, String deviceType, String module) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[385].call(arrayOfCallSite[386].call(Paths.class, getIntermediatesBinSource(buildType, deviceType), arrayOfCallSite[387].callGetProperty(PathConst.class), module, arrayOfCallSite[388].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[380].call(arrayOfCallSite[381].call(Paths.class, arrayOfCallSite[382].callCurrent(this, buildType, deviceType), arrayOfCallSite[383].callGetProperty(PathConst.class), module, arrayOfCallSite[384].callGetProperty(PathConst.class))));
  }
  
  public String getIntermediatesShellJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[393].call(arrayOfCallSite[394].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[395].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[389].call(arrayOfCallSite[390].call(Paths.class, arrayOfCallSite[391].callCurrent(this), arrayOfCallSite[392].callGetProperty(PathConst.class))));
  }
  
  public String getCompiledConfigJson(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[400].call(arrayOfCallSite[401].call(Paths.class, getIntermediatesRes(), buildType, deviceType, arrayOfCallSite[402].callGetProperty(CommonConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[396].call(arrayOfCallSite[397].call(Paths.class, arrayOfCallSite[398].callCurrent(this), buildType, deviceType, arrayOfCallSite[399].callGetProperty(CommonConst.class))));
  }
  
  public String getCompiledResources(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[407].call(arrayOfCallSite[408].call(Paths.class, getIntermediatesRes(), buildType, deviceType, arrayOfCallSite[409].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[403].call(arrayOfCallSite[404].call(Paths.class, arrayOfCallSite[405].callCurrent(this), buildType, deviceType, arrayOfCallSite[406].callGetProperty(PathConst.class))));
  }
  
  public String getCompiledResourcesIndex(String buildType, String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[414].call(arrayOfCallSite[415].call(Paths.class, getIntermediatesRes(), buildType, deviceType, arrayOfCallSite[416].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[410].call(arrayOfCallSite[411].call(Paths.class, arrayOfCallSite[412].callCurrent(this), buildType, deviceType, arrayOfCallSite[413].callGetProperty(BuildConst.class))));
  }
  
  public String getIntermediatesMergeJsSrc(String device, String module) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[421].call(arrayOfCallSite[422].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[423].callGetProperty(PathConst.class), device, module))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[417].call(arrayOfCallSite[418].call(Paths.class, arrayOfCallSite[419].callCurrent(this), arrayOfCallSite[420].callGetProperty(PathConst.class), device, module)));
  }
  
  public String getIntermediatesMergeJs() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[428].call(arrayOfCallSite[429].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[430].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[424].call(arrayOfCallSite[425].call(Paths.class, arrayOfCallSite[426].callCurrent(this), arrayOfCallSite[427].callGetProperty(PathConst.class))));
  }
  
  public String getCompileJavaDir(String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[435].call(arrayOfCallSite[436].call(Paths.class, getIntermediatesJavac(), variantName, arrayOfCallSite[437].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[431].call(arrayOfCallSite[432].call(Paths.class, arrayOfCallSite[433].callCurrent(this), variantName, arrayOfCallSite[434].callGetProperty(BuildConst.class))));
  }
  
  public String getCompileJavaShellDir(String variantName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[442].call(arrayOfCallSite[443].call(Paths.class, getIntermediatesShellJavacDir(), variantName, arrayOfCallSite[444].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[438].call(arrayOfCallSite[439].call(Paths.class, arrayOfCallSite[440].callCurrent(this), variantName, arrayOfCallSite[441].callGetProperty(BuildConst.class))));
  }
  
  public String getOhosTestDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[449].call(arrayOfCallSite[450].call(Paths.class, getModulePath(), arrayOfCallSite[451].callGetProperty(PathConst.class), "java"))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[445].call(arrayOfCallSite[446].call(Paths.class, arrayOfCallSite[447].callCurrent(this), arrayOfCallSite[448].callGetProperty(PathConst.class), "java")));
  }
  
  public String getOhosTestConfigJson() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[457].call(arrayOfCallSite[458].call(Paths.class, getModulePath(), arrayOfCallSite[459].callGetProperty(PathConst.class), arrayOfCallSite[460].callGetProperty(CommonConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[452].call(arrayOfCallSite[453].call(Paths.class, arrayOfCallSite[454].callCurrent(this), arrayOfCallSite[455].callGetProperty(PathConst.class), arrayOfCallSite[456].callGetProperty(CommonConst.class))));
  }
  
  public String getShellSrcDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[466].call(arrayOfCallSite[467].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[468].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[469].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[461].call(arrayOfCallSite[462].call(Paths.class, arrayOfCallSite[463].callCurrent(this), arrayOfCallSite[464].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[465].callGetProperty(PathConst.class))));
  }
  
  public String getShellSrcMainDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[475].call(arrayOfCallSite[476].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[477].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[478].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[470].call(arrayOfCallSite[471].call(Paths.class, arrayOfCallSite[472].callCurrent(this), arrayOfCallSite[473].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[474].callGetProperty(PathConst.class))));
  }
  
  public String getShellResDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[484].call(arrayOfCallSite[485].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[486].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[487].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[479].call(arrayOfCallSite[480].call(Paths.class, arrayOfCallSite[481].callCurrent(this), arrayOfCallSite[482].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[483].callGetProperty(PathConst.class))));
  }
  
  public String getShellSrcMainJavaDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[493].call(arrayOfCallSite[494].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[495].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[496].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[488].call(arrayOfCallSite[489].call(Paths.class, arrayOfCallSite[490].callCurrent(this), arrayOfCallSite[491].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[492].callGetProperty(PathConst.class))));
  }
  
  public String getShellSrcManifest() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[503].call(arrayOfCallSite[504].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[505].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[506].callGetProperty(PathConst.class), arrayOfCallSite[507].callGetProperty(CommonConst.class))))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[497].call(arrayOfCallSite[498].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[499].callCurrent(this), arrayOfCallSite[500].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[501].callGetProperty(PathConst.class), arrayOfCallSite[502].callGetProperty(CommonConst.class)))));
  }
  
  public String getShellBuildDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[513].call(arrayOfCallSite[514].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[515].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[516].callGetProperty(PathConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[508].call(arrayOfCallSite[509].call(Paths.class, arrayOfCallSite[510].callCurrent(this), arrayOfCallSite[511].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[512].callGetProperty(PathConst.class))));
  }
  
  public String getShellManifestDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[522].call(arrayOfCallSite[523].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[524].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[525].callGetProperty(PathConst.class), "mergedManifest")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[517].call(arrayOfCallSite[518].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[519].callCurrent(this), arrayOfCallSite[520].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[521].callGetProperty(PathConst.class), "mergedManifest"))));
  }
  
  public String getSimplifyShellManifestDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[531].call(arrayOfCallSite[532].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[533].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[534].callGetProperty(PathConst.class), "simplifyManifest")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[526].call(arrayOfCallSite[527].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[528].callCurrent(this), arrayOfCallSite[529].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[530].callGetProperty(PathConst.class), "simplifyManifest"))));
  }
  
  public String getShellBuildResDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[540].call(arrayOfCallSite[541].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[542].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[543].callGetProperty(PathConst.class), "res")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[535].call(arrayOfCallSite[536].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[537].callCurrent(this), arrayOfCallSite[538].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[539].callGetProperty(PathConst.class), "res"))));
  }
  
  public String getShellJavacDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[549].call(arrayOfCallSite[550].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[551].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[552].callGetProperty(PathConst.class), "javac")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[544].call(arrayOfCallSite[545].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[546].callCurrent(this), arrayOfCallSite[547].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[548].callGetProperty(PathConst.class), "javac"))));
  }
  
  public String getShellBuildJavacClassesDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[557].call(arrayOfCallSite[558].call(Paths.class, getShellJavacDir(), arrayOfCallSite[559].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[553].call(arrayOfCallSite[554].call(Paths.class, arrayOfCallSite[555].callCurrent(this), arrayOfCallSite[556].callGetProperty(BuildConst.class))));
  }
  
  public String getShellBuildDexDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[565].call(arrayOfCallSite[566].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[567].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[568].callGetProperty(PathConst.class), "dex")))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[560].call(arrayOfCallSite[561].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[562].callCurrent(this), arrayOfCallSite[563].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[564].callGetProperty(PathConst.class), "dex"))));
  }
  
  public String getBuildConfigDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[573].call(arrayOfCallSite[574].call(Paths.class, getGeneratedSourceDir(), arrayOfCallSite[575].callGetProperty(PathConst.class), this.variantName))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[569].call(arrayOfCallSite[570].call(Paths.class, arrayOfCallSite[571].callCurrent(this), arrayOfCallSite[572].callGetProperty(PathConst.class), this.variantName)));
  }
  
  public String getDataBindingDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[580].call(arrayOfCallSite[581].call(Paths.class, getGeneratedSourceDir(), arrayOfCallSite[582].callGetProperty(PathConst.class), this.variantName))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[576].call(arrayOfCallSite[577].call(Paths.class, arrayOfCallSite[578].callCurrent(this), arrayOfCallSite[579].callGetProperty(PathConst.class), this.variantName)));
  }
  
  public String getIntermediatesPseudo(String deviceType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[588].call(arrayOfCallSite[589].call(Paths.class, ArrayUtil.createArray(getIntermediatesDir(), arrayOfCallSite[590].callGetProperty(PathConst.class), this.variantName, deviceType, arrayOfCallSite[591].callGetProperty(PathConst.class))))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[583].call(arrayOfCallSite[584].call(Paths.class, ArrayUtil.createArray(arrayOfCallSite[585].callCurrent(this), arrayOfCallSite[586].callGetProperty(PathConst.class), this.variantName, deviceType, arrayOfCallSite[587].callGetProperty(PathConst.class)))));
  }
  
  public String getMergedProguardFile() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[597].call(arrayOfCallSite[598].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[599].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[600].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[592].call(arrayOfCallSite[593].call(Paths.class, arrayOfCallSite[594].callCurrent(this), arrayOfCallSite[595].callGetProperty(PathConst.class), this.variantName, arrayOfCallSite[596].callGetProperty(BuildConst.class))));
  }
  
  public String getObfuscatedJarDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[605].call(arrayOfCallSite[606].call(Paths.class, getIntermediatesDir(), arrayOfCallSite[607].callGetProperty(BuildConst.class), this.variantName))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[601].call(arrayOfCallSite[602].call(Paths.class, arrayOfCallSite[603].callCurrent(this), arrayOfCallSite[604].callGetProperty(BuildConst.class), this.variantName)));
  }
  
  public String getObfuscatedClassDir() {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass())
      return ShortTypeHandling.castToString(arrayOfCallSite[612].call(arrayOfCallSite[613].call(Paths.class, getObfuscatedJarDir(), arrayOfCallSite[614].callGetProperty(BuildConst.class)))); 
    return ShortTypeHandling.castToString(arrayOfCallSite[608].call(arrayOfCallSite[609].call(Paths.class, arrayOfCallSite[610].callCurrent(this), arrayOfCallSite[611].callGetProperty(BuildConst.class))));
  }
  
  @Generated
  public String getIntermediatesBinSource(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? getIntermediatesBinSource(buildType, "") : getIntermediatesBinSource(buildType, "");
  }
  
  @Generated
  public String getIntermediatesAssets(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? getIntermediatesAssets(buildType, "") : getIntermediatesAssets(buildType, "");
  }
  
  @Generated
  public String getIntermediatesBinAssets(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? getIntermediatesBinAssets(buildType, "") : getIntermediatesBinAssets(buildType, "");
  }
  
  @Generated
  public String getIntermediatesBinConfigJson(String buildType) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? getIntermediatesBinConfigJson(buildType, "") : getIntermediatesBinConfigJson(buildType, "");
  }
  
  @Generated
  public String getIntermediatesBinResources(String buildType, String module) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? getIntermediatesBinResources(buildType, "", module) : getIntermediatesBinResources(buildType, "", module);
  }
}
