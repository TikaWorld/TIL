package main

import "fmt"

type person struct {
	name string
	age  int
}
type dict struct {
	data map[int]string
}

func newDict() *dict {
	d := dict{}
	d.data = map[int]string{}
	return &d
}

func main() {
	p := person{}
	p.name = "Lee"
	p.age = 10
	var p1 person
	p1 = person{"Bob", 20}
	p2 := person{name: "Sean", age: 50}
	p3 := new(person)
	p3.age = 11
	p3.name = "Su"
	dic := newDict()
	dic.data[1] = "A"

	fmt.Println(p, p1, p2, p3, dic)
}
