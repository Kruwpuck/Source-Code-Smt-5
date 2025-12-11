<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
<head>
    <title>Tambah Barang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container my-5">
        <div class="card shadow">
            <div class="card-header bg-primary text-white text-center">
                <h2>Tambah Barang</h2>
            </div>
            <div class="card-body">
                <!--(#2.7 lengkapi method dan action pada form untuk mengirimkan inputan tambah barang ke controller)-->
                <form method="POST" action="product">
                    <input type="hidden" name="action" value="add">
                    
                    <!--(#2.8 tambahkan inputan harga barang, sesuaikan type inputan dengan masukan harus bertipe angka)-->
                    <div class="form-floating mb-3">
                        <input type="text" class="form-control" name="nama" placeholder="Nama Barang" required>
                        <label>Nama Barang</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="number" step="0.01" class="form-control" name="harga" placeholder="Harga Barang" required>
                        <label>Harga Barang</label>
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Simpan</button>
                </form>
                <div class="mt-3 text-center">
                    
                    <!--(#2.9 sesuaikan routing agar masuk ke halaman dashboard (view.jsp))-->
                    <a href="product?menu=view" class="btn btn-secondary">Kembali ke Daftar Barang</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
