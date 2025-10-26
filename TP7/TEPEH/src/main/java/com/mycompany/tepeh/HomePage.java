/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tepeh;

/**
 *
 * @author ihabh
 */
public class HomePage extends WebPage {
    public HomePage(String title){
        super(title);
    }
    @Override
    public void login(String input){
        System.out.println("Selamat datang di halaman Home, " + input + "!");
    }
    @Override
    protected void showMainPage(){
        if (this.loggedUsername == null){
            System.out.println("# Selamat datang                  ##");
            System.out.println("# Anda sedang berada di home page ##");
            System.out.println("# Ini penjelasan umum home page   ##");
        }else{
            System.out.println("# Selamat datang, " + this.loggedUsername + "! ##");
            System.out.println("# Anda sedang berada di home page ##");
            System.out.println("# Ini penjelasan umum home page   ##");
        }
    }
}
