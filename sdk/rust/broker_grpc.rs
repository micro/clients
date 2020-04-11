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

pub trait Broker {
    fn publish(&self, o: ::grpc::RequestOptions, p: super::broker::PublishRequest) -> ::grpc::SingleResponse<super::broker::Empty>;

    fn subscribe(&self, o: ::grpc::RequestOptions, p: super::broker::SubscribeRequest) -> ::grpc::StreamingResponse<super::broker::Message>;
}

// client

pub struct BrokerClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Publish: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::broker::PublishRequest, super::broker::Empty>>,
    method_Subscribe: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::broker::SubscribeRequest, super::broker::Message>>,
}

impl ::grpc::ClientStub for BrokerClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        BrokerClient {
            grpc_client: grpc_client,
            method_Publish: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.broker.Broker/Publish".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Subscribe: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.broker.Broker/Subscribe".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Broker for BrokerClient {
    fn publish(&self, o: ::grpc::RequestOptions, p: super::broker::PublishRequest) -> ::grpc::SingleResponse<super::broker::Empty> {
        self.grpc_client.call_unary(o, p, self.method_Publish.clone())
    }

    fn subscribe(&self, o: ::grpc::RequestOptions, p: super::broker::SubscribeRequest) -> ::grpc::StreamingResponse<super::broker::Message> {
        self.grpc_client.call_server_streaming(o, p, self.method_Subscribe.clone())
    }
}

// server

pub struct BrokerServer;


impl BrokerServer {
    pub fn new_service_def<H : Broker + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.broker.Broker",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.broker.Broker/Publish".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.publish(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.broker.Broker/Subscribe".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::ServerStreaming,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerServerStreaming::new(move |o, p| handler_copy.subscribe(o, p))
                    },
                ),
            ],
        )
    }
}
