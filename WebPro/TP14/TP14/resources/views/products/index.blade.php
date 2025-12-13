@extends('layout')

@section('content')
<div class="card shadow-sm">
    <div class="card-header d-flex justify-content-between align-items-center">
        <h5 class="mb-0">Daftar Produk</h5>
        <a href="{{ route('products.create') }}" class="btn btn-sm btn-primary">Tambah Produk</a>
    </div>
    <div class="card-body">
        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Nama Produk</th>
                    <th>Harga</th>
                    @if(Auth::user()->role == 'admin')
                    <th>Aksi (Admin Only)</th>
                    @endif
                </tr>
            </thead>
            <tbody>
                @foreach($products as $key => $p)
                <tr>
                    <td>{{ $key + 1 }}</td>
                    <td>{{ $p->name }}</td>
                    <td>Rp {{ number_format($p->price, 0, ',', '.') }}</td>
                    
                    @if(Auth::user()->role == 'admin')
                    <td>
                        <a href="{{ route('products.edit', $p->id) }}" class="btn btn-sm btn-warning">Edit</a>
                        <form action="{{ route('products.destroy', $p->id) }}" method="POST" class="d-inline" onsubmit="return confirm('Yakin hapus?')">
                            @csrf
                            @method('DELETE')
                            <button class="btn btn-sm btn-danger">Hapus</button>
                        </form>
                    </td>
                    @endif
                </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection