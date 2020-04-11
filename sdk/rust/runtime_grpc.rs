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

pub trait Runtime {
    fn create(&self, o: ::grpc::RequestOptions, p: super::runtime::CreateRequest) -> ::grpc::SingleResponse<super::runtime::CreateResponse>;

    fn read(&self, o: ::grpc::RequestOptions, p: super::runtime::ReadRequest) -> ::grpc::SingleResponse<super::runtime::ReadResponse>;

    fn delete(&self, o: ::grpc::RequestOptions, p: super::runtime::DeleteRequest) -> ::grpc::SingleResponse<super::runtime::DeleteResponse>;

    fn update(&self, o: ::grpc::RequestOptions, p: super::runtime::UpdateRequest) -> ::grpc::SingleResponse<super::runtime::UpdateResponse>;

    fn list(&self, o: ::grpc::RequestOptions, p: super::runtime::ListRequest) -> ::grpc::SingleResponse<super::runtime::ListResponse>;
}

// client

pub struct RuntimeClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Create: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::runtime::CreateRequest, super::runtime::CreateResponse>>,
    method_Read: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::runtime::ReadRequest, super::runtime::ReadResponse>>,
    method_Delete: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::runtime::DeleteRequest, super::runtime::DeleteResponse>>,
    method_Update: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::runtime::UpdateRequest, super::runtime::UpdateResponse>>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::runtime::ListRequest, super::runtime::ListResponse>>,
}

impl ::grpc::ClientStub for RuntimeClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        RuntimeClient {
            grpc_client: grpc_client,
            method_Create: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.runtime.Runtime/Create".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Read: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.runtime.Runtime/Read".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Delete: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.runtime.Runtime/Delete".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Update: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.runtime.Runtime/Update".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_List: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.runtime.Runtime/List".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Runtime for RuntimeClient {
    fn create(&self, o: ::grpc::RequestOptions, p: super::runtime::CreateRequest) -> ::grpc::SingleResponse<super::runtime::CreateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Create.clone())
    }

    fn read(&self, o: ::grpc::RequestOptions, p: super::runtime::ReadRequest) -> ::grpc::SingleResponse<super::runtime::ReadResponse> {
        self.grpc_client.call_unary(o, p, self.method_Read.clone())
    }

    fn delete(&self, o: ::grpc::RequestOptions, p: super::runtime::DeleteRequest) -> ::grpc::SingleResponse<super::runtime::DeleteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Delete.clone())
    }

    fn update(&self, o: ::grpc::RequestOptions, p: super::runtime::UpdateRequest) -> ::grpc::SingleResponse<super::runtime::UpdateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Update.clone())
    }

    fn list(&self, o: ::grpc::RequestOptions, p: super::runtime::ListRequest) -> ::grpc::SingleResponse<super::runtime::ListResponse> {
        self.grpc_client.call_unary(o, p, self.method_List.clone())
    }
}

// server

pub struct RuntimeServer;


impl RuntimeServer {
    pub fn new_service_def<H : Runtime + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.runtime.Runtime",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.runtime.Runtime/Create".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.create(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.runtime.Runtime/Read".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.read(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.runtime.Runtime/Delete".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.delete(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.runtime.Runtime/Update".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.update(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.runtime.Runtime/List".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.list(o, p))
                    },
                ),
            ],
        )
    }
}
