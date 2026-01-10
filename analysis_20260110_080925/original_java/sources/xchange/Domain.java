package xchange;

import com.crashlytics.android.BuildConfig;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Domain {

    public interface AccountOrBuilder extends MessageLiteOrBuilder {
        int getIabId();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        String getPurchaseOrders(int i);

        ByteString getPurchaseOrdersBytes(int i);

        int getPurchaseOrdersCount();

        List<String> getPurchaseOrdersList();

        String getSaleOrders(int i);

        ByteString getSaleOrdersBytes(int i);

        int getSaleOrdersCount();

        List<String> getSaleOrdersList();
    }

    public interface PurchaseOrderOrBuilder extends MessageLiteOrBuilder {
        boolean getAcceptPrivacyShield();

        boolean getActive();

        String getAppKeys(int i);

        ByteString getAppKeysBytes(int i);

        int getAppKeysCount();

        List<String> getAppKeysList();

        String getAvailableFields(int i);

        ByteString getAvailableFieldsBytes(int i);

        int getAvailableFieldsCount();

        List<String> getAvailableFieldsList();

        String getBlacklistedIds(int i);

        ByteString getBlacklistedIdsBytes(int i);

        int getBlacklistedIdsCount();

        List<String> getBlacklistedIdsList();

        String getBuyerId(int i);

        ByteString getBuyerIdBytes(int i);

        int getBuyerIdCount();

        List<String> getBuyerIdList();

        Timestamp getEndDate();

        String getId();

        ByteString getIdBytes();

        String getOrderNumber();

        ByteString getOrderNumberBytes();

        String getSellerId();

        ByteString getSellerIdBytes();

        int getSources(int i);

        int getSourcesCount();

        List<Integer> getSourcesList();

        Timestamp getStartDate();

        boolean hasEndDate();

        boolean hasStartDate();
    }

    public interface SaleOrderOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private Domain() {
    }

    public static final class Account extends GeneratedMessageLite<Account, Builder> implements AccountOrBuilder {
        private static final Account DEFAULT_INSTANCE;
        public static final int IAB_ID_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Account> PARSER = null;
        public static final int PURCHASE_ORDERS_FIELD_NUMBER = 4;
        public static final int SALE_ORDERS_FIELD_NUMBER = 5;
        private int iabId_;
        private String id_ = BuildConfig.FLAVOR;
        private String name_ = BuildConfig.FLAVOR;
        private Internal.ProtobufList<String> purchaseOrders_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> saleOrders_ = GeneratedMessageLite.emptyProtobufList();

        private Account() {
        }

        @Override // xchange.Domain.AccountOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // xchange.Domain.AccountOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // xchange.Domain.AccountOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // xchange.Domain.AccountOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // xchange.Domain.AccountOrBuilder
        public int getIabId() {
            return this.iabId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIabId(int i) {
            this.iabId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIabId() {
            this.iabId_ = 0;
        }

        @Override // xchange.Domain.AccountOrBuilder
        public List<String> getPurchaseOrdersList() {
            return this.purchaseOrders_;
        }

        @Override // xchange.Domain.AccountOrBuilder
        public int getPurchaseOrdersCount() {
            return this.purchaseOrders_.size();
        }

        @Override // xchange.Domain.AccountOrBuilder
        public String getPurchaseOrders(int i) {
            return (String) this.purchaseOrders_.get(i);
        }

        @Override // xchange.Domain.AccountOrBuilder
        public ByteString getPurchaseOrdersBytes(int i) {
            return ByteString.copyFromUtf8((String) this.purchaseOrders_.get(i));
        }

        private void ensurePurchaseOrdersIsMutable() {
            Internal.ProtobufList<String> protobufList = this.purchaseOrders_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.purchaseOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurchaseOrders(int i, String str) {
            str.getClass();
            ensurePurchaseOrdersIsMutable();
            this.purchaseOrders_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurchaseOrders(String str) {
            str.getClass();
            ensurePurchaseOrdersIsMutable();
            this.purchaseOrders_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurchaseOrders(Iterable<String> iterable) {
            ensurePurchaseOrdersIsMutable();
            AbstractMessageLite.addAll(iterable, this.purchaseOrders_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurchaseOrders() {
            this.purchaseOrders_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurchaseOrdersBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensurePurchaseOrdersIsMutable();
            this.purchaseOrders_.add(byteString.toStringUtf8());
        }

        @Override // xchange.Domain.AccountOrBuilder
        public List<String> getSaleOrdersList() {
            return this.saleOrders_;
        }

        @Override // xchange.Domain.AccountOrBuilder
        public int getSaleOrdersCount() {
            return this.saleOrders_.size();
        }

        @Override // xchange.Domain.AccountOrBuilder
        public String getSaleOrders(int i) {
            return (String) this.saleOrders_.get(i);
        }

        @Override // xchange.Domain.AccountOrBuilder
        public ByteString getSaleOrdersBytes(int i) {
            return ByteString.copyFromUtf8((String) this.saleOrders_.get(i));
        }

        private void ensureSaleOrdersIsMutable() {
            Internal.ProtobufList<String> protobufList = this.saleOrders_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.saleOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSaleOrders(int i, String str) {
            str.getClass();
            ensureSaleOrdersIsMutable();
            this.saleOrders_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSaleOrders(String str) {
            str.getClass();
            ensureSaleOrdersIsMutable();
            this.saleOrders_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSaleOrders(Iterable<String> iterable) {
            ensureSaleOrdersIsMutable();
            AbstractMessageLite.addAll(iterable, this.saleOrders_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSaleOrders() {
            this.saleOrders_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSaleOrdersBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureSaleOrdersIsMutable();
            this.saleOrders_.add(byteString.toStringUtf8());
        }

        public static Account parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Account parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Account parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Account parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Account parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Account parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Account parseFrom(InputStream inputStream) throws IOException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Account parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Account parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Account) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Account parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Account) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Account parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Account parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Account account) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(account);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Account, Builder> implements AccountOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Account.DEFAULT_INSTANCE);
            }

            @Override // xchange.Domain.AccountOrBuilder
            public String getId() {
                return ((Account) this.instance).getId();
            }

            @Override // xchange.Domain.AccountOrBuilder
            public ByteString getIdBytes() {
                return ((Account) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Account) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Account) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Account) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.AccountOrBuilder
            public String getName() {
                return ((Account) this.instance).getName();
            }

            @Override // xchange.Domain.AccountOrBuilder
            public ByteString getNameBytes() {
                return ((Account) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Account) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Account) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Account) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.AccountOrBuilder
            public int getIabId() {
                return ((Account) this.instance).getIabId();
            }

            public Builder setIabId(int i) {
                copyOnWrite();
                ((Account) this.instance).setIabId(i);
                return this;
            }

            public Builder clearIabId() {
                copyOnWrite();
                ((Account) this.instance).clearIabId();
                return this;
            }

            @Override // xchange.Domain.AccountOrBuilder
            public List<String> getPurchaseOrdersList() {
                return Collections.unmodifiableList(((Account) this.instance).getPurchaseOrdersList());
            }

            @Override // xchange.Domain.AccountOrBuilder
            public int getPurchaseOrdersCount() {
                return ((Account) this.instance).getPurchaseOrdersCount();
            }

            @Override // xchange.Domain.AccountOrBuilder
            public String getPurchaseOrders(int i) {
                return ((Account) this.instance).getPurchaseOrders(i);
            }

            @Override // xchange.Domain.AccountOrBuilder
            public ByteString getPurchaseOrdersBytes(int i) {
                return ((Account) this.instance).getPurchaseOrdersBytes(i);
            }

            public Builder setPurchaseOrders(int i, String str) {
                copyOnWrite();
                ((Account) this.instance).setPurchaseOrders(i, str);
                return this;
            }

            public Builder addPurchaseOrders(String str) {
                copyOnWrite();
                ((Account) this.instance).addPurchaseOrders(str);
                return this;
            }

            public Builder addAllPurchaseOrders(Iterable<String> iterable) {
                copyOnWrite();
                ((Account) this.instance).addAllPurchaseOrders(iterable);
                return this;
            }

            public Builder clearPurchaseOrders() {
                copyOnWrite();
                ((Account) this.instance).clearPurchaseOrders();
                return this;
            }

            public Builder addPurchaseOrdersBytes(ByteString byteString) {
                copyOnWrite();
                ((Account) this.instance).addPurchaseOrdersBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.AccountOrBuilder
            public List<String> getSaleOrdersList() {
                return Collections.unmodifiableList(((Account) this.instance).getSaleOrdersList());
            }

            @Override // xchange.Domain.AccountOrBuilder
            public int getSaleOrdersCount() {
                return ((Account) this.instance).getSaleOrdersCount();
            }

            @Override // xchange.Domain.AccountOrBuilder
            public String getSaleOrders(int i) {
                return ((Account) this.instance).getSaleOrders(i);
            }

            @Override // xchange.Domain.AccountOrBuilder
            public ByteString getSaleOrdersBytes(int i) {
                return ((Account) this.instance).getSaleOrdersBytes(i);
            }

            public Builder setSaleOrders(int i, String str) {
                copyOnWrite();
                ((Account) this.instance).setSaleOrders(i, str);
                return this;
            }

            public Builder addSaleOrders(String str) {
                copyOnWrite();
                ((Account) this.instance).addSaleOrders(str);
                return this;
            }

            public Builder addAllSaleOrders(Iterable<String> iterable) {
                copyOnWrite();
                ((Account) this.instance).addAllSaleOrders(iterable);
                return this;
            }

            public Builder clearSaleOrders() {
                copyOnWrite();
                ((Account) this.instance).clearSaleOrders();
                return this;
            }

            public Builder addSaleOrdersBytes(ByteString byteString) {
                copyOnWrite();
                ((Account) this.instance).addSaleOrdersBytes(byteString);
                return this;
            }
        }

        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Account();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ț\u0005Ț", new Object[]{"id_", "name_", "iabId_", "purchaseOrders_", "saleOrders_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Account.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Account account = new Account();
            DEFAULT_INSTANCE = account;
            GeneratedMessageLite.registerDefaultInstance(Account.class, account);
        }

        public static Account getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Account> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: xchange.Domain$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class PurchaseOrder extends GeneratedMessageLite<PurchaseOrder, Builder> implements PurchaseOrderOrBuilder {
        public static final int ACCEPTPRIVACYSHIELD_FIELD_NUMBER = 10;
        public static final int ACTIVE_FIELD_NUMBER = 11;
        public static final int APP_KEYS_FIELD_NUMBER = 9;
        public static final int AVAILABLE_FIELDS_FIELD_NUMBER = 7;
        public static final int BLACKLISTED_IDS_FIELD_NUMBER = 12;
        public static final int BUYER_ID_FIELD_NUMBER = 6;
        private static final PurchaseOrder DEFAULT_INSTANCE;
        public static final int END_DATE_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ORDER_NUMBER_FIELD_NUMBER = 2;
        private static volatile Parser<PurchaseOrder> PARSER = null;
        public static final int SELLER_ID_FIELD_NUMBER = 5;
        public static final int SOURCES_FIELD_NUMBER = 8;
        public static final int START_DATE_FIELD_NUMBER = 3;
        private boolean acceptPrivacyShield_;
        private boolean active_;
        private Timestamp endDate_;
        private Timestamp startDate_;
        private int sourcesMemoizedSerializedSize = -1;
        private String id_ = BuildConfig.FLAVOR;
        private String orderNumber_ = BuildConfig.FLAVOR;
        private String sellerId_ = BuildConfig.FLAVOR;
        private Internal.ProtobufList<String> buyerId_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> availableFields_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList sources_ = emptyIntList();
        private Internal.ProtobufList<String> appKeys_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> blacklistedIds_ = GeneratedMessageLite.emptyProtobufList();

        private PurchaseOrder() {
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getOrderNumber() {
            return this.orderNumber_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getOrderNumberBytes() {
            return ByteString.copyFromUtf8(this.orderNumber_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderNumber(String str) {
            str.getClass();
            this.orderNumber_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderNumber() {
            this.orderNumber_ = getDefaultInstance().getOrderNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderNumberBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.orderNumber_ = byteString.toStringUtf8();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public boolean hasStartDate() {
            return this.startDate_ != null;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public Timestamp getStartDate() {
            Timestamp timestamp = this.startDate_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartDate(Timestamp timestamp) {
            timestamp.getClass();
            this.startDate_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartDate(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.startDate_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.startDate_ = Timestamp.newBuilder(this.startDate_).mergeFrom(timestamp).buildPartial();
            } else {
                this.startDate_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartDate() {
            this.startDate_ = null;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public boolean hasEndDate() {
            return this.endDate_ != null;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public Timestamp getEndDate() {
            Timestamp timestamp = this.endDate_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndDate(Timestamp timestamp) {
            timestamp.getClass();
            this.endDate_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEndDate(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.endDate_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.endDate_ = Timestamp.newBuilder(this.endDate_).mergeFrom(timestamp).buildPartial();
            } else {
                this.endDate_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndDate() {
            this.endDate_ = null;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getSellerId() {
            return this.sellerId_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getSellerIdBytes() {
            return ByteString.copyFromUtf8(this.sellerId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSellerId(String str) {
            str.getClass();
            this.sellerId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSellerId() {
            this.sellerId_ = getDefaultInstance().getSellerId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSellerIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sellerId_ = byteString.toStringUtf8();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public List<String> getBuyerIdList() {
            return this.buyerId_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getBuyerIdCount() {
            return this.buyerId_.size();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getBuyerId(int i) {
            return (String) this.buyerId_.get(i);
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getBuyerIdBytes(int i) {
            return ByteString.copyFromUtf8((String) this.buyerId_.get(i));
        }

        private void ensureBuyerIdIsMutable() {
            Internal.ProtobufList<String> protobufList = this.buyerId_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.buyerId_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuyerId(int i, String str) {
            str.getClass();
            ensureBuyerIdIsMutable();
            this.buyerId_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBuyerId(String str) {
            str.getClass();
            ensureBuyerIdIsMutable();
            this.buyerId_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBuyerId(Iterable<String> iterable) {
            ensureBuyerIdIsMutable();
            AbstractMessageLite.addAll(iterable, this.buyerId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuyerId() {
            this.buyerId_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBuyerIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureBuyerIdIsMutable();
            this.buyerId_.add(byteString.toStringUtf8());
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public List<String> getAvailableFieldsList() {
            return this.availableFields_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getAvailableFieldsCount() {
            return this.availableFields_.size();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getAvailableFields(int i) {
            return (String) this.availableFields_.get(i);
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getAvailableFieldsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.availableFields_.get(i));
        }

        private void ensureAvailableFieldsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.availableFields_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.availableFields_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvailableFields(int i, String str) {
            str.getClass();
            ensureAvailableFieldsIsMutable();
            this.availableFields_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableFields(String str) {
            str.getClass();
            ensureAvailableFieldsIsMutable();
            this.availableFields_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAvailableFields(Iterable<String> iterable) {
            ensureAvailableFieldsIsMutable();
            AbstractMessageLite.addAll(iterable, this.availableFields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvailableFields() {
            this.availableFields_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvailableFieldsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAvailableFieldsIsMutable();
            this.availableFields_.add(byteString.toStringUtf8());
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public List<Integer> getSourcesList() {
            return this.sources_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getSourcesCount() {
            return this.sources_.size();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getSources(int i) {
            return this.sources_.getInt(i);
        }

        private void ensureSourcesIsMutable() {
            Internal.IntList intList = this.sources_;
            if (intList.isModifiable()) {
                return;
            }
            this.sources_ = GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSources(int i, int i2) {
            ensureSourcesIsMutable();
            this.sources_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSources(int i) {
            ensureSourcesIsMutable();
            this.sources_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSources(Iterable<? extends Integer> iterable) {
            ensureSourcesIsMutable();
            AbstractMessageLite.addAll(iterable, this.sources_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSources() {
            this.sources_ = emptyIntList();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public List<String> getAppKeysList() {
            return this.appKeys_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getAppKeysCount() {
            return this.appKeys_.size();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getAppKeys(int i) {
            return (String) this.appKeys_.get(i);
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getAppKeysBytes(int i) {
            return ByteString.copyFromUtf8((String) this.appKeys_.get(i));
        }

        private void ensureAppKeysIsMutable() {
            Internal.ProtobufList<String> protobufList = this.appKeys_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.appKeys_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeys(int i, String str) {
            str.getClass();
            ensureAppKeysIsMutable();
            this.appKeys_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppKeys(String str) {
            str.getClass();
            ensureAppKeysIsMutable();
            this.appKeys_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAppKeys(Iterable<String> iterable) {
            ensureAppKeysIsMutable();
            AbstractMessageLite.addAll(iterable, this.appKeys_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKeys() {
            this.appKeys_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppKeysBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAppKeysIsMutable();
            this.appKeys_.add(byteString.toStringUtf8());
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public boolean getAcceptPrivacyShield() {
            return this.acceptPrivacyShield_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAcceptPrivacyShield(boolean z) {
            this.acceptPrivacyShield_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAcceptPrivacyShield() {
            this.acceptPrivacyShield_ = false;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public boolean getActive() {
            return this.active_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActive(boolean z) {
            this.active_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActive() {
            this.active_ = false;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public List<String> getBlacklistedIdsList() {
            return this.blacklistedIds_;
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public int getBlacklistedIdsCount() {
            return this.blacklistedIds_.size();
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public String getBlacklistedIds(int i) {
            return (String) this.blacklistedIds_.get(i);
        }

        @Override // xchange.Domain.PurchaseOrderOrBuilder
        public ByteString getBlacklistedIdsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.blacklistedIds_.get(i));
        }

        private void ensureBlacklistedIdsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.blacklistedIds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.blacklistedIds_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlacklistedIds(int i, String str) {
            str.getClass();
            ensureBlacklistedIdsIsMutable();
            this.blacklistedIds_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlacklistedIds(String str) {
            str.getClass();
            ensureBlacklistedIdsIsMutable();
            this.blacklistedIds_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlacklistedIds(Iterable<String> iterable) {
            ensureBlacklistedIdsIsMutable();
            AbstractMessageLite.addAll(iterable, this.blacklistedIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlacklistedIds() {
            this.blacklistedIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlacklistedIdsBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureBlacklistedIdsIsMutable();
            this.blacklistedIds_.add(byteString.toStringUtf8());
        }

        public static PurchaseOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PurchaseOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PurchaseOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PurchaseOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PurchaseOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PurchaseOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PurchaseOrder parseFrom(InputStream inputStream) throws IOException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PurchaseOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PurchaseOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PurchaseOrder) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PurchaseOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PurchaseOrder) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PurchaseOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PurchaseOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PurchaseOrder purchaseOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(purchaseOrder);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PurchaseOrder, Builder> implements PurchaseOrderOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(PurchaseOrder.DEFAULT_INSTANCE);
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getId() {
                return ((PurchaseOrder) this.instance).getId();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getIdBytes() {
                return ((PurchaseOrder) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setIdBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getOrderNumber() {
                return ((PurchaseOrder) this.instance).getOrderNumber();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getOrderNumberBytes() {
                return ((PurchaseOrder) this.instance).getOrderNumberBytes();
            }

            public Builder setOrderNumber(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setOrderNumber(str);
                return this;
            }

            public Builder clearOrderNumber() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearOrderNumber();
                return this;
            }

            public Builder setOrderNumberBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setOrderNumberBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public boolean hasStartDate() {
                return ((PurchaseOrder) this.instance).hasStartDate();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public Timestamp getStartDate() {
                return ((PurchaseOrder) this.instance).getStartDate();
            }

            public Builder setStartDate(Timestamp timestamp) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setStartDate(timestamp);
                return this;
            }

            public Builder setStartDate(Timestamp.Builder builder) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setStartDate(builder.build());
                return this;
            }

            public Builder mergeStartDate(Timestamp timestamp) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).mergeStartDate(timestamp);
                return this;
            }

            public Builder clearStartDate() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearStartDate();
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public boolean hasEndDate() {
                return ((PurchaseOrder) this.instance).hasEndDate();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public Timestamp getEndDate() {
                return ((PurchaseOrder) this.instance).getEndDate();
            }

            public Builder setEndDate(Timestamp timestamp) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setEndDate(timestamp);
                return this;
            }

            public Builder setEndDate(Timestamp.Builder builder) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setEndDate(builder.build());
                return this;
            }

            public Builder mergeEndDate(Timestamp timestamp) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).mergeEndDate(timestamp);
                return this;
            }

            public Builder clearEndDate() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearEndDate();
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getSellerId() {
                return ((PurchaseOrder) this.instance).getSellerId();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getSellerIdBytes() {
                return ((PurchaseOrder) this.instance).getSellerIdBytes();
            }

            public Builder setSellerId(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setSellerId(str);
                return this;
            }

            public Builder clearSellerId() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearSellerId();
                return this;
            }

            public Builder setSellerIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setSellerIdBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public List<String> getBuyerIdList() {
                return Collections.unmodifiableList(((PurchaseOrder) this.instance).getBuyerIdList());
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getBuyerIdCount() {
                return ((PurchaseOrder) this.instance).getBuyerIdCount();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getBuyerId(int i) {
                return ((PurchaseOrder) this.instance).getBuyerId(i);
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getBuyerIdBytes(int i) {
                return ((PurchaseOrder) this.instance).getBuyerIdBytes(i);
            }

            public Builder setBuyerId(int i, String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setBuyerId(i, str);
                return this;
            }

            public Builder addBuyerId(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addBuyerId(str);
                return this;
            }

            public Builder addAllBuyerId(Iterable<String> iterable) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAllBuyerId(iterable);
                return this;
            }

            public Builder clearBuyerId() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearBuyerId();
                return this;
            }

            public Builder addBuyerIdBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addBuyerIdBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public List<String> getAvailableFieldsList() {
                return Collections.unmodifiableList(((PurchaseOrder) this.instance).getAvailableFieldsList());
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getAvailableFieldsCount() {
                return ((PurchaseOrder) this.instance).getAvailableFieldsCount();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getAvailableFields(int i) {
                return ((PurchaseOrder) this.instance).getAvailableFields(i);
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getAvailableFieldsBytes(int i) {
                return ((PurchaseOrder) this.instance).getAvailableFieldsBytes(i);
            }

            public Builder setAvailableFields(int i, String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setAvailableFields(i, str);
                return this;
            }

            public Builder addAvailableFields(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAvailableFields(str);
                return this;
            }

            public Builder addAllAvailableFields(Iterable<String> iterable) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAllAvailableFields(iterable);
                return this;
            }

            public Builder clearAvailableFields() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearAvailableFields();
                return this;
            }

            public Builder addAvailableFieldsBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAvailableFieldsBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public List<Integer> getSourcesList() {
                return Collections.unmodifiableList(((PurchaseOrder) this.instance).getSourcesList());
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getSourcesCount() {
                return ((PurchaseOrder) this.instance).getSourcesCount();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getSources(int i) {
                return ((PurchaseOrder) this.instance).getSources(i);
            }

            public Builder setSources(int i, int i2) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setSources(i, i2);
                return this;
            }

            public Builder addSources(int i) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addSources(i);
                return this;
            }

            public Builder addAllSources(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAllSources(iterable);
                return this;
            }

            public Builder clearSources() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearSources();
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public List<String> getAppKeysList() {
                return Collections.unmodifiableList(((PurchaseOrder) this.instance).getAppKeysList());
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getAppKeysCount() {
                return ((PurchaseOrder) this.instance).getAppKeysCount();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getAppKeys(int i) {
                return ((PurchaseOrder) this.instance).getAppKeys(i);
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getAppKeysBytes(int i) {
                return ((PurchaseOrder) this.instance).getAppKeysBytes(i);
            }

            public Builder setAppKeys(int i, String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setAppKeys(i, str);
                return this;
            }

            public Builder addAppKeys(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAppKeys(str);
                return this;
            }

            public Builder addAllAppKeys(Iterable<String> iterable) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAllAppKeys(iterable);
                return this;
            }

            public Builder clearAppKeys() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearAppKeys();
                return this;
            }

            public Builder addAppKeysBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAppKeysBytes(byteString);
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public boolean getAcceptPrivacyShield() {
                return ((PurchaseOrder) this.instance).getAcceptPrivacyShield();
            }

            public Builder setAcceptPrivacyShield(boolean z) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setAcceptPrivacyShield(z);
                return this;
            }

            public Builder clearAcceptPrivacyShield() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearAcceptPrivacyShield();
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public boolean getActive() {
                return ((PurchaseOrder) this.instance).getActive();
            }

            public Builder setActive(boolean z) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setActive(z);
                return this;
            }

            public Builder clearActive() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearActive();
                return this;
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public List<String> getBlacklistedIdsList() {
                return Collections.unmodifiableList(((PurchaseOrder) this.instance).getBlacklistedIdsList());
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public int getBlacklistedIdsCount() {
                return ((PurchaseOrder) this.instance).getBlacklistedIdsCount();
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public String getBlacklistedIds(int i) {
                return ((PurchaseOrder) this.instance).getBlacklistedIds(i);
            }

            @Override // xchange.Domain.PurchaseOrderOrBuilder
            public ByteString getBlacklistedIdsBytes(int i) {
                return ((PurchaseOrder) this.instance).getBlacklistedIdsBytes(i);
            }

            public Builder setBlacklistedIds(int i, String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).setBlacklistedIds(i, str);
                return this;
            }

            public Builder addBlacklistedIds(String str) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addBlacklistedIds(str);
                return this;
            }

            public Builder addAllBlacklistedIds(Iterable<String> iterable) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addAllBlacklistedIds(iterable);
                return this;
            }

            public Builder clearBlacklistedIds() {
                copyOnWrite();
                ((PurchaseOrder) this.instance).clearBlacklistedIds();
                return this;
            }

            public Builder addBlacklistedIdsBytes(ByteString byteString) {
                copyOnWrite();
                ((PurchaseOrder) this.instance).addBlacklistedIdsBytes(byteString);
                return this;
            }
        }

        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PurchaseOrder();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0005\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\t\u0005Ȉ\u0006Ț\u0007Ț\b+\tȚ\n\u0007\u000b\u0007\fȚ", new Object[]{"id_", "orderNumber_", "startDate_", "endDate_", "sellerId_", "buyerId_", "availableFields_", "sources_", "appKeys_", "acceptPrivacyShield_", "active_", "blacklistedIds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PurchaseOrder.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PurchaseOrder purchaseOrder = new PurchaseOrder();
            DEFAULT_INSTANCE = purchaseOrder;
            GeneratedMessageLite.registerDefaultInstance(PurchaseOrder.class, purchaseOrder);
        }

        public static PurchaseOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PurchaseOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SaleOrder extends GeneratedMessageLite<SaleOrder, Builder> implements SaleOrderOrBuilder {
        private static final SaleOrder DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<SaleOrder> PARSER;
        private String id_ = BuildConfig.FLAVOR;

        private SaleOrder() {
        }

        @Override // xchange.Domain.SaleOrderOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // xchange.Domain.SaleOrderOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        public static SaleOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SaleOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaleOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaleOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaleOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaleOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaleOrder parseFrom(InputStream inputStream) throws IOException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaleOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaleOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaleOrder) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaleOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaleOrder) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaleOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaleOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SaleOrder saleOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(saleOrder);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<SaleOrder, Builder> implements SaleOrderOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SaleOrder.DEFAULT_INSTANCE);
            }

            @Override // xchange.Domain.SaleOrderOrBuilder
            public String getId() {
                return ((SaleOrder) this.instance).getId();
            }

            @Override // xchange.Domain.SaleOrderOrBuilder
            public ByteString getIdBytes() {
                return ((SaleOrder) this.instance).getIdBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((SaleOrder) this.instance).setId(str);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((SaleOrder) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SaleOrder) this.instance).setIdBytes(byteString);
                return this;
            }
        }

        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaleOrder();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"id_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SaleOrder.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            SaleOrder saleOrder = new SaleOrder();
            DEFAULT_INSTANCE = saleOrder;
            GeneratedMessageLite.registerDefaultInstance(SaleOrder.class, saleOrder);
        }

        public static SaleOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SaleOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
