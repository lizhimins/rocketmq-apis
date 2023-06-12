// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.QueryOffsetRequest}
 */
public final class QueryOffsetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.QueryOffsetRequest)
    QueryOffsetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOffsetRequest.newBuilder() to construct.
  private QueryOffsetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOffsetRequest() {
    queryOffsetPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOffsetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryOffsetRequest(
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
            apache.rocketmq.v2.MessageQueue.Builder subBuilder = null;
            if (messageQueue_ != null) {
              subBuilder = messageQueue_.toBuilder();
            }
            messageQueue_ = input.readMessage(apache.rocketmq.v2.MessageQueue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(messageQueue_);
              messageQueue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            queryOffsetPolicy_ = rawValue;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = timestamp_.toBuilder();
            }
            timestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestamp_);
              timestamp_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryOffsetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryOffsetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.QueryOffsetRequest.class, apache.rocketmq.v2.QueryOffsetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_QUEUE_FIELD_NUMBER = 1;
  private apache.rocketmq.v2.MessageQueue messageQueue_;
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   * @return Whether the messageQueue field is set.
   */
  @java.lang.Override
  public boolean hasMessageQueue() {
    return messageQueue_ != null;
  }
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   * @return The messageQueue.
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueue getMessageQueue() {
    return messageQueue_ == null ? apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
  }
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder() {
    return getMessageQueue();
  }

  public static final int QUERY_OFFSET_POLICY_FIELD_NUMBER = 2;
  private int queryOffsetPolicy_;
  /**
   * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
   * @return The enum numeric value on the wire for queryOffsetPolicy.
   */
  @java.lang.Override public int getQueryOffsetPolicyValue() {
    return queryOffsetPolicy_;
  }
  /**
   * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
   * @return The queryOffsetPolicy.
   */
  @java.lang.Override public apache.rocketmq.v2.QueryOffsetPolicy getQueryOffsetPolicy() {
    @SuppressWarnings("deprecation")
    apache.rocketmq.v2.QueryOffsetPolicy result = apache.rocketmq.v2.QueryOffsetPolicy.valueOf(queryOffsetPolicy_);
    return result == null ? apache.rocketmq.v2.QueryOffsetPolicy.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
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
    if (messageQueue_ != null) {
      output.writeMessage(1, getMessageQueue());
    }
    if (queryOffsetPolicy_ != apache.rocketmq.v2.QueryOffsetPolicy.BEGINNING.getNumber()) {
      output.writeEnum(2, queryOffsetPolicy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getTimestamp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageQueue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessageQueue());
    }
    if (queryOffsetPolicy_ != apache.rocketmq.v2.QueryOffsetPolicy.BEGINNING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, queryOffsetPolicy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTimestamp());
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
    if (!(obj instanceof apache.rocketmq.v2.QueryOffsetRequest)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.QueryOffsetRequest other = (apache.rocketmq.v2.QueryOffsetRequest) obj;

    if (hasMessageQueue() != other.hasMessageQueue()) return false;
    if (hasMessageQueue()) {
      if (!getMessageQueue()
          .equals(other.getMessageQueue())) return false;
    }
    if (queryOffsetPolicy_ != other.queryOffsetPolicy_) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
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
    if (hasMessageQueue()) {
      hash = (37 * hash) + MESSAGE_QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageQueue().hashCode();
    }
    hash = (37 * hash) + QUERY_OFFSET_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + queryOffsetPolicy_;
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryOffsetRequest parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.QueryOffsetRequest prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.QueryOffsetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.QueryOffsetRequest)
      apache.rocketmq.v2.QueryOffsetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryOffsetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryOffsetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.QueryOffsetRequest.class, apache.rocketmq.v2.QueryOffsetRequest.Builder.class);
    }

    // Construct using apache.rocketmq.v2.QueryOffsetRequest.newBuilder()
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
        getTimestampFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messageQueueBuilder_ == null) {
        messageQueue_ = null;
      } else {
        messageQueue_ = null;
        messageQueueBuilder_ = null;
      }
      queryOffsetPolicy_ = 0;

      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestampBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryOffsetRequest_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryOffsetRequest getDefaultInstanceForType() {
      return apache.rocketmq.v2.QueryOffsetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryOffsetRequest build() {
      apache.rocketmq.v2.QueryOffsetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryOffsetRequest buildPartial() {
      apache.rocketmq.v2.QueryOffsetRequest result = new apache.rocketmq.v2.QueryOffsetRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (messageQueueBuilder_ == null) {
        result.messageQueue_ = messageQueue_;
      } else {
        result.messageQueue_ = messageQueueBuilder_.build();
      }
      result.queryOffsetPolicy_ = queryOffsetPolicy_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (timestampBuilder_ == null) {
          result.timestamp_ = timestamp_;
        } else {
          result.timestamp_ = timestampBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof apache.rocketmq.v2.QueryOffsetRequest) {
        return mergeFrom((apache.rocketmq.v2.QueryOffsetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.QueryOffsetRequest other) {
      if (other == apache.rocketmq.v2.QueryOffsetRequest.getDefaultInstance()) return this;
      if (other.hasMessageQueue()) {
        mergeMessageQueue(other.getMessageQueue());
      }
      if (other.queryOffsetPolicy_ != 0) {
        setQueryOffsetPolicyValue(other.getQueryOffsetPolicyValue());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
      apache.rocketmq.v2.QueryOffsetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.QueryOffsetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private apache.rocketmq.v2.MessageQueue messageQueue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> messageQueueBuilder_;
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     * @return Whether the messageQueue field is set.
     */
    public boolean hasMessageQueue() {
      return messageQueueBuilder_ != null || messageQueue_ != null;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     * @return The messageQueue.
     */
    public apache.rocketmq.v2.MessageQueue getMessageQueue() {
      if (messageQueueBuilder_ == null) {
        return messageQueue_ == null ? apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
      } else {
        return messageQueueBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder setMessageQueue(apache.rocketmq.v2.MessageQueue value) {
      if (messageQueueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messageQueue_ = value;
        onChanged();
      } else {
        messageQueueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder setMessageQueue(
        apache.rocketmq.v2.MessageQueue.Builder builderForValue) {
      if (messageQueueBuilder_ == null) {
        messageQueue_ = builderForValue.build();
        onChanged();
      } else {
        messageQueueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder mergeMessageQueue(apache.rocketmq.v2.MessageQueue value) {
      if (messageQueueBuilder_ == null) {
        if (messageQueue_ != null) {
          messageQueue_ =
            apache.rocketmq.v2.MessageQueue.newBuilder(messageQueue_).mergeFrom(value).buildPartial();
        } else {
          messageQueue_ = value;
        }
        onChanged();
      } else {
        messageQueueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder clearMessageQueue() {
      if (messageQueueBuilder_ == null) {
        messageQueue_ = null;
        onChanged();
      } else {
        messageQueue_ = null;
        messageQueueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public apache.rocketmq.v2.MessageQueue.Builder getMessageQueueBuilder() {
      
      onChanged();
      return getMessageQueueFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder() {
      if (messageQueueBuilder_ != null) {
        return messageQueueBuilder_.getMessageOrBuilder();
      } else {
        return messageQueue_ == null ?
            apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
      }
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> 
        getMessageQueueFieldBuilder() {
      if (messageQueueBuilder_ == null) {
        messageQueueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder>(
                getMessageQueue(),
                getParentForChildren(),
                isClean());
        messageQueue_ = null;
      }
      return messageQueueBuilder_;
    }

    private int queryOffsetPolicy_ = 0;
    /**
     * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
     * @return The enum numeric value on the wire for queryOffsetPolicy.
     */
    @java.lang.Override public int getQueryOffsetPolicyValue() {
      return queryOffsetPolicy_;
    }
    /**
     * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
     * @param value The enum numeric value on the wire for queryOffsetPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setQueryOffsetPolicyValue(int value) {
      
      queryOffsetPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
     * @return The queryOffsetPolicy.
     */
    @java.lang.Override
    public apache.rocketmq.v2.QueryOffsetPolicy getQueryOffsetPolicy() {
      @SuppressWarnings("deprecation")
      apache.rocketmq.v2.QueryOffsetPolicy result = apache.rocketmq.v2.QueryOffsetPolicy.valueOf(queryOffsetPolicy_);
      return result == null ? apache.rocketmq.v2.QueryOffsetPolicy.UNRECOGNIZED : result;
    }
    /**
     * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
     * @param value The queryOffsetPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setQueryOffsetPolicy(apache.rocketmq.v2.QueryOffsetPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      queryOffsetPolicy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.QueryOffsetPolicy query_offset_policy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryOffsetPolicy() {
      
      queryOffsetPolicy_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            timestamp_ != null &&
            timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          timestamp_ =
            com.google.protobuf.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestampBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.QueryOffsetRequest)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.QueryOffsetRequest)
  private static final apache.rocketmq.v2.QueryOffsetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.QueryOffsetRequest();
  }

  public static apache.rocketmq.v2.QueryOffsetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOffsetRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryOffsetRequest>() {
    @java.lang.Override
    public QueryOffsetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryOffsetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryOffsetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOffsetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.QueryOffsetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

