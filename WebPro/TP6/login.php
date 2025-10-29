<?php

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
  http_response_code(405);
  echo 'Metode tidak diizinkan.';
  exit;
}

$user = isset($_POST['username']) ? trim($_POST['username']) : '';
$pass = isset($_POST['password']) ? $_POST['password'] : '';

if ($user === '' || $pass === '') {
  echo 'Username dan password wajib diisi.';
  exit;
}

$USERNAME_BENAR = 'admin';
$PASSWORD_BENAR = 'rahasia123';

if ($user === $USERNAME_BENAR && $pass === $PASSWORD_BENAR) {
  echo 'Login berhasil. Selamat datang, ' . htmlspecialchars($user, ENT_QUOTES, 'UTF-8') . '!';
} else {
  echo 'Login gagal: username atau password salah.';
}
