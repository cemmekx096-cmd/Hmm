package androidx.media3.exoplayer.upstream.experimental;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface BandwidthStatistic {
    void addSample(long j, long j2);

    long getBandwidthEstimate();

    void reset();
}
