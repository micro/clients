// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var client_client_pb = require('../client/client_pb.js');

function serialize_go_micro_client_Message(arg) {
  if (!(arg instanceof client_client_pb.Message)) {
    throw new Error('Expected argument of type go.micro.client.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_client_Message(buffer_arg) {
  return client_client_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_client_Request(arg) {
  if (!(arg instanceof client_client_pb.Request)) {
    throw new Error('Expected argument of type go.micro.client.Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_client_Request(buffer_arg) {
  return client_client_pb.Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_client_Response(arg) {
  if (!(arg instanceof client_client_pb.Response)) {
    throw new Error('Expected argument of type go.micro.client.Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_client_Response(buffer_arg) {
  return client_client_pb.Response.deserializeBinary(new Uint8Array(buffer_arg));
}


// Client is the micro client interface
var ClientService = exports.ClientService = {
  // Call allows a single request to be made
call: {
    path: '/go.micro.client.Client/Call',
    requestStream: false,
    responseStream: false,
    requestType: client_client_pb.Request,
    responseType: client_client_pb.Response,
    requestSerialize: serialize_go_micro_client_Request,
    requestDeserialize: deserialize_go_micro_client_Request,
    responseSerialize: serialize_go_micro_client_Response,
    responseDeserialize: deserialize_go_micro_client_Response,
  },
  // Stream is a bidirectional stream
stream: {
    path: '/go.micro.client.Client/Stream',
    requestStream: true,
    responseStream: true,
    requestType: client_client_pb.Request,
    responseType: client_client_pb.Response,
    requestSerialize: serialize_go_micro_client_Request,
    requestDeserialize: deserialize_go_micro_client_Request,
    responseSerialize: serialize_go_micro_client_Response,
    responseDeserialize: deserialize_go_micro_client_Response,
  },
  // Publish publishes a message and returns an empty Message
publish: {
    path: '/go.micro.client.Client/Publish',
    requestStream: false,
    responseStream: false,
    requestType: client_client_pb.Message,
    responseType: client_client_pb.Message,
    requestSerialize: serialize_go_micro_client_Message,
    requestDeserialize: deserialize_go_micro_client_Message,
    responseSerialize: serialize_go_micro_client_Message,
    responseDeserialize: deserialize_go_micro_client_Message,
  },
};

exports.ClientClient = grpc.makeGenericClientConstructor(ClientService);
