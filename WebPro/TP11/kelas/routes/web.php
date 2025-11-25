<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ProductController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Di sini Anda dapat mendaftarkan route web untuk aplikasi Anda. 
| Route ini dimuat oleh RouteServiceProvider dan semuanya diberikan grup 
| middleware "web".
|
*/

// Pastikan Anda telah mendefinisikan Resource Route untuk ProductController
Route::resource('products', ProductController::class);
Route::get('/', function () {
    return redirect()->route('products.index');
});