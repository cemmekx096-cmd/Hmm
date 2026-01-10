package com.devtodev.analytics.internal.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.LevelResourceEntry;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SQLiteChecker.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/devtodev/analytics/internal/storage/SQLiteChecker;", "Lcom/devtodev/analytics/internal/storage/ISQLiteChecker;", "database", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "checkRows", BuildConfig.FLAVOR, "tableName", BuildConfig.FLAVOR, "deleteBrokenRow", "id", "findBrokenRow", "ids", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class SQLiteChecker implements ISQLiteChecker {
    private final SQLiteDatabase database;

    public SQLiteChecker(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "database");
        this.database = sQLiteDatabase;
    }

    private final void deleteBrokenRow(String id, String tableName) {
        try {
            this.database.delete(tableName, "_id = " + id, null);
        } catch (RuntimeException e) {
            Logger.INSTANCE.error("[Database Module] deleteBrokenRow err:", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[PHI: r5
      0x005a: PHI (r5v6 android.database.Cursor) = (r5v1 android.database.Cursor), (r5v7 android.database.Cursor) binds: [B:25:0x0058, B:23:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void findBrokenRow(java.util.List<java.lang.String> r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "events"
            int r1 = r12.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
        La:
            if (r4 >= r1) goto L7a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r0)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            java.lang.String r7 = "reports"
            if (r6 == 0) goto L17
            java.lang.String r6 = "SELECT eventJson FROM events WHERE _id = ?"
            goto L1f
        L17:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r7)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            if (r6 == 0) goto L58
            java.lang.String r6 = "SELECT packagesJson FROM reports WHERE _id = ?"
        L1f:
            android.database.sqlite.SQLiteDatabase r8 = r11.database     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            java.lang.Object r10 = r12.get(r4)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            r9[r2] = r10     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            android.database.Cursor r5 = r8.rawQuery(r6, r9)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            if (r5 == 0) goto L55
        L32:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            if (r6 == 0) goto L55
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r0)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            if (r6 == 0) goto L45
            java.lang.String r6 = "eventJson"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            goto L51
        L45:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r7)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            if (r6 == 0) goto L32
            java.lang.String r6 = "packagesJson"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
        L51:
            r5.getString(r6)     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L61
            goto L32
        L55:
            if (r5 == 0) goto L70
            goto L5a
        L58:
            if (r5 == 0) goto L70
        L5a:
            r5.close()
            goto L70
        L5e:
            r12 = move-exception
            r3 = r5
            goto L74
        L61:
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.lang.Throwable -> L5e
        L66:
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L73
            r11.deleteBrokenRow(r5, r13)     // Catch: java.lang.Throwable -> L73
            r5 = r3
        L70:
            int r4 = r4 + 1
            goto La
        L73:
            r12 = move-exception
        L74:
            if (r3 == 0) goto L79
            r3.close()
        L79:
            throw r12
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.internal.storage.SQLiteChecker.findBrokenRow(java.util.List, java.lang.String):void");
    }

    public void checkRows(String tableName) throws Throwable {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.database.rawQuery("SELECT _id FROM " + tableName, null);
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(String.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(LevelResourceEntry.id))));
                }
            } catch (RuntimeException e) {
                Logger.INSTANCE.error("[Database Module] checkRows err:", e);
                if (cursorRawQuery != null) {
                }
            }
            cursorRawQuery.close();
            if (arrayList.size() != 0) {
                findBrokenRow(arrayList, tableName);
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }
}
