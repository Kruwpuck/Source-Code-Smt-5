<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8">
  <title>Formulir Data Diri</title>
</head>
<body>
  <h2>Formulir Data Diri</h2>

  <form action="hasil.php" method="post">
    <div>
      <label for="nama">Nama Lengkap:</label><br>
      <input type="text" id="nama" name="nama" required>
    </div>
    <br>

    <div>
      <label for="tgl">Tanggal Lahir:</label><br>
      <input type="text" id="tgl" name="tgl" placeholder="dd/mm/yyyy" required>
    </div>
    <br>

    <div>
      <span>Hobi:</span><br>
      <label><input type="checkbox" name="hobi[]" value="Membaca"> Membaca</label><br>
      <label><input type="checkbox" name="hobi[]" value="Olahraga"> Olahraga</label><br>
      <label><input type="checkbox" name="hobi[]" value="Musik"> Musik</label><br>
      <label><input type="checkbox" name="hobi[]" value="Lainnya"> Lainnya</label>
    </div>
    <br>

    <button type="submit">Kirim</button>
  </form>
</body>
</html>
