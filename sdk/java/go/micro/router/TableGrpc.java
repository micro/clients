package go.micro.router;

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
    comments = "Source: router/router.proto")
public final class TableGrpc {

  private TableGrpc() {}

  public static final String SERVICE_NAME = "go.micro.router.Table";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = go.micro.router.RouterOuterClass.Route.class,
      responseType = go.micro.router.RouterOuterClass.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.CreateResponse> getCreateMethod;
    if ((getCreateMethod = TableGrpc.getCreateMethod) == null) {
      synchronized (TableGrpc.class) {
        if ((getCreateMethod = TableGrpc.getCreateMethod) == null) {
          TableGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = go.micro.router.RouterOuterClass.Route.class,
      responseType = go.micro.router.RouterOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = TableGrpc.getDeleteMethod) == null) {
      synchronized (TableGrpc.class) {
        if ((getDeleteMethod = TableGrpc.getDeleteMethod) == null) {
          TableGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = go.micro.router.RouterOuterClass.Route.class,
      responseType = go.micro.router.RouterOuterClass.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route,
      go.micro.router.RouterOuterClass.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = TableGrpc.getUpdateMethod) == null) {
      synchronized (TableGrpc.class) {
        if ((getUpdateMethod = TableGrpc.getUpdateMethod) == null) {
          TableGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Route, go.micro.router.RouterOuterClass.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = go.micro.router.RouterOuterClass.Request.class,
      responseType = go.micro.router.RouterOuterClass.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.ListResponse> getListMethod;
    if ((getListMethod = TableGrpc.getListMethod) == null) {
      synchronized (TableGrpc.class) {
        if ((getListMethod = TableGrpc.getListMethod) == null) {
          TableGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.QueryRequest,
      go.micro.router.RouterOuterClass.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = go.micro.router.RouterOuterClass.QueryRequest.class,
      responseType = go.micro.router.RouterOuterClass.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.QueryRequest,
      go.micro.router.RouterOuterClass.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.QueryRequest, go.micro.router.RouterOuterClass.QueryResponse> getQueryMethod;
    if ((getQueryMethod = TableGrpc.getQueryMethod) == null) {
      synchronized (TableGrpc.class) {
        if ((getQueryMethod = TableGrpc.getQueryMethod) == null) {
          TableGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.QueryRequest, go.micro.router.RouterOuterClass.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.QueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableStub>() {
        @java.lang.Override
        public TableStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableStub(channel, callOptions);
        }
      };
    return TableStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableBlockingStub>() {
        @java.lang.Override
        public TableBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableBlockingStub(channel, callOptions);
        }
      };
    return TableBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableFutureStub>() {
        @java.lang.Override
        public TableFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableFutureStub(channel, callOptions);
        }
      };
    return TableFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TableImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void delete(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void update(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void list(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void query(go.micro.router.RouterOuterClass.QueryRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.QueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Route,
                go.micro.router.RouterOuterClass.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Route,
                go.micro.router.RouterOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Route,
                go.micro.router.RouterOuterClass.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Request,
                go.micro.router.RouterOuterClass.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.QueryRequest,
                go.micro.router.RouterOuterClass.QueryResponse>(
                  this, METHODID_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class TableStub extends io.grpc.stub.AbstractAsyncStub<TableStub> {
    private TableStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableStub(channel, callOptions);
    }

    /**
     */
    public void create(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(go.micro.router.RouterOuterClass.Route request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(go.micro.router.RouterOuterClass.QueryRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.QueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TableBlockingStub extends io.grpc.stub.AbstractBlockingStub<TableBlockingStub> {
    private TableBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableBlockingStub(channel, callOptions);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.CreateResponse create(go.micro.router.RouterOuterClass.Route request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.DeleteResponse delete(go.micro.router.RouterOuterClass.Route request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.UpdateResponse update(go.micro.router.RouterOuterClass.Route request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.ListResponse list(go.micro.router.RouterOuterClass.Request request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.QueryResponse query(go.micro.router.RouterOuterClass.QueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TableFutureStub extends io.grpc.stub.AbstractFutureStub<TableFutureStub> {
    private TableFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.CreateResponse> create(
        go.micro.router.RouterOuterClass.Route request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.DeleteResponse> delete(
        go.micro.router.RouterOuterClass.Route request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.UpdateResponse> update(
        go.micro.router.RouterOuterClass.Route request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.ListResponse> list(
        go.micro.router.RouterOuterClass.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.QueryResponse> query(
        go.micro.router.RouterOuterClass.QueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_QUERY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((go.micro.router.RouterOuterClass.Route) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.CreateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((go.micro.router.RouterOuterClass.Route) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.DeleteResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((go.micro.router.RouterOuterClass.Route) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.UpdateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((go.micro.router.RouterOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ListResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((go.micro.router.RouterOuterClass.QueryRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.QueryResponse>) responseObserver);
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

  private static abstract class TableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return go.micro.router.RouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Table");
    }
  }

  private static final class TableFileDescriptorSupplier
      extends TableBaseDescriptorSupplier {
    TableFileDescriptorSupplier() {}
  }

  private static final class TableMethodDescriptorSupplier
      extends TableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableMethodDescriptorSupplier(String methodName) {
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
      synchronized (TableGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListMethod())
              .addMethod(getQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
