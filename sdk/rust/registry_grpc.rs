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

pub trait Registry {
    fn get_service(&self, o: ::grpc::RequestOptions, p: super::registry::GetRequest) -> ::grpc::SingleResponse<super::registry::GetResponse>;

    fn register(&self, o: ::grpc::RequestOptions, p: super::registry::Service) -> ::grpc::SingleResponse<super::registry::EmptyResponse>;

    fn deregister(&self, o: ::grpc::RequestOptions, p: super::registry::Service) -> ::grpc::SingleResponse<super::registry::EmptyResponse>;

    fn list_services(&self, o: ::grpc::RequestOptions, p: super::registry::ListRequest) -> ::grpc::SingleResponse<super::registry::ListResponse>;

    fn watch(&self, o: ::grpc::RequestOptions, p: super::registry::WatchRequest) -> ::grpc::StreamingResponse<super::registry::Result>;
}

// client

pub struct RegistryClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_GetService: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::registry::GetRequest, super::registry::GetResponse>>,
    method_Register: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::registry::Service, super::registry::EmptyResponse>>,
    method_Deregister: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::registry::Service, super::registry::EmptyResponse>>,
    method_ListServices: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::registry::ListRequest, super::registry::ListResponse>>,
    method_Watch: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::registry::WatchRequest, super::registry::Result>>,
}

impl ::grpc::ClientStub for RegistryClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        RegistryClient {
            grpc_client: grpc_client,
            method_GetService: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.registry.Registry/GetService".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Register: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.registry.Registry/Register".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Deregister: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.registry.Registry/Deregister".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_ListServices: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.registry.Registry/ListServices".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Watch: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.registry.Registry/Watch".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Registry for RegistryClient {
    fn get_service(&self, o: ::grpc::RequestOptions, p: super::registry::GetRequest) -> ::grpc::SingleResponse<super::registry::GetResponse> {
        self.grpc_client.call_unary(o, p, self.method_GetService.clone())
    }

    fn register(&self, o: ::grpc::RequestOptions, p: super::registry::Service) -> ::grpc::SingleResponse<super::registry::EmptyResponse> {
        self.grpc_client.call_unary(o, p, self.method_Register.clone())
    }

    fn deregister(&self, o: ::grpc::RequestOptions, p: super::registry::Service) -> ::grpc::SingleResponse<super::registry::EmptyResponse> {
        self.grpc_client.call_unary(o, p, self.method_Deregister.clone())
    }

    fn list_services(&self, o: ::grpc::RequestOptions, p: super::registry::ListRequest) -> ::grpc::SingleResponse<super::registry::ListResponse> {
        self.grpc_client.call_unary(o, p, self.method_ListServices.clone())
    }

    fn watch(&self, o: ::grpc::RequestOptions, p: super::registry::WatchRequest) -> ::grpc::StreamingResponse<super::registry::Result> {
        self.grpc_client.call_server_streaming(o, p, self.method_Watch.clone())
    }
}

// server

pub struct RegistryServer;


impl RegistryServer {
    pub fn new_service_def<H : Registry + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.registry.Registry",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.registry.Registry/GetService".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.get_service(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.registry.Registry/Register".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.register(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.registry.Registry/Deregister".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.deregister(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.registry.Registry/ListServices".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.list_services(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.registry.Registry/Watch".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerServerStreaming::new(move |o, p| handler_copy.watch(o, p))
                    },
                ),
            ],
        )
    }
}
