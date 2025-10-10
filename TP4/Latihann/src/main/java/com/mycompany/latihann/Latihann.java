/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihann;
import Lain.*;
import java.util.Scanner;
/**
 *
 * @author ihabh
 */
public class Latihann {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MataKuliah pbo     = new MataKuliah("CII3B4", "Pemrograman Berorientasi Objek", 4);
        MataKuliah kalkulus= new MataKuliah("CII2A3", "Kalkulus", 3);
        MataKuliah dka     = new MataKuliah("CII1F4", "Dasar Kecerdasan Artifisial", 4);
        MataKuliah kwu     = new MataKuliah("UKI2A2", "Kewirausahaan", 2);

        Mahasiswa mhs1 = new Mahasiswa("103012330004", "Tanjiro", 1);
        Mahasiswa mhs2 = new Mahasiswa("103012310024", "Spongebob", 12);
        Mahasiswa mhs3 = new Mahasiswa("103012320012", "Naruto", 5);

        // rencana studi (boleh sesuai tabelmu)
        mhs1.tambahMK(new AmbilMK(pbo, "A", "21/22"));
        mhs1.tambahMK(new AmbilMK(kalkulus, "A", "09/10"));
        mhs1.tambahMK(new AmbilMK(dka, "A", "09/10"));
        mhs1.tambahMK(new AmbilMK(kwu, "A", "21/22"));

        mhs2.tambahMK(new AmbilMK(pbo, "B", "21/22"));
        mhs2.tambahMK(new AmbilMK(kalkulus, "A", "19/20"));
        mhs2.tambahMK(new AmbilMK(dka, "BC", "19/20"));
        mhs2.tambahMK(new AmbilMK(kwu, "AB", "19/20"));

        mhs3.tambahMK(new AmbilMK(pbo, "AB", "22/23"));
        mhs3.tambahMK(new AmbilMK(kalkulus, "D", "21/22"));
        mhs3.tambahMK(new AmbilMK(dka, "B", "21/22"));
        mhs3.tambahMK(new AmbilMK(kwu, "C", "22/23"));

        Mahasiswa[] mhs = {mhs1, mhs2, mhs3};
        System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
        String tahun = input.next();
        while (!tahun.equals("q")){
            boolean ada = false;
            for (int i = 0; i < 3; i++){
                Mahasiswa m = mhs[i];
                double ipk = m.hitungIPK(tahun);
                if (ipk > 0){
                    System.out.printf("IPK %s (%s): %.2f%n", m.getNama(), m.getKelas(), ipk);
                    ada = true;
                }
            }
            if (!ada){
                System.out.println("Tidak ada histori nilai pada Tahun Ajaran ini");
            }
            System.out.println();
            System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
            tahun = input.next();
        }
        input.close();
    }
}
