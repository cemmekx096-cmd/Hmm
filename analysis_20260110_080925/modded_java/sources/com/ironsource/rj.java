package com.ironsource;

import com.applovin.mediation.adapter.MaxAdapterError;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/rj;", "Lcom/ironsource/pm;", BuildConfig.FLAVOR, "a", "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface rj extends pm<Integer, Integer> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/rj$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "I", "INSTANCE_SHOW", "c", "INSTANCE_SHOW_FAILED", "d", "INSTANCE_OPENED", "e", "INSTANCE_VISIBLE", "f", "INSTANCE_CLICKED", "g", "INSTANCE_CLOSED", "h", "INSTANCE_NOT_FOUND_IN_SHOW", "i", "INSTANCE_READY_TRUE", "j", "INSTANCE_READY_FALSE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public static final a a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW = 2201;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW_FAILED = 2203;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_OPENED = 2005;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_VISIBLE = 2210;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_CLICKED = 2006;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_CLOSED = 2204;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_SHOW = 2507;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_READY_TRUE = 2211;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_READY_FALSE = 2212;

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ironsource/rj$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_LOAD_FAILED", "e", "INSTANCE_NOT_FOUND_IN_LOAD", "f", "INSTANCE_LOAD_EXTRA_PARAMS", "g", "INSTANCE_AUCTION_FAILED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {
        public static final b a = new b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 2002;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 2003;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 2200;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_LOAD = 2503;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_EXTRA_PARAMS = 2504;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_FAILED = 2300;

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/ironsource/rj$c;", "Lcom/ironsource/rj;", BuildConfig.FLAVOR, "input", "a", "(I)Ljava/lang/Integer;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements rj {
        public Integer a(int input) throws IllegalArgumentException {
            int i;
            if (input == 206) {
                i = b.INSTANCE_NOT_FOUND_IN_LOAD;
            } else if (input == 207) {
                i = b.INSTANCE_LOAD_EXTRA_PARAMS;
            } else if (input == 401) {
                i = a.INSTANCE_SHOW;
            } else if (input == 410) {
                i = a.INSTANCE_READY_TRUE;
            } else if (input != 411) {
                switch (input) {
                    case 101:
                        i = d.INSTANCE_AUCTION_REQUEST;
                        break;
                    case 102:
                        i = d.INSTANCE_AUCTION_REQUEST_WATERFALL;
                        break;
                    case 103:
                        i = d.INSTANCE_AUCTION_RESPONSE_SUCCESS;
                        break;
                    case 104:
                        i = d.INSTANCE_AUCTION_FAILED;
                        break;
                    case 105:
                        i = d.INSTANCE_LOAD_WITH_ADM;
                        break;
                    default:
                        switch (input) {
                            case 109:
                                i = d.INSTANCE_SUCCESSFUL_RECOVERY_ERROR;
                                break;
                            case 110:
                                i = d.INSTANCE_LOAD_FAILED_INIT_IN_PROGRESS;
                                break;
                            case 111:
                                i = d.INSTANCE_AUCTION_RESPONSE_WATERFALL;
                                break;
                            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                i = d.INSTANCE_DESTROYED;
                                break;
                            default:
                                switch (input) {
                                    case 201:
                                        i = b.INSTANCE_LOAD;
                                        break;
                                    case 202:
                                        i = b.INSTANCE_LOAD_SUCCESS;
                                        break;
                                    case 203:
                                        i = b.INSTANCE_LOAD_FAILED;
                                        break;
                                    case MaxAdapterError.ERROR_CODE_NO_FILL /* 204 */:
                                        i = b.INSTANCE_AUCTION_FAILED;
                                        break;
                                    default:
                                        switch (input) {
                                            case 403:
                                                i = a.INSTANCE_SHOW_FAILED;
                                                break;
                                            case 404:
                                                i = a.INSTANCE_OPENED;
                                                break;
                                            case 405:
                                                i = a.INSTANCE_VISIBLE;
                                                break;
                                            case 406:
                                                i = a.INSTANCE_CLICKED;
                                                break;
                                            case 407:
                                                i = a.INSTANCE_CLOSED;
                                                break;
                                            case 408:
                                                i = a.INSTANCE_NOT_FOUND_IN_SHOW;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + input);
                                        }
                                }
                        }
                }
            } else {
                i = a.INSTANCE_READY_FALSE;
            }
            return Integer.valueOf(i);
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/rj$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "I", "INSTANCE_AUCTION_REQUEST", "c", "INSTANCE_AUCTION_REQUEST_WATERFALL", "d", "INSTANCE_AUCTION_FAILED", "e", "INSTANCE_LOAD_WITH_ADM", "f", "INSTANCE_LOAD_FAILED_INIT_IN_PROGRESS", "g", "INSTANCE_SUCCESSFUL_RECOVERY_ERROR", "h", "INSTANCE_AUCTION_RESPONSE_SUCCESS", "i", "INSTANCE_AUCTION_RESPONSE_WATERFALL", "j", "INSTANCE_DESTROYED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d {
        public static final d a = new d();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST = 82500;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST_WATERFALL = 82510;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_FAILED = 82300;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_WITH_ADM = 82002;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED_INIT_IN_PROGRESS = 83004;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_SUCCESSFUL_RECOVERY_ERROR = 88002;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_SUCCESS = 82301;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_WATERFALL = 82302;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_DESTROYED = 82076;

        private d() {
        }
    }
}
