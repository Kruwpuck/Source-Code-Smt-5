<!DOCTYPE html>
<html>
<head>
    <title>Tampilan Data Session</title>
    <style>
        body { font-family: sans-serif; margin: 50px; background-color: #e6f7ff; }
        .container { background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); max-width: 500px; margin: auto; border-left: 5px solid #007bff; }
        h1 { color: #007bff; border-bottom: 2px solid #007bff; padding-bottom: 10px; }
        p { font-size: 1.1em; line-height: 1.6; }
        strong { color: #333; display: inline-block; width: 80px; }
        .alert-success { background-color: #d4edda; color: #155724; padding: 10px; border-radius: 4px; margin-bottom: 15px; border: 1px solid #c3e6cb; }
        a { color: #007bff; text-decoration: none; margin-top: 20px; display: inline-block; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Data Mahasiswa dari Session</h1>

        @if (session('success'))
            <div class="alert-success">
                {{ session('success') }}
            </div>
        @endif

        @if ($data)
            <p><strong>Nama:</strong> {{ $data['nama'] }}</p>
            <p><strong>NIM:</strong> {{ $data['nim'] }}</p>
        @else
            <p>Data tidak ditemukan dalam Session.</p>
        @endif
        
        <a href="{{ route('data.form') }}">Kembali ke Form Input</a>
    </div>
</body>
</html>