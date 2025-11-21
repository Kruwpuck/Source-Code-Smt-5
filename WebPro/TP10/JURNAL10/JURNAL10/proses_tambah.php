<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.*/
session_start();

// Proses penambahan data pengguna
/* Kode ini memeriksa apakah data 'nama' dan 'email' dikirim melalui metode POST.
Jika data diterima, maka data baru akan disimpan ke dalam array session pengguna. 
Data nama dan email yang dimasukkan juga akan divalidasi untuk menghindari kesalahan input.
Setelah proses selesai, akan menampilkan pesan berhasil atau error. */
//CODE DISINI

// Sesuai PETUNJUK: Inisialisasi array session jika belum ada
if (!isset($_SESSION['pengguna'])) {
    $_SESSION['pengguna'] = []; 
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    
     $_SESSION['pengguna'][] = [
        "nama"  => htmlspecialchars($_POST['nama']),
        "email" => htmlspecialchars($_POST['email'])
    ];


    echo "Pengguna berhasil ditambahkan.";
}
?>
