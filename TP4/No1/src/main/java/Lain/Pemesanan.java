/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class Pemesanan {
    private Pasien pasien;
    private Dokter dokter;
    private String hari;
    public Pemesanan(Pasien pasien, Dokter dokter, String hari) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.hari = hari;
    }
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }
    public Dokter getDokter() {
        return dokter;
    }
    public Pasien getPasien() {
        return pasien;
    }
    public String getHari() {
        return hari;
    }
}
