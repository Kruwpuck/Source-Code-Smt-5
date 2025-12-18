<!doctype html>
<html>
<head>
  <title>Register</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-5">
      <div class="card shadow">
        <div class="card-header bg-success text-white">Register</div>
        <div class="card-body">

          @if($errors->any())
            <div class="alert alert-danger">
              @foreach($errors->all() as $e)
                <div>{{ $e }}</div>
              @endforeach
            </div>
          @endif

          <form method="POST" action="{{ route('register.post') }}">
            @csrf

            <div class="mb-3">
              <label>Name</label>
              <input name="name" class="form-control" required>
            </div>

            <div class="mb-3">
              <label>Email</label>
              <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
              <label>Password</label>
              <input type="password" name="password" class="form-control" required>
            </div>

            <div class="mb-3">
              <label>Confirm Password</label>
              <input type="password" name="password_confirmation" class="form-control" required>
            </div>

            <div class="mb-3">
              <label>Role</label>
              <select name="role" class="form-select">
                <option value="user">Normal User</option>
                <option value="admin">Admin</option>
              </select>
            </div>

            <button class="btn btn-success w-100">Register</button>
          </form>

          <div class="text-center mt-3">
            Already have an account? <a href="{{ route('login') }}">Login</a>
          </div>

        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
