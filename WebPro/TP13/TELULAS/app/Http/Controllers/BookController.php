<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;

class BookController extends Controller
{
    public function index()
    {
        $books = Book::all();
        return view('index', compact('books'));
    }

    public function store(Request $request)
    {
        $request->validate([
            'title' => 'required|string|max:255',
            'author' => 'required|string|max:255',
            'published_year' => 'required|integer',
        ]);

        Book::create([
            'title' => $request->title,
            'author' => $request->author,
            'published_year' => $request->published_year,
            'status' => 'available' // Default sesuai soal
        ]);

        return redirect()->route('books.index')->with('success', 'Book Added Successfully');
    }

    public function edit($id)
    {
        $book = Book::findOrFail($id);
        return view('edit', compact('book'));
    }

    public function update(Request $request, $id)
    {
        $request->validate([
            'title' => 'required|string|max:255',
            'author' => 'required|string|max:255',
            'published_year' => 'required|integer',
            'status' => 'required|in:available,checkout',
        ]);

        $book = Book::findOrFail($id);
        $book->update($request->all());

        return redirect()->route('books.index')->with('success', 'Book Updated Successfully');
    }

    public function destroy($id)
    {
        $book = Book::findOrFail($id);
        $book->delete();

        return redirect()->route('books.index')->with('success', 'Book Deleted Successfully');
    }
}