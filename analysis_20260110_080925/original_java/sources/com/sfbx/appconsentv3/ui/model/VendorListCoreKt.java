package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.Consentable;
import com.sfbx.appconsent.core.model.api.proto.DataCategoryProtoMapper;
import com.sfbx.appconsent.core.model.api.proto.DataRetention;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.Stack;
import com.sfbx.appconsent.core.model.api.proto.Vendor;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.api.proto.VendorUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VendorListCore.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0000\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0000\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0000\u001a\f\u0010\u0000\u001a\u00020\r*\u00020\u000eH\u0000¨\u0006\u000f"}, d2 = {"convertTo", "Lcom/sfbx/appconsentv3/ui/model/ConsentableCore;", "Lcom/sfbx/appconsent/core/model/api/proto/Consentable;", "Lcom/sfbx/appconsentv3/ui/model/DataCategoryProtoMapperCore;", "Lcom/sfbx/appconsent/core/model/api/proto/DataCategoryProtoMapper;", "Lcom/sfbx/appconsentv3/ui/model/DataRetentionCore;", "Lcom/sfbx/appconsent/core/model/api/proto/DataRetention;", "Lcom/sfbx/appconsentv3/ui/model/StackCore;", "Lcom/sfbx/appconsent/core/model/api/proto/Stack;", "Lcom/sfbx/appconsentv3/ui/model/VendorCore;", "Lcom/sfbx/appconsent/core/model/api/proto/Vendor;", "Lcom/sfbx/appconsentv3/ui/model/VendorListCore;", "Lcom/sfbx/appconsent/core/model/api/proto/VendorList;", "Lcom/sfbx/appconsentv3/ui/model/VendorUrlCore;", "Lcom/sfbx/appconsent/core/model/api/proto/VendorUrl;", "appconsent-ui-v3_prodPremiumRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class VendorListCoreKt {
    public static final VendorListCore convertTo(VendorList vendorList) {
        Intrinsics.checkNotNullParameter(vendorList, "<this>");
        int gvlVersion = vendorList.getGvlVersion();
        List consentables = vendorList.getConsentables();
        ArrayList arrayList = new ArrayList();
        Iterator it = consentables.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf(convertTo((Consentable) it.next())));
        }
        ArrayList arrayList2 = arrayList;
        List vendors = vendorList.getVendors();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = vendors.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList3, CollectionsKt.listOf(convertTo((Vendor) it2.next())));
        }
        ArrayList arrayList4 = arrayList3;
        List stacks = vendorList.getStacks();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = stacks.iterator();
        while (it3.hasNext()) {
            CollectionsKt.addAll(arrayList5, CollectionsKt.listOf(convertTo((Stack) it3.next())));
        }
        return new VendorListCore(gvlVersion, arrayList2, arrayList4, arrayList5, vendorList.getCmpVersion(), vendorList.getTcfPolicyVersion(), vendorList.getPublisherCC(), vendorList.getPublisherRestrictions(), CollectionsKt.toList(vendorList.getGeolocAds()), CollectionsKt.toList(vendorList.getGeolocMarkets()), vendorList.getGoogleProvider(), vendorList.getConsentLifetime(), vendorList.getRemoveLegintables(), vendorList.getDataCategories());
    }

    public static final ConsentableCore convertTo(Consentable consentable) {
        Intrinsics.checkNotNullParameter(consentable, "<this>");
        int id = consentable.getId();
        Integer iabId = consentable.getIabId();
        String extraId = consentable.getExtraId();
        I18NStringCore i18NStringCoreConvertTo = I18NStringCoreKt.convertTo(consentable.getName());
        I18NStringCore i18NStringCoreConvertTo2 = I18NStringCoreKt.convertTo(consentable.getDescription());
        I18NStringCore i18NStringCoreConvertTo3 = I18NStringCoreKt.convertTo(consentable.getDescriptionLegal());
        I18NString illustrations = consentable.getIllustrations();
        return new ConsentableCore(id, iabId, extraId, i18NStringCoreConvertTo, i18NStringCoreConvertTo2, i18NStringCoreConvertTo3, illustrations != null ? I18NStringCoreKt.convertTo(illustrations) : null, consentable.getType(), ACConsentStatusKt.convertTo(consentable.getStatus()), ACConsentStatusKt.convertTo(consentable.getLegintStatus()));
    }

    public static final VendorCore convertTo(Vendor vendor) {
        Intrinsics.checkNotNullParameter(vendor, "<this>");
        int id = vendor.getId();
        Integer iabId = vendor.getIabId();
        String extraId = vendor.getExtraId();
        String name = vendor.getName();
        String policyUrl = vendor.getPolicyUrl();
        Map urls = vendor.getUrls();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(urls.size()));
        for (Map.Entry entry : urls.entrySet()) {
            linkedHashMap.put(entry.getKey(), convertTo((VendorUrl) entry.getValue()));
        }
        return new VendorCore(id, iabId, extraId, name, policyUrl, MapsKt.toMap(linkedHashMap), convertTo(vendor.getDataRetention()), CollectionsKt.toList(vendor.getConsentables()), CollectionsKt.toList(vendor.getLegintables()), CollectionsKt.toList(vendor.getFlexibles()), ACConsentStatusKt.convertTo(vendor.getStatus()), ACConsentStatusKt.convertTo(vendor.getLegintStatus()), vendor.getCookieMaxAgeSeconds(), vendor.getUsesNonCookieAccess(), vendor.getGoogleAtpId(), vendor.getDataDeclaration());
    }

    public static final VendorUrlCore convertTo(VendorUrl vendorUrl) {
        Intrinsics.checkNotNullParameter(vendorUrl, "<this>");
        return new VendorUrlCore(vendorUrl.getPrivacy(), vendorUrl.getLegintClaim());
    }

    public static final DataRetentionCore convertTo(DataRetention dataRetention) {
        Intrinsics.checkNotNullParameter(dataRetention, "<this>");
        return new DataRetentionCore(dataRetention.getStdRetention(), MapsKt.toMap(dataRetention.getPurposes()), MapsKt.toMap(dataRetention.getSpecialPurposes()));
    }

    public static final DataCategoryProtoMapperCore convertTo(DataCategoryProtoMapper dataCategoryProtoMapper) {
        Intrinsics.checkNotNullParameter(dataCategoryProtoMapper, "<this>");
        return new DataCategoryProtoMapperCore(dataCategoryProtoMapper.getId(), I18NStringCoreKt.convertTo(dataCategoryProtoMapper.getName()));
    }

    public static final StackCore convertTo(Stack stack) {
        Intrinsics.checkNotNullParameter(stack, "<this>");
        return new StackCore(stack.getId(), stack.getIabId(), I18NStringCoreKt.convertTo(stack.getName()), I18NStringCoreKt.convertTo(stack.getDescription()), CollectionsKt.toList(stack.getConsentables()), ACConsentStatusKt.convertTo(stack.getStatus()), ACConsentStatusKt.convertTo(stack.getLegintStatus()));
    }
}
