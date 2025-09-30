package com.example.oop.model;
/*
 * Class Mahasiswa dengan prinsip enkapsulasi
 * - Menggunakan access modifier private untuk menyembunyikan data
 * - Menggunakan constructor untuk inisialisasi data
 * - Menggunakan getter & setter sebagai kontrol akses data
 */ 



public class Mahasiswa {
    // Access Modifier (properti ini hanya bisa diakses di dalam class ini)
    private String nama;
    private String nim;
    private double ipk;

    // Constructor (untuk inisiaslisasi object Mahasiswa)
    public Mahasiswa (String nama,String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter & Setter (akses terkontrol)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        // Bisa ditambah validasi, misalknya nama tidak boleh kosong
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk (double ipk) {
        // Validasi IPK hanya boleh 0.0 - 4.0
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK harus antara 0.0 - 4.0");
        }
    }
    // Method tambahan (demonstrasi modularitas)
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}