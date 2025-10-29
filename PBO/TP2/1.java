package com.mycompany.no1;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Konversi Bilangan");
        System.out.print("Basis: ");
        int basis = scanner.nextInt();

        // validasi basis
        if (basis != 2 && basis != 16) {
            System.out.println("Input basis salah! Hanya boleh 2 atau 16.");
            return;
        }

        System.out.print("Bilangan: ");
        String bilangan = scanner.next();

        int hasil = 0;
        int panjang = bilangan.length();

        // proses konversi manual
        for (int i = 0; i < panjang; i++) {
            char c = bilangan.charAt(panjang - 1 - i); // ambil dari belakang
            int nilai;

            if (basis == 2) {
                // pastikan hanya 0 atau 1
                if (c != '0' && c != '1') {
                    System.out.println("Bilangan bukan biner valid!");
                    return;
                }
                nilai = c - '0'; // konversi char ke int
            } else {
                // basis 16 (heksadesimal)
                if (c >= '0' && c <= '9') {
                    nilai = c - '0';
                } else if (c >= 'A' && c <= 'F') {
                    nilai = 10 + (c - 'A');
                } else if (c >= 'a' && c <= 'f') {
                    nilai = 10 + (c - 'a');
                } else {
                    System.out.println("Bilangan bukan heksadesimal valid!");
                    return;
                }
            }

            hasil += nilai * Math.pow(basis, i);
        }

        System.out.println("Hasil konversi: " + hasil);
    }
}