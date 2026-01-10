package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ DecoderCounters a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public d(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener.EventDispatcher.access$000(this.b).onAudioEnabled(this.a);
    }
}
