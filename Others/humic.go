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
	in := bufio.NewScanner(os.Stdin)
	re := regexp.MustCompile(`\d+`)

	for {
		fmt.Print("Masukkan input (0 untuk keluar): ")
		if !in.Scan() {
			break
		}
		s := in.Text()

		// Jika pengguna hanya memasukkan "0", keluar dari loop
		if s == "0" {
			fmt.Println("Program selesai.")
			break
		}

		// Ambil semua urutan digit dari input
		numStrs := re.FindAllString(s, -1)
		if len(numStrs) == 0 {
			fmt.Println("Tidak ada angka ditemukan.")
			continue
		}

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

		// Cetak dalam format [n][n]
		for _, n := range nums {
			fmt.Printf("[%d]", n)
		}
		fmt.Println()
	}
}
