<%-- 
    Document   : edit
    Created on : 20 Dec 2025, 15.01.40
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

    String idParam = request.getParameter("id");
    if (idParam == null) {
        response.sendRedirect("view.jsp");
        return;
    }
    int id = Integer.parseInt(idParam);

    String msg = null;
    String nama = "";
    int harga = 0;
    int stok = 0;

    if ("POST".equalsIgnoreCase(request.getMethod())) {
        nama = request.getParameter("nama");
        harga = Integer.parseInt(request.getParameter("harga"));
        stok = Integer.parseInt(request.getParameter("stok"));

        try (Connection conn = JDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "UPDATE barang SET nama=?, harga=?, stok=? WHERE id=?")) {

            ps.setString(1, nama);
            ps.setInt(2, harga);
            ps.setInt(3, stok);
            ps.setInt(4, id);
            ps.executeUpdate();

            response.sendRedirect("view.jsp");
            return;
        } catch (Exception e) {
            msg = "Gagal update: " + e.getMessage();
        }
    } else {
        try (Connection conn = JDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM barang WHERE id=?")) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    nama = rs.getString("nama");
                    harga = rs.getInt("harga");
                    stok = rs.getInt("stok");
                } else {
                    response.sendRedirect("view.jsp");
                    return;
                }
            }
        } catch (Exception e) {
            msg = "Gagal ambil data: " + e.getMessage();
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Edit Barang</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container py-4">
    <div class="d-flex justify-content-between align-items-center mb-3">
      <h3 class="m-0">Edit Barang (ID: <%= id %>)</h3>
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
            <input class="form-control" type="text" name="nama" value="<%= nama %>" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Harga</label>
            <input class="form-control" type="number" name="harga" value="<%= harga %>" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Stok</label>
            <input class="form-control" type="number" name="stok" value="<%= stok %>" required>
          </div>

          <button class="btn btn-warning" type="submit">Update</button>
          <a class="btn btn-link" href="view.jsp">Batal</a>
        </form>
      </div>
    </div>
  </div>
</body>
</html>
