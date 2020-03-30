package go.micro.auth;

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
    comments = "Source: auth/auth.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "go.micro.auth.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.GenerateRequest,
      go.micro.auth.AuthOuterClass.GenerateResponse> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = go.micro.auth.AuthOuterClass.GenerateRequest.class,
      responseType = go.micro.auth.AuthOuterClass.GenerateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.GenerateRequest,
      go.micro.auth.AuthOuterClass.GenerateResponse> getGenerateMethod() {
    io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.GenerateRequest, go.micro.auth.AuthOuterClass.GenerateResponse> getGenerateMethod;
    if ((getGenerateMethod = AuthGrpc.getGenerateMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getGenerateMethod = AuthGrpc.getGenerateMethod) == null) {
          AuthGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<go.micro.auth.AuthOuterClass.GenerateRequest, go.micro.auth.AuthOuterClass.GenerateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.GenerateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.GenerateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.InspectRequest,
      go.micro.auth.AuthOuterClass.InspectResponse> getInspectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Inspect",
      requestType = go.micro.auth.AuthOuterClass.InspectRequest.class,
      responseType = go.micro.auth.AuthOuterClass.InspectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.InspectRequest,
      go.micro.auth.AuthOuterClass.InspectResponse> getInspectMethod() {
    io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.InspectRequest, go.micro.auth.AuthOuterClass.InspectResponse> getInspectMethod;
    if ((getInspectMethod = AuthGrpc.getInspectMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getInspectMethod = AuthGrpc.getInspectMethod) == null) {
          AuthGrpc.getInspectMethod = getInspectMethod =
              io.grpc.MethodDescriptor.<go.micro.auth.AuthOuterClass.InspectRequest, go.micro.auth.AuthOuterClass.InspectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Inspect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.InspectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.InspectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Inspect"))
              .build();
        }
      }
    }
    return getInspectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.RefreshRequest,
      go.micro.auth.AuthOuterClass.RefreshResponse> getRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Refresh",
      requestType = go.micro.auth.AuthOuterClass.RefreshRequest.class,
      responseType = go.micro.auth.AuthOuterClass.RefreshResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.RefreshRequest,
      go.micro.auth.AuthOuterClass.RefreshResponse> getRefreshMethod() {
    io.grpc.MethodDescriptor<go.micro.auth.AuthOuterClass.RefreshRequest, go.micro.auth.AuthOuterClass.RefreshResponse> getRefreshMethod;
    if ((getRefreshMethod = AuthGrpc.getRefreshMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRefreshMethod = AuthGrpc.getRefreshMethod) == null) {
          AuthGrpc.getRefreshMethod = getRefreshMethod =
              io.grpc.MethodDescriptor.<go.micro.auth.AuthOuterClass.RefreshRequest, go.micro.auth.AuthOuterClass.RefreshResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Refresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.RefreshRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  go.micro.auth.AuthOuterClass.RefreshResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Refresh"))
              .build();
        }
      }
    }
    return getRefreshMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void generate(go.micro.auth.AuthOuterClass.GenerateRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.GenerateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    /**
     */
    public void inspect(go.micro.auth.AuthOuterClass.InspectRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.InspectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInspectMethod(), responseObserver);
    }

    /**
     */
    public void refresh(go.micro.auth.AuthOuterClass.RefreshRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.RefreshResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.auth.AuthOuterClass.GenerateRequest,
                go.micro.auth.AuthOuterClass.GenerateResponse>(
                  this, METHODID_GENERATE)))
          .addMethod(
            getInspectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.auth.AuthOuterClass.InspectRequest,
                go.micro.auth.AuthOuterClass.InspectResponse>(
                  this, METHODID_INSPECT)))
          .addMethod(
            getRefreshMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                go.micro.auth.AuthOuterClass.RefreshRequest,
                go.micro.auth.AuthOuterClass.RefreshResponse>(
                  this, METHODID_REFRESH)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     */
    public void generate(go.micro.auth.AuthOuterClass.GenerateRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.GenerateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inspect(go.micro.auth.AuthOuterClass.InspectRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.InspectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInspectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refresh(go.micro.auth.AuthOuterClass.RefreshRequest request,
        io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.RefreshResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public go.micro.auth.AuthOuterClass.GenerateResponse generate(go.micro.auth.AuthOuterClass.GenerateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.auth.AuthOuterClass.InspectResponse inspect(go.micro.auth.AuthOuterClass.InspectRequest request) {
      return blockingUnaryCall(
          getChannel(), getInspectMethod(), getCallOptions(), request);
    }

    /**
     */
    public go.micro.auth.AuthOuterClass.RefreshResponse refresh(go.micro.auth.AuthOuterClass.RefreshRequest request) {
      return blockingUnaryCall(
          getChannel(), getRefreshMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.auth.AuthOuterClass.GenerateResponse> generate(
        go.micro.auth.AuthOuterClass.GenerateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.auth.AuthOuterClass.InspectResponse> inspect(
        go.micro.auth.AuthOuterClass.InspectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInspectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<go.micro.auth.AuthOuterClass.RefreshResponse> refresh(
        go.micro.auth.AuthOuterClass.RefreshRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE = 0;
  private static final int METHODID_INSPECT = 1;
  private static final int METHODID_REFRESH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((go.micro.auth.AuthOuterClass.GenerateRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.GenerateResponse>) responseObserver);
          break;
        case METHODID_INSPECT:
          serviceImpl.inspect((go.micro.auth.AuthOuterClass.InspectRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.InspectResponse>) responseObserver);
          break;
        case METHODID_REFRESH:
          serviceImpl.refresh((go.micro.auth.AuthOuterClass.RefreshRequest) request,
              (io.grpc.stub.StreamObserver<go.micro.auth.AuthOuterClass.RefreshResponse>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return go.micro.auth.AuthOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .addMethod(getInspectMethod())
              .addMethod(getRefreshMethod())
              .build();
        }
      }
    }
    return result;
  }
}
