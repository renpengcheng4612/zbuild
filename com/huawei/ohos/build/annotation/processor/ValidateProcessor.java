package com.huawei.ohos.build.annotation.processor;

import com.huawei.ohos.build.annotation.Validate;
import com.huawei.ohos.build.consts.BuildConst;
import com.huawei.ohos.build.exception.ValidateException;
import com.huawei.ohos.build.utils.logUtils.HMLogger;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import groovy.transform.Generated;
import groovy.transform.Internal;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.xml.bind.ValidationException;
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
import org.gradle.api.Project;

public class ValidateProcessor implements GroovyObject {
  private static final HMLogger hmLogger;
  
  static {
    Object object = $getCallSiteArray()[14].call(HMLogger.class, ValidateProcessor.class);
    hmLogger = (HMLogger)ScriptBytecodeAdapter.castToType(object, HMLogger.class);
  }
  
  public static void valid(Object object, String deviceType, Project project) {
    Reference reference1 = new Reference(object), reference2 = new Reference(deviceType), reference3 = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    if (ScriptBytecodeAdapter.compareEqual(reference1.get(), null))
      return; 
    Class clazz = ShortTypeHandling.castToClass(arrayOfCallSite[0].callGetProperty(reference1.get()));
    Field[] fields = (Field[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[1].callGetProperty(clazz), Field[].class);
    arrayOfCallSite[2].call(fields, new _valid_closure1(ValidateProcessor.class, ValidateProcessor.class, reference1, reference2, reference3));
  }
  
  public final class _valid_closure1 extends Closure implements GeneratedClosure {
    public _valid_closure1(Object _outerInstance, Object _thisObject, Reference object, Reference deviceType, Reference project) {
      super(_outerInstance, _thisObject);
      Reference reference1 = object;
      this.object = reference1;
      Reference reference2 = deviceType;
      this.deviceType = reference2;
      Reference reference3 = project;
      this.project = reference3;
    }
    
    public Object doCall(Object field) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return arrayOfCallSite[0].callStatic(ValidateProcessor.class, field, this.object.get(), this.deviceType.get(), this.project.get());
    }
    
    @Generated
    public Object getObject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.object.get();
    }
    
    @Generated
    public String getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.deviceType.get());
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
  }
  
  public static void validate(Field field, Object object, String deviceType, Project project) {
    Reference reference1 = new Reference(field), reference2 = new Reference(object), reference3 = new Reference(deviceType), reference4 = new Reference(project);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference message = new Reference(null);
    (String)message.get();
    Reference value = new Reference(null);
    Validate[] validates = (Validate[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[3].call(reference1.get(), Validate.class), Validate[].class);
    try {
      Object object1 = arrayOfCallSite[4].call(reference1.get(), reference2.get());
      value.set(object1);
    } catch (ValidationException e) {
      arrayOfCallSite[5].call(hmLogger, arrayOfCallSite[6].callConstructor(ValidationException.class, arrayOfCallSite[7].call(String.class, arrayOfCallSite[8].callGetProperty(Locale.class), arrayOfCallSite[9].callGetProperty(ValidateException.class), arrayOfCallSite[10].callGetProperty(reference4.get()))));
    } finally {}
    if (ScriptBytecodeAdapter.compareEqual(validates, null))
      return; 
    arrayOfCallSite[11].call(validates, new _validate_closure2(ValidateProcessor.class, ValidateProcessor.class, reference3, reference2, message, reference4, reference1, value));
  }
  
  public final class _validate_closure2 extends Closure implements GeneratedClosure {
    public _validate_closure2(Object _outerInstance, Object _thisObject, Reference deviceType, Reference object, Reference message, Reference project, Reference field, Reference value) {
      super(_outerInstance, _thisObject);
      Reference reference1 = deviceType;
      this.deviceType = reference1;
      Reference reference2 = object;
      this.object = reference2;
      Reference reference3 = message;
      this.message = reference3;
      Reference reference4 = project;
      this.project = reference4;
      Reference reference5 = field;
      this.field = reference5;
      Reference reference6 = value;
      this.value = reference6;
    }
    
    public Object doCall(Object validate) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[3].call(validate), "") && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[4].call(this.deviceType.get(), arrayOfCallSite[5].call(validate))))))
          return null; 
      } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[0].call(validate), "") && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[1].call(this.deviceType.get(), arrayOfCallSite[2].call(validate)))))) {
        return null;
      } 
      String[] objSimpleName = (String[])ScriptBytecodeAdapter.castToType(arrayOfCallSite[6].call(arrayOfCallSite[7].callGetProperty(arrayOfCallSite[8].callGetProperty(this.object.get())), "Options"), String[].class);
      String parentTag = "";
      if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
        if (ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[12].call(objSimpleName), Integer.valueOf(0))) {
          Object object1 = arrayOfCallSite[13].call(BytecodeInterface8.objectArrayGet((Object[])objSimpleName, 0));
          parentTag = ShortTypeHandling.castToString(object1);
        } 
      } else if (ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[9].call(objSimpleName), Integer.valueOf(0))) {
        Object object1 = arrayOfCallSite[10].call(arrayOfCallSite[11].call(objSimpleName, Integer.valueOf(0)));
        parentTag = ShortTypeHandling.castToString(object1);
      } 
      Object object = ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[14].call(validate), "") ? arrayOfCallSite[15].call(String.class, ArrayUtil.createArray(arrayOfCallSite[16].callGetProperty(Locale.class), arrayOfCallSite[17].callGetProperty(ValidateException.class), arrayOfCallSite[18].callGetProperty(this.project.get()), arrayOfCallSite[19].call(parentTag), ScriptBytecodeAdapter.compareEqual(arrayOfCallSite[20].callGetProperty(this.field.get()), "packageName") ? "package" : arrayOfCallSite[21].callGetProperty(this.field.get()))) : arrayOfCallSite[22].call(validate);
      this.message.set(ShortTypeHandling.castToString(object));
      if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[23].call(validate), "") && DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[24].call(arrayOfCallSite[25].callGetProperty(BuildConst.class), arrayOfCallSite[26].call(validate)))))
        if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[27].call(validate)) && ScriptBytecodeAdapter.compareNotEqual(this.value.get(), null)))
          arrayOfCallSite[28].call(arrayOfCallSite[29].callGetProperty(ValidateProcessor.class), arrayOfCallSite[30].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", ", Lite Device does not support the tag." })));  
      if ((DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[31].call(validate)) && ScriptBytecodeAdapter.compareEqual(this.value.get(), null)))
        arrayOfCallSite[32].call(arrayOfCallSite[33].callGetProperty(ValidateProcessor.class), arrayOfCallSite[34].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " is notEmpty" }))); 
      if (ScriptBytecodeAdapter.compareNotEqual(this.value.get(), null)) {
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[43].call(validate), Integer.valueOf(0)) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[44].call(arrayOfCallSite[45].call(this.value.get())), arrayOfCallSite[46].call(validate))))
            arrayOfCallSite[47].call(arrayOfCallSite[48].callGetProperty(ValidateProcessor.class), arrayOfCallSite[49].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[50].call(validate) }, new String[] { "", " length is more than ", "" }))); 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[35].call(validate), Integer.valueOf(0)) && ScriptBytecodeAdapter.compareGreaterThan(arrayOfCallSite[36].call(arrayOfCallSite[37].call(this.value.get())), arrayOfCallSite[38].call(validate)))) {
          arrayOfCallSite[39].call(arrayOfCallSite[40].callGetProperty(ValidateProcessor.class), arrayOfCallSite[41].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[42].call(validate) }, new String[] { "", " length is more than ", "" })));
        } 
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[60].call(validate), Integer.valueOf(0)) && ScriptBytecodeAdapter.compareLessThan(arrayOfCallSite[61].call(arrayOfCallSite[62].call(this.value.get())), arrayOfCallSite[63].call(validate))))
            arrayOfCallSite[64].call(arrayOfCallSite[65].callGetProperty(ValidateProcessor.class), arrayOfCallSite[66].callConstructor(ValidateException.class, arrayOfCallSite[67].call(new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " length is less than " }), arrayOfCallSite[68].call(validate)))); 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[51].call(validate), Integer.valueOf(0)) && ScriptBytecodeAdapter.compareLessThan(arrayOfCallSite[52].call(arrayOfCallSite[53].call(this.value.get())), arrayOfCallSite[54].call(validate)))) {
          arrayOfCallSite[55].call(arrayOfCallSite[56].callGetProperty(ValidateProcessor.class), arrayOfCallSite[57].callConstructor(ValidateException.class, arrayOfCallSite[58].call(new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " length is less than " }), arrayOfCallSite[59].call(validate))));
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[77].call("", arrayOfCallSite[78].call(validate)))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[79].call(Pattern.class, arrayOfCallSite[80].call(validate), arrayOfCallSite[81].call(this.value.get()))))))
            arrayOfCallSite[82].call(arrayOfCallSite[83].callGetProperty(ValidateProcessor.class), arrayOfCallSite[84].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " effectiveness" }))); 
        } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[69].call("", arrayOfCallSite[70].call(validate)))) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[71].call(Pattern.class, arrayOfCallSite[72].call(validate), arrayOfCallSite[73].call(this.value.get())))))) {
          arrayOfCallSite[74].call(arrayOfCallSite[75].callGetProperty(ValidateProcessor.class), arrayOfCallSite[76].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " effectiveness" })));
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[98].call(validate), ScriptBytecodeAdapter.createList(new Object[0])) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[99].callStatic(ValidateProcessor.class, arrayOfCallSite[100].call(validate), this.value.get()))))) {
            Reference range = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[101].callConstructor(StringBuffer.class), StringBuffer.class));
            arrayOfCallSite[102].call(arrayOfCallSite[103].call(validate), new _closure4(this, getThisObject(), range));
            arrayOfCallSite[104].call(arrayOfCallSite[105].callGetProperty(ValidateProcessor.class), arrayOfCallSite[106].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[107].call(arrayOfCallSite[108].call(range.get(), Integer.valueOf(0), arrayOfCallSite[109].call(arrayOfCallSite[110].call(range.get()), Integer.valueOf(1)))) }new String[] { "", " effectiveness, It has to be in these [", "]" })));
          } 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[85].call(validate), ScriptBytecodeAdapter.createList(new Object[0])) && (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[86].callStatic(ValidateProcessor.class, arrayOfCallSite[87].call(validate), this.value.get()))))) {
          Reference range = new Reference(ScriptBytecodeAdapter.castToType(arrayOfCallSite[88].callConstructor(StringBuffer.class), StringBuffer.class));
          arrayOfCallSite[89].call(arrayOfCallSite[90].call(validate), new _closure4(this, getThisObject(), range));
          arrayOfCallSite[91].call(arrayOfCallSite[92].callGetProperty(ValidateProcessor.class), arrayOfCallSite[93].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[94].call(arrayOfCallSite[95].call(range.get(), Integer.valueOf(0), arrayOfCallSite[96].call(arrayOfCallSite[97].call(range.get()), Integer.valueOf(1)))) }new String[] { "", " effectiveness, It has to be in these [", "]" })));
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[118].call(validate), arrayOfCallSite[119].callGetProperty(Integer.class)) && ScriptBytecodeAdapter.compareLessThan(this.value.get(), arrayOfCallSite[120].call(validate))))
            arrayOfCallSite[121].call(arrayOfCallSite[122].callGetProperty(ValidateProcessor.class), arrayOfCallSite[123].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[124].call(validate) }, new String[] { "", " value is less than ", "" }))); 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[111].call(validate), arrayOfCallSite[112].callGetProperty(Integer.class)) && ScriptBytecodeAdapter.compareLessThan(this.value.get(), arrayOfCallSite[113].call(validate)))) {
          arrayOfCallSite[114].call(arrayOfCallSite[115].callGetProperty(ValidateProcessor.class), arrayOfCallSite[116].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[117].call(validate) }, new String[] { "", " value is less than ", "" })));
        } 
        if (BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
          if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[132].call(validate), arrayOfCallSite[133].callGetProperty(Integer.class)) && ScriptBytecodeAdapter.compareGreaterThan(this.value.get(), arrayOfCallSite[134].call(validate))))
            arrayOfCallSite[135].call(arrayOfCallSite[136].callGetProperty(ValidateProcessor.class), arrayOfCallSite[137].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[138].call(validate) }, new String[] { "", " value is more than ", "" }))); 
        } else if ((ScriptBytecodeAdapter.compareNotEqual(arrayOfCallSite[125].call(validate), arrayOfCallSite[126].callGetProperty(Integer.class)) && ScriptBytecodeAdapter.compareGreaterThan(this.value.get(), arrayOfCallSite[127].call(validate)))) {
          arrayOfCallSite[128].call(arrayOfCallSite[129].callGetProperty(ValidateProcessor.class), arrayOfCallSite[130].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get(), arrayOfCallSite[131].call(validate) }, new String[] { "", " value is more than ", "" })));
        } 
        if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[139].call(validate))) {
          if (DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[140].call(Pattern.class, ".*\\{.*}.*", arrayOfCallSite[141].call(this.value.get()))))
            return null; 
          if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[149].call(arrayOfCallSite[150].call(this.value.get()), "\\$"))) && ScriptBytecodeAdapter.compareLessThan(arrayOfCallSite[151].call(arrayOfCallSite[152].call(this.value.get()), ":"), Integer.valueOf(0))))
              arrayOfCallSite[153].call(arrayOfCallSite[154].callGetProperty(ValidateProcessor.class), arrayOfCallSite[155].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " not the correct resource reference" }))); 
          } else if (((!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[142].call(arrayOfCallSite[143].call(this.value.get()), "\\$"))) && ScriptBytecodeAdapter.compareLessThan(arrayOfCallSite[144].call(arrayOfCallSite[145].call(this.value.get()), ":"), Integer.valueOf(0)))) {
            arrayOfCallSite[146].call(arrayOfCallSite[147].callGetProperty(ValidateProcessor.class), arrayOfCallSite[148].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " not the correct resource reference" })));
          } 
          String name = ShortTypeHandling.castToString(arrayOfCallSite[156].call(arrayOfCallSite[157].call(this.value.get()), arrayOfCallSite[158].call(arrayOfCallSite[159].call(arrayOfCallSite[160].call(this.value.get()), ":"), Integer.valueOf(1)), arrayOfCallSite[161].call(arrayOfCallSite[162].call(this.value.get()))));
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[163].call(Pattern.class, "[a-zA-Z].*", name)))
            arrayOfCallSite[164].call(arrayOfCallSite[165].callGetProperty(ValidateProcessor.class), arrayOfCallSite[166].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " resource name begin with a character" }))); 
          if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[167].call(Pattern.class, "[a-zA-Z]\\w+", name)))
            return arrayOfCallSite[168].call(arrayOfCallSite[169].callGetProperty(ValidateProcessor.class), arrayOfCallSite[170].callConstructor(ValidateException.class, new GStringImpl(new Object[] { this.message.get() }, new String[] { "", " is a valid resource name character" }))); 
          return null;
        } 
        return null;
      } 
      return null;
    }
    
    @Generated
    public String getDeviceType() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.deviceType.get());
    }
    
    @Generated
    public Object getObject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.object.get();
    }
    
    @Generated
    public String getMessage() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return ShortTypeHandling.castToString(this.message.get());
    }
    
    @Generated
    public Project getProject() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Project)ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
    }
    
    @Generated
    public Field getField() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Field)ScriptBytecodeAdapter.castToType(this.field.get(), Field.class);
    }
    
    @Generated
    public Object getValue() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return this.value.get();
    }
    
    public final class _closure4 extends Closure implements GeneratedClosure {
      public _closure4(Object _outerInstance, Object _thisObject, Reference range) {
        super(_outerInstance, _thisObject);
        Reference reference = range;
        this.range = reference;
      }
      
      public Object doCall(Object it) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return arrayOfCallSite[0].call(this.range.get(), arrayOfCallSite[1].call(it, ","));
      }
      
      @Generated
      public StringBuffer getRange() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return (StringBuffer)ScriptBytecodeAdapter.castToType(this.range.get(), StringBuffer.class);
      }
      
      @Generated
      public Object doCall() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        return doCall(null);
      }
    }
  }
  
  public static boolean contains(String[] range, Object obj) {
    Reference reference1 = new Reference(range);
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    Reference isContains = new Reference(Boolean.valueOf(true));
    if (obj instanceof java.util.Collection)
      arrayOfCallSite[12].call(obj, new _contains_closure3(ValidateProcessor.class, ValidateProcessor.class, reference1, isContains)); 
    if (obj instanceof String && (
      !DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[13].call(reference1.get(), obj)))) {
      boolean bool = false;
      isContains.set(Boolean.valueOf(bool));
    } 
    return DefaultTypeTransformation.booleanUnbox(isContains.get());
  }
  
  @Generated
  public ValidateProcessor() {
    MetaClass metaClass = $getStaticMetaClass();
    this.metaClass = metaClass;
  }
  
  public final class _contains_closure3 extends Closure implements GeneratedClosure {
    public _contains_closure3(Object _outerInstance, Object _thisObject, Reference range, Reference isContains) {
      super(_outerInstance, _thisObject);
      Reference reference1 = range;
      this.range = reference1;
      Reference reference2 = isContains;
      this.isContains = reference2;
    }
    
    public Object doCall(Object it) {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      if (!DefaultTypeTransformation.booleanUnbox(arrayOfCallSite[0].call(this.range.get(), it))) {
        boolean bool = false;
        this.isContains.set(Boolean.valueOf(bool));
        return Boolean.valueOf(bool);
      } 
      return null;
    }
    
    @Generated
    public String[] getRange() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (String[])ScriptBytecodeAdapter.castToType(this.range.get(), String[].class);
    }
    
    @Generated
    public Boolean getIsContains() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return (Boolean)ScriptBytecodeAdapter.castToType(this.isContains.get(), Boolean.class);
    }
    
    @Generated
    public Object doCall() {
      CallSite[] arrayOfCallSite = $getCallSiteArray();
      return doCall(null);
    }
  }
}
