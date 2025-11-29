<?php

use App\Http\Controllers\PegawaiController;
use Illuminate\Support\Facades\Route;

Route::get('/', [PegawaiController::class, 'index'])->name('pegawai.index');

Route::get('/create', [PegawaiController::class, 'create'])->name('pegawai.create');

Route::post('/', [PegawaiController::class, 'store'])->name('pegawai.store');