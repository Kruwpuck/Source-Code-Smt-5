<%-- 
    Document   : view
    Created on : 6 Dec 2025, 02.51.10
    Author     : ihabh
--%>

<%@page import="db.JDBC, java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JDBC db = new JDBC();
%>

<!DOCTYPE html>
<html>
<head>
    <title>View Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container py-4">
    <h2 class="text-center mb-4">Daftar Barang</h2>

    <div class="d-flex justify-content-between mb-3">
        <a href="../index.jsp" class="btn btn-secondary">Back</a>
        <a href="add.jsp" class="btn btn-success">Add Barang</a>
    </div>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Jumlah</th>
                <th>Harga</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
        <%
            ResultSet rs = db.getData("SELECT * FROM barang");

            if (rs != null) {
                while (rs.next()) {
        %>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("nama") %></td>
                <td><%= rs.getInt("jumlah") %></td>
                <td><%= rs.getDouble("harga") %></td>
                <td>
                    <!-- tombol edit sesuai kriteria -->
                    <a class="btn btn-warning btn-sm"
                       href="edit.jsp?id=<%= rs.getInt("id") %>">Edit</a>
                </td>
            </tr>
        <%
                }
                db.closeData();
            } else {
                out.print(db.getMessage());
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
