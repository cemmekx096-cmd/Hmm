package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class h7 implements d4 {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public static h7 a(c8 c8Var, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        c8 c8VarC = c8Var.c("StaticResource");
        if (c8VarC == null || !URLUtil.isValidUrl(c8VarC.d())) {
            kVar.O();
            if (!o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        h7 h7Var = new h7();
        h7Var.c = Uri.parse(c8VarC.d());
        c8 c8VarB = c8Var.b("IconClickThrough");
        if (c8VarB != null && URLUtil.isValidUrl(c8VarB.d())) {
            h7Var.d = Uri.parse(c8VarB.d());
        }
        String str = (String) c8Var.a().get(SettingsJsonConstants.ICON_WIDTH_KEY);
        int i = 0;
        int i2 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) c8Var.a().get(SettingsJsonConstants.ICON_HEIGHT_KEY);
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) kVar.a(l4.x4)).intValue();
        if (i2 <= 0 || i <= 0) {
            h7Var.f = iIntValue;
            h7Var.e = iIntValue;
        } else {
            double d = i2 / i;
            int iMin = Math.min(Math.max(i2, i), iIntValue);
            if (i2 >= i) {
                h7Var.e = iMin;
                h7Var.f = (int) (iMin / d);
            } else {
                h7Var.f = iMin;
                h7Var.e = (int) (iMin * d);
            }
        }
        return h7Var;
    }

    public Set b() {
        return this.a;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public Uri e() {
        return this.c;
    }

    public Set f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }

    public static h7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        l7 l7VarA;
        l7 l7VarA2;
        if (jSONObject == null) {
            return null;
        }
        h7 h7Var = new h7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        h7Var.c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (l7VarA2 = l7.a(jSONObject2, kVar)) != null) {
                h7Var.a.add(l7VarA2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && (l7VarA = l7.a(jSONObject3, kVar)) != null) {
                h7Var.b.add(l7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        h7Var.d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        h7Var.e = JsonUtils.getInt(jSONObject, SettingsJsonConstants.ICON_WIDTH_KEY, 0);
        h7Var.f = JsonUtils.getInt(jSONObject, SettingsJsonConstants.ICON_HEIGHT_KEY, 0);
        return h7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((l7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((l7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, SettingsJsonConstants.ICON_WIDTH_KEY, this.e);
        JsonUtils.putInt(jSONObject, SettingsJsonConstants.ICON_HEIGHT_KEY, this.f);
        return jSONObject;
    }
}
