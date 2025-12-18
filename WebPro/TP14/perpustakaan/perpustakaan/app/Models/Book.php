<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Book extends Model
{
    protected $fillable = [
        'title', 
        'description', 
        'rating', 
        'release_date'
    ];

    protected $casts = [
        'release_date' => 'date',
    ];
}
