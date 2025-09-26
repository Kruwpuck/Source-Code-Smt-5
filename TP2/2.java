/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no2;
import java.util.Scanner;
/**
 *
 * @author Zahwa Salsabila J. A
 */
public class No2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai A: ");
        int A = sc.nextInt();
        System.out.print("Nilai B: ");
        int B = sc.nextInt();
        System.out.print("Nilai C: ");
        int C = sc.nextInt();
        System.out.print("Nilai D: ");
        int D = sc.nextInt();
        
        int[][] arr = new int[4][];
        arr[0] = new int[A];  // baris 1
        arr[1] = new int[B];  // baris 2
        arr[2] = new int[C];  // baris 3
        arr[3] = new int[D];  // baris 4
        
        // Baris 1: kelipatan 5
        int val = 5;
        for (int i = 0; i < A; i++) {
            arr[0][i] = val;
            val += 5;
        }
        
        // Baris 2: bilangan ganjil mulai dari 3
        val = 3;
        for (int i = 0; i < B; i++) {
            arr[1][i] = val;
            val += 2;
        }
        
        // Baris 3: bilangan kuadrat mulai dari 2²
        val = 2;
        for (int i = 0; i < C; i++) {
            arr[2][i] = val * val;
            val++;
        }
        
        // Baris 4: bilangan asli mulai dari 4
        val = 4;
        for (int i = 0; i < D; i++) {
            arr[3][i] = val;
            val++;
        }
        
        System.out.println("\nIsi Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int cari = 1;
        while (cari != 0){
            System.out.print("Bilangan yang dicari (masukkan 0 untuk exit): ");
            cari = sc.nextInt();
            if (cari != 0){
                boolean ditemukan = false;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] == cari) {
                            if (!ditemukan) {
                                System.out.println(cari + " berada di:");
                            }
                            System.out.println("- baris " + (i + 1) + " kolom " + (j + 1));
                            ditemukan = true;
                        }
                    }
                }

                if (!ditemukan) {
                    System.out.println(cari + " tidak ada dalam array");
                }
            }
        }
    }
}