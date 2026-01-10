package ac;

import com.crashlytics.android.BuildConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AcError {

    public interface ErrorResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorCode getCode();

        int getCodeValue();

        String getDescription();

        ByteString getDescriptionBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AcError() {
    }

    public enum ErrorCode implements Internal.EnumLite {
        UNKNOWN(0),
        UNRECOGNIZED(-1);

        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: ac.AcError.ErrorCode.1
            /* renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public ErrorCode m0findValueByNumber(int i) {
                return ErrorCode.forNumber(i);
            }
        };
        private final int value;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ErrorCode valueOf(int i) {
            return forNumber(i);
        }

        public static ErrorCode forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return UNKNOWN;
        }

        public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ErrorCodeVerifier.INSTANCE;
        }

        private static final class ErrorCodeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ErrorCodeVerifier();

            private ErrorCodeVerifier() {
            }

            public boolean isInRange(int i) {
                return ErrorCode.forNumber(i) != null;
            }
        }

        ErrorCode(int i) {
            this.value = i;
        }
    }

    public static final class ErrorResponse extends GeneratedMessageLite<ErrorResponse, Builder> implements ErrorResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final ErrorResponse DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<ErrorResponse> PARSER;
        private int code_;
        private String description_ = BuildConfig.FLAVOR;

        private ErrorResponse() {
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public ErrorCode getCode() {
            ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.code_);
            return errorCodeForNumber == null ? ErrorCode.UNRECOGNIZED : errorCodeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(ErrorCode errorCode) {
            this.code_ = errorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ErrorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ErrorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(InputStream inputStream) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ErrorResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ErrorResponse errorResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(errorResponse);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ErrorResponse, Builder> implements ErrorResponseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ErrorResponse.DEFAULT_INSTANCE);
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public int getCodeValue() {
                return ((ErrorResponse) this.instance).getCodeValue();
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setCodeValue(i);
                return this;
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public ErrorCode getCode() {
                return ((ErrorResponse) this.instance).getCode();
            }

            public Builder setCode(ErrorCode errorCode) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setCode(errorCode);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((ErrorResponse) this.instance).clearCode();
                return this;
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public String getDescription() {
                return ((ErrorResponse) this.instance).getDescription();
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public ByteString getDescriptionBytes() {
                return ((ErrorResponse) this.instance).getDescriptionBytes();
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setDescription(str);
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((ErrorResponse) this.instance).clearDescription();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setDescriptionBytes(byteString);
                return this;
            }
        }

        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ErrorResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ErrorResponse.class) {
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
            ErrorResponse errorResponse = new ErrorResponse();
            DEFAULT_INSTANCE = errorResponse;
            GeneratedMessageLite.registerDefaultInstance(ErrorResponse.class, errorResponse);
        }

        public static ErrorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ErrorResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: ac.AcError$1, reason: invalid class name */
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
}
