
package com.example.oop;

import com.example.oop.model.Mahasiswa; // Import modular class dari package model
/*
 * MainApp ini untuk menjalankan contoh OOP Enkapsulasi
 * - Memanfaatkan class Mahasiswa yang sudah dipisah dalam package model
 */

public class MainApp {
    public static void main(String[] args) {
        // Membuat object mahasiswa menggunakan constructor
        Mahasiswa mhs1 = new Mahasiswa("Opik", "123456", 4.0);

        // menanampilkan informasi awal
        System.out.println("Data Mahasiswa 1");
        mhs1.tampilkanInfo();

        // Mengubah data menggunakan setter (akses terkontrol)
        mhs1.setNama("Pulan");
        mhs1.setIpk(10.0); // Tidak valid
        mhs1.setIpk(3.5); // Valid

        // Menampilkan informasi setelah di update
        System.out.println("Data mahasiswa setelah update");
        mhs1.tampilkanInfo();

        // Membuat object lain untuk menunjukan modularitas
        Mahasiswa mhs2 = new Mahasiswa("Farhan", "9876544", 4);
        System.out.println("\n Data Mahasiswa 2");
        mhs2.tampilkanInfo();
    }
}

/*
 * Access Modifier : variabel nama, nim, ipk dibuat private agar tidak bisa diakses langsung dari luar. Akses harus melalui getter/setter
 * Constructor: Mahassiwa (String nama,String nim, double ipk) digunakan untuk menginisialisasi data ketika objek dibuat
 * Modularity: Class dipisahkan dalam package model > mudah digunakan kembali di aplikasi lian
 * Package: src.com.example.model untuk class Mahasiswa dan src.com.example.oop untuk MainApp
 */