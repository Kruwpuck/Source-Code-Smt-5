@extends('layout')
@section('content')
<div class="card shadow">
    <div class="card-header d-flex justify-content-between align-items-center">
        <h5 class="mb-0">Daftar Buku</h5>
        @if(Auth::user()->role == 'admin')
            <a href="{{ route('books.create') }}" class="btn btn-primary btn-sm">+ Tambah Buku</a>
        @endif
    </div>
    <div class="card-body">
        @if(session('success')) <div class="alert alert-success">{{ session('success') }}</div> @endif
        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>No</th>
                    <th>Judul</th>
                    <th>Deskripsi</th>
                    <th>Rilis</th>
                    <th>Rating</th>
                    <th>Dibuat</th>
                    @if(Auth::user()->role == 'admin') <th>Aksi</th> @endif
                </tr>
            </thead>
            <tbody>
                @forelse($books as $b)
                <tr>
                    <td>{{ $loop->iteration }}</td>
                    <td>{{ $b->title }}</td>
                    <td>{{ Str::limit($b->description, 50) }}</td>
                    <td>{{ $b->release_date->format('d M Y') }}</td>
                    <td>{{ $b->rating }}/10</td>
                    <td>{{ $b->created_at->format('d M Y') }}</td>

                    @if(Auth::user()->role == 'admin')
                    <td>
                        <form action="{{ route('books.destroy', $b->id) }}" method="POST">
                            <a href="{{ route('books.edit', $b->id) }}" class="btn btn-warning btn-sm">Edit</a>
                            @csrf @method('DELETE')
                            <button class="btn btn-danger btn-sm" onclick="return confirm('Hapus?')">Hapus</button>
                        </form>
                    </td>
                    @endif
                </tr>
                @empty
                <tr><td colspan="7" class="text-center">Belum ada data buku.</td></tr>
                @endforelse
            </tbody>
        </table>
    </div>
</div>
@endsection