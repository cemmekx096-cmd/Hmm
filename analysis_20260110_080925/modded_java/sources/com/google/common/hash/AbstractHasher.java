package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
abstract class AbstractHasher implements Hasher {
    AbstractHasher() {
    }

    /* renamed from: putBoolean, reason: merged with bridge method [inline-methods] */
    public final Hasher m204putBoolean(boolean z) {
        return putByte(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: putDouble, reason: merged with bridge method [inline-methods] */
    public final Hasher m209putDouble(double d) {
        return m212putLong(Double.doubleToRawLongBits(d));
    }

    /* renamed from: putFloat, reason: merged with bridge method [inline-methods] */
    public final Hasher m210putFloat(float f) {
        return m211putInt(Float.floatToRawIntBits(f));
    }

    /* renamed from: putUnencodedChars, reason: merged with bridge method [inline-methods] */
    public Hasher m215putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            m208putChar(charSequence.charAt(i));
        }
        return this;
    }

    /* renamed from: putString, reason: merged with bridge method [inline-methods] */
    public Hasher m214putString(CharSequence charSequence, Charset charset) {
        return m206putBytes(charSequence.toString().getBytes(charset));
    }

    /* renamed from: putBytes, reason: merged with bridge method [inline-methods] */
    public Hasher m206putBytes(byte[] bArr) {
        return m207putBytes(bArr, 0, bArr.length);
    }

    /* renamed from: putBytes, reason: merged with bridge method [inline-methods] */
    public Hasher m207putBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            putByte(bArr[i + i3]);
        }
        return this;
    }

    /* renamed from: putBytes, reason: merged with bridge method [inline-methods] */
    public Hasher m205putBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            m207putBytes(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                putByte(byteBuffer.get());
            }
        }
        return this;
    }

    /* renamed from: putShort, reason: merged with bridge method [inline-methods] */
    public Hasher m213putShort(short s) {
        putByte((byte) s);
        putByte((byte) (s >>> 8));
        return this;
    }

    /* renamed from: putInt, reason: merged with bridge method [inline-methods] */
    public Hasher m211putInt(int i) {
        putByte((byte) i);
        putByte((byte) (i >>> 8));
        putByte((byte) (i >>> 16));
        putByte((byte) (i >>> 24));
        return this;
    }

    /* renamed from: putLong, reason: merged with bridge method [inline-methods] */
    public Hasher m212putLong(long j) {
        for (int i = 0; i < 64; i += 8) {
            putByte((byte) (j >>> i));
        }
        return this;
    }

    /* renamed from: putChar, reason: merged with bridge method [inline-methods] */
    public Hasher m208putChar(char c) {
        putByte((byte) c);
        putByte((byte) (c >>> '\b'));
        return this;
    }

    public <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }
}
