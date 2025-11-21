<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manajemen Pengguna</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="container">
        <h2>Manajemen Daftar Pengguna</h2>

        <!-- Form untuk menambahkan pengguna -->
        <div class="form-container">
            <h3>Tambah Pengguna Baru</h3>
            <form id="form-tambah-pengguna">
                <input type="text" id="nama" placeholder="Nama Pengguna" required>
                <input type="email" id="email" placeholder="Email Pengguna" required>
                <button type="submit">Tambah Pengguna</button>
            </form>
        </div>

        <!-- Daftar Pengguna -->
        <h3>Daftar Pengguna</h3>
        <div id="daftar_pengguna" class="user-list">
            <!-- Daftar pengguna akan dimuat di sini melalui AJAX -->
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="script.js"></script>
</body>

</html>