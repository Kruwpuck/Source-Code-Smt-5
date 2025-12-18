<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Factories\HasFactory;

class Book extends Model
{
    use HasFactory;
    protected $fillable = ['title', 'description', 'release_date', 'rating'];
    protected $casts = ['release_date' => 'date'];
}