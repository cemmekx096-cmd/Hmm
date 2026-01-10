package com.iab.omid.library.inmobi.adsession.media;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
