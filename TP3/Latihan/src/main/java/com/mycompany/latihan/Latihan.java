/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan;
import Lain.*;
/**
 *
 * @author ihabh
 */
public class Latihan {

    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        Prodi pr3 = new Prodi();
        
        pr1.setKode("IF");
        pr1.setNama("Informatika");
        pr2.setKode("IT");
        pr2.setNama("Teknologi Informasi");
        pr3.setKode("DS");
        pr3.setNama("Sains Data");

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();

        mhs1.setProdi(pr1);
        mhs1.setNim("103012325879");
        mhs1.setNama("John Smith");
        mhs1.setIPK(3.1);
        mhs2.setProdi(pr2);
        mhs2.setNim("103032523132");
        mhs2.setNama("Tommy Stark");
        mhs2.setIPK(4.0);
        mhs3.setProdi(pr3);
        mhs3.setNim("103059821543");
        mhs3.setNama("Tin Man");
        mhs3.setIPK(2.9);
        mhs4.setProdi(pr1);
        mhs4.setNim("103019812344");
        mhs4.setNama("Ben 7");
        mhs4.setIPK(1.8);

        Mahasiswa[] daftarMahasiswa = { mhs1, mhs2, mhs3, mhs4 };

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("NIM       : " + m.getNim());
            System.out.println("Nama      : " + m.getNama());
            System.out.println("Prodi     : " + m.getProdi());
            System.out.println("IPK       : " + m.getIPK());
            System.out.println("Angkatan  : " + m.getAngkatan());
            System.out.println("-----------------------------------");
        }
    }
}
