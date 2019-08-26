package main

import (
	"errors"
	"fmt"

	"github.com/reactivex/rxgo/iterable"
	"github.com/reactivex/rxgo/observable"
	"github.com/reactivex/rxgo/observer"
)

func main() {
	watcher := observer.Observer{

		NextHandler: func(item interface{}) {
			fmt.Printf("%v", item)
		},

		ErrHandler: func(err error) {
			fmt.Printf("\n%v\n", err)
		},

		DoneHandler: func() {
			fmt.Println("Done!")
		},
	}

	it, _ := iterable.New([]interface{}{"H", "e", "l", "l", "o", errors.New("ReactiveX")})
	source := observable.From(it)
	sub := source.Subscribe(watcher)

	<-sub
}
