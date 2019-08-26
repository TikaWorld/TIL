package main

func main() {
	channel()
	withGoRoutine()
	parameter()
}

func channel() {
	ch := make(chan int)

	go func() {
		ch <- 123
	}()

	var i int
	i = <-ch
	println(i)
}

func withGoRoutine() {
	done := make(chan bool)
	go func() {
		for i := 0; i < 10; i++ {
			println(i)
		}
		done <- true
	}()

	result := <-done
	println(result)
}

func parameter() {
	ch := make(chan string, 1)
	sendChan(ch)
	receiveChan(ch)
}

func sendChan(ch chan<- string) {
	ch <- "Data"
	// x := <-ch // Error
}

func receiveChan(ch <-chan string) {
	data := <-ch
	println(data)
}
