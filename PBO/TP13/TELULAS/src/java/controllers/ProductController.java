package controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Product;

@WebServlet(name = "ProductController", urlPatterns = {"/product"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // (#3.1 lengkapi 2 line dibawah ini)
        // lakukan request parameter menu
        String menu = request.getParameter("menu");
        
        // buat objek Product
        Product productModel = new Product();

        if ("view".equals(menu)) {
            // (#3.2 lengkapi 3 line dibawah ini)
            // melakukan get data dari db dengan memanggil func get
            ArrayList<Product> products = productModel.get();
            
            // dari data yang telah di get diatas, lakukan set atribut ke products 
            request.setAttribute("products", products);
            // (mengarahkan ke halaman dashbord (view.jsp))
            request.getRequestDispatcher("/product/view.jsp").forward(request, response);

        } else if ("add".equals(menu)) {
            // (#3.3 mengarahkan ke halaman tambah barang (add.jsp))
            request.getRequestDispatcher("/product/add.jsp").forward(request, response);

        } else if ("edit".equals(menu)) {
            // (#3.4 lengkapi 6 line dibawah ini)
            // lakukan request parameter id
            String id = request.getParameter("id");
            
            // lakukan search id sebelumnya menggunakan func find pada objek yang telah dibuat
            Product product = productModel.find(id);
            if (product != null) {
                // lakukan set atribut product
                request.setAttribute("product", product);
                
                // mengarahkan ke halaman edit barang (edit.jsp)
                request.getRequestDispatcher("/product/edit.jsp").forward(request, response);
            } else {
                // mengarahkan ke halaman dashboard (view.jsp)
                response.sendRedirect("product?menu=view");;
            }

        } else {
            // mengarahkan ke halaman dashboard (view.jsp)
            response.sendRedirect("product?menu=view");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // (#3.5 lengkapi 2 line dibawah ini)
        // lakukan request parameter action
        String action = request.getParameter("action");
        
        // buat objek Product
        Product productModel = new Product();

        if ("add".equals(action)) {
            // (#3.6 lengkapi 4 line dibawah ini)
            // lakukan request parameter nama
            String name = request.getParameter("nama");
            
            // lakukan request parameter harga
            double price = Double.parseDouble(request.getParameter("harga"));

            // set kolom nilai form dari objek yang telah dibuat menggunakan func set
            productModel.setName(name);
            productModel.setPrice(price);
            productModel.insert();
            
            // panggil func insert pada objek yang telah dibuat
            productModel.insert();

        } else if ("edit".equals(action)) {
            // (#3.7 lengkapi 5 line dibawah ini)
            // lakukan request parameter id
            int id = Integer.parseInt(request.getParameter("id"));
            // lakukan request parameter nama
            String name = request.getParameter("nama");
            
            // lakukan request parameter harga
            double price = Double.parseDouble(request.getParameter("harga"));

            // set kolom nilai form dari objek yang telah dibuat menggunakan func set
            productModel.setId(id);
            productModel.setName(name);
            productModel.setPrice(price);
            
            // panggil func update pada objek yang telah dibuat
            productModel.update();
        }
        
        // mengarahkan ke halaman dashboard (view.jsp)
        response.sendRedirect("product?menu=view");
    }
}
