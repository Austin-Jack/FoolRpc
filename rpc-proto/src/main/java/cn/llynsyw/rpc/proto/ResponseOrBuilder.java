// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_proto.proto

package cn.llynsyw.rpc.proto;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto.Response.Code code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.proto.Response.Code code = 1;</code>
   * @return The code.
   */
  cn.llynsyw.rpc.proto.Response.Code getCode();

  /**
   * <pre>
   *具体错误信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   *具体错误信息
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   *返回的数据
   * </pre>
   *
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}