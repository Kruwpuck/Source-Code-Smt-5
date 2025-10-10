/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihann;
import Lain.*;
import java.util.Scanner;
/**
 *
 * @author ihabh
 */
public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MataKuliah pbo     = new MataKuliah("CII3B4", "Pemrograman Berorientasi Objek", 4);
        MataKuliah kalkulus= new MataKuliah("CII2A3", "Kalkulus", 3);
        MataKuliah dka     = new MataKuliah("CII1F4", "Dasar Kecerdasan Artifisial", 4);
        MataKuliah kwu     = new MataKuliah("UKI2A2", "Kewirausahaan", 2);

        Mahasiswa mhs1 = new Mahasiswa("103012330004", "Tanjiro", 1);
        Mahasiswa mhs2 = new Mahasiswa("103012310024", "Spongebob", 12);
        Mahasiswa mhs3 = new Mahasiswa("103012320012", "Naruto", 5);

        // rencana studi (boleh sesuai tabelmu)
        mhs1.tambahMK(new AmbilMK(pbo, "A", "21/22"));
        mhs1.tambahMK(new AmbilMK(kalkulus, "A", "09/10"));
        mhs1.tambahMK(new AmbilMK(dka, "A", "09/10"));
        mhs1.tambahMK(new AmbilMK(kwu, "A", "21/22"));

        mhs2.tambahMK(new AmbilMK(pbo, "B", "21/22"));
        mhs2.tambahMK(new AmbilMK(kalkulus, "A", "19/20"));
        mhs2.tambahMK(new AmbilMK(dka, "BC", "19/20"));
        mhs2.tambahMK(new AmbilMK(kwu, "AB", "19/20"));

        mhs3.tambahMK(new AmbilMK(pbo, "AB", "22/23"));
        mhs3.tambahMK(new AmbilMK(kalkulus, "D", "21/22"));
        mhs3.tambahMK(new AmbilMK(dka, "B", "21/22"));
        mhs3.tambahMK(new AmbilMK(kwu, "C", "22/23"));

        Mahasiswa[] mhs = {mhs1, mhs2, mhs3};
        System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
        String tahun = input.next();
        while (!tahun.equals("q")){
            boolean ada = false;
            for (int i = 0; i < 3; i++){
                Mahasiswa m = mhs[i];
                double ipk = m.hitungIPK(tahun);
                if (ipk > 0){
                    System.out.printf("IPK %s (%s): %.2f%n", m.getNama(), m.getKelas(), ipk);
                    ada = true;
                }
            }
            if (!ada){
                System.out.println("Tidak ada histori nilai pada Tahun Ajaran ini");
            }
            System.out.println();
            System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
            tahun = input.next();
        }
        input.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class AmbilMK {
    public MataKuliah matakuliah;
    public String nilai;
    public String tahunAjaran;
    
    public AmbilMK(MataKuliah matakuliah, String nilai, String tahunAjaran){
        setMatakuliah(matakuliah);
        setNilai(nilai);
        setTahunAjaran(tahunAjaran);
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private String prodi;
    private AmbilMK[] ambilMK;

    public Mahasiswa(String nim, String nama, int noKelas){
        setNim(nim);
        setNama(nama);
        setKelas(noKelas);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim != null && !nim.isEmpty() && nim.length() >= 5){
            String awalNim = nim.substring(0, 5);
            if (awalNim.equals("10301")){
                prodi = "IF";
            } else if (awalNim.equals("10302")){
                prodi = "SE";
            } else if (awalNim.equals("10303")){
                prodi = "IT";
            } else if (awalNim.equals("10305")){
                prodi = "DS";
            }
            this.nim = nim;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(int noKelas) {
        if (noKelas > 0 && prodi != null && !prodi.isEmpty()){
            kelas = prodi + "-47-" + noKelas;
        }
    }

    public String getProdi() {
        return prodi;
    }

    public void tambahMK(AmbilMK ambilMK){
        this.ambilMK = ambilMK;
    }

    public double hitungIPK(String thnAjar) {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (AmbilMK ambil : ambilMK) {
            // hanya hitung nilai yg tahun ajarnya persis sama dengan input
            if (ambil.getThnAjar().equals(thnAjar)) {
                totalNilai += ambil.getMK().getSks() * ambil.nilaiAngka();
                totalSKS += ambil.getMK().getSks();
            }
        }

        if (totalSKS == 0) return -1.0;
        return totalNilai / totalSKS;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    
    public MataKuliah(String kode, String nama, int sks){
        setKode(kode);
        setNama(nama);
        setSks(sks);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
}
}
