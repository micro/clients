#!/bin/sh -e

### UBUNTU BIONIC ###
sudo apt update
sudo apt install -y protobuf-compiler
sudo apt install -y --no-install-recommends python python-pip python-setuptools python-dev python-grpcio python-protobuf python-grpc-tools
sudo apt install -y --no-install-recommends nodejs npm
sudo apt install -y --no-install-recommends ruby
sudo gem install grpc grpc-tools
#pip3 install --no-cache-dir --ignore-installed grpcio grpcio-tools
#pip3 install --no-cache-dir grpcio-tools
npm i grpc-tools
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
sudo cargo install protobuf-codegen cargo install grpc-compiler
go mod init clients
GOBIN=$(go env GOPATH)/bin go get github.com/unistack-org/protoc-gen-all github.com/golang/protobuf/protoc-gen-go@v1.3.4 github.com/micro/protoc-gen-micro/v2 github.com/micro/go-micro/v2@master
