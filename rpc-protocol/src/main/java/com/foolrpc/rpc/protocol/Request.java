// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_proto.proto

package com.foolrpc.rpc.protocol;

/**
 * Protobuf type {@code protocol.Request}
 */
public final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    parameter_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
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
          case 10: {
            com.foolrpc.rpc.protocol.ServiceDescriptor.Builder subBuilder = null;
            if (serviceDescriptor_ != null) {
              subBuilder = serviceDescriptor_.toBuilder();
            }
            serviceDescriptor_ = input.readMessage(com.foolrpc.rpc.protocol.ServiceDescriptor.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serviceDescriptor_);
              serviceDescriptor_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              parameter_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            parameter_.add(input.readBytes());
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        parameter_ = java.util.Collections.unmodifiableList(parameter_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.foolrpc.rpc.protocol.RpcProto.internal_static_protocol_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.foolrpc.rpc.protocol.RpcProto.internal_static_protocol_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.foolrpc.rpc.protocol.Request.class, com.foolrpc.rpc.protocol.Request.Builder.class);
  }

  public static final int SERVICEDESCRIPTOR_FIELD_NUMBER = 1;
  private com.foolrpc.rpc.protocol.ServiceDescriptor serviceDescriptor_;
  /**
   * <pre>
   *服务描述符
   * </pre>
   *
   * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
   * @return Whether the serviceDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasServiceDescriptor() {
    return serviceDescriptor_ != null;
  }
  /**
   * <pre>
   *服务描述符
   * </pre>
   *
   * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
   * @return The serviceDescriptor.
   */
  @java.lang.Override
  public com.foolrpc.rpc.protocol.ServiceDescriptor getServiceDescriptor() {
    return serviceDescriptor_ == null ? com.foolrpc.rpc.protocol.ServiceDescriptor.getDefaultInstance() : serviceDescriptor_;
  }
  /**
   * <pre>
   *服务描述符
   * </pre>
   *
   * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
   */
  @java.lang.Override
  public com.foolrpc.rpc.protocol.ServiceDescriptorOrBuilder getServiceDescriptorOrBuilder() {
    return getServiceDescriptor();
  }

  public static final int PARAMETER_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.ByteString> parameter_;
  /**
   * <pre>
   *具体参数列表
   * </pre>
   *
   * <code>repeated bytes parameter = 2;</code>
   * @return A list containing the parameter.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getParameterList() {
    return parameter_;
  }
  /**
   * <pre>
   *具体参数列表
   * </pre>
   *
   * <code>repeated bytes parameter = 2;</code>
   * @return The count of parameter.
   */
  public int getParameterCount() {
    return parameter_.size();
  }
  /**
   * <pre>
   *具体参数列表
   * </pre>
   *
   * <code>repeated bytes parameter = 2;</code>
   * @param index The index of the element to return.
   * @return The parameter at the given index.
   */
  public com.google.protobuf.ByteString getParameter(int index) {
    return parameter_.get(index);
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
    if (serviceDescriptor_ != null) {
      output.writeMessage(1, getServiceDescriptor());
    }
    for (int i = 0; i < parameter_.size(); i++) {
      output.writeBytes(2, parameter_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceDescriptor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServiceDescriptor());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < parameter_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(parameter_.get(i));
      }
      size += dataSize;
      size += 1 * getParameterList().size();
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
    if (!(obj instanceof com.foolrpc.rpc.protocol.Request)) {
      return super.equals(obj);
    }
    com.foolrpc.rpc.protocol.Request other = (com.foolrpc.rpc.protocol.Request) obj;

    if (hasServiceDescriptor() != other.hasServiceDescriptor()) return false;
    if (hasServiceDescriptor()) {
      if (!getServiceDescriptor()
          .equals(other.getServiceDescriptor())) return false;
    }
    if (!getParameterList()
        .equals(other.getParameterList())) return false;
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
    if (hasServiceDescriptor()) {
      hash = (37 * hash) + SERVICEDESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getServiceDescriptor().hashCode();
    }
    if (getParameterCount() > 0) {
      hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getParameterList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.foolrpc.rpc.protocol.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.foolrpc.rpc.protocol.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.foolrpc.rpc.protocol.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.foolrpc.rpc.protocol.Request parseFrom(
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
  public static Builder newBuilder(com.foolrpc.rpc.protocol.Request prototype) {
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
   * Protobuf type {@code protocol.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.Request)
      com.foolrpc.rpc.protocol.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.foolrpc.rpc.protocol.RpcProto.internal_static_protocol_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.foolrpc.rpc.protocol.RpcProto.internal_static_protocol_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.foolrpc.rpc.protocol.Request.class, com.foolrpc.rpc.protocol.Request.Builder.class);
    }

    // Construct using com.foolrpc.rpc.protocol.Request.newBuilder()
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
      if (serviceDescriptorBuilder_ == null) {
        serviceDescriptor_ = null;
      } else {
        serviceDescriptor_ = null;
        serviceDescriptorBuilder_ = null;
      }
      parameter_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.foolrpc.rpc.protocol.RpcProto.internal_static_protocol_Request_descriptor;
    }

    @java.lang.Override
    public com.foolrpc.rpc.protocol.Request getDefaultInstanceForType() {
      return com.foolrpc.rpc.protocol.Request.getDefaultInstance();
    }

    @java.lang.Override
    public com.foolrpc.rpc.protocol.Request build() {
      com.foolrpc.rpc.protocol.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.foolrpc.rpc.protocol.Request buildPartial() {
      com.foolrpc.rpc.protocol.Request result = new com.foolrpc.rpc.protocol.Request(this);
      int from_bitField0_ = bitField0_;
      if (serviceDescriptorBuilder_ == null) {
        result.serviceDescriptor_ = serviceDescriptor_;
      } else {
        result.serviceDescriptor_ = serviceDescriptorBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        parameter_ = java.util.Collections.unmodifiableList(parameter_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.parameter_ = parameter_;
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
      if (other instanceof com.foolrpc.rpc.protocol.Request) {
        return mergeFrom((com.foolrpc.rpc.protocol.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.foolrpc.rpc.protocol.Request other) {
      if (other == com.foolrpc.rpc.protocol.Request.getDefaultInstance()) return this;
      if (other.hasServiceDescriptor()) {
        mergeServiceDescriptor(other.getServiceDescriptor());
      }
      if (!other.parameter_.isEmpty()) {
        if (parameter_.isEmpty()) {
          parameter_ = other.parameter_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureParameterIsMutable();
          parameter_.addAll(other.parameter_);
        }
        onChanged();
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
      com.foolrpc.rpc.protocol.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.foolrpc.rpc.protocol.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.foolrpc.rpc.protocol.ServiceDescriptor serviceDescriptor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.foolrpc.rpc.protocol.ServiceDescriptor, com.foolrpc.rpc.protocol.ServiceDescriptor.Builder, com.foolrpc.rpc.protocol.ServiceDescriptorOrBuilder> serviceDescriptorBuilder_;
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     * @return Whether the serviceDescriptor field is set.
     */
    public boolean hasServiceDescriptor() {
      return serviceDescriptorBuilder_ != null || serviceDescriptor_ != null;
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     * @return The serviceDescriptor.
     */
    public com.foolrpc.rpc.protocol.ServiceDescriptor getServiceDescriptor() {
      if (serviceDescriptorBuilder_ == null) {
        return serviceDescriptor_ == null ? com.foolrpc.rpc.protocol.ServiceDescriptor.getDefaultInstance() : serviceDescriptor_;
      } else {
        return serviceDescriptorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public Builder setServiceDescriptor(com.foolrpc.rpc.protocol.ServiceDescriptor value) {
      if (serviceDescriptorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceDescriptor_ = value;
        onChanged();
      } else {
        serviceDescriptorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public Builder setServiceDescriptor(
        com.foolrpc.rpc.protocol.ServiceDescriptor.Builder builderForValue) {
      if (serviceDescriptorBuilder_ == null) {
        serviceDescriptor_ = builderForValue.build();
        onChanged();
      } else {
        serviceDescriptorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public Builder mergeServiceDescriptor(com.foolrpc.rpc.protocol.ServiceDescriptor value) {
      if (serviceDescriptorBuilder_ == null) {
        if (serviceDescriptor_ != null) {
          serviceDescriptor_ =
            com.foolrpc.rpc.protocol.ServiceDescriptor.newBuilder(serviceDescriptor_).mergeFrom(value).buildPartial();
        } else {
          serviceDescriptor_ = value;
        }
        onChanged();
      } else {
        serviceDescriptorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public Builder clearServiceDescriptor() {
      if (serviceDescriptorBuilder_ == null) {
        serviceDescriptor_ = null;
        onChanged();
      } else {
        serviceDescriptor_ = null;
        serviceDescriptorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public com.foolrpc.rpc.protocol.ServiceDescriptor.Builder getServiceDescriptorBuilder() {
      
      onChanged();
      return getServiceDescriptorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    public com.foolrpc.rpc.protocol.ServiceDescriptorOrBuilder getServiceDescriptorOrBuilder() {
      if (serviceDescriptorBuilder_ != null) {
        return serviceDescriptorBuilder_.getMessageOrBuilder();
      } else {
        return serviceDescriptor_ == null ?
            com.foolrpc.rpc.protocol.ServiceDescriptor.getDefaultInstance() : serviceDescriptor_;
      }
    }
    /**
     * <pre>
     *服务描述符
     * </pre>
     *
     * <code>.protocol.ServiceDescriptor serviceDescriptor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.foolrpc.rpc.protocol.ServiceDescriptor, com.foolrpc.rpc.protocol.ServiceDescriptor.Builder, com.foolrpc.rpc.protocol.ServiceDescriptorOrBuilder> 
        getServiceDescriptorFieldBuilder() {
      if (serviceDescriptorBuilder_ == null) {
        serviceDescriptorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.foolrpc.rpc.protocol.ServiceDescriptor, com.foolrpc.rpc.protocol.ServiceDescriptor.Builder, com.foolrpc.rpc.protocol.ServiceDescriptorOrBuilder>(
                getServiceDescriptor(),
                getParentForChildren(),
                isClean());
        serviceDescriptor_ = null;
      }
      return serviceDescriptorBuilder_;
    }

    private java.util.List<com.google.protobuf.ByteString> parameter_ = java.util.Collections.emptyList();
    private void ensureParameterIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parameter_ = new java.util.ArrayList<com.google.protobuf.ByteString>(parameter_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @return A list containing the parameter.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getParameterList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(parameter_) : parameter_;
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @return The count of parameter.
     */
    public int getParameterCount() {
      return parameter_.size();
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @param index The index of the element to return.
     * @return The parameter at the given index.
     */
    public com.google.protobuf.ByteString getParameter(int index) {
      return parameter_.get(index);
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @param index The index to set the value at.
     * @param value The parameter to set.
     * @return This builder for chaining.
     */
    public Builder setParameter(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureParameterIsMutable();
      parameter_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @param value The parameter to add.
     * @return This builder for chaining.
     */
    public Builder addParameter(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureParameterIsMutable();
      parameter_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @param values The parameter to add.
     * @return This builder for chaining.
     */
    public Builder addAllParameter(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureParameterIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, parameter_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *具体参数列表
     * </pre>
     *
     * <code>repeated bytes parameter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearParameter() {
      parameter_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:protocol.Request)
  }

  // @@protoc_insertion_point(class_scope:protocol.Request)
  private static final com.foolrpc.rpc.protocol.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.foolrpc.rpc.protocol.Request();
  }

  public static com.foolrpc.rpc.protocol.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.foolrpc.rpc.protocol.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

