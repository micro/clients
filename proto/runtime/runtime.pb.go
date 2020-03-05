// Code generated by protoc-gen-go. DO NOT EDIT.
// source: github.com/micro/clients/proto/runtime/runtime.proto

package go_micro_runtime

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type Service struct {
	// name of the service
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// version of the service
	Version string `protobuf:"bytes,2,opt,name=version,proto3" json:"version,omitempty"`
	// git url of the source
	Source string `protobuf:"bytes,3,opt,name=source,proto3" json:"source,omitempty"`
	// local path of the source
	Path string `protobuf:"bytes,4,opt,name=path,proto3" json:"path,omitempty"`
	// command to execute
	Exec                 string   `protobuf:"bytes,5,opt,name=exec,proto3" json:"exec,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Service) Reset()         { *m = Service{} }
func (m *Service) String() string { return proto.CompactTextString(m) }
func (*Service) ProtoMessage()    {}
func (*Service) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{0}
}

func (m *Service) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Service.Unmarshal(m, b)
}
func (m *Service) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Service.Marshal(b, m, deterministic)
}
func (m *Service) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Service.Merge(m, src)
}
func (m *Service) XXX_Size() int {
	return xxx_messageInfo_Service.Size(m)
}
func (m *Service) XXX_DiscardUnknown() {
	xxx_messageInfo_Service.DiscardUnknown(m)
}

var xxx_messageInfo_Service proto.InternalMessageInfo

func (m *Service) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Service) GetVersion() string {
	if m != nil {
		return m.Version
	}
	return ""
}

func (m *Service) GetSource() string {
	if m != nil {
		return m.Source
	}
	return ""
}

func (m *Service) GetPath() string {
	if m != nil {
		return m.Path
	}
	return ""
}

func (m *Service) GetExec() string {
	if m != nil {
		return m.Exec
	}
	return ""
}

type Options struct {
	// command to pass in
	Command string `protobuf:"bytes,1,opt,name=command,proto3" json:"command,omitempty"`
	// environment to pass in
	Env []string `protobuf:"bytes,2,rep,name=env,proto3" json:"env,omitempty"`
	// output to send to
	Output               string   `protobuf:"bytes,3,opt,name=output,proto3" json:"output,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Options) Reset()         { *m = Options{} }
func (m *Options) String() string { return proto.CompactTextString(m) }
func (*Options) ProtoMessage()    {}
func (*Options) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{1}
}

func (m *Options) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Options.Unmarshal(m, b)
}
func (m *Options) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Options.Marshal(b, m, deterministic)
}
func (m *Options) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Options.Merge(m, src)
}
func (m *Options) XXX_Size() int {
	return xxx_messageInfo_Options.Size(m)
}
func (m *Options) XXX_DiscardUnknown() {
	xxx_messageInfo_Options.DiscardUnknown(m)
}

var xxx_messageInfo_Options proto.InternalMessageInfo

func (m *Options) GetCommand() string {
	if m != nil {
		return m.Command
	}
	return ""
}

func (m *Options) GetEnv() []string {
	if m != nil {
		return m.Env
	}
	return nil
}

func (m *Options) GetOutput() string {
	if m != nil {
		return m.Output
	}
	return ""
}

type CreateRequest struct {
	Service              *Service `protobuf:"bytes,1,opt,name=service,proto3" json:"service,omitempty"`
	Options              *Options `protobuf:"bytes,2,opt,name=options,proto3" json:"options,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateRequest) Reset()         { *m = CreateRequest{} }
func (m *CreateRequest) String() string { return proto.CompactTextString(m) }
func (*CreateRequest) ProtoMessage()    {}
func (*CreateRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{2}
}

func (m *CreateRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateRequest.Unmarshal(m, b)
}
func (m *CreateRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateRequest.Marshal(b, m, deterministic)
}
func (m *CreateRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateRequest.Merge(m, src)
}
func (m *CreateRequest) XXX_Size() int {
	return xxx_messageInfo_CreateRequest.Size(m)
}
func (m *CreateRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateRequest proto.InternalMessageInfo

func (m *CreateRequest) GetService() *Service {
	if m != nil {
		return m.Service
	}
	return nil
}

func (m *CreateRequest) GetOptions() *Options {
	if m != nil {
		return m.Options
	}
	return nil
}

type CreateResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateResponse) Reset()         { *m = CreateResponse{} }
func (m *CreateResponse) String() string { return proto.CompactTextString(m) }
func (*CreateResponse) ProtoMessage()    {}
func (*CreateResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{3}
}

func (m *CreateResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateResponse.Unmarshal(m, b)
}
func (m *CreateResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateResponse.Marshal(b, m, deterministic)
}
func (m *CreateResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateResponse.Merge(m, src)
}
func (m *CreateResponse) XXX_Size() int {
	return xxx_messageInfo_CreateResponse.Size(m)
}
func (m *CreateResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CreateResponse proto.InternalMessageInfo

type DeleteRequest struct {
	Service              *Service `protobuf:"bytes,1,opt,name=service,proto3" json:"service,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteRequest) Reset()         { *m = DeleteRequest{} }
func (m *DeleteRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteRequest) ProtoMessage()    {}
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{4}
}

func (m *DeleteRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteRequest.Unmarshal(m, b)
}
func (m *DeleteRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteRequest.Marshal(b, m, deterministic)
}
func (m *DeleteRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteRequest.Merge(m, src)
}
func (m *DeleteRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteRequest.Size(m)
}
func (m *DeleteRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteRequest proto.InternalMessageInfo

func (m *DeleteRequest) GetService() *Service {
	if m != nil {
		return m.Service
	}
	return nil
}

type DeleteResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteResponse) Reset()         { *m = DeleteResponse{} }
func (m *DeleteResponse) String() string { return proto.CompactTextString(m) }
func (*DeleteResponse) ProtoMessage()    {}
func (*DeleteResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{5}
}

func (m *DeleteResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteResponse.Unmarshal(m, b)
}
func (m *DeleteResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteResponse.Marshal(b, m, deterministic)
}
func (m *DeleteResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteResponse.Merge(m, src)
}
func (m *DeleteResponse) XXX_Size() int {
	return xxx_messageInfo_DeleteResponse.Size(m)
}
func (m *DeleteResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteResponse.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteResponse proto.InternalMessageInfo

type UpdateRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateRequest) Reset()         { *m = UpdateRequest{} }
func (m *UpdateRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateRequest) ProtoMessage()    {}
func (*UpdateRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{6}
}

func (m *UpdateRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateRequest.Unmarshal(m, b)
}
func (m *UpdateRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateRequest.Marshal(b, m, deterministic)
}
func (m *UpdateRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateRequest.Merge(m, src)
}
func (m *UpdateRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateRequest.Size(m)
}
func (m *UpdateRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateRequest proto.InternalMessageInfo

type UpdateResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateResponse) Reset()         { *m = UpdateResponse{} }
func (m *UpdateResponse) String() string { return proto.CompactTextString(m) }
func (*UpdateResponse) ProtoMessage()    {}
func (*UpdateResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{7}
}

func (m *UpdateResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateResponse.Unmarshal(m, b)
}
func (m *UpdateResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateResponse.Marshal(b, m, deterministic)
}
func (m *UpdateResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateResponse.Merge(m, src)
}
func (m *UpdateResponse) XXX_Size() int {
	return xxx_messageInfo_UpdateResponse.Size(m)
}
func (m *UpdateResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateResponse.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateResponse proto.InternalMessageInfo

type ListRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListRequest) Reset()         { *m = ListRequest{} }
func (m *ListRequest) String() string { return proto.CompactTextString(m) }
func (*ListRequest) ProtoMessage()    {}
func (*ListRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{8}
}

func (m *ListRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListRequest.Unmarshal(m, b)
}
func (m *ListRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListRequest.Marshal(b, m, deterministic)
}
func (m *ListRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListRequest.Merge(m, src)
}
func (m *ListRequest) XXX_Size() int {
	return xxx_messageInfo_ListRequest.Size(m)
}
func (m *ListRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ListRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ListRequest proto.InternalMessageInfo

type ListResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListResponse) Reset()         { *m = ListResponse{} }
func (m *ListResponse) String() string { return proto.CompactTextString(m) }
func (*ListResponse) ProtoMessage()    {}
func (*ListResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_4ce2bad0c9796ffd, []int{9}
}

func (m *ListResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListResponse.Unmarshal(m, b)
}
func (m *ListResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListResponse.Marshal(b, m, deterministic)
}
func (m *ListResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListResponse.Merge(m, src)
}
func (m *ListResponse) XXX_Size() int {
	return xxx_messageInfo_ListResponse.Size(m)
}
func (m *ListResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ListResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ListResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*Service)(nil), "go.micro.runtime.Service")
	proto.RegisterType((*Options)(nil), "go.micro.runtime.Options")
	proto.RegisterType((*CreateRequest)(nil), "go.micro.runtime.CreateRequest")
	proto.RegisterType((*CreateResponse)(nil), "go.micro.runtime.CreateResponse")
	proto.RegisterType((*DeleteRequest)(nil), "go.micro.runtime.DeleteRequest")
	proto.RegisterType((*DeleteResponse)(nil), "go.micro.runtime.DeleteResponse")
	proto.RegisterType((*UpdateRequest)(nil), "go.micro.runtime.UpdateRequest")
	proto.RegisterType((*UpdateResponse)(nil), "go.micro.runtime.UpdateResponse")
	proto.RegisterType((*ListRequest)(nil), "go.micro.runtime.ListRequest")
	proto.RegisterType((*ListResponse)(nil), "go.micro.runtime.ListResponse")
}

func init() {
	proto.RegisterFile("github.com/micro/clients/proto/runtime/runtime.proto", fileDescriptor_4ce2bad0c9796ffd)
}

var fileDescriptor_4ce2bad0c9796ffd = []byte{
	// 379 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xa4, 0x93, 0xdf, 0x6a, 0xea, 0x40,
	0x10, 0xc6, 0xfd, 0x77, 0x0c, 0x8e, 0x27, 0x1e, 0xd9, 0x8b, 0x43, 0x2a, 0xb4, 0x95, 0x5c, 0x79,
	0x95, 0x80, 0xf6, 0x0d, 0x2a, 0xf4, 0xa6, 0x52, 0x48, 0xe9, 0x03, 0xc4, 0x38, 0xe8, 0x82, 0xd9,
	0x4d, 0x77, 0x37, 0xb6, 0x7d, 0xba, 0xbe, 0x5a, 0xd9, 0x7f, 0xb4, 0x6a, 0xbc, 0xea, 0x95, 0x33,
	0xb3, 0x5f, 0x7e, 0xdf, 0x7c, 0x03, 0xc2, 0xdd, 0x96, 0xaa, 0x5d, 0xbd, 0x4e, 0x0a, 0x5e, 0xa6,
	0x25, 0x2d, 0x04, 0x4f, 0x8b, 0x3d, 0x45, 0xa6, 0x64, 0x5a, 0x09, 0xae, 0x78, 0x2a, 0x6a, 0xa6,
	0x68, 0x89, 0xfe, 0x37, 0x31, 0x53, 0x32, 0xde, 0xf2, 0xc4, 0xa8, 0x13, 0x37, 0x8f, 0xdf, 0x20,
	0x78, 0x46, 0x71, 0xa0, 0x05, 0x12, 0x02, 0x3d, 0x96, 0x97, 0x18, 0xb5, 0xa7, 0xed, 0xd9, 0x20,
	0x33, 0x35, 0x89, 0x20, 0x38, 0xa0, 0x90, 0x94, 0xb3, 0xa8, 0x63, 0xc6, 0xbe, 0x25, 0xff, 0xa1,
	0x2f, 0x79, 0x2d, 0x0a, 0x8c, 0xba, 0xe6, 0xc1, 0x75, 0x9a, 0x52, 0xe5, 0x6a, 0x17, 0xf5, 0x2c,
	0x45, 0xd7, 0x7a, 0x86, 0xef, 0x58, 0x44, 0x7f, 0xec, 0x4c, 0xd7, 0xf1, 0x0a, 0x82, 0xa7, 0x4a,
	0x51, 0xce, 0xa4, 0x36, 0x29, 0x78, 0x59, 0xe6, 0x6c, 0xe3, 0xbc, 0x7d, 0x4b, 0xc6, 0xd0, 0x45,
	0x76, 0x88, 0x3a, 0xd3, 0xee, 0x6c, 0x90, 0xe9, 0x52, 0xdb, 0xf2, 0x5a, 0x55, 0xb5, 0xf2, 0xb6,
	0xb6, 0x8b, 0x3f, 0x20, 0xbc, 0x17, 0x98, 0x2b, 0xcc, 0xf0, 0xb5, 0x46, 0xa9, 0xc8, 0x02, 0x02,
	0x69, 0x83, 0x19, 0xe8, 0x70, 0x7e, 0x95, 0x9c, 0x86, 0x4f, 0x5c, 0xf2, 0xcc, 0x2b, 0xf5, 0x47,
	0xdc, 0x2e, 0x65, 0xe2, 0x36, 0x7e, 0xe4, 0xb6, 0xce, 0xbc, 0x32, 0x1e, 0xc3, 0xc8, 0x5b, 0xcb,
	0x8a, 0x33, 0x89, 0xf1, 0x12, 0xc2, 0x25, 0xee, 0xf1, 0x77, 0xcb, 0x68, 0xae, 0xa7, 0x38, 0xee,
	0x3f, 0x08, 0x5f, 0xaa, 0xcd, 0x77, 0x48, 0x2d, 0xf1, 0x03, 0x27, 0x09, 0x61, 0xf8, 0x48, 0xa5,
	0xf2, 0x82, 0x11, 0xfc, 0xb5, 0xad, 0x7d, 0x9e, 0x7f, 0x76, 0x20, 0xc8, 0xac, 0x21, 0x59, 0x41,
	0xdf, 0xee, 0x4d, 0x6e, 0xcf, 0xb7, 0x39, 0x3a, 0xe6, 0x64, 0x7a, 0x59, 0xe0, 0x7c, 0x5b, 0x1a,
	0x67, 0xd7, 0x6d, 0xc2, 0x1d, 0x9d, 0xa3, 0x09, 0x77, 0x92, 0xd4, 0xe0, 0x6c, 0xb4, 0x26, 0xdc,
	0xd1, 0x15, 0x9a, 0x70, 0x27, 0x57, 0x69, 0x91, 0x07, 0xe8, 0xe9, 0x43, 0x90, 0xeb, 0x73, 0xed,
	0x8f, 0x7b, 0x4d, 0x6e, 0x2e, 0x3d, 0x7b, 0xd0, 0xba, 0x6f, 0xfe, 0x49, 0x8b, 0xaf, 0x00, 0x00,
	0x00, 0xff, 0xff, 0x84, 0x33, 0x96, 0xb2, 0x81, 0x03, 0x00, 0x00,
}