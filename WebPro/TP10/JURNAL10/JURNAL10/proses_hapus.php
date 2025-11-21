<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.*/
session_start();

// Proses penghapusan data pengguna
/* Kode ini memeriksa apakah terdapat 'id' yang dikirim melalui metode GET.
Jika ada, maka data dengan ID tersebut akan dihapus dari array session pengguna.
Jika berhasil dihapus, akan menampilkan pesan sukses, dan jika gagal, akan menampilkan pesan error. */
//CODE DISINI

if (isset($_POST['id'])) {
    $id = intval($_POST['id']); 
    if (isset($_SESSION['pengguna'][$id])) {
        unset($_SESSION['pengguna'][$id]); 
        echo "Pengguna berhasil dihapus.";
    } else {
        echo "Data pengguna tidak ditemukan.";
    }
} 

?>
