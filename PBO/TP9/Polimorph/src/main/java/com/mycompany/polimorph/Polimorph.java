/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorph;

/**
 *
 * @author ihabh
 */
public class Polimorph {

    public static void main(String[] args) {
        Koordinat ks1 = new Koordinat(70,90);
        Koordinat ks2 = new Koordinat(80,100);
        Koordinat3D kl1 = new Koordinat3D(30,40,50);
        Koordinat3D kl2 = new Koordinat3D(45,55,65);
        Semut s = new Semut("merah", ks1);
        Lebah l = new Lebah("Oranye",kl1);
        System.out.println("Warna  semut  : " + s.getWarna());
        s.info();
        s.gerak(ks2);
        s.info();
        System.out.println("");
        System.out.println("Warna  lebah  : " + l.getWarna());
        l.info();
        l.gerak(kl2);
        l.info();
    }
}
