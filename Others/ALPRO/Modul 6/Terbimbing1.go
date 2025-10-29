package main

import "fmt"

func main() {
	var x, h, i, total int
	fmt.Scan(&h)

	x = 3
	total = 0
	for i = 1; i <= h; i++ {
		total = total + x
		x = x * 2
	}

	fmt.Printf("%d rak buku akan diproduksi dalam %d hari\n", total, h)
}
