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

    fn token(&self, o: ::grpc::RequestOptions, p: super::auth::TokenRequest) -> ::grpc::SingleResponse<super::auth::TokenResponse>;
}

// client

pub struct AuthClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Generate: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::GenerateRequest, super::auth::GenerateResponse>>,
    method_Inspect: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::InspectRequest, super::auth::InspectResponse>>,
    method_Token: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::TokenRequest, super::auth::TokenResponse>>,
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
            method_Token: ::std::sync::Arc::new(::grpc::rt::MethodDescriptor {
                name: "/go.micro.auth.Auth/Token".to_string(),
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

    fn token(&self, o: ::grpc::RequestOptions, p: super::auth::TokenRequest) -> ::grpc::SingleResponse<super::auth::TokenResponse> {
        self.grpc_client.call_unary(o, p, self.method_Token.clone())
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
                        name: "/go.micro.auth.Auth/Token".to_string(),
                        streaming: ::grpc::rt::GrpcStreaming::Unary,
                        req_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                        resp_marshaller: Box::new(::grpc::protobuf::MarshallerProtobuf),
                    }),
                    {
                        let handler_copy = handler_arc.clone();
                        ::grpc::rt::MethodHandlerUnary::new(move |o, p| handler_copy.token(o, p))
                    },
                ),
            ],
        )
    }
}

// interface

pub trait Accounts {
    fn list(&self, o: ::grpc::RequestOptions, p: super::auth::ListAccountsRequest) -> ::grpc::SingleResponse<super::auth::ListAccountsResponse>;
}

// client

pub struct AccountsClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::ListAccountsRequest, super::auth::ListAccountsResponse>>,
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
    fn list(&self, o: ::grpc::RequestOptions, p: super::auth::ListAccountsRequest) -> ::grpc::SingleResponse<super::auth::ListAccountsResponse> {
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

// interface

pub trait Rules {
    fn create(&self, o: ::grpc::RequestOptions, p: super::auth::CreateRequest) -> ::grpc::SingleResponse<super::auth::CreateResponse>;

    fn delete(&self, o: ::grpc::RequestOptions, p: super::auth::DeleteRequest) -> ::grpc::SingleResponse<super::auth::DeleteResponse>;

    fn list(&self, o: ::grpc::RequestOptions, p: super::auth::ListRequest) -> ::grpc::SingleResponse<super::auth::ListResponse>;
}

// client

pub struct RulesClient {
    grpc_client: ::std::sync::Arc<::grpc::Client>,
    method_Create: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::CreateRequest, super::auth::CreateResponse>>,
    method_Delete: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::DeleteRequest, super::auth::DeleteResponse>>,
    method_List: ::std::sync::Arc<::grpc::rt::MethodDescriptor<super::auth::ListRequest, super::auth::ListResponse>>,
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
    fn create(&self, o: ::grpc::RequestOptions, p: super::auth::CreateRequest) -> ::grpc::SingleResponse<super::auth::CreateResponse> {
        self.grpc_client.call_unary(o, p, self.method_Create.clone())
    }

    fn delete(&self, o: ::grpc::RequestOptions, p: super::auth::DeleteRequest) -> ::grpc::SingleResponse<super::auth::DeleteResponse> {
        self.grpc_client.call_unary(o, p, self.method_Delete.clone())
    }

    fn list(&self, o: ::grpc::RequestOptions, p: super::auth::ListRequest) -> ::grpc::SingleResponse<super::auth::ListResponse> {
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
