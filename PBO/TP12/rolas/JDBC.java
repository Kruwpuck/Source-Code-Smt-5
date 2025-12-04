/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;

/**
 *
 * 
 */
public class JDBC {
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    public boolean isConnected;
    public String message;

    // perbaiki isi contructor
    public JDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nama_database_sesuaikan_ya", "root", "");
            stmt = con.createStatement();
            isConnected = true;
            message = "DB connected";
        } catch (ClassNotFoundException | SQLException e) {
            isConnected = false;
            message = e.getMessage();
        }
    }

    // perbaiki isi runQuery
    public void runQuery(String query) { 
        try { 
            int result = ... 
            message = "info: " + result + " rows affected"; 
        } catch (SQLException e) { 
            message = e.getMessage(); 
        } 
    }

    // perbaiki isi getData
    public ResultSet getData(String query) { 
        try { 
            rs = ...; 
        } catch (SQLException e) { 
            message = e.getMessage(); 
        } 
        return rs; 
    }

    // perbaiki isi disconnect
    public void disconnect() { 
        try { 
            ... 
            ...
            message = "DB disconnected"; 
        } catch(SQLException e) { 
            message = e.getMessage(); 
        } 
    }
}
