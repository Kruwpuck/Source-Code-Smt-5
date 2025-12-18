@extends('layout')
@section('content')
<div class="card w-75 mx-auto shadow">
    <div class="card-header bg-dark text-white">Edit Buku</div>
    <div class="card-body">
        <form action="{{ route('books.update', $book->id) }}" method="POST">
            @csrf @method('PUT')
            <div class="mb-3"><label>Judul</label><input type="text" name="title" value="{{ $book->title }}" class="form-control" required></div>
            <div class="mb-3"><label>Deskripsi</label><textarea name="description" class="form-control" rows="3" required>{{ $book->description }}</textarea></div>
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label>Tanggal Rilis</label>
                    <input type="date" name="release_date" value="{{ $book->release_date->format('Y-m-d') }}" class="form-control" required>
                </div>
                <div class="col-md-6 mb-3">
                    <label>Rating (1-10)</label>
                    <input type="number" name="rating" value="{{ $book->rating }}" min="1" max="10" class="form-control" required>
                </div>
            </div>
            <button class="btn btn-primary">Update Data</button>
            <a href="{{ route('books.index') }}" class="btn btn-secondary">Batal</a>
        </form>
    </div>
</div>
@endsection