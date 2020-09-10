#!/bin/bash

set -x

rm -rf sdk
GO_BIN=$(go env GOPATH)/bin
GO_PATH=$(go env GOPATH)
PROTO_DIR=$GO_PATH/src/github.com/micro/micro/proto/
PATH=$PATH:$GO_BIN:$(npm bin):/usr/local/bin/ protoc-gen-client -srcdir $PROTO_DIR -dstdir sdk/ -langs go,python,java,ruby,js,rust
rm -rf go.mod go.sum node_modules/ package-lock.json
