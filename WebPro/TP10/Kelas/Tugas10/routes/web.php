<?php
use Illuminate\Support\Facades\Route;
// 1. Tambahkan baris ini di paling atas file:
use App\Http\Controllers\Lat1Controller;

Route::get('/', function () {
    return view('welcome');
});

// 2. Ubah route menjadi format array: [NamaClass::class, 'namaMethod']
Route::get('/lat1', [Lat1Controller::class, 'index']);
Route::get('/lat1/m2', [Lat1Controller::class, 'method2']);