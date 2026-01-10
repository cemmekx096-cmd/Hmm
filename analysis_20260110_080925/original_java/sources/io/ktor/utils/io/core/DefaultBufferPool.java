package io.ktor.utils.io.core;

import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import io.ktor.utils.io.bits.Allocator;
import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.DefaultPool;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BufferFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/core/DefaultBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "bufferSize", BuildConfig.FLAVOR, "capacity", "allocator", "Lio/ktor/utils/io/bits/Allocator;", "(IILio/ktor/utils/io/bits/Allocator;)V", "clearInstance", "instance", "disposeInstance", BuildConfig.FLAVOR, "produceInstance", "validateInstance", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class DefaultBufferPool extends DefaultPool<ChunkBuffer> {
    private final Allocator allocator;
    private final int bufferSize;

    public DefaultBufferPool() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ DefaultBufferPool(int i, int i2, Allocator allocator, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4096 : i, (i3 & 2) != 0 ? VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD : i2, (i3 & 4) != 0 ? (Allocator) DefaultAllocator.INSTANCE : allocator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultBufferPool(int i, int i2, Allocator allocator) {
        super(i2);
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.bufferSize = i;
        this.allocator = allocator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: produceInstance, reason: merged with bridge method [inline-methods] */
    public ChunkBuffer m1329produceInstance() {
        return new ChunkBuffer(this.allocator.alloc-gFv-Zug(this.bufferSize), (ChunkBuffer) null, (ObjectPool) this, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void disposeInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.allocator.free-3GNKZMM(instance.getMemory-SK3TCg8());
        super.disposeInstance(instance);
        instance.unlink$ktor_io();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void validateInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.validateInstance(instance);
        if (!(((long) instance.getMemory-SK3TCg8().limit()) == ((long) this.bufferSize))) {
            throw new IllegalStateException(("Buffer size mismatch. Expected: " + this.bufferSize + ", actual: " + instance.getMemory-SK3TCg8().limit()).toString());
        }
        if (!(instance != ChunkBuffer.Companion.getEmpty())) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        if (!(instance != Buffer.Companion.getEmpty())) {
            throw new IllegalStateException("Empty instance couldn't be recycled".toString());
        }
        if (!(instance.getReferenceCount() == 0)) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
        }
        if (!(instance.getNext() == null)) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
        }
        if (!(instance.getOrigin() == null)) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ChunkBuffer clearInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ChunkBuffer chunkBuffer = (ChunkBuffer) super.clearInstance(instance);
        chunkBuffer.unpark$ktor_io();
        chunkBuffer.reset();
        return chunkBuffer;
    }
}
