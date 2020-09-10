// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var store_store_pb = require('../store/store_pb.js');

function serialize_store_DatabasesRequest(arg) {
  if (!(arg instanceof store_store_pb.DatabasesRequest)) {
    throw new Error('Expected argument of type store.DatabasesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_DatabasesRequest(buffer_arg) {
  return store_store_pb.DatabasesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_DatabasesResponse(arg) {
  if (!(arg instanceof store_store_pb.DatabasesResponse)) {
    throw new Error('Expected argument of type store.DatabasesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_DatabasesResponse(buffer_arg) {
  return store_store_pb.DatabasesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_DeleteRequest(arg) {
  if (!(arg instanceof store_store_pb.DeleteRequest)) {
    throw new Error('Expected argument of type store.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_DeleteRequest(buffer_arg) {
  return store_store_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_DeleteResponse(arg) {
  if (!(arg instanceof store_store_pb.DeleteResponse)) {
    throw new Error('Expected argument of type store.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_DeleteResponse(buffer_arg) {
  return store_store_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_ListRequest(arg) {
  if (!(arg instanceof store_store_pb.ListRequest)) {
    throw new Error('Expected argument of type store.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_ListRequest(buffer_arg) {
  return store_store_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_ListResponse(arg) {
  if (!(arg instanceof store_store_pb.ListResponse)) {
    throw new Error('Expected argument of type store.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_ListResponse(buffer_arg) {
  return store_store_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_ReadRequest(arg) {
  if (!(arg instanceof store_store_pb.ReadRequest)) {
    throw new Error('Expected argument of type store.ReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_ReadRequest(buffer_arg) {
  return store_store_pb.ReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_ReadResponse(arg) {
  if (!(arg instanceof store_store_pb.ReadResponse)) {
    throw new Error('Expected argument of type store.ReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_ReadResponse(buffer_arg) {
  return store_store_pb.ReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_TablesRequest(arg) {
  if (!(arg instanceof store_store_pb.TablesRequest)) {
    throw new Error('Expected argument of type store.TablesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_TablesRequest(buffer_arg) {
  return store_store_pb.TablesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_TablesResponse(arg) {
  if (!(arg instanceof store_store_pb.TablesResponse)) {
    throw new Error('Expected argument of type store.TablesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_TablesResponse(buffer_arg) {
  return store_store_pb.TablesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_WriteRequest(arg) {
  if (!(arg instanceof store_store_pb.WriteRequest)) {
    throw new Error('Expected argument of type store.WriteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_WriteRequest(buffer_arg) {
  return store_store_pb.WriteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_store_WriteResponse(arg) {
  if (!(arg instanceof store_store_pb.WriteResponse)) {
    throw new Error('Expected argument of type store.WriteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_store_WriteResponse(buffer_arg) {
  return store_store_pb.WriteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var StoreService = exports.StoreService = {
  read: {
    path: '/store.Store/Read',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.ReadRequest,
    responseType: store_store_pb.ReadResponse,
    requestSerialize: serialize_store_ReadRequest,
    requestDeserialize: deserialize_store_ReadRequest,
    responseSerialize: serialize_store_ReadResponse,
    responseDeserialize: deserialize_store_ReadResponse,
  },
  write: {
    path: '/store.Store/Write',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.WriteRequest,
    responseType: store_store_pb.WriteResponse,
    requestSerialize: serialize_store_WriteRequest,
    requestDeserialize: deserialize_store_WriteRequest,
    responseSerialize: serialize_store_WriteResponse,
    responseDeserialize: deserialize_store_WriteResponse,
  },
  delete: {
    path: '/store.Store/Delete',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.DeleteRequest,
    responseType: store_store_pb.DeleteResponse,
    requestSerialize: serialize_store_DeleteRequest,
    requestDeserialize: deserialize_store_DeleteRequest,
    responseSerialize: serialize_store_DeleteResponse,
    responseDeserialize: deserialize_store_DeleteResponse,
  },
  list: {
    path: '/store.Store/List',
    requestStream: false,
    responseStream: true,
    requestType: store_store_pb.ListRequest,
    responseType: store_store_pb.ListResponse,
    requestSerialize: serialize_store_ListRequest,
    requestDeserialize: deserialize_store_ListRequest,
    responseSerialize: serialize_store_ListResponse,
    responseDeserialize: deserialize_store_ListResponse,
  },
  databases: {
    path: '/store.Store/Databases',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.DatabasesRequest,
    responseType: store_store_pb.DatabasesResponse,
    requestSerialize: serialize_store_DatabasesRequest,
    requestDeserialize: deserialize_store_DatabasesRequest,
    responseSerialize: serialize_store_DatabasesResponse,
    responseDeserialize: deserialize_store_DatabasesResponse,
  },
  tables: {
    path: '/store.Store/Tables',
    requestStream: false,
    responseStream: false,
    requestType: store_store_pb.TablesRequest,
    responseType: store_store_pb.TablesResponse,
    requestSerialize: serialize_store_TablesRequest,
    requestDeserialize: deserialize_store_TablesRequest,
    responseSerialize: serialize_store_TablesResponse,
    responseDeserialize: deserialize_store_TablesResponse,
  },
};

exports.StoreClient = grpc.makeGenericClientConstructor(StoreService);
