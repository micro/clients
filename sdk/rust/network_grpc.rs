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

pub trait Network {
    fn connect(&self, o: ::grpc::RequestOptions, p: super::network::ConnectRequest) -> ::grpc::SingleResponse<super::network::ConnectResponse>;

    fn graph(&self, o: ::grpc::RequestOptions, p: super::network::GraphRequest) -> ::grpc::SingleResponse<super::network::GraphResponse>;

    fn nodes(&self, o: ::grpc::RequestOptions, p: super::network::NodesRequest) -> ::grpc::SingleResponse<super::network::NodesResponse>;

    fn routes(&self, o: ::grpc::RequestOptions, p: super::network::RoutesRequest) -> ::grpc::SingleResponse<super::network::RoutesResponse>;

    fn services(&self, o: ::grpc::RequestOptions, p: super::network::ServicesRequest) -> ::grpc::SingleResponse<super::network::ServicesResponse>;

    fn status(&self, o: ::grpc::RequestOptions, p: super::network::StatusRequest) -> ::grpc::SingleResponse<super::network::StatusResponse>;
}

// client

pub struct NetworkClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Connect: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::ConnectRequest, super::network::ConnectResponse>>,
    method_Graph: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::GraphRequest, super::network::GraphResponse>>,
    method_Nodes: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::NodesRequest, super::network::NodesResponse>>,
    method_Routes: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::RoutesRequest, super::network::RoutesResponse>>,
    method_Services: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::ServicesRequest, super::network::ServicesResponse>>,
    method_Status: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::network::StatusRequest, super::network::StatusResponse>>,
}

impl ::grpc::ClientStub for NetworkClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        NetworkClient {
            grpc_client: grpc_client,
            method_Connect: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Connect".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Graph: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Graph".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Nodes: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Nodes".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Routes: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Routes".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Services: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Services".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Status: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.network.Network/Status".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Network for NetworkClient {
    fn connect(&self, o: ::grpc::RequestOptions, p: super::network::ConnectRequest) -> ::grpc::SingleResponse<super::network::ConnectResponse> {
        self.grpc_client.call_unary(o, p, self.method_Connect.clone())
    }

    fn graph(&self, o: ::grpc::RequestOptions, p: super::network::GraphRequest) -> ::grpc::SingleResponse<super::network::GraphResponse> {
        self.grpc_client.call_unary(o, p, self.method_Graph.clone())
    }

    fn nodes(&self, o: ::grpc::RequestOptions, p: super::network::NodesRequest) -> ::grpc::SingleResponse<super::network::NodesResponse> {
        self.grpc_client.call_unary(o, p, self.method_Nodes.clone())
    }

    fn routes(&self, o: ::grpc::RequestOptions, p: super::network::RoutesRequest) -> ::grpc::SingleResponse<super::network::RoutesResponse> {
        self.grpc_client.call_unary(o, p, self.method_Routes.clone())
    }

    fn services(&self, o: ::grpc::RequestOptions, p: super::network::ServicesRequest) -> ::grpc::SingleResponse<super::network::ServicesResponse> {
        self.grpc_client.call_unary(o, p, self.method_Services.clone())
    }

    fn status(&self, o: ::grpc::RequestOptions, p: super::network::StatusRequest) -> ::grpc::SingleResponse<super::network::StatusResponse> {
        self.grpc_client.call_unary(o, p, self.method_Status.clone())
    }
}

// server

pub struct NetworkServer;


impl NetworkServer {
    pub fn new_service_def<H : Network + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.network.Network",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Connect".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.connect(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Graph".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.graph(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Nodes".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.nodes(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Routes".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.routes(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Services".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.services(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.network.Network/Status".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.status(o, p))
                    },
                ),
            ],
        )
    }
}
