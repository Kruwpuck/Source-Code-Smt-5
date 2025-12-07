package controllers;

import db.JDBC;
import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BarangController", urlPatterns = {"/BarangController"})
public class BarangController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        JDBC db = new JDBC();
        String menu = request.getParameter("menu");

        if (request.getParameterMap().isEmpty() || (menu != null && menu.equals("view"))) {
            ResultSet rs = db.getData("select * from barang");
            request.setAttribute("list", rs);
            request.getRequestDispatcher("/product/view.jsp").forward(request, response);
            
        } else if ("add".equals(menu)) {
            request.getRequestDispatcher("/product/add.jsp").forward(request, response);

        } else if ("insert".equals(menu)) {
            String nama = request.getParameter("nama");
            Double harga = Double.parseDouble(request.getParameter("harga"));
            
            db.runQuery("INSERT INTO barang (nama, harga) VALUES ('" + nama + "', " + harga + ")");
            response.sendRedirect("BarangController"); 
            
        } else if ("edit".equals(menu)) {
            String id = request.getParameter("id");
            ResultSet rs = db.getData("select * from barang where id = '" + id + "'");
            request.setAttribute("list", rs);
            request.getRequestDispatcher("/product/edit.jsp").forward(request, response);
            
        } else if ("update".equals(menu)) {
            String id = request.getParameter("id");
            String nama = request.getParameter("nama");
            Double harga = Double.parseDouble(request.getParameter("harga"));
            
            db.runQuery("UPDATE barang SET nama = '" + nama + "' , harga = " +
                    harga + " WHERE id = '" + id + "'");
            response.sendRedirect("BarangController"); 

        } else if ("delete".equals(menu)) {
            String id = request.getParameter("id");
            db.runQuery("delete from barang where id='" + id + "'");
            response.sendRedirect("BarangController");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}