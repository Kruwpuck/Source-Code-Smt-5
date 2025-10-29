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
    private String kelas;
    private String prodi;
    private AmbilMK[] ambilMK;

    public Mahasiswa(String nim, String nama, int noKelas){
        setNim(nim);
        setNama(nama);
        setKelas(noKelas);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim != null && !nim.isEmpty() && nim.length() >= 5){
            String awalNim = nim.substring(0, 5);
            if (awalNim.equals("10301")){
                prodi = "IF";
            } else if (awalNim.equals("10302")){
                prodi = "SE";
            } else if (awalNim.equals("10303")){
                prodi = "IT";
            } else if (awalNim.equals("10305")){
                prodi = "DS";
            }
            this.nim = nim;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(int noKelas) {
        if (noKelas > 0 && prodi != null && !prodi.isEmpty()){
            kelas = prodi + "-47-" + noKelas;
        }
    }

    public String getProdi() {
        return prodi;
    }

    public void tambahMK(AmbilMK ambilMK){
        this.ambilMK = ambilMK;
    }

    public double hitungIPK(String thnAjar) {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (AmbilMK ambil : ambilMK) {
            // hanya hitung nilai yg tahun ajarnya persis sama dengan input
            if (ambil.getThnAjar().equals(thnAjar)) {
                totalNilai += ambil.getMK().getSks() * ambil.nilaiAngka();
                totalSKS += ambil.getMK().getSks();
            }
        }

        if (totalSKS == 0) return -1.0;
        return totalNilai / totalSKS;
    }
}
