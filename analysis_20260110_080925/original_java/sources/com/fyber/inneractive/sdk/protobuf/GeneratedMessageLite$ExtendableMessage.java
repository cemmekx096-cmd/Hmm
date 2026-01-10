package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends a0 implements F0 {
    protected N extensions = N.d;

    private void eagerlyMergeMessageSetExtension(w wVar, Y y, H h, int i) throws IOException {
        parseExtension(wVar, h, y, (i << 3) | 2, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    private void mergeMessageSetExtensionFromBytes(s sVar, H h, Y y) throws IOException, o0 {
        E0 e0 = (E0) this.extensions.a.get(y.d);
        D0 builder = e0 != null ? e0.toBuilder() : null;
        if (builder == null) {
            builder = y.c.newBuilderForType();
        }
        U u = (U) builder;
        u.getClass();
        try {
            w wVarD = sVar.d();
            u.a(wVarD, h);
            wVarD.a(0);
            Integer numA = u.a();
            N nEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            X x = y.d;
            if (x.c.a() == L1.ENUM) {
                numA = Integer.valueOf(((e0) numA).a());
            }
            nEnsureExtensionsAreMutable.c(x, numA);
        } catch (IOException e) {
            throw new RuntimeException("Reading " + u.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e);
        } catch (o0 e2) {
            throw e2;
        }
    }

    private <MessageType extends E0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, w wVar, H h) throws IOException, o0 {
        int iU = 0;
        s sVarE = null;
        Y yA = null;
        while (true) {
            int iT = wVar.t();
            if (iT == 0) {
                break;
            }
            if (iT == 16) {
                iU = wVar.u();
                if (iU != 0) {
                    yA = h.a(iU, messagetype);
                }
            } else if (iT == 26) {
                if (iU == 0 || yA == null) {
                    sVarE = wVar.e();
                } else {
                    eagerlyMergeMessageSetExtension(wVar, yA, h, iU);
                    sVarE = null;
                }
            } else if (!wVar.e(iT)) {
                break;
            }
        }
        wVar.a(12);
        if (sVarE == null || iU == 0) {
            return;
        }
        if (yA != null) {
            mergeMessageSetExtensionFromBytes(sVarE, h, yA);
        } else {
            mergeLengthDelimitedField(iU, sVarE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.w r7, com.fyber.inneractive.sdk.protobuf.H r8, com.fyber.inneractive.sdk.protobuf.Y r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.w, com.fyber.inneractive.sdk.protobuf.H, com.fyber.inneractive.sdk.protobuf.Y, int, int):boolean");
    }

    private void verifyExtensionContainingType(Y y) {
        if (y.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public N ensureExtensionsAreMutable() {
        N n = this.extensions;
        if (n.b) {
            this.extensions = n.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.a();
    }

    public /* bridge */ /* synthetic */ E0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(E e) {
        Y yAccess$000 = a0.access$000(e);
        verifyExtensionContainingType(yAccess$000);
        Type type = (Type) this.extensions.a.get(yAccess$000.d);
        if (type == 0) {
            return (Type) yAccess$000.b;
        }
        X x = yAccess$000.d;
        if (!x.d) {
            return x.c.a() == L1.ENUM ? (Type) yAccess$000.d.a.a(((Integer) type).intValue()) : type;
        }
        if (x.c.a() != L1.ENUM) {
            return type;
        }
        ?? r1 = (Type) new ArrayList();
        for (Object objA : (List) type) {
            if (yAccess$000.d.c.a() == L1.ENUM) {
                objA = yAccess$000.d.a.a(((Integer) objA).intValue());
            }
            r1.add(objA);
        }
        return r1;
    }

    public final <Type> int getExtensionCount(E e) {
        Y yAccess$000 = a0.access$000(e);
        verifyExtensionContainingType(yAccess$000);
        N n = this.extensions;
        X x = yAccess$000.d;
        n.getClass();
        if (!x.d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = n.a.get(x);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final <Type> boolean hasExtension(E e) {
        Y yAccess$000 = a0.access$000(e);
        verifyExtensionContainingType(yAccess$000);
        N n = this.extensions;
        X x = yAccess$000.d;
        n.getClass();
        if (x.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return n.a.get(x) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        N n = this.extensions;
        if (n.b) {
            this.extensions = n.clone();
        }
        this.extensions.a(messagetype.extensions);
    }

    public /* bridge */ /* synthetic */ D0 newBuilderForType() {
        return newBuilderForType();
    }

    public W newExtensionWriter() {
        return new W(this);
    }

    public W newMessageSetExtensionWriter() {
        return new W(this);
    }

    public <MessageType extends E0> boolean parseUnknownField(MessageType messagetype, w wVar, H h, int i) throws IOException {
        int i2 = i >>> 3;
        return parseExtension(wVar, h, h.a(i2, messagetype), i, i2);
    }

    public <MessageType extends E0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, w wVar, H h, int i) throws IOException, o0 {
        if (i != 11) {
            return (i & 7) == 2 ? parseUnknownField(messagetype, wVar, h, i) : wVar.e(i);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, wVar, h);
        return true;
    }

    public /* bridge */ /* synthetic */ D0 toBuilder() {
        return toBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(E e, int i) {
        Y yAccess$000 = a0.access$000(e);
        verifyExtensionContainingType(yAccess$000);
        N n = this.extensions;
        X x = yAccess$000.d;
        n.getClass();
        if (x.d) {
            Object obj = n.a.get(x);
            if (obj != null) {
                Type type = (Type) ((List) obj).get(i);
                return yAccess$000.d.c.a() == L1.ENUM ? (Type) yAccess$000.d.a.a(((Integer) type).intValue()) : type;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
