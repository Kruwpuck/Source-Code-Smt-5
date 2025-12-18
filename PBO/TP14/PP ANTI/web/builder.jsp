<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COTS: Builder</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container min-vh-100 d-flex align-items-center justify-content-center">
        <div class="card shadow p-4" style="width: 100%; max-width: 400px;">
            <h1 class="text-center mb-4">Tabel DB Generator</h1>
            <!--(#3.3 Sesuaikan method dan action yang dibutuhkan berdasarkan Controller yang ada)-->
            <form method="POST" action="builder">
                <div class="mb-3">
                    <label for="table" class="form-label">Pilih Tabel</label>
                    <!--(#3.4 Sesuaikan kebutuhan name, id, dan value pada select dibawah)-->
                    <select name="table" id="table" class="form-select">
                        <option value="" disabled selected>-- Pilih tabel --</option>
                        <option value="Student">Student</option>
                    </select>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Buat Tabel</button>
                </div>
            </form>
            <div class="mt-3 text-center text-success">
<!--        (#3.5 Tampilkan pesan parsing message yang didapatkan dari controller)-->
                <%= request.getAttribute("message") == null ? "" : request.getAttribute("message") %>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
