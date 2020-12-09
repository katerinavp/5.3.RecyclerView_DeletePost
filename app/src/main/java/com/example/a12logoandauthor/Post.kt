package com.example.a12logoandauthor

class Post(
    val id: Int,
    val date: String,
    val author: String,
    val content: String,
    var likedByMe: Boolean = false
) {


}