package models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Product extends Model<Product> {
    private int id;
    private String name;
    private double price;

    public Product() {
        // (#1.2 isi konstruktor default product dengan ketentuan
        // table di isi dengan name table, primary key diisi dengan kolom id)
        this.table = "product";
        this.primaryKey = "id";
    }

    public Product(int id, String name, double price) {
        // (#1.3 isi konstruktor product dengan menyesuaikan value yang ada pada parameter)
        this.table = "product";
        this.primaryKey = "id";
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Product toModel(ResultSet rs) {
        try {
            // (#1.4 dapatkan nilai setiap kolom pada db menggunakan rs, perhatikan juga tipe datanya
            // data yang diambil menggunakan rs harus dimasukkan ke dalam model Product agar sesuai dengan konsep arsitektur MVC (Model-View-Controller)
            return new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price")
            );
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
