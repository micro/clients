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

pub trait Accounts {
    fn list(&self, o: ::grpc::RequestOptions, p: super::accounts::ListAccountsRequest) -> ::grpc::SingleResponse<super::accounts::ListAccountsResponse>;
}

// client

pub struct AccountsClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::accounts::ListAccountsRequest, super::accounts::ListAccountsResponse>>,
}

impl ::grpc::ClientStub for AccountsClient {
    fn with_client(grpc_client: ::std::sync::Arc<::grpc::Client>) -> Self {
        AccountsClient {
            grpc_client: grpc_client,
            method_List: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Accounts/List".to_string(),
                streaming: ::grpc::rt::GrpcStreaming::Unary,
                req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
            }),
        }
    }
}

impl Accounts for AccountsClient {
    fn list(&self, o: ::grpc::RequestOptions, p: super::accounts::ListAccountsRequest) -> ::grpc::SingleResponse<super::accounts::ListAccountsResponse> {
        self.grpc_client.call_unary(o, p, self.method_List.clone())
    }
}

// server

pub struct AccountsServer;


impl AccountsServer {
    pub fn new_service_def<H : Accounts + 'static + Sync + Send + 'static>(handler: H) -> ::grpc::rt::ServerServiceDefinition {
        let handler_arc = ::std::sync::Arc::new(handler);
        ::grpc::rt::ServerServiceDefinition::new("/go.micro.auth.Accounts",
            vec![
                ::grpc::rt::ServerMethod::new(
                    ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                        name: "/go.micro.auth.Accounts/List".to_string(),
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
