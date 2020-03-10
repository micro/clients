# Go Micro Client

By default the client connects to api.micro.mu/client

```go
package main

import (
    "fmt"

    "github.com/micro/clients/go/client"
)

type Request struct {
	Name string `json:"name"`
}

type Response struct {
	Msg string `json:"msg"`
}

func main() {
	c := client.NewClient(nil)

   	req := &Request{
		Name: "John",
	}
	var rsp Response

	if err := c.Call("go.micro.srv.greeter", "Say.Hello", req, &rsp); err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(rsp)
}
```

If you want to access your local micro:

```go
    c := client.NewClient(client.Options{Local: true})
```

You can also set the api address explicitly:

```go
    c : =client.NewClient(client.Options{Address: "https://api.yourdomain.com/client"})
```

## Streaming

The client supports streaming

```
package main

import (
	"fmt"

	"github.com/micro/clients/go/client"
)

type Request struct {
	Count string `json:"count"`
}

type Response struct {
	Count string `json:"count"`
}

func main() {
	c := client.NewClient(&client.Options{Local: true})

	stream, err := c.Stream("go.micro.srv.stream", "Streamer.ServerStream", Request{Count: "10"})
	if err != nil {
		fmt.Println(err)
		return
	}

	for {
		var rsp Response
		if err := stream.Recv(&rsp); err != nil {
			fmt.Println(err)
			return
		}
		fmt.Println("got", rsp.Count)
	}
}
```
