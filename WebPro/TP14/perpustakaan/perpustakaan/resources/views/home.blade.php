<!doctype html>
<html>
<head>
  <title>Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-4">

  <div class="d-flex justify-content-between align-items-center mb-3">
    <h3 class="mb-0">Perpustakaan Tertutup</h3>

    <div class="d-flex align-items-center gap-2">
      <span class="badge bg-dark text-uppercase">
        {{ auth()->user()->role }}
      </span>

      <form method="POST" action="{{ route('logout') }}">
        @csrf
        <button class="btn btn-secondary btn-sm">Logout</button>
      </form>
    </div>
  </div>

  @if(session('success'))
    <div class="alert alert-success alert-dismissible fade show">
      {{ session('success') }}
      <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
    </div>
  @endif

  {{-- FORM ADMIN (ADD BOOK) --}}
  @if(auth()->user()->role === 'admin')
    @if($errors->any())
      <div class="alert alert-danger">
        @foreach($errors->all() as $e)
          <div>{{ $e }}</div>
        @endforeach
      </div>
    @endif

    <div class="card mb-3 shadow-sm">
      <div class="card-header bg-primary text-white">Add New Book</div>
      <div class="card-body">
        <form method="POST" action="{{ route('books.store') }}" class="row g-2">
          @csrf
          <div class="col-md-3">
            <input name="title" class="form-control" placeholder="Title" value="{{ old('title') }}" required>
          </div>
          <div class="col-md-3">
            <input name="description" class="form-control" placeholder="Description" value="{{ old('description') }}" required>
          </div>
          <div class="col-md-2">
            <input type="date" name="release_date" class="form-control" value="{{ old('release_date') }}" required>
          </div>
          <div class="col-md-2">
            <input type="number" name="rating" min="1" max="5" class="form-control" placeholder="Rating 1-5" value="{{ old('rating') }}" required>
          </div>
          <div class="col-md-2 d-grid">
            <button class="btn btn-primary">Add Book</button>
          </div>
        </form>
      </div>
    </div>
  @endif

  <div class="card shadow-sm">
    <div class="card-body p-0">
      <table class="table table-striped table-bordered mb-0">
        <thead class="table-dark">
          <tr>
            <th>#</th>
            <th>Title</th>
            <th>Description</th>
            <th>Release Date</th>
            <th>Rating</th>
            <th>Created</th>
            @if(auth()->user()->role === 'admin') <th>Actions</th> @endif
          </tr>
        </thead>
        <tbody>
          @forelse($books as $i => $b)
            <tr>
              <td>{{ $i + 1 }}</td>
              <td>{{ $b->title }}</td>
              <td>{{ $b->description }}</td>

              {{-- release_date tanpa jam --}}
              <td>{{ \Carbon\Carbon::parse($b->release_date)->format('Y-m-d') }}</td>

              <td><span class="badge bg-warning text-dark">{{ $b->rating }}</span></td>

              {{-- created tanpa jam --}}
              <td>{{ \Carbon\Carbon::parse($b->created_at)->format('Y-m-d') }}</td>

              @if(auth()->user()->role === 'admin')
                <td class="d-flex gap-2">
                  <a href="{{ route('books.edit', $b) }}" class="btn btn-warning btn-sm">Edit</a>
                  <form method="POST" action="{{ route('books.destroy', $b) }}">
                    @csrf
                    @method('DELETE')
                    <button class="btn btn-danger btn-sm" onclick="return confirm('Hapus buku ini?')">Delete</button>
                  </form>
                </td>
              @endif
            </tr>
          @empty
            <tr>
              <td colspan="7" class="text-center py-4">Belum ada buku.</td>
            </tr>
          @endforelse
        </tbody>
      </table>
    </div>
  </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
