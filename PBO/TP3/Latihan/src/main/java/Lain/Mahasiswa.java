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
