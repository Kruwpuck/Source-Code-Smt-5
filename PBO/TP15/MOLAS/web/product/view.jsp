<%-- 
    Document   : view
    Created on : 20 Dec 2025, 15.01.44
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

    String action = request.getParameter("action");
    String idParam = request.getParameter("id");

    if ("delete".equals(action) && idParam != null) {
        try (Connection c = JDBC.getConnection();
             PreparedStatement ps = c.prepareStatement("DELETE FROM barang WHERE id=?")) {
            ps.setInt(1, Integer.parseInt(idParam));
            ps.executeUpdate();
            response.sendRedirect("view.jsp");
            return;
        } catch (Exception e) {
            request.setAttribute("err", "Gagal hapus: " + e.getMessage());
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Data Barang</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script>
    function konfirmasiHapus(id){
      if(confirm("Yakin ingin menghapus barang ini?")){
        window.location = "view.jsp?action=delete&id=" + id;
      }
    }
  </script>
</head>
<body class="bg-light">
  <div class="container py-4">
    <div class="d-flex justify-content-between align-items-center mb-3">
      <h3 class="m-0">Data Barang</h3>
      <div>
        <a class="btn btn-success" href="add.jsp">+ Add Barang</a>
        <a class="btn btn-outline-secondary ms-2" href="../logout.jsp">Logout</a>
      </div>
    </div>

    <%
      String err = (String) request.getAttribute("err");
      if (err != null) {
    %>
      <div class="alert alert-danger"><%= err %></div>
    <% } %>

    <div class="card shadow-sm">
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-striped align-middle">
            <thead>
              <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Harga</th>
                <th>Stok</th>
                <th style="width:180px;">Aksi</th>
              </tr>
            </thead>
            <tbody>
              <%
                try (Connection conn = JDBC.getConnection();
                     Statement st = conn.createStatement();
                     ResultSet rs = st.executeQuery("SELECT * FROM barang ORDER BY id DESC")) {

                    boolean ada = false;
                    while (rs.next()) {
                      ada = true;
                      int id = rs.getInt("id");
              %>
                <tr>
                  <td><%= id %></td>
                  <td><%= rs.getString("nama") %></td>
                  <td>Rp <%= rs.getInt("harga") %></td>
                  <td><%= rs.getInt("stok") %></td>
                  <td>
                    <a class="btn btn-sm btn-warning" href="edit.jsp?id=<%= id %>">Edit</a>
                    <button class="btn btn-sm btn-danger" type="button" onclick="konfirmasiHapus(<%= id %>)">Delete</button>
                  </td>
                </tr>
              <%
                    }
                    if (!ada) {
              %>
                <tr><td colspan="5" class="text-center text-muted">Belum ada data.</td></tr>
              <%
                    }
                } catch (Exception e) {
              %>
                <tr><td colspan="5" class="text-danger">Error: <%= e.getMessage() %></td></tr>
              <%
                }
              %>
            </tbody>
          </table>
        </div>
      </div>
    </div>

  </div>
</body>
</html>
