package client

import "testing"

func TestBasicCall(t *testing.T) {
	response := map[string]string{}
	if err := NewClient(nil).Call("go.micro.srv.greeter", "Say.Hello", map[string]string{"name": "John"}, &response); err != nil {
		t.Fail()
	}
	msg, ok := response["msg"]
	if !ok {
		t.Logf("Field message can't be found in response %v", response)
		t.Fail()
	}
	if msg != "Hello John" {
		t.Logf("Message is not as expected: %v", msg)
		t.Fail()
	}
}
