// This file is generated. Do not edit
// @generated

// https://github.com/Manishearth/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy::all)]

#![cfg_attr(rustfmt, rustfmt_skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unsafe_code)]
#![allow(unused_imports)]
#![allow(unused_results)]


// interface

pub trait Auth {
    fn generate(&self, o: ::grpc::RequestOptions, p: super::auth::GenerateRequest) -> ::grpc::SingleResponse<super::auth::GenerateResponse>;

    fn inspect(&self, o: ::grpc::RequestOptions, p: super::auth::InspectRequest) -> ::grpc::SingleResponse<super::auth::InspectResponse>;

    fn refresh(&self, o: ::grpc::RequestOptions, p: super::auth::RefreshRequest) -> ::grpc::SingleResponse<super::auth::RefreshResponse>;
}

// client

pub struct AuthClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Generate: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::GenerateRequest, super::auth::GenerateResponse>>,
    method_Inspect: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::InspectRequest, super::auth::InspectResponse>>,
    method_Refresh: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::RefreshRequest, super::auth::RefreshResponse>>,
}

impl ::grpc::ClientStub for AuthClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        AuthClient {
            grpc_client: grpc_client,
            method_Generate: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Auth/Generate".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Inspect: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Auth/Inspect".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Refresh: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Auth/Refresh".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Auth for AuthClient {
    fn generate(&self, o: ::grpc::RequestOptions, p: super::auth::GenerateRequest) -> ::grpc::SingleResponse<super::auth::GenerateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Generate.clone())
    }

    fn inspect(&self, o: ::grpc::RequestOptions, p: super::auth::InspectRequest) -> ::grpc::SingleResponse<super::auth::InspectResponse> {
        self.grpc_client.call_unary(o, p, self.method_Inspect.clone())
    }

    fn refresh(&self, o: ::grpc::RequestOptions, p: super::auth::RefreshRequest) -> ::grpc::SingleResponse<super::auth::RefreshResponse> {
        self.grpc_client.call_unary(o, p, self.method_Refresh.clone())
    }
}

// server

pub struct AuthServer;


impl AuthServer {
    pub fn new_service_def<H : Auth + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.auth.Auth",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.auth.Auth/Generate".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.generate(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.auth.Auth/Inspect".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.inspect(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.auth.Auth/Refresh".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.refresh(o, p))
                    },
                ),
            ],
        )
    }
}
