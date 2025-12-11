<%@page import="models.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
<head>
    <title>Dashboard Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container my-5">
        <div class="d-flex justify-content-between align-items-center mb-4">
            <h2 class="text-primary">Daftar Barang</h2>
            <a href="product?menu=add" class="btn btn-success btn-lg">Tambah Barang</a>
        </div>
        <div class="table-responsive">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
                        <!--(#2.3 lengkapi table header sesuai dengan nama kolom yang ada pada table db + tambahkan kolom aksi)-->
                        <th>ID</th>
                        <th>Nama</th>
                        <th>Harga</th>
                        <th>Aksi</th>   
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");
                        if (products != null) {
                            for (Product product : products) {
                    %>
                    <tr>
                        <!--(#2.4 lengkapi kolom table body untuk menampilkan seluruh data pada berdasarkan model product)--> 
                        <td><%= product.getId() %></td>
                        <td><%= product.getName() %></td>
                        <td><%= (int) product.getPrice() %></td>
                        <td>
                            <!--(#2.5 sesuaikan routing agar masuk ke halaman edit sesuai dengan id yang ingin di edit(edit.jsp))-->
                            <a href="product?menu=edit&id=<%= product.getId() %>" class="btn btn-warning btn-sm">Edit</a>
                        </td>
                    </tr>
                    <%
                            }
                        } else {
                    %>
                    <tr>
                        <td colspan="4" class="text-center">Tidak ada data barang.</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
        <div class="mt-4">
            <!--(#2.6 sesuaikan routing agar masuk ke halaman welcome page (index.jsp))-->
            <a href="/TELULAS/index.jsp" class="btn btn-secondary btn-lg">Kembali ke Halaman Utama</a>
        </div>
    </div>
</body>
</html>
