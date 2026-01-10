package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cd extends bg {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f53 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f54 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f55 = 1302285000612553467L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f56 = {';', 'V', 'u', 'n', 'g', 'l', 'e', 'A', 'c', 't', 'i', 'v', 'y', 'o', GMTDateParser.MINUTES, '.', 'w', 'a', 'r', 'W', 'b', 'P', GMTDateParser.DAY_OF_MONTH, 'C', 'k', 'R', 'p', GMTDateParser.SECONDS, 'L', GMTDateParser.MONTH, 'I', 'D', 'F', 'B', 'N', '<'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f57 = 6;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f58;

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Placement m322(Repository repository, String str) {
        int i = f54 + 109;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? ' ' : 'D') != ' ') {
            return m320(repository, str);
        }
        m320(repository, str);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m323(Advertisement advertisement) {
        int i = f54 + 95;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return m321(advertisement);
        }
        m321(advertisement);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m325(Advertisement advertisement) {
        int i = f53 + 1;
        f54 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Map<String, String> mapM317 = m317(advertisement);
        int i3 = f53 + 37;
        f54 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '1' : 'F') != '1') {
            return mapM317;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m326(Placement placement) {
        int i = f54 + 61;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? (char) 24 : '3';
        boolean zM328 = m328(placement);
        if (c != '3') {
            int i2 = 84 / 0;
        }
        int i3 = f53 + 65;
        f54 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return zM328;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m327(Advertisement advertisement) {
        int i = f54 + 65;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            m318(advertisement);
            throw null;
        }
        String strM318 = m318(advertisement);
        int i2 = f54 + 17;
        f53 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? 'E' : 'D') == 'D') {
            return strM318;
        }
        int i3 = 96 / 0;
        return strM318;
    }

    public cd(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m332() {
        int i = f53 + 53;
        f54 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String str = ﾇ();
        Object obj = null;
        if (str == null) {
            return null;
        }
        int i3 = f53 + 55;
        f54 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String str2 = (i3 % 2 != 0 ? (char) 3 : '^') != 3 ? str.split(m319("鵥૪鵊\uf505縉", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern())[1] : str.split(m319("鵥૪鵊\uf505縉", 0 % (ViewConfiguration.getLongPressTimeout() * 70)).intern())[1];
        int i4 = f54 + 5;
        f53 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            return str2;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m331() {
        int i = f53;
        int i2 = i + 27;
        f54 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        if ((this.f58 == null ? 'a' : 'S') != 'S') {
            int i4 = i + 95;
            f54 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i4 % 2 != 0 ? (char) 0 : 'V') != 0) {
                String strM315 = m315();
                this.f58 = strM315;
                ﻐ(strM315);
            } else {
                String strM3152 = m315();
                this.f58 = strM3152;
                ﻐ(strM3152);
                int i5 = 11 / 0;
            }
        }
        String str = this.f58;
        int i6 = f54 + 87;
        f53 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m315() {
        String str;
        int i = f53 + 17;
        f54 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Class clsM316 = m316();
        hr.ﻛ().ｋ();
        try {
            Iterator it = hr.ﻛ().ｋ().ﾇ(clsM316, ho.ｋ().ﻛ(String.class).ﻛ(8).ﾒ(16).ｋ()).iterator();
            while (true) {
                if (it.hasNext()) {
                    str = (String) ((Field) it.next()).get(null);
                    if (!str.startsWith(m319("\uec25솰\uec73茄沯挾욜萹枥\uef32劧\u181fﮜ笙\udea5氈", 1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)).intern())) {
                        int i3 = f53 + 103;
                        f54 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i3 % 2 == 0) {
                            if (!(!str.startsWith(m319("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", KeyEvent.getDeadChar(0, 0) + 1).intern()))) {
                                break;
                            }
                            int i4 = f54 + 103;
                            f53 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                            int i5 = i4 % 2;
                        } else {
                            if (str.startsWith(m319("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", 1 << KeyEvent.getDeadChar(0, 1)).intern())) {
                                break;
                            }
                            int i42 = f54 + 103;
                            f53 = i42 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                            int i52 = i42 % 2;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            String str2 = str.split(m324((byte) (97 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), "\u009d", Color.argb(0, 0, 0, 0) + 1).intern())[0];
            int i6 = f53 + 9;
            f54 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i7 = i6 % 2;
            return str2;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:146:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m330(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cd.m330(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m329() {
        HashMap map = new HashMap();
        map.put(m324((byte) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 28), "\u0000\n\u000f\u001b\u000b\u0017\t\u0007\f\b\t\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m333(List<Object> list, ch chVar) {
                return cd.m322((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m319("\ue3fcᾍ\ue395\uda07Ⱥ봅龸\ueaa5桳ㄏ\u0b8b皓\uf44dꔨ螠ʉ䁝奖", Drawable.resolveOpacity(0, 0) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m337(List<Object> list, ch chVar) {
                return Boolean.valueOf(cd.m326((Placement) list.get(0)));
            }
        });
        map.put(m319("렸鐤롟䪱鳞㚺༳瑮㎰몎鬲\ue871꾋⺒ᜋ鱞ᮘ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m334(List<Object> list, ch chVar) {
                return cd.m323((Advertisement) list.get(0));
            }
        });
        map.put(m319("采\uf7f8醠诖ꘃ啦칔亱ᩊ\ud972婄튿虶䵌홶", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m335(List<Object> list, ch chVar) {
                return cd.m327((Advertisement) list.get(0));
            }
        });
        map.put(m319("軑殠躶斱臋줾″楾Ւ䔰됽\uf57a饦턒㠛腣\u2d77\u2d73豮ഫꄓ륧ၤ", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m336(List<Object> list, ch chVar) {
                return cd.m325((Advertisement) list.get(0));
            }
        });
        int i = f54 + 81;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m328(Placement placement) {
        int i = f53 + 11;
        f54 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        int i3 = f53 + 15;
        f54 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return zIsIncentivized;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m321(Advertisement advertisement) {
        int i = f54 + 41;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m318(Advertisement advertisement) {
        int i = f54 + 63;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String campaign = advertisement.getCampaign();
        int i3 = f54 + 53;
        f53 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return campaign;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Map<String, String> m317(Advertisement advertisement) {
        int i = f53 + 61;
        f54 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 1 : ',') != 1) {
            return advertisement.getDownloadableUrls();
        }
        advertisement.getDownloadableUrls();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Class m316() {
        Class<VungleApiClient> cls;
        int i = f54 + 83;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f53 = i2;
        if ((i % 2 == 0 ? '+' : (char) 1) != '+') {
            cls = VungleApiClient.class;
        } else {
            cls = VungleApiClient.class;
            int i3 = 68 / 0;
        }
        int i4 = i2 + 75;
        f54 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return cls;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m320(Repository repository, String str) {
        int i = f54 + 69;
        f53 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i2 = f54 + 85;
        f53 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return placement;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m319(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f55, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f55));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m324(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f56;
            char c = f57;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                i.ﾒ = 0;
                while (i.ﾒ < i) {
                    i.ﾇ = cArr[i.ﾒ];
                    i.ﻛ = cArr[i.ﾒ + 1];
                    if (i.ﾇ == i.ﻛ) {
                        cArr3[i.ﾒ] = (char) (i.ﾇ - b);
                        cArr3[i.ﾒ + 1] = (char) (i.ﻛ - b);
                    } else {
                        i.ｋ = i.ﾇ / c;
                        i.ﱟ = i.ﾇ % c;
                        i.ﻐ = i.ﻛ / c;
                        i.ﮐ = i.ﻛ % c;
                        if (i.ﱟ == i.ﮐ) {
                            i.ｋ = ((i.ｋ + c) - 1) % c;
                            i.ﻐ = ((i.ﻐ + c) - 1) % c;
                            int i2 = (i.ｋ * c) + i.ﱟ;
                            int i3 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i2];
                            cArr3[i.ﾒ + 1] = cArr2[i3];
                        } else if (i.ｋ == i.ﻐ) {
                            i.ﱟ = ((i.ﱟ + c) - 1) % c;
                            i.ﮐ = ((i.ﮐ + c) - 1) % c;
                            int i4 = (i.ｋ * c) + i.ﱟ;
                            int i5 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i4];
                            cArr3[i.ﾒ + 1] = cArr2[i5];
                        } else {
                            int i6 = (i.ｋ * c) + i.ﮐ;
                            int i7 = (i.ﻐ * c) + i.ﱟ;
                            cArr3[i.ﾒ] = cArr2[i6];
                            cArr3[i.ﾒ + 1] = cArr2[i7];
                        }
                    }
                    i.ﾒ += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
