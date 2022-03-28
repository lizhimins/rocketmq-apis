// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

/**
 * Protobuf enum {@code apache.rocketmq.v1.Permission}
 */
public enum Permission
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <code>READ = 1;</code>
   */
  READ(1),
  /**
   * <code>WRITE = 2;</code>
   */
  WRITE(2),
  /**
   * <code>READ_WRITE = 3;</code>
   */
  READ_WRITE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <code>READ = 1;</code>
   */
  public static final int READ_VALUE = 1;
  /**
   * <code>WRITE = 2;</code>
   */
  public static final int WRITE_VALUE = 2;
  /**
   * <code>READ_WRITE = 3;</code>
   */
  public static final int READ_WRITE_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Permission valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Permission forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return READ;
      case 2: return WRITE;
      case 3: return READ_WRITE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Permission>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Permission> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Permission>() {
          public Permission findValueByNumber(int number) {
            return Permission.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return apache.rocketmq.v1.MQDomain.getDescriptor().getEnumTypes().get(0);
  }

  private static final Permission[] VALUES = values();

  public static Permission valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Permission(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v1.Permission)
}

