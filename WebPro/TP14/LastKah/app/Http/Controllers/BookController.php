<?php
namespace App\Http\Controllers;
use App\Models\Book;
use Illuminate\Http\Request;
use Illuminate\Routing\Controllers\HasMiddleware;
use Illuminate\Routing\Controllers\Middleware;

class BookController extends Controller implements HasMiddleware
{
    public static function middleware(): array
    {
        return [
            new Middleware('auth', only: ['index']),
        ];
    }
    public function __construct() {
        $this->middleware('auth');  
    }

    public function index() {
        $books = Book::all();
        return view('books.index', compact('books'));
    }

    public function create() { return view('books.create'); }

    public function store(Request $request) {
        $request->validate([
            'title' => 'required',
            'description' => 'required',
            'release_date' => 'required|date',
            'rating' => 'required|integer|min:1|max:10',
        ]);
        Book::create($request->all());
        return redirect()->route('books.index')->with('success', 'Data ditambahkan');
    }

    public function edit(Book $book) { return view('books.edit', compact('book')); }

    public function update(Request $request, Book $book) {
        $request->validate([
            'title' => 'required',
            'description' => 'required',
            'release_date' => 'required|date',
            'rating' => 'required|integer|min:1|max:10',
        ]);
        $book->update($request->all());
        return redirect()->route('books.index')->with('success', 'Data diupdate');
    }

    public function destroy(Book $book) {
        $book->delete();
        return redirect()->route('books.index')->with('success', 'Data dihapus');
    }
}