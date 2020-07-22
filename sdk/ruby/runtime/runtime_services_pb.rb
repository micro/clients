# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: runtime/runtime.proto for package 'go.micro.runtime'

require 'grpc'
require 'runtime/runtime_pb'

module Go
  module Micro
    module Runtime
      module Runtime
        class Service

          include GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'go.micro.runtime.Runtime'

          rpc :Create, Go::Micro::Runtime::CreateRequest, Go::Micro::Runtime::CreateResponse
          rpc :Read, Go::Micro::Runtime::ReadRequest, Go::Micro::Runtime::ReadResponse
          rpc :Delete, Go::Micro::Runtime::DeleteRequest, Go::Micro::Runtime::DeleteResponse
          rpc :Update, Go::Micro::Runtime::UpdateRequest, Go::Micro::Runtime::UpdateResponse
          rpc :Logs, Go::Micro::Runtime::LogsRequest, stream(Go::Micro::Runtime::LogRecord)
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
