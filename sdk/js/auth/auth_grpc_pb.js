// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var auth_auth_pb = require('../auth/auth_pb.js');

function serialize_go_micro_auth_CreateRequest(arg) {
  if (!(arg instanceof auth_auth_pb.CreateRequest)) {
    throw new Error('Expected argument of type go.micro.auth.CreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_CreateRequest(buffer_arg) {
  return auth_auth_pb.CreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_CreateResponse(arg) {
  if (!(arg instanceof auth_auth_pb.CreateResponse)) {
    throw new Error('Expected argument of type go.micro.auth.CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_CreateResponse(buffer_arg) {
  return auth_auth_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_DeleteRequest(arg) {
  if (!(arg instanceof auth_auth_pb.DeleteRequest)) {
    throw new Error('Expected argument of type go.micro.auth.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_DeleteRequest(buffer_arg) {
  return auth_auth_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_DeleteResponse(arg) {
  if (!(arg instanceof auth_auth_pb.DeleteResponse)) {
    throw new Error('Expected argument of type go.micro.auth.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_DeleteResponse(buffer_arg) {
  return auth_auth_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_GenerateRequest(arg) {
  if (!(arg instanceof auth_auth_pb.GenerateRequest)) {
    throw new Error('Expected argument of type go.micro.auth.GenerateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_GenerateRequest(buffer_arg) {
  return auth_auth_pb.GenerateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_GenerateResponse(arg) {
  if (!(arg instanceof auth_auth_pb.GenerateResponse)) {
    throw new Error('Expected argument of type go.micro.auth.GenerateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_GenerateResponse(buffer_arg) {
  return auth_auth_pb.GenerateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_InspectRequest(arg) {
  if (!(arg instanceof auth_auth_pb.InspectRequest)) {
    throw new Error('Expected argument of type go.micro.auth.InspectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_InspectRequest(buffer_arg) {
  return auth_auth_pb.InspectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_InspectResponse(arg) {
  if (!(arg instanceof auth_auth_pb.InspectResponse)) {
    throw new Error('Expected argument of type go.micro.auth.InspectResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_InspectResponse(buffer_arg) {
  return auth_auth_pb.InspectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListAccountsRequest(arg) {
  if (!(arg instanceof auth_auth_pb.ListAccountsRequest)) {
    throw new Error('Expected argument of type go.micro.auth.ListAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListAccountsRequest(buffer_arg) {
  return auth_auth_pb.ListAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListAccountsResponse(arg) {
  if (!(arg instanceof auth_auth_pb.ListAccountsResponse)) {
    throw new Error('Expected argument of type go.micro.auth.ListAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListAccountsResponse(buffer_arg) {
  return auth_auth_pb.ListAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListRequest(arg) {
  if (!(arg instanceof auth_auth_pb.ListRequest)) {
    throw new Error('Expected argument of type go.micro.auth.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListRequest(buffer_arg) {
  return auth_auth_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListResponse(arg) {
  if (!(arg instanceof auth_auth_pb.ListResponse)) {
    throw new Error('Expected argument of type go.micro.auth.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListResponse(buffer_arg) {
  return auth_auth_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_TokenRequest(arg) {
  if (!(arg instanceof auth_auth_pb.TokenRequest)) {
    throw new Error('Expected argument of type go.micro.auth.TokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_TokenRequest(buffer_arg) {
  return auth_auth_pb.TokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_TokenResponse(arg) {
  if (!(arg instanceof auth_auth_pb.TokenResponse)) {
    throw new Error('Expected argument of type go.micro.auth.TokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_TokenResponse(buffer_arg) {
  return auth_auth_pb.TokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var AuthService = exports.AuthService = {
  generate: {
    path: '/go.micro.auth.Auth/Generate',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.GenerateRequest,
    responseType: auth_auth_pb.GenerateResponse,
    requestSerialize: serialize_go_micro_auth_GenerateRequest,
    requestDeserialize: deserialize_go_micro_auth_GenerateRequest,
    responseSerialize: serialize_go_micro_auth_GenerateResponse,
    responseDeserialize: deserialize_go_micro_auth_GenerateResponse,
  },
  inspect: {
    path: '/go.micro.auth.Auth/Inspect',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.InspectRequest,
    responseType: auth_auth_pb.InspectResponse,
    requestSerialize: serialize_go_micro_auth_InspectRequest,
    requestDeserialize: deserialize_go_micro_auth_InspectRequest,
    responseSerialize: serialize_go_micro_auth_InspectResponse,
    responseDeserialize: deserialize_go_micro_auth_InspectResponse,
  },
  token: {
    path: '/go.micro.auth.Auth/Token',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.TokenRequest,
    responseType: auth_auth_pb.TokenResponse,
    requestSerialize: serialize_go_micro_auth_TokenRequest,
    requestDeserialize: deserialize_go_micro_auth_TokenRequest,
    responseSerialize: serialize_go_micro_auth_TokenResponse,
    responseDeserialize: deserialize_go_micro_auth_TokenResponse,
  },
};

exports.AuthClient = grpc.makeGenericClientConstructor(AuthService);
var AccountsService = exports.AccountsService = {
  list: {
    path: '/go.micro.auth.Accounts/List',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.ListAccountsRequest,
    responseType: auth_auth_pb.ListAccountsResponse,
    requestSerialize: serialize_go_micro_auth_ListAccountsRequest,
    requestDeserialize: deserialize_go_micro_auth_ListAccountsRequest,
    responseSerialize: serialize_go_micro_auth_ListAccountsResponse,
    responseDeserialize: deserialize_go_micro_auth_ListAccountsResponse,
  },
};

exports.AccountsClient = grpc.makeGenericClientConstructor(AccountsService);
var RulesService = exports.RulesService = {
  create: {
    path: '/go.micro.auth.Rules/Create',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.CreateRequest,
    responseType: auth_auth_pb.CreateResponse,
    requestSerialize: serialize_go_micro_auth_CreateRequest,
    requestDeserialize: deserialize_go_micro_auth_CreateRequest,
    responseSerialize: serialize_go_micro_auth_CreateResponse,
    responseDeserialize: deserialize_go_micro_auth_CreateResponse,
  },
  delete: {
    path: '/go.micro.auth.Rules/Delete',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.DeleteRequest,
    responseType: auth_auth_pb.DeleteResponse,
    requestSerialize: serialize_go_micro_auth_DeleteRequest,
    requestDeserialize: deserialize_go_micro_auth_DeleteRequest,
    responseSerialize: serialize_go_micro_auth_DeleteResponse,
    responseDeserialize: deserialize_go_micro_auth_DeleteResponse,
  },
  list: {
    path: '/go.micro.auth.Rules/List',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.ListRequest,
    responseType: auth_auth_pb.ListResponse,
    requestSerialize: serialize_go_micro_auth_ListRequest,
    requestDeserialize: deserialize_go_micro_auth_ListRequest,
    responseSerialize: serialize_go_micro_auth_ListResponse,
    responseDeserialize: deserialize_go_micro_auth_ListResponse,
  },
};

exports.RulesClient = grpc.makeGenericClientConstructor(RulesService);
