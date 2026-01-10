package androidx.core.net;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String str) {
        super(str);
        this.response = str;
    }
}
