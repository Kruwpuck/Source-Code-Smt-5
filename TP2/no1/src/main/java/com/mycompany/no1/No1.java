/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;
import java.util.Scanner;
/**
 *
 * @author ihabh
 */
public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int input = scanner.nextInt();
        if (input <= 0) {
            System.out.println("n harus lebih besar dari 0");
        } else {
            int a = 1, b = 1;
            System.out.print(a);
            if (input > 1) {
                System.out.print(" " + b);
            }
            for (int i = 3; i <= input; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
