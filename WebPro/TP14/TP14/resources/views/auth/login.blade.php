@extends('layout')

@section('content')
<div class="row justify-content-center mt-5">
    <div class="col-md-4">
        <div class="card shadow-sm">
            <div class="card-header bg-primary text-white text-center">Login</div>
            <div class="card-body">
                <form action="{{ url('/login') }}" method="POST">
                    @csrf
                    <div class="mb-3">
                        <label>Email</label>
                        <input type="email" name="email" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" required>
                    </div>
                    <button class="btn btn-primary w-100">Login</button>
                </form>
                <div class="text-center mt-3">
                    <small>Belum punya akun? <a href="{{ route('register') }}">Register</a></small>
                </div>
            </div>
        </div>
    </div>
</div>
@endsection