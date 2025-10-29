package main

import "fmt"

func main() {
	var n, m, i int
	fmt.Scan(&n)
	m = -1
	for i = 0; i < n; i++ {
		m *= -1
		fmt.Print(2*(i+1)*m, " ")
	}
}
