/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorph;

/**
 *
 * @author ihabh
 */
public class Lebah extends Serangga{
    
    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
    }
    public void gerak(Koordinat3D k){
        // Memanggil gerak() dari Serangga (parent class)
        super.gerak(k);
    }

    @Override
    public void info(){
        Koordinat3D pos3D = (Koordinat3D) this.getPosisi();
        System.out.println("Posisi lebah  : X = " + pos3D.getX());
        System.out.println("                Y = " + pos3D.getY());
        System.out.println("                Z = " + pos3D.getZ());
    }
    
}
