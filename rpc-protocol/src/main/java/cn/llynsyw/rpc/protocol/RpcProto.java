// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_proto.proto

package cn.llynsyw.rpc.protocol;

public final class RpcProto {
  private RpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ServiceDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ServiceDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017rpc_proto.proto\022\005proto\"a\n\021ServiceDescr" +
      "iptor\022\r\n\005clazz\030\001 \001(\t\022\022\n\nmethodName\030\002 \001(\t" +
      "\022\022\n\nreturnType\030\003 \001(\t\022\025\n\rparameterType\030\004 " +
      "\003(\t\"Q\n\007Request\0223\n\021serviceDescriptor\030\001 \001(" +
      "\0132\030.proto.ServiceDescriptor\022\021\n\tparameter" +
      "\030\002 \003(\014\"\273\001\n\010Response\022\"\n\004code\030\001 \001(\0162\024.prot" +
      "o.Response.Code\022\017\n\007message\030\002 \001(\t\022\014\n\004data" +
      "\030\003 \001(\014\"l\n\004Code\022\n\n\006RPC_OK\020\000\022\022\n\016RPC_NO_SER" +
      "VICE\020\001\022\021\n\rRPC_NO_METHOD\020\002\022\027\n\023RPC_INVALID" +
      "_REQUEST\020\003\022\030\n\024RPC_INVALID_RESPONSE\020\004B\030\n\024" +
      "cn.llynsyw.rpc.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_ServiceDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ServiceDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ServiceDescriptor_descriptor,
        new java.lang.String[] { "Clazz", "MethodName", "ReturnType", "ParameterType", });
    internal_static_proto_Request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Request_descriptor,
        new java.lang.String[] { "ServiceDescriptor", "Parameter", });
    internal_static_proto_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Response_descriptor,
        new java.lang.String[] { "Code", "Message", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}