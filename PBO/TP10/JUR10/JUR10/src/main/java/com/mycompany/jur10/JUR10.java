/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jur10;
import java.util.Scanner;

public class JUR10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        boolean valid;

        System.out.println("Validator Mahasiswa");

        // === INPUT NIM ===
        valid = false;
        while (!valid) {
            try {
                System.out.print("NIM: ");
                String nim = input.nextLine();
                mhs.setNim(nim);
                valid = true;   // keluar loop
                System.out.println("NIM valid");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        
        // === INPUT NAMA ===
        valid = false;
        while (!valid) {
            try {
                System.out.print("Nama: ");
                String nama = input.nextLine();
                mhs.setNama(nama);
                valid = true;
                System.out.println("Nama valid");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         System.out.println();

        // === INPUT TANGGAL LAHIR ===
        valid = false;
        while (!valid) {
            try {
                System.out.print("Masukkan Tanggal Lahir: ");
                String tgl = input.nextLine();
                mhs.setTanggalLahir(tgl);
                valid = true;
                System.out.println("Tanggal lahir valid");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        
        // === INPUT IPK ===
        valid = false;
        while (!valid) {
            try {
                System.out.print("IPK: ");
                double ipk = Double.parseDouble(input.nextLine());
                mhs.setIPK(ipk);
                valid = true;
                System.out.println("IPK valid");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
