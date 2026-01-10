package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class R3 {
    public static final R3 a;
    public static final /* synthetic */ R3[] b;

    static {
        R3 r3 = new R3("URL", 0);
        a = r3;
        R3[] r3Arr = {r3, new R3("HTML", 1)};
        b = r3Arr;
        EnumEntriesKt.enumEntries(r3Arr);
    }

    public R3(String str, int i) {
    }

    public static R3 valueOf(String str) {
        return (R3) Enum.valueOf(R3.class, str);
    }

    public static R3[] values() {
        return (R3[]) b.clone();
    }
}
