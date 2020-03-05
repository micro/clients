// Code generated by protoc-gen-go. DO NOT EDIT.
// source: github.com/micro/clients/proto/store/store.proto

package go_micro_store

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

type Record struct {
	// key of the record
	Key string `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	// value in the record
	Value []byte `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	// timestamp in unix seconds
	Expiry               int64    `protobuf:"varint,3,opt,name=expiry,proto3" json:"expiry,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Record) Reset()         { *m = Record{} }
func (m *Record) String() string { return proto.CompactTextString(m) }
func (*Record) ProtoMessage()    {}
func (*Record) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{0}
}

func (m *Record) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Record.Unmarshal(m, b)
}
func (m *Record) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Record.Marshal(b, m, deterministic)
}
func (m *Record) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Record.Merge(m, src)
}
func (m *Record) XXX_Size() int {
	return xxx_messageInfo_Record.Size(m)
}
func (m *Record) XXX_DiscardUnknown() {
	xxx_messageInfo_Record.DiscardUnknown(m)
}

var xxx_messageInfo_Record proto.InternalMessageInfo

func (m *Record) GetKey() string {
	if m != nil {
		return m.Key
	}
	return ""
}

func (m *Record) GetValue() []byte {
	if m != nil {
		return m.Value
	}
	return nil
}

func (m *Record) GetExpiry() int64 {
	if m != nil {
		return m.Expiry
	}
	return 0
}

type ReadRequest struct {
	Keys                 []string `protobuf:"bytes,1,rep,name=keys,proto3" json:"keys,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ReadRequest) Reset()         { *m = ReadRequest{} }
func (m *ReadRequest) String() string { return proto.CompactTextString(m) }
func (*ReadRequest) ProtoMessage()    {}
func (*ReadRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{1}
}

func (m *ReadRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ReadRequest.Unmarshal(m, b)
}
func (m *ReadRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ReadRequest.Marshal(b, m, deterministic)
}
func (m *ReadRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ReadRequest.Merge(m, src)
}
func (m *ReadRequest) XXX_Size() int {
	return xxx_messageInfo_ReadRequest.Size(m)
}
func (m *ReadRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ReadRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ReadRequest proto.InternalMessageInfo

func (m *ReadRequest) GetKeys() []string {
	if m != nil {
		return m.Keys
	}
	return nil
}

type ReadResponse struct {
	Records              []*Record `protobuf:"bytes,1,rep,name=records,proto3" json:"records,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *ReadResponse) Reset()         { *m = ReadResponse{} }
func (m *ReadResponse) String() string { return proto.CompactTextString(m) }
func (*ReadResponse) ProtoMessage()    {}
func (*ReadResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{2}
}

func (m *ReadResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ReadResponse.Unmarshal(m, b)
}
func (m *ReadResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ReadResponse.Marshal(b, m, deterministic)
}
func (m *ReadResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ReadResponse.Merge(m, src)
}
func (m *ReadResponse) XXX_Size() int {
	return xxx_messageInfo_ReadResponse.Size(m)
}
func (m *ReadResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ReadResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ReadResponse proto.InternalMessageInfo

func (m *ReadResponse) GetRecords() []*Record {
	if m != nil {
		return m.Records
	}
	return nil
}

type WriteRequest struct {
	Records              []*Record `protobuf:"bytes,2,rep,name=records,proto3" json:"records,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *WriteRequest) Reset()         { *m = WriteRequest{} }
func (m *WriteRequest) String() string { return proto.CompactTextString(m) }
func (*WriteRequest) ProtoMessage()    {}
func (*WriteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{3}
}

func (m *WriteRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_WriteRequest.Unmarshal(m, b)
}
func (m *WriteRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_WriteRequest.Marshal(b, m, deterministic)
}
func (m *WriteRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_WriteRequest.Merge(m, src)
}
func (m *WriteRequest) XXX_Size() int {
	return xxx_messageInfo_WriteRequest.Size(m)
}
func (m *WriteRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_WriteRequest.DiscardUnknown(m)
}

var xxx_messageInfo_WriteRequest proto.InternalMessageInfo

func (m *WriteRequest) GetRecords() []*Record {
	if m != nil {
		return m.Records
	}
	return nil
}

type WriteResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *WriteResponse) Reset()         { *m = WriteResponse{} }
func (m *WriteResponse) String() string { return proto.CompactTextString(m) }
func (*WriteResponse) ProtoMessage()    {}
func (*WriteResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{4}
}

func (m *WriteResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_WriteResponse.Unmarshal(m, b)
}
func (m *WriteResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_WriteResponse.Marshal(b, m, deterministic)
}
func (m *WriteResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_WriteResponse.Merge(m, src)
}
func (m *WriteResponse) XXX_Size() int {
	return xxx_messageInfo_WriteResponse.Size(m)
}
func (m *WriteResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_WriteResponse.DiscardUnknown(m)
}

var xxx_messageInfo_WriteResponse proto.InternalMessageInfo

type DeleteRequest struct {
	Keys                 []string `protobuf:"bytes,1,rep,name=keys,proto3" json:"keys,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteRequest) Reset()         { *m = DeleteRequest{} }
func (m *DeleteRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteRequest) ProtoMessage()    {}
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{5}
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

func (m *DeleteRequest) GetKeys() []string {
	if m != nil {
		return m.Keys
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
	return fileDescriptor_0f00e1e9788f6c29, []int{6}
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

type ListRequest struct {
	// optional key
	Key                  string   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListRequest) Reset()         { *m = ListRequest{} }
func (m *ListRequest) String() string { return proto.CompactTextString(m) }
func (*ListRequest) ProtoMessage()    {}
func (*ListRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{7}
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

func (m *ListRequest) GetKey() string {
	if m != nil {
		return m.Key
	}
	return ""
}

type ListResponse struct {
	Records              []*Record `protobuf:"bytes,1,rep,name=records,proto3" json:"records,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *ListResponse) Reset()         { *m = ListResponse{} }
func (m *ListResponse) String() string { return proto.CompactTextString(m) }
func (*ListResponse) ProtoMessage()    {}
func (*ListResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f00e1e9788f6c29, []int{8}
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

func (m *ListResponse) GetRecords() []*Record {
	if m != nil {
		return m.Records
	}
	return nil
}

func init() {
	proto.RegisterType((*Record)(nil), "go.micro.store.Record")
	proto.RegisterType((*ReadRequest)(nil), "go.micro.store.ReadRequest")
	proto.RegisterType((*ReadResponse)(nil), "go.micro.store.ReadResponse")
	proto.RegisterType((*WriteRequest)(nil), "go.micro.store.WriteRequest")
	proto.RegisterType((*WriteResponse)(nil), "go.micro.store.WriteResponse")
	proto.RegisterType((*DeleteRequest)(nil), "go.micro.store.DeleteRequest")
	proto.RegisterType((*DeleteResponse)(nil), "go.micro.store.DeleteResponse")
	proto.RegisterType((*ListRequest)(nil), "go.micro.store.ListRequest")
	proto.RegisterType((*ListResponse)(nil), "go.micro.store.ListResponse")
}

func init() {
	proto.RegisterFile("github.com/micro/clients/proto/store/store.proto", fileDescriptor_0f00e1e9788f6c29)
}

var fileDescriptor_0f00e1e9788f6c29 = []byte{
	// 341 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x92, 0xcb, 0x4e, 0xc2, 0x40,
	0x14, 0x86, 0x29, 0x85, 0x1a, 0x0e, 0x17, 0xc9, 0x89, 0x21, 0x0d, 0xde, 0x6a, 0xdd, 0x74, 0xd5,
	0x12, 0x7c, 0x01, 0x13, 0x2f, 0xd1, 0xc4, 0xd5, 0xb8, 0x70, 0x0d, 0xe5, 0x04, 0x1b, 0x2e, 0x83,
	0x33, 0x83, 0x91, 0x17, 0xf2, 0x39, 0x4d, 0x67, 0x5a, 0x2d, 0x16, 0x12, 0xe3, 0xa6, 0x99, 0x99,
	0xf3, 0x9f, 0x6f, 0xfe, 0x9e, 0x7f, 0x60, 0x30, 0x4d, 0xd4, 0xeb, 0x7a, 0x1c, 0xc6, 0x7c, 0x11,
	0x2d, 0x92, 0x58, 0xf0, 0x28, 0x9e, 0x27, 0xb4, 0x54, 0x32, 0x5a, 0x09, 0xae, 0x78, 0x24, 0x15,
	0x17, 0x64, 0xbe, 0xa1, 0x3e, 0xc1, 0xce, 0x94, 0x87, 0x5a, 0x19, 0xea, 0x53, 0xff, 0x01, 0x1c,
	0x46, 0x31, 0x17, 0x13, 0xec, 0x82, 0x3d, 0xa3, 0x8d, 0x6b, 0x79, 0x56, 0xd0, 0x60, 0xe9, 0x12,
	0x8f, 0xa0, 0xfe, 0x3e, 0x9a, 0xaf, 0xc9, 0xad, 0x7a, 0x56, 0xd0, 0x62, 0x66, 0x83, 0x3d, 0x70,
	0xe8, 0x63, 0x95, 0x88, 0x8d, 0x6b, 0x7b, 0x56, 0x60, 0xb3, 0x6c, 0xe7, 0x5f, 0x40, 0x93, 0xd1,
	0x68, 0xc2, 0xe8, 0x6d, 0x4d, 0x52, 0x21, 0x42, 0x6d, 0x46, 0x1b, 0xe9, 0x5a, 0x9e, 0x1d, 0x34,
	0x98, 0x5e, 0xfb, 0xd7, 0xd0, 0x32, 0x12, 0xb9, 0xe2, 0x4b, 0x49, 0x38, 0x80, 0x03, 0xa1, 0x2f,
	0x37, 0xb2, 0xe6, 0xb0, 0x17, 0x6e, 0xdb, 0x0b, 0x8d, 0x37, 0x96, 0xcb, 0x52, 0xc2, 0x8b, 0x48,
	0x14, 0xe5, 0xb7, 0x14, 0x08, 0xd5, 0xbf, 0x11, 0x0e, 0xa1, 0x9d, 0x11, 0x8c, 0x09, 0xff, 0x12,
	0xda, 0xb7, 0x34, 0xa7, 0x1f, 0xe6, 0x2e, 0xe7, 0x5d, 0xe8, 0xe4, 0xa2, 0xac, 0xed, 0x1c, 0x9a,
	0x4f, 0x89, 0x54, 0x79, 0x53, 0x69, 0x7a, 0xa9, 0x55, 0x23, 0xf8, 0xef, 0xcf, 0x0e, 0x3f, 0xab,
	0x50, 0x7f, 0x4e, 0x2b, 0x78, 0x07, 0xb5, 0x94, 0x85, 0xc7, 0xbf, 0x5b, 0x0a, 0x16, 0xfa, 0x27,
	0xbb, 0x8b, 0x99, 0xdf, 0xca, 0xc0, 0xc2, 0x1b, 0xa8, 0xa5, 0xf3, 0x2f, 0x63, 0x0a, 0xc1, 0x95,
	0x31, 0xc5, 0xc8, 0xfc, 0x0a, 0xde, 0x43, 0x5d, 0x0f, 0x10, 0x4b, 0xc2, 0x62, 0x32, 0xfd, 0xd3,
	0x3d, 0xd5, 0x6f, 0xce, 0x23, 0x38, 0x66, 0xa4, 0x58, 0x92, 0x6e, 0xe5, 0xd1, 0x3f, 0xdb, 0x57,
	0xce, 0x51, 0x63, 0x47, 0xbf, 0xed, 0xab, 0xaf, 0x00, 0x00, 0x00, 0xff, 0xff, 0xc9, 0x8a, 0x2d,
	0xeb, 0x0f, 0x03, 0x00, 0x00,
}