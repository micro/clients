# Clients

This is the home of multi-language clients for [Micro](https://github.com/micro/micro)

## Overview

Micro clients are multi-language clients for accessing Micro services. They provide a way for applications in any language to access Micro services. We take the approach of code generating clients based on gRPC protos and separately will write idiomatic libraries for each language.

## Clients

- Go
- Java
- JS
- Python
- Ruby
- Rust

## Getting Started

The proto directory contains a sub-directory per micro service with the proto definition.

The sdk directory contains gRPC generated clients for each language.

Point your client at the micro proxy at `localhost:8081`.

## Contributing

Modify the scripts and GitHub actions to include more languages.
