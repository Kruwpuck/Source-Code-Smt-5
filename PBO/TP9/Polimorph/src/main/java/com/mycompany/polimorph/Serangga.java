/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorph;

/**
 *
 * @author ihabh
 */
public abstract class Serangga {
    private String warna;
    private Koordinat posisi;
    public Serangga(String warna, Koordinat k){
        this.posisi = k;
        this.warna = warna;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the posisi
     */
    public Koordinat getPosisi() {
        return posisi;
    }
    public void gerak(Koordinat k){
        this.posisi = k;
    }
    public abstract void info();
}
