package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class K1 {
    private static final /* synthetic */ K1[] $VALUES;
    public static final K1 BOOL;
    public static final K1 BYTES;
    public static final K1 DOUBLE;
    public static final K1 ENUM;
    public static final K1 FIXED32;
    public static final K1 FIXED64;
    public static final K1 FLOAT;
    public static final K1 GROUP;
    public static final K1 INT32;
    public static final K1 INT64;
    public static final K1 MESSAGE;
    public static final K1 SFIXED32;
    public static final K1 SFIXED64;
    public static final K1 SINT32;
    public static final K1 SINT64;
    public static final K1 STRING;
    public static final K1 UINT32;
    public static final K1 UINT64;
    private final L1 javaType;
    private final int wireType;

    static {
        K1 k1 = new K1("DOUBLE", 0, L1.DOUBLE, 1);
        DOUBLE = k1;
        K1 k12 = new K1("FLOAT", 1, L1.FLOAT, 5);
        FLOAT = k12;
        L1 l1 = L1.LONG;
        K1 k13 = new K1("INT64", 2, l1, 0);
        INT64 = k13;
        K1 k14 = new K1("UINT64", 3, l1, 0);
        UINT64 = k14;
        L1 l12 = L1.INT;
        K1 k15 = new K1("INT32", 4, l12, 0);
        INT32 = k15;
        K1 k16 = new K1("FIXED64", 5, l1, 1);
        FIXED64 = k16;
        K1 k17 = new K1("FIXED32", 6, l12, 5);
        FIXED32 = k17;
        K1 k18 = new K1("BOOL", 7, L1.BOOLEAN, 0);
        BOOL = k18;
        K1 g1 = new G1(L1.STRING);
        STRING = g1;
        final L1 l13 = L1.MESSAGE;
        K1 h1 = new H1(l13);
        GROUP = h1;
        K1 k19 = new K1(l13) { // from class: com.fyber.inneractive.sdk.protobuf.I1
            @Override // com.fyber.inneractive.sdk.protobuf.K1
            public final boolean c() {
                return false;
            }
        };
        MESSAGE = k19;
        final L1 l14 = L1.BYTE_STRING;
        K1 k110 = new K1(l14) { // from class: com.fyber.inneractive.sdk.protobuf.J1
            @Override // com.fyber.inneractive.sdk.protobuf.K1
            public final boolean c() {
                return false;
            }
        };
        BYTES = k110;
        K1 k111 = new K1("UINT32", 12, l12, 0);
        UINT32 = k111;
        K1 k112 = new K1("ENUM", 13, L1.ENUM, 0);
        ENUM = k112;
        K1 k113 = new K1("SFIXED32", 14, l12, 5);
        SFIXED32 = k113;
        K1 k114 = new K1("SFIXED64", 15, l1, 1);
        SFIXED64 = k114;
        K1 k115 = new K1("SINT32", 16, l12, 0);
        SINT32 = k115;
        K1 k116 = new K1("SINT64", 17, l1, 0);
        SINT64 = k116;
        $VALUES = new K1[]{k1, k12, k13, k14, k15, k16, k17, k18, g1, h1, k19, k110, k111, k112, k113, k114, k115, k116};
    }

    public K1(String str, int i, L1 l1, int i2) {
        this.javaType = l1;
        this.wireType = i2;
    }

    public static K1 valueOf(String str) {
        return (K1) Enum.valueOf(K1.class, str);
    }

    public static K1[] values() {
        return (K1[]) $VALUES.clone();
    }

    public final L1 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }

    public boolean c() {
        return !(this instanceof G1);
    }

    public K1(String str, int i, L1 l1, int i2, int i3) {
        this.javaType = l1;
        this.wireType = i2;
    }
}
