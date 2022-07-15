// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.ChangeInvisibleDurationResponse}
 */
public final class ChangeInvisibleDurationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.ChangeInvisibleDurationResponse)
    ChangeInvisibleDurationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeInvisibleDurationResponse.newBuilder() to construct.
  private ChangeInvisibleDurationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeInvisibleDurationResponse() {
    receiptHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeInvisibleDurationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeInvisibleDurationResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            apache.rocketmq.v2.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(apache.rocketmq.v2.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            receiptHandle_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ChangeInvisibleDurationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ChangeInvisibleDurationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.ChangeInvisibleDurationResponse.class, apache.rocketmq.v2.ChangeInvisibleDurationResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private apache.rocketmq.v2.Status status_;
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public apache.rocketmq.v2.Status getStatus() {
    return status_ == null ? apache.rocketmq.v2.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int RECEIPT_HANDLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object receiptHandle_;
  /**
   * <pre>
   * Server may generate a new receipt handle for the message.
   * </pre>
   *
   * <code>string receipt_handle = 2;</code>
   * @return The receiptHandle.
   */
  @java.lang.Override
  public java.lang.String getReceiptHandle() {
    java.lang.Object ref = receiptHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiptHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Server may generate a new receipt handle for the message.
   * </pre>
   *
   * <code>string receipt_handle = 2;</code>
   * @return The bytes for receiptHandle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiptHandleBytes() {
    java.lang.Object ref = receiptHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiptHandle_ = b;
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiptHandle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiptHandle_);
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
    if (!(obj instanceof apache.rocketmq.v2.ChangeInvisibleDurationResponse)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.ChangeInvisibleDurationResponse other = (apache.rocketmq.v2.ChangeInvisibleDurationResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getReceiptHandle()
        .equals(other.getReceiptHandle())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (37 * hash) + RECEIPT_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getReceiptHandle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.ChangeInvisibleDurationResponse prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.ChangeInvisibleDurationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.ChangeInvisibleDurationResponse)
      apache.rocketmq.v2.ChangeInvisibleDurationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ChangeInvisibleDurationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ChangeInvisibleDurationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.ChangeInvisibleDurationResponse.class, apache.rocketmq.v2.ChangeInvisibleDurationResponse.Builder.class);
    }

    // Construct using apache.rocketmq.v2.ChangeInvisibleDurationResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      receiptHandle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_ChangeInvisibleDurationResponse_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ChangeInvisibleDurationResponse getDefaultInstanceForType() {
      return apache.rocketmq.v2.ChangeInvisibleDurationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.ChangeInvisibleDurationResponse build() {
      apache.rocketmq.v2.ChangeInvisibleDurationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ChangeInvisibleDurationResponse buildPartial() {
      apache.rocketmq.v2.ChangeInvisibleDurationResponse result = new apache.rocketmq.v2.ChangeInvisibleDurationResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.receiptHandle_ = receiptHandle_;
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
      if (other instanceof apache.rocketmq.v2.ChangeInvisibleDurationResponse) {
        return mergeFrom((apache.rocketmq.v2.ChangeInvisibleDurationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.ChangeInvisibleDurationResponse other) {
      if (other == apache.rocketmq.v2.ChangeInvisibleDurationResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (!other.getReceiptHandle().isEmpty()) {
        receiptHandle_ = other.receiptHandle_;
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
      apache.rocketmq.v2.ChangeInvisibleDurationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.ChangeInvisibleDurationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private apache.rocketmq.v2.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Status, apache.rocketmq.v2.Status.Builder, apache.rocketmq.v2.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     * @return The status.
     */
    public apache.rocketmq.v2.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? apache.rocketmq.v2.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public Builder setStatus(apache.rocketmq.v2.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public Builder setStatus(
        apache.rocketmq.v2.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public Builder mergeStatus(apache.rocketmq.v2.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            apache.rocketmq.v2.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public apache.rocketmq.v2.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    public apache.rocketmq.v2.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            apache.rocketmq.v2.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.apache.rocketmq.v2.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Status, apache.rocketmq.v2.Status.Builder, apache.rocketmq.v2.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.Status, apache.rocketmq.v2.Status.Builder, apache.rocketmq.v2.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.lang.Object receiptHandle_ = "";
    /**
     * <pre>
     * Server may generate a new receipt handle for the message.
     * </pre>
     *
     * <code>string receipt_handle = 2;</code>
     * @return The receiptHandle.
     */
    public java.lang.String getReceiptHandle() {
      java.lang.Object ref = receiptHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiptHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Server may generate a new receipt handle for the message.
     * </pre>
     *
     * <code>string receipt_handle = 2;</code>
     * @return The bytes for receiptHandle.
     */
    public com.google.protobuf.ByteString
        getReceiptHandleBytes() {
      java.lang.Object ref = receiptHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiptHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Server may generate a new receipt handle for the message.
     * </pre>
     *
     * <code>string receipt_handle = 2;</code>
     * @param value The receiptHandle to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receiptHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server may generate a new receipt handle for the message.
     * </pre>
     *
     * <code>string receipt_handle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiptHandle() {
      
      receiptHandle_ = getDefaultInstance().getReceiptHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server may generate a new receipt handle for the message.
     * </pre>
     *
     * <code>string receipt_handle = 2;</code>
     * @param value The bytes for receiptHandle to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receiptHandle_ = value;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.ChangeInvisibleDurationResponse)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.ChangeInvisibleDurationResponse)
  private static final apache.rocketmq.v2.ChangeInvisibleDurationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.ChangeInvisibleDurationResponse();
  }

  public static apache.rocketmq.v2.ChangeInvisibleDurationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeInvisibleDurationResponse>
      PARSER = new com.google.protobuf.AbstractParser<ChangeInvisibleDurationResponse>() {
    @java.lang.Override
    public ChangeInvisibleDurationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeInvisibleDurationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeInvisibleDurationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeInvisibleDurationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.ChangeInvisibleDurationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

