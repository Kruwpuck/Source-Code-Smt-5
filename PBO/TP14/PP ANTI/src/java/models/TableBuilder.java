package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class TableBuilder {

    private Connection con;
    private Statement stmt;
    private boolean isConnected;
    private String message;
    protected String table;
    protected String primaryKey;
    protected String[][] columns;

    public void connect() {
        String db_name = "";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, username, password);
            stmt = con.createStatement();
            isConnected = true;
            message = "Database Terkoneksi";
        } catch (ClassNotFoundException | SQLException e) {
            isConnected = false;
            message = e.getMessage();
        }
    }

    public void disconnect() {
        try {
            stmt.close();
            con.close();
        } catch (SQLException e) {
            message = e.getMessage();
        }
    }

    public void createTable() {
        try {
            connect();
            String cols = "";
            // (#1.1 Lengkapi bagian kosong agar dapat melakukan query membuat table ke database)
            for (int i = 0; i < columns.length; i++) {
                cols += columns[i][0] + " " + columns[i][1];
                if(i < columns.length - 1){
                    cols += ", ";
                }
            }
            int result = stmt.executeUpdate("CREATE TABLE " + table + " (" + cols + ", PRIMARY KEY(" + primaryKey + "))");
            message = "table " + table + " created";
        } catch (SQLException e) {
            message = e.getMessage();
        } finally {
            disconnect();
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}