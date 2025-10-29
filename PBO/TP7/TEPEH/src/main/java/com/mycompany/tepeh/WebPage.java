/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tepeh;

/**
 *
 * @author ihabh
 */
public class WebPage implements Loginable{
    private String webTitle;
    protected String loggedUsername;
    public WebPage(String title){
        this.webTitle = title;
    }
    protected void showHeader(){
        System.out.println("######################################");
        System.out.println("### " + this.webTitle + " ##");
        System.out.println("#-----------------------------------##");
    }
    protected void showFooter(){
        System.out.println("#-----------------------------------##");
        System.out.println("### Created by Ihab Hasanain ##");
        System.out.println("######################################");
    }
    protected void showMainPage(){
    
    }
    public void showFullPage(){
        showHeader();
        showMainPage();
        showFooter();
    }

    @Override
    public void login(String input) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
