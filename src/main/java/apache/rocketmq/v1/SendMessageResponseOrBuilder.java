// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

public interface SendMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.SendMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return The common.
   */
  apache.rocketmq.v1.ResponseCommon getCommon();
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   */
  apache.rocketmq.v1.ResponseCommonOrBuilder getCommonOrBuilder();

  /**
   * <code>string message_id = 2;</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <code>string message_id = 2;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <code>string transaction_id = 3;</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transaction_id = 3;</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();
}