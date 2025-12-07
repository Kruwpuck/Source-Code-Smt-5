<%-- 
    Document   : add
    Created on : 6 Dec 2025, 02.50.58
    Author     : ihabh
--%>

<%@page import="db.JDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JDBC db = new JDBC();
    String nama = request.getParameter("nama");
    String jumlah = request.getParameter("jumlah");
    String harga = request.getParameter("harga");

    // cukup cek parameternya saja
    if (nama != null && jumlah != null && harga != null) {
        String q = "INSERT INTO barang(nama, jumlah, harga) VALUES "
                 + "('" + nama + "', " + jumlah + ", " + harga + ")";
        db.runQuery(q);

        // langsung balik ke view
        response.sendRedirect("view.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Add Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container py-4" style="max-width:600px;">
    <h2 class="text-center mb-4">Tambah Barang</h2>

    <form method="post">
        <div class="mb-3">
            <label class="form-label">Nama</label>
            <input type="text" name="nama" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Jumlah</label>
            <input type="number" name="jumlah" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Harga</label>
            <input type="number" step="0.01" name="harga" class="form-control" required>
        </div>

        <button class="btn btn-success w-100" type="submit">Simpan</button>
    </form>

    <a href="view.jsp" class="btn btn-secondary mt-3 w-100">Kembali</a>
</div>
</body>
</html>
