package main

import "fmt"

func main() {
	var N, i, M1, M2, M3 int
	var totalM1, totalM2, totalM3, total int
	total = 0
	totalM1 = 0
	totalM2 = 0
	totalM3 = 0

	fmt.Scan(&N)
	for i = 1; i <= N; i++ {
		fmt.Scan(&M1, &M2, &M3)
		total = total + M1 + M2 + M3
		totalM1 = totalM1 + M1
		totalM2 = totalM2 + M2
		totalM3 = totalM3 + M3
	}

	fmt.Printf("%d %.2f %.2f %.2f\n", total, float64(totalM1)/float64(N), float64(totalM2)/float64(N), float64(totalM3)/float64(N))
}
