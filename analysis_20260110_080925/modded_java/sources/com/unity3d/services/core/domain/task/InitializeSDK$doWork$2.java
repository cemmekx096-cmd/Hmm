package com.unity3d.services.core.domain.task;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeSDK.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configuration", "configResult", "$this$withContext", "configuration", "configResult", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02e1 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0332 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0363 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0212 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0251 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0271 A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027f A[Catch: all -> 0x037a, CancellationException -> 0x03a7, TryCatch #2 {CancellationException -> 0x03a7, all -> 0x037a, blocks: (B:6:0x0013, B:128:0x0364, B:9:0x0024, B:125:0x0345, B:12:0x002f, B:120:0x032c, B:122:0x0332, B:15:0x0042, B:113:0x02f6, B:116:0x0307, B:18:0x004d, B:108:0x02db, B:110:0x02e1, B:22:0x005d, B:94:0x026b, B:96:0x0271, B:97:0x027e, B:25:0x0075, B:88:0x024b, B:90:0x0251, B:98:0x027f, B:100:0x028a, B:102:0x0294, B:104:0x029a, B:105:0x02b7, B:114:0x0301, B:129:0x036e, B:130:0x0379, B:28:0x008e, B:85:0x0228, B:31:0x009f, B:80:0x020c, B:82:0x0212, B:34:0x00b0, B:73:0x01dd, B:75:0x01e3, B:76:0x01f0, B:37:0x00c6, B:67:0x01c0, B:69:0x01c6, B:77:0x01f1, B:40:0x00d9, B:58:0x0176, B:60:0x017c, B:61:0x0196, B:64:0x01a2, B:44:0x00ee, B:54:0x0156, B:55:0x0158, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
