<%-- 
    Document   : add
    Created on : 20 Dec 2025, 15.01.35
    Author     : ihabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="classes.JDBC"%>


<%
    if (session.getAttribute("login") == null) {
        response.sendRedirect("../index.jsp");
        return;
    }

    String msg = null;

    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String nama = request.getParameter("nama");
        String hargaStr = request.getParameter("harga");
        String stokStr = request.getParameter("stok");

        try (Connection conn = JDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "INSERT INTO barang(nama, harga, stok) VALUES(?,?,?)")) {

            ps.setString(1, nama);
            ps.setInt(2, Integer.parseInt(hargaStr));
            ps.setInt(3, Integer.parseInt(stokStr));
            ps.executeUpdate();

            response.sendRedirect("view.jsp");
            return;
        } catch (Exception e) {
            msg = "Gagal tambah data: " + e.getMessage();
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Add Barang</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container py-4">
    <div class="d-flex justify-content-between align-items-center mb-3">
      <h3 class="m-0">Tambah Barang</h3>
      <a class="btn btn-outline-secondary" href="view.jsp">Kembali</a>
    </div>

    <% if (msg != null) { %>
      <div class="alert alert-danger"><%= msg %></div>
    <% } %>

    <div class="card shadow-sm">
      <div class="card-body">
        <form method="post">
          <div class="mb-3">
            <label class="form-label">Nama</label>
            <input class="form-control" type="text" name="nama" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Harga</label>
            <input class="form-control" type="number" name="harga" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Stok</label>
            <input class="form-control" type="number" name="stok" required>
          </div>

          <button class="btn btn-success" type="submit">Simpan</button>
          <a class="btn btn-link" href="view.jsp">Batal</a>
        </form>
      </div>
    </div>
  </div>
</body>
</html>

