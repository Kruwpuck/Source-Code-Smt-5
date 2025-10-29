/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lain;

/**
 *
 * @author ihabh
 */
public class AmbilMK {
    public MataKuliah matakuliah;
    public String nilai;
    public String tahunAjaran;
    
    public AmbilMK(MataKuliah matakuliah, String nilai, String tahunAjaran){
        setMatakuliah(matakuliah);
        setNilai(nilai);
        setTahunAjaran(tahunAjaran);
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
}
}