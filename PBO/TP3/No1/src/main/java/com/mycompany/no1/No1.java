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
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        pr1.setNama(" Informatika");
        pr2.setNama(" Data Science");
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.setNama("Bruce Wayne");
        mhs1.setProdi(pr1);
        mhs2.setNama("Tony Stark");
        mhs2.setProdi(pr2);
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
