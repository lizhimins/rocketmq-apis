// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface RecoverOrphanedTransactionCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.RecoverOrphanedTransactionCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v2.Message message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 1;</code>
   * @return The message.
   */
  apache.rocketmq.v2.Message getMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 1;</code>
   */
  apache.rocketmq.v2.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>string transaction_id = 2;</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transaction_id = 2;</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();
}