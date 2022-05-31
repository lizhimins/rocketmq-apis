// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.Code}
 */
public enum Code
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Success.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <pre>
   * Format of access point is illegal.
   * </pre>
   *
   * <code>ILLEGAL_ACCESS_POINT = 1;</code>
   */
  ILLEGAL_ACCESS_POINT(1),
  /**
   * <pre>
   * Format of topic is illegal.
   * </pre>
   *
   * <code>ILLEGAL_TOPIC = 2;</code>
   */
  ILLEGAL_TOPIC(2),
  /**
   * <pre>
   * Format of consumer group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_CONSUMER_GROUP = 3;</code>
   */
  ILLEGAL_CONSUMER_GROUP(3),
  /**
   * <pre>
   * Format of message tag is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_TAG = 4;</code>
   */
  ILLEGAL_MESSAGE_TAG(4),
  /**
   * <pre>
   * Format of message key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_KEY = 5;</code>
   */
  ILLEGAL_MESSAGE_KEY(5),
  /**
   * <pre>
   * Size of message keys exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_KEYS_TOO_LARGE = 6;</code>
   */
  MESSAGE_KEYS_TOO_LARGE(6),
  /**
   * <pre>
   * Format of message group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_GROUP = 7;</code>
   */
  ILLEGAL_MESSAGE_GROUP(7),
  /**
   * <pre>
   * Format of message property key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_PROPERTY_KEY = 8;</code>
   */
  ILLEGAL_MESSAGE_PROPERTY_KEY(8),
  /**
   * <pre>
   * Message properties total size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_PROPERTIES_TOO_LARGE = 9;</code>
   */
  MESSAGE_PROPERTIES_TOO_LARGE(9),
  /**
   * <pre>
   * Message body size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_BODY_TOO_LARGE = 10;</code>
   */
  MESSAGE_BODY_TOO_LARGE(10),
  /**
   * <pre>
   * User does not have the permission to operate.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/403
   * </pre>
   *
   * <code>FORBIDDEN = 403;</code>
   */
  FORBIDDEN(403),
  /**
   * <pre>
   * Code indicates that the client request has not been completed
   * because it lacks valid authentication credentials for the
   * requested resource.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/401
   * </pre>
   *
   * <code>UNAUTHORIZED = 401;</code>
   */
  UNAUTHORIZED(401),
  /**
   * <pre>
   * Topic resource does not exist.
   * </pre>
   *
   * <code>TOPIC_NOT_FOUND = 13;</code>
   */
  TOPIC_NOT_FOUND(13),
  /**
   * <pre>
   * Consumer group resource does not exist.
   * </pre>
   *
   * <code>CONSUMER_GROUP_NOT_FOUND = 14;</code>
   */
  CONSUMER_GROUP_NOT_FOUND(14),
  /**
   * <pre>
   * Not allowed to verify message. Chances are that you are verifying
   * a FIFO message, as is violating FIFO semantics.
   * </pre>
   *
   * <code>VERIFY_MESSAGE_FORBIDDEN = 15;</code>
   */
  VERIFY_MESSAGE_FORBIDDEN(15),
  /**
   * <pre>
   * Failed to consume message.
   * </pre>
   *
   * <code>FAILED_TO_CONSUME_MESSAGE = 16;</code>
   */
  FAILED_TO_CONSUME_MESSAGE(16),
  /**
   * <pre>
   * Message is corrupted.
   * </pre>
   *
   * <code>MESSAGE_CORRUPTED = 17;</code>
   */
  MESSAGE_CORRUPTED(17),
  /**
   * <pre>
   * Too many requests are made in short period of duration.
   * Requests are throttled.
   * </pre>
   *
   * <code>TOO_MANY_REQUESTS = 18;</code>
   */
  TOO_MANY_REQUESTS(18),
  /**
   * <pre>
   * Expired receipt-handle is used when trying to acknowledge or change
   * invisible duration of a message
   * </pre>
   *
   * <code>RECEIPT_HANDLE_EXPIRED = 19;</code>
   */
  RECEIPT_HANDLE_EXPIRED(19),
  /**
   * <pre>
   * Message property is not match the message type.
   * </pre>
   *
   * <code>MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE = 20;</code>
   */
  MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE(20),
  /**
   * <pre>
   * Format of message id is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_ID = 21;</code>
   */
  ILLEGAL_MESSAGE_ID(21),
  /**
   * <pre>
   * Transaction id is invalid.
   * </pre>
   *
   * <code>INVALID_TRANSACTION_ID = 22;</code>
   */
  INVALID_TRANSACTION_ID(22),
  /**
   * <pre>
   * Format of filter expression is illegal.
   * </pre>
   *
   * <code>ILLEGAL_FILTER_EXPRESSION = 23;</code>
   */
  ILLEGAL_FILTER_EXPRESSION(23),
  /**
   * <pre>
   * Receipt handle of message is invalid.
   * </pre>
   *
   * <code>INVALID_RECEIPT_HANDLE = 24;</code>
   */
  INVALID_RECEIPT_HANDLE(24),
  /**
   * <pre>
   * Message persistence timeout.
   * </pre>
   *
   * <code>MASTER_PERSISTENCE_TIMEOUT = 25;</code>
   */
  MASTER_PERSISTENCE_TIMEOUT(25),
  /**
   * <pre>
   * Slave persistence timeout.
   * </pre>
   *
   * <code>SLAVE_PERSISTENCE_TIMEOUT = 26;</code>
   */
  SLAVE_PERSISTENCE_TIMEOUT(26),
  /**
   * <pre>
   * The HA-mechanism is not working now.
   * </pre>
   *
   * <code>HA_NOT_AVAILABLE = 27;</code>
   */
  HA_NOT_AVAILABLE(27),
  /**
   * <pre>
   * Operation is not allowed in current version.
   * </pre>
   *
   * <code>VERSION_UNSUPPORTED = 28;</code>
   */
  VERSION_UNSUPPORTED(28),
  /**
   * <pre>
   * Message not found from server.
   * </pre>
   *
   * <code>MESSAGE_NOT_FOUND = 29;</code>
   */
  MESSAGE_NOT_FOUND(29),
  /**
   * <pre>
   * Message offset is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_OFFSET = 30;</code>
   */
  ILLEGAL_MESSAGE_OFFSET(30),
  /**
   * <pre>
   * Illegal message is for the sake of backward compatibility. In most case,
   * more definitive code is better, e.g. `ILLEGAL_MESSAGE_TAG`.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE = 31;</code>
   */
  ILLEGAL_MESSAGE(31),
  /**
   * <pre>
   * Client type could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_CLIENT_TYPE = 32;</code>
   */
  UNRECOGNIZED_CLIENT_TYPE(32),
  /**
   * <pre>
   * Return different results for entries in composite request.
   * </pre>
   *
   * <code>MULTIPLE_RESULTS = 33;</code>
   */
  MULTIPLE_RESULTS(33),
  /**
   * <pre>
   * Code indicates that the server encountered an unexpected condition
   * that prevented it from fulfilling the request.
   * This error response is a generic "catch-all" response.
   * Usually, this indicates the server cannot find a better alternative
   * error code to response. Sometimes, server administrators log error
   * responses like the 500 status code with more details about the request
   * to prevent the error from happening again in the future.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500
   * </pre>
   *
   * <code>INTERNAL_SERVER_ERROR = 500;</code>
   */
  INTERNAL_SERVER_ERROR(500),
  /**
   * <pre>
   * Code means that the server or client does not support the functionality
   * required to fulfill the request.
   * </pre>
   *
   * <code>NOT_IMPLEMENTED = 501;</code>
   */
  NOT_IMPLEMENTED(501),
  /**
   * <pre>
   * Code indicates that the server, while acting as a gateway or proxy,
   * did not get a response in time from the upstream server that
   * it needed in order to complete the request.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504
   * </pre>
   *
   * <code>GATEWAY_TIMEOUT = 504;</code>
   */
  GATEWAY_TIMEOUT(504),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Success.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <pre>
   * Format of access point is illegal.
   * </pre>
   *
   * <code>ILLEGAL_ACCESS_POINT = 1;</code>
   */
  public static final int ILLEGAL_ACCESS_POINT_VALUE = 1;
  /**
   * <pre>
   * Format of topic is illegal.
   * </pre>
   *
   * <code>ILLEGAL_TOPIC = 2;</code>
   */
  public static final int ILLEGAL_TOPIC_VALUE = 2;
  /**
   * <pre>
   * Format of consumer group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_CONSUMER_GROUP = 3;</code>
   */
  public static final int ILLEGAL_CONSUMER_GROUP_VALUE = 3;
  /**
   * <pre>
   * Format of message tag is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_TAG = 4;</code>
   */
  public static final int ILLEGAL_MESSAGE_TAG_VALUE = 4;
  /**
   * <pre>
   * Format of message key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_KEY = 5;</code>
   */
  public static final int ILLEGAL_MESSAGE_KEY_VALUE = 5;
  /**
   * <pre>
   * Size of message keys exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_KEYS_TOO_LARGE = 6;</code>
   */
  public static final int MESSAGE_KEYS_TOO_LARGE_VALUE = 6;
  /**
   * <pre>
   * Format of message group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_GROUP = 7;</code>
   */
  public static final int ILLEGAL_MESSAGE_GROUP_VALUE = 7;
  /**
   * <pre>
   * Format of message property key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_PROPERTY_KEY = 8;</code>
   */
  public static final int ILLEGAL_MESSAGE_PROPERTY_KEY_VALUE = 8;
  /**
   * <pre>
   * Message properties total size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_PROPERTIES_TOO_LARGE = 9;</code>
   */
  public static final int MESSAGE_PROPERTIES_TOO_LARGE_VALUE = 9;
  /**
   * <pre>
   * Message body size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_BODY_TOO_LARGE = 10;</code>
   */
  public static final int MESSAGE_BODY_TOO_LARGE_VALUE = 10;
  /**
   * <pre>
   * User does not have the permission to operate.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/403
   * </pre>
   *
   * <code>FORBIDDEN = 403;</code>
   */
  public static final int FORBIDDEN_VALUE = 403;
  /**
   * <pre>
   * Code indicates that the client request has not been completed
   * because it lacks valid authentication credentials for the
   * requested resource.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/401
   * </pre>
   *
   * <code>UNAUTHORIZED = 401;</code>
   */
  public static final int UNAUTHORIZED_VALUE = 401;
  /**
   * <pre>
   * Topic resource does not exist.
   * </pre>
   *
   * <code>TOPIC_NOT_FOUND = 13;</code>
   */
  public static final int TOPIC_NOT_FOUND_VALUE = 13;
  /**
   * <pre>
   * Consumer group resource does not exist.
   * </pre>
   *
   * <code>CONSUMER_GROUP_NOT_FOUND = 14;</code>
   */
  public static final int CONSUMER_GROUP_NOT_FOUND_VALUE = 14;
  /**
   * <pre>
   * Not allowed to verify message. Chances are that you are verifying
   * a FIFO message, as is violating FIFO semantics.
   * </pre>
   *
   * <code>VERIFY_MESSAGE_FORBIDDEN = 15;</code>
   */
  public static final int VERIFY_MESSAGE_FORBIDDEN_VALUE = 15;
  /**
   * <pre>
   * Failed to consume message.
   * </pre>
   *
   * <code>FAILED_TO_CONSUME_MESSAGE = 16;</code>
   */
  public static final int FAILED_TO_CONSUME_MESSAGE_VALUE = 16;
  /**
   * <pre>
   * Message is corrupted.
   * </pre>
   *
   * <code>MESSAGE_CORRUPTED = 17;</code>
   */
  public static final int MESSAGE_CORRUPTED_VALUE = 17;
  /**
   * <pre>
   * Too many requests are made in short period of duration.
   * Requests are throttled.
   * </pre>
   *
   * <code>TOO_MANY_REQUESTS = 18;</code>
   */
  public static final int TOO_MANY_REQUESTS_VALUE = 18;
  /**
   * <pre>
   * Expired receipt-handle is used when trying to acknowledge or change
   * invisible duration of a message
   * </pre>
   *
   * <code>RECEIPT_HANDLE_EXPIRED = 19;</code>
   */
  public static final int RECEIPT_HANDLE_EXPIRED_VALUE = 19;
  /**
   * <pre>
   * Message property is not match the message type.
   * </pre>
   *
   * <code>MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE = 20;</code>
   */
  public static final int MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE_VALUE = 20;
  /**
   * <pre>
   * Format of message id is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_ID = 21;</code>
   */
  public static final int ILLEGAL_MESSAGE_ID_VALUE = 21;
  /**
   * <pre>
   * Transaction id is invalid.
   * </pre>
   *
   * <code>INVALID_TRANSACTION_ID = 22;</code>
   */
  public static final int INVALID_TRANSACTION_ID_VALUE = 22;
  /**
   * <pre>
   * Format of filter expression is illegal.
   * </pre>
   *
   * <code>ILLEGAL_FILTER_EXPRESSION = 23;</code>
   */
  public static final int ILLEGAL_FILTER_EXPRESSION_VALUE = 23;
  /**
   * <pre>
   * Receipt handle of message is invalid.
   * </pre>
   *
   * <code>INVALID_RECEIPT_HANDLE = 24;</code>
   */
  public static final int INVALID_RECEIPT_HANDLE_VALUE = 24;
  /**
   * <pre>
   * Message persistence timeout.
   * </pre>
   *
   * <code>MASTER_PERSISTENCE_TIMEOUT = 25;</code>
   */
  public static final int MASTER_PERSISTENCE_TIMEOUT_VALUE = 25;
  /**
   * <pre>
   * Slave persistence timeout.
   * </pre>
   *
   * <code>SLAVE_PERSISTENCE_TIMEOUT = 26;</code>
   */
  public static final int SLAVE_PERSISTENCE_TIMEOUT_VALUE = 26;
  /**
   * <pre>
   * The HA-mechanism is not working now.
   * </pre>
   *
   * <code>HA_NOT_AVAILABLE = 27;</code>
   */
  public static final int HA_NOT_AVAILABLE_VALUE = 27;
  /**
   * <pre>
   * Operation is not allowed in current version.
   * </pre>
   *
   * <code>VERSION_UNSUPPORTED = 28;</code>
   */
  public static final int VERSION_UNSUPPORTED_VALUE = 28;
  /**
   * <pre>
   * Message not found from server.
   * </pre>
   *
   * <code>MESSAGE_NOT_FOUND = 29;</code>
   */
  public static final int MESSAGE_NOT_FOUND_VALUE = 29;
  /**
   * <pre>
   * Message offset is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_OFFSET = 30;</code>
   */
  public static final int ILLEGAL_MESSAGE_OFFSET_VALUE = 30;
  /**
   * <pre>
   * Illegal message is for the sake of backward compatibility. In most case,
   * more definitive code is better, e.g. `ILLEGAL_MESSAGE_TAG`.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE = 31;</code>
   */
  public static final int ILLEGAL_MESSAGE_VALUE = 31;
  /**
   * <pre>
   * Client type could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_CLIENT_TYPE = 32;</code>
   */
  public static final int UNRECOGNIZED_CLIENT_TYPE_VALUE = 32;
  /**
   * <pre>
   * Return different results for entries in composite request.
   * </pre>
   *
   * <code>MULTIPLE_RESULTS = 33;</code>
   */
  public static final int MULTIPLE_RESULTS_VALUE = 33;
  /**
   * <pre>
   * Code indicates that the server encountered an unexpected condition
   * that prevented it from fulfilling the request.
   * This error response is a generic "catch-all" response.
   * Usually, this indicates the server cannot find a better alternative
   * error code to response. Sometimes, server administrators log error
   * responses like the 500 status code with more details about the request
   * to prevent the error from happening again in the future.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500
   * </pre>
   *
   * <code>INTERNAL_SERVER_ERROR = 500;</code>
   */
  public static final int INTERNAL_SERVER_ERROR_VALUE = 500;
  /**
   * <pre>
   * Code means that the server or client does not support the functionality
   * required to fulfill the request.
   * </pre>
   *
   * <code>NOT_IMPLEMENTED = 501;</code>
   */
  public static final int NOT_IMPLEMENTED_VALUE = 501;
  /**
   * <pre>
   * Code indicates that the server, while acting as a gateway or proxy,
   * did not get a response in time from the upstream server that
   * it needed in order to complete the request.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504
   * </pre>
   *
   * <code>GATEWAY_TIMEOUT = 504;</code>
   */
  public static final int GATEWAY_TIMEOUT_VALUE = 504;


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
  public static Code valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Code forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 1: return ILLEGAL_ACCESS_POINT;
      case 2: return ILLEGAL_TOPIC;
      case 3: return ILLEGAL_CONSUMER_GROUP;
      case 4: return ILLEGAL_MESSAGE_TAG;
      case 5: return ILLEGAL_MESSAGE_KEY;
      case 6: return MESSAGE_KEYS_TOO_LARGE;
      case 7: return ILLEGAL_MESSAGE_GROUP;
      case 8: return ILLEGAL_MESSAGE_PROPERTY_KEY;
      case 9: return MESSAGE_PROPERTIES_TOO_LARGE;
      case 10: return MESSAGE_BODY_TOO_LARGE;
      case 403: return FORBIDDEN;
      case 401: return UNAUTHORIZED;
      case 13: return TOPIC_NOT_FOUND;
      case 14: return CONSUMER_GROUP_NOT_FOUND;
      case 15: return VERIFY_MESSAGE_FORBIDDEN;
      case 16: return FAILED_TO_CONSUME_MESSAGE;
      case 17: return MESSAGE_CORRUPTED;
      case 18: return TOO_MANY_REQUESTS;
      case 19: return RECEIPT_HANDLE_EXPIRED;
      case 20: return MESSAGE_PROPERTY_DOES_NOT_MATCH_MESSAGE_TYPE;
      case 21: return ILLEGAL_MESSAGE_ID;
      case 22: return INVALID_TRANSACTION_ID;
      case 23: return ILLEGAL_FILTER_EXPRESSION;
      case 24: return INVALID_RECEIPT_HANDLE;
      case 25: return MASTER_PERSISTENCE_TIMEOUT;
      case 26: return SLAVE_PERSISTENCE_TIMEOUT;
      case 27: return HA_NOT_AVAILABLE;
      case 28: return VERSION_UNSUPPORTED;
      case 29: return MESSAGE_NOT_FOUND;
      case 30: return ILLEGAL_MESSAGE_OFFSET;
      case 31: return ILLEGAL_MESSAGE;
      case 32: return UNRECOGNIZED_CLIENT_TYPE;
      case 33: return MULTIPLE_RESULTS;
      case 500: return INTERNAL_SERVER_ERROR;
      case 501: return NOT_IMPLEMENTED;
      case 504: return GATEWAY_TIMEOUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Code>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
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
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(9);
  }

  private static final Code[] VALUES = values();

  public static Code valueOf(
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

  private Code(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.Code)
}
