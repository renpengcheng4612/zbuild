package com.huawei.ohos.build.utils;

import com.google.common.base.Preconditions;
import com.google.common.io.Files;
import com.huawei.ohos.build.consts.CommonConst;
import com.huawei.ohos.shelltool.utils.IOUtil;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import groovy.xml.XmlUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nonnull;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ArrayUtil;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.GradleException;

public class FileUtils implements GroovyObject {
  @Generated
  public FileUtils() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static boolean checkDirectory(File directory) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(directory)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(directory)));
  }
  
  public static boolean checkDirWithoutDelete(File directory) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[2].call(directory)))
      return true; 
    return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[3].call(directory));
  }
  
  public static boolean checkFileWithoutDelete(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(file)))
      return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[5].call(file)); 
    return true;
  }
  
  public static boolean checkFile(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[6].call(file)))
      return DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(file)); 
    return (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[8].call(file)) && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(file)));
  }
  
  public static void checkSubFile(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[10].call(file)))
      arrayOfCallSite[11].call(file); 
    arrayOfCallSite[12].callStatic(FileUtils.class, file);
  }
  
  public static void createSubFile(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File dir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[13].call(file), File.class);
    if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[14].call(dir)))
      arrayOfCallSite[15].call(dir); 
    try {
      arrayOfCallSite[16].call(file);
    } catch (IOException e) {
      arrayOfCallSite[17].callStatic(FileUtils.class, arrayOfCallSite[18].call(e));
    } finally {}
  }
  
  public static String getFileNameWithoutSuffix(String fileName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return ShortTypeHandling.castToString(arrayOfCallSite[19].call(fileName, Integer.valueOf(0), arrayOfCallSite[20].call(fileName, ".")));
  }
  
  public static void copyTemplateFile(String input, String output) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    InputStream inputStream = null;
    BufferedReader reader = null;
    FileWriter writer = null;
    arrayOfCallSite[21].callStatic(FileUtils.class, arrayOfCallSite[22].callConstructor(File.class, output));
    try {
      StringBuffer buffer = (StringBuffer)ScriptBytecodeAdapter.castToType(arrayOfCallSite[23].callConstructor(StringBuffer.class), StringBuffer.class);
      Object object1 = arrayOfCallSite[24].call(FileUtils.class, input);
      inputStream = (InputStream)ScriptBytecodeAdapter.castToType(object1, InputStream.class);
      Object object2 = arrayOfCallSite[25].callConstructor(BufferedReader.class, arrayOfCallSite[26].callConstructor(InputStreamReader.class, inputStream));
      reader = (BufferedReader)ScriptBytecodeAdapter.castToType(object2, BufferedReader.class);
      Object object3 = arrayOfCallSite[27].callConstructor(FileWriter.class, output);
      writer = (FileWriter)ScriptBytecodeAdapter.castToType(object3, FileWriter.class);
      String line = null;
      while (true) {
        Object object = arrayOfCallSite[28].call(reader);
        line = ShortTypeHandling.castToString(object);
        if (ScriptBytecodeAdapter.compareNotEqual(object, null)) {
          arrayOfCallSite[29].call(arrayOfCallSite[30].call(buffer, line), arrayOfCallSite[31].call(System.class));
          continue;
        } 
        break;
      } 
      arrayOfCallSite[32].call(writer, arrayOfCallSite[33].call(buffer));
    } catch (IOException e) {
      String errMsg = ShortTypeHandling.castToString(arrayOfCallSite[34].call(String.class, arrayOfCallSite[35].callGetProperty(Locale.class), "Unable to copy the template file from %s to %s.", input, output));
      arrayOfCallSite[36].call(ViewLogger.class, "template", errMsg);
      throw (Throwable)e;
    } finally {
      arrayOfCallSite[38].call(IOUtil.class, writer, reader, inputStream);
    } 
  }
  
  public static void copyTemplatePhotos(String input, String output) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    InputStream fis = null;
    FileOutputStream fos = null;
    arrayOfCallSite[39].callStatic(FileUtils.class, arrayOfCallSite[40].callConstructor(File.class, output));
    try {
      Object object1 = arrayOfCallSite[41].call(FileUtils.class, input);
      fis = (InputStream)ScriptBytecodeAdapter.castToType(object1, InputStream.class);
      Object object2 = arrayOfCallSite[42].callConstructor(FileOutputStream.class, output);
      fos = (FileOutputStream)ScriptBytecodeAdapter.castToType(object2, FileOutputStream.class);
      byte[] buf = new byte[512];
      int len = 0;
      while (true) {
        Object object = arrayOfCallSite[43].call(fis, buf);
        len = DefaultTypeTransformation.intUnbox(object);
        if (ScriptBytecodeAdapter.compareNotEqual(object, Integer.valueOf(-1))) {
          arrayOfCallSite[44].call(fos, buf, Integer.valueOf(0), Integer.valueOf(len));
          continue;
        } 
        break;
      } 
    } catch (Exception e) {
      String errMsg = ShortTypeHandling.castToString(arrayOfCallSite[45].call(String.class, arrayOfCallSite[46].callGetProperty(Locale.class), "Unable to copy the template file from %s to %s.", input, output));
      arrayOfCallSite[47].call(ViewLogger.class, "template", errMsg);
      throw (Throwable)e;
    } finally {
      arrayOfCallSite[49].call(IOUtil.class, fos, fis);
    } 
  }
  
  public static boolean isFileExist(String dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((ScriptBytecodeAdapter.compareEqual(dir, null) || ScriptBytecodeAdapter.compareEqual(dir, ""))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[52].call(arrayOfCallSite[53].callConstructor(File.class, dir))))))
        return false; 
      return true;
    } 
    if ((((ScriptBytecodeAdapter.compareEqual(dir, null) || ScriptBytecodeAdapter.compareEqual(dir, ""))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[50].call(arrayOfCallSite[51].callConstructor(File.class, dir))))))
      return false; 
    return true;
  }
  
  public static void ensureNoSameFile(File source, File target) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[56].call(source))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[57].call(target)))))
        return; 
    } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[54].call(source))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[55].call(target))))) {
      return;
    } 
    String sameFile = ShortTypeHandling.castToString(arrayOfCallSite[58].callStatic(FileUtils.class, source, target));
    if (DefaultTypeTransformation.booleanUnbox(sameFile))
      throw (Throwable)arrayOfCallSite[59]
        
        .callConstructor(GradleException.class, arrayOfCallSite[60].call(arrayOfCallSite[61].call(arrayOfCallSite[62].call(arrayOfCallSite[63].call(arrayOfCallSite[64].call(arrayOfCallSite[65].call("Conflict occurred when merging JS source files: [", arrayOfCallSite[66].call(source)), sameFile), ","), arrayOfCallSite[67].call(target)), sameFile), "]")); 
  }
  
  public static String checkSameFile(File source, File target) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set sourceSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[68].callStatic(FileUtils.class, source), Set.class);
    Set targetSet = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[69].callStatic(FileUtils.class, target), Set.class);
    String path;
    Iterator iterator;
    for (path = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[70].call(sourceSet), Iterator.class); iterator.hasNext(); ) {
      path = ShortTypeHandling.castToString(iterator.next());
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[71].call(targetSet, path)))
        return path; 
    } 
    return ShortTypeHandling.castToString(null);
  }
  
  private static Set<String> listFiles(File dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set<String> set = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[72].callConstructor(HashSet.class), Set.class);
    arrayOfCallSite[73].callStatic(FileUtils.class, dir, "", set);
    return set;
  }
  
  private static void listFiles(File dir, String path, Set set) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    File[] files = (File[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[74].call(dir), File[].class);
    File file;
    Iterator iterator;
    for (file = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[75].call(files), Iterator.class); iterator.hasNext(); ) {
      file = (File)ScriptBytecodeAdapter.castToType(iterator.next(), File.class);
      String currentPath = ShortTypeHandling.castToString(arrayOfCallSite[76].call(arrayOfCallSite[77].call(path, arrayOfCallSite[78].callGetProperty(File.class)), arrayOfCallSite[79].call(file)));
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[80].call(file))) {
        arrayOfCallSite[81].call(set, currentPath);
        continue;
      } 
      arrayOfCallSite[82].callStatic(FileUtils.class, file, currentPath, set);
    } 
  }
  
  public static boolean checkDirExists(File dir, String name) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[85].call(dir))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[86].call(dir)))))
        return false; 
      File realDir = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[87].callConstructor(File.class, arrayOfCallSite[88].callGetProperty(dir)), File.class);
      return ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[89].callGetProperty(realDir), name);
    } 
    if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[83].call(dir))) || (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[84].call(dir)))))
      return false; 
    File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[87].callConstructor(File.class, arrayOfCallSite[88].callGetProperty(dir)), File.class);
    return ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[89].callGetProperty(file), name);
  }
  
  public static Object getFileContent(File root, String... paths) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object outputFile = arrayOfCallSite[90].call(arrayOfCallSite[91].call(Paths.class, arrayOfCallSite[92].call(root), paths));
    return arrayOfCallSite[93].callGetProperty(outputFile);
  }
  
  public static Object listFileNames(File root, String... paths) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Set result = (Set)ScriptBytecodeAdapter.castToType(arrayOfCallSite[94].callConstructor(HashSet.class), Set.class);
    Object outputFolder = arrayOfCallSite[95].call(arrayOfCallSite[96].call(Paths.class, arrayOfCallSite[97].call(root), paths));
    Object f;
    Iterator iterator;
    for (f = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[98].call(arrayOfCallSite[99].call(outputFolder)), Iterator.class); iterator.hasNext(); ) {
      f = iterator.next();
      arrayOfCallSite[100].call(result, arrayOfCallSite[101].callGetProperty(f));
    } 
    return result;
  }
  
  public static void appendFileWithoutComment(File output, File source) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    FileWriter writer = null;
    BufferedReader reader = null;
    try {
      Object object1 = arrayOfCallSite[102].callConstructor(FileWriter.class, output, Boolean.valueOf(true));
      writer = (FileWriter)ScriptBytecodeAdapter.castToType(object1, FileWriter.class);
      Object object2 = arrayOfCallSite[103].callConstructor(BufferedReader.class, arrayOfCallSite[104].callConstructor(FileReader.class, source));
      reader = (BufferedReader)ScriptBytecodeAdapter.castToType(object2, BufferedReader.class);
      String line = null;
      while (true) {
        Object object = arrayOfCallSite[105].call(reader);
        line = ShortTypeHandling.castToString(object);
        if (ScriptBytecodeAdapter.compareNotEqual(object, null)) {
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[106].call(line, "#"))) {
            arrayOfCallSite[107].call(writer, line);
            arrayOfCallSite[108].call(writer, arrayOfCallSite[109].call(System.class));
          } 
          continue;
        } 
        break;
      } 
    } catch (IOException e) {
      throw (Throwable)arrayOfCallSite[110]
        
        .callConstructor(GradleException.class, arrayOfCallSite[111].call(String.class, ArrayUtil.createArray(arrayOfCallSite[112].callGetProperty(Locale.class), "Failed to append File %s to %s:error:%s", arrayOfCallSite[113].callGetProperty(source), arrayOfCallSite[114].callGetProperty(output), arrayOfCallSite[115].call(e))));
    } finally {
      arrayOfCallSite[117].call(IOUtil.class, writer, reader);
    } 
  }
  
  public static Object writeXml(File androidManifestFile, Object androidManifest) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    PrintWriter printWriter = (PrintWriter)ScriptBytecodeAdapter.castToType(arrayOfCallSite[118].callConstructor(PrintWriter.class, androidManifestFile, arrayOfCallSite[119].callGetProperty(CommonConst.class)), PrintWriter.class);
    arrayOfCallSite[120].call(printWriter, arrayOfCallSite[121].call(XmlUtil.class, androidManifest));
    return arrayOfCallSite[122].call(IOUtil.class, printWriter);
  }
  
  public static void copyDirectoryToDirectory(File from, File to) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[123].callStatic(FileUtils.class, from, arrayOfCallSite[124].callConstructor(File.class, to, arrayOfCallSite[125].call(from)));
  }
  
  public static void copyDirectory(File from, File to) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[126].call(Preconditions.class, arrayOfCallSite[127].call(from), "Source path is not a directory.");
    arrayOfCallSite[128].call(Preconditions.class, Boolean.valueOf(((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[129].call(to))) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[130].call(to)))), "Destination path exists and is not a directory.");
    arrayOfCallSite[131].callStatic(FileUtils.class, to);
    File[] children = (File[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[132].call(from), File[].class);
    if (ScriptBytecodeAdapter.compareNotEqual(children, null)) {
      File[] var3 = children;
      int var4 = DefaultTypeTransformation.intUnbox(arrayOfCallSite[133].callGetProperty(children));
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        for (int i = 0; (i < var4); ) {
          File child = (File)ScriptBytecodeAdapter.castToType(BytecodeInterface8.objectArrayGet((Object[])var3, i), File.class);
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[143].call(child))) {
            arrayOfCallSite[144].callStatic(FileUtils.class, child, to);
          } else {
            if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[145].call(child)))
              throw (Throwable)arrayOfCallSite[146].callConstructor(IllegalArgumentException.class, arrayOfCallSite[147].call("Don't know how to copy file ", arrayOfCallSite[148].call(child))); 
            arrayOfCallSite[149].callStatic(FileUtils.class, child, to);
          } 
          i++;
        } 
        return;
      } 
      for (int var5 = 0; (var5 < var4); ) {
        File child = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[134].call(var3, Integer.valueOf(var5)), File.class);
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[135].call(child))) {
          arrayOfCallSite[136].callStatic(FileUtils.class, child, to);
        } else {
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[137].call(child)))
            throw (Throwable)arrayOfCallSite[138].callConstructor(IllegalArgumentException.class, arrayOfCallSite[139].call("Don't know how to copy file ", arrayOfCallSite[140].call(child))); 
          arrayOfCallSite[141].callStatic(FileUtils.class, child, to);
        } 
        var5 = DefaultTypeTransformation.intUnbox(arrayOfCallSite[142].call(Integer.valueOf(var5)));
        arrayOfCallSite[142].call(Integer.valueOf(var5));
      } 
    } 
  }
  
  public static File mkdirs(File folder) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[155].call(folder))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[156].call(folder)))))
        throw (Throwable)arrayOfCallSite[157].callConstructor(RuntimeException.class, arrayOfCallSite[158].call(String.class, arrayOfCallSite[159].callGetProperty(Locale.class), "Cannot create directory %s", folder)); 
      return folder;
    } 
    if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[150].call(folder))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[151].call(folder)))))
      throw (Throwable)arrayOfCallSite[152].callConstructor(RuntimeException.class, arrayOfCallSite[153].call(String.class, arrayOfCallSite[154].callGetProperty(Locale.class), "Cannot create directory %s", folder)); 
    return folder;
  }
  
  public static void copyFileToDirectory(File from, File to) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[160].callStatic(FileUtils.class, from, arrayOfCallSite[161].callConstructor(File.class, to, arrayOfCallSite[162].call(from)));
  }
  
  public static void copyFile(File from, File to) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[163].call(Files.class, arrayOfCallSite[164].call(from), arrayOfCallSite[165].call(to), arrayOfCallSite[166].callGetProperty(StandardCopyOption.class), arrayOfCallSite[167].callGetProperty(StandardCopyOption.class));
  }
  
  public static void copyDirectoryContentToDirectory(File from, File to) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[168].call(Preconditions.class, arrayOfCallSite[169].call(from), "Source path is not a directory.");
    File[] children = (File[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[170].call(from), File[].class);
    if (ScriptBytecodeAdapter.compareNotEqual(children, null)) {
      File[] var3 = children;
      int var4 = DefaultTypeTransformation.intUnbox(arrayOfCallSite[171].callGetProperty(children));
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        for (int i = 0; (i < var4); ) {
          File f = (File)ScriptBytecodeAdapter.castToType(BytecodeInterface8.objectArrayGet((Object[])var3, i), File.class);
          File destination = null;
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[187].call(f))) {
            Object object = arrayOfCallSite[188].callConstructor(File.class, to, arrayOfCallSite[189].callStatic(FileUtils.class, f, from));
            destination = (File)ScriptBytecodeAdapter.castToType(object, File.class);
            arrayOfCallSite[190].call(Files.class, destination);
            arrayOfCallSite[191].callStatic(FileUtils.class, destination);
            arrayOfCallSite[192].callStatic(FileUtils.class, f, destination);
          } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[193].call(f))) {
            Object object = arrayOfCallSite[194].callConstructor(File.class, to, arrayOfCallSite[195].callStatic(FileUtils.class, arrayOfCallSite[196].call(f), from));
            destination = (File)ScriptBytecodeAdapter.castToType(object, File.class);
            arrayOfCallSite[197].call(Files.class, destination);
            arrayOfCallSite[198].callStatic(FileUtils.class, destination);
            arrayOfCallSite[199].callStatic(FileUtils.class, f, destination);
          } 
          i++;
        } 
        return;
      } 
      for (int var5 = 0; (var5 < var4); ) {
        File f = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[172].call(var3, Integer.valueOf(var5)), File.class);
        File destination = null;
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[173].call(f))) {
          Object object = arrayOfCallSite[174].callConstructor(File.class, to, arrayOfCallSite[175].callStatic(FileUtils.class, f, from));
          destination = (File)ScriptBytecodeAdapter.castToType(object, File.class);
          arrayOfCallSite[176].call(Files.class, destination);
          arrayOfCallSite[177].callStatic(FileUtils.class, destination);
          arrayOfCallSite[178].callStatic(FileUtils.class, f, destination);
        } else if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[179].call(f))) {
          Object object = arrayOfCallSite[180].callConstructor(File.class, to, arrayOfCallSite[181].callStatic(FileUtils.class, arrayOfCallSite[182].call(f), from));
          destination = (File)ScriptBytecodeAdapter.castToType(object, File.class);
          arrayOfCallSite[183].call(Files.class, destination);
          arrayOfCallSite[184].callStatic(FileUtils.class, destination);
          arrayOfCallSite[185].callStatic(FileUtils.class, f, destination);
        } 
        var5 = DefaultTypeTransformation.intUnbox(arrayOfCallSite[186].call(Integer.valueOf(var5)));
        arrayOfCallSite[186].call(Integer.valueOf(var5));
      } 
    } 
  }
  
  public static String relativePath(File file, File dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[200].call(Preconditions.class, Boolean.valueOf((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[201].call(file)) || DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[202].call(file)))), "%s is not a file nor a directory.", arrayOfCallSite[203].call(file));
    arrayOfCallSite[204].call(Preconditions.class, arrayOfCallSite[205].call(dir), "%s is not a directory.", arrayOfCallSite[206].call(dir));
    return ShortTypeHandling.castToString(arrayOfCallSite[207].callStatic(FileUtils.class, file, dir));
  }
  
  public static String relativePossiblyNonExistingPath(File file, File dir) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String path = ShortTypeHandling.castToString(arrayOfCallSite[208].call(arrayOfCallSite[209].call(arrayOfCallSite[210].call(dir), arrayOfCallSite[211].call(file))));
    return (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? toSystemDependentPath(path) : ShortTypeHandling.castToString(arrayOfCallSite[212].callStatic(FileUtils.class, path));
  }
  
  public static String toSystemDependentPath(String path) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    String pathCopy = path;
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[213].callGetProperty(File.class), "/")) {
      Object object = arrayOfCallSite[214].call(path, "/", arrayOfCallSite[215].callGetProperty(File.class));
      pathCopy = ShortTypeHandling.castToString(object);
    } 
    return pathCopy;
  }
  
  @Nonnull
  public static String getBaseName(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(file, null))
      return ""; 
    return ShortTypeHandling.castToString(arrayOfCallSite[216].callStatic(FileUtils.class, arrayOfCallSite[217].callGetProperty(file)));
  }
  
  @Nonnull
  public static String getBaseName(String fileName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(fileName, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[219].call(fileName), Integer.valueOf(0))))
        return ""; 
    } else if ((ScriptBytecodeAdapter.compareEqual(fileName, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[218].call(fileName), Integer.valueOf(0)))) {
      return "";
    } 
    int dot = DefaultTypeTransformation.intUnbox(arrayOfCallSite[220].call(fileName, "."));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((dot == 0))
        return ""; 
    } else if ((dot == 0)) {
      return "";
    } 
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((dot < 0))
        return fileName; 
      return ShortTypeHandling.castToString(arrayOfCallSite[221].call(fileName, Integer.valueOf(0), Integer.valueOf(dot)));
    } 
    if ((dot < 0))
      return fileName; 
    return ShortTypeHandling.castToString(arrayOfCallSite[221].call(fileName, Integer.valueOf(0), Integer.valueOf(dot)));
  }
  
  @Nonnull
  public static String getExtension(File file) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(file, null))
      return ""; 
    return ShortTypeHandling.castToString(arrayOfCallSite[222].callStatic(FileUtils.class, arrayOfCallSite[223].callGetProperty(file)));
  }
  
  @Nonnull
  public static String getExtension(String fileName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((ScriptBytecodeAdapter.compareEqual(fileName, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[225].call(fileName), Integer.valueOf(0))))
        return ""; 
    } else if ((ScriptBytecodeAdapter.compareEqual(fileName, null) || ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[224].call(fileName), Integer.valueOf(0)))) {
      return "";
    } 
    int dot = DefaultTypeTransformation.intUnbox(arrayOfCallSite[226].call(fileName, "."));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      if ((((dot < 0)) || ScriptBytecodeAdapter.compareGreaterThanEqual(Integer.valueOf(dot), arrayOfCallSite[229].call(arrayOfCallSite[230].call(fileName), Integer.valueOf(1)))))
        return ""; 
    } else if ((((dot < 0)) || ScriptBytecodeAdapter.compareGreaterThanEqual(Integer.valueOf(dot), arrayOfCallSite[227].call(arrayOfCallSite[228].call(fileName), Integer.valueOf(1))))) {
      return "";
    } 
    return (BytecodeInterface8.isOrigInt() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) ? ShortTypeHandling.castToString(arrayOfCallSite[233].call(fileName, Integer.valueOf(dot + 1))) : ShortTypeHandling.castToString(arrayOfCallSite[231].call(fileName, arrayOfCallSite[232].call(Integer.valueOf(dot), Integer.valueOf(1))));
  }
}
