<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Product;
use Illuminate\Support\Facades\Auth;

class ProductController extends Controller
{
    public function index() {
        $products = Product::all();
        return view('products.index', compact('products'));
    }

    public function create() {
        return view('products.create');
    }

    public function store(Request $request) {
        $request->validate(['name' => 'required', 'price' => 'required|numeric']);
        Product::create($request->all());
        return redirect()->route('products.index')->with('success', 'Produk berhasil ditambahkan');
    }

    public function edit(Product $product) {
        if (Auth::user()->role !== 'admin') {
            return redirect()->route('products.index')->with('error', 'Akses ditolak!');
        }
        return view('products.edit', compact('product'));
    }

    public function update(Request $request, Product $product) {
        if (Auth::user()->role !== 'admin') {
            abort(403);
        }
        $request->validate(['name' => 'required', 'price' => 'required|numeric']);
        $product->update($request->all());
        return redirect()->route('products.index')->with('success', 'Produk berhasil diupdate');
    }

    public function destroy(Product $product) {
        if (Auth::user()->role !== 'admin') {
            abort(403);
        }
        $product->delete();
        return redirect()->route('products.index')->with('success', 'Produk dihapus');
    }
}