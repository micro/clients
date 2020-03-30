// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var auth_accounts_pb = require('../auth/accounts_pb.js');
var auth_pb = require('../auth_pb.js');

function serialize_go_micro_auth_ListAccountsRequest(arg) {
  if (!(arg instanceof auth_accounts_pb.ListAccountsRequest)) {
    throw new Error('Expected argument of type go.micro.auth.ListAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListAccountsRequest(buffer_arg) {
  return auth_accounts_pb.ListAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_go_micro_auth_ListAccountsResponse(arg) {
  if (!(arg instanceof auth_accounts_pb.ListAccountsResponse)) {
    throw new Error('Expected argument of type go.micro.auth.ListAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_go_micro_auth_ListAccountsResponse(buffer_arg) {
  return auth_accounts_pb.ListAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var AccountsService = exports.AccountsService = {
  list: {
    path: '/go.micro.auth.Accounts/List',
    requestStream: false,
    responseStream: false,
    requestType: auth_accounts_pb.ListAccountsRequest,
    responseType: auth_accounts_pb.ListAccountsResponse,
    requestSerialize: serialize_go_micro_auth_ListAccountsRequest,
    requestDeserialize: deserialize_go_micro_auth_ListAccountsRequest,
    responseSerialize: serialize_go_micro_auth_ListAccountsResponse,
    responseDeserialize: deserialize_go_micro_auth_ListAccountsResponse,
  },
};

exports.AccountsClient = grpc.makeGenericClientConstructor(AccountsService);
