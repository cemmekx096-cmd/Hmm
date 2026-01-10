package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class V9 {
    public static final V9 b;
    public static final V9 c;
    public static final /* synthetic */ V9[] d;
    public final int a;

    static {
        V9 v9 = new V9(0, 0, "HIGHEST");
        b = v9;
        V9 v92 = new V9(1, 1, "HIGH");
        V9 v93 = new V9(2, 2, "MEDIUM");
        c = v93;
        V9[] v9Arr = {v9, v92, v93, new V9(3, 3, "LOW"), new V9(4, 4, "LOWEST")};
        d = v9Arr;
        EnumEntriesKt.enumEntries(v9Arr);
    }

    public V9(int i, int i2, String str) {
        this.a = i2;
    }

    public static V9 valueOf(String str) {
        return (V9) Enum.valueOf(V9.class, str);
    }

    public static V9[] values() {
        return (V9[]) d.clone();
    }
}
