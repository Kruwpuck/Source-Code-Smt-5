package main

import "fmt"

func main() {
	var n, m, o, i int
	var naik bool = true
	fmt.Scan(&n)
	fmt.Scan(&m)
	for i = 1; i < n; i++ {
		fmt.Scan(&o)
		naik = naik && (m <= o)
		m = o
	}
	fmt.Println(naik)
}
