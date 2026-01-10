package io.ktor.utils.io.core;

import com.crashlytics.android.BuildConfig;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutputArraysJVM.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"writeFully", BuildConfig.FLAVOR, "Lio/ktor/utils/io/core/Output;", "bb", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class OutputArraysJVMKt {
    public static final void writeFully(Output output, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteBuffer, "bb");
        int iLimit = byteBuffer.limit();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, (ChunkBuffer) null);
        while (true) {
            try {
                Buffer buffer = (Buffer) chunkBufferPrepareWriteHead;
                byteBuffer.limit(byteBuffer.position() + Math.min(byteBuffer.remaining(), buffer.getLimit() - buffer.getWritePosition()));
                BufferPrimitivesJvmKt.writeFully(buffer, byteBuffer);
                byteBuffer.limit(iLimit);
                if (!byteBuffer.hasRemaining()) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }
}
