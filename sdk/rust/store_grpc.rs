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

pub trait Store {
    fn read(&self, o: ::grpc::RequestOptions, p: super::store::ReadRequest) -> ::grpc::SingleResponse<super::store::ReadResponse>;

    fn write(&self, o: ::grpc::RequestOptions, p: super::store::WriteRequest) -> ::grpc::SingleResponse<super::store::WriteResponse>;

    fn delete(&self, o: ::grpc::RequestOptions, p: super::store::DeleteRequest) -> ::grpc::SingleResponse<super::store::DeleteResponse>;

    fn list(&self, o: ::grpc::RequestOptions, p: super::store::ListRequest) -> ::grpc::StreamingResponse<super::store::ListResponse>;

    fn databases(&self, o: ::grpc::RequestOptions, p: super::store::DatabasesRequest) -> ::grpc::SingleResponse<super::store::DatabasesResponse>;

    fn tables(&self, o: ::grpc::RequestOptions, p: super::store::TablesRequest) -> ::grpc::SingleResponse<super::store::TablesResponse>;
}

// client

pub struct StoreClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Read: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::ReadRequest, super::store::ReadResponse>>,
    method_Write: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::WriteRequest, super::store::WriteResponse>>,
    method_Delete: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::DeleteRequest, super::store::DeleteResponse>>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::ListRequest, super::store::ListResponse>>,
    method_Databases: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::DatabasesRequest, super::store::DatabasesResponse>>,
    method_Tables: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::store::TablesRequest, super::store::TablesResponse>>,
}

impl ::grpc::ClientStub for StoreClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        StoreClient {
            grpc_client: grpc_client,
            method_Read: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/Read".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Write: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/Write".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Delete: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/Delete".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_List: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/List".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Databases: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/Databases".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Tables: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.store.Store/Tables".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Store for StoreClient {
    fn read(&self, o: ::grpc::RequestOptions, p: super::store::ReadRequest) -> ::grpc::SingleResponse<super::store::ReadResponse> {
        self.grpc_client.call_unary(o, p, self.method_Read.clone())
    }

    fn write(&self, o: ::grpc::RequestOptions, p: super::store::WriteRequest) -> ::grpc::SingleResponse<super::store::WriteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Write.clone())
    }

    fn delete(&self, o: ::grpc::RequestOptions, p: super::store::DeleteRequest) -> ::grpc::SingleResponse<super::store::DeleteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Delete.clone())
    }

    fn list(&self, o: ::grpc::RequestOptions, p: super::store::ListRequest) -> ::grpc::StreamingResponse<super::store::ListResponse> {
        self.grpc_client.call_server_streaming(o, p, self.method_List.clone())
    }

    fn databases(&self, o: ::grpc::RequestOptions, p: super::store::DatabasesRequest) -> ::grpc::SingleResponse<super::store::DatabasesResponse> {
        self.grpc_client.call_unary(o, p, self.method_Databases.clone())
    }

    fn tables(&self, o: ::grpc::RequestOptions, p: super::store::TablesRequest) -> ::grpc::SingleResponse<super::store::TablesResponse> {
        self.grpc_client.call_unary(o, p, self.method_Tables.clone())
    }
}

// server

pub struct StoreServer;


impl StoreServer {
    pub fn new_service_def<H : Store + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.store.Store",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.store.Store/Read".to_string(),
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
                        name: "/go.micro.store.Store/Write".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.write(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.store.Store/Delete".to_string(),
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
                        name: "/go.micro.store.Store/List".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerServerStreaming::new(move |o, p| handler_copy.list(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.store.Store/Databases".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.databases(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.store.Store/Tables".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.tables(o, p))
                    },
                ),
            ],
        )
    }
}
