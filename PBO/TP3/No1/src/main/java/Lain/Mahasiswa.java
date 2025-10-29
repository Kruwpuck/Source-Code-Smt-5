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
    private String nama;
    private Prodi prodi;
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }
    public String getNama(){
        return this.nama;
    }
    public String getProdi(){
        if (prodi == null) {
            return "Prodi belum diatur";
        }else{
            return prodi.getNama();
        }
    }
    public void displayMahasiswa(){
        System.out.println("Nama: " + getNama());
        System.out.println("Prodi: " + getProdi());
    }
}
