<!doctype html>
<html>
<head>
  <title>Edit Book</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
  <div class="card">
    <div class="card-header bg-warning">Edit Book</div>
    <div class="card-body">

      <form method="POST" action="{{ route('books.update',$book) }}">
        @csrf @method('PUT')

        <div class="mb-2">
          <label>Title</label>
          <input name="title" class="form-control" value="{{ $book->title }}">
        </div>

        <div class="mb-2">
          <label>Description</label>
          <input name="description" class="form-control" value="{{ $book->description }}">
        </div>

        <div class="mb-2">
          <label>Release Date</label>
          <input type="date" name="release_date" class="form-control" value="{{ $book->release_date }}">
        </div>

        <div class="mb-2">
          <label>Rating</label>
          <input type="number" name="rating" min="1" max="5" class="form-control" value="{{ $book->rating }}">
        </div>

        <button class="btn btn-warning">Update</button>
        <a href="{{ route('books.index') }}" class="btn btn-secondary">Back</a>
      </form>

    </div>
  </div>
</div>

</body>
</html>
