// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var router_router_pb = require('../router/router_pb.js');

function serialize_go_micro_router_Advert(arg) {
  if (!(arg instanceof router_router_pb.Advert)) {
    throw new Error('Expected argument of type go.micro.router.Advert');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_Advert(buffer_arg) {
  return router_router_pb.Advert.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_CreateResponse(arg) {
  if (!(arg instanceof router_router_pb.CreateResponse)) {
    throw new Error('Expected argument of type go.micro.router.CreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_CreateResponse(buffer_arg) {
  return router_router_pb.CreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_DeleteResponse(arg) {
  if (!(arg instanceof router_router_pb.DeleteResponse)) {
    throw new Error('Expected argument of type go.micro.router.DeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_DeleteResponse(buffer_arg) {
  return router_router_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_Event(arg) {
  if (!(arg instanceof router_router_pb.Event)) {
    throw new Error('Expected argument of type go.micro.router.Event');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_Event(buffer_arg) {
  return router_router_pb.Event.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_ListResponse(arg) {
  if (!(arg instanceof router_router_pb.ListResponse)) {
    throw new Error('Expected argument of type go.micro.router.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_ListResponse(buffer_arg) {
  return router_router_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_LookupRequest(arg) {
  if (!(arg instanceof router_router_pb.LookupRequest)) {
    throw new Error('Expected argument of type go.micro.router.LookupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_LookupRequest(buffer_arg) {
  return router_router_pb.LookupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_LookupResponse(arg) {
  if (!(arg instanceof router_router_pb.LookupResponse)) {
    throw new Error('Expected argument of type go.micro.router.LookupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_LookupResponse(buffer_arg) {
  return router_router_pb.LookupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_ProcessResponse(arg) {
  if (!(arg instanceof router_router_pb.ProcessResponse)) {
    throw new Error('Expected argument of type go.micro.router.ProcessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_ProcessResponse(buffer_arg) {
  return router_router_pb.ProcessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_QueryRequest(arg) {
  if (!(arg instanceof router_router_pb.QueryRequest)) {
    throw new Error('Expected argument of type go.micro.router.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_QueryRequest(buffer_arg) {
  return router_router_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_QueryResponse(arg) {
  if (!(arg instanceof router_router_pb.QueryResponse)) {
    throw new Error('Expected argument of type go.micro.router.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_QueryResponse(buffer_arg) {
  return router_router_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_Request(arg) {
  if (!(arg instanceof router_router_pb.Request)) {
    throw new Error('Expected argument of type go.micro.router.Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_Request(buffer_arg) {
  return router_router_pb.Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_Route(arg) {
  if (!(arg instanceof router_router_pb.Route)) {
    throw new Error('Expected argument of type go.micro.router.Route');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_Route(buffer_arg) {
  return router_router_pb.Route.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_UpdateResponse(arg) {
  if (!(arg instanceof router_router_pb.UpdateResponse)) {
    throw new Error('Expected argument of type go.micro.router.UpdateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_UpdateResponse(buffer_arg) {
  return router_router_pb.UpdateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_router_WatchRequest(arg) {
  if (!(arg instanceof router_router_pb.WatchRequest)) {
    throw new Error('Expected argument of type go.micro.router.WatchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_router_WatchRequest(buffer_arg) {
  return router_router_pb.WatchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// Router service is used by the proxy to lookup routes
var RouterService = exports.RouterService = {
  lookup: {
    path: '/go.micro.router.Router/Lookup',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.LookupRequest,
    responseType: router_router_pb.LookupResponse,
    requestSerialize: serialize_go_micro_router_LookupRequest,
    requestDeserialize: deserialize_go_micro_router_LookupRequest,
    responseSerialize: serialize_go_micro_router_LookupResponse,
    responseDeserialize: deserialize_go_micro_router_LookupResponse,
  },
  watch: {
    path: '/go.micro.router.Router/Watch',
    requestStream: false,
    responseStream: true,
    requestType: router_router_pb.WatchRequest,
    responseType: router_router_pb.Event,
    requestSerialize: serialize_go_micro_router_WatchRequest,
    requestDeserialize: deserialize_go_micro_router_WatchRequest,
    responseSerialize: serialize_go_micro_router_Event,
    responseDeserialize: deserialize_go_micro_router_Event,
  },
  advertise: {
    path: '/go.micro.router.Router/Advertise',
    requestStream: false,
    responseStream: true,
    requestType: router_router_pb.Request,
    responseType: router_router_pb.Advert,
    requestSerialize: serialize_go_micro_router_Request,
    requestDeserialize: deserialize_go_micro_router_Request,
    responseSerialize: serialize_go_micro_router_Advert,
    responseDeserialize: deserialize_go_micro_router_Advert,
  },
  process: {
    path: '/go.micro.router.Router/Process',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.Advert,
    responseType: router_router_pb.ProcessResponse,
    requestSerialize: serialize_go_micro_router_Advert,
    requestDeserialize: deserialize_go_micro_router_Advert,
    responseSerialize: serialize_go_micro_router_ProcessResponse,
    responseDeserialize: deserialize_go_micro_router_ProcessResponse,
  },
};

exports.RouterClient = grpc.makeGenericClientConstructor(RouterService);
var TableService = exports.TableService = {
  create: {
    path: '/go.micro.router.Table/Create',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.Route,
    responseType: router_router_pb.CreateResponse,
    requestSerialize: serialize_go_micro_router_Route,
    requestDeserialize: deserialize_go_micro_router_Route,
    responseSerialize: serialize_go_micro_router_CreateResponse,
    responseDeserialize: deserialize_go_micro_router_CreateResponse,
  },
  delete: {
    path: '/go.micro.router.Table/Delete',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.Route,
    responseType: router_router_pb.DeleteResponse,
    requestSerialize: serialize_go_micro_router_Route,
    requestDeserialize: deserialize_go_micro_router_Route,
    responseSerialize: serialize_go_micro_router_DeleteResponse,
    responseDeserialize: deserialize_go_micro_router_DeleteResponse,
  },
  update: {
    path: '/go.micro.router.Table/Update',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.Route,
    responseType: router_router_pb.UpdateResponse,
    requestSerialize: serialize_go_micro_router_Route,
    requestDeserialize: deserialize_go_micro_router_Route,
    responseSerialize: serialize_go_micro_router_UpdateResponse,
    responseDeserialize: deserialize_go_micro_router_UpdateResponse,
  },
  list: {
    path: '/go.micro.router.Table/List',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.Request,
    responseType: router_router_pb.ListResponse,
    requestSerialize: serialize_go_micro_router_Request,
    requestDeserialize: deserialize_go_micro_router_Request,
    responseSerialize: serialize_go_micro_router_ListResponse,
    responseDeserialize: deserialize_go_micro_router_ListResponse,
  },
  query: {
    path: '/go.micro.router.Table/Query',
    requestStream: false,
    responseStream: false,
    requestType: router_router_pb.QueryRequest,
    responseType: router_router_pb.QueryResponse,
    requestSerialize: serialize_go_micro_router_QueryRequest,
    requestDeserialize: deserialize_go_micro_router_QueryRequest,
    responseSerialize: serialize_go_micro_router_QueryResponse,
    responseDeserialize: deserialize_go_micro_router_QueryResponse,
  },
};

exports.TableClient = grpc.makeGenericClientConstructor(TableService);
