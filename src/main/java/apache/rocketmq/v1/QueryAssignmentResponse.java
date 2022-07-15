// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

/**
 * Protobuf type {@code apache.rocketmq.v1.QueryAssignmentResponse}
 */
public final class QueryAssignmentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v1.QueryAssignmentResponse)
    QueryAssignmentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAssignmentResponse.newBuilder() to construct.
  private QueryAssignmentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAssignmentResponse() {
    assignments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAssignmentResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryAssignmentResponse(
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
            apache.rocketmq.v1.ResponseCommon.Builder subBuilder = null;
            if (common_ != null) {
              subBuilder = common_.toBuilder();
            }
            common_ = input.readMessage(apache.rocketmq.v1.ResponseCommon.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(common_);
              common_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              assignments_ = new java.util.ArrayList<apache.rocketmq.v1.Assignment>();
              mutable_bitField0_ |= 0x00000001;
            }
            assignments_.add(
                input.readMessage(apache.rocketmq.v1.Assignment.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        assignments_ = java.util.Collections.unmodifiableList(assignments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryAssignmentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryAssignmentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v1.QueryAssignmentResponse.class, apache.rocketmq.v1.QueryAssignmentResponse.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private apache.rocketmq.v1.ResponseCommon common_;
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
  }
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public apache.rocketmq.v1.ResponseCommon getCommon() {
    return common_ == null ? apache.rocketmq.v1.ResponseCommon.getDefaultInstance() : common_;
  }
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.ResponseCommonOrBuilder getCommonOrBuilder() {
    return getCommon();
  }

  public static final int ASSIGNMENTS_FIELD_NUMBER = 2;
  private java.util.List<apache.rocketmq.v1.Assignment> assignments_;
  /**
   * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<apache.rocketmq.v1.Assignment> getAssignmentsList() {
    return assignments_;
  }
  /**
   * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends apache.rocketmq.v1.AssignmentOrBuilder> 
      getAssignmentsOrBuilderList() {
    return assignments_;
  }
  /**
   * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
   */
  @java.lang.Override
  public int getAssignmentsCount() {
    return assignments_.size();
  }
  /**
   * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.Assignment getAssignments(int index) {
    return assignments_.get(index);
  }
  /**
   * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.AssignmentOrBuilder getAssignmentsOrBuilder(
      int index) {
    return assignments_.get(index);
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
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    for (int i = 0; i < assignments_.size(); i++) {
      output.writeMessage(2, assignments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    for (int i = 0; i < assignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, assignments_.get(i));
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
    if (!(obj instanceof apache.rocketmq.v1.QueryAssignmentResponse)) {
      return super.equals(obj);
    }
    apache.rocketmq.v1.QueryAssignmentResponse other = (apache.rocketmq.v1.QueryAssignmentResponse) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (!getAssignmentsList()
        .equals(other.getAssignmentsList())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (getAssignmentsCount() > 0) {
      hash = (37 * hash) + ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAssignmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryAssignmentResponse parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v1.QueryAssignmentResponse prototype) {
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
   * Protobuf type {@code apache.rocketmq.v1.QueryAssignmentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v1.QueryAssignmentResponse)
      apache.rocketmq.v1.QueryAssignmentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryAssignmentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryAssignmentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v1.QueryAssignmentResponse.class, apache.rocketmq.v1.QueryAssignmentResponse.Builder.class);
    }

    // Construct using apache.rocketmq.v1.QueryAssignmentResponse.newBuilder()
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
        getAssignmentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commonBuilder_ == null) {
        common_ = null;
      } else {
        common_ = null;
        commonBuilder_ = null;
      }
      if (assignmentsBuilder_ == null) {
        assignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        assignmentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryAssignmentResponse_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryAssignmentResponse getDefaultInstanceForType() {
      return apache.rocketmq.v1.QueryAssignmentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryAssignmentResponse build() {
      apache.rocketmq.v1.QueryAssignmentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryAssignmentResponse buildPartial() {
      apache.rocketmq.v1.QueryAssignmentResponse result = new apache.rocketmq.v1.QueryAssignmentResponse(this);
      int from_bitField0_ = bitField0_;
      if (commonBuilder_ == null) {
        result.common_ = common_;
      } else {
        result.common_ = commonBuilder_.build();
      }
      if (assignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          assignments_ = java.util.Collections.unmodifiableList(assignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.assignments_ = assignments_;
      } else {
        result.assignments_ = assignmentsBuilder_.build();
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
      if (other instanceof apache.rocketmq.v1.QueryAssignmentResponse) {
        return mergeFrom((apache.rocketmq.v1.QueryAssignmentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v1.QueryAssignmentResponse other) {
      if (other == apache.rocketmq.v1.QueryAssignmentResponse.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (assignmentsBuilder_ == null) {
        if (!other.assignments_.isEmpty()) {
          if (assignments_.isEmpty()) {
            assignments_ = other.assignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAssignmentsIsMutable();
            assignments_.addAll(other.assignments_);
          }
          onChanged();
        }
      } else {
        if (!other.assignments_.isEmpty()) {
          if (assignmentsBuilder_.isEmpty()) {
            assignmentsBuilder_.dispose();
            assignmentsBuilder_ = null;
            assignments_ = other.assignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            assignmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAssignmentsFieldBuilder() : null;
          } else {
            assignmentsBuilder_.addAllMessages(other.assignments_);
          }
        }
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
      apache.rocketmq.v1.QueryAssignmentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v1.QueryAssignmentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private apache.rocketmq.v1.ResponseCommon common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.ResponseCommon, apache.rocketmq.v1.ResponseCommon.Builder, apache.rocketmq.v1.ResponseCommonOrBuilder> commonBuilder_;
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return commonBuilder_ != null || common_ != null;
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     * @return The common.
     */
    public apache.rocketmq.v1.ResponseCommon getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? apache.rocketmq.v1.ResponseCommon.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public Builder setCommon(apache.rocketmq.v1.ResponseCommon value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
        onChanged();
      } else {
        commonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public Builder setCommon(
        apache.rocketmq.v1.ResponseCommon.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
        onChanged();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public Builder mergeCommon(apache.rocketmq.v1.ResponseCommon value) {
      if (commonBuilder_ == null) {
        if (common_ != null) {
          common_ =
            apache.rocketmq.v1.ResponseCommon.newBuilder(common_).mergeFrom(value).buildPartial();
        } else {
          common_ = value;
        }
        onChanged();
      } else {
        commonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public Builder clearCommon() {
      if (commonBuilder_ == null) {
        common_ = null;
        onChanged();
      } else {
        common_ = null;
        commonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public apache.rocketmq.v1.ResponseCommon.Builder getCommonBuilder() {
      
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    public apache.rocketmq.v1.ResponseCommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            apache.rocketmq.v1.ResponseCommon.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.ResponseCommon, apache.rocketmq.v1.ResponseCommon.Builder, apache.rocketmq.v1.ResponseCommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.ResponseCommon, apache.rocketmq.v1.ResponseCommon.Builder, apache.rocketmq.v1.ResponseCommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private java.util.List<apache.rocketmq.v1.Assignment> assignments_ =
      java.util.Collections.emptyList();
    private void ensureAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        assignments_ = new java.util.ArrayList<apache.rocketmq.v1.Assignment>(assignments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        apache.rocketmq.v1.Assignment, apache.rocketmq.v1.Assignment.Builder, apache.rocketmq.v1.AssignmentOrBuilder> assignmentsBuilder_;

    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public java.util.List<apache.rocketmq.v1.Assignment> getAssignmentsList() {
      if (assignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(assignments_);
      } else {
        return assignmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public int getAssignmentsCount() {
      if (assignmentsBuilder_ == null) {
        return assignments_.size();
      } else {
        return assignmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public apache.rocketmq.v1.Assignment getAssignments(int index) {
      if (assignmentsBuilder_ == null) {
        return assignments_.get(index);
      } else {
        return assignmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder setAssignments(
        int index, apache.rocketmq.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.set(index, value);
        onChanged();
      } else {
        assignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder setAssignments(
        int index, apache.rocketmq.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder addAssignments(apache.rocketmq.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.add(value);
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder addAssignments(
        int index, apache.rocketmq.v1.Assignment value) {
      if (assignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssignmentsIsMutable();
        assignments_.add(index, value);
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder addAssignments(
        apache.rocketmq.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.add(builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder addAssignments(
        int index, apache.rocketmq.v1.Assignment.Builder builderForValue) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        assignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder addAllAssignments(
        java.lang.Iterable<? extends apache.rocketmq.v1.Assignment> values) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, assignments_);
        onChanged();
      } else {
        assignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder clearAssignments() {
      if (assignmentsBuilder_ == null) {
        assignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        assignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public Builder removeAssignments(int index) {
      if (assignmentsBuilder_ == null) {
        ensureAssignmentsIsMutable();
        assignments_.remove(index);
        onChanged();
      } else {
        assignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public apache.rocketmq.v1.Assignment.Builder getAssignmentsBuilder(
        int index) {
      return getAssignmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public apache.rocketmq.v1.AssignmentOrBuilder getAssignmentsOrBuilder(
        int index) {
      if (assignmentsBuilder_ == null) {
        return assignments_.get(index);  } else {
        return assignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public java.util.List<? extends apache.rocketmq.v1.AssignmentOrBuilder> 
         getAssignmentsOrBuilderList() {
      if (assignmentsBuilder_ != null) {
        return assignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(assignments_);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public apache.rocketmq.v1.Assignment.Builder addAssignmentsBuilder() {
      return getAssignmentsFieldBuilder().addBuilder(
          apache.rocketmq.v1.Assignment.getDefaultInstance());
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public apache.rocketmq.v1.Assignment.Builder addAssignmentsBuilder(
        int index) {
      return getAssignmentsFieldBuilder().addBuilder(
          index, apache.rocketmq.v1.Assignment.getDefaultInstance());
    }
    /**
     * <code>repeated .apache.rocketmq.v1.Assignment assignments = 2;</code>
     */
    public java.util.List<apache.rocketmq.v1.Assignment.Builder> 
         getAssignmentsBuilderList() {
      return getAssignmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        apache.rocketmq.v1.Assignment, apache.rocketmq.v1.Assignment.Builder, apache.rocketmq.v1.AssignmentOrBuilder> 
        getAssignmentsFieldBuilder() {
      if (assignmentsBuilder_ == null) {
        assignmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            apache.rocketmq.v1.Assignment, apache.rocketmq.v1.Assignment.Builder, apache.rocketmq.v1.AssignmentOrBuilder>(
                assignments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        assignments_ = null;
      }
      return assignmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v1.QueryAssignmentResponse)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v1.QueryAssignmentResponse)
  private static final apache.rocketmq.v1.QueryAssignmentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v1.QueryAssignmentResponse();
  }

  public static apache.rocketmq.v1.QueryAssignmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAssignmentResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAssignmentResponse>() {
    @java.lang.Override
    public QueryAssignmentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryAssignmentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryAssignmentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAssignmentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v1.QueryAssignmentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

