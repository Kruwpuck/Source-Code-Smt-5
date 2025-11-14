/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ihabh
 */
public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    public Segitiga(String nama, int alas, int tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
    
}
