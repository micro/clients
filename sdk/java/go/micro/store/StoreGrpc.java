package go.micro.store;

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
    comments = "Source: store/store.proto")
public final class StoreGrpc {

  private StoreGrpc() {}

  public static final String SERVICE_NAME = "go.micro.store.Store";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ReadRequest,
      go.micro.store.StoreOuterClass.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = go.micro.store.StoreOuterClass.ReadRequest.class,
      responseType = go.micro.store.StoreOuterClass.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ReadRequest,
      go.micro.store.StoreOuterClass.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ReadRequest, go.micro.store.StoreOuterClass.ReadResponse> getReadMethod;
    if ((getReadMethod = StoreGrpc.getReadMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getReadMethod = StoreGrpc.getReadMethod) == null) {
          StoreGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.ReadRequest, go.micro.store.StoreOuterClass.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.WriteRequest,
      go.micro.store.StoreOuterClass.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = go.micro.store.StoreOuterClass.WriteRequest.class,
      responseType = go.micro.store.StoreOuterClass.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.WriteRequest,
      go.micro.store.StoreOuterClass.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.WriteRequest, go.micro.store.StoreOuterClass.WriteResponse> getWriteMethod;
    if ((getWriteMethod = StoreGrpc.getWriteMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getWriteMethod = StoreGrpc.getWriteMethod) == null) {
          StoreGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.WriteRequest, go.micro.store.StoreOuterClass.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DeleteRequest,
      go.micro.store.StoreOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = go.micro.store.StoreOuterClass.DeleteRequest.class,
      responseType = go.micro.store.StoreOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DeleteRequest,
      go.micro.store.StoreOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DeleteRequest, go.micro.store.StoreOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = StoreGrpc.getDeleteMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getDeleteMethod = StoreGrpc.getDeleteMethod) == null) {
          StoreGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.DeleteRequest, go.micro.store.StoreOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ListRequest,
      go.micro.store.StoreOuterClass.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = go.micro.store.StoreOuterClass.ListRequest.class,
      responseType = go.micro.store.StoreOuterClass.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ListRequest,
      go.micro.store.StoreOuterClass.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.ListRequest, go.micro.store.StoreOuterClass.ListResponse> getListMethod;
    if ((getListMethod = StoreGrpc.getListMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getListMethod = StoreGrpc.getListMethod) == null) {
          StoreGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.ListRequest, go.micro.store.StoreOuterClass.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DatabasesRequest,
      go.micro.store.StoreOuterClass.DatabasesResponse> getDatabasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Databases",
      requestType = go.micro.store.StoreOuterClass.DatabasesRequest.class,
      responseType = go.micro.store.StoreOuterClass.DatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DatabasesRequest,
      go.micro.store.StoreOuterClass.DatabasesResponse> getDatabasesMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.DatabasesRequest, go.micro.store.StoreOuterClass.DatabasesResponse> getDatabasesMethod;
    if ((getDatabasesMethod = StoreGrpc.getDatabasesMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getDatabasesMethod = StoreGrpc.getDatabasesMethod) == null) {
          StoreGrpc.getDatabasesMethod = getDatabasesMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.DatabasesRequest, go.micro.store.StoreOuterClass.DatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Databases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.DatabasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.DatabasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("Databases"))
              .build();
        }
      }
    }
    return getDatabasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.TablesRequest,
      go.micro.store.StoreOuterClass.TablesResponse> getTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tables",
      requestType = go.micro.store.StoreOuterClass.TablesRequest.class,
      responseType = go.micro.store.StoreOuterClass.TablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.TablesRequest,
      go.micro.store.StoreOuterClass.TablesResponse> getTablesMethod() {
    io.grpc.MethodDescriptor<go.micro.store.StoreOuterClass.TablesRequest, go.micro.store.StoreOuterClass.TablesResponse> getTablesMethod;
    if ((getTablesMethod = StoreGrpc.getTablesMethod) == null) {
      synchronized (StoreGrpc.class) {
        if ((getTablesMethod = StoreGrpc.getTablesMethod) == null) {
          StoreGrpc.getTablesMethod = getTablesMethod =
              io.grpc.MethodDescriptor.<go.micro.store.StoreOuterClass.TablesRequest, go.micro.store.StoreOuterClass.TablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.TablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.store.StoreOuterClass.TablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreMethodDescriptorSupplier("Tables"))
              .build();
        }
      }
    }
    return getTablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreStub>() {
        @java.lang.Override
        public StoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreStub(channel, callOptions);
        }
      };
    return StoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreBlockingStub>() {
        @java.lang.Override
        public StoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreBlockingStub(channel, callOptions);
        }
      };
    return StoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreFutureStub>() {
        @java.lang.Override
        public StoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreFutureStub(channel, callOptions);
        }
      };
    return StoreFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(go.micro.store.StoreOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void write(go.micro.store.StoreOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.WriteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     */
    public void delete(go.micro.store.StoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(go.micro.store.StoreOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void databases(go.micro.store.StoreOuterClass.DatabasesRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DatabasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDatabasesMethod(), responseObserver);
    }

    /**
     */
    public void tables(go.micro.store.StoreOuterClass.TablesRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.TablesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTablesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.ReadRequest,
                go.micro.store.StoreOuterClass.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.WriteRequest,
                go.micro.store.StoreOuterClass.WriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.DeleteRequest,
                go.micro.store.StoreOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.ListRequest,
                go.micro.store.StoreOuterClass.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getDatabasesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.DatabasesRequest,
                go.micro.store.StoreOuterClass.DatabasesResponse>(
                  this, METHODID_DATABASES)))
          .addMethod(
            getTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.store.StoreOuterClass.TablesRequest,
                go.micro.store.StoreOuterClass.TablesResponse>(
                  this, METHODID_TABLES)))
          .build();
    }
  }

  /**
   */
  public static final class StoreStub extends io.grpc.stub.AbstractAsyncStub<StoreStub> {
    private StoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreStub(channel, callOptions);
    }

    /**
     */
    public void read(go.micro.store.StoreOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(go.micro.store.StoreOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.WriteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(go.micro.store.StoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(go.micro.store.StoreOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void databases(go.micro.store.StoreOuterClass.DatabasesRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DatabasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDatabasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tables(go.micro.store.StoreOuterClass.TablesRequest request,
        io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.TablesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreBlockingStub> {
    private StoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public go.micro.store.StoreOuterClass.ReadResponse read(go.micro.store.StoreOuterClass.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.store.StoreOuterClass.WriteResponse write(go.micro.store.StoreOuterClass.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.store.StoreOuterClass.DeleteResponse delete(go.micro.store.StoreOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<go.micro.store.StoreOuterClass.ListResponse> list(
        go.micro.store.StoreOuterClass.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.store.StoreOuterClass.DatabasesResponse databases(go.micro.store.StoreOuterClass.DatabasesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDatabasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.store.StoreOuterClass.TablesResponse tables(go.micro.store.StoreOuterClass.TablesRequest request) {
      return blockingUnaryCall(
          getChannel(), getTablesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreFutureStub extends io.grpc.stub.AbstractFutureStub<StoreFutureStub> {
    private StoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.store.StoreOuterClass.ReadResponse> read(
        go.micro.store.StoreOuterClass.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.store.StoreOuterClass.WriteResponse> write(
        go.micro.store.StoreOuterClass.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.store.StoreOuterClass.DeleteResponse> delete(
        go.micro.store.StoreOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.store.StoreOuterClass.DatabasesResponse> databases(
        go.micro.store.StoreOuterClass.DatabasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDatabasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.store.StoreOuterClass.TablesResponse> tables(
        go.micro.store.StoreOuterClass.TablesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_DATABASES = 4;
  private static final int METHODID_TABLES = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((go.micro.store.StoreOuterClass.ReadRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((go.micro.store.StoreOuterClass.WriteRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.WriteResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((go.micro.store.StoreOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((go.micro.store.StoreOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.ListResponse>) responseObserver);
          break;
        case METHODID_DATABASES:
          serviceImpl.databases((go.micro.store.StoreOuterClass.DatabasesRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.DatabasesResponse>) responseObserver);
          break;
        case METHODID_TABLES:
          serviceImpl.tables((go.micro.store.StoreOuterClass.TablesRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.store.StoreOuterClass.TablesResponse>) responseObserver);
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

  private static abstract class StoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return go.micro.store.StoreOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Store");
    }
  }

  private static final class StoreFileDescriptorSupplier
      extends StoreBaseDescriptorSupplier {
    StoreFileDescriptorSupplier() {}
  }

  private static final class StoreMethodDescriptorSupplier
      extends StoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getDatabasesMethod())
              .addMethod(getTablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
