// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * <pre>
 * https://en.wikipedia.org/wiki/Exponential_backoff
 * </pre>
 *
 * Protobuf type {@code apache.rocketmq.v2.ExponentialBackoff}
 */
public final class ExponentialBackoff extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.ExponentialBackoff)
    ExponentialBackoffOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExponentialBackoff.newBuilder() to construct.
  private ExponentialBackoff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExponentialBackoff() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExponentialBackoff();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExponentialBackoff(
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
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (initial_ != null) {
              subBuilder = initial_.toBuilder();
            }
            initial_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(initial_);
              initial_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (max_ != null) {
              subBuilder = max_.toBuilder();
            }
            max_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(max_);
              max_ = subBuilder.buildPartial();
            }

            break;
          }
          case 29: {

            multiplier_ = input.readFloat();
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
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.ExponentialBackoff.class, apache.rocketmq.v2.ExponentialBackoff.Builder.class);
  }

  public static final int INITIAL_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration initial_;
  /**
   * <code>.google.protobuf.Duration initial = 1;</code>
   * @return Whether the initial field is set.
   */
  @java.lang.Override
  public boolean hasInitial() {
    return initial_ != null;
  }
  /**
   * <code>.google.protobuf.Duration initial = 1;</code>
   * @return The initial.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getInitial() {
    return initial_ == null ? com.google.protobuf.Duration.getDefaultInstance() : initial_;
  }
  /**
   * <code>.google.protobuf.Duration initial = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getInitialOrBuilder() {
    return getInitial();
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration max_;
  /**
   * <code>.google.protobuf.Duration max = 2;</code>
   * @return Whether the max field is set.
   */
  @java.lang.Override
  public boolean hasMax() {
    return max_ != null;
  }
  /**
   * <code>.google.protobuf.Duration max = 2;</code>
   * @return The max.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMax() {
    return max_ == null ? com.google.protobuf.Duration.getDefaultInstance() : max_;
  }
  /**
   * <code>.google.protobuf.Duration max = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMaxOrBuilder() {
    return getMax();
  }

  public static final int MULTIPLIER_FIELD_NUMBER = 3;
  private float multiplier_;
  /**
   * <code>float multiplier = 3;</code>
   * @return The multiplier.
   */
  @java.lang.Override
  public float getMultiplier() {
    return multiplier_;
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
    if (initial_ != null) {
      output.writeMessage(1, getInitial());
    }
    if (max_ != null) {
      output.writeMessage(2, getMax());
    }
    if (java.lang.Float.floatToRawIntBits(multiplier_) != 0) {
      output.writeFloat(3, multiplier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (initial_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInitial());
    }
    if (max_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMax());
    }
    if (java.lang.Float.floatToRawIntBits(multiplier_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, multiplier_);
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
    if (!(obj instanceof apache.rocketmq.v2.ExponentialBackoff)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.ExponentialBackoff other = (apache.rocketmq.v2.ExponentialBackoff) obj;

    if (hasInitial() != other.hasInitial()) return false;
    if (hasInitial()) {
      if (!getInitial()
          .equals(other.getInitial())) return false;
    }
    if (hasMax() != other.hasMax()) return false;
    if (hasMax()) {
      if (!getMax()
          .equals(other.getMax())) return false;
    }
    if (java.lang.Float.floatToIntBits(getMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getMultiplier())) return false;
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
    if (hasInitial()) {
      hash = (37 * hash) + INITIAL_FIELD_NUMBER;
      hash = (53 * hash) + getInitial().hashCode();
    }
    if (hasMax()) {
      hash = (37 * hash) + MAX_FIELD_NUMBER;
      hash = (53 * hash) + getMax().hashCode();
    }
    hash = (37 * hash) + MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMultiplier());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.ExponentialBackoff prototype) {
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
   * <pre>
   * https://en.wikipedia.org/wiki/Exponential_backoff
   * </pre>
   *
   * Protobuf type {@code apache.rocketmq.v2.ExponentialBackoff}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.ExponentialBackoff)
      apache.rocketmq.v2.ExponentialBackoffOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.ExponentialBackoff.class, apache.rocketmq.v2.ExponentialBackoff.Builder.class);
    }

    // Construct using apache.rocketmq.v2.ExponentialBackoff.newBuilder()
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
      if (initialBuilder_ == null) {
        initial_ = null;
      } else {
        initial_ = null;
        initialBuilder_ = null;
      }
      if (maxBuilder_ == null) {
        max_ = null;
      } else {
        max_ = null;
        maxBuilder_ = null;
      }
      multiplier_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff getDefaultInstanceForType() {
      return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff build() {
      apache.rocketmq.v2.ExponentialBackoff result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff buildPartial() {
      apache.rocketmq.v2.ExponentialBackoff result = new apache.rocketmq.v2.ExponentialBackoff(this);
      if (initialBuilder_ == null) {
        result.initial_ = initial_;
      } else {
        result.initial_ = initialBuilder_.build();
      }
      if (maxBuilder_ == null) {
        result.max_ = max_;
      } else {
        result.max_ = maxBuilder_.build();
      }
      result.multiplier_ = multiplier_;
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
      if (other instanceof apache.rocketmq.v2.ExponentialBackoff) {
        return mergeFrom((apache.rocketmq.v2.ExponentialBackoff)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.ExponentialBackoff other) {
      if (other == apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance()) return this;
      if (other.hasInitial()) {
        mergeInitial(other.getInitial());
      }
      if (other.hasMax()) {
        mergeMax(other.getMax());
      }
      if (other.getMultiplier() != 0F) {
        setMultiplier(other.getMultiplier());
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
      apache.rocketmq.v2.ExponentialBackoff parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.ExponentialBackoff) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration initial_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> initialBuilder_;
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     * @return Whether the initial field is set.
     */
    public boolean hasInitial() {
      return initialBuilder_ != null || initial_ != null;
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     * @return The initial.
     */
    public com.google.protobuf.Duration getInitial() {
      if (initialBuilder_ == null) {
        return initial_ == null ? com.google.protobuf.Duration.getDefaultInstance() : initial_;
      } else {
        return initialBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public Builder setInitial(com.google.protobuf.Duration value) {
      if (initialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        initial_ = value;
        onChanged();
      } else {
        initialBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public Builder setInitial(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (initialBuilder_ == null) {
        initial_ = builderForValue.build();
        onChanged();
      } else {
        initialBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public Builder mergeInitial(com.google.protobuf.Duration value) {
      if (initialBuilder_ == null) {
        if (initial_ != null) {
          initial_ =
            com.google.protobuf.Duration.newBuilder(initial_).mergeFrom(value).buildPartial();
        } else {
          initial_ = value;
        }
        onChanged();
      } else {
        initialBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public Builder clearInitial() {
      if (initialBuilder_ == null) {
        initial_ = null;
        onChanged();
      } else {
        initial_ = null;
        initialBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getInitialBuilder() {
      
      onChanged();
      return getInitialFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getInitialOrBuilder() {
      if (initialBuilder_ != null) {
        return initialBuilder_.getMessageOrBuilder();
      } else {
        return initial_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : initial_;
      }
    }
    /**
     * <code>.google.protobuf.Duration initial = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getInitialFieldBuilder() {
      if (initialBuilder_ == null) {
        initialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getInitial(),
                getParentForChildren(),
                isClean());
        initial_ = null;
      }
      return initialBuilder_;
    }

    private com.google.protobuf.Duration max_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> maxBuilder_;
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     * @return Whether the max field is set.
     */
    public boolean hasMax() {
      return maxBuilder_ != null || max_ != null;
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     * @return The max.
     */
    public com.google.protobuf.Duration getMax() {
      if (maxBuilder_ == null) {
        return max_ == null ? com.google.protobuf.Duration.getDefaultInstance() : max_;
      } else {
        return maxBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public Builder setMax(com.google.protobuf.Duration value) {
      if (maxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        max_ = value;
        onChanged();
      } else {
        maxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public Builder setMax(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (maxBuilder_ == null) {
        max_ = builderForValue.build();
        onChanged();
      } else {
        maxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public Builder mergeMax(com.google.protobuf.Duration value) {
      if (maxBuilder_ == null) {
        if (max_ != null) {
          max_ =
            com.google.protobuf.Duration.newBuilder(max_).mergeFrom(value).buildPartial();
        } else {
          max_ = value;
        }
        onChanged();
      } else {
        maxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public Builder clearMax() {
      if (maxBuilder_ == null) {
        max_ = null;
        onChanged();
      } else {
        max_ = null;
        maxBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getMaxBuilder() {
      
      onChanged();
      return getMaxFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getMaxOrBuilder() {
      if (maxBuilder_ != null) {
        return maxBuilder_.getMessageOrBuilder();
      } else {
        return max_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : max_;
      }
    }
    /**
     * <code>.google.protobuf.Duration max = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getMaxFieldBuilder() {
      if (maxBuilder_ == null) {
        maxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getMax(),
                getParentForChildren(),
                isClean());
        max_ = null;
      }
      return maxBuilder_;
    }

    private float multiplier_ ;
    /**
     * <code>float multiplier = 3;</code>
     * @return The multiplier.
     */
    @java.lang.Override
    public float getMultiplier() {
      return multiplier_;
    }
    /**
     * <code>float multiplier = 3;</code>
     * @param value The multiplier to set.
     * @return This builder for chaining.
     */
    public Builder setMultiplier(float value) {
      
      multiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float multiplier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiplier() {
      
      multiplier_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.ExponentialBackoff)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.ExponentialBackoff)
  private static final apache.rocketmq.v2.ExponentialBackoff DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.ExponentialBackoff();
  }

  public static apache.rocketmq.v2.ExponentialBackoff getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExponentialBackoff>
      PARSER = new com.google.protobuf.AbstractParser<ExponentialBackoff>() {
    @java.lang.Override
    public ExponentialBackoff parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExponentialBackoff(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExponentialBackoff> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExponentialBackoff> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.ExponentialBackoff getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

