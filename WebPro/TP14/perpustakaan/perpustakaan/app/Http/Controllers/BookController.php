<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;

class BookController extends Controller
{
    public function index()
    {
        $books = Book::latest()->get();
        return view('home', compact('books'));
    }

    public function store(Request $request)
    {
        $validated = $request->validate([
            'title' => ['required','string','max:255'],
            'description' => ['required','string'],
            'rating' => ['required','integer','between:1,5'],
            'release_date' => ['required','date'],
        ]);

        Book::create($validated);

        return back()->with('success', 'Book created successfully!');
    }

    public function edit(Book $book)
    {
        return view('edit', compact('book'));
    }

    public function update(Request $request, Book $book)
    {
        $validated = $request->validate([
            'title' => ['required','string','max:255'],
            'description' => ['required','string'],
            'rating' => ['required','integer','between:1,5'],
            'release_date' => ['required','date'],
        ]);

        $book->update($validated);

        return redirect()->route('books.index')->with('success', 'Book updated successfully!');
    }

    public function destroy(Book $book)
    {
        $book->delete();
        return back()->with('success', 'Book deleted successfully!');
    }
}
