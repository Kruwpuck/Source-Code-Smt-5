@extends('layout')
@section('content')
<div class="card w-75 mx-auto shadow">
    <div class="card-header bg-dark text-white">Tambah Buku</div>
    <div class="card-body">
        <form action="{{ route('books.store') }}" method="POST">
            @csrf
            <div class="mb-3"><label>Judul</label><input type="text" name="title" class="form-control" required></div>
            <div class="mb-3"><label>Deskripsi</label><textarea name="description" class="form-control" rows="3" required></textarea></div>
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label>Tanggal Rilis</label>
                    <input type="date" name="release_date" class="form-control" required>
                </div>
                <div class="col-md-6 mb-3">
                    <label>Rating (1-10)</label>
                    <input type="number" name="rating" min="1" max="10" class="form-control" required>
                </div>
            </div>
            <button class="btn btn-success">Simpan Data</button>
            <a href="{{ route('books.index') }}" class="btn btn-secondary">Kembali</a>
        </form>
    </div>
</div>
@endsection