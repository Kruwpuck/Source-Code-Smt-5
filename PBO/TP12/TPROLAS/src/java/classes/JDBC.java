/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.*; 
/**
 *
 * @author ihabh
 */
public class JDBC {
    private Connection con;
    private Statement stmt;
    private boolean isConnected;
    private String message;

        /**
         * @return the con
         */
        public Connection getCon() {
            return con;
        }

        /**
         * @param con the con to set
         */
        public void setCon(Connection con) {
            this.con = con;
        }

        /**
         * @return the stmt
         */
        public Statement getStmt() {
            return stmt;
        }

        /**
         * @param stmt the stmt to set
         */
        public void setStmt(Statement stmt) {
            this.stmt = stmt;
        }

        /**
         * @return the isConnected
         */
        public boolean isIsConnected() {
            return isConnected;
        }

        /**
         * @param isConnected the isConnected to set
         */
        public void setIsConnected(boolean isConnected) {
            this.isConnected = isConnected;
        }

        /**
         * @return the message
         */
        public String getMessage() {
            return message;
        }

        /**
         * @param message the message to set
         */
        public void setMessage(String message) {
            this.message = message;
        }
    }

public void connect() {
        String dbname = "TP12_Praktikan";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + dbname, username, password);
            stmt = con.createStatement();
            isConnected = true;
            message = "DB connected: " + dbname;
        } catch (Exception e) {
            isConnected = false;
            message = e.getMessage();
        }
    }
private void disconnect() {
    try {
        stmt.close();
        con.close();
    } catch(Exception e) {
        message = e.getMessage();
    }
}
public void runQuery(String query) {
    try {
        connect();
        int result = stmt.executeUpdate(query);
        message = "info: " + result + " rows affected";
    } catch (Exception e) {
        message = e.getMessage();
    } finally {
        disconnect();
    }
}
public ResultSet getData(String query) {
    ResultSet rs = null;
    try {
        connect();
        rs = stmt.executeQuery(query);
    } catch (Exception e) {
        message = e.getMessage();
    }
    return rs;
}