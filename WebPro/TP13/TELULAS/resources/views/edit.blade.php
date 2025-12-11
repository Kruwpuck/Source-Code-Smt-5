<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="card">
            <div class="card-header fw-bold">Edit Book</div>
            <div class="card-body">
                <form action="{{ route('books.update', $book->id) }}" method="POST">
                    @csrf
                    @method('PUT')
                    
                    <div class="mb-3">
                        <label for="title" class="form-label">Title</label>
                        <input type="text" class="form-control" name="title" value="{{ $book->title }}" required>
                    </div>

                    <div class="mb-3">
                        <label for="author" class="form-label">Author</label>
                        <input type="text" class="form-control" name="author" value="{{ $book->author }}" required>
                    </div>

                    <div class="mb-3">
                        <label for="published_year" class="form-label">Published Year</label>
                        <input type="number" class="form-control" name="published_year" value="{{ $book->published_year }}" required>
                    </div>

                    <div class="mb-3">
                        <label for="status" class="form-label">Status</label>
                        <select class="form-select" name="status">
                            <option value="available" {{ $book->status == 'available' ? 'selected' : '' }}>Available</option>
                            <option value="checkout" {{ $book->status == 'checkout' ? 'selected' : '' }}>Checkout</option>
                        </select>
                    </div>

                    <div class="d-flex gap-2">
                        <button type="submit" class="btn btn-primary">Update Book</button>
                        <a href="{{ route('books.index') }}" class="btn btn-secondary">Cancel</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>