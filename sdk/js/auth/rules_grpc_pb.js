// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var auth_rules_pb = require('../auth/rules_pb.js');
var auth_pb = require('../auth_pb.js');

function serialize_go_micro_auth_CreateRequest(arg) {
  if (!(arg instanceof auth_rules_pb.CreateRequest)) {
    throw new Error('Expected argument of type go.micro.auth.CreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_CreateRequest(buffer_arg) {
  return auth_rules_pb.CreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_CreateResponse(arg) {
  if (!(arg instanceof auth_rules_pb.CreateResponse)) {
    throw new Error('Expected argument of type go.micro.auth.CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_CreateResponse(buffer_arg) {
  return auth_rules_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_DeleteRequest(arg) {
  if (!(arg instanceof auth_rules_pb.DeleteRequest)) {
    throw new Error('Expected argument of type go.micro.auth.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_DeleteRequest(buffer_arg) {
  return auth_rules_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_DeleteResponse(arg) {
  if (!(arg instanceof auth_rules_pb.DeleteResponse)) {
    throw new Error('Expected argument of type go.micro.auth.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_DeleteResponse(buffer_arg) {
  return auth_rules_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListRequest(arg) {
  if (!(arg instanceof auth_rules_pb.ListRequest)) {
    throw new Error('Expected argument of type go.micro.auth.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListRequest(buffer_arg) {
  return auth_rules_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListResponse(arg) {
  if (!(arg instanceof auth_rules_pb.ListResponse)) {
    throw new Error('Expected argument of type go.micro.auth.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListResponse(buffer_arg) {
  return auth_rules_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var RulesService = exports.RulesService = {
  create: {
    path: '/go.micro.auth.Rules/Create',
    requestStream: false,
    responseStream: false,
    requestType: auth_rules_pb.CreateRequest,
    responseType: auth_rules_pb.CreateResponse,
    requestSerialize: serialize_go_micro_auth_CreateRequest,
    requestDeserialize: deserialize_go_micro_auth_CreateRequest,
    responseSerialize: serialize_go_micro_auth_CreateResponse,
    responseDeserialize: deserialize_go_micro_auth_CreateResponse,
  },
  delete: {
    path: '/go.micro.auth.Rules/Delete',
    requestStream: false,
    responseStream: false,
    requestType: auth_rules_pb.DeleteRequest,
    responseType: auth_rules_pb.DeleteResponse,
    requestSerialize: serialize_go_micro_auth_DeleteRequest,
    requestDeserialize: deserialize_go_micro_auth_DeleteRequest,
    responseSerialize: serialize_go_micro_auth_DeleteResponse,
    responseDeserialize: deserialize_go_micro_auth_DeleteResponse,
  },
  list: {
    path: '/go.micro.auth.Rules/List',
    requestStream: false,
    responseStream: false,
    requestType: auth_rules_pb.ListRequest,
    responseType: auth_rules_pb.ListResponse,
    requestSerialize: serialize_go_micro_auth_ListRequest,
    requestDeserialize: deserialize_go_micro_auth_ListRequest,
    responseSerialize: serialize_go_micro_auth_ListResponse,
    responseDeserialize: deserialize_go_micro_auth_ListResponse,
  },
};

exports.RulesClient = grpc.makeGenericClientConstructor(RulesService);
