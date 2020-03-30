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
 * <pre>
 * Router service is used by the proxy to lookup routes
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: router/router.proto")
public final class RouterGrpc {

  private RouterGrpc() {}

  public static final String SERVICE_NAME = "go.micro.router.Router";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.LookupRequest,
      go.micro.router.RouterOuterClass.LookupResponse> getLookupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lookup",
      requestType = go.micro.router.RouterOuterClass.LookupRequest.class,
      responseType = go.micro.router.RouterOuterClass.LookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.LookupRequest,
      go.micro.router.RouterOuterClass.LookupResponse> getLookupMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.LookupRequest, go.micro.router.RouterOuterClass.LookupResponse> getLookupMethod;
    if ((getLookupMethod = RouterGrpc.getLookupMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getLookupMethod = RouterGrpc.getLookupMethod) == null) {
          RouterGrpc.getLookupMethod = getLookupMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.LookupRequest, go.micro.router.RouterOuterClass.LookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lookup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.LookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.LookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Lookup"))
              .build();
        }
      }
    }
    return getLookupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.WatchRequest,
      go.micro.router.RouterOuterClass.Event> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = go.micro.router.RouterOuterClass.WatchRequest.class,
      responseType = go.micro.router.RouterOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.WatchRequest,
      go.micro.router.RouterOuterClass.Event> getWatchMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.WatchRequest, go.micro.router.RouterOuterClass.Event> getWatchMethod;
    if ((getWatchMethod = RouterGrpc.getWatchMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getWatchMethod = RouterGrpc.getWatchMethod) == null) {
          RouterGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.WatchRequest, go.micro.router.RouterOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Event.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.Advert> getAdvertiseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Advertise",
      requestType = go.micro.router.RouterOuterClass.Request.class,
      responseType = go.micro.router.RouterOuterClass.Advert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.Advert> getAdvertiseMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.Advert> getAdvertiseMethod;
    if ((getAdvertiseMethod = RouterGrpc.getAdvertiseMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getAdvertiseMethod = RouterGrpc.getAdvertiseMethod) == null) {
          RouterGrpc.getAdvertiseMethod = getAdvertiseMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.Advert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Advertise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Advert.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Advertise"))
              .build();
        }
      }
    }
    return getAdvertiseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.Response> getSolicitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Solicit",
      requestType = go.micro.router.RouterOuterClass.Request.class,
      responseType = go.micro.router.RouterOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.Response> getSolicitMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.Response> getSolicitMethod;
    if ((getSolicitMethod = RouterGrpc.getSolicitMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getSolicitMethod = RouterGrpc.getSolicitMethod) == null) {
          RouterGrpc.getSolicitMethod = getSolicitMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Solicit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Solicit"))
              .build();
        }
      }
    }
    return getSolicitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Advert,
      go.micro.router.RouterOuterClass.ProcessResponse> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Process",
      requestType = go.micro.router.RouterOuterClass.Advert.class,
      responseType = go.micro.router.RouterOuterClass.ProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Advert,
      go.micro.router.RouterOuterClass.ProcessResponse> getProcessMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Advert, go.micro.router.RouterOuterClass.ProcessResponse> getProcessMethod;
    if ((getProcessMethod = RouterGrpc.getProcessMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getProcessMethod = RouterGrpc.getProcessMethod) == null) {
          RouterGrpc.getProcessMethod = getProcessMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Advert, go.micro.router.RouterOuterClass.ProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Advert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.ProcessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Process"))
              .build();
        }
      }
    }
    return getProcessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = go.micro.router.RouterOuterClass.Request.class,
      responseType = go.micro.router.RouterOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request,
      go.micro.router.RouterOuterClass.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.StatusResponse> getStatusMethod;
    if ((getStatusMethod = RouterGrpc.getStatusMethod) == null) {
      synchronized (RouterGrpc.class) {
        if ((getStatusMethod = RouterGrpc.getStatusMethod) == null) {
          RouterGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<go.micro.router.RouterOuterClass.Request, go.micro.router.RouterOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.router.RouterOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouterMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouterStub>() {
        @java.lang.Override
        public RouterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouterStub(channel, callOptions);
        }
      };
    return RouterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouterBlockingStub>() {
        @java.lang.Override
        public RouterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouterBlockingStub(channel, callOptions);
        }
      };
    return RouterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouterFutureStub>() {
        @java.lang.Override
        public RouterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouterFutureStub(channel, callOptions);
        }
      };
    return RouterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Router service is used by the proxy to lookup routes
   * </pre>
   */
  public static abstract class RouterImplBase implements io.grpc.BindableService {

    /**
     */
    public void lookup(go.micro.router.RouterOuterClass.LookupRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.LookupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupMethod(), responseObserver);
    }

    /**
     */
    public void watch(go.micro.router.RouterOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    /**
     */
    public void advertise(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Advert> responseObserver) {
      asyncUnimplementedUnaryCall(getAdvertiseMethod(), responseObserver);
    }

    /**
     */
    public void solicit(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSolicitMethod(), responseObserver);
    }

    /**
     */
    public void process(go.micro.router.RouterOuterClass.Advert request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ProcessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    /**
     */
    public void status(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLookupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.LookupRequest,
                go.micro.router.RouterOuterClass.LookupResponse>(
                  this, METHODID_LOOKUP)))
          .addMethod(
            getWatchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.WatchRequest,
                go.micro.router.RouterOuterClass.Event>(
                  this, METHODID_WATCH)))
          .addMethod(
            getAdvertiseMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Request,
                go.micro.router.RouterOuterClass.Advert>(
                  this, METHODID_ADVERTISE)))
          .addMethod(
            getSolicitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Request,
                go.micro.router.RouterOuterClass.Response>(
                  this, METHODID_SOLICIT)))
          .addMethod(
            getProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Advert,
                go.micro.router.RouterOuterClass.ProcessResponse>(
                  this, METHODID_PROCESS)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.router.RouterOuterClass.Request,
                go.micro.router.RouterOuterClass.StatusResponse>(
                  this, METHODID_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Router service is used by the proxy to lookup routes
   * </pre>
   */
  public static final class RouterStub extends io.grpc.stub.AbstractAsyncStub<RouterStub> {
    private RouterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouterStub(channel, callOptions);
    }

    /**
     */
    public void lookup(go.micro.router.RouterOuterClass.LookupRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.LookupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watch(go.micro.router.RouterOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void advertise(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Advert> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAdvertiseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void solicit(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSolicitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void process(go.micro.router.RouterOuterClass.Advert request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ProcessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void status(go.micro.router.RouterOuterClass.Request request,
        io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Router service is used by the proxy to lookup routes
   * </pre>
   */
  public static final class RouterBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouterBlockingStub> {
    private RouterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouterBlockingStub(channel, callOptions);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.LookupResponse lookup(go.micro.router.RouterOuterClass.LookupRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<go.micro.router.RouterOuterClass.Event> watch(
        go.micro.router.RouterOuterClass.WatchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<go.micro.router.RouterOuterClass.Advert> advertise(
        go.micro.router.RouterOuterClass.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getAdvertiseMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.Response solicit(go.micro.router.RouterOuterClass.Request request) {
      return blockingUnaryCall(
          getChannel(), getSolicitMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.ProcessResponse process(go.micro.router.RouterOuterClass.Advert request) {
      return blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.router.RouterOuterClass.StatusResponse status(go.micro.router.RouterOuterClass.Request request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Router service is used by the proxy to lookup routes
   * </pre>
   */
  public static final class RouterFutureStub extends io.grpc.stub.AbstractFutureStub<RouterFutureStub> {
    private RouterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.LookupResponse> lookup(
        go.micro.router.RouterOuterClass.LookupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.Response> solicit(
        go.micro.router.RouterOuterClass.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSolicitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.ProcessResponse> process(
        go.micro.router.RouterOuterClass.Advert request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.router.RouterOuterClass.StatusResponse> status(
        go.micro.router.RouterOuterClass.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP = 0;
  private static final int METHODID_WATCH = 1;
  private static final int METHODID_ADVERTISE = 2;
  private static final int METHODID_SOLICIT = 3;
  private static final int METHODID_PROCESS = 4;
  private static final int METHODID_STATUS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOOKUP:
          serviceImpl.lookup((go.micro.router.RouterOuterClass.LookupRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.LookupResponse>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((go.micro.router.RouterOuterClass.WatchRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Event>) responseObserver);
          break;
        case METHODID_ADVERTISE:
          serviceImpl.advertise((go.micro.router.RouterOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Advert>) responseObserver);
          break;
        case METHODID_SOLICIT:
          serviceImpl.solicit((go.micro.router.RouterOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.Response>) responseObserver);
          break;
        case METHODID_PROCESS:
          serviceImpl.process((go.micro.router.RouterOuterClass.Advert) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.ProcessResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((go.micro.router.RouterOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<go.micro.router.RouterOuterClass.StatusResponse>) responseObserver);
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

  private static abstract class RouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return go.micro.router.RouterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Router");
    }
  }

  private static final class RouterFileDescriptorSupplier
      extends RouterBaseDescriptorSupplier {
    RouterFileDescriptorSupplier() {}
  }

  private static final class RouterMethodDescriptorSupplier
      extends RouterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouterMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouterFileDescriptorSupplier())
              .addMethod(getLookupMethod())
              .addMethod(getWatchMethod())
              .addMethod(getAdvertiseMethod())
              .addMethod(getSolicitMethod())
              .addMethod(getProcessMethod())
              .addMethod(getStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
