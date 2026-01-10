package io.ktor.util;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.adqualitysdk.sdk.R;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EncodersJvm.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0082\u0004\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0002\u001a-\u0010\u0010\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZIP_HEADER_SIZE", BuildConfig.FLAVOR, "GZip", "getGZip", "has", BuildConfig.FLAVOR, "flag", "inflate", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", Constants.ScionAnalytics.PARAM_SOURCE, HttpRequest.ENCODING_GZIP, "inflateTo", "Ljava/util/zip/Inflater;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "buffer", "Ljava/nio/ByteBuffer;", "checksum", "Ljava/util/zip/Checksum;", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final Encoder Deflate = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        public ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(byteReadChannel, Constants.ScionAnalytics.PARAM_SOURCE);
            return DeflaterKt.deflated$default(byteReadChannel, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }

        public ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(byteReadChannel, Constants.ScionAnalytics.PARAM_SOURCE);
            return EncodersJvmKt.inflate(coroutineScope, byteReadChannel, false);
        }
    };
    private static final Encoder GZip = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        public ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(byteReadChannel, Constants.ScionAnalytics.PARAM_SOURCE);
            return DeflaterKt.deflated$default(byteReadChannel, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }

        public ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(byteReadChannel, Constants.ScionAnalytics.PARAM_SOURCE);
            return EncodersJvmKt.inflate$default(coroutineScope, byteReadChannel, false, 2, null);
        }
    };

    /* compiled from: EncodersJvm.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {157}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflateTo$1, reason: invalid class name and case insensitive filesystem */
    static final class C01141 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C01141(Continuation<? super C01141> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return EncodersJvmKt.inflateTo(null, null, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final Encoder getDeflate() {
        return Deflate;
    }

    public static final Encoder getGZip() {
        return GZip;
    }

    static /* synthetic */ ByteReadChannel inflate$default(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return inflate(coroutineScope, byteReadChannel, z);
    }

    /* compiled from: EncodersJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {68, 85, 161, 164, 103, 109, R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "extraLen", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "n$iv", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflate$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ByteReadChannel $source;
        byte B$0;
        byte B$1;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        short S$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, ByteReadChannel byteReadChannel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$gzip = z;
            this.$source = byteReadChannel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> anonymousClass1 = new AnonymousClass1(this.$gzip, this.$source, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
            return create(writerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0381 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x03c4 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02db A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0301 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0319 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x036a A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:7:0x0037, B:106:0x03ab, B:100:0x037b, B:102:0x0381, B:107:0x03c4, B:109:0x03c8, B:114:0x03d5, B:119:0x03f8, B:125:0x0402, B:126:0x042a, B:127:0x042b, B:128:0x0436, B:129:0x0437, B:130:0x045d, B:131:0x045e, B:136:0x047a, B:137:0x0485, B:10:0x005d, B:95:0x034b, B:87:0x0313, B:89:0x0319, B:91:0x031f, B:96:0x0365, B:79:0x02d3, B:81:0x02db, B:84:0x02f9, B:86:0x0301, B:97:0x036a, B:99:0x0372, B:138:0x0486, B:13:0x0080), top: B:147:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x03a7 -> B:106:0x03ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02ff -> B:79:0x02d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0301 -> B:87:0x0313). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0345 -> B:95:0x034b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 1202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel inflate(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z) {
        return CoroutinesKt.writer$default(coroutineScope, (CoroutineContext) null, false, new AnonymousClass1(z, byteReadChannel, null), 3, (Object) null).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object inflateTo(java.util.zip.Inflater r5, io.ktor.utils.io.ByteWriteChannel r6, java.nio.ByteBuffer r7, java.util.zip.Checksum r8, kotlin.coroutines.Continuation<? super java.lang.Integer> r9) throws java.util.zip.DataFormatException {
        /*
            boolean r0 = r9 instanceof io.ktor.util.EncodersJvmKt.C01141
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = (io.ktor.util.EncodersJvmKt.C01141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = new io.ktor.util.EncodersJvmKt$inflateTo$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r5 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            r7.clear()
            byte[] r9 = r7.array()
            int r2 = r7.position()
            int r4 = r7.remaining()
            int r5 = r5.inflate(r9, r2, r4)
            int r9 = r7.position()
            int r9 = r9 + r5
            r7.position(r9)
            r7.flip()
            io.ktor.util.DeflaterKt.updateKeepPosition(r8, r7)
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.writeFully(r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.inflateTo(java.util.zip.Inflater, io.ktor.utils.io.ByteWriteChannel, java.nio.ByteBuffer, java.util.zip.Checksum, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
