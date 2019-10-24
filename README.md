# Clients

This is the home of multi-language clients for [Micro](https://github.com/micro/micro)

## Overview

Micro clients are protobuf based code generated clients for use with the micro runtime. This is to unlock 
the ability to develop micro services in any language without the need for a full framework. Clients 
are ideally offloading everything to micro itself. 

## Languages

We will support any clients that can be code generated via gRPC

## Getting Started

The proxy address localhost:8081 should be used as the fixed entry point for all requests.

Download and run micro

```
go get github.com/micro/micro
```

```
micro
```

More on usage soon...

## Developement

Our [development](https://github.com/micro/development/blob/master/clients.md) repo tracks any development of micro related code. 
We also have a #development channel on slack for any realtime discussion.

