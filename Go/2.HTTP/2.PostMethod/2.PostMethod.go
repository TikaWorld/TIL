package main

import (
	"bytes"
	"encoding/json"
	"io/ioutil"
	"net/http"
)

func main() {
	simplePost()
	modifiedPost()
}

type Person struct {
	Name string
	Age  int
}

func simplePost() {
	// 간단한 http.Post 예제
	reqBody := bytes.NewBufferString("Post plain text")
	resp, err := http.Post("http://httpbin.org/post", "text/plain", reqBody)
	if err != nil {
		panic(err)
	}

	defer resp.Body.Close()

	// Response 체크.
	respBody, err := ioutil.ReadAll(resp.Body)
	if err == nil {
		str := string(respBody)
		println(str)
	}
}

func modifiedPost() {
	person := Person{"Alex", 10}
	pbytes, _ := json.Marshal(person)
	buff := bytes.NewBuffer(pbytes)

	// Request 객체 생성
	req, err := http.NewRequest("POST", "http://httpbin.org/post", buff)
	if err != nil {
		panic(err)
	}

	//Content-Type 헤더 추가
	req.Header.Add("Content-Type", "application/json")

	// Client객체에서 Request 실행
	client := &http.Client{}
	resp, err := client.Do(req)
	if err != nil {
		panic(err)
	}
	defer resp.Body.Close()

	// Response 체크.
	respBody, err := ioutil.ReadAll(resp.Body)
	if err == nil {
		str := string(respBody)
		println(str)
	}
}
