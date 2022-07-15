// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

/**
 * Protobuf type {@code apache.rocketmq.v1.ChangeInvisibleDurationRequest}
 */
public final class ChangeInvisibleDurationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v1.ChangeInvisibleDurationRequest)
    ChangeInvisibleDurationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeInvisibleDurationRequest.newBuilder() to construct.
  private ChangeInvisibleDurationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeInvisibleDurationRequest() {
    receiptHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeInvisibleDurationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeInvisibleDurationRequest(
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
            apache.rocketmq.v1.Resource.Builder subBuilder = null;
            if (group_ != null) {
              subBuilder = group_.toBuilder();
            }
            group_ = input.readMessage(apache.rocketmq.v1.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(group_);
              group_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            apache.rocketmq.v1.Resource.Builder subBuilder = null;
            if (topic_ != null) {
              subBuilder = topic_.toBuilder();
            }
            topic_ = input.readMessage(apache.rocketmq.v1.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(topic_);
              topic_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            receiptHandle_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (invisibleDuration_ != null) {
              subBuilder = invisibleDuration_.toBuilder();
            }
            invisibleDuration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(invisibleDuration_);
              invisibleDuration_ = subBuilder.buildPartial();
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
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_ChangeInvisibleDurationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_ChangeInvisibleDurationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v1.ChangeInvisibleDurationRequest.class, apache.rocketmq.v1.ChangeInvisibleDurationRequest.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  private apache.rocketmq.v1.Resource group_;
  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   * @return Whether the group field is set.
   */
  @java.lang.Override
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   * @return The group.
   */
  @java.lang.Override
  public apache.rocketmq.v1.Resource getGroup() {
    return group_ == null ? apache.rocketmq.v1.Resource.getDefaultInstance() : group_;
  }
  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.ResourceOrBuilder getGroupOrBuilder() {
    return getGroup();
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private apache.rocketmq.v1.Resource topic_;
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return topic_ != null;
  }
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   * @return The topic.
   */
  @java.lang.Override
  public apache.rocketmq.v1.Resource getTopic() {
    return topic_ == null ? apache.rocketmq.v1.Resource.getDefaultInstance() : topic_;
  }
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.ResourceOrBuilder getTopicOrBuilder() {
    return getTopic();
  }

  public static final int RECEIPT_HANDLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object receiptHandle_;
  /**
   * <pre>
   * Unique receipt handle to identify message to change
   * </pre>
   *
   * <code>string receipt_handle = 3;</code>
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
   * Unique receipt handle to identify message to change
   * </pre>
   *
   * <code>string receipt_handle = 3;</code>
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

  public static final int INVISIBLE_DURATION_FIELD_NUMBER = 4;
  private com.google.protobuf.Duration invisibleDuration_;
  /**
   * <pre>
   * New invisible duration
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_duration = 4;</code>
   * @return Whether the invisibleDuration field is set.
   */
  @java.lang.Override
  public boolean hasInvisibleDuration() {
    return invisibleDuration_ != null;
  }
  /**
   * <pre>
   * New invisible duration
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_duration = 4;</code>
   * @return The invisibleDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getInvisibleDuration() {
    return invisibleDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : invisibleDuration_;
  }
  /**
   * <pre>
   * New invisible duration
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_duration = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getInvisibleDurationOrBuilder() {
    return getInvisibleDuration();
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
    if (group_ != null) {
      output.writeMessage(1, getGroup());
    }
    if (topic_ != null) {
      output.writeMessage(2, getTopic());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, receiptHandle_);
    }
    if (invisibleDuration_ != null) {
      output.writeMessage(4, getInvisibleDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroup());
    }
    if (topic_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTopic());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptHandle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, receiptHandle_);
    }
    if (invisibleDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getInvisibleDuration());
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
    if (!(obj instanceof apache.rocketmq.v1.ChangeInvisibleDurationRequest)) {
      return super.equals(obj);
    }
    apache.rocketmq.v1.ChangeInvisibleDurationRequest other = (apache.rocketmq.v1.ChangeInvisibleDurationRequest) obj;

    if (hasGroup() != other.hasGroup()) return false;
    if (hasGroup()) {
      if (!getGroup()
          .equals(other.getGroup())) return false;
    }
    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic()
          .equals(other.getTopic())) return false;
    }
    if (!getReceiptHandle()
        .equals(other.getReceiptHandle())) return false;
    if (hasInvisibleDuration() != other.hasInvisibleDuration()) return false;
    if (hasInvisibleDuration()) {
      if (!getInvisibleDuration()
          .equals(other.getInvisibleDuration())) return false;
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
    if (hasGroup()) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
    }
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    hash = (37 * hash) + RECEIPT_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getReceiptHandle().hashCode();
    if (hasInvisibleDuration()) {
      hash = (37 * hash) + INVISIBLE_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getInvisibleDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v1.ChangeInvisibleDurationRequest prototype) {
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
   * Protobuf type {@code apache.rocketmq.v1.ChangeInvisibleDurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v1.ChangeInvisibleDurationRequest)
      apache.rocketmq.v1.ChangeInvisibleDurationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_ChangeInvisibleDurationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_ChangeInvisibleDurationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v1.ChangeInvisibleDurationRequest.class, apache.rocketmq.v1.ChangeInvisibleDurationRequest.Builder.class);
    }

    // Construct using apache.rocketmq.v1.ChangeInvisibleDurationRequest.newBuilder()
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
      if (groupBuilder_ == null) {
        group_ = null;
      } else {
        group_ = null;
        groupBuilder_ = null;
      }
      if (topicBuilder_ == null) {
        topic_ = null;
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }
      receiptHandle_ = "";

      if (invisibleDurationBuilder_ == null) {
        invisibleDuration_ = null;
      } else {
        invisibleDuration_ = null;
        invisibleDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_ChangeInvisibleDurationRequest_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v1.ChangeInvisibleDurationRequest getDefaultInstanceForType() {
      return apache.rocketmq.v1.ChangeInvisibleDurationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v1.ChangeInvisibleDurationRequest build() {
      apache.rocketmq.v1.ChangeInvisibleDurationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v1.ChangeInvisibleDurationRequest buildPartial() {
      apache.rocketmq.v1.ChangeInvisibleDurationRequest result = new apache.rocketmq.v1.ChangeInvisibleDurationRequest(this);
      if (groupBuilder_ == null) {
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      if (topicBuilder_ == null) {
        result.topic_ = topic_;
      } else {
        result.topic_ = topicBuilder_.build();
      }
      result.receiptHandle_ = receiptHandle_;
      if (invisibleDurationBuilder_ == null) {
        result.invisibleDuration_ = invisibleDuration_;
      } else {
        result.invisibleDuration_ = invisibleDurationBuilder_.build();
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
      if (other instanceof apache.rocketmq.v1.ChangeInvisibleDurationRequest) {
        return mergeFrom((apache.rocketmq.v1.ChangeInvisibleDurationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v1.ChangeInvisibleDurationRequest other) {
      if (other == apache.rocketmq.v1.ChangeInvisibleDurationRequest.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
      }
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (!other.getReceiptHandle().isEmpty()) {
        receiptHandle_ = other.receiptHandle_;
        onChanged();
      }
      if (other.hasInvisibleDuration()) {
        mergeInvisibleDuration(other.getInvisibleDuration());
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
      apache.rocketmq.v1.ChangeInvisibleDurationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v1.ChangeInvisibleDurationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private apache.rocketmq.v1.Resource group_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder> groupBuilder_;
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     * @return Whether the group field is set.
     */
    public boolean hasGroup() {
      return groupBuilder_ != null || group_ != null;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     * @return The group.
     */
    public apache.rocketmq.v1.Resource getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? apache.rocketmq.v1.Resource.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public Builder setGroup(apache.rocketmq.v1.Resource value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
        onChanged();
      } else {
        groupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public Builder setGroup(
        apache.rocketmq.v1.Resource.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
        onChanged();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public Builder mergeGroup(apache.rocketmq.v1.Resource value) {
      if (groupBuilder_ == null) {
        if (group_ != null) {
          group_ =
            apache.rocketmq.v1.Resource.newBuilder(group_).mergeFrom(value).buildPartial();
        } else {
          group_ = value;
        }
        onChanged();
      } else {
        groupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = null;
        onChanged();
      } else {
        group_ = null;
        groupBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public apache.rocketmq.v1.Resource.Builder getGroupBuilder() {
      
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    public apache.rocketmq.v1.ResourceOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            apache.rocketmq.v1.Resource.getDefaultInstance() : group_;
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Resource group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private apache.rocketmq.v1.Resource topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder> topicBuilder_;
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return topicBuilder_ != null || topic_ != null;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     * @return The topic.
     */
    public apache.rocketmq.v1.Resource getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? apache.rocketmq.v1.Resource.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public Builder setTopic(apache.rocketmq.v1.Resource value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        topicBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public Builder setTopic(
        apache.rocketmq.v1.Resource.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public Builder mergeTopic(apache.rocketmq.v1.Resource value) {
      if (topicBuilder_ == null) {
        if (topic_ != null) {
          topic_ =
            apache.rocketmq.v1.Resource.newBuilder(topic_).mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        topicBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public Builder clearTopic() {
      if (topicBuilder_ == null) {
        topic_ = null;
        onChanged();
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public apache.rocketmq.v1.Resource.Builder getTopicBuilder() {
      
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    public apache.rocketmq.v1.ResourceOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            apache.rocketmq.v1.Resource.getDefaultInstance() : topic_;
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.Resource, apache.rocketmq.v1.Resource.Builder, apache.rocketmq.v1.ResourceOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
    }

    private java.lang.Object receiptHandle_ = "";
    /**
     * <pre>
     * Unique receipt handle to identify message to change
     * </pre>
     *
     * <code>string receipt_handle = 3;</code>
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
     * Unique receipt handle to identify message to change
     * </pre>
     *
     * <code>string receipt_handle = 3;</code>
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
     * Unique receipt handle to identify message to change
     * </pre>
     *
     * <code>string receipt_handle = 3;</code>
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
     * Unique receipt handle to identify message to change
     * </pre>
     *
     * <code>string receipt_handle = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiptHandle() {
      
      receiptHandle_ = getDefaultInstance().getReceiptHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique receipt handle to identify message to change
     * </pre>
     *
     * <code>string receipt_handle = 3;</code>
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

    private com.google.protobuf.Duration invisibleDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> invisibleDurationBuilder_;
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     * @return Whether the invisibleDuration field is set.
     */
    public boolean hasInvisibleDuration() {
      return invisibleDurationBuilder_ != null || invisibleDuration_ != null;
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     * @return The invisibleDuration.
     */
    public com.google.protobuf.Duration getInvisibleDuration() {
      if (invisibleDurationBuilder_ == null) {
        return invisibleDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : invisibleDuration_;
      } else {
        return invisibleDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public Builder setInvisibleDuration(com.google.protobuf.Duration value) {
      if (invisibleDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        invisibleDuration_ = value;
        onChanged();
      } else {
        invisibleDurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public Builder setInvisibleDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (invisibleDurationBuilder_ == null) {
        invisibleDuration_ = builderForValue.build();
        onChanged();
      } else {
        invisibleDurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public Builder mergeInvisibleDuration(com.google.protobuf.Duration value) {
      if (invisibleDurationBuilder_ == null) {
        if (invisibleDuration_ != null) {
          invisibleDuration_ =
            com.google.protobuf.Duration.newBuilder(invisibleDuration_).mergeFrom(value).buildPartial();
        } else {
          invisibleDuration_ = value;
        }
        onChanged();
      } else {
        invisibleDurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public Builder clearInvisibleDuration() {
      if (invisibleDurationBuilder_ == null) {
        invisibleDuration_ = null;
        onChanged();
      } else {
        invisibleDuration_ = null;
        invisibleDurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public com.google.protobuf.Duration.Builder getInvisibleDurationBuilder() {
      
      onChanged();
      return getInvisibleDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    public com.google.protobuf.DurationOrBuilder getInvisibleDurationOrBuilder() {
      if (invisibleDurationBuilder_ != null) {
        return invisibleDurationBuilder_.getMessageOrBuilder();
      } else {
        return invisibleDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : invisibleDuration_;
      }
    }
    /**
     * <pre>
     * New invisible duration
     * </pre>
     *
     * <code>.google.protobuf.Duration invisible_duration = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getInvisibleDurationFieldBuilder() {
      if (invisibleDurationBuilder_ == null) {
        invisibleDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getInvisibleDuration(),
                getParentForChildren(),
                isClean());
        invisibleDuration_ = null;
      }
      return invisibleDurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v1.ChangeInvisibleDurationRequest)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v1.ChangeInvisibleDurationRequest)
  private static final apache.rocketmq.v1.ChangeInvisibleDurationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v1.ChangeInvisibleDurationRequest();
  }

  public static apache.rocketmq.v1.ChangeInvisibleDurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeInvisibleDurationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeInvisibleDurationRequest>() {
    @java.lang.Override
    public ChangeInvisibleDurationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeInvisibleDurationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeInvisibleDurationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeInvisibleDurationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v1.ChangeInvisibleDurationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

