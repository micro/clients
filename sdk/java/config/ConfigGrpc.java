package config;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: config/config.proto")
public final class ConfigGrpc {

  private ConfigGrpc() {}

  public static final String SERVICE_NAME = "config.Config";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.CreateRequest,
      config.ConfigOuterClass.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = config.ConfigOuterClass.CreateRequest.class,
      responseType = config.ConfigOuterClass.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.CreateRequest,
      config.ConfigOuterClass.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.CreateRequest, config.ConfigOuterClass.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ConfigGrpc.getCreateMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getCreateMethod = ConfigGrpc.getCreateMethod) == null) {
          ConfigGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.CreateRequest, config.ConfigOuterClass.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.UpdateRequest,
      config.ConfigOuterClass.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = config.ConfigOuterClass.UpdateRequest.class,
      responseType = config.ConfigOuterClass.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.UpdateRequest,
      config.ConfigOuterClass.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.UpdateRequest, config.ConfigOuterClass.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ConfigGrpc.getUpdateMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getUpdateMethod = ConfigGrpc.getUpdateMethod) == null) {
          ConfigGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.UpdateRequest, config.ConfigOuterClass.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.DeleteRequest,
      config.ConfigOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = config.ConfigOuterClass.DeleteRequest.class,
      responseType = config.ConfigOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.DeleteRequest,
      config.ConfigOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.DeleteRequest, config.ConfigOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ConfigGrpc.getDeleteMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getDeleteMethod = ConfigGrpc.getDeleteMethod) == null) {
          ConfigGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.DeleteRequest, config.ConfigOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.ListRequest,
      config.ConfigOuterClass.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = config.ConfigOuterClass.ListRequest.class,
      responseType = config.ConfigOuterClass.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.ListRequest,
      config.ConfigOuterClass.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.ListRequest, config.ConfigOuterClass.ListResponse> getListMethod;
    if ((getListMethod = ConfigGrpc.getListMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getListMethod = ConfigGrpc.getListMethod) == null) {
          ConfigGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.ListRequest, config.ConfigOuterClass.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.ReadRequest,
      config.ConfigOuterClass.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = config.ConfigOuterClass.ReadRequest.class,
      responseType = config.ConfigOuterClass.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.ReadRequest,
      config.ConfigOuterClass.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.ReadRequest, config.ConfigOuterClass.ReadResponse> getReadMethod;
    if ((getReadMethod = ConfigGrpc.getReadMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getReadMethod = ConfigGrpc.getReadMethod) == null) {
          ConfigGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.ReadRequest, config.ConfigOuterClass.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<config.ConfigOuterClass.WatchRequest,
      config.ConfigOuterClass.WatchResponse> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = config.ConfigOuterClass.WatchRequest.class,
      responseType = config.ConfigOuterClass.WatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<config.ConfigOuterClass.WatchRequest,
      config.ConfigOuterClass.WatchResponse> getWatchMethod() {
    io.grpc.MethodDescriptor<config.ConfigOuterClass.WatchRequest, config.ConfigOuterClass.WatchResponse> getWatchMethod;
    if ((getWatchMethod = ConfigGrpc.getWatchMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getWatchMethod = ConfigGrpc.getWatchMethod) == null) {
          ConfigGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<config.ConfigOuterClass.WatchRequest, config.ConfigOuterClass.WatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  config.ConfigOuterClass.WatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigStub>() {
        @java.lang.Override
        public ConfigStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigStub(channel, callOptions);
        }
      };
    return ConfigStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigBlockingStub>() {
        @java.lang.Override
        public ConfigBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigBlockingStub(channel, callOptions);
        }
      };
    return ConfigBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigFutureStub>() {
        @java.lang.Override
        public ConfigFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigFutureStub(channel, callOptions);
        }
      };
    return ConfigFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConfigImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(config.ConfigOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(config.ConfigOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(config.ConfigOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(config.ConfigOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void read(config.ConfigOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void watch(config.ConfigOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.WatchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                config.ConfigOuterClass.CreateRequest,
                config.ConfigOuterClass.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                config.ConfigOuterClass.UpdateRequest,
                config.ConfigOuterClass.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                config.ConfigOuterClass.DeleteRequest,
                config.ConfigOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                config.ConfigOuterClass.ListRequest,
                config.ConfigOuterClass.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                config.ConfigOuterClass.ReadRequest,
                config.ConfigOuterClass.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getWatchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                config.ConfigOuterClass.WatchRequest,
                config.ConfigOuterClass.WatchResponse>(
                  this, METHODID_WATCH)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigStub extends io.grpc.stub.AbstractAsyncStub<ConfigStub> {
    private ConfigStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigStub(channel, callOptions);
    }

    /**
     */
    public void create(config.ConfigOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(config.ConfigOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(config.ConfigOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(config.ConfigOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(config.ConfigOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watch(config.ConfigOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<config.ConfigOuterClass.WatchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConfigBlockingStub> {
    private ConfigBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigBlockingStub(channel, callOptions);
    }

    /**
     */
    public config.ConfigOuterClass.CreateResponse create(config.ConfigOuterClass.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public config.ConfigOuterClass.UpdateResponse update(config.ConfigOuterClass.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public config.ConfigOuterClass.DeleteResponse delete(config.ConfigOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public config.ConfigOuterClass.ListResponse list(config.ConfigOuterClass.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public config.ConfigOuterClass.ReadResponse read(config.ConfigOuterClass.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<config.ConfigOuterClass.WatchResponse> watch(
        config.ConfigOuterClass.WatchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigFutureStub extends io.grpc.stub.AbstractFutureStub<ConfigFutureStub> {
    private ConfigFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<config.ConfigOuterClass.CreateResponse> create(
        config.ConfigOuterClass.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<config.ConfigOuterClass.UpdateResponse> update(
        config.ConfigOuterClass.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<config.ConfigOuterClass.DeleteResponse> delete(
        config.ConfigOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<config.ConfigOuterClass.ListResponse> list(
        config.ConfigOuterClass.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<config.ConfigOuterClass.ReadResponse> read(
        config.ConfigOuterClass.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_READ = 4;
  private static final int METHODID_WATCH = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((config.ConfigOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.CreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((config.ConfigOuterClass.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((config.ConfigOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((config.ConfigOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.ListResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((config.ConfigOuterClass.ReadRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.ReadResponse>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((config.ConfigOuterClass.WatchRequest) request,
              (io.grpc.stub.StreamObserver<config.ConfigOuterClass.WatchResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return config.ConfigOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Config");
    }
  }

  private static final class ConfigFileDescriptorSupplier
      extends ConfigBaseDescriptorSupplier {
    ConfigFileDescriptorSupplier() {}
  }

  private static final class ConfigMethodDescriptorSupplier
      extends ConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getReadMethod())
              .addMethod(getWatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
