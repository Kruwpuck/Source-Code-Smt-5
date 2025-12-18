@extends('layout')
@section('content')
<div class="row justify-content-center mt-5">
    <div class="col-md-4">
        <div class="card shadow">
            <div class="card-header bg-primary text-white text-center"><h4>LOGIN</h4></div>
            <div class="card-body">
                @if(session('success')) <div class="alert alert-success">{{ session('success') }}</div> @endif
                @if(session('error')) <div class="alert alert-danger">{{ session('error') }}</div> @endif

                <form action="{{ route('login') }}" method="POST">
                    @csrf
                    <div class="mb-3"><label>Email</label><input type="email" name="email" class="form-control" required></div>
                    <div class="mb-3"><label>Password</label><input type="password" name="password" class="form-control" required></div>
                    <button class="btn btn-primary w-100">Masuk</button>
                </form>
                <div class="text-center mt-3">
                    <a href="{{ route('register') }}">Belum punya akun? Register</a>
                </div>
            </div>
        </div>
    </div>
</div>
@endsection