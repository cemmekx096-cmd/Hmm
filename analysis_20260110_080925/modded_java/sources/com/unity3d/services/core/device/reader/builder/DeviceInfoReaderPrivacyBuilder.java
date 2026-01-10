package com.unity3d.services.core.device.reader.builder;

import com.inmobi.sdk.InMobiSdk;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithBehavioralFlag;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class DeviceInfoReaderPrivacyBuilder extends DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    public IDeviceInfoReader build() {
        IJsonStorageReader storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        IJsonStorageReader storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        IJsonStorageReader storage3 = StorageManager.getStorage(StorageManager.StorageType.MEMORY);
        return new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithBehavioralFlag(buildWithRequestType(InitRequestType.PRIVACY), new NonBehavioralFlagReader(new JsonStorageAggregator(Arrays.asList(storage2, storage, storage3)))), getMediationInfoRules(), new IJsonStorageReader[]{storage3}), getPrivacyRequestStorageRules(), new IJsonStorageReader[]{storage, storage2}), new DeviceInfoReaderFilterProvider(storage).getFilterList());
    }

    private JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList("privacy", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "unity", "pipl"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "mode"));
    }
}
