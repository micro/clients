package go.micro.network;

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
 * Network service is usesd to gain visibility into networks
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: network/network.proto")
public final class NetworkGrpc {

  private NetworkGrpc() {}

  public static final String SERVICE_NAME = "go.micro.network.Network";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ConnectRequest,
      go.micro.network.NetworkOuterClass.ConnectResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = go.micro.network.NetworkOuterClass.ConnectRequest.class,
      responseType = go.micro.network.NetworkOuterClass.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ConnectRequest,
      go.micro.network.NetworkOuterClass.ConnectResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ConnectRequest, go.micro.network.NetworkOuterClass.ConnectResponse> getConnectMethod;
    if ((getConnectMethod = NetworkGrpc.getConnectMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getConnectMethod = NetworkGrpc.getConnectMethod) == null) {
          NetworkGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.ConnectRequest, go.micro.network.NetworkOuterClass.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.ConnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.GraphRequest,
      go.micro.network.NetworkOuterClass.GraphResponse> getGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Graph",
      requestType = go.micro.network.NetworkOuterClass.GraphRequest.class,
      responseType = go.micro.network.NetworkOuterClass.GraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.GraphRequest,
      go.micro.network.NetworkOuterClass.GraphResponse> getGraphMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.GraphRequest, go.micro.network.NetworkOuterClass.GraphResponse> getGraphMethod;
    if ((getGraphMethod = NetworkGrpc.getGraphMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getGraphMethod = NetworkGrpc.getGraphMethod) == null) {
          NetworkGrpc.getGraphMethod = getGraphMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.GraphRequest, go.micro.network.NetworkOuterClass.GraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Graph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.GraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.GraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Graph"))
              .build();
        }
      }
    }
    return getGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.NodesRequest,
      go.micro.network.NetworkOuterClass.NodesResponse> getNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Nodes",
      requestType = go.micro.network.NetworkOuterClass.NodesRequest.class,
      responseType = go.micro.network.NetworkOuterClass.NodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.NodesRequest,
      go.micro.network.NetworkOuterClass.NodesResponse> getNodesMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.NodesRequest, go.micro.network.NetworkOuterClass.NodesResponse> getNodesMethod;
    if ((getNodesMethod = NetworkGrpc.getNodesMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getNodesMethod = NetworkGrpc.getNodesMethod) == null) {
          NetworkGrpc.getNodesMethod = getNodesMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.NodesRequest, go.micro.network.NetworkOuterClass.NodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Nodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.NodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.NodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Nodes"))
              .build();
        }
      }
    }
    return getNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.RoutesRequest,
      go.micro.network.NetworkOuterClass.RoutesResponse> getRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Routes",
      requestType = go.micro.network.NetworkOuterClass.RoutesRequest.class,
      responseType = go.micro.network.NetworkOuterClass.RoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.RoutesRequest,
      go.micro.network.NetworkOuterClass.RoutesResponse> getRoutesMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.RoutesRequest, go.micro.network.NetworkOuterClass.RoutesResponse> getRoutesMethod;
    if ((getRoutesMethod = NetworkGrpc.getRoutesMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getRoutesMethod = NetworkGrpc.getRoutesMethod) == null) {
          NetworkGrpc.getRoutesMethod = getRoutesMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.RoutesRequest, go.micro.network.NetworkOuterClass.RoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Routes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.RoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.RoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Routes"))
              .build();
        }
      }
    }
    return getRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ServicesRequest,
      go.micro.network.NetworkOuterClass.ServicesResponse> getServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Services",
      requestType = go.micro.network.NetworkOuterClass.ServicesRequest.class,
      responseType = go.micro.network.NetworkOuterClass.ServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ServicesRequest,
      go.micro.network.NetworkOuterClass.ServicesResponse> getServicesMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.ServicesRequest, go.micro.network.NetworkOuterClass.ServicesResponse> getServicesMethod;
    if ((getServicesMethod = NetworkGrpc.getServicesMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getServicesMethod = NetworkGrpc.getServicesMethod) == null) {
          NetworkGrpc.getServicesMethod = getServicesMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.ServicesRequest, go.micro.network.NetworkOuterClass.ServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Services"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.ServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.ServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Services"))
              .build();
        }
      }
    }
    return getServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.StatusRequest,
      go.micro.network.NetworkOuterClass.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = go.micro.network.NetworkOuterClass.StatusRequest.class,
      responseType = go.micro.network.NetworkOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.StatusRequest,
      go.micro.network.NetworkOuterClass.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<go.micro.network.NetworkOuterClass.StatusRequest, go.micro.network.NetworkOuterClass.StatusResponse> getStatusMethod;
    if ((getStatusMethod = NetworkGrpc.getStatusMethod) == null) {
      synchronized (NetworkGrpc.class) {
        if ((getStatusMethod = NetworkGrpc.getStatusMethod) == null) {
          NetworkGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<go.micro.network.NetworkOuterClass.StatusRequest, go.micro.network.NetworkOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.network.NetworkOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkStub>() {
        @java.lang.Override
        public NetworkStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkStub(channel, callOptions);
        }
      };
    return NetworkStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkBlockingStub>() {
        @java.lang.Override
        public NetworkBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkBlockingStub(channel, callOptions);
        }
      };
    return NetworkBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkFutureStub>() {
        @java.lang.Override
        public NetworkFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkFutureStub(channel, callOptions);
        }
      };
    return NetworkFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Network service is usesd to gain visibility into networks
   * </pre>
   */
  public static abstract class NetworkImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Connect to the network
     * </pre>
     */
    public void connect(go.micro.network.NetworkOuterClass.ConnectRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ConnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the entire network graph
     * </pre>
     */
    public void graph(go.micro.network.NetworkOuterClass.GraphRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.GraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known nodes in the network
     * </pre>
     */
    public void nodes(go.micro.network.NetworkOuterClass.NodesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.NodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known routes in the network
     * </pre>
     */
    public void routes(go.micro.network.NetworkOuterClass.RoutesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.RoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known services based on routes
     * </pre>
     */
    public void services(go.micro.network.NetworkOuterClass.ServicesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ServicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status returns network status
     * </pre>
     */
    public void status(go.micro.network.NetworkOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.ConnectRequest,
                go.micro.network.NetworkOuterClass.ConnectResponse>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.GraphRequest,
                go.micro.network.NetworkOuterClass.GraphResponse>(
                  this, METHODID_GRAPH)))
          .addMethod(
            getNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.NodesRequest,
                go.micro.network.NetworkOuterClass.NodesResponse>(
                  this, METHODID_NODES)))
          .addMethod(
            getRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.RoutesRequest,
                go.micro.network.NetworkOuterClass.RoutesResponse>(
                  this, METHODID_ROUTES)))
          .addMethod(
            getServicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.ServicesRequest,
                go.micro.network.NetworkOuterClass.ServicesResponse>(
                  this, METHODID_SERVICES)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.network.NetworkOuterClass.StatusRequest,
                go.micro.network.NetworkOuterClass.StatusResponse>(
                  this, METHODID_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Network service is usesd to gain visibility into networks
   * </pre>
   */
  public static final class NetworkStub extends io.grpc.stub.AbstractAsyncStub<NetworkStub> {
    private NetworkStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the network
     * </pre>
     */
    public void connect(go.micro.network.NetworkOuterClass.ConnectRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ConnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the entire network graph
     * </pre>
     */
    public void graph(go.micro.network.NetworkOuterClass.GraphRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.GraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known nodes in the network
     * </pre>
     */
    public void nodes(go.micro.network.NetworkOuterClass.NodesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.NodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known routes in the network
     * </pre>
     */
    public void routes(go.micro.network.NetworkOuterClass.RoutesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.RoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of known services based on routes
     * </pre>
     */
    public void services(go.micro.network.NetworkOuterClass.ServicesRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ServicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status returns network status
     * </pre>
     */
    public void status(go.micro.network.NetworkOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Network service is usesd to gain visibility into networks
   * </pre>
   */
  public static final class NetworkBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkBlockingStub> {
    private NetworkBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the network
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.ConnectResponse connect(go.micro.network.NetworkOuterClass.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entire network graph
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.GraphResponse graph(go.micro.network.NetworkOuterClass.GraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of known nodes in the network
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.NodesResponse nodes(go.micro.network.NetworkOuterClass.NodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of known routes in the network
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.RoutesResponse routes(go.micro.network.NetworkOuterClass.RoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of known services based on routes
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.ServicesResponse services(go.micro.network.NetworkOuterClass.ServicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status returns network status
     * </pre>
     */
    public go.micro.network.NetworkOuterClass.StatusResponse status(go.micro.network.NetworkOuterClass.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Network service is usesd to gain visibility into networks
   * </pre>
   */
  public static final class NetworkFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkFutureStub> {
    private NetworkFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.ConnectResponse> connect(
        go.micro.network.NetworkOuterClass.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the entire network graph
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.GraphResponse> graph(
        go.micro.network.NetworkOuterClass.GraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of known nodes in the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.NodesResponse> nodes(
        go.micro.network.NetworkOuterClass.NodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of known routes in the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.RoutesResponse> routes(
        go.micro.network.NetworkOuterClass.RoutesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of known services based on routes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.ServicesResponse> services(
        go.micro.network.NetworkOuterClass.ServicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getServicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Status returns network status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.network.NetworkOuterClass.StatusResponse> status(
        go.micro.network.NetworkOuterClass.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT = 0;
  private static final int METHODID_GRAPH = 1;
  private static final int METHODID_NODES = 2;
  private static final int METHODID_ROUTES = 3;
  private static final int METHODID_SERVICES = 4;
  private static final int METHODID_STATUS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT:
          serviceImpl.connect((go.micro.network.NetworkOuterClass.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ConnectResponse>) responseObserver);
          break;
        case METHODID_GRAPH:
          serviceImpl.graph((go.micro.network.NetworkOuterClass.GraphRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.GraphResponse>) responseObserver);
          break;
        case METHODID_NODES:
          serviceImpl.nodes((go.micro.network.NetworkOuterClass.NodesRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.NodesResponse>) responseObserver);
          break;
        case METHODID_ROUTES:
          serviceImpl.routes((go.micro.network.NetworkOuterClass.RoutesRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.RoutesResponse>) responseObserver);
          break;
        case METHODID_SERVICES:
          serviceImpl.services((go.micro.network.NetworkOuterClass.ServicesRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.ServicesResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((go.micro.network.NetworkOuterClass.StatusRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.network.NetworkOuterClass.StatusResponse>) responseObserver);
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

  private static abstract class NetworkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return go.micro.network.NetworkOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Network");
    }
  }

  private static final class NetworkFileDescriptorSupplier
      extends NetworkBaseDescriptorSupplier {
    NetworkFileDescriptorSupplier() {}
  }

  private static final class NetworkMethodDescriptorSupplier
      extends NetworkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkFileDescriptorSupplier())
              .addMethod(getConnectMethod())
              .addMethod(getGraphMethod())
              .addMethod(getNodesMethod())
              .addMethod(getRoutesMethod())
              .addMethod(getServicesMethod())
              .addMethod(getStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
