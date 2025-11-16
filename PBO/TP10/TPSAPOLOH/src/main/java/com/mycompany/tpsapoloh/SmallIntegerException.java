/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpsapoloh;

/**
 *
 * @author ihabh
 */
public class SmallIntegerException extends Exception {
    private static int totalException = 0;
    
    public SmallIntegerException(String message) {
        super(message);
        totalException++;
    }
    
    public static int getTotalException() {
        return totalException;
    }
    
    public void print() {
        System.out.println(getMessage());
    }
}
