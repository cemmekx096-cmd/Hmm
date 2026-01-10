package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat$;
import androidx.core.util.Predicate;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    public static Predicate<Uri> asPredicate(UriMatcher uriMatcher) {
        return new UriMatcherCompat$.ExternalSyntheticLambda0(uriMatcher);
    }

    static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
