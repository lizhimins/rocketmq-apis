// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

public final class MQDomain {
  private MQDomain() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_FilterExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_FilterExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_RetryPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_RetryPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_SubscriptionEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_SubscriptionEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Endpoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Endpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Broker_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Broker_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_MessageQueue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_MessageQueue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Digest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Digest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_SystemProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_SystemProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Message_UserPropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Message_UserPropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Assignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Assignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_SendReceipt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_SendReceipt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#apache/rocketmq/v2/definition.proto\022\022a" +
      "pache.rocketmq.v2\032\037google/protobuf/times" +
      "tamp.proto\032\036google/protobuf/duration.pro" +
      "to\"T\n\020FilterExpression\022,\n\004type\030\001 \001(\0162\036.a" +
      "pache.rocketmq.v2.FilterType\022\022\n\nexpressi" +
      "on\030\002 \001(\t\"m\n\013RetryPolicy\022\024\n\014max_attempts\030" +
      "\001 \001(\005\022\027\n\017initial_backoff\030\002 \001(\002\022\023\n\013max_ba" +
      "ckoff\030\003 \001(\002\022\032\n\022backoff_multiplier\030\004 \001(\002\"" +
      "4\n\010Resource\022\032\n\022resource_namespace\030\001 \001(\t\022" +
      "\014\n\004name\030\002 \001(\t\"z\n\021SubscriptionEntry\022+\n\005to" +
      "pic\030\001 \001(\0132\034.apache.rocketmq.v2.Resource\022" +
      "8\n\nexpression\030\002 \001(\0132$.apache.rocketmq.v2" +
      ".FilterExpression\"%\n\007Address\022\014\n\004host\030\001 \001" +
      "(\t\022\014\n\004port\030\002 \001(\005\"n\n\tEndpoints\0221\n\006scheme\030" +
      "\001 \001(\0162!.apache.rocketmq.v2.AddressScheme" +
      "\022.\n\taddresses\030\002 \003(\0132\033.apache.rocketmq.v2" +
      ".Address\"T\n\006Broker\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002" +
      " \001(\005\0220\n\tendpoints\030\003 \001(\0132\035.apache.rocketm" +
      "q.v2.Endpoints\"\346\001\n\014MessageQueue\022+\n\005topic" +
      "\030\001 \001(\0132\034.apache.rocketmq.v2.Resource\022\n\n\002" +
      "id\030\002 \001(\005\0222\n\npermission\030\003 \001(\0162\036.apache.ro" +
      "cketmq.v2.Permission\022*\n\006broker\030\004 \001(\0132\032.a" +
      "pache.rocketmq.v2.Broker\022=\n\024accept_messa" +
      "ge_types\030\005 \003(\0162\037.apache.rocketmq.v2.Mess" +
      "ageType\"H\n\006Digest\022,\n\004type\030\001 \001(\0162\036.apache" +
      ".rocketmq.v2.DigestType\022\020\n\010checksum\030\002 \001(" +
      "\t\"\264\007\n\020SystemProperties\022\020\n\003tag\030\001 \001(\tH\000\210\001\001" +
      "\022\014\n\004keys\030\002 \003(\t\022\022\n\nmessage_id\030\003 \001(\t\022/\n\013bo" +
      "dy_digest\030\004 \001(\0132\032.apache.rocketmq.v2.Dig" +
      "est\0223\n\rbody_encoding\030\005 \001(\0162\034.apache.rock" +
      "etmq.v2.Encoding\0225\n\014message_type\030\006 \001(\0162\037" +
      ".apache.rocketmq.v2.MessageType\0222\n\016born_" +
      "timestamp\030\007 \001(\0132\032.google.protobuf.Timest" +
      "amp\022\021\n\tborn_host\030\010 \001(\t\0228\n\017store_timestam" +
      "p\030\t \001(\0132\032.google.protobuf.TimestampH\001\210\001\001" +
      "\022\022\n\nstore_host\030\n \001(\t\022;\n\022delivery_timesta" +
      "mp\030\013 \001(\0132\032.google.protobuf.TimestampH\002\210\001" +
      "\001\022\033\n\016receipt_handle\030\014 \001(\tH\003\210\001\001\022\020\n\010queue_" +
      "id\030\r \001(\005\022\031\n\014queue_offset\030\016 \001(\003H\004\210\001\001\022:\n\022i" +
      "nvisible_duration\030\017 \001(\0132\031.google.protobu" +
      "f.DurationH\005\210\001\001\022\035\n\020delivery_attempt\030\020 \001(" +
      "\005H\006\210\001\001\022\032\n\rmessage_group\030\021 \001(\tH\007\210\001\001\022\032\n\rtr" +
      "ace_context\030\022 \001(\tH\010\210\001\001\022N\n&orphaned_trans" +
      "action_recovery_duration\030\023 \001(\0132\031.google." +
      "protobuf.DurationH\t\210\001\001B\006\n\004_tagB\022\n\020_store" +
      "_timestampB\025\n\023_delivery_timestampB\021\n\017_re" +
      "ceipt_handleB\017\n\r_queue_offsetB\025\n\023_invisi" +
      "ble_durationB\023\n\021_delivery_attemptB\020\n\016_me" +
      "ssage_groupB\020\n\016_trace_contextB)\n\'_orphan" +
      "ed_transaction_recovery_duration\"\206\002\n\007Mes" +
      "sage\022+\n\005topic\030\001 \001(\0132\034.apache.rocketmq.v2" +
      ".Resource\022H\n\017user_properties\030\002 \003(\0132/.apa" +
      "che.rocketmq.v2.Message.UserPropertiesEn" +
      "try\022?\n\021system_properties\030\003 \001(\0132$.apache." +
      "rocketmq.v2.SystemProperties\022\014\n\004body\030\004 \001" +
      "(\014\0325\n\023UserPropertiesEntry\022\013\n\003key\030\001 \001(\t\022\r" +
      "\n\005value\030\002 \001(\t:\0028\001\"E\n\nAssignment\0227\n\rmessa" +
      "ge_queue\030\001 \001(\0132 .apache.rocketmq.v2.Mess" +
      "ageQueue\"I\n\013SendReceipt\022\022\n\nmessage_id\030\001 " +
      "\001(\t\022\026\n\016transaction_id\030\002 \001(\t\022\016\n\006offset\030\003 " +
      "\001(\003\"A\n\006Status\022&\n\004code\030\001 \001(\0162\030.apache.roc" +
      "ketmq.v2.Code\022\017\n\007message\030\002 \001(\t*Y\n\025Transa" +
      "ctionResolution\022&\n\"TRANSACTION_RESOLUTIO" +
      "N_UNSPECIFIED\020\000\022\n\n\006COMMIT\020\001\022\014\n\010ROLLBACK\020" +
      "\002*W\n\021TransactionSource\022\026\n\022SOURCE_UNSPECI" +
      "FIED\020\000\022\021\n\rSOURCE_CLIENT\020\001\022\027\n\023SOURCE_SERV" +
      "ER_CHECK\020\002*W\n\nPermission\022\032\n\026PERMISSION_U" +
      "NSPECIFIED\020\000\022\010\n\004NONE\020\001\022\010\n\004READ\020\002\022\t\n\005WRIT" +
      "E\020\003\022\016\n\nREAD_WRITE\020\004*;\n\nFilterType\022\033\n\027FIL" +
      "TER_TYPE_UNSPECIFIED\020\000\022\007\n\003TAG\020\001\022\007\n\003SQL\020\002" +
      "*T\n\rAddressScheme\022\036\n\032ADDRESS_SCHEME_UNSP" +
      "ECIFIED\020\000\022\010\n\004IPv4\020\001\022\010\n\004IPv6\020\002\022\017\n\013DOMAIN_" +
      "NAME\020\003*]\n\013MessageType\022\034\n\030MESSAGE_TYPE_UN" +
      "SPECIFIED\020\000\022\n\n\006NORMAL\020\001\022\010\n\004FIFO\020\002\022\t\n\005DEL" +
      "AY\020\003\022\017\n\013TRANSACTION\020\004*G\n\nDigestType\022\033\n\027D" +
      "IGEST_TYPE_UNSPECIFIED\020\000\022\t\n\005CRC32\020\001\022\007\n\003M" +
      "D5\020\002\022\010\n\004SHA1\020\003*_\n\nClientType\022\033\n\027CLIENT_T" +
      "YPE_UNSPECIFIED\020\000\022\014\n\010PRODUCER\020\001\022\021\n\rPUSH_" +
      "CONSUMER\020\002\022\023\n\017SIMPLE_CONSUMER\020\003*<\n\010Encod" +
      "ing\022\030\n\024ENCODING_UNSPECIFIED\020\000\022\014\n\010IDENTIT" +
      "Y\020\001\022\010\n\004GZIP\020\002*\272\007\n\004Code\022\006\n\002OK\020\000\022\030\n\024ILLEGA" +
      "L_ACCESS_POINT\020\001\022\021\n\rILLEGAL_TOPIC\020\002\022\032\n\026I" +
      "LLEGAL_CONSUMER_GROUP\020\003\022\027\n\023ILLEGAL_MESSA" +
      "GE_TAG\020\004\022\027\n\023ILLEGAL_MESSAGE_KEY\020\005\022\032\n\026MES" +
      "SAGE_KEYS_TOO_LARGE\020\006\022\031\n\025ILLEGAL_MESSAGE" +
      "_GROUP\020\007\022 \n\034ILLEGAL_MESSAGE_PROPERTY_KEY" +
      "\020\010\022 \n\034MESSAGE_PROPERTIES_TOO_LARGE\020\t\022\032\n\026" +
      "MESSAGE_BODY_TOO_LARGE\020\n\022\016\n\tFORBIDDEN\020\223\003" +
      "\022\021\n\014UNAUTHORIZED\020\221\003\022\023\n\017TOPIC_NOT_FOUND\020\r" +
      "\022\034\n\030CONSUMER_GROUP_NOT_FOUND\020\016\022\034\n\030VERIFY" +
      "_MESSAGE_FORBIDDEN\020\017\022\035\n\031FAILED_TO_CONSUM" +
      "E_MESSAGE\020\020\022\025\n\021MESSAGE_CORRUPTED\020\021\022\025\n\021TO" +
      "O_MANY_REQUESTS\020\022\022\032\n\026RECEIPT_HANDLE_EXPI" +
      "RED\020\023\0220\n,MESSAGE_PROPERTY_DOES_NOT_MATCH" +
      "_MESSAGE_TYPE\020\024\022\026\n\022ILLEGAL_MESSAGE_ID\020\025\022" +
      "\032\n\026INVALID_TRANSACTION_ID\020\026\022\035\n\031ILLEGAL_F" +
      "ILTER_EXPRESSION\020\027\022\032\n\026INVALID_RECEIPT_HA" +
      "NDLE\020\030\022\036\n\032MASTER_PERSISTENCE_TIMEOUT\020\031\022\035" +
      "\n\031SLAVE_PERSISTENCE_TIMEOUT\020\032\022\024\n\020HA_NOT_" +
      "AVAILABLE\020\033\022\027\n\023VERSION_UNSUPPORTED\020\034\022\025\n\021" +
      "MESSAGE_NOT_FOUND\020\035\022\032\n\026ILLEGAL_MESSAGE_O" +
      "FFSET\020\036\022\023\n\017ILLEGAL_MESSAGE\020\037\022\034\n\030UNRECOGN" +
      "IZED_CLIENT_TYPE\020 \022\032\n\025INTERNAL_SERVER_ER" +
      "ROR\020\364\003\022\024\n\017NOT_IMPLEMENTED\020\365\003\022\024\n\017GATEWAY_" +
      "TIMEOUT\020\370\003B;\n\022apache.rocketmq.v2B\010MQDoma" +
      "inP\001\240\001\001\330\001\001\252\002\022Apache.Rocketmq.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_apache_rocketmq_v2_FilterExpression_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_apache_rocketmq_v2_FilterExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_FilterExpression_descriptor,
        new java.lang.String[] { "Type", "Expression", });
    internal_static_apache_rocketmq_v2_RetryPolicy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_apache_rocketmq_v2_RetryPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_RetryPolicy_descriptor,
        new java.lang.String[] { "MaxAttempts", "InitialBackoff", "MaxBackoff", "BackoffMultiplier", });
    internal_static_apache_rocketmq_v2_Resource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_apache_rocketmq_v2_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Resource_descriptor,
        new java.lang.String[] { "ResourceNamespace", "Name", });
    internal_static_apache_rocketmq_v2_SubscriptionEntry_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_apache_rocketmq_v2_SubscriptionEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_SubscriptionEntry_descriptor,
        new java.lang.String[] { "Topic", "Expression", });
    internal_static_apache_rocketmq_v2_Address_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_apache_rocketmq_v2_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Address_descriptor,
        new java.lang.String[] { "Host", "Port", });
    internal_static_apache_rocketmq_v2_Endpoints_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_apache_rocketmq_v2_Endpoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Endpoints_descriptor,
        new java.lang.String[] { "Scheme", "Addresses", });
    internal_static_apache_rocketmq_v2_Broker_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_apache_rocketmq_v2_Broker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Broker_descriptor,
        new java.lang.String[] { "Name", "Id", "Endpoints", });
    internal_static_apache_rocketmq_v2_MessageQueue_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_apache_rocketmq_v2_MessageQueue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_MessageQueue_descriptor,
        new java.lang.String[] { "Topic", "Id", "Permission", "Broker", "AcceptMessageTypes", });
    internal_static_apache_rocketmq_v2_Digest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_apache_rocketmq_v2_Digest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Digest_descriptor,
        new java.lang.String[] { "Type", "Checksum", });
    internal_static_apache_rocketmq_v2_SystemProperties_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_apache_rocketmq_v2_SystemProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_SystemProperties_descriptor,
        new java.lang.String[] { "Tag", "Keys", "MessageId", "BodyDigest", "BodyEncoding", "MessageType", "BornTimestamp", "BornHost", "StoreTimestamp", "StoreHost", "DeliveryTimestamp", "ReceiptHandle", "QueueId", "QueueOffset", "InvisibleDuration", "DeliveryAttempt", "MessageGroup", "TraceContext", "OrphanedTransactionRecoveryDuration", "Tag", "StoreTimestamp", "DeliveryTimestamp", "ReceiptHandle", "QueueOffset", "InvisibleDuration", "DeliveryAttempt", "MessageGroup", "TraceContext", "OrphanedTransactionRecoveryDuration", });
    internal_static_apache_rocketmq_v2_Message_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_apache_rocketmq_v2_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Message_descriptor,
        new java.lang.String[] { "Topic", "UserProperties", "SystemProperties", "Body", });
    internal_static_apache_rocketmq_v2_Message_UserPropertiesEntry_descriptor =
      internal_static_apache_rocketmq_v2_Message_descriptor.getNestedTypes().get(0);
    internal_static_apache_rocketmq_v2_Message_UserPropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Message_UserPropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_apache_rocketmq_v2_Assignment_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_apache_rocketmq_v2_Assignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Assignment_descriptor,
        new java.lang.String[] { "MessageQueue", });
    internal_static_apache_rocketmq_v2_SendReceipt_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_apache_rocketmq_v2_SendReceipt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_SendReceipt_descriptor,
        new java.lang.String[] { "MessageId", "TransactionId", "Offset", });
    internal_static_apache_rocketmq_v2_Status_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_apache_rocketmq_v2_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_Status_descriptor,
        new java.lang.String[] { "Code", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
