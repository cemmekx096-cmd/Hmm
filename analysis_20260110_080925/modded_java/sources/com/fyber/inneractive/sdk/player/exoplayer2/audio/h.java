package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class h implements Runnable {
    public final /* synthetic */ DecoderCounters a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.ensureUpdated();
        AudioRendererEventListener.EventDispatcher.access$000(this.b).onAudioDisabled(this.a);
    }
}
