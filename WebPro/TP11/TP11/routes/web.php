<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\DataController;
Route::get('/', function () {
    return view('welcome');
});
Route::get('/input-data', [DataController::class, 'showForm'])->name('data.form');

Route::post('/process-data', [DataController::class, 'processData'])->name('data.process');

Route::get('/tampil-data', [DataController::class, 'showData'])->name('data.show');