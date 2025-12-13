<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TP Modul 14</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    
    @auth
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-4">
        <div class="container">
            <a class="navbar-brand" href="#">Toko WebPro</a>
            <div class="d-flex text-white align-items-center gap-3">
                <span>Halo, <strong>{{ Auth::user()->name }}</strong> ({{ ucfirst(Auth::user()->role) }})</span>
                <form action="{{ route('logout') }}" method="POST">
                    @csrf
                    <button class="btn btn-sm btn-danger" type="submit">Logout</button>
                </form>
            </div>
        </div>
    </nav>
    @endauth

    <div class="container mt-4">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        @if(session('error'))
            <div class="alert alert-danger">{{ session('error') }}</div>
        @endif
        
        @yield('content')
    </div>

</body>
</html>