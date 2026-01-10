package com.google.gms.googleservices;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.codehaus.groovy.transform.ImmutableASTTransformation;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/* compiled from: GoogleServicesPlugin.groovy */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class GoogleServicesPlugin implements Plugin<Project>, GroovyObject {
    private static /* synthetic */ SoftReference $callSiteArray = null;
    private static /* synthetic */ ClassInfo $staticClassInfo = null;
    private static /* synthetic */ ClassInfo $staticClassInfo$ = null;
    public static final String JSON_FILE_NAME = "google-services.json";
    public static final String MINIMUM_VERSION = "9.0.0";
    public static final String MODULE_CORE = "firebase-core";
    public static final String MODULE_GROUP = "com.google.android.gms";
    public static final String MODULE_GROUP_FIREBASE = "com.google.firebase";
    public static final String MODULE_VERSION = "9.0.0";
    public static transient /* synthetic */ boolean __$stMC;
    private static String targetVersion;
    private static String targetVersionRaw;
    private transient /* synthetic */ MetaClass metaClass;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoogleServicesPlugin.groovy */
    static final class PluginType implements GroovyObject {
        private static final /* synthetic */ PluginType[] $VALUES;
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        private static /* synthetic */ ClassInfo $staticClassInfo$;
        public static final PluginType APPLICATION;
        public static final PluginType FEATURE;
        public static final PluginType LIBRARY;
        public static final PluginType MAX_VALUE;
        public static final PluginType MIN_VALUE;
        public static transient /* synthetic */ boolean __$stMC;
        private transient /* synthetic */ MetaClass metaClass;

        public static final /* synthetic */ PluginType $INIT(Object... objArr) {
            PluginType pluginType;
            $getCallSiteArray();
            Object[] objArrDespreadList = ScriptBytecodeAdapter.despreadList(new Object[0], new Object[]{objArr}, new int[]{0});
            int iSelectConstructorAndTransformArguments = ScriptBytecodeAdapter.selectConstructorAndTransformArguments(objArrDespreadList, -1, PluginType.class);
            if (iSelectConstructorAndTransformArguments == -1348271900) {
                pluginType = new PluginType(ShortTypeHandling.castToString(objArrDespreadList[0]), DefaultTypeTransformation.intUnbox(objArrDespreadList[1]));
            } else {
                if (iSelectConstructorAndTransformArguments != -242181752) {
                    throw new IllegalArgumentException("This class has been compiled with a super class which is binary incompatible with the current super class found on classpath. You should recompile this class with the new version.");
                }
                pluginType = new PluginType(ShortTypeHandling.castToString(objArrDespreadList[0]), DefaultTypeTransformation.intUnbox(objArrDespreadList[1]), (LinkedHashMap) ScriptBytecodeAdapter.castToType(objArrDespreadList[2], LinkedHashMap.class));
            }
            return pluginType;
        }

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[16];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(PluginType.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "<$constructor$>";
            strArr[1] = "checkPropNames";
            strArr[2] = "<$constructor$>";
            strArr[3] = LinkHeader.Rel.Next;
            strArr[4] = "ordinal";
            strArr[5] = ContentDisposition.Parameters.Size;
            strArr[6] = "getAt";
            strArr[7] = "previous";
            strArr[8] = "ordinal";
            strArr[9] = "minus";
            strArr[10] = ContentDisposition.Parameters.Size;
            strArr[11] = "getAt";
            strArr[12] = "valueOf";
            strArr[13] = "$INIT";
            strArr[14] = "$INIT";
            strArr[15] = "$INIT";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        static {
            PluginType pluginType = (PluginType) ShortTypeHandling.castToEnum($getCallSiteArray()[13].callStatic(PluginType.class, "APPLICATION", 0), PluginType.class);
            APPLICATION = pluginType;
            PluginType pluginType2 = (PluginType) ShortTypeHandling.castToEnum($getCallSiteArray()[14].callStatic(PluginType.class, "LIBRARY", 1), PluginType.class);
            LIBRARY = pluginType2;
            PluginType pluginType3 = (PluginType) ShortTypeHandling.castToEnum($getCallSiteArray()[15].callStatic(PluginType.class, "FEATURE", 2), PluginType.class);
            FEATURE = pluginType3;
            MIN_VALUE = pluginType;
            MAX_VALUE = pluginType3;
            $VALUES = new PluginType[]{pluginType, pluginType2, pluginType3};
        }

        public PluginType(String str, int i) {
            this(str, i, (LinkedHashMap) ScriptBytecodeAdapter.castToType($getCallSiteArray()[2].callConstructor(LinkedHashMap.class), LinkedHashMap.class));
        }

        public PluginType(String str, int i, LinkedHashMap linkedHashMap) throws Throwable {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            this.metaClass = $getStaticMetaClass();
            if (ScriptBytecodeAdapter.compareEqual(linkedHashMap, (Object) null)) {
                throw ((Throwable) callSiteArr$getCallSiteArray[0].callConstructor(IllegalArgumentException.class, "One of the enum constants for enum com.google.gms.googleservices.GoogleServicesPlugin$PluginType was initialized with null. Please use a non-null value or define your own constructor."));
            }
            callSiteArr$getCallSiteArray[1].callStatic(ImmutableASTTransformation.class, this, linkedHashMap);
        }

        public static PluginType valueOf(String str) {
            return (PluginType) ShortTypeHandling.castToEnum($getCallSiteArray()[12].callStatic(PluginType.class, PluginType.class, str), PluginType.class);
        }

        public static final PluginType[] values() {
            $getCallSiteArray();
            return (PluginType[]) ScriptBytecodeAdapter.castToType($VALUES.clone(), PluginType[].class);
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != PluginType.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public /* synthetic */ MetaClass getMetaClass() {
            MetaClass metaClass = this.metaClass;
            if (metaClass != null) {
                return metaClass;
            }
            MetaClass metaClass$getStaticMetaClass = $getStaticMetaClass();
            this.metaClass = metaClass$getStaticMetaClass;
            return metaClass$getStaticMetaClass;
        }

        public /* synthetic */ Object getProperty(String str) {
            return getMetaClass().getProperty(this, str);
        }

        public /* synthetic */ Object invokeMethod(String str, Object obj) {
            return getMetaClass().invokeMethod(this, str, obj);
        }

        public /* synthetic */ PluginType next() {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            Object objCall = callSiteArr$getCallSiteArray[3].call(callSiteArr$getCallSiteArray[4].callCurrent(this));
            CallSite callSite = callSiteArr$getCallSiteArray[5];
            PluginType[] pluginTypeArr = $VALUES;
            if (ScriptBytecodeAdapter.compareGreaterThanEqual(objCall, callSite.call(pluginTypeArr))) {
                objCall = 0;
            }
            return (PluginType) ShortTypeHandling.castToEnum(callSiteArr$getCallSiteArray[6].call(pluginTypeArr, objCall), PluginType.class);
        }

        public /* synthetic */ PluginType previous() {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            Object objCall = callSiteArr$getCallSiteArray[7].call(callSiteArr$getCallSiteArray[8].callCurrent(this));
            if (ScriptBytecodeAdapter.compareLessThan(objCall, 0)) {
                objCall = callSiteArr$getCallSiteArray[9].call(callSiteArr$getCallSiteArray[10].call($VALUES), 1);
            }
            return (PluginType) ShortTypeHandling.castToEnum(callSiteArr$getCallSiteArray[11].call($VALUES, objCall), PluginType.class);
        }

        public /* synthetic */ void setMetaClass(MetaClass metaClass) {
            this.metaClass = metaClass;
        }

        public /* synthetic */ void setProperty(String str, Object obj) {
            getMetaClass().setProperty(this, str, obj);
        }
    }

    private static /* synthetic */ CallSiteArray $createCallSiteArray() {
        String[] strArr = new String[170];
        $createCallSiteArray_1(strArr);
        return new CallSiteArray(GoogleServicesPlugin.class, strArr);
    }

    private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
        strArr[0] = "hasPlugin";
        strArr[1] = "plugins";
        strArr[2] = "hasPlugin";
        strArr[3] = "plugins";
        strArr[4] = "addDependency";
        strArr[5] = "setupPlugin";
        strArr[6] = "APPLICATION";
        strArr[7] = "hasPlugin";
        strArr[8] = "plugins";
        strArr[9] = "hasPlugin";
        strArr[10] = "plugins";
        strArr[11] = "addDependency";
        strArr[12] = "setupPlugin";
        strArr[13] = "LIBRARY";
        strArr[14] = "hasPlugin";
        strArr[15] = "plugins";
        strArr[16] = "hasPlugin";
        strArr[17] = "plugins";
        strArr[18] = "addDependency";
        strArr[19] = "setupPlugin";
        strArr[20] = "FEATURE";
        strArr[21] = "showWarningForPluginLocation";
        strArr[22] = "withId";
        strArr[23] = "plugins";
        strArr[24] = "withId";
        strArr[25] = "plugins";
        strArr[26] = "withId";
        strArr[27] = "plugins";
        strArr[28] = "afterEvaluate";
        strArr[29] = "warn";
        strArr[30] = "getLogger";
        strArr[31] = "split";
        strArr[32] = "split";
        strArr[33] = "length";
        strArr[34] = "length";
        strArr[35] = "valueOf";
        strArr[36] = "getAt";
        strArr[37] = "valueOf";
        strArr[38] = "getAt";
        strArr[39] = LinkHeader.Rel.Next;
        strArr[40] = "length";
        strArr[41] = "length";
        strArr[42] = "valueOf";
        strArr[43] = "valueOf";
        strArr[44] = "length";
        strArr[45] = "length";
        strArr[46] = "findTargetVersion";
        strArr[47] = "getAt";
        strArr[48] = "split";
        strArr[49] = "checkMinimumVersion";
        strArr[50] = "add";
        strArr[51] = "dependencies";
        strArr[52] = "plus";
        strArr[53] = "plus";
        strArr[54] = "plus";
        strArr[55] = "plus";
        strArr[56] = "<$constructor$>";
        strArr[57] = "plus";
        strArr[58] = "plus";
        strArr[59] = "plus";
        strArr[60] = "plus";
        strArr[61] = "add";
        strArr[62] = "dependencies";
        strArr[63] = "plus";
        strArr[64] = "plus";
        strArr[65] = "plus";
        strArr[66] = "plus";
        strArr[67] = "<$constructor$>";
        strArr[68] = "plus";
        strArr[69] = "plus";
        strArr[70] = "plus";
        strArr[71] = "plus";
        strArr[72] = "getConfigurations";
        strArr[73] = "iterator";
        strArr[74] = "getDependencies";
        strArr[75] = "iterator";
        strArr[76] = "equalsIgnoreCase";
        strArr[77] = "getGroup";
        strArr[78] = "equalsIgnoreCase";
        strArr[79] = "getGroup";
        strArr[80] = "getVersion";
        strArr[81] = "warn";
        strArr[82] = "getLogger";
        strArr[83] = "plus";
        strArr[84] = "plus";
        strArr[85] = "plus";
        strArr[86] = "plus";
        strArr[87] = "plus";
        strArr[88] = "plus";
        strArr[89] = "showWarningForPluginLocation";
        strArr[90] = "APPLICATION";
        strArr[91] = JsonParser.ALL;
        strArr[92] = "applicationVariants";
        strArr[93] = "android";
        strArr[94] = "LIBRARY";
        strArr[95] = JsonParser.ALL;
        strArr[96] = "libraryVariants";
        strArr[97] = "android";
        strArr[98] = "FEATURE";
        strArr[99] = JsonParser.ALL;
        strArr[100] = "featureVariants";
        strArr[101] = "android";
        strArr[102] = "dirName";
        strArr[103] = "split";
        strArr[104] = "<$constructor$>";
        strArr[105] = "length";
        strArr[106] = "getAt";
        strArr[107] = "getAt";
        strArr[108] = "add";
        strArr[109] = "plus";
        strArr[110] = "plus";
        strArr[111] = "plus";
        strArr[112] = "add";
        strArr[113] = "plus";
        strArr[114] = "plus";
        strArr[115] = "plus";
        strArr[116] = "add";
        strArr[117] = "plus";
        strArr[118] = "add";
        strArr[119] = "plus";
        strArr[120] = "add";
        strArr[121] = "plus";
        strArr[122] = "plus";
        strArr[123] = "capitalize";
        strArr[124] = "length";
        strArr[125] = "add";
        strArr[126] = "plus";
        strArr[127] = "getAt";
        strArr[128] = "length";
        strArr[129] = "add";
        strArr[130] = "plus";
        strArr[131] = "plus";
        strArr[132] = "plus";
        strArr[133] = "add";
        strArr[134] = "plus";
        strArr[135] = "plus";
        strArr[136] = "plus";
        strArr[137] = "add";
        strArr[138] = "plus";
        strArr[139] = "add";
        strArr[140] = "plus";
        strArr[141] = "add";
        strArr[142] = "plus";
        strArr[143] = "plus";
        strArr[144] = "capitalize";
        strArr[145] = "length";
        strArr[146] = "add";
        strArr[147] = "plus";
        strArr[148] = "lineSeparator";
        strArr[149] = "iterator";
        strArr[150] = "file";
        strArr[151] = "plus";
        strArr[152] = "plus";
        strArr[153] = "plus";
        strArr[154] = "plus";
        strArr[155] = "getPath";
        strArr[156] = "lineSeparator";
        strArr[157] = "isFile";
        strArr[158] = "file";
        strArr[159] = "plus";
        strArr[160] = "getPath";
        strArr[161] = "file";
        strArr[162] = "buildDir";
        strArr[163] = "dirName";
        strArr[164] = "create";
        strArr[165] = "tasks";
        strArr[166] = "capitalize";
        strArr[167] = "name";
        strArr[168] = "applicationId";
        strArr[169] = "registerResGeneratingTask";
    }

    private static /* synthetic */ CallSite[] $getCallSiteArray() {
        CallSiteArray callSiteArray$createCallSiteArray;
        SoftReference softReference = $callSiteArray;
        if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
            callSiteArray$createCallSiteArray = $createCallSiteArray();
            $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
        }
        return callSiteArray$createCallSiteArray.array;
    }

    public GoogleServicesPlugin() {
        $getCallSiteArray();
        this.metaClass = $getStaticMetaClass();
    }

    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (getClass() != GoogleServicesPlugin.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfo = $staticClassInfo;
        if (classInfo == null) {
            classInfo = ClassInfo.getClassInfo(getClass());
            $staticClassInfo = classInfo;
        }
        return classInfo.getMetaClass();
    }

    public /* synthetic */ MetaClass getMetaClass() {
        MetaClass metaClass = this.metaClass;
        if (metaClass != null) {
            return metaClass;
        }
        MetaClass metaClass$getStaticMetaClass = $getStaticMetaClass();
        this.metaClass = metaClass$getStaticMetaClass;
        return metaClass$getStaticMetaClass;
    }

    public /* synthetic */ Object getProperty(String str) {
        return getMetaClass().getProperty(this, str);
    }

    public /* synthetic */ Object invokeMethod(String str, Object obj) {
        return getMetaClass().invokeMethod(this, str, obj);
    }

    public /* synthetic */ void setMetaClass(MetaClass metaClass) {
        this.metaClass = metaClass;
    }

    public /* synthetic */ void setProperty(String str, Object obj) {
        getMetaClass().setProperty(this, str, obj);
    }

    public /* synthetic */ Object this$dist$get$1(String str) {
        $getCallSiteArray();
        return ScriptBytecodeAdapter.getGroovyObjectProperty(GoogleServicesPlugin.class, this, ShortTypeHandling.castToString(new GStringImpl(new Object[]{str}, new String[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR})));
    }

    public /* synthetic */ Object this$dist$invoke$1(String str, Object obj) {
        $getCallSiteArray();
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN(GoogleServicesPlugin.class, this, ShortTypeHandling.castToString(new GStringImpl(new Object[]{str}, new String[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR})), ScriptBytecodeAdapter.despreadList(new Object[0], new Object[]{obj}, new int[]{0}));
    }

    public /* synthetic */ void this$dist$set$1(String str, Object obj) {
        $getCallSiteArray();
        ScriptBytecodeAdapter.setGroovyObjectProperty(obj, GoogleServicesPlugin.class, this, ShortTypeHandling.castToString(new GStringImpl(new Object[]{str}, new String[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR})));
    }

    public void apply(Project project) {
        Reference reference = new Reference(project);
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[0].call(callSiteArr$getCallSiteArray[1].callGetProperty((Project) reference.get()), "android")) || DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[2].call(callSiteArr$getCallSiteArray[3].callGetProperty((Project) reference.get()), "com.android.application"))) {
            callSiteArr$getCallSiteArray[4].callCurrent(this, (Project) reference.get());
            callSiteArr$getCallSiteArray[5].callCurrent(this, (Project) reference.get(), callSiteArr$getCallSiteArray[6].callGetProperty(PluginType.class));
            return;
        }
        if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[7].call(callSiteArr$getCallSiteArray[8].callGetProperty((Project) reference.get()), "android-library")) || DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[9].call(callSiteArr$getCallSiteArray[10].callGetProperty((Project) reference.get()), "com.android.library"))) {
            callSiteArr$getCallSiteArray[11].callCurrent(this, (Project) reference.get());
            callSiteArr$getCallSiteArray[12].callCurrent(this, (Project) reference.get(), callSiteArr$getCallSiteArray[13].callGetProperty(PluginType.class));
            return;
        }
        if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[14].call(callSiteArr$getCallSiteArray[15].callGetProperty((Project) reference.get()), "android-feature")) || DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[16].call(callSiteArr$getCallSiteArray[17].callGetProperty((Project) reference.get()), "com.android.feature"))) {
            callSiteArr$getCallSiteArray[18].callCurrent(this, (Project) reference.get());
            callSiteArr$getCallSiteArray[19].callCurrent(this, (Project) reference.get(), callSiteArr$getCallSiteArray[20].callGetProperty(PluginType.class));
            return;
        }
        callSiteArr$getCallSiteArray[21].callCurrent(this, (Project) reference.get());
        callSiteArr$getCallSiteArray[22].call(callSiteArr$getCallSiteArray[23].callGetProperty((Project) reference.get()), "android", new _apply_closure1(this, this, reference));
        callSiteArr$getCallSiteArray[24].call(callSiteArr$getCallSiteArray[25].callGetProperty((Project) reference.get()), "android-library", new _apply_closure2(this, this, reference));
        callSiteArr$getCallSiteArray[26].call(callSiteArr$getCallSiteArray[27].callGetProperty((Project) reference.get()), "android-feature", new _apply_closure3(this, this, reference));
        callSiteArr$getCallSiteArray[28].call((Project) reference.get(), new _apply_closure4(this, this, reference));
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _apply_closure1 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[2];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_apply_closure1.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "setupPlugin";
            strArr[1] = "APPLICATION";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _apply_closure1(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _apply_closure1.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Object doCall() {
            $getCallSiteArray();
            return doCall(null);
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            return callSiteArr$getCallSiteArray[0].callCurrent(this, this.project.get(), callSiteArr$getCallSiteArray[1].callGetProperty(PluginType.class));
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _apply_closure2 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[2];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_apply_closure2.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "setupPlugin";
            strArr[1] = "LIBRARY";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _apply_closure2(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _apply_closure2.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Object doCall() {
            $getCallSiteArray();
            return doCall(null);
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            return callSiteArr$getCallSiteArray[0].callCurrent(this, this.project.get(), callSiteArr$getCallSiteArray[1].callGetProperty(PluginType.class));
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _apply_closure3 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[2];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_apply_closure3.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "setupPlugin";
            strArr[1] = "FEATURE";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _apply_closure3(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _apply_closure3.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Object doCall() {
            $getCallSiteArray();
            return doCall(null);
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
            return callSiteArr$getCallSiteArray[0].callCurrent(this, this.project.get(), callSiteArr$getCallSiteArray[1].callGetProperty(PluginType.class));
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _apply_closure4 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[1];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_apply_closure4.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "addDependency";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _apply_closure4(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _apply_closure4.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Object doCall() {
            $getCallSiteArray();
            return doCall(null);
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            return $getCallSiteArray()[0].callCurrent(this, this.project.get());
        }
    }

    private void showWarningForPluginLocation(Project project) {
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        callSiteArr$getCallSiteArray[29].call(callSiteArr$getCallSiteArray[30].call(project), "please apply google-services plugin at the bottom of the build file.");
    }

    private boolean checkMinimumVersion() {
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        String[] strArr = (String[]) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[31].call(targetVersion, "\\."), String[].class);
        String[] strArr2 = (String[]) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[32].call(MINIMUM_VERSION, "\\."), String[].class);
        if (BytecodeInterface8.isOrigInt() && BytecodeInterface8.isOrigZ() && !__$stMC && !BytecodeInterface8.disabledStandardMetaClass()) {
            int i = 0;
            while (true) {
                if (!(ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), callSiteArr$getCallSiteArray[40].callGetProperty(strArr)) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(i), callSiteArr$getCallSiteArray[41].callGetProperty(strArr2)))) {
                    break;
                }
                Integer num = (Integer) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[42].call(Integer.class, BytecodeInterface8.objectArrayGet(strArr, i)), Integer.class);
                Integer num2 = (Integer) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[43].call(Integer.class, BytecodeInterface8.objectArrayGet(strArr2, i)), Integer.class);
                if (ScriptBytecodeAdapter.compareGreaterThan(num, num2)) {
                    return true;
                }
                if (ScriptBytecodeAdapter.compareLessThan(num, num2)) {
                    return false;
                }
                i++;
            }
        } else {
            int iIntUnbox = 0;
            while (true) {
                if (!(ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(iIntUnbox), callSiteArr$getCallSiteArray[33].callGetProperty(strArr)) && ScriptBytecodeAdapter.compareLessThan(Integer.valueOf(iIntUnbox), callSiteArr$getCallSiteArray[34].callGetProperty(strArr2)))) {
                    break;
                }
                Integer num3 = (Integer) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[35].call(Integer.class, callSiteArr$getCallSiteArray[36].call(strArr, Integer.valueOf(iIntUnbox))), Integer.class);
                Integer num4 = (Integer) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[37].call(Integer.class, callSiteArr$getCallSiteArray[38].call(strArr2, Integer.valueOf(iIntUnbox))), Integer.class);
                if (ScriptBytecodeAdapter.compareGreaterThan(num3, num4)) {
                    return true;
                }
                if (ScriptBytecodeAdapter.compareLessThan(num3, num4)) {
                    return false;
                }
                iIntUnbox = DefaultTypeTransformation.intUnbox(callSiteArr$getCallSiteArray[39].call(Integer.valueOf(iIntUnbox)));
            }
        }
        return ScriptBytecodeAdapter.compareGreaterThanEqual(callSiteArr$getCallSiteArray[44].callGetProperty(strArr), callSiteArr$getCallSiteArray[45].callGetProperty(strArr2));
    }

    private void addDependency(Project project) throws Throwable {
        CallSite callSite;
        Object objCallGetProperty;
        CallSite callSite2;
        CallSite callSite3;
        CallSite callSite4;
        CallSite callSite5;
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        String strCastToString = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[46].callCurrent(this, project));
        targetVersionRaw = strCastToString;
        targetVersion = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[47].call(callSiteArr$getCallSiteArray[48].call(strCastToString, "-"), 0));
        if (__$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[49].callCurrent(this))) {
                callSite = callSiteArr$getCallSiteArray[50];
                objCallGetProperty = callSiteArr$getCallSiteArray[51].callGetProperty(project);
                callSite2 = callSiteArr$getCallSiteArray[52];
                callSite3 = callSiteArr$getCallSiteArray[53];
                callSite4 = callSiteArr$getCallSiteArray[54];
                callSite5 = callSiteArr$getCallSiteArray[55];
            } else {
                throw ((Throwable) callSiteArr$getCallSiteArray[56].callConstructor(GradleException.class, callSiteArr$getCallSiteArray[57].call(callSiteArr$getCallSiteArray[58].call(callSiteArr$getCallSiteArray[59].call(callSiteArr$getCallSiteArray[60].call("Version: ", targetVersionRaw), " is lower than the minimum version ("), MINIMUM_VERSION), ") required for google-services plugin.")));
            }
        } else if (checkMinimumVersion()) {
            callSite = callSiteArr$getCallSiteArray[61];
            objCallGetProperty = callSiteArr$getCallSiteArray[62].callGetProperty(project);
            callSite2 = callSiteArr$getCallSiteArray[63];
            callSite3 = callSiteArr$getCallSiteArray[64];
            callSite4 = callSiteArr$getCallSiteArray[65];
            callSite5 = callSiteArr$getCallSiteArray[66];
        } else {
            throw ((Throwable) callSiteArr$getCallSiteArray[67].callConstructor(GradleException.class, callSiteArr$getCallSiteArray[68].call(callSiteArr$getCallSiteArray[69].call(callSiteArr$getCallSiteArray[70].call(callSiteArr$getCallSiteArray[71].call("Version: ", targetVersionRaw), " is lower than the minimum version ("), MINIMUM_VERSION), ") required for google-services plugin.")));
        }
        callSite.call(objCallGetProperty, "compile", callSite2.call(callSite3.call(callSite4.call(callSite5.call(MODULE_GROUP_FIREBASE, ":"), MODULE_CORE), ":"), targetVersionRaw));
    }

    private String findTargetVersion(Project project) {
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        Object objCall = callSiteArr$getCallSiteArray[72].call(project);
        if (ScriptBytecodeAdapter.compareEqual(objCall, (Object) null)) {
            return ShortTypeHandling.castToString((Object) null);
        }
        Iterator it = (Iterator) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[73].call(objCall), Iterator.class);
        while (it.hasNext()) {
            Object next = it.next();
            if (!ScriptBytecodeAdapter.compareEqual(next, (Object) null)) {
                Object objCall2 = callSiteArr$getCallSiteArray[74].call(next);
                if (ScriptBytecodeAdapter.compareEqual(objCall2, (Object) null)) {
                    continue;
                } else {
                    Iterator it2 = (Iterator) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[75].call(objCall2), Iterator.class);
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!ScriptBytecodeAdapter.compareEqual(next2, (Object) null)) {
                            if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[76].call(MODULE_GROUP, callSiteArr$getCallSiteArray[77].call(next2))) || DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[78].call(MODULE_GROUP_FIREBASE, callSiteArr$getCallSiteArray[79].call(next2)))) {
                                return ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[80].call(next2));
                            }
                        }
                    }
                }
            }
        }
        CallSite callSite = callSiteArr$getCallSiteArray[81];
        Object objCall3 = callSiteArr$getCallSiteArray[82].call(project);
        CallSite callSite2 = callSiteArr$getCallSiteArray[83];
        CallSite callSite3 = callSiteArr$getCallSiteArray[84];
        Object objCall4 = callSiteArr$getCallSiteArray[85].call(callSiteArr$getCallSiteArray[86].call(callSiteArr$getCallSiteArray[87].call(callSiteArr$getCallSiteArray[88].call("google-services plugin could not detect any version for ", MODULE_GROUP), " or "), MODULE_GROUP_FIREBASE), ", default version: ");
        String str = MODULE_VERSION;
        callSite.call(objCall3, callSite2.call(callSite3.call(objCall4, str), " will be used."));
        callSiteArr$getCallSiteArray[89].callCurrent(this, project);
        return str;
    }

    private void setupPlugin(Project project, PluginType pluginType) {
        Reference reference = new Reference(project);
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        if (ScriptBytecodeAdapter.isCase(pluginType, callSiteArr$getCallSiteArray[90].callGetProperty(PluginType.class))) {
            callSiteArr$getCallSiteArray[91].call(callSiteArr$getCallSiteArray[92].callGetProperty(callSiteArr$getCallSiteArray[93].callGetProperty((Project) reference.get())), new _setupPlugin_closure5(this, this, reference));
        } else if (ScriptBytecodeAdapter.isCase(pluginType, callSiteArr$getCallSiteArray[94].callGetProperty(PluginType.class))) {
            callSiteArr$getCallSiteArray[95].call(callSiteArr$getCallSiteArray[96].callGetProperty(callSiteArr$getCallSiteArray[97].callGetProperty((Project) reference.get())), new _setupPlugin_closure6(this, this, reference));
        } else if (ScriptBytecodeAdapter.isCase(pluginType, callSiteArr$getCallSiteArray[98].callGetProperty(PluginType.class))) {
            callSiteArr$getCallSiteArray[99].call(callSiteArr$getCallSiteArray[100].callGetProperty(callSiteArr$getCallSiteArray[101].callGetProperty((Project) reference.get())), new _setupPlugin_closure7(this, this, reference));
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _setupPlugin_closure5 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[1];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_setupPlugin_closure5.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "handleVariant";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _setupPlugin_closure5(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _setupPlugin_closure5.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            return $getCallSiteArray()[0].callCurrent(this, this.project.get(), obj);
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _setupPlugin_closure6 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[1];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_setupPlugin_closure6.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "handleVariant";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _setupPlugin_closure6(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _setupPlugin_closure6.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            return $getCallSiteArray()[0].callCurrent(this, this.project.get(), obj);
        }
    }

    /* compiled from: GoogleServicesPlugin.groovy */
    class _setupPlugin_closure7 extends Closure implements GeneratedClosure {
        private static /* synthetic */ SoftReference $callSiteArray;
        private static /* synthetic */ ClassInfo $staticClassInfo;
        public static transient /* synthetic */ boolean __$stMC;
        private /* synthetic */ Reference project;

        private static /* synthetic */ CallSiteArray $createCallSiteArray() {
            String[] strArr = new String[1];
            $createCallSiteArray_1(strArr);
            return new CallSiteArray(_setupPlugin_closure7.class, strArr);
        }

        private static /* synthetic */ void $createCallSiteArray_1(String[] strArr) {
            strArr[0] = "handleVariant";
        }

        private static /* synthetic */ CallSite[] $getCallSiteArray() {
            CallSiteArray callSiteArray$createCallSiteArray;
            SoftReference softReference = $callSiteArray;
            if (softReference == null || (callSiteArray$createCallSiteArray = (CallSiteArray) softReference.get()) == null) {
                callSiteArray$createCallSiteArray = $createCallSiteArray();
                $callSiteArray = new SoftReference(callSiteArray$createCallSiteArray);
            }
            return callSiteArray$createCallSiteArray.array;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public _setupPlugin_closure7(Object obj, Object obj2, Reference reference) {
            super(obj, obj2);
            $getCallSiteArray();
            this.project = reference;
        }

        protected /* synthetic */ MetaClass $getStaticMetaClass() {
            if (getClass() != _setupPlugin_closure7.class) {
                return ScriptBytecodeAdapter.initMetaClass(this);
            }
            ClassInfo classInfo = $staticClassInfo;
            if (classInfo == null) {
                classInfo = ClassInfo.getClassInfo(getClass());
                $staticClassInfo = classInfo;
            }
            return classInfo.getMetaClass();
        }

        public Project getProject() {
            $getCallSiteArray();
            return (Project) ScriptBytecodeAdapter.castToType(this.project.get(), Project.class);
        }

        public Object doCall(Object obj) {
            return $getCallSiteArray()[0].callCurrent(this, this.project.get(), obj);
        }
    }

    private static void handleVariant(Project project, Object obj) {
        CallSite callSite;
        Object objCall;
        File file;
        CallSite[] callSiteArr$getCallSiteArray = $getCallSiteArray();
        String[] strArr = (String[]) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[103].call(ShortTypeHandling.castToString(new GStringImpl(new Object[]{callSiteArr$getCallSiteArray[102].callGetProperty(obj)}, new String[]{BuildConfig.FLAVOR, BuildConfig.FLAVOR})), "/"), String[].class);
        List list = (List) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[104].callConstructor(ArrayList.class), List.class);
        if (!BytecodeInterface8.isOrigInt() || !BytecodeInterface8.isOrigZ() || __$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            if (ScriptBytecodeAdapter.compareEqual(callSiteArr$getCallSiteArray[105].callGetProperty(strArr), 2)) {
                String strCastToString = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[106].call(strArr, 0));
                String strCastToString2 = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[107].call(strArr, 1));
                callSiteArr$getCallSiteArray[108].call(list, callSiteArr$getCallSiteArray[109].call(callSiteArr$getCallSiteArray[110].call(callSiteArr$getCallSiteArray[111].call("src/", strCastToString), "/"), strCastToString2));
                callSiteArr$getCallSiteArray[112].call(list, callSiteArr$getCallSiteArray[113].call(callSiteArr$getCallSiteArray[114].call(callSiteArr$getCallSiteArray[115].call("src/", strCastToString2), "/"), strCastToString));
                callSiteArr$getCallSiteArray[116].call(list, callSiteArr$getCallSiteArray[117].call("src/", strCastToString));
                callSiteArr$getCallSiteArray[118].call(list, callSiteArr$getCallSiteArray[119].call("src/", strCastToString2));
                callSiteArr$getCallSiteArray[120].call(list, callSiteArr$getCallSiteArray[121].call(callSiteArr$getCallSiteArray[122].call("src/", strCastToString), callSiteArr$getCallSiteArray[123].call(strCastToString2)));
            } else if (ScriptBytecodeAdapter.compareEqual(callSiteArr$getCallSiteArray[124].callGetProperty(strArr), 1)) {
                callSite = callSiteArr$getCallSiteArray[125];
                objCall = callSiteArr$getCallSiteArray[126].call("src/", callSiteArr$getCallSiteArray[127].call(strArr, 0));
                callSite.call(list, objCall);
            }
        } else if (ScriptBytecodeAdapter.compareEqual(callSiteArr$getCallSiteArray[128].callGetProperty(strArr), 2)) {
            String strCastToString3 = ShortTypeHandling.castToString(BytecodeInterface8.objectArrayGet(strArr, 0));
            String strCastToString4 = ShortTypeHandling.castToString(BytecodeInterface8.objectArrayGet(strArr, 1));
            callSiteArr$getCallSiteArray[129].call(list, callSiteArr$getCallSiteArray[130].call(callSiteArr$getCallSiteArray[131].call(callSiteArr$getCallSiteArray[132].call("src/", strCastToString3), "/"), strCastToString4));
            callSiteArr$getCallSiteArray[133].call(list, callSiteArr$getCallSiteArray[134].call(callSiteArr$getCallSiteArray[135].call(callSiteArr$getCallSiteArray[136].call("src/", strCastToString4), "/"), strCastToString3));
            callSiteArr$getCallSiteArray[137].call(list, callSiteArr$getCallSiteArray[138].call("src/", strCastToString3));
            callSiteArr$getCallSiteArray[139].call(list, callSiteArr$getCallSiteArray[140].call("src/", strCastToString4));
            callSiteArr$getCallSiteArray[141].call(list, callSiteArr$getCallSiteArray[142].call(callSiteArr$getCallSiteArray[143].call("src/", strCastToString3), callSiteArr$getCallSiteArray[144].call(strCastToString4)));
        } else if (ScriptBytecodeAdapter.compareEqual(callSiteArr$getCallSiteArray[145].callGetProperty(strArr), 1)) {
            callSite = callSiteArr$getCallSiteArray[146];
            objCall = callSiteArr$getCallSiteArray[147].call("src/", BytecodeInterface8.objectArrayGet(strArr, 0));
            callSite.call(list, objCall);
        }
        String strCastToString5 = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[148].call(System.class));
        Iterator it = (Iterator) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[149].call(list), Iterator.class);
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            file = (File) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[150].call(project, callSiteArr$getCallSiteArray[151].call(callSiteArr$getCallSiteArray[152].call(ShortTypeHandling.castToString(it.next()), "/"), JSON_FILE_NAME)), File.class);
            strCastToString5 = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[153].call(callSiteArr$getCallSiteArray[154].call(strCastToString5, callSiteArr$getCallSiteArray[155].call(file)), callSiteArr$getCallSiteArray[156].call(System.class)));
            if (DefaultTypeTransformation.booleanUnbox(callSiteArr$getCallSiteArray[157].call(file))) {
                break;
            }
        }
        if (ScriptBytecodeAdapter.compareEqual(file, (Object) null)) {
            file = (File) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[158].call(project, JSON_FILE_NAME), File.class);
            strCastToString5 = ShortTypeHandling.castToString(callSiteArr$getCallSiteArray[159].call(strCastToString5, callSiteArr$getCallSiteArray[160].call(file)));
        }
        File file2 = (File) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[161].call(project, new GStringImpl(new Object[]{callSiteArr$getCallSiteArray[162].callGetProperty(project), callSiteArr$getCallSiteArray[163].callGetProperty(obj)}, new String[]{BuildConfig.FLAVOR, "/generated/res/google-services/", BuildConfig.FLAVOR})), File.class);
        GoogleServicesTask googleServicesTask = (GoogleServicesTask) ScriptBytecodeAdapter.castToType(callSiteArr$getCallSiteArray[164].call(callSiteArr$getCallSiteArray[165].callGetProperty(project), new GStringImpl(new Object[]{callSiteArr$getCallSiteArray[166].call(callSiteArr$getCallSiteArray[167].callGetProperty(obj))}, new String[]{"process", "GoogleServices"}), GoogleServicesTask.class), GoogleServicesTask.class);
        ScriptBytecodeAdapter.setProperty(file, (Class) null, googleServicesTask, "quickstartFile");
        ScriptBytecodeAdapter.setProperty(file2, (Class) null, googleServicesTask, "intermediateDir");
        ScriptBytecodeAdapter.setProperty(callSiteArr$getCallSiteArray[168].callGetProperty(obj), (Class) null, googleServicesTask, "packageName");
        ScriptBytecodeAdapter.setProperty(MODULE_GROUP, (Class) null, googleServicesTask, "moduleGroup");
        ScriptBytecodeAdapter.setProperty(MODULE_GROUP_FIREBASE, (Class) null, googleServicesTask, "moduleGroupFirebase");
        ScriptBytecodeAdapter.setProperty(targetVersionRaw, (Class) null, googleServicesTask, "moduleVersion");
        callSiteArr$getCallSiteArray[169].call(obj, googleServicesTask, file2);
        ScriptBytecodeAdapter.setProperty(strCastToString5, (Class) null, googleServicesTask, "searchedLocation");
    }
}
