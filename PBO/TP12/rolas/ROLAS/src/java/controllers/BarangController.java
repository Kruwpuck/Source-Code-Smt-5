/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import db.JDBC;
/**
 *
 * 
 */
@WebServlet(name = "barangController", urlPatterns = { "/barangController" })
public class BarangController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            try {
                // (#3.1) Buat sebuah object db untuk database
                JDBC db = new JDBC();
                // (#3.2) Lakukan pengecekan apakah objek db sudah terkoneksi
                if (db.isConnected) {
                    // (#3.3) Lengkapi request parameter dari form pada index.jsp
                    String tempNama = request.getParameter("nama");
                    String tempHarga = request.getParameter("harga");
                    String tempJumlah = request.getParameter("jumlah");

                    // (#3.3) perbaiki run query untuk insert barang
                    db.runQuery("INSERT INTO barang (nama, jumlah, harga) VALUES ('" + tempNama + "', " + tempJumlah
                            + ", " + tempHarga + ")");
                    db.disconnect();
                }
            } catch (Exception e) {
                out.println("Terjadi kesalahan saat menambah data.");
            }

            response.sendRedirect("index.jsp");
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
