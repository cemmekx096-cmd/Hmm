package com.bytedance.sdk.component.MY.IlO.MY;

import io.fabric.sdk.android.services.network.HttpRequest;
import io.ktor.util.date.GMTDateParser;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class tV implements Serializable, Comparable<tV> {
    transient int Cc;
    final byte[] tV;
    transient String vCE;
    static final char[] IlO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    public static final Charset MY = Charset.forName(HttpRequest.CHARSET_UTF8);
    public static final tV EO = IlO(new byte[0]);

    tV(byte[] bArr) {
        this.tV = bArr;
    }

    public static tV IlO(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new tV((byte[]) bArr.clone());
    }

    public String IlO() {
        String str = this.vCE;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.tV, MY);
        this.vCE = str2;
        return str2;
    }

    public String MY() {
        byte[] bArr = this.tV;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = IlO;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public tV IlO(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.tV;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.tV.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new tV(bArr2);
    }

    public byte IlO(int i) {
        return this.tV[i];
    }

    public int EO() {
        return this.tV.length;
    }

    public byte[] tV() {
        return (byte[]) this.tV.clone();
    }

    public boolean IlO(int i, tV tVVar, int i2, int i3) {
        return tVVar.IlO(i2, this.tV, i, i3);
    }

    public boolean IlO(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.tV;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && DmF.IlO(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tV) {
            tV tVVar = (tV) obj;
            int iEO = tVVar.EO();
            byte[] bArr = this.tV;
            if (iEO == bArr.length && tVVar.IlO(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.Cc;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.tV);
        this.Cc = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: IlO, reason: merged with bridge method [inline-methods] */
    public int compareTo(tV tVVar) {
        int iEO = EO();
        int iEO2 = tVVar.EO();
        int iMin = Math.min(iEO, iEO2);
        for (int i = 0; i < iMin; i++) {
            int iIlO = IlO(i) & 255;
            int iIlO2 = tVVar.IlO(i) & 255;
            if (iIlO != iIlO2) {
                return iIlO < iIlO2 ? -1 : 1;
            }
        }
        if (iEO == iEO2) {
            return 0;
        }
        return iEO < iEO2 ? -1 : 1;
    }

    public String toString() {
        if (this.tV.length == 0) {
            return "[size=0]";
        }
        String strIlO = IlO();
        int iIlO = IlO(strIlO, 64);
        if (iIlO == -1) {
            if (this.tV.length <= 64) {
                return "[hex=" + MY() + "]";
            }
            return "[size=" + this.tV.length + " hex=" + IlO(0, 64).MY() + "…]";
        }
        String strReplace = strIlO.substring(0, iIlO).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return iIlO < strIlO.length() ? "[size=" + this.tV.length + " text=" + strReplace + "…]" : "[text=" + strReplace + "]";
    }

    static int IlO(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
