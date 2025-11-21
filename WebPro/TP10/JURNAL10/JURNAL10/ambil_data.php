<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.
Jika sesi belum diinisialisasi, maka akan diinisialisasi oleh script ini. */
session_start();

// Mengambil data pengguna
/* Kode ini memeriksa apakah terdapat data pengguna yang disimpan dalam session.
Jika ada, maka data tersebut akan di-loop dan ditampilkan dalam format HTML dengan nama, email, 
dan tombol hapus untuk setiap pengguna. Jika tidak ada data pengguna, akan menampilkan pesan 
'Tidak ada pengguna'. */
//CODE DISINI
if (empty($_SESSION['pengguna'])) {
    echo "<p>Tidak ada pengguna.</p>";
}else{

    // Loop data pengguna (Mengikuti pola langkah 1 pada petunjuk)
    foreach ($_SESSION['pengguna'] as $key => $value) {
        echo "
        <div class='user-item' style='padding:8px; margin-bottom:8px; display:flex; align-items:center; gap:12px;'>
           <span>{$value['nama']} ({$value['email']})</span>
            <button class='hapus-btn' data-id='{$key}' style='background:red; color:white; border:none; cursor:pointer; padding:4px 8px; border-radius:4px;'>Hapus</button>
        </div>
        ";
    }
}
?>
