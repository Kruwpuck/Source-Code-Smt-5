/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;
import Lain.*;
/**
 *
 * @author ihabh
 */
public class No1 {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter();
        Dokter dt2 = new Dokter();
        Dokter dt3 = new Dokter();
        dt1.Dokter("Grisha", "Mata");
        dt2.Dokter("Daye", "Gigi");
        dt3.Dokter("Zeke", "Telinga");

        Pasien ps1 = new Pasien();
        Pasien ps2 = new Pasien();
        Pasien ps3 = new Pasien();

        ps1.Pasien("Historia", 20);
        ps2.Pasien("Sasha", 37);
        ps3.Pasien("Petra", 55); 
        Pemesanan [] pm = new Pemesanan[5];
        pm[0] = new Pemesanan(ps1, dt1, "Selasa");
        pm[1] = new Pemesanan(ps1, dt2, "Kamis");
        pm[2] = new Pemesanan(ps2, dt2, "Selasa");
        pm[3] = new Pemesanan(ps2, dt3, "Jumat");
        pm[4] = new Pemesanan(ps3, dt1, "Senin");

        for (int i = 0; i < pm.length; i++) {
            System.out.println("Urutan ke-" + (i+1));
            System.out.println("Nama Dokter : " + pm[i].getDokter().getNama());
            System.out.println("Spesialis   : " + pm[i].getDokter().getSpesialis());
            System.out.println("Nama Pasien : " + pm[i].getPasien().getNama() + " (" + pm[i].getPasien().getUmur() + ")");
            System.out.println("Hari        : " + pm[i].getHari());
            System.out.println();
        }
    }
}
