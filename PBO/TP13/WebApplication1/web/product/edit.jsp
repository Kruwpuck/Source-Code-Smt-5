<%-- 
    Document   : edit
    Created on : 6 Dec 2025, 02.51.04
    Author     : ihabh
--%>

<%@page import="db.JDBC, java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JDBC db = new JDBC();

    String id = request.getParameter("id");
    if (id == null) {
        response.sendRedirect("view.jsp");
        return;
    }

    String nama = request.getParameter("nama");
    String jumlah = request.getParameter("jumlah");
    String harga = request.getParameter("harga");

    if (nama != null && jumlah != null && harga != null) {
        String q = "UPDATE barang SET "
                 + "nama='" + nama + "', "
                 + "jumlah=" + jumlah + ", "
                 + "harga=" + harga
                 + " WHERE id=" + id;

        db.runQuery(q);

        response.sendRedirect("view.jsp");
        return;
    }

    ResultSet rs = db.getData("SELECT * FROM barang WHERE id=" + id);
    
    if (rs == null || !rs.next()) {
        db.closeData();
        response.sendRedirect("view.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container py-4" style="max-width:600px;">
    <h2 class="text-center mb-4">Edit Barang</h2>

    <form method="post">
        <input type="hidden" name="id" value="<%= id %>">

        <div class="mb-3">
            <label class="form-label">Nama</label>
            <input type="text" name="nama" class="form-control"
                   value="<%= rs.getString("nama") %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Jumlah</label>
            <input type="number" name="jumlah" class="form-control"
                   value="<%= rs.getInt("jumlah") %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Harga</label>
            <input type="number" step="0.01" name="harga" class="form-control"
                   value="<%= rs.getDouble("harga") %>" required>
        </div>

        <button class="btn btn-warning w-100" type="submit">Update</button>
    </form>

    <a href="view.jsp" class="btn btn-secondary mt-3 w-100">Kembali</a>
</div>
</body>
</html>

<%
    db.closeData();
%>
