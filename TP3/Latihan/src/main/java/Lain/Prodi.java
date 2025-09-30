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
