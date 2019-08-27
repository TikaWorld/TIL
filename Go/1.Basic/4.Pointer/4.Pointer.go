package main

import "fmt"

func main() {
	x := 1
	p := &x
	fmt.Println(*p)
	incr(p)
	fmt.Println(*p)
	newTest()
}

func incr(p *int) int {
	*p++
	return *p
}

func newTest() {
	p := new(int)
	q := new(int)
	fmt.Println(*p)
	*p = 2
	fmt.Println(*p)
	fmt.Println(p == q)
}
