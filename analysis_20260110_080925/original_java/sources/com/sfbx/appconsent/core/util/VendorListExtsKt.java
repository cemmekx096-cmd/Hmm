package com.sfbx.appconsent.core.util;

import ac.Models;
import com.crashlytics.android.BuildConfig;
import com.google.protobuf.Timestamp;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.api.proto.Consentable;
import com.sfbx.appconsent.core.model.api.proto.DataCategoryProtoMapper;
import com.sfbx.appconsent.core.model.api.proto.DataRetention;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.Stack;
import com.sfbx.appconsent.core.model.api.proto.Vendor;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.api.proto.VendorUrl;
import com.sfbx.appconsent.core.model.reducer.TimestampSurrogate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VendorListExts.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\u0003\u001a\u00020\b*\u00020\tH\u0000\u001a\f\u0010\u0003\u001a\u00020\n*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u000b*\u00020\fH\u0000\u001a\f\u0010\u0003\u001a\u00020\r*\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00020\u0002*\u00020\u0001H\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00050\u0005*\u00020\u0004H\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\t0\t*\u00020\bH\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00020\u0002*\u00020\nH\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012*\u00020\u0013H\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000e*\u00020\rH\u0000\u001a\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00070\u0007*\u00020\u0006H\u0000¨\u0006\u0014"}, d2 = {"toCore", "Lcom/sfbx/appconsent/core/model/DataCategoryCore;", "Lac/Models$Vendorlist$DataCategory;", "toCoreModel", "Lcom/sfbx/appconsent/core/model/FloatingConsent;", "Lac/Models$ConsentFloatingExtraPurpose;", "Lcom/sfbx/appconsent/core/model/api/proto/VendorList;", "Lac/Models$Vendorlist;", "Lcom/sfbx/appconsent/core/model/api/proto/Consentable;", "Lac/Models$Vendorlist$Consentable;", "Lcom/sfbx/appconsent/core/model/api/proto/DataCategoryProtoMapper;", "Lcom/sfbx/appconsent/core/model/api/proto/Stack;", "Lac/Models$Vendorlist$Stack;", "Lcom/sfbx/appconsent/core/model/api/proto/Vendor;", "Lac/Models$Vendorlist$Vendor;", "toProto", "kotlin.jvm.PlatformType", "toProtoModel", "Lac/Models$Vendorlist$Vendor$DataRetention;", "Lcom/sfbx/appconsent/core/model/api/proto/DataRetention;", "appconsent-core_prodPremiumRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class VendorListExtsKt {

    /* compiled from: VendorListExts.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Models.ConsentFloatingExtraPurposeType.values().length];
            try {
                iArr[Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConsentStatus.values().length];
            try {
                iArr2[ConsentStatus.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConsentStatus.DISALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final VendorList toCoreModel(Models.Vendorlist vendorlist) {
        Intrinsics.checkNotNullParameter(vendorlist, "<this>");
        Map dataCategoriesMap = vendorlist.getDataCategoriesMap();
        Intrinsics.checkNotNullExpressionValue(dataCategoriesMap, "dataCategoriesMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(dataCategoriesMap.size()));
        for (Map.Entry entry : dataCategoriesMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            linkedHashMap.put(key, toCore((Models.Vendorlist.DataCategory) value));
        }
        int iabGvl = vendorlist.getIabGvl();
        List consentablesList = vendorlist.getConsentablesList();
        Intrinsics.checkNotNullExpressionValue(consentablesList, "consentablesList");
        List<Models.Vendorlist.Consentable> list = consentablesList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Models.Vendorlist.Consentable consentable : list) {
            Intrinsics.checkNotNullExpressionValue(consentable, "it");
            arrayList.add(toCoreModel(consentable));
        }
        ArrayList arrayList2 = arrayList;
        List vendorsList = vendorlist.getVendorsList();
        Intrinsics.checkNotNullExpressionValue(vendorsList, "vendorsList");
        List<Models.Vendorlist.Vendor> list2 = vendorsList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Models.Vendorlist.Vendor vendor : list2) {
            Intrinsics.checkNotNullExpressionValue(vendor, "it");
            arrayList3.add(toCoreModel(vendor));
        }
        ArrayList arrayList4 = arrayList3;
        List stacksList = vendorlist.getStacksList();
        Intrinsics.checkNotNullExpressionValue(stacksList, "stacksList");
        List<Models.Vendorlist.Stack> list3 = stacksList;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (Models.Vendorlist.Stack stack : list3) {
            Intrinsics.checkNotNullExpressionValue(stack, "it");
            arrayList5.add(toCoreModel(stack));
        }
        ArrayList arrayList6 = arrayList5;
        int tcfPolicyVersion = vendorlist.getTcfPolicyVersion();
        String publisherCc = vendorlist.getPublisherCc();
        String publisherRestrictions = vendorlist.getPublisherRestrictions();
        List geolocAdList = vendorlist.getGeolocAdList();
        List geolocMarketList = vendorlist.getGeolocMarketList();
        String googleProviders = vendorlist.getGoogleProviders();
        Intrinsics.checkNotNullExpressionValue(googleProviders, "googleProviders");
        String googleProviders2 = googleProviders.length() == 0 ? null : vendorlist.getGoogleProviders();
        int consentLifetime = vendorlist.getConsentLifetime();
        boolean removeLegintables = vendorlist.getRemoveLegintables();
        Intrinsics.checkNotNullExpressionValue(publisherCc, "publisherCc");
        Intrinsics.checkNotNullExpressionValue(publisherRestrictions, "publisherRestrictions");
        Intrinsics.checkNotNullExpressionValue(geolocAdList, "geolocAdList");
        Intrinsics.checkNotNullExpressionValue(geolocMarketList, "geolocMarketList");
        return new VendorList(iabGvl, arrayList2, linkedHashMap, arrayList4, arrayList6, 0, tcfPolicyVersion, publisherCc, publisherRestrictions, geolocAdList, geolocMarketList, googleProviders2, consentLifetime, removeLegintables, 32, (DefaultConstructorMarker) null);
    }

    public static final Models.Vendorlist toProtoModel(VendorList vendorList) {
        Intrinsics.checkNotNullParameter(vendorList, "<this>");
        Models.Vendorlist.Builder builderAddAllGeolocMarket = Models.Vendorlist.newBuilder().setIabGvl(vendorList.getGvlVersion()).setTcfPolicyVersion(vendorList.getTcfPolicyVersion()).setPublisherCc(vendorList.getPublisherCC()).setPublisherRestrictions(vendorList.getPublisherRestrictions()).addAllGeolocAd(vendorList.getGeolocAds()).addAllGeolocMarket(vendorList.getGeolocMarkets());
        String googleProvider = vendorList.getGoogleProvider();
        if (googleProvider == null) {
            googleProvider = BuildConfig.FLAVOR;
        }
        Models.Vendorlist.Builder consentLifetime = builderAddAllGeolocMarket.setGoogleProviders(googleProvider).setConsentLifetime(vendorList.getConsentLifetime());
        List consentables = vendorList.getConsentables();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(consentables, 10));
        Iterator it = consentables.iterator();
        while (it.hasNext()) {
            arrayList.add(toProtoModel((Consentable) it.next()));
        }
        Models.Vendorlist.Builder builderAddAllConsentables = consentLifetime.addAllConsentables(arrayList);
        List vendors = vendorList.getVendors();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(vendors, 10));
        Iterator it2 = vendors.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toProtoModel((Vendor) it2.next()));
        }
        Models.Vendorlist.Builder builderAddAllVendors = builderAddAllConsentables.addAllVendors(arrayList2);
        List stacks = vendorList.getStacks();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(stacks, 10));
        Iterator it3 = stacks.iterator();
        while (it3.hasNext()) {
            arrayList3.add(toProtoModel((Stack) it3.next()));
        }
        Models.Vendorlist.Builder removeLegintables = builderAddAllVendors.addAllStacks(arrayList3).setRemoveLegintables(vendorList.getRemoveLegintables());
        Map dataCategories = vendorList.getDataCategories();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(dataCategories.size()));
        for (Map.Entry entry : dataCategories.entrySet()) {
            linkedHashMap.put(entry.getKey(), toProto((DataCategoryCore) entry.getValue()));
        }
        return removeLegintables.putAllDataCategories(linkedHashMap).build();
    }

    public static final Consentable toCoreModel(Models.Vendorlist.Consentable consentable) {
        Intrinsics.checkNotNullParameter(consentable, "<this>");
        int id = consentable.getId();
        Integer numValueOf = consentable.getIabId() == 0 ? null : Integer.valueOf(consentable.getIabId());
        String extraId = consentable.getExtraId();
        Intrinsics.checkNotNullExpressionValue(extraId, "extraId");
        String extraId2 = extraId.length() == 0 ? null : consentable.getExtraId();
        Models.I18NString name = consentable.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        I18NString coreModel = HelloReplyExtsKt.toCoreModel(name);
        Models.I18NString description = consentable.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        I18NString coreModel2 = HelloReplyExtsKt.toCoreModel(description);
        Models.I18NString descriptionLegal = consentable.getDescriptionLegal();
        Intrinsics.checkNotNullExpressionValue(descriptionLegal, "descriptionLegal");
        I18NString coreModel3 = HelloReplyExtsKt.toCoreModel(descriptionLegal);
        Models.I18NString illustrations = consentable.getIllustrations();
        Intrinsics.checkNotNullExpressionValue(illustrations, "illustrations");
        return new Consentable(id, numValueOf, extraId2, coreModel, coreModel2, coreModel3, HelloReplyExtsKt.toCoreModel(illustrations), consentable.getTypeValue(), (ConsentStatus) null, (ConsentStatus) null, Integer.valueOf(consentable.getVendorsNumber()), 768, (DefaultConstructorMarker) null);
    }

    public static final Models.Vendorlist.Consentable toProtoModel(Consentable consentable) {
        Models.I18NString defaultInstance;
        Intrinsics.checkNotNullParameter(consentable, "<this>");
        Models.Vendorlist.Consentable.Builder id = Models.Vendorlist.Consentable.newBuilder().setId(consentable.getId());
        Integer iabId = consentable.getIabId();
        Models.Vendorlist.Consentable.Builder iabId2 = id.setIabId(iabId != null ? iabId.intValue() : 0);
        String extraId = consentable.getExtraId();
        if (extraId == null) {
            extraId = BuildConfig.FLAVOR;
        }
        Models.Vendorlist.Consentable.Builder descriptionLegal = iabId2.setExtraId(extraId).setName(HelloReplyExtsKt.toProtoModel(consentable.getName())).setDescription(HelloReplyExtsKt.toProtoModel(consentable.getDescription())).setDescriptionLegal(HelloReplyExtsKt.toProtoModel(consentable.getDescriptionLegal()));
        I18NString illustrations = consentable.getIllustrations();
        if (illustrations == null || (defaultInstance = HelloReplyExtsKt.toProtoModel(illustrations)) == null) {
            defaultInstance = Models.I18NString.getDefaultInstance();
        }
        Models.Vendorlist.Consentable.Builder typeValue = descriptionLegal.setIllustrations(defaultInstance).setTypeValue(consentable.getType());
        Integer vendorsNumber = consentable.getVendorsNumber();
        return typeValue.setVendorsNumber(vendorsNumber != null ? vendorsNumber.intValue() : 0).build();
    }

    public static final Vendor toCoreModel(Models.Vendorlist.Vendor vendor) {
        Intrinsics.checkNotNullParameter(vendor, "<this>");
        int id = vendor.getId();
        Integer numValueOf = vendor.getIabId() == 0 ? null : Integer.valueOf(vendor.getIabId());
        String extraId = vendor.getExtraId();
        Intrinsics.checkNotNullExpressionValue(extraId, "extraId");
        String extraId2 = extraId.length() == 0 ? null : vendor.getExtraId();
        String name = vendor.getName();
        String policyUrl = vendor.getPolicyUrl();
        Models.Vendorlist.Vendor.DataRetention dataRetention = vendor.getDataRetention();
        Intrinsics.checkNotNullExpressionValue(dataRetention, "dataRetention");
        DataRetention coreModel = HelloReplyExtsKt.toCoreModel(dataRetention);
        Map urlsMap = vendor.getUrlsMap();
        Intrinsics.checkNotNullExpressionValue(urlsMap, "urlsMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(urlsMap.size()));
        for (Map.Entry entry : urlsMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), new VendorUrl(((Models.Vendorlist.Vendor.VendorUrl) entry.getValue()).getPrivacy(), ((Models.Vendorlist.Vendor.VendorUrl) entry.getValue()).getLegintClaim()));
        }
        List consentablesList = vendor.getConsentablesList();
        List legintablesList = vendor.getLegintablesList();
        List flexiblesList = vendor.getFlexiblesList();
        long cookieMaxAgeSeconds = vendor.getCookieMaxAgeSeconds();
        boolean usesNonCookieAccess = vendor.getUsesNonCookieAccess();
        int googleAtpId = vendor.getGoogleAtpId();
        List dataDeclarationList = vendor.getDataDeclarationList();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        Intrinsics.checkNotNullExpressionValue(policyUrl, "policyUrl");
        Intrinsics.checkNotNullExpressionValue(consentablesList, "consentablesList");
        Intrinsics.checkNotNullExpressionValue(legintablesList, "legintablesList");
        Intrinsics.checkNotNullExpressionValue(flexiblesList, "flexiblesList");
        Long lValueOf = Long.valueOf(cookieMaxAgeSeconds);
        Boolean boolValueOf = Boolean.valueOf(usesNonCookieAccess);
        Integer numValueOf2 = Integer.valueOf(googleAtpId);
        Intrinsics.checkNotNullExpressionValue(dataDeclarationList, "dataDeclarationList");
        return new Vendor(id, numValueOf, extraId2, name, policyUrl, linkedHashMap, coreModel, consentablesList, legintablesList, flexiblesList, (ConsentStatus) null, (ConsentStatus) null, lValueOf, boolValueOf, numValueOf2, dataDeclarationList, 3072, (DefaultConstructorMarker) null);
    }

    public static final Models.Vendorlist.Vendor toProtoModel(Vendor vendor) {
        Intrinsics.checkNotNullParameter(vendor, "<this>");
        Models.Vendorlist.Vendor.Builder id = Models.Vendorlist.Vendor.newBuilder().setId(vendor.getId());
        Integer iabId = vendor.getIabId();
        Models.Vendorlist.Vendor.Builder iabId2 = id.setIabId(iabId != null ? iabId.intValue() : 0);
        String extraId = vendor.getExtraId();
        if (extraId == null) {
            extraId = BuildConfig.FLAVOR;
        }
        Models.Vendorlist.Vendor.Builder builderAddAllDataCategories = iabId2.setExtraId(extraId).setName(vendor.getName()).setPolicyUrl(vendor.getPolicyUrl()).setDataRetention(toProtoModel(vendor.getDataRetention())).addAllDataCategories(CollectionsKt.emptyList());
        Map urls = vendor.getUrls();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(urls.size()));
        for (Map.Entry entry : urls.entrySet()) {
            Object key = entry.getKey();
            Models.Vendorlist.Vendor.VendorUrl.Builder builderNewBuilder = Models.Vendorlist.Vendor.VendorUrl.newBuilder();
            String privacy = ((VendorUrl) entry.getValue()).getPrivacy();
            if (privacy == null) {
                privacy = BuildConfig.FLAVOR;
            }
            Models.Vendorlist.Vendor.VendorUrl.Builder privacy2 = builderNewBuilder.setPrivacy(privacy);
            String legintClaim = ((VendorUrl) entry.getValue()).getLegintClaim();
            if (legintClaim == null) {
                legintClaim = BuildConfig.FLAVOR;
            }
            linkedHashMap.put(key, privacy2.setLegintClaim(legintClaim).build());
        }
        Models.Vendorlist.Vendor.Builder builderAddAllDataDeclaration = builderAddAllDataCategories.putAllUrls(linkedHashMap).addAllConsentables(vendor.getConsentables()).addAllLegintables(vendor.getLegintables()).addAllFlexibles(vendor.getFlexibles()).addAllDataDeclaration(vendor.getDataDeclaration());
        Boolean usesNonCookieAccess = vendor.getUsesNonCookieAccess();
        Models.Vendorlist.Vendor.Builder usesNonCookieAccess2 = builderAddAllDataDeclaration.setUsesNonCookieAccess(usesNonCookieAccess != null ? usesNonCookieAccess.booleanValue() : false);
        Long cookieMaxAgeSeconds = vendor.getCookieMaxAgeSeconds();
        Models.Vendorlist.Vendor.Builder cookieMaxAgeSeconds2 = usesNonCookieAccess2.setCookieMaxAgeSeconds(cookieMaxAgeSeconds != null ? cookieMaxAgeSeconds.longValue() : 0L);
        Integer googleAtpId = vendor.getGoogleAtpId();
        return cookieMaxAgeSeconds2.setGoogleAtpId(googleAtpId != null ? googleAtpId.intValue() : 0).build();
    }

    public static final Models.Vendorlist.DataCategory toProtoModel(DataCategoryProtoMapper dataCategoryProtoMapper) {
        Intrinsics.checkNotNullParameter(dataCategoryProtoMapper, "<this>");
        return Models.Vendorlist.DataCategory.newBuilder().setId(dataCategoryProtoMapper.getId()).setName(HelloReplyExtsKt.toProtoModel(dataCategoryProtoMapper.getName())).build();
    }

    public static final DataCategoryProtoMapper toCoreModel(Models.Vendorlist.DataCategory dataCategory) {
        Intrinsics.checkNotNullParameter(dataCategory, "<this>");
        int id = dataCategory.getId();
        Models.I18NString name = dataCategory.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return new DataCategoryProtoMapper(id, HelloReplyExtsKt.toCoreModel(name));
    }

    public static final DataCategoryCore toCore(Models.Vendorlist.DataCategory dataCategory) {
        Intrinsics.checkNotNullParameter(dataCategory, "<this>");
        int id = dataCategory.getId();
        Models.I18NString name = dataCategory.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return new DataCategoryCore(id, HelloReplyExtsKt.toCoreModel(name));
    }

    public static final Models.Vendorlist.DataCategory toProto(DataCategoryCore dataCategoryCore) {
        Intrinsics.checkNotNullParameter(dataCategoryCore, "<this>");
        return Models.Vendorlist.DataCategory.newBuilder().setId(dataCategoryCore.getId()).setName(HelloReplyExtsKt.toProtoModel(dataCategoryCore.getName())).build();
    }

    public static final Stack toCoreModel(Models.Vendorlist.Stack stack) {
        Intrinsics.checkNotNullParameter(stack, "<this>");
        int id = stack.getId();
        Integer numValueOf = stack.getIabId() == 0 ? null : Integer.valueOf(stack.getIabId());
        Models.I18NString name = stack.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        I18NString coreModel = HelloReplyExtsKt.toCoreModel(name);
        Models.I18NString description = stack.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        I18NString coreModel2 = HelloReplyExtsKt.toCoreModel(description);
        List consentablesList = stack.getConsentablesList();
        Intrinsics.checkNotNullExpressionValue(consentablesList, "consentablesList");
        return new Stack(id, numValueOf, coreModel, coreModel2, consentablesList, (ConsentStatus) null, (ConsentStatus) null, Integer.valueOf(stack.getVendorsNumber()), 96, (DefaultConstructorMarker) null);
    }

    public static final FloatingConsent toCoreModel(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
        ConsentStatus consentStatus;
        Intrinsics.checkNotNullParameter(consentFloatingExtraPurpose, "<this>");
        String extraId = consentFloatingExtraPurpose.getExtraId();
        Map externalIdsMap = consentFloatingExtraPurpose.getExternalIdsMap();
        Integer numValueOf = Integer.valueOf(consentFloatingExtraPurpose.getVersion());
        String uuid = consentFloatingExtraPurpose.getUuid();
        TimestampSurrogate timestampSurrogate = new TimestampSurrogate(consentFloatingExtraPurpose.getGivenAt().getNanos(), consentFloatingExtraPurpose.getGivenAt().getSeconds());
        Models.ConsentFloatingExtraPurposeType type = consentFloatingExtraPurpose.getType();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            consentStatus = ConsentStatus.ALLOWED;
        } else if (i == 2) {
            consentStatus = ConsentStatus.DISALLOWED;
        } else {
            consentStatus = ConsentStatus.UNDEFINED;
        }
        return new FloatingConsent(extraId, externalIdsMap, numValueOf, uuid, timestampSurrogate, consentStatus);
    }

    public static final Models.ConsentFloatingExtraPurpose toProtoModel(FloatingConsent floatingConsent) {
        Models.ConsentFloatingExtraPurposeType consentFloatingExtraPurposeType;
        Timestamp defaultInstance;
        Intrinsics.checkNotNullParameter(floatingConsent, "<this>");
        Models.ConsentFloatingExtraPurpose.Builder builderNewBuilder = Models.ConsentFloatingExtraPurpose.newBuilder();
        String uuid = floatingConsent.getUuid();
        String str = BuildConfig.FLAVOR;
        if (uuid == null) {
            uuid = BuildConfig.FLAVOR;
        }
        Models.ConsentFloatingExtraPurpose.Builder uuid2 = builderNewBuilder.setUuid(uuid);
        String id = floatingConsent.getId();
        if (id != null) {
            str = id;
        }
        Models.ConsentFloatingExtraPurpose.Builder extraId = uuid2.setExtraId(str);
        Integer version = floatingConsent.getVersion();
        Models.ConsentFloatingExtraPurpose.Builder version2 = extraId.setVersion(version != null ? version.intValue() : 0);
        Map externalIds = floatingConsent.getExternalIds();
        if (externalIds == null) {
            externalIds = MapsKt.emptyMap();
        }
        Models.ConsentFloatingExtraPurpose.Builder builderPutAllExternalIds = version2.putAllExternalIds(externalIds);
        ConsentStatus status = floatingConsent.getStatus();
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i == 1) {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_ACCEPT;
        } else if (i == 2) {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_DENY;
        } else {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_UNKNOWN;
        }
        Models.ConsentFloatingExtraPurpose.Builder type = builderPutAllExternalIds.setType(consentFloatingExtraPurposeType);
        if (floatingConsent.getGivenAt() != null) {
            defaultInstance = (Timestamp) Timestamp.newBuilder().setSeconds(floatingConsent.getGivenAt().getSeconds()).setNanos(floatingConsent.getGivenAt().getNanos()).build();
        } else {
            defaultInstance = Timestamp.getDefaultInstance();
        }
        return type.setGivenAt(defaultInstance).build();
    }

    public static final Models.Vendorlist.Stack toProtoModel(Stack stack) {
        Intrinsics.checkNotNullParameter(stack, "<this>");
        Models.Vendorlist.Stack.Builder id = Models.Vendorlist.Stack.newBuilder().setId(stack.getId());
        Integer iabId = stack.getIabId();
        Models.Vendorlist.Stack.Builder builderAddAllConsentables = id.setIabId(iabId != null ? iabId.intValue() : 0).setName(HelloReplyExtsKt.toProtoModel(stack.getName())).setDescription(HelloReplyExtsKt.toProtoModel(stack.getDescription())).addAllConsentables(stack.getConsentables());
        Integer vendorsNumber = stack.getVendorsNumber();
        return builderAddAllConsentables.setVendorsNumber(vendorsNumber != null ? vendorsNumber.intValue() : 0).build();
    }

    public static final Models.Vendorlist.Vendor.DataRetention toProtoModel(DataRetention dataRetention) {
        Intrinsics.checkNotNullParameter(dataRetention, "<this>");
        return Models.Vendorlist.Vendor.DataRetention.newBuilder().setStdRetention(dataRetention.getStdRetention()).putAllPurposes(dataRetention.getPurposes()).putAllSpecialPurposes(dataRetention.getSpecialPurposes()).build();
    }
}
