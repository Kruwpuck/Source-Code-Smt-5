/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jur10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Date tanggalLahir;
    private double ipk;

    // === SETTER ===
    public void setNim(String nim) throws Exception {
    if (nim == null || nim.isEmpty()) {
        throw new Exception("NIM tidak boleh kosong");
    }
    // cek dulu apakah semua karakter angka
    if (!nim.matches("\\d+")) {
        throw new Exception("NIM harus semua angka");
    }
    // lalu cek panjang
    if (nim.length() != 12) {
        throw new Exception("NIM harus 12 digit");
    }
    this.nim = nim;
}


    public void setNama(String nama) throws Exception {
        if (nama == null || nama.isEmpty()) {
            throw new Exception("Nama tidak boleh kosong");
        }
        if (nama.length() < 8) {
            throw new Exception("Nama minimal 8 karakter");
        }
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggal) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // supaya validasi tanggal ketat
        try {
            Date d = sdf.parse(tanggal);
            this.tanggalLahir = d;
        } catch (ParseException e) {
            throw new Exception("Format tanggal harus yyyy-MM-dd");
        }
    }

    public void setIPK(double ipk) throws Exception {
        if (ipk < 0.00 || ipk > 4.00) {
            throw new Exception("IPK harus antara 0.00 - 4.00");
        }
        this.ipk = ipk;
    }

    // === GETTER ===
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public double getIPK() {
        return ipk;
    }
}

