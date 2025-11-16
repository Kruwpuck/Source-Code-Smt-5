<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nama = isset($_POST['nama']) ? $_POST['nama'] : '';
    
    if (empty(trim($nama))) {
        echo "Input nama tidak boleh kosong!";
    } else {
        echo "Halo, " . htmlspecialchars($nama) . "! Selamat datang di AJAX!";
    }
} else {
    echo "Method request tidak valid!";
}
?>
