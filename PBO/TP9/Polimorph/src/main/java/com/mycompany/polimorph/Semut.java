/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorph;

/**
 *
 * @author ihabh
 */
public class Semut extends Serangga{
    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }

    @Override
    public void info(){
        System.out.println("Posisi semut  : X = " + this.getPosisi().getX());
        System.out.println("                Y = " + this.getPosisi().getY());
    }
}
