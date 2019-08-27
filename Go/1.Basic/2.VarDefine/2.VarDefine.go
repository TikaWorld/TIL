package main

import "fmt"

func main() {
	var i int // int, int, int
	var Bool bool
	var String string
	var b, f, s = true, 2.3, "four" // bool, float64, string
	const (
		Int   = 1
		Flaot = 0.1
	)

	fmt.Println(i, Bool, String)
	fmt.Println(b, f, s)
	fmt.Println(Int, Flaot)
	fmt.Println()
}
