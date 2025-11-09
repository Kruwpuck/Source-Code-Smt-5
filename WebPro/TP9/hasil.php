<?php
// Ambil data POST
$nama = isset($_POST['nama']) ? trim($_POST['nama']) : '';
$tgl  = isset($_POST['tgl'])  ? trim($_POST['tgl'])  : '';
$hobi = isset($_POST['hobi']) ? $_POST['hobi']       : [];

// Sanitasi untuk ditampilkan
$nama_safe = htmlspecialchars($nama, ENT_QUOTES, 'UTF-8');

// Konversi tanggal dd/mm/yyyy -> "14 November 2025"
$formatIndo = '';
if ($tgl !== '') {
    // Ubah delimiter agar bisa diparsing DateTime
    $tglFixed = str_replace('/', '-', $tgl);      // 14/11/2025 -> 14-11-2025
    $dt = DateTime::createFromFormat('d-m-Y', $tglFixed);
    if ($dt) {
        // Nama bulan Indonesia
        $bulanIndo = [
            1=>'Januari',2=>'Februari',3=>'Maret',4=>'April',5=>'Mei',6=>'Juni',
            7=>'Juli',8=>'Agustus',9=>'September',10=>'Oktober',11=>'November',12=>'Desember'
        ];
        $hari = (int)$dt->format('d');
        $bulan = (int)$dt->format('m');
        $tahun = $dt->format('Y');
        $formatIndo = $hari . ' ' . $bulanIndo[$bulan] . ' ' . $tahun;
    } else {
        $formatIndo = 'Format tanggal tidak valid';
    }
} else {
    $formatIndo = 'Tidak diisi';
}

// Gabungkan checkbox dengan koma
$hobiStr = !empty($hobi) ? implode(', ', array_map('htmlspecialchars', $hobi)) : 'Tidak dipilih';
?>
<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8">
  <title>Tampilan Data Anda</title>
</head>
<body>
  <h2>Tampilan Data Anda</h2>
  <p><strong>Nama Lengkap:</strong> <?= $nama_safe ?></p>
  <p><strong>Tanggal Lahir:</strong> <?= $formatIndo ?></p>
  <p><strong>Hobi:</strong> <?= $hobiStr ?></p>

  <p><a href="form.php">« Kembali ke Form</a></p>
</body>
</html>
