// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var network_network_pb = require('../network/network_pb.js');
var router_router_pb = require('../router/router_pb.js');

function serialize_go_micro_network_ConnectRequest(arg) {
  if (!(arg instanceof network_network_pb.ConnectRequest)) {
    throw new Error('Expected argument of type go.micro.network.ConnectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_ConnectRequest(buffer_arg) {
  return network_network_pb.ConnectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_ConnectResponse(arg) {
  if (!(arg instanceof network_network_pb.ConnectResponse)) {
    throw new Error('Expected argument of type go.micro.network.ConnectResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_ConnectResponse(buffer_arg) {
  return network_network_pb.ConnectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_GraphRequest(arg) {
  if (!(arg instanceof network_network_pb.GraphRequest)) {
    throw new Error('Expected argument of type go.micro.network.GraphRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_GraphRequest(buffer_arg) {
  return network_network_pb.GraphRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_GraphResponse(arg) {
  if (!(arg instanceof network_network_pb.GraphResponse)) {
    throw new Error('Expected argument of type go.micro.network.GraphResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_GraphResponse(buffer_arg) {
  return network_network_pb.GraphResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_NodesRequest(arg) {
  if (!(arg instanceof network_network_pb.NodesRequest)) {
    throw new Error('Expected argument of type go.micro.network.NodesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_NodesRequest(buffer_arg) {
  return network_network_pb.NodesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_NodesResponse(arg) {
  if (!(arg instanceof network_network_pb.NodesResponse)) {
    throw new Error('Expected argument of type go.micro.network.NodesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_NodesResponse(buffer_arg) {
  return network_network_pb.NodesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_RoutesRequest(arg) {
  if (!(arg instanceof network_network_pb.RoutesRequest)) {
    throw new Error('Expected argument of type go.micro.network.RoutesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_RoutesRequest(buffer_arg) {
  return network_network_pb.RoutesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_RoutesResponse(arg) {
  if (!(arg instanceof network_network_pb.RoutesResponse)) {
    throw new Error('Expected argument of type go.micro.network.RoutesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_RoutesResponse(buffer_arg) {
  return network_network_pb.RoutesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_ServicesRequest(arg) {
  if (!(arg instanceof network_network_pb.ServicesRequest)) {
    throw new Error('Expected argument of type go.micro.network.ServicesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_ServicesRequest(buffer_arg) {
  return network_network_pb.ServicesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_ServicesResponse(arg) {
  if (!(arg instanceof network_network_pb.ServicesResponse)) {
    throw new Error('Expected argument of type go.micro.network.ServicesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_ServicesResponse(buffer_arg) {
  return network_network_pb.ServicesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_StatusRequest(arg) {
  if (!(arg instanceof network_network_pb.StatusRequest)) {
    throw new Error('Expected argument of type go.micro.network.StatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_StatusRequest(buffer_arg) {
  return network_network_pb.StatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_network_StatusResponse(arg) {
  if (!(arg instanceof network_network_pb.StatusResponse)) {
    throw new Error('Expected argument of type go.micro.network.StatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_network_StatusResponse(buffer_arg) {
  return network_network_pb.StatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Network service is usesd to gain visibility into networks
var NetworkService = exports.NetworkService = {
  // Connect to the network
connect: {
    path: '/go.micro.network.Network/Connect',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.ConnectRequest,
    responseType: network_network_pb.ConnectResponse,
    requestSerialize: serialize_go_micro_network_ConnectRequest,
    requestDeserialize: deserialize_go_micro_network_ConnectRequest,
    responseSerialize: serialize_go_micro_network_ConnectResponse,
    responseDeserialize: deserialize_go_micro_network_ConnectResponse,
  },
  // Returns the entire network graph
graph: {
    path: '/go.micro.network.Network/Graph',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.GraphRequest,
    responseType: network_network_pb.GraphResponse,
    requestSerialize: serialize_go_micro_network_GraphRequest,
    requestDeserialize: deserialize_go_micro_network_GraphRequest,
    responseSerialize: serialize_go_micro_network_GraphResponse,
    responseDeserialize: deserialize_go_micro_network_GraphResponse,
  },
  // Returns a list of known nodes in the network
nodes: {
    path: '/go.micro.network.Network/Nodes',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.NodesRequest,
    responseType: network_network_pb.NodesResponse,
    requestSerialize: serialize_go_micro_network_NodesRequest,
    requestDeserialize: deserialize_go_micro_network_NodesRequest,
    responseSerialize: serialize_go_micro_network_NodesResponse,
    responseDeserialize: deserialize_go_micro_network_NodesResponse,
  },
  // Returns a list of known routes in the network
routes: {
    path: '/go.micro.network.Network/Routes',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.RoutesRequest,
    responseType: network_network_pb.RoutesResponse,
    requestSerialize: serialize_go_micro_network_RoutesRequest,
    requestDeserialize: deserialize_go_micro_network_RoutesRequest,
    responseSerialize: serialize_go_micro_network_RoutesResponse,
    responseDeserialize: deserialize_go_micro_network_RoutesResponse,
  },
  // Returns a list of known services based on routes
services: {
    path: '/go.micro.network.Network/Services',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.ServicesRequest,
    responseType: network_network_pb.ServicesResponse,
    requestSerialize: serialize_go_micro_network_ServicesRequest,
    requestDeserialize: deserialize_go_micro_network_ServicesRequest,
    responseSerialize: serialize_go_micro_network_ServicesResponse,
    responseDeserialize: deserialize_go_micro_network_ServicesResponse,
  },
  // Status returns network status
status: {
    path: '/go.micro.network.Network/Status',
    requestStream: false,
    responseStream: false,
    requestType: network_network_pb.StatusRequest,
    responseType: network_network_pb.StatusResponse,
    requestSerialize: serialize_go_micro_network_StatusRequest,
    requestDeserialize: deserialize_go_micro_network_StatusRequest,
    responseSerialize: serialize_go_micro_network_StatusResponse,
    responseDeserialize: deserialize_go_micro_network_StatusResponse,
  },
};

exports.NetworkClient = grpc.makeGenericClientConstructor(NetworkService);
