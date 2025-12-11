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
                
                <!--(#2.10 sesuaikan routing agar masuk ke halaman dashboard (view.jsp))-->
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
                <!--(#2.11 lengkapi method dan action pada form untuk mengirimkan inputan edit barang ke controller)-->
                <form method="POST" action="product">
                   
                    <input type="hidden" name="action" value="edit">
                    <input type="hidden" name="id" value="<%= product.getId() %>">
                    
                    <!--(#2.12 tambahkan inputan harga barang, sesuaikan type inputan dengan masukan harus bertipe angka dan mengambil value data harga barang)-->
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

                    <div class="form-floating mb-3">
                        <input type="numbe" class="form-control" id="hargaBarang" name="harga"
                            value="<%= (int) product.getPrice() %>" required>
                        <label for="hargaBarang">Harga Barang</label>
                    </div>

                    <div class="d-flex justify-content-between">
                        
                        <!--(#2.13 sesuaikan routing jika menekan button kembali agar masuk ke halaman dashboard (view.jsp))-->
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
