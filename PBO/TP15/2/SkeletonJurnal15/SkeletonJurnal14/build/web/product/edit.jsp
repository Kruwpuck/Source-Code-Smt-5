<%@page import="models.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
<head>
    <title>Edit Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <%
        Product product = (Product) request.getAttribute("product");
        if (product == null) {
    %>
        <div class="container my-5">
            <div class="alert alert-danger text-center">
                <h4>Data barang tidak ditemukan.</h4>
                <a href="product?menu=view" class="btn btn-primary mt-3">Kembali ke Dashboard</a>
            </div>
        </div>
    <%
        } else {
    %>
    <div class="container my-5">
        <div class="card shadow">
            <div class="card-header bg-warning text-dark text-center">
                <h2>Edit Barang</h2>
            </div>
            <div class="card-body">
                <form method="POST" action="product">
                    <!-- Hidden inputs untuk operasi edit -->
                    <input type="hidden" name="action" value="edit">
                    <input type="hidden" name="id" value="<%= product.getId() %>">
                    
                    <!-- Input Nama Barang -->
                    <div class="form-floating mb-3">
                        <input 
                            type="text" 
                            class="form-control" 
                            id="namaBarang" 
                            name="nama" 
                            value="<%= product.getName() %>" 
                            required>
                        <label for="namaBarang">Nama Barang</label>
                    </div>

                    <!-- Input Harga Barang -->
                    <div class="form-floating mb-3">
                        <input 
                            type="number" 
                            class="form-control" 
                            id="hargaBarang" 
                            name="harga" 
                            value="<%= (int) product.getPrice() %>" 
                            required>
                        <label for="hargaBarang">Harga Barang</label>
                    </div>

                    <div class="d-flex justify-content-between">
                        <a href="product?menu=view" class="btn btn-secondary btn-lg">Kembali</a>
                        <button type="submit" class="btn btn-warning btn-lg">Simpan Perubahan</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%
        }
    %>
</body>
</html>
