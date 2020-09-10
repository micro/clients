// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var config_config_pb = require('../config/config_pb.js');

function serialize_config_CreateRequest(arg) {
  if (!(arg instanceof config_config_pb.CreateRequest)) {
    throw new Error('Expected argument of type config.CreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_CreateRequest(buffer_arg) {
  return config_config_pb.CreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_CreateResponse(arg) {
  if (!(arg instanceof config_config_pb.CreateResponse)) {
    throw new Error('Expected argument of type config.CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_CreateResponse(buffer_arg) {
  return config_config_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_DeleteRequest(arg) {
  if (!(arg instanceof config_config_pb.DeleteRequest)) {
    throw new Error('Expected argument of type config.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_DeleteRequest(buffer_arg) {
  return config_config_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_DeleteResponse(arg) {
  if (!(arg instanceof config_config_pb.DeleteResponse)) {
    throw new Error('Expected argument of type config.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_DeleteResponse(buffer_arg) {
  return config_config_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_ListRequest(arg) {
  if (!(arg instanceof config_config_pb.ListRequest)) {
    throw new Error('Expected argument of type config.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_ListRequest(buffer_arg) {
  return config_config_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_ListResponse(arg) {
  if (!(arg instanceof config_config_pb.ListResponse)) {
    throw new Error('Expected argument of type config.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_ListResponse(buffer_arg) {
  return config_config_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_ReadRequest(arg) {
  if (!(arg instanceof config_config_pb.ReadRequest)) {
    throw new Error('Expected argument of type config.ReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_ReadRequest(buffer_arg) {
  return config_config_pb.ReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_ReadResponse(arg) {
  if (!(arg instanceof config_config_pb.ReadResponse)) {
    throw new Error('Expected argument of type config.ReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_ReadResponse(buffer_arg) {
  return config_config_pb.ReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_UpdateRequest(arg) {
  if (!(arg instanceof config_config_pb.UpdateRequest)) {
    throw new Error('Expected argument of type config.UpdateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_UpdateRequest(buffer_arg) {
  return config_config_pb.UpdateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_UpdateResponse(arg) {
  if (!(arg instanceof config_config_pb.UpdateResponse)) {
    throw new Error('Expected argument of type config.UpdateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_UpdateResponse(buffer_arg) {
  return config_config_pb.UpdateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_WatchRequest(arg) {
  if (!(arg instanceof config_config_pb.WatchRequest)) {
    throw new Error('Expected argument of type config.WatchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_WatchRequest(buffer_arg) {
  return config_config_pb.WatchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_config_WatchResponse(arg) {
  if (!(arg instanceof config_config_pb.WatchResponse)) {
    throw new Error('Expected argument of type config.WatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_config_WatchResponse(buffer_arg) {
  return config_config_pb.WatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ConfigService = exports.ConfigService = {
  create: {
    path: '/config.Config/Create',
    requestStream: false,
    responseStream: false,
    requestType: config_config_pb.CreateRequest,
    responseType: config_config_pb.CreateResponse,
    requestSerialize: serialize_config_CreateRequest,
    requestDeserialize: deserialize_config_CreateRequest,
    responseSerialize: serialize_config_CreateResponse,
    responseDeserialize: deserialize_config_CreateResponse,
  },
  update: {
    path: '/config.Config/Update',
    requestStream: false,
    responseStream: false,
    requestType: config_config_pb.UpdateRequest,
    responseType: config_config_pb.UpdateResponse,
    requestSerialize: serialize_config_UpdateRequest,
    requestDeserialize: deserialize_config_UpdateRequest,
    responseSerialize: serialize_config_UpdateResponse,
    responseDeserialize: deserialize_config_UpdateResponse,
  },
  delete: {
    path: '/config.Config/Delete',
    requestStream: false,
    responseStream: false,
    requestType: config_config_pb.DeleteRequest,
    responseType: config_config_pb.DeleteResponse,
    requestSerialize: serialize_config_DeleteRequest,
    requestDeserialize: deserialize_config_DeleteRequest,
    responseSerialize: serialize_config_DeleteResponse,
    responseDeserialize: deserialize_config_DeleteResponse,
  },
  list: {
    path: '/config.Config/List',
    requestStream: false,
    responseStream: false,
    requestType: config_config_pb.ListRequest,
    responseType: config_config_pb.ListResponse,
    requestSerialize: serialize_config_ListRequest,
    requestDeserialize: deserialize_config_ListRequest,
    responseSerialize: serialize_config_ListResponse,
    responseDeserialize: deserialize_config_ListResponse,
  },
  read: {
    path: '/config.Config/Read',
    requestStream: false,
    responseStream: false,
    requestType: config_config_pb.ReadRequest,
    responseType: config_config_pb.ReadResponse,
    requestSerialize: serialize_config_ReadRequest,
    requestDeserialize: deserialize_config_ReadRequest,
    responseSerialize: serialize_config_ReadResponse,
    responseDeserialize: deserialize_config_ReadResponse,
  },
  watch: {
    path: '/config.Config/Watch',
    requestStream: false,
    responseStream: true,
    requestType: config_config_pb.WatchRequest,
    responseType: config_config_pb.WatchResponse,
    requestSerialize: serialize_config_WatchRequest,
    requestDeserialize: deserialize_config_WatchRequest,
    responseSerialize: serialize_config_WatchResponse,
    responseDeserialize: deserialize_config_WatchResponse,
  },
};

exports.ConfigClient = grpc.makeGenericClientConstructor(ConfigService);
