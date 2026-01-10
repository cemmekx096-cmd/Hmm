package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class k {
    public AudioTrack a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public void a(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.b = z;
        this.g = -9223372036854775807L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        if (audioTrack != null) {
            this.c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() throws IllegalStateException {
        if (this.g != -9223372036854775807L) {
            return;
        }
        this.a.pause();
    }

    public boolean e() {
        return false;
    }

    public final void a(long j) throws IllegalStateException {
        this.h = a();
        this.g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.a.stop();
    }

    public final long a() {
        if (this.g != -9223372036854775807L) {
            return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * this.c) / 1000000));
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.a.getPlaybackHeadPosition() & 4294967295L;
        if (this.b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f = this.d;
            }
            playbackHeadPosition += this.f;
        }
        if (this.d > playbackHeadPosition) {
            this.e++;
        }
        this.d = playbackHeadPosition;
        return playbackHeadPosition + (this.e << 32);
    }
}
