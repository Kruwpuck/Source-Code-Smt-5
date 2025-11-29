/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import classes.JDBC;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet; // Hanya perlu di BarangController
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ihabh
 */
@WebServlet(name = "BarangController", urlPatterns = {"/BarangController"})
public class BarangController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        JDBC db = new JDBC();
        String menu = request.getParameter("menu"); // Ambil parameter menu [cite: 329]

        if (request.getParameterMap().isEmpty() || (menu != null && menu.equals("view"))) {
            // KONDISI DEFAULT / VIEW: Tampilkan daftar barang
            ResultSet rs = db.getData("select * from barang");
            request.setAttribute("list", rs);
            request.getRequestDispatcher("view.jsp").forward(request, response); 

        } else if ("add".equals(menu)) {
            // KONDISI ADD: Tampilkan form.jsp
            request.getRequestDispatcher("form.jsp").forward (request, response);

        } else if ("insert".equals(menu)) {
            // KONDISI INSERT: Lakukan penambahan data
            String nama = request.getParameter("nama"); 
            Double harga = Double.parseDouble(request.getParameter("harga"));

            // Jalankan query INSERT
            db.runQuery("INSERT INTO barang (nama, harga) VALUES ('" + nama + "', " + harga+ ")"); 

            // Kembali ke daftar barang (redirect)
            response.sendRedirect("BarangController");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
