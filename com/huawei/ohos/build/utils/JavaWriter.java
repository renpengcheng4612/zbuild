package com.huawei.ohos.build.utils;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;

public class JavaWriter implements Closeable, GroovyObject {
  private final Writer out;
  
  private static final String INDENT = "    ";
  
  private final List<Scope> scopes;
  
  public JavaWriter(Writer out) {
    Object object = arrayOfCallSite[0].callConstructor(ArrayList.class);
    this.scopes = (List<Scope>)ScriptBytecodeAdapter.castToType(object, List.class);
    MetaClass metaClass = $getStaticMetaClass();
    Writer writer = out;
    this.out = (Writer)ScriptBytecodeAdapter.castToType(writer, Writer.class);
  }
  
  public JavaWriter emitPackage(String packageName) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[1].call(this.out, "package ");
    arrayOfCallSite[2].call(this.out, packageName);
    arrayOfCallSite[3].call(this.out, ";");
    arrayOfCallSite[4].call(this.out);
    arrayOfCallSite[5].call(this.out);
    return this;
  }
  
  public JavaWriter emitJavadoc(String javadoc) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      indent();
      null;
    } else {
      arrayOfCallSite[6].callCurrent(this);
    } 
    arrayOfCallSite[7].call(this.out, "/**");
    arrayOfCallSite[8].call(this.out);
    String line;
    Iterator iterator;
    for (line = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[9].call(arrayOfCallSite[10].call(javadoc, arrayOfCallSite[11].call(System.class))), Iterator.class); iterator.hasNext(); ) {
      line = ShortTypeHandling.castToString(iterator.next());
      arrayOfCallSite[12].callCurrent(this);
      arrayOfCallSite[13].call(this.out, " * ");
      arrayOfCallSite[14].call(this.out, line);
      arrayOfCallSite[15].call(this.out);
    } 
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      indent();
      null;
      arrayOfCallSite[17].call(this.out, " */");
      arrayOfCallSite[18].call(this.out);
      return this;
    } 
    arrayOfCallSite[16].callCurrent(this);
    arrayOfCallSite[17].call(this.out, " */");
    arrayOfCallSite[18].call(this.out);
    return this;
  }
  
  private void indent() throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    int count = DefaultTypeTransformation.intUnbox(arrayOfCallSite[19].call(this.scopes));
    if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      for (int j = 0; (j < count); ) {
        arrayOfCallSite[22].call(this.out, INDENT);
        int k;
        j = (k = j) + 1;
      } 
      return;
    } 
    for (int i = 0; (i < count); ) {
      arrayOfCallSite[20].call(this.out, INDENT);
      int j;
      i = DefaultTypeTransformation.intUnbox(arrayOfCallSite[21].call(Integer.valueOf(j = i)));
      arrayOfCallSite[21].call(Integer.valueOf(j = i));
    } 
  }
  
  public JavaWriter beginType(String type, String kind, Set modifiers) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      indent();
      null;
      arrayOfCallSite[24].callCurrent(this, modifiers);
      arrayOfCallSite[25].call(this.out, kind);
      arrayOfCallSite[26].call(this.out, " ");
      arrayOfCallSite[27].call(this.out, type);
      arrayOfCallSite[28].call(this.out, " {");
      arrayOfCallSite[29].call(this.out);
      arrayOfCallSite[30].callCurrent(this, arrayOfCallSite[31].callGetProperty(Scope.class));
      return this;
    } 
    arrayOfCallSite[23].callCurrent(this);
    arrayOfCallSite[24].callCurrent(this, modifiers);
    arrayOfCallSite[25].call(this.out, kind);
    arrayOfCallSite[26].call(this.out, " ");
    arrayOfCallSite[27].call(this.out, type);
    arrayOfCallSite[28].call(this.out, " {");
    arrayOfCallSite[29].call(this.out);
    arrayOfCallSite[30].callCurrent(this, arrayOfCallSite[31].callGetProperty(Scope.class));
    return this;
  }
  
  public JavaWriter endType() throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[32].callCurrent(this, arrayOfCallSite[33].callGetProperty(Scope.class));
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      indent();
      null;
      arrayOfCallSite[35].call(this.out, "}");
      arrayOfCallSite[36].call(this.out);
      arrayOfCallSite[37].call(this.out);
      return this;
    } 
    arrayOfCallSite[34].callCurrent(this);
    arrayOfCallSite[35].call(this.out, "}");
    arrayOfCallSite[36].call(this.out);
    arrayOfCallSite[37].call(this.out);
    return this;
  }
  
  private void emitModifiers(Set modifiers) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!(modifiers instanceof EnumSet)) {
      Object object = arrayOfCallSite[38].call(EnumSet.class, modifiers);
      modifiers = (Set)ScriptBytecodeAdapter.castToType(object, Set.class);
    } 
    Modifier modifier;
    Iterator iterator;
    for (modifier = null, iterator = (Iterator)ScriptBytecodeAdapter.castToType(arrayOfCallSite[39].call(modifiers), Iterator.class); iterator.hasNext(); ) {
      modifier = (Modifier)ShortTypeHandling.castToEnum(iterator.next(), Modifier.class);
      arrayOfCallSite[40].call(arrayOfCallSite[41].call(this.out, arrayOfCallSite[42].call(modifier)), " ");
    } 
  }
  
  public JavaWriter emitField(String type, String name, Set modifiers, String initialValue) throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (!__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
      indent();
      null;
    } else {
      arrayOfCallSite[43].callCurrent(this);
    } 
    arrayOfCallSite[44].callCurrent(this, modifiers);
    arrayOfCallSite[45].call(this.out, type);
    arrayOfCallSite[46].call(this.out, " ");
    arrayOfCallSite[47].call(this.out, name);
    if (ScriptBytecodeAdapter.compareNotEqual(initialValue, null)) {
      arrayOfCallSite[48].call(this.out, " = ");
      if (ScriptBytecodeAdapter.compareEqual(type, "String")) {
        arrayOfCallSite[49].call(this.out, arrayOfCallSite[50].call(arrayOfCallSite[51].call("\"", initialValue), "\""));
      } else {
        arrayOfCallSite[52].call(this.out, initialValue);
      } 
    } 
    arrayOfCallSite[53].call(this.out, ";");
    arrayOfCallSite[54].call(this.out);
    return this;
  }
  
  private void pushScope(Scope pushed) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[55].call(this.scopes, pushed);
  }
  
  private void popScope(Scope expected) {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[56].call(this.scopes, arrayOfCallSite[57].call(arrayOfCallSite[58].call(this.scopes), Integer.valueOf(1))), expected))
      throw (Throwable)arrayOfCallSite[59].callConstructor(IllegalStateException.class); 
  }
  
  public void close() throws IOException {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[60].call(this.out);
  }
  
  enum Scope implements GroovyObject {
    TYPE_DECLARATION, INTERFACE_DECLARATION, ABSTRACT_METHOD, NON_ABSTRACT_METHOD, CONSTRUCTOR, CONTROL_FLOW, ANNOTATION_ATTRIBUTE, ANNOTATION_ARRAY_VALUE, INITIALIZER;
    
    public static final Scope MIN_VALUE;
    
    public static final Scope MAX_VALUE;
    
    @Generated
    Scope(LinkedHashMap __namedArgs) {
      MetaClass metaClass = $getStaticMetaClass();
      this.metaClass = metaClass;
      if (ScriptBytecodeAdapter.compareEqual(__namedArgs, null))
        throw (Throwable)arrayOfCallSite[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.huawei.ohos.build.utils.JavaWriter$Scope was initialized with null. Please use a non-null value or define your own constructor."); 
      arrayOfCallSite[1].callStatic(ImmutableASTTransformation.class, this, __namedArgs);
    }
    
    static {
      Object object1 = $getCallSiteArray()[13].callStatic(Scope.class, "TYPE_DECLARATION", Integer.valueOf(0));
      TYPE_DECLARATION = (Scope)ShortTypeHandling.castToEnum(object1, Scope.class);
      Object object2 = $getCallSiteArray()[14].callStatic(Scope.class, "INTERFACE_DECLARATION", Integer.valueOf(1));
      INTERFACE_DECLARATION = (Scope)ShortTypeHandling.castToEnum(object2, Scope.class);
      Object object3 = $getCallSiteArray()[15].callStatic(Scope.class, "ABSTRACT_METHOD", Integer.valueOf(2));
      ABSTRACT_METHOD = (Scope)ShortTypeHandling.castToEnum(object3, Scope.class);
      Object object4 = $getCallSiteArray()[16].callStatic(Scope.class, "NON_ABSTRACT_METHOD", Integer.valueOf(3));
      NON_ABSTRACT_METHOD = (Scope)ShortTypeHandling.castToEnum(object4, Scope.class);
      Object object5 = $getCallSiteArray()[17].callStatic(Scope.class, "CONSTRUCTOR", Integer.valueOf(4));
      CONSTRUCTOR = (Scope)ShortTypeHandling.castToEnum(object5, Scope.class);
      Object object6 = $getCallSiteArray()[18].callStatic(Scope.class, "CONTROL_FLOW", Integer.valueOf(5));
      CONTROL_FLOW = (Scope)ShortTypeHandling.castToEnum(object6, Scope.class);
      Object object7 = $getCallSiteArray()[19].callStatic(Scope.class, "ANNOTATION_ATTRIBUTE", Integer.valueOf(6));
      ANNOTATION_ATTRIBUTE = (Scope)ShortTypeHandling.castToEnum(object7, Scope.class);
      Object object8 = $getCallSiteArray()[20].callStatic(Scope.class, "ANNOTATION_ARRAY_VALUE", Integer.valueOf(7));
      ANNOTATION_ARRAY_VALUE = (Scope)ShortTypeHandling.castToEnum(object8, Scope.class);
      Object object9 = $getCallSiteArray()[21].callStatic(Scope.class, "INITIALIZER", Integer.valueOf(8));
      INITIALIZER = (Scope)ShortTypeHandling.castToEnum(object9, Scope.class);
      Scope scope1 = TYPE_DECLARATION;
      MIN_VALUE = scope1;
      Scope scope2 = INITIALIZER;
      MAX_VALUE = scope2;
      Scope[] arrayOfScope = { TYPE_DECLARATION, INTERFACE_DECLARATION, ABSTRACT_METHOD, NON_ABSTRACT_METHOD, CONSTRUCTOR, CONTROL_FLOW, ANNOTATION_ATTRIBUTE, ANNOTATION_ARRAY_VALUE, INITIALIZER };
      $VALUES = arrayOfScope;
    }
  }
}
