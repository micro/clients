#!/bin/sh -e

set -x 

GO_PATH=$(go env GOPATH)
GO=$GO_PATH/bin/go

### UBUNTU BIONIC ###
echo "deb https://packages.le-vert.net/tensorflow/ubuntu bionic main" | sudo tee -a /etc/apt/sources.list
wget -O - https://packages.le-vert.net/packages.le-vert.net.gpg.key | sudo apt-key add -

sudo apt update
sudo apt install -y protobuf-compiler
sudo apt install -y --no-install-recommends python3 python3-pip python3-setuptools python3-dev python3-grpcio python3-protobuf
sudo apt install -y --no-install-recommends nodejs npm
sudo apt install -y --no-install-recommends ruby ruby-dev
sudo apt install -y --no-install-recommends git-all
sudo gem update --system
sudo gem install grpc grpc-tools
pip3 install --no-cache-dir grpcio-tools
npm i grpc-tools
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
cargo install protobuf-codegen grpc-compiler
go mod init clients
pushd cmd/protoc-gen-client && go get ./... && popd
go get github.com/golang/protobuf/protoc-gen-go@v1.4.2
mkdir -p $GO_PATH/src/github.com/micro
git clone https://github.com/micro/micro $GO_PATH/src/github.com/micro/micro 
pushd $GO_PATH/src/github.com/micro/micro/cmd/protoc-gen-micro && go get ./... && popd
