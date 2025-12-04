<%@page import="db.JDBC, java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Barang</title>
    
    <!-- (#2.1) import bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <div class="container my-5">
        <h2 class="text-center mb-4">Formulir Barang</h2>
        <div class="row justify-content-center">
            <div class="col-md-6">
                
                <!-- (#2.2) sesuaikan method & action nya-->
                <form method="post" action="barangController"><!--isi-->
                    <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="name" name="nama" placeholder="Nama Barang" required>
                        <label for="name" class="form-label">Nama Barang</label>
                    </div>
                    
                    <!-- (#2.3) buatlah 2 buah inputan lagi untuk harga dan jumlah seperti nama, 
                    namun sesuaikan id, name, placeholder, for, dan isinya-->
                    
                    <div class="form-floating mb-3">
                        <input type="number" class="form-control" id="jumlah" name="jumlah" placeholder="Jumlah Barang" required>
                        <label for="jumlah" class="form-label">Jumlah Barang</label>
                    </div>

                    <div class="form-floating mb-3">
                        <input type="number" step="0.01" class="form-control" id="harga" name="harga" placeholder="Harga Barang" required>
                        <label for="harga" class="form-label">Harga Barang</label>
                    </div>
                    
                    <button type="submit" class="btn btn-primary w-100">Submit</button>
                </form>
            </div>
        </div>

        <h3 class="text-center mt-5">Daftar Barang</h3>
        <div class="table-responsive mt-4">
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <!--(#2.4) Lengkapi header table berikut dengan urutan ID, Nama, Jumah, Harga-->
                        <th>ID</th>
                        
                        <th>Nama</th>
                        
                        <th>Jumlah</th>
                        
                        <th>Harga</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                    
                    //(#2.4) Buat sebuah object db untuk database
                    JDBC db = new JDBC(); 
                    
                    // (#2.4) Lakukan pengecekan apakah objek db sudah terkoneksi
                    if (db.isConnected) { 
                        
                        //(#2.4) gunakan rs untuk menampung hasil query menampilkan semua isi barangsemua isi barang                     
                        ResultSet rs = db.getData("SELECT * FROM barang"); 
                        
                        while (rs.next()) { 
                            int id = rs.getInt("id");
                    %>
                    <tr>
                        
                        <!--(#2.4) Lengkapi resultSet untuk menampilkan data barang yang telah diambil dari database-->
                        <td><%= rs.getInt("id") %></td>
                        
                        <td><%= rs.getString("nama") %></td>
                        
                        <td><%= rs.getInt("jumlah") %></td>
                        
                        <td><%= rs.getDouble("harga") %></td>

                    </tr>
                    <% 
                        } 
                        
                        db.disconnect(); 
                    } else { 
                        out.print(db.message + "<br />"); 
                    } 
                    %>
                    
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
