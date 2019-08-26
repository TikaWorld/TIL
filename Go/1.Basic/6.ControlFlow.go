package main

import "fmt"

func main() {
	var i int
	if i := 0; i == 1 {
		fmt.Println("1")
	} else if i == 2 {
		fmt.Println("2")
	} else {
		fmt.Println("Other")
	}

	switch i {
	case 1:
		fmt.Println("1")
	case 2, 3:
		fmt.Println("2 or 3")
	default:
		fmt.Println("Other")
	}

	switch {
	case i == 1:
		fmt.Println("1")
	case i == 2:
		fmt.Println("2")
	default:
		fmt.Println("Other")
	}

}

func For() {
	sum := 0
	for i := 1; i <= 100; i++ {
		sum += i
	}
	fmt.Println(sum)
}
