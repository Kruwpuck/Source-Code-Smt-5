/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tepeh;

/**
 *
 * @author ihabh
 */
public class DashboardPage extends WebPage {
    public DashboardPage(String title){
        super(title);
    }
    @Override
    public void login(String input){
        System.out.println(input + " berhasil login ke halaman dashboard");
    }
    @Override
    protected void showMainPage(){
        
        if (this.loggedUsername == null){
            System.out.println("# Akses ditutup untuk user guest  ##");
            System.out.println("#  Mohon login terlebih dahulu    ##");
        }else{
            System.out.println("#  Dashboard Page – " + this.loggedUsername + " ##");
            System.out.println("# Opsi-opsi page dashboard        ##");
            System.out.println("# dsb                             ##");
        }
    }
}
