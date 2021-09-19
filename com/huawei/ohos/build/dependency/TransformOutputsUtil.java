package com.huawei.ohos.build.dependency;

import groovy.io.FileType;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Stack;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.artifacts.transform.TransformOutputs;

public class TransformOutputsUtil implements GroovyObject {
  @Generated
  public TransformOutputsUtil() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public static void outputDirIfEqual(File inputFile, TransformOutputs transformOutputs, String dirName) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Object file = arrayOfCallSite[0].callConstructor(File.class, inputFile, dirName);
    if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(file)))
      arrayOfCallSite[2].call(transformOutputs, file); 
  }
  
  public static Object outputFileIfEqual(File file, TransformOutputs transformOutputs, String fileName) {
    Reference reference1 = new Reference(transformOutputs), reference2 = new Reference(fileName);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    return arrayOfCallSite[3].call(file, arrayOfCallSite[4].callGetProperty(FileType.class), new _outputFileIfEqual_closure1(TransformOutputsUtil.class, TransformOutputsUtil.class, reference2, reference1));
  }
  
  public final class _outputFileIfEqual_closure1 extends Closure implements GeneratedClosure {
    public _outputFileIfEqual_closure1(Object _outerInstance, Object _thisObject, Reference fileName, Reference transformOutputs) {
      super(_outerInstance, _thisObject);
      Reference reference1 = fileName;
      this.fileName = reference1;
      Reference reference2 = transformOutputs;
      this.transformOutputs = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[0].call(arrayOfCallSite[1].callGetProperty(arrayOfCallSite[2].call(it))), this.fileName.get()))
        return arrayOfCallSite[3].call(this.transformOutputs.get(), it); 
      return null;
    }
    
    @Generated
    public String getFileName() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.fileName.get());
    }
    
    @Generated
    public TransformOutputs getTransformOutputs() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (TransformOutputs)ScriptBytecodeAdapter.castToType(this.transformOutputs.get(), TransformOutputs.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
  
  public static Object outputWithSuffix(File inputFile, TransformOutputs transformOutputs, String suffix) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Stack stackDir = (Stack)ScriptBytecodeAdapter.castToType(arrayOfCallSite[5].callConstructor(Stack.class), Stack.class);
    arrayOfCallSite[6].call(stackDir, inputFile);
    while (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[7].call(stackDir))) {
      File file = (File)ScriptBytecodeAdapter.castToType(arrayOfCallSite[8].call(stackDir), File.class);
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[9].call(file))) {
        arrayOfCallSite[10].call(stackDir, arrayOfCallSite[11].call(file));
        continue;
      } 
      if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[12].call(arrayOfCallSite[13].callGetProperty(file), suffix)))
        arrayOfCallSite[14].call(transformOutputs, file); 
    } 
    return null;
  }
}
