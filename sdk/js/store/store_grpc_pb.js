// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var store_store_pb = require('../store/store_pb.js');

function serialize_go_micro_store_DeleteRequest(arg) {
  if (!(arg instanceof store_store_pb.DeleteRequest)) {
    throw new Error('Expected argument of type go.micro.store.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_DeleteRequest(buffer_arg) {
  return store_store_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_DeleteResponse(arg) {
  if (!(arg instanceof store_store_pb.DeleteResponse)) {
    throw new Error('Expected argument of type go.micro.store.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_DeleteResponse(buffer_arg) {
  return store_store_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_ListRequest(arg) {
  if (!(arg instanceof store_store_pb.ListRequest)) {
    throw new Error('Expected argument of type go.micro.store.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_ListRequest(buffer_arg) {
  return store_store_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_ListResponse(arg) {
  if (!(arg instanceof store_store_pb.ListResponse)) {
    throw new Error('Expected argument of type go.micro.store.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_ListResponse(buffer_arg) {
  return store_store_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_ReadRequest(arg) {
  if (!(arg instanceof store_store_pb.ReadRequest)) {
    throw new Error('Expected argument of type go.micro.store.ReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_ReadRequest(buffer_arg) {
  return store_store_pb.ReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_ReadResponse(arg) {
  if (!(arg instanceof store_store_pb.ReadResponse)) {
    throw new Error('Expected argument of type go.micro.store.ReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_ReadResponse(buffer_arg) {
  return store_store_pb.ReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_WriteRequest(arg) {
  if (!(arg instanceof store_store_pb.WriteRequest)) {
    throw new Error('Expected argument of type go.micro.store.WriteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_WriteRequest(buffer_arg) {
  return store_store_pb.WriteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_store_WriteResponse(arg) {
  if (!(arg instanceof store_store_pb.WriteResponse)) {
    throw new Error('Expected argument of type go.micro.store.WriteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_store_WriteResponse(buffer_arg) {
  return store_store_pb.WriteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var StoreService = exports.StoreService = {
  list: {
    path: '/go.micro.store.Store/List',
    requestStream: false,
    responseStream: true,
    requestType: store_store_pb.ListRequest,
    responseType: store_store_pb.ListResponse,
    requestSerialize: serialize_go_micro_store_ListRequest,
    requestDeserialize: deserialize_go_micro_store_ListRequest,
    responseSerialize: serialize_go_micro_store_ListResponse,
    responseDeserialize: deserialize_go_micro_store_ListResponse,
  },
  read: {
    path: '/go.micro.store.Store/Read',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.ReadRequest,
    responseType: store_store_pb.ReadResponse,
    requestSerialize: serialize_go_micro_store_ReadRequest,
    requestDeserialize: deserialize_go_micro_store_ReadRequest,
    responseSerialize: serialize_go_micro_store_ReadResponse,
    responseDeserialize: deserialize_go_micro_store_ReadResponse,
  },
  write: {
    path: '/go.micro.store.Store/Write',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.WriteRequest,
    responseType: store_store_pb.WriteResponse,
    requestSerialize: serialize_go_micro_store_WriteRequest,
    requestDeserialize: deserialize_go_micro_store_WriteRequest,
    responseSerialize: serialize_go_micro_store_WriteResponse,
    responseDeserialize: deserialize_go_micro_store_WriteResponse,
  },
  delete: {
    path: '/go.micro.store.Store/Delete',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.DeleteRequest,
    responseType: store_store_pb.DeleteResponse,
    requestSerialize: serialize_go_micro_store_DeleteRequest,
    requestDeserialize: deserialize_go_micro_store_DeleteRequest,
    responseSerialize: serialize_go_micro_store_DeleteResponse,
    responseDeserialize: deserialize_go_micro_store_DeleteResponse,
  },
};

exports.StoreClient = grpc.makeGenericClientConstructor(StoreService);
