<!doctype html>
<html>
<head>
  <title>Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-5">
      <div class="card shadow">
        <div class="card-header bg-primary text-white">Login</div>
        <div class="card-body">

          @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
          @endif

          @if($errors->any())
            <div class="alert alert-danger">
              @foreach($errors->all() as $e)
                <div>{{ $e }}</div>
              @endforeach
            </div>
          @endif

          <form method="POST" action="{{ route('login.post') }}">
            @csrf
            <div class="mb-3">
              <label>Email</label>
              <input type="email" name="email" class="form-control" value="{{ old('email') }}" required>
            </div>

            <div class="mb-3">
              <label>Password</label>
              <input type="password" name="password" class="form-control" required>
            </div>

            <button class="btn btn-primary w-100">Login</button>
          </form>

          <div class="text-center mt-3">
            Don't have an account? <a href="{{ route('register') }}">Register</a>
          </div>

        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
