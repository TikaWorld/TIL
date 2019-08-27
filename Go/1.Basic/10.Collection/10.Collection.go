package main

import "fmt"

func main() {
	//array()
	//slice()
	_map()
}

func array() {
	var a1 = [3]int{1, 2, 3}
	var a2 = [...]int{1, 2, 3, 4}
	var multiarray1 = [2][3]int{
		{1, 2, 3},
		{4, 5, 6},
	}
	println(a1[1], a2[1], multiarray1[1][1])
}

func slice() {
	var a []int
	a = []int{1, 2, 3}
	a[1] = 10
	fmt.Println(a)

	s := make([]int, 5, 10)
	println(len(s), cap(s))

	var nullSlice []int
	if nullSlice == nil {
		println("Nil Slice")
	}

	a = a[0:1]
	fmt.Println(a)
	a = append(a, 1, 2, 3)
	fmt.Println(a)

	source := []int{0, 1, 2}
	target := make([]int, len(source), cap(source)*2)
	copy(target, source)
	fmt.Println(target)
	println(len(target), cap(target))
}

func _map() {
	var m2 map[int]string
	m := make(map[int]string)
	tickers := map[string]string{
		"GOOG": "Google Inc",
		"MSFT": "Microsoft",
		"FB":   "FaceBook",
	}
	println(m2)

	m[901] = "Apple"
	m[134] = "Grape"
	m[777] = "Tomato"
	str := m[134]
	println(str)
	noData := m[999]
	println(noData)
	delete(m, 777)

	val, exists := tickers["MSFT"]
	if !exists {
		println(val, "No MSFT ticker")
	}

	for key, val := range tickers {
		fmt.Println(key, val)
	}
}
