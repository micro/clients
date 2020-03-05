package client

import "testing"

type req struct {
	Name string `json:"name"`
}

type rsp struct {
	Msg string `json:"msg"`
}

func TestBasicCall(t *testing.T) {
	response := rsp{}
	if err := NewClient(nil).Call("go.micro.srv.greeter", "Say.Hello", req{Name: "John"}, &response); err != nil {
		t.Fail()
	}
	if response.Msg != "Hello John" {
		t.Logf("Message is not as expected: %v", response.Msg)
		t.Fail()
	}
}
