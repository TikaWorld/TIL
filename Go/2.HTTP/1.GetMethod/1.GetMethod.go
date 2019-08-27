package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
)

func main() {
	url := "http://www.google.com"
	simpleGet(&url)
	modifiedGet(&url)
}

func simpleGet(url *string) {
	// GET 호출
	resp, err := http.Get(*url)
	if err != nil {
		panic(err)
	}

	defer resp.Body.Close()

	// 결과 출력
	data, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		panic(err)
	}
	fmt.Printf("%s\n", string(data))
}

func modifiedGet(url *string) {
	// Request 객체 생성
	req, err := http.NewRequest("GET", *url, nil)
	if err != nil {
		panic(err)
	}

	//필요시 헤더 추가 가능
	req.Header.Add("User-Agent", "Crawler")

	// Client객체에서 Request 실행
	client := &http.Client{}
	resp, err := client.Do(req)
	if err != nil {
		panic(err)
	}
	defer resp.Body.Close()

	// 결과 출력
	bytes, _ := ioutil.ReadAll(resp.Body)
	str := string(bytes) //바이트를 문자열로
	fmt.Println(str)
}
