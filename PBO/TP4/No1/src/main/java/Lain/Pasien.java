/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class Pasien {
    private String nama;
    private int umur;
    public void Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
}
