/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;

public class JDBC {
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    public boolean isConnected;
    public String message;

    // constructor
    public JDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // isi
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_barang",
                    "root",
                    ""
            );
            stmt = con.createStatement();
            isConnected = true;
            message = "DB connected";
        } catch (ClassNotFoundException | SQLException e) {
            isConnected = false;
            message = e.getMessage();
        }
    }

    // runQuery (INSERT/UPDATE/DELETE)
    public void runQuery(String query) {
        try {
            int result = stmt.executeUpdate(query);   // <-- isi ...
            message = "info: " + result + " rows affected";
        } catch (SQLException e) {
            message = e.getMessage();
        }
    }

    // getData (SELECT)
    public ResultSet getData(String query) {
        try {
            rs = stmt.executeQuery(query);          // <-- isi ...
        } catch (SQLException e) {
            message = e.getMessage();
        }
        return rs;
    }

    // disconnect
    public void disconnect() {
        try {
            if (rs != null) rs.close();     // <-- isi ...
            if (stmt != null) stmt.close(); // <-- isi ...
            if (con != null) con.close();
            message = "DB disconnected";
        } catch (SQLException e) {
            message = e.getMessage();
        }
    }
}