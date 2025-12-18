<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AuthController;
use App\Http\Controllers\BookController;

Route::middleware('guest')->group(function () {
    Route::get('/', function () { return redirect()->route('login'); });
    Route::get('/login', [AuthController::class, 'showLogin'])->name('login');
    Route::post('/login', [AuthController::class, 'login']);
    Route::get('/register', [AuthController::class, 'showRegister'])->name('register');
    Route::post('/register', [AuthController::class, 'register']);
});

Route::middleware('auth')->group(function () {
    Route::post('/logout', [AuthController::class, 'logout'])->name('logout');
    
    Route::get('/dashboard', [BookController::class, 'index'])->name('dashboard');
    Route::get('/books', [BookController::class, 'index'])->name('books.index');


    Route::middleware('isAdmin')->group(function () {
        Route::resource('books', BookController::class)->except(['index', 'show']);
    });
});