<!DOCTYPE html>
<html>
<head>
    <title>Input Data Mahasiswa</title>
    <style>
        body { font-family: sans-serif; margin: 50px; background-color: #f4f4f9; }
        .container { background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); max-width: 400px; margin: auto; }
        h1 { color: #333; border-bottom: 2px solid #5cb85c; padding-bottom: 10px; }
        label { display: block; margin-top: 15px; font-weight: bold; }
        input[type="text"] { width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background-color: #5cb85c; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer; margin-top: 20px; width: 100%; }
        button:hover { background-color: #4cae4c; }
        .error { color: red; font-size: 0.9em; margin-top: 5px; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Form Input Data</h1>

        @if ($errors->any())
            <div style="background-color: #f8d7da; color: #721c24; padding: 10px; border-radius: 4px; margin-bottom: 15px;">
                <ul>
                    @foreach ($errors->all() as $error)
                        <li>{{ $error }}</li>
                    @endforeach
                </ul>
            </div>
        @endif

        @if (session('error'))
            <p class="error">{{ session('error') }}</p>
        @endif
        
        <form method="POST" action="{{ route('data.process') }}">
            @csrf <div>
                <label for="nama">Nama:</label>
                <input type="text" id="nama" name="nama" value="{{ old('nama') }}" required>
            </div>

            <div>
                <label for="nim">NIM:</label>
                <input type="text" id="nim" name="nim" value="{{ old('nim') }}" required>
            </div>

            <button type="submit">Simpan ke Session</button>
        </form>
    </div>
</body>
</html>