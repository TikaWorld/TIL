package main

func main() {
	causePanic()
	println("Done")
}

func causePanic() {
	defer func() {
		if r := recover(); r != nil {
			println("Error Check", r)
		}
	}()
	err := "Panic"

	defer println("defer2")
	panic(err)
}
