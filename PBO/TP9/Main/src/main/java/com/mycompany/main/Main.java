/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ihabh
 */
public class Main {

    public static void main(String[] args) {
        BangunDatar[] bangunDatar = new BangunDatar[3];
        

        bangunDatar[0] = new Lingkaran("Bulet", 343);
        bangunDatar[1] = new PersegiPanjang("Kawasaki Sesaki", 30, 36);
        bangunDatar[2] = new Segitiga("Lancip", 25, 40);

        for (BangunDatar bd : bangunDatar) {
            System.out.println("Nama BangunDatar : " + bd.getNama());
            
            if (bd instanceof Lingkaran) {
                Lingkaran l = (Lingkaran) bd;
                System.out.println("Jari-jari        : " + l.getJariJari());
            } else if (bd instanceof PersegiPanjang) {
                PersegiPanjang pp = (PersegiPanjang) bd;
                System.out.println("Panjang          : " + pp.getPanjang());
                System.out.println("Lebar            : " + pp.getLebar());
            } else if (bd instanceof Segitiga) {
                Segitiga s = (Segitiga) bd;
                System.out.println("Alas             : " + s.getAlas());
                System.out.println("Tinggi           : " + s.getTinggi());
            }
            
            System.out.println("Luas             : " + bd.hitungLuas());
            System.out.println("Keliling         : " + bd.hitungKeliling());
            System.out.println();
        }

    }
}
