// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var config_source_service_pb = require('../../config/source/service_pb.js');

function serialize_CreateRequest(arg) {
  if (!(arg instanceof config_source_service_pb.CreateRequest)) {
    throw new Error('Expected argument of type CreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_CreateRequest(buffer_arg) {
  return config_source_service_pb.CreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_CreateResponse(arg) {
  if (!(arg instanceof config_source_service_pb.CreateResponse)) {
    throw new Error('Expected argument of type CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_CreateResponse(buffer_arg) {
  return config_source_service_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DeleteRequest(arg) {
  if (!(arg instanceof config_source_service_pb.DeleteRequest)) {
    throw new Error('Expected argument of type DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DeleteRequest(buffer_arg) {
  return config_source_service_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DeleteResponse(arg) {
  if (!(arg instanceof config_source_service_pb.DeleteResponse)) {
    throw new Error('Expected argument of type DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DeleteResponse(buffer_arg) {
  return config_source_service_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListRequest(arg) {
  if (!(arg instanceof config_source_service_pb.ListRequest)) {
    throw new Error('Expected argument of type ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListRequest(buffer_arg) {
  return config_source_service_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListResponse(arg) {
  if (!(arg instanceof config_source_service_pb.ListResponse)) {
    throw new Error('Expected argument of type ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListResponse(buffer_arg) {
  return config_source_service_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReadRequest(arg) {
  if (!(arg instanceof config_source_service_pb.ReadRequest)) {
    throw new Error('Expected argument of type ReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReadRequest(buffer_arg) {
  return config_source_service_pb.ReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReadResponse(arg) {
  if (!(arg instanceof config_source_service_pb.ReadResponse)) {
    throw new Error('Expected argument of type ReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReadResponse(buffer_arg) {
  return config_source_service_pb.ReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateRequest(arg) {
  if (!(arg instanceof config_source_service_pb.UpdateRequest)) {
    throw new Error('Expected argument of type UpdateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateRequest(buffer_arg) {
  return config_source_service_pb.UpdateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateResponse(arg) {
  if (!(arg instanceof config_source_service_pb.UpdateResponse)) {
    throw new Error('Expected argument of type UpdateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateResponse(buffer_arg) {
  return config_source_service_pb.UpdateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_WatchRequest(arg) {
  if (!(arg instanceof config_source_service_pb.WatchRequest)) {
    throw new Error('Expected argument of type WatchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_WatchRequest(buffer_arg) {
  return config_source_service_pb.WatchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_WatchResponse(arg) {
  if (!(arg instanceof config_source_service_pb.WatchResponse)) {
    throw new Error('Expected argument of type WatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_WatchResponse(buffer_arg) {
  return config_source_service_pb.WatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ConfigService = exports.ConfigService = {
  create: {
    path: '/Config/Create',
    requestStream: false,
    responseStream: false,
    requestType: config_source_service_pb.CreateRequest,
    responseType: config_source_service_pb.CreateResponse,
    requestSerialize: serialize_CreateRequest,
    requestDeserialize: deserialize_CreateRequest,
    responseSerialize: serialize_CreateResponse,
    responseDeserialize: deserialize_CreateResponse,
  },
  update: {
    path: '/Config/Update',
    requestStream: false,
    responseStream: false,
    requestType: config_source_service_pb.UpdateRequest,
    responseType: config_source_service_pb.UpdateResponse,
    requestSerialize: serialize_UpdateRequest,
    requestDeserialize: deserialize_UpdateRequest,
    responseSerialize: serialize_UpdateResponse,
    responseDeserialize: deserialize_UpdateResponse,
  },
  delete: {
    path: '/Config/Delete',
    requestStream: false,
    responseStream: false,
    requestType: config_source_service_pb.DeleteRequest,
    responseType: config_source_service_pb.DeleteResponse,
    requestSerialize: serialize_DeleteRequest,
    requestDeserialize: deserialize_DeleteRequest,
    responseSerialize: serialize_DeleteResponse,
    responseDeserialize: deserialize_DeleteResponse,
  },
  list: {
    path: '/Config/List',
    requestStream: false,
    responseStream: false,
    requestType: config_source_service_pb.ListRequest,
    responseType: config_source_service_pb.ListResponse,
    requestSerialize: serialize_ListRequest,
    requestDeserialize: deserialize_ListRequest,
    responseSerialize: serialize_ListResponse,
    responseDeserialize: deserialize_ListResponse,
  },
  read: {
    path: '/Config/Read',
    requestStream: false,
    responseStream: false,
    requestType: config_source_service_pb.ReadRequest,
    responseType: config_source_service_pb.ReadResponse,
    requestSerialize: serialize_ReadRequest,
    requestDeserialize: deserialize_ReadRequest,
    responseSerialize: serialize_ReadResponse,
    responseDeserialize: deserialize_ReadResponse,
  },
  watch: {
    path: '/Config/Watch',
    requestStream: false,
    responseStream: true,
    requestType: config_source_service_pb.WatchRequest,
    responseType: config_source_service_pb.WatchResponse,
    requestSerialize: serialize_WatchRequest,
    requestDeserialize: deserialize_WatchRequest,
    responseSerialize: serialize_WatchResponse,
    responseDeserialize: deserialize_WatchResponse,
  },
};

exports.ConfigClient = grpc.makeGenericClientConstructor(ConfigService);
