// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var client_client_pb = require('../client/client_pb.js');

function serialize_go_micro_api_client_Request(arg) {
  if (!(arg instanceof client_client_pb.Request)) {
    throw new Error('Expected argument of type go.micro.api.client.Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_api_client_Request(buffer_arg) {
  return client_client_pb.Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_api_client_Response(arg) {
  if (!(arg instanceof client_client_pb.Response)) {
    throw new Error('Expected argument of type go.micro.api.client.Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_api_client_Response(buffer_arg) {
  return client_client_pb.Response.deserializeBinary(new Uint8Array(buffer_arg));
}


// Client is the micro client api
var ClientService = exports.ClientService = {
  // Call allows a single request to be made
call: {
    path: '/go.micro.api.client.Client/Call',
    requestStream: false,
    responseStream: false,
    requestType: client_client_pb.Request,
    responseType: client_client_pb.Response,
    requestSerialize: serialize_go_micro_api_client_Request,
    requestDeserialize: deserialize_go_micro_api_client_Request,
    responseSerialize: serialize_go_micro_api_client_Response,
    responseDeserialize: deserialize_go_micro_api_client_Response,
  },
  // Stream is a bidirectional stream
stream: {
    path: '/go.micro.api.client.Client/Stream',
    requestStream: true,
    responseStream: true,
    requestType: client_client_pb.Request,
    responseType: client_client_pb.Response,
    requestSerialize: serialize_go_micro_api_client_Request,
    requestDeserialize: deserialize_go_micro_api_client_Request,
    responseSerialize: serialize_go_micro_api_client_Response,
    responseDeserialize: deserialize_go_micro_api_client_Response,
  },
};

exports.ClientClient = grpc.makeGenericClientConstructor(ClientService);
