@extends('layout')
@section('content')
<div class="row justify-content-center mt-5">
    <div class="col-md-5">
        <div class="card shadow">
            <div class="card-header bg-success text-white text-center"><h4>REGISTER</h4></div>
            <div class="card-body">
                <form action="{{ route('register') }}" method="POST">
                    @csrf
                    <div class="mb-3">
                        <label>Nama Lengkap</label>
                        <input type="text" name="name" class="form-control" required>
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
                        <label>Konfirmasi Password</label>
                        <input type="password" name="password_confirmation" class="form-control" required>
                    </div>

                    {{-- PILIHAN ROLE --}}
                    <div class="mb-3">
                        <label class="fw-bold">Daftar Sebagai:</label>
                        <select name="role" class="form-select" required>
                            <option value="" selected disabled>-- Pilih Role --</option>
                            <option value="user">User Biasa (Read Only)</option>
                            <option value="admin">Administrator (Full Access)</option>
                        </select>
                    </div>

                    <button class="btn btn-success w-100">Daftar Sekarang</button>
                </form>
                <div class="text-center mt-3">
                    <a href="{{ route('login') }}">Sudah punya akun? Login</a>
                </div>
            </div>
        </div>
    </div>
</div>
@endsection