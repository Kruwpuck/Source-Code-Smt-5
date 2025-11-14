/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.sound.sampled.Line;

/**
 *
 * @author ihabh
 */
public class Lingkaran extends BangunDatar {
    private int jariJari;
    public Lingkaran(String nama, int jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }
    public int getJariJari() {
        return jariJari;
    }
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}