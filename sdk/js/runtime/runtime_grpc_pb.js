// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var runtime_runtime_pb = require('../runtime/runtime_pb.js');

function serialize_go_micro_runtime_CreateRequest(arg) {
  if (!(arg instanceof runtime_runtime_pb.CreateRequest)) {
    throw new Error('Expected argument of type go.micro.runtime.CreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_CreateRequest(buffer_arg) {
  return runtime_runtime_pb.CreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_CreateResponse(arg) {
  if (!(arg instanceof runtime_runtime_pb.CreateResponse)) {
    throw new Error('Expected argument of type go.micro.runtime.CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_CreateResponse(buffer_arg) {
  return runtime_runtime_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_DeleteRequest(arg) {
  if (!(arg instanceof runtime_runtime_pb.DeleteRequest)) {
    throw new Error('Expected argument of type go.micro.runtime.DeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_DeleteRequest(buffer_arg) {
  return runtime_runtime_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_DeleteResponse(arg) {
  if (!(arg instanceof runtime_runtime_pb.DeleteResponse)) {
    throw new Error('Expected argument of type go.micro.runtime.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_DeleteResponse(buffer_arg) {
  return runtime_runtime_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_ListRequest(arg) {
  if (!(arg instanceof runtime_runtime_pb.ListRequest)) {
    throw new Error('Expected argument of type go.micro.runtime.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_ListRequest(buffer_arg) {
  return runtime_runtime_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_ListResponse(arg) {
  if (!(arg instanceof runtime_runtime_pb.ListResponse)) {
    throw new Error('Expected argument of type go.micro.runtime.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_ListResponse(buffer_arg) {
  return runtime_runtime_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_ReadRequest(arg) {
  if (!(arg instanceof runtime_runtime_pb.ReadRequest)) {
    throw new Error('Expected argument of type go.micro.runtime.ReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_ReadRequest(buffer_arg) {
  return runtime_runtime_pb.ReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_ReadResponse(arg) {
  if (!(arg instanceof runtime_runtime_pb.ReadResponse)) {
    throw new Error('Expected argument of type go.micro.runtime.ReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_ReadResponse(buffer_arg) {
  return runtime_runtime_pb.ReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_UpdateRequest(arg) {
  if (!(arg instanceof runtime_runtime_pb.UpdateRequest)) {
    throw new Error('Expected argument of type go.micro.runtime.UpdateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_UpdateRequest(buffer_arg) {
  return runtime_runtime_pb.UpdateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_runtime_UpdateResponse(arg) {
  if (!(arg instanceof runtime_runtime_pb.UpdateResponse)) {
    throw new Error('Expected argument of type go.micro.runtime.UpdateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_runtime_UpdateResponse(buffer_arg) {
  return runtime_runtime_pb.UpdateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var RuntimeService = exports.RuntimeService = {
  create: {
    path: '/go.micro.runtime.Runtime/Create',
    requestStream: false,
    responseStream: false,
    requestType: runtime_runtime_pb.CreateRequest,
    responseType: runtime_runtime_pb.CreateResponse,
    requestSerialize: serialize_go_micro_runtime_CreateRequest,
    requestDeserialize: deserialize_go_micro_runtime_CreateRequest,
    responseSerialize: serialize_go_micro_runtime_CreateResponse,
    responseDeserialize: deserialize_go_micro_runtime_CreateResponse,
  },
  read: {
    path: '/go.micro.runtime.Runtime/Read',
    requestStream: false,
    responseStream: false,
    requestType: runtime_runtime_pb.ReadRequest,
    responseType: runtime_runtime_pb.ReadResponse,
    requestSerialize: serialize_go_micro_runtime_ReadRequest,
    requestDeserialize: deserialize_go_micro_runtime_ReadRequest,
    responseSerialize: serialize_go_micro_runtime_ReadResponse,
    responseDeserialize: deserialize_go_micro_runtime_ReadResponse,
  },
  delete: {
    path: '/go.micro.runtime.Runtime/Delete',
    requestStream: false,
    responseStream: false,
    requestType: runtime_runtime_pb.DeleteRequest,
    responseType: runtime_runtime_pb.DeleteResponse,
    requestSerialize: serialize_go_micro_runtime_DeleteRequest,
    requestDeserialize: deserialize_go_micro_runtime_DeleteRequest,
    responseSerialize: serialize_go_micro_runtime_DeleteResponse,
    responseDeserialize: deserialize_go_micro_runtime_DeleteResponse,
  },
  update: {
    path: '/go.micro.runtime.Runtime/Update',
    requestStream: false,
    responseStream: false,
    requestType: runtime_runtime_pb.UpdateRequest,
    responseType: runtime_runtime_pb.UpdateResponse,
    requestSerialize: serialize_go_micro_runtime_UpdateRequest,
    requestDeserialize: deserialize_go_micro_runtime_UpdateRequest,
    responseSerialize: serialize_go_micro_runtime_UpdateResponse,
    responseDeserialize: deserialize_go_micro_runtime_UpdateResponse,
  },
  list: {
    path: '/go.micro.runtime.Runtime/List',
    requestStream: false,
    responseStream: false,
    requestType: runtime_runtime_pb.ListRequest,
    responseType: runtime_runtime_pb.ListResponse,
    requestSerialize: serialize_go_micro_runtime_ListRequest,
    requestDeserialize: deserialize_go_micro_runtime_ListRequest,
    responseSerialize: serialize_go_micro_runtime_ListResponse,
    responseDeserialize: deserialize_go_micro_runtime_ListResponse,
  },
};

exports.RuntimeClient = grpc.makeGenericClientConstructor(RuntimeService);
