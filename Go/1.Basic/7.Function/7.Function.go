package main

import "fmt"

func main() {
	say("hello")
	say("Hello", "World")
	count, total := sum(1, 7, 3, 5, 9)
	fmt.Println(count, total)
}

func say(msg ...string) {
	for n, s := range msg {
		fmt.Println(n, " ", s)
	}
}

func sum(nums ...int) (count int, s int) {
	s = 0
	count = 0
	for _, n := range nums {
		s += n
		count++
	}
	return
}
