<?php
namespace App\Http\Controllers;
use App\Models\Product;
use Illuminate\Http\Request;

class ProductController extends Controller
{
    public function index()
    {
        $products = Product::all();
        return view('products.index', ['products' => $products]);
    }   
    public function create()
    {
        return view('products.form', [
            'title' => 'Tambah',
            'product' => new Product(),
            'route' => route('products.store'),
            'method' => 'POST',
        ]);
    }
    public function store(Request $request)
    {
        $validated = $request->validate([
            'name' => 'required|min:4',
            'price' => 'required|integer|min:1000000',
        ]);
        Product::create($validated);
        return redirect()->route('products.index')->with('success', 'Produk berhasilditambahkan');
    }
    public function show(Product $product)
    {
        return view('products.show', compact('product'));
    }
    public function edit(Product $product)
    {
        return view('products.form', [
            'title' => 'Edit',
            'product' => $product,
            'route' => route('products.update', $product),
            'method' => 'PUT',
        ]);
    }
    public function update(Request $request, Product $product)
    {
        $validated = $request->validate([
            'name' => 'required|min:4',
            'price' => 'required|integer|min:1000000',
        ]);
        $product->update($validated);
        return redirect()->route('products.index')->with('success', 'Produk berhasildiperbarui');
    }
    public function destroy(Product $product)
    {
        $product->delete();
        return redirect()->route('products.index')->with('success', 'Produk berhasildihapus');
    }
}