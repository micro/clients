# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: events/events.proto for package 'events'

require 'grpc'
require 'events/events_pb'

module Events
  module Stream
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'events.Stream'

      rpc :Publish, ::Events::PublishRequest, ::Events::PublishResponse
      rpc :Subscribe, ::Events::SubscribeRequest, stream(::Events::Event)
    end

    Stub = Service.rpc_stub_class
  end
  module Store
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'events.Store'

      rpc :Read, ::Events::ReadRequest, ::Events::ReadResponse
      rpc :Write, ::Events::WriteRequest, ::Events::WriteResponse
    end

    Stub = Service.rpc_stub_class
  end
end
