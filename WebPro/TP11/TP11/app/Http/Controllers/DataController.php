<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Session;

class DataController extends Controller
{
    public function showForm()
    {
        return view('data.form');
    }

    public function processData(Request $request)
    {
        $request->validate([
            'nama' => 'required|string|max:255',
            'nim' => 'required|numeric|digits:12', 
        ]);


        Session::put('user_data', [
            'nama' => $request->input('nama'),
            'nim' => $request->input('nim'),
        ]);

        return redirect()->route('data.show')->with('success', 'Data berhasil disimpan ke Session!');
    }

    public function showData()
    {
        $userData = Session::get('user_data');

        if (!$userData) {
            return redirect()->route('data.form')->with('error', 'Silakan input data terlebih dahulu.');
        }

        return view('data.display', [
            'data' => $userData
        ]);
    }
}