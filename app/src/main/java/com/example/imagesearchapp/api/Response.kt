package com.example.imagesearchapp.api

import com.example.imagesearchapp.data.Photo

data class Response(
    val results: List<Photo>
)