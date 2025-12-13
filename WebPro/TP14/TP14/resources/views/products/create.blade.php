@extends('layout')

@section('content')
<div class="card col-md-6 mx-auto">
    <div class="card-header fw-bold">Tambah Produk</div>
    <div class="card-body">
        <form action="{{ route('products.store') }}" method="POST">
            @csrf
            <div class="mb-3">
                <label>Nama Produk</label>
                <input type="text" name="name" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Harga</label>
                <input type="number" name="price" class="form-control" required>
            </div>
            <button class="btn btn-primary">Simpan</button>
            <a href="{{ route('products.index') }}" class="btn btn-secondary">Batal</a>
        </form>
    </div>
</div>
@endsection