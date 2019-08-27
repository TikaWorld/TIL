package main

import "fmt"

func main() {
	var ai = 1
	var bi = 10
	var ci = (ai + bi) / 5
	fmt.Println(ai, bi, ci)
	var af = 1.0
	var bf = 10.0
	var cf = (af + bf) / 5
	fmt.Println(af, bf, cf)
	var ab = true
	var bb = false
	fmt.Println(ab == bb, ab != bb)
	fmt.Println(ab && bb, ab || bb)
	fmt.Println(ai << 5)
}
