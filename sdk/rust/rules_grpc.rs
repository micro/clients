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

pub trait Rules {
    fn create(&self, o: ::grpc::RequestOptions, p: super::rules::CreateRequest) -> ::grpc::SingleResponse<super::rules::CreateResponse>;

    fn delete(&self, o: ::grpc::RequestOptions, p: super::rules::DeleteRequest) -> ::grpc::SingleResponse<super::rules::DeleteResponse>;

    fn list(&self, o: ::grpc::RequestOptions, p: super::rules::ListRequest) -> ::grpc::SingleResponse<super::rules::ListResponse>;
}

// client

pub struct RulesClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Create: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::rules::CreateRequest, super::rules::CreateResponse>>,
    method_Delete: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::rules::DeleteRequest, super::rules::DeleteResponse>>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::rules::ListRequest, super::rules::ListResponse>>,
}

impl ::grpc::ClientStub for RulesClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        RulesClient {
            grpc_client: grpc_client,
            method_Create: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Rules/Create".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Delete: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Rules/Delete".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_List: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Rules/List".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Rules for RulesClient {
    fn create(&self, o: ::grpc::RequestOptions, p: super::rules::CreateRequest) -> ::grpc::SingleResponse<super::rules::CreateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Create.clone())
    }

    fn delete(&self, o: ::grpc::RequestOptions, p: super::rules::DeleteRequest) -> ::grpc::SingleResponse<super::rules::DeleteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Delete.clone())
    }

    fn list(&self, o: ::grpc::RequestOptions, p: super::rules::ListRequest) -> ::grpc::SingleResponse<super::rules::ListResponse> {
        self.grpc_client.call_unary(o, p, self.method_List.clone())
    }
}

// server

pub struct RulesServer;


impl RulesServer {
    pub fn new_service_def<H : Rules + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.auth.Rules",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.auth.Rules/Create".to_string(),
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
                        name: "/go.micro.auth.Rules/Delete".to_string(),
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
                        name: "/go.micro.auth.Rules/List".to_string(),
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
