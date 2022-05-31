// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.AckMessageResultEntry}
 */
public final class AckMessageResultEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.AckMessageResultEntry)
    AckMessageResultEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AckMessageResultEntry.newBuilder() to construct.
  private AckMessageResultEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AckMessageResultEntry() {
    messageId_ = "";
    receiptHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AckMessageResultEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AckMessageResultEntry(
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
            java.lang.String s = input.readStringRequireUtf8();

            messageId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            receiptHandle_ = s;
            break;
          }
          case 26: {
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
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_AckMessageResultEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_AckMessageResultEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.AckMessageResultEntry.class, apache.rocketmq.v2.AckMessageResultEntry.Builder.class);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object messageId_;
  /**
   * <code>string message_id = 1;</code>
   * @return The messageId.
   */
  @java.lang.Override
  public java.lang.String getMessageId() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageId_ = s;
      return s;
    }
  }
  /**
   * <code>string message_id = 1;</code>
   * @return The bytes for messageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageIdBytes() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIPT_HANDLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object receiptHandle_;
  /**
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

  public static final int STATUS_FIELD_NUMBER = 3;
  private apache.rocketmq.v2.Status status_;
  /**
   * <pre>
   * Acknowledge result may be acquired through inspecting
   * `status.code`; In case acknowledgement failed, `status.message`
   * is the explanation of the failure.
   * </pre>
   *
   * <code>.apache.rocketmq.v2.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Acknowledge result may be acquired through inspecting
   * `status.code`; In case acknowledgement failed, `status.message`
   * is the explanation of the failure.
   * </pre>
   *
   * <code>.apache.rocketmq.v2.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public apache.rocketmq.v2.Status getStatus() {
    return status_ == null ? apache.rocketmq.v2.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Acknowledge result may be acquired through inspecting
   * `status.code`; In case acknowledgement failed, `status.message`
   * is the explanation of the failure.
   * </pre>
   *
   * <code>.apache.rocketmq.v2.Status status = 3;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiptHandle_);
    }
    if (status_ != null) {
      output.writeMessage(3, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiptHandle_);
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
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
    if (!(obj instanceof apache.rocketmq.v2.AckMessageResultEntry)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.AckMessageResultEntry other = (apache.rocketmq.v2.AckMessageResultEntry) obj;

    if (!getMessageId()
        .equals(other.getMessageId())) return false;
    if (!getReceiptHandle()
        .equals(other.getReceiptHandle())) return false;
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageId().hashCode();
    hash = (37 * hash) + RECEIPT_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getReceiptHandle().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.AckMessageResultEntry parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.AckMessageResultEntry prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.AckMessageResultEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.AckMessageResultEntry)
      apache.rocketmq.v2.AckMessageResultEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_AckMessageResultEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_AckMessageResultEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.AckMessageResultEntry.class, apache.rocketmq.v2.AckMessageResultEntry.Builder.class);
    }

    // Construct using apache.rocketmq.v2.AckMessageResultEntry.newBuilder()
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
      messageId_ = "";

      receiptHandle_ = "";

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_AckMessageResultEntry_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.AckMessageResultEntry getDefaultInstanceForType() {
      return apache.rocketmq.v2.AckMessageResultEntry.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.AckMessageResultEntry build() {
      apache.rocketmq.v2.AckMessageResultEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.AckMessageResultEntry buildPartial() {
      apache.rocketmq.v2.AckMessageResultEntry result = new apache.rocketmq.v2.AckMessageResultEntry(this);
      result.messageId_ = messageId_;
      result.receiptHandle_ = receiptHandle_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
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
      if (other instanceof apache.rocketmq.v2.AckMessageResultEntry) {
        return mergeFrom((apache.rocketmq.v2.AckMessageResultEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.AckMessageResultEntry other) {
      if (other == apache.rocketmq.v2.AckMessageResultEntry.getDefaultInstance()) return this;
      if (!other.getMessageId().isEmpty()) {
        messageId_ = other.messageId_;
        onChanged();
      }
      if (!other.getReceiptHandle().isEmpty()) {
        receiptHandle_ = other.receiptHandle_;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      apache.rocketmq.v2.AckMessageResultEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.AckMessageResultEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object messageId_ = "";
    /**
     * <code>string message_id = 1;</code>
     * @return The messageId.
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message_id = 1;</code>
     * @return The bytes for messageId.
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message_id = 1;</code>
     * @param value The messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageId() {
      
      messageId_ = getDefaultInstance().getMessageId();
      onChanged();
      return this;
    }
    /**
     * <code>string message_id = 1;</code>
     * @param value The bytes for messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object receiptHandle_ = "";
    /**
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
     * <code>string receipt_handle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiptHandle() {
      
      receiptHandle_ = getDefaultInstance().getReceiptHandle();
      onChanged();
      return this;
    }
    /**
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

    private apache.rocketmq.v2.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Status, apache.rocketmq.v2.Status.Builder, apache.rocketmq.v2.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
     */
    public apache.rocketmq.v2.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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
     * <pre>
     * Acknowledge result may be acquired through inspecting
     * `status.code`; In case acknowledgement failed, `status.message`
     * is the explanation of the failure.
     * </pre>
     *
     * <code>.apache.rocketmq.v2.Status status = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.AckMessageResultEntry)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.AckMessageResultEntry)
  private static final apache.rocketmq.v2.AckMessageResultEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.AckMessageResultEntry();
  }

  public static apache.rocketmq.v2.AckMessageResultEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AckMessageResultEntry>
      PARSER = new com.google.protobuf.AbstractParser<AckMessageResultEntry>() {
    @java.lang.Override
    public AckMessageResultEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AckMessageResultEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AckMessageResultEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AckMessageResultEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.AckMessageResultEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
