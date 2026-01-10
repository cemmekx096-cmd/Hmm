package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;
    private final String a;
    private String b;
    private final Set c = new TreeSet();
    private int d = 0;
    private int e = 256;
    private int f = 4;

    public MaxAdPlacerSettings(String str) {
        this.a = str;
    }

    public void addFixedPosition(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.a;
    }

    public Set<Integer> getFixedPositions() {
        return this.c;
    }

    public int getMaxAdCount() {
        return this.e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f;
    }

    public String getPlacement() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.d;
    }

    public boolean hasValidPositioning() {
        return !this.c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.d >= 2;
    }

    public void resetFixedPositions() {
        this.c.clear();
    }

    public void setMaxAdCount(int i) {
        this.e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f = i;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.d = i;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i);
        } else {
            this.d = 0;
            o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
        }
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.a + "', fixedPositions=" + this.c + ", repeatingInterval=" + this.d + ", maxAdCount=" + this.e + ", maxPreloadedAdCount=" + this.f + '}';
    }
}
