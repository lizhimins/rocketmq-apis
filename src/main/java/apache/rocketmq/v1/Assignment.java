// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

/**
 * Protobuf type {@code apache.rocketmq.v1.Assignment}
 */
public final class Assignment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v1.Assignment)
    AssignmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Assignment.newBuilder() to construct.
  private Assignment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Assignment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Assignment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Assignment(
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
            apache.rocketmq.v1.Partition.Builder subBuilder = null;
            if (partition_ != null) {
              subBuilder = partition_.toBuilder();
            }
            partition_ = input.readMessage(apache.rocketmq.v1.Partition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partition_);
              partition_ = subBuilder.buildPartial();
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
    return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Assignment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Assignment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v1.Assignment.class, apache.rocketmq.v1.Assignment.Builder.class);
  }

  public static final int PARTITION_FIELD_NUMBER = 1;
  private apache.rocketmq.v1.Partition partition_;
  /**
   * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
   * @return Whether the partition field is set.
   */
  @java.lang.Override
  public boolean hasPartition() {
    return partition_ != null;
  }
  /**
   * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
   * @return The partition.
   */
  @java.lang.Override
  public apache.rocketmq.v1.Partition getPartition() {
    return partition_ == null ? apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
  }
  /**
   * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.PartitionOrBuilder getPartitionOrBuilder() {
    return getPartition();
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
    if (partition_ != null) {
      output.writeMessage(1, getPartition());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPartition());
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
    if (!(obj instanceof apache.rocketmq.v1.Assignment)) {
      return super.equals(obj);
    }
    apache.rocketmq.v1.Assignment other = (apache.rocketmq.v1.Assignment) obj;

    if (hasPartition() != other.hasPartition()) return false;
    if (hasPartition()) {
      if (!getPartition()
          .equals(other.getPartition())) return false;
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
    if (hasPartition()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v1.Assignment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.Assignment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Assignment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Assignment parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v1.Assignment prototype) {
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
   * Protobuf type {@code apache.rocketmq.v1.Assignment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v1.Assignment)
      apache.rocketmq.v1.AssignmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Assignment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Assignment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v1.Assignment.class, apache.rocketmq.v1.Assignment.Builder.class);
    }

    // Construct using apache.rocketmq.v1.Assignment.newBuilder()
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
      if (partitionBuilder_ == null) {
        partition_ = null;
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Assignment_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v1.Assignment getDefaultInstanceForType() {
      return apache.rocketmq.v1.Assignment.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v1.Assignment build() {
      apache.rocketmq.v1.Assignment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v1.Assignment buildPartial() {
      apache.rocketmq.v1.Assignment result = new apache.rocketmq.v1.Assignment(this);
      if (partitionBuilder_ == null) {
        result.partition_ = partition_;
      } else {
        result.partition_ = partitionBuilder_.build();
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
      if (other instanceof apache.rocketmq.v1.Assignment) {
        return mergeFrom((apache.rocketmq.v1.Assignment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v1.Assignment other) {
      if (other == apache.rocketmq.v1.Assignment.getDefaultInstance()) return this;
      if (other.hasPartition()) {
        mergePartition(other.getPartition());
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
      apache.rocketmq.v1.Assignment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v1.Assignment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private apache.rocketmq.v1.Partition partition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder> partitionBuilder_;
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     * @return Whether the partition field is set.
     */
    public boolean hasPartition() {
      return partitionBuilder_ != null || partition_ != null;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     * @return The partition.
     */
    public apache.rocketmq.v1.Partition getPartition() {
      if (partitionBuilder_ == null) {
        return partition_ == null ? apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
      } else {
        return partitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public Builder setPartition(apache.rocketmq.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partition_ = value;
        onChanged();
      } else {
        partitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public Builder setPartition(
        apache.rocketmq.v1.Partition.Builder builderForValue) {
      if (partitionBuilder_ == null) {
        partition_ = builderForValue.build();
        onChanged();
      } else {
        partitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public Builder mergePartition(apache.rocketmq.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (partition_ != null) {
          partition_ =
            apache.rocketmq.v1.Partition.newBuilder(partition_).mergeFrom(value).buildPartial();
        } else {
          partition_ = value;
        }
        onChanged();
      } else {
        partitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public Builder clearPartition() {
      if (partitionBuilder_ == null) {
        partition_ = null;
        onChanged();
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public apache.rocketmq.v1.Partition.Builder getPartitionBuilder() {
      
      onChanged();
      return getPartitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    public apache.rocketmq.v1.PartitionOrBuilder getPartitionOrBuilder() {
      if (partitionBuilder_ != null) {
        return partitionBuilder_.getMessageOrBuilder();
      } else {
        return partition_ == null ?
            apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Partition Partition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder> 
        getPartitionFieldBuilder() {
      if (partitionBuilder_ == null) {
        partitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder>(
                getPartition(),
                getParentForChildren(),
                isClean());
        partition_ = null;
      }
      return partitionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v1.Assignment)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v1.Assignment)
  private static final apache.rocketmq.v1.Assignment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v1.Assignment();
  }

  public static apache.rocketmq.v1.Assignment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Assignment>
      PARSER = new com.google.protobuf.AbstractParser<Assignment>() {
    @java.lang.Override
    public Assignment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Assignment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Assignment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Assignment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v1.Assignment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

