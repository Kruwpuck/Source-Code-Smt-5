package com.mycompany.tpsapoloh;

import java.util.Scanner;

/**
 *
 * @author ihabh
 */
public class TPSAPOLOH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Small Integer Tester\n");
        
        while (true) {
            try {
                System.out.print("Masukkan integer: ");
                String input = sc.nextLine();
                
                int number = Integer.parseInt(input);
                
                if (number < 0) {
                    throw new SmallIntegerException("nilai lebih kecil dari 0");
                } else if (number > 9) {
                    throw new SmallIntegerException("nilai lebih besar dari 9");
                } else {
                    // Nilai valid (0-9)
                    System.out.println("nilai benar\n");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("input harus integer\n");
                
            } catch (SmallIntegerException e) {
                e.print();
                System.out.println("jumlah small int exception: " + SmallIntegerException.getTotalException() + "\n");
            }
        }
    }
}
