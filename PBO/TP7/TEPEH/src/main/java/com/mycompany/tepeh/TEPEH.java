/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tepeh;

/**
 *
 * @author ihabh
 */
public class TEPEH {

    public static void main(String[] args) {
        HomePage home = new HomePage(" WebTitle : Home ");
        DashboardPage page = new DashboardPage(" Webtitle : Dashboard ");
        
        System.out.println("=== SEBELUM LOGIN ===");
        home.showFullPage();
        System.out.println();
        page.showFullPage();
        System.out.println();
       
        System.out.println("=== Proses Login ===");
        home.login("Ihab");
        System.out.println();
        page.login("Ihabbb");
        System.out.println();
        
        System.out.println("=== Sesudah Login ===");
        home.showFullPage();
        System.out.println();
        page.showFullPage();

    }
}
