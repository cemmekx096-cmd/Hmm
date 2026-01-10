package io.ktor.utils.io;

import com.crashlytics.android.BuildConfig;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: Delimited.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lio/ktor/utils/io/LookAheadSuspendSession;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1", f = "Delimited.kt", i = {0, 0, 1, 1}, l = {79, 89}, m = "invokeSuspend", n = {"$this$lookAheadSuspend", "copied", "$this$lookAheadSuspend", "copied"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class DelimitedKt$readUntilDelimiterSuspend$copied$1 extends SuspendLambda implements Function2<LookAheadSuspendSession, Continuation<? super Integer>, Object> {
    final /* synthetic */ int $copied0;
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ ByteBuffer $dst;
    final /* synthetic */ Ref.BooleanRef $endFound;
    final /* synthetic */ ByteReadChannel $this_readUntilDelimiterSuspend;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DelimitedKt$readUntilDelimiterSuspend$copied$1(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Ref.BooleanRef booleanRef, ByteReadChannel byteReadChannel, Continuation<? super DelimitedKt$readUntilDelimiterSuspend$copied$1> continuation) {
        super(2, continuation);
        this.$copied0 = i;
        this.$delimiter = byteBuffer;
        this.$dst = byteBuffer2;
        this.$endFound = booleanRef;
        this.$this_readUntilDelimiterSuspend = byteReadChannel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(this.$copied0, this.$delimiter, this.$dst, this.$endFound, this.$this_readUntilDelimiterSuspend, continuation);
        delimitedKt$readUntilDelimiterSuspend$copied$1.L$0 = obj;
        return delimitedKt$readUntilDelimiterSuspend$copied$1;
    }

    public final Object invoke(LookAheadSuspendSession lookAheadSuspendSession, Continuation<? super Integer> continuation) {
        return create(lookAheadSuspendSession, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r4.$endFound.element == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:26:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$0
            io.ktor.utils.io.LookAheadSuspendSession r4 = (io.ktor.utils.io.LookAheadSuspendSession) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L89
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            int r1 = r9.I$0
            java.lang.Object r4 = r9.L$0
            io.ktor.utils.io.LookAheadSuspendSession r4 = (io.ktor.utils.io.LookAheadSuspendSession) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L4a
        L2d:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            io.ktor.utils.io.LookAheadSuspendSession r10 = (io.ktor.utils.io.LookAheadSuspendSession) r10
            int r1 = r9.$copied0
            r4 = r9
        L37:
            r5 = r4
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r4.L$0 = r10
            r4.I$0 = r1
            r4.label = r3
            java.lang.Object r5 = r10.awaitAtLeast(r3, r5)
            if (r5 != r0) goto L47
            return r0
        L47:
            r8 = r4
            r4 = r10
            r10 = r8
        L4a:
            r5 = r4
            io.ktor.utils.io.LookAheadSession r5 = (io.ktor.utils.io.LookAheadSession) r5
            java.nio.ByteBuffer r6 = r10.$delimiter
            java.nio.ByteBuffer r7 = r10.$dst
            int r6 = io.ktor.utils.io.DelimitedKt.access$tryCopyUntilDelimiter(r5, r6, r7)
            if (r6 != 0) goto L8d
            java.nio.ByteBuffer r6 = r10.$delimiter
            int r5 = io.ktor.utils.io.DelimitedKt.access$startsWithDelimiter(r5, r6)
            java.nio.ByteBuffer r6 = r10.$delimiter
            int r6 = r6.remaining()
            if (r5 != r6) goto L6a
            kotlin.jvm.internal.Ref$BooleanRef r10 = r10.$endFound
            r10.element = r3
            goto La4
        L6a:
            io.ktor.utils.io.ByteReadChannel r5 = r10.$this_readUntilDelimiterSuspend
            boolean r5 = r5.isClosedForWrite()
            if (r5 == 0) goto L73
            goto La4
        L73:
            java.nio.ByteBuffer r5 = r10.$delimiter
            int r5 = r5.remaining()
            r6 = r10
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r10.L$0 = r4
            r10.I$0 = r1
            r10.label = r2
            java.lang.Object r5 = r4.awaitAtLeast(r5, r6)
            if (r5 != r0) goto L89
            return r0
        L89:
            r8 = r4
            r4 = r10
            r10 = r8
            goto L96
        L8d:
            if (r6 > 0) goto L94
            kotlin.jvm.internal.Ref$BooleanRef r5 = r10.$endFound
            r5.element = r3
            int r6 = -r6
        L94:
            int r1 = r1 + r6
            goto L89
        L96:
            java.nio.ByteBuffer r5 = r4.$dst
            boolean r5 = r5.hasRemaining()
            if (r5 == 0) goto La4
            kotlin.jvm.internal.Ref$BooleanRef r5 = r4.$endFound
            boolean r5 = r5.element
            if (r5 == 0) goto L37
        La4:
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
