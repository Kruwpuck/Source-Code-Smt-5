package main

import "fmt"

func main() {
	var k, i, n int
	fmt.Scan(&n)
	k = n
	for i = 1; i <= n; i++ {
		fmt.Printf("Request %d diproses dengan prioritas %d\n", i, k)
		k = k - 1
	}
}
