package com.appsflyer.internal.connector.purcahse;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFPurchaseConnectorA2z {
    public int getOneTimePurchaseOfferDetails;
    public int getPackageName;

    public static char[] getOneTimePurchaseOfferDetails(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        int i4 = 0;
        while (i2 < cArr.length) {
            if ((((j >>> i2) & 1) != i || i4 >= 4) && i3 < length) {
                cArr2[i3] = cArr[i2];
                i3++;
                i2++;
            } else {
                cArr2[i4] = cArr[i2];
                i4++;
                i2++;
            }
        }
        return cArr2;
    }
}
