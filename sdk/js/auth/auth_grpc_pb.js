// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var auth_auth_pb = require('../auth/auth_pb.js');

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

function serialize_go_micro_auth_RefreshRequest(arg) {
  if (!(arg instanceof auth_auth_pb.RefreshRequest)) {
    throw new Error('Expected argument of type go.micro.auth.RefreshRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_RefreshRequest(buffer_arg) {
  return auth_auth_pb.RefreshRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_RefreshResponse(arg) {
  if (!(arg instanceof auth_auth_pb.RefreshResponse)) {
    throw new Error('Expected argument of type go.micro.auth.RefreshResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_RefreshResponse(buffer_arg) {
  return auth_auth_pb.RefreshResponse.deserializeBinary(new Uint8Array(buffer_arg));
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
  refresh: {
    path: '/go.micro.auth.Auth/Refresh',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.RefreshRequest,
    responseType: auth_auth_pb.RefreshResponse,
    requestSerialize: serialize_go_micro_auth_RefreshRequest,
    requestDeserialize: deserialize_go_micro_auth_RefreshRequest,
    responseSerialize: serialize_go_micro_auth_RefreshResponse,
    responseDeserialize: deserialize_go_micro_auth_RefreshResponse,
  },
};

exports.AuthClient = grpc.makeGenericClientConstructor(AuthService);
