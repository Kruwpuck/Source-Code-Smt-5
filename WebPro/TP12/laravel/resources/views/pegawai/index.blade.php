<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Pegawai</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-8">
            <nav class="navbar navbar-dark bg-dark">
                <div class="container-fluid">
                  <span class="navbar-brand mb-0 h1">PT. Ihab</span>
                </div>
            </nav>
            <h4 class="mt-3">Daftar Karyawan</h4>
            
            <a href="{{ route('pegawai.create') }}" class="btn btn-primary mb-3">Tambah Pegawai</a>

            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nama</th>
                        <th>Posisi</th>
                        <th>Gaji</th>
                    </tr>
                </thead>
                <tbody>
                    @forelse ($data_pegawai as $pegawai)
                        <tr>
                            <td>{{ $pegawai->id }}</td>
                            <td>{{ $pegawai->nama }}</td>
                            <td>{{ $pegawai->posisi }}</td>
                            <td>{{ $pegawai->gaji }}</td>
                        </tr>
                    @empty
                        <tr>
                            <td colspan="4" class="text-center">No data available.</td>
                        </tr>
                        <tr>
                            
                        </tr>
                    @endforelse
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>