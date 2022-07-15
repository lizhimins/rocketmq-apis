// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.Metric}
 */
public final class Metric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.Metric)
    MetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metric.newBuilder() to construct.
  private Metric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metric() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metric();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metric(
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
          case 8: {

            on_ = input.readBool();
            break;
          }
          case 18: {
            apache.rocketmq.v2.Endpoints.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = endpoints_.toBuilder();
            }
            endpoints_ = input.readMessage(apache.rocketmq.v2.Endpoints.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(endpoints_);
              endpoints_ = subBuilder.buildPartial();
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
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Metric_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Metric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.Metric.class, apache.rocketmq.v2.Metric.Builder.class);
  }

  private int bitField0_;
  public static final int ON_FIELD_NUMBER = 1;
  private boolean on_;
  /**
   * <pre>
   * Indicates that if client should export local metrics to server.
   * </pre>
   *
   * <code>bool on = 1;</code>
   * @return The on.
   */
  @java.lang.Override
  public boolean getOn() {
    return on_;
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 2;
  private apache.rocketmq.v2.Endpoints endpoints_;
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   * @return Whether the endpoints field is set.
   */
  @java.lang.Override
  public boolean hasEndpoints() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   * @return The endpoints.
   */
  @java.lang.Override
  public apache.rocketmq.v2.Endpoints getEndpoints() {
    return endpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : endpoints_;
  }
  /**
   * <pre>
   * The endpoint that client metrics should be exported to, which is required if the switch is on.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.EndpointsOrBuilder getEndpointsOrBuilder() {
    return endpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : endpoints_;
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
    if (on_ != false) {
      output.writeBool(1, on_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEndpoints());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (on_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, on_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndpoints());
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
    if (!(obj instanceof apache.rocketmq.v2.Metric)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.Metric other = (apache.rocketmq.v2.Metric) obj;

    if (getOn()
        != other.getOn()) return false;
    if (hasEndpoints() != other.hasEndpoints()) return false;
    if (hasEndpoints()) {
      if (!getEndpoints()
          .equals(other.getEndpoints())) return false;
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
    hash = (37 * hash) + ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOn());
    if (hasEndpoints()) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoints().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.Metric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Metric parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.Metric prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.Metric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.Metric)
      apache.rocketmq.v2.MetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Metric_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Metric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.Metric.class, apache.rocketmq.v2.Metric.Builder.class);
    }

    // Construct using apache.rocketmq.v2.Metric.newBuilder()
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
        getEndpointsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      on_ = false;

      if (endpointsBuilder_ == null) {
        endpoints_ = null;
      } else {
        endpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Metric_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric getDefaultInstanceForType() {
      return apache.rocketmq.v2.Metric.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric build() {
      apache.rocketmq.v2.Metric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Metric buildPartial() {
      apache.rocketmq.v2.Metric result = new apache.rocketmq.v2.Metric(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.on_ = on_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (endpointsBuilder_ == null) {
          result.endpoints_ = endpoints_;
        } else {
          result.endpoints_ = endpointsBuilder_.build();
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
      if (other instanceof apache.rocketmq.v2.Metric) {
        return mergeFrom((apache.rocketmq.v2.Metric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.Metric other) {
      if (other == apache.rocketmq.v2.Metric.getDefaultInstance()) return this;
      if (other.getOn() != false) {
        setOn(other.getOn());
      }
      if (other.hasEndpoints()) {
        mergeEndpoints(other.getEndpoints());
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
      apache.rocketmq.v2.Metric parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.Metric) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean on_ ;
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @return The on.
     */
    @java.lang.Override
    public boolean getOn() {
      return on_;
    }
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @param value The on to set.
     * @return This builder for chaining.
     */
    public Builder setOn(boolean value) {
      
      on_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that if client should export local metrics to server.
     * </pre>
     *
     * <code>bool on = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOn() {
      
      on_ = false;
      onChanged();
      return this;
    }

    private apache.rocketmq.v2.Endpoints endpoints_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder> endpointsBuilder_;
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     * @return Whether the endpoints field is set.
     */
    public boolean hasEndpoints() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     * @return The endpoints.
     */
    public apache.rocketmq.v2.Endpoints getEndpoints() {
      if (endpointsBuilder_ == null) {
        return endpoints_ == null ? apache.rocketmq.v2.Endpoints.getDefaultInstance() : endpoints_;
      } else {
        return endpointsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public Builder setEndpoints(apache.rocketmq.v2.Endpoints value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoints_ = value;
        onChanged();
      } else {
        endpointsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public Builder setEndpoints(
        apache.rocketmq.v2.Endpoints.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        endpoints_ = builderForValue.build();
        onChanged();
      } else {
        endpointsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public Builder mergeEndpoints(apache.rocketmq.v2.Endpoints value) {
      if (endpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            endpoints_ != null &&
            endpoints_ != apache.rocketmq.v2.Endpoints.getDefaultInstance()) {
          endpoints_ =
            apache.rocketmq.v2.Endpoints.newBuilder(endpoints_).mergeFrom(value).buildPartial();
        } else {
          endpoints_ = value;
        }
        onChanged();
      } else {
        endpointsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public Builder clearEndpoints() {
      if (endpointsBuilder_ == null) {
        endpoints_ = null;
        onChanged();
      } else {
        endpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public apache.rocketmq.v2.Endpoints.Builder getEndpointsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndpointsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    public apache.rocketmq.v2.EndpointsOrBuilder getEndpointsOrBuilder() {
      if (endpointsBuilder_ != null) {
        return endpointsBuilder_.getMessageOrBuilder();
      } else {
        return endpoints_ == null ?
            apache.rocketmq.v2.Endpoints.getDefaultInstance() : endpoints_;
      }
    }
    /**
     * <pre>
     * The endpoint that client metrics should be exported to, which is required if the switch is on.
     * </pre>
     *
     * <code>optional .apache.rocketmq.v2.Endpoints endpoints = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder> 
        getEndpointsFieldBuilder() {
      if (endpointsBuilder_ == null) {
        endpointsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.Endpoints, apache.rocketmq.v2.Endpoints.Builder, apache.rocketmq.v2.EndpointsOrBuilder>(
                getEndpoints(),
                getParentForChildren(),
                isClean());
        endpoints_ = null;
      }
      return endpointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.Metric)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.Metric)
  private static final apache.rocketmq.v2.Metric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.Metric();
  }

  public static apache.rocketmq.v2.Metric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metric>
      PARSER = new com.google.protobuf.AbstractParser<Metric>() {
    @java.lang.Override
    public Metric parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metric(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.Metric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

