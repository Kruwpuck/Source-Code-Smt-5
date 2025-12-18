<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>App Buku</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-4">
        <div class="container">
            <a class="navbar-brand fw-bold" href="#">LIBRARY APP</a>
            <div class="ms-auto text-white">
                @auth
                    User: {{ Auth::user()->name }} | Role: <strong>{{ strtoupper(Auth::user()->role) }}</strong>
                    <form action="{{ route('logout') }}" method="POST" class="d-inline ms-2">
                        @csrf <button class="btn btn-danger btn-sm">Logout</button>
                    </form>
                @endauth
            </div>
        </div>
    </nav>
    <div class="container">
        @yield('content')
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>