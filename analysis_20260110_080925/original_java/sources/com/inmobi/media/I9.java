package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class I9 {
    public static final I9 a;
    public static final I9 b;
    public static final I9 c;
    public static final I9 d;
    public static final /* synthetic */ I9[] e;

    static {
        I9 i9 = new I9("PORTRAIT", 0);
        a = i9;
        I9 i92 = new I9("LANDSCAPE", 1);
        b = i92;
        I9 i93 = new I9("REVERSE_PORTRAIT", 2);
        c = i93;
        I9 i94 = new I9("REVERSE_LANDSCAPE", 3);
        d = i94;
        I9[] i9Arr = {i9, i92, i93, i94};
        e = i9Arr;
        EnumEntriesKt.enumEntries(i9Arr);
    }

    public I9(String str, int i) {
    }

    public static I9 valueOf(String str) {
        return (I9) Enum.valueOf(I9.class, str);
    }

    public static I9[] values() {
        return (I9[]) e.clone();
    }
}
