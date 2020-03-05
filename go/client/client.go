package client

import (
	"bytes"
	"encoding/base64"
	"encoding/json"
	"io/ioutil"
	"net/http"
)

const (
	defaultLocal = "http://localhost:8080/client"
	defaultLive  = "https://api.micro.mu/client"
)

// Options of the Client
type Options struct {
	token string
	// Address of the micro platform.
	// By default it connects to live. Change it or use the local flag
	// to connect to your local installation.
	address string
	// Helper flag to help users connect to the default local address
	local bool
}

// Request is the request of the generic `api-client` call
type Request struct {
	// eg. "go.micro.srv.greeter"
	Service string `json:"service"`
	// eg. "Say.Hello"
	Endpoint string `json:"endpoint"`
	// json and then base64 encoded body
	Body string `json:"body"`
}

// Response is the response of the generic `api-client` call.
type Response struct {
	// json and base64 encoded response body
	Body string `json:"body"`
	// error fields. Error json example
	// {"id":"go.micro.client","code":500,"detail":"malformed method name: \"\"","status":"Internal Server Error"}
	Code   int    `json:"code"`
	ID     string `json:"id"`
	Detail string `json:"detail"`
	Status string `json:"status"`
}

// Client enables generic calls to micro
type Client struct {
	options Options
}

// NewClient returns a generic micro client that connects to live by default
func NewClient(options *Options) Client {
	ret := Client{}
	if options != nil {
		ret.options = *options
	} else {
		ret.options = Options{
			address: defaultLive,
		}
	}
	if options != nil && options.local {
		ret.options.address = defaultLocal
	}
	return ret
}

// Call enables you to access any endpoint of any service on Micro
func (client Client) Call(service, endpoint string, request, response interface{}) error {
	// example curl: curl -XPOST -d '{"service": "go.micro.srv.greeter", "endpoint": "Say.Hello"}'
	//  -H 'Content-Type: application/json' http://localhost:8080/client {"body":"eyJtc2ciOiJIZWxsbyAifQ=="}
	requestJSON, err := json.Marshal(request)
	if err != nil {
		return err
	}
	fullRequest := Request{
		Service:  service,
		Endpoint: endpoint,
		Body:     base64.StdEncoding.EncodeToString(requestJSON),
	}
	fullRequestJSON, err := json.Marshal(fullRequest)
	if err != nil {
		return err
	}

	req, err := http.NewRequest("POST", client.options.address, bytes.NewBuffer(fullRequestJSON))
	if err != nil {
		return err
	}
	req.Header.Set("micro_token", client.options.token)
	req.Header.Set("Content-Type", "application/json")

	httpClient := &http.Client{}
	resp, err := httpClient.Do(req)
	if err != nil {
		panic(err)
	}
	defer resp.Body.Close()

	body, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		return err
	}
	rsp := Response{}
	err = json.Unmarshal(body, &rsp)
	if err != nil {
		return err
	}
	rspJSON, err := base64.StdEncoding.DecodeString(rsp.Body)
	if err != nil {
		return err
	}
	return json.Unmarshal(rspJSON, &response)
}
