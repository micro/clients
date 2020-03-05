# Generic Micro Client in Go

By default the client connects to the live micro network:

```go
package main

import (
    "fmt"
    "github.com/micro/clients/go/client"
)

type req struct {
	Name string `json:"name"`
}

type rsp struct {
	Msg string `json:"msg"`
}

func main() {
   	response := rsp{}
	if err := NewClient(nil).Call("go.micro.srv.greeter", "Say.Hello", req{Name: "John"}, &response); err != nil {
		oanic(err)
	}
	fmt.Println(response)
}
```

If you want to access your local micro:

```go
    NewClient(client.Options{Local: true})
```

You can also set the hst address explicitly:

```go
    NewClient(client.Options{Address: "https://api.yourdomain.com/client"})
```