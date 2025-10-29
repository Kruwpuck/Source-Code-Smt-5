package main

import "fmt"

func main() {
	var n, prev, curr int
	var status = true

	fmt.Scan(&n)
	fmt.Scan(&prev)

	for i := 1; i < n; i++ {
		fmt.Scan(&curr)
		status = status && (curr >= prev)
		prev = curr
	}
	fmt.Println(status)
}
