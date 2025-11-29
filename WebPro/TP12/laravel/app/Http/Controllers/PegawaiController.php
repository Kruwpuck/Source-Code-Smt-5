<?php

namespace App\Http\Controllers;

use App\Models\Pegawai;
use Illuminate\Http\Request;

class PegawaiController extends Controller
{
    public function index()
    {
        $data_pegawai = Pegawai::all(); 
        return view('pegawai.index', compact('data_pegawai'));
    }
    public function store(Request $request)
        {
            Pegawai::create([
                'nama' => $request->nama,
                'posisi' => $request->posisi,
                'gaji' => $request->gaji,
            ]);

            return redirect()->route('pegawai.index')->with('success', 'Data Pegawai berhasil ditambahkan!');
        }
    public function create()
    {
        return view('pegawai.form');
    }
}