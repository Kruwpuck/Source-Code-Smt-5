package main

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"sort"
	"strconv"
)

func main() {
	// Baca satu baris input dari STDIN
	in := bufio.NewScanner(os.Stdin)
	if !in.Scan() {
		return
	}
	s := in.Text()

	// Ambil semua urutan digit (abaikan bracket/karakter lain)
	re := regexp.MustCompile(`\d+`)
	numStrs := re.FindAllString(s, -1)

	// Konversi ke int
	nums := make([]int, 0, len(numStrs))
	for _, t := range numStrs {
		n, err := strconv.Atoi(t)
		if err != nil {
			continue
		}
		nums = append(nums, n)
	}

	// Urutkan menaik
	sort.Ints(nums)

	// Cetak dalam format [n][n] tanpa spasi
	for _, n := range nums {
		fmt.Printf("[%d]", n)
	}
}
