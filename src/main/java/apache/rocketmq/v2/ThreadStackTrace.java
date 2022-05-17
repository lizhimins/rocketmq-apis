// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.ThreadStackTrace}
 */
public final class ThreadStackTrace extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.ThreadStackTrace)
    ThreadStackTraceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreadStackTrace.newBuilder() to construct.
  private ThreadStackTrace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreadStackTrace() {
    nonce_ = "";
    threadStackTrace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreadStackTrace();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThreadStackTrace(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nonce_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            threadStackTrace_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ThreadStackTrace_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ThreadStackTrace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.ThreadStackTrace.class, apache.rocketmq.v2.ThreadStackTrace.Builder.class);
  }

  private int bitField0_;
  public static final int NONCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object nonce_;
  /**
   * <code>string nonce = 1;</code>
   * @return The nonce.
   */
  @java.lang.Override
  public java.lang.String getNonce() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nonce_ = s;
      return s;
    }
  }
  /**
   * <code>string nonce = 1;</code>
   * @return The bytes for nonce.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNonceBytes() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nonce_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THREAD_STACK_TRACE_FIELD_NUMBER = 2;
  private volatile java.lang.Object threadStackTrace_;
  /**
   * <code>optional string thread_stack_trace = 2;</code>
   * @return Whether the threadStackTrace field is set.
   */
  @java.lang.Override
  public boolean hasThreadStackTrace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string thread_stack_trace = 2;</code>
   * @return The threadStackTrace.
   */
  @java.lang.Override
  public java.lang.String getThreadStackTrace() {
    java.lang.Object ref = threadStackTrace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      threadStackTrace_ = s;
      return s;
    }
  }
  /**
   * <code>optional string thread_stack_trace = 2;</code>
   * @return The bytes for threadStackTrace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getThreadStackTraceBytes() {
    java.lang.Object ref = threadStackTrace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      threadStackTrace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonce_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nonce_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, threadStackTrace_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonce_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nonce_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, threadStackTrace_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof apache.rocketmq.v2.ThreadStackTrace)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.ThreadStackTrace other = (apache.rocketmq.v2.ThreadStackTrace) obj;

    if (!getNonce()
        .equals(other.getNonce())) return false;
    if (hasThreadStackTrace() != other.hasThreadStackTrace()) return false;
    if (hasThreadStackTrace()) {
      if (!getThreadStackTrace()
          .equals(other.getThreadStackTrace())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    if (hasThreadStackTrace()) {
      hash = (37 * hash) + THREAD_STACK_TRACE_FIELD_NUMBER;
      hash = (53 * hash) + getThreadStackTrace().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ThreadStackTrace parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(apache.rocketmq.v2.ThreadStackTrace prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code apache.rocketmq.v2.ThreadStackTrace}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.ThreadStackTrace)
      apache.rocketmq.v2.ThreadStackTraceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ThreadStackTrace_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ThreadStackTrace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.ThreadStackTrace.class, apache.rocketmq.v2.ThreadStackTrace.Builder.class);
    }

    // Construct using apache.rocketmq.v2.ThreadStackTrace.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nonce_ = "";

      threadStackTrace_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ThreadStackTrace_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ThreadStackTrace getDefaultInstanceForType() {
      return apache.rocketmq.v2.ThreadStackTrace.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.ThreadStackTrace build() {
      apache.rocketmq.v2.ThreadStackTrace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ThreadStackTrace buildPartial() {
      apache.rocketmq.v2.ThreadStackTrace result = new apache.rocketmq.v2.ThreadStackTrace(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.nonce_ = nonce_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.threadStackTrace_ = threadStackTrace_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof apache.rocketmq.v2.ThreadStackTrace) {
        return mergeFrom((apache.rocketmq.v2.ThreadStackTrace)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.ThreadStackTrace other) {
      if (other == apache.rocketmq.v2.ThreadStackTrace.getDefaultInstance()) return this;
      if (!other.getNonce().isEmpty()) {
        nonce_ = other.nonce_;
        onChanged();
      }
      if (other.hasThreadStackTrace()) {
        bitField0_ |= 0x00000001;
        threadStackTrace_ = other.threadStackTrace_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      apache.rocketmq.v2.ThreadStackTrace parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.ThreadStackTrace) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object nonce_ = "";
    /**
     * <code>string nonce = 1;</code>
     * @return The nonce.
     */
    public java.lang.String getNonce() {
      java.lang.Object ref = nonce_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nonce_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nonce = 1;</code>
     * @return The bytes for nonce.
     */
    public com.google.protobuf.ByteString
        getNonceBytes() {
      java.lang.Object ref = nonce_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nonce = 1;</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      
      nonce_ = getDefaultInstance().getNonce();
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 1;</code>
     * @param value The bytes for nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nonce_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object threadStackTrace_ = "";
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @return Whether the threadStackTrace field is set.
     */
    public boolean hasThreadStackTrace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @return The threadStackTrace.
     */
    public java.lang.String getThreadStackTrace() {
      java.lang.Object ref = threadStackTrace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        threadStackTrace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @return The bytes for threadStackTrace.
     */
    public com.google.protobuf.ByteString
        getThreadStackTraceBytes() {
      java.lang.Object ref = threadStackTrace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        threadStackTrace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @param value The threadStackTrace to set.
     * @return This builder for chaining.
     */
    public Builder setThreadStackTrace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      threadStackTrace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadStackTrace() {
      bitField0_ = (bitField0_ & ~0x00000001);
      threadStackTrace_ = getDefaultInstance().getThreadStackTrace();
      onChanged();
      return this;
    }
    /**
     * <code>optional string thread_stack_trace = 2;</code>
     * @param value The bytes for threadStackTrace to set.
     * @return This builder for chaining.
     */
    public Builder setThreadStackTraceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      threadStackTrace_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.ThreadStackTrace)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.ThreadStackTrace)
  private static final apache.rocketmq.v2.ThreadStackTrace DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.ThreadStackTrace();
  }

  public static apache.rocketmq.v2.ThreadStackTrace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadStackTrace>
      PARSER = new com.google.protobuf.AbstractParser<ThreadStackTrace>() {
    @java.lang.Override
    public ThreadStackTrace parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThreadStackTrace(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThreadStackTrace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadStackTrace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.ThreadStackTrace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

