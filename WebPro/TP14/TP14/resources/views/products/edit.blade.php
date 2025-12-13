@extends('layout')

@section('content')
<div class="card col-md-6 mx-auto">
    <div class="card-header fw-bold">Edit Produk</div>
    <div class="card-body">
        <form action="{{ route('products.update', $product->id) }}" method="POST">
            @csrf
            @method('PUT') <div class="mb-3">
                <label>Nama Produk</label>
                <input type="text" name="name" class="form-control" value="{{ old('name', $product->name) }}" required>
            </div>

            <div class="mb-3">
                <label>Harga</label>
                <input type="number" name="price" class="form-control" value="{{ old('price', $product->price) }}" required>
            </div>

            <button class="btn btn-primary">Update</button>
            <a href="{{ route('products.index') }}" class="btn btn-secondary">Batal</a>
        </form>
    </div>
</div>
@endsection