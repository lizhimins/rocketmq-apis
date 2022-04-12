// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface ClientSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.ClientSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nonce = 1;</code>
   * @return The nonce.
   */
  java.lang.String getNonce();
  /**
   * <code>string nonce = 1;</code>
   * @return The bytes for nonce.
   */
  com.google.protobuf.ByteString
      getNonceBytes();

  /**
   * <code>.apache.rocketmq.v2.Direction direction = 2;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <code>.apache.rocketmq.v2.Direction direction = 2;</code>
   * @return The direction.
   */
  apache.rocketmq.v2.Direction getDirection();

  /**
   * <code>.apache.rocketmq.v2.ClientType client_type = 3;</code>
   * @return The enum numeric value on the wire for clientType.
   */
  int getClientTypeValue();
  /**
   * <code>.apache.rocketmq.v2.ClientType client_type = 3;</code>
   * @return The clientType.
   */
  apache.rocketmq.v2.ClientType getClientType();

  /**
   * <code>.apache.rocketmq.v2.Endpoints access_point = 4;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <code>.apache.rocketmq.v2.Endpoints access_point = 4;</code>
   * @return The accessPoint.
   */
  apache.rocketmq.v2.Endpoints getAccessPoint();
  /**
   * <code>.apache.rocketmq.v2.Endpoints access_point = 4;</code>
   */
  apache.rocketmq.v2.EndpointsOrBuilder getAccessPointOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Settings settings = 5;</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <code>.apache.rocketmq.v2.Settings settings = 5;</code>
   * @return The settings.
   */
  apache.rocketmq.v2.Settings getSettings();
  /**
   * <code>.apache.rocketmq.v2.Settings settings = 5;</code>
   */
  apache.rocketmq.v2.SettingsOrBuilder getSettingsOrBuilder();
}