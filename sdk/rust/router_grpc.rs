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

pub trait Router {
    fn lookup(&self, o: ::grpc::RequestOptions, p: super::router::LookupRequest) -> ::grpc::SingleResponse<super::router::LookupResponse>;

    fn watch(&self, o: ::grpc::RequestOptions, p: super::router::WatchRequest) -> ::grpc::StreamingResponse<super::router::Event>;

    fn advertise(&self, o: ::grpc::RequestOptions, p: super::router::Request) -> ::grpc::StreamingResponse<super::router::Advert>;

    fn process(&self, o: ::grpc::RequestOptions, p: super::router::Advert) -> ::grpc::SingleResponse<super::router::ProcessResponse>;
}

// client

pub struct RouterClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Lookup: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::LookupRequest, super::router::LookupResponse>>,
    method_Watch: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::WatchRequest, super::router::Event>>,
    method_Advertise: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Request, super::router::Advert>>,
    method_Process: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Advert, super::router::ProcessResponse>>,
}

impl ::grpc::ClientStub for RouterClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        RouterClient {
            grpc_client: grpc_client,
            method_Lookup: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Router/Lookup".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Watch: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Router/Watch".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Advertise: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Router/Advertise".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Process: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Router/Process".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Router for RouterClient {
    fn lookup(&self, o: ::grpc::RequestOptions, p: super::router::LookupRequest) -> ::grpc::SingleResponse<super::router::LookupResponse> {
        self.grpc_client.call_unary(o, p, self.method_Lookup.clone())
    }

    fn watch(&self, o: ::grpc::RequestOptions, p: super::router::WatchRequest) -> ::grpc::StreamingResponse<super::router::Event> {
        self.grpc_client.call_server_streaming(o, p, self.method_Watch.clone())
    }

    fn advertise(&self, o: ::grpc::RequestOptions, p: super::router::Request) -> ::grpc::StreamingResponse<super::router::Advert> {
        self.grpc_client.call_server_streaming(o, p, self.method_Advertise.clone())
    }

    fn process(&self, o: ::grpc::RequestOptions, p: super::router::Advert) -> ::grpc::SingleResponse<super::router::ProcessResponse> {
        self.grpc_client.call_unary(o, p, self.method_Process.clone())
    }
}

// server

pub struct RouterServer;


impl RouterServer {
    pub fn new_service_def<H : Router + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.router.Router",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Router/Lookup".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.lookup(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Router/Watch".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerServerStreaming::new(move |o, p| handler_copy.watch(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Router/Advertise".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerServerStreaming::new(move |o, p| handler_copy.advertise(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Router/Process".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.process(o, p))
                    },
                ),
            ],
        )
    }
}

// interface

pub trait Table {
    fn create(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::CreateResponse>;

    fn delete(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::DeleteResponse>;

    fn update(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::UpdateResponse>;

    fn list(&self, o: ::grpc::RequestOptions, p: super::router::Request) -> ::grpc::SingleResponse<super::router::ListResponse>;

    fn query(&self, o: ::grpc::RequestOptions, p: super::router::QueryRequest) -> ::grpc::SingleResponse<super::router::QueryResponse>;
}

// client

pub struct TableClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Create: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Route, super::router::CreateResponse>>,
    method_Delete: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Route, super::router::DeleteResponse>>,
    method_Update: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Route, super::router::UpdateResponse>>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::Request, super::router::ListResponse>>,
    method_Query: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::router::QueryRequest, super::router::QueryResponse>>,
}

impl ::grpc::ClientStub for TableClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        TableClient {
            grpc_client: grpc_client,
            method_Create: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Table/Create".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Delete: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Table/Delete".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Update: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Table/Update".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_List: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Table/List".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Query: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.router.Table/Query".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Table for TableClient {
    fn create(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::CreateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Create.clone())
    }

    fn delete(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::DeleteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Delete.clone())
    }

    fn update(&self, o: ::grpc::RequestOptions, p: super::router::Route) -> ::grpc::SingleResponse<super::router::UpdateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Update.clone())
    }

    fn list(&self, o: ::grpc::RequestOptions, p: super::router::Request) -> ::grpc::SingleResponse<super::router::ListResponse> {
        self.grpc_client.call_unary(o, p, self.method_List.clone())
    }

    fn query(&self, o: ::grpc::RequestOptions, p: super::router::QueryRequest) -> ::grpc::SingleResponse<super::router::QueryResponse> {
        self.grpc_client.call_unary(o, p, self.method_Query.clone())
    }
}

// server

pub struct TableServer;


impl TableServer {
    pub fn new_service_def<H : Table + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.router.Table",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Table/Create".to_string(),
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
                        name: "/go.micro.router.Table/Delete".to_string(),
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
                        name: "/go.micro.router.Table/Update".to_string(),
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
                        name: "/go.micro.router.Table/List".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.list(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.router.Table/Query".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.query(o, p))
                    },
                ),
            ],
        )
    }
}
