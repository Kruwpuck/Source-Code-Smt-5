package main

import "fmt"

func main() {
	var n, i int
	var S float64
	fmt.Scan(&n)
	S = 0
	for i = 1; i <= n; i++ {
		S = S + 1/(float64(i)*(float64(i)+1)/2)
	}
	fmt.Printf("%.14f", S)
}
