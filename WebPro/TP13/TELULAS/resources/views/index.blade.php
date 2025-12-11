<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CloseLibrary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="text-center mb-4">
            <h2>CloseLibrary Management System</h2>
        </div>

        @if(session('success'))
            <div class="alert alert-success">
                {{ session('success') }}
            </div>
        @endif

        <div class="card mb-4">
            <div class="card-header fw-bold">Add New Book</div>
            <div class="card-body">
                <form action="{{ route('books.store') }}" method="POST">
                    @csrf
                    <div class="row">
                        <div class="col-md-4 mb-3">
                            <label for="title" class="form-label">Title</label>
                            <input type="text" class="form-control" name="title" placeholder="Book Title" required>
                        </div>
                        <div class="col-md-4 mb-3">
                            <label for="author" class="form-label">Author</label>
                            <input type="text" class="form-control" name="author" placeholder="Author Name" required>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="published_year" class="form-label">Published Year</label>
                            <input type="number" class="form-control" name="published_year" placeholder="2024" required>
                        </div>
                        <div class="col-md-1 mb-3 d-flex align-items-end">
                            <button type="submit" class="btn btn-primary w-100">Add</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="card">
            <div class="card-header fw-bold">Books List</div>
            <div class="card-body">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Published Year</th>
                            <th>Status</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        @forelse($books as $book)
                        <tr>
                            <td>{{ $book->title }}</td>
                            <td>{{ $book->author }}</td>
                            <td>{{ $book->published_year }}</td>
                            <td>
                                <span class="badge {{ $book->status == 'available' ? 'bg-success' : 'bg-secondary' }}">
                                    {{ ucfirst($book->status) }}
                                </span>
                            </td>
                            <td>
                                <div class="d-flex gap-2">
                                    <a href="{{ route('books.edit', $book->id) }}" class="btn btn-warning btn-sm text-white">Edit</a>
                                    <form action="{{ route('books.destroy', $book->id) }}" method="POST" onsubmit="return confirm('Yakin hapus buku ini?');">
                                        @csrf
                                        @method('DELETE')
                                        <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                                    </form>
                                </div>
                            </td>
                        </tr>
                        @empty
                        <tr>
                            <td colspan="5" class="text-center text-muted">No books available</td>
                        </tr>
                        @endforelse
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>