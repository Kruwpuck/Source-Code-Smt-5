/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ihabh
 */
public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(String nama,int panjang, int lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
}
