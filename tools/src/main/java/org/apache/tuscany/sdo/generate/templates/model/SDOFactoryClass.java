package org.apache.tuscany.sdo.generate.templates.model;

import org.apache.tuscany.sdo.generate.util.*;
import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;
import org.eclipse.emf.ecore.util.*;

public class SDOFactoryClass
{
  protected static String nl;
  public static synchronized SDOFactoryClass create(String lineSeparator)
  {
    nl = lineSeparator;
    SDOFactoryClass result = new SDOFactoryClass();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Factory</b> for the model." + NL + " * It provides a create method for each non-abstract class of the model." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_12 = NL + " * @see ";
  protected final String TEXT_13 = NL + " * @generated" + NL + " */";
  protected final String TEXT_14 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Factory</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_15 = NL + "public class ";
  protected final String TEXT_16 = " extends ";
  protected final String TEXT_17 = " implements ";
  protected final String TEXT_18 = NL + "public interface ";
  protected final String TEXT_19 = " extends ";
  protected final String TEXT_20 = NL + "{";
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_22 = " copyright = \"";
  protected final String TEXT_23 = "\";";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_27 = " INSTANCE = ";
  protected final String TEXT_28 = ".init();" + NL;
  protected final String TEXT_29 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_30 = " eINSTANCE = ";
  protected final String TEXT_31 = ".init();" + NL;
  protected final String TEXT_32 = NL + "\t/**" + NL + "\t * The package namespace URI." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_33 = " NAMESPACE_URI = \"";
  protected final String TEXT_34 = "\";";
  protected final String TEXT_35 = NL + NL + "\t/**" + NL + "\t * The package namespace name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_36 = " NAMESPACE_PREFIX = \"";
  protected final String TEXT_37 = "\";";
  protected final String TEXT_38 = "\t" + NL + "\t";
  protected final String TEXT_39 = "int ";
  protected final String TEXT_40 = " = ";
  protected final String TEXT_41 = ";";
  protected final String TEXT_42 = NL + "\t";
  protected final String TEXT_43 = NL + "\t/**" + NL + "\t * Creates an instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_44 = "()" + NL + "\t{" + NL + "\t\tsuper(NAMESPACE_URI, NAMESPACE_PREFIX);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_45 = " create(int typeNumber)" + NL + "\t{" + NL + "\t\tswitch (typeNumber)" + NL + "\t\t{";
  protected final String TEXT_46 = NL + "\t\t\tcase ";
  protected final String TEXT_47 = ": return (";
  protected final String TEXT_48 = ")create";
  protected final String TEXT_49 = "();";
  protected final String TEXT_50 = NL + "\t\t\tdefault:" + NL + "\t\t\t\treturn super.create(typeNumber);" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object createFromString(int typeNumber, String initialValue)" + NL + "\t{" + NL + "\t\tswitch (typeNumber)" + NL + "\t\t{";
  protected final String TEXT_52 = NL + "\t\t\tcase ";
  protected final String TEXT_53 = ":" + NL + "\t\t\t\treturn create";
  protected final String TEXT_54 = "FromString(initialValue);";
  protected final String TEXT_55 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The type number '\" + typeNumber + \"' is not a valid datatype\");";
  protected final String TEXT_56 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convertToString(int typeNumber, Object instanceValue)" + NL + "\t{" + NL + "\t\tswitch (typeNumber)" + NL + "\t\t{";
  protected final String TEXT_57 = NL + "\t\t\tcase ";
  protected final String TEXT_58 = ":" + NL + "\t\t\t\treturn convert";
  protected final String TEXT_59 = "ToString(instanceValue);";
  protected final String TEXT_60 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The type number '\" + typeNumber + \"' is not a valid datatype\");";
  protected final String TEXT_61 = NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_63 = " create";
  protected final String TEXT_64 = "()" + NL + "\t{";
  protected final String TEXT_65 = NL + "\t\t";
  protected final String TEXT_66 = " ";
  protected final String TEXT_67 = " = ";
  protected final String TEXT_68 = "super.create(";
  protected final String TEXT_69 = ");";
  protected final String TEXT_70 = NL + "\t\t";
  protected final String TEXT_71 = " ";
  protected final String TEXT_72 = " = new ";
  protected final String TEXT_73 = "()";
  protected final String TEXT_74 = "{}";
  protected final String TEXT_75 = ";";
  protected final String TEXT_76 = NL + "\t\treturn ";
  protected final String TEXT_77 = ";" + NL + "\t}";
  protected final String TEXT_78 = NL + "\t" + NL + "\t// Following creates and initializes SDO metadata for the supported types.";
  protected final String TEXT_79 = "\t";
  protected final String TEXT_80 = "\t" + NL + "\tprotected ";
  protected final String TEXT_81 = " ";
  protected final String TEXT_82 = "Type = null;" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_83 = " get";
  protected final String TEXT_84 = "()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_85 = "Type;" + NL + "\t}" + NL;
  protected final String TEXT_86 = "\t" + NL + "" + NL + "\tprivate static boolean isInited = false;" + NL + "" + NL + "\tpublic static ";
  protected final String TEXT_87 = " init()" + NL + "\t{" + NL + "\t\tif (isInited) return (";
  protected final String TEXT_88 = ")FactoryBase.getStaticFactory(";
  protected final String TEXT_89 = ".NAMESPACE_URI);" + NL + "\t\t";
  protected final String TEXT_90 = " the";
  protected final String TEXT_91 = " = new ";
  protected final String TEXT_92 = "();" + NL + "\t\tisInited = true;" + NL + "" + NL + "\t\t// Initialize simple dependencies";
  protected final String TEXT_93 = NL + "\t\t";
  protected final String TEXT_94 = ".registerStaticTypes(";
  protected final String TEXT_95 = ".class);";
  protected final String TEXT_96 = NL + NL + "\t\t// Create package meta-data objects" + NL + "\t\tthe";
  protected final String TEXT_97 = ".createMetaData();" + NL + "" + NL + "\t\t// Initialize created meta-data" + NL + "\t\tthe";
  protected final String TEXT_98 = ".initializeMetaData();" + NL + "" + NL + "\t\t// Mark meta-data to indicate it can't be changed" + NL + "\t\t//the";
  protected final String TEXT_99 = ".freeze(); //FB do we need to freeze / should we freeze ????" + NL + "" + NL + "\t\treturn the";
  protected final String TEXT_100 = ";" + NL + "\t}" + NL + "  " + NL + "\tprivate boolean isCreated = false;" + NL + "" + NL + "\tpublic void createMetaData()" + NL + "\t{" + NL + "\t\tif (isCreated) return;" + NL + "\t\tisCreated = true;";
  protected final String TEXT_101 = "\t";
  protected final String TEXT_102 = NL;
  protected final String TEXT_103 = NL + "\t\t";
  protected final String TEXT_104 = "Type = createType(false, ";
  protected final String TEXT_105 = ");";
  protected final String TEXT_106 = NL + "\t\tcreateProperty(";
  protected final String TEXT_107 = ", ";
  protected final String TEXT_108 = "Type, ";
  protected final String TEXT_109 = ".";
  protected final String TEXT_110 = ");";
  protected final String TEXT_111 = NL + "\t\t// Create enums" + NL + "\t\t// todo";
  protected final String TEXT_112 = NL + "\t\t";
  protected final String TEXT_113 = " = createEEnum(";
  protected final String TEXT_114 = ");";
  protected final String TEXT_115 = NL + "\t\t";
  protected final String TEXT_116 = "Type = createType(true, ";
  protected final String TEXT_117 = " );";
  protected final String TEXT_118 = NL + "\t}" + NL + "\t" + NL + "\tprivate boolean isInitialized = false;" + NL + "" + NL + "\tpublic void initializeMetaData()" + NL + "\t{" + NL + "\t\tif (isInitialized) return;" + NL + "\t\tisInitialized = true;";
  protected final String TEXT_119 = NL + NL + "\t\t// Obtain other dependent packages";
  protected final String TEXT_120 = NL + "\t\t";
  protected final String TEXT_121 = " ";
  protected final String TEXT_122 = " = (";
  protected final String TEXT_123 = ")FactoryBase.getStaticFactory(";
  protected final String TEXT_124 = ".NAMESPACE_URI);";
  protected final String TEXT_125 = NL + "\t\t";
  protected final String TEXT_126 = " property = null;" + NL + "" + NL + "\t\t// Add supertypes to classes";
  protected final String TEXT_127 = NL + "\t\taddSuperType(";
  protected final String TEXT_128 = "Type, ";
  protected final String TEXT_129 = "Type);";
  protected final String TEXT_130 = NL + NL + "\t\t// Initialize classes and features; add operations and parameters";
  protected final String TEXT_131 = NL + "\t\tinitializeType(";
  protected final String TEXT_132 = "Type, ";
  protected final String TEXT_133 = ".class, \"";
  protected final String TEXT_134 = "\");";
  protected final String TEXT_135 = NL + "\t\tsetInstanceProperty (";
  protected final String TEXT_136 = "Type, \"";
  protected final String TEXT_137 = "\", ";
  protected final String TEXT_138 = ", ";
  protected final String TEXT_139 = ");";
  protected final String TEXT_140 = NL;
  protected final String TEXT_141 = NL + "\t\tproperty = (";
  protected final String TEXT_142 = ")";
  protected final String TEXT_143 = "Type.getProperties().get(";
  protected final String TEXT_144 = ".";
  protected final String TEXT_145 = ");";
  protected final String TEXT_146 = NL + "\t\tinitializeProperty(property, ";
  protected final String TEXT_147 = ", \"";
  protected final String TEXT_148 = "\", ";
  protected final String TEXT_149 = ", ";
  protected final String TEXT_150 = ", ";
  protected final String TEXT_151 = ", ";
  protected final String TEXT_152 = ", ";
  protected final String TEXT_153 = ", ";
  protected final String TEXT_154 = ", ";
  protected final String TEXT_155 = ", ";
  protected final String TEXT_156 = " , ";
  protected final String TEXT_157 = ");";
  protected final String TEXT_158 = NL + "\t\tinitializeProperty(property, ";
  protected final String TEXT_159 = ", \"";
  protected final String TEXT_160 = "\", ";
  protected final String TEXT_161 = ", ";
  protected final String TEXT_162 = ", ";
  protected final String TEXT_163 = ", ";
  protected final String TEXT_164 = ", ";
  protected final String TEXT_165 = ", ";
  protected final String TEXT_166 = ", ";
  protected final String TEXT_167 = ");";
  protected final String TEXT_168 = NL + "\t\tsetInstanceProperty (property, \"";
  protected final String TEXT_169 = "\", ";
  protected final String TEXT_170 = ", ";
  protected final String TEXT_171 = ");";
  protected final String TEXT_172 = NL;
  protected final String TEXT_173 = NL + "\t\t// Initialize data types";
  protected final String TEXT_174 = NL + "\t\tinitializeType(";
  protected final String TEXT_175 = "Type, ";
  protected final String TEXT_176 = ".class, \"";
  protected final String TEXT_177 = "\", ";
  protected final String TEXT_178 = ", ";
  protected final String TEXT_179 = ");";
  protected final String TEXT_180 = NL + "\t\tsetInstanceProperty (";
  protected final String TEXT_181 = "Type, \"";
  protected final String TEXT_182 = "\", ";
  protected final String TEXT_183 = ", ";
  protected final String TEXT_184 = ");";
  protected final String TEXT_185 = NL;
  protected final String TEXT_186 = NL + "\t\tcreateXSDMetaData(";
  protected final String TEXT_187 = ");" + NL + "\t}" + NL + "\t  " + NL + "\tprotected void createXSDMetaData(";
  protected final String TEXT_188 = ")" + NL + "\t{" + NL + "\t\tsuper.createXSDMetaData();" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_189 = " property = null;" + NL + "\t\t";
  protected final String TEXT_190 = NL + "\t\taddXSDMapping" + NL + "\t\t  (new String[]" + NL + "\t\t\t {";
  protected final String TEXT_191 = NL + "\t\t\t ";
  protected final String TEXT_192 = ", ";
  protected final String TEXT_193 = NL + "\t\t\t });" + NL;
  protected final String TEXT_194 = NL + "\t\taddXSDMapping" + NL + "\t\t  (";
  protected final String TEXT_195 = "Type," + NL + "\t\t\t new String[] " + NL + "\t\t\t {";
  protected final String TEXT_196 = NL + "\t\t\t ";
  protected final String TEXT_197 = ", ";
  protected final String TEXT_198 = NL + "\t\t\t });" + NL;
  protected final String TEXT_199 = NL + "\t\tproperty = createGlobalProperty" + NL + "\t\t  (\"";
  protected final String TEXT_200 = "\"," + NL + "\t\t  ";
  protected final String TEXT_201 = ".get";
  protected final String TEXT_202 = "()," + NL + "\t\t\t new String[]" + NL + "\t\t\t {";
  protected final String TEXT_203 = NL + "\t\t\t ";
  protected final String TEXT_204 = ", ";
  protected final String TEXT_205 = NL + "\t\t\t }," + NL + "\t\t\t IS_ATTRIBUTE);";
  protected final String TEXT_206 = NL + "\t\t\t });";
  protected final String TEXT_207 = NL + "              ";
  protected final String TEXT_208 = NL + "\t\tsetInstanceProperty" + NL + "\t\t  (property," + NL + "\t\t\t \"";
  protected final String TEXT_209 = "\"," + NL + "\t\t\t ";
  protected final String TEXT_210 = ", ";
  protected final String TEXT_211 = ");";
  protected final String TEXT_212 = NL + "                  ";
  protected final String TEXT_213 = "  ";
  protected final String TEXT_214 = NL + "\t\taddXSDMapping" + NL + "\t\t  ((";
  protected final String TEXT_215 = ")";
  protected final String TEXT_216 = "Type.getProperties().get(";
  protected final String TEXT_217 = ".";
  protected final String TEXT_218 = ")," + NL + "\t\t\t new String[]" + NL + "\t\t\t {";
  protected final String TEXT_219 = NL + "\t\t\t ";
  protected final String TEXT_220 = ", ";
  protected final String TEXT_221 = NL + "\t\t\t });" + NL;
  protected final String TEXT_222 = NL + "  }" + NL + "  ";
  protected final String TEXT_223 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_224 = " create";
  protected final String TEXT_225 = "FromString(String initialValue)" + NL + "\t{";
  protected final String TEXT_226 = NL + "\t\t";
  protected final String TEXT_227 = " result = ";
  protected final String TEXT_228 = ".get(initialValue);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + initialValue + \"' is not a valid enumerator of '\" + type.getName() + \"'\");";
  protected final String TEXT_229 = NL + "\t\treturn result;";
  protected final String TEXT_230 = NL + "\t\treturn (";
  protected final String TEXT_231 = ")create";
  protected final String TEXT_232 = "FromString(initialValue);";
  protected final String TEXT_233 = NL + "\t\treturn (";
  protected final String TEXT_234 = ")";
  protected final String TEXT_235 = ".create";
  protected final String TEXT_236 = "FromString(initialValue);";
  protected final String TEXT_237 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_238 = " result = new ";
  protected final String TEXT_239 = "();" + NL + "\t\tfor (";
  protected final String TEXT_240 = " stringTokenizer = new ";
  protected final String TEXT_241 = "(initialValue); stringTokenizer.hasMoreTokens(); )" + NL + "\t\t{" + NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_242 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_243 = "FromString(item));";
  protected final String TEXT_244 = NL + "\t\t\tresult.add(";
  protected final String TEXT_245 = ".create";
  protected final String TEXT_246 = "FromString(item));";
  protected final String TEXT_247 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_248 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_249 = " result = null;" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_250 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_251 = NL + "\t\t\tresult = (";
  protected final String TEXT_252 = ")create";
  protected final String TEXT_253 = "FromString(initialValue);";
  protected final String TEXT_254 = NL + "\t\t\tresult = (";
  protected final String TEXT_255 = ")";
  protected final String TEXT_256 = ".create";
  protected final String TEXT_257 = "FromString(initialValue);";
  protected final String TEXT_258 = NL + "\t\t\tif (result != null/* && Diagnostician.INSTANCE.validate(type, result, null, null)*/)" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_259 = NL + "\t\tif (result != null || exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_260 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_261 = "();";
  protected final String TEXT_262 = NL + "\t\treturn (";
  protected final String TEXT_263 = ")super.createFromString(";
  protected final String TEXT_264 = ", initialValue);";
  protected final String TEXT_265 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convert";
  protected final String TEXT_266 = "ToString(Object instanceValue)" + NL + "\t{";
  protected final String TEXT_267 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_268 = NL + "\t\treturn convert";
  protected final String TEXT_269 = "ToString(instanceValue);";
  protected final String TEXT_270 = NL + "\t\treturn ";
  protected final String TEXT_271 = ".convert";
  protected final String TEXT_272 = "ToString(instanceValue);";
  protected final String TEXT_273 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_274 = " list = (";
  protected final String TEXT_275 = ")instanceValue;" + NL + "\t\tif (list.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_276 = " result = new ";
  protected final String TEXT_277 = "();" + NL + "\t\tfor (";
  protected final String TEXT_278 = " i = list.iterator(); i.hasNext(); )" + NL + "\t\t{";
  protected final String TEXT_279 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_280 = "ToString(i.next()));";
  protected final String TEXT_281 = NL + "\t\t\tresult.append(";
  protected final String TEXT_282 = ".convert";
  protected final String TEXT_283 = "ToString(i.next()));";
  protected final String TEXT_284 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_285 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_286 = NL + "\t\tif (";
  protected final String TEXT_287 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_288 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_289 = "ToString(instanceValue);";
  protected final String TEXT_290 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_291 = ".convert";
  protected final String TEXT_292 = "ToString(instanceValue);";
  protected final String TEXT_293 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_294 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :";
  protected final String TEXT_295 = "\");";
  protected final String TEXT_296 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_297 = "();";
  protected final String TEXT_298 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_299 = ", instanceValue);";
  protected final String TEXT_300 = NL + "\t}" + NL;
  protected final String TEXT_301 = NL + "\t/**" + NL + "\t * Returns a new object of class '<em>";
  protected final String TEXT_302 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return a new object of class '<em>";
  protected final String TEXT_303 = "</em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_304 = " create";
  protected final String TEXT_305 = "();" + NL;
  protected final String TEXT_306 = NL + "\t/**" + NL + "\t * Returns an instance of data type '<em>";
  protected final String TEXT_307 = "</em>' corresponding the given literal." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal a literal of the data type." + NL + "\t * @return a new instance value of the data type." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_308 = " create";
  protected final String TEXT_309 = "(String literal);" + NL + "" + NL + "\t/**" + NL + "\t * Returns a literal representation of an instance of data type '<em>";
  protected final String TEXT_310 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param instanceValue an instance value of the data type." + NL + "\t * @return a literal representation of the instance value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tString convert";
  protected final String TEXT_311 = "(";
  protected final String TEXT_312 = " instanceValue);" + NL;
  protected final String TEXT_313 = NL + "} //";
  protected final String TEXT_314 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

    GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    if (isInterface || genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    if (isImplementation) {
    if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
    }
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_10);
    if (isInterface) {
    stringBuffer.append(TEXT_11);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    }
    stringBuffer.append(TEXT_13);
    } else {
    stringBuffer.append(TEXT_14);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getImportedName("org.apache.tuscany.sdo.impl.FactoryBase"));
    if (!genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EFactory"));
    }
    }
    stringBuffer.append(TEXT_20);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    if (isInterface && genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_28);
    } else if (isInterface && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_31);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getNSName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getNonNLS());
    int genIndex = 1;
for (Iterator i=genPackage.getOrderedGenClassifiers().iterator(); i.hasNext();) { GenClassifier genClassifier = (GenClassifier)i.next();
    if (!genPackage.getClassifierID(genClassifier).equals("DOCUMENT_ROOT")) { 
    stringBuffer.append(TEXT_38);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getClassifierID(genClassifier));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genIndex);
    stringBuffer.append(TEXT_41);
    genIndex++;
     } }
    stringBuffer.append(TEXT_42);
    String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.DataObject"));
    stringBuffer.append(TEXT_45);
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (!genClass.isAbstract() && !genClass.isDynamic()) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.DataObject"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_49);
    }
    }
    stringBuffer.append(TEXT_50);
    if (!genPackage.getAllGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_51);
    for (Iterator i=genPackage.getAllGenDataTypes().iterator(); i.hasNext();) { GenDataType genDataType = (GenDataType)i.next();
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_54);
    }
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_56);
    for (Iterator i=genPackage.getAllGenDataTypes().iterator(); i.hasNext();) { GenDataType genDataType = (GenDataType)i.next();
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_59);
    }
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_61);
    }
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (!genClass.isAbstract() && !genClass.isDynamic()) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_64);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClass.getCastFromEObject());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_69);
    } else {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(TEXT_73);
    if (genModel.isSuppressInterfaces() && !genPackage.getReflectionPackageName().equals(genPackage.getInterfacePackageName())) {
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
    }
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_77);
    }
    }
    stringBuffer.append(TEXT_78);
    for (Iterator i=genPackage.getOrderedGenClassifiers().iterator(); i.hasNext();) { GenClassifier genClassifier = (GenClassifier)i.next();
    stringBuffer.append(TEXT_79);
    if (!genPackage.getClassifierID(genClassifier).equals("DOCUMENT_ROOT")) { 
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Type"));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genClassifier.getSafeUncapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Type"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClassifier.getSafeUncapName());
    stringBuffer.append(TEXT_85);
    } }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_92);
    for (Iterator p=genPackage.getPackageSimpleDependencies().iterator(); p.hasNext();) { GenPackage dep = (GenPackage)p.next();
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("org.apache.tuscany.sdo.util.SDOUtil"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(dep.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_96);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_100);
    if (!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_101);
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    stringBuffer.append(TEXT_102);
    if (!genClass.isAbstract() && !genClass.isDynamic()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genPackage.getClassifierID(genClass));
    stringBuffer.append(TEXT_105);
    for (Iterator j=genClass.getGenFeatures().iterator(); j.hasNext();) { GenFeature genFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_106);
    stringBuffer.append(!genFeature.isReferenceType());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_110);
    }
    }
    }
    }
    if (!genPackage.getGenEnums().isEmpty()) {
    stringBuffer.append(TEXT_111);
    for (Iterator e=genPackage.getGenEnums().iterator(); e.hasNext();) { GenEnum genEnum = (GenEnum)e.next();
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genEnum.getClassifierID());
    stringBuffer.append(TEXT_114);
    }
    }
    if (!genPackage.getGenDataTypes().isEmpty()) {
    for (Iterator d=genPackage.getGenDataTypes().iterator(); d.hasNext();) { GenDataType genDataType = (GenDataType)d.next();
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genDataType.getSafeUncapName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genPackage.getClassifierID(genDataType));
    stringBuffer.append(TEXT_117);
    }
    }
    stringBuffer.append(TEXT_118);
    if (!genPackage.getPackageInitializationDependencies().isEmpty()) {
    stringBuffer.append(TEXT_119);
    for (Iterator p=genPackage.getPackageInitializationDependencies().iterator(); p.hasNext();) { GenPackage dep = (GenPackage)p.next();
    stringBuffer.append(TEXT_120);
    stringBuffer.append(dep.getImportedFactoryClassName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genPackage.getPackageInstanceVariable(dep));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(dep.getImportedFactoryClassName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(dep.getImportedFactoryClassName());
    stringBuffer.append(TEXT_124);
    }
    }
    List annotationSources = genPackage.getAnnotationSources();
    annotationSources.remove(ExtendedMetaData.ANNOTATION_URI);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Property"));
    stringBuffer.append(TEXT_126);
    for (Iterator c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = (GenClass)c.next();
    for (Iterator b=genClass.getBaseGenClasses().iterator(); b.hasNext();) { GenClass baseGenClass = (GenClass)b.next();
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(baseGenClass.getSafeUncapName());
    stringBuffer.append(TEXT_129);
    }
    }
    stringBuffer.append(TEXT_130);
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (!genClass.isAbstract() && !genClass.isDynamic()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_134);
    for (Iterator sources = annotationSources.iterator(); sources.hasNext();) { String annotationSource = (String)sources.next();
    EAnnotation classAnnotation = genClass.getEcoreClassifier().getEAnnotation(annotationSource);
    if (classAnnotation != null) { 
    for (Iterator k = classAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(value);
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_139);
    }
    }
    }
    stringBuffer.append(TEXT_140);
    for (Iterator j=genClass.getGenFeatures().iterator(); j.hasNext();) {GenFeature genFeature = (GenFeature)j.next();
    String type = genFeature.getType().equals("commonj.sdo.Sequence") ? "getSequence()" : genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()) + ".get" + genFeature.getTypeClassifierAccessorName() + "()";
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Property"));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    if (genFeature.isReferenceType()) { GenFeature reverseGenFeature = genFeature.getReverse();
    String reverse = reverseGenFeature == null ? "null" : genPackage.getPackageInstanceVariable(reverseGenFeature.getGenPackage()) + ".get" + reverseGenFeature.getFeatureAccessorName() + "()";
    stringBuffer.append(TEXT_146);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getChangeableFlag().equals("IS_CHANGEABLE") ? "false" : "true");
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getUnsettableFlag().equals("IS_UNSETTABLE") ? "true": "false");
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getDerivedFlag().equals("IS_DERIVED") ? "true" : "false");
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getContainmentFlag().equals("IS_COMPOSITE")? "true": "false");
    stringBuffer.append(TEXT_156);
    stringBuffer.append(reverse);
    stringBuffer.append(TEXT_157);
    }else{
    stringBuffer.append(TEXT_158);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getChangeableFlag().equals("IS_CHANGEABLE") ? "false" : "true");
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getUnsettableFlag().equals("IS_UNSETTABLE") ? "true": "false");
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getDerivedFlag().equals("IS_DERIVED") ? "true" : "false");
    stringBuffer.append(TEXT_167);
    }
    for (Iterator sources = annotationSources.iterator(); sources.hasNext();) { String annotationSource = (String)sources.next();
    EAnnotation featureAnnotation = genFeature.getEcoreFeature().getEAnnotation(annotationSource);
    if (featureAnnotation != null) { 
    for (Iterator k = featureAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_170);
    stringBuffer.append(value);
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_171);
    }
    }
    }
    stringBuffer.append(TEXT_172);
    }
    }
    }
    if (!genPackage.getGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_173);
    for (Iterator d=genPackage.getGenDataTypes().iterator(); d.hasNext();) { GenDataType genDataType = (GenDataType)d.next();
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genDataType.getSafeUncapName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genDataType.getSerializableFlag().equals("IS_SERIALIZABLE") ? "true" : "false");
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genDataType.getGeneratedInstanceClassFlag().equals("IS_GENERATED_INSTANCE_CLASS") ? "true" : "false" );
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genModel.getNonNLS());
    for (Iterator sources = annotationSources.iterator(); sources.hasNext();) { String annotationSource = (String)sources.next();
    EAnnotation dataTypeAnnotation = genDataType.getEcoreDataType().getEAnnotation(annotationSource);
    if (dataTypeAnnotation != null) { 
    for (Iterator k = dataTypeAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genDataType.getSafeUncapName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_182);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_183);
    stringBuffer.append(value);
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_184);
    }
    }
    }
    stringBuffer.append(TEXT_185);
    }
    }
    stringBuffer.append(TEXT_186);
    stringBuffer.append(SDOGenUtil.getDependentFactoryArgumentList(genPackage, false));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(SDOGenUtil.getDependentFactoryArgumentList(genPackage, true));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Property"));
    stringBuffer.append(TEXT_189);
    String extendedMetaDataSource = ExtendedMetaData.ANNOTATION_URI;
    EAnnotation packageAnnotation = genPackage.getEcorePackage().getEAnnotation(extendedMetaDataSource);
    if (packageAnnotation != null){ 
    stringBuffer.append(TEXT_190);
    for (Iterator k = packageAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_191);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_192);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    stringBuffer.append(TEXT_193);
    }
    for (Iterator i=genPackage.getGenClassifiers().iterator(); i.hasNext();) { GenClassifier genClassifier = (GenClassifier)i.next(); EAnnotation classAnnotation = genClassifier.getEcoreClassifier().getEAnnotation(extendedMetaDataSource);
    if (classAnnotation != null && !genClassifier.getName().equals("DocumentRoot")) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genClassifier.getSafeUncapName());
    stringBuffer.append(TEXT_195);
    for (Iterator k = classAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_196);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_197);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    stringBuffer.append(TEXT_198);
    }
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass) genClassifier;
    for (Iterator j=genClass.getGenFeatures().iterator(); j.hasNext();) { GenFeature genFeature = (GenFeature)j.next(); 
    EAnnotation featureAnnotation = genFeature.getEcoreFeature().getEAnnotation(extendedMetaDataSource);
    if (genClass.getName().equals("DocumentRoot")) { 
    if (!(genFeature.getName().equals("mixed") || genFeature.getName().equals("xMLNSPrefixMap") || genFeature.getName().equals("xSISchemaLocation"))) { 
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()));
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_202);
    for (Iterator k = featureAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_203);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_204);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_205);
    } else {
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    for (Iterator sources = genPackage.getAnnotationSources().iterator(); sources.hasNext();) { String annotationSource = (String)sources.next(); 
    if (!annotationSource.equals(extendedMetaDataSource)) {
    EAnnotation globalAnnotation = genFeature.getEcoreFeature().getEAnnotation(annotationSource);
    if (globalAnnotation != null) {
    for (Iterator k = globalAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_208);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_209);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_210);
    stringBuffer.append(value);
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(TEXT_212);
    }
    }
    stringBuffer.append(TEXT_213);
    }
    }
    } else {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genModel.getImportedName("commonj.sdo.Property"));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genClassifier.getSafeUncapName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_218);
    for (Iterator k = featureAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry detail = (Map.Entry)k.next(); String key = Literals.toStringLiteral((String)detail.getKey(), genModel); String value = Literals.toStringLiteral((String)detail.getValue(), genModel);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    stringBuffer.append(TEXT_221);
    }
    }
    }
    }
    stringBuffer.append(TEXT_222);
    for (Iterator i=genPackage.getAllGenDataTypes().iterator(); i.hasNext();) { GenDataType genDataType = (GenDataType)i.next();
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_225);
    if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_229);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genBaseType.getGenPackage()));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_236);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_241);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_243);
    } else {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genItemType.getGenPackage()));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_246);
    }
    stringBuffer.append(TEXT_247);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_249);
    for (Iterator j = genDataType.getMemberTypes().iterator(); j.hasNext(); ) { GenDataType genMemberType = (GenDataType)j.next();
    stringBuffer.append(TEXT_250);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_253);
    } else {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genMemberType.getGenPackage()));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    }
    stringBuffer.append(TEXT_259);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_261);
    } else {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_264);
    }
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_266);
    if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_267);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_269);
    } else {
    stringBuffer.append(TEXT_270);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genBaseType.getGenPackage()));
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_272);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_278);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_280);
    } else {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genItemType.getGenPackage()));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_285);
    for (Iterator j = genDataType.getMemberTypes().iterator(); j.hasNext(); ) { GenDataType genMemberType = (GenDataType)j.next();
    stringBuffer.append(TEXT_286);
    stringBuffer.append(SDOGenUtil.getQualifiedTypeAccessor(genMemberType));
    stringBuffer.append(TEXT_287);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_289);
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(SDOGenUtil.getFactoryImpl(genMemberType.getGenPackage()));
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_292);
    }
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_295);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_297);
    } else {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    }
    }
    } else {
    for (Iterator i=genPackage.getGenClasses().iterator(); i.hasNext();) { GenClass genClass = (GenClass)i.next();
    if (genClass.hasFactoryInterfaceCreateMethod()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_305);
    }
    }
    if (genPackage.isDataTypeConverters()) {
    for (Iterator i=genPackage.getAllGenDataTypes().iterator(); i.hasNext();) { GenDataType genDataType = (GenDataType)i.next();
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_312);
    }
    }
    }
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(isInterface ? genPackage.getFactoryInterfaceName() : genPackage.getFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_314);
    return stringBuffer.toString();
  }
}
