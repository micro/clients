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

pub trait Client {
    fn call(&self, o: ::grpc::RequestOptions, p: super::client::Request) -> ::grpc::SingleResponse<super::client::Response>;

    fn stream(&self, o: ::grpc::RequestOptions, p: ::grpc::StreamingRequest<super::client::Request>) -> ::grpc::StreamingResponse<super::client::Response>;

    fn publish(&self, o: ::grpc::RequestOptions, p: super::client::Message) -> ::grpc::SingleResponse<super::client::Message>;
}

// client

pub struct ClientClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Call: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::client::Request, super::client::Response>>,
    method_Stream: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::client::Request, super::client::Response>>,
    method_Publish: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::client::Message, super::client::Message>>,
}

impl ::grpc::ClientStub for ClientClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        ClientClient {
            grpc_client: grpc_client,
            method_Call: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.client.Client/Call".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Stream: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.client.Client/Stream".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Bidi,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
            method_Publish: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.client.Client/Publish".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Client for ClientClient {
    fn call(&self, o: ::grpc::RequestOptions, p: super::client::Request) -> ::grpc::SingleResponse<super::client::Response> {
        self.grpc_client.call_unary(o, p, self.method_Call.clone())
    }

    fn stream(&self, o: ::grpc::RequestOptions, p: ::grpc::StreamingRequest<super::client::Request>) -> ::grpc::StreamingResponse<super::client::Response> {
        self.grpc_client.call_bidi(o, p, self.method_Stream.clone())
    }

    fn publish(&self, o: ::grpc::RequestOptions, p: super::client::Message) -> ::grpc::SingleResponse<super::client::Message> {
        self.grpc_client.call_unary(o, p, self.method_Publish.clone())
    }
}

// server

pub struct ClientServer;


impl ClientServer {
    pub fn new_service_def<H : Client + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.client.Client",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.client.Client/Call".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.call(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.client.Client/Stream".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Bidi,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerBidi::new(move |o, p| handler_copy.stream(o, p))
                    },
                ),
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.client.Client/Publish".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.publish(o, p))
                    },
                ),
            ],
        )
    }
}
