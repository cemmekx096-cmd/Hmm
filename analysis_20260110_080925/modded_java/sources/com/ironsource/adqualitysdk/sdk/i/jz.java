package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class jz {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f638 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f639;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f640;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map<e, Method> f641;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m948() {
        f639 = 3592604619336492176L;
    }

    static {
        m948();
        f641 = new ConcurrentHashMap();
        int i = f638 + 41;
        f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 15 : 'D') != 'D') {
            int i2 = 83 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Class m942(String str, boolean z) {
        int i = f640 + 33;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            if (z) {
                cq.m464(m935("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17782 - ExpandableListView.getPackedPositionChild(0L)).intern(), new StringBuilder().append(m935("ꓓ硹᷻ㅬ훷\uea29", Color.red(0) + 56453).intern()).append(str).append(m935("꒰夛張嵋匤冏垡喦䯖䧹", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64997).intern()).toString(), th);
            }
            int i3 = f640 + 93;
            f638 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m947(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = f640 + 85;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? 'S' : (char) 21;
        Constructor constructor = cls.getConstructor(clsArr);
        Object[] array = list.toArray();
        if (c != 'S') {
            return constructor.newInstance(array);
        }
        Object objNewInstance = constructor.newInstance(array);
        int i2 = 53 / 0;
        return objNewInstance;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m939(Class cls, List<Object> list) throws Exception {
        int i = f638 + 11;
        f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Object objNewInstance = m943(cls, list).newInstance(list.toArray());
        int i3 = f640 + 37;
        f638 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? '-' : (char) 0) == 0) {
            return objNewInstance;
        }
        int i4 = 69 / 0;
        return objNewInstance;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Constructor m943(Class cls, List<Object> list) throws SecurityException {
        Constructor<?>[] constructors;
        int length;
        Constructor<?> constructor;
        int i = f640 + 89;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            constructors = cls.getConstructors();
            length = constructors.length;
        } else {
            constructors = cls.getConstructors();
            length = constructors.length;
        }
        int i2 = 0;
        while (true) {
            if ((i2 < length ? '0' : '1') != '0') {
                int i3 = f638 + 3;
                f640 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                return null;
            }
            constructor = constructors[i2];
            if (constructor.getParameterTypes().length == list.size()) {
                int i5 = f640 + R.styleable.AppCompatTheme_windowMinWidthMinor;
                f638 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i5 % 2 == 0) {
                    int i6 = 39 / 0;
                    if (m937(constructor, list)) {
                        break;
                    }
                } else if (m937(constructor, list)) {
                    break;
                }
            }
            i2++;
        }
        return constructor;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m944(Object obj, String str, List<Object> list) throws SecurityException {
        Method methodM951;
        e eVar = new e(obj, str, m952(list));
        Method method = f641.get(eVar);
        if (method != null) {
            if ((m946(method.getParameterTypes(), list) ? '#' : '\t') == '\t') {
                cq.m464(m935("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17783 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m935("ꓕ錑쬄̦笮댏\ueb45⍐᭼卯讇쎏㮓珧ꮹ\ue3cc\udbc3Ꮫ䯣菽社㈒樗ꈱ騰퉄ਗ਼䈑", AndroidCharacter.getMirror('0') + 14275).intern()).append(eVar).toString(), null);
            } else {
                int i = f638 + 17;
                f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i % 2 == 0) {
                    return method;
                }
                throw null;
            }
        }
        if (obj instanceof Class) {
            methodM951 = m950((Class) obj, str, list, true);
            if (methodM951 == null) {
                methodM951 = m951(Class.class, str, list);
                int i2 = f640 + 5;
                f638 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
            }
        } else {
            methodM951 = m951(obj, str, list);
        }
        if (methodM951 != null) {
            f641.put(eVar, methodM951);
        }
        return methodM951;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<Class> m952(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? (char) 1 : '\n') != 1) {
                return arrayList;
            }
            int i = f640 + 5;
            f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            Object next = it.next();
            if ((next != null ? 'X' : 'M') == 'M') {
                arrayList.add(Object.class);
                int i3 = f638 + 65;
                f640 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            } else {
                int i5 = f640 + 27;
                f638 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i5 % 2 == 0 ? (char) 29 : (char) 2) == 29) {
                    arrayList.add(next.getClass());
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                arrayList.add(next.getClass());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Method m951(Object obj, String str, List<Object> list) throws SecurityException {
        int i = f640 + 79;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Method methodM950 = m950(obj.getClass(), str, list, false);
        int i3 = f638 + 95;
        f640 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            throw null;
        }
        return methodM950;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Method m950(Class cls, String str, List<Object> list, boolean z) throws SecurityException {
        int i = f638 + 87;
        f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i3 = 0;
        while (true) {
            if ((i3 < length ? 'T' : (char) 2) != 2) {
                Method method = methods[i3];
                if ((method.getName().equals(str) ? '$' : 'C') != 'C' && method.getParameterTypes().length == list.size()) {
                    int i4 = f638 + 69;
                    f640 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i5 = i4 % 2;
                    if (Modifier.isStatic(method.getModifiers()) == z && m949(method, list)) {
                        return method;
                    }
                }
                i3++;
            } else {
                int i6 = f638 + 105;
                f640 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i6 % 2 == 0) {
                    return null;
                }
                int i7 = 22 / 0;
                return null;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m949(Method method, List<Object> list) {
        int i = f640 + 11;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? 'F' : 'X';
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (c != 'F') {
            return m946(parameterTypes, list);
        }
        m946(parameterTypes, list);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m937(Constructor constructor, List<Object> list) {
        int i = f640 + 41;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (z) {
            return m946(parameterTypes, list);
        }
        m946(parameterTypes, list);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m946(Class[] clsArr, List<Object> list) {
        int i = f640 + 87;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        for (int i3 = 0; i3 < clsArr.length; i3++) {
            int i4 = f640 + 55;
            f638 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            Object obj = list.get(i3);
            if ((obj == null ? 'N' : '6') == '6' || Object.class.isAssignableFrom(clsArr[i3])) {
                if ((obj != null ? 'D' : '#') != '#') {
                    if (!(!m945(clsArr[i3], obj))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ea, code lost:
    
        if ((r7.isAssignableFrom(java.lang.Boolean.class) ? ':' : '\t') != ':') goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m945(java.lang.Class r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m945(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.reflect.Method] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Method m940(Object obj, String str, List<Class> list) throws NoSuchMethodException, SecurityException {
        try {
            Class<?>[] clsArrM941 = m941(list);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, clsArrM941);
            }
            int i = f638 + 23;
            f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            try {
                obj = ((Class) obj).getMethod(str, clsArrM941);
                int i3 = f638 + 29;
                f640 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i3 % 2 != 0 ? (char) 22 : 'F') != 22) {
                    return obj;
                }
                throw null;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM941);
            }
        } catch (NoSuchMethodException e2) {
            cq.m464(m935("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", Color.argb(0, 0, 0, 0) + 17783).intern(), new StringBuilder().append(m935("ꓞ\ued68㞞硲", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 18840).intern()).append(str).append(m935("꒷欹㯯쩮髀\ua955秉ࡋ\ud8f8\uef27뾥丆Ẓⴁ\ufdce跱屯泻㌒", 53130 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()).append(obj).toString(), e2);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m953(Field[] fieldArr, Field[] fieldArr2) {
        int i = f638 + 61;
        f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length * length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 0, length);
            System.arraycopy(fieldArr2, 1, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Method[] m938(Method[] methodArr, Method[] methodArr2) {
        int i = f640 + 35;
        f638 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            Method[] methodArr3 = new Method[length - length2];
            System.arraycopy(methodArr, 1, methodArr3, 0, length);
            System.arraycopy(methodArr2, 0, methodArr3, length, length2);
            return methodArr3;
        }
        int length3 = methodArr.length;
        int length4 = methodArr2.length;
        Method[] methodArr4 = new Method[length3 + length4];
        System.arraycopy(methodArr, 0, methodArr4, 0, length3);
        System.arraycopy(methodArr2, 0, methodArr4, length3, length4);
        return methodArr4;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Class[] m941(List<Class> list) {
        int i = f638 + 63;
        f640 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Class[] clsArr = new Class[list.size()];
        int i3 = f638 + 17;
        f640 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < list.size()) {
            int i6 = f640 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
            f638 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i6 % 2 != 0) {
                clsArr[i5] = list.get(i5);
                i5++;
            } else {
                clsArr[i5] = list.get(i5);
                i5 += 61;
            }
        }
        return clsArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m936(java.lang.Class r6, java.util.List<java.lang.String> r7) {
        /*
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.jz> r0 = com.ironsource.adqualitysdk.sdk.i.jz.class
            r1 = 56
            if (r6 == 0) goto L9
            r2 = 22
            goto La
        L9:
            r2 = r1
        La:
            r3 = 0
            if (r2 == r1) goto Lc3
            r1 = 1
            if (r7 == 0) goto Lc2
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L18
            r2 = r1
            goto L19
        L18:
            r2 = r3
        L19:
            if (r2 == r1) goto Lc2
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L71
            int r2 = com.ironsource.adqualitysdk.sdk.i.jz.f638
            int r2 = r2 + 83
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f640 = r4
            int r2 = r2 % 2
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = ""
            boolean r5 = r2.equals(r4)
            if (r5 == 0) goto L57
            java.lang.Package r5 = r6.getPackage()
            if (r5 == 0) goto L45
            r5 = r1
            goto L46
        L45:
            r5 = r3
        L46:
            if (r5 == r1) goto L49
            goto L70
        L49:
            java.lang.Package r5 = r6.getPackage()
            java.lang.String r5 = r5.getName()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L70
        L57:
            boolean r4 = r2.equals(r4)
            r5 = 16
            if (r4 != 0) goto L61
            r4 = r5
            goto L63
        L61:
            r4 = 97
        L63:
            if (r4 == r5) goto L66
            goto L1f
        L66:
            java.lang.String r4 = r6.getName()
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L1f
        L70:
            return r1
        L71:
            java.lang.String r7 = r0.getName()
            int r2 = android.graphics.Color.green(r3)
            int r2 = r2 + 5591
            java.lang.String r4 = "ꓳ넨轓\ue53b\uf3a5집⟵㰟ਜ਼恰纃哟ꋧ뼞镼\ue368濾\ud7a6ⷻ㨄ူ湚䒞劸"
            java.lang.String r2 = m935(r4, r2)
            java.lang.String r2 = r2.intern()
            boolean r7 = r7.startsWith(r2)
            if (r7 != 0) goto L8d
            r7 = r1
            goto L8e
        L8d:
            r7 = r3
        L8e:
            if (r7 == 0) goto Lc3
            java.lang.Package r7 = r0.getPackage()
            if (r7 != 0) goto La6
            int r7 = com.ironsource.adqualitysdk.sdk.i.jz.f640
            int r7 = r7 + 67
            int r2 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f638 = r2
            int r7 = r7 % 2
            java.lang.Package r7 = r6.getPackage()
            if (r7 == 0) goto Lc0
        La6:
            java.lang.Package r7 = r0.getPackage()
            if (r7 == 0) goto Lae
            r7 = r3
            goto Laf
        Lae:
            r7 = r1
        Laf:
            if (r7 == 0) goto Lb2
            goto Lc1
        Lb2:
            java.lang.Package r7 = r0.getPackage()
            java.lang.Package r6 = r6.getPackage()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lc1
        Lc0:
            return r1
        Lc1:
            return r3
        Lc2:
            return r1
        Lc3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m936(java.lang.Class, java.util.List):boolean");
    }

    static class e {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f642 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f643 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char[] f644 = {25073, 41935, 58852, 10134, 27019, 43958, 60796, 12099, 29034, 45843, 62734, 14119, 30912, 47819, 64743, 16024, 16551, GMTDateParser.MINUTES, 49753, 33870, 17960, 2109, 51725, 36080, 20185, 4316, 53927, 38063, 22145, 6453, ',', 49718, 33857, 17935, 2109, 51738, 36076, 20213, 4308, 53896, 38077, 22175, 6509, 56099, 40211, 19361, 35259, 53196, 3470, 17319, 33156, 51018, 1403, 23388, 39224, 57122, 7450, 21238, 37038};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f645 = -233828083858685418L;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Class f646;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private List<Class> f647;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f648;

        public e(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f646 = (Class) obj;
            } else {
                this.f646 = obj.getClass();
            }
            this.f648 = str;
            this.f647 = list;
        }

        public final boolean equals(Object obj) {
            if ((this == obj ? '\"' : ')') == '\"') {
                int i = f643 + 61;
                f642 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                return i % 2 == 0;
            }
            if (obj != null) {
                int i2 = f642 + 103;
                f643 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i2 % 2 == 0 ? 'A' : 'O') == 'A') {
                    obj.getClass();
                    throw null;
                }
                if ((getClass() != obj.getClass() ? (char) 6 : 'H') == 'H') {
                    e eVar = (e) obj;
                    if (!this.f646.equals(eVar.f646)) {
                        return false;
                    }
                    if ((!this.f648.equals(eVar.f648) ? 'c' : GMTDateParser.MONTH) != 'c') {
                        boolean zEquals = this.f647.equals(eVar.f647);
                        int i3 = f643 + 71;
                        f642 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i3 % 2 == 0) {
                            return zEquals;
                        }
                        int i4 = 53 / 0;
                        return zEquals;
                    }
                    int i5 = f642;
                    int i6 = i5 + 47;
                    f643 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i7 = i6 % 2;
                    int i8 = i5 + R.styleable.AppCompatTheme_toolbarStyle;
                    f643 = i8 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i9 = i8 % 2;
                    return false;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = f643 + R.styleable.AppCompatTheme_tooltipFrameBackground;
            f642 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            int iHashCode = (((this.f646.hashCode() * 31) + this.f648.hashCode()) * 31) + this.f647.hashCode();
            int i3 = f643 + 41;
            f642 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(m954('A' - AndroidCharacter.getMirror('0'), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), (char) (25020 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR))).intern());
            sb.append(m954((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 17 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(this.f646);
            sb.append(m954(15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(this.f648).append('\'');
            sb.append(m954(14 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 46, (char) (Color.argb(0, 0, 0, 0) + 19341)).intern()).append(this.f647);
            sb.append('}');
            String string = sb.toString();
            int i = f643 + 19;
            f642 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 != 0 ? GMTDateParser.YEAR : '.') == '.') {
                return string;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m954(int i, int i2, char c) {
            String str;
            synchronized (a.ﻛ) {
                char[] cArr = new char[i];
                a.ｋ = 0;
                while (a.ｋ < i) {
                    cArr[a.ｋ] = (char) ((f644[a.ｋ + i2] ^ (a.ｋ * f645)) ^ c);
                    a.ｋ++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m935(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (g.ﾇ) {
            g.ﾒ = i;
            char[] cArr2 = new char[cArr.length];
            g.ｋ = 0;
            while (g.ｋ < cArr.length) {
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f639);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
