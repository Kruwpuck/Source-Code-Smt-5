/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    
    public MataKuliah(String kode, String nama, int sks){
        setKode(kode);
        setNama(nama);
        setSks(sks);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
}
}
