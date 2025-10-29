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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private Prodi prodi;
    private double IPK;
    public void setNim(String nim){
        String awalNIM = nim.substring(0,5);
        String kodePr = prodi.getKode();
        if (nim == null){
            System.out.println("NIM tidak boleh null");
            return;
        }else if ("IF".equals(kodePr) && !awalNIM.equals("10301")){
            System.out.println("NIM tidak sesuai dengan Prodi");
            return;
        }else if ("SE".equals(kodePr) && !"10302".equals(awalNIM)){
            System.out.println("NIM tidak sesuai dengan Prodi");
            return;
        }else if ("IT".equals(kodePr) && !"10303".equals(awalNIM)){
            System.out.println("NIM tidak sesuai dengan Prodi");
            return;
        }else if ("DS".equals(kodePr) && !"10305".equals(awalNIM)){
            System.out.println("NIM tidak sesuai dengan Prodi");
            return;
        }
        this.nim = nim;
    }
    public void setNama(String nama){
        if (nama == null){
            System.out.println("Nama tidak boleh null");
            return;
        }
        this.nama = nama;
    }
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    public void setIPK(double IPK){
        this.IPK = IPK;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi.getKode() + " (" + prodi.getNama() + ")";
    }
    public String getIPK(){
        if (IPK > 3.9 && IPK <= 4.0){
            return "Summa Cumlaude";
        }else if (IPK > 3.5 && IPK <= 3.9){
            return "Cumlaude";
        }else if (IPK > 3.0 && IPK <= 3.5){
            return "Sangat Memuaskan";
        }else if (IPK > 2.5 && IPK <= 3.0){
            return "Memuaskan";
        }else if (IPK > 2.0 && IPK <= 2.5){
            return "Cukup";
        }else if (IPK >= 0 && IPK <= 2.0){
            return "Kurang";
        }
        return "";
    }
    public int getAngkatan(){
        int angka = Integer.parseInt(nim.substring(5,6));
        if (angka >= 0 && angka <= 25){
            return 2000 + angka;
        }else if (angka >= 90 && angka <= 99){
            return 1900 + angka;
        }else {
            return 0;
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class Prodi {
    private String kode;
    private String nama;
    public void setKode(String kode){
        if (kode.length() != 2 || kode == null){
            System.out.println("Kode Prodi harus 2 karakter");
            return;
        }
        this.kode = kode;
    }
    public void setNama(String nama){
        if (nama == null){
            System.out.println("Nama Prodi tidak boleh null");
            return;
        }
        this.nama = nama;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
}
